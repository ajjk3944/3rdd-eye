package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.tw1;

/* loaded from: classes3.dex */
public final class e22 implements w70 {

    /* renamed from: b, reason: collision with root package name */
    private final long f26650b;

    /* renamed from: c, reason: collision with root package name */
    private final w70 f26651c;

    public e22(long j4, w70 w70Var) {
        this.f26650b = j4;
        this.f26651c = w70Var;
    }

    public class a implements tw1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ tw1 f26652a;

        public a(tw1 tw1Var) {
            this.f26652a = tw1Var;
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final tw1.a b(long j4) {
            tw1.a aVarB = this.f26652a.b(j4);
            vw1 vw1Var = aVarB.f33791a;
            long j10 = vw1Var.f34727a;
            long j11 = vw1Var.f34728b;
            long j12 = e22.this.f26650b;
            vw1 vw1Var2 = new vw1(j10, j11 + j12);
            vw1 vw1Var3 = aVarB.f33792b;
            return new tw1.a(vw1Var2, new vw1(vw1Var3.f34727a, vw1Var3.f34728b + j12));
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final long c() {
            return this.f26652a.c();
        }

        @Override // com.yandex.mobile.ads.impl.tw1
        public final boolean b() {
            return this.f26652a.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final void a() {
        this.f26651c.a();
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final void a(tw1 tw1Var) {
        this.f26651c.a(new a(tw1Var));
    }

    @Override // com.yandex.mobile.ads.impl.w70
    public final n52 a(int i, int i10) {
        return this.f26651c.a(i, i10);
    }
}
