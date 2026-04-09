package com.yandex.mobile.ads.impl;

import android.view.View;
import c9.C2077A;
import com.facebook.ads.AdSDKNotificationListener;
import com.yandex.mobile.ads.impl.zf2;
import java.util.List;

/* loaded from: classes3.dex */
public final class fd2 implements zf2 {

    /* renamed from: a, reason: collision with root package name */
    private final za2 f27287a;

    /* renamed from: b, reason: collision with root package name */
    private final xf2 f27288b;

    public fd2(za2 videoAd, xf2 eventsTracker) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        kotlin.jvm.internal.l.f(eventsTracker, "eventsTracker");
        this.f27287a = videoAd;
        this.f27288b = eventsTracker;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void h() {
        this.f27288b.a(this.f27287a, "render_impression");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void i() {
        za2 videoAd = this.f27287a;
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        this.f27288b.a(new jb2(videoAd), "renderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void n() {
        this.f27288b.a(this.f27287a, AdSDKNotificationListener.IMPRESSION_EVENT);
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10, long j4) {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(View view, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(kc2 error) {
        int i;
        kotlin.jvm.internal.l.f(error, "error");
        switch (error.a().ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
            case 25:
            case 26:
                i = 405;
                break;
            case 7:
                i = 402;
                break;
            case 8:
            case 12:
            case 28:
                i = 900;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 20:
            case 21:
            case 22:
            case 24:
            case 27:
                i = 400;
                break;
            case 19:
                i = 401;
                break;
            case 23:
                i = 403;
                break;
            case 29:
                i = 901;
                break;
            case 30:
                i = 902;
                break;
            default:
                throw new b9.j();
        }
        this.f27288b.a(this.f27287a, com.vungle.ads.internal.presenter.g.ERROR, C2077A.m(new b9.l("[ERRORCODE]", String.valueOf(i))));
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(zf2.a quartile) {
        kotlin.jvm.internal.l.f(quartile, "quartile");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void c() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void e() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void f() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void j() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void k() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void l() {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void m() {
    }
}
