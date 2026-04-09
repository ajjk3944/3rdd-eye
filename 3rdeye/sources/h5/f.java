package h5;

import com.google.android.gms.tasks.TaskCompletionSource;
import j5.C5194a;
import j5.c;

/* compiled from: GetIdListener.java */
/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource<String> f38262a;

    public f(TaskCompletionSource<String> taskCompletionSource) {
        this.f38262a = taskCompletionSource;
    }

    @Override // h5.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // h5.i
    public final boolean b(C5194a c5194a) {
        if (c5194a.f() != c.a.UNREGISTERED && c5194a.f() != c.a.REGISTERED && c5194a.f() != c.a.REGISTER_ERROR) {
            return false;
        }
        this.f38262a.trySetResult(c5194a.f42956b);
        return true;
    }
}
