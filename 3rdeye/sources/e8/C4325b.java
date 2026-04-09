package e8;

import J8.AbstractC0686a;
import J8.C0687b;
import android.app.Activity;
import android.app.Application;
import kotlin.jvm.internal.l;

/* compiled from: MultiplePermissionsRequester.kt */
/* renamed from: e8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4325b extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f37762b;

    public C4325b(c cVar) {
        this.f37762b = cVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        l.f(activity, "activity");
        c cVar = this.f37762b;
        C0687b c0687b = cVar.i;
        if (c0687b != null) {
            cVar.f37769k = true;
            Application application = activity.getApplication();
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(c0687b);
            }
            cVar.f37768j.d();
        }
    }
}
