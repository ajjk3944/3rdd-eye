package N7;

import D7.a;
import N7.C1277n2;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionVideo.kt */
/* renamed from: N7.m2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1263m2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<a> f8747a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f8748b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8749c;

    /* compiled from: DivActionVideo.kt */
    /* renamed from: N7.m2$a */
    public enum a {
        START("start"),
        PAUSE("pause");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f8751g;
        public static final p9.l<String, a> FROM_STRING = C0107a.f8750g;

        /* compiled from: DivActionVideo.kt */
        /* renamed from: N7.m2$a$a, reason: collision with other inner class name */
        public static final class C0107a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0107a f8750g = new C0107a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.START;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.PAUSE;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                return null;
            }
        }

        /* compiled from: DivActionVideo.kt */
        /* renamed from: N7.m2$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f8751g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivActionVideo.kt */
        /* renamed from: N7.m2$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    public C1263m2(A7.b<a> bVar, A7.b<String> bVar2) {
        this.f8747a = bVar;
        this.f8748b = bVar2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1277n2.b bVar = (C1277n2.b) D7.a.f1071b.f6731e1.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1277n2.b.e(c0011a, this);
    }
}
