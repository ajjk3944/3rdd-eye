package cq;

import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import as.x;
import br.a0;
import com.survicate.surveys.SurveyActivity;
import com.survicate.surveys.entities.models.ContactAction;
import com.survicate.surveys.entities.models.RespondentEvent;
import com.survicate.surveys.entities.models.SurveyPointDisplayRequest;
import com.survicate.surveys.entities.survey.EventTrigger;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.Workspace;
import com.survicate.surveys.entities.survey.WorkspaceKt;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.theme.ThemeType;
import h7.h0;
import h9.r2;
import io.sentry.android.core.u0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kg.r;
import mq.f0;
import mq.t;
import mq.y;
import wt.t0;
import wt.w;
import wt.z;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final wo.d f6633a;

    /* renamed from: b, reason: collision with root package name */
    public final g1.f f6634b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.f f6635c;

    /* renamed from: d, reason: collision with root package name */
    public final g1.f f6636d;

    /* renamed from: e, reason: collision with root package name */
    public final uo.a f6637e;

    /* renamed from: f, reason: collision with root package name */
    public final r2 f6638f;

    /* renamed from: g, reason: collision with root package name */
    public final of.b f6639g;

    /* renamed from: h, reason: collision with root package name */
    public final io.sentry.hints.i f6640h;

    /* renamed from: i, reason: collision with root package name */
    public final uo.c f6641i;
    public final to.d j;
    public final bm.d k;

    /* renamed from: l, reason: collision with root package name */
    public final gq.a f6642l;

    /* renamed from: m, reason: collision with root package name */
    public final iq.f f6643m;

    /* renamed from: n, reason: collision with root package name */
    public final no.b f6644n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6645o;

    /* renamed from: p, reason: collision with root package name */
    public List f6646p;

    /* renamed from: q, reason: collision with root package name */
    public Workspace f6647q;

    public n(wo.d dVar, g1.f fVar, g1.f fVar2, g1.f fVar3, on.k kVar, r2 r2Var, of.b bVar, io.sentry.hints.i iVar, uo.c cVar, to.d dVar2, et.d dVar3, bm.d dVar4, on.k kVar2, iq.f fVar4, no.b bVar2, on.k kVar3, h0 h0Var, iq.b bVar3, xt.c cVar2) {
        br.l.e(dVar, "displayEngine");
        br.l.e(fVar, "activeScreenStore");
        br.l.e(fVar2, "activeEventStore");
        br.l.e(fVar3, "presentationStateStore");
        br.l.e(kVar, "activeEventHistoryStore");
        br.l.e(r2Var, "screenDelayTargeting");
        br.l.e(bVar, "eventDelayTargeting");
        br.l.e(iVar, "timeIntervalTargeting");
        br.l.e(cVar, "suggestionsRepository");
        br.l.e(dVar2, "contactsRepository");
        br.l.e(dVar3, "backendTargetingResultLoader");
        br.l.e(dVar4, "backendTargetingResultStore");
        br.l.e(kVar2, "presentationTimesProvider");
        br.l.e(fVar4, "timestampProvider");
        br.l.e(bVar2, "logger");
        br.l.e(kVar3, "persistenceManager");
        br.l.e(h0Var, "localeProvider");
        br.l.e(bVar3, "screenOrientationProvider");
        br.l.e(cVar2, "mainDispatcher");
        this.f6633a = dVar;
        this.f6634b = fVar;
        this.f6635c = fVar2;
        this.f6636d = fVar3;
        this.f6637e = kVar;
        this.f6638f = r2Var;
        this.f6639g = bVar;
        this.f6640h = iVar;
        this.f6641i = cVar;
        this.j = dVar2;
        this.k = dVar4;
        this.f6642l = kVar2;
        this.f6643m = fVar4;
        this.f6644n = bVar2;
        w.b(se.b.M(cVar2, w.c()));
        this.f6645o = new Object();
        this.f6646p = mq.w.f16945a;
        int i10 = 0;
        dVar.f24570w = new bp.a(0, this, n.class, "challengeSurveys", "challengeSurveys()V", i10, 6);
        kVar3.f19640d.b(new l(0, new m(this, i10)));
        kVar3.f19641e.b(new l(1, new m(this, 1)));
        ((no.a) h0Var.f10078a).b(new l(2, new m(this, 2)));
        ((a0) ((r) bVar3).f14397g).b(new l(3, new m(this, 3)));
        bVar.B = new x(8, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Set] */
    public static final void a(n nVar, Workspace workspace) {
        of.b bVar = nVar.f6639g;
        r2 r2Var = nVar.f6638f;
        mq.w wVar = mq.w.f16945a;
        if (workspace == null) {
            z zVar = (z) r2Var.f10474x;
            if (zVar != null) {
                zVar.h(null);
            }
            z zVar2 = (z) r2Var.f10475y;
            if (zVar2 != null) {
                zVar2.h(null);
            }
            r2Var.f10473r = y.f16947a;
            z zVar3 = (z) bVar.f19426y;
            if (zVar3 != null) {
                zVar3.h(null);
            }
            bVar.f19424r = wVar;
            bVar.f19425x = wVar;
            return;
        }
        Set<i> screenDelayTriggers = WorkspaceKt.getScreenDelayTriggers(workspace);
        r2Var.getClass();
        br.l.e(screenDelayTriggers, "triggers");
        r2Var.f10473r = screenDelayTriggers;
        z zVar4 = (z) r2Var.f10474x;
        if (zVar4 != null) {
            zVar4.h(null);
        }
        r2Var.q1(nVar.f6634b.f9210g, new bp.a(0, nVar, n.class, "challengeSurveys", "challengeSurveys()V", 0, 8));
        List<f> eventDelayTriggers = WorkspaceKt.getEventDelayTriggers(workspace);
        bVar.getClass();
        br.l.e(eventDelayTriggers, "triggers");
        if (mq.o.U0((List) bVar.f19424r).equals(mq.o.U0(eventDelayTriggers))) {
            return;
        }
        z zVar5 = (z) bVar.f19426y;
        if (zVar5 != null) {
            zVar5.h(null);
        }
        bVar.f19424r = eventDelayTriggers;
        bVar.f19425x = wVar;
    }

    public static final void b(n nVar, Workspace workspace) {
        uo.c cVar = nVar.f6641i;
        if (workspace != null) {
            so.g gVar = (so.g) cVar;
            gVar.getClass();
            gVar.f22189e = workspace.getEventSuggestions();
            gVar.f22191g = workspace.getEventSuggestionsEnabled();
            return;
        }
        so.g gVar2 = (so.g) cVar;
        mq.w wVar = mq.w.f16945a;
        gVar2.f22189e = wVar;
        gVar2.f22190f = wVar;
        gVar2.f22191g = false;
        gVar2.f22192h = false;
        t0 t0Var = (t0) gVar2.f22188d.f2960a.Y(wt.r.f24653d);
        if (t0Var != null) {
            Iterator it = t0Var.f().iterator();
            while (it.hasNext()) {
                ((t0) it.next()).h(null);
            }
        }
    }

    public final boolean c(a aVar) {
        List list = this.f6646p;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t.d0(arrayList, ((Survey) it.next()).getDisplayFilters());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof fq.b) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            return false;
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            fq.b bVar = (fq.b) it3.next();
            bVar.getClass();
            List<EventTrigger> list2 = bVar.f9026b;
            if (list2 == null || !list2.isEmpty()) {
                for (EventTrigger eventTrigger : list2) {
                    if (eventTrigger.getSettings().getDelay() != null && br.l.a(eventTrigger.getName(), aVar.f6606a) && ba.m.b(eventTrigger, aVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void d() {
        synchronized (this.f6645o) {
            try {
                bm.d dVar = this.k;
                yn.b bVar = yn.b.LOCAL;
                dVar.getClass();
                br.l.e(bVar, "<set-?>");
                List list = this.f6646p;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((Survey) obj).canBeDisplayed()) {
                        arrayList.add(obj);
                    }
                }
                ((sm.f) this.f6644n).M("Surveys approved locally: " + arrayList.size());
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((Survey) next).isContactMode()) {
                        arrayList2.add(next);
                    } else {
                        arrayList3.add(next);
                    }
                }
                if (arrayList3.isEmpty()) {
                    arrayList2.isEmpty();
                } else {
                    e(arrayList3);
                }
                this.f6635c.f9212x = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object next;
        Map mapE = ((on.k) this.f6642l).f19637a.E("lastPresentationTimesKey");
        Iterator it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Long l10 = (Long) mapE.get(((Survey) next).getId());
                long jLongValue = l10 != null ? l10.longValue() : 0L;
                do {
                    Object next2 = it.next();
                    Long l11 = (Long) mapE.get(((Survey) next2).getId());
                    long jLongValue2 = l11 != null ? l11.longValue() : 0L;
                    if (jLongValue > jLongValue2) {
                        next = next2;
                        jLongValue = jLongValue2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Survey survey = (Survey) next;
        if (survey == null) {
            return;
        }
        wo.d dVar = this.f6633a;
        if (dVar.f24562o != null) {
            return;
        }
        ((sm.f) this.f6644n).M("Survey ready to show: " + survey);
        this.f6636d.f9208a = true;
        survey.resetState();
        dVar.f24562o = survey;
        a2.g gVar = dVar.f24552c;
        ThemeType type = survey.getTheme().getType();
        gVar.getClass();
        br.l.e(type, "themeType");
        gVar.f31a = type;
        om.f fVar = dVar.f24550a;
        Object obj = ((WeakReference) fVar.f19554d).get();
        Application application = obj instanceof Application ? (Application) obj : null;
        if (application != null) {
            try {
                Intent intentAddFlags = new Intent(application, (Class<?>) SurveyActivity.class).addFlags(268435456);
                br.l.d(intentAddFlags, "addFlags(...)");
                application.startActivity(intentAddFlags);
            } catch (Exception unused) {
                ((sm.f) ((no.b) fVar.f19555g)).getClass();
            }
        }
        SurveyPoint surveyPointE = dVar.e(null);
        if (surveyPointE != null) {
            dVar.f24561n.g(new SurveyPointDisplayRequest(surveyPointE, false));
            dVar.f24564q.push(surveyPointE);
        } else {
            dVar.a(true);
        }
        on.e eVar = dVar.f24551b;
        no.b bVar = eVar.f19607e;
        on.k kVar = eVar.f19603a;
        ConcurrentHashMap concurrentHashMap = eVar.f19609g;
        String id2 = survey.getId();
        String string = UUID.randomUUID().toString();
        br.l.d(string, "toString(...)");
        concurrentHashMap.put(id2, string);
        try {
            String id3 = survey.getId();
            kVar.getClass();
            br.l.e(id3, "surveyId");
            boolean zContains = true ^ kVar.f19637a.F().contains(id3);
            String string2 = UUID.randomUUID().toString();
            br.l.d(string2, "toString(...)");
            RespondentEvent.SurveySeen surveySeen = new RespondentEvent.SurveySeen(string2, survey.getId(), zContains);
            so.h hVar = kVar.f19638b;
            so.e eVar2 = (so.e) hVar;
            eVar2.f22181a.edit().putString("surveySeenEventsToSend", eVar2.f22182b.serializeSurveySeenEvents(mq.o.F0(((so.e) hVar).b(), surveySeen))).apply();
            kVar.f19642f.g(((so.e) hVar).b());
            ((u0) eVar.f19606d).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            kVar.d(jCurrentTimeMillis, survey.getId());
            ((sm.f) bVar).M("`Seen` status of survey " + survey.getId() + " has been saved.");
            new ContactAction.SurveyInteraction.Interaction(survey.getId(), jCurrentTimeMillis, ContactAction.SurveyInteractionType.SEEN);
            eVar.f19605c.getClass();
            io.sentry.k kVar2 = eVar.f19604b;
            String id4 = survey.getId();
            kVar2.getClass();
            br.l.e(id4, "surveyId");
            ((Handler) kVar2.f12397d).post(new on.f(kVar2, id4, 0));
        } catch (Exception e4) {
            ((sm.f) bVar).N(e4, "Could not save the `seen` status of the survey");
        }
        dVar.f24568u = false;
        String id5 = survey.getId();
        bm.d dVar2 = this.k;
        dVar2.getClass();
        br.l.e(id5, "surveyId");
        dVar2.f2828r = f0.O((Set) dVar2.f2828r, id5);
    }
}
