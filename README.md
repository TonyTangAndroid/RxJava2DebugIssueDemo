# RxJava2Debug Issue Demo

This repository only serves as an example to demonstrate an potential issue when I try to apply Rxjava2Debug to help me to locate the problem.

If you run this app, it will throw a "Callable returned null" exception, which is by design. However, with or without Rxjava2Debug applied,
it returned the same non-helpful stacktrace that causes difficult to pin locate the problem.


 
Without Rxjava2Debug applied, it prints out the following obscure information:

```java
W: java.lang.NullPointerException: Callable returned null
W:     at io.reactivex.internal.functions.ObjectHelper.requireNonNull(ObjectHelper.java:39)
W:     at io.reactivex.internal.operators.observable.ObservableFromCallable.subscribeActual(ObservableFromCallable.java:42)
W:     at io.reactivex.Observable.subscribe(Observable.java:10842)
W:     at io.reactivex.Observable.subscribe(Observable.java:10828)
W:     at io.reactivex.Observable.subscribe(Observable.java:10788)
W:     at com.github.tonytangandroid.rxjava2debugdemo.MainActivity.onCreate(MainActivity.java:23)
W:     at android.app.Activity.performCreate(Activity.java:6682)
W:     at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1118)
W:     at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2619)
W:     at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2727)
W:     at android.app.ActivityThread.-wrap12(ActivityThread.java)
W:     at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1478)
W:     at android.os.Handler.dispatchMessage(Handler.java:102)
W:     at android.os.Looper.loop(Looper.java:154)
W:     at android.app.ActivityThread.main(ActivityThread.java:6121)
W:     at java.lang.reflect.Method.invoke(Native Method)
W:     at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:889)
W:     at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:779)
```


 
With Rxjava2Debug applied it still prints out the same obscure information. It is suppose to locate the root problem, which roots from `NullRepo.java` at [here](https://github.com/TonyTangAndroid/RxJava2DebugIssueDemo/blob/master/app/src/main/java/com/github/tonytangandroid/rxjava2debugdemo/NullRepo.java#L12):

```java
W: java.lang.NullPointerException: Callable returned null
W:     at io.reactivex.internal.functions.ObjectHelper.requireNonNull(ObjectHelper.java:39)
W:     at io.reactivex.internal.operators.observable.ObservableFromCallable.subscribeActual(ObservableFromCallable.java:42)
W:     at io.reactivex.Observable.subscribe(Observable.java:10842)
W:     at io.reactivex.Observable.subscribe(Observable.java:10828)
W:     at io.reactivex.Observable.subscribe(Observable.java:10788)
W:     at com.github.tonytangandroid.rxjava2debugdemo.MainActivity.onCreate(MainActivity.java:23)
W:     at android.app.Activity.performCreate(Activity.java:6682)
W:     at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1118)
W:     at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2619)
W:     at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2727)
W:     at android.app.ActivityThread.-wrap12(ActivityThread.java)
W:     at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1478)
W:     at android.os.Handler.dispatchMessage(Handler.java:102)
W:     at android.os.Looper.loop(Looper.java:154)
W:     at android.app.ActivityThread.main(ActivityThread.java:6121)
W:     at java.lang.reflect.Method.invoke(Native Method)
W:     at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:889)
W:     at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:779)
```
 

Is it because I did not config the Rxjava2Debug incorrectly?
Or is it because I am not understanding the Rxjava2Debug function correctly?
Or is it because there might be a potential enhancement that needs to be done to achieve such purpose?

Any help, hints or guidance will be appreciated.
