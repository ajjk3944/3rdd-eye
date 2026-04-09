package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class tn2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static tn2 f33753d = new tn2();

    /* renamed from: a, reason: collision with root package name */
    private boolean f33754a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33755b;

    /* renamed from: c, reason: collision with root package name */
    private a f33756c;

    public interface a {
    }

    private tn2() {
    }

    public static tn2 a() {
        return f33753d;
    }

    public final void b() {
        this.f33754a = true;
        this.f33755b = false;
        Iterator<in2> it = jn2.a().b().iterator();
        while (it.hasNext()) {
            it.next().j().a(true);
        }
    }

    public final void c() {
        this.f33754a = false;
        this.f33755b = false;
        this.f33756c = null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f33755b) {
            this.f33755b = false;
            if (this.f33754a) {
                Iterator<in2> it = jn2.a().b().iterator();
                while (it.hasNext()) {
                    it.next().j().a(true);
                }
                if (this.f33756c != null) {
                    t62.g().getClass();
                    t62.a();
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewF;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        boolean z10 = false;
        boolean z11 = runningAppProcessInfo.importance != 100;
        boolean z12 = true;
        for (in2 in2Var : jn2.a().c()) {
            if (in2Var.g() && (viewF = in2Var.f()) != null && viewF.hasWindowFocus()) {
                z12 = false;
            }
        }
        if (z11 && z12) {
            z10 = true;
        }
        if (this.f33755b != z10) {
            this.f33755b = z10;
            if (this.f33754a) {
                boolean z13 = !z10;
                Iterator<in2> it = jn2.a().b().iterator();
                while (it.hasNext()) {
                    it.next().j().a(z13);
                }
                if (this.f33756c != null) {
                    if (z10) {
                        t62.g().getClass();
                        t62.c();
                    } else {
                        t62.g().getClass();
                        t62.a();
                    }
                }
            }
        }
    }

    public final void a(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a(a aVar) {
        this.f33756c = aVar;
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
