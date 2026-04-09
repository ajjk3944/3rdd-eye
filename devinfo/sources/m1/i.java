package m1;

import i1.m;
import i2.k;
import i2.v0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class i extends v0 {

    /* renamed from: a, reason: collision with root package name */
    public final u1.b f28867a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28868b;

    public i(u1.b bVar, float f10) {
        this.f28867a = bVar;
        this.f28868b = f10;
    }

    @Override // i2.v0
    public final m d() {
        i1.e eVar = i1.b.f25535e;
        j jVar = new j();
        jVar.f28869o = this.f28867a;
        jVar.f28870p = true;
        jVar.f28871q = eVar;
        jVar.f28872r = g2.i.f24358a;
        jVar.f28873s = this.f28868b;
        return jVar;
    }

    @Override // i2.v0
    public final void e(m mVar) {
        j jVar = (j) mVar;
        boolean z3 = jVar.f28870p;
        u1.b bVar = this.f28867a;
        boolean z10 = (z3 && o1.e.a(jVar.f28869o.c(), bVar.c())) ? false : true;
        jVar.f28869o = bVar;
        jVar.f28870p = true;
        jVar.f28871q = i1.b.f25535e;
        jVar.f28872r = g2.i.f24358a;
        jVar.f28873s = this.f28868b;
        if (z10) {
            k.k(jVar);
        }
        k.j(jVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!nk.k.a(this.f28867a, iVar.f28867a)) {
            return false;
        }
        i1.e eVar = i1.b.f25535e;
        if (!eVar.equals(eVar)) {
            return false;
        }
        Object obj2 = g2.i.f24358a;
        return obj2.equals(obj2) && Float.compare(this.f28868b, iVar.f28868b) == 0;
    }

    public final int hashCode() {
        return r5.c.d(this.f28868b, (g2.i.f24358a.hashCode() + ((Float.floatToIntBits(0.0f) + (Float.floatToIntBits(0.0f) * 31) + (((this.f28867a.hashCode() * 31) + 1231) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f28867a + ", sizeToIntrinsics=true, alignment=" + i1.b.f25535e + ", contentScale=" + g2.i.f24358a + ", alpha=" + this.f28868b + ", colorFilter=null)";
    }
}
