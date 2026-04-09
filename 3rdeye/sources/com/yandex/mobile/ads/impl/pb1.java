package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* loaded from: classes3.dex */
public final class pb1 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f31713a;

    public pb1(ia1 videoAdPlayer) {
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        this.f31713a = videoAdPlayer;
    }

    public final void a(ob1 nativeVideoView) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        TextureView textureViewC = nativeVideoView.c();
        this.f31713a.a(textureViewC);
        textureViewC.setVisibility(0);
        nativeVideoView.a().setVisibility(0);
        nativeVideoView.b().setVisibility(0);
    }

    public final void b(ob1 nativeVideoView) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        TextureView textureViewC = nativeVideoView.c();
        this.f31713a.a((TextureView) null);
        textureViewC.setVisibility(8);
        nativeVideoView.a().setVisibility(8);
        nativeVideoView.b().setVisibility(8);
    }
}
