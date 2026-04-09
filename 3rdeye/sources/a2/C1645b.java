package a2;

import A9.InterfaceC0594o0;
import B4.i;
import T1.InterfaceC1591c;
import T1.l;
import T1.r;
import T1.z;
import X1.b;
import X1.d;
import X1.e;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.m;
import b2.C1834o;
import b2.C1842w;
import c2.w;
import e2.InterfaceC4306b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: SystemForegroundDispatcher.java */
/* renamed from: a2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645b implements d, InterfaceC1591c {

    /* renamed from: k, reason: collision with root package name */
    public static final String f14096k = m.g("SystemFgDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public final z f14097b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4306b f14098c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f14099d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public C1834o f14100e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f14101f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14102g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f14103h;
    public final e i;

    /* renamed from: j, reason: collision with root package name */
    public SystemForegroundService f14104j;

    public C1645b(Context context) {
        z zVarC = z.c(context);
        this.f14097b = zVarC;
        this.f14098c = zVarC.f12233d;
        this.f14100e = null;
        this.f14101f = new LinkedHashMap();
        this.f14103h = new HashMap();
        this.f14102g = new HashMap();
        this.i = new e(zVarC.f12239k);
        zVarC.f12235f.a(this);
    }

    public static Intent b(Context context, C1834o c1834o, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f16896a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f16897b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f16898c);
        intent.putExtra("KEY_WORKSPEC_ID", c1834o.f17128a);
        intent.putExtra("KEY_GENERATION", c1834o.f17129b);
        return intent;
    }

    public static Intent d(Context context, C1834o c1834o, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", c1834o.f17128a);
        intent.putExtra("KEY_GENERATION", c1834o.f17129b);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f16896a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f16897b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f16898c);
        return intent;
    }

    @Override // X1.d
    public final void a(C1842w c1842w, X1.b bVar) {
        if (bVar instanceof b.C0195b) {
            m.e().a(f14096k, "Constraints unmet for WorkSpec " + c1842w.f17138a);
            C1834o c1834oL = B7.d.l(c1842w);
            z zVar = this.f14097b;
            zVar.getClass();
            r rVar = new r(c1834oL);
            l processor = zVar.f12235f;
            kotlin.jvm.internal.l.f(processor, "processor");
            zVar.f12233d.d(new w(processor, rVar, true, -512));
        }
    }

    @Override // T1.InterfaceC1591c
    public final void c(C1834o c1834o, boolean z10) {
        Map.Entry entry;
        synchronized (this.f14099d) {
            try {
                InterfaceC0594o0 interfaceC0594o0 = ((C1842w) this.f14102g.remove(c1834o)) != null ? (InterfaceC0594o0) this.f14103h.remove(c1834o) : null;
                if (interfaceC0594o0 != null) {
                    interfaceC0594o0.c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f14101f.remove(c1834o);
        if (c1834o.equals(this.f14100e)) {
            if (this.f14101f.size() > 0) {
                Iterator it = this.f14101f.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f14100e = (C1834o) entry.getKey();
                if (this.f14104j != null) {
                    h hVar2 = (h) entry.getValue();
                    SystemForegroundService systemForegroundService = this.f14104j;
                    systemForegroundService.f16924c.post(new androidx.work.impl.foreground.a(systemForegroundService, hVar2.f16896a, hVar2.f16898c, hVar2.f16897b));
                    SystemForegroundService systemForegroundService2 = this.f14104j;
                    systemForegroundService2.f16924c.post(new H0.b(hVar2.f16896a, 1, systemForegroundService2));
                }
            } else {
                this.f14100e = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.f14104j;
        if (hVar == null || systemForegroundService3 == null) {
            return;
        }
        m.e().a(f14096k, "Removing Notification (id: " + hVar.f16896a + ", workSpecId: " + c1834o + ", notificationType: " + hVar.f16897b);
        systemForegroundService3.f16924c.post(new H0.b(hVar.f16896a, 1, systemForegroundService3));
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C1834o c1834o = new C1834o(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m mVarE = m.e();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        mVarE.a(f14096k, i.j(sb, intExtra2, ")"));
        if (notification == null || this.f14104j == null) {
            return;
        }
        h hVar = new h(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f14101f;
        linkedHashMap.put(c1834o, hVar);
        if (this.f14100e == null) {
            this.f14100e = c1834o;
            SystemForegroundService systemForegroundService = this.f14104j;
            systemForegroundService.f16924c.post(new androidx.work.impl.foreground.a(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f14104j;
        systemForegroundService2.f16924c.post(new RunnableC1646c(systemForegroundService2, intExtra, notification, 0));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((h) ((Map.Entry) it.next()).getValue()).f16897b;
        }
        h hVar2 = (h) linkedHashMap.get(this.f14100e);
        if (hVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f14104j;
            systemForegroundService3.f16924c.post(new androidx.work.impl.foreground.a(systemForegroundService3, hVar2.f16896a, hVar2.f16898c, i));
        }
    }

    public final void f() {
        this.f14104j = null;
        synchronized (this.f14099d) {
            try {
                Iterator it = this.f14103h.values().iterator();
                while (it.hasNext()) {
                    ((InterfaceC0594o0) it.next()).c(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f14097b.f12235f.h(this);
    }
}
