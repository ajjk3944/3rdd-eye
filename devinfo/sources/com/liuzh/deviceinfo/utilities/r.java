package com.liuzh.deviceinfo.utilities;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.o0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: f, reason: collision with root package name */
    public static final r f21296f = new r();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21297a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21298b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f21299c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public final q f21300d = new q(this);

    /* renamed from: e, reason: collision with root package name */
    public final o0 f21301e = new o0(17, this);

    public final void a(wg.e eVar) {
        synchronized (this.f21298b) {
            if (this.f21298b.isEmpty()) {
                q qVar = this.f21300d;
                Handler handler = this.f21299c;
                if (!this.f21297a.getAndSet(true)) {
                    handler.removeCallbacks(qVar);
                    handler.post(qVar);
                }
            }
            this.f21298b.add(eVar);
        }
    }

    public final void b(wg.e eVar) {
        synchronized (this.f21298b) {
            this.f21298b.remove(eVar);
            if (this.f21298b.isEmpty()) {
                this.f21297a.set(false);
                this.f21299c.removeCallbacks(this.f21300d);
            }
        }
    }
}
