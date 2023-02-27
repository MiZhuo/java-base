#### Tomcat为什么要自定义类加载器
因为在一个Tomcat中可以部署多个应用,而每个应用中都存在很多类,而这些不同的应用中的类全类名是可以一致的,而Tomcat启动之后是一个Java进程,也就是一个JVM,如果使用默认的AppClassLoader,则无法正确加载两个不同应用中全类名相同的不同的类。所以在Tomcat中自定义了一个类加载器:**WebAppClassLoader**,这样每个应用都可以使用自己的类加载器去加载类了,从而实现应用之间类的隔离。另外,Tomcat使用自定义类加载器实现了类的也加载功能。

#### JDK、JRE、JVM之间的区别
- JDK
> Java标准开发包,提供了**编译**、**运行**Java程序所需的各种工具和资源,包括**Java编译器**、**Java运行时环境**以及常用的**Java类库**等。
- JRE
> Java运行环境,用于运行Java的字节码文件。JRE中包括了JVM以及JVM工作所需要的类库。
- JVM
> Java虚拟机,是JRE的一部分,它是Java实现跨平台的最核心部分,用于运行字节码文件。

#### hashCode()与equals()
- 如果两个对象的hashcode不一致,那么肯定是两个不同的对象。
- 如果两个对象的hashcode一致,可能是同一个对象也可能是两个不同的对象。
- 如果两个对象相等,肯定是同一个对象。

在Java的一些集合类中,判断两个对象是否相等的时候,会先调用hashcode()方法,如果hashcode一致则调用equals()方法,最终确定是否是同一个对象。所以如果重写了equals()方法,就要注意hashcode()方法,要保证能遵守上述原则。

#### String、StringBuffer、StringBuilder的区别
- String
> String 是常量不可修改的,赋值操作只是重新指向新的常量,原常量还存在于常量池中。
- StringBuffer
> 可以修改,使用synchronized关键字修饰,是线程安全的。
- StringBuilder
> 可以修改,线程不安全,单线程环境下,效率更高。 

#### 泛型中extends和super的区别
- `<? extends T>`
> 表示T在内的任何子类
- `<? super T>`
> 表示T在内的任何父类 