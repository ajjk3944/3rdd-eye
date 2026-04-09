package kt;

import as.p;
import at.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import mq.w;
import mq.y;
import rr.o0;
import rr.z;

/* loaded from: classes.dex */
public class f implements n {

    /* renamed from: b, reason: collision with root package name */
    public final String f14511b;

    public f(g gVar, String... strArr) {
        br.l.e(gVar, "kind");
        br.l.e(strArr, "formatParams");
        String debugMessage = gVar.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f14511b = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // at.p
    public Collection a(at.f fVar, ar.k kVar) {
        br.l.e(fVar, "kindFilter");
        return w.f16945a;
    }

    @Override // at.p
    public rr.i c(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        return new a(qs.g.g(String.format(b.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{gVar}, 1))));
    }

    @Override // at.n
    public Set d() {
        return y.f16947a;
    }

    @Override // at.n
    public Set e() {
        return y.f16947a;
    }

    @Override // at.n
    public Set g() {
        return y.f16947a;
    }

    @Override // at.n
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set f(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        a aVar = k.f14522c;
        br.l.e(aVar, "containingDeclaration");
        c cVar = new c(aVar, null, sr.g.f22217a, qs.g.g(b.ERROR_FUNCTION.getDebugText()), rr.c.DECLARATION, o0.f21696s);
        h hVarC = k.c(j.RETURN_TYPE_FOR_FUNCTION, new String[0]);
        z zVar = z.OPEN;
        p pVar = rr.p.f21701e;
        w wVar = w.f16945a;
        cVar.A1(null, null, wVar, wVar, wVar, hVarC, zVar, pVar);
        return i3.g.H(cVar);
    }

    @Override // at.n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set b(qs.g gVar, zr.b bVar) {
        br.l.e(gVar, "name");
        br.l.e(bVar, "location");
        k kVar = k.f14520a;
        return k.f14525f;
    }

    public String toString() {
        return h0.b.r(new StringBuilder("ErrorScope{"), this.f14511b, '}');
    }
}
