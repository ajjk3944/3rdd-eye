package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c4 extends g4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f9968b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9969c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9970d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f9971e;

    /* renamed from: f, reason: collision with root package name */
    public final g4[] f9972f;

    public c4(String str, boolean z3, boolean z10, String[] strArr, g4[] g4VarArr) {
        super("CTOC");
        this.f9968b = str;
        this.f9969c = z3;
        this.f9970d = z10;
        this.f9971e = strArr;
        this.f9972f = g4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4.class == obj.getClass()) {
            c4 c4Var = (c4) obj;
            if (this.f9969c == c4Var.f9969c && this.f9970d == c4Var.f9970d && Objects.equals(this.f9968b, c4Var.f9968b) && Arrays.equals(this.f9971e, c4Var.f9971e) && Arrays.equals(this.f9972f, c4Var.f9972f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9968b.hashCode() + (((((this.f9969c ? 1 : 0) + 527) * 31) + (this.f9970d ? 1 : 0)) * 31);
    }
}
