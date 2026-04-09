package on;

import com.survicate.surveys.entities.survey.Survey;
import com.survicate.surveys.entities.survey.questions.SurveyPoint;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final wo.e f19558a;

    /* renamed from: b, reason: collision with root package name */
    public final SurveyPoint f19559b;

    /* renamed from: c, reason: collision with root package name */
    public final Survey f19560c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f19561d;

    public a(wo.e eVar, SurveyPoint surveyPoint, Survey survey, Boolean bool) {
        br.l.e(eVar, "answerAction");
        br.l.e(surveyPoint, "surveyPoint");
        br.l.e(survey, "survey");
        this.f19558a = eVar;
        this.f19559b = surveyPoint;
        this.f19560c = survey;
        this.f19561d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return br.l.a(this.f19558a, aVar.f19558a) && br.l.a(this.f19559b, aVar.f19559b) && br.l.a(this.f19560c, aVar.f19560c) && br.l.a(this.f19561d, aVar.f19561d);
    }

    public final int hashCode() {
        int iHashCode = (this.f19560c.hashCode() + ((this.f19559b.hashCode() + (this.f19558a.hashCode() * 31)) * 31)) * 31;
        Boolean bool = this.f19561d;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "AnswerDetails(answerAction=" + this.f19558a + ", surveyPoint=" + this.f19559b + ", survey=" + this.f19560c + ", disclaimerAccepted=" + this.f19561d + ')';
    }
}
