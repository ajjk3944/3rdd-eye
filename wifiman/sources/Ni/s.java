package Ni;

import Ii.H0;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes4.dex */
public abstract class s {
    private static final t a(Throwable th2, String str) throws Throwable {
        if (th2 != null) {
            throw th2;
        }
        d();
        throw new KotlinNothingValueException();
    }

    static /* synthetic */ t b(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        return a(th2, str);
    }

    public static final boolean c(H0 h02) {
        return h02.p0() instanceof t;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final H0 e(q qVar, List list) {
        try {
            return qVar.b(list);
        } catch (Throwable th2) {
            return a(th2, qVar.a());
        }
    }
}
