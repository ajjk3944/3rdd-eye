package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.x1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4230x1 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f35144a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC4223w1 f35145b;

    /* renamed from: c, reason: collision with root package name */
    private final long f35146c;

    /* renamed from: d, reason: collision with root package name */
    private final int f35147d;

    public C4230x1(boolean z10, EnumC4223w1 requestPolicy, long j4, int i) {
        kotlin.jvm.internal.l.f(requestPolicy, "requestPolicy");
        this.f35144a = z10;
        this.f35145b = requestPolicy;
        this.f35146c = j4;
        this.f35147d = i;
    }

    public final int a() {
        return this.f35147d;
    }

    public final long b() {
        return this.f35146c;
    }

    public final EnumC4223w1 c() {
        return this.f35145b;
    }

    public final boolean d() {
        return this.f35144a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4230x1)) {
            return false;
        }
        C4230x1 c4230x1 = (C4230x1) obj;
        return this.f35144a == c4230x1.f35144a && this.f35145b == c4230x1.f35145b && this.f35146c == c4230x1.f35146c && this.f35147d == c4230x1.f35147d;
    }

    public final int hashCode() {
        int iHashCode = (this.f35145b.hashCode() + ((this.f35144a ? 1231 : 1237) * 31)) * 31;
        long j4 = this.f35146c;
        return this.f35147d + ((((int) (j4 ^ (j4 >>> 32))) + iHashCode) * 31);
    }

    public final String toString() {
        return "AdBlockerState(wasDetected=" + this.f35144a + ", requestPolicy=" + this.f35145b + ", lastUpdateTime=" + this.f35146c + ", failedRequestsCount=" + this.f35147d + ")";
    }
}
