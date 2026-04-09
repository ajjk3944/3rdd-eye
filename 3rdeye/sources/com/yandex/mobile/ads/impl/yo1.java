package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes3.dex */
public final class yo1 {

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ob1 f35943b;

        /* renamed from: c, reason: collision with root package name */
        private final bp1 f35944c;

        public a(ob1 nativeVideoView, bp1 replayActionView) {
            kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
            kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
            this.f35943b = nativeVideoView;
            this.f35944c = replayActionView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35943b.c().setVisibility(4);
            this.f35944c.a().setVisibility(0);
        }
    }

    public static final class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final bp1 f35945b;

        /* renamed from: c, reason: collision with root package name */
        private final Bitmap f35946c;

        public b(bp1 replayActionView, Bitmap background) {
            kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
            kotlin.jvm.internal.l.f(background, "background");
            this.f35945b = replayActionView;
            this.f35946c = background;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f35945b.setBackground(new BitmapDrawable(this.f35945b.getResources(), this.f35946c));
            this.f35945b.setVisibility(0);
        }
    }

    public static void a(ob1 nativeVideoView, bp1 replayActionView, Bitmap background) {
        kotlin.jvm.internal.l.f(nativeVideoView, "nativeVideoView");
        kotlin.jvm.internal.l.f(replayActionView, "replayActionView");
        kotlin.jvm.internal.l.f(background, "background");
        replayActionView.setAlpha(0.0f);
        replayActionView.animate().alpha(1.0f).setDuration(700L).withStartAction(new b(replayActionView, background)).withEndAction(new a(nativeVideoView, replayActionView)).start();
    }
}
