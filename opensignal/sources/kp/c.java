package kp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f14470a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f14471b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14472c;

    public c(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str) {
        this.f14470a = surveyQuestionSurveyPoint;
        this.f14471b = questionHeaderBindingData;
        this.f14472c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f14470a, cVar.f14470a) && l.a(this.f14471b, cVar.f14471b) && l.a(this.f14472c, cVar.f14472c);
    }

    public final int hashCode() {
        return this.f14472c.hashCode() + ((this.f14471b.hashCode() + (this.f14470a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f14470a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f14471b);
        sb2.append(", commentHint=");
        return h0.b.r(sb2, this.f14472c, ')');
    }
}
