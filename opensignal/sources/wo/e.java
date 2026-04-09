package wo;

import br.l;
import com.google.android.gms.internal.measurement.e5;
import com.survicate.surveys.infrastructure.network.SurveyAnswer;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final List f24571a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f24572b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24573c;

    public e(List list, Long l10, long j) {
        l.e(list, "answers");
        this.f24571a = list;
        this.f24572b = l10;
        this.f24573c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f24571a, eVar.f24571a) && l.a(this.f24572b, eVar.f24572b) && this.f24573c == eVar.f24573c;
    }

    public final int hashCode() {
        int iHashCode = this.f24571a.hashCode() * 31;
        Long l10 = this.f24572b;
        return Long.hashCode(this.f24573c) + ((iHashCode + (l10 == null ? 0 : l10.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SurveyAnswerAction(answers=");
        sb2.append(this.f24571a);
        sb2.append(", nextQuestionId=");
        sb2.append(this.f24572b);
        sb2.append(", currentQuestionId=");
        return w.g.h(sb2, this.f24573c, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(SurveyAnswer surveyAnswer, Long l10, long j) {
        this(e5.H(surveyAnswer), l10, j);
        l.e(surveyAnswer, "answer");
    }
}
