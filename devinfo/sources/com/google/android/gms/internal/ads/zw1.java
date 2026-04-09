package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zw1 extends rq1 {
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public int f19210k;

    /* renamed from: l, reason: collision with root package name */
    public int f19211l;

    @Override // com.google.android.gms.internal.ads.rq1
    public final void i() {
        super.i();
        this.f19210k = 0;
    }

    public final int n() {
        return this.f19210k;
    }

    public final boolean o() {
        return this.f19210k > 0;
    }

    public final boolean p(rq1 rq1Var) {
        ByteBuffer byteBuffer;
        mq0.m(!rq1Var.h(1073741824));
        mq0.m(!rq1Var.h(268435456));
        mq0.m(!rq1Var.h(4));
        if (o()) {
            if (this.f19210k >= this.f19211l) {
                return false;
            }
            ByteBuffer byteBuffer2 = rq1Var.f15735e;
            if (byteBuffer2 != null && (byteBuffer = this.f15735e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i4 = this.f19210k;
        this.f19210k = i4 + 1;
        if (i4 == 0) {
            this.g = rq1Var.g;
            if (rq1Var.h(1)) {
                this.f14029b = 1;
            }
        }
        ByteBuffer byteBuffer3 = rq1Var.f15735e;
        if (byteBuffer3 != null) {
            j(byteBuffer3.remaining());
            this.f15735e.put(byteBuffer3);
        }
        this.j = rq1Var.g;
        return true;
    }
}
