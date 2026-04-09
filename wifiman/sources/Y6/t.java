package Y6;

import Y6.h;
import Y6.k;
import a7.AbstractC3770c;
import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final h.d f24744a = new c();

    /* renamed from: b, reason: collision with root package name */
    static final Y6.h f24745b = new d();

    /* renamed from: c, reason: collision with root package name */
    static final Y6.h f24746c = new e();

    /* renamed from: d, reason: collision with root package name */
    static final Y6.h f24747d = new f();

    /* renamed from: e, reason: collision with root package name */
    static final Y6.h f24748e = new g();

    /* renamed from: f, reason: collision with root package name */
    static final Y6.h f24749f = new h();

    /* renamed from: g, reason: collision with root package name */
    static final Y6.h f24750g = new i();

    /* renamed from: h, reason: collision with root package name */
    static final Y6.h f24751h = new j();

    /* renamed from: i, reason: collision with root package name */
    static final Y6.h f24752i = new k();

    /* renamed from: j, reason: collision with root package name */
    static final Y6.h f24753j = new a();

    class a extends Y6.h {
        a() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public String b(Y6.k kVar) {
            return kVar.Y();
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, String str) {
            oVar.r0(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24754a;

        static {
            int[] iArr = new int[k.c.values().length];
            f24754a = iArr;
            try {
                iArr[k.c.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24754a[k.c.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24754a[k.c.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24754a[k.c.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24754a[k.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24754a[k.c.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    class c implements h.d {
        c() {
        }

        @Override // Y6.h.d
        public Y6.h a(Type type, Set set, r rVar) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return t.f24745b;
            }
            if (type == Byte.TYPE) {
                return t.f24746c;
            }
            if (type == Character.TYPE) {
                return t.f24747d;
            }
            if (type == Double.TYPE) {
                return t.f24748e;
            }
            if (type == Float.TYPE) {
                return t.f24749f;
            }
            if (type == Integer.TYPE) {
                return t.f24750g;
            }
            if (type == Long.TYPE) {
                return t.f24751h;
            }
            if (type == Short.TYPE) {
                return t.f24752i;
            }
            if (type == Boolean.class) {
                return t.f24745b.g();
            }
            if (type == Byte.class) {
                return t.f24746c.g();
            }
            if (type == Character.class) {
                return t.f24747d.g();
            }
            if (type == Double.class) {
                return t.f24748e.g();
            }
            if (type == Float.class) {
                return t.f24749f.g();
            }
            if (type == Integer.class) {
                return t.f24750g.g();
            }
            if (type == Long.class) {
                return t.f24751h.g();
            }
            if (type == Short.class) {
                return t.f24752i.g();
            }
            if (type == String.class) {
                return t.f24753j.g();
            }
            if (type == Object.class) {
                return new m(rVar).g();
            }
            Class clsG = v.g(type);
            Y6.h hVarD = AbstractC3770c.d(rVar, type, clsG);
            if (hVarD != null) {
                return hVarD;
            }
            if (clsG.isEnum()) {
                return new l(clsG).g();
            }
            return null;
        }
    }

    class d extends Y6.h {
        d() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Boolean b(Y6.k kVar) {
            return Boolean.valueOf(kVar.y());
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Boolean bool) {
            oVar.s0(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    class e extends Y6.h {
        e() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Byte b(Y6.k kVar) {
            return Byte.valueOf((byte) t.a(kVar, "a byte", -128, 255));
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Byte b10) {
            oVar.o0(b10.intValue() & 255);
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    class f extends Y6.h {
        f() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Character b(Y6.k kVar) {
            String strY = kVar.Y();
            if (strY.length() <= 1) {
                return Character.valueOf(strY.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", "a char", '\"' + strY + '\"', kVar.getPath()));
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Character ch2) {
            oVar.r0(ch2.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    class g extends Y6.h {
        g() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Double b(Y6.k kVar) {
            return Double.valueOf(kVar.C());
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Double d10) {
            oVar.n0(d10.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    class h extends Y6.h {
        h() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Float b(Y6.k kVar) {
            float fC = (float) kVar.C();
            if (kVar.v() || !Float.isInfinite(fC)) {
                return Float.valueOf(fC);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + fC + " at path " + kVar.getPath());
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Float f10) {
            f10.getClass();
            oVar.q0(f10);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    class i extends Y6.h {
        i() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer b(Y6.k kVar) {
            return Integer.valueOf(kVar.J());
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Integer num) {
            oVar.o0(num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    class j extends Y6.h {
        j() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Long b(Y6.k kVar) {
            return Long.valueOf(kVar.P());
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Long l10) {
            oVar.o0(l10.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    class k extends Y6.h {
        k() {
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Short b(Y6.k kVar) {
            return Short.valueOf((short) t.a(kVar, "a short", -32768, javax.jmdns.impl.constants.d.CLASS_MASK));
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Short sh2) {
            oVar.o0(sh2.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    static final class l extends Y6.h {

        /* renamed from: a, reason: collision with root package name */
        private final Class f24755a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f24756b;

        /* renamed from: c, reason: collision with root package name */
        private final Enum[] f24757c;

        /* renamed from: d, reason: collision with root package name */
        private final k.b f24758d;

        l(Class cls) {
            this.f24755a = cls;
            try {
                Enum[] enumArr = (Enum[]) cls.getEnumConstants();
                this.f24757c = enumArr;
                this.f24756b = new String[enumArr.length];
                int i10 = 0;
                while (true) {
                    Enum[] enumArr2 = this.f24757c;
                    if (i10 >= enumArr2.length) {
                        this.f24758d = k.b.a(this.f24756b);
                        return;
                    } else {
                        String strName = enumArr2[i10].name();
                        this.f24756b[i10] = AbstractC3770c.n(strName, cls.getField(strName));
                        i10++;
                    }
                }
            } catch (NoSuchFieldException e10) {
                throw new AssertionError("Missing field in " + cls.getName(), e10);
            }
        }

        @Override // Y6.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Enum b(Y6.k kVar) {
            int iQ0 = kVar.q0(this.f24758d);
            if (iQ0 != -1) {
                return this.f24757c[iQ0];
            }
            String path = kVar.getPath();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f24756b) + " but was " + kVar.Y() + " at path " + path);
        }

        @Override // Y6.h
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public void j(o oVar, Enum r32) {
            oVar.r0(this.f24756b[r32.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f24755a.getName() + ")";
        }
    }

    static final class m extends Y6.h {

        /* renamed from: a, reason: collision with root package name */
        private final r f24759a;

        /* renamed from: b, reason: collision with root package name */
        private final Y6.h f24760b;

        /* renamed from: c, reason: collision with root package name */
        private final Y6.h f24761c;

        /* renamed from: d, reason: collision with root package name */
        private final Y6.h f24762d;

        /* renamed from: e, reason: collision with root package name */
        private final Y6.h f24763e;

        /* renamed from: f, reason: collision with root package name */
        private final Y6.h f24764f;

        m(r rVar) {
            this.f24759a = rVar;
            this.f24760b = rVar.c(List.class);
            this.f24761c = rVar.c(Map.class);
            this.f24762d = rVar.c(String.class);
            this.f24763e = rVar.c(Double.class);
            this.f24764f = rVar.c(Boolean.class);
        }

        private Class l(Class cls) {
            return Map.class.isAssignableFrom(cls) ? Map.class : Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }

        @Override // Y6.h
        public Object b(Y6.k kVar) {
            switch (b.f24754a[kVar.d0().ordinal()]) {
                case 1:
                    return this.f24760b.b(kVar);
                case 2:
                    return this.f24761c.b(kVar);
                case 3:
                    return this.f24762d.b(kVar);
                case 4:
                    return this.f24763e.b(kVar);
                case 5:
                    return this.f24764f.b(kVar);
                case 6:
                    return kVar.T();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.d0() + " at path " + kVar.getPath());
            }
        }

        @Override // Y6.h
        public void j(o oVar, Object obj) {
            Class<?> cls = obj.getClass();
            if (cls != Object.class) {
                this.f24759a.e(l(cls), AbstractC3770c.f25735a).j(oVar, obj);
            } else {
                oVar.h();
                oVar.v();
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    static int a(Y6.k kVar, String str, int i10, int i11) {
        int iJ = kVar.J();
        if (iJ < i10 || iJ > i11) {
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(iJ), kVar.getPath()));
        }
        return iJ;
    }
}
