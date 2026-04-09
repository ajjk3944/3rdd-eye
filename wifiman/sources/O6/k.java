package O6;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public class k extends AtomicLong implements ThreadFactory {

    static final class a extends Thread implements wg.i {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        a aVar = new a(runnable, "RxBleThread-" + incrementAndGet());
        aVar.setPriority(5);
        aVar.setDaemon(true);
        return aVar;
    }
}
