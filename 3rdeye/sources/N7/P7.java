package N7;

import A7.b;
import N7.T7;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivPatch.kt */
/* loaded from: classes.dex */
public final class P7 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f6008a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<b> f6009b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C1175g0> f6010c;

    /* renamed from: d, reason: collision with root package name */
    public final List<C1175g0> f6011d;

    /* compiled from: DivPatch.kt */
    public static final class a implements InterfaceC5868a {

        /* renamed from: a, reason: collision with root package name */
        public final String f6012a;

        /* renamed from: b, reason: collision with root package name */
        public final List<Z> f6013b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(String str, List<? extends Z> list) {
            this.f6012a = str;
            this.f6013b = list;
        }

        @Override // z7.InterfaceC5868a
        public final JSONObject i() {
            return ((Q7) D7.a.f1071b.f6422B5.getValue()).b(D7.a.f1070a, this);
        }
    }

    /* compiled from: DivPatch.kt */
    public enum b {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<b, String> TO_STRING = C0091b.f6015g;
        public static final p9.l<String, b> FROM_STRING = a.f6014g;

        /* compiled from: DivPatch.kt */
        public static final class a extends kotlin.jvm.internal.m implements p9.l<String, b> {

            /* renamed from: g, reason: collision with root package name */
            public static final a f6014g = new a(1);

            @Override // p9.l
            public final b invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                b bVar = b.TRANSACTIONAL;
                if (value.equals(bVar.value)) {
                    return bVar;
                }
                b bVar2 = b.PARTIAL;
                if (value.equals(bVar2.value)) {
                    return bVar2;
                }
                return null;
            }
        }

        /* compiled from: DivPatch.kt */
        /* renamed from: N7.P7$b$b, reason: collision with other inner class name */
        public static final class C0091b extends kotlin.jvm.internal.m implements p9.l<b, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0091b f6015g = new C0091b(1);

            @Override // p9.l
            public final String invoke(b bVar) {
                b value = bVar;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivPatch.kt */
        public static final class c {
        }

        b(String str) {
            this.value = str;
        }
    }

    static {
        b value = b.PARTIAL;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public P7(A7.b mode, List list, List list2, List list3) {
        kotlin.jvm.internal.l.f(mode, "mode");
        this.f6008a = list;
        this.f6009b = mode;
        this.f6010c = list2;
        this.f6011d = list3;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((T7.b) D7.a.f1071b.f6964z5.getValue()).b(D7.a.f1070a, this);
    }
}
