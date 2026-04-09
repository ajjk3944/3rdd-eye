package ft;

import br.x;
import br.y;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class a implements sr.h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f9068d;

    /* renamed from: a, reason: collision with root package name */
    public final gt.i f9069a;

    static {
        y yVar = x.f2918a;
        f9068d = new ir.v[]{yVar.f(new br.q(yVar.b(a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public a(gt.o oVar, ar.a aVar) {
        br.l.e(oVar, "storageManager");
        this.f9069a = new gt.i((gt.l) oVar, aVar);
    }

    @Override // sr.h
    public final boolean G(qs.c cVar) {
        return ba.m.A(this, cVar);
    }

    @Override // sr.h
    public boolean isEmpty() {
        return ((List) io.sentry.config.a.Z(this.f9069a, f9068d[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) io.sentry.config.a.Z(this.f9069a, f9068d[0])).iterator();
    }

    @Override // sr.h
    public final sr.b w(qs.c cVar) {
        return ba.m.v(this, cVar);
    }
}
