package m7;

import f7.x;
import h7.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class n implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f28936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28937b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.a f28938c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28939d;

    public n(String str, int i4, l7.a aVar, boolean z3) {
        this.f28936a = str;
        this.f28937b = i4;
        this.f28938c = aVar;
        this.f28939d = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new s(xVar, aVar, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.f28936a);
        sb2.append(", index=");
        return d.h.u(sb2, this.f28937b, '}');
    }
}
