package zc;

import android.adservices.measurement.MeasurementManager;
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
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
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
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class s3 extends j1 {
    public static final String[] F = {"firebase_", "google_", "ga_"};
    public static final String[] G = {"_err"};
    public d7.a B;
    public Boolean D;
    public Integer E;

    /* renamed from: r, reason: collision with root package name */
    public SecureRandom f27145r;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicLong f27146x;

    /* renamed from: y, reason: collision with root package name */
    public int f27147y;

    public s3(c1 c1Var) {
        super(c1Var);
        this.E = null;
        this.f27146x = new AtomicLong(0L);
    }

    public static boolean A2(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public static void I1(y9.u uVar, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        l2(i10, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        uVar.h(str, "_err", bundle);
    }

    public static MessageDigest J1() throws NoSuchAlgorithmException {
        MessageDigest messageDigest;
        for (int i10 = 0; i10 < 2; i10++) {
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

    public static long K1(byte[] bArr) {
        cc.s.h(bArr);
        int length = bArr.length;
        if (length <= 0) {
            throw new IllegalStateException();
        }
        int i10 = 0;
        long j = 0;
        for (int i11 = length - 1; i11 >= 0 && i11 >= bArr.length - 8; i11--) {
            j += (bArr[i11] & 255) << i10;
            i10 += 8;
        }
        return j;
    }

    public static boolean L1(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean O1(String str) {
        String str2 = (String) u.f27205r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static boolean Q1(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean R1(String str, String[] strArr) {
        cc.s.h(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] W1(Parcelable parcelable) {
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

    public static ArrayList h2(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzah zzahVar = (zzah) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", zzahVar.f5397a);
            bundle.putString("origin", zzahVar.f5398d);
            bundle.putLong("creation_timestamp", zzahVar.f5400r);
            bundle.putString("name", zzahVar.f5399g.f5421d);
            Object objD = zzahVar.f5399g.d();
            cc.s.h(objD);
            p1.c(bundle, objD);
            bundle.putBoolean("active", zzahVar.f5401x);
            String str = zzahVar.f5402y;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            zzbg zzbgVar = zzahVar.B;
            if (zzbgVar != null) {
                bundle.putString("timed_out_event_name", zzbgVar.f5405a);
                zzbe zzbeVar = zzbgVar.f5406d;
                if (zzbeVar != null) {
                    bundle.putBundle("timed_out_event_params", zzbeVar.j());
                }
            }
            bundle.putLong("trigger_timeout", zzahVar.D);
            zzbg zzbgVar2 = zzahVar.E;
            if (zzbgVar2 != null) {
                bundle.putString("triggered_event_name", zzbgVar2.f5405a);
                zzbe zzbeVar2 = zzbgVar2.f5406d;
                if (zzbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", zzbeVar2.j());
                }
            }
            bundle.putLong("triggered_timestamp", zzahVar.f5399g.f5422g);
            bundle.putLong("time_to_live", zzahVar.F);
            zzbg zzbgVar3 = zzahVar.G;
            if (zzbgVar3 != null) {
                bundle.putString("expired_event_name", zzbgVar3.f5405a);
                zzbe zzbeVar3 = zzbgVar3.f5406d;
                if (zzbeVar3 != null) {
                    bundle.putBundle("expired_event_params", zzbeVar3.j());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean i2(Context context) {
        ActivityInfo receiverInfo;
        cc.s.h(context);
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

    public static void j2(l2 l2Var, Bundle bundle, boolean z10) {
        if (bundle != null && l2Var != null) {
            if (!bundle.containsKey("_sc") || z10) {
                String str = l2Var.f26993a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = l2Var.f26994b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", l2Var.f26995c);
                return;
            }
            z10 = false;
        }
        if (bundle != null && l2Var == null && z10) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static final boolean l2(int i10, Bundle bundle) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    public static boolean q2(String str) {
        cc.s.e(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static String x1(String str, int i10, boolean z10) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) <= i10) {
                return str;
            }
            if (z10) {
                return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i10))).concat("...");
            }
        }
        return null;
    }

    public final Bundle A1(String str, Bundle bundle, List list, boolean z10) {
        int iY2;
        String str2;
        List list2 = list;
        boolean zR1 = R1(str, p1.f27078d);
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        c1 c1Var = (c1) this.f1504d;
        f fVar = c1Var.f26887r;
        f0 f0Var = c1Var.F;
        s3 s3Var = ((c1) fVar.f1504d).E;
        c1.e(s3Var);
        int i10 = s3Var.X1(201500000) ? 100 : 25;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iY2 = !z10 ? y2(str4) : 0;
                if (iY2 == 0) {
                    iY2 = z2(str4);
                }
            } else {
                iY2 = 0;
            }
            if (iY2 != 0) {
                E1(bundle2, iY2, str4, iY2 == 3 ? str4 : str3);
                bundle2.remove(str4);
            } else {
                int iY1 = y1(str, str4, bundle.get(str4), bundle2, list2, z10, zR1);
                if (iY1 == 17) {
                    E1(bundle2, 17, str4, Boolean.FALSE);
                } else if (iY1 != 0 && !"_ev".equals(str4)) {
                    E1(bundle2, iY1, iY1 == 21 ? str : str4, bundle.get(str4));
                    bundle2.remove(str4);
                }
                if (q2(str4)) {
                    i11++;
                    if (i11 > i10) {
                        if (c1Var.f26887r.C1(str3, u.f27175e1) && z11) {
                            str2 = str3;
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                            sb2.append("Event can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" params");
                            String string = sb2.toString();
                            j0 j0Var = c1Var.f26889y;
                            c1.g(j0Var);
                            str2 = str3;
                            j0Var.E.d(f0Var.a(str), f0Var.e(bundle), string);
                        }
                        l2(5, bundle2);
                        bundle2.remove(str4);
                        z11 = true;
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

    public final void B1(su.l lVar, int i10) {
        Bundle bundle = (Bundle) lVar.f22360e;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z10 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (q2(str) && (i11 = i11 + 1) > i10) {
                c1 c1Var = (c1) this.f1504d;
                f fVar = c1Var.f26887r;
                f0 f0Var = c1Var.F;
                if (!fVar.C1(null, u.f27175e1) || !z10) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 37);
                    sb2.append("Event can't contain more than ");
                    sb2.append(i10);
                    sb2.append(" params");
                    String string = sb2.toString();
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.E.d(f0Var.a((String) lVar.f22358c), f0Var.e(bundle), string);
                    l2(5, bundle);
                }
                bundle.remove(str);
                z10 = true;
            }
        }
    }

    public final boolean B2(String str, String str2, int i10, Object obj) {
        if (obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean) || (obj instanceof Double)) {
            return true;
        }
        if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
            return false;
        }
        String string = obj.toString();
        if (string.codePointCount(0, string.length()) > i10) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.H.e("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
            return false;
        }
        return true;
    }

    public final void C1(Parcelable[] parcelableArr, int i10) {
        cc.s.h(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i11 = 0;
            boolean z10 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (q2(str) && !R1(str, p1.f27082h) && (i11 = i11 + 1) > i10) {
                    c1 c1Var = (c1) this.f1504d;
                    f fVar = c1Var.f26887r;
                    f0 f0Var = c1Var.F;
                    if (!fVar.C1(null, u.f27175e1) || !z10) {
                        j0 j0Var = c1Var.f26889y;
                        c1.g(j0Var);
                        su.b bVar = j0Var.E;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 60);
                        sb2.append("Param can't contain more than ");
                        sb2.append(i10);
                        sb2.append(" item-scoped custom parameters");
                        bVar.d(f0Var.b(str), f0Var.e(bundle), sb2.toString());
                    }
                    l2(28, bundle);
                    bundle.remove(str);
                    z10 = true;
                }
            }
        }
    }

    public final void C2(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iY2;
        String str3;
        int iY1;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        c1 c1Var = (c1) this.f1504d;
        f fVar = c1Var.f26887r;
        j0 j0Var = c1Var.f26889y;
        f0 f0Var = c1Var.F;
        s3 s3Var = ((c1) fVar.f1504d).E;
        c1.e(s3Var);
        int i10 = true != s3Var.X1(231100000) ? 0 : 35;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i11 = 0;
        boolean z11 = false;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (list2 == null || !list2.contains(str4)) {
                iY2 = !z10 ? y2(str4) : 0;
                if (iY2 == 0) {
                    iY2 = z2(str4);
                }
            } else {
                iY2 = 0;
            }
            if (iY2 != 0) {
                E1(bundle, iY2, str4, iY2 == 3 ? str4 : null);
                bundle.remove(str4);
            } else {
                if (A2(bundle.get(str4))) {
                    c1.g(j0Var);
                    j0Var.H.e("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                    iY1 = 22;
                    str3 = null;
                } else {
                    str3 = null;
                    iY1 = y1(str, str4, bundle.get(str4), bundle, list2, z10, false);
                }
                if (iY1 != 0 && !"_ev".equals(str4)) {
                    E1(bundle, iY1, str4, bundle.get(str4));
                    bundle.remove(str4);
                } else if (q2(str4) && !R1(str4, p1.f27082h)) {
                    int i12 = i11 + 1;
                    if (!X1(231100000)) {
                        c1.g(j0Var);
                        j0Var.E.d(f0Var.a(str), f0Var.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                        l2(23, bundle);
                        bundle.remove(str4);
                    } else if (i12 > i10) {
                        if (!c1Var.f26887r.C1(str3, u.f27175e1) || !z11) {
                            c1.g(j0Var);
                            su.b bVar = j0Var.E;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 55);
                            sb2.append("Item can't contain more than ");
                            sb2.append(i10);
                            sb2.append(" item-scoped custom params");
                            bVar.d(f0Var.a(str), f0Var.e(bundle), sb2.toString());
                        }
                        l2(28, bundle);
                        bundle.remove(str4);
                        list2 = list;
                        i11 = i12;
                        z11 = true;
                    }
                    list2 = list;
                    i11 = i12;
                }
            }
            list2 = list;
        }
    }

    public final void D1(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                s3 s3Var = ((c1) this.f1504d).E;
                c1.e(s3Var);
                s3Var.H1(bundle, str, bundle2.get(str));
            }
        }
    }

    public final void E1(Bundle bundle, int i10, String str, Object obj) {
        if (l2(i10, bundle)) {
            ((c1) this.f1504d).getClass();
            bundle.putString("_ev", x1(str, 40, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int F1(Object obj, String str) {
        return "_ldl".equals(str) ? B2("user property referrer", str, n2(str), obj) : B2("user property", str, n2(str), obj) ? 0 : 7;
    }

    public final Object G1(Object obj, String str) {
        return "_ldl".equals(str) ? m2(n2(str), obj, true, false) : m2(n2(str), obj, false, false);
    }

    public final void H1(Bundle bundle, String str, Object obj) {
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
            c1 c1Var = (c1) this.f1504d;
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.H.d(c1Var.F.b(str), simpleName, "Not putting event parameter. Invalid value type. name, type");
        }
    }

    public final d7.a M1() {
        e7.c cVar;
        if (this.B == null) {
            Context context = ((c1) this.f1504d).f26884a;
            br.l.e(context, "context");
            int i10 = Build.VERSION.SDK_INT;
            b7.b bVar = b7.b.f2474a;
            if (i10 >= 33) {
                bVar.a();
            }
            if ((i10 >= 33 ? bVar.a() : 0) >= 5) {
                Object systemService = context.getSystemService((Class<Object>) e7.b.j());
                br.l.d(systemService, "context.getSystemService…ementManager::class.java)");
                cVar = new e7.c(e7.b.e(systemService));
            } else {
                b7.a aVar = b7.a.f2473a;
                if (((i10 == 31 || i10 == 32) ? aVar.a() : 0) >= 9) {
                    try {
                        MeasurementManager measurementManager = MeasurementManager.get(context);
                        br.l.d(measurementManager, "get(context)");
                        cVar = new e7.c(measurementManager);
                    } catch (NoClassDefFoundError unused) {
                        int i11 = Build.VERSION.SDK_INT;
                        if (i11 == 31 || i11 == 32) {
                            aVar.a();
                        }
                    }
                } else {
                    cVar = null;
                }
            }
            this.B = cVar != null ? new d7.a(cVar) : null;
        }
        return this.B;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long N1() {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.s3.N1():long");
    }

    public final boolean P1(String str) {
        s1();
        c1 c1Var = (c1) this.f1504d;
        if (ic.c.a(c1Var.f26884a).f11323a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        j0 j0Var = c1Var.f26889y;
        c1.g(j0Var);
        j0Var.J.c(str, "Permission not granted");
        return false;
    }

    public final boolean S1(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((c1) this.f1504d).f26887r.w1("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle T1(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object objZ1 = z1(bundle.get(str), str);
                if (objZ1 == null) {
                    c1 c1Var = (c1) this.f1504d;
                    j0 j0Var = c1Var.f26889y;
                    c1.g(j0Var);
                    j0Var.H.c(c1Var.F.b(str), "Param value can't be null");
                } else {
                    H1(bundle2, str, objZ1);
                }
            }
        }
        return bundle2;
    }

    public final zzbg U1(String str, Bundle bundle, String str2, long j, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (w2(str) != 0) {
            c1 c1Var = (c1) this.f1504d;
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.c(c1Var.F.c(str), "Invalid conditional property event name");
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str2);
        Bundle bundleA1 = A1(str, bundle2, Collections.singletonList("_o"), true);
        if (z10) {
            bundleA1 = T1(bundleA1);
        }
        cc.s.h(bundleA1);
        return new zzbg(str, new zzbe(bundleA1), str2, j);
    }

    public final boolean V1(Context context, String str) {
        Signature[] signatureArr;
        c1 c1Var = (c1) this.f1504d;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoC = ic.c.a(context).c(64, str);
            if (packageInfoC == null || (signatureArr = packageInfoC.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.B.c(e4, "Package name not found");
            return true;
        } catch (CertificateException e10) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.B.c(e10, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean X1(int i10) {
        Boolean bool = ((c1) this.f1504d).j().f27268y;
        if (Y1() < i10 / 1000) {
            return (bool == null || bool.booleanValue()) ? false : true;
        }
        return true;
    }

    public final int Y1() {
        if (this.E == null) {
            c1 c1Var = (c1) this.f1504d;
            zb.d dVar = zb.d.f26817b;
            Context context = c1Var.f26884a;
            dVar.getClass();
            AtomicBoolean atomicBoolean = zb.f.f26819a;
            int i10 = 0;
            try {
                i10 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                io.sentry.android.core.e0.p("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.E = Integer.valueOf(i10 / 1000);
        }
        return this.E.intValue();
    }

    public final void Z1(Bundle bundle, long j) {
        long j7 = bundle.getLong("_et");
        if (j7 != 0) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(Long.valueOf(j7), "Params already contained engagement");
        } else {
            j7 = 0;
        }
        bundle.putLong("_et", j + j7);
    }

    public final void a2(String str, com.google.android.gms.internal.measurement.m0 m0Var) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning string value to wrapper");
        }
    }

    public final void b2(com.google.android.gms.internal.measurement.m0 m0Var, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning long value to wrapper");
        }
    }

    public final void c2(com.google.android.gms.internal.measurement.m0 m0Var, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i10);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning int value to wrapper");
        }
    }

    public final void d2(com.google.android.gms.internal.measurement.m0 m0Var, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning byte array to wrapper");
        }
    }

    public final void e2(com.google.android.gms.internal.measurement.m0 m0Var, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z10);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning boolean value to wrapper");
        }
    }

    public final void f2(com.google.android.gms.internal.measurement.m0 m0Var, Bundle bundle) {
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning bundle value to wrapper");
        }
    }

    public final void g2(com.google.android.gms.internal.measurement.m0 m0Var, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            m0Var.C(bundle);
        } catch (RemoteException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Error returning bundle list to wrapper");
        }
    }

    public final String k2() {
        byte[] bArr = new byte[16];
        p2().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final Object m2(int i10, Object obj, boolean z10, boolean z11) {
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
            return x1(obj.toString(), i10, z10);
        }
        if (!z11) {
            return null;
        }
        if (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[])) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleT1 = T1((Bundle) parcelable);
                if (!bundleT1.isEmpty()) {
                    arrayList.add(bundleT1);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final int n2(String str) {
        c1 c1Var = (c1) this.f1504d;
        if ("_ldl".equals(str)) {
            c1Var.getClass();
            return 2048;
        }
        if ("_id".equals(str)) {
            c1Var.getClass();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            c1Var.getClass();
            return 100;
        }
        c1Var.getClass();
        return 36;
    }

    public final long o2() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.f27146x;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f27146x;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNanoTime = System.nanoTime();
            ((c1) this.f1504d).G.getClass();
            long jNextLong = new Random(jNanoTime ^ System.currentTimeMillis()).nextLong();
            int i10 = this.f27147y + 1;
            this.f27147y = i10;
            j = jNextLong + i10;
        }
        return j;
    }

    public final SecureRandom p2() {
        s1();
        if (this.f27145r == null) {
            this.f27145r = new SecureRandom();
        }
        return this.f27145r;
    }

    public final Bundle r2(Uri uri) {
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
                bundle.putString("content", queryParameter12);
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
        } catch (UnsupportedOperationException e4) {
            j0 j0Var = ((c1) this.f1504d).f26889y;
            c1.g(j0Var);
            j0Var.F.c(e4, "Install referrer url isn't a hierarchical URI");
            return null;
        }
    }

    public final boolean s2(String str, String str2) {
        c1 c1Var = (c1) this.f1504d;
        if (str2 == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.E.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.E.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            j0 j0Var3 = c1Var.f26889y;
            c1.g(j0Var3);
            j0Var3.E.d(str, str2, "Name must start with a letter. Type, name");
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                j0 j0Var4 = c1Var.f26889y;
                c1.g(j0Var4);
                j0Var4.E.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // zc.j1
    public final boolean t1() {
        return true;
    }

    public final boolean t2(String str, String str2) {
        c1 c1Var = (c1) this.f1504d;
        if (str2 == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.E.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.length() == 0) {
            j0 j0Var2 = c1Var.f26889y;
            c1.g(j0Var2);
            j0Var2.E.c(str, "Name is required and can't be empty. Type");
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                j0 j0Var3 = c1Var.f26889y;
                c1.g(j0Var3);
                j0Var3.E.d(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                j0 j0Var4 = c1Var.f26889y;
                c1.g(j0Var4);
                j0Var4.E.d(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean u2(String str, String[] strArr, String[] strArr2, String str2) {
        c1 c1Var = (c1) this.f1504d;
        if (str2 == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.E.c(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i10 = 0; i10 < 3; i10++) {
            if (str2.startsWith(F[i10])) {
                j0 j0Var2 = c1Var.f26889y;
                c1.g(j0Var2);
                j0Var2.E.d(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr == null || !R1(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && R1(str2, strArr2)) {
            return true;
        }
        j0 j0Var3 = c1Var.f26889y;
        c1.g(j0Var3);
        j0Var3.E.d(str, str2, "Name is reserved. Type, name");
        return false;
    }

    public final boolean v2(String str, int i10, String str2) {
        c1 c1Var = (c1) this.f1504d;
        if (str2 == null) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.E.c(str, "Name is required and can't be null. Type");
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        j0 j0Var2 = c1Var.f26889y;
        c1.g(j0Var2);
        j0Var2.E.e("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    public final boolean w1(String str) {
        c1 c1Var = (c1) this.f1504d;
        if (TextUtils.isEmpty(str)) {
            j0 j0Var = c1Var.f26889y;
            c1.g(j0Var);
            j0Var.E.b("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return false;
        }
        cc.s.h(str);
        if (str.matches("^1:\\d+:android:[a-f0-9]+$")) {
            return true;
        }
        j0 j0Var2 = c1Var.f26889y;
        c1.g(j0Var2);
        j0Var2.E.c(j0.A1(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
        return false;
    }

    public final int w2(String str) {
        if (!t2("event", str)) {
            return 2;
        }
        if (!u2("event", p1.f27075a, p1.f27076b, str)) {
            return 13;
        }
        ((c1) this.f1504d).getClass();
        return !v2("event", 40, str) ? 2 : 0;
    }

    public final int x2(String str) {
        if (!t2("user property", str)) {
            return 6;
        }
        if (!u2("user property", p1.f27083i, null, str)) {
            return 15;
        }
        ((c1) this.f1504d).getClass();
        return !v2("user property", 24, str) ? 6 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int y1(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.s3.y1(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int y2(String str) {
        if (!s2("event param", str)) {
            return 3;
        }
        if (!u2("event param", null, null, str)) {
            return 14;
        }
        ((c1) this.f1504d).getClass();
        return !v2("event param", 40, str) ? 3 : 0;
    }

    public final Object z1(Object obj, String str) {
        c1 c1Var = (c1) this.f1504d;
        int iMax = 500;
        if ("_ev".equals(str)) {
            c1Var.f26887r.getClass();
            return m2(Math.max(500, 256), obj, true, true);
        }
        if (Q1(str)) {
            c1Var.f26887r.getClass();
            iMax = Math.max(500, 256);
        } else {
            c1Var.f26887r.getClass();
        }
        return m2(iMax, obj, false, true);
    }

    public final int z2(String str) {
        if (!t2("event param", str)) {
            return 3;
        }
        if (!u2("event param", null, null, str)) {
            return 14;
        }
        ((c1) this.f1504d).getClass();
        return !v2("event param", 40, str) ? 3 : 0;
    }
}
