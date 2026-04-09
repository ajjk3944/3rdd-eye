package os;

import b5.m;
import f5.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rs.p;
import rs.t;

/* loaded from: classes.dex */
public final class j extends p {
    public static final j B;
    public static final ls.a D = new ls.a(27);

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f19772a;

    /* renamed from: d, reason: collision with root package name */
    public List f19773d;

    /* renamed from: g, reason: collision with root package name */
    public List f19774g;

    /* renamed from: r, reason: collision with root package name */
    public int f19775r;

    /* renamed from: x, reason: collision with root package name */
    public byte f19776x;

    /* renamed from: y, reason: collision with root package name */
    public int f19777y;

    static {
        j jVar = new j();
        B = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f19773d = list;
        jVar.f19774g = list;
    }

    public j() {
        this.f19775r = -1;
        this.f19776x = (byte) -1;
        this.f19777y = -1;
        this.f19772a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.f19776x == 1) {
            return true;
        }
        this.f19776x = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.f19777y;
        if (i10 != -1) {
            return i10;
        }
        int iN = 0;
        for (int i11 = 0; i11 < this.f19773d.size(); i11++) {
            iN += m.n(1, (rs.b) this.f19773d.get(i11));
        }
        int iM = 0;
        for (int i12 = 0; i12 < this.f19774g.size(); i12++) {
            iM += m.m(((Integer) this.f19774g.get(i12)).intValue());
        }
        int iM2 = iN + iM;
        if (!this.f19774g.isEmpty()) {
            iM2 = iM2 + 1 + m.m(iM);
        }
        this.f19775r = iM;
        int size = this.f19772a.size() + iM2;
        this.f19777y = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f19759g = list;
        fVar.f19760r = list;
        return fVar;
    }

    @Override // rs.b
    public final rs.k e() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f19759g = list;
        fVar.f19760r = list;
        fVar.g(this);
        return fVar;
    }

    @Override // rs.b
    public final void f(m mVar) throws IOException {
        c();
        for (int i10 = 0; i10 < this.f19773d.size(); i10++) {
            mVar.O(1, (rs.b) this.f19773d.get(i10));
        }
        if (this.f19774g.size() > 0) {
            mVar.V(42);
            mVar.V(this.f19775r);
        }
        for (int i11 = 0; i11 < this.f19774g.size(); i11++) {
            mVar.N(((Integer) this.f19774g.get(i11)).intValue());
        }
        mVar.R(this.f19772a);
    }

    public j(u uVar, rs.g gVar) {
        this.f19775r = -1;
        this.f19776x = (byte) -1;
        this.f19777y = -1;
        List list = Collections.EMPTY_LIST;
        this.f19773d = list;
        this.f19774g = list;
        rs.d dVar = new rs.d();
        m mVarZ = m.z(dVar, 1);
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 10) {
                            if ((i10 & 1) != 1) {
                                this.f19773d = new ArrayList();
                                i10 |= 1;
                            }
                            this.f19773d.add(uVar.m(i.J, gVar));
                        } else if (iT == 40) {
                            if ((i10 & 2) != 2) {
                                this.f19774g = new ArrayList();
                                i10 |= 2;
                            }
                            this.f19774g.add(Integer.valueOf(uVar.q()));
                        } else if (iT != 42) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            int iJ = uVar.j(uVar.q());
                            if ((i10 & 2) != 2 && uVar.g() > 0) {
                                this.f19774g = new ArrayList();
                                i10 |= 2;
                            }
                            while (uVar.g() > 0) {
                                this.f19774g.add(Integer.valueOf(uVar.q()));
                            }
                            uVar.i(iJ);
                        }
                    }
                    z10 = true;
                } catch (t e4) {
                    e4.f21776a = this;
                    throw e4;
                } catch (IOException e10) {
                    t tVar = new t(e10.getMessage());
                    tVar.f21776a = this;
                    throw tVar;
                }
            } catch (Throwable th2) {
                if ((i10 & 1) == 1) {
                    this.f19773d = Collections.unmodifiableList(this.f19773d);
                }
                if ((i10 & 2) == 2) {
                    this.f19774g = Collections.unmodifiableList(this.f19774g);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19772a = dVar.h();
                    throw th3;
                }
                this.f19772a = dVar.h();
                throw th2;
            }
        }
        if ((i10 & 1) == 1) {
            this.f19773d = Collections.unmodifiableList(this.f19773d);
        }
        if ((i10 & 2) == 2) {
            this.f19774g = Collections.unmodifiableList(this.f19774g);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19772a = dVar.h();
            throw th4;
        }
        this.f19772a = dVar.h();
    }

    public j(f fVar) {
        this.f19775r = -1;
        this.f19776x = (byte) -1;
        this.f19777y = -1;
        this.f19772a = fVar.f21763a;
    }
}
