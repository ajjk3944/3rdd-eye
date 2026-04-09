package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;

/* loaded from: classes3.dex */
public class e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private String f14756a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f14757b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f14758c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f14759d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f14760e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14761f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f14762g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14763h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f14764i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14765j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14766k;

    /* renamed from: l, reason: collision with root package name */
    private a f14767l;

    /* renamed from: m, reason: collision with root package name */
    private final SharedPreferences f14768m;

    public interface a {
        void a();
    }

    public e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f14768m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        a();
    }

    private void a() {
        SharedPreferences sharedPreferences = this.f14768m;
        if (sharedPreferences != null) {
            d(sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, ""));
            a(this.f14768m.getInt("IABTCF_gdprApplies", 0));
            c(this.f14768m.getString("IABTCF_PurposeConsents", ""));
            e(this.f14768m.getString("IABTCF_VendorConsents", ""));
            b(this.f14768m.getString("IABTCF_AddtlConsent", ""));
        }
    }

    public String b() {
        return this.f14756a;
    }

    public void c(String str) {
        this.f14762g = a(str, 1);
        this.f14763h = a(str, 2);
        this.f14757b = str;
    }

    public void d(String str) {
        this.f14756a = str;
    }

    public void e(String str) {
        this.f14764i = a(str, 867);
        this.f14758c = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSharedPreferenceChanged(android.content.SharedPreferences r12, java.lang.String r13) {
        /*
            r11 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L25
            if (r0 != 0) goto L84
            int r0 = r13.hashCode()     // Catch: java.lang.Throwable -> L25
            r1 = 2
            java.lang.String r2 = "IABTCF_PurposeConsents"
            r3 = 1
            java.lang.String r4 = "IABTCF_gdprApplies"
            r5 = 0
            java.lang.String r6 = "IABTCF_TCString"
            r7 = 4
            java.lang.String r8 = "IABTCF_AddtlConsent"
            r9 = 3
            java.lang.String r10 = "IABTCF_VendorConsents"
            switch(r0) {
                case -2004976699: goto L40;
                case 83641339: goto L38;
                case 1218895378: goto L30;
                case 1342914771: goto L28;
                case 1450203731: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L48
        L1d:
            boolean r13 = r13.equals(r10)     // Catch: java.lang.Throwable -> L25
            if (r13 == 0) goto L48
            r13 = r9
            goto L49
        L25:
            r12 = move-exception
            goto L85
        L28:
            boolean r13 = r13.equals(r8)     // Catch: java.lang.Throwable -> L25
            if (r13 == 0) goto L48
            r13 = r7
            goto L49
        L30:
            boolean r13 = r13.equals(r6)     // Catch: java.lang.Throwable -> L25
            if (r13 == 0) goto L48
            r13 = r5
            goto L49
        L38:
            boolean r13 = r13.equals(r4)     // Catch: java.lang.Throwable -> L25
            if (r13 == 0) goto L48
            r13 = r3
            goto L49
        L40:
            boolean r13 = r13.equals(r2)     // Catch: java.lang.Throwable -> L25
            if (r13 == 0) goto L48
            r13 = r1
            goto L49
        L48:
            r13 = -1
        L49:
            java.lang.String r0 = ""
            if (r13 == 0) goto L76
            if (r13 == r3) goto L6e
            if (r13 == r1) goto L66
            if (r13 == r9) goto L5e
            if (r13 == r7) goto L56
            goto L7d
        L56:
            java.lang.String r12 = r12.getString(r8, r0)     // Catch: java.lang.Throwable -> L25
            r11.b(r12)     // Catch: java.lang.Throwable -> L25
            goto L7d
        L5e:
            java.lang.String r12 = r12.getString(r10, r0)     // Catch: java.lang.Throwable -> L25
            r11.e(r12)     // Catch: java.lang.Throwable -> L25
            goto L7d
        L66:
            java.lang.String r12 = r12.getString(r2, r0)     // Catch: java.lang.Throwable -> L25
            r11.c(r12)     // Catch: java.lang.Throwable -> L25
            goto L7d
        L6e:
            int r12 = r12.getInt(r4, r5)     // Catch: java.lang.Throwable -> L25
            r11.a(r12)     // Catch: java.lang.Throwable -> L25
            goto L7d
        L76:
            java.lang.String r12 = r12.getString(r6, r0)     // Catch: java.lang.Throwable -> L25
            r11.d(r12)     // Catch: java.lang.Throwable -> L25
        L7d:
            com.mbridge.msdk.foundation.controller.e$a r12 = r11.f14767l     // Catch: java.lang.Throwable -> L25
            if (r12 == 0) goto L84
            r12.a()     // Catch: java.lang.Throwable -> L25
        L84:
            return
        L85:
            java.lang.String r12 = r12.getMessage()
            java.lang.String r13 = "TCStringManager"
            com.mbridge.msdk.foundation.tools.q0.b(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.e.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
    }

    public void b(String str) {
        this.f14759d = str;
        if (TextUtils.isEmpty(str)) {
            this.f14765j = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f14766k = false;
            return;
        }
        this.f14766k = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f14765j = false;
                } else {
                    this.f14765j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            q0.b("TCStringManager", th.getMessage());
        }
    }

    public boolean c() {
        if (this.f14760e == 0) {
            a(true);
            return this.f14761f;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            a((this.f14764i || (this.f14766k && this.f14765j)) && this.f14762g && this.f14763h);
        } else {
            a(this.f14764i && this.f14762g && this.f14763h);
        }
        return this.f14761f;
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f14767l = aVar;
        }
    }

    public void a(int i10) {
        this.f14760e = i10;
    }

    public void a(boolean z10) {
        this.f14761f = z10;
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    private boolean a(String str, int i10) {
        return a(str) && i10 <= str.length() && i10 >= 1 && '1' == str.charAt(i10 - 1);
    }
}
