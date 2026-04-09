package a6;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f162a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f163b;

    /* renamed from: c, reason: collision with root package name */
    public a f164c;

    public interface a {
        void a(boolean z10);
    }

    public void a(a aVar) {
        this.f164c = aVar;
    }

    public void b(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void c(boolean z10) {
        if (this.f163b != z10) {
            this.f163b = z10;
            if (this.f162a) {
                f(z10);
                a aVar = this.f164c;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    public final boolean d() {
        return e().importance == 100 || h();
    }

    public ActivityManager.RunningAppProcessInfo e() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    public boolean g() {
        return this.f163b;
    }

    public boolean h() {
        return false;
    }

    public void i() {
        this.f162a = true;
        boolean zD = d();
        this.f163b = zD;
        f(zD);
    }

    public void j() {
        this.f162a = false;
        this.f164c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        c(true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        c(d());
    }

    public void f(boolean z10) {
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
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
