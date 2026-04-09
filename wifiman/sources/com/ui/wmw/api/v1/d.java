package com.ui.wmw.api.v1;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final long f45428a;

    /* renamed from: b, reason: collision with root package name */
    private final long f45429b;

    public d(long j10, long j11) {
        this.f45428a = j10;
        this.f45429b = j11;
    }

    public final long a() {
        return this.f45429b;
    }

    public final long b() {
        return this.f45428a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f45428a == dVar.f45428a && this.f45429b == dVar.f45429b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f45428a) * 31) + Long.hashCode(this.f45429b);
    }

    public String toString() {
        return "Status(totalBytes=" + this.f45428a + ", sentBytes=" + this.f45429b + ")";
    }
}
