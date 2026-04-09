package ur;

import com.google.android.gms.internal.measurement.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23676d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f23677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, int i10) {
        super(0);
        this.f23676d = i10;
        this.f23677g = xVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f23676d) {
            case 0:
                x xVar = this.f23677g;
                a0 a0Var = xVar.f23678r;
                a0Var.u1();
                return Boolean.valueOf(rr.w.h((m) a0Var.H.getValue(), xVar.f23679x));
            case 1:
                x xVar2 = this.f23677g;
                a0 a0Var2 = xVar2.f23678r;
                a0Var2.u1();
                return rr.w.i((m) a0Var2.H.getValue(), xVar2.f23679x);
            default:
                x xVar3 = this.f23677g;
                gt.i iVar = xVar3.B;
                ir.v[] vVarArr = x.E;
                boolean zBooleanValue = ((Boolean) io.sentry.config.a.Z(iVar, vVarArr[1])).booleanValue();
                qs.c cVar = xVar3.f23679x;
                a0 a0Var3 = xVar3.f23678r;
                if (zBooleanValue) {
                    return at.m.f2303b;
                }
                List list = (List) io.sentry.config.a.Z(xVar3.f23680y, vVarArr[0]);
                ArrayList arrayList = new ArrayList(mq.p.a0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((rr.f0) it.next()).W());
                }
                return e5.q("package view scope for " + cVar + " in " + a0Var3.getName(), mq.o.F0(arrayList, new l0(a0Var3, cVar)));
        }
    }
}
