package u6;

import a0.q0;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f35151a = t6.v.g("Schedulers");

    public static void a(b7.y yVar, t6.x xVar, List list) {
        if (list.size() > 0) {
            xVar.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yVar.e(jCurrentTimeMillis, ((b7.r) it.next()).f2030a);
            }
        }
    }

    public static void b(t6.b bVar, WorkDatabase workDatabase, List list) {
        List list2;
        if (list == null || list.size() == 0) {
            return;
        }
        b7.y yVarW = workDatabase.w();
        workDatabase.b();
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                list2 = (List) com.bumptech.glide.f.r(yVarW.f2066a, true, false, new q0(25));
                a(yVarW, bVar.f34315d, list2);
            } else {
                list2 = null;
            }
            List list3 = (List) com.bumptech.glide.f.r(yVarW.f2066a, true, false, new b7.s(bVar.f34320k));
            a(yVarW, bVar.f34315d, list3);
            if (list2 != null) {
                list3.addAll(list2);
            }
            List list4 = (List) com.bumptech.glide.f.r(yVarW.f2066a, true, false, new q0(28));
            workDatabase.p();
            workDatabase.l();
            if (list3.size() > 0) {
                b7.r[] rVarArr = (b7.r[]) list3.toArray(new b7.r[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.c()) {
                        eVar.b(rVarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                b7.r[] rVarArr2 = (b7.r[]) list4.toArray(new b7.r[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar2 = (e) it2.next();
                    if (!eVar2.c()) {
                        eVar2.b(rVarArr2);
                    }
                }
            }
        } catch (Throwable th2) {
            workDatabase.l();
            throw th2;
        }
    }
}
