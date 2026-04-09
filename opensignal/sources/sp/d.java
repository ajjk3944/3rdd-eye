package sp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final a f22200a;

    /* renamed from: b, reason: collision with root package name */
    public final o f22201b;

    /* renamed from: c, reason: collision with root package name */
    public final j f22202c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22203d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22204e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointShapeSettings f22205f;

    public d(a aVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f22200a = aVar;
        this.f22201b = oVar;
        this.f22202c = jVar;
        this.f22203d = z10;
        this.f22204e = z11;
        SurveyQuestionPointSettings settings = aVar.f22193a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.rating.shape.SurveyPointShapeSettings");
        this.f22205f = (SurveyPointShapeSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f22200a, dVar.f22200a) && l.a(this.f22201b, dVar.f22201b) && l.a(this.f22202c, dVar.f22202c) && this.f22203d == dVar.f22203d && this.f22204e == dVar.f22204e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f22202c.hashCode() + ((this.f22201b.hashCode() + (this.f22200a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f22203d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f22204e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f22200a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f22201b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f22202c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f22203d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f22204e, ')');
    }
}
