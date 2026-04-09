package d0;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import o0.b;

/* compiled from: BufferCopiedEncodedData.java */
/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f37231b;

    /* renamed from: c, reason: collision with root package name */
    public final MediaCodec.BufferInfo f37232c;

    /* renamed from: d, reason: collision with root package name */
    public final b.a<Void> f37233d;

    public g(i iVar) {
        MediaCodec.BufferInfo bufferInfoR = iVar.R();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoR.size, bufferInfoR.presentationTimeUs, bufferInfoR.flags);
        this.f37232c = bufferInfo;
        ByteBuffer byteBufferW = iVar.w();
        MediaCodec.BufferInfo bufferInfoR2 = iVar.R();
        byteBufferW.position(bufferInfoR2.offset);
        byteBufferW.limit(bufferInfoR2.offset + bufferInfoR2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoR2.size);
        byteBufferAllocate.order(byteBufferW.order());
        byteBufferAllocate.put(byteBufferW);
        byteBufferAllocate.flip();
        this.f37231b = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        o0.b.a(new f(atomicReference, 0));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f37233d = aVar;
    }

    @Override // d0.i
    public final MediaCodec.BufferInfo R() {
        return this.f37232c;
    }

    @Override // d0.i
    public final boolean a0() {
        return (this.f37232c.flags & 1) != 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f37233d.b(null);
    }

    @Override // d0.i
    public final long r0() {
        return this.f37232c.presentationTimeUs;
    }

    @Override // d0.i
    public final long size() {
        return this.f37232c.size;
    }

    @Override // d0.i
    public final ByteBuffer w() {
        return this.f37231b;
    }
}
