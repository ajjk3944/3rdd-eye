package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class km {

    /* renamed from: a, reason: collision with root package name */
    private long f29719a;

    /* renamed from: b, reason: collision with root package name */
    private long f29720b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29721c;

    public final long a(dc0 dc0Var) {
        return Math.max(0L, ((this.f29720b - 529) * 1000000) / dc0Var.f26066A) + this.f29719a;
    }

    public final void a() {
        this.f29719a = 0L;
        this.f29720b = 0L;
        this.f29721c = false;
    }

    public final long a(dc0 dc0Var, my myVar) {
        if (this.f29720b == 0) {
            this.f29719a = myVar.f30574f;
        }
        if (this.f29721c) {
            return myVar.f30574f;
        }
        ByteBuffer byteBuffer = myVar.f30572d;
        byteBuffer.getClass();
        int i = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i = (i << 8) | (byteBuffer.get(i10) & 255);
        }
        int iB = v11.b(i);
        if (iB == -1) {
            this.f29721c = true;
            this.f29720b = 0L;
            this.f29719a = myVar.f30574f;
            rs0.d("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return myVar.f30574f;
        }
        long jMax = Math.max(0L, ((this.f29720b - 529) * 1000000) / dc0Var.f26066A) + this.f29719a;
        this.f29720b += iB;
        return jMax;
    }
}
