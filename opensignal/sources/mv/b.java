package mv;

import ar.n;
import br.l;
import java.util.List;
import mq.o;
import mq.w;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final sv.a f17059a;

    /* renamed from: b, reason: collision with root package name */
    public final ir.d f17060b;

    /* renamed from: c, reason: collision with root package name */
    public final sv.a f17061c;

    /* renamed from: d, reason: collision with root package name */
    public final n f17062d;

    /* renamed from: e, reason: collision with root package name */
    public final c f17063e;

    /* renamed from: f, reason: collision with root package name */
    public List f17064f;

    /* renamed from: g, reason: collision with root package name */
    public final d f17065g;

    /* renamed from: h, reason: collision with root package name */
    public final e f17066h;

    public b(sv.a aVar, ir.d dVar, sv.a aVar2, n nVar, c cVar, d dVar2) {
        e eVar = new e();
        l.e(aVar, "scopeQualifier");
        l.e(dVar, "primaryType");
        l.e(cVar, "kind");
        this.f17059a = aVar;
        this.f17060b = dVar;
        this.f17061c = aVar2;
        this.f17062d = nVar;
        this.f17063e = cVar;
        this.f17064f = w.f16945a;
        this.f17065g = dVar2;
        this.f17066h = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        }
        b bVar = (b) obj;
        return l.a(this.f17060b, bVar.f17060b) && l.a(this.f17061c, bVar.f17061c) && l.a(this.f17059a, bVar.f17059a);
    }

    public final int hashCode() {
        sv.a aVar = this.f17061c;
        return this.f17059a.f22363a.hashCode() + ((this.f17060b.hashCode() + ((aVar == null ? 0 : aVar.f22363a.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        String strK;
        String string = this.f17063e.toString();
        String str = "'" + wv.a.a(this.f17060b) + '\'';
        sv.a aVar = this.f17061c;
        if (aVar == null || (strK = l.k(aVar, ",qualifier:")) == null) {
            strK = "";
        }
        sv.a aVar2 = uv.c.f23725d;
        sv.a aVar3 = this.f17059a;
        return "[" + string + ':' + str + strK + (l.a(aVar3, aVar2) ? "" : l.k(aVar3, ",scope:")) + (this.f17064f.isEmpty() ? "" : l.k(o.x0(this.f17064f, ",", null, null, a.f17058d, 30), ",binds:")) + ']';
    }
}
