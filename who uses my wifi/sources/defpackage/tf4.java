package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class tf4 implements zf4 {
    public final MediaCodec f;
    public final wf4 g;
    public final vf4 h;
    public final wt2 i;
    public boolean j;
    public int k = 0;

    public /* synthetic */ tf4(MediaCodec mediaCodec, HandlerThread handlerThread, vf4 vf4Var, wt2 wt2Var) {
        this.f = mediaCodec;
        this.g = new wf4(handlerThread);
        this.h = vf4Var;
        this.i = wt2Var;
    }

    public static String c(String str, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.zf4
    public final ByteBuffer B(int i) {
        return this.f.getOutputBuffer(i);
    }

    @Override // defpackage.zf4
    public final void I(int i) {
        this.f.releaseOutputBuffer(i, false);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        wt2 wt2Var;
        LoudnessCodecController loudnessCodecController;
        wf4 wf4Var = this.g;
        zt0.b0(wf4Var.c == null);
        HandlerThread handlerThread = wf4Var.b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f;
        mediaCodec.setCallback(wf4Var, handler);
        wf4Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        vf4 vf4Var = this.h;
        if (!vf4Var.f) {
            HandlerThread handlerThread2 = vf4Var.b;
            handlerThread2.start();
            vf4Var.c = new q3(vf4Var, handlerThread2.getLooper());
            vf4Var.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (wt2Var = this.i) != null && ((loudnessCodecController = (LoudnessCodecController) wt2Var.h) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            zt0.b0(((HashSet) wt2Var.g).add(mediaCodec));
        }
        this.k = 1;
    }

    @Override // defpackage.zf4
    public final int b() {
        this.h.b();
        wf4 wf4Var = this.g;
        synchronized (wf4Var.a) {
            try {
                IllegalStateException illegalStateException = wf4Var.n;
                if (illegalStateException != null) {
                    wf4Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wf4Var.j;
                if (codecException != null) {
                    wf4Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wf4Var.k;
                if (cryptoException != null) {
                    wf4Var.k = null;
                    throw cryptoException;
                }
                int i = -1;
                if (wf4Var.l > 0 || wf4Var.m) {
                    return -1;
                }
                ef efVar = wf4Var.d;
                int i2 = efVar.a;
                int i3 = efVar.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = efVar.c[i2];
                    efVar.a = (i2 + 1) & efVar.d;
                }
                return i;
            } finally {
            }
        }
    }

    @Override // defpackage.zf4
    public final void c0(Bundle bundle) {
        vf4 vf4Var = this.h;
        vf4Var.b();
        q3 q3Var = vf4Var.c;
        String str = v23.a;
        q3Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.zf4
    public final void d(int i, int i2, long j, int i3) {
        vf4 vf4Var = this.h;
        vf4Var.b();
        uf4 uf4VarC = vf4.c();
        uf4VarC.a = i;
        uf4VarC.b = i2;
        uf4VarC.d = j;
        uf4VarC.e = i3;
        q3 q3Var = vf4Var.c;
        String str = v23.a;
        q3Var.obtainMessage(1, uf4VarC).sendToTarget();
    }

    @Override // defpackage.zf4
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        wf4 wf4Var = this.g;
        synchronized (wf4Var.a) {
            try {
                mediaFormat = wf4Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.zf4
    public final void f(int i) {
        this.f.setVideoScalingMode(i);
    }

    @Override // defpackage.zf4
    public final void g() {
        this.h.a();
        MediaCodec mediaCodec = this.f;
        mediaCodec.flush();
        wf4 wf4Var = this.g;
        synchronized (wf4Var.a) {
            wf4Var.l++;
            Handler handler = wf4Var.c;
            String str = v23.a;
            handler.post(new bh3(14, wf4Var));
        }
        mediaCodec.start();
    }

    @Override // defpackage.zf4
    public final boolean j(k34 k34Var) {
        wf4 wf4Var = this.g;
        synchronized (wf4Var.a) {
            wf4Var.o = k34Var;
        }
        return true;
    }

    @Override // defpackage.zf4
    public final void k() {
        wt2 wt2Var;
        wt2 wt2Var2;
        wt2 wt2Var3;
        try {
            try {
                if (this.k == 1) {
                    vf4 vf4Var = this.h;
                    if (vf4Var.f) {
                        vf4Var.a();
                        vf4Var.b.quit();
                    }
                    vf4Var.f = false;
                    wf4 wf4Var = this.g;
                    synchronized (wf4Var.a) {
                        wf4Var.m = true;
                        wf4Var.b.quit();
                        wf4Var.a();
                    }
                }
                this.k = 2;
                if (this.j) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f.stop();
                }
                if (i >= 35 && (wt2Var3 = this.i) != null) {
                    wt2Var3.l(this.f);
                }
                this.f.release();
                this.j = true;
            } catch (Throwable th) {
                if (!this.j) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.f.stop();
                    }
                    if (i2 >= 35 && (wt2Var2 = this.i) != null) {
                        wt2Var2.l(this.f);
                    }
                    this.f.release();
                    this.j = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (wt2Var = this.i) != null) {
                wt2Var.l(this.f);
            }
            this.f.release();
            this.j = true;
            throw th2;
        }
    }

    @Override // defpackage.zf4
    public final void m(int i, long j) {
        this.f.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.zf4
    public final void n(int i, yu3 yu3Var, long j, int i2) {
        int length;
        int length2;
        int length3;
        int length4;
        vf4 vf4Var = this.h;
        vf4Var.b();
        uf4 uf4VarC = vf4.c();
        uf4VarC.a = i;
        uf4VarC.b = 0;
        uf4VarC.d = j;
        uf4VarC.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = uf4VarC.c;
        cryptoInfo.numSubSamples = yu3Var.f;
        int[] iArr = yu3Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = yu3Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = yu3Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < (length2 = bArr.length)) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, length2);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = yu3Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < (length = bArr2.length)) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = yu3Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(yu3Var.g, yu3Var.h));
        q3 q3Var = vf4Var.c;
        String str = v23.a;
        q3Var.obtainMessage(2, uf4VarC).sendToTarget();
    }

    @Override // defpackage.zf4
    public final void o() {
        this.f.detachOutputSurface();
    }

    @Override // defpackage.zf4
    public final void q(Surface surface) {
        this.f.setOutputSurface(surface);
    }

    @Override // defpackage.zf4
    public final int r(MediaCodec.BufferInfo bufferInfo) {
        this.h.b();
        wf4 wf4Var = this.g;
        synchronized (wf4Var.a) {
            try {
                IllegalStateException illegalStateException = wf4Var.n;
                if (illegalStateException != null) {
                    wf4Var.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = wf4Var.j;
                if (codecException != null) {
                    wf4Var.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = wf4Var.k;
                if (cryptoException != null) {
                    wf4Var.k = null;
                    throw cryptoException;
                }
                if (wf4Var.l > 0 || wf4Var.m) {
                    return -1;
                }
                ef efVar = wf4Var.e;
                int i = efVar.a;
                int i2 = efVar.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = efVar.c[i];
                efVar.a = efVar.d & (i + 1);
                if (i3 >= 0) {
                    if (wf4Var.h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) wf4Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    wf4Var.h = (MediaFormat) wf4Var.g.remove();
                    i3 = -2;
                }
                return i3;
            } finally {
            }
        }
    }

    @Override // defpackage.zf4
    public final ByteBuffer z(int i) {
        return this.f.getInputBuffer(i);
    }
}
