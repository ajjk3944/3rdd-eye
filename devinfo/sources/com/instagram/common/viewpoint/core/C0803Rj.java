package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.applovin.shadow.okio.Utf8;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0803Rj {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C0798Re A01;
    public final C1436gi A02;
    public final VA A03;

    public static String A0K(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, 127, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, 127, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, Utf8.REPLACEMENT_BYTE, 20, 9, 13, 5, Utf8.REPLACEMENT_BYTE, 16, 15, 12, 12, 9, 14, 7, Utf8.REPLACEMENT_BYTE, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0L();
    }

    public C0803Rj(C0798Re c0798Re, Intent intent, VA va2, C1436gi c1436gi) {
        this.A01 = c0798Re;
        this.A00 = intent;
        this.A03 = va2;
        this.A02 = c1436gi;
    }

    private AbstractC1601jd A00() {
        int i4 = Build.VERSION.SDK_INT;
        String strA0K = A0K(80, 18, 33);
        if (i4 >= 33) {
            return (AbstractC1601jd) this.A00.getSerializableExtra(strA0K, AbstractC1601jd.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC1601jd) intent.getSerializableExtra(strA0K);
    }

    private C1595jT A01() {
        int i4 = Build.VERSION.SDK_INT;
        String strA0K = A0K(26, 19, 47);
        if (i4 >= 33) {
            return (C1595jT) this.A00.getSerializableExtra(strA0K, C1595jT.class);
        }
        return (C1595jT) this.A00.getSerializableExtra(strA0K);
    }

    private C03137n A02() {
        int i4 = Build.VERSION.SDK_INT;
        String strA0K = A0K(2, 14, 94);
        if (i4 >= 33) {
            return (C03137n) this.A00.getSerializableExtra(strA0K, C03137n.class);
        }
        return (C03137n) this.A00.getSerializableExtra(strA0K);
    }

    private C03117l A03() {
        int i4 = Build.VERSION.SDK_INT;
        String strA0K = A0K(98, 25, 105);
        if (i4 >= 33) {
            return (C03117l) this.A00.getSerializableExtra(strA0K, C03117l.class);
        }
        return (C03117l) this.A00.getSerializableExtra(strA0K);
    }

    private InterfaceC0978Yi A05() throws NumberFormatException {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = C0886Up.A2w(this.A02);
        if (isV2Design) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, WebSocketProtocol.PAYLOAD_SHORT));
            C0798Re c0798Re = this.A01;
            C1436gi c1436gi = this.A02;
            VA va2 = this.A03;
            C1482hS c1482hS = new C1482hS(this.A01);
            String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int i4 = Integer.parseInt(stringExtra);
            String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC02976x(c0798Re, c1436gi, va2, c1482hS, stringExtra2, i4);
        }
        return new PZ(this.A01, this.A02, this.A03, new C1482hS(this.A01), booleanExtra);
    }

    private InterfaceC0978Yi A06() {
        C03137n c03137nA02 = A02();
        if (c03137nA02 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c03137nA02, c03137nA02.A1G(), new MH());
    }

    private InterfaceC0978Yi A07() {
        C03117l c03117lA03 = A03();
        if (c03117lA03 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c03117lA03, c03117lA03.A1G(), new MG());
    }

    private InterfaceC0978Yi A08(InterfaceC0977Yh interfaceC0977Yh, AbstractC1601jd abstractC1601jd, String str, ZU zu) {
        if (abstractC1601jd.A29().A0H().A07() != null) {
            C0708No c0708NoA07 = abstractC1601jd.A29().A0H().A07();
            if (abstractC1601jd.A1n()) {
                return new MW(this.A02, this.A03, interfaceC0977Yh, abstractC1601jd, c0708NoA07, str, zu);
            }
            return new NO(this.A02, this.A03, interfaceC0977Yh, abstractC1601jd, str, zu);
        }
        interfaceC0977Yh.A4j(zu.A81());
        interfaceC0977Yh.A4j(zu.A7w());
        return null;
    }

    private PJ A09(WK wk2) {
        AbstractC1601jd abstractC1601jdA02;
        if (wk2 == WK.A0G) {
            abstractC1601jdA02 = A03();
            String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (abstractC1601jdA02 == null) {
                return null;
            }
        } else if (wk2 != WK.A0A || (abstractC1601jdA02 = A02()) == null) {
            return null;
        }
        abstractC1601jdA02.A1L(this.A01.A08());
        if (abstractC1601jdA02.A1a()) {
            return new C4U(this.A02, this.A03, new C0842Sx(this.A02), new C1482hS(this.A01), abstractC1601jdA02);
        }
        return new C4T(this.A02, this.A03, new C0842Sx(this.A02), new C1482hS(this.A01), abstractC1601jdA02);
    }

    private final MT A0A() {
        return new MT(this.A02, this.A01);
    }

    private MI A0B(RelativeLayout relativeLayout) {
        MI mi2 = new MI(this.A02, new C1481hR(this), this.A03, new C1482hS(this.A01));
        mi2.A05(relativeLayout);
        mi2.A04(this.A00.getIntExtra(A0K(123, 27, 91), TTAdConstant.MATE_VALID));
        YB.A0N(relativeLayout, -16777216);
        return mi2;
    }

    private AnonymousClass66 A0C() {
        C03137n c03137nA02 = A02();
        if (c03137nA02 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C1482hS(this.A01), c03137nA02, new MH(), 1);
    }

    private AnonymousClass66 A0D() {
        C03117l c03117lA03 = A03();
        if (c03117lA03 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C1482hS(this.A01), c03117lA03, new MG(), 0);
    }

    private JD A0E() {
        C1220dC c1220dCA02;
        AbstractC1601jd abstractC1601jdA00 = A00();
        if (abstractC1601jdA00 == null || (c1220dCA02 = AbstractC1221dD.A02(abstractC1601jdA00.A1D())) == null) {
            return null;
        }
        return new JD(this.A02, new C1482hS(this.A01), c1220dCA02, abstractC1601jdA00.A2E());
    }

    private C0518Ge A0F(WK wk2) {
        ZU mg2;
        InterfaceC0977Yh anonymousClass77;
        C1595jT c1595jTA01 = A01();
        if (c1595jTA01 == null) {
            return null;
        }
        if (wk2 == WK.A04) {
            mg2 = new MH();
            anonymousClass77 = new C1482hS(this.A01);
        } else {
            mg2 = new MG();
            anonymousClass77 = new AnonymousClass77(this.A01);
        }
        return new C0518Ge(this.A02, mg2, this.A03, c1595jTA01, new C0842Sx(this.A02), anonymousClass77);
    }

    private C02454x A0G() {
        C03137n c03137nA02 = A02();
        if (c03137nA02 != null) {
            return new C02454x(this.A02, new MH(), this.A03, c03137nA02, new C0842Sx(this.A02), new C1482hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C4V A0H() {
        C03137n c03137nA02 = A02();
        if (c03137nA02 == null) {
            return null;
        }
        return new C4V(this.A02, new MH(), this.A03, c03137nA02, new C0842Sx(this.A02), new C1482hS(this.A01));
    }

    private C4V A0I() {
        C03117l c03117lA03 = A03();
        if (c03117lA03 == null) {
            return null;
        }
        return new C4V(this.A02, new MG(), this.A03, c03117lA03, new C0842Sx(this.A02), new AnonymousClass77(this.A01));
    }

    private GB A0J(WK wk2) {
        AbstractC1601jd abstractC1601jdA02;
        AbstractC1601jd abstractC1601jdA022;
        if (wk2 == WK.A0J) {
            abstractC1601jdA02 = A03();
            if (abstractC1601jdA02 == null || (abstractC1601jdA022 = A03()) == null) {
                return null;
            }
        } else if (wk2 != WK.A0E || (abstractC1601jdA02 = A02()) == null || (abstractC1601jdA022 = A02()) == null) {
            return null;
        }
        return new GB(this.A02, this.A03, abstractC1601jdA02, abstractC1601jdA022, new AnonymousClass77(this.A01), this.A01, wk2);
    }

    public final InterfaceC0978Yi A0M(WK wk2, RelativeLayout relativeLayout) throws NumberFormatException {
        if (wk2 == null) {
            return null;
        }
        switch (C0802Ri.A00[wk2.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(wk2);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                InterfaceC0978Yi interfaceC0978YiA05 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return interfaceC0978YiA05;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return interfaceC0978YiA05;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                AnonymousClass66 anonymousClass66A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return anonymousClass66A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(wk2);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(wk2);
            default:
                return null;
        }
    }
}
