package ch;

import h9.p;
import i.g0;
import p.v2;

/* loaded from: classes.dex */
public final class l extends d {
    public static cj.a A5;

    /* renamed from: t5, reason: collision with root package name */
    public static final l f3962t5 = new l();

    /* renamed from: u5, reason: collision with root package name */
    public static g0 f3963u5;

    /* renamed from: v5, reason: collision with root package name */
    public static ai.g f3964v5;

    /* renamed from: w5, reason: collision with root package name */
    public static ai.g f3965w5;

    /* renamed from: x5, reason: collision with root package name */
    public static ai.g f3966x5;

    /* renamed from: y5, reason: collision with root package name */
    public static v2 f3967y5;

    /* renamed from: z5, reason: collision with root package name */
    public static cj.a f3968z5;

    @Override // ch.d
    public final v2 M0() {
        if (f3967y5 == null) {
            qj.a aVarV = v();
            if (f3964v5 == null) {
                f3964v5 = new ai.g(2);
            }
            ai.g gVar = f3964v5;
            if (gVar == null) {
                br.l.l("taskInfoMapper");
                throw null;
            }
            if (f3965w5 == null) {
                f3965w5 = new ai.g(3);
            }
            ai.g gVar2 = f3965w5;
            if (gVar2 == null) {
                br.l.l("taskTableRowInfoMapper");
                throw null;
            }
            if (f3966x5 == null) {
                f3966x5 = new ai.g(1);
            }
            ai.g gVar3 = f3966x5;
            if (gVar3 == null) {
                br.l.l("jobResultTaskInfoMapper");
                throw null;
            }
            if (this.f3924x == null) {
                this.f3924x = new p(1);
            }
            p pVar = this.f3924x;
            if (pVar == null) {
                br.l.l("_runningTasksDataSource");
                throw null;
            }
            f3967y5 = new v2(aVarV, gVar, gVar2, gVar3, pVar, y0(), R());
        }
        v2 v2Var = f3967y5;
        if (v2Var != null) {
            return v2Var;
        }
        br.l.l("activeTasksRepository");
        throw null;
    }

    @Override // ch.d
    public final synchronized cj.a r() {
        cj.a aVar;
        try {
            if (f3968z5 == null) {
                f3968z5 = new cj.a(d(), E0(), (xh.a) this.f3819g5.getValue());
            }
            aVar = f3968z5;
            if (aVar == null) {
                br.l.l("crashReporter");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // ch.d
    public final cj.a u0() {
        if (A5 == null) {
            A5 = new cj.a(v(), new ee.f(29), new xj.j(0), new ai.g(29), new hi.a(3));
        }
        cj.a aVar = A5;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("qosResultsRepository");
        throw null;
    }
}
