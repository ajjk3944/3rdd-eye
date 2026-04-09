package com.instagram.common.viewpoint.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.gD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1783gD {
    public static InterfaceC1763ft A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, 63, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, 61, 106, 101, 81, 105, 111, 64, 109, 32, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, 15, 7, 28, 30, 2, 15, 0, Flags.CD, 49, 3, 1, 10, Flags.CD, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, 63, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC1765fv A00(T8 t82) {
        return A03(true, t82);
    }

    public static InterfaceC1765fv A01(T8 t82) {
        return A02(true, t82);
    }

    public static InterfaceC1765fv A02(boolean z10, T8 t82) {
        C1769fz c1769fz = new C1769fz();
        C1772g2 networkModuleRequestConfigurationBuilder = A04(t82);
        if (!A0B(t82)) {
            c1769fz.A02(A03);
            c1769fz.A01(A02);
        }
        if (XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(XD.A02());
        }
        C0810Cv c0810CvA00 = AbstractC1767fx.A00();
        C1769fz networkModuleConfigurationBuilder = c1769fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return c0810CvA00.A00(networkModuleConfigurationBuilder.A03(z10).A04(t82.A05().AAO()).A05(), t82.A08(), YG.A01());
    }

    public static InterfaceC1765fv A03(boolean z10, T8 t82) {
        return AbstractC1767fx.A00().A00(new C1769fz().A03(z10).A00(A04(t82).A09()).A04(t82.A05().AAO()).A05(), t82.A08(), YG.A01());
    }

    public static C1772g2 A04(T8 t82) {
        A08(t82);
        C1772g2 c1772g2 = new C1772g2();
        if (A0B(t82) || XD.A04()) {
            c1772g2.A02(360000).A04(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c1772g2.A02(C1264Up.A09(t82)).A04(C1264Up.A0B(t82));
        }
        c1772g2.A03(C1264Up.A0A(t82)).A05(C1264Up.A0C(t82)).A06(C1264Up.A0D(t82));
        synchronized (C1783gD.class) {
            if (A00 != null && (A00 instanceof InterfaceC1763ft)) {
                c1772g2.A07(A00);
            }
        }
        return c1772g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(T8 t82) {
        if (!A04.get()) {
            t82.A08().ABC(A05(161, 7, 110), AbstractC1226Td.A21, new C1227Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC1763ft interfaceC1763ft) {
        A00 = interfaceC1763ft;
    }

    public static boolean A0A(T8 t82) {
        return Settings.Global.getInt(t82.getContentResolver(), A05(145, 16, 115), 0) != 0;
    }

    public static boolean A0B(T8 t82) {
        String strA9Q = t82.A05().A9Q();
        if (!TextUtils.isEmpty(strA9Q)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9Q.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
