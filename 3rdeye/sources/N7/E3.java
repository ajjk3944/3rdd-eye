package N7;

import D7.a;
import N7.F3;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivCornersRadius.kt */
/* loaded from: classes.dex */
public final class E3 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f5130a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f5131b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f5132c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f5133d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f5134e;

    public E3() {
        this(null, null, null, null);
    }

    public final boolean a(E3 e32, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (e32 == null) {
            return false;
        }
        A7.b<Long> bVar = this.f5130a;
        Long lA = bVar != null ? bVar.a(resolver) : null;
        A7.b<Long> bVar2 = e32.f5130a;
        if (!kotlin.jvm.internal.l.b(lA, bVar2 != null ? bVar2.a(otherResolver) : null)) {
            return false;
        }
        A7.b<Long> bVar3 = this.f5131b;
        Long lA2 = bVar3 != null ? bVar3.a(resolver) : null;
        A7.b<Long> bVar4 = e32.f5131b;
        if (!kotlin.jvm.internal.l.b(lA2, bVar4 != null ? bVar4.a(otherResolver) : null)) {
            return false;
        }
        A7.b<Long> bVar5 = this.f5132c;
        Long lA3 = bVar5 != null ? bVar5.a(resolver) : null;
        A7.b<Long> bVar6 = e32.f5132c;
        if (!kotlin.jvm.internal.l.b(lA3, bVar6 != null ? bVar6.a(otherResolver) : null)) {
            return false;
        }
        A7.b<Long> bVar7 = this.f5133d;
        Long lA4 = bVar7 != null ? bVar7.a(resolver) : null;
        A7.b<Long> bVar8 = e32.f5133d;
        return kotlin.jvm.internal.l.b(lA4, bVar8 != null ? bVar8.a(otherResolver) : null);
    }

    public final int b() {
        Integer num = this.f5134e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(E3.class).hashCode();
        A7.b<Long> bVar = this.f5130a;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        A7.b<Long> bVar2 = this.f5131b;
        int iHashCode3 = iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        A7.b<Long> bVar3 = this.f5132c;
        int iHashCode4 = iHashCode3 + (bVar3 != null ? bVar3.hashCode() : 0);
        A7.b<Long> bVar4 = this.f5133d;
        int iHashCode5 = iHashCode4 + (bVar4 != null ? bVar4.hashCode() : 0);
        this.f5134e = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        F3.a aVar = (F3.a) D7.a.f1071b.f6853p2.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return F3.a.d(c0011a, this);
    }

    public E3(A7.b<Long> bVar, A7.b<Long> bVar2, A7.b<Long> bVar3, A7.b<Long> bVar4) {
        this.f5130a = bVar;
        this.f5131b = bVar2;
        this.f5132c = bVar3;
        this.f5133d = bVar4;
    }
}
