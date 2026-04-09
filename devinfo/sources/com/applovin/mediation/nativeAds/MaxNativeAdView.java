package com.applovin.mediation.nativeAds;

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
import androidx.lifecycle.o0;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import je.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f6381a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f6382b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f6383c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f6384d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f6385e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f6386f;
    private final FrameLayout g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f6387h;

    /* renamed from: i, reason: collision with root package name */
    private final FrameLayout f6388i;
    private final ViewGroup j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewGroup f6389k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f6390l;

    /* renamed from: m, reason: collision with root package name */
    private b f6391m;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f6392a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f6393b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f6392a = weakReference;
            this.f6393b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f6392a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.C0.O();
                if (o.a()) {
                    k.C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f6392a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f6393b.getLayoutParams();
            layoutParams.height = ((View) this.f6393b.getParent()).getWidth();
            this.f6393b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public b getAdViewTracker() {
        return this.f6391m;
    }

    public TextView getAdvertiserTextView() {
        return this.f6383c;
    }

    public TextView getBodyTextView() {
        return this.f6384d;
    }

    public Button getCallToActionButton() {
        return this.f6385e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f6382b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f6383c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f6384d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f6385e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f6386f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.g;
    }

    public ImageView getIconImageView() {
        return this.f6386f;
    }

    public View getMainView() {
        return this.f6381a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f6390l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f6389k;
        return viewGroup != null ? viewGroup : this.f6390l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f6388i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f6387h;
        return viewGroup != null ? viewGroup : this.f6388i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.j;
    }

    public TextView getTitleTextView() {
        return this.f6382b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f6391m;
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
        b bVar = this.f6391m;
        if (bVar != null) {
            bVar.a();
            this.f6391m = null;
        }
        View view = this.f6381a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f6381a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f6381a);
    }

    public void render(d3 d3Var, a.InterfaceC0014a interfaceC0014a, k kVar) {
        recycle();
        if (!d3Var.v0().get() || !d3Var.u0().get()) {
            this.f6391m = new b(d3Var, this, interfaceC0014a, kVar);
        }
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.w0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new com.applovin.mediation.nativeAds.a(0, nativeAd));
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException(u.t("Attempting to render MAX native ad with invalid template: ", str));
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f6382b.setText(maxNativeAd.getTitle());
        } else {
            this.f6382b.setVisibility(8);
        }
        if (this.f6383c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f6383c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f6383c.setVisibility(8);
            }
        }
        if (this.f6384d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f6384d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f6384d.setVisibility(8);
            } else {
                this.f6384d.setVisibility(4);
            }
        }
        if (this.f6385e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f6385e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f6385e.setVisibility(8);
            } else {
                this.f6385e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.g;
        if (frameLayout != null) {
            if (icon == null || this.f6386f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.g.removeAllViews();
                    this.g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f6386f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f6386f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f6388i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f6388i.addView(optionsView);
            this.f6388i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f6390l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f6390l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f6390l.setVisibility(8);
            }
        }
        if (this.j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.j.addView(appLovinStarRatingView);
            } else {
                this.j.setVisibility(8);
            }
        }
        b();
        postDelayed(new o0(14, this), 2000L);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z3 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f6381a = view;
        } else {
            if (z3) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f6381a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f6381a);
        this.f6382b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f6383c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f6384d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f6385e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f6386f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f6387h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f6388i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f6389k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f6390l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f6382b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f6384d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f6383c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f6385e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f6386f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f6386f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f6386f, icon.getUri());
                } else {
                    this.f6386f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f6389k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f6389k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f6387h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f6387h.addView(optionsView);
                this.f6387h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.j.addView(appLovinStarRatingView);
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
