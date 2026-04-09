package wo;

import a8.j;
import br.l;
import bu.n;
import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.SurveySettings;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.entities.survey.surveyLogic.SurveyLogicOperator;
import com.survicate.surveys.entities.survey.surveyLogic.display.DisplayLogic;
import com.survicate.surveys.infrastructure.network.ai.FollowUpQuestionRepository;
import com.survicate.surveys.infrastructure.network.ai.SurvicateFollowUpQuestionRepository;
import h7.h0;
import h7.r1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import lf.t1;
import mq.f0;
import mq.o;
import mq.p;
import mq.y;
import sm.m;
import un.k;
import wt.d0;
import wt.q;
import wt.w;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final om.f f24550a;

    /* renamed from: b, reason: collision with root package name */
    public final on.e f24551b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.g f24552c;

    /* renamed from: d, reason: collision with root package name */
    public final om.f f24553d;

    /* renamed from: e, reason: collision with root package name */
    public final i5.c f24554e;

    /* renamed from: f, reason: collision with root package name */
    public final cg.e f24555f;

    /* renamed from: g, reason: collision with root package name */
    public final sm.f f24556g;

    /* renamed from: h, reason: collision with root package name */
    public final r1 f24557h;

    /* renamed from: i, reason: collision with root package name */
    public final m f24558i;
    public final FollowUpQuestionRepository j;
    public final no.b k;

    /* renamed from: l, reason: collision with root package name */
    public final wn.a f24559l;

    /* renamed from: m, reason: collision with root package name */
    public final q f24560m;

    /* renamed from: n, reason: collision with root package name */
    public final no.a f24561n;

    /* renamed from: o, reason: collision with root package name */
    public Survey f24562o;

    /* renamed from: p, reason: collision with root package name */
    public final HashMap f24563p;

    /* renamed from: q, reason: collision with root package name */
    public final Stack f24564q;

    /* renamed from: r, reason: collision with root package name */
    public String f24565r;

    /* renamed from: s, reason: collision with root package name */
    public Object f24566s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f24567t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24568u;

    /* renamed from: v, reason: collision with root package name */
    public Object f24569v;

    /* renamed from: w, reason: collision with root package name */
    public Object f24570w;

    public d(om.f fVar, on.e eVar, a2.g gVar, om.f fVar2, i5.c cVar, cg.e eVar2, sm.f fVar3, r1 r1Var, m mVar, sn.d dVar, SurvicateFollowUpQuestionRepository survicateFollowUpQuestionRepository, no.b bVar, h0 h0Var, g4.a aVar) {
        l.e(eVar, "answersManager");
        l.e(gVar, "displayDesignEngine");
        l.e(fVar2, "textRecallingManager");
        l.e(cVar, "surveyStore");
        l.e(eVar2, "surveyAnswerFactory");
        l.e(fVar3, "urlBuilder");
        l.e(r1Var, "viewDependencies");
        l.e(mVar, "surveyLogic");
        l.e(dVar, "displayLogic");
        l.e(survicateFollowUpQuestionRepository, "followUpQuestionRepository");
        l.e(bVar, "logger");
        l.e(h0Var, "localeProvider");
        l.e(aVar, "workspaceKeyProvider");
        du.f fVar4 = d0.f24610a;
        xt.c cVar2 = n.f2983a;
        l.e(cVar2, "mainDispatcher");
        this.f24550a = fVar;
        this.f24551b = eVar;
        this.f24552c = gVar;
        this.f24553d = fVar2;
        this.f24554e = cVar;
        this.f24555f = eVar2;
        this.f24556g = fVar3;
        this.f24557h = r1Var;
        this.f24558i = mVar;
        this.j = survicateFollowUpQuestionRepository;
        this.k = bVar;
        this.f24559l = h0Var;
        this.f24560m = cVar2;
        this.f24561n = new no.a(2, false);
        this.f24563p = new HashMap();
        this.f24564q = new Stack();
        this.f24566s = y.f16947a;
        this.f24569v = c.f24548r;
        this.f24570w = c.f24547g;
    }

    public static Integer b(Survey survey, long j) {
        int size = survey.getPoints().size();
        for (int i10 = 0; i10 < size; i10++) {
            if (survey.getPoints().get(i10).getId() == j) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /* JADX WARN: Type inference failed for: r10v14, types: [ar.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r10) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wo.d.a(boolean):void");
    }

    public final boolean c() {
        SurveySettings settings;
        Survey survey = this.f24562o;
        if (survey == null || (settings = survey.getSettings()) == null) {
            return true;
        }
        return l.a(settings.getPresentationStyle(), "fullscreen");
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Set] */
    public final void d(on.a aVar) {
        this.f24568u = true;
        e eVar = aVar.f19558a;
        SurveyPoint surveyPoint = aVar.f19559b;
        if (eVar.f24571a.isEmpty()) {
            throw new IllegalArgumentException("The answer list must not be empty to comply with backend contract.");
        }
        this.f24566s = f0.O(this.f24566s, Long.valueOf(surveyPoint.getId()));
        w.s(w.b(this.f24560m), null, null, new j(eVar, this, surveyPoint, aVar, null), 3);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Iterable, java.lang.Object] */
    public final SurveyPoint e(e eVar) {
        Integer numValueOf;
        Iterable iterable;
        rn.a aVarJ;
        k kVar;
        rn.a aVarJ2;
        rn.a aVarJ3;
        rn.a aVarJ4;
        Object next;
        Survey survey = this.f24562o;
        no.b bVar = this.k;
        if (survey == null) {
            new IllegalStateException("Current survey is null. It's an internal error.");
            ((sm.f) bVar).getClass();
            return null;
        }
        if (survey.getPoints().isEmpty()) {
            ((sm.f) bVar).M("Survey " + survey.getName() + '(' + survey.getId() + ") has no questions to show.");
            return null;
        }
        if (eVar == null) {
            return survey.getPoints().get(0);
        }
        Long l10 = eVar.f24572b;
        if (l10 != null) {
            numValueOf = b(survey, l10.longValue());
        } else {
            Integer numB = b(survey, eVar.f24573c);
            numValueOf = (numB == null || numB.intValue() + 1 >= survey.getPoints().size()) ? null : Integer.valueOf(numB.intValue() + 1);
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            ?? r12 = this.f24554e.f11238a;
            ArrayList arrayList = new ArrayList(p.a0(r12, 10));
            Iterator it = r12.iterator();
            while (it.hasNext()) {
                arrayList.add(((uo.b) it.next()).f23618c);
            }
            Survey survey2 = this.f24562o;
            if (survey2 == null) {
                iterable = mq.w.f16945a;
            } else {
                List<SurveyPoint> listSubList = survey2.getPoints().subList(iIntValue, survey2.getPoints().size());
                ArrayList arrayList2 = new ArrayList(p.a0(listSubList, 10));
                for (SurveyPoint surveyPoint : listSubList) {
                    l.e(surveyPoint, "<this>");
                    if (surveyPoint instanceof SurveyCtaSurveyPoint) {
                        long id2 = surveyPoint.getId();
                        SurveyCtaSurveyPoint surveyCtaSurveyPoint = (SurveyCtaSurveyPoint) surveyPoint;
                        SurveyLogicOperator displayLogicOperator = surveyCtaSurveyPoint.getCtaSettings().getDisplayLogicOperator();
                        if (displayLogicOperator == null || (aVarJ4 = t1.J(displayLogicOperator)) == null) {
                            aVarJ4 = rn.a.AND;
                        }
                        List<DisplayLogic> displayLogic = surveyCtaSurveyPoint.getCtaSettings().getDisplayLogic();
                        ArrayList arrayList3 = new ArrayList(p.a0(displayLogic, 10));
                        Iterator<T> it2 = displayLogic.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(t1.I((DisplayLogic) it2.next()));
                        }
                        kVar = new k(id2, arrayList3, aVarJ4);
                    } else if (surveyPoint instanceof SurveyFormSurveyPoint) {
                        long id3 = surveyPoint.getId();
                        SurveyFormSurveyPoint surveyFormSurveyPoint = (SurveyFormSurveyPoint) surveyPoint;
                        SurveyLogicOperator displayLogicOperator2 = surveyFormSurveyPoint.getSettings().getDisplayLogicOperator();
                        if (displayLogicOperator2 == null || (aVarJ3 = t1.J(displayLogicOperator2)) == null) {
                            aVarJ3 = rn.a.AND;
                        }
                        List<DisplayLogic> displayLogic2 = surveyFormSurveyPoint.getSettings().getDisplayLogic();
                        ArrayList arrayList4 = new ArrayList(p.a0(displayLogic2, 10));
                        Iterator<T> it3 = displayLogic2.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(t1.I((DisplayLogic) it3.next()));
                        }
                        kVar = new k(id3, arrayList4, aVarJ3);
                    } else if (surveyPoint instanceof SurveyNpsSurveyPoint) {
                        long id4 = surveyPoint.getId();
                        SurveyNpsSurveyPoint surveyNpsSurveyPoint = (SurveyNpsSurveyPoint) surveyPoint;
                        SurveyLogicOperator displayLogicOperator3 = surveyNpsSurveyPoint.getSettings().getDisplayLogicOperator();
                        if (displayLogicOperator3 == null || (aVarJ2 = t1.J(displayLogicOperator3)) == null) {
                            aVarJ2 = rn.a.AND;
                        }
                        List<DisplayLogic> displayLogic3 = surveyNpsSurveyPoint.getSettings().getDisplayLogic();
                        ArrayList arrayList5 = new ArrayList(p.a0(displayLogic3, 10));
                        Iterator<T> it4 = displayLogic3.iterator();
                        while (it4.hasNext()) {
                            arrayList5.add(t1.I((DisplayLogic) it4.next()));
                        }
                        kVar = new k(id4, arrayList5, aVarJ2);
                    } else {
                        if (!(surveyPoint instanceof SurveyQuestionSurveyPoint)) {
                            throw new IllegalArgumentException("Unsupported survey point");
                        }
                        long id5 = surveyPoint.getId();
                        SurveyQuestionSurveyPoint surveyQuestionSurveyPoint = (SurveyQuestionSurveyPoint) surveyPoint;
                        SurveyLogicOperator displayLogicOperator4 = surveyQuestionSurveyPoint.getSettings().getDisplayLogicOperator();
                        if (displayLogicOperator4 == null || (aVarJ = t1.J(displayLogicOperator4)) == null) {
                            aVarJ = rn.a.AND;
                        }
                        List<DisplayLogic> displayLogic4 = surveyQuestionSurveyPoint.getSettings().getDisplayLogic();
                        ArrayList arrayList6 = new ArrayList(p.a0(displayLogic4, 10));
                        Iterator<T> it5 = displayLogic4.iterator();
                        while (it5.hasNext()) {
                            arrayList6.add(t1.I((DisplayLogic) it5.next()));
                        }
                        kVar = new k(id5, arrayList6, aVarJ);
                    }
                    arrayList2.add(kVar);
                }
                iterable = arrayList2;
            }
            ArrayList arrayListP0 = o.p0(arrayList);
            Iterator it6 = iterable.iterator();
            loop1: while (true) {
                if (!it6.hasNext()) {
                    next = null;
                    break;
                }
                next = it6.next();
                k kVar2 = (k) next;
                l.e(kVar2, "<this>");
                ArrayList arrayList7 = kVar2.f23614c;
                if (arrayList7.isEmpty()) {
                    break;
                }
                int i10 = un.l.f23615a[kVar2.f23613b.ordinal()];
                if (i10 == 1) {
                    if (!arrayList7.isEmpty()) {
                        Iterator it7 = arrayList7.iterator();
                        while (it7.hasNext()) {
                            sn.c cVar = (sn.c) it7.next();
                            if (arrayListP0.isEmpty()) {
                                break;
                            }
                            Iterator it8 = arrayListP0.iterator();
                            while (it8.hasNext()) {
                                un.j jVar = (un.j) it8.next();
                                if (jVar.a() != cVar.a() || !cVar.b(jVar)) {
                                }
                            }
                        }
                        break loop1;
                    }
                    break;
                }
                if (i10 != 2) {
                    throw new bf.n();
                }
                if (!arrayList7.isEmpty()) {
                    Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        sn.c cVar2 = (sn.c) it9.next();
                        if (!arrayListP0.isEmpty()) {
                            Iterator it10 = arrayListP0.iterator();
                            while (it10.hasNext()) {
                                un.j jVar2 = (un.j) it10.next();
                                if (jVar2.a() == cVar2.a() && cVar2.b(jVar2)) {
                                    break loop1;
                                }
                            }
                        }
                    }
                } else {
                    continue;
                }
            }
            k kVar3 = (k) next;
            Long lValueOf = kVar3 != null ? Long.valueOf(kVar3.f23612a) : null;
            numValueOf = lValueOf != null ? b(survey, lValueOf.longValue()) : null;
        }
        if (numValueOf != null) {
            return survey.getPoints().get(numValueOf.intValue());
        }
        return null;
    }

    public final boolean f() {
        SurveySettings settings;
        Survey survey = this.f24562o;
        if (survey == null || (settings = survey.getSettings()) == null) {
            return true;
        }
        return settings.getHideFooter();
    }
}
