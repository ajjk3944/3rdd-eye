package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class I7 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9070a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9071b;

    /* renamed from: c, reason: collision with root package name */
    public int f9072c;

    /* renamed from: d, reason: collision with root package name */
    public long f9073d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9074e;

    /* renamed from: f, reason: collision with root package name */
    public C2023ve f9075f = C2023ve.f17312b;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final void a(Object obj, Object obj2, int i, long j6, boolean z6) {
        C2023ve c2023ve = C2023ve.f17312b;
        this.f9070a = obj;
        this.f9071b = obj2;
        this.f9072c = i;
        this.f9073d = j6;
        this.f9075f = c2023ve;
        this.f9074e = z6;
    }

    public final long b(int i, int i3) {
        C0856a c0856aA = this.f9075f.a(i);
        if (c0856aA.f13006a != -1) {
            return c0856aA.f13010e[i3];
        }
        return -9223372036854775807L;
    }

    public final void c(int i) {
        this.f9075f.a(i).getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !I7.class.equals(obj.getClass())) {
            return false;
        }
        I7 i7 = (I7) obj;
        return Objects.equals(this.f9070a, i7.f9070a) && Objects.equals(this.f9071b, i7.f9071b) && this.f9072c == i7.f9072c && this.f9073d == i7.f9073d && this.f9074e == i7.f9074e && Objects.equals(this.f9075f, i7.f9075f);
    }

    public final int hashCode() {
        Object obj = this.f9070a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f9071b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f9072c;
        long j6 = this.f9073d;
        return this.f9075f.hashCode() + (((((iHashCode2 * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 961) + (this.f9074e ? 1 : 0)) * 31);
    }
}
