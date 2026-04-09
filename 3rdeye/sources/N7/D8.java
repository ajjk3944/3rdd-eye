package N7;

import A7.b;
import D7.a;
import N7.E8;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientFixedCenter.kt */
/* loaded from: classes.dex */
public final class D8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<H9> f5115a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f5116b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5117c;

    static {
        H9 value = H9.DP;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public D8(A7.b<H9> unit, A7.b<Long> bVar) {
        kotlin.jvm.internal.l.f(unit, "unit");
        this.f5115a = unit;
        this.f5116b = bVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        E8.b bVar = (E8.b) D7.a.f1071b.f6676Z5.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return E8.b.e(c0011a, this);
    }
}
