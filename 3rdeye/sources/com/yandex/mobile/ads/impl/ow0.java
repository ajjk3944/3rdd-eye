package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.am1;
import com.yandex.mobile.ads.impl.jz;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.y60;

/* loaded from: classes3.dex */
public final class ow0 {

    /* renamed from: a, reason: collision with root package name */
    private final nw0 f31508a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31509b;

    public ow0(Context context, nw0 mediaSourcePathProvider) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(mediaSourcePathProvider, "mediaSourcePathProvider");
        this.f31508a = mediaSourcePathProvider;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31509b = applicationContext;
    }

    public final am1 a(ec2 videoAdPlaybackInfo) {
        kotlin.jvm.internal.l.f(videoAdPlaybackInfo, "videoAdPlaybackInfo");
        qm.a aVarA = new qm.a().a(y60.a.a().a(this.f31509b)).a(new jz.a(this.f31509b, new wu1(xs1.a()).a(this.f31509b)));
        kotlin.jvm.internal.l.e(aVarA, "setUpstreamDataSourceFactory(...)");
        am1.a aVar = new am1.a(aVarA, new sz());
        this.f31508a.getClass();
        am1 am1VarA = aVar.a(xv0.a(videoAdPlaybackInfo.getUrl()));
        kotlin.jvm.internal.l.e(am1VarA, "createMediaSource(...)");
        return am1VarA;
    }
}
