package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.om, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3944om implements C1S {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C3944om A06 = new C2J().A0A();
    public static final C1R<C23959r> A05 = new C1R() { // from class: com.facebook.ads.redexgen.X.on
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return new C2J().A06(bundle.getLong(C3944om.A01(0), 0L)).A05(bundle.getLong(C3944om.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C3944om.A01(2), false)).A07(bundle.getBoolean(C3944om.A01(3), false)).A09(bundle.getBoolean(C3944om.A01(4), false)).A0B();
        }
    };

    public C3944om(C2J c2j) {
        this.A01 = c2j.A01;
        this.A00 = c2j.A00;
        this.A03 = c2j.A03;
        this.A02 = c2j.A02;
        this.A04 = c2j.A04;
    }

    public static String A01(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3944om)) {
            return false;
        }
        C3944om c3944om = (C3944om) obj;
        return this.A01 == c3944om.A01 && this.A00 == c3944om.A00 && this.A03 == c3944om.A03 && this.A02 == c3944om.A02 && this.A04 == c3944om.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
