package I;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
abstract class T0 {

    /* renamed from: a, reason: collision with root package name */
    private static final a f8082a = new a(null);

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static int[] a(int i10) {
        return b(new int[i10 * 3]);
    }

    private static int[] b(int[] iArr) {
        return iArr;
    }

    public static final int[] c(int[] iArr, int i10) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, i10 * 3);
        AbstractC6492s.h(iArrCopyOf, "copyOf(this, newSize)");
        return b(iArrCopyOf);
    }

    public static final int d(int[] iArr) {
        return iArr.length / 3;
    }

    public static final void e(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i10 * 3;
        iArr[i14] = i11;
        iArr[i14 + 1] = i12;
        iArr[i14 + 2] = i13;
    }
}
