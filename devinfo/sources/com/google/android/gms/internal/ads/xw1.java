package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Build;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xw1 {
    public static final ArrayDeque g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f18530h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f18531a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f18532b;

    /* renamed from: c, reason: collision with root package name */
    public vw1 f18533c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f18534d;

    /* renamed from: e, reason: collision with root package name */
    public final za0 f18535e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18536f;

    public xw1(MediaCodec mediaCodec, HandlerThread handlerThread) {
        za0 za0Var = new za0();
        this.f18531a = mediaCodec;
        this.f18532b = handlerThread;
        this.f18535e = za0Var;
        this.f18534d = new AtomicReference();
    }

    public static ww1 d() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new ww1();
                }
                return (ww1) arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void a(int i4, bp1 bp1Var, long j, int i10) {
        int length;
        int length2;
        int length3;
        int length4;
        c();
        ww1 ww1VarD = d();
        ww1VarD.f18222a = i4;
        ww1VarD.f18223b = 0;
        ww1VarD.f18225d = j;
        ww1VarD.f18226e = i10;
        MediaCodec.CryptoInfo cryptoInfo = ww1VarD.f18224c;
        cryptoInfo.numSubSamples = bp1Var.f9761f;
        int[] iArr = bp1Var.f9759d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < (length4 = iArr.length)) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, length4);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = bp1Var.f9760e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < (length3 = iArr2.length)) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, length3);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = bp1Var.f9757b;
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
        byte[] bArr2 = bp1Var.f9756a;
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
        cryptoInfo.mode = bp1Var.f9758c;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bp1Var.g, bp1Var.f9762h));
        }
        vw1 vw1Var = this.f18533c;
        String str = bq0.f9768a;
        vw1Var.obtainMessage(2, ww1VarD).sendToTarget();
    }

    public final void b() {
        if (this.f18536f) {
            try {
                vw1 vw1Var = this.f18533c;
                if (vw1Var == null) {
                    throw null;
                }
                vw1Var.removeCallbacksAndMessages(null);
                za0 za0Var = this.f18535e;
                synchronized (za0Var) {
                    za0Var.f19049a = false;
                }
                vw1 vw1Var2 = this.f18533c;
                if (vw1Var2 == null) {
                    throw null;
                }
                vw1Var2.obtainMessage(3).sendToTarget();
                za0Var.c();
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }

    public final void c() {
        RuntimeException runtimeException = (RuntimeException) this.f18534d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }
}
