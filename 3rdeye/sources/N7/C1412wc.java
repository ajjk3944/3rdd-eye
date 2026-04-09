package N7;

import A7.b;
import D7.a;
import N7.C1426xc;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivWrapContentSize.kt */
/* renamed from: N7.wc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412wc implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f9737a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9738b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9739c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f9740d;

    /* compiled from: DivWrapContentSize.kt */
    /* renamed from: N7.wc$a */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final A7.b<H9> f9741a;

        /* renamed from: b, reason: collision with root package name */
        public final A7.b<Long> f9742b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f9743c;

        static {
            H9 value = H9.DP;
            kotlin.jvm.internal.l.f(value, "value");
            new b.C0000b(value);
        }

        public a(A7.b<H9> unit, A7.b<Long> bVar) {
            kotlin.jvm.internal.l.f(unit, "unit");
            this.f9741a = unit;
            this.f9742b = bVar;
        }

        public final boolean a(a aVar, A7.d resolver, A7.d otherResolver) {
            kotlin.jvm.internal.l.f(resolver, "resolver");
            kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
            return aVar != null && this.f9741a.a(resolver) == aVar.f9741a.a(otherResolver) && this.f9742b.a(resolver).longValue() == aVar.f9742b.a(otherResolver).longValue();
        }

        public final int b() {
            Integer num = this.f9743c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = this.f9742b.hashCode() + this.f9741a.hashCode() + kotlin.jvm.internal.x.a(a.class).hashCode();
            this.f9743c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            C1426xc.b bVar = (C1426xc.b) D7.a.f1071b.f6903t9.getValue();
            a.C0011a c0011a = D7.a.f1070a;
            bVar.getClass();
            return C1426xc.b.d(c0011a, this);
        }
    }

    public C1412wc() {
        this(null, null, null);
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((C1440yc) D7.a.f1071b.f6871q9.getValue()).b(D7.a.f1070a, this);
    }

    public C1412wc(A7.b<Boolean> bVar, a aVar, a aVar2) {
        this.f9737a = bVar;
        this.f9738b = aVar;
        this.f9739c = aVar2;
    }
}
