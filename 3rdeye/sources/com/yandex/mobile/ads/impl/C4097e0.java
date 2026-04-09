package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import b9.C1992A;
import com.yandex.mobile.ads.impl.C4118h0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.impl.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4097e0 implements InterfaceC4083c0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f26591f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static volatile C4097e0 f26592g;

    /* renamed from: a, reason: collision with root package name */
    private final Object f26593a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f26594b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f26595c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final a f26596d = new a();

    /* renamed from: e, reason: collision with root package name */
    private boolean f26597e;

    /* renamed from: com.yandex.mobile.ads.impl.e0$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        private final HashSet a(WeakHashMap weakHashMap) {
            HashSet hashSet;
            synchronized (C4097e0.this.f26593a) {
                Set setKeySet = weakHashMap.keySet();
                hashSet = new HashSet(setKeySet.size());
                for (Object obj : setKeySet) {
                    if (obj != null) {
                        hashSet.add(obj);
                    }
                }
            }
            return hashSet;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.l.f(activity, "activity");
            Iterator it = a(C4097e0.this.f26595c).iterator();
            while (it.hasNext()) {
                ((fr1) it.next()).a(activity, bundle);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            Iterator it = a(C4097e0.this.f26594b).iterator();
            while (it.hasNext()) {
                ((InterfaceC4160n0) it.next()).a(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            Iterator it = a(C4097e0.this.f26594b).iterator();
            while (it.hasNext()) {
                ((InterfaceC4160n0) it.next()).b(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            kotlin.jvm.internal.l.f(activity, "activity");
            kotlin.jvm.internal.l.f(outState, "outState");
            Iterator it = a(C4097e0.this.f26595c).iterator();
            while (it.hasNext()) {
                ((fr1) it.next()).b(activity, outState);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.l.f(activity, "activity");
            C4097e0.this.b(activity);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4083c0
    public final void b(Context context, InterfaceC4160n0 listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26593a) {
            try {
                this.f26594b.put(listener, null);
                if (!c()) {
                    a(context);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f26593a) {
            z10 = this.f26597e;
        }
        return z10;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        try {
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this.f26596d);
            this.f26597e = true;
        } catch (Throwable unused) {
            int i = fp0.f27419b;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4083c0
    public final void a(Context context, InterfaceC4160n0 listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26593a) {
            this.f26594b.remove(listener);
            b(context);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4083c0
    public final void b(Context context, C4118h0.a listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26593a) {
            try {
                this.f26595c.put(listener, null);
                if (!c()) {
                    a(context);
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4083c0
    public final void a(Context context, C4118h0.a listener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(listener, "listener");
        synchronized (this.f26593a) {
            this.f26595c.remove(listener);
            b(context);
            C1992A c1992a = C1992A.f18074a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Context context) {
        synchronized (this.f26593a) {
            try {
                if (this.f26594b.isEmpty() && this.f26595c.isEmpty()) {
                    kotlin.jvm.internal.l.f(context, "context");
                    try {
                        if (c()) {
                            Context applicationContext = context.getApplicationContext();
                            kotlin.jvm.internal.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
                            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.f26596d);
                            this.f26597e = false;
                        }
                    } catch (Throwable unused) {
                        int i = fp0.f27419b;
                    }
                }
                C1992A c1992a = C1992A.f18074a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
