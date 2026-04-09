package Y0;

import V0.m;
import W0.k;
import a1.C0264c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import e1.C2300c;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b implements W0.a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4219d = m.h("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4220a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4221b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f4222c = new Object();

    public b(Context context) {
        this.f4220a = context;
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        synchronized (this.f4222c) {
            try {
                W0.a aVar = (W0.a) this.f4221b.remove(str);
                if (aVar != null) {
                    aVar.c(str, z6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f4222c) {
            z6 = !this.f4221b.isEmpty();
        }
        return z6;
    }

    public final void e(Intent intent, int i, h hVar) {
        String action = intent.getAction();
        int i3 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.f().a(f4219d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f4220a;
            d dVar = new d(context, i, hVar);
            C0264c c0264c = dVar.f4227c;
            ArrayList arrayListD = hVar.f4248e.f3992k.t().d();
            String str = c.f4223a;
            int size = arrayListD.size();
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListD.get(i6);
                i6++;
                V0.c cVar = ((e1.h) obj).f19916j;
                z6 |= cVar.f3811d;
                z7 |= cVar.f3809b;
                z8 |= cVar.f3812e;
                z9 |= cVar.f3808a != 1;
                if (z6 && z7 && z8 && z9) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f5684a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
            context.sendBroadcast(intent2);
            c0264c.c(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListD.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayListD.get(i7);
                i7++;
                e1.h hVar2 = (e1.h) obj2;
                String str3 = hVar2.f19908a;
                if (jCurrentTimeMillis >= hVar2.a() && (!hVar2.b() || c0264c.a(str3))) {
                    arrayList.add(hVar2);
                }
            }
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                String str4 = ((e1.h) obj3).f19908a;
                Intent intentA = a(context, str4);
                m.f().a(d.f4224d, A.f.m("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                hVar.f(new g(dVar.f4226b, i3, hVar, intentA));
            }
            c0264c.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.f().a(f4219d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            hVar.f4248e.J();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m.f().e(f4219d, A.f.m("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f4222c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        m mVarF = m.f();
                        String str5 = f4219d;
                        mVarF.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f4221b.containsKey(string)) {
                            m.f().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f4220a, i, string, hVar);
                            this.f4221b.put(string, eVar);
                            eVar.d();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    m.f().i(f4219d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z10 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                m.f().a(f4219d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                c(string2, z10);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            m.f().a(f4219d, A.f.l("Handing stopWork work for ", string3), new Throwable[0]);
            hVar.f4248e.L(string3);
            Context context2 = this.f4220a;
            k kVar = hVar.f4248e;
            String str6 = a.f4218a;
            V2.e eVarQ = kVar.f3992k.q();
            C2300c c2300cP = eVarQ.p(string3);
            if (c2300cP != null) {
                a.a(context2, c2300cP.f19901b, string3);
                m.f().a(a.f4218a, A.f.m("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                eVarQ.x(string3);
            }
            hVar.c(string3, false);
            return;
        }
        Context context3 = this.f4220a;
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m mVarF2 = m.f();
        String str7 = f4219d;
        mVarF2.a(str7, A.f.l("Handling schedule work for ", string4), new Throwable[0]);
        k kVar2 = hVar.f4248e;
        WorkDatabase workDatabase = kVar2.f3992k;
        workDatabase.c();
        try {
            e1.h hVarH = workDatabase.t().h(string4);
            if (hVarH == null) {
                m.f().i(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (A.f.b(hVarH.f19909b)) {
                m.f().i(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = hVarH.a();
            if (hVarH.b()) {
                m.f().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, kVar2, string4, jA);
                Intent intent3 = new Intent(context3, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                hVar.f(new g(i, i3, hVar, intent3));
            } else {
                m.f().a(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                a.b(context3, kVar2, string4, jA);
            }
            workDatabase.m();
        } finally {
            workDatabase.j();
        }
    }
}
