package q;

import ba.m;
import e7.d;

/* loaded from: classes.dex */
public final class a extends m {
    public static volatile a j;
    public static final d k = new d(1);

    /* renamed from: i, reason: collision with root package name */
    public final b f20652i = new b();

    public static a X() {
        if (j != null) {
            return j;
        }
        synchronized (a.class) {
            try {
                if (j == null) {
                    j = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j;
    }
}
