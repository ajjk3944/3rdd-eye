package androidx.datastore.preferences.protobuf;

import android.view.View;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.ads.ao1;
import com.google.android.gms.internal.ads.bn1;
import com.google.android.gms.internal.ads.bq0;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fo1;
import com.google.android.gms.internal.ads.g5;
import com.google.android.gms.internal.ads.jn1;
import com.google.android.gms.internal.ads.lp1;
import com.google.android.gms.internal.ads.qn1;
import com.google.android.gms.internal.ads.rn1;
import com.google.android.gms.internal.ads.ro1;
import com.google.android.gms.internal.ads.xn1;
import com.google.android.gms.internal.ads.xo1;
import com.google.android.gms.internal.ads.yn1;
import com.google.android.gms.internal.ads.zn1;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class k implements com.google.android.gms.internal.ads.i {

    /* renamed from: a, reason: collision with root package name */
    public int f1000a;

    /* renamed from: b, reason: collision with root package name */
    public int f1001b;

    /* renamed from: c, reason: collision with root package name */
    public int f1002c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1003d;

    public k(int i4) {
        switch (i4) {
            case 8:
                int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
                this.f1002c = iHighestOneBit - 1;
                this.f1003d = new int[iHighestOneBit];
                break;
            default:
                this.f1002c = 0;
                this.f1003d = new com.google.android.gms.internal.ads.h[100];
                break;
        }
    }

    public static final void d0(int i4) throws ao1 {
        if ((i4 & 3) != 0) {
            throw new ao1("Failed to parse the message.");
        }
    }

    public static final void e0(int i4) throws ao1 {
        if ((i4 & 7) != 0) {
            throw new ao1("Failed to parse the message.");
        }
    }

    public void A(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.w()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.w()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public void B(x xVar, boolean z3) throws z {
        String strX;
        int iZ;
        j jVar = (j) this.f1003d;
        if ((this.f1000a & 7) != 2) {
            throw a0.b();
        }
        do {
            if (z3) {
                F(2);
                strX = jVar.y();
            } else {
                F(2);
                strX = jVar.x();
            }
            ((v0) xVar).add(strX);
            if (jVar.c()) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == this.f1000a);
        this.f1002c = iZ;
    }

    public void C(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.A()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.A()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public void D(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.B()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.B()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public void E(int i4) throws a0 {
        if (((j) this.f1003d).b() != i4) {
            throw a0.e();
        }
    }

    public void F(int i4) throws z {
        if ((this.f1000a & 7) != i4) {
            throw a0.b();
        }
    }

    public void G(r9.a aVar, o9.f fVar) {
        ((v9.e) this.f1003d).f35983c.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = aVar.getLowestVisibleX();
        float highestVisibleX = aVar.getHighestVisibleX();
        o9.d dVarE = fVar.e(2, lowestVisibleX, Float.NaN);
        List list = fVar.j;
        o9.d dVarE2 = fVar.e(1, highestVisibleX, Float.NaN);
        this.f1000a = dVarE == null ? 0 : list.indexOf(dVarE);
        this.f1001b = dVarE2 != null ? list.indexOf(dVarE2) : 0;
        this.f1002c = (int) ((r7 - this.f1000a) * fMax);
    }

    public boolean H() {
        int i4;
        j jVar = (j) this.f1003d;
        if (jVar.c() || (i4 = this.f1000a) == this.f1001b) {
            return false;
        }
        return jVar.C(i4);
    }

    public void I(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof fo1) {
            fo1 fo1Var = (fo1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    fo1Var.d(en1Var.n());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                fo1Var.d(en1Var.n());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Long.valueOf(en1Var.n()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Long.valueOf(en1Var.n()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void J(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    rn1Var.f(en1Var.o());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                rn1Var.f(en1Var.o());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Integer.valueOf(en1Var.o()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.o()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void K(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof fo1) {
            fo1 fo1Var = (fo1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iV = en1Var.v();
                e0(iV);
                int iC = en1Var.c() + iV;
                do {
                    fo1Var.d(en1Var.p());
                } while (en1Var.c() < iC);
                return;
            }
            do {
                fo1Var.d(en1Var.p());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iV2 = en1Var.v();
                e0(iV2);
                int iC2 = en1Var.c() + iV2;
                do {
                    xn1Var.add(Long.valueOf(en1Var.p()));
                } while (en1Var.c() < iC2);
                return;
            }
            do {
                xn1Var.add(Long.valueOf(en1Var.p()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void L(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 == 2) {
                int iV = en1Var.v();
                d0(iV);
                int iC = en1Var.c() + iV;
                do {
                    rn1Var.f(en1Var.q());
                } while (en1Var.c() < iC);
                return;
            }
            if (i4 != 5) {
                throw new zn1();
            }
            do {
                rn1Var.f(en1Var.q());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 == 2) {
                int iV2 = en1Var.v();
                d0(iV2);
                int iC2 = en1Var.c() + iV2;
                do {
                    xn1Var.add(Integer.valueOf(en1Var.q()));
                } while (en1Var.c() < iC2);
                return;
            }
            if (i10 != 5) {
                throw new zn1();
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.q()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void M(xn1 xn1Var) throws ao1 {
        int iH;
        en1 en1Var = (en1) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                xn1Var.add(Boolean.valueOf(en1Var.r()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            this.f1002c = iH;
            return;
        }
        if (i4 != 2) {
            throw new zn1();
        }
        int iC = en1Var.c() + en1Var.v();
        do {
            xn1Var.add(Boolean.valueOf(en1Var.r()));
        } while (en1Var.c() < iC);
        c0(iC);
    }

    public void N(xn1 xn1Var, boolean z3) throws zn1 {
        String strS;
        int iH;
        en1 en1Var = (en1) this.f1003d;
        if ((this.f1000a & 7) != 2) {
            throw new zn1();
        }
        do {
            if (z3) {
                Y(2);
                strS = en1Var.t();
            } else {
                Y(2);
                strS = en1Var.s();
            }
            xn1Var.add(strS);
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1000a);
        this.f1002c = iH;
    }

    public void O(xn1 xn1Var, xo1 xo1Var, jn1 jn1Var) throws ao1 {
        int iH;
        int i4 = this.f1000a;
        if ((i4 & 7) != 2) {
            throw new zn1();
        }
        do {
            qn1 qn1VarB = xo1Var.b();
            Z(qn1VarB, xo1Var, jn1Var);
            xo1Var.a(qn1VarB);
            xn1Var.add(qn1VarB);
            en1 en1Var = (en1) this.f1003d;
            if (en1Var.b() || this.f1002c != 0) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == i4);
        this.f1002c = iH;
    }

    public void P(xn1 xn1Var, xo1 xo1Var, jn1 jn1Var) throws zn1 {
        int iH;
        int i4 = this.f1000a;
        if ((i4 & 7) != 3) {
            throw new zn1();
        }
        do {
            qn1 qn1VarB = xo1Var.b();
            a0(qn1VarB, xo1Var, jn1Var);
            xo1Var.a(qn1VarB);
            xn1Var.add(qn1VarB);
            en1 en1Var = (en1) this.f1003d;
            if (en1Var.b() || this.f1002c != 0) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == i4);
        this.f1002c = iH;
    }

    public void Q(xn1 xn1Var) throws zn1 {
        int iH;
        if ((this.f1000a & 7) != 2) {
            throw new zn1();
        }
        do {
            xn1Var.add(h0());
            en1 en1Var = (en1) this.f1003d;
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1000a);
        this.f1002c = iH;
    }

    public void R(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    rn1Var.f(en1Var.v());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                rn1Var.f(en1Var.v());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Integer.valueOf(en1Var.v()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.v()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void S(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    rn1Var.f(en1Var.w());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                rn1Var.f(en1Var.w());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Integer.valueOf(en1Var.w()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.w()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void T(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 == 2) {
                int iV = en1Var.v();
                d0(iV);
                int iC = en1Var.c() + iV;
                do {
                    rn1Var.f(en1Var.x());
                } while (en1Var.c() < iC);
                return;
            }
            if (i4 != 5) {
                throw new zn1();
            }
            do {
                rn1Var.f(en1Var.x());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 == 2) {
                int iV2 = en1Var.v();
                d0(iV2);
                int iC2 = en1Var.c() + iV2;
                do {
                    xn1Var.add(Integer.valueOf(en1Var.x()));
                } while (en1Var.c() < iC2);
                return;
            }
            if (i10 != 5) {
                throw new zn1();
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.x()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void U(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof fo1) {
            fo1 fo1Var = (fo1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iV = en1Var.v();
                e0(iV);
                int iC = en1Var.c() + iV;
                do {
                    fo1Var.d(en1Var.y());
                } while (en1Var.c() < iC);
                return;
            }
            do {
                fo1Var.d(en1Var.y());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iV2 = en1Var.v();
                e0(iV2);
                int iC2 = en1Var.c() + iV2;
                do {
                    xn1Var.add(Long.valueOf(en1Var.y()));
                } while (en1Var.c() < iC2);
                return;
            }
            do {
                xn1Var.add(Long.valueOf(en1Var.y()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void V(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof rn1) {
            rn1 rn1Var = (rn1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    rn1Var.f(en1Var.z());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                rn1Var.f(en1Var.z());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Integer.valueOf(en1Var.z()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Integer.valueOf(en1Var.z()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void W(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof fo1) {
            fo1 fo1Var = (fo1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    fo1Var.d(en1Var.A());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                fo1Var.d(en1Var.A());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Long.valueOf(en1Var.A()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Long.valueOf(en1Var.A()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
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
    public void X(com.google.android.gms.internal.ads.ho1 r12, com.google.android.gms.internal.ads.av0 r13, com.google.android.gms.internal.ads.jn1 r14) {
        /*
            r11 = this;
            r0 = 2
            r11.Y(r0)
            java.lang.Object r1 = r11.f1003d
            com.google.android.gms.internal.ads.en1 r1 = (com.google.android.gms.internal.ads.en1) r1
            int r2 = r1.v()
            int r2 = r1.B(r2)
            java.lang.Object r3 = r13.f9424d
            java.lang.String r4 = ""
            r5 = r3
        L15:
            int r6 = r11.f0()     // Catch: java.lang.Throwable -> L49
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L7e
            boolean r7 = r1.b()     // Catch: java.lang.Throwable -> L49
            if (r7 == 0) goto L25
            goto L7e
        L25:
            r7 = 1
            r8 = 0
            java.lang.String r9 = "Unable to parse map entry."
            if (r6 == r7) goto L5a
            if (r6 == r0) goto L4d
            boolean r6 = r1.b()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            if (r6 != 0) goto L3f
            int r6 = r11.f1000a     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            int r7 = r11.f1001b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            if (r6 != r7) goto L3a
            goto L3f
        L3a:
            boolean r6 = r1.j(r6)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            goto L40
        L3f:
            r6 = r8
        L40:
            if (r6 == 0) goto L43
            goto L15
        L43:
            com.google.android.gms.internal.ads.ao1 r6 = new com.google.android.gms.internal.ads.ao1     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            r6.<init>(r9)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            throw r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
        L49:
            r12 = move-exception
            goto L85
        L4b:
            r6 = move-exception
            goto L64
        L4d:
            java.lang.Object r6 = r13.f9423c     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            com.google.android.gms.internal.ads.lp1 r6 = (com.google.android.gms.internal.ads.lp1) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            java.lang.Class r7 = r3.getClass()     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            java.lang.Object r5 = r11.b0(r6, r7, r14)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            goto L15
        L5a:
            java.lang.Object r6 = r13.f9422b     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            com.google.android.gms.internal.ads.lp1 r6 = (com.google.android.gms.internal.ads.lp1) r6     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            r7 = 0
            java.lang.Object r4 = r11.b0(r6, r7, r7)     // Catch: java.lang.Throwable -> L49 com.google.android.gms.internal.ads.zn1 -> L4b
            goto L15
        L64:
            boolean r7 = r1.b()     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L75
            int r7 = r11.f1000a     // Catch: java.lang.Throwable -> L49
            int r10 = r11.f1001b     // Catch: java.lang.Throwable -> L49
            if (r7 != r10) goto L71
            goto L75
        L71:
            boolean r8 = r1.j(r7)     // Catch: java.lang.Throwable -> L49
        L75:
            if (r8 == 0) goto L78
            goto L15
        L78:
            com.google.android.gms.internal.ads.ao1 r12 = new com.google.android.gms.internal.ads.ao1     // Catch: java.lang.Throwable -> L49
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.k.X(com.google.android.gms.internal.ads.ho1, com.google.android.gms.internal.ads.av0, com.google.android.gms.internal.ads.jn1):void");
    }

    public void Y(int i4) {
        if ((this.f1000a & 7) != i4) {
            throw new zn1();
        }
    }

    public void Z(Object obj, xo1 xo1Var, jn1 jn1Var) throws ao1 {
        en1 en1Var = (en1) this.f1003d;
        int iV = en1Var.v();
        if (en1Var.f10836a + en1Var.f10837b >= 100) {
            throw new ao1("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iB = en1Var.B(iV);
        en1Var.f10836a++;
        xo1Var.d(obj, this, jn1Var);
        en1Var.i(0);
        en1Var.f10836a--;
        en1Var.a(iB);
    }

    public void a(int i4) {
        int[] iArr = (int[]) this.f1003d;
        int i10 = this.f1001b;
        iArr[i10] = i4;
        int i11 = this.f1002c & (i10 + 1);
        this.f1001b = i11;
        int i12 = this.f1000a;
        if (i11 == i12) {
            int length = iArr.length;
            int i13 = length - i12;
            int i14 = length << 1;
            if (i14 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i14];
            zj.m.M(0, i12, length, iArr, iArr2);
            zj.m.M(i13, 0, this.f1000a, (int[]) this.f1003d, iArr2);
            this.f1003d = iArr2;
            this.f1000a = 0;
            this.f1001b = length;
            this.f1002c = i14 - 1;
        }
    }

    public void a0(Object obj, xo1 xo1Var, jn1 jn1Var) {
        int i4 = this.f1001b;
        this.f1001b = ((this.f1000a >>> 3) << 3) | 4;
        try {
            xo1Var.d(obj, this, jn1Var);
            if (this.f1000a == this.f1001b) {
            } else {
                throw new ao1("Failed to parse the message.");
            }
        } finally {
            this.f1001b = i4;
        }
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized com.google.android.gms.internal.ads.h b() {
        com.google.android.gms.internal.ads.h hVar;
        try {
            int i4 = this.f1001b + 1;
            this.f1001b = i4;
            int i10 = this.f1002c;
            if (i10 > 0) {
                com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1003d;
                int i11 = i10 - 1;
                this.f1002c = i11;
                hVar = hVarArr[i11];
                if (hVar == null) {
                    throw null;
                }
                hVarArr[i11] = null;
            } else {
                hVar = new com.google.android.gms.internal.ads.h(new byte[65536]);
                com.google.android.gms.internal.ads.h[] hVarArr2 = (com.google.android.gms.internal.ads.h[]) this.f1003d;
                int length = hVarArr2.length;
                if (i4 > length) {
                    this.f1003d = (com.google.android.gms.internal.ads.h[]) Arrays.copyOf(hVarArr2, length + length);
                    return hVar;
                }
            }
            return hVar;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public Object b0(lp1 lp1Var, Class cls, jn1 jn1Var) throws ao1 {
        en1 en1Var = (en1) this.f1003d;
        lp1 lp1Var2 = lp1.f13574c;
        switch (lp1Var.ordinal()) {
            case 0:
                Y(1);
                return Double.valueOf(en1Var.k());
            case 1:
                Y(5);
                return Float.valueOf(en1Var.l());
            case 2:
                Y(0);
                return Long.valueOf(en1Var.n());
            case 3:
                Y(0);
                return Long.valueOf(en1Var.m());
            case 4:
                Y(0);
                return Integer.valueOf(en1Var.o());
            case 5:
                Y(1);
                return Long.valueOf(en1Var.p());
            case 6:
                Y(5);
                return Integer.valueOf(en1Var.q());
            case 7:
                Y(0);
                return Boolean.valueOf(en1Var.r());
            case 8:
                Y(2);
                return en1Var.t();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                Y(2);
                xo1 xo1VarA = ro1.f15723c.a(cls);
                qn1 qn1VarB = xo1VarA.b();
                Z(qn1VarB, xo1VarA, jn1Var);
                xo1VarA.a(qn1VarB);
                return qn1VarB;
            case 11:
                return h0();
            case 12:
                Y(0);
                return Integer.valueOf(en1Var.v());
            case 13:
                Y(0);
                return Integer.valueOf(en1Var.w());
            case 14:
                Y(5);
                return Integer.valueOf(en1Var.x());
            case 15:
                Y(1);
                return Long.valueOf(en1Var.y());
            case 16:
                Y(0);
                return Integer.valueOf(en1Var.z());
            case 17:
                Y(0);
                return Long.valueOf(en1Var.A());
        }
    }

    public void c(v5.f fVar) {
        Object[] objArr = (Object[]) this.f1003d;
        int i4 = this.f1001b;
        objArr[i4] = fVar;
        int i10 = this.f1002c & (i4 + 1);
        this.f1001b = i10;
        int i11 = this.f1000a;
        if (i10 == i11) {
            int length = objArr.length;
            int i12 = length - i11;
            int i13 = length << 1;
            if (i13 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            Object[] objArr2 = new Object[i13];
            zj.m.N(0, i11, length, objArr, objArr2);
            zj.m.N(i12, 0, this.f1000a, (Object[]) this.f1003d, objArr2);
            this.f1003d = objArr2;
            this.f1000a = 0;
            this.f1001b = length;
            this.f1002c = i13 - 1;
        }
    }

    public void c0(int i4) throws ao1 {
        if (((en1) this.f1003d).c() != i4) {
            throw new ao1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void d() {
        View view = (View) this.f1003d;
        int top = this.f1002c - (view.getTop() - this.f1000a);
        WeakHashMap weakHashMap = e4.v0.f22405a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1001b));
    }

    public int e() {
        int i4 = this.f1002c;
        if (i4 != 0) {
            this.f1000a = i4;
            this.f1002c = 0;
        } else {
            this.f1000a = ((j) this.f1003d).z();
        }
        int i10 = this.f1000a;
        if (i10 == 0 || i10 == this.f1001b) {
            return Integer.MAX_VALUE;
        }
        return i10 >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void f() {
        int i4 = this.f1000a;
        String str = bq0.f9768a;
        int iMax = Math.max(0, ((i4 + Settings.DEFAULT_INITIAL_WINDOW_SIZE) / 65536) - this.f1001b);
        int i10 = this.f1002c;
        if (iMax >= i10) {
            return;
        }
        Arrays.fill((com.google.android.gms.internal.ads.h[]) this.f1003d, iMax, i10, (Object) null);
        this.f1002c = iMax;
    }

    public int f0() {
        int iH = this.f1002c;
        if (iH != 0) {
            this.f1000a = iH;
            this.f1002c = 0;
        } else {
            iH = ((en1) this.f1003d).h();
            this.f1000a = iH;
        }
        if (iH == 0 || iH == this.f1001b) {
            return Integer.MAX_VALUE;
        }
        return iH >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void g(com.google.android.gms.internal.ads.h hVar) {
        com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1003d;
        int i4 = this.f1002c;
        this.f1002c = i4 + 1;
        hVarArr[i4] = hVar;
        this.f1001b--;
        notifyAll();
    }

    public synchronized void g0(int i4) {
        int i10 = this.f1000a;
        this.f1000a = i4;
        if (i4 < i10) {
            f();
        }
    }

    @Override // com.google.android.gms.internal.ads.i
    public synchronized void h(g5 g5Var) {
        while (g5Var != null) {
            try {
                com.google.android.gms.internal.ads.h[] hVarArr = (com.google.android.gms.internal.ads.h[]) this.f1003d;
                int i4 = this.f1002c;
                this.f1002c = i4 + 1;
                com.google.android.gms.internal.ads.h hVar = (com.google.android.gms.internal.ads.h) g5Var.f11375c;
                hVar.getClass();
                hVarArr[i4] = hVar;
                this.f1001b--;
                g5Var = (g5) g5Var.f11376d;
                if (g5Var == null || ((com.google.android.gms.internal.ads.h) g5Var.f11375c) == null) {
                    g5Var = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public bn1 h0() {
        Y(2);
        return ((en1) this.f1003d).u();
    }

    public int i(int i4) {
        return ((v0.l0) this.f1003d).g[this.f1001b + i4];
    }

    public void i0(xn1 xn1Var) throws ao1 {
        int iH;
        en1 en1Var = (en1) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 1) {
            do {
                xn1Var.add(Double.valueOf(en1Var.k()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            this.f1002c = iH;
            return;
        }
        if (i4 != 2) {
            throw new zn1();
        }
        int iV = en1Var.v();
        e0(iV);
        int iC = en1Var.c() + iV;
        do {
            xn1Var.add(Double.valueOf(en1Var.k()));
        } while (en1Var.c() < iC);
    }

    public Object j(int i4) {
        return ((v0.l0) this.f1003d).f35589i[this.f1002c + i4];
    }

    public void j0(xn1 xn1Var) throws ao1 {
        int iH;
        en1 en1Var = (en1) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 2) {
            int iV = en1Var.v();
            d0(iV);
            int iC = en1Var.c() + iV;
            do {
                xn1Var.add(Float.valueOf(en1Var.l()));
            } while (en1Var.c() < iC);
            return;
        }
        if (i4 != 5) {
            throw new zn1();
        }
        do {
            xn1Var.add(Float.valueOf(en1Var.l()));
            if (en1Var.b()) {
                return;
            } else {
                iH = en1Var.h();
            }
        } while (iH == this.f1000a);
        this.f1002c = iH;
    }

    public void k(Object obj, x0 x0Var, o oVar) {
        int i4 = this.f1001b;
        this.f1001b = ((this.f1000a >>> 3) << 3) | 4;
        try {
            x0Var.h(obj, this, oVar);
            if (this.f1000a == this.f1001b) {
            } else {
                throw new a0("Failed to parse the message.");
            }
        } finally {
            this.f1001b = i4;
        }
    }

    public void k0(xn1 xn1Var) throws ao1 {
        int iH;
        int iH2;
        en1 en1Var = (en1) this.f1003d;
        if (xn1Var instanceof fo1) {
            fo1 fo1Var = (fo1) xn1Var;
            int i4 = this.f1000a & 7;
            if (i4 != 0) {
                if (i4 != 2) {
                    throw new zn1();
                }
                int iC = en1Var.c() + en1Var.v();
                do {
                    fo1Var.d(en1Var.m());
                } while (en1Var.c() < iC);
                c0(iC);
                return;
            }
            do {
                fo1Var.d(en1Var.m());
                if (en1Var.b()) {
                    return;
                } else {
                    iH2 = en1Var.h();
                }
            } while (iH2 == this.f1000a);
        } else {
            int i10 = this.f1000a & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new zn1();
                }
                int iC2 = en1Var.c() + en1Var.v();
                do {
                    xn1Var.add(Long.valueOf(en1Var.m()));
                } while (en1Var.c() < iC2);
                c0(iC2);
                return;
            }
            do {
                xn1Var.add(Long.valueOf(en1Var.m()));
                if (en1Var.b()) {
                    return;
                } else {
                    iH = en1Var.h();
                }
            } while (iH == this.f1000a);
            iH2 = iH;
        }
        this.f1002c = iH2;
    }

    public void l(Object obj, x0 x0Var, o oVar) throws a0 {
        j jVar = (j) this.f1003d;
        int iA = jVar.A();
        if (jVar.f995a >= 100) {
            throw new a0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i4 = jVar.i(iA);
        jVar.f995a++;
        x0Var.h(obj, this, oVar);
        jVar.a(0);
        jVar.f995a--;
        jVar.h(i4);
    }

    public void m(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Boolean.valueOf(jVar.k()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Boolean.valueOf(jVar.k()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public g n() throws z {
        F(2);
        return ((j) this.f1003d).l();
    }

    public void o(x xVar) throws z {
        int iZ;
        j jVar = (j) this.f1003d;
        if ((this.f1000a & 7) != 2) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(n());
            if (jVar.c()) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == this.f1000a);
        this.f1002c = iZ;
    }

    public void p(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 1) {
            do {
                ((v0) xVar).add(Double.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iA = jVar.A();
        if ((iA & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iB = jVar.b() + iA;
        do {
            ((v0) xVar).add(Double.valueOf(jVar.m()));
        } while (jVar.b() < iB);
    }

    public void q(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.n()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.n()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public Object r(s1 s1Var, Class cls, o oVar) throws a0 {
        j jVar = (j) this.f1003d;
        switch (s1Var.ordinal()) {
            case 0:
                F(1);
                return Double.valueOf(jVar.m());
            case 1:
                F(5);
                return Float.valueOf(jVar.q());
            case 2:
                F(0);
                return Long.valueOf(jVar.s());
            case 3:
                F(0);
                return Long.valueOf(jVar.B());
            case 4:
                F(0);
                return Integer.valueOf(jVar.r());
            case 5:
                F(1);
                return Long.valueOf(jVar.p());
            case 6:
                F(5);
                return Integer.valueOf(jVar.o());
            case 7:
                F(0);
                return Boolean.valueOf(jVar.k());
            case 8:
                F(2);
                return jVar.y();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                F(2);
                x0 x0VarA = u0.f1071c.a(cls);
                w wVarI = x0VarA.i();
                l(wVarI, x0VarA, oVar);
                x0VarA.c(wVarI);
                return wVarI;
            case 11:
                return n();
            case 12:
                F(0);
                return Integer.valueOf(jVar.A());
            case 13:
                F(0);
                return Integer.valueOf(jVar.n());
            case 14:
                F(5);
                return Integer.valueOf(jVar.t());
            case 15:
                F(1);
                return Long.valueOf(jVar.u());
            case 16:
                F(0);
                return Integer.valueOf(jVar.v());
            case 17:
                F(0);
                return Long.valueOf(jVar.w());
        }
    }

    public void s(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 2) {
            int iA = jVar.A();
            if ((iA & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iB = jVar.b() + iA;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.o()));
            } while (jVar.b() < iB);
            return;
        }
        if (i4 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.o()));
            if (jVar.c()) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == this.f1000a);
        this.f1002c = iZ;
    }

    public void t(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.p()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iA = jVar.A();
        if ((iA & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iB = jVar.b() + iA;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.p()));
        } while (jVar.b() < iB);
    }

    public void u(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 2) {
            int iA = jVar.A();
            if ((iA & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iB = jVar.b() + iA;
            do {
                ((v0) xVar).add(Float.valueOf(jVar.q()));
            } while (jVar.b() < iB);
            return;
        }
        if (i4 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Float.valueOf(jVar.q()));
            if (jVar.c()) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == this.f1000a);
        this.f1002c = iZ;
    }

    public void v(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.r()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public void w(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.s()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Long.valueOf(jVar.s()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public void x(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 2) {
            int iA = jVar.A();
            if ((iA & 3) != 0) {
                throw new a0("Failed to parse the message.");
            }
            int iB = jVar.b() + iA;
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.t()));
            } while (jVar.b() < iB);
            return;
        }
        if (i4 != 5) {
            throw a0.b();
        }
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.t()));
            if (jVar.c()) {
                return;
            } else {
                iZ = jVar.z();
            }
        } while (iZ == this.f1000a);
        this.f1002c = iZ;
    }

    public void y(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 1) {
            do {
                ((v0) xVar).add(Long.valueOf(jVar.u()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iA = jVar.A();
        if ((iA & 7) != 0) {
            throw new a0("Failed to parse the message.");
        }
        int iB = jVar.b() + iA;
        do {
            ((v0) xVar).add(Long.valueOf(jVar.u()));
        } while (jVar.b() < iB);
    }

    public void z(x xVar) throws a0 {
        int iZ;
        j jVar = (j) this.f1003d;
        int i4 = this.f1000a & 7;
        if (i4 == 0) {
            do {
                ((v0) xVar).add(Integer.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                } else {
                    iZ = jVar.z();
                }
            } while (iZ == this.f1000a);
            this.f1002c = iZ;
            return;
        }
        if (i4 != 2) {
            throw a0.b();
        }
        int iB = jVar.b() + jVar.A();
        do {
            ((v0) xVar).add(Integer.valueOf(jVar.v()));
        } while (jVar.b() < iB);
        E(iB);
    }

    public /* synthetic */ k(Object obj) {
        this.f1003d = obj;
    }

    public k(en1 en1Var) {
        this.f1002c = 0;
        Charset charset = yn1.f18811a;
        if (en1Var == null) {
            throw new NullPointerException("input");
        }
        this.f1003d = en1Var;
        en1Var.f10838c = this;
    }

    public k(j jVar) {
        this.f1002c = 0;
        Charset charset = y.f1081a;
        this.f1003d = jVar;
        jVar.f996b = this;
    }
}
