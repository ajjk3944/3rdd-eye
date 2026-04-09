package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public m0 f1352a;

    /* renamed from: b, reason: collision with root package name */
    public int f1353b;

    /* renamed from: c, reason: collision with root package name */
    public int f1354c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1355d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1356e;

    public f0() {
        d();
    }

    public final void a() {
        this.f1354c = this.f1355d ? this.f1352a.g() : this.f1352a.k();
    }

    public final void b(int i4, View view) {
        if (this.f1355d) {
            int iB = this.f1352a.b(view);
            m0 m0Var = this.f1352a;
            this.f1354c = (Integer.MIN_VALUE == m0Var.f1453b ? 0 : m0Var.l() - m0Var.f1453b) + iB;
        } else {
            this.f1354c = this.f1352a.e(view);
        }
        this.f1353b = i4;
    }

    public final void c(int i4, View view) {
        m0 m0Var = this.f1352a;
        int iL = Integer.MIN_VALUE == m0Var.f1453b ? 0 : m0Var.l() - m0Var.f1453b;
        if (iL >= 0) {
            b(i4, view);
            return;
        }
        this.f1353b = i4;
        if (!this.f1355d) {
            int iE = this.f1352a.e(view);
            int iK = iE - this.f1352a.k();
            this.f1354c = iE;
            if (iK > 0) {
                int iG = (this.f1352a.g() - Math.min(0, (this.f1352a.g() - iL) - this.f1352a.b(view))) - (this.f1352a.c(view) + iE);
                if (iG < 0) {
                    this.f1354c -= Math.min(iK, -iG);
                    return;
                }
                return;
            }
            return;
        }
        int iG2 = (this.f1352a.g() - iL) - this.f1352a.b(view);
        this.f1354c = this.f1352a.g() - iG2;
        if (iG2 > 0) {
            int iC = this.f1354c - this.f1352a.c(view);
            int iK2 = this.f1352a.k();
            int iMin = iC - (Math.min(this.f1352a.e(view) - iK2, 0) + iK2);
            if (iMin < 0) {
                this.f1354c = Math.min(iG2, -iMin) + this.f1354c;
            }
        }
    }

    public final void d() {
        this.f1353b = -1;
        this.f1354c = LinearLayoutManager.INVALID_OFFSET;
        this.f1355d = false;
        this.f1356e = false;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnchorInfo{mPosition=");
        sb2.append(this.f1353b);
        sb2.append(", mCoordinate=");
        sb2.append(this.f1354c);
        sb2.append(", mLayoutFromEnd=");
        sb2.append(this.f1355d);
        sb2.append(", mValid=");
        return d.h.x(sb2, this.f1356e, '}');
    }
}
