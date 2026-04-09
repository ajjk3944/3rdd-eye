package T1;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import b2.C1842w;
import b2.InterfaceC1843x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12209a = androidx.work.m.g("Schedulers");

    public static void a(InterfaceC1843x interfaceC1843x, B7.d dVar, List list) {
        if (list.size() > 0) {
            dVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                interfaceC1843x.d(jCurrentTimeMillis, ((C1842w) it.next()).f17138a);
            }
        }
    }

    public static void b(androidx.work.b bVar, WorkDatabase workDatabase, List<n> list) {
        ArrayList arrayListS;
        if (list == null || list.size() == 0) {
            return;
        }
        InterfaceC1843x interfaceC1843xY = workDatabase.y();
        workDatabase.c();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                arrayListS = interfaceC1843xY.s();
                a(interfaceC1843xY, bVar.f16867c, arrayListS);
            } else {
                arrayListS = null;
            }
            ArrayList arrayListG = interfaceC1843xY.g(bVar.f16876m);
            a(interfaceC1843xY, bVar.f16867c, arrayListG);
            if (arrayListS != null) {
                arrayListG.addAll(arrayListS);
            }
            ArrayList arrayListB = interfaceC1843xY.b();
            workDatabase.r();
            workDatabase.n();
            if (arrayListG.size() > 0) {
                C1842w[] c1842wArr = (C1842w[]) arrayListG.toArray(new C1842w[arrayListG.size()]);
                for (n nVar : list) {
                    if (nVar.d()) {
                        nVar.b(c1842wArr);
                    }
                }
            }
            if (arrayListB.size() > 0) {
                C1842w[] c1842wArr2 = (C1842w[]) arrayListB.toArray(new C1842w[arrayListB.size()]);
                for (n nVar2 : list) {
                    if (!nVar2.d()) {
                        nVar2.b(c1842wArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
