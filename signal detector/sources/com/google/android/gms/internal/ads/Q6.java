package com.google.android.gms.internal.ads;

import j$.util.Objects;
import o4.AbstractC2763b;

/* loaded from: classes.dex */
public final class Q6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f10571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10572b;

    /* renamed from: c, reason: collision with root package name */
    public final C1241h2 f10573c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10574d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10575e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10576f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10577g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10578h;
    public final int i;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public Q6(Object obj, int i, C1241h2 c1241h2, Object obj2, int i3, long j6, long j7, int i6, int i7) {
        AbstractC0582Jp.m(i >= 0);
        AbstractC0582Jp.m(i3 >= 0);
        this.f10571a = obj;
        this.f10572b = i;
        this.f10573c = c1241h2;
        this.f10574d = obj2;
        this.f10575e = i3;
        this.f10576f = j6;
        this.f10577g = j7;
        this.f10578h = i6;
        this.i = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q6.class == obj.getClass()) {
            Q6 q6 = (Q6) obj;
            if (this.f10572b == q6.f10572b && this.f10575e == q6.f10575e && this.f10576f == q6.f10576f && this.f10577g == q6.f10577g && this.f10578h == q6.f10578h && this.i == q6.i && Objects.equals(this.f10573c, q6.f10573c) && Objects.equals(this.f10571a, q6.f10571a) && Objects.equals(this.f10574d, q6.f10574d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f10571a, Integer.valueOf(this.f10572b), this.f10573c, this.f10574d, Integer.valueOf(this.f10575e), Long.valueOf(this.f10576f), Long.valueOf(this.f10577g), Integer.valueOf(this.f10578h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f10572b;
        int length = String.valueOf(i).length();
        int i3 = this.f10575e;
        int length2 = String.valueOf(i3).length();
        long j6 = this.f10576f;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j6).length());
        AbstractC2763b.h(sb, "mediaItem=", i, ", period=", i3);
        sb.append(", pos=");
        sb.append(j6);
        String string = sb.toString();
        int i6 = this.f10578h;
        if (i6 == -1) {
            return string;
        }
        int length3 = string.length();
        long j7 = this.f10577g;
        int length4 = String.valueOf(i6).length() + length3 + 13 + String.valueOf(j7).length() + 10;
        int i7 = this.i;
        StringBuilder sb2 = new StringBuilder(length4 + 5 + String.valueOf(i7).length());
        sb2.append(string);
        sb2.append(", contentPos=");
        sb2.append(j7);
        return A.f.o(sb2, ", adGroup=", i6, ", ad=", i7);
    }
}
