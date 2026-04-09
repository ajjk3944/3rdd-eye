package xp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.question.SurveyQuestionPointSettings;
import com.survicate.surveys.entities.survey.questions.question.smileyScale.SurveyPointSmileyScaleSettings;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f25464a;

    /* renamed from: b, reason: collision with root package name */
    public final o f25465b;

    /* renamed from: c, reason: collision with root package name */
    public final j f25466c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25467d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25468e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyPointSmileyScaleSettings f25469f;

    public e(a aVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f25464a = aVar;
        this.f25465b = oVar;
        this.f25466c = jVar;
        this.f25467d = z10;
        this.f25468e = z11;
        SurveyQuestionPointSettings settings = aVar.f25457a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.question.smileyScale.SurveyPointSmileyScaleSettings");
        this.f25469f = (SurveyPointSmileyScaleSettings) settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f25464a, eVar.f25464a) && l.a(this.f25465b, eVar.f25465b) && l.a(this.f25466c, eVar.f25466c) && this.f25467d == eVar.f25467d && this.f25468e == eVar.f25468e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f25466c.hashCode() + ((this.f25465b.hashCode() + (this.f25464a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f25467d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f25468e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f25464a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f25465b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f25466c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f25467d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f25468e, ')');
    }
}
