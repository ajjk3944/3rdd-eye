package com.google.android.gms.internal.ads;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class uw1 implements cx1 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f17368a;

    /* renamed from: b, reason: collision with root package name */
    public final yw1 f17369b;

    /* renamed from: c, reason: collision with root package name */
    public final xw1 f17370c;

    /* renamed from: d, reason: collision with root package name */
    public final bx1 f17371d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17372e;

    /* renamed from: f, reason: collision with root package name */
    public int f17373f = 0;

    public /* synthetic */ uw1(MediaCodec mediaCodec, HandlerThread handlerThread, xw1 xw1Var, bx1 bx1Var) {
        this.f17368a = mediaCodec;
        this.f17369b = new yw1(handlerThread);
        this.f17370c = xw1Var;
        this.f17371d = bx1Var;
    }

    public static String q(int i4, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i4 == 1) {
            sb2.append("Audio");
        } else if (i4 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i4);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void B1() {
        bx1 bx1Var;
        bx1 bx1Var2;
        bx1 bx1Var3;
        try {
            try {
                if (this.f17373f == 1) {
                    xw1 xw1Var = this.f17370c;
                    if (xw1Var.f18536f) {
                        xw1Var.b();
                        xw1Var.f18532b.quit();
                    }
                    xw1Var.f18536f = false;
                    yw1 yw1Var = this.f17369b;
                    synchronized (yw1Var.f18900a) {
                        yw1Var.f18910m = true;
                        yw1Var.f18901b.quit();
                        yw1Var.a();
                    }
                }
                this.f17373f = 2;
                if (this.f17372e) {
                    return;
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30 && i4 < 33) {
                    this.f17368a.stop();
                }
                if (i4 >= 35 && (bx1Var3 = this.f17371d) != null) {
                    bx1Var3.r(this.f17368a);
                }
                this.f17368a.release();
                this.f17372e = true;
            } catch (Throwable th2) {
                if (!this.f17372e) {
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30 && i10 < 33) {
                        this.f17368a.stop();
                    }
                    if (i10 >= 35 && (bx1Var2 = this.f17371d) != null) {
                        bx1Var2.r(this.f17368a);
                    }
                    this.f17368a.release();
                    this.f17372e = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (bx1Var = this.f17371d) != null) {
                bx1Var.r(this.f17368a);
            }
            this.f17368a.release();
            this.f17372e = true;
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void D1() {
        this.f17370c.b();
        MediaCodec mediaCodec = this.f17368a;
        mediaCodec.flush();
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            yw1Var.f18909l++;
            Handler handler = yw1Var.f18902c;
            String str = bq0.f9768a;
            handler.post(new du0(18, yw1Var));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void H1() {
        this.f17368a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final ByteBuffer a(int i4) {
        return this.f17368a.getOutputBuffer(i4);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void b(ArrayList arrayList) {
        this.f17368a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final int c() {
        this.f17370c.c();
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            try {
                yw1Var.b();
                int i4 = -1;
                if (yw1Var.f18909l > 0 || yw1Var.f18910m) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.k kVar = yw1Var.f18903d;
                int i10 = kVar.f1000a;
                int i11 = kVar.f1001b;
                if (!(i10 == i11)) {
                    if (i10 == i11) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i4 = ((int[]) kVar.f1003d)[i10];
                    kVar.f1000a = (i10 + 1) & kVar.f1002c;
                }
                return i4;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void d(Bundle bundle) {
        xw1 xw1Var = this.f17370c;
        xw1Var.c();
        vw1 vw1Var = xw1Var.f18533c;
        String str = bq0.f9768a;
        vw1Var.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final MediaFormat e() {
        MediaFormat mediaFormat;
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            try {
                mediaFormat = yw1Var.f18906h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void f(Surface surface) {
        this.f17368a.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        this.f17370c.c();
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            try {
                yw1Var.b();
                if (yw1Var.f18909l > 0 || yw1Var.f18910m) {
                    return -1;
                }
                androidx.datastore.preferences.protobuf.k kVar = yw1Var.f18904e;
                int i4 = kVar.f1000a;
                int i10 = kVar.f1001b;
                if (i4 == i10) {
                    return -1;
                }
                if (i4 == i10) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i11 = ((int[]) kVar.f1003d)[i4];
                kVar.f1000a = kVar.f1002c & (i4 + 1);
                if (i11 >= 0) {
                    if (yw1Var.f18906h == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) yw1Var.f18905f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i11 == -2) {
                    yw1Var.f18906h = (MediaFormat) yw1Var.g.remove();
                    i11 = -2;
                }
                return i11;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void h(int i4) {
        this.f17368a.setVideoScalingMode(i4);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void i(int i4, bp1 bp1Var, long j, int i10) {
        this.f17370c.a(i4, bp1Var, j, i10);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final boolean j(kh0 kh0Var) {
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            yw1Var.f18912o = kh0Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void k(int i4, int i10, long j, int i11) {
        xw1 xw1Var = this.f17370c;
        xw1Var.c();
        ww1 ww1VarD = xw1.d();
        ww1VarD.f18222a = i4;
        ww1VarD.f18223b = i10;
        ww1VarD.f18225d = j;
        ww1VarD.f18226e = i11;
        vw1 vw1Var = xw1Var.f18533c;
        String str = bq0.f9768a;
        vw1Var.obtainMessage(1, ww1VarD).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void l(int i4, long j) {
        this.f17368a.releaseOutputBuffer(i4, j);
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void m(uh0 uh0Var) {
        uh0 uh0Var2 = new uh0(28, this, uh0Var);
        yw1 yw1Var = this.f17369b;
        synchronized (yw1Var.f18900a) {
            yw1Var.b();
            uh0Var2.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final ByteBuffer n(int i4) {
        return this.f17368a.getInputBuffer(i4);
    }

    public final void o(MediaFormat mediaFormat, Surface surface, int i4) {
        bx1 bx1Var;
        yw1 yw1Var = this.f17369b;
        mq0.c0(yw1Var.f18902c == null);
        HandlerThread handlerThread = yw1Var.f18901b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f17368a;
        mediaCodec.setCallback(yw1Var, handler);
        yw1Var.f18902c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i4);
        Trace.endSection();
        xw1 xw1Var = this.f17370c;
        if (!xw1Var.f18536f) {
            HandlerThread handlerThread2 = xw1Var.f18532b;
            handlerThread2.start();
            xw1Var.f18533c = new vw1(xw1Var, handlerThread2.getLooper());
            xw1Var.f18536f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (bx1Var = this.f17371d) != null) {
            bx1Var.q(mediaCodec);
        }
        this.f17373f = 1;
    }

    @Override // com.google.android.gms.internal.ads.cx1
    public final void p(int i4) {
        this.f17368a.releaseOutputBuffer(i4, false);
    }
}
