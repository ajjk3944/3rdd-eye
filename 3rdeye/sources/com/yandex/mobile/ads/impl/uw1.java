package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class uw1 {

    /* renamed from: c, reason: collision with root package name */
    public static final uw1 f34231c;

    /* renamed from: a, reason: collision with root package name */
    public final long f34232a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34233b;

    static {
        uw1 uw1Var = new uw1(0L, 0L);
        new uw1(Long.MAX_VALUE, Long.MAX_VALUE);
        new uw1(Long.MAX_VALUE, 0L);
        new uw1(0L, Long.MAX_VALUE);
        f34231c = uw1Var;
    }

    public uw1(long j4, long j10) {
        zf.a(j4 >= 0);
        zf.a(j10 >= 0);
        this.f34232a = j4;
        this.f34233b = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uw1.class == obj.getClass()) {
            uw1 uw1Var = (uw1) obj;
            if (this.f34232a == uw1Var.f34232a && this.f34233b == uw1Var.f34233b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f34232a) * 31) + ((int) this.f34233b);
    }
}
