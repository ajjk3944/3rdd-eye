package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f.AbstractC5487d;

/* loaded from: classes3.dex */
class a {

    /* renamed from: c, reason: collision with root package name */
    private static a f37673c;

    /* renamed from: a, reason: collision with root package name */
    private final Object f37674a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Handler f37675b = new Handler(Looper.getMainLooper(), new C1208a());

    /* renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C1208a implements Handler.Callback {
        C1208a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            AbstractC5487d.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f37673c == null) {
            f37673c = new a();
        }
        return f37673c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f37674a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f37674a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f37674a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
