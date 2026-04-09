package N7;

import D7.a;
import N7.C1162f2;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivActionTimer.kt */
/* renamed from: N7.e2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1147e2 implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<a> f8149a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f8150b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f8151c;

    /* compiled from: DivActionTimer.kt */
    /* renamed from: N7.e2$a */
    public enum a {
        START("start"),
        STOP("stop"),
        PAUSE("pause"),
        RESUME("resume"),
        CANCEL("cancel"),
        RESET("reset");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f8153g;
        public static final p9.l<String, a> FROM_STRING = C0103a.f8152g;

        /* compiled from: DivActionTimer.kt */
        /* renamed from: N7.e2$a$a, reason: collision with other inner class name */
        public static final class C0103a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0103a f8152g = new C0103a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.START;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.STOP;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.PAUSE;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                a aVar4 = a.RESUME;
                if (value.equals(aVar4.value)) {
                    return aVar4;
                }
                a aVar5 = a.CANCEL;
                if (value.equals(aVar5.value)) {
                    return aVar5;
                }
                a aVar6 = a.RESET;
                if (value.equals(aVar6.value)) {
                    return aVar6;
                }
                return null;
            }
        }

        /* compiled from: DivActionTimer.kt */
        /* renamed from: N7.e2$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f8153g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivActionTimer.kt */
        /* renamed from: N7.e2$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    public C1147e2(A7.b<a> bVar, A7.b<String> bVar2) {
        this.f8149a = bVar;
        this.f8150b = bVar2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1162f2.b bVar = (C1162f2.b) D7.a.f1071b.f6660Y0.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1162f2.b.e(c0011a, this);
    }
}
