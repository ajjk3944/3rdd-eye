package f1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f20036c = V0.m.h("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final W0.e f20037a;

    /* renamed from: b, reason: collision with root package name */
    public final V2.h f20038b = new V2.h(11);

    public d(W0.e eVar) {
        this.f20037a = eVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x029b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(W0.e r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.d.a(W0.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        V2.h hVar = this.f20038b;
        W0.e eVar = this.f20037a;
        W0.k kVar = eVar.f3968c;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f3970e);
            HashSet hashSetB = W0.e.B(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(eVar.f3970e);
                    z6 = false;
                    break;
                } else if (hashSetB.contains((String) it.next())) {
                    z6 = true;
                    break;
                }
            }
            if (z6) {
                throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
            }
            WorkDatabase workDatabase = kVar.f3992k;
            workDatabase.c();
            try {
                boolean zA = a(eVar);
                workDatabase.m();
                if (zA) {
                    g.a(kVar.i, RescheduleReceiver.class, true);
                    W0.d.a(kVar.f3991j, kVar.f3992k, kVar.f3994m);
                }
                hVar.z(V0.r.f3835v);
            } finally {
                workDatabase.j();
            }
        } catch (Throwable th) {
            hVar.z(new V0.o(th));
        }
    }
}
