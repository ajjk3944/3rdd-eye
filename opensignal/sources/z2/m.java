package z2;

import a3.q;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class m extends g {

    /* renamed from: q0, reason: collision with root package name */
    public g[] f26619q0 = new g[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f26620r0 = 0;

    public final void R(int i10, q qVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f26620r0; i11++) {
            g gVar = this.f26619q0[i11];
            ArrayList arrayList2 = qVar.f69a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
        }
        for (int i12 = 0; i12 < this.f26620r0; i12++) {
            a3.i.b(this.f26619q0[i12], i10, arrayList, qVar);
        }
    }

    public void S() {
    }
}
