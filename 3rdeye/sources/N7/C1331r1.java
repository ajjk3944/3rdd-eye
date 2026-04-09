package N7;

import A7.b;
import D7.a;
import N7.C1345s1;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionScrollBy.kt */
/* renamed from: N7.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1331r1 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<Boolean> f9010a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f9011b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Long> f9012c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<Long> f9013d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<a> f9014e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f9015f;

    /* compiled from: DivActionScrollBy.kt */
    /* renamed from: N7.r1$a */
    public enum a {
        CLAMP("clamp"),
        RING("ring");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f9017g;
        public static final p9.l<String, a> FROM_STRING = C0111a.f9016g;

        /* compiled from: DivActionScrollBy.kt */
        /* renamed from: N7.r1$a$a, reason: collision with other inner class name */
        public static final class C0111a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0111a f9016g = new C0111a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.CLAMP;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.RING;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                return null;
            }
        }

        /* compiled from: DivActionScrollBy.kt */
        /* renamed from: N7.r1$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f9017g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivActionScrollBy.kt */
        /* renamed from: N7.r1$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    static {
        b.a.a(Boolean.TRUE);
        b.a.a(0L);
        b.a.a(0L);
        b.a.a(a.CLAMP);
    }

    public C1331r1(A7.b<Boolean> animated, A7.b<String> bVar, A7.b<Long> itemCount, A7.b<Long> offset, A7.b<a> overflow) {
        kotlin.jvm.internal.l.f(animated, "animated");
        kotlin.jvm.internal.l.f(itemCount, "itemCount");
        kotlin.jvm.internal.l.f(offset, "offset");
        kotlin.jvm.internal.l.f(overflow, "overflow");
        this.f9010a = animated;
        this.f9011b = bVar;
        this.f9012c = itemCount;
        this.f9013d = offset;
        this.f9014e = overflow;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1345s1.b bVar = (C1345s1.b) D7.a.f1071b.f6905u0.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1345s1.b.e(c0011a, this);
    }
}
