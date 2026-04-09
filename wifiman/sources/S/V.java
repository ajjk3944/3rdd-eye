package s;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public interface V {

    /* renamed from: a, reason: collision with root package name */
    public static final a f60693a = a.f60694a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f60694a = new a();

        private a() {
        }

        public final V a() {
            if (AbstractC7838K.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? W.f60695b : X.f60698b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    boolean a();

    U b(View view, boolean z10, long j10, float f10, float f11, boolean z11, Y0.d dVar, float f12);
}
