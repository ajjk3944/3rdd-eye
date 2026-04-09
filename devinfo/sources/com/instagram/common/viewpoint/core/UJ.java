package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.internal.util.process.ProcessUtils;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class UJ {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"qZcb6NmBns1n3v1", "rTLETUx3xNnjwSb02Sx6jVZM5Fuzg7Of", "ujF8Yx1ooHYTWOANWsLoHgp9GHsWq5OG", "emoc9RIZRY17k1iV3jHEmbNdIKvpuqWe", "9dj0hHqqeHaqkXambHAPXjsskYxWzSoy", "H6Wp9lsP8ocDK9Bk7hE2Cfl7XjXVKK5i", "baRwZ59Bd0PN8tFBdjuxnLHZSOlJTNRT", "2xLvEFwTfIQTf34sGOrn6donSx3FaGAc"};
    public static final AtomicReference<String> A03;
    public static final AtomicBoolean A04;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{-56, 3, -18, -22, -23, -10, -41, -23, 29, 12, 17, 13, 22, 11, 13, -10, 13, 28, 31, 23, 26, 19, -18, 23, 26, -23, 22, 12, 26, 23, 17, 12, -29, -18, -22, -5, -10, -41, 6, -18, -7, -11, -12, 9, -30, -18, -7, -11, -11, 9, -30, -71, -60, -64, -54, -63, -83, -53, -42, -46, -29, -26, -65, -63, -67, -68, -67, -86, -55, -59, -39, -42, -78, 64, 57, 79, 62, 69, 60, 60, 54, 79, 76, 79, 80, 88, 79, -9, 57, 69, 67, 4, 60, 55, 57, 59, 56, 69, 69, 65, 4, 55, 58, 73, 4, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 68, 55, 66, 4, 75, 55, 52, 50, 59, 50, Utf8.REPLACEMENT_BYTE, 54, 48, 25, 37, 37, 33, -33, 18, 24, 22, 31, 37, 31, 29, 15, 28, 9, 11, 17, 15, 24, 30, -20, -22, -36, -23, -42, -40, -34, -36, -27, -21, -42, -29, -40, -22, -21, -42, -23, -36, -35, -23, -36, -22, -33, 59, 41, 38, 35, 58, 45, 41, 59};
    }

    static {
        A07();
        A00 = A00(80, 7, FacebookMediationAdapter.ERROR_NULL_CONTEXT);
        A04 = new AtomicBoolean();
        A03 = new AtomicReference<>();
    }

    public static String A01(T8 t82) {
        return WebSettings.getDefaultUserAgent(t82);
    }

    public static String A02(T8 t82) {
        FutureTask futureTask = new FutureTask(new UI(t82));
        for (int i4 = 0; i4 < 3; i4++) {
            Y4.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th2) {
                A08(t82, th2);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(T8 t82, C0859To c0859To) {
        String strA07 = c0859To.A07();
        if (TextUtils.isEmpty(strA07) && !A04.getAndSet(true)) {
            InterfaceC0847Tc interfaceC0847TcA08 = t82.A08();
            int i4 = AbstractC0848Td.A1Z;
            String bundle = A00(73, 7, 122);
            C0849Te c0849Te = new C0849Te(bundle);
            String bundle2 = A00(116, 7, 87);
            interfaceC0847TcA08.ABC(bundle2, i4, c0849Te);
        }
        return strA07;
    }

    public static String A04(T8 t82, boolean z3) {
        if (t82 == null) {
            return A00;
        }
        if (z3) {
            return System.getProperty(A00(123, 10, 59));
        }
        String str = A03.get();
        if (str != null) {
            return str;
        }
        long spUserAgentRefresh = AbstractC0885Uo.A01(t82);
        String strA00 = A00(143, 23, 1);
        String strA002 = A00(133, 10, 52);
        String strA003 = A00(88, 28, 96);
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences = t82.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA003, t82), 0);
            String string = sharedPreferences.getString(strA002, null);
            long j = sharedPreferences.getLong(strA00, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - j < spUserAgentRefresh) {
                A03.set(string);
                String[] strArr = A02;
                String str2 = strArr[6];
                String browserUserAgent = strArr[3];
                if (str2.charAt(17) != browserUserAgent.charAt(17)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A02;
                strArr2[6] = "raDju45r7vWAWvtCMjs7ezmbeHuUzRMZ";
                strArr2[3] = "IEXEfOXuBGyf1jRfSjx88B0PyUJh9Pa6";
                return string;
            }
        }
        String strA02 = null;
        try {
            strA02 = A01(t82);
            A03.set(strA02);
        } catch (Throwable t10) {
            A08(t82, t10);
        }
        if (strA02 == null) {
            strA02 = A02(t82);
        }
        if (strA02 == null) {
            return A00;
        }
        if (spUserAgentRefresh > 0) {
            SharedPreferences sharedPreferences2 = t82.getSharedPreferences(ProcessUtils.getProcessSpecificName(strA003, t82), 0);
            sharedPreferences2.edit().putString(strA002, A03.get()).apply();
            sharedPreferences2.edit().putLong(strA00, System.currentTimeMillis()).apply();
        }
        return strA02;
    }

    public static String A05(C0859To c0859To, T8 t82) {
        if (AbstractC0885Uo.A04(t82)) {
            return A00(63, 5, 5) + A03(t82, c0859To) + A00(39, 6, 61) + c0859To.A06() + A00(45, 6, 61) + c0859To.A04() + A00(38, 1, 85);
        }
        return A00(0, 0, 76);
    }

    public static String A06(C0859To c0859To, T8 t82, boolean z3) {
        return A04(t82, z3) + A00(0, 38, 50) + t82.A05().A9S() + A00(57, 6, 26) + C0859To.A04 + A00(38, 1, 85) + A05(c0859To, t82) + A00(68, 5, 13) + t82.A05().A9T() + A00(51, 6, 8) + Locale.getDefault().toString() + A00(87, 1, 36);
    }

    public static void A08(T8 t82, Throwable th2) {
        t82.A08().ABC(A00(166, 8, 78), AbstractC0848Td.A2i, new C0849Te(th2));
    }
}
