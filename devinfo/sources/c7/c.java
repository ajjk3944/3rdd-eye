package c7;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import b7.a0;
import b7.y;
import b7.z;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import t6.c0;
import t6.g0;
import t6.j0;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2771a = v.g("EnqueueRunnable");

    public static boolean a(u6.l lVar) {
        boolean z3;
        boolean z10;
        boolean z11;
        boolean z12;
        UUID uuid;
        boolean z13;
        boolean z14;
        g0 g0Var;
        HashSet hashSetT = u6.l.T(lVar);
        u6.r rVar = lVar.f35160e;
        List list = lVar.f35161f;
        String[] strArr = (String[]) hashSetT.toArray(new String[0]);
        rVar.f35176e.f34315d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = rVar.f35177f;
        boolean z15 = strArr != null && strArr.length > 0;
        g0 g0Var2 = g0.f34354f;
        g0 g0Var3 = g0.f34352d;
        if (z15) {
            z10 = false;
            z11 = false;
            z3 = true;
            for (String str : strArr) {
                b7.r rVarD = workDatabase.w().d(str);
                if (rVarD == null) {
                    v.e().c(f2771a, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    z12 = false;
                    break;
                }
                g0 g0Var4 = rVarD.f2031b;
                z3 &= g0Var4 == g0.f34351c;
                if (g0Var4 == g0Var3) {
                    z11 = true;
                } else if (g0Var4 == g0Var2) {
                    z10 = true;
                }
            }
        } else {
            z3 = true;
            z10 = false;
            z11 = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (!zIsEmpty && !z15) {
            y yVarW = workDatabase.w();
            yVarW.getClass();
            nk.k.e(null, "name");
            throw null;
        }
        Iterator it = list.iterator();
        boolean z16 = false;
        while (it.hasNext()) {
            j0 j0Var = (j0) it.next();
            Iterator it2 = it;
            b7.r rVarB = j0Var.f34373b;
            WorkDatabase workDatabase2 = workDatabase;
            UUID uuid2 = j0Var.f34372a;
            if (!z15 || z3) {
                uuid = uuid2;
                rVarB.f2041n = jCurrentTimeMillis;
            } else {
                if (z11) {
                    rVarB.f2031b = g0Var3;
                } else if (z10) {
                    rVarB.f2031b = g0Var2;
                } else {
                    uuid = uuid2;
                    rVarB.f2031b = g0.f34353e;
                }
                uuid = uuid2;
            }
            long j = jCurrentTimeMillis;
            if (rVarB.f2031b == g0.f34349a) {
                z16 = true;
            }
            y yVarW2 = workDatabase2.w();
            nk.k.e(rVar.f35178h, "schedulers");
            boolean zB = rVarB.f2034e.b("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
            u6.r rVar2 = rVar;
            boolean zB2 = rVarB.f2034e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
            boolean zB3 = rVarB.f2034e.b("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
            if (!zB && zB2 && zB3) {
                String str2 = rVarB.f2032c;
                z13 = zIsEmpty;
                c0 c0Var = new c0();
                z14 = z15;
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0Var.f34328a;
                g0Var = g0Var2;
                t6.h hVar = rVarB.f2034e;
                nk.k.e(hVar, "data");
                c0Var.a(hVar.f34356a);
                linkedHashMap.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str2);
                t6.h hVar2 = new t6.h(linkedHashMap);
                jm.a.A(hVar2);
                rVarB = b7.r.b(rVarB, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", hVar2);
            } else {
                z13 = zIsEmpty;
                z14 = z15;
                g0Var = g0Var2;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                t6.e eVar = rVarB.j;
                String str3 = rVarB.f2032c;
                if (!nk.k.a(str3, ConstraintTrackingWorker.class.getName()) && (eVar.f34338e || eVar.f34339f)) {
                    c0 c0Var2 = new c0();
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0Var2.f34328a;
                    t6.h hVar3 = rVarB.f2034e;
                    nk.k.e(hVar3, "data");
                    c0Var2.a(hVar3.f34356a);
                    linkedHashMap2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                    t6.h hVar4 = new t6.h(linkedHashMap2);
                    jm.a.A(hVar4);
                    rVarB = b7.r.b(rVarB, ConstraintTrackingWorker.class.getName(), hVar4);
                }
            }
            yVarW2.getClass();
            com.bumptech.glide.f.r(yVarW2.f2066a, false, true, new b7.b(5, yVarW2, rVarB));
            if (z14) {
                for (String str4 : strArr) {
                    String string = uuid.toString();
                    nk.k.d(string, "toString(...)");
                    b7.a aVar = new b7.a(string, str4);
                    b7.e eVarR = workDatabase2.r();
                    eVarR.getClass();
                    com.bumptech.glide.f.r(eVarR.f1978a, false, true, new b7.b(0, eVarR, aVar));
                }
            }
            a0 a0VarX = workDatabase2.x();
            String string2 = uuid.toString();
            nk.k.d(string2, "toString(...)");
            Set set = j0Var.f34374c;
            a0VarX.getClass();
            nk.k.e(set, "tags");
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                com.bumptech.glide.f.r(a0VarX.f1970a, false, true, new b7.b(7, a0VarX, new z((String) it3.next(), string2)));
            }
            if (!z13) {
                workDatabase2.u();
                nk.k.d(uuid.toString(), "toString(...)");
                nk.k.e(null, "name");
                throw null;
            }
            it = it2;
            workDatabase = workDatabase2;
            jCurrentTimeMillis = j;
            rVar = rVar2;
            zIsEmpty = z13;
            z15 = z14;
            g0Var2 = g0Var;
        }
        z12 = z16;
        lVar.f35163i = true;
        return z12;
    }
}
