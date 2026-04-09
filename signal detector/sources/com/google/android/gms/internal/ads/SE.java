package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class SE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final C1952uE f11158a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11159b;

    /* renamed from: c, reason: collision with root package name */
    public final YD f11160c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1521mE f11161d;

    public SE(C1952uE c1952uE, String str, YD yd, AbstractC1521mE abstractC1521mE) {
        this.f11158a = c1952uE;
        this.f11159b = str;
        this.f11160c = yd;
        this.f11161d = abstractC1521mE;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f11158a != C1952uE.f17089l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SE)) {
            return false;
        }
        SE se = (SE) obj;
        return se.f11160c.equals(this.f11160c) && se.f11161d.equals(this.f11161d) && se.f11159b.equals(this.f11159b) && se.f11158a.equals(this.f11158a);
    }

    public final int hashCode() {
        return Objects.hash(SE.class, this.f11159b, this.f11160c, this.f11161d, this.f11158a);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f11160c);
        String strValueOf2 = String.valueOf(this.f11161d);
        String strValueOf3 = String.valueOf(this.f11158a);
        String str = this.f11159b;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + strValueOf2.length() + 11 + strValueOf3.length() + 1);
        A.f.w(sb, "LegacyKmsEnvelopeAead Parameters (kekUri: ", str, ", dekParsingStrategy: ", strValueOf);
        A.f.w(sb, ", dekParametersForNewKeys: ", strValueOf2, ", variant: ", strValueOf3);
        sb.append(")");
        return sb.toString();
    }
}
