package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fb1 extends aa1 {

    /* renamed from: a, reason: collision with root package name */
    public final m91 f11089a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11090b;

    /* renamed from: c, reason: collision with root package name */
    public final ka1 f11091c;

    /* renamed from: d, reason: collision with root package name */
    public final aa1 f11092d;

    public fb1(m91 m91Var, String str, ka1 ka1Var, aa1 aa1Var) {
        this.f11089a = m91Var;
        this.f11090b = str;
        this.f11091c = ka1Var;
        this.f11092d = aa1Var;
    }

    @Override // com.google.android.gms.internal.ads.s91
    public final boolean a() {
        return this.f11089a != m91.f13815m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fb1)) {
            return false;
        }
        fb1 fb1Var = (fb1) obj;
        return fb1Var.f11091c.equals(this.f11091c) && fb1Var.f11092d.equals(this.f11092d) && fb1Var.f11090b.equals(this.f11090b) && fb1Var.f11089a.equals(this.f11089a);
    }

    public final int hashCode() {
        return Objects.hash(fb1.class, this.f11090b, this.f11091c, this.f11092d, this.f11089a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11091c);
        String strValueOf2 = String.valueOf(this.f11092d);
        String strValueOf3 = String.valueOf(this.f11089a);
        String str = this.f11090b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        je.u.B(sb2, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        je.u.B(sb2, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }
}
