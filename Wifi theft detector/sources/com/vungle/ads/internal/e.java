package com.vungle.ads.internal;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.util.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class e {
    private static final int MIN_VISIBILITY_PERCENTAGE = 1;
    private static final int VISIBILITY_THROTTLE_MILLIS = 100;

    @NotNull
    private final Rect clipRect;
    private boolean isVisibilityScheduled;

    @NotNull
    private final ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private boolean setViewTreeObserverSucceed;

    @NotNull
    private final Map<View, c> trackedViews;

    @NotNull
    private final Handler visibilityHandler;

    @NotNull
    private final d visibilityRunnable;

    @NotNull
    private WeakReference<ViewTreeObserver> weakViewTreeObserver;

    @NotNull
    public static final a Companion = new a(null);
    private static final String TAG = e.class.getSimpleName();

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i iVar) {
            this();
        }

        private a() {
        }
    }

    public interface b {
        void onImpression(@Nullable View view);

        void onViewInvisible(@Nullable View view);
    }

    public static final class c {

        @Nullable
        private b impressionListener;
        private int minViewablePercent;

        @Nullable
        public final b getImpressionListener() {
            return this.impressionListener;
        }

        public final int getMinViewablePercent() {
            return this.minViewablePercent;
        }

        public final void setImpressionListener(@Nullable b bVar) {
            this.impressionListener = bVar;
        }

        public final void setMinViewablePercent(int i10) {
            this.minViewablePercent = i10;
        }
    }

    public final class d implements Runnable {

        @NotNull
        private final ArrayList<View> visibleViews = new ArrayList<>();

        @NotNull
        private final ArrayList<View> invisibleViews = new ArrayList<>();

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b impressionListener;
            b impressionListener2;
            int i10 = 0;
            e.this.isVisibilityScheduled = false;
            for (Map.Entry entry : e.this.trackedViews.entrySet()) {
                View view = (View) entry.getKey();
                if (e.this.isVisible(view, ((c) entry.getValue()).getMinViewablePercent())) {
                    this.visibleViews.add(view);
                } else {
                    this.invisibleViews.add(view);
                }
            }
            ArrayList<View> arrayList = this.visibleViews;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                View view2 = arrayList.get(i11);
                i11++;
                View view3 = view2;
                c cVar = (c) e.this.trackedViews.get(view3);
                if (cVar != null && (impressionListener2 = cVar.getImpressionListener()) != null) {
                    impressionListener2.onImpression(view3);
                }
                e eVar = e.this;
                p.d(view3, "view");
                eVar.removeView(view3);
            }
            this.visibleViews.clear();
            ArrayList<View> arrayList2 = this.invisibleViews;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                View view4 = arrayList2.get(i10);
                i10++;
                View view5 = view4;
                c cVar2 = (c) e.this.trackedViews.get(view5);
                if (cVar2 != null && (impressionListener = cVar2.getImpressionListener()) != null) {
                    impressionListener.onViewInvisible(view5);
                }
            }
            this.invisibleViews.clear();
            if (e.this.trackedViews.isEmpty() || e.this.setViewTreeObserverSucceed) {
                return;
            }
            e.this.scheduleVisibilityCheck();
        }
    }

    @VisibleForTesting
    public e(@NotNull Context context, @NotNull Map<View, c> trackedViews, @NotNull Handler visibilityHandler) {
        p.e(context, "context");
        p.e(trackedViews, "trackedViews");
        p.e(visibilityHandler, "visibilityHandler");
        this.trackedViews = trackedViews;
        this.visibilityHandler = visibilityHandler;
        this.clipRect = new Rect();
        this.visibilityRunnable = new d();
        this.onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.vungle.ads.internal.d
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                return e.m310_init_$lambda0(this.f20161a);
            }
        };
        this.weakViewTreeObserver = new WeakReference<>(null);
        this.setViewTreeObserverSucceed = setViewTreeObserver(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final boolean m310_init_$lambda0(e this$0) {
        p.e(this$0, "this$0");
        this$0.scheduleVisibilityCheck();
        return true;
    }

    @VisibleForTesting
    public static /* synthetic */ void getOnPreDrawListener$annotations() {
    }

    private final View getTopView(Context context, View view) {
        Window window;
        View decorView;
        View viewFindViewById = null;
        if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewFindViewById = decorView.findViewById(R.id.content);
        }
        if (viewFindViewById == null && view != null) {
            if (!ViewCompat.P(view)) {
                p.a aVar = com.vungle.ads.internal.util.p.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.p.d(TAG2, "TAG");
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

    @VisibleForTesting
    public static /* synthetic */ void getWeakViewTreeObserver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isVisible(View view, int i10) {
        if (view != null && view.getVisibility() == 0 && view.getParent() != null) {
            ViewParent parent = view.getParent();
            while (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() != 0) {
                    com.vungle.ads.internal.util.p.Companion.w("ImpressionTracker", "Parent visibility is not visible: " + parent);
                    return false;
                }
                parent = viewGroup.getParent();
            }
            if (!view.getGlobalVisibleRect(this.clipRect)) {
                return false;
            }
            long jHeight = this.clipRect.height() * this.clipRect.width();
            long height = view.getHeight() * view.getWidth();
            if (height > 0 && 100 * jHeight >= i10 * height) {
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
            p.a aVar = com.vungle.ads.internal.util.p.Companion;
            String TAG2 = TAG;
            kotlin.jvm.internal.p.d(TAG2, "TAG");
            aVar.d(TAG2, "Unable to set ViewTreeObserver due to no available root view.");
            return false;
        }
        ViewTreeObserver viewTreeObserver2 = topView.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            this.weakViewTreeObserver = new WeakReference<>(viewTreeObserver2);
            viewTreeObserver2.addOnPreDrawListener(this.onPreDrawListener);
            return true;
        }
        p.a aVar2 = com.vungle.ads.internal.util.p.Companion;
        String TAG3 = TAG;
        kotlin.jvm.internal.p.d(TAG3, "TAG");
        aVar2.d(TAG3, "The root view tree observer was not alive");
        return false;
    }

    public final void addView(@NotNull View view, @Nullable b bVar) {
        kotlin.jvm.internal.p.e(view, "view");
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

    @NotNull
    public final ViewTreeObserver.OnPreDrawListener getOnPreDrawListener() {
        return this.onPreDrawListener;
    }

    @NotNull
    public final WeakReference<ViewTreeObserver> getWeakViewTreeObserver() {
        return this.weakViewTreeObserver;
    }

    @VisibleForTesting
    public final void removeView(@NotNull View view) {
        kotlin.jvm.internal.p.e(view, "view");
        this.trackedViews.remove(view);
    }

    public final void setWeakViewTreeObserver(@NotNull WeakReference<ViewTreeObserver> weakReference) {
        kotlin.jvm.internal.p.e(weakReference, "<set-?>");
        this.weakViewTreeObserver = weakReference;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        this(context, new WeakHashMap(10), new Handler(Looper.getMainLooper()));
        kotlin.jvm.internal.p.e(context, "context");
    }
}
