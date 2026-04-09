package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ws implements Runnable {
    public static final String h = h80.f("EnqueueRunnable");
    public final w91 f;
    public final sj0 g = new sj0();

    public ws(w91 w91Var) {
        this.f = w91Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.w91 r20) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.a(w91):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        sj0 sj0Var = this.g;
        w91 w91Var = this.f;
        ha1 ha1Var = w91Var.j;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(w91Var.l);
            HashSet hashSetR0 = w91.r0(w91Var);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(w91Var.l);
                    z = false;
                    break;
                } else if (hashSetR0.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + w91Var + ")");
            }
            WorkDatabase workDatabase = ha1Var.r;
            workDatabase.c();
            try {
                boolean zA = a(w91Var);
                workDatabase.h();
                if (zA) {
                    yj0.a(ha1Var.p, RescheduleReceiver.class, true);
                    gt0.a(ha1Var.q, ha1Var.r, ha1Var.t);
                }
                sj0Var.a(sj0.c);
            } finally {
                workDatabase.f();
            }
        } catch (Throwable th) {
            sj0Var.a(new pj0(th));
        }
    }
}
