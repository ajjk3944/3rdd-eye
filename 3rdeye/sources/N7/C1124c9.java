package N7;

import A7.b;
import D7.a;
import N7.C1109b9;
import n7.AbstractC5371a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivScaleTransitionTemplate.kt */
/* renamed from: N7.c9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1124c9 implements InterfaceC5868a, z7.b<Z8> {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f7975a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC5371a<A7.b<EnumC1360t2>> f7976b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f7977c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f7978d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Double>> f7979e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC5371a<A7.b<Long>> f7980f;

    static {
        b.a.a(200L);
        b.a.a(EnumC1360t2.EASE_IN_OUT);
        b.a.a(Double.valueOf(0.5d));
        b.a.a(Double.valueOf(0.5d));
        b.a.a(Double.valueOf(0.0d));
        b.a.a(0L);
    }

    public C1124c9(AbstractC5371a<A7.b<Long>> abstractC5371a, AbstractC5371a<A7.b<EnumC1360t2>> abstractC5371a2, AbstractC5371a<A7.b<Double>> abstractC5371a3, AbstractC5371a<A7.b<Double>> abstractC5371a4, AbstractC5371a<A7.b<Double>> abstractC5371a5, AbstractC5371a<A7.b<Long>> abstractC5371a6) {
        this.f7975a = abstractC5371a;
        this.f7976b = abstractC5371a2;
        this.f7977c = abstractC5371a3;
        this.f7978d = abstractC5371a4;
        this.f7979e = abstractC5371a5;
        this.f7980f = abstractC5371a6;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1109b9.c cVar = (C1109b9.c) D7.a.f1071b.f6921v6.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        cVar.getClass();
        return C1109b9.c.e(c0011a, this);
    }
}
