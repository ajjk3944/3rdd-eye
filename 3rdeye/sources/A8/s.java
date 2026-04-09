package A8;

import J8.AbstractC0686a;
import android.app.Activity;
import android.os.Bundle;
import com.zipoapps.premiumhelper.ui.splash.WarmSplashActivity;
import java.lang.ref.WeakReference;

/* compiled from: WarmSplashCoordinator.kt */
/* loaded from: classes3.dex */
public final class s extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f160b;

    public s(u uVar) {
        this.f160b = uVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (activity instanceof WarmSplashActivity) {
            this.f160b.f172g = new WeakReference<>(activity);
        }
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity destroyedActivity) {
        kotlin.jvm.internal.l.f(destroyedActivity, "destroyedActivity");
        if (destroyedActivity instanceof WarmSplashActivity) {
            u uVar = this.f160b;
            if (uVar.f170e) {
                uVar.f166a.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }
}
