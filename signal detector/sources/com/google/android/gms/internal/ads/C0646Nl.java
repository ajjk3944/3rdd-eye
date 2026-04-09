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

/* renamed from: com.google.android.gms.internal.ads.Nl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646Nl implements InterfaceC1382jk, InterfaceC1599nl {

    /* renamed from: a, reason: collision with root package name */
    public final C1485lf f10050a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10051b;

    /* renamed from: c, reason: collision with root package name */
    public final C1593nf f10052c;

    /* renamed from: d, reason: collision with root package name */
    public final View f10053d;

    /* renamed from: e, reason: collision with root package name */
    public String f10054e;

    /* renamed from: f, reason: collision with root package name */
    public final B8 f10055f;

    /* renamed from: g, reason: collision with root package name */
    public final Qt f10056g;

    public C0646Nl(C1485lf c1485lf, Context context, C1593nf c1593nf, WebView webView, B8 b8, Qt qt) {
        this.f10050a = c1485lf;
        this.f10051b = context;
        this.f10052c = c1593nf;
        this.f10053d = webView;
        this.f10055f = b8;
        this.f10056g = qt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
        C1593nf c1593nf = this.f10052c;
        Context context = this.f10051b;
        if (c1593nf.a(context) && this.f10056g.f10737G0) {
            try {
                c1593nf.e(context, c1593nf.d(context), this.f10050a.f15418c, binderC2185ye.f17728a, binderC2185ye.f17729b);
            } catch (RemoteException e6) {
                u2.k.i("Remote Exception to get reward item.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
        if (this.f10056g.f10737G0) {
            this.f10050a.a(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (this.f10056g.f10737G0) {
            View view = this.f10053d;
            if (view != null && this.f10054e != null) {
                Context context = view.getContext();
                String str = this.f10054e;
                C1593nf c1593nf = this.f10052c;
                AtomicReference atomicReference = c1593nf.f15789g;
                if (c1593nf.a(context) && (context instanceof Activity) && c1593nf.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                    ConcurrentHashMap concurrentHashMap = c1593nf.f15790h;
                    Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            concurrentHashMap.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            c1593nf.l("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        c1593nf.l("setCurrentScreen", false);
                    }
                }
            }
            this.f10050a.a(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1599nl
    public final void g() {
        B8 b8 = B8.APP_OPEN;
        B8 b82 = this.f10055f;
        if (b82 != b8 && this.f10056g.f10737G0) {
            C1593nf c1593nf = this.f10052c;
            Context context = this.f10051b;
            String str = "";
            if (c1593nf.a(context)) {
                AtomicReference atomicReference = c1593nf.f15788f;
                if (c1593nf.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                    try {
                        String str2 = (String) c1593nf.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                        if (str2 == null) {
                            str2 = (String) c1593nf.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                        }
                        if (str2 != null) {
                            str = str2;
                        }
                    } catch (Exception unused) {
                        c1593nf.l("getCurrentScreenName", false);
                    }
                }
            }
            this.f10054e = str;
            this.f10054e = String.valueOf(str).concat(b82 == B8.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
    }
}
