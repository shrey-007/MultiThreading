We can create Threads using two ways by extending the Thread class or by implementing the Runnable interface.  
## Thread Class-:
1) Extend the thread class &rarr; implement the run() method &rarr; execute the start() method
2) We can create two separate class for two threads or we can use on class only. See multithreading means multiple threads are running concurrently, now these threads can be of same class(as dipicted in Main2) or of different class(as dipicted in Main).

## Runnable Interface-:
1) Implement the Runnable interface &rarr; implement the run() method &rarr; Create a Thread class object and give the Runnable object to its constructor &rarr; execute the start() method of Thread class object.
2) Point 2 of Thread class also applies here. 
