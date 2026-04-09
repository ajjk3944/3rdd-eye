package androidx.datastore.preferences.protobuf;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public int f1311a;

    /* renamed from: b, reason: collision with root package name */
    public int f1312b;

    /* renamed from: c, reason: collision with root package name */
    public int f1313c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1314d;

    public /* synthetic */ l(Object obj) {
        this.f1314d = obj;
    }

    public void A(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Long.valueOf(jVar.A()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Long.valueOf(jVar.A()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public void B(int i10) throws e0 {
        if (((j) this.f1314d).b() != i10) {
            throw e0.e();
        }
    }

    public void C(int i10) throws d0 {
        if ((this.f1311a & 7) != i10) {
            throw e0.b();
        }
    }

    public boolean D() {
        int i10;
        j jVar = (j) this.f1314d;
        if (jVar.c() || (i10 = this.f1311a) == this.f1312b) {
            return false;
        }
        return jVar.B(i10);
    }

    public void a(nk.f0 f0Var) {
        f0Var.f18378g = null;
        f0Var.f18376a = null;
        f0Var.f18377d = null;
        f0Var.E = 1;
        int i10 = this.f1311a;
        if (i10 > 0) {
            int i11 = this.f1313c;
            if ((i11 & 1) == 0) {
                this.f1313c = i11 + 1;
                this.f1311a = i10 - 1;
                this.f1312b++;
            }
        }
        f0Var.f18376a = (nk.f0) this.f1314d;
        this.f1314d = f0Var;
        int i12 = this.f1313c;
        int i13 = i12 + 1;
        this.f1313c = i13;
        int i14 = this.f1311a;
        if (i14 > 0 && (i13 & 1) == 0) {
            this.f1313c = i12 + 2;
            this.f1311a = i14 - 1;
            this.f1312b++;
        }
        int i15 = 4;
        while (true) {
            int i16 = i15 - 1;
            if ((this.f1313c & i16) != i16) {
                return;
            }
            int i17 = this.f1312b;
            if (i17 == 0) {
                nk.f0 f0Var2 = (nk.f0) this.f1314d;
                nk.f0 f0Var3 = f0Var2.f18376a;
                nk.f0 f0Var4 = f0Var3.f18376a;
                f0Var3.f18376a = f0Var4.f18376a;
                this.f1314d = f0Var3;
                f0Var3.f18377d = f0Var4;
                f0Var3.f18378g = f0Var2;
                f0Var3.E = f0Var2.E + 1;
                f0Var4.f18376a = f0Var3;
                f0Var2.f18376a = f0Var3;
            } else if (i17 == 1) {
                nk.f0 f0Var5 = (nk.f0) this.f1314d;
                nk.f0 f0Var6 = f0Var5.f18376a;
                this.f1314d = f0Var6;
                f0Var6.f18378g = f0Var5;
                f0Var6.E = f0Var5.E + 1;
                f0Var5.f18376a = f0Var6;
                this.f1312b = 0;
            } else if (i17 == 2) {
                this.f1312b = 0;
            }
            i15 *= 2;
        }
    }

    public void b(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i12 = this.f1313c;
        int i13 = i12 * 2;
        int[] iArr = (int[]) this.f1314d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1314d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i13 >= iArr.length) {
            int[] iArr3 = new int[i12 * 4];
            this.f1314d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f1314d;
        iArr4[i13] = i10;
        iArr4[i13 + 1] = i11;
        this.f1313c++;
    }

    public void c() {
        View view = (View) this.f1314d;
        int top = this.f1313c - (view.getTop() - this.f1311a);
        WeakHashMap weakHashMap = u3.i0.f23177a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1312b));
    }

    public void d(RecyclerView recyclerView, boolean z10) {
        this.f1313c = 0;
        int[] iArr = (int[]) this.f1314d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        h7.y0 y0Var = recyclerView.J;
        if (recyclerView.I == null || y0Var == null || !y0Var.f10281i) {
            return;
        }
        if (z10) {
            if (!recyclerView.f2083x.j()) {
                y0Var.i(recyclerView.I.b(), this);
            }
        } else if (!recyclerView.P()) {
            y0Var.h(this.f1311a, this.f1312b, recyclerView.D0, this);
        }
        int i10 = this.f1313c;
        if (i10 > y0Var.j) {
            y0Var.j = i10;
            y0Var.k = z10;
            recyclerView.f2064g.n();
        }
    }

    public int e() {
        int i10 = this.f1313c;
        if (i10 != 0) {
            this.f1311a = i10;
            this.f1313c = 0;
        } else {
            this.f1311a = ((j) this.f1314d).y();
        }
        int i11 = this.f1311a;
        if (i11 == 0 || i11 == this.f1312b) {
            return Integer.MAX_VALUE;
        }
        return i11 >>> 3;
    }

    public int f(int i10) {
        return ((o0.h0) this.f1314d).f18708c[this.f1312b + i10];
    }

    public Object g(int i10) {
        return ((o0.h0) this.f1314d).f18710e[this.f1313c + i10];
    }

    public void h(Object obj, d1 d1Var, p pVar) {
        int i10 = this.f1312b;
        this.f1312b = ((this.f1311a >>> 3) << 3) | 4;
        try {
            d1Var.h(obj, this, pVar);
            if (this.f1311a == this.f1312b) {
            } else {
                throw new e0("Failed to parse the message.");
            }
        } finally {
            this.f1312b = i10;
        }
    }

    public void i(Object obj, d1 d1Var, p pVar) throws e0 {
        j jVar = (j) this.f1314d;
        int iZ = jVar.z();
        if (jVar.f1300a >= 100) {
            throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i10 = jVar.i(iZ);
        jVar.f1300a++;
        d1Var.h(obj, this, pVar);
        jVar.a(0);
        jVar.f1300a--;
        jVar.h(i10);
    }

    public void j(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Boolean.valueOf(jVar.j()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Boolean.valueOf(jVar.j()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public g k() throws d0 {
        C(2);
        return ((j) this.f1314d).k();
    }

    public void l(b0 b0Var) throws d0 {
        int iY;
        j jVar = (j) this.f1314d;
        if ((this.f1311a & 7) != 2) {
            throw e0.b();
        }
        do {
            ((b1) b0Var).add(k());
            if (jVar.c()) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == this.f1311a);
        this.f1313c = iY;
    }

    public void m(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 1) {
            do {
                ((b1) b0Var).add(Double.valueOf(jVar.l()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iZ = jVar.z();
        if ((iZ & 7) != 0) {
            throw new e0("Failed to parse the message.");
        }
        int iB = jVar.b() + iZ;
        do {
            ((b1) b0Var).add(Double.valueOf(jVar.l()));
        } while (jVar.b() < iB);
    }

    public void n(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.m()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.m()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public Object o(v1 v1Var, Class cls, p pVar) throws e0 {
        j jVar = (j) this.f1314d;
        switch (k.f1303a[v1Var.ordinal()]) {
            case 1:
                C(0);
                return Boolean.valueOf(jVar.j());
            case 2:
                return k();
            case 3:
                C(1);
                return Double.valueOf(jVar.l());
            case 4:
                C(0);
                return Integer.valueOf(jVar.m());
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                C(5);
                return Integer.valueOf(jVar.n());
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                C(1);
                return Long.valueOf(jVar.o());
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                C(5);
                return Float.valueOf(jVar.p());
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                C(0);
                return Integer.valueOf(jVar.q());
            case 9:
                C(0);
                return Long.valueOf(jVar.r());
            case 10:
                C(2);
                d1 d1VarA = a1.f1244c.a(cls);
                a0 a0VarI = d1VarA.i();
                i(a0VarI, d1VarA, pVar);
                d1VarA.c(a0VarI);
                return a0VarI;
            case 11:
                C(5);
                return Integer.valueOf(jVar.s());
            case 12:
                C(1);
                return Long.valueOf(jVar.t());
            case 13:
                C(0);
                return Integer.valueOf(jVar.u());
            case 14:
                C(0);
                return Long.valueOf(jVar.v());
            case 15:
                C(2);
                return jVar.x();
            case 16:
                C(0);
                return Integer.valueOf(jVar.z());
            case 17:
                C(0);
                return Long.valueOf(jVar.A());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public void p(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 2) {
            int iZ = jVar.z();
            if ((iZ & 3) != 0) {
                throw new e0("Failed to parse the message.");
            }
            int iB = jVar.b() + iZ;
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.n()));
            } while (jVar.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw e0.b();
        }
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.n()));
            if (jVar.c()) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == this.f1311a);
        this.f1313c = iY;
    }

    public void q(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 1) {
            do {
                ((b1) b0Var).add(Long.valueOf(jVar.o()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iZ = jVar.z();
        if ((iZ & 7) != 0) {
            throw new e0("Failed to parse the message.");
        }
        int iB = jVar.b() + iZ;
        do {
            ((b1) b0Var).add(Long.valueOf(jVar.o()));
        } while (jVar.b() < iB);
    }

    public void r(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 2) {
            int iZ = jVar.z();
            if ((iZ & 3) != 0) {
                throw new e0("Failed to parse the message.");
            }
            int iB = jVar.b() + iZ;
            do {
                ((b1) b0Var).add(Float.valueOf(jVar.p()));
            } while (jVar.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw e0.b();
        }
        do {
            ((b1) b0Var).add(Float.valueOf(jVar.p()));
            if (jVar.c()) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == this.f1311a);
        this.f1313c = iY;
    }

    public void s(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.q()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.q()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public void t(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Long.valueOf(jVar.r()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Long.valueOf(jVar.r()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public void u(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 2) {
            int iZ = jVar.z();
            if ((iZ & 3) != 0) {
                throw new e0("Failed to parse the message.");
            }
            int iB = jVar.b() + iZ;
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.s()));
            } while (jVar.b() < iB);
            return;
        }
        if (i10 != 5) {
            throw e0.b();
        }
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.s()));
            if (jVar.c()) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == this.f1311a);
        this.f1313c = iY;
    }

    public void v(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 1) {
            do {
                ((b1) b0Var).add(Long.valueOf(jVar.t()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iZ = jVar.z();
        if ((iZ & 7) != 0) {
            throw new e0("Failed to parse the message.");
        }
        int iB = jVar.b() + iZ;
        do {
            ((b1) b0Var).add(Long.valueOf(jVar.t()));
        } while (jVar.b() < iB);
    }

    public void w(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.u()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.u()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public void x(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Long.valueOf(jVar.v()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Long.valueOf(jVar.v()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public void y(b0 b0Var, boolean z10) throws d0 {
        String strW;
        int iY;
        j jVar = (j) this.f1314d;
        if ((this.f1311a & 7) != 2) {
            throw e0.b();
        }
        do {
            if (z10) {
                C(2);
                strW = jVar.x();
            } else {
                C(2);
                strW = jVar.w();
            }
            ((b1) b0Var).add(strW);
            if (jVar.c()) {
                return;
            } else {
                iY = jVar.y();
            }
        } while (iY == this.f1311a);
        this.f1313c = iY;
    }

    public void z(b0 b0Var) throws e0 {
        int iY;
        j jVar = (j) this.f1314d;
        int i10 = this.f1311a & 7;
        if (i10 == 0) {
            do {
                ((b1) b0Var).add(Integer.valueOf(jVar.z()));
                if (jVar.c()) {
                    return;
                } else {
                    iY = jVar.y();
                }
            } while (iY == this.f1311a);
            this.f1313c = iY;
            return;
        }
        if (i10 != 2) {
            throw e0.b();
        }
        int iB = jVar.b() + jVar.z();
        do {
            ((b1) b0Var).add(Integer.valueOf(jVar.z()));
        } while (jVar.b() < iB);
        B(iB);
    }

    public l(j jVar) {
        this.f1313c = 0;
        Charset charset = c0.f1253a;
        this.f1314d = jVar;
        jVar.f1301d = this;
    }
}
