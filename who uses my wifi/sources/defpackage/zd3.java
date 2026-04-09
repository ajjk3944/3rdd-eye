package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class zd3 implements th3 {
    public final boolean f;
    public final ArrayList g = new ArrayList(1);
    public int h;
    public ij3 i;

    public zd3(boolean z) {
        this.f = z;
    }

    @Override // defpackage.th3
    public final void b(ws3 ws3Var) {
        ws3Var.getClass();
        ArrayList arrayList = this.g;
        if (arrayList.contains(ws3Var)) {
            return;
        }
        arrayList.add(ws3Var);
        this.h++;
    }

    public final void c(ij3 ij3Var) {
        for (int i = 0; i < this.h; i++) {
            ((ws3) this.g.get(i)).getClass();
        }
    }

    public final void e(ij3 ij3Var) {
        this.i = ij3Var;
        for (int i = 0; i < this.h; i++) {
            ((ws3) this.g.get(i)).e(this, ij3Var, this.f);
        }
    }

    public final void f(int i) {
        ij3 ij3Var = this.i;
        String str = v23.a;
        for (int i2 = 0; i2 < this.h; i2++) {
            ((ws3) this.g.get(i2)).f(ij3Var, this.f, i);
        }
    }

    public final void j() {
        ij3 ij3Var = this.i;
        String str = v23.a;
        for (int i = 0; i < this.h; i++) {
            ((ws3) this.g.get(i)).c(ij3Var, this.f);
        }
        this.i = null;
    }
}
