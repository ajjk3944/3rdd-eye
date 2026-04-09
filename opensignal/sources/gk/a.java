package gk;

import androidx.lifecycle.o;
import br.l;
import ch.n;

/* loaded from: classes.dex */
public final class a extends o {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9611g;

    /* renamed from: r, reason: collision with root package name */
    public final df.c f9612r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(df.c cVar, int i10) {
        super(9, cVar);
        this.f9611g = i10;
        this.f9612r = cVar;
    }

    @Override // androidx.lifecycle.o
    public final c f1(c cVar, int i10, long j) {
        long j7;
        long j10;
        switch (this.f9611g) {
            case 0:
                l.e(cVar, "schedule");
                return c.a(cVar, 0L, 0L, j, -1L, i10, false, 7487);
            default:
                l.e(cVar, "schedule");
                long j11 = cVar.f9618d;
                long j12 = cVar.f9623i;
                n.b("FixedWindowSchedule", "getNextSchedule() called with: schedule = " + cVar + ", runCount = " + i10 + ", successfulExecutionTime = " + j);
                long j13 = cVar.f9616b;
                long j14 = cVar.f9617c;
                long j15 = (((long) i10) * j11) + j13 + j14;
                this.f9612r.getClass();
                if (j15 < System.currentTimeMillis()) {
                    n.b("FixedWindowSchedule", "Schedule is in the past");
                    n.b("FixedWindowSchedule", "Milliseconds behind: " + (System.currentTimeMillis() - j15));
                    int i11 = i10;
                    while (true) {
                        j7 = j11;
                        long j16 = (i11 * j7) + j13 + j14;
                        n.b("FixedWindowSchedule", "New time for window pos " + i11 + " is " + j16);
                        i11++;
                        if (j16 >= System.currentTimeMillis()) {
                            j10 = j16;
                        } else {
                            j11 = j7;
                        }
                    }
                } else {
                    j7 = j11;
                    j10 = j15;
                }
                long j17 = j10 - j;
                long j18 = j12 >= j7 ? j7 : j12;
                long j19 = j17 < j18 ? (j18 - j17) + j10 : j10;
                n.b("FixedWindowSchedule", c7.a.m(j15, "scheduleExecutionTime: "));
                n.b("FixedWindowSchedule", "schedule.timeAddedInMillis: " + j13);
                n.b("FixedWindowSchedule", "schedule.initialDelayInMillis: " + j14);
                n.b("FixedWindowSchedule", "schedule.spacingDelayInMillis: " + j12);
                n.b("FixedWindowSchedule", "schedule.repeatPeriodInMillis: " + j7);
                n.b("FixedWindowSchedule", "windowAdjustedTime: " + j10);
                n.b("FixedWindowSchedule", "timeBetweenExecutions: " + j17);
                n.b("FixedWindowSchedule", "spacingAdjustment: " + j18);
                StringBuilder sb2 = new StringBuilder("spaceAdjustedExecutionTime: ");
                long j20 = j19;
                sb2.append(j20);
                n.b("FixedWindowSchedule", sb2.toString());
                return c.a(cVar, 0L, 0L, j, j20, i10, false, 7487);
        }
    }

    @Override // androidx.lifecycle.o
    public boolean j1(c cVar) {
        switch (this.f9611g) {
            case 0:
                l.e(cVar, "schedule");
                n.b("EventBasedScheduleMecha", "isReadyForNextExecution() called with: schedule = " + cVar);
                int i10 = cVar.j;
                df.c cVar2 = this.f9612r;
                if (i10 <= 0) {
                    cVar2.getClass();
                    if (System.currentTimeMillis() <= cVar.f9616b + cVar.f9617c) {
                        return false;
                    }
                } else {
                    cVar2.getClass();
                    if (System.currentTimeMillis() <= cVar.f9621g + cVar.f9623i) {
                        return false;
                    }
                }
                return true;
            default:
                return super.j1(cVar);
        }
    }
}
