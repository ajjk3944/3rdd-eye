package ec;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e1 extends androidx.recyclerview.widget.g2 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h1 f22697h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var) {
        super(20);
        this.f22697h = h1Var;
    }

    @Override // androidx.recyclerview.widget.g2
    public final Object c(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        pb.y.e(str);
        h1 h1Var = this.f22697h;
        h1Var.C();
        pb.y.e(str);
        m mVar = h1Var.f23175c.f22733c;
        g4.U(mVar);
        yb.e eVarH0 = mVar.H0(str);
        if (eVarH0 == null) {
            return null;
        }
        s0 s0Var = ((o1) h1Var.f218b).f22954f;
        o1.m(s0Var);
        s0Var.f23060o.e(str, "Populate EES config from database on cache miss. appId");
        h1Var.J(str, h1Var.K(str, (byte[]) eVarH0.f37509b));
        e1 e1Var = h1Var.f22768k;
        synchronized (((i7.b) e1Var.g)) {
            Set setEntrySet = ((LinkedHashMap) ((o.e) e1Var.f1379b).f30195b).entrySet();
            nk.k.d(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = ((LinkedHashMap) ((o.e) e1Var.f1379b).f30195b).entrySet();
            nk.k.d(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (com.google.android.gms.internal.measurement.d0) linkedHashMap.get(str);
    }
}
