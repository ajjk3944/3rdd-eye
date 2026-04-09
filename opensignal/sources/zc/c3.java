package zc;

import java.util.Objects;

/* loaded from: classes.dex */
public final class c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f26891a;

    /* renamed from: d, reason: collision with root package name */
    public final long f26892d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xr.a f26893g;

    public c3(xr.a aVar, long j, long j7) {
        Objects.requireNonNull(aVar);
        this.f26893g = aVar;
        this.f26891a = j;
        this.f26892d = j7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = ((c1) ((e3) this.f26893g.f25483g).f1504d).B;
        c1.g(a1Var);
        a1Var.B1(new pb.l0(15, this));
    }
}
