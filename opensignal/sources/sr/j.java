package sr;

import ht.x;
import java.util.Map;
import rr.o0;

/* loaded from: classes.dex */
public final class j implements b {

    /* renamed from: a, reason: collision with root package name */
    public final or.h f22220a;

    /* renamed from: b, reason: collision with root package name */
    public final qs.c f22221b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f22222c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22223d;

    public j(or.h hVar, qs.c cVar, Map map) {
        br.l.e(cVar, "fqName");
        this.f22220a = hVar;
        this.f22221b = cVar;
        this.f22222c = map;
        this.f22223d = kc.f.E(lq.j.PUBLICATION, new pp.c(5, this));
    }

    @Override // sr.b
    public final qs.c a() {
        return this.f22221b;
    }

    @Override // sr.b
    public final Map b() {
        return this.f22222c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lq.h] */
    @Override // sr.b
    public final x getType() {
        Object value = this.f22223d.getValue();
        br.l.d(value, "<get-type>(...)");
        return (x) value;
    }

    @Override // sr.b
    public final o0 h() {
        return o0.f21696s;
    }
}
