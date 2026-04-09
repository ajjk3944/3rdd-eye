package com.instagram.common.viewpoint.core;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.o6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1861o6 implements B0 {
    public static String[] A03 = {"TBh0kDiSO0F5FU8B8W6", "Wu96YBEbp5", "GXHkztSg0E", "SVf9uR0CS1ZMhrygTfVGTHtgONFy9fbr", "ToJtFxraFZDV0Nhg1oJyUAeavZbRFz0H", "e4ZNDN8Q6QOy3wABZV9fSILWPV6YlB7H", "vAs40s3kLNqKh27SimoH5s3SjKwld5mw", "MzWq8aWYtfnIiGPN6xqzLuzHDFClSOvg"};
    public ByteBuffer[] A00;
    public ByteBuffer[] A01;
    public final MediaCodec A02;

    @MetaExoPlayerCustomization("This constructor is private in Exo r2.18.6 and builder pattern should be used.This can be fixed after MediaCodecPool.Java dependency is removed.Because the Factory calls start before allocating the adapter it can call getInputBuffers here. Butdo not do it while the constructor is public because start hasn't been called yet.See S358180")
    public C1861o6(MediaCodec mediaCodec) {
        this.A02 = mediaCodec;
    }

    public final /* synthetic */ void A00(InterfaceC0387Az interfaceC0387Az, MediaCodec mediaCodec, long j, long j8) {
        interfaceC0387Az.ADz(this, j, j8);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization("Override is customization due to dependency on MediaCodec[Audio/Video]Renderer")
    public final void A58(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i4, Object obj) {
        this.A02.configure(mediaFormat, surface, mediaCrypto, i4);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final int A5s() {
        return this.A02.dequeueInputBuffer(0L);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final int A5u(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.A02.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && C5C.A02 < 21) {
                this.A01 = this.A02.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final ByteBuffer A8J(int i4) {
        if (C5C.A02 >= 21) {
            return this.A02.getInputBuffer(i4);
        }
        ByteBuffer[] byteBufferArr = this.A00;
        if (A03[0].length() == 9) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[2] = "7Nv94jZvV7";
        strArr[1] = "iAeXpyFDwx";
        return ((ByteBuffer[]) C5C.A0f(byteBufferArr))[i4];
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final ByteBuffer A8e(int i4) {
        if (C5C.A02 >= 21) {
            return this.A02.getOutputBuffer(i4);
        }
        return ((ByteBuffer[]) C5C.A0f(this.A01))[i4];
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final MediaFormat A8f() {
        return this.A02.getOutputFormat();
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization("Added in D39791066")
    public final Pair<Long, Integer> A8j() {
        return new Pair<>(0L, 0);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization("Added in D39791066")
    public final int A9K() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AHI(int i4, int i10, int i11, long j, int i12) throws MediaCodec.CryptoException {
        this.A02.queueInputBuffer(i4, i10, i11, j, i12);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AHK(int i4, int i10, C02735z c02735z, long j, int i11) throws MediaCodec.CryptoException {
        this.A02.queueSecureInputBuffer(i4, i10, c02735z.A00(), j, i11);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AHb() {
        this.A00 = null;
        this.A01 = null;
        this.A02.release();
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AHh(int i4, long j) {
        this.A02.releaseOutputBuffer(i4, j);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AHi(int i4, boolean z3) {
        this.A02.releaseOutputBuffer(i4, z3);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AJa(final InterfaceC0387Az interfaceC0387Az, Handler handler) {
        this.A02.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.facebook.ads.redexgen.X.Bb
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j8) {
                this.A01.A00(interfaceC0387Az, mediaCodec, j, j8);
            }
        }, handler);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AJb(Surface surface) {
        this.A02.setOutputSurface(surface);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void AJs(int i4) {
        this.A02.setVideoScalingMode(i4);
    }

    @Override // com.instagram.common.viewpoint.core.B0
    public final void flush() {
        this.A02.flush();
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization
    public final void reset() {
        this.A02.reset();
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization("Could be revisited after upgrading MediaCodecRenderer")
    public final void start() {
        this.A02.start();
    }

    @Override // com.instagram.common.viewpoint.core.B0
    @MetaExoPlayerCustomization
    public final void stop() {
        this.A02.stop();
    }
}
