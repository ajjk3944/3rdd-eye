package com.squareup.picasso;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5976a = 0;

    public /* synthetic */ r0(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        cv.d dVarF;
        switch (this.f5976a) {
            case 0:
                Process.setThreadPriority(10);
                super.run();
                return;
            case 1:
                break;
            default:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = cv.d.f6696h;
                reentrantLock = cv.d.f6696h;
                reentrantLock.lock();
                try {
                    dVarF = sm.f.F();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused2) {
            }
            if (dVarF == cv.d.f6698l) {
                cv.d.f6698l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (dVarF != null) {
                    dVarF.j();
                }
            }
        }
    }

    public /* synthetic */ r0(String str) {
        super(str);
    }

    public /* synthetic */ r0(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
