package N7;

import A7.b;
import D7.a;
import N7.C1149e4;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivDimension.kt */
/* renamed from: N7.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1134d4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<H9> f8066a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Double> f8067b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8068c;

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public C1134d4(A7.b<H9> unit, A7.b<Double> bVar) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f8066a = unit;
        this.f8067b = bVar;
    }

    public final boolean a(C1134d4 c1134d4, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return c1134d4 != null && this.f8066a.a(resolver) == c1134d4.f8066a.a(otherResolver) && this.f8067b.a(resolver).doubleValue() == c1134d4.f8067b.a(otherResolver).doubleValue();
    }

    public final int b() {
        Integer num = this.f8068c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f8067b.hashCode() + this.f8066a.hashCode() + kotlin.jvm.internal.x.a(C1134d4.class).hashCode();
        this.f8068c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1149e4.b bVar = (C1149e4.b) D7.a.f1071b.f6504J2.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1149e4.b.d(c0011a, this);
    }
}
