package s3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import r3.C7564b;

/* renamed from: s3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7893h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f61287a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f61288b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static l0 f61289c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f61290d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f61291e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f61292f = false;

    public static AbstractC7893h a(Context context) {
        synchronized (f61287a) {
            try {
                if (f61289c == null) {
                    f61289c = new l0(context.getApplicationContext(), f61292f ? b().getLooper() : context.getMainLooper(), f61291e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f61289c;
    }

    public static HandlerThread b() {
        synchronized (f61287a) {
            try {
                HandlerThread handlerThread = f61290d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f61288b);
                f61290d = handlerThread2;
                handlerThread2.start();
                return f61290d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract C7564b c(h0 h0Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void d(h0 h0Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        d(new h0(str, str2, 4225, z10), serviceConnection, str3);
    }
}
