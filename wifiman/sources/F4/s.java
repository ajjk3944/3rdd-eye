package F4;

import d5.AbstractC5302a;
import f.AbstractC5487d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class s implements d5.d, d5.c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f6006a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Queue f6007b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final Executor f6008c;

    s(Executor executor) {
        this.f6008c = executor;
    }

    private synchronized Set d(AbstractC5302a abstractC5302a) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(Map.Entry entry, AbstractC5302a abstractC5302a) {
        ((d5.b) entry.getKey()).a(abstractC5302a);
    }

    @Override // d5.d
    public synchronized void a(Class cls, Executor executor, d5.b bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f6006a.containsKey(cls)) {
                this.f6006a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f6006a.get(cls)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f6007b;
                if (queue != null) {
                    this.f6007b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC5487d.a(it.next());
                f(null);
            }
        }
    }

    public void f(final AbstractC5302a abstractC5302a) {
        z.b(abstractC5302a);
        synchronized (this) {
            try {
                Queue queue = this.f6007b;
                if (queue != null) {
                    queue.add(abstractC5302a);
                    return;
                }
                for (final Map.Entry entry : d(abstractC5302a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC5302a) { // from class: F4.r

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f6005a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            s.e(this.f6005a, null);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
