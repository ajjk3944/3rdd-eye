package n4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: SnackbarManager.java */
/* renamed from: n4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5357b {

    /* renamed from: b, reason: collision with root package name */
    public static C5357b f44278b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f44279a = new Object();

    /* compiled from: SnackbarManager.java */
    /* renamed from: n4.b$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C5357b c5357b = C5357b.this;
            C0501b c0501b = (C0501b) message.obj;
            synchronized (c5357b.f44279a) {
                try {
                    if (c0501b == null || c0501b == null) {
                        c0501b.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* renamed from: n4.b$b, reason: collision with other inner class name */
    public static class C0501b {
    }

    public C5357b() {
        new Handler(Looper.getMainLooper(), new a());
    }

    public static C5357b a() {
        if (f44278b == null) {
            f44278b = new C5357b();
        }
        return f44278b;
    }

    public final void b() {
        synchronized (this.f44279a) {
        }
    }
}
