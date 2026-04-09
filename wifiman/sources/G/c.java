package G;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f6753a;

    static {
        f6753a = Build.VERSION.SDK_INT >= 34;
    }

    public static final boolean a() {
        return f6753a;
    }
}
