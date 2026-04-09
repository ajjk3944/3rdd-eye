package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.profileinstaller.ProfileInstaller;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements w1.b {

    public static class a {
        @DoNotInline
        public static void b(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: p1.i
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j10) {
                    runnable.run();
                }
            });
        }
    }

    public static class b {
        @DoNotInline
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void g(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: p1.h
            @Override // java.lang.Runnable
            public final void run() throws PackageManager.NameNotFoundException {
                ProfileInstaller.h(context);
            }
        });
    }

    @Override // w1.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        e(context.getApplicationContext());
        return new c();
    }

    @Override // w1.b
    public List dependencies() {
        return Collections.EMPTY_LIST;
    }

    public void e(final Context context) {
        a.b(new Runnable() { // from class: p1.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f23870a.f(context);
            }
        });
    }

    public void f(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: p1.g
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.g(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
