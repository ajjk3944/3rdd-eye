package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class b9 extends v21 {
    public ArrayList F;
    public boolean G;
    public int H;
    public boolean I;
    public int J;

    @Override // defpackage.v21
    public final void A(long j) {
        ArrayList arrayList;
        this.h = j;
        if (j < 0 || (arrayList = this.F) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).A(j);
        }
    }

    @Override // defpackage.v21
    public final void B(bd2 bd2Var) {
        this.J |= 8;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).B(bd2Var);
        }
    }

    @Override // defpackage.v21
    public final void C(TimeInterpolator timeInterpolator) {
        this.J |= 1;
        ArrayList arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((v21) this.F.get(i)).C(timeInterpolator);
            }
        }
        this.i = timeInterpolator;
    }

    @Override // defpackage.v21
    public final void D(ts0 ts0Var) {
        super.D(ts0Var);
        this.J |= 4;
        if (this.F != null) {
            for (int i = 0; i < this.F.size(); i++) {
                ((v21) this.F.get(i)).D(ts0Var);
            }
        }
    }

    @Override // defpackage.v21
    public final void E() {
        this.J |= 2;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).E();
        }
    }

    @Override // defpackage.v21
    public final void F(long j) {
        this.g = j;
    }

    @Override // defpackage.v21
    public final String H(String str) {
        String strH = super.H(str);
        for (int i = 0; i < this.F.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strH);
            sb.append("\n");
            sb.append(((v21) this.F.get(i)).H(str + "  "));
            strH = sb.toString();
        }
        return strH;
    }

    public final void I(v21 v21Var) {
        this.F.add(v21Var);
        v21Var.n = this;
        long j = this.h;
        if (j >= 0) {
            v21Var.A(j);
        }
        if ((this.J & 1) != 0) {
            v21Var.C(this.i);
        }
        if ((this.J & 2) != 0) {
            v21Var.E();
        }
        if ((this.J & 4) != 0) {
            v21Var.D(this.A);
        }
        if ((this.J & 8) != 0) {
            v21Var.B(null);
        }
    }

    @Override // defpackage.v21
    public final void c() {
        super.c();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).c();
        }
    }

    @Override // defpackage.v21
    public final void d(d31 d31Var) {
        View view = d31Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v21 v21Var = (v21) obj;
                if (v21Var.t(view)) {
                    v21Var.d(d31Var);
                    d31Var.c.add(v21Var);
                }
            }
        }
    }

    @Override // defpackage.v21
    public final void f(d31 d31Var) {
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).f(d31Var);
        }
    }

    @Override // defpackage.v21
    public final void g(d31 d31Var) {
        View view = d31Var.b;
        if (t(view)) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                v21 v21Var = (v21) obj;
                if (v21Var.t(view)) {
                    v21Var.g(d31Var);
                    d31Var.c.add(v21Var);
                }
            }
        }
    }

    @Override // defpackage.v21
    /* renamed from: j */
    public final v21 clone() {
        b9 b9Var = (b9) super.clone();
        b9Var.F = new ArrayList();
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            v21 v21VarClone = ((v21) this.F.get(i)).clone();
            b9Var.F.add(v21VarClone);
            v21VarClone.n = b9Var;
        }
        return b9Var;
    }

    @Override // defpackage.v21
    public final void l(ViewGroup viewGroup, mc2 mc2Var, mc2 mc2Var2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.g;
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            v21 v21Var = (v21) this.F.get(i);
            if (j > 0 && (this.G || i == 0)) {
                long j2 = v21Var.g;
                if (j2 > 0) {
                    v21Var.F(j2 + j);
                } else {
                    v21Var.F(j);
                }
            }
            v21Var.l(viewGroup, mc2Var, mc2Var2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.v21
    public final void w(View view) {
        super.w(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).w(view);
        }
    }

    @Override // defpackage.v21
    public final v21 x(u21 u21Var) {
        super.x(u21Var);
        return this;
    }

    @Override // defpackage.v21
    public final void y(View view) {
        super.y(view);
        int size = this.F.size();
        for (int i = 0; i < size; i++) {
            ((v21) this.F.get(i)).y(view);
        }
    }

    @Override // defpackage.v21
    public final void z() {
        if (this.F.isEmpty()) {
            G();
            m();
            return;
        }
        a31 a31Var = new a31();
        a31Var.b = this;
        ArrayList arrayList = this.F;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((v21) obj).a(a31Var);
        }
        this.H = this.F.size();
        if (this.G) {
            ArrayList arrayList2 = this.F;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((v21) obj2).z();
            }
            return;
        }
        for (int i3 = 1; i3 < this.F.size(); i3++) {
            ((v21) this.F.get(i3 - 1)).a(new a31((v21) this.F.get(i3)));
        }
        v21 v21Var = (v21) this.F.get(0);
        if (v21Var != null) {
            v21Var.z();
        }
    }
}
