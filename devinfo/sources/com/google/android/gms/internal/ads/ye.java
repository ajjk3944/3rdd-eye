package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ye {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18712b;

    /* renamed from: c, reason: collision with root package name */
    public final h5 f18713c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18714d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18715e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18716f;
    public final long g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18717h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18718i;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public ye(Object obj, int i4, h5 h5Var, Object obj2, int i10, long j, long j8, int i11, int i12) {
        mq0.m(i4 >= 0);
        mq0.m(i10 >= 0);
        this.f18711a = obj;
        this.f18712b = i4;
        this.f18713c = h5Var;
        this.f18714d = obj2;
        this.f18715e = i10;
        this.f18716f = j;
        this.g = j8;
        this.f18717h = i11;
        this.f18718i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ye.class == obj.getClass()) {
            ye yeVar = (ye) obj;
            if (this.f18712b == yeVar.f18712b && this.f18715e == yeVar.f18715e && this.f18716f == yeVar.f18716f && this.g == yeVar.g && this.f18717h == yeVar.f18717h && this.f18718i == yeVar.f18718i && Objects.equals(this.f18713c, yeVar.f18713c) && Objects.equals(this.f18711a, yeVar.f18711a) && Objects.equals(this.f18714d, yeVar.f18714d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f18711a, Integer.valueOf(this.f18712b), this.f18713c, this.f18714d, Integer.valueOf(this.f18715e), Long.valueOf(this.f18716f), Long.valueOf(this.g), Integer.valueOf(this.f18717h), Integer.valueOf(this.f18718i));
    }

    public final String toString() {
        int i4 = this.f18712b;
        int length = String.valueOf(i4).length();
        int i10 = this.f18715e;
        int length2 = String.valueOf(i10).length();
        long j = this.f18716f;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        r5.c.q(i4, i10, "mediaItem=", ", period=", sb2);
        sb2.append(", pos=");
        sb2.append(j);
        String string = sb2.toString();
        int i11 = this.f18717h;
        if (i11 == -1) {
            return string;
        }
        int length3 = string.length();
        long j8 = this.g;
        int length4 = String.valueOf(i11).length() + length3 + 13 + String.valueOf(j8).length() + 10;
        int i12 = this.f18718i;
        StringBuilder sb3 = new StringBuilder(length4 + 5 + String.valueOf(i12).length());
        sb3.append(string);
        sb3.append(", contentPos=");
        sb3.append(j8);
        return je.u.q(i11, i12, ", adGroup=", ", ad=", sb3);
    }
}
