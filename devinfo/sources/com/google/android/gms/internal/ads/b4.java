package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9584b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9585c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9586d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9587e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9588f;
    public final g4[] g;

    public b4(String str, int i4, int i10, long j, long j8, g4[] g4VarArr) {
        super("CHAP");
        this.f9584b = str;
        this.f9585c = i4;
        this.f9586d = i10;
        this.f9587e = j;
        this.f9588f = j8;
        this.g = g4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            b4 b4Var = (b4) obj;
            if (this.f9585c == b4Var.f9585c && this.f9586d == b4Var.f9586d && this.f9587e == b4Var.f9587e && this.f9588f == b4Var.f9588f && Objects.equals(this.f9584b, b4Var.f9584b) && Arrays.equals(this.g, b4Var.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9584b.hashCode() + ((((((((this.f9585c + 527) * 31) + this.f9586d) * 31) + ((int) this.f9587e)) * 31) + ((int) this.f9588f)) * 31);
    }
}
