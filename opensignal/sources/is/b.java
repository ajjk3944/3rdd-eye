package is;

import ht.x;
import java.util.Map;
import rr.o0;

/* loaded from: classes.dex */
public final class b implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f12948a = new b();

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
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // sr.b
    public final x getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // sr.b
    public final o0 h() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
