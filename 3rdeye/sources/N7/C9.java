package N7;

import N7.C1412wc;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSize.kt */
/* loaded from: classes.dex */
public abstract class C9 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5042a;

    /* compiled from: DivSize.kt */
    public static final class a extends C9 {

        /* renamed from: b, reason: collision with root package name */
        public final W4 f5043b;

        public a(W4 w42) {
            this.f5043b = w42;
        }
    }

    /* compiled from: DivSize.kt */
    public static final class b extends C9 {

        /* renamed from: b, reason: collision with root package name */
        public final V6 f5044b;

        public b(V6 v62) {
            this.f5044b = v62;
        }
    }

    /* compiled from: DivSize.kt */
    public static final class c extends C9 {

        /* renamed from: b, reason: collision with root package name */
        public final C1412wc f5045b;

        public c(C1412wc c1412wc) {
            this.f5045b = c1412wc;
        }
    }

    public final boolean a(C9 c92, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c92 != null) {
            if (this instanceof a) {
                a aVar = (a) this;
                Object objC = c92.c();
                return aVar.f5043b.a(objC instanceof W4 ? (W4) objC : null, resolver, otherResolver);
            }
            if (this instanceof b) {
                b bVar = (b) this;
                Object objC2 = c92.c();
                V6 v62 = objC2 instanceof V6 ? (V6) objC2 : null;
                V6 v63 = bVar.f5044b;
                v63.getClass();
                if (v62 != null) {
                    A7.b<Double> bVar2 = v63.f7573a;
                    Double dA = bVar2 != null ? bVar2.a(resolver) : null;
                    A7.b<Double> bVar3 = v62.f7573a;
                    return kotlin.jvm.internal.l.a(dA, bVar3 != null ? bVar3.a(otherResolver) : null);
                }
            } else {
                if (!(this instanceof c)) {
                    throw new b9.j();
                }
                c cVar = (c) this;
                Object objC3 = c92.c();
                C1412wc c1412wc = objC3 instanceof C1412wc ? (C1412wc) objC3 : null;
                C1412wc c1412wc2 = cVar.f5045b;
                c1412wc2.getClass();
                if (c1412wc != null) {
                    A7.b<Boolean> bVar4 = c1412wc2.f9737a;
                    Boolean boolA = bVar4 != null ? bVar4.a(resolver) : null;
                    A7.b<Boolean> bVar5 = c1412wc.f9737a;
                    if (kotlin.jvm.internal.l.b(boolA, bVar5 != null ? bVar5.a(otherResolver) : null)) {
                        C1412wc.a aVar2 = c1412wc.f9738b;
                        C1412wc.a aVar3 = c1412wc2.f9738b;
                        if (aVar3 != null ? aVar3.a(aVar2, resolver, otherResolver) : aVar2 == null) {
                            C1412wc.a aVar4 = c1412wc.f9739c;
                            C1412wc.a aVar5 = c1412wc2.f9739c;
                            if (aVar5 != null ? aVar5.a(aVar4, resolver, otherResolver) : aVar4 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int b() {
        int iB;
        int iIntValue;
        Integer num = this.f5042a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(getClass()).hashCode();
        if (this instanceof a) {
            iIntValue = ((a) this).f5043b.b();
        } else {
            if (this instanceof b) {
                V6 v62 = ((b) this).f5044b;
                Integer num2 = v62.f7574b;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    int iHashCode2 = kotlin.jvm.internal.x.a(V6.class).hashCode();
                    A7.b<Double> bVar = v62.f7573a;
                    iB = iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
                    v62.f7574b = Integer.valueOf(iB);
                    iIntValue = iB;
                }
            } else {
                if (!(this instanceof c)) {
                    throw new b9.j();
                }
                C1412wc c1412wc = ((c) this).f5045b;
                Integer num3 = c1412wc.f9740d;
                if (num3 != null) {
                    iIntValue = num3.intValue();
                } else {
                    int iHashCode3 = kotlin.jvm.internal.x.a(C1412wc.class).hashCode();
                    A7.b<Boolean> bVar2 = c1412wc.f9737a;
                    int iHashCode4 = iHashCode3 + (bVar2 != null ? bVar2.hashCode() : 0);
                    C1412wc.a aVar = c1412wc.f9738b;
                    int iB2 = iHashCode4 + (aVar != null ? aVar.b() : 0);
                    C1412wc.a aVar2 = c1412wc.f9739c;
                    iB = iB2 + (aVar2 != null ? aVar2.b() : 0);
                    c1412wc.f9740d = Integer.valueOf(iB);
                    iIntValue = iB;
                }
            }
        }
        int i = iHashCode + iIntValue;
        this.f5042a = Integer.valueOf(i);
        return i;
    }

    public final Object c() {
        if (this instanceof a) {
            return ((a) this).f5043b;
        }
        if (this instanceof b) {
            return ((b) this).f5044b;
        }
        if (this instanceof c) {
            return ((c) this).f5045b;
        }
        throw new b9.j();
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((D9) D7.a.f1071b.f6602S6.getValue()).b(D7.a.f1070a, this);
    }
}
