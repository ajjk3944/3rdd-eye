package com.applovin.impl.sdk;

import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.l4;
import com.applovin.impl.n2;
import io.appmetrica.analytics.impl.Oo;

/* loaded from: classes.dex */
public class o {

    /* renamed from: b, reason: collision with root package name */
    private static boolean f21403b;

    /* renamed from: a, reason: collision with root package name */
    private final k f21404a;

    public o(k kVar) {
        this.f21404a = kVar;
        a("SDK Session Begin");
    }

    public static void a(boolean z10) {
        f21403b = z10;
    }

    public static void c(String str, String str2, Throwable th) {
        if (!f21403b || a()) {
            Log.e("AppLovinSdk", Oo.f("[", str, "] ", str2), th);
        }
    }

    public static void e(String str, String str2) {
        g(str, str2);
    }

    public static void g(String str, String str2) {
        if (!f21403b || a()) {
            Log.d("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void h(String str, String str2) {
        c(str, str2, null);
    }

    public static void i(String str, String str2) {
        if (!f21403b || a()) {
            Log.i("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void j(String str, String str2) {
        if (!f21403b || a()) {
            Log.w("AppLovinSdk", "[" + str + "] " + str2);
        }
    }

    public static void l(String str, String str2) {
        k kVar = k.f21161C0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.f21161C0.O().k(str, str2);
        }
    }

    public void b(String str, String str2) {
        a(str, str2, null);
    }

    public void d(String str, String str2) {
        Log.i("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void f(String str, String str2) {
        int iIntValue;
        if (a(this.f21404a) && !TextUtils.isEmpty(str2) && (iIntValue = ((Integer) this.f21404a.a(l4.f20010r)).intValue()) > 0) {
            int length = str2.length();
            int i = ((length + iIntValue) - 1) / iIntValue;
            for (int i10 = 0; i10 < i; i10++) {
                int i11 = i10 * iIntValue;
                a(str, str2.substring(i11, Math.min(length, i11 + iIntValue)));
            }
        }
    }

    public void k(String str, String str2) {
        d(str, str2, null);
    }

    private void a(String str) {
        n2 n2Var = new n2();
        n2Var.a().a(str).a();
        g("AppLovinSdk", n2Var.toString());
    }

    public static void b(String str, String str2, Throwable th) {
        k kVar = k.f21161C0;
        if (kVar == null) {
            return;
        }
        kVar.O();
        if (a()) {
            k.f21161C0.O().a(str, str2, th);
        }
    }

    public void d(String str, String str2, Throwable th) {
        Log.w("AppLovinSdk", Oo.f("[", str, "] ", str2), th);
    }

    public void a(String str, Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            b(str, th2.toString());
        }
    }

    public void a(String str, String str2) {
        Log.d("AppLovinSdk", "[" + str + "] " + str2);
    }

    public void a(String str, String str2, Throwable th) {
        Log.e("AppLovinSdk", Oo.f("[", str, "] ", str2), th);
    }

    public static void c(String str, String str2) {
        b(str, str2, null);
    }

    public static boolean a() {
        return a(k.f21161C0);
    }

    public static boolean a(k kVar) {
        return kVar != null && kVar.o0().c();
    }
}
