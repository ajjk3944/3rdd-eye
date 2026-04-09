package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vv implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17726a;

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f17727b;

    /* renamed from: c, reason: collision with root package name */
    public final ya.c0 f17728c;

    /* renamed from: d, reason: collision with root package name */
    public String f17729d = "-1";

    /* renamed from: e, reason: collision with root package name */
    public int f17730e = -1;

    public vv(Context context, ya.c0 c0Var) {
        this.f17727b = PreferenceManager.getDefaultSharedPreferences(context);
        this.f17728c = c0Var;
        this.f17726a = context;
    }

    public final void a(int i4, String str) {
        Context context;
        pk pkVar = sk.W0;
        va.s sVar = va.s.f36163e;
        boolean z3 = true;
        if (!((Boolean) sVar.f36166c.a(pkVar)).booleanValue() ? !(str.isEmpty() || str.charAt(0) != '1') : !(i4 == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1")))) {
            z3 = false;
        }
        this.f17728c.D(z3);
        if (((Boolean) sVar.f36166c.a(sk.W6)).booleanValue() && z3 && (context = this.f17726a) != null) {
            context.deleteDatabase("OfflineUpload.db");
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            pk pkVar = sk.Y0;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                boolean zEquals = Objects.equals(str, "gad_has_consent_for_cookies");
                Context context = this.f17726a;
                ya.c0 c0Var = this.f17728c;
                if (zEquals) {
                    int i4 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                    c0Var.m();
                    if (i4 != c0Var.f37412m) {
                        c0Var.D(true);
                        nh.a.z(context);
                    }
                    c0Var.b(i4);
                    return;
                }
                if (Objects.equals(str, "IABTCF_TCString")) {
                    String string = sharedPreferences.getString(str, "-1");
                    c0Var.m();
                    if (!Objects.equals(string, c0Var.f37411l)) {
                        c0Var.D(true);
                        nh.a.z(context);
                    }
                    c0Var.a(string);
                    return;
                }
                return;
            }
            String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
            int i10 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
            String strValueOf = String.valueOf(str);
            int iHashCode = strValueOf.hashCode();
            if (iHashCode == -2004976699) {
                if (!strValueOf.equals("IABTCF_PurposeConsents") || string2.equals("-1") || this.f17729d.equals(string2)) {
                    return;
                }
                this.f17729d = string2;
                a(i10, string2);
                return;
            }
            if (iHashCode == -527267622 && strValueOf.equals("gad_has_consent_for_cookies")) {
                if (!((Boolean) sVar.f36166c.a(sk.W0)).booleanValue() || i10 == -1 || this.f17730e == i10) {
                    return;
                }
                this.f17730e = i10;
                a(i10, string2);
            }
        } catch (Throwable th2) {
            ua.j.C.f35265h.f("AdMobPlusIdlessListener.onSharedPreferenceChanged", th2);
            ya.a0.n("onSharedPreferenceChanged, errorMessage = ", th2);
        }
    }
}
