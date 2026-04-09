package df;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f22242a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f22243b;

    public f(j jVar, TaskCompletionSource taskCompletionSource) {
        this.f22242a = jVar;
        this.f22243b = taskCompletionSource;
    }

    @Override // df.i
    public final boolean a(Exception exc) {
        this.f22243b.trySetException(exc);
        return true;
    }

    @Override // df.i
    public final boolean b(ef.b bVar) {
        if (bVar.f23442b != 4 || this.f22242a.a(bVar)) {
            return false;
        }
        String str = bVar.f23443c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f22243b.setResult(new a(str, bVar.f23445e, bVar.f23446f));
        return true;
    }
}
