package m7;

import f7.x;
import h7.q;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class i implements b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28917a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f28918b;

    /* renamed from: c, reason: collision with root package name */
    public final l7.b f28919c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28920d;

    /* renamed from: e, reason: collision with root package name */
    public final l7.f f28921e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f28922f;

    public i(String str, l7.b bVar, l7.b bVar2, l7.e eVar, boolean z3) {
        this.f28918b = str;
        this.f28919c = bVar;
        this.f28921e = bVar2;
        this.f28922f = eVar;
        this.f28920d = z3;
    }

    @Override // m7.b
    public final h7.d a(x xVar, f7.j jVar, n7.a aVar) {
        switch (this.f28917a) {
            case 0:
                return new h7.p(xVar, aVar, this);
            default:
                return new q(xVar, aVar, this);
        }
    }

    public String toString() {
        switch (this.f28917a) {
            case 0:
                return "RectangleShape{position=" + this.f28921e + ", size=" + ((l7.f) this.f28922f) + '}';
            default:
                return super.toString();
        }
    }

    public i(String str, l7.f fVar, l7.a aVar, l7.b bVar, boolean z3) {
        this.f28918b = str;
        this.f28921e = fVar;
        this.f28922f = aVar;
        this.f28919c = bVar;
        this.f28920d = z3;
    }
}
