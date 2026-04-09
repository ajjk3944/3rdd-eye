package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.ads.AdError;
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
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class yo0 {

    /* renamed from: a, reason: collision with root package name */
    public static String f18814a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static va.w1 A(int i4, String str, va.w1 w1Var) {
        String str2;
        int i10 = i4 - 1;
        if (str == null) {
            if (i4 == 0) {
                throw null;
            }
            str = "No fill.";
            switch (i10) {
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
                    if (((Integer) va.s.f36163e.f36166c.a(sk.f16386w9)).intValue() <= 0) {
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
        if (i4 == 0) {
            throw null;
        }
        int i11 = 0;
        int i12 = 2;
        switch (i10) {
            case 0:
            case 11:
            case 15:
                i12 = i11;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 1:
            case 5:
            case 6:
            case 9:
            case 16:
                i12 = 1;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 2:
            case 10:
            case 18:
                i12 = 3;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 3:
                i11 = 8;
                i12 = i11;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 4:
            case 8:
            case 17:
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 7:
                i11 = 4;
                i12 = i11;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 12:
                if (((Integer) va.s.f36163e.f36166c.a(sk.f16386w9)).intValue() <= 0) {
                    i11 = 9;
                    i12 = i11;
                    return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
                }
                i12 = 3;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 13:
                i11 = 10;
                i12 = i11;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            case 14:
                i11 = 11;
                i12 = i11;
                return new va.w1(i12, str3, "com.google.android.gms.ads", w1Var, null);
            default:
                switch (i4) {
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

    public static h91 B(d81 d81Var, Executor executor) {
        h91 h91Var = new h91();
        h91Var.f11779h = new g91(h91Var, d81Var);
        executor.execute(h91Var);
        return h91Var;
    }

    public static d71 C(vd.b bVar, Class cls, z21 z21Var, Executor executor) {
        int i4 = e71.f10718k;
        d71 d71Var = new d71(bVar, cls, z21Var);
        bVar.a(d71Var, yr1.C(executor, d71Var));
        return d71Var;
    }

    public static c71 D(vd.b bVar, Class cls, e81 e81Var, Executor executor) {
        int i4 = e71.f10718k;
        c71 c71Var = new c71(bVar, cls, e81Var);
        bVar.a(c71Var, yr1.C(executor, c71Var));
        return c71Var;
    }

    public static vd.b E(vd.b bVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (bVar.isDone()) {
            return bVar;
        }
        f91 f91Var = new f91();
        f91Var.f11072h = bVar;
        du0 du0Var = new du0();
        du0Var.f10552b = f91Var;
        f91Var.f11073i = scheduledExecutorService.schedule(du0Var, j, timeUnit);
        bVar.a(du0Var, k81.f13081a);
        return f91Var;
    }

    public static w71 F(vd.b bVar, e81 e81Var, Executor executor) {
        int i4 = y71.j;
        w71 w71Var = new w71(e81Var, bVar);
        bVar.a(w71Var, yr1.C(executor, w71Var));
        return w71Var;
    }

    public static x71 G(vd.b bVar, z21 z21Var, Executor executor) {
        int i4 = y71.j;
        x71 x71Var = new x71(z21Var, bVar);
        bVar.a(x71Var, yr1.C(executor, x71Var));
        return x71Var;
    }

    public static Object H(Future future) {
        if (future.isDone()) {
            return mq0.d(future);
        }
        throw new IllegalStateException(al0.H("Future was expected to be done: %s", future));
    }

    public static Object I(gx gxVar) {
        try {
            return mq0.d(gxVar);
        } catch (ExecutionException e2) {
            if (e2.getCause() instanceof Error) {
                throw new l81((Error) e2.getCause());
            }
            throw new ac.m(e2.getCause());
        }
    }

    public static int a(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * (-862048943)), 15) * 461845907);
    }

    public static av0 b(String str) throws GeneralSecurityException {
        String str2;
        try {
            try {
                byte[] bArrB = new k91(new ByteArrayInputStream(str.getBytes(k91.f13088b))).a().b();
                try {
                    jn1 jn1Var = jn1.f12801a;
                    int i4 = um1.f17262a;
                    vh1 vh1VarE = vh1.E(bArrB, jn1.f12802b);
                    for (uh1 uh1Var : vh1VarE.B()) {
                        if (uh1Var.B().C() == 1 || uh1Var.B().C() == 2 || uh1Var.B().C() == 3) {
                            switch (uh1Var.B().C()) {
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
                            throw new GeneralSecurityException("keyset contains key material of type " + str2 + " for type url " + uh1Var.B().A());
                        }
                    }
                    return av0.a(vh1VarE);
                } catch (ao1 unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (ao1 unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static zv0 c(Context context, fg fgVar, String str, String str2, gv0 gv0Var) {
        zv0 zv0Var;
        a0.u uVar = new a0.u(context, fgVar, str, str2, gv0Var);
        try {
            zv0Var = (zv0) ((LinkedBlockingQueue) uVar.f137f).poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            uVar.b(AdError.INTERSTITIAL_AD_TIMEOUT, uVar.f132a, e2);
            zv0Var = null;
        }
        uVar.b(3004, uVar.f132a, null);
        if (zv0Var != null) {
            if (zv0Var.f19191c == 7) {
                gv0.f11611e = 3;
            } else {
                gv0.f11611e = 2;
            }
        }
        return zv0Var == null ? new zv0() : zv0Var;
    }

    public static l31 d(l31 l31Var) {
        return ((l31Var instanceof n31) || (l31Var instanceof m31)) ? l31Var : l31Var instanceof Serializable ? new m31(l31Var) : new n31(l31Var);
    }

    public static s81 e(Object obj) {
        return obj == null ? s81.f15906b : new s81(obj);
    }

    public static pc1 f() throws GeneralSecurityException {
        try {
            pc1 pc1Var = y91.f18685a;
            if (jc1.a()) {
                throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
            }
            return y91.f18685a;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
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
            java.lang.String r0 = com.google.android.gms.internal.ads.yo0.f18814a
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
            com.google.android.gms.internal.ads.yo0.f18814a = r4
            goto Le5
        L66:
            int r0 = r6.size()
            r4 = 1
            if (r0 != r4) goto L77
            java.lang.Object r10 = r6.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            com.google.android.gms.internal.ads.yo0.f18814a = r10
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
            com.google.android.gms.internal.ads.yo0.f18814a = r3
            goto Le5
        Lc5:
            java.lang.String r10 = "com.android.chrome"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ld0
            com.google.android.gms.internal.ads.yo0.f18814a = r10
            goto Le5
        Ld0:
            java.lang.String r10 = "com.chrome.beta"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Ldb
            com.google.android.gms.internal.ads.yo0.f18814a = r10
            goto Le5
        Ldb:
            java.lang.String r10 = "com.chrome.dev"
            boolean r0 = r6.contains(r10)
            if (r0 == 0) goto Le5
            com.google.android.gms.internal.ads.yo0.f18814a = r10
        Le5:
            java.lang.String r10 = com.google.android.gms.internal.ads.yo0.f18814a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yo0.g(android.content.Context):java.lang.String");
    }

    public static Date h(long j) {
        return new Date((j - 2082844800) * 1000);
    }

    public static va.w1 i(Throwable th2) {
        if (th2 instanceof di0) {
            di0 di0Var = (di0) th2;
            return x(di0Var.f17198a, di0Var.f10486b);
        }
        if (th2 instanceof uf0) {
            return th2.getMessage() == null ? A(((uf0) th2).f17198a, null, null) : A(((uf0) th2).f17198a, th2.getMessage(), null);
        }
        if (!(th2 instanceof ya.k)) {
            return A(1, null, null);
        }
        ya.k kVar = (ya.k) th2;
        int i4 = kVar.f37468a;
        String message = kVar.getMessage();
        if (message == null) {
            message = "";
        }
        return new va.w1(i4, message, "com.google.android.gms.ads", null, null);
    }

    public static void k(String str, Exception exc) {
        Log.e("OMIDLIB", str, exc);
    }

    public static void l(AtomicReference atomicReference, xo0 xo0Var) {
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            xo0Var.c(obj);
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        } catch (NullPointerException e10) {
            za.i.i("NullPointerException occurs when invoking a method from a delegating listener.", e10);
        }
    }

    public static void m(Object[] objArr, int i4) {
        for (int i10 = 0; i10 < i4; i10++) {
            u(i10, objArr[i10]);
        }
    }

    public static boolean n(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 != length) {
            char cCharAt = str.charAt(i4);
            int i10 = i4 + 1;
            if (!Character.isSurrogate(cCharAt)) {
                i4 = i10;
            } else {
                if (Character.isLowSurrogate(cCharAt) || i10 == length || !Character.isLowSurrogate(str.charAt(i10))) {
                    return false;
                }
                i4 += 2;
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
        for (int i4 = 0; i4 < length; i4++) {
            int i10 = i4 + i4;
            int iDigit = Character.digit(str.charAt(i10), 16);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i4] = (byte) ((iDigit * 16) + iDigit2);
        }
        return bArr;
    }

    public static long[] p(long[]... jArr) {
        long length = 0;
        for (long[] jArr2 : jArr) {
            length += jArr2.length;
        }
        int i4 = (int) length;
        mq0.U("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i4));
        long[] jArr3 = new long[i4];
        int i10 = 0;
        for (long[] jArr4 : jArr) {
            int length2 = jArr4.length;
            System.arraycopy(jArr4, 0, jArr3, i10, length2);
            i10 += length2;
        }
        return jArr3;
    }

    public static int q(int i4, int i10) {
        RoundingMode roundingMode = RoundingMode.CEILING;
        roundingMode.getClass();
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i4 / i10;
        int i12 = i4 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i4 ^ i10) >> 31) | 1;
        switch (w61.f17921a[roundingMode.ordinal()]) {
            case 1:
                mq0.z(false);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                    RoundingMode roundingMode3 = RoundingMode.HALF_EVEN;
                    return i11;
                }
                if (iAbs2 <= 0) {
                    return i11;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int r(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    public static zl1 s(String str) throws IOException {
        try {
            return qc1.J(new om1(new StringReader(str)));
        } catch (NumberFormatException e2) {
            throw new IOException(e2);
        }
    }

    public static va.w1 t(Throwable th2, ei0 ei0Var) {
        va.w1 w1Var;
        va.w1 w1VarI = i(th2);
        int i4 = w1VarI.f36177a;
        if ((i4 == 3 || i4 == 0) && (w1Var = w1VarI.f36180d) != null && !w1Var.f36179c.equals("com.google.android.gms.ads")) {
            w1VarI.f36180d = null;
        }
        if (ei0Var != null) {
            w1VarI.f36181e = new c60(ei0Var.f10805e, "", ei0Var, ei0Var.f10804d, ei0Var.f10803c);
        }
        return w1VarI;
    }

    public static void u(int i4, Object obj) {
        if (obj == null) {
            throw new NullPointerException(d.h.q(i4, "at index ", new StringBuilder(String.valueOf(i4).length() + 9)));
        }
    }

    public static byte[] v(String str, boolean z3) {
        k61 k61Var;
        if (z3) {
            k61Var = m61.f13778e;
            if (k61Var.f13781b != null) {
                k61Var = new k61(k61Var.f13780a, (Character) null);
            }
        } else {
            k61Var = m61.f13777d;
        }
        byte[] bArrH = k61Var.h(str);
        if (bArrH.length != 0 || str.length() <= 0) {
            return bArrH;
        }
        throw new IllegalArgumentException("Unable to decode ".concat(str));
    }

    public static r81 w(Throwable th2) {
        th2.getClass();
        r81 r81Var = new r81();
        r81Var.f(th2);
        return r81Var;
    }

    public static va.w1 x(int i4, va.w1 w1Var) {
        if (i4 == 0) {
            throw null;
        }
        if (i4 == 8) {
            if (((Integer) va.s.f36163e.f36166c.a(sk.f16340t9)).intValue() > 0) {
                return w1Var;
            }
            i4 = 8;
        }
        return A(i4, null, w1Var);
    }

    public static final void y(StringBuilder sb2, Iterator it, String str) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb2.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb2.append((CharSequence) str);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb2.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    public static h91 z(Executor executor, Callable callable) {
        h91 h91Var = new h91(callable);
        executor.execute(h91Var);
        return h91Var;
    }

    public abstract void j(int i4, int i10, byte[] bArr);
}
