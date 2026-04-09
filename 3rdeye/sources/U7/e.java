package U7;

import J8.AbstractC0686a;
import android.app.Activity;

/* compiled from: InterstitialManager.kt */
/* loaded from: classes3.dex */
public final class e extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f12506b;

    public e(f fVar) {
        this.f12506b = fVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        f fVar = this.f12506b;
        if (kotlin.jvm.internal.l.b(fVar.f12519n, activity)) {
            fVar.f12519n = null;
        }
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        f fVar = this.f12506b;
        if (kotlin.jvm.internal.l.b(fVar.f12519n, activity)) {
            return;
        }
        fVar.f12519n = activity;
    }
}
