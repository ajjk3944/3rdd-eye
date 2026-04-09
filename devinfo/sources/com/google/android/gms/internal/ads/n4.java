package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f14145a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14146b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14147c;

    public n4(long j, long j8, int i4) {
        mq0.m(j < j8);
        this.f14145a = j;
        this.f14146b = j8;
        this.f14147c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n4.class == obj.getClass()) {
            n4 n4Var = (n4) obj;
            if (this.f14145a == n4Var.f14145a && this.f14146b == n4Var.f14146b && this.f14147c == n4Var.f14147c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f14145a), Long.valueOf(this.f14146b), Integer.valueOf(this.f14147c));
    }

    public final String toString() {
        String str = bq0.f9768a;
        Locale locale = Locale.US;
        StringBuilder sbY = d.h.y(this.f14145a, "Segment: startTimeMs=", ", endTimeMs=");
        sbY.append(this.f14146b);
        sbY.append(", speedDivisor=");
        sbY.append(this.f14147c);
        return sbY.toString();
    }
}
