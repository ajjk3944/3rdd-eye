package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Locale;

/* loaded from: classes.dex */
public final class M1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f9793a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9794b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9795c;

    public M1(long j6, long j7, int i) {
        AbstractC0582Jp.m(j6 < j7);
        this.f9793a = j6;
        this.f9794b = j7;
        this.f9795c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && M1.class == obj.getClass()) {
            M1 m12 = (M1) obj;
            if (this.f9793a == m12.f9793a && this.f9794b == m12.f9794b && this.f9795c == m12.f9795c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f9793a), Long.valueOf(this.f9794b), Integer.valueOf(this.f9795c));
    }

    public final String toString() {
        String str = Vt.f12096a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f9793a + ", endTimeMs=" + this.f9794b + ", speedDivisor=" + this.f9795c;
    }
}
