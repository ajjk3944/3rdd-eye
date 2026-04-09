package on;

import com.survicate.surveys.entities.survey.Workspace;
import com.survicate.surveys.infrastructure.network.RespondentApi;
import com.survicate.surveys.infrastructure.network.WorkspaceApi;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final WorkspaceApi f19628a;

    /* renamed from: b, reason: collision with root package name */
    public final RespondentApi f19629b;

    /* renamed from: c, reason: collision with root package name */
    public final k f19630c;

    /* renamed from: d, reason: collision with root package name */
    public final wn.a f19631d;

    /* renamed from: e, reason: collision with root package name */
    public final cq.o f19632e;

    /* renamed from: f, reason: collision with root package name */
    public final no.b f19633f;

    /* renamed from: g, reason: collision with root package name */
    public final bu.c f19634g;

    public i0(WorkspaceApi workspaceApi, RespondentApi respondentApi, k kVar, h7.h0 h0Var, cq.o oVar, no.b bVar) {
        br.l.e(workspaceApi, "workspaceApi");
        br.l.e(respondentApi, "respondentApi");
        br.l.e(kVar, "persistenceManager");
        br.l.e(h0Var, "localeProvider");
        br.l.e(oVar, "targetingFiltersFactory");
        br.l.e(bVar, "logger");
        du.f fVar = wt.d0.f24610a;
        du.e eVar = du.e.f7570g;
        br.l.e(eVar, "ioDispatcher");
        this.f19628a = workspaceApi;
        this.f19629b = respondentApi;
        this.f19630c = kVar;
        this.f19631d = h0Var;
        this.f19632e = oVar;
        this.f19633f = bVar;
        this.f19634g = wt.w.b(se.b.M(eVar, wt.w.c()));
    }

    public static final void a(i0 i0Var, Workspace workspace) {
        no.b bVar = i0Var.f19633f;
        try {
            String str = "Surveys to save: " + workspace.getSurveys();
            ((sm.f) bVar).getClass();
            br.l.e(str, "message");
            k kVar = i0Var.f19630c;
            kVar.getClass();
            kVar.f19639c.f9209d = workspace;
            kVar.f19640d.g(workspace);
            ((sm.f) bVar).getClass();
        } catch (Exception unused) {
            ((sm.f) bVar).getClass();
        }
    }
}
