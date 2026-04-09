package com.yandex.mobile.ads.impl;

import android.view.TextureView;

/* loaded from: classes3.dex */
public final class qa1 implements wa1 {

    /* renamed from: a, reason: collision with root package name */
    private final ia1 f32125a;

    /* renamed from: b, reason: collision with root package name */
    private final ob1 f32126b;

    public qa1(ia1 player, ob1 videoView) {
        kotlin.jvm.internal.l.f(player, "player");
        kotlin.jvm.internal.l.f(videoView, "videoView");
        this.f32125a = player;
        this.f32126b = videoView;
    }

    @Override // com.yandex.mobile.ads.impl.wa1
    public final void a() {
        this.f32126b.b().b().clearAnimation();
        this.f32125a.a((TextureView) null);
    }

    @Override // com.yandex.mobile.ads.impl.wa1
    public final void b() {
        this.f32125a.a(this.f32126b.c());
    }
}
