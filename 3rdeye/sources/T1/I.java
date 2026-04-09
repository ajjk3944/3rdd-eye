package T1;

import N7.C1154e9;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import b2.C1842w;
import b2.InterfaceC1843x;
import c9.C2089j;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: WorkerUpdater.kt */
/* loaded from: classes.dex */
public final class I {
    public static final C1598j a(z zVar, String name, androidx.work.w workRequest) {
        kotlin.jvm.internal.l.f(zVar, "<this>");
        kotlin.jvm.internal.l.f(name, "name");
        kotlin.jvm.internal.l.f(workRequest, "workRequest");
        C1598j c1598j = new C1598j();
        zVar.f12233d.c().execute(new E(zVar, name, c1598j, new G(workRequest, zVar, name, c1598j), workRequest, 0));
        return c1598j;
    }

    public static final void b(l lVar, WorkDatabase workDatabase, androidx.work.b bVar, List list, C1842w c1842w, Set set) {
        InterfaceC1843x interfaceC1843xY = workDatabase.y();
        String str = c1842w.f17138a;
        C1842w c1842wU = interfaceC1843xY.u(str);
        if (c1842wU == null) {
            throw new IllegalArgumentException(C1154e9.i("Worker with ", str, " doesn't exist"));
        }
        if (c1842wU.f17139b.isFinished()) {
            u.a aVar = u.a.NOT_APPLIED;
            return;
        }
        if (c1842wU.d() ^ c1842w.d()) {
            StringBuilder sb = new StringBuilder("Can't update ");
            H h10 = H.f12136g;
            sb.append((String) h10.invoke(c1842wU));
            sb.append(" Worker to ");
            throw new UnsupportedOperationException(B4.f.c(sb, (String) h10.invoke(c1842w), " Worker. Update operation must preserve worker's type."));
        }
        boolean zG = lVar.g(str);
        if (!zG) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((n) it.next()).e(str);
            }
        }
        workDatabase.q(new C2089j(new F(workDatabase, c1842wU, c1842w, list, str, set, zG), 4));
        if (!zG) {
            q.b(bVar, workDatabase, list);
        }
        u.a aVar2 = u.a.NOT_APPLIED;
    }
}
