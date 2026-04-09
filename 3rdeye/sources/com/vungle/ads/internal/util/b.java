package com.vungle.ads.internal.util;

import E.u;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import c9.C2092m;
import com.vungle.ads.C4055m;
import com.vungle.ads.internal.util.k;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ActivityManager.kt */
/* loaded from: classes2.dex */
public final class b implements Application.ActivityLifecycleCallbacks {
    private Handler handler;
    private String lastStoppedActivityName;
    public static final a Companion = new a(null);
    private static final String TAG = b.class.getSimpleName();
    private static final b instance = new b();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    private d state = d.UNKNOWN;
    private AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final CopyOnWriteArraySet<String> startedActivities = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<String> resumedActivities = new CopyOnWriteArraySet<>();
    private final CopyOnWriteArraySet<c> callbacks = new CopyOnWriteArraySet<>();
    private final ConcurrentHashMap<InterfaceC0396b, c> adLeftCallbacks = new ConcurrentHashMap<>();
    private final Runnable configChangeRunnable = new com.vungle.ads.internal.util.a(this, 0);

    /* compiled from: ActivityManager.kt */
    public static final class a {

        /* compiled from: ActivityManager.kt */
        /* renamed from: com.vungle.ads.internal.util.b$a$a, reason: collision with other inner class name */
        public static final class C0395a extends c {
            final /* synthetic */ com.vungle.ads.internal.ui.b $adOpenCallback;
            final /* synthetic */ Intent $deepLinkOverrideIntent;
            final /* synthetic */ Intent $defaultIntent;
            final /* synthetic */ InterfaceC0396b $leftCallback;
            final /* synthetic */ WeakReference<Context> $weakContext;

            public C0395a(WeakReference<Context> weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.b bVar, InterfaceC0396b interfaceC0396b) {
                this.$weakContext = weakReference;
                this.$deepLinkOverrideIntent = intent;
                this.$defaultIntent = intent2;
                this.$adOpenCallback = bVar;
                this.$leftCallback = interfaceC0396b;
            }

