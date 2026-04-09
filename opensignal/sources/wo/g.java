package wo;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f24581a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f24582b;

    public g(List list, Boolean bool) {
        l.e(list, "answers");
        this.f24581a = list.isEmpty() ? e5.H(new SurveyAnswer(null, null, null, null, null, 0.0d, null, null, null, null, null, null, 4095, null)) : list;
        this.f24582b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.c(obj, "null cannot be cast to non-null type com.survicate.surveys.presentation.base.SurveyPointViewAnswer");
        g gVar = (g) obj;
        return l.a(this.f24581a, gVar.f24581a) && l.a(this.f24582b, gVar.f24582b);
    }

    public final int hashCode() {
        int iHashCode = this.f24581a.hashCode() * 31;
        Boolean bool = this.f24582b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
