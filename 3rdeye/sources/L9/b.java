package L9;

import A9.C0583j;
import b9.n;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import kotlin.jvm.internal.l;
import sa.d;
import sa.u;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public final class b implements OnCompleteListener, d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0583j f4105b;

    public /* synthetic */ b(C0583j c0583j) {
        this.f4105b = c0583j;
    }

    @Override // sa.d
    public void c(sa.b call, u uVar) {
        l.g(call, "call");
        this.f4105b.resumeWith(uVar);
    }

    @Override // sa.d
    public void i(sa.b call, Throwable th) {
        l.g(call, "call");
        this.f4105b.resumeWith(n.a(th));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0583j c0583j = this.f4105b;
        if (exception != null) {
            c0583j.resumeWith(n.a(exception));
        } else if (task.isCanceled()) {
            c0583j.m(null);
        } else {
            c0583j.resumeWith(task.getResult());
        }
    }
}
