package com.yandex.mobile.ads.impl;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.yandex.mobile.ads.impl.ah;
import com.yandex.mobile.ads.impl.uu0;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class ah implements uu0 {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCodec f24652a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f24653b;

    /* renamed from: c, reason: collision with root package name */
    private final bh f24654c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24655d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24656e;

    /* renamed from: f, reason: collision with root package name */
    private int f24657f;

    public static final class a implements uu0.b {

        /* renamed from: a, reason: collision with root package name */
        private final h32<HandlerThread> f24658a;

        /* renamed from: b, reason: collision with root package name */
        private final h32<HandlerThread> f24659b;

        public a(final int i) {
            this(new h32() { // from class: com.yandex.mobile.ads.impl.B
                @Override // com.yandex.mobile.ads.impl.h32
                public final Object get() {
                    return ah.a.a(i);
                }
            }, new h32() { // from class: com.yandex.mobile.ads.impl.C
                @Override // com.yandex.mobile.ads.impl.h32
                public final Object get() {
                    return ah.a.b(i);
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.uu0.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ah a(uu0.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f34220a.f35980a;
            ah ahVar = null;
            try {
                h52.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    ah ahVar2 = new ah(mediaCodecCreateByCodecName, this.f24658a.get(), this.f24659b.get());
                    try {
                        h52.a();
                        ahVar2.a(aVar.f34221b, aVar.f34223d, aVar.f34224e);
                        return ahVar2;
                    } catch (Exception e4) {
                        e = e4;
                        ahVar = ahVar2;
                        if (ahVar != null) {
                            ahVar.release();
                        } else if (mediaCodecCreateByCodecName != null) {
                            mediaCodecCreateByCodecName.release();
                        }
                        throw e;
                    }
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                mediaCodecCreateByCodecName = null;
            }
        }

        public a(h32 h32Var, h32 h32Var2) {
            this.f24658a = h32Var;
            this.f24659b = h32Var2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread a(int i) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecAsyncAdapter:");
            if (i == 1) {
                sb.append("Audio");
            } else if (i == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(");
                sb.append(i);
                sb.append(")");
            }
            return new HandlerThread(sb.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HandlerThread b(int i) {
            StringBuilder sb = new StringBuilder("ExoPlayer:MediaCodecQueueingThread:");
            if (i == 1) {
                sb.append("Audio");
            } else if (i == 2) {
                sb.append("Video");
            } else {
                sb.append("Unknown(");
                sb.append(i);
                sb.append(")");
            }
            return new HandlerThread(sb.toString());
        }
    }

    public /* synthetic */ ah(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this(mediaCodec, handlerThread, handlerThread2, false);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final ByteBuffer c(int i) {
        return this.f24652a.getOutputBuffer(i);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void flush() {
        this.f24654c.a();
        this.f24652a.flush();
        this.f24653b.b();
        this.f24652a.start();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void release() {
        try {
            if (this.f24657f == 1) {
                this.f24654c.c();
                this.f24653b.e();
            }
            this.f24657f = 2;
            if (this.f24656e) {
                return;
            }
            this.f24652a.release();
            this.f24656e = true;
        } catch (Throwable th) {
            if (!this.f24656e) {
                this.f24652a.release();
                this.f24656e = true;
            }
            throw th;
        }
    }

    private ah(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f24652a = mediaCodec;
        this.f24653b = new ch(handlerThread);
        this.f24654c = new bh(mediaCodec, handlerThread2);
        this.f24655d = z10;
        this.f24657f = 0;
    }

    private void c() {
        if (this.f24655d) {
            try {
                this.f24654c.e();
            } catch (InterruptedException e4) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e4);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f24653b.a(bufferInfo);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final int b() {
        return this.f24653b.a();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final MediaFormat a() {
        return this.f24653b.c();
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final ByteBuffer b(int i) {
        return this.f24652a.getInputBuffer(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f24653b.a(this.f24652a);
        h52.a("configureCodec");
        this.f24652a.configure(mediaFormat, surface, mediaCrypto, 0);
        h52.a();
        this.f24654c.d();
        h52.a("startCodec");
        this.f24652a.start();
        h52.a();
        this.f24657f = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(uu0.c cVar, MediaCodec mediaCodec, long j4, long j10) {
        cVar.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, int i10, long j4, int i11) {
        this.f24654c.a(i, i10, j4, i11);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, zu zuVar, long j4) {
        this.f24654c.a(i, zuVar, j4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i, long j4) {
        this.f24652a.releaseOutputBuffer(i, j4);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(boolean z10, int i) {
        this.f24652a.releaseOutputBuffer(i, z10);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(final uu0.c cVar, Handler handler) {
        c();
        this.f24652a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.yandex.mobile.ads.impl.A
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j4, long j10) {
                this.f24051a.a(cVar, mediaCodec, j4, j10);
            }
        }, handler);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(Surface surface) {
        c();
        this.f24652a.setOutputSurface(surface);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(Bundle bundle) {
        c();
        this.f24652a.setParameters(bundle);
    }

    @Override // com.yandex.mobile.ads.impl.uu0
    public final void a(int i) {
        c();
        this.f24652a.setVideoScalingMode(i);
    }
}
