package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.m22;
import com.yandex.mobile.ads.impl.ub0;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class sb0 extends m22 {

    /* renamed from: n, reason: collision with root package name */
    private ub0 f32923n;

    /* renamed from: o, reason: collision with root package name */
    private a f32924o;

    public static final class a implements td1 {

        /* renamed from: a, reason: collision with root package name */
        private ub0 f32925a;

        /* renamed from: b, reason: collision with root package name */
        private ub0.a f32926b;

        /* renamed from: c, reason: collision with root package name */
        private long f32927c = -1;

        /* renamed from: d, reason: collision with root package name */
        private long f32928d = -1;

        public a(ub0 ub0Var, ub0.a aVar) {
            this.f32925a = ub0Var;
            this.f32926b = aVar;
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final tw1 a() {
            long j4 = this.f32927c;
            if (j4 != -1) {
                return new tb0(this.f32925a, j4);
            }
            throw new IllegalStateException();
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final long a(rz rzVar) {
            long j4 = this.f32928d;
            if (j4 < 0) {
                return -1L;
            }
            long j10 = -(j4 + 2);
            this.f32928d = -1L;
            return j10;
        }

        @Override // com.yandex.mobile.ads.impl.td1
        public final void a(long j4) {
            long[] jArr = this.f32926b.f34016a;
            this.f32928d = jArr[s82.b(jArr, j4, true)];
        }
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final long a(uf1 uf1Var) {
        int i;
        int i10;
        int iT;
        int i11 = -1;
        if (uf1Var.c()[0] != -1) {
            return -1L;
        }
        int i12 = (uf1Var.c()[2] & 255) >> 4;
        if (i12 == 6 || i12 == 7) {
            uf1Var.f(4);
            uf1Var.A();
        }
        switch (i12) {
            case 1:
                i11 = 192;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                i = i12 - 2;
                i10 = 576;
                i11 = i10 << i;
                break;
            case 6:
                iT = uf1Var.t();
                i11 = iT + 1;
                break;
            case 7:
                iT = uf1Var.z();
                i11 = iT + 1;
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i = i12 - 8;
                i10 = 256;
                i11 = i10 << i;
                break;
        }
        uf1Var.e(0);
        return i11;
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final boolean a(uf1 uf1Var, long j4, m22.a aVar) {
        byte[] bArrC = uf1Var.c();
        ub0 ub0Var = this.f32923n;
        if (ub0Var == null) {
            ub0 ub0Var2 = new ub0(17, bArrC);
            this.f32923n = ub0Var2;
            aVar.f30181a = ub0Var2.a(Arrays.copyOfRange(bArrC, 9, uf1Var.e()), null);
            return true;
        }
        byte b10 = bArrC[0];
        if ((b10 & 127) == 3) {
            ub0.a aVarA = rb0.a(uf1Var);
            ub0 ub0VarA = ub0Var.a(aVarA);
            this.f32923n = ub0VarA;
            this.f32924o = new a(ub0VarA, aVarA);
            return true;
        }
        if (b10 != -1) {
            return true;
        }
        a aVar2 = this.f32924o;
        if (aVar2 != null) {
            aVar2.f32927c = j4;
            aVar.f30182b = aVar2;
        }
        aVar.f30181a.getClass();
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.m22
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f32923n = null;
            this.f32924o = null;
        }
    }
}
