package N7;

import D7.a;
import N7.T8;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivRadialGradientRelativeRadius.kt */
/* loaded from: classes.dex */
public final class S8 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<a> f6207a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f6208b;

    /* compiled from: DivRadialGradientRelativeRadius.kt */
    public enum a {
        NEAREST_CORNER("nearest_corner"),
        FARTHEST_CORNER("farthest_corner"),
        NEAREST_SIDE("nearest_side"),
        FARTHEST_SIDE("farthest_side");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f6210g;
        public static final p9.l<String, a> FROM_STRING = C0092a.f6209g;

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        /* renamed from: N7.S8$a$a, reason: collision with other inner class name */
        public static final class C0092a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0092a f6209g = new C0092a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.NEAREST_CORNER;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.FARTHEST_CORNER;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.NEAREST_SIDE;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                a aVar4 = a.FARTHEST_SIDE;
                if (value.equals(aVar4.value)) {
                    return aVar4;
                }
                return null;
            }
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f6210g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivRadialGradientRelativeRadius.kt */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    public S8(A7.b<a> bVar) {
        this.f6207a = bVar;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        T8.b bVar = (T8.b) D7.a.f1071b.f6782i6.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return T8.b.e(c0011a, this);
    }
}
