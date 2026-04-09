package N7;

import A7.b;
import D7.a;
import N7.D7;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPageTransformationSlideTemplate.kt */
/* loaded from: classes.dex */
public final class E7 implements InterfaceC5868a, z7.b<C7> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1360t2>> f5146a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5147b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5148c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5149d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5150e;

    static {
        b.a.a(EnumC1360t2.EASE_IN_OUT);
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
        b.a.a(Double.valueOf(1.0d));
    }

    public E7(AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a, AbstractC5371a<A7.b<Double>> abstractC5371a2, AbstractC5371a<A7.b<Double>> abstractC5371a3, AbstractC5371a<A7.b<Double>> abstractC5371a4, AbstractC5371a<A7.b<Double>> abstractC5371a5) {
        this.f5146a = abstractC5371a;
        this.f5147b = abstractC5371a2;
        this.f5148c = abstractC5371a3;
        this.f5149d = abstractC5371a4;
        this.f5150e = abstractC5371a5;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        D7.c cVar = (D7.c) D7.a.f1071b.f6845o5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        cVar.getClass();
        return D7.c.e(c0011a, this);
    }
}
