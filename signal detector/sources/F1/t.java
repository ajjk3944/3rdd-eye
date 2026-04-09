package f1;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final String f20079e = V0.m.h("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20080a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f20081b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f20082c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f20083d;

    public t() {
        q qVar = new q();
        qVar.f20076a = 0;
        this.f20081b = new HashMap();
        this.f20082c = new HashMap();
        this.f20083d = new Object();
        this.f20080a = Executors.newSingleThreadScheduledExecutor(qVar);
    }

    public final void a(String str, Y0.e eVar) {
        synchronized (this.f20083d) {
            V0.m.f().a(f20079e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            s sVar = new s(this, str);
            this.f20081b.put(str, sVar);
            this.f20082c.put(str, eVar);
            this.f20080a.schedule(sVar, TTAdConstant.AD_MAX_EVENT_TIME, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f20083d) {
            try {
                if (((s) this.f20081b.remove(str)) != null) {
                    V0.m.f().a(f20079e, "Stopping timer for " + str, new Throwable[0]);
                    this.f20082c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
