package Yh;

import Xh.a;
import Zg.AbstractC3689v;
import Zg.N;
import Zg.U;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* loaded from: classes4.dex */
public abstract class g implements Wh.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f25049d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final String f25050e;

    /* renamed from: f, reason: collision with root package name */
    private static final List f25051f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map f25052g;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f25053a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f25054b;

    /* renamed from: c, reason: collision with root package name */
    private final List f25055c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25056a;

        static {
            int[] iArr = new int[a.e.c.EnumC0932c.values().length];
            try {
                iArr[a.e.c.EnumC0932c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.e.c.EnumC0932c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.e.c.EnumC0932c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25056a = iArr;
        }
    }

    static {
        String strZ0 = AbstractC3689v.z0(AbstractC3689v.o('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        f25050e = strZ0;
        List listO = AbstractC3689v.o(strZ0 + "/Any", strZ0 + "/Nothing", strZ0 + "/Unit", strZ0 + "/Throwable", strZ0 + "/Number", strZ0 + "/Byte", strZ0 + "/Double", strZ0 + "/Float", strZ0 + "/Int", strZ0 + "/Long", strZ0 + "/Short", strZ0 + "/Boolean", strZ0 + "/Char", strZ0 + "/CharSequence", strZ0 + "/String", strZ0 + "/Comparable", strZ0 + "/Enum", strZ0 + "/Array", strZ0 + "/ByteArray", strZ0 + "/DoubleArray", strZ0 + "/FloatArray", strZ0 + "/IntArray", strZ0 + "/LongArray", strZ0 + "/ShortArray", strZ0 + "/BooleanArray", strZ0 + "/CharArray", strZ0 + "/Cloneable", strZ0 + "/Annotation", strZ0 + "/collections/Iterable", strZ0 + "/collections/MutableIterable", strZ0 + "/collections/Collection", strZ0 + "/collections/MutableCollection", strZ0 + "/collections/List", strZ0 + "/collections/MutableList", strZ0 + "/collections/Set", strZ0 + "/collections/MutableSet", strZ0 + "/collections/Map", strZ0 + "/collections/MutableMap", strZ0 + "/collections/Map.Entry", strZ0 + "/collections/MutableMap.MutableEntry", strZ0 + "/collections/Iterator", strZ0 + "/collections/MutableIterator", strZ0 + "/collections/ListIterator", strZ0 + "/collections/MutableListIterator");
        f25051f = listO;
        Iterable<N> iterableQ1 = AbstractC3689v.q1(listO);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7978m.d(U.d(AbstractC3689v.w(iterableQ1, 10)), 16));
        for (N n10 : iterableQ1) {
            linkedHashMap.put((String) n10.d(), Integer.valueOf(n10.c()));
        }
        f25052g = linkedHashMap;
    }

    public g(String[] strings, Set localNameIndices, List records) {
        AbstractC6492s.i(strings, "strings");
        AbstractC6492s.i(localNameIndices, "localNameIndices");
        AbstractC6492s.i(records, "records");
        this.f25053a = strings;
        this.f25054b = localNameIndices;
        this.f25055c = records;
    }

    @Override // Wh.c
    public String a(int i10) {
        return getString(i10);
    }

    @Override // Wh.c
    public boolean b(int i10) {
        return this.f25054b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    @Override // Wh.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String getString(int r15) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Yh.g.getString(int):java.lang.String");
    }
}
