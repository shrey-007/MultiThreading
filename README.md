We can create Threads using two ways by extending the Thread class or by implementing the Runnable interface.  
## Thread Class-:
1) Extend the thread class &rarr; implement the run() method &rarr; execute the start() method
2) We can create two separate class for two threads or we can use on class only. See multithreading means multiple threads are running concurrently, now these threads can be of same class(as dipicted in Main2) or of different class(as dipicted in Main).

## Runnable Interface-:
1) Implement the Runnable interface &rarr; implement the run() method &rarr; Create a Thread class object and give the Runnable object to its constructor &rarr; execute the start() method of Thread class object.
2) Point 2 of Thread class also applies here.  

## Methods 
#### &rarr; Runnable Interface has only one method run() and that is also not implemented coz it is interface. While Thread class has many methods.
&rarr; Some common methods are run(), start(), currentThread(), isAlive(), getName(), setName(), isDaemon(), setDaemon(), getPriority(), setPriority().  
   &rarr; Daemon threads are the background threads like Garbage Collector. If A is Daemon Thread of B means A will execute its task till end of B, If B ends then A also ends.

#### Preventing Thread Execution Methods-:
In Java, sleep, yield, and join are methods used for thread control and synchronization:
1) sleep(long millis): This method is a static method of the Thread class. It causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds.
2) yield(): This method is also a static method of the Thread class. It's used to give a hint to the scheduler that the current thread is willing to yield its current execution time("I'm willing to pause now if there are other threads that want to run."). The scheduler can then schedule other threads for execution. It's important to note that yield() is just a hint to the scheduler and doesn't guarantee that the current thread will immediately yield the CPU.
3) join(): The join() method is an instance method of the Thread class. It's used to wait for a thread to terminate. When one thread invokes join() on another thread, the invoking thread waits until the other thread terminates before continuing its own execution.It the same concept we studied in OS (fork and join).

#### Interupting Thread execution Methods-:
In Java, interruption is a mechanism for communication between threads. It allows one thread to request that another thread, possibly engaged in a long-running task, terminate its execution gracefully. Interruption is typically used for cooperative thread termination rather than forcibly stopping a thread.
1) interrupt(): The interrupt() method is an instance method of the Thread class. It's used to interrupt the execution of a thread. When one thread calls interrupt() on another thread, it sets the interrupted status of the target thread. This doesn't stop the thread immediately; it merely sets a flag indicating that the thread has been interrupted.
2) isInterrupted(): The isInterrupted() method is an instance method of the Thread class. It's used to check whether the interrupted status of a thread has been set. It returns true if the thread has been interrupted and false otherwise. Unlike interrupt(), isInterrupted() doesn't clear the interrupted status of the thread.
3) interrupted(): The interrupted() method is a static method of the Thread class. It's used to check whether the current thread has been interrupted. It's a static method because it always operates on the current thread. It returns true if the current thread has been interrupted and clears the interrupted status, returning false if the thread has not been interrupted.

#### &rarr; Question = If the thread is interupted, does it means that it is stopped and will never work again?
&rarr; Answer = No, when a thread is interrupted in Java, it doesn't necessarily mean that it is stopped permanently or can never work again. Interruption is a mechanism for signaling to a thread that it should stop its current operation and do something else, usually gracefully terminate.
When a thread is interrupted using the interrupt() method, it sets a flag within the thread indicating that it has been interrupted. This flag can be checked using methods like isInterrupted() or interrupted(). However, it's up to the thread itself to decide how to respond to the interruption.It is like agar koi higher priority ki thread aayi like an error , toh usko pehle execute krvaoo fir baaki threads ko execute krvaayo, toh simply ek interupt generate kro.

#### Inter Thread Communication
In Java, wait(), notify(), and notifyAll() are methods used for inter-thread communication and synchronization. They are typically used in scenarios where one thread needs to wait for a certain condition to be met before proceeding, and other threads may need to signal or notify when that condition is met. These methods are applicable only within synchronized blocks or methods, as they rely on intrinsic locks.  
**Important thing to notice is that these methods are not present in Object class , not in Thread class**
1) wait(): The wait() method is used to make a thread wait until another thread invokes the notify() or notifyAll() method for the same object.
When a thread calls wait(), it releases the lock it holds on the object and enters the waiting state until another thread notifies it.
wait() can be called with or without a timeout. If a timeout is specified, the thread will wait for the specified time period or until it is notified, whichever comes first.
```java 
  synchronized (obj) {
        while (conditionIsNotMet()) {
        obj.wait(); // Wait until condition is met
        }
        // Proceed with further execution
        }

```
2) notify(): The notify() method wakes up one of the threads that are waiting on the object that it is called on.
If multiple threads are waiting on the object, it's not guaranteed which thread will be awakened by notify().
```java
synchronized (obj) {
    // Update condition
    obj.notify(); // Notify one waiting thread
}
```
3) notifyAll(): The notifyAll() method wakes up all the threads that are waiting on the object that it is called on.
All waiting threads are notified, but only one at a time can acquire the lock and proceed with execution.
```java
synchronized (obj) {
    // Update condition
    obj.notifyAll(); // Notify all waiting threads
}

```











