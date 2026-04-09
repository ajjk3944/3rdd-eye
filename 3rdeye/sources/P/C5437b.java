package p;

import I9.g;
import android.os.Looper;

/* compiled from: ArchTaskExecutor.java */
/* renamed from: p.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5437b extends g {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C5437b f44959c;

    /* renamed from: d, reason: collision with root package name */
    public static final ExecutorC5436a f44960d = new ExecutorC5436a();

    /* renamed from: b, reason: collision with root package name */
    public final C5438c f44961b = new C5438c();

    public static C5437b i0() {
        if (f44959c != null) {
            return f44959c;
        }
        synchronized (C5437b.class) {
            try {
                if (f44959c == null) {
                    f44959c = new C5437b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f44959c;
    }

    public final void j0(Runnable runnable) {
        C5438c c5438c = this.f44961b;
        if (c5438c.f44964d == null) {
            synchronized (c5438c.f44962b) {
                try {
                    if (c5438c.f44964d == null) {
                        c5438c.f44964d = C5438c.i0(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        c5438c.f44964d.post(runnable);
    }
}
