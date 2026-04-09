package com.google.android.material.datepicker;

import android.view.View;
import java.util.NoSuchElementException;
import u3.h1;

/* loaded from: classes.dex */
public final class n implements u3.n, ja.d, l6.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5607a;

    /* renamed from: d, reason: collision with root package name */
    public int f5608d;

    /* renamed from: g, reason: collision with root package name */
    public int f5609g;

    /* renamed from: r, reason: collision with root package name */
    public int f5610r;

    /* renamed from: x, reason: collision with root package name */
    public int f5611x;

    /* renamed from: y, reason: collision with root package name */
    public Object f5612y;

    public n() {
        this.f5607a = 2;
        this.f5608d = 0;
        this.f5609g = -1;
        this.f5610r = 0;
        this.f5612y = new int[16];
        this.f5611x = r0.length - 1;
    }

    @Override // ja.d, l6.c
    public int a() {
        switch (this.f5607a) {
        }
        return -1;
    }

    @Override // ja.d, l6.c
    public int b() {
        switch (this.f5607a) {
        }
        return this.f5608d;
    }

    @Override // ja.d, l6.c
    public int c() {
        switch (this.f5607a) {
            case 1:
                fb.f fVar = (fb.f) this.f5612y;
                int i10 = this.f5609g;
                if (i10 != 8) {
                    if (i10 != 16) {
                        int i11 = this.f5610r;
                        this.f5610r = i11 + 1;
                        if (i11 % 2 != 0) {
                            break;
                        } else {
                            int iO = fVar.o();
                            this.f5611x = iO;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                a5.v vVar = (a5.v) this.f5612y;
                int i12 = this.f5609g;
                if (i12 != 8) {
                    if (i12 != 16) {
                        int i13 = this.f5610r;
                        this.f5610r = i13 + 1;
                        if (i13 % 2 != 0) {
                            break;
                        } else {
                            int iT = vVar.t();
                            this.f5611x = iT;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return this.f5611x & 15;
    }

    @Override // u3.n
    public h1 c0(View view, h1 h1Var) {
        View view2 = (View) this.f5612y;
        k3.d dVarF = h1Var.f23176a.f(7);
        int i10 = this.f5608d;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + dVarF.f14015b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.f5609g + dVarF.f14014a, this.f5610r + dVarF.f14015b, this.f5611x + dVarF.f14016c, view2.getPaddingBottom());
        return h1Var;
    }

    public void d(int i10) {
        int i11 = this.f5610r;
        int[] iArr = (int[]) this.f5612y;
        if (i11 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i12 = this.f5608d;
            int i13 = length2 - i12;
            System.arraycopy(iArr, i12, iArr2, 0, i13);
            System.arraycopy((int[]) this.f5612y, 0, iArr2, i13, i12);
            this.f5608d = 0;
            this.f5609g = this.f5610r - 1;
            this.f5612y = iArr2;
            this.f5611x = length - 1;
        }
        int i14 = (this.f5609g + 1) & this.f5611x;
        this.f5609g = i14;
        ((int[]) this.f5612y)[i14] = i10;
        this.f5610r++;
    }

    public int e() {
        int i10 = this.f5610r;
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.f5612y;
        int i11 = this.f5608d;
        int i12 = iArr[i11];
        this.f5608d = (i11 + 1) & this.f5611x;
        this.f5610r = i10 - 1;
        return i12;
    }

    public n(int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f5607a = 4;
        this.f5608d = i11;
        this.f5609g = i12;
        this.f5610r = i13;
        this.f5611x = i14;
        this.f5612y = bArr;
    }

    public n(View view, int i10, int i11, int i12, int i13) {
        this.f5607a = 0;
        this.f5608d = i10;
        this.f5612y = view;
        this.f5609g = i11;
        this.f5610r = i12;
        this.f5611x = i13;
    }

    public n(ja.b bVar) {
        this.f5607a = 1;
        fb.f fVar = bVar.f13433g;
        this.f5612y = fVar;
        fVar.y(12);
        this.f5609g = fVar.r() & 255;
        this.f5608d = fVar.r();
    }

    public n(l6.b bVar) {
        this.f5607a = 3;
        a5.v vVar = bVar.f14779g;
        this.f5612y = vVar;
        vVar.E(12);
        this.f5609g = vVar.w() & 255;
        this.f5608d = vVar.w();
    }
}
