package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.zf2;
import java.util.List;

/* loaded from: classes3.dex */
public final class wu implements zf2 {

    /* renamed from: a, reason: collision with root package name */
    private final nu f35061a;

    /* renamed from: b, reason: collision with root package name */
    private final xf2 f35062b;

    /* renamed from: c, reason: collision with root package name */
    private final ee2 f35063c;

    /* renamed from: d, reason: collision with root package name */
    private final ao0 f35064d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f35065e;

    public wu(nu creative, xf2 eventsTracker, ee2 videoEventUrlsTracker) {
        kotlin.jvm.internal.l.f(creative, "creative");
        kotlin.jvm.internal.l.f(eventsTracker, "eventsTracker");
        kotlin.jvm.internal.l.f(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f35061a = creative;
        this.f35062b = eventsTracker;
        this.f35063c = videoEventUrlsTracker;
        this.f35064d = new ao0(new ou());
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10) {
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void b() {
        this.f35062b.a(this.f35061a, "complete");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void c() {
        this.f35062b.a(this.f35061a, "resume");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void d() {
        this.f35062b.a(this.f35061a, "pause");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void e() {
        this.f35062b.a(this.f35061a, "skip");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void h() {
        this.f35062b.a(this.f35061a, "creativeView");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void i() {
        nu creative = this.f35061a;
        kotlin.jvm.internal.l.f(creative, "creative");
        this.f35062b.a(new su(creative), "creativeRenderingStart");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void k() {
        this.f35065e = false;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void l() {
        this.f35062b.a(this.f35061a, "mute");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void m() {
        if (!this.f35065e) {
            this.f35065e = true;
            this.f35062b.a(this.f35061a, "start");
        }
        this.f35062b.a(this.f35061a, "clickTracking");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(View view, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        if (!this.f35065e) {
            this.f35065e = true;
            this.f35062b.a(this.f35061a, "start");
        }
        this.f35063c.a(this.f35064d.a(this.f35061a, assetName).b(), null);
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(kc2 error) {
        kotlin.jvm.internal.l.f(error, "error");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(zf2.a quartile) {
        String str;
        kotlin.jvm.internal.l.f(quartile, "quartile");
        int iOrdinal = quartile.ordinal();
        if (iOrdinal == 0) {
            str = "firstQuartile";
        } else if (iOrdinal == 1) {
            str = "midpoint";
        } else if (iOrdinal == 2) {
            str = "thirdQuartile";
        } else {
            throw new b9.j();
        }
        this.f35062b.a(this.f35061a, str);
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10, long j4) {
        if (this.f35065e) {
            return;
        }
        this.f35065e = true;
        this.f35062b.a(this.f35061a, "start");
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a() {
        this.f35062b.a(this.f35061a, "unmute");
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
    public final void n() {
    }
}
