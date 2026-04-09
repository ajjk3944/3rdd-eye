package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class a implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private static final String TAG = "ActivityManager";
    private volatile int foregroundActivityCount;
    private volatile boolean isAppInForeground;

    @Nullable
    private volatile c targetActivityInfo;

    @NotNull
    public static final C0373a Companion = new C0373a(null);

    @NotNull
    private static final a instance = new a();

    @NotNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);

    @NotNull
    private final CopyOnWriteArraySet<b> callbacks = new CopyOnWriteArraySet<>();

    /* renamed from: com.vungle.ads.internal.util.a$a, reason: collision with other inner class name */
    public static final class C0373a {
        public /* synthetic */ C0373a(kotlin.jvm.internal.i iVar) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void getInstance$vungle_ads_release$annotations() {
        }

        public final void addLifecycleListener(@NotNull b listener) {
            kotlin.jvm.internal.p.e(listener, "listener");
            getInstance$vungle_ads_release().addListener(listener);
        }

        public final void deInit$vungle_ads_release(@NotNull Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            getInstance$vungle_ads_release().deInit(context);
        }

        @NotNull
        public final a getInstance$vungle_ads_release() {
            return a.instance;
        }

        public final void init(@NotNull Context context) {
            kotlin.jvm.internal.p.e(context, "context");
            getInstance$vungle_ads_release().init(context);
        }

        public final boolean isForeground() {
            return getInstance$vungle_ads_release().isAppInForeground();
        }

        public final void removeLifecycleListener(@NotNull b listener) {
            kotlin.jvm.internal.p.e(listener, "listener");
            getInstance$vungle_ads_release().removeListener(listener);
        }

        public final boolean startWhenForeground(@NotNull Context context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable com.vungle.ads.internal.ui.b bVar) {
            kotlin.jvm.internal.p.e(context, "context");
            if (isForeground()) {
                return getInstance$vungle_ads_release().startActivitySafely(context, intent, intent2, bVar);
            }
            getInstance$vungle_ads_release().targetActivityInfo = new c(new WeakReference(context), intent, intent2, bVar);
            return false;
        }

        private C0373a() {
        }
    }

    public static class b {
        public void onBackground() {
        }

        public void onForeground() {
        }
    }

    public static final class c {

        @Nullable
        private final com.vungle.ads.internal.ui.b adOpenCallback;

        @NotNull
        private final WeakReference<Context> context;

        @Nullable
        private final Intent deepLinkOverrideIntent;

        @Nullable
        private final Intent defaultIntent;

        public c(@NotNull WeakReference<Context> context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable com.vungle.ads.internal.ui.b bVar) {
            kotlin.jvm.internal.p.e(context, "context");
            this.context = context;
            this.deepLinkOverrideIntent = intent;
            this.defaultIntent = intent2;
            this.adOpenCallback = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ c copy$default(c cVar, WeakReference weakReference, Intent intent, Intent intent2, com.vungle.ads.internal.ui.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = cVar.context;
            }
            if ((i10 & 2) != 0) {
                intent = cVar.deepLinkOverrideIntent;
            }
            if ((i10 & 4) != 0) {
                intent2 = cVar.defaultIntent;
            }
            if ((i10 & 8) != 0) {
                bVar = cVar.adOpenCallback;
            }
            return cVar.copy(weakReference, intent, intent2, bVar);
        }

        @NotNull
        public final WeakReference<Context> component1() {
            return this.context;
        }

        @Nullable
        public final Intent component2() {
            return this.deepLinkOverrideIntent;
        }

        @Nullable
        public final Intent component3() {
            return this.defaultIntent;
        }

        @Nullable
        public final com.vungle.ads.internal.ui.b component4() {
            return this.adOpenCallback;
        }

        @NotNull
        public final c copy(@NotNull WeakReference<Context> context, @Nullable Intent intent, @Nullable Intent intent2, @Nullable com.vungle.ads.internal.ui.b bVar) {
            kotlin.jvm.internal.p.e(context, "context");
            return new c(context, intent, intent2, bVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.p.a(this.context, cVar.context) && kotlin.jvm.internal.p.a(this.deepLinkOverrideIntent, cVar.deepLinkOverrideIntent) && kotlin.jvm.internal.p.a(this.defaultIntent, cVar.defaultIntent) && kotlin.jvm.internal.p.a(this.adOpenCallback, cVar.adOpenCallback);
        }

        @Nullable
        public final com.vungle.ads.internal.ui.b getAdOpenCallback() {
            return this.adOpenCallback;
        }

        @NotNull
        public final WeakReference<Context> getContext() {
            return this.context;
        }

        @Nullable
        public final Intent getDeepLinkOverrideIntent() {
            return this.deepLinkOverrideIntent;
        }

        @Nullable
        public final Intent getDefaultIntent() {
            return this.defaultIntent;
        }

        public int hashCode() {
            int iHashCode = this.context.hashCode() * 31;
            Intent intent = this.deepLinkOverrideIntent;
            int iHashCode2 = (iHashCode + (intent == null ? 0 : intent.hashCode())) * 31;
            Intent intent2 = this.defaultIntent;
            int iHashCode3 = (iHashCode2 + (intent2 == null ? 0 : intent2.hashCode())) * 31;
            com.vungle.ads.internal.ui.b bVar = this.adOpenCallback;
            return iHashCode3 + (bVar != null ? bVar.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TargetActivityInfo(context=" + this.context + ", deepLinkOverrideIntent=" + this.deepLinkOverrideIntent + ", defaultIntent=" + this.defaultIntent + ", adOpenCallback=" + this.adOpenCallback + ')';
        }
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addListener(b bVar) {
        this.callbacks.add(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deInit(Context context) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.p.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
        this.isInitialized.set(false);
        this.targetActivityInfo = null;
        this.foregroundActivityCount = 0;
        this.isAppInForeground = false;
        this.callbacks.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void init(Context context) {
        Object objB;
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.p.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            objB = Result.b(y8.s.f25199a);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(kotlin.c.a(th));
        }
        Throwable thE = Result.e(objB);
        if (thE != null) {
            p.Companion.e(TAG, "Error initializing ActivityManager", thE);
            this.isInitialized.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAppInForeground() {
        return !this.isInitialized.get() || this.isAppInForeground;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean startActivitySafely(Context context, Intent intent, Intent intent2, com.vungle.ads.internal.ui.b bVar) {
        try {
        } catch (Exception e10) {
            p.Companion.e(TAG, "Failed to start activity: " + e10);
            if (intent != null && bVar != null) {
                try {
                    bVar.onDeeplinkClick(false);
                } catch (Exception unused) {
                }
            }
            if (intent != null && intent2 != null) {
                context.startActivity(intent2);
                return true;
            }
        }
        if (intent == null) {
            if (intent2 != null) {
                context.startActivity(intent2);
            }
            return false;
        }
        context.startActivity(intent);
        if (bVar != null) {
            bVar.onDeeplinkClick(true);
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        kotlin.jvm.internal.p.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NotNull Activity activity) {
        kotlin.jvm.internal.p.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NotNull Activity activity) {
        kotlin.jvm.internal.p.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NotNull Activity activity) {
        kotlin.jvm.internal.p.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        kotlin.jvm.internal.p.e(activity, "activity");
        kotlin.jvm.internal.p.e(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NotNull Activity activity) {
        kotlin.jvm.internal.p.e(activity, "activity");
        this.foregroundActivityCount++;
        if (this.isAppInForeground || this.foregroundActivityCount != 1) {
            return;
        }
        this.isAppInForeground = true;
        c cVar = this.targetActivityInfo;
        if (cVar != null) {
            Context it = cVar.getContext().get();
            if (it != null) {
                C0373a c0373a = Companion;
                kotlin.jvm.internal.p.d(it, "it");
                c0373a.startWhenForeground(it, cVar.getDeepLinkOverrideIntent(), cVar.getDefaultIntent(), cVar.getAdOpenCallback());
            }
            this.targetActivityInfo = null;
        }
        Iterator<T> it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((b) it2.next()).onForeground();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NotNull Activity activity) {
        kotlin.jvm.internal.p.e(activity, "activity");
        this.foregroundActivityCount--;
        if (this.isAppInForeground && this.foregroundActivityCount == 0) {
            this.isAppInForeground = false;
            Iterator<T> it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((b) it.next()).onBackground();
            }
        }
    }

    public final void removeListener(@NotNull b callback) {
        kotlin.jvm.internal.p.e(callback, "callback");
        this.callbacks.remove(callback);
    }
}
