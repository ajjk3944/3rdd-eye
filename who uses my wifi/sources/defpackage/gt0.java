package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gt0 {
    public static final /* synthetic */ int a = 0;

    static {
        h80.f("Schedulers");
    }

    public static void a(ru0 ru0Var, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        h2 h2VarN = workDatabase.n();
        workDatabase.c();
        try {
            ArrayList arrayListB = h2VarN.b(ru0Var.c);
            ArrayList arrayListA = h2VarN.a();
            if (arrayListB.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int size = arrayListB.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayListB.get(i);
                    i++;
                    h2VarN.j(((oa1) obj).a, jCurrentTimeMillis);
                }
            }
            workDatabase.h();
            workDatabase.f();
            if (arrayListB.size() > 0) {
                oa1[] oa1VarArr = (oa1[]) arrayListB.toArray(new oa1[arrayListB.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    et0 et0Var = (et0) it.next();
                    if (et0Var.f()) {
                        et0Var.d(oa1VarArr);
                    }
                }
            }
            if (arrayListA.size() > 0) {
                oa1[] oa1VarArr2 = (oa1[]) arrayListA.toArray(new oa1[arrayListA.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    et0 et0Var2 = (et0) it2.next();
                    if (!et0Var2.f()) {
                        et0Var2.d(oa1VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
