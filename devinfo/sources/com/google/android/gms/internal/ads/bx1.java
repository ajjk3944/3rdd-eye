package com.google.android.gms.internal.ads;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bx1 implements cx1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9846a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9847b;

    public bx1() {
        this.f9846a = new HashSet();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void B1() {
        bx1 bx1Var = (bx1) this.f9847b;
        MediaCodec mediaCodec = (MediaCodec) this.f9846a;
        try {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && i4 < 33) {
                mediaCodec.stop();
            }
            if (i4 >= 35 && bx1Var != null) {
                bx1Var.r(mediaCodec);
            }
            mediaCodec.release();
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && bx1Var != null) {
                bx1Var.r(mediaCodec);
            }
            mediaCodec.release();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void D1() {
        ((MediaCodec) this.f9846a).flush();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void H1() {
        ((MediaCodec) this.f9846a).detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public ByteBuffer a(int i4) {
        return ((MediaCodec) this.f9846a).getOutputBuffer(i4);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void b(ArrayList arrayList) {
        ((MediaCodec) this.f9846a).subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public int c() {
        return ((MediaCodec) this.f9846a).dequeueInputBuffer(0L);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void d(Bundle bundle) {
        ((MediaCodec) this.f9846a).setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public MediaFormat e() {
        return ((MediaCodec) this.f9846a).getOutputFormat();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void f(Surface surface) {
        ((MediaCodec) this.f9846a).setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f9846a).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void h(int i4) {
        ((MediaCodec) this.f9846a).setVideoScalingMode(i4);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void i(int i4, bp1 bp1Var, long j, int i10) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f9846a).queueSecureInputBuffer(i4, 0, bp1Var.f9763i, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public /* synthetic */ boolean j(kh0 kh0Var) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void k(int i4, int i10, long j, int i11) throws MediaCodec.CryptoException {
        ((MediaCodec) this.f9846a).queueInputBuffer(i4, 0, i10, j, i11);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void l(int i4, long j) {
        ((MediaCodec) this.f9846a).releaseOutputBuffer(i4, j);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void m(uh0 uh0Var) throws RemoteException, IOException {
        uh0Var.run();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public ByteBuffer n(int i4) {
        return ((MediaCodec) this.f9846a).getInputBuffer(i4);
    }

    public void o(int i4) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f9847b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f9847b = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i4, k81.f13081a, new ax1());
        this.f9847b = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.f9846a).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public void p(int i4) {
        ((MediaCodec) this.f9846a).releaseOutputBuffer(i4, false);
    }

    public void q(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f9847b;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            mq0.c0(((HashSet) this.f9846a).add(mediaCodec));
        }
    }

    public void r(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f9846a).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f9847b) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void s() {
        ((HashSet) this.f9846a).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f9847b;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public /* synthetic */ bx1(MediaCodec mediaCodec, bx1 bx1Var) {
        this.f9846a = mediaCodec;
        this.f9847b = bx1Var;
        if (Build.VERSION.SDK_INT < 35 || bx1Var == null) {
            return;
        }
        bx1Var.q(mediaCodec);
    }
}
