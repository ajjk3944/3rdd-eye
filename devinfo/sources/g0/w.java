package g0;

import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class w extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f24187a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24188b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24189c;

    /* renamed from: d, reason: collision with root package name */
    public final float f24190d;

    public w(float f10, float f11, float f12, float f13) {
        this.f24187a = f10;
        this.f24188b = f11;
        this.f24189c = f12;
        this.f24190d = f13;
        boolean z3 = true;
        boolean z10 = (f10 >= 0.0f || Float.isNaN(f10)) & (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12));
        if (f13 < 0.0f && !Float.isNaN(f13)) {
            z3 = false;
        }
        if (!z10 || !z3) {
            h0.a.a("Padding must be non-negative");
        }
    }

    @Override // i2.v0
    public final i1.m d() {
        y yVar = new y();
        yVar.f24191o = this.f24187a;
        yVar.f24192p = this.f24188b;
        yVar.f24193q = this.f24189c;
        yVar.f24194r = this.f24190d;
        yVar.f24195s = true;
        return yVar;
    }

    @Override // i2.v0
    public final void e(i1.m mVar) {
        y yVar = (y) mVar;
        yVar.f24191o = this.f24187a;
        yVar.f24192p = this.f24188b;
        yVar.f24193q = this.f24189c;
        yVar.f24194r = this.f24190d;
        yVar.f24195s = true;
    }

    public final boolean equals(Object obj) {
        w wVar = obj instanceof w ? (w) obj : null;
        return wVar != null && d3.f.b(this.f24187a, wVar.f24187a) && d3.f.b(this.f24188b, wVar.f24188b) && d3.f.b(this.f24189c, wVar.f24189c) && d3.f.b(this.f24190d, wVar.f24190d);
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.f24190d) + r5.c.d(this.f24189c, r5.c.d(this.f24188b, Float.floatToIntBits(this.f24187a) * 31, 31), 31)) * 31) + 1231;
    }
}
