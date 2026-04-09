package com.google.android.gms.internal.ads;

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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class CP implements JP {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f7587a;

    /* renamed from: b, reason: collision with root package name */
    public final GP f7588b;

    /* renamed from: c, reason: collision with root package name */
    public final FP f7589c;

    /* renamed from: d, reason: collision with root package name */
    public final C1879sw f7590d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7591e;

    /* renamed from: f, reason: collision with root package name */
    public int f7592f = 0;

    public /* synthetic */ CP(MediaCodec mediaCodec, HandlerThread handlerThread, FP fp, C1879sw c1879sw) {
        this.f7587a = mediaCodec;
        this.f7588b = new GP(handlerThread);
        this.f7589c = fp;
        this.f7590d = c1879sw;
    }

    public static String d(int i, String str) {
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

    @Override // com.google.android.gms.internal.ads.JP
    public final ByteBuffer B(int i) {
        return this.f7587a.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void E(int i) {
        this.f7587a.releaseOutputBuffer(i, false);
    }

    public final void a(MediaFormat mediaFormat, Surface surface, int i) {
        C1879sw c1879sw;
        LoudnessCodecController loudnessCodecController;
        GP gp = this.f7588b;
        AbstractC0582Jp.h0(gp.f8374c == null);
        HandlerThread handlerThread = gp.f8373b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f7587a;
        mediaCodec.setCallback(gp, handler);
        gp.f8374c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i);
        Trace.endSection();
        FP fp = this.f7589c;
        if (!fp.f8124f) {
            HandlerThread handlerThread2 = fp.f8120b;
            handlerThread2.start();
            fp.f8121c = new DP(fp, handlerThread2.getLooper());
            fp.f8124f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (c1879sw = this.f7590d) != null && ((loudnessCodecController = (LoudnessCodecController) c1879sw.f16824c) == null || loudnessCodecController.addMediaCodec(mediaCodec))) {
            AbstractC0582Jp.h0(((HashSet) c1879sw.f16823b).add(mediaCodec));
        }
        this.f7592f = 1;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final int b() {
        this.f7589c.b();
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            try {
                gp.b();
                int i = -1;
                if (gp.f8382l > 0 || gp.f8383m) {
                    return -1;
                }
                C1506m c1506m = gp.f8375d;
                int i3 = c1506m.f15502a;
                int i6 = c1506m.f15503b;
                if (!(i3 == i6)) {
                    if (i3 == i6) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = ((int[]) c1506m.f15505d)[i3];
                    c1506m.f15502a = (i3 + 1) & c1506m.f15504c;
                }
                return i;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final ByteBuffer c(int i) {
        return this.f7587a.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            try {
                mediaFormat = gp.f8379h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void f(ArrayList arrayList) {
        this.f7587a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void g(Bundle bundle) {
        FP fp = this.f7589c;
        fp.b();
        DP dp = fp.f8121c;
        String str = Vt.f12096a;
        dp.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void h(Surface surface) {
        this.f7587a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void i() {
        C1879sw c1879sw;
        C1879sw c1879sw2;
        C1879sw c1879sw3;
        try {
            try {
                if (this.f7592f == 1) {
                    FP fp = this.f7589c;
                    if (fp.f8124f) {
                        fp.a();
                        fp.f8120b.quit();
                    }
                    fp.f8124f = false;
                    GP gp = this.f7588b;
                    synchronized (gp.f8372a) {
                        gp.f8383m = true;
                        gp.f8373b.quit();
                        gp.a();
                    }
                }
                this.f7592f = 2;
                if (this.f7591e) {
                    return;
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.f7587a.stop();
                }
                if (i >= 35 && (c1879sw3 = this.f7590d) != null) {
                    c1879sw3.f(this.f7587a);
                }
                this.f7587a.release();
                this.f7591e = true;
            } catch (Throwable th) {
                if (!this.f7591e) {
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 30 && i3 < 33) {
                        this.f7587a.stop();
                    }
                    if (i3 >= 35 && (c1879sw2 = this.f7590d) != null) {
                        c1879sw2.f(this.f7587a);
                    }
                    this.f7587a.release();
                    this.f7591e = true;
                }
                throw th;
            }
        } catch (Throwable th2) {
            if (Build.VERSION.SDK_INT >= 35 && (c1879sw = this.f7590d) != null) {
                c1879sw.f(this.f7587a);
            }
            this.f7587a.release();
            this.f7591e = true;
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void k() {
        this.f7589c.a();
        MediaCodec mediaCodec = this.f7587a;
        mediaCodec.flush();
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            gp.f8382l++;
            Handler handler = gp.f8374c;
            String str = Vt.f12096a;
            handler.post(new Fu(19, gp));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        this.f7589c.b();
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            try {
                gp.b();
                if (gp.f8382l > 0 || gp.f8383m) {
                    return -1;
                }
                C1506m c1506m = gp.f8376e;
                int i = c1506m.f15502a;
                int i3 = c1506m.f15503b;
                if (i == i3) {
                    return -1;
                }
                if (i == i3) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i6 = ((int[]) c1506m.f15505d)[i];
                c1506m.f15502a = c1506m.f15504c & (i + 1);
                if (i6 >= 0) {
                    if (gp.f8379h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) gp.f8377f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i6 == -2) {
                    gp.f8379h = (MediaFormat) gp.f8378g.remove();
                    i6 = -2;
                }
                return i6;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void m(int i) {
        this.f7587a.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void n(int i, OL ol, long j6, int i3) {
        int length;
        int length2;
        int length3;
        int length4;
        FP fp = this.f7589c;
        fp.b();
        EP epC = FP.c();
        epC.f7958a = i;
        epC.f7959b = 0;
        epC.f7961d = j6;
        epC.f7962e = i3;
        MediaCodec.CryptoInfo cryptoInfo = epC.f7960c;
        cryptoInfo.numSubSamples = ol.f10182f;
        int[] iArr = ol.f10180d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = ol.f10181e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = ol.f10178b;
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
        byte[] bArr2 = ol.f10177a;
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
        cryptoInfo.mode = ol.f10179c;
        if (Build.VERSION.SDK_INT >= 24) {
            AbstractC2067wL.o();
            cryptoInfo.setPattern(AbstractC2067wL.h(ol.f10183g, ol.f10184h));
        }
        DP dp = fp.f8121c;
        String str = Vt.f12096a;
        dp.obtainMessage(2, epC).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void p() {
        this.f7587a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void r(NP np) {
        RunnableC0786Vp runnableC0786Vp = new RunnableC0786Vp(this, 29, np);
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            gp.b();
            runnableC0786Vp.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void s(int i, int i3, long j6, int i6) {
        FP fp = this.f7589c;
        fp.b();
        EP epC = FP.c();
        epC.f7958a = i;
        epC.f7959b = i3;
        epC.f7961d = j6;
        epC.f7962e = i6;
        DP dp = fp.f8121c;
        String str = Vt.f12096a;
        dp.obtainMessage(1, epC).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final boolean t(C1448kw c1448kw) {
        GP gp = this.f7588b;
        synchronized (gp.f8372a) {
            gp.f8385o = c1448kw;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.JP
    public final void v(int i, long j6) {
        this.f7587a.releaseOutputBuffer(i, j6);
    }
}
