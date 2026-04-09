package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import q2.C2841s;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.ef, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC1108ef implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13916a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f13917b;

    /* renamed from: c, reason: collision with root package name */
    public final C2909E f13918c;

    /* renamed from: d, reason: collision with root package name */
    public String f13919d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f13920e = -1;

    public SharedPreferencesOnSharedPreferenceChangeListenerC1108ef(Context context, C2909E c2909e) {
        this.f13917b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f13918c = c2909e;
        this.f13916a = context;
    }

    public final void a(int i, String str) {
        Context context;
        E9 e9 = H9.f8689W0;
        C2841s c2841s = C2841s.f23267e;
        boolean z6 = true;
        if (!((Boolean) c2841s.f23270c.a(e9)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z6 = false;
        }
        this.f13918c.D(z6);
        if (((Boolean) c2841s.f23270c.a(H9.W6)).booleanValue() && z6 && (context = this.f13916a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSharedPreferenceChanged(android.content.SharedPreferences r10, java.lang.String r11) {
        /*
            r9 = this;
            java.lang.String r0 = "IABTCF_PurposeConsents"
            com.google.android.gms.internal.ads.E9 r1 = com.google.android.gms.internal.ads.H9.f8699Y0     // Catch: java.lang.Throwable -> L39
            q2.s r2 = q2.C2841s.f23267e     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.G9 r3 = r2.f23270c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L39
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L39
            r3 = 1
            java.lang.String r4 = "-1"
            r5 = -1
            java.lang.String r6 = "gad_has_consent_for_cookies"
            if (r1 == 0) goto L5d
            boolean r0 = j$.util.Objects.equals(r11, r6)     // Catch: java.lang.Throwable -> L39
            android.content.Context r1 = r9.f13916a
            t2.E r2 = r9.f13918c
            if (r0 == 0) goto L3c
            int r10 = r10.getInt(r6, r5)     // Catch: java.lang.Throwable -> L39
            r2.m()     // Catch: java.lang.Throwable -> L39
            int r11 = r2.f23559m     // Catch: java.lang.Throwable -> L39
            if (r10 == r11) goto L35
            r2.D(r3)     // Catch: java.lang.Throwable -> L39
            a.AbstractC0241a.A(r1)     // Catch: java.lang.Throwable -> L39
        L35:
            r2.b(r10)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r10 = move-exception
            goto Lbe
        L3c:
            java.lang.String r0 = "IABTCF_TCString"
            boolean r0 = j$.util.Objects.equals(r11, r0)     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto Lbd
            java.lang.String r10 = r10.getString(r11, r4)     // Catch: java.lang.Throwable -> L39
            r2.m()     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = r2.f23558l     // Catch: java.lang.Throwable -> L39
            boolean r11 = j$.util.Objects.equals(r10, r11)     // Catch: java.lang.Throwable -> L39
            if (r11 != 0) goto L59
            r2.D(r3)     // Catch: java.lang.Throwable -> L39
            a.AbstractC0241a.A(r1)     // Catch: java.lang.Throwable -> L39
        L59:
            r2.a(r10)     // Catch: java.lang.Throwable -> L39
            return
        L5d:
            java.lang.String r1 = r10.getString(r0, r4)     // Catch: java.lang.Throwable -> L39
            int r10 = r10.getInt(r6, r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r11 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L39
            int r7 = r11.hashCode()     // Catch: java.lang.Throwable -> L39
            r8 = -2004976699(0xffffffff887e7bc5, float:-7.6580835E-34)
            if (r7 == r8) goto L80
            r0 = -527267622(0xffffffffe09288da, float:-8.447143E19)
            if (r7 == r0) goto L78
            goto L88
        L78:
            boolean r11 = r11.equals(r6)
            if (r11 == 0) goto L88
            r11 = r3
            goto L89
        L80:
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L88
            r11 = 0
            goto L89
        L88:
            r11 = r5
        L89:
            if (r11 == 0) goto Laa
            if (r11 == r3) goto L8e
            goto Lbd
        L8e:
            com.google.android.gms.internal.ads.E9 r11 = com.google.android.gms.internal.ads.H9.f8689W0     // Catch: java.lang.Throwable -> L39
            com.google.android.gms.internal.ads.G9 r0 = r2.f23270c     // Catch: java.lang.Throwable -> L39
            java.lang.Object r11 = r0.a(r11)     // Catch: java.lang.Throwable -> L39
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto Lbd
            if (r10 == r5) goto Lbd
            int r11 = r9.f13920e     // Catch: java.lang.Throwable -> L39
            if (r11 == r10) goto Lbd
            r9.f13920e = r10     // Catch: java.lang.Throwable -> L39
            r9.a(r10, r1)     // Catch: java.lang.Throwable -> L39
            return
        Laa:
            boolean r11 = r1.equals(r4)     // Catch: java.lang.Throwable -> L39
            if (r11 != 0) goto Lbd
            java.lang.String r11 = r9.f13919d     // Catch: java.lang.Throwable -> L39
            boolean r11 = r11.equals(r1)     // Catch: java.lang.Throwable -> L39
            if (r11 != 0) goto Lbd
            r9.f13919d = r1     // Catch: java.lang.Throwable -> L39
            r9.a(r10, r1)     // Catch: java.lang.Throwable -> L39
        Lbd:
            return
        Lbe:
            p2.j r11 = p2.j.f22785C
            com.google.android.gms.internal.ads.Hf r11 = r11.f22795h
            java.lang.String r0 = "AdMobPlusIdlessListener.onSharedPreferenceChanged"
            r11.f(r0, r10)
            java.lang.String r11 = "onSharedPreferenceChanged, errorMessage = "
            t2.AbstractC2907C.n(r11, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.SharedPreferencesOnSharedPreferenceChangeListenerC1108ef.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }
}
