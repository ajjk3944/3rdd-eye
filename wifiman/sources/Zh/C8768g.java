package zh;

import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import zh.AbstractC8767f;

/* renamed from: zh.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8768g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f67314c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final C8768g f67315d = new C8768g(AbstractC3689v.o(AbstractC8767f.a.f67310e, AbstractC8767f.d.f67313e, AbstractC8767f.b.f67311e, AbstractC8767f.c.f67312e));

    /* renamed from: a, reason: collision with root package name */
    private final List f67316a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f67317b;

    /* renamed from: zh.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C8768g a() {
            return C8768g.f67315d;
        }

        private a() {
        }
    }

    /* renamed from: zh.g$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC8767f f67318a;

        /* renamed from: b, reason: collision with root package name */
        private final int f67319b;

        public b(AbstractC8767f kind, int i10) {
            AbstractC6492s.i(kind, "kind");
            this.f67318a = kind;
            this.f67319b = i10;
        }

        public final AbstractC8767f a() {
            return this.f67318a;
        }

        public final int b() {
            return this.f67319b;
        }

        public final AbstractC8767f c() {
            return this.f67318a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC6492s.d(this.f67318a, bVar.f67318a) && this.f67319b == bVar.f67319b;
        }

        public int hashCode() {
            return (this.f67318a.hashCode() * 31) + Integer.hashCode(this.f67319b);
        }

        public String toString() {
            return "KindWithArity(kind=" + this.f67318a + ", arity=" + this.f67319b + ')';
        }
    }

    public C8768g(List kinds) {
        AbstractC6492s.i(kinds, "kinds");
        this.f67316a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            Zh.c cVarB = ((AbstractC8767f) obj).b();
            Object arrayList = linkedHashMap.get(cVarB);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(cVarB, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f67317b = linkedHashMap;
    }

    private final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int iCharAt = str.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt >= 10) {
                return null;
            }
            i10 = (i10 * 10) + iCharAt;
        }
        return Integer.valueOf(i10);
    }

    public final AbstractC8767f b(Zh.c packageFqName, String className) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(className, "className");
        b bVarC = c(packageFqName, className);
        if (bVarC != null) {
            return bVarC.c();
        }
        return null;
    }

    public final b c(Zh.c packageFqName, String className) {
        AbstractC6492s.i(packageFqName, "packageFqName");
        AbstractC6492s.i(className, "className");
        List<AbstractC8767f> list = (List) this.f67317b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (AbstractC8767f abstractC8767f : list) {
            if (t.P(className, abstractC8767f.a(), false, 2, null)) {
                String strSubstring = className.substring(abstractC8767f.a().length());
                AbstractC6492s.h(strSubstring, "substring(...)");
                Integer numD = d(strSubstring);
                if (numD != null) {
                    return new b(abstractC8767f, numD.intValue());
                }
            }
        }
        return null;
    }
}
