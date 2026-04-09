package bq;

import com.survicate.surveys.entities.survey.theme.ThemeSettings;
import com.survicate.surveys.infrastructure.network.image.SurvicateImageLoader;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final ThemeSettings f2887a;

    /* renamed from: b, reason: collision with root package name */
    public final SurvicateImageLoader f2888b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2889c;

    /* renamed from: d, reason: collision with root package name */
    public final double f2890d;

    public o(ThemeSettings themeSettings, SurvicateImageLoader survicateImageLoader, boolean z10, double d6) {
        br.l.e(themeSettings, "themeSettings");
        br.l.e(survicateImageLoader, "imageLoader");
        this.f2887a = themeSettings;
        this.f2888b = survicateImageLoader;
        this.f2889c = z10;
        this.f2890d = d6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return br.l.a(this.f2887a, oVar.f2887a) && br.l.a(this.f2888b, oVar.f2888b) && this.f2889c == oVar.f2889c && Double.compare(this.f2890d, oVar.f2890d) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.f2888b.hashCode() + (this.f2887a.hashCode() * 31)) * 31;
        boolean z10 = this.f2889c;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return Double.hashCode(this.f2890d) + ((iHashCode + i10) * 31);
    }

    public final String toString() {
        return "SurveyHeaderBindingData(themeSettings=" + this.f2887a + ", imageLoader=" + this.f2888b + ", showProgressBar=" + this.f2889c + ", surveyProgressInPercents=" + this.f2890d + ')';
    }
}
