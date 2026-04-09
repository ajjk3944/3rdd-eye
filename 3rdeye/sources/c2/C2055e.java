package c2;

import androidx.work.impl.WorkDatabase;
import b2.C1823d;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* renamed from: c2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2055e extends AbstractRunnableC2056f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T1.z f18415c;

    public C2055e(T1.z zVar) {
        this.f18415c = zVar;
    }

    @Override // c2.AbstractRunnableC2056f
    public final void b() {
        T1.z zVar = this.f18415c;
        WorkDatabase workDatabase = zVar.f12232c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.y().o().iterator();
            while (it.hasNext()) {
                AbstractRunnableC2056f.a(zVar, (String) it.next());
            }
            WorkDatabase workDatabase2 = zVar.f12232c;
            zVar.f12231b.f16867c.getClass();
            workDatabase2.t().b(new C1823d("last_cancel_all_time_ms", Long.valueOf(System.currentTimeMillis())));
            workDatabase.r();
            workDatabase.n();
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}
