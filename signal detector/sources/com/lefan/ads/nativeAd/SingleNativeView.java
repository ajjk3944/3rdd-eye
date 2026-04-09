package com.lefan.ads.nativeAd;

import a.AbstractC0241a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.apm.insight.R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.C0889ae;
import java.util.ArrayList;
import p1.e;
import p4.AbstractC2782i;
import q2.M0;
import q5.i;
import s4.C2898a;

/* loaded from: classes.dex */
public final class SingleNativeView extends LinearLayoutCompat {

    /* renamed from: D, reason: collision with root package name */
    public NativeAd f18752D;

    /* renamed from: E, reason: collision with root package name */
    public final String f18753E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f18754F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleNativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i.e(context, "ctx");
        i.e(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(R.layout.ad_native_ad, this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2782i.f22889b, 0, 0);
        this.f18753E = typedArrayObtainStyledAttributes.getString(1);
        this.f18754F = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final NativeAd getNativeAd() {
        NativeAd nativeAd = null;
        nativeAd = null;
        if (AbstractC0241a.j(getContext(), "Native_ad_pair")) {
            e eVar = C2898a.f23497e;
            C2898a c2898a = C2898a.f23498f;
            if (c2898a == null) {
                synchronized (eVar) {
                    c2898a = C2898a.f23498f;
                    if (c2898a == null) {
                        c2898a = new C2898a();
                        C2898a.f23498f = c2898a;
                    }
                }
            }
            Context context = getContext();
            String str = this.f18753E;
            boolean z6 = this.f18754F;
            ArrayList arrayList = c2898a.f23499a;
            if (context != null) {
                int i = 0;
                if (System.currentTimeMillis() - c2898a.f23502d > 3600000) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((NativeAd) obj).a();
                    }
                    arrayList.clear();
                    c2898a.a(context, str, z6);
                    return null;
                }
                i.e(arrayList, "<this>");
                nativeAd = (NativeAd) (arrayList.isEmpty() ? null : arrayList.remove(0));
                if (arrayList.isEmpty()) {
                    c2898a.a(context, str, z6);
                }
            }
        }
        return nativeAd;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18752D = getNativeAd();
        Context context = getContext();
        i.d(context, "getContext(...)");
        NativeAd nativeAd = this.f18752D;
        if (nativeAd == null) {
            setVisibility(8);
            return;
        }
        i.e(nativeAd, "nativeAd");
        NativeAdView nativeAdView = (NativeAdView) findViewById(R.id.admob_native_view);
        nativeAdView.setVisibility(0);
        MediaView mediaView = (MediaView) findViewById(R.id.admob_ad_media);
        TextView textView = (TextView) findViewById(R.id.admob_ad_body);
        TextView textView2 = (TextView) findViewById(R.id.admob_ad_headline);
        Button button = (Button) findViewById(R.id.admob_ad_call_to_action);
        ImageView imageView = (ImageView) findViewById(R.id.admob_ad_app_icon);
        TextView textView3 = (TextView) findViewById(R.id.admob_ad_price);
        TextView textView4 = (TextView) findViewById(R.id.admob_ad_store);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.admob_ad_stars);
        TextView textView5 = (TextView) findViewById(R.id.admob_ad_advertiser);
        nativeAdView.setMediaView(mediaView);
        nativeAdView.setHeadlineView(textView2);
        nativeAdView.setBodyView(textView);
        nativeAdView.setCallToActionView(button);
        nativeAdView.setIconView(imageView);
        nativeAdView.setPriceView(textView3);
        nativeAdView.setStarRatingView(ratingBar);
        nativeAdView.setStoreView(textView4);
        nativeAdView.setAdvertiserView(textView5);
        textView2.setText(nativeAd.e());
        M0 m0G = nativeAd.g();
        if (m0G != null && mediaView != null) {
            mediaView.setMediaContent(m0G);
        }
        if (nativeAd.c() == null) {
            textView.setVisibility(4);
        } else {
            textView.setVisibility(0);
            textView.setText(nativeAd.c());
        }
        if (nativeAd.d() == null) {
            button.setVisibility(4);
        } else {
            button.setVisibility(0);
            button.setText(nativeAd.d());
        }
        if (nativeAd.f() == null) {
            imageView.setVisibility(8);
        } else {
            C0889ae c0889aeF = nativeAd.f();
            imageView.setImageDrawable(c0889aeF != null ? (Drawable) c0889aeF.f13151c : null);
            imageView.setVisibility(0);
        }
        if (nativeAd.h() == null) {
            textView3.setVisibility(4);
        } else {
            textView3.setVisibility(0);
            textView3.setText(nativeAd.h());
        }
        if (nativeAd.k() == null) {
            textView4.setVisibility(4);
        } else {
            textView4.setVisibility(0);
            textView4.setText(nativeAd.k());
        }
        if (nativeAd.j() == null) {
            ratingBar.setVisibility(4);
        } else {
            Double dJ = nativeAd.j();
            i.b(dJ);
            ratingBar.setRating((float) dJ.doubleValue());
            ratingBar.setVisibility(0);
        }
        String strB = nativeAd.b();
        if (strB == null) {
            strB = context.getString(R.string.ad_attribution);
            i.d(strB, "getString(...)");
        }
        textView5.setText(strB);
        nativeAdView.setNativeAd(nativeAd);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NativeAd nativeAd = this.f18752D;
        if (nativeAd != null) {
            nativeAd.a();
        }
        this.f18752D = null;
    }
}
