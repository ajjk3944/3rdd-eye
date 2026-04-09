package N7;

import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPoint.kt */
/* renamed from: N7.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1325q8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final C1134d4 f8992a;

    /* renamed from: b, reason: collision with root package name */
    public final C1134d4 f8993b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8994c;

    public C1325q8(C1134d4 c1134d4, C1134d4 c1134d42) {
        this.f8992a = c1134d4;
        this.f8993b = c1134d42;
    }

    public final boolean a(C1325q8 c1325q8, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        return c1325q8 != null && this.f8992a.a(c1325q8.f8992a, resolver, otherResolver) && this.f8993b.a(c1325q8.f8993b, resolver, otherResolver);
    }

    public final int b() {
        Integer num = this.f8994c;
        if (num != null) {
            return num.intValue();
        }
        int iB = this.f8993b.b() + this.f8992a.b() + kotlin.jvm.internal.x.a(C1325q8.class).hashCode();
        this.f8994c = Integer.valueOf(iB);
        return iB;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1338r8) D7.a.f1071b.f6612T5.getValue()).b(D7.a.f1070a, this);
    }
}
