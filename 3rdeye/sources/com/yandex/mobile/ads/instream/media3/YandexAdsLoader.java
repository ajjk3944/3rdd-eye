package com.yandex.mobile.ads.instream.media3;

import android.content.Context;
import android.view.ViewGroup;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.Player;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import c9.C2099t;
import com.yandex.mobile.ads.impl.dl1;
import com.yandex.mobile.ads.impl.en2;
import com.yandex.mobile.ads.impl.rm0;
import com.yandex.mobile.ads.impl.rm2;
import com.yandex.mobile.ads.impl.ua;
import com.yandex.mobile.ads.impl.xl2;
import com.yandex.mobile.ads.impl.yl2;
import com.yandex.mobile.ads.instream.InstreamAdRequestConfiguration;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import java.io.IOException;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class YandexAdsLoader extends dl1 {
    public static final String AD_TAG_URI = "yandex://ad_tag";

    /* renamed from: a, reason: collision with root package name */
    public static final a f36818a = new a(0);

    /* renamed from: b, reason: collision with root package name */
    private final rm0 f36819b;

    /* renamed from: c, reason: collision with root package name */
    private final yl2 f36820c;

    public static final class a {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
        }
    }

    public YandexAdsLoader(Context context, InstreamAdRequestConfiguration requestConfiguration) {
        l.f(context, "context");
        l.f(requestConfiguration, "requestConfiguration");
        this.f36819b = new ua(context, new rm2(context), new xl2(requestConfiguration)).a();
        this.f36820c = new yl2();
    }

    public void handlePrepareComplete(AdsMediaSource adsMediaSource, int i, int i10) {
        l.f(adsMediaSource, "adsMediaSource");
        this.f36819b.a(i, i10);
    }

    public void handlePrepareError(AdsMediaSource adsMediaSource, int i, int i10, IOException exception) {
        l.f(adsMediaSource, "adsMediaSource");
        l.f(exception, "exception");
        this.f36819b.a(i, i10, exception);
    }

    public void release() {
        this.f36819b.a();
    }

    public final void requestAds(ViewGroup viewGroup) {
        this.f36819b.a(viewGroup, C2099t.f18581b);
    }

    public void setPlayer(Player player) {
        this.f36819b.a(player);
    }

    public void setSupportedContentTypes(int... contentTypes) {
        l.f(contentTypes, "contentTypes");
    }

    public final void setVideoAdPlaybackListener(VideoAdPlaybackListener videoAdPlaybackListener) {
        this.f36819b.a(videoAdPlaybackListener != null ? new en2(videoAdPlaybackListener, this.f36820c) : null);
    }

    public void start(AdsMediaSource adsMediaSource, DataSpec adTagDataSpec, Object adPlaybackId, AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        l.f(adsMediaSource, "adsMediaSource");
        l.f(adTagDataSpec, "adTagDataSpec");
        l.f(adPlaybackId, "adPlaybackId");
        l.f(adViewProvider, "adViewProvider");
        l.f(eventListener, "eventListener");
        this.f36819b.a(eventListener, adViewProvider, adPlaybackId);
    }

    public void stop(AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        l.f(adsMediaSource, "adsMediaSource");
        l.f(eventListener, "eventListener");
        this.f36819b.b();
    }
}
