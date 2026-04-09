package com.github.appintro;

import C8.a;
import D8.e;
import F8.c;
import android.animation.ArgbEvaluator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ComponentCallbacksC1759l;
import androidx.fragment.app.x;
import androidx.lifecycle.j0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import c9.C2092m;
import com.github.appintro.indicator.DotIndicatorController;
import com.github.appintro.indicator.IndicatorController;
import com.github.appintro.indicator.ProgressIndicatorController;
import com.github.appintro.internal.AppIntroViewPager;
import com.github.appintro.internal.LayoutUtil;
import com.github.appintro.internal.LogHelper;
import com.github.appintro.internal.PermissionWrapper;
import com.github.appintro.internal.viewpager.PagerAdapter;
import h.AbstractC4401e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import o.a0;
import o.e0;
import y0.C5788a;
import z0.C5848a;

/* compiled from: AppIntroBase.kt */
/* loaded from: classes.dex */
public abstract class AppIntroBase extends AppCompatActivity implements AppIntroViewPagerListener {

    @Deprecated
    private static final String ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED = "colorTransitionEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_CURRENT_ITEM = "currentItem";

    @Deprecated
    private static final String ARG_BUNDLE_IS_BUTTONS_ENABLED = "isButtonsEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_IS_FULL_PAGING_ENABLED = "isFullPagingEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_IS_INDICATOR_ENABLED = "isIndicatorEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED = "isSkipButtonsEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_PERMISSION_MAP = "permissionMap";

    @Deprecated
    private static final String ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED = "retainIsButtonsEnabled";

    @Deprecated
    private static final String ARG_BUNDLE_SLIDES_NUMBER = "slidesNumber";

    @Deprecated
    private static final int DEFAULT_SCROLL_DURATION_FACTOR = 1;

    @Deprecated
    private static final long DEFAULT_VIBRATE_DURATION = 20;

    @Deprecated
    private static final int PERMISSIONS_REQUEST_ALL_PERMISSIONS = 1;
    private View backButton;
    private View doneButton;
    private ViewGroup indicatorContainer;
    private IndicatorController indicatorController;
    private boolean isColorTransitionsEnabled;
    private boolean isSystemBackButtonLocked;
    private boolean isVibrate;
    private boolean isWizardMode;
    private View nextButton;
    private AppIntroViewPager pager;
    private PagerAdapter pagerAdapter;
    private int savedCurrentItem;
    private View skipButton;
    private int slidesNumber;
    private Vibrator vibrator;
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String TAG = LogHelper.makeLogTag((Class<?>) AppIntroBase.class);
    private boolean isButtonsEnabled = true;
    private boolean isSkipButtonEnabled = true;
    private boolean isIndicatorEnabled = true;
    private long vibrateDuration = DEFAULT_VIBRATE_DURATION;
    private int currentlySelectedItem = -1;
    private final List<ComponentCallbacksC1759l> fragments = new ArrayList();
    private HashMap<Integer, PermissionWrapper> permissionsMap = new HashMap<>();
    private boolean retainIsButtonsEnabled = true;
    private final ArgbEvaluator argbEvaluator = new ArgbEvaluator();

    /* compiled from: AppIntroBase.kt */
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: AppIntroBase.kt */
    public final class NextSlideOnClickListener implements View.OnClickListener {
        private boolean isLastSlide;
        final /* synthetic */ AppIntroBase this$0;

        public NextSlideOnClickListener(AppIntroBase this$0, boolean z10) {
            l.f(this$0, "this$0");
            this.this$0 = this$0;
            this.isLastSlide = z10;
        }

        public final boolean isLastSlide() {
            return this.isLastSlide;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            l.f(view, "view");
            this.this$0.dispatchVibration();
            if (!this.this$0.onCanRequestNextPage()) {
                this.this$0.onIllegallyRequestedNextPage();
                return;
            }
            if (this.this$0.shouldRequestPermission()) {
                this.this$0.requestPermissions();
                return;
            }
            PagerAdapter pagerAdapter = this.this$0.pagerAdapter;
            if (pagerAdapter == null) {
                l.l("pagerAdapter");
                throw null;
            }
            AppIntroViewPager appIntroViewPager = this.this$0.pager;
            if (appIntroViewPager == null) {
                l.l("pager");
                throw null;
            }
            ComponentCallbacksC1759l item = pagerAdapter.getItem(appIntroViewPager.getCurrentItem());
            if (this.isLastSlide) {
                this.this$0.onDonePressed(item);
            } else {
                this.this$0.onNextPressed(item);
            }
            this.this$0.goToNextSlide(this.isLastSlide);
        }

