package bi;

import br.l;
import java.util.List;
import mq.w;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2765a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2766b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2767c;

    /* renamed from: d, reason: collision with root package name */
    public final List f2768d;

    /* renamed from: e, reason: collision with root package name */
    public final bh.a f2769e;

    public c(String str, String str2, List list, List list2, bh.a aVar) {
        l.e(list, "andFields");
        l.e(list2, "orFields");
        this.f2765a = str;
        this.f2766b = str2;
        this.f2767c = list;
        this.f2768d = list2;
        this.f2769e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f2765a, cVar.f2765a) && l.a(this.f2766b, cVar.f2766b) && l.a(this.f2767c, cVar.f2767c) && l.a(this.f2768d, cVar.f2768d) && l.a(this.f2769e, cVar.f2769e);
    }

    public final int hashCode() {
        return this.f2769e.hashCode() + h0.b.c(h0.b.c(c7.a.g(this.f2766b, this.f2765a.hashCode() * 31, 31), 31, this.f2767c), 31, this.f2768d);
    }

    public final String toString() {
        return "Recipe(type=" + this.f2765a + ", recipeName=" + this.f2766b + ", andFields=" + this.f2767c + ", orFields=" + this.f2768d + ", assistantResult=" + this.f2769e + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ c(String str, List list, List list2, bh.a aVar, int i10) {
        int i11 = i10 & 4;
        w wVar = w.f16945a;
        this("field_based", str, i11 != 0 ? wVar : list, (i10 & 8) != 0 ? wVar : list2, aVar);
    }
}
