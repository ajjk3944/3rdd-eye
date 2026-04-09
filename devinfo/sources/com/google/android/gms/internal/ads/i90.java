package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class i90 implements g60, k80 {

    /* renamed from: a, reason: collision with root package name */
    public final bw f12175a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f12176b;

    /* renamed from: c, reason: collision with root package name */
    public final dw f12177c;

    /* renamed from: d, reason: collision with root package name */
    public final View f12178d;

    /* renamed from: e, reason: collision with root package name */
    public String f12179e;

    /* renamed from: f, reason: collision with root package name */
    public final mi f12180f;
    public final wp0 g;

    public i90(bw bwVar, Context context, dw dwVar, WebView webView, mi miVar, wp0 wp0Var) {
        this.f12175a = bwVar;
        this.f12176b = context;
        this.f12177c = dwVar;
        this.f12178d = webView;
        this.f12180f = miVar;
        this.g = wp0Var;
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void E() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.g.G0) {
            View view = this.f12178d;
            if (view != null && this.f12179e != null) {
                Context context = view.getContext();
                String str = this.f12179e;
                dw dwVar = this.f12177c;
                AtomicReference atomicReference = dwVar.g;
                if (dwVar.a(context) && (context instanceof Activity) && dwVar.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = dwVar.f10565h;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            dwVar.l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        dwVar.l("setCurrentScreen", false);
                    }
                }
            }
            this.f12175a.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void q(pu puVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        dw dwVar = this.f12177c;
        Context context = this.f12176b;
        if (dwVar.a(context) && this.g.G0) {
            try {
                dwVar.e(context, dwVar.d(context), this.f12175a.f9815c, puVar.f15106a, puVar.f15107b);
            } catch (RemoteException e2) {
                za.i.i("Remote Exception to get reward item.", e2);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void v() {
        if (this.g.G0) {
            this.f12175a.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void z1() {
        mi miVar = mi.APP_OPEN;
        mi miVar2 = this.f12180f;
        if (miVar2 != miVar && this.g.G0) {
            dw dwVar = this.f12177c;
            Context context = this.f12176b;
            String str = "";
            if (dwVar.a(context)) {
                AtomicReference atomicReference = dwVar.f10564f;
                if (dwVar.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) dwVar.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) dwVar.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        dwVar.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f12179e = str;
            this.f12179e = String.valueOf(str).concat(miVar2 == mi.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void c() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.g60
    public final void j() {
    }
}
