package ra;

import Y0.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import ra.C7581b;

/* loaded from: classes3.dex */
public abstract class c {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60203a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.EXPANDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60203a = iArr;
        }
    }

    public static final C7581b a(d dVar) {
        AbstractC6492s.i(dVar, "<this>");
        int i10 = a.f60203a[dVar.ordinal()];
        if (i10 == 1) {
            float f10 = 8;
            float f11 = 16;
            C7581b c7581b = new C7581b(new C7581b.a.C2095b(1.0f, h.j(4), h.j(f10), h.j(f11), null), new C7581b.a.C2094a(1.0f, h.j(f10), h.j(f11), h.j(24), null));
            c7581b.b();
            return c7581b;
        }
        if (i10 == 2) {
            float f12 = 12;
            float f13 = 24;
            return new C7581b(new C7581b.a.C2095b(1.5f, h.j(6), h.j(f12), h.j(f13), null), new C7581b.a.C2094a(1.5f, h.j(f12), h.j(f13), h.j(36), null));
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        float f14 = 16;
        float f15 = 32;
        return new C7581b(new C7581b.a.C2095b(2.0f, h.j(8), h.j(f14), h.j(f15), null), new C7581b.a.C2094a(2.0f, h.j(f14), h.j(f15), h.j(48), null));
    }
}
