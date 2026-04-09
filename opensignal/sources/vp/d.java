package vp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f23936a;

    /* renamed from: b, reason: collision with root package name */
    public final o f23937b;

    /* renamed from: c, reason: collision with root package name */
    public final j f23938c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23939d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f23940e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointSingleSettings f23941f;

    public d(b bVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f23936a = bVar;
        this.f23937b = oVar;
        this.f23938c = jVar;
        this.f23939d = z10;
        this.f23940e = z11;
        SurveyQuestionPointSettings settings = bVar.f23932a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.single.SurveyPointSingleSettings");
        this.f23941f = (SurveyPointSingleSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f23936a, dVar.f23936a) && l.a(this.f23937b, dVar.f23937b) && l.a(this.f23938c, dVar.f23938c) && this.f23939d == dVar.f23939d && this.f23940e == dVar.f23940e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f23938c.hashCode() + ((this.f23937b.hashCode() + (this.f23936a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f23939d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f23940e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f23936a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f23937b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f23938c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f23939d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f23940e, ')');
    }
}
