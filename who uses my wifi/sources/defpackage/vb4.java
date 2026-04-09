package defpackage;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class vb4 implements rh4, kf4 {
    public final bc4 f;
    public final /* synthetic */ uu0 g;

    public vb4(uu0 uu0Var, bc4 bc4Var) {
        this.g = uu0Var;
        this.f = bc4Var;
    }

    public final Pair a(kh4 kh4Var) {
        kh4 kh4VarA;
        bc4 bc4Var = this.f;
        kh4 kh4Var2 = null;
        if (kh4Var != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = bc4Var.c;
                if (i >= arrayList.size()) {
                    kh4VarA = null;
                    break;
                }
                if (((kh4) arrayList.get(i)).d == kh4Var.d) {
                    Object obj = kh4Var.a;
                    Object obj2 = bc4Var.b;
                    int i2 = ic4.k;
                    kh4VarA = kh4Var.a(Pair.create(obj2, obj));
                    break;
                }
                i++;
            }
            if (kh4VarA == null) {
                return null;
            }
            kh4Var2 = kh4VarA;
        }
        return Pair.create(Integer.valueOf(bc4Var.d), kh4Var2);
    }

    @Override // defpackage.rh4
    public final void j(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        Pair pairA = a(kh4Var);
        if (pairA != null) {
            ((d13) this.g.o).d(new tb4(this, pairA, ch4Var, hh4Var, 1));
        }
    }

    @Override // defpackage.rh4
    public final void n(int i, kh4 kh4Var, final ch4 ch4Var, final hh4 hh4Var, final int i2) {
        final Pair pairA = a(kh4Var);
        if (pairA != null) {
            ((d13) this.g.o).d(new Runnable() { // from class: ub4
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    Pair pair = pairA;
                    int iIntValue = ((Integer) pair.first).intValue();
                    kh4 kh4Var2 = (kh4) pair.second;
                    ((md4) this.f.g.n).n(iIntValue, kh4Var2, ch4Var, hh4Var, i2);
                }
            });
        }
    }

    @Override // defpackage.rh4
    public final void o(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var, IOException iOException, boolean z) {
        Pair pairA = a(kh4Var);
        if (pairA != null) {
            ((d13) this.g.o).d(new fg3(this, pairA, ch4Var, hh4Var, iOException, z));
        }
    }

    @Override // defpackage.rh4
    public final void p(int i, kh4 kh4Var, hh4 hh4Var) {
        Pair pairA = a(kh4Var);
        if (pairA != null) {
            ((d13) this.g.o).d(new gi(this, pairA, hh4Var, 26));
        }
    }

    @Override // defpackage.rh4
    public final void r(int i, kh4 kh4Var, ch4 ch4Var, hh4 hh4Var) {
        Pair pairA = a(kh4Var);
        if (pairA != null) {
            ((d13) this.g.o).d(new tb4(this, pairA, ch4Var, hh4Var, 0));
        }
    }
}
