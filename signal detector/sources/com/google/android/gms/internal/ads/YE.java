package com.google.android.gms.internal.ads;

import j$.util.Objects;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class YE extends AbstractC1521mE {

    /* renamed from: a, reason: collision with root package name */
    public final C2006vE f12619a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12620b;

    public YE(C2006vE c2006vE, int i) {
        this.f12619a = c2006vE;
        this.f12620b = i;
    }

    public static YE b(C2006vE c2006vE, int i) throws GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new YE(c2006vE, i);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1089eE
    public final boolean a() {
        return this.f12619a != C2006vE.f17243j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof YE)) {
            return false;
        }
        YE ye = (YE) obj;
        return ye.f12619a == this.f12619a && ye.f12620b == this.f12620b;
    }

    public final int hashCode() {
        return Objects.hash(YE.class, this.f12619a, Integer.valueOf(this.f12620b));
    }

    public final String toString() {
        String str = this.f12619a.f17247b;
        int length = str.length();
        int i = this.f12620b;
        StringBuilder sb = new StringBuilder(length + 48 + String.valueOf(i).length() + 1);
        sb.append("X-AES-GCM Parameters (variant: ");
        sb.append(str);
        sb.append("salt_size_bytes: ");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
