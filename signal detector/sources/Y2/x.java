package Y2;

import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4380a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4381b;

    public /* synthetic */ x(y yVar) {
        this.f4380a = 0;
        this.f4381b = yVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f4380a) {
            case 0:
                y yVar = (y) this.f4381b;
                Thread thread = new Thread(runnable, AbstractC1135f5.l(yVar.f4382a.getAndIncrement(), "Google consent worker #"));
                yVar.f4384c = new WeakReference(thread);
                return thread;
            default:
                Thread thread2 = new Thread(runnable);
                thread2.setName("arch_disk_io_" + ((AtomicInteger) this.f4381b).getAndIncrement());
                return thread2;
        }
    }

    public x() {
        this.f4380a = 1;
        this.f4381b = new AtomicInteger(0);
    }
}
