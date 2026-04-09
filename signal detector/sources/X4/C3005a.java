package x4;

import Z3.c;
import a.AbstractC0241a;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.lifecycle.InterfaceC0283e;
import androidx.lifecycle.InterfaceC0298u;
import com.google.android.gms.internal.ads.C1268hc;
import com.lefan.base.activity.PrivacyActivity;
import com.lefan.signal.MyApplication;
import com.lefan.signal.activity.SplashActivity;
import d4.h;
import p4.C2776c;
import p4.C2777d;
import q2.BinderC2843t;
import q2.L;
import q5.i;
import u2.k;
import y5.l;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3005a implements Application.ActivityLifecycleCallbacks, InterfaceC0283e {

    /* renamed from: a, reason: collision with root package name */
    public Activity f24183a;

    /* renamed from: b, reason: collision with root package name */
    public h f24184b;

    @Override // androidx.lifecycle.InterfaceC0283e
    public final void a(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void b(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final void e(InterfaceC0298u interfaceC0298u) {
        h hVar = this.f24184b;
        if (hVar != null) {
            ((MyApplication) hVar.f19807b).f18819b = System.currentTimeMillis();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        i.e(activity, "activity");
        i.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i.e(activity, "activity");
        this.f24183a = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        i.e(activity, "activity");
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void onDestroy(InterfaceC0298u interfaceC0298u) {
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final void onStart(InterfaceC0298u interfaceC0298u) {
        c cVar;
        C2777d c2777d;
        h hVar = this.f24184b;
        if (hVar != null) {
            Activity activity = this.f24183a;
            MyApplication myApplication = (MyApplication) hVar.f19807b;
            if (MyApplication.f18812d) {
                MyApplication.f18812d = false;
                return;
            }
            if (activity == null || System.currentTimeMillis() - myApplication.f18819b < AbstractC0241a.f4541a || (activity instanceof SplashActivity) || (activity instanceof PrivacyActivity)) {
                return;
            }
            String localClassName = activity.getLocalClassName();
            i.d(localClassName, "getLocalClassName(...)");
            if (l.V(localClassName, "FreeAdActivity", false)) {
                return;
            }
            myApplication.f18818a = activity;
            if (MyApplication.f18816h || (cVar = MyApplication.f18814f) == null || cVar.b(activity) || (c2777d = MyApplication.f18815g) == null || MyApplication.f18816h || !AbstractC0241a.j(activity, "Insert_ad_pair")) {
                return;
            }
            if (System.currentTimeMillis() - c2777d.f22881c >= 3600000) {
                c2777d.f22879a = null;
            }
            C1268hc c1268hc = c2777d.f22879a;
            if (c1268hc == null) {
                c2777d.a(activity);
                MyApplication.f18816h = false;
                return;
            }
            C2776c c2776c = new C2776c(c2777d.f22882d, activity, c2777d);
            try {
                L l2 = c1268hc.f14511c;
                if (l2 != null) {
                    l2.I2(new BinderC2843t(c2776c));
                }
            } catch (RemoteException e6) {
                k.k("#007 Could not call remote method.", e6);
            }
            MyApplication.f18816h = true;
            C1268hc c1268hc2 = c2777d.f22879a;
            if (c1268hc2 != null) {
                c1268hc2.b(activity);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0283e
    public final /* synthetic */ void onStop(InterfaceC0298u interfaceC0298u) {
    }
}
