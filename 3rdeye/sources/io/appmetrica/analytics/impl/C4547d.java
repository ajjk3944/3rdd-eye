package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4547d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f40673a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4572e f40674b;

    public C4547d(C4572e c4572e) {
        this.f40674b = c4572e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        while (!isInterrupted() && this.f40673a.get()) {
            this.f40674b.f40773e.set(false);
            C4572e c4572e = this.f40674b;
            c4572e.f40771c.postAtFrontOfQueue(c4572e.f40774f);
            int i = this.f40674b.f40770b.get();
            while (i > 0) {
                try {
                    Thread.sleep(C4572e.f40767g);
                    if (this.f40674b.f40773e.get()) {
                        break;
                    } else {
                        i--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f40674b.f40769a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4521c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f40674b.f40773e.get()) {
                Thread.sleep(C4572e.f40767g);
            }
        }
    }
}
