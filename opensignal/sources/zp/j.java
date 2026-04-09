package zp;

import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final g f27512a;

    /* renamed from: b, reason: collision with root package name */
    public final o f27513b;

    /* renamed from: c, reason: collision with root package name */
    public final bq.j f27514c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27515d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27516e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointTextSettings f27517f;

    public j(g gVar, o oVar, bq.j jVar, boolean z10, boolean z11) {
        this.f27512a = gVar;
        this.f27513b = oVar;
        this.f27514c = jVar;
        this.f27515d = z10;
        this.f27516e = z11;
        SurveyQuestionPointSettings settings = gVar.f27503a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.text.SurveyPointTextSettings");
        this.f27517f = (SurveyPointTextSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return l.a(this.f27512a, jVar.f27512a) && l.a(this.f27513b, jVar.f27513b) && l.a(this.f27514c, jVar.f27514c) && this.f27515d == jVar.f27515d && this.f27516e == jVar.f27516e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f27514c.hashCode() + ((this.f27513b.hashCode() + (this.f27512a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f27515d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f27516e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f27512a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f27513b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f27514c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f27515d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f27516e, ')');
    }
}
