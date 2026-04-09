package A1;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private boolean f219a;

    /* renamed from: b, reason: collision with root package name */
    private a f220b;

    /* renamed from: c, reason: collision with root package name */
    private Object f221c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f222d;

    public interface a {
        void onCancel();
    }

    private void c() throws InterruptedException {
        while (this.f222d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f219a) {
                    return;
                }
                this.f219a = true;
                this.f222d = true;
                a aVar = this.f220b;
                Object obj = this.f221c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f222d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f222d = false;
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
                if (this.f220b == aVar) {
                    return;
                }
                this.f220b = aVar;
                if (this.f219a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
