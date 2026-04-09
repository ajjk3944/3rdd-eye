package d0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: InputBufferImpl.java */
/* loaded from: classes.dex */
public final class x implements w {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f37312a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37313b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f37314c;

    /* renamed from: d, reason: collision with root package name */
    public final b.d f37315d;

    /* renamed from: e, reason: collision with root package name */
    public final b.a<Void> f37316e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f37317f = new AtomicBoolean(false);

    /* renamed from: g, reason: collision with root package name */
    public long f37318g = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f37319h = false;

    public x(MediaCodec mediaCodec, int i) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f37312a = mediaCodec;
        A2.l.o(i);
        this.f37313b = i;
        this.f37314c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.f37315d = o0.b.a(new o(atomicReference, 1));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f37316e = aVar;
    }

    @Override // d0.w
    public final void a() {
        if (this.f37317f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        this.f37319h = true;
    }

    @Override // d0.w
    public final A4.a<Void> b() {
        return I.j.f(this.f37315d);
    }

    @Override // d0.w
    public final boolean c() throws MediaCodec.CryptoException {
        b.a<Void> aVar = this.f37316e;
        ByteBuffer byteBuffer = this.f37314c;
        if (this.f37317f.getAndSet(true)) {
            return false;
        }
        try {
            this.f37312a.queueInputBuffer(this.f37313b, byteBuffer.position(), byteBuffer.limit(), this.f37318g, this.f37319h ? 4 : 0);
            aVar.b(null);
            return true;
        } catch (IllegalStateException e4) {
            aVar.d(e4);
            return false;
        }
    }

    @Override // d0.w
    public final boolean cancel() throws MediaCodec.CryptoException {
        b.a<Void> aVar = this.f37316e;
        if (this.f37317f.getAndSet(true)) {
            return false;
        }
        try {
            this.f37312a.queueInputBuffer(this.f37313b, 0, 0, 0L, 0);
            aVar.b(null);
        } catch (IllegalStateException e4) {
            aVar.d(e4);
        }
        return true;
    }

    @Override // d0.w
    public final void d(long j4) {
        if (this.f37317f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        A2.l.l(j4 >= 0);
        this.f37318g = j4;
    }

    @Override // d0.w
    public final ByteBuffer w() {
        if (this.f37317f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        return this.f37314c;
    }
}
