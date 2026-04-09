package G;

import android.util.CloseGuard;

/* compiled from: CloseGuardHelper.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final b f1799a;

    /* compiled from: CloseGuardHelper.java */
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final CloseGuard f1800a = new CloseGuard();

        @Override // G.c.b
        public final void a(String str) {
            this.f1800a.open(str);
        }

        @Override // G.c.b
        public final void b() {
            this.f1800a.warnIfOpen();
        }

        @Override // G.c.b
        public final void close() {
            this.f1800a.close();
        }
    }

    /* compiled from: CloseGuardHelper.java */
    public interface b {
        void a(String str);

        void b();

        void close();
    }

    public c(b bVar) {
        this.f1799a = bVar;
    }

    /* compiled from: CloseGuardHelper.java */
    /* renamed from: G.c$c, reason: collision with other inner class name */
    public static final class C0031c implements b {
        @Override // G.c.b
        public final void b() {
        }

        @Override // G.c.b
        public final void close() {
        }

        @Override // G.c.b
        public final void a(String str) {
        }
    }
}
