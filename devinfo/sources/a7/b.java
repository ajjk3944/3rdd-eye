package a7;

import a0.x0;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import b7.l;
import com.google.android.gms.internal.measurement.d5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import t6.m;
import t6.v;
import u6.h;
import u6.r;
import x6.c;
import x6.f;
import xk.y0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements f, u6.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f208k = v.g("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f209a;

    /* renamed from: b, reason: collision with root package name */
    public final r f210b;

    /* renamed from: c, reason: collision with root package name */
    public final d7.a f211c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f212d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public l f213e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f214f;
    public final HashMap g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f215h;

    /* renamed from: i, reason: collision with root package name */
    public final o8.b f216i;
    public SystemForegroundService j;

    public b(Context context) {
        this.f209a = context;
        r rVarD = r.D(context);
        this.f210b = rVarD;
        this.f211c = rVarD.g;
        this.f213e = null;
        this.f214f = new LinkedHashMap();
        this.f215h = new HashMap();
        this.g = new HashMap();
        this.f216i = new o8.b(rVarD.f35182m);
        rVarD.f35179i.a(this);
    }

    public static Intent b(Context context, l lVar, m mVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", lVar.f2007a);
        intent.putExtra("KEY_GENERATION", lVar.f2008b);
        intent.putExtra("KEY_NOTIFICATION_ID", mVar.f34381a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", mVar.f34382b);
        intent.putExtra("KEY_NOTIFICATION", mVar.f34383c);
        return intent;
    }

    @Override // x6.f
    public final void a(b7.r rVar, c cVar) {
        if (cVar instanceof x6.b) {
            String str = rVar.f2030a;
            v.e().a(f208k, "Constraints unmet for WorkSpec " + str);
            l lVarH = d5.h(rVar);
            int i4 = ((x6.b) cVar).f36978a;
            r rVar2 = this.f210b;
            ((c7.l) ((x0) rVar2.g).f148e).execute(new c7.m(rVar2.f35179i, new h(lVarH), true, i4));
        }
    }

    public final void c(Intent intent) {
        if (this.j == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i4 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        l lVar = new l(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        v.e().a(f208k, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        m mVar = new m(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f214f;
        linkedHashMap.put(lVar, mVar);
        m mVar2 = (m) linkedHashMap.get(this.f213e);
        if (mVar2 == null) {
            this.f213e = lVar;
        } else {
            this.j.f1626d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i4 |= ((m) ((Map.Entry) it.next()).getValue()).f34382b;
                }
                mVar = new m(mVar2.f34381a, mVar2.f34383c, i4);
            } else {
                mVar = mVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        int i10 = mVar.f34381a;
        int i11 = mVar.f34382b;
        Notification notification2 = mVar.f34383c;
        systemForegroundService.getClass();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            a4.l.m(systemForegroundService, i10, notification2, i11);
        } else if (i12 >= 29) {
            a4.l.l(systemForegroundService, i10, notification2, i11);
        } else {
            systemForegroundService.startForeground(i10, notification2);
        }
    }

    public final void d() {
        this.j = null;
        synchronized (this.f212d) {
            try {
                Iterator it = this.f215h.values().iterator();
                while (it.hasNext()) {
                    ((y0) it.next()).e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f210b.f35179i.g(this);
    }

    @Override // u6.a
    public final void e(l lVar, boolean z3) {
        Map.Entry entry;
        synchronized (this.f212d) {
            try {
                y0 y0Var = ((b7.r) this.g.remove(lVar)) != null ? (y0) this.f215h.remove(lVar) : null;
                if (y0Var != null) {
                    y0Var.e(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m mVar = (m) this.f214f.remove(lVar);
        if (lVar.equals(this.f213e)) {
            if (this.f214f.size() > 0) {
                Iterator it = this.f214f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f213e = (l) entry.getKey();
                if (this.j != null) {
                    m mVar2 = (m) entry.getValue();
                    SystemForegroundService systemForegroundService = this.j;
                    int i4 = mVar2.f34381a;
                    int i10 = mVar2.f34382b;
                    Notification notification = mVar2.f34383c;
                    systemForegroundService.getClass();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 31) {
                        a4.l.m(systemForegroundService, i4, notification, i10);
                    } else if (i11 >= 29) {
                        a4.l.l(systemForegroundService, i4, notification, i10);
                    } else {
                        systemForegroundService.startForeground(i4, notification);
                    }
                    this.j.f1626d.cancel(mVar2.f34381a);
                }
            } else {
                this.f213e = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.j;
        if (mVar == null || systemForegroundService2 == null) {
            return;
        }
        v.e().a(f208k, "Removing Notification (id: " + mVar.f34381a + ", workSpecId: " + lVar + ", notificationType: " + mVar.f34382b);
        systemForegroundService2.f1626d.cancel(mVar.f34381a);
    }

    public final void f(int i4, int i10) {
        v.e().f(f208k, "Foreground service timed out, FGS type: " + i10);
        for (Map.Entry entry : this.f214f.entrySet()) {
            if (((m) entry.getValue()).f34382b == i10) {
                l lVar = (l) entry.getKey();
                r rVar = this.f210b;
                ((c7.l) ((x0) rVar.g).f148e).execute(new c7.m(rVar.f35179i, new h(lVar), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.j;
        if (systemForegroundService != null) {
            systemForegroundService.f1624b = true;
            v.e().a(SystemForegroundService.f1623e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i4);
        }
    }
}
