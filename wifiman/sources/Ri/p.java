package ri;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;
import pi.N0;

/* loaded from: classes4.dex */
public abstract class p {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60599a;

        static {
            int[] iArr = new int[N0.values().length];
            try {
                iArr[N0.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[N0.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[N0.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60599a = iArr;
        }
    }

    public static final s a(N0 n02) {
        AbstractC6492s.i(n02, "<this>");
        int i10 = a.f60599a[n02.ordinal()];
        if (i10 == 1) {
            return s.INV;
        }
        if (i10 == 2) {
            return s.IN;
        }
        if (i10 == 3) {
            return s.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
