package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class t {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29995a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29995a = iArr;
        }
    }

    public static final boolean a(s sVar, boolean z10) {
        int i10 = a.f29995a[sVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new NoWhenBranchMatchedException();
    }
}
