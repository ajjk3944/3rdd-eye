package g2;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u implements l0, q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f24420a;

    /* renamed from: b, reason: collision with root package name */
    public final d3.l f24421b;

    public u(q qVar, d3.l lVar) {
        this.f24420a = qVar;
        this.f24421b = lVar;
    }

    @Override // d3.c
    public final float C(int i4) {
        return this.f24420a.C(i4);
    }

    @Override // d3.c
    public final float D(float f10) {
        return this.f24420a.D(f10);
    }

    @Override // d3.c
    public final float F() {
        return this.f24420a.F();
    }

    @Override // g2.q
    public final boolean H() {
        return this.f24420a.H();
    }

    @Override // d3.c
    public final float I(float f10) {
        return this.f24420a.I(f10);
    }

    @Override // g2.l0
    public final k0 N(int i4, int i10, Map map, mk.c cVar, mk.c cVar2) {
        if (i4 < 0) {
            i4 = 0;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        if ((i4 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            f2.a.b("Size(" + i4 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new t(i4, i10, map, cVar);
    }

    @Override // g2.l0
    public final k0 O(int i4, int i10, Map map, mk.c cVar) {
        return N(i4, i10, map, null, cVar);
    }

    @Override // d3.c
    public final int Q(float f10) {
        return this.f24420a.Q(f10);
    }

    @Override // d3.c
    public final long T(long j) {
        return this.f24420a.T(j);
    }

    @Override // d3.c
    public final float W(long j) {
        return this.f24420a.W(j);
    }

    @Override // d3.c
    public final float a() {
        return this.f24420a.a();
    }

    @Override // g2.q
    public final d3.l getLayoutDirection() {
        return this.f24421b;
    }

    @Override // d3.c
    public final float o(long j) {
        return this.f24420a.o(j);
    }

    @Override // d3.c
    public final long x(float f10) {
        return this.f24420a.x(f10);
    }
}
