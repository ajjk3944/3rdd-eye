package R7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: R7.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0688a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19589a;

        static {
            int[] iArr = new int[T7.b.values().length];
            try {
                iArr[T7.b.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[T7.b.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[T7.b.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f19589a = iArr;
        }
    }

    public static final String a(T7.b bVar) {
        AbstractC6492s.i(bVar, "<this>");
        int i10 = C0688a.f19589a[bVar.ordinal()];
        if (i10 == 1) {
            return "light";
        }
        if (i10 == 2) {
            return "dark";
        }
        if (i10 == 3) {
            return "system";
        }
        throw new NoWhenBranchMatchedException();
    }
}
