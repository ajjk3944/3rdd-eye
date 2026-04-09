package ip;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f12896a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f12897b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12898c;

    public c(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f12896a = surveyQuestionSurveyPoint;
        this.f12897b = questionHeaderBindingData;
        this.f12898c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f12896a, cVar.f12896a) && l.a(this.f12897b, cVar.f12897b) && l.a(this.f12898c, cVar.f12898c);
    }

    public final int hashCode() {
        return this.f12898c.hashCode() + ((this.f12897b.hashCode() + (this.f12896a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f12896a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f12897b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f12898c, ')');
    }
}
