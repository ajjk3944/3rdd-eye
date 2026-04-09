package un;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f23612a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.a f23613b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f23614c;

    public k(long j, ArrayList arrayList, rn.a aVar) {
        br.l.e(aVar, "displayLogicOperator");
        this.f23612a = j;
        this.f23613b = aVar;
        this.f23614c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f23612a == kVar.f23612a && this.f23613b == kVar.f23613b && this.f23614c.equals(kVar.f23614c);
    }

    public final int hashCode() {
        return this.f23614c.hashCode() + ((this.f23613b.hashCode() + (Long.hashCode(this.f23612a) * 31)) * 31);
    }

    public final String toString() {
        return "QuestionSuggestion(questionId=" + this.f23612a + ", displayLogicOperator=" + this.f23613b + ", displayLogic=" + this.f23614c + ')';
    }
}
