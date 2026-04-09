package kp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f14474a;

    /* renamed from: b, reason: collision with root package name */
    public final o f14475b;

    /* renamed from: c, reason: collision with root package name */
    public final j f14476c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14477d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14478e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointMultipleSettings f14479f;

    public f(c cVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f14474a = cVar;
        this.f14475b = oVar;
        this.f14476c = jVar;
        this.f14477d = z10;
        this.f14478e = z11;
        SurveyQuestionPointSettings settings = cVar.f14470a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.multiple.SurveyPointMultipleSettings");
        this.f14479f = (SurveyPointMultipleSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f14474a, fVar.f14474a) && l.a(this.f14475b, fVar.f14475b) && l.a(this.f14476c, fVar.f14476c) && this.f14477d == fVar.f14477d && this.f14478e == fVar.f14478e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f14476c.hashCode() + ((this.f14475b.hashCode() + (this.f14474a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f14477d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f14478e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f14474a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f14475b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f14476c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f14477d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f14478e, ')');
    }
}
