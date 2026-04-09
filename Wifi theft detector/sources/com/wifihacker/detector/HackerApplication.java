package com.wifihacker.detector;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.multidex.MultiDexApplication;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.wifihacker.detector.common.bill.BillingDataSource;
import com.wifihacker.detector.receiver.ScreenReceiver;
import com.wifihacker.detector.receiver.WiFiReceiver;
import g8.c;
import g8.h;
import g8.k;
import g8.o;
import g8.s;
import g8.u;
import h8.e;
import java.util.List;

/* loaded from: classes3.dex */
public class HackerApplication extends MultiDexApplication {

    /* renamed from: i, reason: collision with root package name */
    public static HackerApplication f20281i = null;

    /* renamed from: j, reason: collision with root package name */
    public static String f20282j = "devices";

    /* renamed from: a, reason: collision with root package name */
    public List f20283a;

    /* renamed from: f, reason: collision with root package name */
    public int f20288f;

    /* renamed from: g, reason: collision with root package name */
    public long f20289g;

    /* renamed from: b, reason: collision with root package name */
    public int f20284b = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f20285c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20286d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20287e = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20290h = false;

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (HackerApplication.this.o(activity)) {
                if (HackerApplication.this.f20284b == 0 && HackerApplication.this.f20285c != -1 && System.currentTimeMillis() - HackerApplication.this.f20285c > 5000) {
                    if (s.t()) {
                        return;
                    }
                    HackerApplication.this.v(System.currentTimeMillis());
                    e.c().f();
                    if (HackerApplication.this.p(activity)) {
                        h.k(activity, false, false);
                    }
                }
                HackerApplication.c(HackerApplication.this);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (HackerApplication.this.o(activity)) {
                HackerApplication.d(HackerApplication.this);
                if (HackerApplication.this.f20284b == 0) {
                    HackerApplication.this.f20285c = System.currentTimeMillis();
                }
            }
        }
    }

    public static /* synthetic */ int c(HackerApplication hackerApplication) {
        int i10 = hackerApplication.f20284b;
        hackerApplication.f20284b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d(HackerApplication hackerApplication) {
        int i10 = hackerApplication.f20284b;
        hackerApplication.f20284b = i10 - 1;
        return i10;
    }

    public static void j(HackerApplication hackerApplication) {
        if (f20281i == null) {
            f20281i = hackerApplication;
        }
    }

    public static HackerApplication l() {
        return f20281i;
    }

    public final void A(Context context) {
        if (((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
            k(context);
        }
    }

    public final void B() {
        try {
            if (o.c().b(getApplicationContext(), "IS_CHARGING", true) && u.d(this) != null && o.c().b(getApplicationContext(), "switch_open_lock_screen", true)) {
                A(this);
                o.c().m(getApplicationContext(), "IS_CHARGING", true);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void h() {
        registerActivityLifecycleCallbacks(new a());
    }

    public boolean i() {
        return System.currentTimeMillis() - this.f20289g > MBInterstitialActivity.WEB_LOAD_TIME;
    }

    public void k(Context context) {
        ((KeyguardManager) context.getSystemService("keyguard")).newKeyguardLock("").disableKeyguard();
    }

    public int m() {
        return this.f20288f;
    }

    public List n() {
        return this.f20283a;
    }

    public final boolean o(Activity activity) {
        return (activity.getLocalClassName().contains("ScreenLockActivity") || activity.getLocalClassName().contains("InterstitialAdActivity") || activity.getLocalClassName().contains("SplashActivity") || activity.getLocalClassName().contains("MainAdActivity") || activity.getLocalClassName().contains("GuideActivity") || activity.getLocalClassName().contains("AdActivity") || activity.getLocalClassName().contains("com.facebook")) ? false : true;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f20281i = this;
        g8.e.a(this);
        new c().c(this);
        k.d(false, "WiFiHackerDetector");
        h8.a.f().g(this);
        w7.a.b().c(this);
        h();
        B();
        s();
        s.x(this);
        w8.a.b().f(getApplicationContext());
        BillingDataSource.l(this);
    }

    @Override // android.app.Application
    public void onTerminate() {
        this.f20283a = null;
        super.onTerminate();
    }

    public final boolean p(Activity activity) {
        return (activity.getLocalClassName().contains("ScanAnimationActivity") || activity.getLocalClassName().contains("ScanResultActivity")) ? false : true;
    }

    public boolean q() {
        return this.f20290h;
    }

    public boolean r() {
        return this.f20286d;
    }

    public final void s() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        registerReceiver(new ScreenReceiver(), intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter2.addAction("android.net.wifi.STATE_CHANGE");
        registerReceiver(new WiFiReceiver(), intentFilter2);
    }

    public void t() {
        this.f20285c = -1L;
    }

    public void u(int i10) {
        this.f20288f = i10;
    }

    public void v(long j10) {
        this.f20289g = j10;
    }

    public void w(boolean z10) {
        this.f20287e = z10;
    }

    public void x(List list) {
        this.f20283a = list;
    }

    public void y(boolean z10) {
        this.f20290h = z10;
    }

    public void z(boolean z10) {
        this.f20286d = z10;
    }
}
