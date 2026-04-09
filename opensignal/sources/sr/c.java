package sr;

import ht.b0;
import ht.x;
import java.util.Map;
import rr.o0;

/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final x f22209a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f22210b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f22211c;

    public c(b0 b0Var, Map map, o0 o0Var) {
        if (b0Var == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.f22209a = b0Var;
        this.f22210b = map;
        this.f22211c = o0Var;
    }

    public static /* synthetic */ void c(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // sr.b
    public final qs.c a() {
        rr.f fVarD = xs.d.d(this);
        if (fVarD != null) {
            if (kt.k.f(fVarD)) {
                fVarD = null;
            }
            if (fVarD != null) {
                return xs.d.c(fVarD);
            }
        }
        return null;
    }

    @Override // sr.b
    public final Map b() {
        Map map = this.f22210b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // sr.b
    public final x getType() {
        x xVar = this.f22209a;
        if (xVar != null) {
            return xVar;
        }
        c(3);
        throw null;
    }

    @Override // sr.b
    public final o0 h() {
        o0 o0Var = this.f22211c;
        if (o0Var != null) {
            return o0Var;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return ss.j.f22243c.x(this, null);
    }
}
