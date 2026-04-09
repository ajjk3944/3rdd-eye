package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.github.appintro.AppIntroBaseFragmentKt;
import com.yandex.mobile.ads.impl.sg;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class NativeAdViewBinder implements sg {

    /* renamed from: a, reason: collision with root package name */
    private final View f36852a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, View> f36853b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, kotlin.jvm.internal.g gVar) {
        this(view, map);
    }

    public TextView getAgeView() {
        View view = getAssetViews().get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.sg
    public View getAssetView(String assetName) {
        l.f(assetName, "assetName");
        return getAssetViews().get(assetName);
    }

    @Override // com.yandex.mobile.ads.impl.sg
    public Map<String, View> getAssetViews() {
        return this.f36853b;
    }

    public TextView getBodyView() {
        View view = getAssetViews().get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getCallToActionView() {
        View view = getAssetViews().get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getCloseButtonView() {
        View assetView = getAssetView("close_button");
        if (assetView instanceof TextView) {
            return (TextView) assetView;
        }
        return null;
    }

    public TextView getDomainView() {
        View view = getAssetViews().get("domain");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public ImageView getFaviconView() {
        View view = getAssetViews().get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getFeedbackView() {
        View view = getAssetViews().get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public ImageView getIconView() {
        View view = getAssetViews().get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    public final View getNativeAdView() {
        return this.f36852a;
    }

    public TextView getPriceView() {
        View view = getAssetViews().get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public View getRatingView() {
        return getAssetViews().get("rating");
    }

    public TextView getReviewCountView() {
        View view = getAssetViews().get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getSponsoredView() {
        View view = getAssetViews().get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getTitleView() {
        View view = getAssetViews().get(AppIntroBaseFragmentKt.ARG_TITLE);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    public TextView getWarningView() {
        View view = getAssetViews().get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NativeAdViewBinder(View view, Map<String, ? extends View> map) {
        this.f36852a = view;
        this.f36853b = map;
    }

    public MediaView getMediaView() {
        View view = getAssetViews().get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f36854a;

        /* renamed from: b, reason: collision with root package name */
        private final LinkedHashMap f36855b;

        public Builder(View nativeAdView) {
            l.f(nativeAdView, "nativeAdView");
            this.f36854a = nativeAdView;
            this.f36855b = new LinkedHashMap();
        }

        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f36854a, this.f36855b, null);
        }

        public final Builder setAgeView(TextView textView) {
            this.f36855b.put("age", textView);
            return this;
        }

        public final Builder setBodyView(TextView textView) {
            this.f36855b.put("body", textView);
            return this;
        }

        public final Builder setCallToActionView(TextView textView) {
            this.f36855b.put("call_to_action", textView);
            return this;
        }

        public final Builder setDomainView(TextView textView) {
            this.f36855b.put("domain", textView);
            return this;
        }

        public final Builder setFaviconView(ImageView imageView) {
            this.f36855b.put("favicon", imageView);
            return this;
        }

        public final Builder setFeedbackView(ImageView imageView) {
            this.f36855b.put("feedback", imageView);
            return this;
        }

        public final Builder setIconView(ImageView imageView) {
            this.f36855b.put("icon", imageView);
            return this;
        }

        public final Builder setMediaView(MediaView mediaView) {
            this.f36855b.put("media", mediaView);
            return this;
        }

        public final Builder setPriceView(TextView textView) {
            this.f36855b.put("price", textView);
            return this;
        }

        public final <T extends View & Rating> Builder setRatingView(T t10) {
            this.f36855b.put("rating", t10);
            return this;
        }

        public final Builder setReviewCountView(TextView textView) {
            this.f36855b.put("review_count", textView);
            return this;
        }

        public final Builder setSponsoredView(TextView textView) {
            this.f36855b.put("sponsored", textView);
            return this;
        }

        public final Builder setTitleView(TextView textView) {
            this.f36855b.put(AppIntroBaseFragmentKt.ARG_TITLE, textView);
            return this;
        }

        public final Builder setWarningView(TextView textView) {
            this.f36855b.put("warning", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(NativeAdView nativeAdView) {
            this((View) nativeAdView);
            l.f(nativeAdView, "nativeAdView");
        }
    }
}
