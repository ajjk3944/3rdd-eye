package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yk0 {

    /* renamed from: c, reason: collision with root package name */
    public static final yk0 f18785c = new yk0(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f18786a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18787b;

    static {
        new yk0(0, 0);
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public yk0(int i4, int i10) {
        boolean z3 = false;
        if ((i4 == -1 || i4 >= 0) && (i10 == -1 || i10 >= 0)) {
            z3 = true;
        }
        mq0.m(z3);
        this.f18786a = i4;
        this.f18787b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof yk0) {
            yk0 yk0Var = (yk0) obj;
            if (this.f18786a == yk0Var.f18786a && this.f18787b == yk0Var.f18787b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = this.f18786a;
        return ((i4 >>> 16) | (i4 << 16)) ^ this.f18787b;
    }

    public final String toString() {
        int i4 = this.f18786a;
        int length = String.valueOf(i4).length();
        int i10 = this.f18787b;
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(i10).length());
        sb2.append(i4);
        sb2.append("x");
        sb2.append(i10);
        return sb2.toString();
    }
}
