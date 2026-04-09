package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0714Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C0842Sx A00;
    public EnumC1097bD A01 = EnumC1097bD.A05;
    public ArrayList<C1220dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC0713Nt A04;

    public static String A04(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public C0714Nu(C1436gi c1436gi, O8 o82, InterfaceC0713Nt interfaceC0713Nt, String str) {
        JSONObject dataObject = o82.A03();
        this.A03 = A01(c1436gi, o82, str, dataObject);
        this.A04 = interfaceC0713Nt;
    }

    private AdError A00(C1436gi c1436gi, AbstractC1601jd abstractC1601jd) {
        if (abstractC1601jd == null || abstractC1601jd.A2G().isEmpty()) {
            c1436gi.A08().ABC(A04(62, 3, 33), AbstractC0848Td.A0Z, new C0849Te(A04(5, 43, 20)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static NQ A01(C1436gi c1436gi, O8 o82, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C1595jT.A01(jSONObject, c1436gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C03137n.A00(jSONObject, c1436gi);
        }
        nqA00.A1M(str);
        C0868Tx c0868TxA01 = o82.A01();
        if (c0868TxA01 != null) {
            nqA00.A1I(c0868TxA01.A06());
        }
        return nqA00;
    }

    private C0842Sx A03(C1436gi c1436gi) {
        return this.A00 != null ? this.A00 : new C0842Sx(c1436gi);
    }

    private void A08(C1436gi c1436gi, C03137n c03137n) {
        C0708No playableData = c03137n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1097bD.A05);
        C1581jC c1581jC = new C1581jC(this);
        C0842Sx c0842Sx = new C0842Sx(c1436gi);
        boolean z3 = C0886Up.A2H(c1436gi) && SN.A0A(c03137n.A1H());
        if (z3) {
            SN unifiedAssetsLoader = new SN(c0842Sx, c03137n.A1H(), c03137n.A10(), c03137n.A1D(), z3, new C1580jB(this));
            c0842Sx.A0e(new VI(c03137n.A2E(), c1436gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c1436gi, c03137n, true, c1581jC);
    }

    private void A09(C1436gi c1436gi, EnumSet<CacheFlag> enumSet, AbstractC1601jd abstractC1601jd, int i4, InterfaceC0713Nt interfaceC0713Nt) {
        boolean isDSL = abstractC1601jd.A1g();
        C0842Sx c0842SxA03 = A03(c1436gi);
        c0842SxA03.A0e(new VI(abstractC1601jd.A2E(), c1436gi.A0A()));
        boolean z3 = C0886Up.A2H(c1436gi) && SN.A0A(abstractC1601jd.A1H());
        if (z3) {
            new SN(c0842SxA03, abstractC1601jd.A1H(), abstractC1601jd.A10(), abstractC1601jd.A1D(), z3, new C1584jF(this, c1436gi, isDSL, abstractC1601jd, interfaceC0713Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (isDSL) {
            C0838St c0838St = new C0838St(abstractC1601jd.A0x(), abstractC1601jd.A1D(), strA04);
            c0838St.A04 = true;
            c0838St.A03 = A04(0, 5, 78);
            c0842SxA03.A0Y(c0838St);
        }
        c0842SxA03.A0d(new C0840Sv(abstractC1601jd.A2C().A01(), C1273e4.A04, C1273e4.A04, abstractC1601jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i10 = 0;
        boolean zA30 = C0886Up.A30(c1436gi, C1363fX.A03());
        for (NR nr : abstractC1601jd.A2G()) {
            C0840Sv c0840Sv = new C0840Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC1601jd.A1D(), A04(96, 12, 117));
            if (i10 == 0) {
                c0842SxA03.A0c(c0840Sv);
            } else {
                c0842SxA03.A0d(c0840Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c0842SxA03.A0d(new C0840Sv(it.next(), -1, -1, abstractC1601jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C0838St c0838St2 = new C0838St(nr.A0H().A09(), abstractC1601jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c0838St2.A04 = false;
                if (i10 == 0) {
                    if (isDSL && !zA30) {
                        c0842SxA03.A0Y(c0838St2);
                    } else {
                        c0842SxA03.A0b(c0838St2);
                    }
                } else if (isDSL && !zA30) {
                    c0842SxA03.A0Z(c0838St2);
                } else {
                    c0842SxA03.A0a(c0838St2);
                }
            }
            i10++;
        }
        if (abstractC1601jd.A1W() && !TextUtils.isEmpty(abstractC1601jd.A11())) {
            c0842SxA03.A0d(new C0840Sv(abstractC1601jd.A11(), C0750Pe.A0A, C0750Pe.A0A, abstractC1601jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC1601jd, c0842SxA03, strA04);
        c0842SxA03.A0X(new C1582jD(this, c1436gi, isDSL, abstractC1601jd, interfaceC0713Nt), new C0835Sq(abstractC1601jd.A1D(), strA04, i4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C1436gi c1436gi, EnumSet<CacheFlag> enumSet, C1595jT c1595jT, AbstractC1601jd abstractC1601jd, int i4, InterfaceC0713Nt interfaceC0713Nt) {
        A09(c1436gi, enumSet, abstractC1601jd, i4, new C1586jH(this, c1436gi, abstractC1601jd, c1595jT, i4, interfaceC0713Nt, enumSet));
    }

    private void A0B(EnumC1097bD enumC1097bD) {
        this.A01 = enumC1097bD;
    }

    private boolean A0C(C1436gi c1436gi, AbstractC1601jd abstractC1601jd) {
        AdError adErrorA00 = A00(c1436gi, abstractC1601jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.instagram.common.viewpoint.core.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.instagram.common.viewpoint.core.WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.instagram.common.viewpoint.core.AbstractC1601jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0714Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0714Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0714Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0714Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C0714Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C0714Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.instagram.common.viewpoint.core.WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C0714Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1097bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C1595jT) this.A03).A2A();
        }
        return ((AbstractC1601jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C1436gi c1436gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C1595jT c1595jT = (C1595jT) this.A03;
            AbstractC1601jd abstractC1601jdA26 = c1595jT.A26();
            if (A0C(c1436gi, abstractC1601jdA26) || abstractC1601jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c1436gi, enumSet, c1595jT, abstractC1601jdA26, 0, this.A04);
            return;
        }
        AbstractC1601jd abstractC1601jd = (AbstractC1601jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c1436gi, abstractC1601jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C03137n c03137n = (C03137n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c1436gi, c03137n);
                return;
            } else {
                A08(c1436gi, c03137n);
                return;
            }
        }
        A09(c1436gi, enumSet, (C03137n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC1601jd abstractC1601jd) {
        return !TextUtils.isEmpty(abstractC1601jd.A29().A0H().A09());
    }
}
