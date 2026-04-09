package J8;

import android.app.Activity;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.permissions.PermissionProcessBar;

/* compiled from: ActivityLifecycleListener.kt */
/* renamed from: J8.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0688c extends AbstractC0686a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PermissionProcessBar f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ A2.c f2857d;

    public C0688c(PermissionProcessBar permissionProcessBar, String str, A2.c cVar) {
        this.f2855b = permissionProcessBar;
        this.f2856c = str;
        this.f2857d = cVar;
    }

    @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) throws Exception {
        kotlin.jvm.internal.l.f(activity, "activity");
        PermissionProcessBar permissionProcessBar = this.f2855b;
        if (activity.equals(permissionProcessBar) || activity.getClass().getSimpleName().equals(this.f2856c)) {
            return;
        }
        permissionProcessBar.getApplication().unregisterActivityLifecycleCallbacks(this);
        this.f2857d.invoke(activity);
    }
}
