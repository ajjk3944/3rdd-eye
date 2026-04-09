package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.conscrypt.PSKKeyManager;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4893l extends AbstractC4803a4 {

    /* renamed from: b, reason: collision with root package name */
    private Boolean f36575b;

    /* renamed from: c, reason: collision with root package name */
    private String f36576c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC4909n f36577d;

    /* renamed from: e, reason: collision with root package name */
    private Boolean f36578e;

    C4893l(C4976v3 c4976v3) {
        super(c4976v3);
        this.f36577d = new InterfaceC4909n() { // from class: com.google.android.gms.measurement.internal.k
            @Override // com.google.android.gms.measurement.internal.InterfaceC4909n
            public final String d(String str, String str2) {
                return null;
            }
        };
    }

    public static long G() {
        return ((Long) N.f36073e.a(null)).longValue();
    }

    public static long I() {
        return ((Integer) N.f36094l.a(null)).intValue();
    }

    public static long N() {
        return ((Long) N.f36043R.a(null)).longValue();
    }

    public static long O() {
        return ((Long) N.f36033M.a(null)).longValue();
    }

    private final String d(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
            AbstractC7901p.l(str3);
            return str3;
        } catch (ClassNotFoundException e10) {
            zzj().C().b("Could not find SystemProperties class", e10);
            return str2;
        } catch (IllegalAccessException e11) {
            zzj().C().b("Could not access SystemProperties.get()", e11);
            return str2;
        } catch (NoSuchMethodException e12) {
            zzj().C().b("Could not find SystemProperties.get() method", e12);
            return str2;
        } catch (InvocationTargetException e13) {
            zzj().C().b("SystemProperties.get() threw an exception", e13);
            return str2;
        }
    }

    private final Bundle s() {
        try {
            if (zza().getPackageManager() == null) {
                zzj().C().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = w3.c.a(zza()).b(zza().getPackageName(), 128);
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            zzj().C().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            zzj().C().b("Failed to load metadata: Package name not found", e10);
            return null;
        }
    }

    final long A(String str) {
        return y(str, N.f36064b);
    }

    public final String B(String str, C4936q2 c4936q2) {
        return TextUtils.isEmpty(str) ? (String) c4936q2.a(null) : (String) c4936q2.a(this.f36577d.d(str, c4936q2.b()));
    }

    final Boolean C(String str) {
        AbstractC7901p.f(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            zzj().C().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleS.containsKey(str)) {
            return Boolean.valueOf(bundleS.getBoolean(str));
        }
        return null;
    }

    public final boolean D(String str, C4936q2 c4936q2) {
        return F(str, c4936q2);
    }

    final String E(String str) {
        return B(str, N.f36062a0);
    }

    public final boolean F(String str, C4936q2 c4936q2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c4936q2.a(null)).booleanValue();
        }
        String strD = this.f36577d.d(str, c4936q2.b());
        return TextUtils.isEmpty(strD) ? ((Boolean) c4936q2.a(null)).booleanValue() : ((Boolean) c4936q2.a(Boolean.valueOf("1".equals(strD)))).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List H(java.lang.String r4) throws android.content.res.Resources.NotFoundException {
        /*
            r3 = this;
            s3.AbstractC7901p.f(r4)
            android.os.Bundle r0 = r3.s()
            r1 = 0
            if (r0 != 0) goto L19
            com.google.android.gms.measurement.internal.L2 r4 = r3.zzj()
            com.google.android.gms.measurement.internal.N2 r4 = r4.C()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L17:
            r4 = r1
            goto L28
        L19:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L20
            goto L17
        L20:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L28:
            if (r4 != 0) goto L2b
            return r1
        L2b:
            android.content.Context r0 = r3.zza()     // Catch: android.content.res.Resources.NotFoundException -> L43
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L43
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L43
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            if (r4 != 0) goto L3e
            return r1
        L3e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L43
            return r4
        L43:
            r4 = move-exception
            com.google.android.gms.measurement.internal.L2 r0 = r3.zzj()
            com.google.android.gms.measurement.internal.N2 r0 = r0.C()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C4893l.H(java.lang.String):java.util.List");
    }

    public final void J(String str) {
        this.f36576c = str;
    }

    final boolean K(String str) {
        return F(str, N.f36059Z);
    }

    public final boolean L(String str) {
        return "1".equals(this.f36577d.d(str, "gaia_collection_enabled"));
    }

    public final boolean M(String str) {
        return "1".equals(this.f36577d.d(str, "measurement.event_sampling_enabled"));
    }

    public final String P() {
        return d("debug.firebase.analytics.app", "");
    }

    public final String Q() {
        return d("debug.deferred.deeplink", "");
    }

    public final String R() {
        return this.f36576c;
    }

    public final boolean S() {
        Boolean boolC = C("google_analytics_adid_collection_enabled");
        return boolC == null || boolC.booleanValue();
    }

    public final boolean T() {
        Boolean boolC = C("google_analytics_automatic_screen_reporting_enabled");
        return boolC == null || boolC.booleanValue();
    }

    public final boolean U() {
        Boolean boolC = C("firebase_analytics_collection_deactivated");
        return boolC != null && boolC.booleanValue();
    }

    final boolean V() {
        if (this.f36575b == null) {
            Boolean boolC = C("app_measurement_lite");
            this.f36575b = boolC;
            if (boolC == null) {
                this.f36575b = Boolean.FALSE;
            }
        }
        return this.f36575b.booleanValue() || !this.f36331a.r();
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

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ x7 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC4803a4
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final double k(String str, C4936q2 c4936q2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c4936q2.a(null)).doubleValue();
        }
        String strD = this.f36577d.d(str, c4936q2.b());
        if (TextUtils.isEmpty(strD)) {
            return ((Double) c4936q2.a(null)).doubleValue();
        }
        try {
            return ((Double) c4936q2.a(Double.valueOf(Double.parseDouble(strD)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c4936q2.a(null)).doubleValue();
        }
    }

    final int l(String str) {
        return m(str, N.f36053W, 500, 2000);
    }

    public final int m(String str, C4936q2 c4936q2, int i10, int i11) {
        return Math.max(Math.min(u(str, c4936q2), i11), i10);
    }

    final int n(String str, boolean z10) {
        if (z10) {
            return m(str, N.f36080g0, 100, 500);
        }
        return 500;
    }

    final void o(InterfaceC4909n interfaceC4909n) {
        this.f36577d = interfaceC4909n;
    }

    public final boolean p(C4936q2 c4936q2) {
        return F(null, c4936q2);
    }

    public final boolean q() {
        if (this.f36578e == null) {
            synchronized (this) {
                try {
                    if (this.f36578e == null) {
                        ApplicationInfo applicationInfo = zza().getApplicationInfo();
                        String strA = com.google.android.gms.common.util.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            this.f36578e = Boolean.valueOf(str != null && str.equals(strA));
                        }
                        if (this.f36578e == null) {
                            this.f36578e = Boolean.TRUE;
                            zzj().C().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f36578e.booleanValue();
    }

    public final boolean r() {
        Boolean boolC = C("google_analytics_sgtm_upload_enabled");
        if (boolC == null) {
            return false;
        }
        return boolC.booleanValue();
    }

    public final int t(String str) {
        return m(str, N.f36055X, 25, 100);
    }

    public final int u(String str, C4936q2 c4936q2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c4936q2.a(null)).intValue();
        }
        String strD = this.f36577d.d(str, c4936q2.b());
        if (TextUtils.isEmpty(strD)) {
            return ((Integer) c4936q2.a(null)).intValue();
        }
        try {
            return ((Integer) c4936q2.a(Integer.valueOf(Integer.parseInt(strD)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c4936q2.a(null)).intValue();
        }
    }

    final int v(String str, boolean z10) {
        return Math.max(n(str, z10), PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public final int w() {
        return g().Z(201500000, true) ? 100 : 25;
    }

    public final int x(String str) {
        return u(str, N.f36106p);
    }

    public final long y(String str, C4936q2 c4936q2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c4936q2.a(null)).longValue();
        }
        String strD = this.f36577d.d(str, c4936q2.b());
        if (TextUtils.isEmpty(strD)) {
            return ((Long) c4936q2.a(null)).longValue();
        }
        try {
            return ((Long) c4936q2.a(Long.valueOf(Long.parseLong(strD)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c4936q2.a(null)).longValue();
        }
    }

    public final EnumC4866h4 z(String str, boolean z10) {
        Object obj;
        AbstractC7901p.f(str);
        Bundle bundleS = s();
        if (bundleS == null) {
            zzj().C().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleS.get(str);
        }
        if (obj == null) {
            return EnumC4866h4.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC4866h4.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC4866h4.DENIED;
        }
        if (z10 && "eu_consent_policy".equals(obj)) {
            return EnumC4866h4.POLICY;
        }
        zzj().H().b("Invalid manifest metadata for", str);
        return EnumC4866h4.UNINITIALIZED;
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
