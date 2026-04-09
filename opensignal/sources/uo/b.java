package uo;

import br.l;
import java.util.List;
import un.j;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f23616a;

    /* renamed from: b, reason: collision with root package name */
    public final List f23617b;

    /* renamed from: c, reason: collision with root package name */
    public final j f23618c;

    public b(long j, List list, j jVar) {
        this.f23616a = j;
        this.f23617b = list;
        this.f23618c = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23616a == bVar.f23616a && l.a(this.f23617b, bVar.f23617b) && l.a(this.f23618c, bVar.f23618c);
    }

    public final int hashCode() {
        int iC = h0.b.c(Long.hashCode(this.f23616a) * 31, 31, this.f23617b);
        j jVar = this.f23618c;
        return iC + (jVar == null ? 0 : jVar.hashCode());
    }

    public final String toString() {
        return "QuestionAnswerItem(surveyPointId=" + this.f23616a + ", answerTextValue=" + this.f23617b + ", answer=" + this.f23618c + ')';
    }
}
