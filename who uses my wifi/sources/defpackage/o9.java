package defpackage;

import android.view.View;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o9 {
    public int a;
    public int b;
    public int c;
    public Object d;

    public /* synthetic */ o9(Object obj) {
        this.d = obj;
    }

    public static final void y(int i) throws a64 {
        if ((i & 3) != 0) {
            throw new a64("Failed to parse the message.");
        }
    }

    public static final void z(int i) throws a64 {
        if ((i & 7) != 0) {
            throw new a64("Failed to parse the message.");
        }
    }

    public int A() {
        int iJ = this.c;
        if (iJ != 0) {
            this.a = iJ;
            this.c = 0;
        } else {
            iJ = ((m0) this.d).j();
            this.a = iJ;
        }
        if (iJ == 0 || iJ == this.b) {
            return Integer.MAX_VALUE;
        }
        return iJ >>> 3;
    }

    public a54 B() {
        t(2);
        return ((m0) this.d).w();
    }

    public void C(x54 x54Var) throws a64 {
        int iJ;
        m0 m0Var = (m0) this.d;
        int i = this.a & 7;
        if (i == 1) {
            do {
                x54Var.add(Double.valueOf(m0Var.m()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            this.c = iJ;
            return;
        }
        if (i != 2) {
            throw new z54();
        }
        int iX = m0Var.x();
        z(iX);
        int iE = m0Var.e() + iX;
        do {
            x54Var.add(Double.valueOf(m0Var.m()));
        } while (m0Var.e() < iE);
    }

    public void D(x54 x54Var) throws a64 {
        int iJ;
        m0 m0Var = (m0) this.d;
        int i = this.a & 7;
        if (i == 2) {
            int iX = m0Var.x();
            y(iX);
            int iE = m0Var.e() + iX;
            do {
                x54Var.add(Float.valueOf(m0Var.n()));
            } while (m0Var.e() < iE);
            return;
        }
        if (i != 5) {
            throw new z54();
        }
        do {
            x54Var.add(Float.valueOf(m0Var.n()));
            if (m0Var.c()) {
                return;
            } else {
                iJ = m0Var.j();
            }
        } while (iJ == this.a);
        this.c = iJ;
    }

    public void E(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof e64) {
            e64 e64Var = (e64) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    e64Var.c(m0Var.o());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                e64Var.c(m0Var.o());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Long.valueOf(m0Var.o()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Long.valueOf(m0Var.o()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void a() {
        View view = (View) this.d;
        int top = this.c - (view.getTop() - this.a);
        WeakHashMap weakHashMap = e61.a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.b));
    }

    public l60 b() {
        l60 l60Var = new l60();
        l60Var.B = 4;
        l60Var.G = 0.2f;
        l60Var.A = true;
        l60Var.J = true;
        l60Var.j = false;
        l60Var.z = k41.c(1.2f);
        l60Var.E = k41.c(2.2f);
        int i = this.c;
        l60Var.D = i;
        if (l60Var.C == null) {
            l60Var.C = new ArrayList();
        }
        l60Var.C.clear();
        l60Var.C.add(Integer.valueOf(i));
        l60Var.y = 100;
        l60Var.v = false;
        l60Var.e(this.a);
        l60Var.x = this.b;
        l60Var.f = new xn(0);
        return l60Var;
    }

    public void c(n9 n9Var, l60 l60Var) {
        ((i60) this.d).i.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = n9Var.getLowestVisibleX();
        float highestVisibleX = n9Var.getHighestVisibleX();
        xs xsVarC = l60Var.c(lowestVisibleX, Float.NaN, 2);
        ArrayList arrayList = l60Var.o;
        xs xsVarC2 = l60Var.c(highestVisibleX, Float.NaN, 1);
        this.a = xsVarC == null ? 0 : arrayList.indexOf(xsVarC);
        this.b = xsVarC2 != null ? arrayList.indexOf(xsVarC2) : 0;
        this.c = (int) ((r7 - this.a) * fMax);
    }

    public void d(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof e64) {
            e64 e64Var = (e64) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    e64Var.c(m0Var.p());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                e64Var.c(m0Var.p());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Long.valueOf(m0Var.p()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Long.valueOf(m0Var.p()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void e(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    q54Var.d(m0Var.q());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                q54Var.d(m0Var.q());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Integer.valueOf(m0Var.q()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.q()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void f(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof e64) {
            e64 e64Var = (e64) x54Var;
            int i = this.a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new z54();
                }
                int iX = m0Var.x();
                z(iX);
                int iE = m0Var.e() + iX;
                do {
                    e64Var.c(m0Var.r());
                } while (m0Var.e() < iE);
                return;
            }
            do {
                e64Var.c(m0Var.r());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iX2 = m0Var.x();
                z(iX2);
                int iE2 = m0Var.e() + iX2;
                do {
                    x54Var.add(Long.valueOf(m0Var.r()));
                } while (m0Var.e() < iE2);
                return;
            }
            do {
                x54Var.add(Long.valueOf(m0Var.r()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void g(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i == 2) {
                int iX = m0Var.x();
                y(iX);
                int iE = m0Var.e() + iX;
                do {
                    q54Var.d(m0Var.s());
                } while (m0Var.e() < iE);
                return;
            }
            if (i != 5) {
                throw new z54();
            }
            do {
                q54Var.d(m0Var.s());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 == 2) {
                int iX2 = m0Var.x();
                y(iX2);
                int iE2 = m0Var.e() + iX2;
                do {
                    x54Var.add(Integer.valueOf(m0Var.s()));
                } while (m0Var.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new z54();
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.s()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void h(x54 x54Var) throws a64 {
        int iJ;
        m0 m0Var = (m0) this.d;
        int i = this.a & 7;
        if (i == 0) {
            do {
                x54Var.add(Boolean.valueOf(m0Var.t()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            this.c = iJ;
            return;
        }
        if (i != 2) {
            throw new z54();
        }
        int iE = m0Var.e() + m0Var.x();
        do {
            x54Var.add(Boolean.valueOf(m0Var.t()));
        } while (m0Var.e() < iE);
        x(iE);
    }

    public void i(x54 x54Var, boolean z) throws z54 {
        String strU;
        int iJ;
        m0 m0Var = (m0) this.d;
        if ((this.a & 7) != 2) {
            throw new z54();
        }
        do {
            if (z) {
                t(2);
                strU = m0Var.v();
            } else {
                t(2);
                strU = m0Var.u();
            }
            x54Var.add(strU);
            if (m0Var.c()) {
                return;
            } else {
                iJ = m0Var.j();
            }
        } while (iJ == this.a);
        this.c = iJ;
    }

    public void j(x54 x54Var, v64 v64Var, h54 h54Var) throws a64 {
        int iJ;
        int i = this.a;
        if ((i & 7) != 2) {
            throw new z54();
        }
        do {
            p54 p54VarA = v64Var.a();
            u(p54VarA, v64Var, h54Var);
            v64Var.h(p54VarA);
            x54Var.add(p54VarA);
            m0 m0Var = (m0) this.d;
            if (m0Var.c() || this.c != 0) {
                return;
            } else {
                iJ = m0Var.j();
            }
        } while (iJ == i);
        this.c = iJ;
    }

    public void k(x54 x54Var, v64 v64Var, h54 h54Var) throws z54 {
        int iJ;
        int i = this.a;
        if ((i & 7) != 3) {
            throw new z54();
        }
        do {
            p54 p54VarA = v64Var.a();
            v(p54VarA, v64Var, h54Var);
            v64Var.h(p54VarA);
            x54Var.add(p54VarA);
            m0 m0Var = (m0) this.d;
            if (m0Var.c() || this.c != 0) {
                return;
            } else {
                iJ = m0Var.j();
            }
        } while (iJ == i);
        this.c = iJ;
    }

    public void l(x54 x54Var) throws z54 {
        int iJ;
        if ((this.a & 7) != 2) {
            throw new z54();
        }
        do {
            x54Var.add(B());
            m0 m0Var = (m0) this.d;
            if (m0Var.c()) {
                return;
            } else {
                iJ = m0Var.j();
            }
        } while (iJ == this.a);
        this.c = iJ;
    }

    public void m(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    q54Var.d(m0Var.x());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                q54Var.d(m0Var.x());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Integer.valueOf(m0Var.x()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.x()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void n(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    q54Var.d(m0Var.y());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                q54Var.d(m0Var.y());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Integer.valueOf(m0Var.y()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.y()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void o(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i == 2) {
                int iX = m0Var.x();
                y(iX);
                int iE = m0Var.e() + iX;
                do {
                    q54Var.d(m0Var.z());
                } while (m0Var.e() < iE);
                return;
            }
            if (i != 5) {
                throw new z54();
            }
            do {
                q54Var.d(m0Var.z());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 == 2) {
                int iX2 = m0Var.x();
                y(iX2);
                int iE2 = m0Var.e() + iX2;
                do {
                    x54Var.add(Integer.valueOf(m0Var.z()));
                } while (m0Var.e() < iE2);
                return;
            }
            if (i2 != 5) {
                throw new z54();
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.z()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void p(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof e64) {
            e64 e64Var = (e64) x54Var;
            int i = this.a & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new z54();
                }
                int iX = m0Var.x();
                z(iX);
                int iE = m0Var.e() + iX;
                do {
                    e64Var.c(m0Var.A());
                } while (m0Var.e() < iE);
                return;
            }
            do {
                e64Var.c(m0Var.A());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iX2 = m0Var.x();
                z(iX2);
                int iE2 = m0Var.e() + iX2;
                do {
                    x54Var.add(Long.valueOf(m0Var.A()));
                } while (m0Var.e() < iE2);
                return;
            }
            do {
                x54Var.add(Long.valueOf(m0Var.A()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void q(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof q54) {
            q54 q54Var = (q54) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    q54Var.d(m0Var.B());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                q54Var.d(m0Var.B());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Integer.valueOf(m0Var.B()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Integer.valueOf(m0Var.B()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    public void r(x54 x54Var) throws a64 {
        int iJ;
        int iJ2;
        m0 m0Var = (m0) this.d;
        if (x54Var instanceof e64) {
            e64 e64Var = (e64) x54Var;
            int i = this.a & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new z54();
                }
                int iE = m0Var.e() + m0Var.x();
                do {
                    e64Var.c(m0Var.C());
                } while (m0Var.e() < iE);
                x(iE);
                return;
            }
            do {
                e64Var.c(m0Var.C());
                if (m0Var.c()) {
                    return;
                } else {
                    iJ2 = m0Var.j();
                }
            } while (iJ2 == this.a);
        } else {
            int i2 = this.a & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new z54();
                }
                int iE2 = m0Var.e() + m0Var.x();
                do {
                    x54Var.add(Long.valueOf(m0Var.C()));
                } while (m0Var.e() < iE2);
                x(iE2);
                return;
            }
            do {
                x54Var.add(Long.valueOf(m0Var.C()));
                if (m0Var.c()) {
                    return;
                } else {
                    iJ = m0Var.j();
                }
            } while (iJ == this.a);
            iJ2 = iJ;
        }
        this.c = iJ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007e, code lost:
    
        r12.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r1.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(defpackage.g64 r12, defpackage.jr3 r13, defpackage.h54 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.t(r0)
            java.lang.Object r1 = r11.d
            m0 r1 = (defpackage.m0) r1
            int r2 = r1.x()
            int r2 = r1.D(r2)
            java.lang.Object r3 = r13.i
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.A()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.c()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.c()     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.a     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            int r7 = r11.b     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.l(r6)     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            a64 r6 = new a64     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.h     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            j74 r6 = (defpackage.j74) r6     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            java.lang.Object r5 = r11.w(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.g     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            j74 r6 = (defpackage.j74) r6     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            r7 = 0
            java.lang.Object r4 = r11.w(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 defpackage.z54 -> L4b
            goto L15
        L64:
            boolean r7 = r1.c()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.a     // Catch: java.lang.Throwable -> L49
            int r10 = r11.b     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.l(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            a64 r12 = new a64     // Catch: java.lang.Throwable -> L49
            r12.<init>(r9, r6)     // Catch: java.lang.Throwable -> L49
            throw r12     // Catch: java.lang.Throwable -> L49
        L7e:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> L49
            r1.a(r2)
            return
        L85:
            r1.a(r2)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o9.s(g64, jr3, h54):void");
    }

    public void t(int i) {
        if ((this.a & 7) != i) {
            throw new z54();
        }
    }

    public void u(Object obj, v64 v64Var, h54 h54Var) throws a64 {
        m0 m0Var = (m0) this.d;
        int iX = m0Var.x();
        if (m0Var.f + m0Var.g >= 100) {
            throw new a64("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iD = m0Var.D(iX);
        m0Var.f++;
        v64Var.c(obj, this, h54Var);
        m0Var.k(0);
        m0Var.f--;
        m0Var.a(iD);
    }

    public void v(Object obj, v64 v64Var, h54 h54Var) {
        int i = this.b;
        this.b = ((this.a >>> 3) << 3) | 4;
        try {
            v64Var.c(obj, this, h54Var);
            if (this.a == this.b) {
            } else {
                throw new a64("Failed to parse the message.");
            }
        } finally {
            this.b = i;
        }
    }

    public Object w(j74 j74Var, Class cls, h54 h54Var) throws a64 {
        m0 m0Var = (m0) this.d;
        j74 j74Var2 = j74.h;
        switch (j74Var.ordinal()) {
            case 0:
                t(1);
                return Double.valueOf(m0Var.m());
            case 1:
                t(5);
                return Float.valueOf(m0Var.n());
            case 2:
                t(0);
                return Long.valueOf(m0Var.p());
            case 3:
                t(0);
                return Long.valueOf(m0Var.o());
            case 4:
                t(0);
                return Integer.valueOf(m0Var.q());
            case 5:
                t(1);
                return Long.valueOf(m0Var.r());
            case 6:
                t(5);
                return Integer.valueOf(m0Var.s());
            case 7:
                t(0);
                return Boolean.valueOf(m0Var.t());
            case 8:
                t(2);
                return m0Var.v();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                t(2);
                v64 v64VarA = p64.c.a(cls);
                p54 p54VarA = v64VarA.a();
                u(p54VarA, v64VarA, h54Var);
                v64VarA.h(p54VarA);
                return p54VarA;
            case 11:
                return B();
            case 12:
                t(0);
                return Integer.valueOf(m0Var.x());
            case 13:
                t(0);
                return Integer.valueOf(m0Var.y());
            case 14:
                t(5);
                return Integer.valueOf(m0Var.z());
            case 15:
                t(1);
                return Long.valueOf(m0Var.A());
            case 16:
                t(0);
                return Integer.valueOf(m0Var.B());
            case 17:
                t(0);
                return Long.valueOf(m0Var.C());
        }
    }

    public void x(int i) throws a64 {
        if (((m0) this.d).e() != i) {
            throw new a64("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public o9(m0 m0Var) {
        this.c = 0;
        Charset charset = y54.a;
        if (m0Var == null) {
            throw new NullPointerException("input");
        }
        this.d = m0Var;
        m0Var.h = this;
    }
}
