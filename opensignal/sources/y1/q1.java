package y1;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public final SemanticsConfiguration f25765a;

    /* renamed from: b, reason: collision with root package name */
    public final u.u f25766b;

    public q1(e2.k kVar, u.j jVar) {
        this.f25765a = kVar.f7717d;
        this.f25766b = new u.u(e2.k.j(4, kVar).size());
        List listJ = e2.k.j(4, kVar);
        int size = listJ.size();
        for (int i10 = 0; i10 < size; i10++) {
            e2.k kVar2 = (e2.k) listJ.get(i10);
            if (jVar.a(kVar2.f7720g)) {
                this.f25766b.a(kVar2.f7720g);
            }
        }
    }
}
