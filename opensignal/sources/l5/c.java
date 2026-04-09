package l5;

import a5.d0;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14684a;

    /* renamed from: b, reason: collision with root package name */
    public int f14685b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14686c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14687d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f14688e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f14689f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.<init>(android.content.Context, int):void");
    }

    public static void m(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        f fVar = (f) cVar.f14688e;
        MediaCodec mediaCodec = (MediaCodec) cVar.f14687d;
        HandlerThread handlerThread = fVar.f14704b;
        a5.a.i(fVar.f14705c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f14705c = handler;
        a5.a.b("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        a5.a.o();
        e eVar = (e) cVar.f14689f;
        HandlerThread handlerThread2 = eVar.f14698b;
        if (!eVar.f14702f) {
            handlerThread2.start();
            eVar.f14699c = new i.c(1, handlerThread2.getLooper(), eVar);
            eVar.f14702f = true;
        }
        a5.a.b("startCodec");
        mediaCodec.start();
        a5.a.o();
        cVar.f14685b = 1;
    }

    public static String p(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // l5.k
    public void a(rb.f fVar, Handler handler) {
        ((MediaCodec) this.f14687d).setOnFrameRenderedListener(new a(this, fVar, 0), handler);
    }

    @Override // l5.k
    public MediaFormat b() {
        MediaFormat mediaFormat;
        f fVar = (f) this.f14688e;
        synchronized (fVar.f14703a) {
            try {
                mediaFormat = fVar.f14710h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // l5.k
    public void c(Bundle bundle) {
        ((MediaCodec) this.f14687d).setParameters(bundle);
    }

    @Override // l5.k
    public void d(int i10, long j) {
        ((MediaCodec) this.f14687d).releaseOutputBuffer(i10, j);
    }

    @Override // l5.k
    public int e() {
        RuntimeException runtimeException = (RuntimeException) ((e) this.f14689f).f14700d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        f fVar = (f) this.f14688e;
        synchronized (fVar.f14703a) {
            try {
                boolean z10 = true;
                int iE = -1;
                if (fVar.k > 0 || fVar.f14712l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f14713m;
                if (illegalStateException != null) {
                    fVar.f14713m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                com.google.android.material.datepicker.n nVar = fVar.f14706d;
                if (nVar.f5610r != 0) {
                    z10 = false;
                }
                if (!z10) {
                    iE = nVar.e();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // l5.k
    public int f(MediaCodec.BufferInfo bufferInfo) {
        RuntimeException runtimeException = (RuntimeException) ((e) this.f14689f).f14700d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        f fVar = (f) this.f14688e;
        synchronized (fVar.f14703a) {
            try {
                boolean z10 = true;
                if (fVar.k > 0 || fVar.f14712l) {
                    return -1;
                }
                IllegalStateException illegalStateException = fVar.f14713m;
                if (illegalStateException != null) {
                    fVar.f14713m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = fVar.j;
                if (codecException != null) {
                    fVar.j = null;
                    throw codecException;
                }
                com.google.android.material.datepicker.n nVar = fVar.f14707e;
                if (nVar.f5610r != 0) {
                    z10 = false;
                }
                if (z10) {
                    return -1;
                }
                int iE = nVar.e();
                if (iE >= 0) {
                    a5.a.j(fVar.f14710h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) fVar.f14708f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iE == -2) {
                    fVar.f14710h = (MediaFormat) fVar.f14709g.remove();
                }
                return iE;
            } finally {
            }
        }
    }

    @Override // l5.k
    public void flush() {
        ((e) this.f14689f).a();
        ((MediaCodec) this.f14687d).flush();
        f fVar = (f) this.f14688e;
        synchronized (fVar.f14703a) {
            fVar.k++;
            Handler handler = fVar.f14705c;
            int i10 = d0.f105a;
            handler.post(new j4.o(8, fVar));
        }
        ((MediaCodec) this.f14687d).start();
    }

    @Override // l5.k
    public void g(int i10, boolean z10) {
        ((MediaCodec) this.f14687d).releaseOutputBuffer(i10, z10);
    }

    @Override // l5.k
    public ByteBuffer h(int i10) {
        return ((MediaCodec) this.f14687d).getInputBuffer(i10);
    }

    @Override // l5.k
    public void i(Surface surface) {
        ((MediaCodec) this.f14687d).setOutputSurface(surface);
    }

    @Override // l5.k
    public ByteBuffer j(int i10) {
        return ((MediaCodec) this.f14687d).getOutputBuffer(i10);
    }

    @Override // l5.k
    public void k(int i10, int i11, long j, int i12) {
        e eVar = (e) this.f14689f;
        RuntimeException runtimeException = (RuntimeException) eVar.f14700d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f14690a = i10;
        dVarB.f14691b = i11;
        dVarB.f14693d = j;
        dVarB.f14694e = i12;
        i.c cVar = eVar.f14699c;
        int i13 = d0.f105a;
        cVar.obtainMessage(0, dVarB).sendToTarget();
    }

    @Override // l5.k
    public void l(int i10, c5.c cVar, long j) {
        e eVar = (e) this.f14689f;
        RuntimeException runtimeException = (RuntimeException) eVar.f14700d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
        d dVarB = e.b();
        dVarB.f14690a = i10;
        dVarB.f14691b = 0;
        dVarB.f14693d = j;
        dVarB.f14694e = 0;
        MediaCodec.CryptoInfo cryptoInfo = dVarB.f14692c;
        cryptoInfo.numSubSamples = cVar.f3301f;
        int[] iArr = cVar.f3299d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cVar.f3300e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cVar.f3297b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = cVar.f3296a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = cVar.f3298c;
        if (d0.f105a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f3302g, cVar.f3303h));
        }
        eVar.f14699c.obtainMessage(1, dVarB).sendToTarget();
    }

    public pb.r n() {
        return new pb.r((Context) this.f14687d, (HashMap) this.f14688e, this.f14685b, (et.d) this.f14689f, this.f14686c);
    }

    public r5.g o() {
        return new r5.g((Context) this.f14687d, (HashMap) this.f14688e, this.f14685b, (a5.x) this.f14689f, this.f14686c);
    }

    public void q(int i10, long j) {
        switch (this.f14684a) {
            case 1:
                ((HashMap) this.f14688e).put(Integer.valueOf(i10), Long.valueOf(j));
                break;
            default:
                ((HashMap) this.f14688e).put(Integer.valueOf(i10), Long.valueOf(j));
                break;
        }
    }

    @Override // l5.k
    public void release() {
        try {
            if (this.f14685b == 1) {
                e eVar = (e) this.f14689f;
                if (eVar.f14702f) {
                    eVar.a();
                    eVar.f14698b.quit();
                }
                eVar.f14702f = false;
                f fVar = (f) this.f14688e;
                synchronized (fVar.f14703a) {
                    fVar.f14712l = true;
                    fVar.f14704b.quit();
                    fVar.a();
                }
            }
            this.f14685b = 2;
        } finally {
            if (!this.f14686c) {
                ((MediaCodec) this.f14687d).release();
                this.f14686c = true;
            }
        }
    }

    @Override // l5.k
    public void setVideoScalingMode(int i10) {
        ((MediaCodec) this.f14687d).setVideoScalingMode(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 8798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.c.<init>(android.content.Context, boolean):void");
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f14684a = 0;
        this.f14687d = mediaCodec;
        this.f14688e = new f(handlerThread);
        this.f14689f = new e(mediaCodec, handlerThread2);
        this.f14685b = 0;
    }
}
