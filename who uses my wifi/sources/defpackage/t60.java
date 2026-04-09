package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class t60 {
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public List k;
    public boolean l;

    public final void a(View view) {
        int iB;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((wo0) this.k.get(i2)).a;
            io0 io0Var = (io0) view3.getLayoutParams();
            if (view3 != view && !io0Var.a.h() && (iB = (io0Var.a.b() - this.d) * this.e) >= 0 && iB < i) {
                view2 = view3;
                if (iB == 0) {
                    break;
                } else {
                    i = iB;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((io0) view2.getLayoutParams()).a.b();
        }
    }

    public final View b(no0 no0Var) {
        List list = this.k;
        if (list == null) {
            View viewD = no0Var.d(this.d);
            this.d += this.e;
            return viewD;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view = ((wo0) this.k.get(i)).a;
            io0 io0Var = (io0) view.getLayoutParams();
            if (!io0Var.a.h() && this.d == io0Var.a.b()) {
                a(view);
                return view;
            }
        }
        return null;
    }
}
