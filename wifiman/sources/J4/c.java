package J4;

import I4.g;
import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c implements b, a {

    /* renamed from: a, reason: collision with root package name */
    private final e f9752a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9753b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeUnit f9754c;

    /* renamed from: e, reason: collision with root package name */
    private CountDownLatch f9756e;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9755d = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f9757f = false;

    public c(e eVar, int i10, TimeUnit timeUnit) {
        this.f9752a = eVar;
        this.f9753b = i10;
        this.f9754c = timeUnit;
    }

    @Override // J4.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f9755d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f9756e = new CountDownLatch(1);
                this.f9757f = false;
                this.f9752a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f9756e.await(this.f9753b, this.f9754c)) {
                        this.f9757f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f9756e = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // J4.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f9756e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
