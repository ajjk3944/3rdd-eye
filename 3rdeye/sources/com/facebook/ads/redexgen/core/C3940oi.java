package com.facebook.ads.redexgen.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3940oi implements C1S {
    public final C3944om A00;

    @Deprecated
    public final C23959r A01;
    public final C3942ok A02;
    public final C2Q A03;

    @Deprecated
    public final C3941oj A04;
    public final C3938og A05;
    public final String A06;
    public static String[] A07 = {"wAM8vtdO0lmHfSdh0aX8JSKdnwpCp9D2", "", "J6SB4ddL0FfEeVIHYuGnUGetWM2QRdUO", "0HTq7SjPEUFdYYph8tikUta3pLjb69Rn", "wGA6vSFg01QHk42FD2L8p637KRkqAXcn", "9eG6h6QaFREs2gWO0", "Z5vutuZNVsi2rK7c87KXUNl8wBJYnGEL", "V2BGt2aUfGoyLxnwwGFsOMeTNor3H3xe"};
    public static final C3940oi A09 = new C2I().A05();
    public static final C1R<C3940oi> A08 = new C1R() { // from class: com.facebook.ads.redexgen.X.oo
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C3940oi.A00(bundle);
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3940oi A00(Bundle bundle) {
        String str = (String) C3M.A01(bundle.getString(A02(0), ""));
        Bundle bundle2 = bundle.getBundle(A02(1));
        C3942ok c3942ok = bundle2 == null ? C3942ok.A07 : (C3942ok) C3942ok.A06.A6X(bundle2);
        Bundle bundle3 = bundle.getBundle(A02(2));
        C3938og c3938og = bundle3 == null ? C3938og.A0Z : (C3938og) C3938og.A0Y.A6X(bundle3);
        Bundle bundle4 = bundle.getBundle(A02(3));
        return new C3940oi(str, bundle4 == null ? C23959r.A00 : (C23959r) C3944om.A05.A6X(bundle4), null, c3942ok, c3938og);
    }

    public C3940oi(String str, C23959r c23959r, C3941oj c3941oj, C3942ok c3942ok, C3938og c3938og) {
        this.A06 = str;
        this.A03 = c3941oj;
        this.A04 = c3941oj;
        this.A02 = c3942ok;
        this.A05 = c3938og;
        this.A00 = c23959r;
        this.A01 = c23959r;
    }

    public static String A02(int i) {
        return Integer.toString(i, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3940oi)) {
            return false;
        }
        C3940oi c3940oi = (C3940oi) obj;
        if (AbstractC22614a.A1E(this.A06, c3940oi.A06)) {
            C3944om c3944om = this.A00;
            C3944om c3944om2 = c3940oi.A00;
            String[] strArr = A07;
            if (strArr[7].charAt(22) != strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[7] = "WE1TlvFnuMEFfhCqOSZQGPel0cAOxnij";
            strArr2[2] = "QIjSvgjDyRqWUwkha5pDZVewjWBdao8T";
            if (c3944om.equals(c3944om2) && AbstractC22614a.A1E(this.A03, c3940oi.A03) && AbstractC22614a.A1E(this.A02, c3940oi.A02) && AbstractC22614a.A1E(this.A05, c3940oi.A05)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A06.hashCode();
        int i = result * 31;
        int result2 = this.A03 != null ? this.A03.hashCode() : 0;
        int iHashCode = (((i + result2) * 31) + this.A02.hashCode()) * 31;
        C3944om c3944om = this.A00;
        String[] strArr = A07;
        String str = strArr[4];
        String str2 = strArr[3];
        int iCharAt = str.charAt(31);
        int result3 = str2.charAt(31);
        if (iCharAt != result3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[7] = "oKnJE1KY80M0C2djBAWfSHeSjkObNKTB";
        strArr2[2] = "bdrBBUaZbF1SVnsIGw0ZL6eMFfyDgZAn";
        int result4 = c3944om.hashCode();
        return ((iHashCode + result4) * 31) + this.A05.hashCode();
    }
}
