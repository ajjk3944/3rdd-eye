package com.instagram.common.viewpoint.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.2y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C05742y {
    public final Uri A00;
    public final List<Integer> A01;

    @Deprecated
    public final List<Integer> A02;
    public final Map<String, String> A03;

    @Deprecated
    public final Map<String, String> A04;
    public final UUID A05;

    @Deprecated
    public final UUID A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A;

    public C05742y(C05732x c05732x) {
        byte[] bArrCopyOf;
        AbstractC05983y.A08((c05732x.A04 && c05732x.A00 == null) ? false : true);
        this.A05 = (UUID) AbstractC05983y.A01(c05732x.A03);
        this.A06 = this.A05;
        this.A00 = c05732x.A00;
        this.A04 = c05732x.A02;
        this.A03 = c05732x.A02;
        this.A08 = c05732x.A05;
        this.A07 = c05732x.A04;
        this.A09 = c05732x.A06;
        this.A02 = c05732x.A01;
        this.A01 = c05732x.A01;
        if (c05732x.A07 != null) {
            bArrCopyOf = Arrays.copyOf(c05732x.A07, c05732x.A07.length);
        } else {
            bArrCopyOf = null;
        }
        this.A0A = bArrCopyOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05742y)) {
            return false;
        }
        C05742y c05742y = (C05742y) obj;
        if (this.A05.equals(c05742y.A05) && C5C.A1E(this.A00, c05742y.A00) && C5C.A1E(this.A03, c05742y.A03) && this.A08 == c05742y.A08 && this.A07 == c05742y.A07 && this.A09 == c05742y.A09 && this.A01.equals(c05742y.A01) && Arrays.equals(this.A0A, c05742y.A0A)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((((this.A05.hashCode() * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31) + this.A03.hashCode()) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A0A);
    }
}
