package com.yandex.mobile.ads.impl;

import b9.C1992A;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class en2 implements yn0 {

    /* renamed from: a, reason: collision with root package name */
    private final VideoAdPlaybackListener f26929a;

    /* renamed from: b, reason: collision with root package name */
    private final yl2 f26930b;

    public static final class a extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26932c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(VideoAd videoAd) {
            super(0);
            this.f26932c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdClicked(this.f26932c);
            return C1992A.f18074a;
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26934c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VideoAd videoAd) {
            super(0);
            this.f26934c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdCompleted(this.f26934c);
            return C1992A.f18074a;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VideoAd videoAd) {
            super(0);
            this.f26936c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdError(this.f26936c);
            return C1992A.f18074a;
        }
    }

    public static final class d extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26938c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(VideoAd videoAd) {
            super(0);
            this.f26938c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdPaused(this.f26938c);
            return C1992A.f18074a;
        }
    }

    public static final class e extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(VideoAd videoAd) {
            super(0);
            this.f26940c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdPrepared(this.f26940c);
            return C1992A.f18074a;
        }
    }

    public static final class f extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(VideoAd videoAd) {
            super(0);
            this.f26942c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdResumed(this.f26942c);
            return C1992A.f18074a;
        }
    }

    public static final class g extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(VideoAd videoAd) {
            super(0);
            this.f26944c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdSkipped(this.f26944c);
            return C1992A.f18074a;
        }
    }

    public static final class h extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26946c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(VideoAd videoAd) {
            super(0);
            this.f26946c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdStarted(this.f26946c);
            return C1992A.f18074a;
        }
    }

    public static final class i extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26948c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(VideoAd videoAd) {
            super(0);
            this.f26948c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onAdStopped(this.f26948c);
            return C1992A.f18074a;
        }
    }

    public static final class j extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26950c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(VideoAd videoAd) {
            super(0);
            this.f26950c = videoAd;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onImpression(this.f26950c);
            return C1992A.f18074a;
        }
    }

    public static final class k extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ VideoAd f26952c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f26953d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(VideoAd videoAd, float f10) {
            super(0);
            this.f26952c = videoAd;
            this.f26953d = f10;
        }

        @Override // p9.InterfaceC5480a
        public final C1992A invoke() {
            en2.this.f26929a.onVolumeChanged(this.f26952c, this.f26953d);
            return C1992A.f18074a;
        }
    }

    public en2(VideoAdPlaybackListener videoAdPlaybackListener, yl2 videoAdAdapterCache) {
        kotlin.jvm.internal.l.f(videoAdPlaybackListener, "videoAdPlaybackListener");
        kotlin.jvm.internal.l.f(videoAdAdapterCache, "videoAdAdapterCache");
        this.f26929a = videoAdPlaybackListener;
        this.f26930b = videoAdAdapterCache;
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new e(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new d(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new h(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new f(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void f(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new i(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void g(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new b(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void h(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new c(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void i(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new a(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void j(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new j(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new g(this.f26930b.a(videoAd)));
    }

    @Override // com.yandex.mobile.ads.impl.yn0
    public final void a(tn0 videoAd, float f10) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        new CallbackStackTraceMarker(new k(this.f26930b.a(videoAd), f10));
    }
}
