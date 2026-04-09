package N7;

import A7.b;
import N7.J9;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivSlideTransition.kt */
/* loaded from: classes.dex */
public final class I9 implements InterfaceC5868a {

    /* renamed from: g, reason: collision with root package name */
    public static final b.C0000b f5478g = b.a.a(200L);

    /* renamed from: h, reason: collision with root package name */
    public static final b.C0000b f5479h = b.a.a(a.BOTTOM);
    public static final b.C0000b i = b.a.a(EnumC1360t2.EASE_IN_OUT);

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f5480j = b.a.a(0L);

    /* renamed from: a, reason: collision with root package name */
    public final C1134d4 f5481a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Long> f5482b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<a> f5483c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<EnumC1360t2> f5484d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Long> f5485e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f5486f;

    /* compiled from: DivSlideTransition.kt */
    public enum a {
        LEFT("left"),
        TOP("top"),
        RIGHT("right"),
        BOTTOM("bottom");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f5488g;
        public static final p9.l<String, a> FROM_STRING = C0085a.f5487g;

        /* compiled from: DivSlideTransition.kt */
        /* renamed from: N7.I9$a$a, reason: collision with other inner class name */
        public static final class C0085a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0085a f5487g = new C0085a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.LEFT;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.TOP;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.RIGHT;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                a aVar4 = a.BOTTOM;
                if (value.equals(aVar4.value)) {
                    return aVar4;
                }
                return null;
            }
        }

        /* compiled from: DivSlideTransition.kt */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f5488g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivSlideTransition.kt */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    public I9(C1134d4 c1134d4, A7.b<Long> duration, A7.b<a> edge, A7.b<EnumC1360t2> interpolator, A7.b<Long> startDelay) {
        kotlin.jvm.internal.l.f(duration, "duration");
        kotlin.jvm.internal.l.f(edge, "edge");
        kotlin.jvm.internal.l.f(interpolator, "interpolator");
        kotlin.jvm.internal.l.f(startDelay, "startDelay");
        this.f5481a = c1134d4;
        this.f5482b = duration;
        this.f5483c = edge;
        this.f5484d = interpolator;
        this.f5485e = startDelay;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((J9.c) D7.a.f1071b.f6634V6.getValue()).b(D7.a.f1070a, this);
    }

    public I9() {
        this(null, f5478g, f5479h, i, f5480j);
    }
}
