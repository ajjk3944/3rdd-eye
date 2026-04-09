package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.dl;
import com.yandex.mobile.ads.impl.qb0;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
final class ob0 extends dl {

    public static final class a implements dl.f {

        /* renamed from: a, reason: collision with root package name */
        private final ub0 f31329a;

        /* renamed from: b, reason: collision with root package name */
        private final int f31330b;

        /* renamed from: c, reason: collision with root package name */
        private final qb0.a f31331c;

        public /* synthetic */ a(int i, ub0 ub0Var, int i10) {
            this(i, ub0Var);
        }

        @Override // com.yandex.mobile.ads.impl.dl.f
        public final /* synthetic */ void a() {
            A0.a(this);
        }

        private a(int i, ub0 ub0Var) {
            this.f31329a = ub0Var;
            this.f31330b = i;
            this.f31331c = new qb0.a();
        }

        private long a(rz rzVar) throws IOException {
            long j4;
            while (true) {
                long j10 = 6;
                if (rzVar.d() >= rzVar.b() - 6) {
                    j4 = 6;
                    break;
                }
                ub0 ub0Var = this.f31329a;
                int i = this.f31330b;
                qb0.a aVar = this.f31331c;
                long jD = rzVar.d();
                byte[] bArr = new byte[2];
                rzVar.b(bArr, 0, 2, false);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) == i) {
                    uf1 uf1Var = new uf1(16);
                    System.arraycopy(bArr, 0, uf1Var.c(), 0, 2);
                    byte[] bArrC = uf1Var.c();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 14) {
                            j4 = j10;
                            break;
                        }
                        j4 = j10;
                        int iC = rzVar.c(bArrC, 2 + i10, 14 - i10);
                        if (iC == -1) {
                            break;
                        }
                        i10 += iC;
                        j10 = j4;
                    }
                    uf1Var.d(i10);
                    rzVar.c();
                    rzVar.a(false, (int) (jD - rzVar.a()));
                    if (qb0.a(uf1Var, ub0Var, i, aVar)) {
                        break;
                    }
                } else {
                    rzVar.c();
                    rzVar.a(false, (int) (jD - rzVar.a()));
                }
                rzVar.a(false, 1);
            }
            if (rzVar.d() < rzVar.b() - j4) {
                return this.f31331c.f32127a;
            }
            rzVar.a(false, (int) (rzVar.b() - rzVar.d()));
            return this.f31329a.f34013j;
        }

        @Override // com.yandex.mobile.ads.impl.dl.f
        public final dl.e a(rz rzVar, long j4) throws IOException {
            long jA = rzVar.a();
            long jA2 = a(rzVar);
            long jD = rzVar.d();
            rzVar.a(false, Math.max(6, this.f31329a.f34007c));
            long jA3 = a(rzVar);
            long jD2 = rzVar.d();
            if (jA2 <= j4 && jA3 > j4) {
                return dl.e.a(jD);
            }
            if (jA3 <= j4) {
                return dl.e.b(jA3, jD2);
            }
            return dl.e.a(jA2, jA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob0(ub0 ub0Var, int i, long j4, long j10) {
        super(new X1(ub0Var, 4), new a(i, ub0Var, 0), ub0Var.b(), ub0Var.f34013j, j4, j10, ub0Var.a(), Math.max(6, ub0Var.f34007c));
        Objects.requireNonNull(ub0Var);
    }
}
