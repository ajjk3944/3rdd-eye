package defpackage;

import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class r60 {
    public final /* synthetic */ int a = 0;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public Object f;

    public r60(dc4 dc4Var) {
        this.f = dc4Var;
    }

    public void a() {
        this.e = this.c ? ((nr) this.f).g() : ((nr) this.f).k();
    }

    public void b(View view, int i) {
        if (this.c) {
            int iB = ((nr) this.f).b(view);
            nr nrVar = (nr) this.f;
            this.e = (Integer.MIN_VALUE == nrVar.a ? 0 : nrVar.l() - nrVar.a) + iB;
        } else {
            this.e = ((nr) this.f).e(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        nr nrVar = (nr) this.f;
        int iL = Integer.MIN_VALUE == nrVar.a ? 0 : nrVar.l() - nrVar.a;
        if (iL >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (!this.c) {
            int iE = ((nr) this.f).e(view);
            int iK = iE - ((nr) this.f).k();
            this.e = iE;
            if (iK > 0) {
                int iG = (((nr) this.f).g() - Math.min(0, (((nr) this.f).g() - iL) - ((nr) this.f).b(view))) - (((nr) this.f).c(view) + iE);
                if (iG < 0) {
                    this.e -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((nr) this.f).g() - iL) - ((nr) this.f).b(view);
        this.e = ((nr) this.f).g() - iG2;
        if (iG2 > 0) {
            int iC = this.e - ((nr) this.f).c(view);
            int iK2 = ((nr) this.f).k();
            int iMin = iC - (Math.min(((nr) this.f).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.e = Math.min(iG2, -iMin) + this.e;
            }
        }
    }

    public void d() {
        this.b = -1;
        this.e = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
    }

    public void e() {
        this.c = false;
        this.d = false;
    }

    public void f(int i) {
        this.c = 1 == ((this.c ? 1 : 0) | i);
        this.b += i;
    }

    public void g(int i) {
        zt0.b0(!this.c);
        boolean z = i == this.b;
        this.c = z;
        if (z) {
            this.e = 3;
            this.d = false;
        }
    }

    public void h(byte[] bArr, int i, int i2) {
        if (this.c) {
            int i3 = i2 - i;
            byte[] bArr2 = (byte[]) this.f;
            int length = bArr2.length;
            int i4 = this.e + i3;
            if (length < i4) {
                this.f = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, (byte[]) this.f, this.e, i3);
            this.e += i3;
        }
    }

    public boolean i(int i) {
        if (!this.c) {
            return false;
        }
        this.e -= i;
        this.c = false;
        this.d = true;
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.e + ", mLayoutFromEnd=" + this.c + ", mValid=" + this.d + '}';
            default:
                return super.toString();
        }
    }

    public r60(int i) {
        this.b = i;
        byte[] bArr = new byte[131];
        this.f = bArr;
        bArr[2] = 1;
    }

    public r60() {
        d();
    }
}
