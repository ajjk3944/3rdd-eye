package bp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.cta.CtaSettings;
import com.survicate.surveys.entities.survey.questions.cta.SurveyCtaSurveyPoint;
import com.survicate.surveys.presentation.widget.QuestionHeaderBindingData;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SurveyCtaSurveyPoint f2845a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2846b;

    /* renamed from: c, reason: collision with root package name */
    public final QuestionHeaderBindingData f2847c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2848d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2849e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2850f;

    /* renamed from: g, reason: collision with root package name */
    public final CtaSettings f2851g;

    public c(SurveyCtaSurveyPoint surveyCtaSurveyPoint, o oVar, QuestionHeaderBindingData questionHeaderBindingData, j jVar, boolean z10, boolean z11) {
        this.f2845a = surveyCtaSurveyPoint;
        this.f2846b = oVar;
        this.f2847c = questionHeaderBindingData;
        this.f2848d = jVar;
        this.f2849e = z10;
        this.f2850f = z11;
        this.f2851g = surveyCtaSurveyPoint.getCtaSettings();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f2845a, cVar.f2845a) && l.a(this.f2846b, cVar.f2846b) && l.a(this.f2847c, cVar.f2847c) && l.a(this.f2848d, cVar.f2848d) && this.f2849e == cVar.f2849e && this.f2850f == cVar.f2850f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f2848d.hashCode() + ((this.f2847c.hashCode() + ((this.f2846b.hashCode() + (this.f2845a.hashCode() * 31)) * 31)) * 31)) * 31;
        boolean z10 = this.f2849e;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f2850f;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(surveyPoint=");
        sb2.append(this.f2845a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f2846b);
        sb2.append(", questionHeaderBindingData=");
        sb2.append(this.f2847c);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f2848d);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f2849e);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f2850f, ')');
    }
}
