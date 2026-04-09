package defpackage;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class d3 {
    public static final d3 i = new d3("320x50_mb", 320, 50);
    public static final d3 j;
    public static final d3 k;
    public final int a;
    public final int b;
    public final String c;
    public boolean d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;

    static {
        new d3("468x60_as", 468, 60);
        new d3("320x100_as", 320, 100);
        new d3("728x90_as", 728, 90);
        new d3("300x250_as", 300, 250);
        new d3("160x600_as", 160, 600);
        new d3("smart_banner", -1, -2);
        j = new d3("fluid", -3, -4);
        k = new d3("invalid", 0, 0);
        new d3("50x50_mb", 50, 50);
        new d3("search_v2", -3, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d3(int i2, int i3) {
        String strValueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String strValueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        this(ex0.m(new StringBuilder(String.valueOf(strValueOf2).length() + String.valueOf(strValueOf).length() + 1 + 3), strValueOf, "x", strValueOf2, "_as"), i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.d3 a(android.content.Context r2, int r3) {
        /*
            wc1 r0 = defpackage.j63.b
            r0 = -1
            if (r2 != 0) goto L6
            goto L2d
        L6:
            android.content.Context r1 = r2.getApplicationContext()
            if (r1 == 0) goto L10
            android.content.Context r2 = r2.getApplicationContext()
        L10:
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L2d
            android.util.DisplayMetrics r1 = r2.getDisplayMetrics()
            if (r1 == 0) goto L2d
            android.content.res.Configuration r2 = r2.getConfiguration()
            if (r2 == 0) goto L2d
            int r2 = r1.heightPixels
            float r2 = (float) r2
            float r1 = r1.density
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            goto L2e
        L2d:
            r2 = r0
        L2e:
            if (r2 != r0) goto L33
            d3 r2 = defpackage.d3.k
            goto L8b
        L33:
            float r2 = (float) r2
            r0 = 1041865114(0x3e19999a, float:0.15)
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            r0 = 90
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 655(0x28f, float:9.18E-43)
            if (r3 <= r0) goto L52
            float r0 = (float) r3
            r1 = 1144389632(0x44360000, float:728.0)
            float r0 = r0 / r1
            r1 = 1119092736(0x42b40000, float:90.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            goto L7b
        L52:
            r0 = 632(0x278, float:8.86E-43)
            if (r3 <= r0) goto L59
            r0 = 81
            goto L7b
        L59:
            r0 = 526(0x20e, float:7.37E-43)
            if (r3 <= r0) goto L69
            float r0 = (float) r3
            r1 = 1139408896(0x43ea0000, float:468.0)
            float r0 = r0 / r1
            r1 = 1114636288(0x42700000, float:60.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            goto L7b
        L69:
            r0 = 432(0x1b0, float:6.05E-43)
            if (r3 <= r0) goto L70
            r0 = 68
            goto L7b
        L70:
            float r0 = (float) r3
            r1 = 1134559232(0x43a00000, float:320.0)
            float r0 = r0 / r1
            r1 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
        L7b:
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 50
            int r2 = java.lang.Math.max(r2, r0)
            d3 r0 = new d3
            r0.<init>(r3, r2)
            r2 = r0
        L8b:
            r3 = 1
            r2.d = r3
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d3.a(android.content.Context, int):d3");
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.a == d3Var.a && this.b == d3Var.b && this.c.equals(d3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }

    public d3(String str, int i2, int i3) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i2).length() + 26), "Invalid width for AdSize: ", i2));
        }
        if (i3 < 0 && i3 != -2 && i3 != -4) {
            throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i3).length() + 27), "Invalid height for AdSize: ", i3));
        }
        this.a = i2;
        this.b = i3;
        this.c = str;
    }
}
