package androidx.recyclerview.widget;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1390a;

    /* renamed from: b, reason: collision with root package name */
    public int f1391b;

    /* renamed from: c, reason: collision with root package name */
    public int f1392c;

    /* renamed from: d, reason: collision with root package name */
    public int f1393d;

    /* renamed from: e, reason: collision with root package name */
    public int f1394e;

    /* renamed from: f, reason: collision with root package name */
    public int f1395f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f1396h;

    /* renamed from: i, reason: collision with root package name */
    public int f1397i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public List f1398k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1399l;

    public final void a(View view) {
        int layoutPosition;
        int size = this.f1398k.size();
        View view2 = null;
        int i4 = Integer.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            View view3 = ((x1) this.f1398k.get(i10)).itemView;
            g1 g1Var = (g1) view3.getLayoutParams();
            if (view3 != view && !g1Var.f1374a.isRemoved() && (layoutPosition = (g1Var.f1374a.getLayoutPosition() - this.f1393d) * this.f1394e) >= 0 && layoutPosition < i4) {
                view2 = view3;
                if (layoutPosition == 0) {
                    break;
                } else {
                    i4 = layoutPosition;
                }
            }
        }
        if (view2 == null) {
            this.f1393d = -1;
        } else {
            this.f1393d = ((g1) view2.getLayoutParams()).f1374a.getLayoutPosition();
        }
    }

    public final View b(m1 m1Var) {
        List list = this.f1398k;
        if (list == null) {
            View viewD = m1Var.d(this.f1393d);
            this.f1393d += this.f1394e;
            return viewD;
        }
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = ((x1) this.f1398k.get(i4)).itemView;
            g1 g1Var = (g1) view.getLayoutParams();
            if (!g1Var.f1374a.isRemoved() && this.f1393d == g1Var.f1374a.getLayoutPosition()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
