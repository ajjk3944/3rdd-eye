package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
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
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import k2.AbstractC6359a;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.util.SnmpConfigurator;
import r3.C7568f;
import s3.AbstractC7901p;

/* loaded from: classes.dex */
public final class x7 extends AbstractC4830d4 {

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f36873i = {"firebase_", "google_", "ga_"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f36874j = {"_err"};

    /* renamed from: c, reason: collision with root package name */
    private SecureRandom f36875c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f36876d;

    /* renamed from: e, reason: collision with root package name */
    private int f36877e;

    /* renamed from: f, reason: collision with root package name */
    private AbstractC6359a f36878f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f36879g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f36880h;

    x7(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36880h = null;
        this.f36876d = new AtomicLong(0L);
    }

    static boolean A0(String str) {
        String str2 = (String) N.f36110q0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public static Bundle C(List list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7 r7Var = (r7) it.next();
            String str = r7Var.f36716e;
            if (str != null) {
                bundle.putString(r7Var.f36713b, str);
            } else {
                Long l10 = r7Var.f36715d;
                if (l10 != null) {
                    bundle.putLong(r7Var.f36713b, l10.longValue());
                } else {
                    Double d10 = r7Var.f36718g;
                    if (d10 != null) {
                        bundle.putDouble(r7Var.f36713b, d10.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    static boolean D0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    private final Object E(int i10, Object obj, boolean z10, boolean z11, String str) {
        Bundle bundleA;
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
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1L : 0L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return F(String.valueOf(obj), i10, z10);
        }
        if (!z11 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if ((parcelable instanceof Bundle) && (bundleA = A((Bundle) parcelable, null)) != null && !bundleA.isEmpty()) {
                arrayList.add(bundleA);
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static String F(String str, int i10, boolean z10) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i10) {
            return str;
        }
        if (!z10) {
            return null;
        }
        return str.substring(0, str.offsetByCodePoints(0, i10)) + "...";
    }

    static boolean F0(String str) {
        AbstractC7901p.f(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean G0(String str) {
        for (String str2 : f36874j) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    private static void H(Bundle bundle, int i10, String str, Object obj) {
        if (r0(bundle, i10)) {
            bundle.putString("_ev", F(str, 40, true));
            if (obj != null) {
                AbstractC7901p.l(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", String.valueOf(obj).length());
                }
            }
        }
    }

    private final int H0(String str) {
        if (!t0("event param", str)) {
            return 3;
        }
        if (k0("event param", null, str)) {
            return !f0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private final int I0(String str) {
        if (!z0("event param", str)) {
            return 3;
        }
        if (k0("event param", null, str)) {
            return !f0("event param", 40, str) ? 3 : 0;
        }
        return 14;
    }

    private static int J0(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return "_id".equals(str) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : "_lgclid".equals(str) ? 100 : 36;
    }

    private static boolean K0(String str) {
        AbstractC7901p.l(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    static MessageDigest P0() throws NoSuchAlgorithmException {
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

    public static void T(C4970u5 c4970u5, Bundle bundle, boolean z10) {
        if (bundle == null || c4970u5 == null || (bundle.containsKey("_sc") && !z10)) {
            if (bundle != null && c4970u5 == null && z10) {
                bundle.remove("_sn");
                bundle.remove("_sc");
                bundle.remove("_si");
                return;
            }
            return;
        }
        String str = c4970u5.f36780a;
        if (str != null) {
            bundle.putString("_sn", str);
        } else {
            bundle.remove("_sn");
        }
        String str2 = c4970u5.f36781b;
        if (str2 != null) {
            bundle.putString("_sc", str2);
        } else {
            bundle.remove("_sc");
        }
        bundle.putLong("_si", c4970u5.f36782c);
    }

    private final boolean T0() {
        Integer num;
        if (this.f36879g == null) {
            AbstractC6359a abstractC6359aN0 = N0();
            boolean z10 = false;
            if (abstractC6359aN0 == null) {
                return false;
            }
            Integer num2 = null;
            try {
                num = (Integer) abstractC6359aN0.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z10 = true;
                        }
                    } catch (InterruptedException e10) {
                        e = e10;
                        num2 = num;
                        zzj().H().b("Measurement manager api exception", e);
                        this.f36879g = Boolean.FALSE;
                        num = num2;
                        zzj().G().b("Measurement manager api status result", num);
                        return this.f36879g.booleanValue();
                    } catch (CancellationException e11) {
                        e = e11;
                        num2 = num;
                        zzj().H().b("Measurement manager api exception", e);
                        this.f36879g = Boolean.FALSE;
                        num = num2;
                        zzj().G().b("Measurement manager api status result", num);
                        return this.f36879g.booleanValue();
                    } catch (ExecutionException e12) {
                        e = e12;
                        num2 = num;
                        zzj().H().b("Measurement manager api exception", e);
                        this.f36879g = Boolean.FALSE;
                        num = num2;
                        zzj().G().b("Measurement manager api status result", num);
                        return this.f36879g.booleanValue();
                    } catch (TimeoutException e13) {
                        e = e13;
                        num2 = num;
                        zzj().H().b("Measurement manager api exception", e);
                        this.f36879g = Boolean.FALSE;
                        num = num2;
                        zzj().G().b("Measurement manager api status result", num);
                        return this.f36879g.booleanValue();
                    }
                }
                this.f36879g = Boolean.valueOf(z10);
            } catch (InterruptedException e14) {
                e = e14;
            } catch (CancellationException e15) {
                e = e15;
            } catch (ExecutionException e16) {
                e = e16;
            } catch (TimeoutException e17) {
                e = e17;
            }
            zzj().G().b("Measurement manager api status result", num);
        }
        return this.f36879g.booleanValue();
    }

    public static void U(w7 w7Var, int i10, String str, String str2, int i11) {
        V(w7Var, null, i10, str, str2, i11);
    }

    static void V(w7 w7Var, String str, int i10, String str2, String str3, int i11) {
        Bundle bundle = new Bundle();
        r0(bundle, i10);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i10 == 6 || i10 == 7 || i10 == 2) {
            bundle.putLong("_el", i11);
        }
        w7Var.c(str, "_err", bundle);
    }

    private final void X(String str, String str2, String str3, Bundle bundle, List list, boolean z10) {
        int iI0;
        int i10;
        String str4;
        int iT;
        int i11;
        if (bundle == null) {
            return;
        }
        int i12 = a().g().Z(231100000, true) ? 35 : 0;
        int i13 = 0;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str5)) {
                iI0 = !z10 ? I0(str5) : 0;
                if (iI0 == 0) {
                    iI0 = H0(str5);
                }
            } else {
                iI0 = 0;
            }
            if (iI0 != 0) {
                H(bundle, iI0, str5, iI0 == 3 ? str5 : null);
                bundle.remove(str5);
                i10 = i12;
            } else {
                if (e0(bundle.get(str5))) {
                    zzj().I().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iT = 22;
                    str4 = str5;
                    i10 = i12;
                } else {
                    str4 = str5;
                    i10 = i12;
                    iT = t(str, str2, str5, bundle.get(str5), bundle, list, z10, false);
                }
                if (iT == 0 || "_ev".equals(str4)) {
                    if (!F0(str4) || j0(str4, AbstractC4882j4.f36559d)) {
                        i11 = i10;
                    } else {
                        int i14 = i13 + 1;
                        if (Z(231100000, true)) {
                            i11 = i10;
                            if (i14 > i11) {
                                zzj().D().c("Item can't contain more than " + i11 + " item-scoped custom params", c().c(str2), c().a(bundle));
                                r0(bundle, 28);
                                bundle.remove(str4);
                            }
                        } else {
                            zzj().D().c("Item array not supported on client's version of Google Play Services (Android Only)", c().c(str2), c().a(bundle));
                            r0(bundle, 23);
                            bundle.remove(str4);
                            i11 = i10;
                        }
                        i13 = i14;
                    }
                    i12 = i11;
                } else {
                    H(bundle, iT, str4, bundle.get(str4));
                    bundle.remove(str4);
                }
            }
            i12 = i10;
        }
    }

    static boolean a0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC7901p.l(context);
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

    static boolean b0(Context context, boolean z10) {
        AbstractC7901p.l(context);
        return q0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    static boolean c0(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    static boolean d0(Bundle bundle, int i10) {
        int i11 = 0;
        if (bundle.size() <= i10) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i11++;
            if (i11 > i10) {
                bundle.remove(str);
            }
        }
        return true;
    }

    static boolean e0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    static boolean i0(String str, String str2, String str3, String str4) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC7901p.l(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty || !zIsEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    private static boolean j0(String str, String[] strArr) {
        AbstractC7901p.l(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    static byte[] m0(Parcelable parcelable) {
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

    public static ArrayList p0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4877j c4877j = (C4877j) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c4877j.f36543a);
            bundle.putString("origin", c4877j.f36544b);
            bundle.putLong("creation_timestamp", c4877j.f36546d);
            bundle.putString("name", c4877j.f36545c.f36713b);
            AbstractC4848f4.b(bundle, AbstractC7901p.l(c4877j.f36545c.b()));
            bundle.putBoolean("active", c4877j.f36547e);
            String str = c4877j.f36548f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            L l10 = c4877j.f36549g;
            if (l10 != null) {
                bundle.putString("timed_out_event_name", l10.f35974a);
                K k10 = l10.f35975b;
                if (k10 != null) {
                    bundle.putBundle("timed_out_event_params", k10.g());
                }
            }
            bundle.putLong("trigger_timeout", c4877j.f36550h);
            L l11 = c4877j.f36551i;
            if (l11 != null) {
                bundle.putString("triggered_event_name", l11.f35974a);
                K k11 = l11.f35975b;
                if (k11 != null) {
                    bundle.putBundle("triggered_event_params", k11.g());
                }
            }
            bundle.putLong("triggered_timestamp", c4877j.f36545c.f36714c);
            bundle.putLong("time_to_live", c4877j.f36552j);
            L l12 = c4877j.f36553k;
            if (l12 != null) {
                bundle.putString("expired_event_name", l12.f35974a);
                K k12 = l12.f35975b;
                if (k12 != null) {
                    bundle.putBundle("expired_event_params", k12.g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    static boolean q0(Context context, String str) {
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

    private static boolean r0(Bundle bundle, int i10) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i10);
        return true;
    }

    private final boolean s0(String str, double d10) {
        try {
            SharedPreferences.Editor editorEdit = zza().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            editorEdit.putString("deeplink", str);
            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(d10));
            return editorEdit.commit();
        } catch (RuntimeException e10) {
            zzj().C().b("Failed to persist Deferred Deep Link. exception", e10);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int t(java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.Object r17, android.os.Bundle r18, java.util.List r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x7.t(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public static long u(long j10, long j11) {
        return (j10 + (j11 * 60000)) / 86400000;
    }

    static Bundle[] u0(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        }
        if (!(obj instanceof ArrayList)) {
            return null;
        }
        ArrayList arrayList = (ArrayList) obj;
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int v0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(SnmpConstants.MILLISECOND_TO_NANOSECOND);
    }

    public static long w(K k10) {
        long length = 0;
        if (k10 == null) {
            return 0L;
        }
        Iterator it = k10.iterator();
        while (it.hasNext()) {
            if (k10.j((String) it.next()) instanceof Parcelable[]) {
                length += ((Parcelable[]) r3).length;
            }
        }
        return length;
    }

    static long x(byte[] bArr) {
        AbstractC7901p.l(bArr);
        int i10 = 0;
        AbstractC7901p.o(bArr.length > 0);
        long j10 = 0;
        for (int length = bArr.length - 1; length >= 0 && length >= bArr.length - 8; length--) {
            j10 += (bArr[length] & 255) << i10;
            i10 += 8;
        }
        return j10;
    }

    private final boolean y0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoD = w3.c.a(context).d(str, 64);
            if (packageInfoD == null || (signatureArr = packageInfoD.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().C().b("Package name not found", e10);
            return true;
        } catch (CertificateException e11) {
            zzj().C().b("Error obtaining certificate", e11);
            return true;
        }
    }

    public static Bundle z(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i10 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i10 < parcelableArr.length) {
                        if (parcelableArr[i10] instanceof Bundle) {
                            parcelableArr[i10] = new Bundle((Bundle) parcelableArr[i10]);
                        }
                        i10++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i10 < list.size()) {
                        Object obj2 = list.get(i10);
                        if (obj2 instanceof Bundle) {
                            list.set(i10, new Bundle((Bundle) obj2));
                        }
                        i10++;
                    }
                }
            }
        }
        return bundle2;
    }

    final Bundle A(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objO0 = o0(str2, bundle.get(str2));
                if (objO0 == null) {
                    zzj().I().b("Param value can't be null", c().f(str2));
                } else {
                    K(bundle2, str2, objO0);
                }
            }
        }
        return bundle2;
    }

    final Bundle B(String str, String str2, Bundle bundle, List list, boolean z10) {
        int iI0;
        int i10;
        x7 x7Var = this;
        boolean zJ0 = j0(str2, AbstractC4898l4.f36584d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        int iW = a().w();
        int i11 = 0;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list == null || !list.contains(str3)) {
                iI0 = !z10 ? x7Var.I0(str3) : 0;
                if (iI0 == 0) {
                    iI0 = x7Var.H0(str3);
                }
            } else {
                iI0 = 0;
            }
            if (iI0 != 0) {
                H(bundle2, iI0, str3, iI0 == 3 ? str3 : null);
                bundle2.remove(str3);
                i10 = iW;
            } else {
                i10 = iW;
                int iT = t(str, str2, str3, bundle.get(str3), bundle2, list, z10, zJ0);
                if (iT == 17) {
                    H(bundle2, iT, str3, Boolean.FALSE);
                } else if (iT != 0 && !"_ev".equals(str3)) {
                    H(bundle2, iT, iT == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (F0(str3)) {
                    int i12 = i11 + 1;
                    if (i12 > i10) {
                        zzj().D().c("Event can't contain more than " + i10 + " params", c().c(str2), c().a(bundle));
                        r0(bundle2, 5);
                        bundle2.remove(str3);
                    }
                    i11 = i12;
                }
            }
            iW = i10;
            x7Var = this;
        }
        return bundle2;
    }

    final boolean B0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return a().P().equals(str);
    }

    final boolean C0(String str) {
        j();
        if (w3.c.a(zza()).a(str) == 0) {
            return true;
        }
        zzj().B().b("Permission not granted", str);
        return false;
    }

    final L D(String str, String str2, Bundle bundle, String str3, long j10, boolean z10, boolean z11) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (r(str2) != 0) {
            zzj().C().b("Invalid conditional property event name", c().g(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleB = B(str, str2, bundle2, com.google.android.gms.common.util.e.a("_o"), true);
        if (z10) {
            bundleB = A(bundleB, str);
        }
        AbstractC7901p.l(bundleB);
        return new L(str2, new K(bundleB), str3, j10);
    }

    public final int E0() {
        if (this.f36880h == null) {
            this.f36880h = Integer.valueOf(C7568f.f().a(zza()) / 1000);
        }
        return this.f36880h.intValue();
    }

    public final URL G(long j10, String str, String str2, long j11, String str3) {
        try {
            AbstractC7901p.f(str2);
            AbstractC7901p.f(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", Long.valueOf(j10), Integer.valueOf(E0())), str2, str, Long.valueOf(j11));
            if (str.equals(a().Q())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e10) {
            e = e10;
            zzj().C().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e11) {
            e = e11;
            zzj().C().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    final void I(Bundle bundle, long j10) {
        long j11 = bundle.getLong("_et");
        if (j11 != 0) {
            zzj().H().b("Params already contained engagement", Long.valueOf(j11));
        }
        bundle.putLong("_et", j10 + j11);
    }

    final void J(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                g().K(bundle, str, bundle2.get(str));
            }
        }
    }

    final void K(Bundle bundle, String str, Object obj) {
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
        } else if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            zzj().I().c("Not putting event parameter. Invalid value type. name, type", c().f(str), obj != null ? obj.getClass().getSimpleName() : null);
        }
    }

    public final void L(com.google.android.gms.internal.measurement.U0 u02, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(SnmpConfigurator.O_RETRIES, i10);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning int value to wrapper", e10);
        }
    }

    final long L0() {
        j();
        if (!A0(this.f36331a.y().C())) {
            return 0L;
        }
        long j10 = Build.VERSION.SDK_INT < 30 ? 4L : SdkExtensions.getExtensionVersion(30) < 4 ? 8L : v0() < ((Integer) N.f36092k0.a(null)).intValue() ? 16L : 0L;
        if (!C0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j10 |= 2;
        }
        if (j10 == 0 && !T0()) {
            j10 |= 64;
        }
        if (j10 == 0) {
            return 1L;
        }
        return j10;
    }

    public final void M(com.google.android.gms.internal.measurement.U0 u02, long j10) {
        Bundle bundle = new Bundle();
        bundle.putLong(SnmpConfigurator.O_RETRIES, j10);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning long value to wrapper", e10);
        }
    }

    public final long M0() {
        long andIncrement;
        long j10;
        if (this.f36876d.get() != 0) {
            synchronized (this.f36876d) {
                this.f36876d.compareAndSet(-1L, 1L);
                andIncrement = this.f36876d.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (this.f36876d) {
            long jNextLong = new Random(System.nanoTime() ^ zzb().a()).nextLong();
            int i10 = this.f36877e + 1;
            this.f36877e = i10;
            j10 = jNextLong + i10;
        }
        return j10;
    }

    public final void N(com.google.android.gms.internal.measurement.U0 u02, Bundle bundle) {
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning bundle value to wrapper", e10);
        }
    }

    final AbstractC6359a N0() {
        if (this.f36878f == null) {
            this.f36878f = AbstractC6359a.a(zza());
        }
        return this.f36878f;
    }

    public final void O(com.google.android.gms.internal.measurement.U0 u02, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(SnmpConfigurator.O_RETRIES, str);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning string value to wrapper", e10);
        }
    }

    final String O0() {
        byte[] bArr = new byte[16];
        Q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final void P(com.google.android.gms.internal.measurement.U0 u02, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(SnmpConfigurator.O_RETRIES, arrayList);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning bundle list to wrapper", e10);
        }
    }

    public final void Q(com.google.android.gms.internal.measurement.U0 u02, boolean z10) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(SnmpConfigurator.O_RETRIES, z10);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning boolean value to wrapper", e10);
        }
    }

    final SecureRandom Q0() {
        j();
        if (this.f36875c == null) {
            this.f36875c = new SecureRandom();
        }
        return this.f36875c;
    }

    public final void R(com.google.android.gms.internal.measurement.U0 u02, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(SnmpConfigurator.O_RETRIES, bArr);
        try {
            u02.a(bundle);
        } catch (RemoteException e10) {
            this.f36331a.zzj().H().b("Error returning byte array to wrapper", e10);
        }
    }

    final boolean R0() {
        j();
        return L0() == 1;
    }

    final void S(P2 p22, int i10) {
        int i11 = 0;
        for (String str : new TreeSet(p22.f36165d.keySet())) {
            if (F0(str) && (i11 = i11 + 1) > i10) {
                zzj().D().c("Event can't contain more than " + i10 + " params", c().c(p22.f36162a), c().a(p22.f36165d));
                r0(p22.f36165d, 5);
                p22.f36165d.remove(str);
            }
        }
    }

    public final boolean S0() throws ClassNotFoundException {
        try {
            zza().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void W(String str, double d10) {
        if (!TextUtils.isEmpty(str) && s0(str, d10)) {
            Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
            Context contextZza = zza();
            if (Build.VERSION.SDK_INT < 34) {
                contextZza.sendBroadcast(intent);
            } else {
                contextZza.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        }
    }

    final void Y(Parcelable[] parcelableArr, int i10) {
        AbstractC7901p.l(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i11 = 0;
            for (String str : new TreeSet(bundle.keySet())) {
                if (F0(str) && !j0(str, AbstractC4882j4.f36559d) && (i11 = i11 + 1) > i10) {
                    zzj().D().c("Param can't contain more than " + i10 + " item-scoped custom parameters", c().f(str), c().a(bundle));
                    r0(bundle, 28);
                    bundle.remove(str);
                }
            }
        }
    }

    public final boolean Z(int i10, boolean z10) {
        Boolean boolY = this.f36331a.I().Y();
        if (E0() < i10 / 1000) {
            return (boolY == null || boolY.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4893l a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ F b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ D2 c() {
        return super.c();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ X2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ C4915n5 f() {
        return super.f();
    }

    final boolean f0(String str, int i10, String str2) {
        if (str2 == null) {
            zzj().D().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i10) {
            return true;
        }
        zzj().D().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i10), str2);
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    final boolean g0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (K0(str)) {
                return true;
            }
            if (this.f36331a.p()) {
                zzj().D().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", L2.r(str));
            }
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (this.f36331a.p()) {
                zzj().D().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
        if (K0(str2)) {
            return true;
        }
        zzj().D().b("Invalid admob_app_id. Analytics disabled.", L2.r(str2));
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    final boolean h0(String str, String str2, int i10, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String strValueOf = String.valueOf(obj);
            if (strValueOf.codePointCount(0, strValueOf.length()) > i10) {
                zzj().I().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(strValueOf.length()));
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final void k() {
        j();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                zzj().H().a("Utils falling back to Random for random id");
            }
        }
        this.f36876d.set(jNextLong);
    }

    final boolean k0(String str, String[] strArr, String str2) {
        return l0(str, strArr, null, str2);
    }

    final boolean l0(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            zzj().D().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC7901p.l(str2);
        for (String str3 : f36873i) {
            if (str2.startsWith(str3)) {
                zzj().D().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !j0(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && j0(str2, strArr2)) {
            return true;
        }
        zzj().D().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    final int n0(String str) {
        if (!t0("user property", str)) {
            return 6;
        }
        if (k0("user property", AbstractC4914n4.f36603a, str)) {
            return !f0("user property", 24, str) ? 6 : 0;
        }
        return 15;
    }

    final Object o0(String str, Object obj) {
        if ("_ev".equals(str)) {
            return E(a().v(null, false), obj, true, true, null);
        }
        return E(D0(str) ? a().v(null, false) : a().n(null, false), obj, false, true, null);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4830d4
    protected final boolean p() {
        return true;
    }

    public final int q(int i10) {
        return C7568f.f().h(zza(), 12451000);
    }

    final int r(String str) {
        if (!t0("event", str)) {
            return 2;
        }
        if (l0("event", AbstractC4898l4.f36581a, AbstractC4898l4.f36582b, str)) {
            return !f0("event", 40, str) ? 2 : 0;
        }
        return 13;
    }

    final int s(String str, Object obj) {
        return "_ldl".equals(str) ? h0("user property referrer", str, J0(str), obj) : h0("user property", str, J0(str), obj) ? 0 : 7;
    }

    final boolean t0(String str, String str2) {
        if (str2 == null) {
            zzj().D().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().D().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt) && iCodePointAt != 95) {
            zzj().D().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().D().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:19:0x0073). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final long v(android.content.Context r7, java.lang.String r8) throws java.security.NoSuchAlgorithmException {
        /*
            r6 = this;
            r6.j()
            s3.AbstractC7901p.l(r7)
            s3.AbstractC7901p.f(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()
            java.security.MessageDigest r1 = P0()
            r2 = -1
            if (r1 != 0) goto L23
            com.google.android.gms.measurement.internal.L2 r7 = r6.zzj()
            com.google.android.gms.measurement.internal.N2 r7 = r7.C()
            java.lang.String r8 = "Could not get MD5 instance"
            r7.a(r8)
            goto L74
        L23:
            r4 = 0
            if (r0 == 0) goto L73
            boolean r8 = r6.y0(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 != 0) goto L73
            w3.b r7 = w3.c.a(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.Context r8 = r6.zza()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = r8.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            r0 = 64
            android.content.pm.PackageInfo r7 = r7.d(r8, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r7 == 0) goto L58
            int r8 = r7.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            if (r8 <= 0) goto L58
            r8 = 0
            r7 = r7[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            byte[] r7 = r1.digest(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            long r2 = x(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L56:
            r7 = move-exception
            goto L66
        L58:
            com.google.android.gms.measurement.internal.L2 r7 = r6.zzj()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            com.google.android.gms.measurement.internal.N2 r7 = r7.H()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            java.lang.String r8 = "Could not get signatures"
            r7.a(r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L56
            goto L74
        L66:
            com.google.android.gms.measurement.internal.L2 r8 = r6.zzj()
            com.google.android.gms.measurement.internal.N2 r8 = r8.C()
            java.lang.String r0 = "Package name not found"
            r8.b(r0, r7)
        L73:
            r2 = r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.x7.v(android.content.Context, java.lang.String):long");
    }

    final long w0(String str) {
        if (zza().getPackageManager() == null) {
            return 0L;
        }
        int i10 = 0;
        try {
            ApplicationInfo applicationInfoB = w3.c.a(zza()).b(str, 0);
            if (applicationInfoB != null) {
                i10 = applicationInfoB.targetSdkVersion;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            zzj().F().b("PackageManager failed to find running app: app_id", str);
        }
        return i10;
    }

    final Object x0(String str, Object obj) {
        return "_ldl".equals(str) ? E(J0(str), obj, true, false, null) : E(J0(str), obj, false, false, null);
    }

    final Bundle y(Uri uri) {
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
            return bundle;
        } catch (UnsupportedOperationException e10) {
            zzj().H().b("Install referrer url isn't a hierarchical URI", e10);
            return null;
        }
    }

    final boolean z0(String str, String str2) {
        if (str2 == null) {
            zzj().D().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            zzj().D().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            zzj().D().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                zzj().D().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.d zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4834e zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ L2 zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4, com.google.android.gms.measurement.internal.InterfaceC4821c4
    public final /* bridge */ /* synthetic */ C4952s3 zzl() {
        return super.zzl();
    }
}
