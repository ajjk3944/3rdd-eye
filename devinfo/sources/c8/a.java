package c8;

import android.os.Process;
import ec.x;
import java.util.concurrent.locks.ReentrantLock;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2810a = 0;

    public /* synthetic */ a(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        ReentrantLock reentrantLock;
        hm.b bVarF;
        switch (this.f2810a) {
            case 0:
                Process.setThreadPriority(9);
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
                m mVar = hm.b.f25162h;
                reentrantLock = hm.b.j;
                reentrantLock.lock();
                try {
                    bVarF = x.f();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            } catch (InterruptedException unused2) {
            }
            if (bVarF == hm.b.f25163i) {
                hm.b.f25163i = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (bVarF != null) {
                    bVarF.k();
                }
            }
        }
    }

    public /* synthetic */ a(String str) {
        super(str);
    }

    public /* synthetic */ a(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
