package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivExtension.kt */
/* renamed from: N7.x4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418x4 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f9755a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f9756b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f9757c;

    public C1418x4(String str, JSONObject jSONObject) {
        this.f9755a = str;
        this.f9756b = jSONObject;
    }

    public final boolean a(C1418x4 c1418x4, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return c1418x4 != null && kotlin.jvm.internal.l.b(this.f9755a, c1418x4.f9755a) && kotlin.jvm.internal.l.b(this.f9756b, c1418x4.f9756b);
    }

    public final int b() {
        Integer num = this.f9757c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f9755a.hashCode() + kotlin.jvm.internal.x.a(C1418x4.class).hashCode();
        JSONObject jSONObject = this.f9756b;
        int iHashCode2 = iHashCode + (jSONObject != null ? jSONObject.hashCode() : 0);
        this.f9757c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1432y4 c1432y4 = (C1432y4) D7.a.f1071b.f6662Y2.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        c1432y4.getClass();
        return C1432y4.d(c0011a, this);
    }
}
