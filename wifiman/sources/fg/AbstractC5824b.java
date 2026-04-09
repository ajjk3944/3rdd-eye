package fg;

import android.os.Handler;
import android.os.Looper;
import eg.AbstractC5465a;
import fg.AbstractC5824b;
import gg.y;
import java.util.concurrent.Callable;

/* renamed from: fg.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5824b {

    /* renamed from: a, reason: collision with root package name */
    private static final y f47341a = AbstractC5465a.d(new Callable() { // from class: fg.a
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return AbstractC5824b.a.f47342a;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fg.b$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final y f47342a = AbstractC5824b.e(Looper.getMainLooper(), true);
    }

    public static y c(Looper looper) {
        return d(looper, true);
    }

    public static y d(Looper looper, boolean z10) {
        if (looper != null) {
            return e(looper, z10);
        }
        throw new NullPointerException("looper == null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static y e(Looper looper, boolean z10) {
        return new C5825c(new Handler(looper), z10);
    }

    public static y g() {
        return AbstractC5465a.e(f47341a);
    }
}
