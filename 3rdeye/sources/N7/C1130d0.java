package N7;

import A7.b;
import D7.a;
import N7.C1145e0;
import org.json.JSONObject;
import z7.InterfaceC5868a;

/* compiled from: DivAccessibility.kt */
/* renamed from: N7.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130d0 implements InterfaceC5868a {
    public static final b.C0000b i;

    /* renamed from: j, reason: collision with root package name */
    public static final b.C0000b f8034j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f8035k;

    /* renamed from: a, reason: collision with root package name */
    public final A7.b<String> f8036a;

    /* renamed from: b, reason: collision with root package name */
    public final A7.b<String> f8037b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.b<Boolean> f8038c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.b<a> f8039d;

    /* renamed from: e, reason: collision with root package name */
    public final A7.b<Boolean> f8040e;

    /* renamed from: f, reason: collision with root package name */
    public final A7.b<String> f8041f;

    /* renamed from: g, reason: collision with root package name */
    public final b f8042g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f8043h;

    /* compiled from: DivAccessibility.kt */
    /* renamed from: N7.d0$a */
    public enum a {
        DEFAULT("default"),
        MERGE("merge"),
        EXCLUDE("exclude");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<a, String> TO_STRING = b.f8045g;
        public static final p9.l<String, a> FROM_STRING = C0101a.f8044g;

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$a$a, reason: collision with other inner class name */
        public static final class C0101a extends kotlin.jvm.internal.m implements p9.l<String, a> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0101a f8044g = new C0101a(1);

            @Override // p9.l
            public final a invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                a aVar = a.DEFAULT;
                if (value.equals(aVar.value)) {
                    return aVar;
                }
                a aVar2 = a.MERGE;
                if (value.equals(aVar2.value)) {
                    return aVar2;
                }
                a aVar3 = a.EXCLUDE;
                if (value.equals(aVar3.value)) {
                    return aVar3;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$a$b */
        public static final class b extends kotlin.jvm.internal.m implements p9.l<a, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final b f8045g = new b(1);

            @Override // p9.l
            public final String invoke(a aVar) {
                a value = aVar;
                kotlin.jvm.internal.l.f(value, "value");
                a.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$a$c */
        public static final class c {
        }

        a(String str) {
            this.value = str;
        }
    }

    /* compiled from: DivAccessibility.kt */
    /* renamed from: N7.d0$b */
    public enum b {
        NONE("none"),
        BUTTON("button"),
        IMAGE("image"),
        TEXT("text"),
        EDIT_TEXT("edit_text"),
        HEADER("header"),
        TAB_BAR("tab_bar"),
        LIST("list"),
        SELECT("select"),
        CHECKBOX("checkbox"),
        RADIO("radio"),
        AUTO("auto");

        private final String value;
        public static final c Converter = new c();
        public static final p9.l<b, String> TO_STRING = C0102b.f8047g;
        public static final p9.l<String, b> FROM_STRING = a.f8046g;

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$b$a */
        public static final class a extends kotlin.jvm.internal.m implements p9.l<String, b> {

            /* renamed from: g, reason: collision with root package name */
            public static final a f8046g = new a(1);

            @Override // p9.l
            public final b invoke(String str) {
                String value = str;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                b bVar = b.NONE;
                if (value.equals(bVar.value)) {
                    return bVar;
                }
                b bVar2 = b.BUTTON;
                if (value.equals(bVar2.value)) {
                    return bVar2;
                }
                b bVar3 = b.IMAGE;
                if (value.equals(bVar3.value)) {
                    return bVar3;
                }
                b bVar4 = b.TEXT;
                if (value.equals(bVar4.value)) {
                    return bVar4;
                }
                b bVar5 = b.EDIT_TEXT;
                if (value.equals(bVar5.value)) {
                    return bVar5;
                }
                b bVar6 = b.HEADER;
                if (value.equals(bVar6.value)) {
                    return bVar6;
                }
                b bVar7 = b.TAB_BAR;
                if (value.equals(bVar7.value)) {
                    return bVar7;
                }
                b bVar8 = b.LIST;
                if (value.equals(bVar8.value)) {
                    return bVar8;
                }
                b bVar9 = b.SELECT;
                if (value.equals(bVar9.value)) {
                    return bVar9;
                }
                b bVar10 = b.CHECKBOX;
                if (value.equals(bVar10.value)) {
                    return bVar10;
                }
                b bVar11 = b.RADIO;
                if (value.equals(bVar11.value)) {
                    return bVar11;
                }
                b bVar12 = b.AUTO;
                if (value.equals(bVar12.value)) {
                    return bVar12;
                }
                return null;
            }
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$b$b, reason: collision with other inner class name */
        public static final class C0102b extends kotlin.jvm.internal.m implements p9.l<b, String> {

            /* renamed from: g, reason: collision with root package name */
            public static final C0102b f8047g = new C0102b(1);

            @Override // p9.l
            public final String invoke(b bVar) {
                b value = bVar;
                kotlin.jvm.internal.l.f(value, "value");
                b.Converter.getClass();
                return value.value;
            }
        }

        /* compiled from: DivAccessibility.kt */
        /* renamed from: N7.d0$b$c */
        public static final class c {
        }

        b(String str) {
            this.value = str;
        }
    }

    static {
        a value = a.DEFAULT;
        kotlin.jvm.internal.l.f(value, "value");
        i = new b.C0000b(value);
        f8034j = new b.C0000b(Boolean.FALSE);
        f8035k = b.AUTO;
    }

    public C1130d0() {
        this(null, null, null, i, f8034j, null, f8035k);
    }

    public final boolean a(C1130d0 c1130d0, A7.d resolver, A7.d otherResolver) {
        kotlin.jvm.internal.l.f(resolver, "resolver");
        kotlin.jvm.internal.l.f(otherResolver, "otherResolver");
        if (c1130d0 == null) {
            return false;
        }
        A7.b<String> bVar = this.f8036a;
        String strA = bVar != null ? bVar.a(resolver) : null;
        A7.b<String> bVar2 = c1130d0.f8036a;
        if (!kotlin.jvm.internal.l.b(strA, bVar2 != null ? bVar2.a(otherResolver) : null)) {
            return false;
        }
        A7.b<String> bVar3 = this.f8037b;
        String strA2 = bVar3 != null ? bVar3.a(resolver) : null;
        A7.b<String> bVar4 = c1130d0.f8037b;
        if (!kotlin.jvm.internal.l.b(strA2, bVar4 != null ? bVar4.a(otherResolver) : null)) {
            return false;
        }
        A7.b<Boolean> bVar5 = this.f8038c;
        Boolean boolA = bVar5 != null ? bVar5.a(resolver) : null;
        A7.b<Boolean> bVar6 = c1130d0.f8038c;
        if (!kotlin.jvm.internal.l.b(boolA, bVar6 != null ? bVar6.a(otherResolver) : null) || this.f8039d.a(resolver) != c1130d0.f8039d.a(otherResolver) || this.f8040e.a(resolver).booleanValue() != c1130d0.f8040e.a(otherResolver).booleanValue()) {
            return false;
        }
        A7.b<String> bVar7 = this.f8041f;
        String strA3 = bVar7 != null ? bVar7.a(resolver) : null;
        A7.b<String> bVar8 = c1130d0.f8041f;
        return kotlin.jvm.internal.l.b(strA3, bVar8 != null ? bVar8.a(otherResolver) : null) && this.f8042g == c1130d0.f8042g;
    }

    public final int b() {
        Integer num = this.f8043h;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.x.a(C1130d0.class).hashCode();
        A7.b<String> bVar = this.f8036a;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        A7.b<String> bVar2 = this.f8037b;
        int iHashCode3 = iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
        A7.b<Boolean> bVar3 = this.f8038c;
        int iHashCode4 = this.f8040e.hashCode() + this.f8039d.hashCode() + iHashCode3 + (bVar3 != null ? bVar3.hashCode() : 0);
        A7.b<String> bVar4 = this.f8041f;
        int iHashCode5 = this.f8042g.hashCode() + iHashCode4 + (bVar4 != null ? bVar4.hashCode() : 0);
        this.f8043h = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // z7.InterfaceC5868a
    public final JSONObject i() {
        C1145e0.b bVar = (C1145e0.b) D7.a.f1071b.f6479H.getValue();
        a.C0011a c0011a = D7.a.f1070a;
        bVar.getClass();
        return C1145e0.b.d(c0011a, this);
    }

    public C1130d0(A7.b<String> bVar, A7.b<String> bVar2, A7.b<Boolean> bVar3, A7.b<a> mode, A7.b<Boolean> muteAfterAction, A7.b<String> bVar4, b type) {
        kotlin.jvm.internal.l.f(mode, "mode");
        kotlin.jvm.internal.l.f(muteAfterAction, "muteAfterAction");
        kotlin.jvm.internal.l.f(type, "type");
        this.f8036a = bVar;
        this.f8037b = bVar2;
        this.f8038c = bVar3;
        this.f8039d = mode;
        this.f8040e = muteAfterAction;
        this.f8041f = bVar4;
        this.f8042g = type;
    }
}
