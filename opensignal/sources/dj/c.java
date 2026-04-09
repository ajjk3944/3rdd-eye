package dj;

import br.l;
import cj.n;
import jj.m0;

/* loaded from: classes.dex */
public final class c implements n {

    /* renamed from: a, reason: collision with root package name */
    public final ch.d f7388a;

    /* renamed from: d, reason: collision with root package name */
    public final long f7389d;

    /* renamed from: g, reason: collision with root package name */
    public final String f7390g;

    /* renamed from: r, reason: collision with root package name */
    public final String f7391r;

    /* renamed from: x, reason: collision with root package name */
    public final gk.c f7392x;

    /* renamed from: y, reason: collision with root package name */
    public final String f7393y;

    public c(ch.d dVar, long j, String str, String str2, gk.c cVar, String str3) {
        l.e(dVar, "serviceLocator");
        l.e(cVar, "schedule");
        this.f7388a = dVar;
        this.f7389d = j;
        this.f7390g = str;
        this.f7391r = str2;
        this.f7392x = cVar;
        this.f7393y = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f7388a, cVar.f7388a) && this.f7389d == cVar.f7389d && l.a(this.f7390g, cVar.f7390g) && l.a(this.f7391r, cVar.f7391r) && l.a(this.f7392x, cVar.f7392x) && l.a(this.f7393y, cVar.f7393y);
    }

    public final int hashCode() {
        return this.f7393y.hashCode() + ((this.f7392x.hashCode() + c7.a.g(this.f7391r, c7.a.g(this.f7390g, h0.b.b(this.f7388a.hashCode() * 31, 31, this.f7389d), 31), 31)) * 31);
    }

    @Override // cj.n
    public final void run() {
        ch.d dVar = this.f7388a;
        hk.h hVarM = dVar.L0().m(this.f7389d, this.f7390g, this.f7391r, this.f7392x);
        if (hVarM == null) {
            ch.n.c("ScheduleTaskCommand", "Task is null!");
            return;
        }
        String str = this.f7393y;
        if (!tt.l.D0(str)) {
            hVarM = hk.h.b(hVarM, 0L, str, null, null, null, false, null, -786459);
        }
        dVar.Q0().v(hVarM, false, m0.SCHEDULE_TASK_COMMAND_TRIGGER);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScheduleTaskCommand(serviceLocator=");
        sb2.append(this.f7388a);
        sb2.append(", id=");
        sb2.append(this.f7389d);
        sb2.append(", taskType=");
        sb2.append(this.f7390g);
        sb2.append(", jobName=");
        sb2.append(this.f7391r);
        sb2.append(", schedule=");
        sb2.append(this.f7392x);
        sb2.append(", taskNameOverride=");
        return h0.b.r(sb2, this.f7393y, ')');
    }
}
