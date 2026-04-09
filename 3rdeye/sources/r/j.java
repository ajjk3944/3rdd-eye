package R;

import A2.l;
import C.C0635w;
import E.u;
import androidx.camera.core.impl.C1684d0;
import androidx.camera.core.impl.F;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: VirtualCameraControl.java */
/* loaded from: classes.dex */
public final class j extends C1684d0 {

    /* renamed from: c, reason: collision with root package name */
    public final B.d f11598c;

    public j(F f10, B.d dVar) {
        super(f10);
        this.f11598c = dVar;
    }

    @Override // androidx.camera.core.impl.F
    public final A4.a g(ArrayList arrayList, int i, int i10) {
        l.k("Only support one capture config.", arrayList.size() == 1);
        A4.a<E.i> aVarH = this.f15013b.h(i, i10);
        I.d dVarA = I.d.a(aVarH);
        M8.a aVar = new M8.a(aVarH, 5);
        H.b bVarY = u.y();
        dVarA.getClass();
        return I.j.b(Collections.singletonList(I.j.j(I.j.j(I.j.j(dVarA, aVar, bVarY), new C0635w(4, this, arrayList), u.y()), new D7.c(aVarH, 9), u.y())));
    }
}
