package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class tx1 {

    /* renamed from: a, reason: collision with root package name */
    private final long f33803a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33804b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33805c;

    /* renamed from: d, reason: collision with root package name */
    private final ux1 f33806d;

    public tx1() {
        this(0);
    }

    public final long a() {
        return this.f33803a;
    }

    public final ux1 b() {
        return this.f33806d;
    }

    public final String c() {
        return this.f33804b;
    }

    public final int d() {
        return this.f33805c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx1)) {
            return false;
        }
        tx1 tx1Var = (tx1) obj;
        return this.f33803a == tx1Var.f33803a && kotlin.jvm.internal.l.b(this.f33804b, tx1Var.f33804b) && this.f33805c == tx1Var.f33805c && this.f33806d == tx1Var.f33806d;
    }

    public final int hashCode() {
        long j4 = this.f33803a;
        int i = ((int) (j4 ^ (j4 >>> 32))) * 31;
        String str = this.f33804b;
        return this.f33806d.hashCode() + sx1.a(this.f33805c, (i + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowNotice(delay=" + this.f33803a + ", url=" + this.f33804b + ", visibilityPercent=" + this.f33805c + ", type=" + this.f33806d + ")";
    }

    public /* synthetic */ tx1(int i) {
        this(0, 0L, ux1.f34243d, null);
    }

    public tx1(int i, long j4, ux1 type, String str) {
        kotlin.jvm.internal.l.f(type, "type");
        this.f33803a = j4;
        this.f33804b = str;
        this.f33805c = i;
        this.f33806d = type;
    }
}
