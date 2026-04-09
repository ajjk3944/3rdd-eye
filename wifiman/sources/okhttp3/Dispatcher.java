package okhttp3;

import Yg.J;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import org.snmp4j.mp.MPv3;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u00020\u00112\n\u0010\u0010\u001a\u00060\u0006R\u00020\u0007H\u0000¢\u0006\u0004\b\u0018\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u001a8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010!R.\u0010-\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010/R\u001e\u00103\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00102R\u001e\u00104\u001a\f\u0012\b\u0012\u00060\u0006R\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00102R\u0011\u00107\u001a\u00020.8G¢\u0006\u0006\u001a\u0004\b'\u00106¨\u00068"}, d2 = {"Lokhttp3/Dispatcher;", "", "<init>", "()V", "", "host", "Lokhttp3/internal/connection/RealCall$AsyncCall;", "Lokhttp3/internal/connection/RealCall;", "d", "(Ljava/lang/String;)Lokhttp3/internal/connection/RealCall$AsyncCall;", "", "h", "()Z", "T", "Ljava/util/Deque;", "calls", "call", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/util/Deque;Ljava/lang/Object;)V", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/internal/connection/RealCall$AsyncCall;)V", SnmpConfigurator.O_BIND_ADDRESS, "(Lokhttp3/internal/connection/RealCall;)V", "f", "g", "", "i", "()I", "maxRequests", "I", "getMaxRequests", "setMaxRequests", "(I)V", "maxRequestsPerHost", "getMaxRequestsPerHost", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", SnmpConfigurator.O_COMMUNITY, "Ljava/lang/Runnable;", "getIdleCallback", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "executorService", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Dispatcher {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Runnable idleCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorServiceOrNull;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int maxRequests = 64;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int maxRequestsPerHost = 5;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque readyAsyncCalls = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque runningAsyncCalls = new ArrayDeque();

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque runningSyncCalls = new ArrayDeque();

    private final RealCall.AsyncCall d(String host) {
        Iterator it = this.runningAsyncCalls.iterator();
        while (it.hasNext()) {
            RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
            if (AbstractC6492s.d(asyncCall.d(), host)) {
                return asyncCall;
            }
        }
        Iterator it2 = this.readyAsyncCalls.iterator();
        while (it2.hasNext()) {
            RealCall.AsyncCall asyncCall2 = (RealCall.AsyncCall) it2.next();
            if (AbstractC6492s.d(asyncCall2.d(), host)) {
                return asyncCall2;
            }
        }
        return null;
    }

    private final void e(Deque calls, Object call) {
        Runnable runnable;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.idleCallback;
            J j10 = J.f24997a;
        }
        if (h() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private final boolean h() {
        int i10;
        boolean z10;
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = this.readyAsyncCalls.iterator();
                AbstractC6492s.h(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RealCall.AsyncCall asyncCall = (RealCall.AsyncCall) it.next();
                    if (this.runningAsyncCalls.size() >= this.maxRequests) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < this.maxRequestsPerHost) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        AbstractC6492s.h(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.runningAsyncCalls.add(asyncCall);
                    }
                }
                z10 = i() > 0;
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((RealCall.AsyncCall) arrayList.get(i10)).a(c());
        }
        return z10;
    }

    public final void a(RealCall.AsyncCall call) {
        RealCall.AsyncCall asyncCallD;
        AbstractC6492s.i(call, "call");
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(call);
                if (!call.getF56409c().getForWebSocket() && (asyncCallD = d(call.d())) != null) {
                    call.e(asyncCallD);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        h();
    }

    public final synchronized void b(RealCall call) {
        AbstractC6492s.i(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized ExecutorService c() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, MPv3.MAX_MESSAGE_ID, 60L, TimeUnit.SECONDS, new SynchronousQueue(), Util.N(Util.f56224i + " Dispatcher", false));
            }
            executorService = this.executorServiceOrNull;
            AbstractC6492s.f(executorService);
        } catch (Throwable th2) {
            throw th2;
        }
        return executorService;
    }

    public final void f(RealCall.AsyncCall call) {
        AbstractC6492s.i(call, "call");
        call.getCallsPerHost().decrementAndGet();
        e(this.runningAsyncCalls, call);
    }

    public final void g(RealCall call) {
        AbstractC6492s.i(call, "call");
        e(this.runningSyncCalls, call);
    }

    public final synchronized int i() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }
}
