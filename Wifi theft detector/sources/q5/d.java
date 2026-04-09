package q5;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f24056a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24057b;

    /* renamed from: c, reason: collision with root package name */
    public a f24058c;

    public interface a {
        void a(boolean z10);
    }

    public void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public void b(a aVar) {
        this.f24058c = aVar;
    }

    public final void c(boolean z10) {
        if (this.f24057b != z10) {
            this.f24057b = z10;
            if (this.f24056a) {
                f(z10);
                a aVar = this.f24058c;
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
        return this.f24057b;
    }

    public boolean h() {
        return false;
    }

    public void i() {
        this.f24056a = true;
        boolean zD = d();
        this.f24057b = zD;
        f(zD);
    }

    public void j() {
        this.f24056a = false;
        this.f24058c = null;
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
