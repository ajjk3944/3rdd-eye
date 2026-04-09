package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static a f11174e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f11175a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Handler f11176b = new Handler(Looper.getMainLooper(), new C0213a());

    /* renamed from: c, reason: collision with root package name */
    public c f11177c;

    /* renamed from: d, reason: collision with root package name */
    public c f11178d;

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    public class C0213a implements Handler.Callback {
        public C0213a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a.this.d((c) message.obj);
            return true;
        }
    }

    public interface b {
        void a(int i10);

        void show();
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference f11180a;

        /* renamed from: b, reason: collision with root package name */
        public int f11181b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f11182c;

        public c(int i10, b bVar) {
            this.f11180a = new WeakReference(bVar);
            this.f11181b = i10;
        }

        public boolean a(b bVar) {
            return bVar != null && this.f11180a.get() == bVar;
        }
    }

    public static a c() {
        if (f11174e == null) {
            f11174e = new a();
        }
        return f11174e;
    }

    public final boolean a(c cVar, int i10) {
        b bVar = (b) cVar.f11180a.get();
        if (bVar == null) {
            return false;
        }
        this.f11176b.removeCallbacksAndMessages(cVar);
        bVar.a(i10);
        return true;
    }

    public void b(b bVar, int i10) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    a(this.f11177c, i10);
                } else if (g(bVar)) {
                    a(this.f11178d, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(c cVar) {
        synchronized (this.f11175a) {
            try {
                if (this.f11177c == cVar || this.f11178d == cVar) {
                    a(cVar, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z10;
        synchronized (this.f11175a) {
            try {
                z10 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z10;
    }

    public final boolean f(b bVar) {
        c cVar = this.f11177c;
        return cVar != null && cVar.a(bVar);
    }

    public final boolean g(b bVar) {
        c cVar = this.f11178d;
        return cVar != null && cVar.a(bVar);
    }

    public void h(b bVar) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    this.f11177c = null;
                    if (this.f11178d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    l(this.f11177c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f11177c;
                    if (!cVar.f11182c) {
                        cVar.f11182c = true;
                        this.f11176b.removeCallbacksAndMessages(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f11177c;
                    if (cVar.f11182c) {
                        cVar.f11182c = false;
                        l(cVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(c cVar) {
        int i10 = cVar.f11181b;
        if (i10 == -2) {
            return;
        }
        if (i10 <= 0) {
            i10 = i10 == -1 ? 1500 : 2750;
        }
        this.f11176b.removeCallbacksAndMessages(cVar);
        Handler handler = this.f11176b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i10);
    }

    public void m(int i10, b bVar) {
        synchronized (this.f11175a) {
            try {
                if (f(bVar)) {
                    c cVar = this.f11177c;
                    cVar.f11181b = i10;
                    this.f11176b.removeCallbacksAndMessages(cVar);
                    l(this.f11177c);
                    return;
                }
                if (g(bVar)) {
                    this.f11178d.f11181b = i10;
                } else {
                    this.f11178d = new c(i10, bVar);
                }
                c cVar2 = this.f11177c;
                if (cVar2 == null || !a(cVar2, 4)) {
                    this.f11177c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n() {
        c cVar = this.f11178d;
        if (cVar != null) {
            this.f11177c = cVar;
            this.f11178d = null;
            b bVar = (b) cVar.f11180a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f11177c = null;
            }
        }
    }
}
