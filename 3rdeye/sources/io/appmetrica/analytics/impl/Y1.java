package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class Y1 implements ActivityLifecycleListener {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f40404a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public volatile R7 f40405b = null;

    public final void a(R7 r72) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f40405b = r72;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC4820ne) it.next()).consume(r72);
        }
    }

    public final void b() {
        C5065x4.l().f42016e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C5065x4.l().f42016e.unregisterListener(this, ActivityEvent.CREATED);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", "activity", new W1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        X1 x12 = new X1(dataString);
        synchronized (this) {
            try {
                R7 r72 = this.f40405b;
                if (r72 == null) {
                    this.f40404a.add(x12);
                } else {
                    ((S9) C5065x4.l().f42014c.a()).f40100b.post(new V1(x12, r72));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f40404a);
        this.f40404a.clear();
        return arrayList;
    }
}
