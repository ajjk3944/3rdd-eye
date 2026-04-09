package A5;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f320a = new ReferenceQueue();

    /* renamed from: b, reason: collision with root package name */
    private final Set f321b = Collections.synchronizedSet(new HashSet());

    /* renamed from: A5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0006a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: A5.m
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f320a;
        final Set set = aVar.f321b;
        Thread thread = new Thread(new Runnable() { // from class: A5.n
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((p) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC0006a b(Object obj, Runnable runnable) {
        p pVar = new p(obj, this.f320a, this.f321b, runnable, null);
        this.f321b.add(pVar);
        return pVar;
    }
}
