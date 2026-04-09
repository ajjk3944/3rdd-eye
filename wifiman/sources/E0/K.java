package E0;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    private static final Y0.d f3668a = Y0.f.b(1.0f, 0.0f, 2, null);

    public static final m0 b(G g10) {
        m0 m0VarN0 = g10.n0();
        if (m0VarN0 != null) {
            return m0VarN0;
        }
        B0.a.c("LayoutNode should be attached to an owner");
        throw new KotlinNothingValueException();
    }
}
