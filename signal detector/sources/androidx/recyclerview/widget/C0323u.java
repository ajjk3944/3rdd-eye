package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323u {

    /* renamed from: a, reason: collision with root package name */
    public A f5610a;

    /* renamed from: b, reason: collision with root package name */
    public int f5611b;

    /* renamed from: c, reason: collision with root package name */
    public int f5612c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f5613d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5614e;

    public C0323u() {
        d();
    }

    public final void a() {
        this.f5612c = this.f5613d ? this.f5610a.g() : this.f5610a.k();
    }

    public final void b(int i, View view) {
        if (this.f5613d) {
            int iB = this.f5610a.b(view);
            A a6 = this.f5610a;
            this.f5612c = (Integer.MIN_VALUE == a6.f5273b ? 0 : a6.l() - a6.f5273b) + iB;
        } else {
            this.f5612c = this.f5610a.e(view);
        }
        this.f5611b = i;
    }

    public final void c(int i, View view) {
        A a6 = this.f5610a;
        int iL = Integer.MIN_VALUE == a6.f5273b ? 0 : a6.l() - a6.f5273b;
        if (iL >= 0) {
            b(i, view);
            return;
        }
        this.f5611b = i;
        if (!this.f5613d) {
            int iE = this.f5610a.e(view);
            int iK = iE - this.f5610a.k();
            this.f5612c = iE;
            if (iK > 0) {
                int iG = (this.f5610a.g() - Math.min(0, (this.f5610a.g() - iL) - this.f5610a.b(view))) - (this.f5610a.c(view) + iE);
                if (iG < 0) {
                    this.f5612c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f5610a.g() - iL) - this.f5610a.b(view);
        this.f5612c = this.f5610a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f5612c - this.f5610a.c(view);
            int iK2 = this.f5610a.k();
            int iMin = iC - (Math.min(this.f5610a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f5612c = Math.min(iG2, -iMin) + this.f5612c;
            }
        }
    }

    public final void d() {
        this.f5611b = -1;
        this.f5612c = LinearLayoutManager.INVALID_OFFSET;
        this.f5613d = false;
        this.f5614e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5611b + ", mCoordinate=" + this.f5612c + ", mLayoutFromEnd=" + this.f5613d + ", mValid=" + this.f5614e + '}';
    }
}
