package E3;

import O4.C1467m;
import O4.C1468n;
import a9.InterfaceC1676a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes.dex */
public final class m implements A3.b {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1416b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1417c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1418d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1419e;

    public m(InterfaceC1676a interfaceC1676a, InterfaceC1676a interfaceC1676a2, D3.f fVar, InterfaceC1676a interfaceC1676a3) {
        this.f1416b = interfaceC1676a;
        this.f1417c = interfaceC1676a2;
        this.f1419e = fVar;
        this.f1418d = interfaceC1676a3;
    }

    public Task a(Callable callable) {
        Task taskContinueWith;
        synchronized (this.f1418d) {
            taskContinueWith = ((Task) this.f1417c).continueWith((ExecutorService) this.f1416b, new C1467m(callable));
            this.f1417c = taskContinueWith.continueWith((ExecutorService) this.f1416b, new C1468n());
        }
        return taskContinueWith;
    }

    public Task b(Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f1418d) {
            taskContinueWithTask = ((Task) this.f1417c).continueWithTask((ExecutorService) this.f1416b, new C1467m(callable));
            this.f1417c = taskContinueWithTask.continueWith((ExecutorService) this.f1416b, new C1468n());
        }
        return taskContinueWithTask;
    }

    @Override // a9.InterfaceC1676a
    public Object get() {
        return new l((Executor) ((InterfaceC1676a) this.f1416b).get(), (F3.d) ((InterfaceC1676a) this.f1417c).get(), (n) ((D3.f) this.f1419e).get(), (G3.b) ((InterfaceC1676a) this.f1418d).get());
    }

    public m(String str, String str2, StackTraceElement[] stackTraceElementArr, m mVar) {
        this.f1416b = str;
        this.f1417c = str2;
        this.f1418d = stackTraceElementArr;
        this.f1419e = mVar;
    }

    public m(ExecutorService executorService) {
        this.f1417c = Tasks.forResult(null);
        this.f1418d = new Object();
        this.f1419e = new ThreadLocal();
        this.f1416b = executorService;
        executorService.execute(new C2.f(this, 2));
    }
}
