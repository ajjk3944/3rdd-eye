package kotlin.jvm.internal;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import org.slf4j.Marker;

/* loaded from: classes4.dex */
public final class z implements r9.p {

    /* renamed from: e, reason: collision with root package name */
    public static final a f22048e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final r9.e f22049a;

    /* renamed from: b, reason: collision with root package name */
    public final List f22050b;

    /* renamed from: c, reason: collision with root package name */
    public final r9.p f22051c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22052d;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22053a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f22068a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.f22069b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.f22070c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22053a = iArr;
        }
    }

    public z(r9.e classifier, List arguments, r9.p pVar, int i10) {
        p.e(classifier, "classifier");
        p.e(arguments, "arguments");
        this.f22049a = classifier;
        this.f22050b = arguments;
        this.f22051c = pVar;
        this.f22052d = i10;
    }

    public static final CharSequence f(z zVar, r9.q it) {
        p.e(it, "it");
        return zVar.c(it);
    }

    public final String c(r9.q qVar) {
        String strValueOf;
        if (qVar.b() == null) {
            return Marker.ANY_MARKER;
        }
        r9.p pVarA = qVar.a();
        z zVar = pVarA instanceof z ? (z) pVarA : null;
        if (zVar == null || (strValueOf = zVar.e(true)) == null) {
            strValueOf = String.valueOf(qVar.a());
        }
        KVariance kVarianceB = qVar.b();
        int i10 = kVarianceB == null ? -1 : b.f22053a[kVarianceB.ordinal()];
        if (i10 == 1) {
            return strValueOf;
        }
        if (i10 == 2) {
            return "in " + strValueOf;
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return "out " + strValueOf;
    }

    @Override // r9.p
    public boolean d() {
        return (this.f22052d & 1) != 0;
    }

    public final String e(boolean z10) {
        String name;
        r9.e eVarG = g();
        r9.c cVar = eVarG instanceof r9.c ? (r9.c) eVarG : null;
        Class clsA = cVar != null ? k9.a.a(cVar) : null;
        if (clsA == null) {
            name = g().toString();
        } else if ((this.f22052d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = k(clsA);
        } else if (z10 && clsA.isPrimitive()) {
            r9.e eVarG2 = g();
            p.c(eVarG2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = k9.a.b((r9.c) eVarG2).getName();
        } else {
            name = clsA.getName();
        }
        String str = name + (j().isEmpty() ? "" : z8.z.O(j(), ", ", "<", ">", 0, null, new l9.l() { // from class: kotlin.jvm.internal.y
            @Override // l9.l
            public final Object invoke(Object obj) {
                return z.f(this.f22047a, (r9.q) obj);
            }
        }, 24, null)) + (d() ? "?" : "");
        r9.p pVar = this.f22051c;
        if (!(pVar instanceof z)) {
            return str;
        }
        String strE = ((z) pVar).e(true);
        if (p.a(strE, str)) {
            return str;
        }
        if (p.a(strE, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strE + ')';
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return p.a(g(), zVar.g()) && p.a(j(), zVar.j()) && p.a(this.f22051c, zVar.f22051c) && this.f22052d == zVar.f22052d;
    }

    @Override // r9.p
    public r9.e g() {
        return this.f22049a;
    }

    public int hashCode() {
        return (((g().hashCode() * 31) + j().hashCode()) * 31) + this.f22052d;
    }

    @Override // r9.p
    public List j() {
        return this.f22050b;
    }

    public final String k(Class cls) {
        return p.a(cls, boolean[].class) ? "kotlin.BooleanArray" : p.a(cls, char[].class) ? "kotlin.CharArray" : p.a(cls, byte[].class) ? "kotlin.ByteArray" : p.a(cls, short[].class) ? "kotlin.ShortArray" : p.a(cls, int[].class) ? "kotlin.IntArray" : p.a(cls, float[].class) ? "kotlin.FloatArray" : p.a(cls, long[].class) ? "kotlin.LongArray" : p.a(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public final int l() {
        return this.f22052d;
    }

    public final r9.p n() {
        return this.f22051c;
    }

    public String toString() {
        return e(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(r9.e classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        p.e(classifier, "classifier");
        p.e(arguments, "arguments");
    }
}
