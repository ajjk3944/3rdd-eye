package com.instagram.common.viewpoint.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1115bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC0686Mr A00;
    public AbstractC0688Mt A01;
    public AbstractC1601jd A02;
    public XS A03;
    public InterfaceC0951Xh A04;
    public InterfaceC1114bU A05;
    public boolean A06;
    public final C0700Ng A07;
    public final C1436gi A08;
    public final VA A09;
    public final Y2 A0A;
    public final InterfaceC0977Yh A0B;
    public final C1381fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C1115bV(C1436gi c1436gi, String str, C1381fp c1381fp, Y2 y22, VA va2, C0700Ng c0700Ng) {
        this(c1436gi, str, c1381fp, y22, va2, c0700Ng, new C0635Ks());
    }

    public C1115bV(C1436gi c1436gi, String str, C1381fp c1381fp, Y2 y22, VA va2, C0700Ng c0700Ng, InterfaceC0977Yh interfaceC0977Yh) {
        this.A0E = true;
        this.A08 = c1436gi;
        this.A0D = str;
        this.A0C = c1381fp;
        this.A0A = y22;
        this.A09 = va2;
        this.A07 = c0700Ng;
        this.A0B = interfaceC0977Yh;
    }

    public C1115bV(C1436gi c1436gi, String str, C1381fp c1381fp, Y2 y22, VA va2, C0700Ng c0700Ng, InterfaceC0977Yh interfaceC0977Yh, InterfaceC0951Xh interfaceC0951Xh) {
        this.A0E = true;
        this.A08 = c1436gi;
        this.A0D = str;
        this.A0C = c1381fp;
        this.A0A = y22;
        this.A09 = va2;
        this.A07 = c0700Ng;
        this.A0B = interfaceC0977Yh;
        this.A04 = interfaceC0951Xh;
    }

    private EnumC0685Mq A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        EnumC0685Mq actionOutcome = EnumC0685Mq.A09;
        try {
            YB.A0c(map, this.A02);
            Uri uriA00 = XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C0689Mu.A01(this.A08, this.A09, str, uriA00, new C1093b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof AnonymousClass87) {
                ((AnonymousClass87) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof AnonymousClass85)) {
                    actionOutcome = EnumC0685Mq.A08;
                }
            }
            if (!(((this.A01 instanceof AnonymousClass84) || (this.A01 instanceof AnonymousClass87)) && YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC0685Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e2) {
            Log.e(strA01, A01(44, 20, 68) + str2, e2);
        } catch (Exception e10) {
            Log.e(strA01, A01(22, 22, 27), e10);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C1436gi c1436gi) {
        boolean zA2w = C0886Up.A2w(c1436gi);
        int iA07 = C0886Up.A07(c1436gi);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2w && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC0685Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC0685Mq enumC0685MqA00 = EnumC0685Mq.A09;
        new VI(str, this.A09).A04(VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC0685MqA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC0685MqA00;
    }

    public final InterfaceC0686Mr A06() {
        if (this.A01 != null) {
            InterfaceC0686Mr interfaceC0686MrA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return interfaceC0686MrA0E;
        }
        return null;
    }

    public final void A07(InterfaceC0686Mr interfaceC0686Mr) {
        this.A00 = interfaceC0686Mr;
        A02();
    }

    public final void A08(AbstractC1601jd abstractC1601jd) {
        this.A02 = abstractC1601jd;
    }

    public final void A09(XS xs) {
        this.A03 = xs;
    }

    public final void A0A(InterfaceC0951Xh interfaceC0951Xh) {
        this.A04 = interfaceC0951Xh;
    }

    public final void A0B(InterfaceC1114bU interfaceC1114bU) {
        this.A05 = interfaceC1114bU;
    }

    public final void A0C(boolean z3) {
        this.A06 = z3;
    }
}
