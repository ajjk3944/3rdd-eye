package d0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: EncodedDataImpl.java */
/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: b, reason: collision with root package name */
    public final MediaCodec f37234b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f37235c;

    /* renamed from: d, reason: collision with root package name */
    public final int f37236d;

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f37237e;

    /* renamed from: f, reason: collision with root package name */
    public final b.d f37238f;

    /* renamed from: g, reason: collision with root package name */
    public final b.a<Void> f37239g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f37240h = new AtomicBoolean(false);

    public j(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        mediaCodec.getClass();
        this.f37234b = mediaCodec;
        this.f37236d = i;
        this.f37237e = mediaCodec.getOutputBuffer(i);
        this.f37235c = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.f37238f = o0.b.a(new B.d(atomicReference, 19));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f37239g = aVar;
    }

    @Override // d0.i
    public final MediaCodec.BufferInfo R() {
        return this.f37235c;
    }

    @Override // d0.i
    public final boolean a0() {
        return (this.f37235c.flags & 1) != 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b.a<Void> aVar = this.f37239g;
        if (this.f37240h.getAndSet(true)) {
            return;
        }
        try {
            this.f37234b.releaseOutputBuffer(this.f37236d, false);
            aVar.b(null);
        } catch (IllegalStateException e4) {
            aVar.d(e4);
        }
    }

    @Override // d0.i
    public final long r0() {
        return this.f37235c.presentationTimeUs;
    }

    @Override // d0.i
    public final long size() {
        return this.f37235c.size;
    }

    @Override // d0.i
    public final ByteBuffer w() {
        if (this.f37240h.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.f37235c;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.f37237e;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }
}
