package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class GP extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f8373b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f8374c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f8379h;
    public MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    public MediaCodec.CodecException f8380j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f8381k;

    /* renamed from: l, reason: collision with root package name */
    public long f8382l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8383m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f8384n;

    /* renamed from: o, reason: collision with root package name */
    public C1448kw f8385o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f8372a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final C1506m f8375d = new C1506m(3);

    /* renamed from: e, reason: collision with root package name */
    public final C1506m f8376e = new C1506m(3);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f8377f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f8378g = new ArrayDeque();

    public GP(HandlerThread handlerThread) {
        this.f8373b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f8378g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        C1506m c1506m = this.f8375d;
        c1506m.f15503b = c1506m.f15502a;
        C1506m c1506m2 = this.f8376e;
        c1506m2.f15503b = c1506m2.f15502a;
        this.f8377f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f8384n;
        if (illegalStateException != null) {
            this.f8384n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f8380j;
        if (codecException != null) {
            this.f8380j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f8381k;
        if (cryptoException == null) {
            return;
        }
        this.f8381k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f8372a) {
            this.f8381k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f8372a) {
            this.f8380j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        VN vn;
        synchronized (this.f8372a) {
            try {
                this.f8375d.b(i);
                C1448kw c1448kw = this.f8385o;
                if (c1448kw != null && (vn = ((PP) c1448kw.f15314b).f10391V) != null) {
                    vn.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        VN vn;
        synchronized (this.f8372a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f8376e.b(-2);
                    this.f8378g.add(mediaFormat);
                    this.i = null;
                }
                this.f8376e.b(i);
                this.f8377f.add(bufferInfo);
                C1448kw c1448kw = this.f8385o;
                if (c1448kw != null && (vn = ((PP) c1448kw.f15314b).f10391V) != null) {
                    vn.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f8372a) {
            this.f8376e.b(-2);
            this.f8378g.add(mediaFormat);
            this.i = null;
        }
    }
}
