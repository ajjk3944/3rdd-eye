package mp;

import br.l;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyNpsSurveyPoint f16903a;

    /* renamed from: b, reason: collision with root package name */
    public final QuestionHeaderBindingData f16904b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16905c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16906d;

    public b(SurveyNpsSurveyPoint surveyNpsSurveyPoint, QuestionHeaderBindingData questionHeaderBindingData, String str, int i10) {
        this.f16903a = surveyNpsSurveyPoint;
        this.f16904b = questionHeaderBindingData;
        this.f16905c = str;
        this.f16906d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f16903a, bVar.f16903a) && l.a(this.f16904b, bVar.f16904b) && l.a(this.f16905c, bVar.f16905c) && this.f16906d == bVar.f16906d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f16906d) + c7.a.g(this.f16905c, (this.f16904b.hashCode() + (this.f16903a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f16903a);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f16904b);
        sb2.append(", commentHint=");
        sb2.append(this.f16905c);
        sb2.append(", screenWidth=");
        return c7.a.q(sb2, this.f16906d, ')');
    }
}
