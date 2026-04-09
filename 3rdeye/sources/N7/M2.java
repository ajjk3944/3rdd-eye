package N7;

import D7.a;
import N7.L2;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAspectTemplate.kt */
/* loaded from: classes.dex */
public final class M2 implements InterfaceC5868a, z7.b<K2> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5829a;

    public M2(AbstractC5371a<A7.b<Double>> abstractC5371a) {
        this.f5829a = abstractC5371a;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        L2.b bVar = (L2.b) D7.a.f1071b.f6407A1.getValue();
        a.C0011a context = D7.a.f1070a;
        bVar.getClass();
        kotlin.jvm.internal.l.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        l7.c.q(context, jSONObject, "ratio", this.f5829a);
        return jSONObject;
    }
}
