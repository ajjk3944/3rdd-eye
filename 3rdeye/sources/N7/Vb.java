package N7;

import A7.b;
import N7.Wb;
import c9.C2092m;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivTrigger.kt */
/* loaded from: classes.dex */
public final class Vb implements InterfaceC5868a {

    /* renamed from: a, reason: collision with root package name */
    public final List<C1175g0> f7599a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<Boolean> f7600b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<a> f7601c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f7602d;

    /* compiled from: DivTrigger.kt */
    public enum a {
        ON_CONDITION("on_condition"),
        ON_VARIABLE("on_variable");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f7604g;
        public static final p9.l<String, a> FROM_STRING = C0099a.f7603g;

        /* compiled from: DivTrigger.kt */
        /* renamed from: N7.Vb$a$a, reason: collision with other inner class name */
        public static final class C0099a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0099a f7603g = new C0099a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.ON_CONDITION;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.ON_VARIABLE;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                return null;
            }
        }

        /* compiled from: DivTrigger.kt */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f7604g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivTrigger.kt */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    static {
        a value = a.ON_CONDITION;
        kotlin.jvm.internal.l.f(value, "value");
        new b.C0000b(value);
    }

    public Vb(List<C1175g0> list, A7.b<Boolean> bVar, A7.b<a> mode) {
        kotlin.jvm.internal.l.f(mode, "mode");
        this.f7599a = list;
        this.f7600b = bVar;
        this.f7601c = mode;
    }

    public final boolean a(Vb vb, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (vb != null) {
            List<C1175g0> list = this.f7599a;
            int size = list.size();
            List<C1175g0> list2 = vb.f7599a;
            if (size == list2.size()) {
                Iterator<T> it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        if (this.f7600b.a(resolver).booleanValue() != vb.f7600b.a(otherResolver).booleanValue() || this.f7601c.a(resolver) != vb.f7601c.a(otherResolver)) {
                            break;
                        }
                        return true;
                    }
                    Object next = it.next();
                    int i10 = i + 1;
                    if (i < 0) {
                        C2092m.a0();
                        throw null;
                    }
                    if (!((C1175g0) next).a(list2.get(i), resolver, otherResolver)) {
                        break;
                    }
                    i = i10;
                }
            }
        }
        return false;
    }

    public final int b() {
        Integer num = this.f7602d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(Vb.class).hashCode();
        Iterator<T> it = this.f7599a.iterator();
        int iB = 0;
        while (it.hasNext()) {
            iB += ((C1175g0) it.next()).b();
        }
        int iHashCode2 = this.f7601c.hashCode() + this.f7600b.hashCode() + iHashCode + iB;
        this.f7602d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        return ((Wb.b) D7.a.f1071b.f6636V8.getValue()).b(D7.a.f1070a, this);
    }
}
