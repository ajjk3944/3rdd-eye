package vp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f23932a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f23933b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23934c;

    public b(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f23932a = surveyQuestionSurveyPoint;
        this.f23933b = questionHeaderBindingData;
        this.f23934c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f23932a, bVar.f23932a) && l.a(this.f23933b, bVar.f23933b) && l.a(this.f23934c, bVar.f23934c);
    }

    public final int hashCode() {
        return this.f23934c.hashCode() + ((this.f23933b.hashCode() + (this.f23932a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f23932a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f23933b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f23934c, ')');
    }
}
