package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final i2 f1420a;

    /* renamed from: b, reason: collision with root package name */
    public final h2 f1421b;

    public j2(i2 i2Var) {
        this.f1420a = i2Var;
        h2 h2Var = new h2();
        h2Var.f1400a = 0;
        this.f1421b = h2Var;
    }

    public final View a(int i4, int i10, int i11, int i12) {
        i2 i2Var = this.f1420a;
        int iB = i2Var.b();
        int iC = i2Var.c();
        int i13 = i10 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i10) {
            View viewD = i2Var.d(i4);
            int iA = i2Var.a(viewD);
            int iE = i2Var.e(viewD);
            h2 h2Var = this.f1421b;
            h2Var.f1401b = iB;
            h2Var.f1402c = iC;
            h2Var.f1403d = iA;
            h2Var.f1404e = iE;
            if (i11 != 0) {
                h2Var.f1400a = i11;
                if (h2Var.a()) {
                    return viewD;
                }
            }
            if (i12 != 0) {
                h2Var.f1400a = i12;
                if (h2Var.a()) {
                    view = viewD;
                }
            }
            i4 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        i2 i2Var = this.f1420a;
        int iB = i2Var.b();
        int iC = i2Var.c();
        int iA = i2Var.a(view);
        int iE = i2Var.e(view);
        h2 h2Var = this.f1421b;
        h2Var.f1401b = iB;
        h2Var.f1402c = iC;
        h2Var.f1403d = iA;
        h2Var.f1404e = iE;
        h2Var.f1400a = 24579;
        return h2Var.a();
    }
}
