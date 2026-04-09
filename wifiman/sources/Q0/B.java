package Q0;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public static final B f18992a = new B();

    private B() {
    }

    public final int a(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C.f18993a.a(context);
        }
        return 0;
    }
}
