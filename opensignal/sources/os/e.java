package os;

import b5.m;
import f5.u;
import java.io.IOException;
import rs.p;
import rs.t;

/* loaded from: classes.dex */
public final class e extends p {
    public static final e F;
    public static final ls.a G = new ls.a(26);
    public c B;
    public byte D;
    public int E;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f19752a;

    /* renamed from: d, reason: collision with root package name */
    public int f19753d;

    /* renamed from: g, reason: collision with root package name */
    public b f19754g;

    /* renamed from: r, reason: collision with root package name */
    public c f19755r;

    /* renamed from: x, reason: collision with root package name */
    public c f19756x;

    /* renamed from: y, reason: collision with root package name */
    public c f19757y;

    static {
        e eVar = new e();
        F = eVar;
        eVar.f19754g = b.B;
        c cVar = c.B;
        eVar.f19755r = cVar;
        eVar.f19756x = cVar;
        eVar.f19757y = cVar;
        eVar.B = cVar;
    }

    public e() {
        this.D = (byte) -1;
        this.E = -1;
        this.f19752a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.D == 1) {
            return true;
        }
        this.D = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        int i10 = this.E;
        if (i10 != -1) {
            return i10;
        }
        int iN = (this.f19753d & 1) == 1 ? m.n(1, this.f19754g) : 0;
        if ((this.f19753d & 2) == 2) {
            iN += m.n(2, this.f19755r);
        }
        if ((this.f19753d & 4) == 4) {
            iN += m.n(3, this.f19756x);
        }
        if ((this.f19753d & 8) == 8) {
            iN += m.n(4, this.f19757y);
        }
        if ((this.f19753d & 16) == 16) {
            iN += m.n(5, this.B);
        }
        int size = this.f19752a.size() + iN;
        this.E = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return d.g();
    }

    @Override // rs.b
    public final rs.k e() {
        d dVarG = d.g();
        dVarG.h(this);
        return dVarG;
    }

    @Override // rs.b
    public final void f(m mVar) throws IOException {
        c();
        if ((this.f19753d & 1) == 1) {
            mVar.O(1, this.f19754g);
        }
        if ((this.f19753d & 2) == 2) {
            mVar.O(2, this.f19755r);
        }
        if ((this.f19753d & 4) == 4) {
            mVar.O(3, this.f19756x);
        }
        if ((this.f19753d & 8) == 8) {
            mVar.O(4, this.f19757y);
        }
        if ((this.f19753d & 16) == 16) {
            mVar.O(5, this.B);
        }
        mVar.R(this.f19752a);
    }

    public e(u uVar, rs.g gVar) {
        this.D = (byte) -1;
        this.E = -1;
        this.f19754g = b.B;
        c cVar = c.B;
        this.f19755r = cVar;
        this.f19756x = cVar;
        this.f19757y = cVar;
        this.B = cVar;
        rs.d dVar = new rs.d();
        m mVarZ = m.z(dVar, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        a aVarI = null;
                        if (iT == 10) {
                            if ((this.f19753d & 1) == 1) {
                                b bVar = this.f19754g;
                                bVar.getClass();
                                aVarI = new a(0);
                                aVarI.h(bVar);
                            }
                            b bVar2 = (b) uVar.m(b.D, gVar);
                            this.f19754g = bVar2;
                            if (aVarI != null) {
                                aVarI.h(bVar2);
                                this.f19754g = aVarI.f();
                            }
                            this.f19753d |= 1;
                        } else if (iT == 18) {
                            if ((this.f19753d & 2) == 2) {
                                c cVar2 = this.f19755r;
                                cVar2.getClass();
                                aVarI = c.i(cVar2);
                            }
                            c cVar3 = (c) uVar.m(c.D, gVar);
                            this.f19755r = cVar3;
                            if (aVarI != null) {
                                aVarI.i(cVar3);
                                this.f19755r = aVarI.g();
                            }
                            this.f19753d |= 2;
                        } else if (iT == 26) {
                            if ((this.f19753d & 4) == 4) {
                                c cVar4 = this.f19756x;
                                cVar4.getClass();
                                aVarI = c.i(cVar4);
                            }
                            c cVar5 = (c) uVar.m(c.D, gVar);
                            this.f19756x = cVar5;
                            if (aVarI != null) {
                                aVarI.i(cVar5);
                                this.f19756x = aVarI.g();
                            }
                            this.f19753d |= 4;
                        } else if (iT == 34) {
                            if ((this.f19753d & 8) == 8) {
                                c cVar6 = this.f19757y;
                                cVar6.getClass();
                                aVarI = c.i(cVar6);
                            }
                            c cVar7 = (c) uVar.m(c.D, gVar);
                            this.f19757y = cVar7;
                            if (aVarI != null) {
                                aVarI.i(cVar7);
                                this.f19757y = aVarI.g();
                            }
                            this.f19753d |= 8;
                        } else if (iT != 42) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            if ((this.f19753d & 16) == 16) {
                                c cVar8 = this.B;
                                cVar8.getClass();
                                aVarI = c.i(cVar8);
                            }
                            c cVar9 = (c) uVar.m(c.D, gVar);
                            this.B = cVar9;
                            if (aVarI != null) {
                                aVarI.i(cVar9);
                                this.B = aVarI.g();
                            }
                            this.f19753d |= 16;
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
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19752a = dVar.h();
                    throw th3;
                }
                this.f19752a = dVar.h();
                throw th2;
            }
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19752a = dVar.h();
            throw th4;
        }
        this.f19752a = dVar.h();
    }

    public e(d dVar) {
        this.D = (byte) -1;
        this.E = -1;
        this.f19752a = dVar.f21763a;
    }
}
