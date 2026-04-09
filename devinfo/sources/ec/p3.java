package ec;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final long f22991a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y4.a f22993c;

    public p3(y4.a aVar, long j, long j8) {
        Objects.requireNonNull(aVar);
        this.f22993c = aVar;
        this.f22991a = j;
        this.f22992b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l1 l1Var = ((o1) ((r3) this.f22993c.f37324b).f218b).g;
        o1.m(l1Var);
        l1Var.K(new b5.o(13, this));
    }
}
