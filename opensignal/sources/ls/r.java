package ls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends rs.p {
    public static final r E;
    public static final a F = new a(6);
    public byte B;
    public int D;

    /* renamed from: a, reason: collision with root package name */
    public final rs.e f15863a;

    /* renamed from: d, reason: collision with root package name */
    public int f15864d;

    /* renamed from: g, reason: collision with root package name */
    public p f15865g;

    /* renamed from: r, reason: collision with root package name */
    public List f15866r;

    /* renamed from: x, reason: collision with root package name */
    public w f15867x;

    /* renamed from: y, reason: collision with root package name */
    public q f15868y;

    static {
        r rVar = new r();
        E = rVar;
        rVar.f15865g = p.RETURNS_CONSTANT;
        rVar.f15866r = Collections.EMPTY_LIST;
        rVar.f15867x = w.H;
        rVar.f15868y = q.AT_MOST_ONCE;
    }

    public r() {
        this.B = (byte) -1;
        this.D = -1;
        this.f15863a = rs.e.f21745a;
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
        for (int i10 = 0; i10 < this.f15866r.size(); i10++) {
            if (!((w) this.f15866r.get(i10)).b()) {
                this.B = (byte) 0;
                return false;
            }
        }
        if ((this.f15864d & 2) != 2 || this.f15867x.b()) {
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
        int iK = (this.f15864d & 1) == 1 ? b5.m.k(1, this.f15865g.getNumber()) : 0;
        for (int i11 = 0; i11 < this.f15866r.size(); i11++) {
            iK += b5.m.n(2, (rs.b) this.f15866r.get(i11));
        }
        if ((this.f15864d & 2) == 2) {
            iK += b5.m.n(3, this.f15867x);
        }
        if ((this.f15864d & 4) == 4) {
            iK += b5.m.k(4, this.f15868y.getNumber());
        }
        int size = this.f15863a.size() + iK;
        this.D = size;
        return size;
    }

    @Override // rs.b
    public final rs.k d() {
        return o.g();
    }

    @Override // rs.b
    public final rs.k e() {
        o oVarG = o.g();
        oVarG.h(this);
        return oVarG;
    }

    @Override // rs.b
    public final void f(b5.m mVar) throws IOException {
        c();
        if ((this.f15864d & 1) == 1) {
            mVar.L(1, this.f15865g.getNumber());
        }
        for (int i10 = 0; i10 < this.f15866r.size(); i10++) {
            mVar.O(2, (rs.b) this.f15866r.get(i10));
        }
        if ((this.f15864d & 2) == 2) {
            mVar.O(3, this.f15867x);
        }
        if ((this.f15864d & 4) == 4) {
            mVar.L(4, this.f15868y.getNumber());
        }
        mVar.R(this.f15863a);
    }

    public r(f5.u uVar, rs.g gVar) {
        u uVarG;
        this.B = (byte) -1;
        this.D = -1;
        this.f15865g = p.RETURNS_CONSTANT;
        this.f15866r = Collections.EMPTY_LIST;
        this.f15867x = w.H;
        this.f15868y = q.AT_MOST_ONCE;
        rs.d dVar = new rs.d();
        b5.m mVarZ = b5.m.z(dVar, 1);
        boolean z10 = false;
        char c4 = 0;
        while (!z10) {
            try {
                try {
                    int iT = uVar.t();
                    if (iT != 0) {
                        if (iT == 8) {
                            int iQ = uVar.q();
                            p pVarValueOf = p.valueOf(iQ);
                            if (pVarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ);
                            } else {
                                this.f15864d |= 1;
                                this.f15865g = pVarValueOf;
                            }
                        } else if (iT == 18) {
                            if ((c4 & 2) != 2) {
                                this.f15866r = new ArrayList();
                                c4 = 2;
                            }
                            this.f15866r.add(uVar.m(w.I, gVar));
                        } else if (iT == 26) {
                            if ((this.f15864d & 2) == 2) {
                                w wVar = this.f15867x;
                                wVar.getClass();
                                uVarG = u.g();
                                uVarG.h(wVar);
                            } else {
                                uVarG = null;
                            }
                            w wVar2 = (w) uVar.m(w.I, gVar);
                            this.f15867x = wVar2;
                            if (uVarG != null) {
                                uVarG.h(wVar2);
                                this.f15867x = uVarG.f();
                            }
                            this.f15864d |= 2;
                        } else if (iT != 32) {
                            if (!uVar.w(iT, mVarZ)) {
                            }
                        } else {
                            int iQ2 = uVar.q();
                            q qVarValueOf = q.valueOf(iQ2);
                            if (qVarValueOf == null) {
                                mVarZ.V(iT);
                                mVarZ.V(iQ2);
                            } else {
                                this.f15864d |= 4;
                                this.f15868y = qVarValueOf;
                            }
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
                if ((c4 & 2) == 2) {
                    this.f15866r = Collections.unmodifiableList(this.f15866r);
                }
                try {
                    mVarZ.x();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f15863a = dVar.h();
                    throw th3;
                }
                this.f15863a = dVar.h();
                throw th2;
            }
        }
        if ((c4 & 2) == 2) {
            this.f15866r = Collections.unmodifiableList(this.f15866r);
        }
        try {
            mVarZ.x();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f15863a = dVar.h();
            throw th4;
        }
        this.f15863a = dVar.h();
    }

    public r(o oVar) {
        this.B = (byte) -1;
        this.D = -1;
        this.f15863a = oVar.f21763a;
    }
}
