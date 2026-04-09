package h5;

import com.google.android.gms.tasks.TaskCompletionSource;
import j5.C5194a;
import j5.c;

/* compiled from: GetAuthTokenListener.java */
/* loaded from: classes2.dex */
public final class e implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f38260a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource<g> f38261b;

    public e(j jVar, TaskCompletionSource<g> taskCompletionSource) {
        this.f38260a = jVar;
        this.f38261b = taskCompletionSource;
    }

    @Override // h5.i
    public final boolean a(Exception exc) {
        this.f38261b.trySetException(exc);
        return true;
    }

    @Override // h5.i
    public final boolean b(C5194a c5194a) {
        if (c5194a.f() != c.a.REGISTERED || this.f38260a.a(c5194a)) {
            return false;
        }
        String str = c5194a.f42958d;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f38261b.setResult(new C4417a(str, c5194a.f42960f, c5194a.f42961g));
        return true;
    }
}
