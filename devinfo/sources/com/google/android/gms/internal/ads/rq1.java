package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class rq1 extends mv0 {

    /* renamed from: c, reason: collision with root package name */
    public mx1 f15733c;

    /* renamed from: d, reason: collision with root package name */
    public final bp1 f15734d = new bp1();

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f15735e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15736f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public ByteBuffer f15737h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15738i;

    static {
        y5.a("media3.decoder");
    }

    public rq1(int i4) {
        this.f15738i = i4;
    }

    public void i() {
        this.f14029b = 0;
        ByteBuffer byteBuffer = this.f15735e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f15737h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f15736f = false;
    }

    public final void j(int i4) {
        ByteBuffer byteBuffer = this.f15735e;
        if (byteBuffer == null) {
            this.f15735e = m(i4);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i10 = i4 + iPosition;
        if (iCapacity >= i10) {
            this.f15735e = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM = m(i10);
        byteBufferM.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM.put(byteBuffer);
        }
        this.f15735e = byteBufferM;
    }

    public final boolean k() {
        return h(1073741824);
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f15735e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f15737h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer m(int i4) {
        int i10 = this.f15738i;
        if (i10 == 1) {
            return ByteBuffer.allocate(i4);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i4);
        }
        ByteBuffer byteBuffer = this.f15735e;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(String.valueOf(iCapacity).length() + 21 + String.valueOf(i4).length() + 1);
        r5.c.q(iCapacity, i4, "Buffer too small (", " < ", sb2);
        sb2.append(")");
        throw new cq1(sb2.toString());
    }
}
