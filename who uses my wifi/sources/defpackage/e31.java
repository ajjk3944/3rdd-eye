package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class e31 implements vi, x9 {
    public final boolean a;
    public final ArrayList b = new ArrayList();
    public final int c;
    public final pu d;
    public final pu e;
    public final pu f;

    public e31(da daVar, pv0 pv0Var) {
        this.a = pv0Var.e;
        this.c = pv0Var.a;
        pu puVarQ0 = pv0Var.b.Q0();
        this.d = puVarQ0;
        pu puVarQ02 = pv0Var.c.Q0();
        this.e = puVarQ02;
        pu puVarQ03 = pv0Var.d.Q0();
        this.f = puVarQ03;
        daVar.e(puVarQ0);
        daVar.e(puVarQ02);
        daVar.e(puVarQ03);
        puVarQ0.a(this);
        puVarQ02.a(this);
        puVarQ03.a(this);
    }

    public final void a(x9 x9Var) {
        this.b.add(x9Var);
    }

    @Override // defpackage.x9
    public final void c() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ((x9) arrayList.get(i)).c();
            i++;
        }
    }

    @Override // defpackage.vi
    public final void d(List list, List list2) {
    }
}
