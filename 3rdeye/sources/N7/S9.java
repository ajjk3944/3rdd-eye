package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSolidBackground.kt */
/* loaded from: classes.dex */
public final class S9 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Integer> f6211a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f6212b;

    public S9(A7.b<Integer> bVar) {
        this.f6211a = bVar;
    }

    public final boolean a(S9 s92, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return s92 != null && this.f6211a.a(resolver).intValue() == s92.f6211a.a(otherResolver).intValue();
    }

    public final int b() {
        Integer num = this.f6212b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = this.f6211a.hashCode() + kotlin.jvm.internal.x.a(S9.class).hashCode();
        this.f6212b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        T9 t92 = (T9) D7.a.f1071b.f6772h7.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        t92.getClass();
        return T9.e(c0011a, this);
    }
}
