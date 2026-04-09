package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ta1 {
    public final ScheduledExecutorService a;
    public final HashMap b;
    public final HashMap c;
    public final Object d;

    static {
        h80.f("WorkTimer");
    }

    public ta1() {
        qa1 qa1Var = new qa1();
        qa1Var.a = 0;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new Object();
        this.a = Executors.newSingleThreadScheduledExecutor(qa1Var);
    }

    public final void a(String str, ao aoVar) {
        synchronized (this.d) {
            h80.d().a(new Throwable[0]);
            b(str);
            sa1 sa1Var = new sa1(this, str);
            this.b.put(str, sa1Var);
            this.c.put(str, aoVar);
            this.a.schedule(sa1Var, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((sa1) this.b.remove(str)) != null) {
                    h80.d().a(new Throwable[0]);
                    this.c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
