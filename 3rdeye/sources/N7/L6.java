package N7;

import D7.a;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivLayoutProvider.kt */
/* loaded from: classes.dex */
public final class L6 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final String f5755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5756b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5757c;

    public L6() {
        this(null, null);
    }

    public final boolean a(L6 l62, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return l62 != null && kotlin.jvm.internal.l.b(this.f5755a, l62.f5755a) && kotlin.jvm.internal.l.b(this.f5756b, l62.f5756b);
    }

    public final int b() {
        Integer num = this.f5757c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(L6.class).hashCode();
        String str = this.f5755a;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f5756b;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.f5757c = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        M6 m62 = (M6) D7.a.f1071b.f6506J4.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        m62.getClass();
        return M6.d(c0011a, this);
    }

    public L6(String str, String str2) {
        this.f5755a = str;
        this.f5756b = str2;
    }
}
