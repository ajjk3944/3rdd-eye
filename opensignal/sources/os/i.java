package os;

import b5.m;
import f5.u;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import rs.p;
import rs.t;
import rs.w;

/* loaded from: classes.dex */
public final class i extends p {
    public static final i I;
    public static final ls.a J = new ls.a(28);
    public List B;
    public int D;
    public List E;
    public int F;
    public byte G;
    public int H;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f19766a;

    /* renamed from: d, reason: collision with root package name */
    public int f19767d;

    /* renamed from: g, reason: collision with root package name */
    public int f19768g;

    /* renamed from: r, reason: collision with root package name */
    public int f19769r;

    /* renamed from: x, reason: collision with root package name */
    public Object f19770x;

    /* renamed from: y, reason: collision with root package name */
    public h f19771y;

    static {
        i iVar = new i();
        I = iVar;
        iVar.f19768g = 1;
        iVar.f19769r = 0;
        iVar.f19770x = "";
        iVar.f19771y = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.B = list;
        iVar.E = list;
    }

    public i() {
        this.D = -1;
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f19766a = rs.e.f21745a;
    }

    @Override // rs.x
    public final boolean b() {
        if (this.G == 1) {
            return true;
        }
        this.G = (byte) 1;
        return true;
    }

    @Override // rs.b
    public final int c() {
        rs.e wVar;
        int i10 = this.H;
        if (i10 != -1) {
            return i10;
        }
        int iL = (this.f19767d & 1) == 1 ? m.l(1, this.f19768g) : 0;
        if ((this.f19767d & 2) == 2) {
            iL += m.l(2, this.f19769r);
        }
        if ((this.f19767d & 8) == 8) {
            iL += m.k(3, this.f19771y.getNumber());
        }
        int iM = 0;
        for (int i11 = 0; i11 < this.B.size(); i11++) {
            iM += m.m(((Integer) this.B.get(i11)).intValue());
        }
        int iM2 = iL + iM;
        if (!this.B.isEmpty()) {
            iM2 = iM2 + 1 + m.m(iM);
        }
        this.D = iM;
        int iM3 = 0;
        for (int i12 = 0; i12 < this.E.size(); i12++) {
            iM3 += m.m(((Integer) this.E.get(i12)).intValue());
        }
        int size = iM2 + iM3;
        if (!this.E.isEmpty()) {
            size = size + 1 + m.m(iM3);
        }
        this.F = iM3;
        if ((this.f19767d & 4) == 4) {
            Object obj = this.f19770x;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f19770x = wVar;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException("UTF-8 not supported?", e4);
                }
            } else {
                wVar = (rs.e) obj;
            }
            size += wVar.size() + m.p(wVar.size()) + m.r(6);
        }
        int size2 = this.f19766a.size() + size;
        this.H = size2;
        return size2;
    }

    @Override // rs.b
    public final rs.k d() {
        return g.g();
    }

    @Override // rs.b
    public final rs.k e() {
        g gVarG = g.g();
        gVarG.h(this);
        return gVarG;
    }

    @Override // rs.b
    public final void f(m mVar) throws IOException {
        rs.e wVar;
        c();
        if ((this.f19767d & 1) == 1) {
            mVar.M(1, this.f19768g);
        }
        if ((this.f19767d & 2) == 2) {
            mVar.M(2, this.f19769r);
        }
        if ((this.f19767d & 8) == 8) {
            mVar.L(3, this.f19771y.getNumber());
        }
        if (this.B.size() > 0) {
            mVar.V(34);
            mVar.V(this.D);
        }
        for (int i10 = 0; i10 < this.B.size(); i10++) {
            mVar.N(((Integer) this.B.get(i10)).intValue());
        }
        if (this.E.size() > 0) {
            mVar.V(42);
            mVar.V(this.F);
        }
        for (int i11 = 0; i11 < this.E.size(); i11++) {
            mVar.N(((Integer) this.E.get(i11)).intValue());
        }
        if ((this.f19767d & 4) == 4) {
            Object obj = this.f19770x;
            if (obj instanceof String) {
                try {
                    wVar = new w(((String) obj).getBytes("UTF-8"));
                    this.f19770x = wVar;
                } catch (UnsupportedEncodingException e4) {
                    throw new RuntimeException("UTF-8 not supported?", e4);
                }
            } else {
                wVar = (rs.e) obj;
            }
            mVar.X(6, 2);
            mVar.V(wVar.size());
            mVar.R(wVar);
        }
        mVar.R(this.f19766a);
    }

    public i(u uVar) {
        this.D = -1;
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f19768g = 1;
        boolean z10 = false;
        this.f19769r = 0;
        this.f19770x = "";
        this.f19771y = h.NONE;
        List list = Collections.EMPTY_LIST;
        this.B = list;
        this.E = list;
        rs.d dVar = new rs.d();
        m mVarZ = m.z(dVar, 1);
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            this.f19767d |= 1;
                            this.f19768g = uVar.q();
                        } else if (iT == 16) {
                            this.f19767d |= 2;
                            this.f19769r = uVar.q();
                        } else if (iT == 24) {
                            int iQ = uVar.q();
                            h hVarValueOf = h.valueOf(iQ);
                            if (hVarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f19767d |= 8;
                                this.f19771y = hVarValueOf;
                            }
                        } else if (iT == 32) {
                            if ((i10 & 16) != 16) {
                                this.B = new ArrayList();
                                i10 |= 16;
                            }
                            this.B.add(Integer.valueOf(uVar.q()));
                        } else if (iT == 34) {
                            int iJ = uVar.j(uVar.q());
                            if ((i10 & 16) != 16 && uVar.g() > 0) {
                                this.B = new ArrayList();
                                i10 |= 16;
                            }
                            while (uVar.g() > 0) {
                                this.B.add(Integer.valueOf(uVar.q()));
                            }
                            uVar.i(iJ);
                        } else if (iT == 40) {
                            if ((i10 & 32) != 32) {
                                this.E = new ArrayList();
                                i10 |= 32;
                            }
                            this.E.add(Integer.valueOf(uVar.q()));
                        } else if (iT == 42) {
                            int iJ2 = uVar.j(uVar.q());
                            if ((i10 & 32) != 32 && uVar.g() > 0) {
                                this.E = new ArrayList();
                                i10 |= 32;
                            }
                            while (uVar.g() > 0) {
                                this.E.add(Integer.valueOf(uVar.q()));
                            }
                            uVar.i(iJ2);
                        } else if (iT != 50) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            w wVarK = uVar.k();
                            this.f19767d |= 4;
                            this.f19770x = wVarK;
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
                if ((i10 & 16) == 16) {
                    this.B = Collections.unmodifiableList(this.B);
                }
                if ((i10 & 32) == 32) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f19766a = dVar.h();
                    throw th3;
                }
                this.f19766a = dVar.h();
                throw th2;
            }
        }
        if ((i10 & 16) == 16) {
            this.B = Collections.unmodifiableList(this.B);
        }
        if ((i10 & 32) == 32) {
            this.E = Collections.unmodifiableList(this.E);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f19766a = dVar.h();
            throw th4;
        }
        this.f19766a = dVar.h();
    }

    public i(g gVar) {
        this.D = -1;
        this.F = -1;
        this.G = (byte) -1;
        this.H = -1;
        this.f19766a = gVar.f21763a;
    }
}
