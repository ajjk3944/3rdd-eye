package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import d0.r;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements I1.b<c> {

    public static class a {
        public static void a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: u1.e
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j4) {
                    runnable.run();
                }
            });
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    @Override // I1.b
    public final c create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        a.a(new r(3, this, context.getApplicationContext()));
        return new c();
    }

    @Override // I1.b
    public final List<Class<? extends I1.b<?>>> dependencies() {
        return Collections.EMPTY_LIST;
    }
}
