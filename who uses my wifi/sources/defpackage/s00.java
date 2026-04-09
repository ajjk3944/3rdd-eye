package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class s00 extends pi {
    public pi[] q0 = new pi[4];
    public int r0 = 0;

    public final void R(int i, l81 l81Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            pi piVar = this.q0[i2];
            ArrayList arrayList2 = l81Var.a;
            if (!arrayList2.contains(piVar)) {
                arrayList2.add(piVar);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            qb1.i(this.q0[i3], i, arrayList, l81Var);
        }
    }

    public void S() {
    }
}
