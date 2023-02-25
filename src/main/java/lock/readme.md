#### Synchronized和ReentrantLock的不同点

|  `Synchronized`   | `ReentrantLock`  |
|  ----  | ----  |
| Java关键字  | Jdk提供的一个类 |
| 自动加锁与释放锁  | 手动加锁与释放锁 |
| JVM层面锁 | API层面锁 |
| 非公平锁 | 公平锁或非公平锁 |
| 锁的是对象,锁信息保存在对象头中 | int类型的state标识来标识锁的状态 |
| 底层有锁升级过程 | 没有锁升级过程 |
