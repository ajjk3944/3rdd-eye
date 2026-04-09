package S6;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import l0.AbstractC6538n;
import l0.C6537m;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Yg.m f20292a = Yg.n.a(Yg.q.NONE, new InterfaceC6824a() { // from class: S6.d
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return e.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler b() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(Drawable drawable) {
        return (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? C6537m.f52356b.a() : AbstractC6538n.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler f() {
        return (Handler) f20292a.getValue();
    }
}
