package N7;

import A7.b;
import D7.a;
import N7.D1;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionSetState.kt */
/* loaded from: classes.dex */
public final class C1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<String> f5007a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f5008b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5009c;

    static {
        new b.C0000b(Boolean.TRUE);
    }

    public C1(A7.b<String> bVar, A7.b<Boolean> temporary) {
        kotlin.jvm.internal.l.f(temporary, "temporary");
        this.f5007a = bVar;
        this.f5008b = temporary;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        D1.a aVar = (D1.a) D7.a.f1071b.f6439D0.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        aVar.getClass();
        return D1.a.e(c0011a, this);
    }
}
