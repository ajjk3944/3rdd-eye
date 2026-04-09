package f1;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase;
import h0.C2351a;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public abstract class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final V2.h f20035a = new V2.h(11);

    public static void a(W0.k kVar, String str) throws SQLException {
        WorkDatabase workDatabase = kVar.f3992k;
        K4.c cVarT = workDatabase.t();
        C2351a c2351aO = workDatabase.o();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = cVarT.e(str2);
            if (iE != 3 && iE != 4) {
                cVarT.l(6, str2);
            }
            linkedList.addAll(c2351aO.C(str2));
        }
        W0.b bVar = kVar.f3995n;
        synchronized (bVar.f3965k) {
            try {
                V0.m.f().a(W0.b.f3955l, "Processor cancelling " + str, new Throwable[0]);
                bVar.i.add(str);
                W0.l lVar = (W0.l) bVar.f3961f.remove(str);
                boolean z6 = lVar != null;
                if (lVar == null) {
                    lVar = (W0.l) bVar.f3962g.remove(str);
                }
                W0.b.b(str, lVar);
                if (z6) {
                    bVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f3994m.iterator();
        while (it.hasNext()) {
            ((W0.c) it.next()).d(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        V2.h hVar = this.f20035a;
        try {
            b();
            hVar.z(V0.r.f3835v);
        } catch (Throwable th) {
            hVar.z(new V0.o(th));
        }
    }
}