            @Override // com.vungle.ads.internal.util.b.c
            public void onStart() {
                super.onStart();
                a aVar = b.Companion;
                aVar.getInstance$vungle_ads_release().removeListener(this);
                Context context = this.$weakContext.get();
                if (context == null || !aVar.startActivityHandleException(context, this.$deepLinkOverrideIntent, this.$defaultIntent, this.$adOpenCallback)) {
                    return;
                }
                aVar.getInstance$vungle_ads_release().addOnNextAppLeftCallback(this.$leftCallback);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.b bVar) {
            if (intent == null && intent2 == null) {
                return false;
            }
            try {
                if (intent != null) {
                    context.startActivity(intent);
                    if (bVar != null) {
                        bVar.onDeeplinkClick(true);
                    }
                } else {
                    context.startActivity(intent2);
                }
                return true;
            } catch (Exception e4) {
                k.a aVar = k.Companion;
                String TAG = getTAG();
                kotlin.jvm.internal.l.e(TAG, "TAG");
                aVar.e(TAG, "Cannot launch/find activity to handle the Implicit intent: " + e4);
                if (intent != null) {
                    try {
                        C4055m.logError$vungle_ads_release$default(C4055m.INSTANCE, 312, "Fail to open " + intent.getDataString(), "", (String) null, (String) null, 24, (Object) null);
                        if (bVar != null) {
                            bVar.onDeeplinkClick(false);
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
                if (intent != null && intent2 != null) {
                    context.startActivity(intent2);
                    return true;
                }
                return false;
            }
        }

        public final void addLifecycleListener(c listener) {
            kotlin.jvm.internal.l.f(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final long getCONFIG_CHANGE_DELAY() {
            return b.CONFIG_CHANGE_DELAY;
        }

        public final b getInstance$vungle_ads_release() {
            return b.instance;
        }

        public final String getTAG() {
            return b.TAG;
        }

        public final long getTIMEOUT() {
            return b.TIMEOUT;
        }

        public final void init(Context context) {
            kotlin.jvm.internal.l.f(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final void startWhenForeground(Context context, Intent intent, Intent intent2, InterfaceC0396b interfaceC0396b, com.vungle.ads.internal.ui.b bVar) {
            kotlin.jvm.internal.l.f(context, "context");
            WeakReference weakReference = new WeakReference(context);
            if (!getInstance$vungle_ads_release().inForeground()) {
                getInstance$vungle_ads_release().addListener(new C0395a(weakReference, intent, intent2, bVar, interfaceC0396b));
            } else if (startActivityHandleException(context, intent, intent2, bVar)) {
                getInstance$vungle_ads_release().addOnNextAppLeftCallback(interfaceC0396b);
            }
        }

        private a() {
        }

        public final void startWhenForeground(Context context, Intent intent, Intent intent2, InterfaceC0396b interfaceC0396b) {
            kotlin.jvm.internal.l.f(context, "context");
            startWhenForeground(context, intent, intent2, interfaceC0396b, null);
        }

        public static /* synthetic */ void getCONFIG_CHANGE_DELAY$annotations() {
        }

        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTIMEOUT$annotations() {
        }
    }

    /* compiled from: ActivityManager.kt */
    /* renamed from: com.vungle.ads.internal.util.b$b, reason: collision with other inner class name */
    public interface InterfaceC0396b {
        void onLeftApplication();
    }

    /* compiled from: ActivityManager.kt */
    public enum d {
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        UNKNOWN
    }

    /* compiled from: ActivityManager.kt */
    public static final class e extends c {
        final /* synthetic */ Runnable $cancelRunnable;
        final /* synthetic */ WeakReference<InterfaceC0396b> $weakCallback;

        public e(WeakReference<InterfaceC0396b> weakReference, Runnable runnable) {
            this.$weakCallback = weakReference;
            this.$cancelRunnable = runnable;
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onStart() {
            a aVar = b.Companion;
            aVar.getInstance$vungle_ads_release().removeListener(this);
            c cVar = (c) b.this.adLeftCallbacks.get(this.$weakCallback.get());
            if (cVar != null) {
                Handler handler = b.this.handler;
                if (handler != null) {
                    handler.postDelayed(this.$cancelRunnable, aVar.getTIMEOUT());
                }
                b.this.addListener(cVar);
            }
        }
    }

    /* compiled from: ActivityManager.kt */
    public static final class f extends c {
        final /* synthetic */ Runnable $cancelRunnable;
        final /* synthetic */ WeakReference<InterfaceC0396b> $weakCallback;
        final /* synthetic */ b this$0;
        private boolean wasPaused;

        public f(WeakReference<InterfaceC0396b> weakReference, b bVar, Runnable runnable) {
            this.$weakCallback = weakReference;
            this.this$0 = bVar;
            this.$cancelRunnable = runnable;
        }

        public final boolean getWasPaused() {
            return this.wasPaused;
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onPause() {
            super.onPause();
            this.wasPaused = true;
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.removeCallbacks(this.$cancelRunnable);
            }
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onResume() {
            super.onResume();
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.postDelayed(this.$cancelRunnable, b.Companion.getCONFIG_CHANGE_DELAY() * 2);
            }
        }

        @Override // com.vungle.ads.internal.util.b.c
        public void onStop() {
            super.onStop();
            InterfaceC0396b interfaceC0396b = this.$weakCallback.get();
            if (this.wasPaused && interfaceC0396b != null && this.this$0.adLeftCallbacks.containsKey(interfaceC0396b)) {
                interfaceC0396b.onLeftApplication();
            }
            this.this$0.removeOnNextAppLeftCallback(interfaceC0396b);
            Handler handler = this.this$0.handler;
            if (handler != null) {
                handler.removeCallbacks(this.$cancelRunnable);
            }
        }

        public final void setWasPaused(boolean z10) {
            this.wasPaused = z10;
        }
    }

    /* compiled from: ActivityManager.kt */
    public static final class g implements Runnable {
        final /* synthetic */ WeakReference<InterfaceC0396b> $weakCallback;

        public g(WeakReference<InterfaceC0396b> weakReference) {
            this.$weakCallback = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            Handler handler = b.this.handler;
            if (handler != null) {
                handler.removeCallbacks(this);
            }
            b.this.removeOnNextAppLeftCallback(this.$weakCallback.get());
        }
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configChangeRunnable$lambda-0, reason: not valid java name */
    public static final void m110configChangeRunnable$lambda0(b this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        if (this$0.getNoResumedActivities()) {
            d dVar = this$0.state;
            d dVar2 = d.PAUSED;
            if (dVar != dVar2) {
                this$0.state = dVar2;
                Iterator<c> it = this$0.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onPause();
                }
            }
        }
        if (this$0.getNoStartedActivities() && this$0.state == d.PAUSED) {
            this$0.state = d.STOPPED;
            Iterator<c> it2 = this$0.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    private final boolean getNoResumedActivities() {
        return this.resumedActivities.isEmpty();
    }

    private final boolean getNoStartedActivities() {
        return this.startedActivities.isEmpty();
    }

    private final int getResumedActivitiesCount() {
        return this.resumedActivities.size();
    }

    private final int getStartedActivitiesCount() {
        return this.startedActivities.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean inForeground() {
        return !this.isInitialized.get() || this.lastStoppedActivityName == null || isAppForeground();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: init$lambda-1, reason: not valid java name */
    public static final void m111init$lambda1(Context context, b this$0) {
        kotlin.jvm.internal.l.f(context, "$context");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(this$0);
    }

    private final boolean isAppForeground() {
        return !this.resumedActivities.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener(c cVar) {
        this.callbacks.remove(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnNextAppLeftCallback(InterfaceC0396b interfaceC0396b) {
        c cVarRemove;
        if (interfaceC0396b == null || (cVarRemove = this.adLeftCallbacks.remove(interfaceC0396b)) == null) {
            return;
        }
        removeListener(cVarRemove);
    }

    public final void addListener(c callback) {
        kotlin.jvm.internal.l.f(callback, "callback");
        this.callbacks.add(callback);
    }

    public final void addOnNextAppLeftCallback(InterfaceC0396b interfaceC0396b) {
        if (interfaceC0396b == null) {
            return;
        }
        if (!this.isInitialized.get()) {
            interfaceC0396b.onLeftApplication();
            return;
        }
        WeakReference weakReference = new WeakReference(interfaceC0396b);
        g gVar = new g(weakReference);
        f fVar = new f(weakReference, this, gVar);
        this.adLeftCallbacks.put(interfaceC0396b, fVar);
        if (!inForeground()) {
            instance.addListener(new e(weakReference, gVar));
            return;
        }
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(gVar, TIMEOUT);
        }
        addListener(fVar);
    }

    public final void deInit(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.startedActivities.clear();
        this.resumedActivities.clear();
        this.isInitialized.set(false);
        this.callbacks.clear();
        this.adLeftCallbacks.clear();
    }

    public final void init(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Handler handler = new Handler(Looper.getMainLooper());
            this.handler = handler;
            handler.post(new B.c(28, context, this));
        } catch (Exception e4) {
            k.a aVar = k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.e(TAG2, "Error initializing ActivityManager", e4);
            this.isInitialized.set(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.resumedActivities.remove(activity.toString());
        if (getNoResumedActivities()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
            Handler handler2 = this.handler;
            if (handler2 != null) {
                handler2.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        boolean noResumedActivities = getNoResumedActivities();
        this.resumedActivities.add(activity.toString());
        if (getResumedActivitiesCount() == 1) {
            if (noResumedActivities) {
                d dVar = d.RESUMED;
                if (!u.G(dVar).contains(this.state)) {
                    this.state = dVar;
                    Iterator<c> it = this.callbacks.iterator();
                    while (it.hasNext()) {
                        it.next().onResume();
                    }
                    return;
                }
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.startedActivities.add(activity.toString());
        if (getStartedActivitiesCount() == 1) {
            d dVar = d.STARTED;
            if (C2092m.W(dVar, d.RESUMED).contains(this.state)) {
                return;
            }
            this.state = dVar;
            Iterator<c> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Handler handler;
        kotlin.jvm.internal.l.f(activity, "activity");
        this.lastStoppedActivityName = activity.toString();
        this.startedActivities.remove(activity.toString());
        if (!getNoStartedActivities() || (handler = this.handler) == null) {
            return;
        }
        handler.removeCallbacks(this.configChangeRunnable);
        handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
    }

    /* compiled from: ActivityManager.kt */
    public static class c {
        public void onPause() {
        }

        public void onResume() {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }
}
