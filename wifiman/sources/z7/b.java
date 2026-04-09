package Z7;

import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class b {
    public static final void a(String message, Throwable th2, String str) {
        AbstractC6492s.i(message, "message");
        if (str != null) {
            Sj.a.f20830a.r(str);
        }
        if (th2 != null) {
            Sj.a.f20830a.b(th2, a.f25188a.a(message), new Object[0]);
        } else {
            Sj.a.f20830a.a(a.f25188a.a(message), new Object[0]);
        }
    }

    public static /* synthetic */ void b(String str, Throwable th2, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        a(str, th2, str2);
    }

    public static final void c(String message, Throwable th2, String str) {
        AbstractC6492s.i(message, "message");
        if (str != null) {
            Sj.a.f20830a.r(str);
        }
        if (th2 != null) {
            Sj.a.f20830a.e(th2, a.f25188a.a(message), new Object[0]);
        } else {
            Sj.a.f20830a.c(a.f25188a.a(message), new Object[0]);
        }
    }

    public static final void d(Throwable exception, String str) {
        AbstractC6492s.i(exception, "exception");
        if (str != null) {
            Sj.a.f20830a.r(str);
        }
        Sj.a.f20830a.d(exception);
    }

    public static /* synthetic */ void e(String str, Throwable th2, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        c(str, th2, str2);
    }

    public static /* synthetic */ void f(Throwable th2, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        d(th2, str);
    }

    public static final void g(String message, String str) {
        AbstractC6492s.i(message, "message");
        if (str != null) {
            Sj.a.f20830a.r(str);
        }
        Sj.a.f20830a.n(a.f25188a.a(message), new Object[0]);
    }

    public static /* synthetic */ void h(String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        g(str, str2);
    }

    public static final void i(String message, Throwable th2, String str) {
        AbstractC6492s.i(message, "message");
        if (str != null) {
            Sj.a.f20830a.r(str);
        }
        if (th2 != null) {
            Sj.a.f20830a.p(th2, a.f25188a.a(message), new Object[0]);
        } else {
            Sj.a.f20830a.o(a.f25188a.a(message), new Object[0]);
        }
    }

    public static /* synthetic */ void j(String str, Throwable th2, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        i(str, th2, str2);
    }
}
