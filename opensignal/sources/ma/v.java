package ma;

import android.view.View;
import h7.j0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16621a;

    /* renamed from: b, reason: collision with root package name */
    public int f16622b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16623c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16624d;

    /* renamed from: e, reason: collision with root package name */
    public Object f16625e;

    /* renamed from: f, reason: collision with root package name */
    public int f16626f;

    public v(int i10, int i11) {
        this.f16621a = i11;
        switch (i11) {
            case 1:
                this.f16622b = i10;
                byte[] bArr = new byte[131];
                this.f16625e = bArr;
                bArr[2] = 1;
                break;
            default:
                this.f16622b = i10;
                byte[] bArr2 = new byte[131];
                this.f16625e = bArr2;
                bArr2[2] = 1;
                break;
        }
    }

    public void a(byte[] bArr, int i10, int i11) {
        switch (this.f16621a) {
            case 0:
                if (this.f16623c) {
                    int i12 = i11 - i10;
                    byte[] bArr2 = (byte[]) this.f16625e;
                    int length = bArr2.length;
                    int i13 = this.f16626f;
                    if (length < i13 + i12) {
                        this.f16625e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                    }
                    System.arraycopy(bArr, i10, (byte[]) this.f16625e, this.f16626f, i12);
                    this.f16626f += i12;
                    break;
                }
                break;
            default:
                if (this.f16623c) {
                    int i14 = i11 - i10;
                    byte[] bArr3 = (byte[]) this.f16625e;
                    int length2 = bArr3.length;
                    int i15 = this.f16626f;
                    if (length2 < i15 + i14) {
                        this.f16625e = Arrays.copyOf(bArr3, (i15 + i14) * 2);
                    }
                    System.arraycopy(bArr, i10, (byte[]) this.f16625e, this.f16626f, i14);
                    this.f16626f += i14;
                    break;
                }
                break;
        }
    }

    public void b() {
        this.f16626f = this.f16623c ? ((j0) this.f16625e).g() : ((j0) this.f16625e).k();
    }

    public void c(View view, int i10) {
        if (this.f16623c) {
            int iB = ((j0) this.f16625e).b(view);
            j0 j0Var = (j0) this.f16625e;
            this.f16626f = (Integer.MIN_VALUE == j0Var.f10098a ? 0 : j0Var.l() - j0Var.f10098a) + iB;
        } else {
            this.f16626f = ((j0) this.f16625e).e(view);
        }
        this.f16622b = i10;
    }

    public void d(View view, int i10) {
        j0 j0Var = (j0) this.f16625e;
        int iL = Integer.MIN_VALUE == j0Var.f10098a ? 0 : j0Var.l() - j0Var.f10098a;
        if (iL >= 0) {
            c(view, i10);
            return;
        }
        this.f16622b = i10;
        if (!this.f16623c) {
            int iE = ((j0) this.f16625e).e(view);
            int iK = iE - ((j0) this.f16625e).k();
            this.f16626f = iE;
            if (iK > 0) {
                int iG = (((j0) this.f16625e).g() - Math.min(0, (((j0) this.f16625e).g() - iL) - ((j0) this.f16625e).b(view))) - (((j0) this.f16625e).c(view) + iE);
                if (iG < 0) {
                    this.f16626f -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (((j0) this.f16625e).g() - iL) - ((j0) this.f16625e).b(view);
        this.f16626f = ((j0) this.f16625e).g() - iG2;
        if (iG2 > 0) {
            int iC = this.f16626f - ((j0) this.f16625e).c(view);
            int iK2 = ((j0) this.f16625e).k();
            int iMin = iC - (Math.min(((j0) this.f16625e).e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f16626f = Math.min(iG2, -iMin) + this.f16626f;
            }
        }
    }

    public boolean e(int i10) {
        switch (this.f16621a) {
            case 0:
                if (this.f16623c) {
                    this.f16626f -= i10;
                    this.f16623c = false;
                    this.f16624d = true;
                    break;
                }
                break;
            default:
                if (this.f16623c) {
                    this.f16626f -= i10;
                    this.f16623c = false;
                    this.f16624d = true;
                    break;
                }
                break;
        }
        return true;
    }

    public final void f() {
        switch (this.f16621a) {
            case 0:
                this.f16623c = false;
                this.f16624d = false;
                break;
            case 1:
                this.f16623c = false;
                this.f16624d = false;
                break;
            default:
                this.f16622b = -1;
                this.f16626f = Integer.MIN_VALUE;
                this.f16623c = false;
                this.f16624d = false;
                break;
        }
    }

    public void g(int i10) {
        switch (this.f16621a) {
            case 0:
                qb.b.j(!this.f16623c);
                boolean z10 = i10 == this.f16622b;
                this.f16623c = z10;
                if (z10) {
                    this.f16626f = 3;
                    this.f16624d = false;
                    break;
                }
                break;
            default:
                a5.a.i(!this.f16623c);
                boolean z11 = i10 == this.f16622b;
                this.f16623c = z11;
                if (z11) {
                    this.f16626f = 3;
                    this.f16624d = false;
                    break;
                }
                break;
        }
    }

    public String toString() {
        switch (this.f16621a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
                sb2.append(this.f16622b);
                sb2.append(", mCoordinate=");
                sb2.append(this.f16626f);
                sb2.append(", mLayoutFromEnd=");
                sb2.append(this.f16623c);
                sb2.append(", mValid=");
                return c7.a.r(sb2, this.f16624d, '}');
            default:
                return super.toString();
        }
    }

    public v() {
        this.f16621a = 2;
        f();
    }
}
