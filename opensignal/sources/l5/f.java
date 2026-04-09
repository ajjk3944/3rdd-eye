package l5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class f extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f14704b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f14705c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f14710h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f14711i;
    public MediaCodec.CodecException j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14712l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f14713m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f14703a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f14706d = new com.google.android.material.datepicker.n();

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f14707e = new com.google.android.material.datepicker.n();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f14708f = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f14709g = new ArrayDeque();

    public f(HandlerThread handlerThread) {
        this.f14704b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f14709g;
        if (!arrayDeque.isEmpty()) {
            this.f14711i = (MediaFormat) arrayDeque.getLast();
        }
        com.google.android.material.datepicker.n nVar = this.f14706d;
        nVar.f5608d = 0;
        nVar.f5609g = -1;
        nVar.f5610r = 0;
        com.google.android.material.datepicker.n nVar2 = this.f14707e;
        nVar2.f5608d = 0;
        nVar2.f5609g = -1;
        nVar2.f5610r = 0;
        this.f14708f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f14703a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f14703a) {
            this.f14706d.d(i10);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f14703a) {
            try {
                MediaFormat mediaFormat = this.f14711i;
                if (mediaFormat != null) {
                    this.f14707e.d(-2);
                    this.f14709g.add(mediaFormat);
                    this.f14711i = null;
                }
                this.f14707e.d(i10);
                this.f14708f.add(bufferInfo);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f14703a) {
            this.f14707e.d(-2);
            this.f14709g.add(mediaFormat);
            this.f14711i = null;
        }
    }
}
