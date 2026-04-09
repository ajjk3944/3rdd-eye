package h7;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f10022a;

    /* renamed from: b, reason: collision with root package name */
    public int f10023b;

    /* renamed from: c, reason: collision with root package name */
    public int f10024c;

    /* renamed from: d, reason: collision with root package name */
    public int f10025d;

    /* renamed from: e, reason: collision with root package name */
    public int f10026e;

    /* renamed from: f, reason: collision with root package name */
    public int f10027f;

    /* renamed from: g, reason: collision with root package name */
    public int f10028g;

    /* renamed from: h, reason: collision with root package name */
    public int f10029h;

    /* renamed from: i, reason: collision with root package name */
    public int f10030i;
    public int j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10031l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            View view3 = ((n1) this.k.get(i11)).f10155a;
            z0 z0Var = (z0) view3.getLayoutParams();
            if (view3 != view && !z0Var.f10292a.h() && (iB = (z0Var.f10292a.b() - this.f10025d) * this.f10026e) >= 0 && iB < i10) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i10 = iB;
                }
            }
        }
        if (view2 == null) {
            this.f10025d = -1;
        } else {
            this.f10025d = ((z0) view2.getLayoutParams()).f10292a.b();
        }
    }

    public final View b(f1 f1Var) {
        List list = this.k;
        if (list == null) {
            View viewD = f1Var.d(this.f10025d);
            this.f10025d += this.f10026e;
            return viewD;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = ((n1) this.k.get(i10)).f10155a;
            z0 z0Var = (z0) view.getLayoutParams();
            if (!z0Var.f10292a.h() && this.f10025d == z0Var.f10292a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
