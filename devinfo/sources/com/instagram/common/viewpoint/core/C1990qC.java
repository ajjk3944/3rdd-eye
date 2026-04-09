package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1990qC implements AnonymousClass24 {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public static final C1990qC A06 = new C01932v().A0A();
    public static final AnonymousClass23<AW> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qD
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return new C01932v().A06(bundle.getLong(C1990qC.A01(0), 0L)).A05(bundle.getLong(C1990qC.A01(1), Long.MIN_VALUE)).A08(bundle.getBoolean(C1990qC.A01(2), false)).A07(bundle.getBoolean(C1990qC.A01(3), false)).A09(bundle.getBoolean(C1990qC.A01(4), false)).A0B();
        }
    };

    public C1990qC(C01932v c01932v) {
        this.A01 = c01932v.A01;
        this.A00 = c01932v.A00;
        this.A03 = c01932v.A03;
        this.A02 = c01932v.A02;
        this.A04 = c01932v.A04;
    }

    public static String A01(int i4) {
        return Integer.toString(i4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1990qC)) {
            return false;
        }
        C1990qC c1990qC = (C1990qC) obj;
        return this.A01 == c1990qC.A01 && this.A00 == c1990qC.A00 && this.A03 == c1990qC.A03 && this.A02 == c1990qC.A02 && this.A04 == c1990qC.A04;
    }

    public final int hashCode() {
        return (((((((((int) (this.A01 ^ (this.A01 >>> 32))) * 31) + ((int) (this.A00 ^ (this.A00 >>> 32)))) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
