package O7;

import android.os.Build;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f17622a = new e();

    private e() {
    }

    public final T7.b a() {
        return Build.VERSION.SDK_INT >= 28 ? T7.b.SYSTEM : T7.b.LIGHT;
    }
}
