package N7;

import A7.b;
import N7.AbstractC1138d8;
import N7.Rb;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTransformTemplate.kt */
/* loaded from: classes.dex */
public final class Sb implements InterfaceC5868a, z7.b<Qb> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<AbstractC1311p8> f6214a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<AbstractC1311p8> f6215b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f6216c;

    static {
        new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));
        new AbstractC1138d8.b(new C1241k8(new b.C0000b(Double.valueOf(50.0d))));
    }

    public Sb(AbstractC5371a<AbstractC1311p8> abstractC5371a, AbstractC5371a<AbstractC1311p8> abstractC5371a2, AbstractC5371a<A7.b<Double>> abstractC5371a3) {
        this.f6214a = abstractC5371a;
        this.f6215b = abstractC5371a2;
        this.f6216c = abstractC5371a3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Rb.b) D7.a.f1071b.f6615T8.getValue()).b(D7.a.f1070a, this);
    }
}
