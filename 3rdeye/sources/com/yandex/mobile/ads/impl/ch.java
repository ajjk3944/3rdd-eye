package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
final class ch extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    private final HandlerThread f25640b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f25641c;

    /* renamed from: h, reason: collision with root package name */
    private MediaFormat f25646h;
    private MediaFormat i;

    /* renamed from: j, reason: collision with root package name */
    private MediaCodec.CodecException f25647j;

    /* renamed from: k, reason: collision with root package name */
    private long f25648k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f25649l;

    /* renamed from: m, reason: collision with root package name */
    private IllegalStateException f25650m;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25639a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final mo0 f25642d = new mo0();

    /* renamed from: e, reason: collision with root package name */
    private final mo0 f25643e = new mo0();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f25644f = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f25645g = new ArrayDeque<>();

    public ch(HandlerThread handlerThread) {
        this.f25640b = handlerThread;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        synchronized (this.f25639a) {
            try {
                if (this.f25649l) {
                    return;
                }
                long j4 = this.f25648k - 1;
                this.f25648k = j4;
                if (j4 > 0) {
                    return;
                }
                if (j4 < 0) {
                    a(new IllegalStateException());
                    return;
                }
                if (!this.f25645g.isEmpty()) {
                    this.i = this.f25645g.getLast();
                }
                this.f25642d.a();
                this.f25643e.a();
                this.f25644f.clear();
                this.f25645g.clear();
                this.f25647j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f25639a) {
            this.f25648k++;
            Handler handler = this.f25641c;
            int i = s82.f32899a;
            handler.post(new N(this, 0));
        }
    }

    public final MediaFormat c() {
        MediaFormat mediaFormat;
        synchronized (this.f25639a) {
            try {
                mediaFormat = this.f25646h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public final void e() {
        synchronized (this.f25639a) {
            try {
                this.f25649l = true;
                this.f25640b.quit();
                if (!this.f25645g.isEmpty()) {
                    this.i = this.f25645g.getLast();
                }
                this.f25642d.a();
                this.f25643e.a();
                this.f25644f.clear();
                this.f25645g.clear();
                this.f25647j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f25639a) {
            this.f25647j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f25639a) {
            this.f25642d.a(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f25639a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.f25643e.a(-2);
                    this.f25645g.add(mediaFormat);
                    this.i = null;
                }
                this.f25643e.a(i);
                this.f25644f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f25639a) {
            this.f25643e.a(-2);
            this.f25645g.add(mediaFormat);
            this.i = null;
        }
    }

    public final int a() {
        synchronized (this.f25639a) {
            try {
                int iC = -1;
                if (this.f25648k <= 0 && !this.f25649l) {
                    IllegalStateException illegalStateException = this.f25650m;
                    if (illegalStateException != null) {
                        this.f25650m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = this.f25647j;
                    if (codecException != null) {
                        this.f25647j = null;
                        throw codecException;
                    }
                    if (!this.f25642d.b()) {
                        iC = this.f25642d.c();
                    }
                    return iC;
                }
                return -1;
            } finally {
            }
        }
    }

    public final int a(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f25639a) {
            try {
                if (this.f25648k <= 0 && !this.f25649l) {
                    IllegalStateException illegalStateException = this.f25650m;
                    if (illegalStateException == null) {
                        MediaCodec.CodecException codecException = this.f25647j;
                        if (codecException == null) {
                            if (this.f25643e.b()) {
                                return -1;
                            }
                            int iC = this.f25643e.c();
                            if (iC >= 0) {
                                if (this.f25646h != null) {
                                    MediaCodec.BufferInfo bufferInfoRemove = this.f25644f.remove();
                                    bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else if (iC == -2) {
                                this.f25646h = this.f25645g.remove();
                            }
                            return iC;
                        }
                        this.f25647j = null;
                        throw codecException;
                    }
                    this.f25650m = null;
                    throw illegalStateException;
                }
                return -1;
            } finally {
            }
        }
    }

    public final void a(MediaCodec mediaCodec) {
        if (this.f25641c == null) {
            this.f25640b.start();
            Handler handler = new Handler(this.f25640b.getLooper());
            mediaCodec.setCallback(this, handler);
            this.f25641c = handler;
            return;
        }
        throw new IllegalStateException();
    }

    private void a(IllegalStateException illegalStateException) {
        synchronized (this.f25639a) {
            this.f25650m = illegalStateException;
        }
    }
}
