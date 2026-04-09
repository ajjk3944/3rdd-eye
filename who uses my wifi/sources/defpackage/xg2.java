package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xg2 implements qf2 {
    public int b;
    public float c;
    public float d;
    public ce2 e;
    public ce2 f;
    public ce2 g;
    public ce2 h;
    public boolean i;
    public mg2 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.qf2
    public final ce2 a(ce2 ce2Var) throws af2 {
        if (ce2Var.c != 2) {
            throw new af2("Unhandled input format:", ce2Var);
        }
        int i = this.b;
        if (i == -1) {
            i = ce2Var.a;
        }
        this.e = ce2Var;
        ce2 ce2Var2 = new ce2(i, ce2Var.b, 2);
        this.f = ce2Var2;
        this.i = true;
        return ce2Var2;
    }

    @Override // defpackage.qf2
    public final void b() {
        mg2 mg2Var = this.j;
        if (mg2Var != null) {
            int i = mg2Var.k;
            int i2 = mg2Var.r;
            int i3 = mg2Var.m;
            float f = mg2Var.c;
            float f2 = mg2Var.d;
            int i4 = i3 + ((int) (((((((i - i2) / (f / f2)) + i2) + mg2Var.w) + mg2Var.o) / (mg2Var.e * f2)) + 0.5d));
            mg2Var.w = 0.0d;
            int i5 = mg2Var.h;
            int i6 = i5 + i5;
            mg2Var.j = mg2Var.a(mg2Var.j, i, i + i6);
            int i7 = 0;
            while (true) {
                int i8 = mg2Var.b;
                if (i7 >= i6 * i8) {
                    break;
                }
                mg2Var.j[(i8 * i) + i7] = 0;
                i7++;
            }
            mg2Var.k += i6;
            mg2Var.e();
            if (mg2Var.m > i4) {
                mg2Var.m = Math.max(i4, 0);
            }
            mg2Var.k = 0;
            mg2Var.r = 0;
            mg2Var.o = 0;
        }
        this.p = true;
    }

    @Override // defpackage.qf2
    public final ByteBuffer c() {
        mg2 mg2Var = this.j;
        if (mg2Var != null) {
            int i = mg2Var.b;
            zt0.b0(mg2Var.m >= 0);
            int i2 = mg2Var.m * i;
            int i3 = i2 + i2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                zt0.b0(mg2Var.m >= 0);
                int iMin = Math.min(shortBuffer.remaining() / i, mg2Var.m);
                int i4 = iMin * i;
                shortBuffer.put(mg2Var.l, 0, i4);
                int i5 = mg2Var.m - iMin;
                mg2Var.m = i5;
                short[] sArr = mg2Var.l;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = qf2.a;
        return byteBuffer;
    }

    @Override // defpackage.qf2
    public final long d(long j) {
        long j2 = this.o;
        if (j2 < 1024) {
            return (long) (j / this.c);
        }
        long j3 = this.n;
        mg2 mg2Var = this.j;
        mg2Var.getClass();
        int i = mg2Var.k * mg2Var.b;
        long j4 = j3 - (i + i);
        int i2 = this.h.a;
        int i3 = this.g.a;
        return i2 == i3 ? v23.t(j, j2, j4, RoundingMode.DOWN) : v23.t(j, j2 * i3, j4 * i2, RoundingMode.DOWN);
    }

    @Override // defpackage.qf2
    public final boolean e() {
        if (this.p) {
            mg2 mg2Var = this.j;
            if (mg2Var != null) {
                zt0.b0(mg2Var.m >= 0);
                int i = mg2Var.m * mg2Var.b;
                if (i + i != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.qf2
    public final void f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            mg2 mg2Var = this.j;
            mg2Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = mg2Var.b;
            int i2 = iRemaining2 / i;
            int i3 = i2 * i;
            short[] sArrA = mg2Var.a(mg2Var.j, mg2Var.k, i2);
            mg2Var.j = sArrA;
            shortBufferAsShortBuffer.get(sArrA, mg2Var.k * i, (i3 + i3) / 2);
            mg2Var.k += i2;
            mg2Var.e();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.qf2
    public final void g() {
        this.c = 1.0f;
        this.d = 1.0f;
        ce2 ce2Var = ce2.e;
        this.e = ce2Var;
        this.f = ce2Var;
        this.g = ce2Var;
        this.h = ce2Var;
        ByteBuffer byteBuffer = qf2.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.qf2
    public final boolean h() {
        if (this.f.a != -1) {
            return Math.abs(this.c + (-1.0f)) >= 1.0E-4f || Math.abs(this.d + (-1.0f)) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // defpackage.qf2
    public final void j() {
        if (h()) {
            ce2 ce2Var = this.e;
            this.g = ce2Var;
            ce2 ce2Var2 = this.f;
            this.h = ce2Var2;
            if (this.i) {
                this.j = new mg2(ce2Var.a, ce2Var.b, this.c, this.d, ce2Var2.a);
            } else {
                mg2 mg2Var = this.j;
                if (mg2Var != null) {
                    mg2Var.k = 0;
                    mg2Var.m = 0;
                    mg2Var.o = 0;
                    mg2Var.p = 0;
                    mg2Var.q = 0;
                    mg2Var.r = 0;
                    mg2Var.s = 0;
                    mg2Var.t = 0;
                    mg2Var.u = 0;
                    mg2Var.v = 0;
                    mg2Var.w = 0.0d;
                }
            }
        }
        this.m = qf2.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
