package pp;

import br.l;
import com.survicate.surveys.entities.survey.questions.question.QuestionPointAnswer;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyQuestionSurveyPoint f20599a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f20600b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20601c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20602d;

    public a(SurveyQuestionSurveyPoint surveyQuestionSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str, int i10) {
        this.f20599a = surveyQuestionSurveyPoint;
        this.f20600b = questionHeaderBindingData;
        this.f20601c = str;
        this.f20602d = i10;
    }

    public final boolean a() {
        List<QuestionPointAnswer> answers = this.f20599a.getAnswers();
        if (answers != null && answers.isEmpty()) {
            return false;
        }
        Iterator<T> it = answers.iterator();
        while (it.hasNext()) {
            if (l.a(((QuestionPointAnswer) it.next()).getAddingCommentAvailable(), Boolean.TRUE)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f20599a, aVar.f20599a) && l.a(this.f20600b, aVar.f20600b) && l.a(this.f20601c, aVar.f20601c) && this.f20602d == aVar.f20602d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20602d) + c7.a.g(this.f20601c, (this.f20600b.hashCode() + (this.f20599a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f20599a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f20600b);
        sb2.append(", commentHint=");
        sb2.append(this.f20601c);
        sb2.append(", screenWidth=");
        return c7.a.q(sb2, this.f20602d, ')');
    }
}
