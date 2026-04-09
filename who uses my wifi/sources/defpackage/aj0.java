package defpackage;

import android.os.Build;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.phuongpn.whousemywifi.networkscanner.RouterAdminActivity;
import com.phuongpn.whousemywifi.networkscanner.RouterPasswordActivity;
import java.util.Iterator;
import java.util.ListIterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class aj0 {
    public final Runnable a;
    public final l8 b = new l8();
    public qw c;
    public final OnBackInvokedCallback d;
    public OnBackInvokedDispatcher e;
    public boolean f;
    public boolean g;

    public aj0(Runnable runnable) {
        this.a = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.d = i >= 34 ? i30.r(new ui0(this, 0), new ui0(this, 1), new vi0(this, 0), new vi0(this, 1)) : new z5(2, new vi0(this, 2));
        }
    }

    public final void a(b60 b60Var, qw qwVar) {
        i30.m(qwVar, "onBackPressedCallback");
        d60 d60VarE = b60Var.e();
        if (d60VarE.c == u50.f) {
            return;
        }
        qwVar.b.add(new xi0(this, d60VarE, qwVar));
        e();
        qwVar.c = new zi0(0, this, aj0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 0);
    }

    public final void b() {
        Object objPrevious;
        if (this.c == null) {
            l8 l8Var = this.b;
            ListIterator<E> listIterator = l8Var.listIterator(l8Var.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (((qw) objPrevious).a) {
                        break;
                    }
                }
            }
        }
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public final void c() {
        qw qwVarPrevious;
        qw qwVar = this.c;
        if (qwVar == null) {
            l8 l8Var = this.b;
            l8Var.getClass();
            ListIterator listIterator = l8Var.listIterator(l8Var.h);
            while (true) {
                if (!listIterator.hasPrevious()) {
                    qwVarPrevious = 0;
                    break;
                } else {
                    qwVarPrevious = listIterator.previous();
                    if (((qw) qwVarPrevious).a) {
                        break;
                    }
                }
            }
            qwVar = qwVarPrevious;
        }
        this.c = null;
        if (qwVar == null) {
            this.a.run();
            return;
        }
        switch (qwVar.d) {
            case 0:
                xw xwVar = (xw) qwVar.e;
                xwVar.y(true);
                if (xwVar.h.a) {
                    xwVar.M();
                    return;
                } else {
                    xwVar.g.c();
                    return;
                }
            case 1:
                RouterAdminActivity routerAdminActivity = (RouterAdminActivity) qwVar.e;
                mc2 mc2Var = routerAdminActivity.C;
                if (mc2Var == null) {
                    i30.S("binding");
                    throw null;
                }
                if (((WebView) mc2Var.j).canGoBack() && !routerAdminActivity.E) {
                    mc2 mc2Var2 = routerAdminActivity.C;
                    if (mc2Var2 != null) {
                        ((WebView) mc2Var2.j).goBack();
                        return;
                    } else {
                        i30.S("binding");
                        throw null;
                    }
                }
                k52 k52Var = routerAdminActivity.D;
                if (k52Var == null) {
                    routerAdminActivity.finish();
                    return;
                }
                k52Var.b(new gr0(routerAdminActivity, 0));
                k52 k52Var2 = routerAdminActivity.D;
                if (k52Var2 != null) {
                    k52Var2.c(routerAdminActivity);
                }
                routerAdminActivity.finish();
                return;
            default:
                RouterPasswordActivity routerPasswordActivity = (RouterPasswordActivity) qwVar.e;
                k52 k52Var3 = routerPasswordActivity.G;
                if (k52Var3 == null) {
                    routerPasswordActivity.finish();
                    return;
                }
                k52Var3.b(new gr0(routerPasswordActivity, 1));
                k52 k52Var4 = routerPasswordActivity.G;
                if (k52Var4 != null) {
                    k52Var4.c(routerPasswordActivity);
                }
                routerPasswordActivity.finish();
                return;
        }
    }

    public final void d(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        if (z && !this.f) {
            yg.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = true;
        } else {
            if (z || !this.f) {
                return;
            }
            yg.d(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f = false;
        }
    }

    public final void e() {
        boolean z = this.g;
        boolean z2 = false;
        l8 l8Var = this.b;
        if (l8Var == null || !l8Var.isEmpty()) {
            Iterator it = l8Var.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((qw) it.next()).a) {
                    z2 = true;
                    break;
                }
            }
        }
        this.g = z2;
        if (z2 == z || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z2);
    }
}
