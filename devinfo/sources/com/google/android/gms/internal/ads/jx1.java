package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jx1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12868a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12869b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12870c;

    public jx1(String str, boolean z3, boolean z10) {
        this.f12868a = str;
        this.f12869b = z3;
        this.f12870c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != jx1.class) {
            return false;
        }
        jx1 jx1Var = (jx1) obj;
        return TextUtils.equals(this.f12868a, jx1Var.f12868a) && this.f12869b == jx1Var.f12869b && this.f12870c == jx1Var.f12870c;
    }

    public final int hashCode() {
        return ((((this.f12868a.hashCode() + 31) * 31) + (true != this.f12869b ? 1237 : 1231)) * 31) + (true != this.f12870c ? 1237 : 1231);
    }
}
