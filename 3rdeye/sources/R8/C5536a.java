package r8;

import J8.AbstractC0686a;
import K4.e;
import N7.C1154e9;
import O4.F;
import O4.v;
import O4.w;
import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.l;

/* compiled from: ActivityLifeCycleLogger.kt */
/* renamed from: r8.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5536a {

    /* renamed from: a, reason: collision with root package name */
    public C0525a f45828a;

    /* compiled from: ActivityLifeCycleLogger.kt */
    /* renamed from: r8.a$a, reason: collision with other inner class name */
    public final class C0525a extends AbstractC0686a {
        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            l.f(activity, "activity");
            e eVarA = e.a();
            String strI = C1154e9.i("Lifecycle Event: ", activity.getComponentName().getClassName(), " created");
            F f10 = eVarA.f3148a;
            long jCurrentTimeMillis = System.currentTimeMillis() - f10.f10237d;
            v vVar = f10.f10240g;
            vVar.getClass();
            vVar.f10338e.a(new w(vVar, jCurrentTimeMillis, strI));
        }

        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            l.f(activity, "activity");
            e eVarA = e.a();
            String strI = C1154e9.i("Lifecycle Event: ", activity.getComponentName().getClassName(), " destroyed");
            F f10 = eVarA.f3148a;
            long jCurrentTimeMillis = System.currentTimeMillis() - f10.f10237d;
            v vVar = f10.f10240g;
            vVar.getClass();
            vVar.f10338e.a(new w(vVar, jCurrentTimeMillis, strI));
        }

        @Override // J8.AbstractC0686a, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            l.f(activity, "activity");
            e eVarA = e.a();
            String strI = C1154e9.i("Lifecycle Event: ", activity.getComponentName().getClassName(), " resumed");
            F f10 = eVarA.f3148a;
            long jCurrentTimeMillis = System.currentTimeMillis() - f10.f10237d;
            v vVar = f10.f10240g;
            vVar.getClass();
            vVar.f10338e.a(new w(vVar, jCurrentTimeMillis, strI));
        }
    }
}
