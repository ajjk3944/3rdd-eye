package kotlin.jvm.internal;

import Zg.AbstractC3689v;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import lh.AbstractC6596a;
import mh.InterfaceC6835l;

/* loaded from: classes4.dex */
public final class Y implements th.p {

    /* renamed from: e, reason: collision with root package name */
    public static final a f51698e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final th.e f51699a;

    /* renamed from: b, reason: collision with root package name */
    private final List f51700b;

    /* renamed from: c, reason: collision with root package name */
    private final th.p f51701c;

    /* renamed from: d, reason: collision with root package name */
    private final int f51702d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51703a;

        static {
            int[] iArr = new int[th.s.values().length];
            try {
                iArr[th.s.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[th.s.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[th.s.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51703a = iArr;
        }
    }

    public Y(th.e classifier, List arguments, th.p pVar, int i10) {
        AbstractC6492s.i(classifier, "classifier");
        AbstractC6492s.i(arguments, "arguments");
        this.f51699a = classifier;
        this.f51700b = arguments;
        this.f51701c = pVar;
        this.f51702d = i10;
    }

    private final String b(th.r rVar) {
        String strValueOf;
        if (rVar.d() == null) {
            return "*";
        }
        th.p pVarC = rVar.c();
        Y y10 = pVarC instanceof Y ? (Y) pVarC : null;
        if (y10 == null || (strValueOf = y10.e(true)) == null) {
            strValueOf = String.valueOf(rVar.c());
        }
        th.s sVarD = rVar.d();
        int i10 = sVarD == null ? -1 : b.f51703a[sVarD.ordinal()];
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

    private final String e(boolean z10) {
        String name;
        th.e eVarR = r();
        th.d dVar = eVarR instanceof th.d ? (th.d) eVarR : null;
        Class clsB = dVar != null ? AbstractC6596a.b(dVar) : null;
        if (clsB == null) {
            name = r().toString();
        } else if ((this.f51702d & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsB.isArray()) {
            name = i(clsB);
        } else if (z10 && clsB.isPrimitive()) {
            th.e eVarR2 = r();
            AbstractC6492s.g(eVarR2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = AbstractC6596a.c((th.d) eVarR2).getName();
        } else {
            name = clsB.getName();
        }
        String str = name + (j().isEmpty() ? "" : AbstractC3689v.z0(j(), ", ", "<", ">", 0, null, new InterfaceC6835l() { // from class: kotlin.jvm.internal.X
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return Y.f(this.f51697a, (th.r) obj);
            }
        }, 24, null)) + (t() ? "?" : "");
        th.p pVar = this.f51701c;
        if (!(pVar instanceof Y)) {
            return str;
        }
        String strE = ((Y) pVar).e(true);
        if (AbstractC6492s.d(strE, str)) {
            return str;
        }
        if (AbstractC6492s.d(strE, str + '?')) {
            return str + '!';
        }
        return '(' + str + ".." + strE + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(Y y10, th.r it) {
        AbstractC6492s.i(it, "it");
        return y10.b(it);
    }

    private final String i(Class cls) {
        return AbstractC6492s.d(cls, boolean[].class) ? "kotlin.BooleanArray" : AbstractC6492s.d(cls, char[].class) ? "kotlin.CharArray" : AbstractC6492s.d(cls, byte[].class) ? "kotlin.ByteArray" : AbstractC6492s.d(cls, short[].class) ? "kotlin.ShortArray" : AbstractC6492s.d(cls, int[].class) ? "kotlin.IntArray" : AbstractC6492s.d(cls, float[].class) ? "kotlin.FloatArray" : AbstractC6492s.d(cls, long[].class) ? "kotlin.LongArray" : AbstractC6492s.d(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Y) {
            Y y10 = (Y) obj;
            if (AbstractC6492s.d(r(), y10.r()) && AbstractC6492s.d(j(), y10.j()) && AbstractC6492s.d(this.f51701c, y10.f51701c) && this.f51702d == y10.f51702d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((r().hashCode() * 31) + j().hashCode()) * 31) + Integer.hashCode(this.f51702d);
    }

    @Override // th.p
    public List j() {
        return this.f51700b;
    }

    @Override // th.p
    public th.e r() {
        return this.f51699a;
    }

    @Override // th.p
    public boolean t() {
        return (this.f51702d & 1) != 0;
    }

    public String toString() {
        return e(false) + " (Kotlin reflection is not available)";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Y(th.e classifier, List arguments, boolean z10) {
        this(classifier, arguments, null, z10 ? 1 : 0);
        AbstractC6492s.i(classifier, "classifier");
        AbstractC6492s.i(arguments, "arguments");
    }
}
