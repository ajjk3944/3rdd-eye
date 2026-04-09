package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class rn extends mk {

    /* renamed from: n, reason: collision with root package name */
    private final my f32715n;

    /* renamed from: o, reason: collision with root package name */
    private final uf1 f32716o;

    /* renamed from: p, reason: collision with root package name */
    private long f32717p;

    /* renamed from: q, reason: collision with root package name */
    private qn f32718q;

    /* renamed from: r, reason: collision with root package name */
    private long f32719r;

    public rn() {
        super(6);
        this.f32715n = new my(1);
        this.f32716o = new uf1();
    }

    @Override // com.yandex.mobile.ads.impl.mk, com.yandex.mobile.ads.impl.hi1.b
    public final void a(int i, Object obj) throws h60 {
        if (i == 8) {
            this.f32718q = (qn) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final boolean d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.so1, com.yandex.mobile.ads.impl.to1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void u() {
        qn qnVar = this.f32718q;
        if (qnVar != null) {
            qnVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(long j4, boolean z10) {
        this.f32719r = Long.MIN_VALUE;
        qn qnVar = this.f32718q;
        if (qnVar != null) {
            qnVar.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.mk
    public final void a(dc0[] dc0VarArr, long j4, long j10) {
        this.f32717p = j10;
    }

    @Override // com.yandex.mobile.ads.impl.so1
    public final void a(long j4, long j10) {
        float[] fArr;
        while (!e() && this.f32719r < 100000 + j4) {
            this.f32715n.b();
            if (a(q(), this.f32715n, 0) != -4 || this.f32715n.f()) {
                return;
            }
            my myVar = this.f32715n;
            this.f32719r = myVar.f30574f;
            if (this.f32718q != null && !myVar.e()) {
                this.f32715n.h();
                ByteBuffer byteBuffer = this.f32715n.f30572d;
                int i = s82.f32899a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f32716o.a(byteBuffer.limit(), byteBuffer.array());
                    this.f32716o.e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i10 = 0; i10 < 3; i10++) {
                        fArr2[i10] = Float.intBitsToFloat(this.f32716o.k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f32718q.a(this.f32719r - this.f32717p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.to1
    public final int a(dc0 dc0Var) {
        if ("application/x-camera-motion".equals(dc0Var.f26083m)) {
            return P3.b(4, 0, 0);
        }
        return P3.b(0, 0, 0);
    }
}
