package a7;

import a7.EnumC1667d;
import c9.C2092m;
import c9.C2097r;
import c9.C2099t;
import d7.C4278a;
import d7.C4279b;
import d7.C4280c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Function.kt */
/* loaded from: classes.dex */
public abstract class g {

    /* compiled from: Function.kt */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public final String f14215a = "stub";

        /* renamed from: b, reason: collision with root package name */
        public final C2099t f14216b = C2099t.f18581b;

        /* renamed from: c, reason: collision with root package name */
        public final EnumC1667d f14217c = EnumC1667d.BOOLEAN;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f14218d = true;

        @Override // a7.g
        public final Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
            return Boolean.TRUE;
        }

        @Override // a7.g
        public final List<j> b() {
            return this.f14216b;
        }

        @Override // a7.g
        public final String c() {
            return this.f14215a;
        }

        @Override // a7.g
        public final EnumC1667d d() {
            return this.f14217c;
        }

        @Override // a7.g
        public final boolean f() {
            return this.f14218d;
        }
    }

    /* compiled from: Function.kt */
    public static abstract class b {

        /* compiled from: Function.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final int f14219a;

            public a(int i) {
                this.f14219a = i;
            }
        }

        /* compiled from: Function.kt */
        /* renamed from: a7.g$b$b, reason: collision with other inner class name */
        public static final class C0225b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final EnumC1667d f14220a;

            /* renamed from: b, reason: collision with root package name */
            public final EnumC1667d f14221b;

            public C0225b(EnumC1667d expected, EnumC1667d actual) {
                kotlin.jvm.internal.l.f(expected, "expected");
                kotlin.jvm.internal.l.f(actual, "actual");
                this.f14220a = expected;
                this.f14221b = actual;
            }
        }

        /* compiled from: Function.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final c f14222a = new c();
        }
    }

    /* compiled from: Function.kt */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14223a;

        static {
            int[] iArr = new int[EnumC1667d.values().length];
            try {
                iArr[EnumC1667d.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14223a = iArr;
        }
    }

    /* compiled from: Function.kt */
    public static final class d extends kotlin.jvm.internal.m implements p9.l<j, CharSequence> {

        /* renamed from: g, reason: collision with root package name */
        public static final d f14224g = new d(1);

        @Override // p9.l
        public final CharSequence invoke(j jVar) {
            j arg = jVar;
            kotlin.jvm.internal.l.f(arg, "arg");
            boolean z10 = arg.f14228b;
            EnumC1667d enumC1667d = arg.f14227a;
            if (!z10) {
                return enumC1667d.toString();
            }
            return "vararg " + enumC1667d;
        }
    }

    static {
        new a();
    }

    public abstract Object a(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list);

    public abstract List<j> b();

    public abstract String c();

    public abstract EnumC1667d d();

    public final Object e(X0.n nVar, AbstractC1664a abstractC1664a, List<? extends Object> list) {
        EnumC1667d enumC1667d;
        EnumC1667d enumC1667d2;
        Object objA = a(nVar, abstractC1664a, list);
        EnumC1667d.a aVar = EnumC1667d.Companion;
        boolean z10 = objA instanceof Long;
        if (z10) {
            enumC1667d = EnumC1667d.INTEGER;
        } else if (objA instanceof Double) {
            enumC1667d = EnumC1667d.NUMBER;
        } else if (objA instanceof Boolean) {
            enumC1667d = EnumC1667d.BOOLEAN;
        } else if (objA instanceof String) {
            enumC1667d = EnumC1667d.STRING;
        } else if (objA instanceof C4279b) {
            enumC1667d = EnumC1667d.DATETIME;
        } else if (objA instanceof C4278a) {
            enumC1667d = EnumC1667d.COLOR;
        } else if (objA instanceof C4280c) {
            enumC1667d = EnumC1667d.URL;
        } else if (objA instanceof JSONObject) {
            enumC1667d = EnumC1667d.DICT;
        } else {
            if (!(objA instanceof JSONArray)) {
                if (objA == null) {
                    throw new C1665b(null, "Unable to find type for null");
                }
                throw new C1665b(null, "Unable to find type for ".concat(objA.getClass().getName()));
            }
            enumC1667d = EnumC1667d.ARRAY;
        }
        if (enumC1667d == d()) {
            return objA;
        }
        StringBuilder sb = new StringBuilder("Function ");
        sb.append(this);
        sb.append(" returned ");
        if (z10) {
            enumC1667d2 = EnumC1667d.INTEGER;
        } else if (objA instanceof Double) {
            enumC1667d2 = EnumC1667d.NUMBER;
        } else if (objA instanceof Boolean) {
            enumC1667d2 = EnumC1667d.BOOLEAN;
        } else if (objA instanceof String) {
            enumC1667d2 = EnumC1667d.STRING;
        } else if (objA instanceof C4279b) {
            enumC1667d2 = EnumC1667d.DATETIME;
        } else if (objA instanceof C4278a) {
            enumC1667d2 = EnumC1667d.COLOR;
        } else if (objA instanceof C4280c) {
            enumC1667d2 = EnumC1667d.URL;
        } else if (objA instanceof JSONObject) {
            enumC1667d2 = EnumC1667d.DICT;
        } else {
            if (!(objA instanceof JSONArray)) {
                if (objA == null) {
                    throw new C1665b(null, "Unable to find type for null");
                }
                throw new C1665b(null, "Unable to find type for ".concat(objA.getClass().getName()));
            }
            enumC1667d2 = EnumC1667d.ARRAY;
        }
        sb.append(enumC1667d2);
        sb.append(", but ");
        sb.append(d());
        sb.append(" was expected.");
        throw new C1665b(null, sb.toString());
    }

    public abstract boolean f();

    public final b g(ArrayList arrayList, p9.p pVar) {
        int size = b().size();
        j jVar = (j) C2097r.w0(b());
        int size2 = jVar != null ? jVar.f14228b : false ? Integer.MAX_VALUE : b().size();
        if (arrayList.size() < size || arrayList.size() > size2) {
            return new b.a(size);
        }
        int size3 = arrayList.size();
        for (int i = 0; i < size3; i++) {
            List<j> listB = b();
            int iV = C2092m.V(b());
            if (i <= iV) {
                iV = i;
            }
            EnumC1667d enumC1667d = listB.get(iV).f14227a;
            if (!((Boolean) pVar.invoke(arrayList.get(i), enumC1667d)).booleanValue()) {
                return new b.C0225b(enumC1667d, (EnumC1667d) arrayList.get(i));
            }
        }
        return b.c.f14222a;
    }

    public final b h(ArrayList arrayList) {
        return g(arrayList, h.f14225g);
    }

    public final b i(ArrayList arrayList) {
        return g(arrayList, new i(this));
    }

    public final String toString() {
        return C2097r.u0(b(), null, c() + '(', ")", d.f14224g, 25);
    }
}
