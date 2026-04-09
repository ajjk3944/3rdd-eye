package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l extends rs.m {
    public static final l E;
    public static final a F = new a(4);
    public byte B;
    public int D;

    /* renamed from: d, reason: collision with root package name */
    public final rs.e f15820d;

    /* renamed from: g, reason: collision with root package name */
    public int f15821g;

    /* renamed from: r, reason: collision with root package name */
    public int f15822r;

    /* renamed from: x, reason: collision with root package name */
    public List f15823x;

    /* renamed from: y, reason: collision with root package name */
    public List f15824y;

    static {
        l lVar = new l();
        E = lVar;
        lVar.f15822r = 6;
        List list = Collections.EMPTY_LIST;
        lVar.f15823x = list;
        lVar.f15824y = list;
    }

    public l(k kVar) {
        super(kVar);
        this.B = (byte) -1;
        this.D = -1;
        this.f15820d = kVar.f21763a;
    }

    @Override // rs.x
    public final rs.b a() {
        return E;
    }

    @Override // rs.x
    public final boolean b() {
        byte b2 = this.B;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15823x.size(); i10++) {
            if (!((y0) this.f15823x.get(i10)).b()) {
                this.B = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.B = (byte) 1;
            return true;
        }
        this.B = (byte) 0;
        return false;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.D;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f15821g & 1) == 1 ? b5.m.l(1, this.f15822r) : 0;
        for (int i11 = 0; i11 < this.f15823x.size(); i11++) {
            iL += b5.m.n(2, (rs.b) this.f15823x.get(i11));
        }
        int iM = 0;
        for (int i12 = 0; i12 < this.f15824y.size(); i12++) {
            iM += b5.m.m(((Integer) this.f15824y.get(i12)).intValue());
        }
        int size = this.f15820d.size() + j() + (this.f15824y.size() * 2) + iL + iM;
        this.D = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return k.h();
    }

    @Override // rs.b
    public final rs.k e() {
        k kVarH = k.h();
        kVarH.i(this);
        return kVarH;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        om.f fVar = new om.f(this);
        if ((this.f15821g & 1) == 1) {
            mVar.M(1, this.f15822r);
        }
        for (int i10 = 0; i10 < this.f15823x.size(); i10++) {
            mVar.O(2, (rs.b) this.f15823x.get(i10));
        }
        for (int i11 = 0; i11 < this.f15824y.size(); i11++) {
            mVar.M(31, ((Integer) this.f15824y.get(i11)).intValue());
        }
        fVar.y(19000, mVar);
        mVar.R(this.f15820d);
    }

    public l() {
        this.B = (byte) -1;
        this.D = -1;
        this.f15820d = rs.e.f21745a;
    }

    public l(f5.u uVar, rs.g gVar) {
        this.B = (byte) -1;
        this.D = -1;
        this.f15822r = 6;
        List list = Collections.EMPTY_LIST;
        this.f15823x = list;
        this.f15824y = list;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f15821g |= 1;
                            this.f15822r = uVar.q();
                        } else if (iT == 18) {
                            if ((i10 & 2) != 2) {
                                this.f15823x = new ArrayList();
                                i10 |= 2;
                            }
                            this.f15823x.add(uVar.m(y0.I, gVar));
                        } else if (iT == 248) {
                            if ((i10 & 4) != 4) {
                                this.f15824y = new ArrayList();
                                i10 |= 4;
                            }
                            this.f15824y.add(Integer.valueOf(uVar.q()));
                        } else if (iT != 250) {
                            if (!n(uVar, mVarZ, gVar, iT)) {
                            }
                        } else {
                            int iJ = uVar.j(uVar.q());
                            if ((i10 & 4) != 4 && uVar.g() > 0) {
                                this.f15824y = new ArrayList();
                                i10 |= 4;
                            }
                            while (uVar.g() > 0) {
                                this.f15824y.add(Integer.valueOf(uVar.q()));
                            }
                            uVar.i(iJ);
                        }
                    }
                    z10 = true;
                } catch (rs.t e4) {
                    e4.f21776a = this;
                    throw e4;
                } catch (IOException e10) {
                    rs.t tVar = new rs.t(e10.getMessage());
                    tVar.f21776a = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                if ((i10 & 2) == 2) {
                    this.f15823x = Collections.unmodifiableList(this.f15823x);
                }
                if ((i10 & 4) == 4) {
                    this.f15824y = Collections.unmodifiableList(this.f15824y);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15820d = dVar.h();
                    throw th3;
                }
                this.f15820d = dVar.h();
                m();
                throw th2;
            }
        }
        if ((i10 & 2) == 2) {
            this.f15823x = Collections.unmodifiableList(this.f15823x);
        }
        if ((i10 & 4) == 4) {
            this.f15824y = Collections.unmodifiableList(this.f15824y);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15820d = dVar.h();
            throw th4;
        }
        this.f15820d = dVar.h();
        m();
    }
}
