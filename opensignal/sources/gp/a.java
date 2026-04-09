package gp;

import br.l;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyFormSurveyPoint f9630a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f9631b;

    public a(SurveyFormSurveyPoint surveyFormSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData) {
        this.f9630a = surveyFormSurveyPoint;
        this.f9631b = questionHeaderBindingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f9630a, aVar.f9630a) && l.a(this.f9631b, aVar.f9631b);
    }

    public final int hashCode() {
        return this.f9631b.hashCode() + (this.f9630a.hashCode() * 31);
    }

    public final String toString() {
        return "BindingData(surveyPoint=" + this.f9630a + ", questionHeaderBindingData=" + this.f9631b + ')';
    }
}
