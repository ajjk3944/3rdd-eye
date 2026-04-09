package N7;

import D7.a;
import N7.L2;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAspect.kt */
/* loaded from: classes.dex */
public final class K2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Double> f5615a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f5616b;

    public K2(A7.b<Double> bVar) {
        this.f5615a = bVar;
    }

    public final boolean a(K2 k22, A7.d dVar, A7.d dVar2) {
        return k22 != null && this.f5615a.a(dVar).doubleValue() == k22.f5615a.a(dVar2).doubleValue();
    }

    public final int b() {
        Integer num = this.f5616b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f5615a.hashCode() + kotlin.jvm.internal.x.a(K2.class).hashCode();
        this.f5616b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        L2.a aVar = (L2.a) D7.a.f1071b.f6960z1.getValue();
        a.C0011a context = D7.a.f1070a;
        aVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        l7.b.d(context, jSONObject, "ratio", this.f5615a);
        return jSONObject;
    }
}
