package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ja1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ja1 f12693c;

    /* renamed from: d, reason: collision with root package name */
    public static final ja1 f12694d;

    /* renamed from: e, reason: collision with root package name */
    public static final ja1 f12695e;

    /* renamed from: f, reason: collision with root package name */
    public static final ja1 f12696f;
    public static final ja1 g;

    /* renamed from: h, reason: collision with root package name */
    public static final ja1 f12697h;

    /* renamed from: i, reason: collision with root package name */
    public static final ja1 f12698i;
    public static final ja1 j;

    /* renamed from: k, reason: collision with root package name */
    public static final ja1 f12699k;

    /* renamed from: l, reason: collision with root package name */
    public static final ja1 f12700l;

    /* renamed from: m, reason: collision with root package name */
    public static final ja1 f12701m;

    /* renamed from: n, reason: collision with root package name */
    public static final ja1 f12702n;

    /* renamed from: o, reason: collision with root package name */
    public static final ja1 f12703o;

    /* renamed from: p, reason: collision with root package name */
    public static final ja1 f12704p;

    /* renamed from: q, reason: collision with root package name */
    public static final ja1 f12705q;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12706a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12707b;

    static {
        int i4 = 0;
        f12693c = new ja1("SHA1", i4);
        f12694d = new ja1("SHA224", i4);
        f12695e = new ja1("SHA256", i4);
        f12696f = new ja1("SHA384", i4);
        g = new ja1("SHA512", i4);
        int i10 = 1;
        f12697h = new ja1("TINK", i10);
        f12698i = new ja1("CRUNCHY", i10);
        j = new ja1("NO_PREFIX", i10);
        int i11 = 2;
        f12699k = new ja1("TINK", i11);
        f12700l = new ja1("NO_PREFIX", i11);
        int i12 = 3;
        f12701m = new ja1("TINK", i12);
        f12702n = new ja1("NO_PREFIX", i12);
        int i13 = 4;
        f12703o = new ja1("SHA256", i13);
        f12704p = new ja1("SHA384", i13);
        f12705q = new ja1("SHA512", i13);
    }

    public /* synthetic */ ja1(String str, int i4) {
        this.f12706a = i4;
        this.f12707b = str;
    }

    public static ja1 a(sk0 sk0Var) {
        String str;
        sk0Var.G(2);
        int iK = sk0Var.K();
        int i4 = iK >> 1;
        int i10 = iK & 1;
        int iK2 = sk0Var.K() >> 3;
        if (i4 == 4 || i4 == 5 || i4 == 7 || i4 == 8) {
            str = "dvhe";
        } else if (i4 == 9) {
            str = "dvav";
        } else {
            if (i4 != 10) {
                return null;
            }
            str = "dav1";
        }
        int i11 = iK2 | (i10 << 5);
        String str2 = i4 < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i4).length();
        int length3 = String.valueOf(i11).length();
        String str3 = i11 < 10 ? ".0" : ".";
        StringBuilder sb2 = new StringBuilder(r5.c.f(length + length2, length3, str3));
        sb2.append(str);
        sb2.append(str2);
        sb2.append(i4);
        sb2.append(str3);
        sb2.append(i11);
        return new ja1(sb2.toString(), 5);
    }

    public String toString() {
        switch (this.f12706a) {
            case 0:
                return this.f12707b;
            case 1:
                return this.f12707b;
            case 2:
                return this.f12707b;
            case 3:
                return this.f12707b;
            case 4:
                return this.f12707b;
            default:
                return super.toString();
        }
    }
}
