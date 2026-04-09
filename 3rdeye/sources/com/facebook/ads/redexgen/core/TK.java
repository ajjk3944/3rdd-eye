package com.facebook.ads.redexgen.core;

import android.content.SharedPreferences;
import android.util.Log;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.dynamicloading.FlashPreferences;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.lang.Thread;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class TK {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"i0FOsf0o9fpBvAlaEaGgnCYFRbNnwBKJ", "ZsBa2nEfyhltTo", "ZG6g5nWnUhxh", "6zjosiDwJWE47kuMvKAUCDrCWUeR8P3q", "Gh89HIHHDqfPtiuASbXLVil627eRz", "Lsbp3nhJR34oAmuvtJAouWbaxC4Ny9OM", "s0Y", "C"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-86, -93, -92, -39, -85, -43, -92, -85, -54, -58, -59, -7, -24, -19, -23, -14, -25, -23, -46, -23, -8, -5, -13, -10, -17, -88, -103, -96, 117, -66, -61, -66, -55, -66, -74, -63, -66, -49, -74, -55, -66, -60, -61, 117, -56, -55, -74, -57, -55, -70, -71, -84, -67, -60, 121, -48, -70, -52, 121, -70, -59, -53, -66, -70, -67, -46, 121, -62, -57, -62, -51, -62, -70, -59, -62, -45, -66, -67, 122, 121, -84, -60, -62, -55, -55, -62, -57, -64, -121, -90, -68, -62, 109, -79, -68, -69, 116, -63, 109, -80, -82, -71, -71, 109, -114, -62, -79, -74, -78, -69, -80, -78, -101, -78, -63, -60, -68, -65, -72, -114, -79, -64, 123, -74, -69, -74, -63, -74, -82, -71, -74, -57, -78, 117, 118, 123, 109, -96, -68, -70, -78, 109, -77, -62, -69, -80, -63, -74, -68, -69, -82, -71, -74, -63, -58, 109, -70, -82, -58, 109, -69, -68, -63, 109, -60, -68, -65, -72, 109, -67, -65, -68, -67, -78, -65, -71, -58, 123, -120, -105, -112, -58, -52, -63, -45, -56, 0, 6, -5, 13, 2, -7, -3, 9, 8, 0, 3, 1, -42, -44, -35, -44, -31, -40, -46, -3, 2, -3, 8, -3, -11, 0, -3, 14, -7, -51, -46, -51, -40, -51, -59, -48, -51, -34, -55, -116, -115, -124, -46, -45, -40, -124, -57, -59, -48, -48, -55, -56, -110, 1, -10, 8, 9, -12, 7, -6, 8, 10, 1, 9};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static YU A00() {
        return new YU();
    }

    public static YP A01(C3246cu c3246cu) {
        return new YP(c3246cu);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        XJ.A01.execute(new YV(initListener, initResult));
    }

    public static void A06(C3246cu c3246cu) {
        if (U9.A0P(c3246cu) && !A05.getAndSet(true)) {
            try {
                Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = new C2875Sl(Thread.getDefaultUncaughtExceptionHandler(), c3246cu, new YL());
                Thread.setDefaultUncaughtExceptionHandler(defaultUncaughtExceptionHandler);
            } catch (Exception e4) {
                c3246cu.A08().AAy(A02(198, 7, 78), AbstractC2885Sv.A1X, new C2886Sw(e4));
            }
        }
    }

    public static void A07(C3246cu c3246cu) {
        A0H(c3246cu, null, null, 3);
    }

    public static void A08(C3246cu c3246cu) {
        A0H(c3246cu, null, null, 3);
    }

    public static void A09(C3246cu c3246cu) {
        if (U7.A2H(c3246cu)) {
            A0F(c3246cu, 0);
        }
        if (U7.A2Q(c3246cu)) {
            A0B(c3246cu);
        }
    }

    public static void A0A(C3246cu c3246cu) {
        if (U7.A2I(c3246cu)) {
            String[] strArr = A03;
            if (strArr[1].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[1] = "XjvPwbQrSqkAxC";
            strArr2[6] = "skO";
            A0G(c3246cu, null, 3);
        }
    }

    public static void A0B(C3246cu c3246cu) {
        XU.A06.execute(new C3022Yg(c3246cu));
    }

    public static void A0C(C3246cu c3246cu) {
        AbstractC2748Nl.A02(c3246cu);
        C2879Sp.A0C(c3246cu, new YK(c3246cu), new C3090aO(), BuildConfigApi.isDebug());
        c3246cu.A0A();
        A0D(c3246cu);
    }

    public static void A0D(C3246cu c3246cu) {
        if (ProcessUtils.isRemoteRenderingProcess()) {
            return;
        }
        SharedPreferences sharedPreferences = FlashPreferences.getSharedPreferences(c3246cu);
        String string = sharedPreferences.getString(A02(186, 12, 121), null);
        String string2 = sharedPreferences.getString(A02(239, 11, 116), null);
        if (string != null && string2 != null) {
            InterfaceC2884Su interfaceC2884SuA08 = c3246cu.A08();
            C2886Sw c2886Sw = new C2886Sw(string2);
            String flashConfig = A02(181, 5, 63);
            interfaceC2884SuA08.ABR(flashConfig, 3701, c2886Sw);
        }
    }

    public static void A0F(C3246cu c3246cu, int i) {
        SP.A01(c3246cu);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            VF.A02();
        }
        A06(c3246cu);
        AbstractC2962Vw.A00(U7.A0q(c3246cu), BuildConfigApi.isDebug(), A00(), A01(c3246cu));
        S0.A03(U7.A04(c3246cu));
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            C3369ev.A09(new YN(c3246cu));
        }
        if (i == 3) {
            Log.e(A02(8, 17, 99), A02(89, 89, 44));
            c3246cu.A08().ABR(A02(178, 3, 6), AbstractC2885Sv.A0R, new C2886Sw(A02(215, 24, 67)));
        }
        ActivityUtils.A04(c3246cu, AudienceNetworkActivity.class);
        XU.A05(c3246cu);
        C2918Ud.A05(c3246cu);
        MW.A01(c3246cu);
        if (U7.A16(c3246cu)) {
            AbstractC2832Qt.A00(c3246cu);
        }
        if (U7.A1u(c3246cu)) {
            C2983Wt.A02().A8s(c3246cu);
        }
    }

    public static void A0G(C3246cu c3246cu, AudienceNetworkAds.InitListener initListener, int i) {
        SP.A01(c3246cu);
        boolean z10 = false;
        synchronized (TK.class) {
            boolean execute = A00;
            if (!execute) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        boolean execute2 = A01;
                        if (!execute2) {
                            A01 = true;
                            z10 = true;
                        }
                    }
                } else {
                    A00 = true;
                    z10 = true;
                }
            }
        }
        if (z10) {
            A0F(c3246cu, i);
            XU.A08.execute(new ZW(c3246cu, initListener));
        } else {
            if (i != 1) {
                return;
            }
            String strA02 = A02(51, 38, 56);
            if (initListener != null) {
                A04(initListener, new TJ(true, strA02));
            } else {
                Log.w(A02(8, 17, 99), strA02);
            }
        }
    }

    public static void A0H(C3246cu c3246cu, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        VF.A05(A02(205, 10, 115), A02(25, 26, 52), A02(0, 8, 82));
        C3369ev.A06();
        A0G(c3246cu, initListener, i);
    }

    public static synchronized boolean A0I() {
        return A00;
    }
}
