package xh;

import Gh.AbstractC2914f;
import Zg.AbstractC3689v;
import Zg.U;
import fh.AbstractC5827b;
import fh.InterfaceC5826a;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xh.h;

/* renamed from: xh.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8533a implements h {

    /* renamed from: a, reason: collision with root package name */
    private final Class f66099a;

    /* renamed from: b, reason: collision with root package name */
    private final List f66100b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC2347a f66101c;

    /* renamed from: d, reason: collision with root package name */
    private final List f66102d;

    /* renamed from: e, reason: collision with root package name */
    private final List f66103e;

    /* renamed from: f, reason: collision with root package name */
    private final List f66104f;

    /* renamed from: g, reason: collision with root package name */
    private final List f66105g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: xh.a$a, reason: collision with other inner class name */
    public static final class EnumC2347a {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ EnumC2347a[] $VALUES;
        public static final EnumC2347a CALL_BY_NAME = new EnumC2347a("CALL_BY_NAME", 0);
        public static final EnumC2347a POSITIONAL_CALL = new EnumC2347a("POSITIONAL_CALL", 1);

        private static final /* synthetic */ EnumC2347a[] $values() {
            return new EnumC2347a[]{CALL_BY_NAME, POSITIONAL_CALL};
        }

        static {
            EnumC2347a[] enumC2347aArr$values = $values();
            $VALUES = enumC2347aArr$values;
            $ENTRIES = AbstractC5827b.a(enumC2347aArr$values);
        }

        private EnumC2347a(String str, int i10) {
        }

        public static EnumC2347a valueOf(String str) {
            return (EnumC2347a) Enum.valueOf(EnumC2347a.class, str);
        }

        public static EnumC2347a[] values() {
            return (EnumC2347a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: xh.a$b */
    public static final class b {
        private static final /* synthetic */ InterfaceC5826a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b JAVA = new b("JAVA", 0);
        public static final b KOTLIN = new b("KOTLIN", 1);

        private static final /* synthetic */ b[] $values() {
            return new b[]{JAVA, KOTLIN};
        }

        static {
            b[] bVarArr$values = $values();
            $VALUES = bVarArr$values;
            $ENTRIES = AbstractC5827b.a(bVarArr$values);
        }

        private b(String str, int i10) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public C8533a(Class jClass, List parameterNames, EnumC2347a callMode, b origin, List methods) {
        AbstractC6492s.i(jClass, "jClass");
        AbstractC6492s.i(parameterNames, "parameterNames");
        AbstractC6492s.i(callMode, "callMode");
        AbstractC6492s.i(origin, "origin");
        AbstractC6492s.i(methods, "methods");
        this.f66099a = jClass;
        this.f66100b = parameterNames;
        this.f66101c = callMode;
        this.f66102d = methods;
        List list = methods;
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f66103e = arrayList;
        List list2 = this.f66102d;
        ArrayList arrayList2 = new ArrayList(AbstractC3689v.w(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            AbstractC6492s.f(returnType);
            Class<?> clsK = AbstractC2914f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.f66104f = arrayList2;
        List list3 = this.f66102d;
        ArrayList arrayList3 = new ArrayList(AbstractC3689v.w(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f66105g = arrayList3;
        if (this.f66101c == EnumC2347a.POSITIONAL_CALL && origin == b.JAVA && !AbstractC3689v.J0(this.f66100b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // xh.h
    public List a() {
        return this.f66103e;
    }

    @Override // xh.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // xh.h
    public Object call(Object[] args) {
        AbstractC6492s.i(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.f66101c == EnumC2347a.CALL_BY_NAME) ? this.f66105g.get(i11) : f.q(obj, (Class) this.f66104f.get(i11));
            if (objQ == null) {
                f.p(i11, (String) this.f66100b.get(i11), (Class) this.f66104f.get(i11));
                throw null;
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return f.g(this.f66099a, U.r(AbstractC3689v.s1(this.f66100b, arrayList)), this.f66102d);
    }

    public Void d() {
        return null;
    }

    @Override // xh.h
    public Type getReturnType() {
        return this.f66099a;
    }

    public /* synthetic */ C8533a(Class cls, List list, EnumC2347a enumC2347a, b bVar, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        List list3;
        if ((i10 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(AbstractC3689v.w(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, enumC2347a, bVar, list3);
    }
}
