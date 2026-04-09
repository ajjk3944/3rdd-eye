package m7;

import f7.x;
import h7.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class p implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f28948a;

    /* renamed from: b, reason: collision with root package name */
    public final l7.b f28949b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.b f28950c;

    /* renamed from: d, reason: collision with root package name */
    public final l7.b f28951d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28952e;

    public p(String str, int i4, l7.b bVar, l7.b bVar2, l7.b bVar3, boolean z3) {
        this.f28948a = i4;
        this.f28949b = bVar;
        this.f28950c = bVar2;
        this.f28951d = bVar3;
        this.f28952e = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        return new u(aVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f28949b + ", end: " + this.f28950c + ", offset: " + this.f28951d + "}";
    }
}
