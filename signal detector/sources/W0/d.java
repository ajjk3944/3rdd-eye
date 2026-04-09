package W0;

import V0.m;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3966a = m.h("Schedulers");

    public static void a(V0.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        K4.c cVarT = workDatabase.t();
        workDatabase.c();
        try {
            int i = bVar.f3802c;
            if (Build.VERSION.SDK_INT == 23) {
                i /= 2;
            }
            ArrayList arrayListB = cVarT.b(i);
            ArrayList arrayListA = cVarT.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListB.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayListB.get(i3);
                    i3++;
                    cVarT.i(jCurrentTimeMillis, ((e1.h) obj).f19908a);
                }
            }
            workDatabase.m();
            workDatabase.j();
            if (arrayListB.size() > 0) {
                e1.h[] hVarArr = (e1.h[]) arrayListB.toArray(new e1.h[arrayListB.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.b()) {
                        cVar.e(hVarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                e1.h[] hVarArr2 = (e1.h[]) arrayListA.toArray(new e1.h[arrayListA.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    c cVar2 = (c) it2.next();
                    if (!cVar2.b()) {
                        cVar2.e(hVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.j();
            throw th;
        }
    }
}
