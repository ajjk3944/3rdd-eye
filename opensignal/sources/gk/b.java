package gk;

import androidx.lifecycle.o;
import br.l;
import ch.n;

/* loaded from: classes.dex */
public final class b extends o {
    @Override // androidx.lifecycle.o
    public final c f1(c cVar, int i10, long j) {
        l.e(cVar, "schedule");
        n.b("RollingWindowScheduleMe", "getNextSchedule() called with: schedule = " + cVar + ", runCount = " + i10 + ", successfulExecutionTime = " + j);
        return c.a(cVar, 0L, 0L, j, j + cVar.f9618d, i10, false, 7487);
    }
}
