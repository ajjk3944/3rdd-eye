package pg;

import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final float f31941a = 8;

    /* renamed from: b, reason: collision with root package name */
    public final float f31942b = 8;

    /* renamed from: c, reason: collision with root package name */
    public final float f31943c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final float f31944d = 58;

    /* renamed from: e, reason: collision with root package name */
    public final float f31945e = 40;

    /* renamed from: f, reason: collision with root package name */
    public final float f31946f = 48;
    public final float g = 8;

    /* renamed from: h, reason: collision with root package name */
    public final float f31947h = 18;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return d3.f.b(this.f31941a, bVar.f31941a) && d3.f.b(this.f31942b, bVar.f31942b) && d3.f.b(this.f31943c, bVar.f31943c) && d3.f.b(this.f31944d, bVar.f31944d) && d3.f.b(this.f31945e, bVar.f31945e) && d3.f.b(this.f31946f, bVar.f31946f) && d3.f.b(this.g, bVar.g) && d3.f.b(this.f31947h, bVar.f31947h);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f31947h) + r5.c.d(this.g, r5.c.d(this.f31946f, r5.c.d(this.f31945e, r5.c.d(this.f31944d, r5.c.d(this.f31943c, r5.c.d(this.f31942b, Float.floatToIntBits(this.f31941a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = d3.f.c(this.f31941a);
        String strC2 = d3.f.c(this.f31942b);
        String strC3 = d3.f.c(this.f31943c);
        String strC4 = d3.f.c(this.f31944d);
        String strC5 = d3.f.c(this.f31945e);
        String strC6 = d3.f.c(this.f31946f);
        String strC7 = d3.f.c(this.g);
        String strC8 = d3.f.c(this.f31947h);
        StringBuilder sbO = r5.c.o("AppDimens(commonSpacing=", strC, ", cardRadius=", strC2, ", appTopBarElevation=");
        u.B(sbO, strC3, ", appTopBarHeight=", strC4, ", listItemHeightSmall=");
        u.B(sbO, strC5, ", listItemHeight=", strC6, ", dialogBackgroundRadius=");
        return a0.g.p(sbO, strC7, ", dialogContentPadding=", strC8, ")");
    }
}
