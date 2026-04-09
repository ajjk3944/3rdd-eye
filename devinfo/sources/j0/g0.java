package j0;

import u0.n2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g0 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    public final u0.d1 f26897a;

    /* renamed from: b, reason: collision with root package name */
    public int f26898b;

    public g0(int i4) {
        int i10 = (i4 / 30) * 30;
        this.f26897a = new u0.d1(ci.b.E(Math.max(i10 - 100, 0), i10 + 130), u0.e.g);
        this.f26898b = i4;
    }

    @Override // u0.n2
    public final Object getValue() {
        return (sk.d) this.f26897a.getValue();
    }
}
