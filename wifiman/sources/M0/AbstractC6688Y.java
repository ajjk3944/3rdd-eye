package m0;

import android.graphics.Path;
import kotlin.NoWhenBranchMatchedException;
import m0.U0;

/* renamed from: m0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6688Y {

    /* renamed from: m0.Y$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52865a;

        static {
            int[] iArr = new int[U0.b.values().length];
            try {
                iArr[U0.b.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[U0.b.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f52865a = iArr;
        }
    }

    public static final U0 a() {
        return new C6683T(null, 1, 0 == true ? 1 : 0);
    }

    public static final U0 c(Path path) {
        return new C6683T(path);
    }

    public static final void d(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Path.Direction e(U0.b bVar) {
        int i10 = a.f52865a[bVar.ordinal()];
        if (i10 == 1) {
            return Path.Direction.CCW;
        }
        if (i10 == 2) {
            return Path.Direction.CW;
        }
        throw new NoWhenBranchMatchedException();
    }
}
