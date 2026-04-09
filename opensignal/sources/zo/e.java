package zo;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.csat.SurveyPointCsatSettings;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final b f27482a;

    /* renamed from: b, reason: collision with root package name */
    public final o f27483b;

    /* renamed from: c, reason: collision with root package name */
    public final j f27484c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27485d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f27486e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointCsatSettings f27487f;

    public e(b bVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f27482a = bVar;
        this.f27483b = oVar;
        this.f27484c = jVar;
        this.f27485d = z10;
        this.f27486e = z11;
        SurveyQuestionPointSettings settings = bVar.f27475a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.rating.csat.SurveyPointCsatSettings");
        this.f27487f = (SurveyPointCsatSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f27482a, eVar.f27482a) && l.a(this.f27483b, eVar.f27483b) && l.a(this.f27484c, eVar.f27484c) && this.f27485d == eVar.f27485d && this.f27486e == eVar.f27486e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f27484c.hashCode() + ((this.f27483b.hashCode() + (this.f27482a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f27485d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f27486e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f27482a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f27483b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f27484c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f27485d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f27486e, ')');
    }
}
