package dp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f7427a;

    /* renamed from: b, reason: collision with root package name */
    public final o f7428b;

    /* renamed from: c, reason: collision with root package name */
    public final j f7429c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7430d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7431e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointDateSettings f7432f;

    public d(b bVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f7427a = bVar;
        this.f7428b = oVar;
        this.f7429c = jVar;
        this.f7430d = z10;
        this.f7431e = z11;
        SurveyQuestionPointSettings settings = bVar.f7422a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.date.SurveyPointDateSettings");
        this.f7432f = (SurveyPointDateSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f7427a, dVar.f7427a) && l.a(this.f7428b, dVar.f7428b) && l.a(this.f7429c, dVar.f7429c) && this.f7430d == dVar.f7430d && this.f7431e == dVar.f7431e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f7429c.hashCode() + ((this.f7428b.hashCode() + (this.f7427a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f7430d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f7431e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f7427a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f7428b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f7429c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f7430d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f7431e, ')');
    }
}
