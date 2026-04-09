package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.et1;
import com.yandex.mobile.ads.impl.n52;
import com.yandex.mobile.ads.impl.vc;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class dt1 {

    /* renamed from: a, reason: collision with root package name */
    private final vc f26313a;

    /* renamed from: b, reason: collision with root package name */
    private final int f26314b;

    /* renamed from: c, reason: collision with root package name */
    private final uf1 f26315c;

    /* renamed from: d, reason: collision with root package name */
    private a f26316d;

    /* renamed from: e, reason: collision with root package name */
    private a f26317e;

    /* renamed from: f, reason: collision with root package name */
    private a f26318f;

    /* renamed from: g, reason: collision with root package name */
    private long f26319g;

    public dt1(vc vcVar) {
        this.f26313a = vcVar;
        int iB = ((yy) vcVar).b();
        this.f26314b = iB;
        this.f26315c = new uf1(32);
        a aVar = new a(iB, 0L);
        this.f26316d = aVar;
        this.f26317e = aVar;
        this.f26318f = aVar;
    }

    public final void a(long j4) {
        a aVar;
        if (j4 == -1) {
            return;
        }
        while (true) {
            aVar = this.f26316d;
            if (j4 < aVar.f26321b) {
                break;
            }
            ((yy) this.f26313a).a(aVar.f26322c);
            a aVar2 = this.f26316d;
            aVar2.f26322c = null;
            a aVar3 = aVar2.f26323d;
            aVar2.f26323d = null;
            this.f26316d = aVar3;
        }
        if (this.f26317e.f26320a < aVar.f26320a) {
            this.f26317e = aVar;
        }
    }

    public final void b(my myVar, et1.a aVar) {
        this.f26317e = a(this.f26317e, myVar, aVar, this.f26315c);
    }

    public final void c() {
        this.f26317e = this.f26316d;
    }

    public static final class a implements vc.a {

        /* renamed from: a, reason: collision with root package name */
        public long f26320a;

        /* renamed from: b, reason: collision with root package name */
        public long f26321b;

        /* renamed from: c, reason: collision with root package name */
        public uc f26322c;

        /* renamed from: d, reason: collision with root package name */
        public a f26323d;

        public a(int i, long j4) {
            a(i, j4);
        }

        @Override // com.yandex.mobile.ads.impl.vc.a
        public final uc a() {
            uc ucVar = this.f26322c;
            ucVar.getClass();
            return ucVar;
        }

        @Override // com.yandex.mobile.ads.impl.vc.a
        public final vc.a next() {
            a aVar = this.f26323d;
            if (aVar == null || aVar.f26322c == null) {
                return null;
            }
            return aVar;
        }

        public final void a(int i, long j4) {
            if (this.f26322c == null) {
                this.f26320a = j4;
                this.f26321b = j4 + i;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final void b() {
        a aVar = this.f26316d;
        if (aVar.f26322c != null) {
            ((yy) this.f26313a).a(aVar);
            aVar.f26322c = null;
            aVar.f26323d = null;
        }
        this.f26316d.a(this.f26314b, 0L);
        a aVar2 = this.f26316d;
        this.f26317e = aVar2;
        this.f26318f = aVar2;
        this.f26319g = 0L;
        ((yy) this.f26313a).e();
    }

    public final long a() {
        return this.f26319g;
    }

    public final void a(my myVar, et1.a aVar) {
        a(this.f26317e, myVar, aVar, this.f26315c);
    }

    private static a a(a aVar, long j4, ByteBuffer byteBuffer, int i) {
        while (j4 >= aVar.f26321b) {
            aVar = aVar.f26323d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (aVar.f26321b - j4));
            uc ucVar = aVar.f26322c;
            byteBuffer.put(ucVar.f34023a, ((int) (j4 - aVar.f26320a)) + ucVar.f34024b, iMin);
            i -= iMin;
            j4 += iMin;
            if (j4 == aVar.f26321b) {
                aVar = aVar.f26323d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, long j4, byte[] bArr, int i) {
        while (j4 >= aVar.f26321b) {
            aVar = aVar.f26323d;
        }
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (aVar.f26321b - j4));
            uc ucVar = aVar.f26322c;
            System.arraycopy(ucVar.f34023a, ((int) (j4 - aVar.f26320a)) + ucVar.f34024b, bArr, i - i10, iMin);
            i10 -= iMin;
            j4 += iMin;
            if (j4 == aVar.f26321b) {
                aVar = aVar.f26323d;
            }
        }
        return aVar;
    }

    private static a a(a aVar, my myVar, et1.a aVar2, uf1 uf1Var) {
        a aVarA;
        int iZ;
        if (myVar.i()) {
            long j4 = aVar2.f27037b;
            uf1Var.c(1);
            a aVarA2 = a(aVar, j4, uf1Var.c(), 1);
            long j10 = j4 + 1;
            byte b10 = uf1Var.c()[0];
            boolean z10 = (b10 & 128) != 0;
            int i = b10 & 127;
            zu zuVar = myVar.f30571c;
            byte[] bArr = zuVar.f36738a;
            if (bArr == null) {
                zuVar.f36738a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            aVarA = a(aVarA2, j10, zuVar.f36738a, i);
            long j11 = j10 + i;
            if (z10) {
                uf1Var.c(2);
                aVarA = a(aVarA, j11, uf1Var.c(), 2);
                j11 += 2;
                iZ = uf1Var.z();
            } else {
                iZ = 1;
            }
            int[] iArr = zuVar.f36741d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zuVar.f36742e;
            if (iArr3 == null || iArr3.length < iZ) {
                iArr3 = new int[iZ];
            }
            int[] iArr4 = iArr3;
            if (z10) {
                int i10 = iZ * 6;
                uf1Var.c(i10);
                aVarA = a(aVarA, j11, uf1Var.c(), i10);
                j11 += i10;
                uf1Var.e(0);
                for (int i11 = 0; i11 < iZ; i11++) {
                    iArr2[i11] = uf1Var.z();
                    iArr4[i11] = uf1Var.x();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = aVar2.f27036a - ((int) (j11 - aVar2.f27037b));
            }
            n52.a aVar3 = aVar2.f27038c;
            int i12 = s82.f32899a;
            zuVar.a(iZ, iArr2, iArr4, aVar3.f30773b, zuVar.f36738a, aVar3.f30772a, aVar3.f30774c, aVar3.f30775d);
            long j12 = aVar2.f27037b;
            int i13 = (int) (j11 - j12);
            aVar2.f27037b = j12 + i13;
            aVar2.f27036a -= i13;
        } else {
            aVarA = aVar;
        }
        if (myVar.d()) {
            uf1Var.c(4);
            a aVarA3 = a(aVarA, aVar2.f27037b, uf1Var.c(), 4);
            int iX = uf1Var.x();
            aVar2.f27037b += 4;
            aVar2.f27036a -= 4;
            myVar.e(iX);
            a aVarA4 = a(aVarA3, aVar2.f27037b, myVar.f30572d, iX);
            aVar2.f27037b += iX;
            int i14 = aVar2.f27036a - iX;
            aVar2.f27036a = i14;
            ByteBuffer byteBuffer = myVar.f30575g;
            if (byteBuffer != null && byteBuffer.capacity() >= i14) {
                myVar.f30575g.clear();
            } else {
                myVar.f30575g = ByteBuffer.allocate(i14);
            }
            return a(aVarA4, aVar2.f27037b, myVar.f30575g, aVar2.f27036a);
        }
        myVar.e(aVar2.f27036a);
        return a(aVarA, aVar2.f27037b, myVar.f30572d, aVar2.f27036a);
    }

    public final int a(lv lvVar, int i, boolean z10) throws IOException {
        a aVar = this.f26318f;
        if (aVar.f26322c == null) {
            uc ucVarA = ((yy) this.f26313a).a();
            a aVar2 = new a(this.f26314b, this.f26318f.f26321b);
            aVar.f26322c = ucVarA;
            aVar.f26323d = aVar2;
        }
        int iMin = Math.min(i, (int) (this.f26318f.f26321b - this.f26319g));
        a aVar3 = this.f26318f;
        uc ucVar = aVar3.f26322c;
        int i10 = lvVar.read(ucVar.f34023a, ((int) (this.f26319g - aVar3.f26320a)) + ucVar.f34024b, iMin);
        if (i10 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = this.f26319g + i10;
        this.f26319g = j4;
        a aVar4 = this.f26318f;
        if (j4 == aVar4.f26321b) {
            this.f26318f = aVar4.f26323d;
        }
        return i10;
    }

    public final void a(int i, uf1 uf1Var) {
        while (i > 0) {
            a aVar = this.f26318f;
            if (aVar.f26322c == null) {
                uc ucVarA = ((yy) this.f26313a).a();
                a aVar2 = new a(this.f26314b, this.f26318f.f26321b);
                aVar.f26322c = ucVarA;
                aVar.f26323d = aVar2;
            }
            int iMin = Math.min(i, (int) (this.f26318f.f26321b - this.f26319g));
            a aVar3 = this.f26318f;
            uc ucVar = aVar3.f26322c;
            uf1Var.a(ucVar.f34023a, ((int) (this.f26319g - aVar3.f26320a)) + ucVar.f34024b, iMin);
            i -= iMin;
            long j4 = this.f26319g + iMin;
            this.f26319g = j4;
            a aVar4 = this.f26318f;
            if (j4 == aVar4.f26321b) {
                this.f26318f = aVar4.f26323d;
            }
        }
    }
}
