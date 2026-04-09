package f1;

import i3.g;
import kc.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f8408a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8409b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8410c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8411d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8412e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8413f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8414g;

    /* renamed from: h, reason: collision with root package name */
    public final long f8415h;

    static {
        f.g(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f10, float f11, float f12, float f13, long j, long j7, long j10, long j11) {
        this.f8408a = f10;
        this.f8409b = f11;
        this.f8410c = f12;
        this.f8411d = f13;
        this.f8412e = j;
        this.f8413f = j7;
        this.f8414g = j10;
        this.f8415h = j11;
    }

    public final float a() {
        return this.f8411d - this.f8409b;
    }

    public final float b() {
        return this.f8410c - this.f8408a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f8408a, dVar.f8408a) == 0 && Float.compare(this.f8409b, dVar.f8409b) == 0 && Float.compare(this.f8410c, dVar.f8410c) == 0 && Float.compare(this.f8411d, dVar.f8411d) == 0 && g.j(this.f8412e, dVar.f8412e) && g.j(this.f8413f, dVar.f8413f) && g.j(this.f8414g, dVar.f8414g) && g.j(this.f8415h, dVar.f8415h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f8415h) + h0.b.b(h0.b.b(h0.b.b(w.g.a(w.g.a(w.g.a(Float.hashCode(this.f8408a) * 31, this.f8409b, 31), this.f8410c, 31), this.f8411d, 31), 31, this.f8412e), 31, this.f8413f), 31, this.f8414g);
    }

    public final String toString() {
        String str = ic.a.P(this.f8408a) + ", " + ic.a.P(this.f8409b) + ", " + ic.a.P(this.f8410c) + ", " + ic.a.P(this.f8411d);
        long j = this.f8412e;
        long j7 = this.f8413f;
        boolean zJ = g.j(j, j7);
        long j10 = this.f8414g;
        long j11 = this.f8415h;
        if (!zJ || !g.j(j7, j10) || !g.j(j10, j11)) {
            StringBuilder sbU = c7.a.u("RoundRect(rect=", str, ", topLeft=");
            sbU.append((Object) g.L(j));
            sbU.append(", topRight=");
            sbU.append((Object) g.L(j7));
            sbU.append(", bottomRight=");
            sbU.append((Object) g.L(j10));
            sbU.append(", bottomLeft=");
            sbU.append((Object) g.L(j11));
            sbU.append(')');
            return sbU.toString();
        }
        int i10 = (int) (j >> 32);
        int i11 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            StringBuilder sbU2 = c7.a.u("RoundRect(rect=", str, ", radius=");
            sbU2.append(ic.a.P(Float.intBitsToFloat(i10)));
            sbU2.append(')');
            return sbU2.toString();
        }
        StringBuilder sbU3 = c7.a.u("RoundRect(rect=", str, ", x=");
        sbU3.append(ic.a.P(Float.intBitsToFloat(i10)));
        sbU3.append(", y=");
        sbU3.append(ic.a.P(Float.intBitsToFloat(i11)));
        sbU3.append(')');
        return sbU3.toString();
    }
}
