package com.vungle.ads.internal;

import L0.I;
import L0.S;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.vungle.ads.internal.util.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: ImpressionTracker.kt */
/* loaded from: classes2.dex */
public final class i {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;
    private final Rect clipRect;
    private boolean isVisibilityScheduled;
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;
    private final Map<View, c> trackedViews;
    private final Handler visibilityHandler;
    private final d visibilityRunnable;
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;
    public static final a Companion = new a(null);
    private static final String TAG = i.class.getSimpleName();

    /* compiled from: ImpressionTracker.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: ImpressionTracker.kt */
    public interface b {
        void onImpression(View view);
    }

    /* compiled from: ImpressionTracker.kt */
    public static final class c {
        private b impressionListener;
        private int minViewablePercent;

        public final b getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(b bVar) {
            this.impressionListener = bVar;
        }

        public final void setMinViewablePercent(int i) {
            this.minViewablePercent = i;
        }
    }

    /* compiled from: ImpressionTracker.kt */
    public final class d implements Runnable {
        private final ArrayList<View> visibleViews = new ArrayList<>();

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b impressionListener;
            i.this.isVisibilityScheduled = false;
            for (Map.Entry entry : i.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (i.this.isVisible(view, ((c) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                }
            }
            Iterator<View> it = this.visibleViews.iterator();
            while (it.hasNext()) {
                View view2 = it.next();
                c cVar = (c) i.this.trackedViews.get(view2);
                if (cVar != null && (impressionListener = cVar.getImpressionListener()) != null) {
                    impressionListener.onImpression(view2);
                }
                i iVar = i.this;
                kotlin.jvm.internal.l.e(view2, "view");
                iVar.removeView(view2);
            }
            this.visibleViews.clear();
            if (i.this.trackedViews.isEmpty() || i.this.setViewTreeObserverSucceed) {
                return;
            }
            i.this.scheduleVisibilityCheck();
        }
    }

    public i(Context context, Map<View, c> trackedViews, Handler visibilityHandler) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(trackedViews, "trackedViews");
        kotlin.jvm.internal.l.f(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new d();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.h
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return i.m52_init_$lambda0(this.f23808b);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m52_init_$lambda0(i this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    private final View getTopView(Context context, View view) {
        View viewFindViewById = context instanceof Activity ? ((Activity) context).getWindow().getDecorView().findViewById(R.id.content) : null;
        if (viewFindViewById == null && view != null) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            if (!view.isAttachedToWindow()) {
                k.a aVar = com.vungle.ads.internal.util.k.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.w(TAG2, "Trying to call View#rootView() on an unattached View.");
            }
            View rootView = view.getRootView();
            if (rootView != null) {
                viewFindViewById = rootView.findViewById(R.id.content);
            }
            if (viewFindViewById == null) {
                return rootView;
            }
        }
        return viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    com.vungle.ads.internal.util.k.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (!view.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long jHeight = this.clipRect.height() * this.clipRect.width();
            long height = view.getHeight() * view.getWidth();
            if (height > 0 && 100 * jHeight >= i * height) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleVisibilityCheck() {
        if (this.isVisibilityScheduled) {
            return;
        }
        this.isVisibilityScheduled = true;
        this.visibilityHandler.postDelayed(this.visibilityRunnable, 100L);
    }

    private final boolean setViewTreeObserver(Context context, View view) {
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            return true;
        }
        View topView = getTopView(context, view);
        if (topView == null) {
            k.a aVar = com.vungle.ads.internal.util.k.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.l.e(TAG2, "TAG");
            aVar.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        k.a aVar2 = com.vungle.ads.internal.util.k.Companion;
        String TAG3 = TAG;
        kotlin.jvm.internal.l.e(TAG3, "TAG");
        aVar2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(View view, b bVar) {
        kotlin.jvm.internal.l.f(view, "view");
        this.setViewTreeObserverSucceed = setViewTreeObserver(view.getContext(), view);
        c cVar = this.trackedViews.get(view);
        if (cVar == null) {
            cVar = new c();
            this.trackedViews.put(view, cVar);
            scheduleVisibilityCheck();
        }
        cVar.setMinViewablePercent(1);
        cVar.setImpressionListener(bVar);
    }

    public final void clear() {
        this.trackedViews.clear();
        this.visibilityHandler.removeMessages(0);
        this.isVisibilityScheduled = false;
    }

    public final void destroy() {
        clear();
        ViewTreeObserver viewTreeObserver = this.weakViewTreeObserver.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.onPreDrawListener);
        }
        this.weakViewTreeObserver.clear();
    }

    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    public final void removeView(View view) {
        kotlin.jvm.internal.l.f(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(WeakReference<ViewTreeObserver> weakReference) {
        kotlin.jvm.internal.l.f(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, new WeakHashMap(10), new Handler());
        kotlin.jvm.internal.l.f(context, "context");
    }

    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }
}
