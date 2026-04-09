package wg;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class j extends AtomicLong implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final String f64973a;

    /* renamed from: b, reason: collision with root package name */
    final int f64974b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f64975c;

    static final class a extends Thread implements i {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public j(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f64973a + '-' + incrementAndGet();
        Thread aVar = this.f64975c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f64974b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f64973a + "]";
    }

    public j(String str, int i10) {
        this(str, i10, false);
    }

    public j(String str, int i10, boolean z10) {
        this.f64973a = str;
        this.f64974b = i10;
        this.f64975c = z10;
    }
}
