package l5;

import a5.d0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a0 implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14678a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec f14679b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f14680c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer[] f14681d;

    public a0(MediaCodec mediaCodec, int i10) {
        this.f14678a = i10;
        switch (i10) {
            case 1:
                this.f14679b = mediaCodec;
                if (qb.v.f20828a < 21) {
                    this.f14680c = mediaCodec.getInputBuffers();
                    this.f14681d = mediaCodec.getOutputBuffers();
                    break;
                }
                break;
            default:
                this.f14679b = mediaCodec;
                if (d0.f105a < 21) {
                    this.f14680c = mediaCodec.getInputBuffers();
                    this.f14681d = mediaCodec.getOutputBuffers();
                    break;
                }
                break;
        }
    }

    @Override // l5.k
    public void a(rb.f fVar, Handler handler) {
        this.f14679b.setOnFrameRenderedListener(new a(this, fVar, 1), handler);
    }

    @Override // l5.k
    public final MediaFormat b() {
        switch (this.f14678a) {
        }
        return this.f14679b.getOutputFormat();
    }

    @Override // l5.k
    public final void c(Bundle bundle) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.setParameters(bundle);
                break;
            default:
                this.f14679b.setParameters(bundle);
                break;
        }
    }

    @Override // l5.k
    public final void d(int i10, long j) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.releaseOutputBuffer(i10, j);
                break;
            default:
                this.f14679b.releaseOutputBuffer(i10, j);
                break;
        }
    }

    @Override // l5.k
    public final int e() {
        switch (this.f14678a) {
        }
        return this.f14679b.dequeueInputBuffer(0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l5.k
    public final int f(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        int iDequeueOutputBuffer2;
        switch (this.f14678a) {
            case 0:
                do {
                    MediaCodec mediaCodec = this.f14679b;
                    iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
                    if (iDequeueOutputBuffer == -3 && d0.f105a < 21) {
                        this.f14681d = mediaCodec.getOutputBuffers();
                    }
                } while (iDequeueOutputBuffer == -3);
                return iDequeueOutputBuffer;
            default:
                do {
                    MediaCodec mediaCodec2 = this.f14679b;
                    iDequeueOutputBuffer2 = mediaCodec2.dequeueOutputBuffer(bufferInfo, 0L);
                    if (iDequeueOutputBuffer2 == -3 && qb.v.f20828a < 21) {
                        this.f14681d = mediaCodec2.getOutputBuffers();
                    }
                } while (iDequeueOutputBuffer2 == -3);
                return iDequeueOutputBuffer2;
        }
    }

    @Override // l5.k
    public final void flush() {
        switch (this.f14678a) {
            case 0:
                this.f14679b.flush();
                break;
            default:
                this.f14679b.flush();
                break;
        }
    }

    @Override // l5.k
    public final void g(int i10, boolean z10) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.releaseOutputBuffer(i10, z10);
                break;
            default:
                this.f14679b.releaseOutputBuffer(i10, z10);
                break;
        }
    }

    @Override // l5.k
    public final ByteBuffer h(int i10) {
        switch (this.f14678a) {
            case 0:
                if (d0.f105a < 21) {
                    break;
                } else {
                    break;
                }
            default:
                if (qb.v.f20828a < 21) {
                    break;
                } else {
                    break;
                }
        }
        return this.f14680c[i10];
    }

    @Override // l5.k
    public final void i(Surface surface) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.setOutputSurface(surface);
                break;
            default:
                this.f14679b.setOutputSurface(surface);
                break;
        }
    }

    @Override // l5.k
    public final ByteBuffer j(int i10) {
        switch (this.f14678a) {
            case 0:
                if (d0.f105a < 21) {
                    break;
                } else {
                    break;
                }
            default:
                if (qb.v.f20828a < 21) {
                    break;
                } else {
                    break;
                }
        }
        return this.f14681d[i10];
    }

    @Override // l5.k
    public final void k(int i10, int i11, long j, int i12) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.queueInputBuffer(i10, 0, i11, j, i12);
                break;
            default:
                this.f14679b.queueInputBuffer(i10, 0, i11, j, i12);
                break;
        }
    }

    @Override // l5.k
    public void l(int i10, c5.c cVar, long j) throws MediaCodec.CryptoException {
        this.f14679b.queueSecureInputBuffer(i10, 0, cVar.f3304i, j, 0);
    }

    @Override // l5.k
    public final void release() {
        switch (this.f14678a) {
            case 0:
                this.f14680c = null;
                this.f14681d = null;
                this.f14679b.release();
                break;
            default:
                this.f14680c = null;
                this.f14681d = null;
                this.f14679b.release();
                break;
        }
    }

    @Override // l5.k
    public final void setVideoScalingMode(int i10) {
        switch (this.f14678a) {
            case 0:
                this.f14679b.setVideoScalingMode(i10);
                break;
            default:
                this.f14679b.setVideoScalingMode(i10);
                break;
        }
    }
}
