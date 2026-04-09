package qr;

import java.util.ArrayList;
import java.util.List;
import rr.a0;
import ur.x;

/* loaded from: classes.dex */
public final class f extends br.n implements ar.k {

    /* renamed from: g, reason: collision with root package name */
    public static final f f20978g = new f(1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20979d = 0;

    public /* synthetic */ f(int i10) {
        super(i10);
    }

    @Override // ar.k
    public final Object a(Object obj) {
        boolean z10 = false;
        switch (this.f20979d) {
            case 0:
                a0 a0Var = (a0) obj;
                br.l.e(a0Var, "module");
                List list = (List) io.sentry.config.a.Z(((x) a0Var.J0(h.f20985f)).f23680y, x.E[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof et.c) {
                        arrayList.add(obj2);
                    }
                }
                return (et.c) mq.o.r0(arrayList);
            default:
                rr.d dVar = (rr.d) obj;
                if (dVar.f() == rr.c.DECLARATION) {
                    rr.l lVarO = dVar.o();
                    br.l.c(lVarO, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    String str = d.f20965a;
                    if (d.j.containsKey(ts.d.g((rr.f) lVarO))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }

    public f(r rVar) {
        super(1);
    }
}
