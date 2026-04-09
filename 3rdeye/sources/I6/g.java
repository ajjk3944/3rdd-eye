package I6;

import N7.Tb;
import N7.U3;

/* compiled from: DivTransitions.kt */
/* loaded from: classes.dex */
public final class g {

    /* compiled from: DivTransitions.kt */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2536a;

        static {
            int[] iArr = new int[Tb.values().length];
            try {
                iArr[Tb.DATA_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tb.ANY_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Tb.STATE_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2536a = iArr;
        }
    }

    public static final boolean a(U3 u32, A7.d resolver) {
        kotlin.jvm.internal.l.f(u32, "<this>");
        kotlin.jvm.internal.l.f(resolver, "resolver");
        Tb tbA = u32.f6378e.a(resolver);
        kotlin.jvm.internal.l.f(tbA, "<this>");
        int i = a.f2536a[tbA.ordinal()];
        return i == 1 || i == 2;
    }
}
