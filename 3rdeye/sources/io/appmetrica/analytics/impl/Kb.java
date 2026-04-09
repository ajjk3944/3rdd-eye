package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class Kb extends InterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lb f39717a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kb(Lb lb, String str) {
        super(str);
        this.f39717a = lb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f39717a.f39763a) {
            Lb.a(this.f39717a);
            this.f39717a.f39767e = true;
            this.f39717a.f39763a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f39717a.f39764b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f39717a.f39764b);
                this.f39717a.f39764b.clear();
            }
            if (map.size() > 0) {
                Lb.a(this.f39717a, map);
                map.clear();
            }
        }
    }
}
