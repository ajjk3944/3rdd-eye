package ip;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final c f12902a;

    /* renamed from: b, reason: collision with root package name */
    public final o f12903b;

    /* renamed from: c, reason: collision with root package name */
    public final j f12904c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12905d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12906e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointMatrixSettings f12907f;

    public f(c cVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f12902a = cVar;
        this.f12903b = oVar;
        this.f12904c = jVar;
        this.f12905d = z10;
        this.f12906e = z11;
        SurveyQuestionPointSettings settings = cVar.f12896a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.matrix.SurveyPointMatrixSettings");
        this.f12907f = (SurveyPointMatrixSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f12902a, fVar.f12902a) && l.a(this.f12903b, fVar.f12903b) && l.a(this.f12904c, fVar.f12904c) && this.f12905d == fVar.f12905d && this.f12906e == fVar.f12906e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f12904c.hashCode() + ((this.f12903b.hashCode() + (this.f12902a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f12905d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f12906e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f12902a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f12903b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f12904c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f12905d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f12906e, ')');
    }
}
