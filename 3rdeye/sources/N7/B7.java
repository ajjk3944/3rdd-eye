package N7;

import A7.b;
import D7.a;
import N7.A7;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPageTransformationOverlapTemplate.kt */
/* loaded from: classes.dex */
public final class B7 implements InterfaceC5868a, z7.b<C1449z7> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1360t2>> f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f4909b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f4910c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f4911d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f4912e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Boolean>> f4913f;

    static {
        b.a.a(EnumC1360t2.EASE_IN_OUT);
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Boolean.FALSE);
    }

    public B7(AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a, AbstractC5371a<A7.b<Double>> abstractC5371a2, AbstractC5371a<A7.b<Double>> abstractC5371a3, AbstractC5371a<A7.b<Double>> abstractC5371a4, AbstractC5371a<A7.b<Double>> abstractC5371a5, AbstractC5371a<A7.b<Boolean>> abstractC5371a6) {
        this.f4908a = abstractC5371a;
        this.f4909b = abstractC5371a2;
        this.f4910c = abstractC5371a3;
        this.f4911d = abstractC5371a4;
        this.f4912e = abstractC5371a5;
        this.f4913f = abstractC5371a6;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        A7.c cVar = (A7.c) D7.a.f1071b.l5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        cVar.getClass();
        return A7.c.e(c0011a, this);
    }
}
