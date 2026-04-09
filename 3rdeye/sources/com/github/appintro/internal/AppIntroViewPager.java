package com.github.appintro.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import androidx.viewpager.widget.ViewPager;
import com.github.appintro.AppIntroBase;
import com.github.appintro.AppIntroPageTransformerType;
import com.github.appintro.AppIntroViewPagerListener;
import com.github.appintro.internal.viewpager.ViewPagerTransformer;
import java.lang.reflect.Field;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;

/* compiled from: AppIntroViewPager.kt */
/* loaded from: classes.dex */
public final class AppIntroViewPager extends ViewPager {

    @Deprecated
    private static final int ON_ILLEGALLY_REQUESTED_NEXT_PAGE_MAX_INTERVAL = 1000;
    private float currentTouchDownX;
    private float currentTouchDownY;
    private ScrollerCustomDuration customScroller;
    private long illegallyRequestedNextPageLastCalled;
    private boolean isFullPagingEnabled;
    private boolean isPermissionSlide;
    private AppIntroViewPagerListener onNextPageRequestedListener;
    private ViewPager.j pageChangeListener;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = LogHelper.INSTANCE.makeLogTag(x.a(AppIntroViewPager.class));

    /* compiled from: AppIntroViewPager.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppIntroViewPager(Context context, AttributeSet attrs) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super(context, attrs);
        l.f(context, "context");
        l.f(attrs, "attrs");
        this.isFullPagingEnabled = true;
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            Field declaredField2 = ViewPager.class.getDeclaredField("sInterpolator");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(null);
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.animation.Interpolator");
            }
            ScrollerCustomDuration scrollerCustomDuration = new ScrollerCustomDuration(context, (Interpolator) obj);
            this.customScroller = scrollerCustomDuration;
            declaredField.set(this, scrollerCustomDuration);
        } catch (NoSuchFieldException e4) {
            LogHelper.e(TAG, "Failed to access the viewpager interpolator", e4);
        }
    }

    private final boolean handleTouchEvent(MotionEvent motionEvent) {
        AppIntroViewPagerListener appIntroViewPagerListener;
        AppIntroViewPagerListener appIntroViewPagerListener2;
        if (!this.isFullPagingEnabled) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            this.currentTouchDownX = motionEvent.getX();
            this.currentTouchDownY = motionEvent.getY();
        } else {
            if (motionEvent.getAction() == 1) {
                performClick();
            }
            AppIntroViewPagerListener appIntroViewPagerListener3 = this.onNextPageRequestedListener;
            if (!(appIntroViewPagerListener3 != null ? appIntroViewPagerListener3.onCanRequestNextPage() : true) && isSwipeForward(this.currentTouchDownX, motionEvent.getX())) {
                if (userIllegallyRequestNextPage() && (appIntroViewPagerListener2 = this.onNextPageRequestedListener) != null) {
                    appIntroViewPagerListener2.onIllegallyRequestedNextPage();
                }
                return false;
            }
            if (this.isPermissionSlide && isSwipeForward(this.currentTouchDownX, motionEvent.getX()) && (appIntroViewPagerListener = this.onNextPageRequestedListener) != null) {
                appIntroViewPagerListener.onUserRequestedPermissionsDialog();
            }
        }
        return this.isFullPagingEnabled;
    }

    private final boolean isSwipeForward(float f10, float f11) {
        Context context = getContext();
        l.e(context, "context");
        return LayoutUtil.isRtl(context) ? f11 > f10 : f10 > f11;
    }

    private final boolean userIllegallyRequestNextPage() {
        if (System.currentTimeMillis() - this.illegallyRequestedNextPageLastCalled < 1000) {
            return false;
        }
        this.illegallyRequestedNextPageLastCalled = System.currentTimeMillis();
        return true;
    }

    public final void addOnPageChangeListener$appintro_release(AppIntroBase.OnPageChangeListener listener) {
        l.f(listener, "listener");
        super.addOnPageChangeListener(listener);
        this.pageChangeListener = listener;
    }

    public final int getCurrentSlideNumber(int i) {
        Context context = getContext();
        l.e(context, "context");
        return LayoutUtil.isRtl(context) ? i - getCurrentItem() : getCurrentItem() + 1;
    }

    public final AppIntroViewPagerListener getOnNextPageRequestedListener() {
        return this.onNextPageRequestedListener;
    }

    public final void goToNextSlide() {
        int currentItem = getCurrentItem();
        Context context = getContext();
        l.e(context, "context");
        setCurrentItem(currentItem + (!LayoutUtil.isRtl(context) ? 1 : -1));
    }

    public final void goToPreviousSlide() {
        int currentItem = getCurrentItem();
        Context context = getContext();
        l.e(context, "context");
        setCurrentItem(currentItem + (!LayoutUtil.isRtl(context) ? -1 : 1));
    }

    public final boolean isFirstSlide(int i) {
        Context context = getContext();
        l.e(context, "context");
        return LayoutUtil.isRtl(context) ? (getCurrentItem() - i) + 1 == 0 : getCurrentItem() == 0;
    }

    public final boolean isFullPagingEnabled() {
        return this.isFullPagingEnabled;
    }

    public final boolean isLastSlide(int i) {
        Context context = getContext();
        l.e(context, "context");
        return LayoutUtil.isRtl(context) ? getCurrentItem() == 0 : (getCurrentItem() - i) + 1 == 0;
    }

    public final boolean isPermissionSlide() {
        return this.isPermissionSlide;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        l.f(event, "event");
        if (handleTouchEvent(event)) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        l.f(event, "event");
        if (handleTouchEvent(event)) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final void reCenterCurrentSlide$appintro_release() {
        int currentItem = getCurrentItem();
        setCurrentItem(Math.max(currentItem - 1, 0), false);
        setCurrentItem(currentItem, false);
    }

    public final void setAppIntroPageTransformer(AppIntroPageTransformerType appIntroTransformer) {
        l.f(appIntroTransformer, "appIntroTransformer");
        setPageTransformer(true, new ViewPagerTransformer(appIntroTransformer));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        ViewPager.j jVar;
        int currentItem = super.getCurrentItem();
        super.setCurrentItem(i);
        if (currentItem == 0 && i == 0 && (jVar = this.pageChangeListener) != null) {
            jVar.onPageSelected(0);
        }
    }

    public final void setFullPagingEnabled(boolean z10) {
        this.isFullPagingEnabled = z10;
    }

    public final void setOnNextPageRequestedListener(AppIntroViewPagerListener appIntroViewPagerListener) {
        this.onNextPageRequestedListener = appIntroViewPagerListener;
    }

    public final void setPermissionSlide(boolean z10) {
        this.isPermissionSlide = z10;
    }

    public final void setScrollDurationFactor(double d10) {
        ScrollerCustomDuration scrollerCustomDuration = this.customScroller;
        if (scrollerCustomDuration == null) {
            return;
        }
        scrollerCustomDuration.setScrollDurationFactor(d10);
    }
}
