package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.ew, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1125ew implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public boolean f13997a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13998b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1070dw f13999c;

    public boolean a() {
        return false;
    }

    public void b(boolean z6) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
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
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (!this.f13998b) {
            this.f13998b = true;
            if (this.f13997a) {
                b(true);
                InterfaceC1070dw interfaceC1070dw = this.f13999c;
                if (interfaceC1070dw != null) {
                    interfaceC1070dw.b(true);
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z6 = runningAppProcessInfo.importance == 100 || a();
        if (this.f13998b != z6) {
            this.f13998b = z6;
            if (this.f13997a) {
                b(z6);
                InterfaceC1070dw interfaceC1070dw = this.f13999c;
                if (interfaceC1070dw != null) {
                    interfaceC1070dw.b(z6);
                }
            }
        }
    }
}
