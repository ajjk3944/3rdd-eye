package n0;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23508a;

    /* renamed from: b, reason: collision with root package name */
    public a f23509b;

    /* renamed from: c, reason: collision with root package name */
    public Object f23510c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23511d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f23508a) {
                    return;
                }
                this.f23508a = true;
                this.f23511d = true;
                a aVar = this.f23509b;
                Object obj = this.f23510c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f23511d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f23511d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f23509b == aVar) {
                    return;
                }
                this.f23509b = aVar;
                if (this.f23508a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public final void c() throws InterruptedException {
        while (this.f23511d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
