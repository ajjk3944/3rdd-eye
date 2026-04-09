package c7;

import a0.q0;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import b7.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import t6.g0;
import t6.j0;
import t6.v;
import u6.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2783a = {13, 15, 14};

    public static final void a(u6.r rVar, String str) {
        c0 c0VarB;
        WorkDatabase workDatabase = rVar.f35177f;
        nk.k.d(workDatabase, "getWorkDatabase(...)");
        y yVarW = workDatabase.w();
        b7.e eVarR = workDatabase.r();
        ArrayList arrayListV = cm.g.v(str);
        while (!arrayListV.isEmpty()) {
            String str2 = (String) zj.n.l0(arrayListV);
            g0 g0VarC = yVarW.c(str2);
            if (g0VarC != g0.f34351c && g0VarC != g0.f34352d) {
                ((Number) com.bumptech.glide.f.r(yVarW.f2066a, false, true, new b7.c(str2, 8))).intValue();
            }
            arrayListV.addAll(eVarR.a(str2));
        }
        u6.c cVar = rVar.f35179i;
        nk.k.d(cVar, "getProcessor(...)");
        synchronized (cVar.f35131k) {
            v.e().a(u6.c.f35122l, "Processor cancelling " + str);
            cVar.f35130i.add(str);
            c0VarB = cVar.b(str);
        }
        u6.c.e(str, c0VarB, 1);
        Iterator it = rVar.f35178h.iterator();
        while (it.hasNext()) {
            ((u6.e) it.next()).d(str);
        }
    }

    public static final void b(WorkDatabase workDatabase, t6.b bVar, u6.l lVar) {
        int i4;
        nk.k.e(workDatabase, "workDatabase");
        nk.k.e(bVar, "configuration");
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        ArrayList arrayListV = cm.g.v(lVar);
        int i10 = 0;
        while (!arrayListV.isEmpty()) {
            List list = ((u6.l) zj.n.l0(arrayListV)).f35161f;
            nk.k.d(list, "getWork(...)");
            if (list.isEmpty()) {
                i4 = 0;
            } else {
                Iterator it = list.iterator();
                i4 = 0;
                while (it.hasNext()) {
                    if (((j0) it.next()).f34373b.j.b() && (i4 = i4 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i10 += i4;
        }
        if (i10 == 0) {
            return;
        }
        int iIntValue = ((Number) com.bumptech.glide.f.r(workDatabase.w().f2066a, true, false, new q0(26))).intValue();
        int i11 = bVar.j;
        if (iIntValue + i10 > i11) {
            throw new IllegalArgumentException(r5.c.j(i10, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.", r5.c.n(i11, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", iIntValue, ";\ncurrent enqueue operation count: ")));
        }
    }
}
