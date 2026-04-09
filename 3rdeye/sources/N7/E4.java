package N7;

import A7.b;
import D7.a;
import N7.D4;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivFadeTransitionTemplate.kt */
/* loaded from: classes.dex */
public final class E4 implements InterfaceC5868a, z7.b<C4> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f5135a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f5136b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1360t2>> f5137c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f5138d;

    static {
        b.a.a(Double.valueOf(0.0d));
        b.a.a(200L);
        b.a.a(EnumC1360t2.EASE_IN_OUT);
        b.a.a(0L);
    }

    public E4(AbstractC5371a<A7.b<Double>> abstractC5371a, AbstractC5371a<A7.b<Long>> abstractC5371a2, AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a3, AbstractC5371a<A7.b<Long>> abstractC5371a4) {
        this.f5135a = abstractC5371a;
        this.f5136b = abstractC5371a2;
        this.f5137c = abstractC5371a3;
        this.f5138d = abstractC5371a4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        D4.c cVar = (D4.c) D7.a.f1071b.f6709c3.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        cVar.getClass();
        return D4.c.e(c0011a, this);
    }
}
