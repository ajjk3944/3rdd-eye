package yb;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import ch.n;
import dd.r;
import g1.f0;
import g1.m;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import oh.p;
import ph.l;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static k f26239e;

    /* renamed from: a, reason: collision with root package name */
    public int f26240a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f26241b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26242c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26243d;

    public k(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f26243d = new i(this);
        this.f26240a = 1;
        this.f26242c = scheduledExecutorService;
        this.f26241b = context.getApplicationContext();
    }

    public static synchronized k g(Context context) {
        try {
            if (f26239e == null) {
                f26239e = new k(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new hc.a("MessengerIpcClient"))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f26239e;
    }

    public pb.g a() {
        Context context = (Context) this.f26241b;
        ak.a aVar = (ak.a) this.f26242c;
        StringBuilder sb2 = new StringBuilder("bandwidthOverride: ");
        int i10 = this.f26240a;
        sb2.append(i10);
        n.b("BandwidthMeterFactory", sb2.toString());
        if (i10 == 1) {
            l5.c cVar = new l5.c(context, 1);
            long j = aVar.f411x;
            HashMap map = (HashMap) cVar.f14688e;
            for (Integer num : map.keySet()) {
                num.intValue();
                map.put(num, Long.valueOf(j));
            }
            cVar.f14685b = aVar.f412y;
            return cVar.n();
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return new l5.c(context, 1).n();
            }
            Context applicationContext = context == null ? null : context.getApplicationContext();
            HashMap map2 = new HashMap();
            long j7 = aVar.f411x;
            for (Integer num2 : map2.keySet()) {
                num2.intValue();
                map2.put(num2, Long.valueOf(j7));
            }
            int i11 = aVar.f412y;
            map2.put(2, Long.valueOf(aVar.D));
            map2.put(3, Long.valueOf(aVar.E));
            map2.put(4, Long.valueOf(aVar.F));
            map2.put(5, Long.valueOf(aVar.G));
            map2.put(9, Long.valueOf(aVar.J));
            map2.put(10, Long.valueOf(aVar.I));
            map2.put(11, Long.valueOf(aVar.K));
            return new l(applicationContext, map2, i11, qb.a.f20757q, true, (oh.e) this.f26243d);
        }
        l5.c cVar2 = new l5.c(context, 1);
        long j10 = aVar.f411x;
        long j11 = aVar.f411x;
        HashMap map3 = (HashMap) cVar2.f14688e;
        for (Integer num3 : map3.keySet()) {
            num3.intValue();
            map3.put(num3, Long.valueOf(j10));
        }
        cVar2.f14685b = aVar.f412y;
        cVar2.q(0, j11);
        cVar2.q(1, j11);
        cVar2.q(6, j11);
        cVar2.q(7, j11);
        cVar2.q(8, j11);
        cVar2.q(2, aVar.D);
        cVar2.q(3, aVar.E);
        cVar2.q(4, aVar.F);
        cVar2.q(5, aVar.G);
        if (p.z() < 2014000) {
            cVar2.q(9, aVar.H);
        } else {
            cVar2.q(9, aVar.J);
            cVar2.q(10, aVar.I);
        }
        return cVar2.n();
    }

    public void b(float f10) {
        ((Paint) this.f26241b).setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public void c(int i10) {
        if (this.f26240a == i10) {
            return;
        }
        this.f26240a = i10;
        Paint paint = (Paint) this.f26241b;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(f0.o(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(f0.t(i10)));
        }
    }

    public void d(long j) {
        ((Paint) this.f26241b).setColor(f0.q(j));
    }

    public void e(m mVar) {
        this.f26243d = mVar;
        ((Paint) this.f26241b).setColorFilter(mVar != null ? mVar.f9257a : null);
    }

    public void f(int i10) {
        ((Paint) this.f26241b).setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public synchronized r h(j jVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(jVar.toString());
            }
            if (!((i) this.f26243d).d(jVar)) {
                i iVar = new i(this);
                this.f26243d = iVar;
                iVar.d(jVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jVar.f26235b.f7294a;
    }

    public k(Context context, ak.a aVar, p pVar, oh.e eVar) {
        br.l.e(context, "context");
        br.l.e(aVar, "adaptiveConfig");
        this.f26241b = context;
        this.f26242c = aVar;
        this.f26243d = eVar;
        this.f26240a = aVar.B;
    }

    public k(Paint paint) {
        this.f26241b = paint;
        this.f26240a = 3;
    }
}
