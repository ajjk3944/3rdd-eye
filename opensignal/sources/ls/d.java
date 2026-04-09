package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends rs.p {
    public static final d L;
    public static final a M = new a(2);
    public int B;
    public int D;
    public int E;
    public g F;
    public List G;
    public int H;
    public int I;
    public byte J;
    public int K;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15742a;

    /* renamed from: d, reason: collision with root package name */
    public int f15743d;

    /* renamed from: g, reason: collision with root package name */
    public c f15744g;

    /* renamed from: r, reason: collision with root package name */
    public long f15745r;

    /* renamed from: x, reason: collision with root package name */
    public float f15746x;

    /* renamed from: y, reason: collision with root package name */
    public double f15747y;

    static {
        d dVar = new d();
        L = dVar;
        dVar.i();
    }

    public d() {
        this.J = (byte) -1;
        this.K = -1;
        this.f15742a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.J;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15743d & 128) == 128 && !this.F.b()) {
            this.J = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            if (!((d) this.G.get(i10)).b()) {
                this.J = (byte) 0;
                return false;
            }
        }
        this.J = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.K;
        if (i10 != -1) {
            return i10;
        }
        int iK = (this.f15743d & 1) == 1 ? b5.m.k(1, this.f15744g.getNumber()) : 0;
        if ((this.f15743d & 2) == 2) {
            long j = this.f15745r;
            iK += b5.m.q((j >> 63) ^ (j << 1)) + b5.m.r(2);
        }
        if ((this.f15743d & 4) == 4) {
            iK += b5.m.r(3) + 4;
        }
        if ((this.f15743d & 8) == 8) {
            iK += b5.m.r(4) + 8;
        }
        if ((this.f15743d & 16) == 16) {
            iK += b5.m.l(5, this.B);
        }
        if ((this.f15743d & 32) == 32) {
            iK += b5.m.l(6, this.D);
        }
        if ((this.f15743d & 64) == 64) {
            iK += b5.m.l(7, this.E);
        }
        if ((this.f15743d & 128) == 128) {
            iK += b5.m.n(8, this.F);
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            iK += b5.m.n(9, (rs.b) this.G.get(i11));
        }
        if ((this.f15743d & 512) == 512) {
            iK += b5.m.l(10, this.I);
        }
        if ((this.f15743d & 256) == 256) {
            iK += b5.m.l(11, this.H);
        }
        int size = this.f15742a.size() + iK;
        this.K = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return b.g();
    }

    @Override // rs.b
    public final rs.k e() {
        b bVarG = b.g();
        bVarG.h(this);
        return bVarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15743d & 1) == 1) {
            mVar.L(1, this.f15744g.getNumber());
        }
        if ((this.f15743d & 2) == 2) {
            long j = this.f15745r;
            mVar.X(2, 0);
            mVar.W((j >> 63) ^ (j << 1));
        }
        if ((this.f15743d & 4) == 4) {
            float f10 = this.f15746x;
            mVar.X(3, 5);
            mVar.T(Float.floatToRawIntBits(f10));
        }
        if ((this.f15743d & 8) == 8) {
            double d6 = this.f15747y;
            mVar.X(4, 1);
            mVar.U(Double.doubleToRawLongBits(d6));
        }
        if ((this.f15743d & 16) == 16) {
            mVar.M(5, this.B);
        }
        if ((this.f15743d & 32) == 32) {
            mVar.M(6, this.D);
        }
        if ((this.f15743d & 64) == 64) {
            mVar.M(7, this.E);
        }
        if ((this.f15743d & 128) == 128) {
            mVar.O(8, this.F);
        }
        for (int i10 = 0; i10 < this.G.size(); i10++) {
            mVar.O(9, (rs.b) this.G.get(i10));
        }
        if ((this.f15743d & 512) == 512) {
            mVar.M(10, this.I);
        }
        if ((this.f15743d & 256) == 256) {
            mVar.M(11, this.H);
        }
        mVar.R(this.f15742a);
    }

    public final void i() {
        this.f15744g = c.BYTE;
        this.f15745r = 0L;
        this.f15746x = 0.0f;
        this.f15747y = 0.0d;
        this.B = 0;
        this.D = 0;
        this.E = 0;
        this.F = g.B;
        this.G = Collections.EMPTY_LIST;
        this.H = 0;
        this.I = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public d(f5.u uVar, rs.g gVar) {
        f fVar;
        this.J = (byte) -1;
        this.K = -1;
        i();
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (true) {
            ?? W = 256;
            if (!z10) {
                try {
                    try {
                        int iT = uVar.t();
                        switch (iT) {
                            case 0:
                                z10 = true;
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                int iQ = uVar.q();
                                c cVarValueOf = c.valueOf(iQ);
                                if (cVarValueOf == null) {
                                    mVarZ.V(iT);
                                    mVarZ.V(iQ);
                                } else {
                                    this.f15743d |= 1;
                                    this.f15744g = cVarValueOf;
                                }
                            case 16:
                                this.f15743d |= 2;
                                long jR = uVar.r();
                                this.f15745r = (-(jR & 1)) ^ (jR >>> 1);
                            case 29:
                                this.f15743d |= 4;
                                this.f15746x = Float.intBitsToFloat(uVar.o());
                            case 33:
                                this.f15743d |= 8;
                                this.f15747y = Double.longBitsToDouble(uVar.p());
                            case 40:
                                this.f15743d |= 16;
                                this.B = uVar.q();
                            case 48:
                                this.f15743d |= 32;
                                this.D = uVar.q();
                            case 56:
                                this.f15743d |= 64;
                                this.E = uVar.q();
                            case 66:
                                if ((this.f15743d & 128) == 128) {
                                    g gVar2 = this.F;
                                    gVar2.getClass();
                                    fVar = new f(0);
                                    fVar.f15770r = Collections.EMPTY_LIST;
                                    fVar.k(gVar2);
                                } else {
                                    fVar = null;
                                }
                                g gVar3 = (g) uVar.m(g.D, gVar);
                                this.F = gVar3;
                                if (fVar != null) {
                                    fVar.k(gVar3);
                                    this.F = fVar.g();
                                }
                                this.f15743d |= 128;
                            case 74:
                                if ((c4 & 256) != 256) {
                                    this.G = new ArrayList();
                                    c4 = 256;
                                }
                                this.G.add(uVar.m(M, gVar));
                            case 80:
                                this.f15743d |= 512;
                                this.I = uVar.q();
                            case 88:
                                this.f15743d |= 256;
                                this.H = uVar.q();
                            default:
                                W = uVar.w(iT, mVarZ);
                                if (W == 0) {
                                    z10 = true;
                                }
                        }
                    } catch (rs.t e4) {
                        e4.f21776a = this;
                        throw e4;
                    } catch (IOException e10) {
                        rs.t tVar = new rs.t(e10.getMessage());
                        tVar.f21776a = this;
                        throw tVar;
                    }
                } catch (Throwable th2) {
                    if ((c4 & 256) == W) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    try {
                        mVarZ.x();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f15742a = dVar.h();
                        throw th3;
                    }
                    this.f15742a = dVar.h();
                    throw th2;
                }
            } else {
                if ((c4 & 256) == 256) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f15742a = dVar.h();
                    throw th4;
                }
                this.f15742a = dVar.h();
                return;
            }
        }
    }

    public d(b bVar) {
        this.J = (byte) -1;
        this.K = -1;
        this.f15742a = bVar.f21763a;
    }
}
