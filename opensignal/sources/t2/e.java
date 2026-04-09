package t2;

import lf.t1;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final float f22384b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22385c;

    /* renamed from: d, reason: collision with root package name */
    public final u2.a f22386d;

    public e(float f10, float f11, u2.a aVar) {
        this.f22384b = f10;
        this.f22385c = f11;
        this.f22386d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f22384b, eVar.f22384b) == 0 && Float.compare(this.f22385c, eVar.f22385c) == 0 && br.l.a(this.f22386d, eVar.f22386d);
    }

    @Override // t2.c
    public final float getDensity() {
        return this.f22384b;
    }

    public final int hashCode() {
        return this.f22386d.hashCode() + w.g.a(Float.hashCode(this.f22384b) * 31, this.f22385c, 31);
    }

    @Override // t2.c
    public final long i(float f10) {
        return t1.B(4294967296L, this.f22386d.a(f10));
    }

    @Override // t2.c
    public final float l(long j) {
        if (l.a(k.b(j), 4294967296L)) {
            return this.f22386d.b(k.c(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f22384b + ", fontScale=" + this.f22385c + ", converter=" + this.f22386d + ')';
    }

    @Override // t2.c
    public final float y() {
        return this.f22385c;
    }
}
