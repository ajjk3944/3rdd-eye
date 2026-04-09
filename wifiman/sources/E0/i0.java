package E0;

import androidx.compose.ui.e;
import mh.InterfaceC6824a;

/* loaded from: classes.dex */
public abstract class i0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(e.c cVar, InterfaceC6824a interfaceC6824a) {
        j0 j0VarG2 = cVar.g2();
        if (j0VarG2 == null) {
            j0VarG2 = new j0((h0) cVar);
            cVar.y2(j0VarG2);
        }
        AbstractC2633k.n(cVar).getSnapshotObserver().i(j0VarG2, j0.f3939b.a(), interfaceC6824a);
    }
}
