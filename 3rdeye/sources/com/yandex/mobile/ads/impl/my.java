package com.yandex.mobile.ads.impl;

import N7.G8;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class my extends am {

    /* renamed from: c, reason: collision with root package name */
    public final zu f30571c;

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f30572d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30573e;

    /* renamed from: f, reason: collision with root package name */
    public long f30574f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f30575g;

    /* renamed from: h, reason: collision with root package name */
    private final int f30576h;
    private final int i;

    public static final class a extends IllegalStateException {
        public a(int i, int i10) {
            super(G8.r("Buffer too small (", i, " < ", i10, ")"));
        }
    }

    static {
        p60.a("goog.exo.decoder");
    }

    public my(int i) {
        this(i, 0);
    }

    public static my j() {
        return new my(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.am
    public void b() {
        super.b();
        ByteBuffer byteBuffer = this.f30572d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f30575g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f30573e = false;
    }

    public final void e(int i) {
        ByteBuffer byteBufferAllocateDirect;
        ByteBuffer byteBufferAllocateDirect2;
        int i10 = i + this.i;
        ByteBuffer byteBuffer = this.f30572d;
        if (byteBuffer == null) {
            int i11 = this.f30576h;
            if (i11 == 1) {
                byteBufferAllocateDirect2 = ByteBuffer.allocate(i10);
            } else {
                if (i11 != 2) {
                    throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i10);
                }
                byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(i10);
            }
            this.f30572d = byteBufferAllocateDirect2;
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i12 = i10 + iPosition;
        if (iCapacity >= i12) {
            this.f30572d = byteBuffer;
            return;
        }
        int i13 = this.f30576h;
        if (i13 == 1) {
            byteBufferAllocateDirect = ByteBuffer.allocate(i12);
        } else {
            if (i13 != 2) {
                ByteBuffer byteBuffer2 = this.f30572d;
                throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i12);
            }
            byteBufferAllocateDirect = ByteBuffer.allocateDirect(i12);
        }
        byteBufferAllocateDirect.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferAllocateDirect.put(byteBuffer);
        }
        this.f30572d = byteBufferAllocateDirect;
    }

    public final void h() {
        ByteBuffer byteBuffer = this.f30572d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f30575g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean i() {
        return c(1073741824);
    }

    public my(int i, int i10) {
        this.f30571c = new zu();
        this.f30576h = i;
        this.i = 0;
    }
}
