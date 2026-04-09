package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zt0 implements y61, of1 {
    public static xt0 f;
    public static long g;
    public static final ge h = new ge();
    public static final boolean[] i = new boolean[3];
    public static final int[] j = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final rv1 k = new rv1(14);
    public static final zq2 l = new zq2(13);
    public static final p63 m = new p63(3);
    public static final p63 n = new p63(18);
    public static final /* synthetic */ int o = 0;

    public static nx2 A(Throwable th) {
        if (th instanceof d03) {
            d03 d03Var = (d03) th;
            return O(d03Var.f, d03Var.g);
        }
        if (th instanceof hx2) {
            return th.getMessage() == null ? Q(((hx2) th).f, null, null) : Q(((hx2) th).f, th.getMessage(), null);
        }
        if (!(th instanceof xt1)) {
            return Q(1, null, null);
        }
        xt1 xt1Var = (xt1) th;
        int i2 = xt1Var.f;
        String message = xt1Var.getMessage();
        if (message == null) {
            message = "";
        }
        return new nx2(i2, message, "com.google.android.gms.ads", null, null);
    }

    public static void B(long j2, kz2 kz2Var, jg1[] jg1VarArr) {
        int i2;
        int iB;
        while (true) {
            if (kz2Var.B() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (kz2Var.B() == 0) {
                    i2 = -1;
                    break;
                }
                int iK = kz2Var.K();
                i3 += iK;
                if (iK != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            while (true) {
                if (kz2Var.B() == 0) {
                    i4 = -1;
                    break;
                }
                int iK2 = kz2Var.K();
                i4 += iK2;
                if (iK2 != 255) {
                    break;
                }
            }
            int i5 = kz2Var.b + i4;
            if (i4 == -1 || i4 > kz2Var.B()) {
                a30.x("Skipping remainder of malformed SEI NAL unit.");
                i5 = kz2Var.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iK3 = kz2Var.K();
                int iL = kz2Var.L();
                if (iL == 49) {
                    iB = kz2Var.b();
                    iL = 49;
                } else {
                    iB = 0;
                }
                int iK4 = kz2Var.K();
                if (iL == 47) {
                    kz2Var.G(1);
                    iL = 47;
                }
                boolean z = iK3 == 181 && (iL == 49 || iL == 47) && iK4 == 3;
                if (iL == 49) {
                    z &= iB == 1195456820;
                }
                if (z) {
                    L(j2, kz2Var, jg1VarArr);
                }
            }
            kz2Var.E(i5);
        }
    }

    public static void D(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean E() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static boolean F(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 != length) {
            char cCharAt = str.charAt(i2);
            int i3 = i2 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i2 = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i2 += 2;
            }
        }
        return true;
    }

    public static int G(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.zq H(defpackage.lg1 r10) {
        /*
            r0 = 16
            int r1 = r10.r(r0)
            int r0 = r10.r(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r10.r(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r10.r(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r10.r(r1)
            boolean r2 = r10.q()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r10.r(r2)
            boolean r5 = r10.q()
            if (r5 == 0) goto L47
            int r5 = r10.r(r4)
            if (r5 <= 0) goto L47
            r10.o(r1)
        L47:
            boolean r5 = r10.q()
            r6 = 48000(0xbb80, float:6.7262E-41)
            r7 = 44100(0xac44, float:6.1797E-41)
            r8 = 1
            if (r8 == r5) goto L56
            r5 = r7
            goto L57
        L56:
            r5 = r6
        L57:
            int r10 = r10.r(r3)
            int[] r9 = defpackage.zt0.j
            if (r5 != r7) goto L66
            r7 = 13
            if (r10 != r7) goto L66
            r10 = r9[r7]
            goto L94
        L66:
            r7 = 0
            if (r5 != r6) goto L93
            r6 = 14
            if (r10 >= r6) goto L93
            r6 = r9[r10]
            int r2 = r2 % 5
            r7 = 8
            if (r2 == r8) goto L8c
            r8 = 11
            if (r2 == r1) goto L87
            if (r2 == r4) goto L8c
            if (r2 == r3) goto L7e
            goto L91
        L7e:
            if (r10 == r4) goto L84
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
        L84:
            int r10 = r6 + 1
            goto L94
        L87:
            if (r10 == r7) goto L84
            if (r10 != r8) goto L91
            goto L84
        L8c:
            if (r10 == r4) goto L84
            if (r10 != r7) goto L91
            goto L84
        L91:
            r10 = r6
            goto L94
        L93:
            r10 = r7
        L94:
            zq r1 = new zq
            r2 = 0
            r1.<init>(r5, r0, r10, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.H(lg1):zq");
    }

    public static zt0 I(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new v94(cls.getSimpleName(), 0) : new v94(cls.getSimpleName(), 1);
    }

    public static nx2 J(Throwable th, e03 e03Var) {
        nx2 nx2Var;
        nx2 nx2VarA = A(th);
        int i2 = nx2VarA.f;
        if ((i2 == 3 || i2 == 0) && (nx2Var = nx2VarA.i) != null && !nx2Var.h.equals("com.google.android.gms.ads")) {
            nx2VarA.i = null;
        }
        if (e03Var != null) {
            nx2VarA.j = new rm2(e03Var.e, "", e03Var, e03Var.d, e03Var.c);
        }
        return nx2VarA;
    }

    public static b44 K(String str) throws IOException {
        try {
            return tu3.r0(new q44(new StringReader(str)));
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    public static void L(long j2, kz2 kz2Var, jg1[] jg1VarArr) {
        int iK = kz2Var.K();
        if ((iK & 64) != 0) {
            int i2 = iK & 31;
            kz2Var.G(1);
            int i3 = kz2Var.b;
            for (jg1 jg1Var : jg1VarArr) {
                int i4 = i2 * 3;
                kz2Var.E(i3);
                jg1Var.a(kz2Var, i4, 0);
                b0(j2 != -9223372036854775807L);
                jg1Var.c(j2, 1, i4, 0, null);
            }
        }
    }

    public static void M(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String[] N(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.N(java.lang.String, boolean):java.lang.String[]");
    }

    public static nx2 O(int i2, nx2 nx2Var) {
        if (i2 == 0) {
            throw null;
        }
        if (i2 == 8) {
            if (((Integer) tw1.e.c.a(mz1.U8)).intValue() > 0) {
                return nx2Var;
            }
            i2 = 8;
        }
        return Q(i2, null, nx2Var);
    }

    public static void P(int i2, kz2 kz2Var) {
        kz2Var.y(7);
        byte[] bArr = kz2Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static nx2 Q(int i2, String str, nx2 nx2Var) {
        String str2;
        int i3 = i2 - 1;
        if (str == null) {
            if (i2 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i3) {
                case 1:
                    str = "Invalid request.";
                    break;
                case 2:
                    break;
                case 3:
                    str = "App ID missing.";
                    break;
                case 4:
                    str = "Network error.";
                    break;
                case 5:
                    str = "Invalid request: Invalid ad unit ID.";
                    break;
                case 6:
                    str = "Invalid request: Invalid ad size.";
                    break;
                case 7:
                    str = "A mediation adapter failed to show the ad.";
                    break;
                case 8:
                    str = "The ad is not ready.";
                    break;
                case 9:
                    str = "The ad has already been shown.";
                    break;
                case 10:
                    str = "The ad can not be shown when app is not in foreground.";
                    break;
                case 11:
                default:
                    str = "Internal error.";
                    break;
                case 12:
                    if (((Integer) tw1.e.c.a(mz1.X8)).intValue() <= 0) {
                        str = "The mediation adapter did not return an ad.";
                        break;
                    }
                    break;
                case 13:
                    str = "Mismatch request IDs.";
                    break;
                case 14:
                    str = "Invalid ad string.";
                    break;
                case 15:
                    str = "Ad inspector had an internal error.";
                    break;
                case 16:
                    str = "Ad inspector failed to load.";
                    break;
                case 17:
                    str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                    break;
                case 18:
                    str = "Ad inspector cannot be opened because it is already open.";
                    break;
            }
        }
        String str3 = str;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 0;
        int i5 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i5 = i4;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i5 = 1;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 2:
            case 10:
            case 18:
                i5 = 3;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 3:
                i4 = 8;
                i5 = i4;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 4:
            case 8:
            case 17:
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 7:
                i4 = 4;
                i5 = i4;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 12:
                if (((Integer) tw1.e.c.a(mz1.X8)).intValue() <= 0) {
                    i4 = 9;
                    i5 = i4;
                    return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
                }
                i5 = 3;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 13:
                i4 = 10;
                i5 = i4;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            case 14:
                i4 = 11;
                i5 = i4;
                return new nx2(i5, str3, "com.google.android.gms.ads", nx2Var, null);
            default:
                switch (i2) {
                    case 1:
                        str2 = "INTERNAL_ERROR";
                        break;
                    case 2:
                        str2 = "INVALID_REQUEST";
                        break;
                    case 3:
                        str2 = "NO_FILL";
                        break;
                    case 4:
                        str2 = "APP_ID_MISSING";
                        break;
                    case 5:
                        str2 = "NETWORK_ERROR";
                        break;
                    case 6:
                        str2 = "INVALID_AD_UNIT_ID";
                        break;
                    case 7:
                        str2 = "INVALID_AD_SIZE";
                        break;
                    case 8:
                        str2 = "MEDIATION_SHOW_ERROR";
                        break;
                    case 9:
                        str2 = "NOT_READY";
                        break;
                    case 10:
                        str2 = "AD_REUSED";
                        break;
                    case 11:
                        str2 = "APP_NOT_FOREGROUND";
                        break;
                    case 12:
                        str2 = "INTERNAL_SHOW_ERROR";
                        break;
                    case 13:
                        str2 = "MEDIATION_NO_FILL";
                        break;
                    case 14:
                        str2 = "REQUEST_ID_MISMATCH";
                        break;
                    case 15:
                        str2 = "INVALID_AD_STRING";
                        break;
                    case 16:
                        str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                        break;
                    case 17:
                        str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                        break;
                    case 18:
                        str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                        break;
                    default:
                        str2 = "AD_INSPECTOR_ALREADY_OPEN";
                        break;
                }
                throw new AssertionError("Unknown SdkError: ".concat(str2));
        }
    }

    public static void R(int i2, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(qb1.J(str, Integer.valueOf(i2)));
        }
    }

    public static void S(lg1 lg1Var, ue1 ue1Var) throws lq1 {
        int iR = lg1Var.r(5);
        lg1Var.o(2);
        if (lg1Var.q()) {
            lg1Var.o(5);
        }
        if (iR >= 7 && iR <= 10) {
            lg1Var.m();
        }
        if (lg1Var.q()) {
            int iR2 = lg1Var.r(3);
            if (ue1Var.b == -1 && iR >= 0 && iR <= 15 && (iR2 == 0 || iR2 == 1)) {
                ue1Var.b = iR;
            }
            if (lg1Var.q()) {
                W(lg1Var);
            }
        }
    }

    public static int T(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static void U(lg1 lg1Var, ue1 ue1Var) throws lq1 {
        lg1Var.o(2);
        boolean zQ = lg1Var.q();
        int iR = lg1Var.r(8);
        for (int i2 = 0; i2 < iR; i2++) {
            lg1Var.o(2);
            if (lg1Var.q()) {
                lg1Var.o(5);
            }
            if (zQ) {
                lg1Var.o(24);
            } else {
                if (lg1Var.q()) {
                    if (!lg1Var.q()) {
                        lg1Var.o(4);
                    }
                    ue1Var.c = lg1Var.r(6) + 1;
                }
                lg1Var.o(4);
            }
        }
        if (lg1Var.q()) {
            lg1Var.o(3);
            if (lg1Var.q()) {
                W(lg1Var);
            }
        }
    }

    public static void V(boolean z, String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(qb1.J(str, Long.valueOf(j2)));
        }
    }

    public static void W(lg1 lg1Var) throws lq1 {
        int iR = lg1Var.r(6);
        if (iR < 2 || iR > 42) {
            throw lq1.b(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(iR)));
        }
        lg1Var.o(iR * 8);
    }

    public static void X(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(qb1.J(str, obj));
        }
    }

    public static int[] Y(dn3 dn3Var) {
        Object[] array = dn3Var.toArray(tm3.f);
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            obj.getClass();
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static List Z(int... iArr) {
        int length = iArr.length;
        return length == 0 ? Collections.EMPTY_LIST : new uo3(0, length, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Integer a0(java.lang.String r14) {
        /*
            r14.getClass()
            boolean r0 = r14.isEmpty()
            r1 = 0
            if (r0 == 0) goto Ld
        La:
            r14 = r1
            goto L7e
        Ld:
            r0 = 0
            char r2 = r14.charAt(r0)
            r3 = 45
            if (r2 != r3) goto L17
            r0 = 1
        L17:
            int r4 = r14.length()
            if (r0 != r4) goto L1e
            goto La
        L1e:
            int r4 = r0 + 1
            char r0 = r14.charAt(r0)
            r5 = -1
            r6 = 128(0x80, float:1.8E-43)
            if (r0 >= r6) goto L2e
            byte[] r7 = defpackage.vo3.a
            r0 = r7[r0]
            goto L31
        L2e:
            byte[] r0 = defpackage.vo3.a
            r0 = r5
        L31:
            if (r0 < 0) goto La
            r7 = 10
            if (r0 < r7) goto L38
            goto La
        L38:
            int r0 = -r0
            long r8 = (long) r0
        L3a:
            int r0 = r14.length()
            r10 = -9223372036854775808
            if (r4 >= r0) goto L6d
            int r0 = r4 + 1
            char r4 = r14.charAt(r4)
            if (r4 >= r6) goto L4f
            byte[] r12 = defpackage.vo3.a
            r4 = r12[r4]
            goto L52
        L4f:
            byte[] r4 = defpackage.vo3.a
            r4 = r5
        L52:
            if (r4 < 0) goto La
            if (r4 >= r7) goto La
            r12 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 >= 0) goto L60
            goto La
        L60:
            r12 = 10
            long r8 = r8 * r12
            long r12 = (long) r4
            long r10 = r10 + r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L6a
            goto La
        L6a:
            long r8 = r8 - r12
            r4 = r0
            goto L3a
        L6d:
            if (r2 != r3) goto L74
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            goto L7e
        L74:
            int r14 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r14 != 0) goto L79
            goto La
        L79:
            long r2 = -r8
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
        L7e:
            if (r14 == 0) goto L97
            long r2 = r14.longValue()
            int r0 = r14.intValue()
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L8e
            goto L97
        L8e:
            int r14 = r14.intValue()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            return r14
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.a0(java.lang.String):java.lang.Integer");
    }

    public static void b0(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void c0(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static void d0(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void e0(int i2, int i3) {
        String strJ;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strJ = qb1.J("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
                }
                strJ = qb1.J("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strJ);
        }
    }

    public static float f(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static void f0(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(h0("index", i2, i3));
        }
    }

    public static float g(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static void g0(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? h0("start index", i2, i4) : (i3 < 0 || i3 > i4) ? h0("end index", i3, i4) : qb1.J("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static boolean h(ok0[] ok0VarArr, ok0[] ok0VarArr2) {
        if (ok0VarArr == null || ok0VarArr2 == null || ok0VarArr.length != ok0VarArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < ok0VarArr.length; i2++) {
            ok0 ok0Var = ok0VarArr[i2];
            char c = ok0Var.a;
            ok0 ok0Var2 = ok0VarArr2[i2];
            if (c != ok0Var2.a || ok0Var.b.length != ok0Var2.b.length) {
                return false;
            }
        }
        return true;
    }

    public static String h0(String str, int i2, int i3) {
        if (i2 < 0) {
            return qb1.J("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return qb1.J("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException(ex0.j(new StringBuilder(String.valueOf(i3).length() + 15), "negative size: ", i3));
    }

    public static void i(qi qiVar, x60 x60Var, pi piVar) {
        piVar.o = -1;
        wh whVar = piVar.M;
        int[] iArr = piVar.p0;
        wh whVar2 = piVar.L;
        wh whVar3 = piVar.J;
        wh whVar4 = piVar.K;
        wh whVar5 = piVar.I;
        piVar.p = -1;
        int[] iArr2 = qiVar.p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = whVar5.g;
            int iQ = qiVar.q() - whVar4.g;
            whVar5.i = x60Var.k(whVar5);
            whVar4.i = x60Var.k(whVar4);
            x60Var.d(whVar5.i, i2);
            x60Var.d(whVar4.i, iQ);
            piVar.o = 2;
            piVar.Y = i2;
            int i3 = iQ - i2;
            piVar.U = i3;
            int i4 = piVar.b0;
            if (i3 < i4) {
                piVar.U = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = whVar3.g;
        int iK = qiVar.k() - whVar2.g;
        whVar3.i = x60Var.k(whVar3);
        whVar2.i = x60Var.k(whVar2);
        x60Var.d(whVar3.i, i5);
        x60Var.d(whVar2.i, iK);
        if (piVar.a0 > 0 || piVar.g0 == 8) {
            fx0 fx0VarK = x60Var.k(whVar);
            whVar.i = fx0VarK;
            x60Var.d(fx0VarK, piVar.a0 + i5);
        }
        piVar.p = 2;
        piVar.Z = i5;
        int i6 = iK - i5;
        piVar.V = i6;
        int i7 = piVar.c0;
        if (i6 < i7) {
            piVar.V = i7;
        }
    }

    public static float[] j(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ok0[] k(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.k(java.lang.String):ok0[]");
    }

    public static ok0[] l(ok0[] ok0VarArr) {
        ok0[] ok0VarArr2 = new ok0[ok0VarArr.length];
        for (int i2 = 0; i2 < ok0VarArr.length; i2++) {
            ok0VarArr2[i2] = new ok0(ok0VarArr[i2]);
        }
        return ok0VarArr2;
    }

    public static final boolean m(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static int n(float f2, int i2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float f4 = ((i3 >> 24) & 255) / 255.0f;
        float f5 = f(((i2 >> 16) & 255) / 255.0f);
        float f6 = f(((i2 >> 8) & 255) / 255.0f);
        float f7 = f((i2 & 255) / 255.0f);
        float f8 = f(((i3 >> 16) & 255) / 255.0f);
        float f9 = f(((i3 >> 8) & 255) / 255.0f);
        float f10 = f((i3 & 255) / 255.0f);
        float fD = ex0.d(f4, f3, f2, f3);
        float fD2 = ex0.d(f8, f5, f2, f5);
        float fD3 = ex0.d(f9, f6, f2, f6);
        float fD4 = ex0.d(f10, f7, f2, f7);
        float fG = g(fD2) * 255.0f;
        float fG2 = g(fD3) * 255.0f;
        return Math.round(g(fD4) * 255.0f) | (Math.round(fG) << 16) | (Math.round(fD * 255.0f) << 24) | (Math.round(fG2) << 8);
    }

    public static List o(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        i30.l(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void p(ok0[] ok0VarArr, Path path) {
        int i2;
        float[] fArr;
        int i3;
        ok0 ok0Var;
        int i4;
        char c;
        float f2;
        float f3;
        ok0 ok0Var2;
        boolean z;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        ok0[] ok0VarArr2 = ok0VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = ok0VarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            ok0 ok0Var3 = ok0VarArr2[i6];
            char c3 = ok0Var3.a;
            float[] fArr3 = ok0Var3.b;
            float f12 = fArr2[i5];
            float f13 = fArr2[1];
            float f14 = fArr2[2];
            float f15 = fArr2[3];
            float f16 = fArr2[4];
            int i7 = i5;
            float f17 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f16, f17);
                    f12 = f16;
                    f14 = f12;
                    f13 = f17;
                    f15 = f13;
                default:
                    i2 = 2;
                    break;
            }
            float f18 = f16;
            float f19 = f17;
            float f20 = f12;
            float f21 = f13;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i3 = i8;
                    ok0Var = ok0Var3;
                    float f22 = f20;
                    float f23 = f21;
                    i4 = i6;
                    c = c3;
                    int i9 = i3 + 5;
                    int i10 = i3 + 6;
                    ok0.a(path, f22, f23, fArr[i9], fArr[i10], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f ? 1 : i7, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f14 = fArr[i9];
                    f2 = fArr[i10];
                    f15 = f2;
                    f3 = f14;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    ok0Var = ok0Var3;
                    c = c3;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    int i13 = i3 + 4;
                    int i14 = i3 + 5;
                    path2.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                    float f24 = fArr[i13];
                    float f25 = fArr[i14];
                    f14 = fArr[i11];
                    f15 = fArr[i12];
                    f2 = f25;
                    f3 = f24;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i3 = i8;
                    ok0Var = ok0Var3;
                    c = c3;
                    f2 = f21;
                    i4 = i6;
                    path2.lineTo(fArr[i3], f2);
                    f3 = fArr[i3];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    ok0Var = ok0Var3;
                    c = c3;
                    int i15 = i3 + 1;
                    int i16 = i3 + 2;
                    int i17 = i3 + 3;
                    path2.quadTo(fArr[i3], fArr[i15], fArr[i16], fArr[i17]);
                    float f26 = fArr[i3];
                    float f27 = fArr[i15];
                    float f28 = fArr[i16];
                    float f29 = fArr[i17];
                    f14 = f26;
                    f15 = f27;
                    f3 = f28;
                    f2 = f29;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    ok0Var = ok0Var3;
                    f3 = f20;
                    c = c3;
                    path2.lineTo(f3, fArr[i3]);
                    f2 = fArr[i3];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i3 = i8;
                        int i18 = i3 + 2;
                        int i19 = i3 + 3;
                        int i20 = i3 + 4;
                        int i21 = i3 + 5;
                        path2.rCubicTo(fArr[i3], fArr[i3 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                        float f30 = fArr[i18] + f20;
                        float f31 = fArr[i19] + f21;
                        f20 += fArr[i20];
                        f21 += fArr[i21];
                        f14 = f30;
                        f15 = f31;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    int i22 = i3 + 1;
                                    path2.lineTo(fArr[i3], fArr[i22]);
                                    f3 = fArr[i3];
                                    f2 = fArr[i22];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    f3 = fArr[i3];
                                    f2 = fArr[i3 + 1];
                                    if (i3 > 0) {
                                        path2.lineTo(f3, f2);
                                    } else {
                                        path2.moveTo(f3, f2);
                                        f18 = f3;
                                        f19 = f2;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f20 = (f20 * 2.0f) - f14;
                                            f21 = (f21 * 2.0f) - f15;
                                        }
                                        int i23 = i3 + 1;
                                        path2.quadTo(f20, f21, fArr[i3], fArr[i23]);
                                        f3 = fArr[i3];
                                        f2 = fArr[i23];
                                        ok0Var = ok0Var3;
                                        f14 = f20;
                                        f15 = f21;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        int i24 = i3 + 1;
                                        path2.rLineTo(fArr[i3], fArr[i24]);
                                        f20 += fArr[i3];
                                        f7 = fArr[i24];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        float f32 = fArr[i3];
                                        f20 += f32;
                                        float f33 = fArr[i3 + 1];
                                        f21 += f33;
                                        if (i3 > 0) {
                                            path2.rLineTo(f32, f33);
                                        } else {
                                            path2.rMoveTo(f32, f33);
                                            ok0Var = ok0Var3;
                                            f3 = f20;
                                            f18 = f3;
                                            f2 = f21;
                                            f19 = f2;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr = fArr3;
                                            i3 = i8;
                                            ok0Var = ok0Var3;
                                            f3 = f20;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f10 = f20 - f14;
                                                f11 = f21 - f15;
                                            } else {
                                                f11 = 0.0f;
                                                f10 = 0.0f;
                                            }
                                            int i25 = i8 + 1;
                                            path2.rQuadTo(f10, f11, fArr3[i8], fArr3[i25]);
                                            float f34 = f10 + f20;
                                            float f35 = f11 + f21;
                                            float f36 = f20 + fArr3[i8];
                                            f21 += fArr3[i25];
                                            f15 = f35;
                                            fArr = fArr3;
                                            i3 = i8;
                                            ok0Var = ok0Var3;
                                            f3 = f36;
                                            f14 = f34;
                                        }
                                        f2 = f21;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f8 = f21 - f15;
                                            f9 = f20 - f14;
                                        } else {
                                            f9 = 0.0f;
                                            f8 = 0.0f;
                                        }
                                        int i26 = i8;
                                        int i27 = i26 + 1;
                                        int i28 = i26 + 2;
                                        int i29 = i26 + 3;
                                        fArr = fArr3;
                                        i3 = i26;
                                        path2.rCubicTo(f9, f8, fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                                        f4 = fArr[i3] + f20;
                                        f5 = fArr[i27] + f21;
                                        f20 += fArr[i28];
                                        f6 = fArr[i29];
                                    }
                                    i4 = i6;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i3 = i8;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f20 = (f20 * 2.0f) - f14;
                                        f21 = (f21 * 2.0f) - f15;
                                    }
                                    float f37 = f20;
                                    float f38 = f21;
                                    int i30 = i3 + 1;
                                    int i31 = i3 + 2;
                                    int i32 = i3 + 3;
                                    path2.cubicTo(f37, f38, fArr[i3], fArr[i30], fArr[i31], fArr[i32]);
                                    f14 = fArr[i3];
                                    f15 = fArr[i30];
                                    f3 = fArr[i31];
                                    f2 = fArr[i32];
                                }
                                i4 = i6;
                                ok0Var = ok0Var3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i3 = i8;
                                path2.rLineTo(0.0f, fArr[i3]);
                                f7 = fArr[i3];
                            }
                            f21 += f7;
                        } else {
                            fArr = fArr3;
                            i3 = i8;
                            int i33 = i3 + 1;
                            int i34 = i3 + 2;
                            int i35 = i3 + 3;
                            path2.rQuadTo(fArr[i3], fArr[i33], fArr[i34], fArr[i35]);
                            f4 = fArr[i3] + f20;
                            f5 = fArr[i33] + f21;
                            f20 += fArr[i34];
                            f6 = fArr[i35];
                        }
                        f21 += f6;
                        f14 = f4;
                        f15 = f5;
                    } else {
                        fArr = fArr3;
                        i3 = i8;
                        path2.rLineTo(fArr[i3], 0.0f);
                        f20 += fArr[i3];
                    }
                    ok0Var = ok0Var3;
                    f3 = f20;
                    f2 = f21;
                    i4 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i3 = i8;
                    int i36 = i3 + 5;
                    float f39 = fArr[i36] + f20;
                    int i37 = i3 + 6;
                    float f40 = fArr[i37] + f21;
                    float f41 = fArr[i3];
                    float f42 = fArr[i3 + 1];
                    float f43 = fArr[i3 + 2];
                    if (fArr[i3 + 3] != 0.0f) {
                        ok0Var2 = ok0Var3;
                        z = 1;
                    } else {
                        ok0Var2 = ok0Var3;
                        z = i7;
                    }
                    ok0Var = ok0Var2;
                    float f44 = f20;
                    c = c3;
                    float f45 = f21;
                    i4 = i6;
                    ok0.a(path, f44, f45, f39, f40, f41, f42, f43, z, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f3 = f44 + fArr[i36];
                    f2 = f45 + fArr[i37];
                    f14 = f3;
                    f15 = f2;
                }
                i8 = i3 + i2;
                path2 = path;
                ok0Var3 = ok0Var;
                c3 = c;
                i6 = i4;
                f20 = f3;
                f21 = f2;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f20;
            fArr2[1] = f21;
            fArr2[2] = f14;
            fArr2[3] = f15;
            fArr2[4] = f18;
            fArr2[5] = f19;
            c2 = ok0Var3.a;
            i6++;
            ok0VarArr2 = ok0VarArr;
            path2 = path;
            i5 = i7;
        }
    }

    public static void q(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static void r(xt0 xt0Var) {
        if (xt0Var.f != null || xt0Var.g != null) {
            throw new IllegalArgumentException();
        }
        if (xt0Var.d) {
            return;
        }
        synchronized (zt0.class) {
            try {
                long j2 = g + 8192;
                if (j2 > 65536) {
                    return;
                }
                g = j2;
                xt0Var.f = f;
                xt0Var.c = 0;
                xt0Var.b = 0;
                f = xt0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void s(Drawable drawable, int i2) {
        sp.g(drawable, i2);
    }

    public static void t(Drawable drawable, ColorStateList colorStateList) {
        sp.h(drawable, colorStateList);
    }

    public static void u(Drawable drawable, PorterDuff.Mode mode) {
        sp.i(drawable, mode);
    }

    public static final long v(String str, long j2, long j3, long j4) {
        String property;
        Long lValueOf;
        boolean z;
        int i2;
        int i3;
        int i4 = wz0.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        int length = property.length();
        if (length == 0) {
            lValueOf = null;
            break;
        }
        int i5 = 0;
        char cCharAt = property.charAt(0);
        long j5 = -9223372036854775807L;
        if (cCharAt < '0') {
            z = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z = false;
                    i5 = 1;
                } else if (cCharAt == '-') {
                    j5 = Long.MIN_VALUE;
                    i5 = 1;
                }
            }
            lValueOf = null;
            break;
        }
        z = false;
        long j6 = 0;
        long j7 = -256204778801521550L;
        while (i5 < length) {
            int iDigit = Character.digit((int) property.charAt(i5), 10);
            if (iDigit >= 0) {
                if (j6 >= j7) {
                    i2 = length;
                    i3 = i5;
                } else if (j7 == -256204778801521550L) {
                    i2 = length;
                    i3 = i5;
                    j7 = j5 / 10;
                    if (j6 < j7) {
                    }
                }
                long j8 = j6 * 10;
                long j9 = iDigit;
                if (j8 >= j5 + j9) {
                    j6 = j8 - j9;
                    i5 = i3 + 1;
                    length = i2;
                }
            }
            lValueOf = null;
            break;
        }
        lValueOf = z ? Long.valueOf(j6) : Long.valueOf(-j6);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sb = new StringBuilder("System property '");
        sb.append(str);
        sb.append("' should be in range ");
        sb.append(j3);
        ex0.p(sb, "..", j4, ", but is '");
        sb.append(jLongValue);
        sb.append('\'');
        throw new IllegalStateException(sb.toString().toString());
    }

    public static int w(String str, int i2, int i3) {
        return (int) v(str, i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static xt0 x() {
        synchronized (zt0.class) {
            try {
                xt0 xt0Var = f;
                if (xt0Var == null) {
                    return new xt0();
                }
                f = xt0Var.f;
                xt0Var.f = null;
                g -= 8192;
                return xt0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int y(long j2) {
        int i2 = (int) j2;
        V(((long) i2) == j2, "Out of range: %s", j2);
        return i2;
    }

    public static int z(String str) throws UnsupportedEncodingException {
        byte[] bytes;
        int i2;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        int length = bytes.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = length & (-4);
            if (i3 >= i2) {
                break;
            }
            int i5 = ((bytes[i3] & 255) | ((bytes[i3 + 1] & 255) << 8) | ((bytes[i3 + 2] & 255) << 16) | (bytes[i3 + 3] << 24)) * (-862048943);
            int i6 = i4 ^ (((i5 >>> 17) | (i5 << 15)) * 461845907);
            i4 = (((i6 >>> 19) | (i6 << 13)) * 5) - 430675100;
            i3 += 4;
        }
        int i7 = length & 3;
        if (i7 == 1) {
            int i8 = ((bytes[i2] & 255) | i) * (-862048943);
            i4 ^= ((i8 >>> 17) | (i8 << 15)) * 461845907;
        } else {
            if (i7 != 2) {
                i = i7 == 3 ? (bytes[i2 + 2] & 255) << 16 : 0;
            }
            i |= (bytes[i2 + 1] & 255) << 8;
            int i82 = ((bytes[i2] & 255) | i) * (-862048943);
            i4 ^= ((i82 >>> 17) | (i82 << 15)) * 461845907;
        }
        int i9 = i4 ^ length;
        int i10 = (i9 ^ (i9 >>> 16)) * (-2048144789);
        int i11 = (i10 ^ (i10 >>> 13)) * (-1028477387);
        return i11 ^ (i11 >>> 16);
    }

    public abstract void C(String str);

    @Override // defpackage.y61
    public void c() {
    }

    @Override // defpackage.y61
    public void e() {
    }
}
