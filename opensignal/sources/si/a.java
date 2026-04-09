package si;

import br.l;
import gk.c;
import hk.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f22059a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22060b;

    /* renamed from: c, reason: collision with root package name */
    public final c f22061c;

    public a(long j, String str, c cVar) {
        l.e(str, "name");
        l.e(cVar, "schedule");
        this.f22059a = j;
        this.f22060b = str;
        this.f22061c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f22059a == aVar.f22059a && l.a(this.f22060b, aVar.f22060b) && l.a(this.f22061c, aVar.f22061c);
    }

    public final int hashCode() {
        return this.f22061c.hashCode() + c7.a.g(this.f22060b, Long.hashCode(this.f22059a) * 31, 31);
    }

    public final String toString() {
        return "JobScheduleData(id=" + this.f22059a + ", name=" + this.f22060b + ", schedule=" + this.f22061c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(h hVar) {
        this(hVar.f10804a, hVar.f10805b, hVar.f10809f);
        l.e(hVar, "task");
    }
}
