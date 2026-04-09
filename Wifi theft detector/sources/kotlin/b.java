package kotlin;

import kotlin.jvm.internal.p;
import y8.h;

/* loaded from: classes4.dex */
public abstract class b {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21942a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            try {
                iArr[LazyThreadSafetyMode.f21907a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LazyThreadSafetyMode.f21908b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LazyThreadSafetyMode.f21909c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21942a = iArr;
        }
    }

    public static h a(LazyThreadSafetyMode mode, l9.a initializer) {
        p.e(mode, "mode");
        p.e(initializer, "initializer");
        int i10 = a.f21942a[mode.ordinal()];
        if (i10 == 1) {
            return new SynchronizedLazyImpl(initializer, null, 2, null);
        }
        if (i10 == 2) {
            return new SafePublicationLazyImpl(initializer);
        }
        if (i10 == 3) {
            return new UnsafeLazyImpl(initializer);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static h b(l9.a initializer) {
        p.e(initializer, "initializer");
        return new SynchronizedLazyImpl(initializer, null, 2, null);
    }
}
