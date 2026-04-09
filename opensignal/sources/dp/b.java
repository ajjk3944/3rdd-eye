package dp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import com.survicate.surveys.utils.SurvicateLocalDate;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f7422a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f7423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7424c;

    /* renamed from: d, reason: collision with root package name */
    public final SurvicateLocalDate f7425d;

    public b(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str, SurvicateLocalDate survicateLocalDate) {
        this.f7422a = surveyQuestionSurveyPoint;
        this.f7423b = questionHeaderBindingData;
        this.f7424c = str;
        this.f7425d = survicateLocalDate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f7422a, bVar.f7422a) && l.a(this.f7423b, bVar.f7423b) && l.a(this.f7424c, bVar.f7424c) && l.a(this.f7425d, bVar.f7425d);
    }

    public final int hashCode() {
        return this.f7425d.hashCode() + c7.a.g(this.f7424c, (this.f7423b.hashCode() + (this.f7422a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "BindingData(surveyPoint=" + this.f7422a + ", questionHeaderBindingData=" + this.f7423b + ", commentHint=" + this.f7424c + ", initialDate=" + this.f7425d + ')';
    }
}
