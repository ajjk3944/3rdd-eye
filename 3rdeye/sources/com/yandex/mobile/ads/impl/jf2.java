package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.bi1;
import java.util.List;

/* loaded from: classes3.dex */
public final class jf2 implements bi1.b {

    /* renamed from: a, reason: collision with root package name */
    private uy1 f29129a;

    /* renamed from: b, reason: collision with root package name */
    private uy1 f29130b;

    /* renamed from: c, reason: collision with root package name */
    private TextureView f29131c;

    /* renamed from: d, reason: collision with root package name */
    private lf2 f29132d;

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(int i) {
        G.a(this, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void b(h60 h60Var) {
        G.n(this, h60Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onCues(List list) {
        G.o(this, list);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onIsLoadingChanged(boolean z10) {
        G.p(this, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onIsPlayingChanged(boolean z10) {
        G.q(this, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i) {
        G.r(this, z10, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onPlaybackStateChanged(int i) {
        G.s(this, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        G.t(this, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onPlayerStateChanged(boolean z10, int i) {
        G.u(this, z10, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onRenderedFirstFrame() {
        G.v(this);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        G.w(this, z10);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void onSurfaceSizeChanged(int i, int i10) {
        Matrix matrixA;
        uy1 uy1Var = new uy1(i, i10);
        this.f29130b = uy1Var;
        lf2 lf2Var = this.f29132d;
        uy1 uy1Var2 = this.f29129a;
        TextureView textureView = this.f29131c;
        if (uy1Var2 == null || lf2Var == null || textureView == null || (matrixA = new kf2(uy1Var, uy1Var2).a(lf2Var)) == null) {
            return;
        }
        textureView.setTransform(matrixA);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void onVolumeChanged(float f10) {
        G.y(this, f10);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(aw0 aw0Var) {
        G.b(this, aw0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(bi1.a aVar) {
        G.c(this, aVar);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(bi1.c cVar, bi1.c cVar2, int i) {
        G.d(this, cVar, cVar2, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(cv cvVar) {
        G.e(this, cvVar);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(d10 d10Var) {
        G.f(this, d10Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(h60 h60Var) {
        G.g(this, h60Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(o62 o62Var) {
        G.h(this, o62Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(vh1 vh1Var) {
        G.j(this, vh1Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(xv0 xv0Var, int i) {
        G.k(this, xv0Var, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(yz0 yz0Var) {
        G.l(this, yz0Var);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final /* synthetic */ void a(boolean z10, int i) {
        G.m(this, z10, i);
    }

    @Override // com.yandex.mobile.ads.impl.bi1.b
    public final void a(pf2 videoSize) {
        Matrix matrixA;
        kotlin.jvm.internal.l.f(videoSize, "videoSize");
        int iY = videoSize.f31730b;
        float f10 = videoSize.f31733e;
        if (f10 > 0.0f) {
            iY = com.google.gson.internal.c.y(iY * f10);
        }
        uy1 uy1Var = new uy1(iY, videoSize.f31731c);
        this.f29129a = uy1Var;
        uy1 uy1Var2 = this.f29130b;
        lf2 lf2Var = this.f29132d;
        TextureView textureView = this.f29131c;
        if (uy1Var2 == null || lf2Var == null || textureView == null || (matrixA = new kf2(uy1Var2, uy1Var).a(lf2Var)) == null) {
            return;
        }
        textureView.setTransform(matrixA);
    }

    public final void a(lf2 lf2Var) {
        this.f29132d = lf2Var;
        TextureView textureView = this.f29131c;
        if (lf2Var == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    public final void a(TextureView textureView) {
        this.f29131c = textureView;
        if (this.f29132d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }
}
