package z;

import A.o;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class i extends d {

    /* renamed from: q0, reason: collision with root package name */
    public d[] f24435q0 = new d[4];

    /* renamed from: r0, reason: collision with root package name */
    public int f24436r0 = 0;

    public final void R(int i, o oVar, ArrayList arrayList) {
        for (int i3 = 0; i3 < this.f24436r0; i3++) {
            d dVar = this.f24435q0[i3];
            ArrayList arrayList2 = oVar.f38a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i6 = 0; i6 < this.f24436r0; i6++) {
            A.i.b(this.f24435q0[i6], i, arrayList, oVar);
        }
    }

    public void S() {
    }
}
