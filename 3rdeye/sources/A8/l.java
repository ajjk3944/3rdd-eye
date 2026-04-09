package A8;

import J8.AbstractC0686a;
import android.app.Activity;
import android.app.Application;
import b9.C1992A;
import com.zipoapps.premium.start_like_pro.StartLikeProActivity;
import com.zipoapps.premiumhelper.e;
import com.zipoapps.premiumhelper.ui.splash.PHSplashActivity;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final class l extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p9.p<Activity, Application.ActivityLifecycleCallbacks, C1992A> f144b;

    /* JADX WARN: Multi-variable type inference failed */
    public l(p9.p<? super Activity, ? super Application.ActivityLifecycleCallbacks, C1992A> pVar) {
        this.f144b = pVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if ((activity instanceof PHSplashActivity) || (activity instanceof StartLikeProActivity)) {
            return;
        }
        Class<?> cls = activity.getClass();
        com.zipoapps.premiumhelper.e.f37006D.getClass();
        if (cls.equals(e.a.a().f37020j.f43910b.getIntroActivityClass())) {
            return;
        }
        this.f144b.invoke(activity, this);
    }
}
