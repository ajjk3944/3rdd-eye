package gp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.form.SurveyFormPointSettings;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a f9634a;

    /* renamed from: b, reason: collision with root package name */
    public final o f9635b;

    /* renamed from: c, reason: collision with root package name */
    public final j f9636c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9637d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f9638e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyFormPointSettings f9639f;

    public e(a aVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f9634a = aVar;
        this.f9635b = oVar;
        this.f9636c = jVar;
        this.f9637d = z10;
        this.f9638e = z11;
        SurveyFormPointSettings settings = aVar.f9630a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.form.SurveyFormPointSettings");
        this.f9639f = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f9634a, eVar.f9634a) && l.a(this.f9635b, eVar.f9635b) && l.a(this.f9636c, eVar.f9636c) && this.f9637d == eVar.f9637d && this.f9638e == eVar.f9638e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f9636c.hashCode() + ((this.f9635b.hashCode() + (this.f9634a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f9637d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f9638e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f9634a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f9635b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f9636c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f9637d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f9638e, ')');
    }
}
