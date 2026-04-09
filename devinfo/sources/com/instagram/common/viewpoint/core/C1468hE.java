package com.instagram.common.viewpoint.core;

import com.facebook.ads.MediaViewListener;

/* renamed from: com.facebook.ads.redexgen.X.hE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1468hE implements InterfaceC0991Yv {
    public final /* synthetic */ MediaViewListener A00;
    public final /* synthetic */ C1466hC A01;

    public C1468hE(C1466hC c1466hC, MediaViewListener mediaViewListener) {
        this.A01 = c1466hC;
        this.A00 = mediaViewListener;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void ADQ() {
        this.A00.onComplete(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void ADn() {
        this.A00.onEnterFullscreen(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void ADt() {
        this.A00.onExitFullscreen(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void AE1() {
        this.A00.onFullscreenBackground(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void AE3() {
        this.A00.onFullscreenForeground(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void AFC() {
        this.A00.onPlay(this.A01.A07);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void AGe() {
        this.A00.onVolumeChange(this.A01.A07, this.A01.A09.getVolume());
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0991Yv
    public final void onPause() {
        this.A00.onPause(this.A01.A07);
    }
}
