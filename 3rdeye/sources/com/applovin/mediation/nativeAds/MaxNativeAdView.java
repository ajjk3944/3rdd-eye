package com.applovin.mediation.nativeAds;

import F8.c;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.work.s;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a, reason: collision with root package name */
    private final View f21952a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f21953b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f21954c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f21955d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f21956e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f21957f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f21958g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f21959h;
    private final FrameLayout i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f21960j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewGroup f21961k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f21962l;

    /* renamed from: m, reason: collision with root package name */
    private b f21963m;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f21964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f21965b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f21964a = weakReference;
            this.f21965b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f21964a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.f21161C0.O();
                if (o.a()) {
                    k.f21161C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f21964a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f21965b.getLayoutParams();
            layoutParams.height = ((View) this.f21965b.getParent()).getWidth();
            this.f21965b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public b getAdViewTracker() {
        return this.f21963m;
    }

    public TextView getAdvertiserTextView() {
        return this.f21954c;
    }

    public TextView getBodyTextView() {
        return this.f21955d;
    }

    public Button getCallToActionButton() {
        return this.f21956e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f21953b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f21954c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f21955d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f21956e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f21957f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f21958g;
    }

    public ImageView getIconImageView() {
        return this.f21957f;
    }

    public View getMainView() {
        return this.f21952a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f21962l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f21961k;
        return viewGroup != null ? viewGroup : this.f21962l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f21959h;
        return viewGroup != null ? viewGroup : this.i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f21960j;
    }

    public TextView getTitleTextView() {
        return this.f21953b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f21963m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f21963m;
        if (bVar != null) {
            bVar.a();
            this.f21963m = null;
        }
        View view = this.f21952a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f21952a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f21952a);
    }

    public void render(u2 u2Var, a.InterfaceC0312a interfaceC0312a, k kVar) {
        recycle();
        if (!u2Var.p0().get() || !u2Var.n0().get()) {
            this.f21963m = new b(u2Var, this, interfaceC0312a, kVar);
        }
        MaxNativeAd nativeAd = u2Var.getNativeAd();
        if (u2Var.q0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new c(nativeAd, 6));
        }
        if (StringUtils.isValidString(u2Var.o0())) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Rendering template ad view");
            }
            b(nativeAd);
            return;
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return R.layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(s.d("Attempting to render MAX native ad with invalid format: ", str));
        }
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (this.f21953b == null) {
            o.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f21953b.setText(maxNativeAd.getTitle());
        } else {
            this.f21953b.setVisibility(8);
        }
        if (this.f21954c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f21954c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f21954c.setVisibility(8);
            }
        }
        if (this.f21955d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f21955d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f21955d.setVisibility(8);
            } else {
                this.f21955d.setVisibility(4);
            }
        }
        if (this.f21956e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f21956e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f21956e.setVisibility(8);
            } else {
                this.f21956e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f21958g;
        if (frameLayout != null) {
            if (icon == null || this.f21957f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f21958g.removeAllViews();
                    this.f21958g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f21957f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f21958g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f21957f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.i.addView(optionsView);
            this.i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f21962l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21962l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f21962l.setVisibility(8);
            }
        }
        if (this.f21960j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f21960j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21960j.addView(appLovinStarRatingView);
            } else {
                this.f21960j.setVisibility(8);
            }
        }
        b();
        postDelayed(new B.b(this, 26), 2000L);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i).setOptionsContentFrameLayoutId(i).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i10 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i10).setMediaContentFrameLayoutId(i10).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f21952a = view;
        } else {
            if (z10) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f21952a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f21952a);
        this.f21953b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f21954c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f21955d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f21956e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f21957f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f21958g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f21959h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f21960j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f21961k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f21962l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f21953b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f21955d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f21954c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f21956e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f21957f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f21957f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f21957f, icon.getUri());
                } else {
                    this.f21957f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f21961k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21961k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f21959h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21959h.addView(optionsView);
                this.f21959h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f21960j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f21960j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
