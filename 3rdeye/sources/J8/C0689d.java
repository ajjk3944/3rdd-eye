package J8;

import android.app.Activity;

/* compiled from: ActivityLifecycleListener.kt */
/* renamed from: J8.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0689d extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.d f2858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A8.d f2859c;

    public C0689d(com.zipoapps.premiumhelper.d dVar, A8.d dVar2) {
        this.f2858b = dVar;
        this.f2859c = dVar2;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (C0690e.b(activity)) {
            return;
        }
        this.f2858b.unregisterActivityLifecycleCallbacks(this);
        this.f2859c.invoke(activity);
    }
}
