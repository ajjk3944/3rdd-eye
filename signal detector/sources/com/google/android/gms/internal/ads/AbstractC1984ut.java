package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import f4.InterfaceFutureC2326a;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.math.RoundingMode;
import java.security.GeneralSecurityException;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import q2.C2841s;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.ut, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1984ut {

    /* renamed from: a, reason: collision with root package name */
    public static String f17186a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C2852x0 A(int i, String str, C2852x0 c2852x0) {
        String str2;
        int i3 = i - 1;
        if (str == null) {
            if (i == 0) {
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
                    if (((Integer) C2841s.f23267e.f23270c.a(H9.u9)).intValue() <= 0) {
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
        if (i == 0) {
            throw null;
        }
        int i6 = 0;
        int i7 = 2;
        switch (i3) {
            case 0:
            case 11:
            case 15:
                i7 = i6;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i7 = 1;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 2:
            case 10:
            case 18:
                i7 = 3;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 3:
                i6 = 8;
                i7 = i6;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 4:
            case 8:
            case 17:
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 7:
                i6 = 4;
                i7 = i6;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 12:
                if (((Integer) C2841s.f23267e.f23270c.a(H9.u9)).intValue() <= 0) {
                    i6 = 9;
                    i7 = i6;
                    return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
                }
                i7 = 3;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 13:
                i6 = 10;
                i7 = i6;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            case 14:
                i6 = 11;
                i7 = i6;
                return new C2852x0(i7, str3, "com.google.android.gms.ads", c2852x0, null);
            default:
                switch (i) {
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

    public static TD B(InterfaceC1682pD interfaceC1682pD, Executor executor) {
        TD td = new TD();
        td.f11359h = new SD(td, interfaceC1682pD);
        executor.execute(td);
        return td;
    }

    public static PC C(InterfaceFutureC2326a interfaceFutureC2326a, Class cls, NA na, Executor executor) {
        int i = QC.f10587k;
        PC pc = new PC(interfaceFutureC2326a, cls, na);
        interfaceFutureC2326a.a(pc, C1476lN.D(executor, pc));
        return pc;
    }

    public static OC D(InterfaceFutureC2326a interfaceFutureC2326a, Class cls, InterfaceC1736qD interfaceC1736qD, Executor executor) {
        int i = QC.f10587k;
        OC oc = new OC(interfaceFutureC2326a, cls, interfaceC1736qD);
        interfaceFutureC2326a.a(oc, C1476lN.D(executor, oc));
        return oc;
    }

    public static InterfaceFutureC2326a E(InterfaceFutureC2326a interfaceFutureC2326a, long j6, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (interfaceFutureC2326a.isDone()) {
            return interfaceFutureC2326a;
        }
        RD rd = new RD();
        rd.f10872h = interfaceFutureC2326a;
        Fu fu = new Fu();
        fu.f8219b = rd;
        rd.i = scheduledExecutorService.schedule(fu, j6, timeUnit);
        interfaceFutureC2326a.a(fu, EnumC2059wD.f17407a);
        return rd;
    }

    public static C1306iD F(InterfaceFutureC2326a interfaceFutureC2326a, InterfaceC1736qD interfaceC1736qD, Executor executor) {
        int i = AbstractRunnableC1412kD.f15074j;
        C1306iD c1306iD = new C1306iD(interfaceFutureC2326a, interfaceC1736qD);
        interfaceFutureC2326a.a(c1306iD, C1476lN.D(executor, c1306iD));
        return c1306iD;
    }

    public static C1358jD G(InterfaceFutureC2326a interfaceFutureC2326a, NA na, Executor executor) {
        int i = AbstractRunnableC1412kD.f15074j;
        C1358jD c1358jD = new C1358jD(interfaceFutureC2326a, na);
        interfaceFutureC2326a.a(c1358jD, C1476lN.D(executor, c1358jD));
        return c1358jD;
    }

    public static Object H(Future future) {
        if (future.isDone()) {
            return AbstractC0582Jp.d(future);
        }
        throw new IllegalStateException(Cr.E("Future was expected to be done: %s", future));
    }

    public static Object I(C0657Of c0657Of) {
        try {
            return AbstractC0582Jp.d(c0657Of);
        } catch (ExecutionException e6) {
            if (e6.getCause() instanceof Error) {
                throw new C2113xD((Error) e6.getCause());
            }
            throw new J0.c(e6.getCause());
        }
    }

    public static int a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static C2041vw b(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new WD(new ByteArrayInputStream(str.getBytes(WD.f12187b))).a().b();
                try {
                    XK xk = XK.f12412a;
                    int i = JK.f9277a;
                    C1257hI c1257hIE = C1257hI.E(bArrB, XK.f12413b);
                    for (C1203gI c1203gI : c1257hIE.B()) {
                        if (c1203gI.B().C() == 1 || c1203gI.B().C() == 2 || c1203gI.B().C() == 3) {
                            switch (c1203gI.B().C()) {
                                case 1:
                                    str2 = "UNKNOWN_KEYMATERIAL";
                                    break;
                                case 2:
                                    str2 = "SYMMETRIC";
                                    break;
                                case 3:
                                    str2 = "ASYMMETRIC_PRIVATE";
                                    break;
                                case 4:
                                    str2 = "ASYMMETRIC_PUBLIC";
                                    break;
                                case 5:
                                    str2 = "REMOTE";
                                    break;
                                case 6:
                                    str2 = "UNRECOGNIZED";
                                    break;
                                default:
                                    throw null;
                            }
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + c1203gI.B().A());
                        }
                    }
                    return C2041vw.b(c1257hIE);
                } catch (C1636oL unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (C1636oL unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static Vw c(Context context, EnumC1945u7 enumC1945u7, String str, String str2, Cw cw) {
        Vw vw;
        Fw fw = new Fw(context, enumC1945u7, str, str2, cw);
        try {
            vw = (Vw) fw.f8232e.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            fw.b(2009, fw.f8235h, e6);
            vw = null;
        }
        fw.b(3004, fw.f8235h, null);
        if (vw != null) {
            if (vw.f12114c == 7) {
                Cw.f7697e = 3;
            } else {
                Cw.f7697e = 2;
            }
        }
        return vw == null ? new Vw() : vw;
    }

    public static ZA d(ZA za) {
        return ((za instanceof C0923bB) || (za instanceof C0868aB)) ? za : za instanceof Serializable ? new C0868aB(za) : new C0923bB(za);
    }

    public static ED e(Object obj) {
        return obj == null ? ED.f7928b : new ED(obj);
    }

    public static CF f() throws GeneralSecurityException {
        try {
            CF cf = AbstractC1413kE.f15076a;
            if (AbstractC2061wF.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return AbstractC1413kE.f15076a;
        } catch (GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5 A[EDGE_INSN: B:66:0x00c5->B:44:0x00c5 BREAK  A[LOOP:1: B:29:0x0094->B:67:0x0094]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(android.content.Context r10) {
        /*
            java.lang.String r0 = com.google.android.gms.internal.ads.AbstractC1984ut.f17186a
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r0 = r10.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r2 = "android.intent.action.VIEW"
            java.lang.String r3 = "https://www.example.com"
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r1.<init>(r2, r3)
            r2 = 0
            android.content.pm.ResolveInfo r3 = r0.resolveActivity(r1, r2)
            r4 = 0
            if (r3 == 0) goto L23
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            java.lang.String r3 = r3.packageName
            goto L24
        L23:
            r3 = r4
        L24:
            java.util.List r5 = r0.queryIntentActivities(r1, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L5c
            java.lang.Object r7 = r5.next()
            android.content.pm.ResolveInfo r7 = (android.content.pm.ResolveInfo) r7
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
            java.lang.String r9 = "android.support.customtabs.action.CustomTabsService"
            r8.setAction(r9)
            android.content.pm.ActivityInfo r9 = r7.activityInfo
            java.lang.String r9 = r9.packageName
            r8.setPackage(r9)
            android.content.pm.ResolveInfo r8 = r0.resolveService(r8, r2)
            if (r8 == 0) goto L31
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            java.lang.String r7 = r7.packageName
            r6.add(r7)
            goto L31
        L5c:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L66
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r4
            goto Le5
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r10
            goto Le5
        L77:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lc5
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.RuntimeException -> Lb5
            r0 = 64
            java.util.List r10 = r10.queryIntentActivities(r1, r0)     // Catch: java.lang.RuntimeException -> Lb5
            if (r10 == 0) goto Lbc
            int r0 = r10.size()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 != 0) goto L90
            goto Lbc
        L90:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.RuntimeException -> Lb5
        L94:
            boolean r0 = r10.hasNext()     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r10.next()     // Catch: java.lang.RuntimeException -> Lb5
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch: java.lang.RuntimeException -> Lb5
            android.content.IntentFilter r1 = r0.filter     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            int r2 = r1.countDataAuthorities()     // Catch: java.lang.RuntimeException -> Lb5
            if (r2 == 0) goto L94
            int r1 = r1.countDataPaths()     // Catch: java.lang.RuntimeException -> Lb5
            if (r1 == 0) goto L94
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch: java.lang.RuntimeException -> Lb5
            if (r0 == 0) goto L94
            goto Lc5
        Lb5:
            java.lang.String r10 = "CustomTabsHelper"
            java.lang.String r0 = "Runtime exception while getting specialized handlers"
            android.util.Log.e(r10, r0)
        Lbc:
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto Lc5
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r3
            goto Le5
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld0
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r10
            goto Le5
        Ld0:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ldb
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r10
            goto Le5
        Ldb:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le5
            com.google.android.gms.internal.ads.AbstractC1984ut.f17186a = r10
        Le5:
            java.lang.String r10 = com.google.android.gms.internal.ads.AbstractC1984ut.f17186a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.AbstractC1984ut.g(android.content.Context):java.lang.String");
    }

    public static Date h(long j6) {
        return new Date((j6 - 2082844800) * 1000);
    }

    public static C2852x0 i(Throwable th) {
        if (th instanceof C1174fq) {
            C1174fq c1174fq = (C1174fq) th;
            return x(c1174fq.f12707a, c1174fq.f14157b);
        }
        if (th instanceof C0836Yo) {
            return th.getMessage() == null ? A(((C0836Yo) th).f12707a, null, null) : A(((C0836Yo) th).f12707a, th.getMessage(), null);
        }
        if (!(th instanceof t2.n)) {
            return A(1, null, null);
        }
        t2.n nVar = (t2.n) th;
        int i = nVar.f23639a;
        String message = nVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new C2852x0(i, message, "com.google.android.gms.ads", null, null);
    }

    public static void k(int i, Object[] objArr) {
        for (int i3 = 0; i3 < i; i3++) {
            u(i3, objArr[i3]);
        }
    }

    public static void l(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void m(AtomicReference atomicReference, InterfaceC1930tt interfaceC1930tt) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            interfaceC1930tt.b(obj);
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        } catch (NullPointerException e7) {
            u2.k.i("NullPointerException occurs when invoking a method from a delegating listener.", e7);
        }
    }

    public static boolean n(String str) {
        int length = str.length();
        int i = 0;
        while (i != length) {
            char cCharAt = str.charAt(i);
            int i3 = i + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i = i3;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i3 == length || !Character.isLowSurrogate(str.charAt(i3))) {
                    return false;
                }
                i += 2;
            }
        }
        return true;
    }

    public static byte[] o(String str) {
        if ((str.length() & 1) != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i3 = i + i;
            int iDigit = Character.digit(str.charAt(i3), 16);
            int iDigit2 = Character.digit(str.charAt(i3 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static long[] p(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i = (int) length;
        AbstractC0582Jp.W("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        long[] jArr3 = new long[i];
        int i3 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i3, length2);
            i3 += length2;
        }
        return jArr3;
    }

    public static int q(int i, int i3) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i3 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i3;
        int i7 = i - (i3 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i ^ i3) >> 31) | 1;
        switch (IC.f9081a[roundingMode.ordinal()]) {
            case 1:
                AbstractC0582Jp.z(false);
                return i6;
            case 2:
                return i6;
            case 3:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i7);
                int iAbs2 = iAbs - (Math.abs(i3) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i6;
                }
                if (iAbs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static int r(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    public static AbstractC1527mK s(String str) throws IOException {
        try {
            return DF.J(new CK(new StringReader(str)));
        } catch (NumberFormatException e6) {
            throw new IOException(e6);
        }
    }

    public static C2852x0 t(Throwable th, C1228gq c1228gq) {
        C2852x0 c2852x0;
        C2852x0 c2852x0I = i(th);
        int i = c2852x0I.f23273a;
        if ((i == 3 || i == 0) && (c2852x0 = c2852x0I.f23276d) != null && !c2852x0.f23275c.equals("com.google.android.gms.ads")) {
            c2852x0I.f23276d = null;
        }
        if (c1228gq != null) {
            c2852x0I.f23277e = new BinderC1168fk(c1228gq.f14384e, "", c1228gq, c1228gq.f14383d, c1228gq.f14382c);
        }
        return c2852x0I;
    }

    public static void u(int i, Object obj) {
        if (obj == null) {
            throw new NullPointerException(A.f.i(i, "at index ", new StringBuilder(String.valueOf(i).length() + 9)));
        }
    }

    public static byte[] v(String str, boolean z6) {
        C2058wC c2058wC;
        if (z6) {
            c2058wC = C2166yC.f17692e;
            if (c2058wC.f17695b != null) {
                c2058wC = new C2058wC(c2058wC.f17694a, (Character) null);
            }
        } else {
            c2058wC = C2166yC.f17691d;
        }
        byte[] bArrH = c2058wC.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static DD w(Throwable th) {
        th.getClass();
        DD dd = new DD();
        dd.e(th);
        return dd;
    }

    public static C2852x0 x(int i, C2852x0 c2852x0) {
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            if (((Integer) C2841s.f23267e.f23270c.a(H9.r9)).intValue() > 0) {
                return c2852x0;
            }
            i = 8;
        }
        return A(i, null, c2852x0);
    }

    public static final void y(StringBuilder sb, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public static TD z(Callable callable, Executor executor) {
        TD td = new TD(callable);
        executor.execute(td);
        return td;
    }

    public abstract void j(int i, int i3, byte[] bArr);
}
