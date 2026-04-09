package N7;

import A7.b;
import N7.Y2;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivBorder.kt */
/* loaded from: classes.dex */
public final class X2 implements InterfaceC5868a {

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f7686g = new b.C0000b(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Long> f7687a;

    /* renamed from: b, reason: collision with root package name */
    public final E3 f7688b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Boolean> f7689c;

    /* renamed from: d, reason: collision with root package name */
    public final C1298o9 f7690d;

    /* renamed from: e, reason: collision with root package name */
    public final C1185ga f7691e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f7692f;

    public X2() {
        this(null, null, f7686g, null, null);
    }

    public final boolean a(X2 x22, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (x22 != null) {
            A7.b<Long> bVar = this.f7687a;
            Long lA = bVar != null ? bVar.a(resolver) : null;
            A7.b<Long> bVar2 = x22.f7687a;
            if (kotlin.jvm.internal.l.b(lA, bVar2 != null ? bVar2.a(otherResolver) : null)) {
                E3 e32 = x22.f7688b;
                E3 e33 = this.f7688b;
                if ((e33 != null ? e33.a(e32, resolver, otherResolver) : e32 == null) && this.f7689c.a(resolver).booleanValue() == x22.f7689c.a(otherResolver).booleanValue()) {
                    C1298o9 c1298o9 = x22.f7690d;
                    C1298o9 c1298o92 = this.f7690d;
                    if (c1298o92 != null ? c1298o92.a(c1298o9, resolver, otherResolver) : c1298o9 == null) {
                        C1185ga c1185ga = x22.f7691e;
                        C1185ga c1185ga2 = this.f7691e;
                        if (c1185ga2 != null ? c1185ga2.a(c1185ga, resolver, otherResolver) : c1185ga == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f7692f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(X2.class).hashCode();
        A7.b<Long> bVar = this.f7687a;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        E3 e32 = this.f7688b;
        int iHashCode3 = this.f7689c.hashCode() + iHashCode2 + (e32 != null ? e32.b() : 0);
        C1298o9 c1298o9 = this.f7690d;
        int iB = iHashCode3 + (c1298o9 != null ? c1298o9.b() : 0);
        C1185ga c1185ga = this.f7691e;
        int iB2 = iB + (c1185ga != null ? c1185ga.b() : 0);
        this.f7692f = Integer.valueOf(iB2);
        return iB2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Y2.a) D7.a.f1071b.f6492I1.getValue()).b(D7.a.f1070a, this);
    }

    public X2(A7.b<Long> bVar, E3 e32, A7.b<Boolean> hasShadow, C1298o9 c1298o9, C1185ga c1185ga) {
        kotlin.jvm.internal.l.f(hasShadow, "hasShadow");
        this.f7687a = bVar;
        this.f7688b = e32;
        this.f7689c = hasShadow;
        this.f7690d = c1298o9;
        this.f7691e = c1185ga;
    }
}
