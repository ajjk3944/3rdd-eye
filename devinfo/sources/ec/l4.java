package ec;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import com.applovin.sdk.AppLovinEventTypes;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class l4 extends v1 {
    public static final String[] j = {"firebase_", "google_", "ga_"};

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f22875k = {"_err"};

    /* renamed from: d, reason: collision with root package name */
    public SecureRandom f22876d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f22877e;

    /* renamed from: f, reason: collision with root package name */
    public int f22878f;
    public n5.a g;

    /* renamed from: h, reason: collision with root package name */
    public Boolean f22879h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f22880i;

    public l4(o1 o1Var) {
        super(o1Var);
        this.f22880i = null;
        this.f22877e = new AtomicLong(0L);
    }

    public static boolean A0(String str) {
        pb.y.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String G(boolean z3, int i4, String str) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i4) {
            return str;
        }
        if (z3) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i4))).concat("...");
        }
        return null;
    }

    public static boolean K0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void R(k4 k4Var, String str, int i4, String str2, String str3, int i10) {
        Bundle bundle = new Bundle();
        v0(i4, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong("_el", i10);
        }
        k4Var.M(str, "_err", bundle);
    }

    public static MessageDigest S() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long T(byte[] bArr) {
        pb.y.h(bArr);
        int length = bArr.length;
        int i4 = 0;
        pb.y.k(length > 0);
        long j8 = 0;
        for (int i10 = length - 1; i10 >= 0 && i10 >= bArr.length - 8; i10--) {
            j8 += (bArr[i10] & 255) << i4;
            i4 += 8;
        }
        return j8;
    }

    public static boolean U(Context context) {
        pb.y.h(context);
        return Build.VERSION.SDK_INT >= 24 ? V(context, "com.google.android.gms.measurement.AppMeasurementJobService") : V(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public static boolean V(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int W() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public static boolean Y(String str) {
        String str2 = (String) d0.f22663s0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean a0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean b0(String str, String[] strArr) {
        pb.y.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] g0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public static ArrayList r0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", eVar.f22688a);
            bundle.putString("origin", eVar.f22689b);
            bundle.putLong("creation_timestamp", eVar.f22691d);
            bundle.putString("name", eVar.f22690c.f22800b);
            Object objA = eVar.f22690c.a();
            pb.y.h(objA);
            b2.c(bundle, objA);
            bundle.putBoolean("active", eVar.f22692e);
            String str = eVar.f22693f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            u uVar = eVar.g;
            if (uVar != null) {
                bundle.putString("timed_out_event_name", uVar.f23085a);
                t tVar = uVar.f23086b;
                if (tVar != null) {
                    bundle.putBundle("timed_out_event_params", tVar.f());
                }
            }
            bundle.putLong("trigger_timeout", eVar.f22694h);
            u uVar2 = eVar.f22695i;
            if (uVar2 != null) {
                bundle.putString("triggered_event_name", uVar2.f23085a);
                t tVar2 = uVar2.f23086b;
                if (tVar2 != null) {
                    bundle.putBundle("triggered_event_params", tVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", eVar.f22690c.f22801c);
            bundle.putLong("time_to_live", eVar.j);
            u uVar3 = eVar.f22696k;
            if (uVar3 != null) {
                bundle.putString("expired_event_name", uVar3.f23085a);
                t tVar3 = uVar3.f23086b;
                if (tVar3 != null) {
                    bundle.putBundle("expired_event_params", tVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean s0(Context context) {
        ActivityInfo receiverInfo;
        pb.y.h(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void t0(y2 y2Var, Bundle bundle, boolean z3) {
        if (bundle != null && y2Var != null) {
            if (!bundle.containsKey("_sc") || z3) {
                String str = y2Var.f23204a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = y2Var.f23205b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", y2Var.f23206c);
                return;
            }
            z3 = false;
        }
        if (bundle != null && y2Var == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean v0(int i4, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i4);
        return true;
    }

    public final Bundle B0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString(AppLovinEventTypes.USER_VIEWED_CONTENT, queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            for (String str2 : uri.getQueryParameterNames()) {
                if (str2.startsWith("gad_")) {
                    String queryParameter19 = uri.getQueryParameter(str2);
                    if (!TextUtils.isEmpty(queryParameter19)) {
                        bundle.putString(str2, queryParameter19);
                    }
                }
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    @Override // ec.v1
    public final boolean C() {
        return true;
    }

    public final boolean C0(String str, String str2) {
        o1 o1Var = (o1) this.f218b;
        if (str2 == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23055i.e(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23055i.e(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            s0 s0Var3 = o1Var.f22954f;
            o1.m(s0Var3);
            s0Var3.f23055i.f(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = o1Var.f22954f;
                o1.m(s0Var4);
                s0Var4.f23055i.f(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean D0(String str, String str2) {
        o1 o1Var = (o1) this.f218b;
        if (str2 == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23055i.e(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.f23055i.e(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                s0 s0Var3 = o1Var.f22954f;
                o1.m(s0Var3);
                s0Var3.f23055i.f(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                s0 s0Var4 = o1Var.f22954f;
                o1.m(s0Var4);
                s0Var4.f23055i.f(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean E0(String str, String[] strArr, String[] strArr2, String str2) {
        o1 o1Var = (o1) this.f218b;
        if (str2 == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23055i.e(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i4 = 0; i4 < 3; i4++) {
            if (str2.startsWith(j[i4])) {
                s0 s0Var2 = o1Var.f22954f;
                o1.m(s0Var2);
                s0Var2.f23055i.f(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !b0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && b0(str2, strArr2)) {
            return true;
        }
        s0 s0Var3 = o1Var.f22954f;
        o1.m(s0Var3);
        s0Var3.f23055i.f(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean F(String str) {
        o1 o1Var = (o1) this.f218b;
        if (TextUtils.isEmpty(str)) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23055i.d("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        pb.y.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        s0 s0Var2 = o1Var.f22954f;
        o1.m(s0Var2);
        s0Var2.f23055i.e(s0.J(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final boolean F0(int i4, String str, String str2) {
        o1 o1Var = (o1) this.f218b;
        if (str2 == null) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23055i.e(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i4) {
            return true;
        }
        s0 s0Var2 = o1Var.f22954f;
        o1.m(s0Var2);
        s0Var2.f23055i.g("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i4), str2);
        return false;
    }

    public final int G0(String str) {
        if (!D0("event", str)) {
            return 2;
        }
        if (!E0("event", b2.f22578a, b2.f22579b, str)) {
            return 13;
        }
        ((o1) this.f218b).getClass();
        return !F0(40, "event", str) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int H(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.l4.H(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int H0(String str) {
        if (!D0("user property", str)) {
            return 6;
        }
        if (!E0("user property", b2.f22585i, null, str)) {
            return 15;
        }
        ((o1) this.f218b).getClass();
        return !F0(24, "user property", str) ? 6 : 0;
    }

    public final Object I(Object obj, String str) {
        o1 o1Var = (o1) this.f218b;
        int iMax = 500;
        if ("_ev".equals(str)) {
            o1Var.f22952d.getClass();
            return w0(Math.max(500, 256), obj, true, true);
        }
        if (a0(str)) {
            o1Var.f22952d.getClass();
            iMax = Math.max(500, 256);
        } else {
            o1Var.f22952d.getClass();
        }
        return w0(iMax, obj, false, true);
    }

    public final int I0(String str) {
        if (!C0("event param", str)) {
            return 3;
        }
        if (!E0("event param", null, null, str)) {
            return 14;
        }
        ((o1) this.f218b).getClass();
        return !F0(40, "event param", str) ? 3 : 0;
    }

    public final Bundle J(String str, Bundle bundle, List list, boolean z3) {
        int iI0;
        String str2;
        List list2 = list;
        boolean zB0 = b0(str, b2.f22581d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        o1 o1Var = (o1) this.f218b;
        g gVar = o1Var.f22952d;
        o0 o0Var = o1Var.j;
        l4 l4Var = ((o1) gVar.f218b).f22956i;
        o1.k(l4Var);
        int i4 = l4Var.h0(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iI0 = !z3 ? I0(str4) : 0;
                if (iI0 == 0) {
                    iI0 = J0(str4);
                }
            } else {
                iI0 = 0;
            }
            if (iI0 != 0) {
                N(bundle2, iI0, str4, iI0 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int iH = H(str, str4, bundle.get(str4), bundle2, list2, z3, zB0);
                if (iH == 17) {
                    N(bundle2, 17, str4, Boolean.FALSE);
                } else if (iH != 0 && !"_ev".equals(str4)) {
                    N(bundle2, iH, iH == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (A0(str4)) {
                    i10++;
                    if (i10 > i4) {
                        if (o1Var.f22952d.L(str3, d0.f22633f1) && z10) {
                            str2 = str3;
                        } else {
                            String strV = je.u.v(new StringBuilder(String.valueOf(i4).length() + 37), "Event can't contain more than ", i4, " params");
                            s0 s0Var = o1Var.f22954f;
                            o1.m(s0Var);
                            str2 = str3;
                            s0Var.f23055i.f(o0Var.a(str), o0Var.e(bundle), strV);
                        }
                        v0(5, bundle2);
                        bundle2.remove(str4);
                        z10 = true;
                        list2 = list;
                        str3 = str2;
                    } else {
                        list2 = list;
                    }
                }
            }
            str2 = str3;
            list2 = list;
            str3 = str2;
        }
        return bundle2;
    }

    public final int J0(String str) {
        if (!D0("event param", str)) {
            return 3;
        }
        if (!E0("event param", null, null, str)) {
            return 14;
        }
        ((o1) this.f218b).getClass();
        return !F0(40, "event param", str) ? 3 : 0;
    }

    public final void K(t0 t0Var, int i4) {
        Bundle bundle = (Bundle) t0Var.f23072e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (A0(str) && (i10 = i10 + 1) > i4) {
                o1 o1Var = (o1) this.f218b;
                g gVar = o1Var.f22952d;
                o0 o0Var = o1Var.j;
                if (!gVar.L(null, d0.f22633f1) || !z3) {
                    String strV = je.u.v(new StringBuilder(String.valueOf(i4).length() + 37), "Event can't contain more than ", i4, " params");
                    s0 s0Var = o1Var.f22954f;
                    o1.m(s0Var);
                    s0Var.f23055i.f(o0Var.a((String) t0Var.f23070c), o0Var.e(bundle), strV);
                    v0(5, bundle);
                }
                bundle.remove(str);
                z3 = true;
            }
        }
    }

    public final void L(Parcelable[] parcelableArr, int i4) {
        pb.y.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i10 = 0;
            boolean z3 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (A0(str) && !b0(str, b2.f22584h) && (i10 = i10 + 1) > i4) {
                    o1 o1Var = (o1) this.f218b;
                    g gVar = o1Var.f22952d;
                    o0 o0Var = o1Var.j;
                    if (!gVar.L(null, d0.f22633f1) || !z3) {
                        s0 s0Var = o1Var.f22954f;
                        o1.m(s0Var);
                        s0Var.f23055i.f(o0Var.b(str), o0Var.e(bundle), je.u.v(new StringBuilder(String.valueOf(i4).length() + 60), "Param can't contain more than ", i4, " item-scoped custom parameters"));
                    }
                    v0(28, bundle);
                    bundle.remove(str);
                    z3 = true;
                }
            }
        }
    }

    public final boolean L0(String str, int i4, String str2, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i4) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.f23057l.g("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final void M(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                l4 l4Var = ((o1) this.f218b).f22956i;
                o1.k(l4Var);
                l4Var.Q(str, bundle2.get(str), bundle);
            }
        }
    }

    public final void M0(String str, String str2, Bundle bundle, List list, boolean z3) {
        int iI0;
        String str3;
        int iH;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        o1 o1Var = (o1) this.f218b;
        g gVar = o1Var.f22952d;
        s0 s0Var = o1Var.f22954f;
        o0 o0Var = o1Var.j;
        l4 l4Var = ((o1) gVar.f218b).f22956i;
        o1.k(l4Var);
        int i4 = true != l4Var.h0(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i10 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iI0 = !z3 ? I0(str4) : 0;
                if (iI0 == 0) {
                    iI0 = J0(str4);
                }
            } else {
                iI0 = 0;
            }
            if (iI0 != 0) {
                N(bundle, iI0, str4, iI0 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (K0(bundle.get(str4))) {
                    o1.m(s0Var);
                    s0Var.f23057l.g("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iH = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    iH = H(str, str4, bundle.get(str4), bundle, list2, z3, false);
                }
                if (iH != 0 && !"_ev".equals(str4)) {
                    N(bundle, iH, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (A0(str4) && !b0(str4, b2.f22584h)) {
                    int i11 = i10 + 1;
                    if (!h0(231100000)) {
                        o1.m(s0Var);
                        s0Var.f23055i.f(o0Var.a(str), o0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        v0(23, bundle);
                        bundle.remove(str4);
                    } else if (i11 > i4) {
                        if (!o1Var.f22952d.L(str3, d0.f22633f1) || !z10) {
                            o1.m(s0Var);
                            s0Var.f23055i.f(o0Var.a(str), o0Var.e(bundle), je.u.v(new StringBuilder(String.valueOf(i4).length() + 55), "Item can't contain more than ", i4, " item-scoped custom params"));
                        }
                        v0(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i10 = i11;
                        z10 = true;
                    }
                    list2 = list;
                    i10 = i11;
                }
            }
            list2 = list;
        }
    }

    public final void N(Bundle bundle, int i4, String str, Object obj) {
        if (v0(i4, bundle)) {
            ((o1) this.f218b).getClass();
            bundle.putString("_ev", G(true, 40, str));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int O(Object obj, String str) {
        return "_ldl".equals(str) ? L0("user property referrer", x0(str), str, obj) : L0("user property", x0(str), str, obj) ? 0 : 7;
    }

    public final Object P(Object obj, String str) {
        return "_ldl".equals(str) ? w0(x0(str), obj, true, false) : w0(x0(str), obj, false, false);
    }

    public final void Q(String str, Object obj, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
            return;
        }
        if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            o1 o1Var = (o1) this.f218b;
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.f23057l.f(o1Var.j.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long X() {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.l4.X():long");
    }

    public final boolean Z(String str) {
        B();
        o1 o1Var = (o1) this.f218b;
        if (((Context) ub.b.a(o1Var.f22949a).f27058a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        s0 s0Var = o1Var.f22954f;
        o1.m(s0Var);
        s0Var.f23059n.e(str, "Permission not granted");
        return false;
    }

    public final boolean c0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((o1) this.f218b).f22952d.F("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle d0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objI = I(bundle.get(str), str);
                if (objI == null) {
                    o1 o1Var = (o1) this.f218b;
                    s0 s0Var = o1Var.f22954f;
                    o1.m(s0Var);
                    s0Var.f23057l.e(o1Var.j.b(str), "Param value can't be null");
                } else {
                    Q(str, objI, bundle2);
                }
            }
        }
        return bundle2;
    }

    public final u e0(String str, Bundle bundle, String str2, long j8, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (G0(str) != 0) {
            o1 o1Var = (o1) this.f218b;
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(o1Var.j.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleJ = J(str, bundle2, Collections.singletonList("_o"), true);
        if (z3) {
            bundleJ = d0(bundleJ);
        }
        pb.y.h(bundleJ);
        return new u(str, new t(bundleJ), str2, j8);
    }

    public final boolean f0(Context context, String str) {
        Signature[] signatureArr;
        o1 o1Var = (o1) this.f218b;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoE = ub.b.a(context).e(64, str);
            if (packageInfoE == null || (signatureArr = packageInfoE.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e2) {
            s0 s0Var = o1Var.f22954f;
            o1.m(s0Var);
            s0Var.g.e(e2, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            s0 s0Var2 = o1Var.f22954f;
            o1.m(s0Var2);
            s0Var2.g.e(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean h0(int i4) {
        Boolean bool = ((o1) this.f218b).p().f22820f;
        if (i0() < i4 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int i0() {
        if (this.f22880i == null) {
            o1 o1Var = (o1) this.f218b;
            nb.f fVar = nb.f.f29899b;
            Context context = o1Var.f22949a;
            fVar.getClass();
            this.f22880i = Integer.valueOf(nb.f.a(context) / 1000);
        }
        return this.f22880i.intValue();
    }

    public final void j0(Bundle bundle, long j8) {
        long j9 = bundle.getLong("_et");
        if (j9 != 0) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(Long.valueOf(j9), "Params already contained engagement");
        } else {
            j9 = 0;
        }
        bundle.putLong("_et", j8 + j9);
    }

    public final void k0(String str, com.google.android.gms.internal.measurement.l0 l0Var) {
        try {
            l0Var.X2(r5.c.g("r", str));
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning string value to wrapper");
        }
    }

    public final void l0(com.google.android.gms.internal.measurement.l0 l0Var, long j8) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j8);
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning long value to wrapper");
        }
    }

    public final void m0(com.google.android.gms.internal.measurement.l0 l0Var, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i4);
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning int value to wrapper");
        }
    }

    public final void n0(com.google.android.gms.internal.measurement.l0 l0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning byte array to wrapper");
        }
    }

    public final void o0(com.google.android.gms.internal.measurement.l0 l0Var, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning boolean value to wrapper");
        }
    }

    public final void p0(com.google.android.gms.internal.measurement.l0 l0Var, Bundle bundle) {
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning bundle value to wrapper");
        }
    }

    public final void q0(com.google.android.gms.internal.measurement.l0 l0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            l0Var.X2(bundle);
        } catch (RemoteException e2) {
            s0 s0Var = ((o1) this.f218b).f22954f;
            o1.m(s0Var);
            s0Var.j.e(e2, "Error returning bundle list to wrapper");
        }
    }

    public final String u0() {
        byte[] bArr = new byte[16];
        z0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object w0(int i4, Object obj, boolean z3, boolean z10) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return G(z3, i4, obj.toString());
        }
        if (!z10) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleD0 = d0((Bundle) parcelable);
                if (!bundleD0.isEmpty()) {
                    arrayList.add(bundleD0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int x0(String str) {
        o1 o1Var = (o1) this.f218b;
        if ("_ldl".equals(str)) {
            o1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            o1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            o1Var.getClass();
            return 100;
        }
        o1Var.getClass();
        return 36;
    }

    public final long y0() {
        long andIncrement;
        long j8;
        AtomicLong atomicLong = this.f22877e;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f22877e;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((o1) this.f218b).f22957k.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i4 = this.f22878f + 1;
            this.f22878f = i4;
            j8 = jNextLong + i4;
        }
        return j8;
    }

    public final SecureRandom z0() {
        B();
        if (this.f22876d == null) {
            this.f22876d = new SecureRandom();
        }
        return this.f22876d;
    }
}
