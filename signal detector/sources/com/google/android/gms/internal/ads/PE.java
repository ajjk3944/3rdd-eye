package com.google.android.gms.internal.ads;

import j$.util.Objects;

/* loaded from: classes.dex */
public final class PE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final String f10332a;

    /* renamed from: b, reason: collision with root package name */
    public final AE f10333b;

    public PE(String str, AE ae) {
        this.f10332a = str;
        this.f10333b = ae;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f10333b != AE.f6960g;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PE)) {
            return false;
        }
        PE pe = (PE) obj;
        return pe.f10332a.equals(this.f10332a) && pe.f10333b.equals(this.f10333b);
    }

    public final int hashCode() {
        return Objects.hash(PE.class, this.f10332a, this.f10333b);
    }

    public final String toString() {
        String str = this.f10333b.f6968b;
        String str2 = this.f10332a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 45 + str.length() + 1);
        A.f.w(sb, "LegacyKmsAead Parameters (keyUri: ", str2, ", variant: ", str);
        sb.append(")");
        return sb.toString();
    }
}
