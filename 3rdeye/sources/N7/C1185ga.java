package N7;

import A7.b;
import N7.AbstractC1215ia;
import N7.C1200ha;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivStroke.kt */
/* renamed from: N7.ga, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1185ga implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f8299a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1215ia f8300b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<H9> f8301c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Double> f8302d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f8303e;

    static {
        new AbstractC1215ia.b(new C1340ra());
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
        new b.C0000b(Double.valueOf(1.0d));
    }

    public C1185ga(A7.b<Integer> bVar, AbstractC1215ia abstractC1215ia, A7.b<H9> unit, A7.b<Double> width) {
        kotlin.jvm.internal.l.f(unit, "unit");
        kotlin.jvm.internal.l.f(width, "width");
        this.f8299a = bVar;
        this.f8300b = abstractC1215ia;
        this.f8301c = unit;
        this.f8302d = width;
    }

    public final boolean a(C1185ga c1185ga, A7.d resolver, A7.d otherResolver) {
        InterfaceC5868a interfaceC5868a;
        InterfaceC5868a interfaceC5868a2;
        InterfaceC5868a interfaceC5868a3;
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1185ga == null || this.f8299a.a(resolver).intValue() != c1185ga.f8299a.a(otherResolver).intValue()) {
            return false;
        }
        AbstractC1215ia abstractC1215ia = this.f8300b;
        AbstractC1215ia abstractC1215ia2 = c1185ga.f8300b;
        if (abstractC1215ia instanceof AbstractC1215ia.b) {
            AbstractC1215ia.b bVar = (AbstractC1215ia.b) abstractC1215ia;
            if (abstractC1215ia2 instanceof AbstractC1215ia.b) {
                interfaceC5868a3 = ((AbstractC1215ia.b) abstractC1215ia2).f8420b;
            } else {
                if (!(abstractC1215ia2 instanceof AbstractC1215ia.a)) {
                    throw new b9.j();
                }
                interfaceC5868a3 = ((AbstractC1215ia.a) abstractC1215ia2).f8419b;
            }
            interfaceC5868a2 = interfaceC5868a3 instanceof C1340ra ? (C1340ra) interfaceC5868a3 : null;
            bVar.f8420b.getClass();
            if (interfaceC5868a2 == null) {
                return false;
            }
        } else {
            if (!(abstractC1215ia instanceof AbstractC1215ia.a)) {
                throw new b9.j();
            }
            AbstractC1215ia.a aVar = (AbstractC1215ia.a) abstractC1215ia;
            if (abstractC1215ia2 instanceof AbstractC1215ia.b) {
                interfaceC5868a = ((AbstractC1215ia.b) abstractC1215ia2).f8420b;
            } else {
                if (!(abstractC1215ia2 instanceof AbstractC1215ia.a)) {
                    throw new b9.j();
                }
                interfaceC5868a = ((AbstractC1215ia.a) abstractC1215ia2).f8419b;
            }
            interfaceC5868a2 = interfaceC5868a instanceof C1229ja ? (C1229ja) interfaceC5868a : null;
            aVar.f8419b.getClass();
            if (interfaceC5868a2 == null) {
                return false;
            }
        }
        return this.f8301c.a(resolver) == c1185ga.f8301c.a(otherResolver) && this.f8302d.a(resolver).doubleValue() == c1185ga.f8302d.a(otherResolver).doubleValue();
    }

    public final int b() {
        int iHashCode;
        int iIntValue;
        int iIntValue2;
        Integer num = this.f8303e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode2 = this.f8299a.hashCode() + kotlin.jvm.internal.x.a(C1185ga.class).hashCode();
        AbstractC1215ia abstractC1215ia = this.f8300b;
        Integer num2 = abstractC1215ia.f8418a;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        } else {
            int iHashCode3 = kotlin.jvm.internal.x.a(abstractC1215ia.getClass()).hashCode();
            if (abstractC1215ia instanceof AbstractC1215ia.b) {
                C1340ra c1340ra = ((AbstractC1215ia.b) abstractC1215ia).f8420b;
                Integer num3 = c1340ra.f9081a;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                    int i = iHashCode3 + iIntValue;
                    abstractC1215ia.f8418a = Integer.valueOf(i);
                    iIntValue2 = i;
                } else {
                    iHashCode = kotlin.jvm.internal.x.a(C1340ra.class).hashCode();
                    c1340ra.f9081a = Integer.valueOf(iHashCode);
                    iIntValue = iHashCode;
                    int i10 = iHashCode3 + iIntValue;
                    abstractC1215ia.f8418a = Integer.valueOf(i10);
                    iIntValue2 = i10;
                }
            } else {
                if (!(abstractC1215ia instanceof AbstractC1215ia.a)) {
                    throw new b9.j();
                }
                C1229ja c1229ja = ((AbstractC1215ia.a) abstractC1215ia).f8419b;
                Integer num4 = c1229ja.f8596a;
                if (num4 != null) {
                    iIntValue = num4.intValue();
                    int i102 = iHashCode3 + iIntValue;
                    abstractC1215ia.f8418a = Integer.valueOf(i102);
                    iIntValue2 = i102;
                } else {
                    iHashCode = kotlin.jvm.internal.x.a(C1229ja.class).hashCode();
                    c1229ja.f8596a = Integer.valueOf(iHashCode);
                    iIntValue = iHashCode;
                    int i1022 = iHashCode3 + iIntValue;
                    abstractC1215ia.f8418a = Integer.valueOf(i1022);
                    iIntValue2 = i1022;
                }
            }
        }
        int iHashCode4 = this.f8302d.hashCode() + this.f8301c.hashCode() + iIntValue2 + iHashCode2;
        this.f8303e = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1200ha.b) D7.a.f1071b.f6435C7.getValue()).b(D7.a.f1070a, this);
    }
}
