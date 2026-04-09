package qr;

import br.w;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class q extends rt.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20999b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21000c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f21001d;

    public /* synthetic */ q(Object obj, Serializable serializable, int i10) {
        this.f20999b = i10;
        this.f21000c = obj;
        this.f21001d = serializable;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ar.k, br.n] */
    @Override // rt.k
    public void b(Object obj) {
        switch (this.f20999b) {
            case 2:
                rr.d dVar = (rr.d) obj;
                br.l.e(dVar, "current");
                w wVar = (w) this.f21001d;
                if (wVar.f2917a == null && ((Boolean) ((br.n) this.f21000c).a(dVar)).booleanValue()) {
                    wVar.f2917a = dVar;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [ar.k, java.lang.Object] */
    @Override // rt.k
    public final boolean c(Object obj) {
        switch (this.f20999b) {
            case 0:
                rr.f fVar = (rr.f) obj;
                w wVar = (w) this.f21001d;
                br.l.e(fVar, "javaClassDescriptor");
                String strI = dr.a.I(fVar, (String) this.f21000c);
                if (t.f21014b.contains(strI)) {
                    wVar.f2917a = m.HIDDEN;
                } else if (t.f21015c.contains(strI)) {
                    wVar.f2917a = m.VISIBLE;
                } else if (t.f21013a.contains(strI)) {
                    wVar.f2917a = m.DROP;
                }
                return wVar.f2917a == null;
            case 1:
                boolean[] zArr = (boolean[]) this.f21001d;
                if (((Boolean) this.f21000c.a(obj)).booleanValue()) {
                    zArr[0] = true;
                }
                return !zArr[0];
            default:
                br.l.e((rr.d) obj, "current");
                return ((w) this.f21001d).f2917a == null;
        }
    }

    @Override // rt.k
    public final Object i() {
        switch (this.f20999b) {
            case 0:
                m mVar = (m) ((w) this.f21001d).f2917a;
                return mVar == null ? m.NOT_CONSIDERED : mVar;
            case 1:
                return Boolean.valueOf(((boolean[]) this.f21001d)[0]);
            default:
                return (rr.d) ((w) this.f21001d).f2917a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(w wVar, ar.k kVar) {
        this.f20999b = 2;
        this.f21001d = wVar;
        this.f21000c = (br.n) kVar;
    }
}
