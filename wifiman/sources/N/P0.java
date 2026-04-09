package N;

import Zg.AbstractC3689v;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6492s;
import r.C7532h0;

/* loaded from: classes.dex */
public final class P0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P0 f13906a = new P0();

    /* renamed from: b, reason: collision with root package name */
    private static final C7532h0 f13907b = new C7532h0(0.0f, 0.0f, null, 7, null);

    /* renamed from: c, reason: collision with root package name */
    private static final float f13908c = Y0.h.j(125);

    private P0() {
    }

    public static /* synthetic */ C3354x0 d(P0 p02, Set set, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 10.0f;
        }
        return p02.c(set, f10, f11);
    }

    public final C7532h0 a() {
        return f13907b;
    }

    public final float b() {
        return f13908c;
    }

    public final C3354x0 c(Set set, float f10, float f11) {
        if (set.size() <= 1) {
            return null;
        }
        Set set2 = set;
        Float fG0 = AbstractC3689v.G0(set2);
        AbstractC6492s.f(fG0);
        float fFloatValue = fG0.floatValue();
        Float fI0 = AbstractC3689v.I0(set2);
        AbstractC6492s.f(fI0);
        return new C3354x0(fFloatValue - fI0.floatValue(), f10, f11);
    }
}
