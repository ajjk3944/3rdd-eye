package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tq2 implements um2, op2 {
    public final nc2 f;
    public final Context g;
    public final oc2 h;
    public final View i;
    public String j;
    public final dx1 k;

    public tq2(nc2 nc2Var, Context context, oc2 oc2Var, WebView webView, dx1 dx1Var) {
        this.f = nc2Var;
        this.g = context;
        this.h = oc2Var;
        this.i = webView;
        this.k = dx1Var;
    }

    @Override // defpackage.um2
    public final void J(ka2 ka2Var, String str, String str2) {
        oc2 oc2Var = this.h;
        Context context = this.g;
        if (oc2Var.a(context)) {
            try {
                oc2Var.e(context, oc2Var.d(context), this.f.h, ka2Var.f, ka2Var.g);
            } catch (RemoteException unused) {
                gi2.q0(5);
            }
        }
    }

    @Override // defpackage.um2
    public final void T() {
        this.f.a(false);
    }

    @Override // defpackage.op2
    public final void f() {
        dx1 dx1Var = dx1.APP_OPEN;
        dx1 dx1Var2 = this.k;
        if (dx1Var2 == dx1Var) {
            return;
        }
        oc2 oc2Var = this.h;
        Context context = this.g;
        String str = "";
        if (oc2Var.a(context)) {
            AtomicReference atomicReference = oc2Var.f;
            if (oc2Var.m(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str2 = (String) oc2Var.i(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str2 == null) {
                        str2 = (String) oc2Var.i(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    oc2Var.l("getCurrentScreenName", false);
                }
            }
        }
        this.j = str;
        this.j = String.valueOf(str).concat(dx1Var2 == dx1.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // defpackage.um2
    public final void r() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.i;
        if (view != null && this.j != null) {
            Context context = view.getContext();
            String str = this.j;
            oc2 oc2Var = this.h;
            AtomicReference atomicReference = oc2Var.g;
            if (oc2Var.a(context) && (context instanceof Activity) && oc2Var.m(context, "com.google.firebase.analytics.FirebaseAnalytics", atomicReference, false)) {
                ConcurrentHashMap concurrentHashMap = oc2Var.h;
                Method declaredMethod = (Method) concurrentHashMap.get("setCurrentScreen");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                        concurrentHashMap.put("setCurrentScreen", declaredMethod);
                    } catch (Exception unused) {
                        oc2Var.l("setCurrentScreen", false);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), (Activity) context, str, context.getPackageName());
                } catch (Exception unused2) {
                    oc2Var.l("setCurrentScreen", false);
                }
            }
        }
        this.f.a(true);
    }

    @Override // defpackage.um2
    public final void a() {
    }

    @Override // defpackage.um2
    public final void b() {
    }

    @Override // defpackage.um2
    public final void c() {
    }

    @Override // defpackage.op2
    public final void e() {
    }
}
