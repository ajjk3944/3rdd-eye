package pp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.numerical.SurveyPointNumericalSettings;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f20609a;

    /* renamed from: b, reason: collision with root package name */
    public final o f20610b;

    /* renamed from: c, reason: collision with root package name */
    public final j f20611c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20612d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20613e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointNumericalSettings f20614f;

    public e(a aVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f20609a = aVar;
        this.f20610b = oVar;
        this.f20611c = jVar;
        this.f20612d = z10;
        this.f20613e = z11;
        SurveyQuestionPointSettings settings = aVar.f20599a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.rating.numerical.SurveyPointNumericalSettings");
        this.f20614f = (SurveyPointNumericalSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f20609a, eVar.f20609a) && l.a(this.f20610b, eVar.f20610b) && l.a(this.f20611c, eVar.f20611c) && this.f20612d == eVar.f20612d && this.f20613e == eVar.f20613e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f20611c.hashCode() + ((this.f20610b.hashCode() + (this.f20609a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f20612d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f20613e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f20609a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f20610b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f20611c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f20612d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f20613e, ')');
    }
}
