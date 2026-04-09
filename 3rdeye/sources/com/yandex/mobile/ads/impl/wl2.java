package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kc2;
import com.yandex.mobile.ads.impl.vl2;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener;
import com.yandex.mobile.ads.instream.player.ad.error.InstreamAdPlayerError;
import com.yandex.mobile.ads.video.playback.model.VideoAd;

/* loaded from: classes3.dex */
public final class wl2 implements InstreamAdPlayerListener {

    /* renamed from: a, reason: collision with root package name */
    private final dt f35015a;

    /* renamed from: b, reason: collision with root package name */
    private final yl2 f35016b;

    /* renamed from: c, reason: collision with root package name */
    private final vl2 f35017c;

    public wl2(xl0 coreInstreamAdPlayerListener, yl2 videoAdCache, vl2 adPlayerErrorAdapter) {
        kotlin.jvm.internal.l.f(coreInstreamAdPlayerListener, "coreInstreamAdPlayerListener");
        kotlin.jvm.internal.l.f(videoAdCache, "videoAdCache");
        kotlin.jvm.internal.l.f(adPlayerErrorAdapter, "adPlayerErrorAdapter");
        this.f35015a = coreInstreamAdPlayerListener;
        this.f35016b = videoAdCache;
        this.f35017c = adPlayerErrorAdapter;
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingFinished(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.h(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdBufferingStarted(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.i(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdCompleted(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.g(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPaused(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.c(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdPrepared(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.b(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdResumed(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.e(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdSkipped(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.a(tn0VarA);
            this.f35016b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStarted(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.d(tn0VarA);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onAdStopped(VideoAd videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.f(tn0VarA);
            this.f35016b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onError(VideoAd videoAd, InstreamAdPlayerError error) {
        kc2.a aVar;
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(error, "error");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35017c.getClass();
            switch (vl2.a.f34618a[error.getReason().ordinal()]) {
                case 1:
                    aVar = kc2.a.f29607b;
                    break;
                case 2:
                    aVar = kc2.a.f29608c;
                    break;
                case 3:
                    aVar = kc2.a.f29609d;
                    break;
                case 4:
                    aVar = kc2.a.f29610e;
                    break;
                case 5:
                    aVar = kc2.a.f29611f;
                    break;
                case 6:
                    aVar = kc2.a.f29612g;
                    break;
                case 7:
                    aVar = kc2.a.f29613h;
                    break;
                case 8:
                    aVar = kc2.a.i;
                    break;
                case 9:
                    aVar = kc2.a.f29614j;
                    break;
                case 10:
                    aVar = kc2.a.f29615k;
                    break;
                case 11:
                    aVar = kc2.a.f29616l;
                    break;
                case 12:
                    aVar = kc2.a.f29617m;
                    break;
                case 13:
                    aVar = kc2.a.f29618n;
                    break;
                case 14:
                    aVar = kc2.a.f29619o;
                    break;
                case 15:
                    aVar = kc2.a.f29620p;
                    break;
                case 16:
                    aVar = kc2.a.f29621q;
                    break;
                case 17:
                    aVar = kc2.a.f29622r;
                    break;
                case 18:
                    aVar = kc2.a.f29623s;
                    break;
                case 19:
                    aVar = kc2.a.f29624t;
                    break;
                case 20:
                    aVar = kc2.a.f29625u;
                    break;
                case 21:
                    aVar = kc2.a.f29626v;
                    break;
                case 22:
                    aVar = kc2.a.f29627w;
                    break;
                case 23:
                    aVar = kc2.a.f29628x;
                    break;
                case 24:
                    aVar = kc2.a.f29629y;
                    break;
                case 25:
                    aVar = kc2.a.f29630z;
                    break;
                case 26:
                    aVar = kc2.a.f29600A;
                    break;
                case 27:
                    aVar = kc2.a.f29601B;
                    break;
                case 28:
                    aVar = kc2.a.f29602C;
                    break;
                case 29:
                    aVar = kc2.a.f29603D;
                    break;
                default:
                    throw new b9.j();
            }
            this.f35015a.a(tn0VarA, new kc2(aVar, error.getUnderlyingError()));
            this.f35016b.b(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayerListener
    public final void onVolumeChanged(VideoAd videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        tn0 tn0VarA = this.f35016b.a(videoAd);
        if (tn0VarA != null) {
            this.f35015a.a(tn0VarA, f10);
        }
    }
}
