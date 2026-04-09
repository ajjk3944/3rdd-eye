package I5;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class d implements Application.ActivityLifecycleCallbacks {

    /* renamed from: b, reason: collision with root package name */
    public boolean f2499b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2500c;

    /* renamed from: d, reason: collision with root package name */
    public a f2501d;

    public interface a {
        void a(boolean z10);
    }

    public boolean b() {
        return false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f2500c) {
            this.f2500c = true;
            if (this.f2499b) {
                a(true);
                a aVar = this.f2501d;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = runningAppProcessInfo.importance == 100 || b();
        if (this.f2500c != z10) {
            this.f2500c = z10;
            if (this.f2499b) {
                a(z10);
                a aVar = this.f2501d;
                if (aVar != null) {
                    aVar.a(z10);
                }
            }
        }
    }

    public void a(boolean z10) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
