package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s0 extends rs.m {
    public static final s0 K;
    public static final a L = new a(18);
    public q0 B;
    public int D;
    public q0 E;
    public int F;
    public List G;
    public List H;
    public byte I;
    public int J;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15874d;

    /* renamed from: g, reason: collision with root package name */
    public int f15875g;

    /* renamed from: r, reason: collision with root package name */
    public int f15876r;

    /* renamed from: x, reason: collision with root package name */
    public int f15877x;

    /* renamed from: y, reason: collision with root package name */
    public List f15878y;

    static {
        s0 s0Var = new s0();
        K = s0Var;
        s0Var.f15876r = 6;
        s0Var.f15877x = 0;
        List list = Collections.EMPTY_LIST;
        s0Var.f15878y = list;
        q0 q0Var = q0.P;
        s0Var.B = q0Var;
        s0Var.D = 0;
        s0Var.E = q0Var;
        s0Var.F = 0;
        s0Var.G = list;
        s0Var.H = list;
    }

    public s0(r0 r0Var) {
        super(r0Var);
        this.I = (byte) -1;
        this.J = -1;
        this.f15874d = r0Var.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return K;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.I;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if ((this.f15875g & 2) != 2) {
            this.I = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f15878y.size(); i10++) {
            if (!((v0) this.f15878y.get(i10)).b()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if ((this.f15875g & 4) == 4 && !this.B.b()) {
            this.I = (byte) 0;
            return false;
        }
        if ((this.f15875g & 16) == 16 && !this.E.b()) {
            this.I = (byte) 0;
            return false;
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            if (!((g) this.G.get(i11)).b()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.J;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15875g & 1) == 1 ? b5.m.l(1, this.f15876r) : 0;
        if ((this.f15875g & 2) == 2) {
            iL += b5.m.l(2, this.f15877x);
        }
        for (int i11 = 0; i11 < this.f15878y.size(); i11++) {
            iL += b5.m.n(3, (rs.b) this.f15878y.get(i11));
        }
        if ((this.f15875g & 4) == 4) {
            iL += b5.m.n(4, this.B);
        }
        if ((this.f15875g & 8) == 8) {
            iL += b5.m.l(5, this.D);
        }
        if ((this.f15875g & 16) == 16) {
            iL += b5.m.n(6, this.E);
        }
        if ((this.f15875g & 32) == 32) {
            iL += b5.m.l(7, this.F);
        }
        for (int i12 = 0; i12 < this.G.size(); i12++) {
            iL += b5.m.n(8, (rs.b) this.G.get(i12));
        }
        int iM = 0;
        for (int i13 = 0; i13 < this.H.size(); i13++) {
            iM += b5.m.m(((Integer) this.H.get(i13)).intValue());
        }
        int size = this.f15874d.size() + j() + (this.H.size() * 2) + iL + iM;
        this.J = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return r0.h();
    }

    @Override // rs.b
    public final rs.k e() {
        r0 r0VarH = r0.h();
        r0VarH.i(this);
        return r0VarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15875g & 1) == 1) {
            mVar.M(1, this.f15876r);
        }
        if ((this.f15875g & 2) == 2) {
            mVar.M(2, this.f15877x);
        }
        for (int i10 = 0; i10 < this.f15878y.size(); i10++) {
            mVar.O(3, (rs.b) this.f15878y.get(i10));
        }
        if ((this.f15875g & 4) == 4) {
            mVar.O(4, this.B);
        }
        if ((this.f15875g & 8) == 8) {
            mVar.M(5, this.D);
        }
        if ((this.f15875g & 16) == 16) {
            mVar.O(6, this.E);
        }
        if ((this.f15875g & 32) == 32) {
            mVar.M(7, this.F);
        }
        for (int i11 = 0; i11 < this.G.size(); i11++) {
            mVar.O(8, (rs.b) this.G.get(i11));
        }
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            mVar.M(31, ((Integer) this.H.get(i12)).intValue());
        }
        fVar.y(200, mVar);
        mVar.R(this.f15874d);
    }

    public s0() {
        this.I = (byte) -1;
        this.J = -1;
        this.f15874d = rs.e.f21745a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public s0(f5.u uVar, rs.g gVar) {
        this.I = (byte) -1;
        this.J = -1;
        this.f15876r = 6;
        boolean z10 = false;
        this.f15877x = 0;
        List list = Collections.EMPTY_LIST;
        this.f15878y = list;
        q0 q0Var = q0.P;
        this.B = q0Var;
        this.D = 0;
        this.E = q0Var;
        this.F = 0;
        this.G = list;
        this.H = list;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        int i10 = 0;
        while (true) {
            ?? N = 128;
            if (!z10) {
                try {
                    try {
                        try {
                            int iT = uVar.t();
                            p0 p0VarR = null;
                            switch (iT) {
                                case 0:
                                    z10 = true;
                                case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                                    this.f15875g |= 1;
                                    this.f15876r = uVar.q();
                                case 16:
                                    this.f15875g |= 2;
                                    this.f15877x = uVar.q();
                                case 26:
                                    if ((i10 & 4) != 4) {
                                        this.f15878y = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.f15878y.add(uVar.m(v0.J, gVar));
                                case 34:
                                    if ((this.f15875g & 4) == 4) {
                                        q0 q0Var2 = this.B;
                                        q0Var2.getClass();
                                        p0VarR = q0.r(q0Var2);
                                    }
                                    q0 q0Var3 = (q0) uVar.m(q0.Q, gVar);
                                    this.B = q0Var3;
                                    if (p0VarR != null) {
                                        p0VarR.i(q0Var3);
                                        this.B = p0VarR.g();
                                    }
                                    this.f15875g |= 4;
                                case 40:
                                    this.f15875g |= 8;
                                    this.D = uVar.q();
                                case 50:
                                    if ((this.f15875g & 16) == 16) {
                                        q0 q0Var4 = this.E;
                                        q0Var4.getClass();
                                        p0VarR = q0.r(q0Var4);
                                    }
                                    q0 q0Var5 = (q0) uVar.m(q0.Q, gVar);
                                    this.E = q0Var5;
                                    if (p0VarR != null) {
                                        p0VarR.i(q0Var5);
                                        this.E = p0VarR.g();
                                    }
                                    this.f15875g |= 16;
                                case 56:
                                    this.f15875g |= 32;
                                    this.F = uVar.q();
                                case 66:
                                    if ((i10 & 128) != 128) {
                                        this.G = new ArrayList();
                                        i10 |= 128;
                                    }
                                    this.G.add(uVar.m(g.D, gVar));
                                case 248:
                                    if ((i10 & 256) != 256) {
                                        this.H = new ArrayList();
                                        i10 |= 256;
                                    }
                                    this.H.add(Integer.valueOf(uVar.q()));
                                case 250:
                                    int iJ = uVar.j(uVar.q());
                                    if ((i10 & 256) != 256 && uVar.g() > 0) {
                                        this.H = new ArrayList();
                                        i10 |= 256;
                                    }
                                    while (uVar.g() > 0) {
                                        this.H.add(Integer.valueOf(uVar.q()));
                                    }
                                    uVar.i(iJ);
                                    break;
                                default:
                                    N = n(uVar, mVarZ, gVar, iT);
                                    if (N == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (rs.t e4) {
                            e4.f21776a = this;
                            throw e4;
                        }
                    } catch (IOException e10) {
                        rs.t tVar = new rs.t(e10.getMessage());
                        tVar.f21776a = this;
                        throw tVar;
                    }
                } catch (Throwable th2) {
                    if ((i10 & 4) == 4) {
                        this.f15878y = Collections.unmodifiableList(this.f15878y);
                    }
                    if ((i10 & 128) == N) {
                        this.G = Collections.unmodifiableList(this.G);
                    }
                    if ((i10 & 256) == 256) {
                        this.H = Collections.unmodifiableList(this.H);
                    }
                    try {
                        mVarZ.x();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f15874d = dVar.h();
                        throw th3;
                    }
                    this.f15874d = dVar.h();
                    m();
                    throw th2;
                }
            } else {
                if ((i10 & 4) == 4) {
                    this.f15878y = Collections.unmodifiableList(this.f15878y);
                }
                if ((i10 & 128) == 128) {
                    this.G = Collections.unmodifiableList(this.G);
                }
                if ((i10 & 256) == 256) {
                    this.H = Collections.unmodifiableList(this.H);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f15874d = dVar.h();
                    throw th4;
                }
                this.f15874d = dVar.h();
                m();
                return;
            }
        }
    }
}
