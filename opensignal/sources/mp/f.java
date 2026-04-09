package mp;

import bq.j;
import bq.o;
import br.l;
import com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final b f16912a;

    /* renamed from: b, reason: collision with root package name */
    public final o f16913b;

    /* renamed from: c, reason: collision with root package name */
    public final j f16914c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f16915d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16916e;

    /* renamed from: f, reason: collision with root package name */
    public final SurveyNpsPointSettings f16917f;

    public f(b bVar, o oVar, j jVar, boolean z10, boolean z11) {
        this.f16912a = bVar;
        this.f16913b = oVar;
        this.f16914c = jVar;
        this.f16915d = z10;
        this.f16916e = z11;
        SurveyNpsPointSettings settings = bVar.f16903a.getSettings();
        l.c(settings, "null cannot be cast to non-null type com.survicate.surveys.entities.survey.questions.nps.SurveyNpsPointSettings");
        this.f16917f = settings;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f16912a, fVar.f16912a) && l.a(this.f16913b, fVar.f16913b) && l.a(this.f16914c, fVar.f16914c) && this.f16915d == fVar.f16915d && this.f16916e == fVar.f16916e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f16914c.hashCode() + ((this.f16913b.hashCode() + (this.f16912a.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.f16915d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iHashCode + i10) * 31;
        boolean z11 = this.f16916e;
        return i11 + (z11 ? 1 : z11 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BindingData(contentBindingData=");
        sb2.append(this.f16912a);
        sb2.append(", surveyHeaderBindingData=");
        sb2.append(this.f16913b);
        sb2.append(", submitViewConfig=");
        sb2.append(this.f16914c);
        sb2.append(", isFooterVisible=");
        sb2.append(this.f16915d);
        sb2.append(", isFullScreen=");
        return c7.a.r(sb2, this.f16916e, ')');
    }
}