        public final void setLastSlide(boolean z10) {
            this.isLastSlide = z10;
        }
    }

    public static /* synthetic */ void askForPermissions$default(AppIntroBase appIntroBase, String[] strArr, int i, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: askForPermissions");
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        appIntroBase.askForPermissions(strArr, i, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void dispatchSlideChangedCallbacks(ComponentCallbacksC1759l componentCallbacksC1759l, ComponentCallbacksC1759l componentCallbacksC1759l2) {
        if (componentCallbacksC1759l instanceof SlideSelectionListener) {
            ((SlideSelectionListener) componentCallbacksC1759l).onSlideDeselected();
        }
        if (componentCallbacksC1759l2 instanceof SlideSelectionListener) {
            ((SlideSelectionListener) componentCallbacksC1759l2).onSlideSelected();
        }
        onSlideChanged(componentCallbacksC1759l, componentCallbacksC1759l2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void dispatchVibration() {
        if (this.isVibrate) {
            Vibrator vibrator = this.vibrator;
            if (vibrator != null) {
                vibrator.vibrate(this.vibrateDuration);
            } else {
                l.l("vibrator");
                throw null;
            }
        }
    }

    private final int getCurrentSlideNumber() {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            return appIntroViewPager.getCurrentSlideNumber(this.fragments.size());
        }
        l.l("pager");
        throw null;
    }

    private final int getSlideColor(SlideBackgroundColorHolder slideBackgroundColorHolder) {
        return slideBackgroundColorHolder.getDefaultBackgroundColorRes() != 0 ? C5848a.getColor(this, slideBackgroundColorHolder.getDefaultBackgroundColorRes()) : slideBackgroundColorHolder.getDefaultBackgroundColor();
    }

    public static /* synthetic */ void goToNextSlide$default(AppIntroBase appIntroBase, boolean z10, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: goToNextSlide");
        }
        if ((i & 1) != 0) {
            AppIntroViewPager appIntroViewPager = appIntroBase.pager;
            if (appIntroViewPager == null) {
                l.l("pager");
                throw null;
            }
            z10 = appIntroViewPager.isLastSlide(appIntroBase.fragments.size());
        }
        appIntroBase.goToNextSlide(z10);
    }

    private final void handleDeniedPermission(String str) {
        if (!C5788a.b(this, str)) {
            onUserDisabledPermission(str);
            return;
        }
        onUserDeniedPermission(str);
        PermissionWrapper permissionWrapper = this.permissionsMap.get(Integer.valueOf(getCurrentSlideNumber()));
        if (permissionWrapper == null || permissionWrapper.getRequired()) {
            return;
        }
        this.permissionsMap.remove(Integer.valueOf(permissionWrapper.getPosition()));
        goToNextSlide$default(this, false, 1, null);
    }

    private final void initializeIndicator() {
        ViewGroup viewGroup = this.indicatorContainer;
        if (viewGroup == null) {
            l.l("indicatorContainer");
            throw null;
        }
        IndicatorController indicatorController = this.indicatorController;
        viewGroup.addView(indicatorController != null ? indicatorController.newInstance(this) : null);
        IndicatorController indicatorController2 = this.indicatorController;
        if (indicatorController2 != null) {
            indicatorController2.initialize(this.slidesNumber);
        }
        IndicatorController indicatorController3 = this.indicatorController;
        if (indicatorController3 == null) {
            return;
        }
        indicatorController3.selectPosition(this.currentlySelectedItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPermissionSlide() {
        HashMap<Integer, PermissionWrapper> map = this.permissionsMap;
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            return map.containsKey(Integer.valueOf(appIntroViewPager.getCurrentSlideNumber(this.fragments.size())));
        }
        l.l("pager");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0, reason: not valid java name */
    public static final void m9onCreate$lambda0(AppIntroBase this$0, View view) {
        l.f(this$0, "this$0");
        AppIntroViewPager appIntroViewPager = this$0.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.goToPreviousSlide();
        } else {
            l.l("pager");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1, reason: not valid java name */
    public static final void m10onCreate$lambda1(AppIntroBase this$0, View view) {
        l.f(this$0, "this$0");
        this$0.dispatchVibration();
        PagerAdapter pagerAdapter = this$0.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this$0.pager;
        if (appIntroViewPager != null) {
            this$0.onSkipPressed(pagerAdapter.getItem(appIntroViewPager.getCurrentItem()));
        } else {
            l.l("pager");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onPostCreate$lambda-2, reason: not valid java name */
    public static final void m11onPostCreate$lambda2(AppIntroBase this$0) {
        l.f(this$0, "this$0");
        PagerAdapter pagerAdapter = this$0.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this$0.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        if (pagerAdapter.getItem(appIntroViewPager.getCurrentItem()) == null) {
            this$0.finish();
            return;
        }
        PagerAdapter pagerAdapter2 = this$0.pagerAdapter;
        if (pagerAdapter2 == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager2 = this$0.pager;
        if (appIntroViewPager2 != null) {
            this$0.dispatchSlideChangedCallbacks(null, pagerAdapter2.getItem(appIntroViewPager2.getCurrentItem()));
        } else {
            l.l("pager");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void performColorTransition(ComponentCallbacksC1759l componentCallbacksC1759l, ComponentCallbacksC1759l componentCallbacksC1759l2, float f10) {
        if (!(componentCallbacksC1759l instanceof SlideBackgroundColorHolder) || !(componentCallbacksC1759l2 instanceof SlideBackgroundColorHolder)) {
            throw new IllegalStateException("Color transitions are only available if all slides implement SlideBackgroundColorHolder.");
        }
        if (componentCallbacksC1759l.isAdded() && componentCallbacksC1759l2.isAdded()) {
            SlideBackgroundColorHolder slideBackgroundColorHolder = (SlideBackgroundColorHolder) componentCallbacksC1759l;
            SlideBackgroundColorHolder slideBackgroundColorHolder2 = (SlideBackgroundColorHolder) componentCallbacksC1759l2;
            Object objEvaluate = this.argbEvaluator.evaluate(f10, Integer.valueOf(getSlideColor(slideBackgroundColorHolder)), Integer.valueOf(getSlideColor(slideBackgroundColorHolder2)));
            if (objEvaluate == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
            int iIntValue = ((Integer) objEvaluate).intValue();
            slideBackgroundColorHolder.setBackgroundColor(iIntValue);
            slideBackgroundColorHolder2.setBackgroundColor(iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestPermissions() {
        setSwipeLock(true);
        PermissionWrapper permissionWrapper = this.permissionsMap.get(Integer.valueOf(getCurrentSlideNumber()));
        if (permissionWrapper == null) {
            return;
        }
        C5788a.a(this, permissionWrapper.getPermissions(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldRequestPermission() {
        return this.permissionsMap.containsKey(Integer.valueOf(getCurrentSlideNumber()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateButtonsVisibility() {
        boolean z10 = false;
        if (!this.isButtonsEnabled) {
            View view = this.nextButton;
            if (view == null) {
                l.l("nextButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view, false);
            View view2 = this.doneButton;
            if (view2 == null) {
                l.l("doneButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view2, false);
            View view3 = this.backButton;
            if (view3 == null) {
                l.l("backButton");
                throw null;
            }
            AppIntroBaseKt.setVisible(view3, false);
            View view4 = this.skipButton;
            if (view4 != null) {
                AppIntroBaseKt.setVisible(view4, false);
                return;
            } else {
                l.l("skipButton");
                throw null;
            }
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        boolean zIsLastSlide = appIntroViewPager.isLastSlide(this.fragments.size());
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 == null) {
            l.l("pager");
            throw null;
        }
        boolean zIsFirstSlide = appIntroViewPager2.isFirstSlide(this.fragments.size());
        View view5 = this.nextButton;
        if (view5 == null) {
            l.l("nextButton");
            throw null;
        }
        AppIntroBaseKt.setVisible(view5, !zIsLastSlide);
        View view6 = this.doneButton;
        if (view6 == null) {
            l.l("doneButton");
            throw null;
        }
        AppIntroBaseKt.setVisible(view6, zIsLastSlide);
        View view7 = this.skipButton;
        if (view7 == null) {
            l.l("skipButton");
            throw null;
        }
        AppIntroBaseKt.setVisible(view7, this.isSkipButtonEnabled && !zIsLastSlide);
        View view8 = this.backButton;
        if (view8 == null) {
            l.l("backButton");
            throw null;
        }
        if (this.isWizardMode && !zIsFirstSlide) {
            z10 = true;
        }
        AppIntroBaseKt.setVisible(view8, z10);
    }

    public final void addSlide(ComponentCallbacksC1759l fragment) {
        l.f(fragment, "fragment");
        if (isRtl$appintro_release()) {
            this.fragments.add(0, fragment);
        } else {
            this.fragments.add(fragment);
        }
        if (this.isWizardMode) {
            AppIntroViewPager appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                l.l("pager");
                throw null;
            }
            appIntroViewPager.setOffscreenPageLimit(this.fragments.size());
        }
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.notifyDataSetChanged();
        } else {
            l.l("pagerAdapter");
            throw null;
        }
    }

    public final void askForPermissions(String[] permissions, int i) {
        l.f(permissions, "permissions");
        askForPermissions$default(this, permissions, i, false, 4, null);
    }

    public final IndicatorController getIndicatorController() {
        return this.indicatorController;
    }

    public abstract int getLayoutId();

    public final int getTotalSlidesNumber() {
        return this.slidesNumber;
    }

    public final long getVibrateDuration() {
        return this.vibrateDuration;
    }

    public final void goToNextSlide() {
        goToNextSlide$default(this, false, 1, null);
    }

    public final void goToPreviousSlide() {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.goToPreviousSlide();
        } else {
            l.l("pager");
            throw null;
        }
    }

    public final boolean isButtonsEnabled() {
        return this.isButtonsEnabled;
    }

    public final boolean isColorTransitionsEnabled() {
        return this.isColorTransitionsEnabled;
    }

    public final boolean isIndicatorEnabled() {
        return this.isIndicatorEnabled;
    }

    public final boolean isRtl$appintro_release() {
        Context applicationContext = getApplicationContext();
        l.e(applicationContext, "applicationContext");
        return LayoutUtil.isRtl(applicationContext);
    }

    public final boolean isSkipButtonEnabled() {
        return this.isSkipButtonEnabled;
    }

    public final boolean isSystemBackButtonLocked() {
        return this.isSystemBackButtonLocked;
    }

    public final boolean isVibrate() {
        return this.isVibrate;
    }

    public final boolean isWizardMode() {
        return this.isWizardMode;
    }

    @Override // c.ActivityC2008f, android.app.Activity
    public void onBackPressed() {
        if (this.isSystemBackButtonLocked) {
            return;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        if (appIntroViewPager.isFirstSlide(this.fragments.size())) {
            super.onBackPressed();
            return;
        }
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 != null) {
            appIntroViewPager2.goToPreviousSlide();
        } else {
            l.l("pager");
            throw null;
        }
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public boolean onCanRequestNextPage() {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        j0 item = pagerAdapter.getItem(appIntroViewPager.getCurrentItem());
        if (!(item instanceof SlidePolicy) || ((SlidePolicy) item).isPolicyRespected()) {
            LogHelper.d(TAG, "Change request will be allowed.");
            return true;
        }
        LogHelper.d(TAG, "Slide policy not respected, denying change request.");
        return false;
    }

    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, y0.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        AbstractC4401e.c cVar = AbstractC4401e.f37967b;
        int i = e0.f44658a;
        super.onCreate(bundle);
        this.indicatorController = new DotIndicatorController(this);
        showStatusBar(false);
        setContentView(getLayoutId());
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.indicator_container);
        if (viewGroup == null) {
            throw new IllegalStateException("Missing Indicator Container: R.id.indicator_container");
        }
        this.indicatorContainer = viewGroup;
        View viewFindViewById = findViewById(R.id.next);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Missing Next button: R.id.next");
        }
        this.nextButton = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.done);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("Missing Done button: R.id.done");
        }
        this.doneButton = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.skip);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("Missing Skip button: R.id.skip");
        }
        this.skipButton = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.back);
        if (viewFindViewById4 == null) {
            throw new IllegalStateException("Missing Back button: R.id.back");
        }
        this.backButton = viewFindViewById4;
        View view = this.nextButton;
        if (view == null) {
            l.l("nextButton");
            throw null;
        }
        a0.a(view, getString(R.string.app_intro_next_button));
        View view2 = this.skipButton;
        if (view2 == null) {
            l.l("skipButton");
            throw null;
        }
        if (view2 instanceof ImageButton) {
            a0.a(view2, getString(R.string.app_intro_skip_button));
        }
        View view3 = this.doneButton;
        if (view3 == null) {
            l.l("doneButton");
            throw null;
        }
        if (view3 instanceof ImageButton) {
            a0.a(view3, getString(R.string.app_intro_done_button));
        }
        View view4 = this.backButton;
        if (view4 == null) {
            l.l("backButton");
            throw null;
        }
        if (view4 instanceof ImageButton) {
            a0.a(view4, getString(R.string.app_intro_back_button));
        }
        if (isRtl$appintro_release()) {
            View view5 = this.nextButton;
            if (view5 == null) {
                l.l("nextButton");
                throw null;
            }
            view5.setScaleX(-1.0f);
            View view6 = this.backButton;
            if (view6 == null) {
                l.l("backButton");
                throw null;
            }
            view6.setScaleX(-1.0f);
        }
        Object systemService = getSystemService("vibrator");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.os.Vibrator");
        }
        this.vibrator = (Vibrator) systemService;
        x supportFragmentManager = getSupportFragmentManager();
        l.e(supportFragmentManager, "supportFragmentManager");
        this.pagerAdapter = new PagerAdapter(supportFragmentManager, this.fragments);
        View viewFindViewById5 = findViewById(R.id.view_pager);
        l.e(viewFindViewById5, "findViewById(R.id.view_pager)");
        this.pager = (AppIntroViewPager) viewFindViewById5;
        View view7 = this.doneButton;
        if (view7 == null) {
            l.l("doneButton");
            throw null;
        }
        view7.setOnClickListener(new NextSlideOnClickListener(this, true));
        View view8 = this.nextButton;
        if (view8 == null) {
            l.l("nextButton");
            throw null;
        }
        view8.setOnClickListener(new NextSlideOnClickListener(this, false));
        View view9 = this.backButton;
        if (view9 == null) {
            l.l("backButton");
            throw null;
        }
        view9.setOnClickListener(new c(this, 7));
        View view10 = this.skipButton;
        if (view10 == null) {
            l.l("skipButton");
            throw null;
        }
        view10.setOnClickListener(new e(this, 5));
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        appIntroViewPager.setAdapter(pagerAdapter);
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 == null) {
            l.l("pager");
            throw null;
        }
        appIntroViewPager2.addOnPageChangeListener$appintro_release(new OnPageChangeListener(this));
        AppIntroViewPager appIntroViewPager3 = this.pager;
        if (appIntroViewPager3 == null) {
            l.l("pager");
            throw null;
        }
        appIntroViewPager3.setOnNextPageRequestedListener(this);
        setScrollDurationFactor(1);
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public void onIllegallyRequestedNextPage() {
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        j0 item = pagerAdapter.getItem(appIntroViewPager.getCurrentItem());
        if (item instanceof SlidePolicy) {
            SlidePolicy slidePolicy = (SlidePolicy) item;
            if (slidePolicy.isPolicyRespected()) {
                return;
            }
            slidePolicy.onUserIllegallyRequestedNextPage();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent event) {
        l.f(event, "event");
        if (i != 23 && i != 66 && i != 96) {
            return super.onKeyDown(i, event);
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        boolean zIsLastSlide = appIntroViewPager.isLastSlide(this.fragments.size());
        goToNextSlide(zIsLastSlide);
        if (!zIsLastSlide) {
            return false;
        }
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter == null) {
            l.l("pagerAdapter");
            throw null;
        }
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 != null) {
            onDonePressed(pagerAdapter.getItem(appIntroViewPager2.getCurrentItem()));
            return false;
        }
        l.l("pager");
        throw null;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.slidesNumber = this.fragments.size();
        initializeIndicator();
        this.retainIsButtonsEnabled = this.isButtonsEnabled;
        if (isRtl$appintro_release()) {
            AppIntroViewPager appIntroViewPager = this.pager;
            if (appIntroViewPager == null) {
                l.l("pager");
                throw null;
            }
            appIntroViewPager.setCurrentItem(this.fragments.size() - this.savedCurrentItem);
        } else {
            AppIntroViewPager appIntroViewPager2 = this.pager;
            if (appIntroViewPager2 == null) {
                l.l("pager");
                throw null;
            }
            appIntroViewPager2.setCurrentItem(this.savedCurrentItem);
        }
        AppIntroViewPager appIntroViewPager3 = this.pager;
        if (appIntroViewPager3 != null) {
            appIntroViewPager3.post(new a(this, 11));
        } else {
            l.l("pager");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.ActivityC1762o, c.ActivityC2008f, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        l.f(permissions, "permissions");
        l.f(grantResults, "grantResults");
        super.onRequestPermissionsResult(i, permissions, grantResults);
        setSwipeLock(false);
        if (i != 1) {
            return;
        }
        ArrayList arrayList = new ArrayList(grantResults.length);
        int length = grantResults.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = grantResults[i10];
            i10++;
            arrayList.add(new b9.l(permissions[i11], Integer.valueOf(i12)));
            i11++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) ((b9.l) obj).f18084c).intValue() == -1) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C2092m.T(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add((String) ((b9.l) it.next()).f18083b);
        }
        if (arrayList3.isEmpty()) {
            this.permissionsMap.remove(Integer.valueOf(getCurrentSlideNumber()));
            goToNextSlide$default(this, false, 1, null);
            return;
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            handleDeniedPermission((String) it2.next());
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        appIntroViewPager.reCenterCurrentSlide$appintro_release();
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        l.f(savedInstanceState, "savedInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        this.slidesNumber = savedInstanceState.getInt(ARG_BUNDLE_SLIDES_NUMBER);
        this.retainIsButtonsEnabled = savedInstanceState.getBoolean(ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED);
        setButtonsEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_BUTTONS_ENABLED));
        setSkipButtonEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED));
        setIndicatorEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_INDICATOR_ENABLED));
        this.savedCurrentItem = savedInstanceState.getInt(ARG_BUNDLE_CURRENT_ITEM);
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        appIntroViewPager.setFullPagingEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_IS_FULL_PAGING_ENABLED));
        HashMap<Integer, PermissionWrapper> map = (HashMap) savedInstanceState.getSerializable(ARG_BUNDLE_PERMISSION_MAP);
        if (map == null) {
            map = new HashMap<>();
        }
        this.permissionsMap = map;
        setColorTransitionsEnabled(savedInstanceState.getBoolean(ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED));
    }

    @Override // c.ActivityC2008f, y0.h, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        l.f(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ARG_BUNDLE_SLIDES_NUMBER, this.slidesNumber);
        outState.putBoolean(ARG_BUNDLE_RETAIN_IS_BUTTONS_ENABLED, this.retainIsButtonsEnabled);
        outState.putBoolean(ARG_BUNDLE_IS_BUTTONS_ENABLED, isButtonsEnabled());
        outState.putBoolean(ARG_BUNDLE_IS_SKIP_BUTTON_ENABLED, isSkipButtonEnabled());
        outState.putBoolean(ARG_BUNDLE_IS_INDICATOR_ENABLED, isIndicatorEnabled());
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        outState.putInt(ARG_BUNDLE_CURRENT_ITEM, appIntroViewPager.getCurrentItem());
        AppIntroViewPager appIntroViewPager2 = this.pager;
        if (appIntroViewPager2 == null) {
            l.l("pager");
            throw null;
        }
        outState.putBoolean(ARG_BUNDLE_IS_FULL_PAGING_ENABLED, appIntroViewPager2.isFullPagingEnabled());
        outState.putSerializable(ARG_BUNDLE_PERMISSION_MAP, this.permissionsMap);
        outState.putBoolean(ARG_BUNDLE_COLOR_TRANSITIONS_ENABLED, isColorTransitionsEnabled());
    }

    public void onUserDeniedPermission(String permissionName) {
        l.f(permissionName, "permissionName");
    }

    public void onUserDisabledPermission(String permissionName) {
        l.f(permissionName, "permissionName");
    }

    @Override // com.github.appintro.AppIntroViewPagerListener
    public void onUserRequestedPermissionsDialog() {
        LogHelper.d(TAG, l.k(Integer.valueOf(getCurrentSlideNumber()), "Requesting Permissions on "));
        requestPermissions();
    }

    public final void setButtonsEnabled(boolean z10) {
        this.isButtonsEnabled = z10;
        updateButtonsVisibility();
    }

    public final void setColorTransitionsEnabled(boolean z10) {
        this.isColorTransitionsEnabled = z10;
    }

    public final void setCustomTransformer(ViewPager.k kVar) {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setPageTransformer(true, kVar);
        } else {
            l.l("pager");
            throw null;
        }
    }

    public final void setImmersiveMode() {
        getWindow().getDecorView().setSystemUiVisibility(5894);
    }

    public final void setIndicatorColor(int i, int i10) {
        IndicatorController indicatorController = this.indicatorController;
        if (indicatorController != null) {
            indicatorController.setSelectedIndicatorColor(i);
        }
        IndicatorController indicatorController2 = this.indicatorController;
        if (indicatorController2 == null) {
            return;
        }
        indicatorController2.setUnselectedIndicatorColor(i10);
    }

    public final void setIndicatorController(IndicatorController indicatorController) {
        this.indicatorController = indicatorController;
    }

    public final void setIndicatorEnabled(boolean z10) {
        this.isIndicatorEnabled = z10;
        ViewGroup viewGroup = this.indicatorContainer;
        if (viewGroup != null) {
            AppIntroBaseKt.setVisible(viewGroup, z10);
        } else {
            l.l("indicatorContainer");
            throw null;
        }
    }

    public final void setNavBarColor(int i) {
        getWindow().setNavigationBarColor(i);
    }

    public final void setNavBarColorRes(int i) {
        getWindow().setNavigationBarColor(C5848a.getColor(this, i));
    }

    public final void setNextPageSwipeLock(boolean z10) {
        LogHelper.w$default(TAG, "Calling setNextPageSwipeLock has not effect here. Please switch to setSwipeLock or SlidePolicy", null, 4, null);
    }

    public final void setProgressIndicator() {
        this.indicatorController = new ProgressIndicatorController(this, null, 0, 6, null);
    }

    public final void setScrollDurationFactor(int i) {
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setScrollDurationFactor(i);
        } else {
            l.l("pager");
            throw null;
        }
    }

    public final void setSkipButtonEnabled(boolean z10) {
        this.isSkipButtonEnabled = z10;
        updateButtonsVisibility();
    }

    public final void setStatusBarColor(int i) {
        getWindow().clearFlags(67108864);
        getWindow().addFlags(RecyclerView.UNDEFINED_DURATION);
        getWindow().setStatusBarColor(i);
    }

    public final void setStatusBarColorRes(int i) {
        setStatusBarColor(C5848a.getColor(this, i));
    }

    public final void setSwipeLock(boolean z10) {
        if (z10) {
            this.retainIsButtonsEnabled = this.isButtonsEnabled;
            setButtonsEnabled(true);
        } else {
            setButtonsEnabled(this.retainIsButtonsEnabled);
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setFullPagingEnabled(!z10);
        } else {
            l.l("pager");
            throw null;
        }
    }

    public final void setSystemBackButtonLocked(boolean z10) {
        this.isSystemBackButtonLocked = z10;
    }

    public final void setTransformer(AppIntroPageTransformerType appIntroTransformer) {
        l.f(appIntroTransformer, "appIntroTransformer");
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager != null) {
            appIntroViewPager.setAppIntroPageTransformer(appIntroTransformer);
        } else {
            l.l("pager");
            throw null;
        }
    }

    public final void setVibrate(boolean z10) {
        this.isVibrate = z10;
    }

    public final void setVibrateDuration(long j4) {
        this.vibrateDuration = j4;
    }

    public final void setWizardMode(boolean z10) {
        this.isWizardMode = z10;
        setSkipButtonEnabled(!z10);
        updateButtonsVisibility();
    }

    public final void showStatusBar(boolean z10) {
        if (z10) {
            getWindow().clearFlags(1024);
        } else {
            getWindow().setFlags(1024, 1024);
        }
    }

    public final void askForPermissions(String[] permissions, int i, boolean z10) {
        l.f(permissions, "permissions");
        if (i <= 0) {
            throw new IllegalStateException(l.k(Integer.valueOf(i), "Invalid Slide Number: ").toString());
        }
        this.permissionsMap.put(Integer.valueOf(i), new PermissionWrapper(permissions, i, z10));
    }

    public final void goToNextSlide(boolean z10) {
        if (z10) {
            onIntroFinished();
            return;
        }
        AppIntroViewPager appIntroViewPager = this.pager;
        if (appIntroViewPager == null) {
            l.l("pager");
            throw null;
        }
        appIntroViewPager.goToNextSlide();
        onNextSlide();
    }

    public void onIntroFinished() {
    }

    public void onNextSlide() {
    }

    /* compiled from: AppIntroBase.kt */
    public final class OnPageChangeListener implements ViewPager.j {
        final /* synthetic */ AppIntroBase this$0;

        public OnPageChangeListener(AppIntroBase this$0) {
            l.f(this$0, "this$0");
            this.this$0 = this$0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i, float f10, int i10) {
            if (this.this$0.isColorTransitionsEnabled()) {
                if (this.this$0.pagerAdapter == null) {
                    l.l("pagerAdapter");
                    throw null;
                }
                if (i < r6.getCount() - 1) {
                    PagerAdapter pagerAdapter = this.this$0.pagerAdapter;
                    if (pagerAdapter == null) {
                        l.l("pagerAdapter");
                        throw null;
                    }
                    ComponentCallbacksC1759l item = pagerAdapter.getItem(i);
                    PagerAdapter pagerAdapter2 = this.this$0.pagerAdapter;
                    if (pagerAdapter2 == null) {
                        l.l("pagerAdapter");
                        throw null;
                    }
                    this.this$0.performColorTransition(item, pagerAdapter2.getItem(i + 1), f10);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i) {
            IndicatorController indicatorController;
            if (this.this$0.slidesNumber >= 1 && (indicatorController = this.this$0.getIndicatorController()) != null) {
                indicatorController.selectPosition(i);
            }
            this.this$0.updateButtonsVisibility();
            AppIntroViewPager appIntroViewPager = this.this$0.pager;
            if (appIntroViewPager == null) {
                l.l("pager");
                throw null;
            }
            appIntroViewPager.setPermissionSlide(this.this$0.isPermissionSlide());
            this.this$0.onPageSelected(i);
            if (this.this$0.slidesNumber > 0) {
                if (this.this$0.currentlySelectedItem == -1) {
                    AppIntroBase appIntroBase = this.this$0;
                    PagerAdapter pagerAdapter = appIntroBase.pagerAdapter;
                    if (pagerAdapter == null) {
                        l.l("pagerAdapter");
                        throw null;
                    }
                    appIntroBase.dispatchSlideChangedCallbacks(null, pagerAdapter.getItem(i));
                } else {
                    AppIntroBase appIntroBase2 = this.this$0;
                    PagerAdapter pagerAdapter2 = appIntroBase2.pagerAdapter;
                    if (pagerAdapter2 == null) {
                        l.l("pagerAdapter");
                        throw null;
                    }
                    ComponentCallbacksC1759l item = pagerAdapter2.getItem(this.this$0.currentlySelectedItem);
                    PagerAdapter pagerAdapter3 = this.this$0.pagerAdapter;
                    if (pagerAdapter3 == null) {
                        l.l("pagerAdapter");
                        throw null;
                    }
                    AppIntroViewPager appIntroViewPager2 = this.this$0.pager;
                    if (appIntroViewPager2 == null) {
                        l.l("pager");
                        throw null;
                    }
                    appIntroBase2.dispatchSlideChangedCallbacks(item, pagerAdapter3.getItem(appIntroViewPager2.getCurrentItem()));
                }
            }
            this.this$0.currentlySelectedItem = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i) {
        }
    }

    public void onDonePressed(ComponentCallbacksC1759l componentCallbacksC1759l) {
    }

    public void onNextPressed(ComponentCallbacksC1759l componentCallbacksC1759l) {
    }

    public void onPageSelected(int i) {
    }

    public void onSkipPressed(ComponentCallbacksC1759l componentCallbacksC1759l) {
    }

    public void onSlideChanged(ComponentCallbacksC1759l componentCallbacksC1759l, ComponentCallbacksC1759l componentCallbacksC1759l2) {
    }
}
