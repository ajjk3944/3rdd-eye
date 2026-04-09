package m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c implements d3.c {

    /* renamed from: a, reason: collision with root package name */
    public a f28859a;

    /* renamed from: b, reason: collision with root package name */
    public g f28860b;

    @Override // d3.c
    public final float C(int i4) {
        return i4 / a();
    }

    @Override // d3.c
    public final float D(float f10) {
        return f10 / a();
    }

    @Override // d3.c
    public final float F() {
        return this.f28859a.a().F();
    }

    @Override // d3.c
    public final float I(float f10) {
        return a() * f10;
    }

    @Override // d3.c
    public final /* synthetic */ int Q(float f10) {
        return d.h.i(this, f10);
    }

    @Override // d3.c
    public final /* synthetic */ long T(long j) {
        return d.h.m(j, this);
    }

    @Override // d3.c
    public final /* synthetic */ float W(long j) {
        return d.h.l(j, this);
    }

    @Override // d3.c
    public final float a() {
        return this.f28859a.a().a();
    }

    public final g b(mk.c cVar) {
        g gVar = new g();
        gVar.f28863a = cVar;
        this.f28860b = gVar;
        return gVar;
    }

    @Override // d3.c
    public final /* synthetic */ float o(long j) {
        return d.h.k(j, this);
    }

    @Override // d3.c
    public final long x(float f10) {
        return d.h.n(this, D(f10));
    }
}
