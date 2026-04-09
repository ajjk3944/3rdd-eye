package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.yandex.mobile.ads.impl.uu0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class l32 implements uu0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f29870a;

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer[] f29871b;

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f29872c;

    public static class a implements uu0.b {
        public static MediaCodec b(uu0.a aVar) throws IOException {
            aVar.f34220a.getClass();
            String str = aVar.f34220a.f35980a;
            h52.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            h52.a();
            return mediaCodecCreateByCodecName;
        }

        @Override // com.yandex.mobile.ads.impl.uu0.b
        public final uu0 a(uu0.a aVar) throws IOException {
            MediaCodec mediaCodecB = null;
            try {
                mediaCodecB = b(aVar);
                h52.a("configureCodec");
                mediaCodecB.configure(aVar.f34221b, aVar.f34223d, aVar.f34224e, 0);
                h52.a();
                h52.a("startCodec");
                mediaCodecB.start();
                h52.a();
                return new l32(mediaCodecB, 0);
            } catch (IOException | RuntimeException e4) {
                if (mediaCodecB != null) {
                    mediaCodecB.release();
                }
                throw e4;
            }
        }
    }

    public /* synthetic */ l32(MediaCodec mediaCodec, int i) {
        this(mediaCodec);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final int b() {
        return this.f29870a.dequeueInputBuffer(0L);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final ByteBuffer c(int i) {
        return s82.f32899a >= 21 ? this.f29870a.getOutputBuffer(i) : this.f29872c[i];
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void flush() {
        this.f29870a.flush();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void release() {
        this.f29871b = null;
        this.f29872c = null;
        this.f29870a.release();
    }

    private l32(MediaCodec mediaCodec) {
        this.f29870a = mediaCodec;
        if (s82.f32899a < 21) {
            this.f29871b = mediaCodec.getInputBuffers();
            this.f29872c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f29870a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && s82.f32899a < 21) {
                this.f29872c = this.f29870a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final ByteBuffer b(int i) {
        return s82.f32899a >= 21 ? this.f29870a.getInputBuffer(i) : this.f29871b[i];
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final MediaFormat a() {
        return this.f29870a.getOutputFormat();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(uu0.c cVar, MediaCodec mediaCodec, long j4, long j10) {
        cVar.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, int i10, long j4, int i11) throws MediaCodec.CryptoException {
        this.f29870a.queueInputBuffer(i, 0, i10, j4, i11);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, zu zuVar, long j4) throws MediaCodec.CryptoException {
        this.f29870a.queueSecureInputBuffer(i, 0, zuVar.a(), j4, 0);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, long j4) {
        this.f29870a.releaseOutputBuffer(i, j4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(boolean z10, int i) {
        this.f29870a.releaseOutputBuffer(i, z10);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(final uu0.c cVar, Handler handler) {
        this.f29870a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.H1
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j10) {
                this.f24128a.a(cVar, mediaCodec, j4, j10);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(Surface surface) {
        this.f29870a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(Bundle bundle) {
        this.f29870a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i) {
        this.f29870a.setVideoScalingMode(i);
    }
}
