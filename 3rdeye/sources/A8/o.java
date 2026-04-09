package A8;

import A8.k;
import J8.AbstractC0686a;
import J8.C0687b;
import J8.C0702q;
import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import b9.C1992A;
import kotlin.jvm.internal.w;

/* compiled from: RelaunchCoordinator.kt */
/* loaded from: classes3.dex */
public final class o extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f150b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w<C0687b> f152d;

    public o(k kVar, w<C0687b> wVar) {
        this.f151c = kVar;
        this.f152d = wVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
        if (bundle == null) {
            this.f150b = true;
        }
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        boolean z10 = this.f150b;
        k kVar = this.f151c;
        if (z10) {
            if (activity instanceof AppCompatActivity) {
                k.a aVar = k.f132j;
                kVar.d((AppCompatActivity) activity);
                C1992A c1992a = C1992A.f18074a;
            } else {
                C0702q.a("Please use AppCompatActivity for ".concat(activity.getClass().getName()));
            }
        }
        kVar.f135a.unregisterActivityLifecycleCallbacks(this.f152d.f43660b);
    }
}
