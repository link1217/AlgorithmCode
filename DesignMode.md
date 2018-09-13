# DesignMode
- 23种设计模式总结

------------
## Content

- [创建型模式(5种)](#创建型模式5种)
- [结构模式(7种)](#结构模式7种)  
    - [7、装饰模式(Decorator)](#7装饰模式decorator)  
    - [8、代理模式(Proxy)](#代理模式proxy)  
        

----------
## 一、设计模式的分类

总体来说设计模式分为三大类：

创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

其实还有两类：并发型模式和线程池模式。用一个图片来整体描述一下：
        ![设计模式之间的关系](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/设计模式之间的关系.jpg)

## 二、设计模式的六大原则

总原则：开闭原则（Open Close Principle）

开闭原则就是说对扩展开放，对修改关闭。在程序需要进行拓展的时候，不能去修改原有的代码，而是要扩展原有代码，实现一个热插拔的效果。所以一句话概括就是：
为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类等，后面的具体设计中我们会提到这点。

### 1、单一职责原则

不要存在多于一个导致类变更的原因，也就是说每个类应该实现单一的职责，如若不然，就应该把类拆分。
 

### 2、里氏替换原则（Liskov Substitution Principle）

里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

历史替换原则中，子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。


### 3、依赖倒转原则（Dependence Inversion Principle）

这个是开闭原则的基础，具体内容：面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互。

### 4、接口隔离原则（Interface Segregation Principle）

这个原则的意思是：每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。使用多个隔离的接口，比使用单个接口（多个接口方法集合到一个的接口）要好。


### 5、迪米特法则（最少知道原则）（Demeter Principle）

就是说：一个类对自己依赖的类知道的越少越好。也就是说无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。

最少知道原则的另一个表达方式是：只与直接的朋友通信。类之间只要有耦合关系，就叫朋友关系。耦合分为依赖、关联、聚合、组合等。我们称出现为成员变量、方法参数、方法返回值中的类为直接朋友。局部变量、临时变量则不是直接的朋友。我们要求陌生的类不要作为局部变量出现在类中。


### 6、合成复用原则（Composite Reuse Principle）

原则是尽量首先使用合成/聚合的方式，而不是使用继承。

--------------------

## 结构模式(7种)

结构型模式：适配器模式、装饰模式、代理模式、外观模式、桥接模式、组合模式、享元模式。其中对象的适配器模式是各种模式的起源，我们看下面的图：  
        ![结构模式](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/结构模式.jpg)

### 7、装饰模式(Decorator)
顾名思义，装饰模式就是给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例，关系图如下：  
        ![装饰模式](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/装饰模式.jpg)

Source类是被装饰类，Decorator类是一个装饰类，可以为Source类动态的添加一些功能，代码如下：  
接口： [Sourceable](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/decorator/Sourceable.java)
```
    public interface Sourceable {
        void method();
    }
```
实现类： [Source](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/decorator/Source.java)
```
    public class Source implements Sourceable {
        @Override
        public void method() {
            System.out.println("Source code...");
        }
    }

```
装饰类： [Decorator](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/decorator/Decorator.java)
```
    public class Decorator implements Sourceable {
        Sourceable source;
    
        public Decorator(Sourceable source) {
            this.source = source;
        }
    
        @Override
        public void method() {
            System.out.println("before...");
            source.method();
            System.out.println("after...");
        }
    }
```
测试类： [DecoratorTest](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/decorator/DecoratorTest.java)
```
    public class DecoratorTest {
        public static void main(String[] args) {
            Sourceable source = new Decorator(new Source());
            source.method();
        }
    }
```
输出：
> before...  
  Source code...  
  after...

装饰器模式的应用场景：

1、需要扩展一个类的功能。

2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）

缺点：产生过多相似的对象，不易排错！

----------------
### 8、代理模式(Proxy)
其实每个模式名称就表明了该模式的作用，代理模式就是多一个代理类出来，替原对象进行一些操作，比如我们在租房子的时候回去找中介，为什么呢？
因为你对该地区房屋的信息掌握的不够全面，希望找一个更熟悉的人去帮你做，此处的代理就是这个意思。再如我们有的时候打官司，我们需要请律师，
因为律师在法律方面有专长，可以替我们进行操作，表达我们的想法。先来看看关系图：  
        ![代理模式](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/files/代理模式.jpg)

根据上文的阐述，代理模式就比较容易的理解了，我们看下代码：
接口： [Sourceable](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/proxy/Sourceable.java)
```
    public interface Sourceable {
        void method();
    }
```
实现类： [Source](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/proxy/Source.java)
```
    public class Source implements Sourceable {
        @Override
        public void method() {
            System.out.println("Source code...");
        }
    }

```
代理类： [Proxy](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/proxy/Proxy.java)
```
    public class Proxy implements Sourceable {
        Sourceable source;
    
        public Proxy() {
            source = new Source();
        }
    
        @Override
        public void method() {
            System.out.println("before...");
            source.method();
            System.out.println("after...");
        }
    }
```
测试类： [ProxyTest](https://github.com/lanrengufeng/AlgorithmCode/blob/master/src/designMode/proxy/ProxyTest.java)
```
    public class ProxyTest {
        public static void main(String[] args) {
            Sourceable source = new Proxy();
            source.method();
        }
    }

```
输出：
> before...  
  Source code...  
  after...

--------------


