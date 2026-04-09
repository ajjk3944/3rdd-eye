package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.monetization.ads.instream.view.InstreamMuteView;
import com.monetization.ads.video.playback.view.ExtendedVideoAdControlsContainer;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.bb2;

/* loaded from: classes3.dex */
public final class p00 {

    /* renamed from: a, reason: collision with root package name */
    private final cn0 f31554a;

    /* renamed from: b, reason: collision with root package name */
    private final at1<ExtendedVideoAdControlsContainer> f31555b;

    public p00(cn0 instreamDesign) {
        kotlin.jvm.internal.l.f(instreamDesign, "instreamDesign");
        this.f31554a = instreamDesign;
        this.f31555b = new at1<>();
    }

    public final bb2 a(Context context, ViewGroup rootView) {
        int i;
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(rootView, "rootView");
        cn0 instreamDesign = this.f31554a;
        kotlin.jvm.internal.l.f(instreamDesign, "instreamDesign");
        int iOrdinal = instreamDesign.ordinal();
        if (iOrdinal == 0) {
            i = R.layout.monetization_ads_internal_instream_skin_v1;
        } else {
            if (iOrdinal != 1) {
                throw new b9.j();
            }
            i = R.layout.monetization_ads_internal_instream_skin_v2;
        }
        this.f31555b.getClass();
        ExtendedVideoAdControlsContainer extendedVideoAdControlsContainer = (ExtendedVideoAdControlsContainer) at1.a(context, ExtendedVideoAdControlsContainer.class, i, rootView);
        if (extendedVideoAdControlsContainer == null) {
            return null;
        }
        ImageView imageView = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.sponsored_image);
        ImageView imageView2 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.favicon);
        TextView textView = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.call_to_action);
        ImageView imageView3 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.instream_call_to_action);
        InstreamMuteView instreamMuteView = (InstreamMuteView) extendedVideoAdControlsContainer.findViewById(R.id.instream_mute);
        ProgressBar progressBar = (ProgressBar) extendedVideoAdControlsContainer.findViewById(R.id.instream_progress_display_view);
        View viewFindViewById = extendedVideoAdControlsContainer.findViewById(R.id.instream_skip);
        TextView textView2 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.domain);
        TextView textView3 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.sponsored);
        TextView textView4 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.ad_position);
        ImageView imageView4 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.trademark_icon);
        TextView textView5 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.trademark_delimiter);
        View viewFindViewById2 = extendedVideoAdControlsContainer.findViewById(R.id.instream_cta_container);
        ImageView imageView5 = (ImageView) extendedVideoAdControlsContainer.findViewById(R.id.feedback);
        TextView textView6 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.timer_value);
        TextView textView7 = (TextView) extendedVideoAdControlsContainer.findViewById(R.id.warning);
        ViewGroup viewGroup = (ViewGroup) extendedVideoAdControlsContainer.findViewById(R.id.qrcode_container);
        return new bb2(new bb2.a(extendedVideoAdControlsContainer).e(imageView).b(imageView2).b(textView).a(imageView3).a((p31) instreamMuteView).a(progressBar).b(viewFindViewById).e(textView3).c(textView2).a(textView4).f(imageView4).f(textView5).d(textView6).a(viewFindViewById2).c(imageView5).g(textView7).a(viewGroup).d((ImageView) extendedVideoAdControlsContainer.findViewById(R.id.qrcode_image)), 0);
    }
}
