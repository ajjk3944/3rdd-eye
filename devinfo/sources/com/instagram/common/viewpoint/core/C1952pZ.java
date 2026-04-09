package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1952pZ implements AnonymousClass24 {
    public final int A00;
    public final C1959pg A01;
    public final boolean A02;
    public final int[] A03;
    public final boolean[] A04;
    public static final String A07 = C5C.A0h(0);
    public static final String A09 = C5C.A0h(1);
    public static final String A08 = C5C.A0h(3);
    public static final String A06 = C5C.A0h(4);
    public static final AnonymousClass23<C1952pZ> A05 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pa
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C1952pZ.A00(bundle);
        }
    };

    public C1952pZ(C1959pg c1959pg, boolean z3, int[] iArr, boolean[] zArr) {
        this.A00 = c1959pg.A01;
        boolean z10 = false;
        AbstractC02203y.A07(this.A00 == iArr.length && this.A00 == zArr.length);
        this.A01 = c1959pg;
        if (z3 && this.A00 > 1) {
            z10 = true;
        }
        this.A02 = z10;
        this.A03 = (int[]) iArr.clone();
        this.A04 = (boolean[]) zArr.clone();
    }

    public static /* synthetic */ C1952pZ A00(Bundle bundle) {
        C1959pg c1959pg = (C1959pg) C1959pg.A06.A6f((Bundle) AbstractC02203y.A01(bundle.getBundle(A07)));
        int[] iArr = (int[]) AbstractC1659ka.A00(bundle.getIntArray(A09), new int[c1959pg.A01]);
        boolean[] selected = (boolean[]) AbstractC1659ka.A00(bundle.getBooleanArray(A08), new boolean[c1959pg.A01]);
        return new C1952pZ(c1959pg, bundle.getBoolean(A06, false), iArr, selected);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1952pZ c1952pZ = (C1952pZ) obj;
        if (this.A02 == c1952pZ.A02 && this.A01.equals(c1952pZ.A01) && Arrays.equals(this.A03, c1952pZ.A03) && Arrays.equals(this.A04, c1952pZ.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A01.hashCode() * 31) + (this.A02 ? 1 : 0)) * 31) + Arrays.hashCode(this.A03)) * 31) + Arrays.hashCode(this.A04);
    }
}
