package Vf;

import kotlin.jvm.internal.AbstractC6492s;
import r.E;
import r.T;

/* loaded from: classes4.dex */
public abstract class g {
    public static final T a(int i10, int i11, E easing) {
        AbstractC6492s.i(easing, "easing");
        T.b bVar = new T.b();
        bVar.e(bVar.f(Float.valueOf(0.0f), 0), easing);
        Float fValueOf = Float.valueOf(1.0f);
        bVar.f(fValueOf, i10);
        if (i11 > 0) {
            bVar.f(fValueOf, i10 + i11);
        }
        bVar.d(i10 + i11);
        return new T(bVar);
    }
}
