package c2;

import T1.C1598j;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.q;
import java.util.HashSet;

/* compiled from: EnqueueRunnable.java */
/* renamed from: c2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC2058h implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final String f18417d = androidx.work.m.g("EnqueueRunnable");

    /* renamed from: b, reason: collision with root package name */
    public final T1.s f18418b;

    /* renamed from: c, reason: collision with root package name */
    public final C1598j f18419c;

    public RunnableC2058h(T1.s sVar, C1598j c1598j) {
        this.f18418b = sVar;
        this.f18419c = c1598j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b5  */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(T1.s r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.RunnableC2058h.a(T1.s):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1598j c1598j = this.f18419c;
        T1.s sVar = this.f18418b;
        try {
            sVar.getClass();
            T1.z zVar = sVar.f12212b;
            if (T1.s.j0(sVar, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + sVar + ")");
            }
            WorkDatabase workDatabase = zVar.f12232c;
            workDatabase.c();
            try {
                C2059i.a(workDatabase, zVar.f12231b, sVar);
                boolean zA = a(sVar);
                workDatabase.r();
                if (zA) {
                    o.a(zVar.f12230a, RescheduleReceiver.class, true);
                    T1.q.b(zVar.f12231b, zVar.f12232c, zVar.f12234e);
                }
                c1598j.a(androidx.work.q.f17018a);
            } finally {
                workDatabase.n();
            }
        } catch (Throwable th) {
            c1598j.a(new q.a.C0272a(th));
        }
    }
}
