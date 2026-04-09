package io.appmetrica.analytics.impl;

import android.app.Activity;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4753l implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f41160a = new HashSet();

    public C4753l(C4805n c4805n) {
        c4805n.registerListener(this, new ActivityEvent[0]);
    }

    public final synchronized void a(InterfaceC4727k interfaceC4727k) {
        this.f41160a.add(interfaceC4727k);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        C5065x4.l().f42014c.a().execute(new RunnableC4701j(this, activity));
    }

    public final void a(Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f41160a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4773lj) ((InterfaceC4727k) it.next())).a(activity);
        }
    }
}
