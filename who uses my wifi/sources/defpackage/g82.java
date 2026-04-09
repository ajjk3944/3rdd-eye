package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class g82 implements of1 {
    public static final String[] f = {"standard", "accelerate", "decelerate", "linear"};
    public static final pz g = new pz(29);
    public static final ts0 h = new ts0();
    public static final us0 i = new us0();
    public static final int[] j = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final rv1 k = new rv1(28);
    public static final zq2 l = new zq2(19);
    public static final p63 m = new p63(9);
    public static final int[] n = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public static long o;
    public static Method p;
    public static final /* synthetic */ int q = 0;

    public static String A(p34 p34Var) throws GeneralSecurityException {
        int iOrdinal = p34Var.ordinal();
        if (iOrdinal == 0) {
            return "SHA-1";
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(p34Var.toString()));
    }

    public static boolean B(JSONArray jSONArray, String str) {
        if (jSONArray != null && str != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String strOptString = jSONArray.optString(i2);
                try {
                } catch (PatternSyntaxException e) {
                    hg4.C.h.d("RtbAdapterMap.hasAtleastOneRegexMatch", e);
                }
                if ((((Boolean) tw1.e.c.a(mz1.Jb)).booleanValue() ? Pattern.compile(strOptString, 2) : Pattern.compile(strOptString)).matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final ResolveInfo C(Intent intent, ArrayList arrayList, Context context) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i2++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th) {
            hg4.C.h.d("OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent", th);
            return resolveInfo;
        }
    }

    public static gg1 D(mf1 mf1Var, boolean z, boolean z2) {
        gg1 gg1Var;
        long j2;
        kz2 kz2Var;
        int i2;
        int i3;
        long j3;
        int i4;
        int i5;
        int[] iArr;
        long jP = mf1Var.p();
        long j4 = -1;
        long j5 = 4096;
        if (jP != -1 && jP <= 4096) {
            j5 = jP;
        }
        kz2 kz2Var2 = new kz2(64);
        int i6 = (int) j5;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            kz2Var2.y(8);
            if (!mf1Var.B(kz2Var2.a, i7, 8, true)) {
                break;
            }
            long jP2 = kz2Var2.P();
            int iB = kz2Var2.b();
            if (jP2 == 1) {
                j2 = j4;
                mf1Var.u(kz2Var2.a, 8, 8);
                i2 = 16;
                kz2Var2.C(16);
                jP2 = kz2Var2.d();
                kz2Var = kz2Var2;
            } else {
                j2 = j4;
                if (jP2 == 0) {
                    long jP3 = mf1Var.p();
                    if (jP3 != j2) {
                        jP2 = (jP3 - mf1Var.n()) + 8;
                    }
                }
                kz2Var = kz2Var2;
                i2 = 8;
            }
            long j6 = jP2;
            gg1Var = null;
            long j7 = i2;
            if (j6 < j7) {
                i3 = 1;
                if (iB == 1718773093) {
                    if (i2 == 8) {
                        j6 = 8;
                        iB = 1718773093;
                    } else {
                        iB = 1718773093;
                    }
                }
                return new xi1(iB, j6, i2);
            }
            i3 = 1;
            i8 += i2;
            if (iB == 1836019574) {
                i6 += (int) j6;
                if (jP != -1 && i6 > jP) {
                    i6 = (int) jP;
                }
                kz2Var2 = kz2Var;
                j4 = j2;
                i7 = 0;
            } else {
                if (iB == 1953653099 || iB == 1835297121 || iB == 1835626086) {
                    j3 = jP;
                    i4 = 0;
                } else {
                    if (iB == 1836019558 || iB == 1836475768) {
                        i7 = i3;
                        break;
                    }
                    i9 |= (iB == 1835295092 ? 0 : i3) ^ 1;
                    if (iB == 1937007212) {
                        if (j6 > 1000000) {
                            i7 = 0;
                            break;
                        }
                        iB = 1937007212;
                    }
                    j3 = jP;
                    if ((i8 + j6) - j7 >= i6) {
                        i7 = 0;
                        break;
                    }
                    int i10 = (int) (j6 - j7);
                    i8 += i10;
                    if (iB != 1718909296) {
                        i4 = 0;
                        if (i10 != 0) {
                            mf1Var.A(i10);
                        }
                    } else {
                        if (i10 < 8) {
                            return new xi1(1718909296, i10, 8);
                        }
                        kz2Var.y(i10);
                        i4 = 0;
                        mf1Var.u(kz2Var.a, 0, i10);
                        int iB2 = kz2Var.b();
                        int i11 = (G(iB2, z2) ? 1 : 0) | i9;
                        kz2Var.G(4);
                        int iB3 = kz2Var.B() / 4;
                        if (i11 == 0 && iB3 > 0) {
                            iArr = new int[iB3];
                            int i12 = 0;
                            while (true) {
                                if (i12 >= iB3) {
                                    i5 = i11;
                                    break;
                                }
                                int iB4 = kz2Var.b();
                                iArr[i12] = iB4;
                                if (G(iB4, z2)) {
                                    i5 = i3;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            i5 = i11;
                            iArr = null;
                        }
                        if (i5 == 0) {
                            return new t3(iB2, 7, iArr);
                        }
                        i9 = i5;
                    }
                }
                i7 = i4;
                kz2Var2 = kz2Var;
                jP = j3;
                j4 = j2;
            }
        }
        gg1Var = null;
        return i9 == 0 ? pz.n : z != i7 ? i7 != 0 ? kj1.h : kj1.i : gg1Var;
    }

    public static final Intent E(Intent intent, ResolveInfo resolveInfo) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }

    public static Executor F(final Executor executor, final eq3 eq3Var) {
        executor.getClass();
        return executor == dq3.f ? executor : new Executor() { // from class: rq3
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    eq3Var.e(e);
                }
            }
        };
    }

    public static boolean G(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579) {
            if (z) {
                return true;
            }
            i2 = 1751476579;
        }
        for (int i3 = 0; i3 < 29; i3++) {
            if (j[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long e(InputStream inputStream, OutputStream outputStream, boolean z) {
        byte[] bArr = new byte[1024];
        long j2 = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, 1024);
                if (i2 == -1) {
                    break;
                }
                j2 += i2;
                outputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                if (z) {
                    c(inputStream);
                    c(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            c(inputStream);
            c(outputStream);
        }
        return j2;
    }

    public static final qs0 f(mf0 mf0Var) {
        LinkedHashMap linkedHashMap = mf0Var.a;
        at0 at0Var = (at0) linkedHashMap.get(g);
        if (at0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        r61 r61Var = (r61) linkedHashMap.get(h);
        if (r61Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(i);
        String str = (String) linkedHashMap.get(ug0.h);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        ys0 ys0VarH = at0Var.a().h();
        Bundle bundle2 = null;
        vs0 vs0Var = ys0VarH instanceof vs0 ? (vs0) ys0VarH : null;
        if (vs0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = i(r61Var).b;
        qs0 qs0Var = (qs0) linkedHashMap2.get(str);
        if (qs0Var != null) {
            return qs0Var;
        }
        vs0Var.b();
        Bundle bundle3 = vs0Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = uk2.b((gk0[]) Arrays.copyOf(new gk0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                vs0Var.c = null;
            }
            bundle2 = bundle4;
        }
        qs0 qs0VarF = wl2.f(bundle2, bundle);
        linkedHashMap2.put(str, qs0VarF);
        return qs0VarF;
    }

    public static final void g(at0 at0Var) {
        u50 u50Var = at0Var.e().c;
        if (u50Var != u50.g && u50Var != u50.h) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (at0Var.a().h() == null) {
            vs0 vs0Var = new vs0(at0Var.a(), (r61) at0Var);
            at0Var.a().q("androidx.lifecycle.internal.SavedStateHandlesProvider", vs0Var);
            at0Var.e().a(new un0(4, vs0Var));
        }
    }

    public static final ws0 i(r61 r61Var) {
        ss0 ss0Var = new ss0();
        wk wkVarC = r61Var instanceof k00 ? ((k00) r61Var).c() : vk.b;
        i30.m(wkVarC, "extras");
        q61 q61VarD = r61Var.d();
        i30.m(q61VarD, "store");
        return (ws0) new p21(q61VarD, ss0Var, wkVarC).r(dp0.a(ws0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static int j(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(ex0.f("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    public static boolean l() {
        try {
            if (p == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (p == null) {
                o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                p = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) p.invoke(null, Long.valueOf(o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static float m(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static hk n(fk fkVar, gk gkVar) {
        i30.m(gkVar, "key");
        return i30.c(fkVar.getKey(), gkVar) ? ls.f : fkVar;
    }

    public static String s(int i2, String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (i3 < str.length()) {
            sb.append("\t");
            int i4 = i3 + i2;
            if (i4 >= str.length()) {
                sb.append(str.substring(i3));
                if (z) {
                    sb.append(" )");
                }
            } else {
                sb.append((CharSequence) str, i3, i4);
                sb.append("\n");
            }
            i3 = i4;
        }
        return sb.toString();
    }

    public static int u(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static String v(JSONObject jSONObject, String str, String str2) {
        JSONArray jSONArrayOptJSONArray;
        if (jSONObject != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("including");
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("excluding");
                    if (B(jSONArrayOptJSONArray2, str) && !B(jSONArrayOptJSONArray3, str)) {
                        return jSONObjectOptJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static qr1 w(Context context, String str, String str2) {
        qr1 qr1Var;
        try {
            qr1Var = (qr1) ((LinkedBlockingQueue) new g4(context, str, str2).i).poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            qr1Var = null;
        }
        return qr1Var == null ? g4.k() : qr1Var;
    }

    public static int x(Object obj) {
        return u(obj == null ? 0 : obj.hashCode());
    }

    public static int y(boolean z) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        List supportedPerformancePoints;
        try {
            gg4 gg4Var = new gg4();
            gg4Var.e("video/avc");
            ph4 ph4Var = new ph4(gg4Var);
            if (ph4Var.m != null) {
                sn3 sn3VarB = og4.b(hd4.g, ph4Var, z, false);
                for (int i2 = 0; i2 < sn3VarB.i; i2++) {
                    if (((bg4) sn3VarB.get(i2)).d != null && (videoCapabilities = ((bg4) sn3VarB.get(i2)).d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        i71.j();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointC = i71.c();
                        for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                            if (i71.d(supportedPerformancePoints.get(i3)).covers(performancePointC)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (mg4 unused) {
        }
        return 0;
    }

    public static long z(kz2 kz2Var, int i2, int i3) {
        kz2Var.E(i2);
        if (kz2Var.B() < 5) {
            return -9223372036854775807L;
        }
        int iB = kz2Var.b();
        if ((8388608 & iB) != 0 || ((iB >> 8) & 8191) != i3 || (iB & 32) == 0 || kz2Var.K() < 7 || kz2Var.B() < 7 || (kz2Var.K() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        kz2Var.H(bArr, 0, 6);
        long j2 = bArr[0];
        long j3 = bArr[1];
        long j4 = bArr[2];
        long j5 = bArr[3] & 255;
        return ((j2 & 255) << 25) | ((j3 & 255) << 17) | ((j4 & 255) << 9) | (j5 + j5) | ((bArr[4] & 255) >> 7);
    }

    public void b(int i2) {
        new Handler(Looper.getMainLooper()).post(new ma0(this, i2, 1));
    }

    public abstract InputFilter[] h(InputFilter[] inputFilterArr);

    public abstract boolean k();

    public abstract void o(int i2);

    public abstract void p(Typeface typeface);

    public abstract void q(boolean z);

    public abstract void r(boolean z);

    public abstract TransformationMethod t(TransformationMethod transformationMethod);
}
