package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
final class bh {

    /* renamed from: g, reason: collision with root package name */
    private static final ArrayDeque<b> f25264g = new ArrayDeque<>();

    /* renamed from: h, reason: collision with root package name */
    private static final Object f25265h = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f25266a;

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f25267b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f25268c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<RuntimeException> f25269d;

    /* renamed from: e, reason: collision with root package name */
    private final cr f25270e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f25271f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws MediaCodec.CryptoException {
            bh.this.a(message);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f25273a;

        /* renamed from: b, reason: collision with root package name */
        public int f25274b;

        /* renamed from: c, reason: collision with root package name */
        public int f25275c;

        /* renamed from: d, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f25276d = new MediaCodec.CryptoInfo();

        /* renamed from: e, reason: collision with root package name */
        public long f25277e;

        /* renamed from: f, reason: collision with root package name */
        public int f25278f;
    }

    public bh(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new cr());
    }

    private static b b() {
        ArrayDeque<b> arrayDeque = f25264g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        if (this.f25271f) {
            a();
            this.f25267b.quit();
        }
        this.f25271f = false;
    }

    public final void d() {
        if (this.f25271f) {
            return;
        }
        this.f25267b.start();
        this.f25268c = new a(this.f25267b.getLooper());
        this.f25271f = true;
    }

    public final void e() throws InterruptedException {
        this.f25270e.c();
        Handler handler = this.f25268c;
        handler.getClass();
        handler.obtainMessage(2).sendToTarget();
        this.f25270e.a();
    }

    public bh(MediaCodec mediaCodec, HandlerThread handlerThread, cr crVar) {
        this.f25266a = mediaCodec;
        this.f25267b = handlerThread;
        this.f25270e = crVar;
        this.f25269d = new AtomicReference<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Message message) throws MediaCodec.CryptoException {
        int i = message.what;
        b bVar = null;
        if (i == 0) {
            b bVar2 = (b) message.obj;
            try {
                this.f25266a.queueInputBuffer(bVar2.f25273a, bVar2.f25274b, bVar2.f25275c, bVar2.f25277e, bVar2.f25278f);
            } catch (RuntimeException e4) {
                AtomicReference<RuntimeException> atomicReference = this.f25269d;
                while (!atomicReference.compareAndSet(null, e4) && atomicReference.get() == null) {
                }
            }
            bVar = bVar2;
        } else if (i == 1) {
            b bVar3 = (b) message.obj;
            int i10 = bVar3.f25273a;
            int i11 = bVar3.f25274b;
            MediaCodec.CryptoInfo cryptoInfo = bVar3.f25276d;
            long j4 = bVar3.f25277e;
            int i12 = bVar3.f25278f;
            try {
                synchronized (f25265h) {
                    this.f25266a.queueSecureInputBuffer(i10, i11, cryptoInfo, j4, i12);
                }
            } catch (RuntimeException e10) {
                AtomicReference<RuntimeException> atomicReference2 = this.f25269d;
                while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                }
            }
            bVar = bVar3;
        } else if (i != 2) {
            AtomicReference<RuntimeException> atomicReference3 = this.f25269d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            this.f25270e.e();
        }
        if (bVar != null) {
            a(bVar);
        }
    }

    public final void a() {
        if (this.f25271f) {
            try {
                Handler handler = this.f25268c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.f25270e.c();
                Handler handler2 = this.f25268c;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.f25270e.a();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    public final void a(int i, int i10, long j4, int i11) {
        RuntimeException andSet = this.f25269d.getAndSet(null);
        if (andSet == null) {
            b bVarB = b();
            bVarB.f25273a = i;
            bVarB.f25274b = 0;
            bVarB.f25275c = i10;
            bVarB.f25277e = j4;
            bVarB.f25278f = i11;
            Handler handler = this.f25268c;
            int i12 = s82.f32899a;
            handler.obtainMessage(0, bVarB).sendToTarget();
            return;
        }
        throw andSet;
    }

    public final void a(int i, zu zuVar, long j4) {
        RuntimeException andSet = this.f25269d.getAndSet(null);
        if (andSet == null) {
            b bVarB = b();
            bVarB.f25273a = i;
            bVarB.f25274b = 0;
            bVarB.f25275c = 0;
            bVarB.f25277e = j4;
            bVarB.f25278f = 0;
            MediaCodec.CryptoInfo cryptoInfo = bVarB.f25276d;
            cryptoInfo.numSubSamples = zuVar.f36743f;
            int[] iArr = zuVar.f36741d;
            int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArrCopyOf != null && iArrCopyOf.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
                } else {
                    iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArrCopyOf;
            int[] iArr2 = zuVar.f36742e;
            int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr2 != null) {
                if (iArrCopyOf2 != null && iArrCopyOf2.length >= iArr2.length) {
                    System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
                } else {
                    iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
            byte[] bArr = zuVar.f36739b;
            byte[] bArrCopyOf = cryptoInfo.key;
            if (bArr != null) {
                if (bArrCopyOf != null && bArrCopyOf.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
                } else {
                    bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArrCopyOf.getClass();
            cryptoInfo.key = bArrCopyOf;
            byte[] bArr2 = zuVar.f36738a;
            byte[] bArrCopyOf2 = cryptoInfo.iv;
            if (bArr2 != null) {
                if (bArrCopyOf2 != null && bArrCopyOf2.length >= bArr2.length) {
                    System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
                } else {
                    bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                }
            }
            bArrCopyOf2.getClass();
            cryptoInfo.iv = bArrCopyOf2;
            cryptoInfo.mode = zuVar.f36740c;
            if (s82.f32899a >= 24) {
                G0.p.s();
                cryptoInfo.setPattern(G0.o.e(zuVar.f36744g, zuVar.f36745h));
            }
            this.f25268c.obtainMessage(1, bVarB).sendToTarget();
            return;
        }
        throw andSet;
    }

    private static void a(b bVar) {
        ArrayDeque<b> arrayDeque = f25264g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }
}
