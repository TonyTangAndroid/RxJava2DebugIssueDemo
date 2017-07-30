# RxJava2Debug Issue Demo


Update : 
RxJava2Debug 1.2.0 works now.
To be more specific, it work exactly what I have been hoping for. 
From now on, I no longer have to follow the observable stream to hunt the myth of "Callable returned null" or any other error info. 
This is too awesome to be true.

 
```java
    at io.reactivex.Observable.fromCallable(Observable.java:1643)
       at com.github.tonytangandroid.rxjava2debugdemo.DataRepo.getStringObservable(DataRepo.java:14)
       at com.github.tonytangandroid.rxjava2debugdemo.MainActivity.onCreate(MainActivity.java:21)
       
```
 

 