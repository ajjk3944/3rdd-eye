package com.applovin.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2111c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    private final List f19141a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b, reason: collision with root package name */
    private WeakReference f19142b;

    /* renamed from: c, reason: collision with root package name */
    private WeakReference f19143c;

    public C2111c(Context context) {
        this.f19142b = new WeakReference(null);
        this.f19143c = new WeakReference(null);
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            this.f19142b = new WeakReference(activity);
            if (activity.hasWindowFocus()) {
                this.f19143c = this.f19142b;
            }
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    public Activity a() {
        return (Activity) this.f19143c.get();
    }

    public Activity b() {
        return (Activity) this.f19142b.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityCreated(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityDestroyed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.f19143c = new WeakReference(null);
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        WeakReference weakReference = new WeakReference(activity);
        this.f19142b = weakReference;
        this.f19143c = weakReference;
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivitySaveInstanceState(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Iterator it = new ArrayList(this.f19141a).iterator();
        while (it.hasNext()) {
            ((AbstractC2108b) it.next()).onActivityStopped(activity);
        }
    }

    public void a(AbstractC2108b abstractC2108b) {
        this.f19141a.add(abstractC2108b);
    }

    public void b(AbstractC2108b abstractC2108b) {
        this.f19141a.remove(abstractC2108b);
    }
}
