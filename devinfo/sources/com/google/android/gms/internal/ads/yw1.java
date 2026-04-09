package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yw1 extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f18901b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f18902c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f18906h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f18907i;
    public MediaCodec.CodecException j;

    /* renamed from: k, reason: collision with root package name */
    public MediaCodec.CryptoException f18908k;

    /* renamed from: l, reason: collision with root package name */
    public long f18909l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18910m;

    /* renamed from: n, reason: collision with root package name */
    public IllegalStateException f18911n;

    /* renamed from: o, reason: collision with root package name */
    public kh0 f18912o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f18900a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18903d = new androidx.datastore.preferences.protobuf.k(8);

    /* renamed from: e, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.k f18904e = new androidx.datastore.preferences.protobuf.k(8);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f18905f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public yw1(HandlerThread handlerThread) {
        this.f18901b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.f18907i = (MediaFormat) arrayDeque.getLast();
        }
        androidx.datastore.preferences.protobuf.k kVar = this.f18903d;
        kVar.f1001b = kVar.f1000a;
        androidx.datastore.preferences.protobuf.k kVar2 = this.f18904e;
        kVar2.f1001b = kVar2.f1000a;
        this.f18905f.clear();
        arrayDeque.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.f18911n;
        if (illegalStateException != null) {
            this.f18911n = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.j;
        if (codecException != null) {
            this.j = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f18908k;
        if (cryptoException == null) {
            return;
        }
        this.f18908k = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f18900a) {
            this.f18908k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f18900a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i4) {
        jt1 jt1Var;
        synchronized (this.f18900a) {
            try {
                this.f18903d.a(i4);
                kh0 kh0Var = this.f18912o;
                if (kh0Var != null && (jt1Var = ((ix1) kh0Var.f13160b).H) != null) {
                    jt1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i4, MediaCodec.BufferInfo bufferInfo) {
        jt1 jt1Var;
        synchronized (this.f18900a) {
            try {
                MediaFormat mediaFormat = this.f18907i;
                if (mediaFormat != null) {
                    this.f18904e.a(-2);
                    this.g.add(mediaFormat);
                    this.f18907i = null;
                }
                this.f18904e.a(i4);
                this.f18905f.add(bufferInfo);
                kh0 kh0Var = this.f18912o;
                if (kh0Var != null && (jt1Var = ((ix1) kh0Var.f13160b).H) != null) {
                    jt1Var.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f18900a) {
            this.f18904e.a(-2);
            this.g.add(mediaFormat);
            this.f18907i = null;
        }
    }
}
