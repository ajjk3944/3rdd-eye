package df;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f22244a;

    public g(TaskCompletionSource taskCompletionSource) {
        this.f22244a = taskCompletionSource;
    }

    @Override // df.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // df.i
    public final boolean b(ef.b bVar) {
        int i4 = bVar.f23442b;
        if (i4 != 3 && i4 != 4 && i4 != 5) {
            return false;
        }
        this.f22244a.trySetResult(bVar.f23441a);
        return true;
    }
}
