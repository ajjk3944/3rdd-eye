package V1;

import N7.C1154e9;
import T1.InterfaceC1591c;
import T1.r;
import V1.e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.m;
import androidx.work.n;
import androidx.work.s;
import b2.C1828i;
import b2.C1834o;
import b2.C1842w;
import b2.InterfaceC1829j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public final class b implements InterfaceC1591c {

    /* renamed from: g, reason: collision with root package name */
    public static final String f12871g = m.g("CommandHandler");

    /* renamed from: b, reason: collision with root package name */
    public final Context f12872b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f12873c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f12874d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final B7.d f12875e;

    /* renamed from: f, reason: collision with root package name */
    public final E7.b f12876f;

    public b(Context context, B7.d dVar, E7.b bVar) {
        this.f12872b = context;
        this.f12875e = dVar;
        this.f12876f = bVar;
    }

    public static C1834o d(Intent intent) {
        return new C1834o(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void e(Intent intent, C1834o c1834o) {
        intent.putExtra("KEY_WORKSPEC_ID", c1834o.f17128a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", c1834o.f17129b);
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f12874d) {
            z10 = !this.f12873c.isEmpty();
        }
        return z10;
    }

    public final void b(int i, e eVar, Intent intent) {
        List<r> listP;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.e().a(f12871g, "Handling constraints changed " + intent);
            c cVar = new c(this.f12872b, this.f12875e, i, eVar);
            ArrayList arrayListK = eVar.f12901f.f12232c.y().k();
            String str = ConstraintProxy.f16908a;
            Iterator it = arrayListK.iterator();
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            while (it.hasNext()) {
                androidx.work.d dVar = ((C1842w) it.next()).f17146j;
                z10 |= dVar.f16885d;
                z11 |= dVar.f16883b;
                z12 |= dVar.f16886e;
                z13 |= dVar.f16882a != n.NOT_REQUIRED;
                if (z10 && z11 && z12 && z13) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f16909a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = cVar.f12878a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListK.size());
            cVar.f12879b.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator it2 = arrayListK.iterator();
            while (it2.hasNext()) {
                C1842w c1842w = (C1842w) it2.next();
                if (jCurrentTimeMillis >= c1842w.a() && (!c1842w.c() || cVar.f12881d.a(c1842w))) {
                    arrayList.add(c1842w);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C1842w c1842w2 = (C1842w) it3.next();
                String str3 = c1842w2.f17138a;
                C1834o c1834oL = B7.d.l(c1842w2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                e(intent3, c1834oL);
                m.e().a(c.f12877e, C1154e9.i("Creating a delay_met command for workSpec with id (", str3, ")"));
                eVar.f12898c.b().execute(new e.b(cVar.f12880c, eVar, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.e().a(f12871g, "Handling reschedule " + intent + ", " + i);
            eVar.f12901f.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m.e().c(f12871g, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C1834o c1834oD = d(intent);
            String str4 = f12871g;
            m.e().a(str4, "Handling schedule work for " + c1834oD);
            WorkDatabase workDatabase = eVar.f12901f.f12232c;
            workDatabase.c();
            try {
                C1842w c1842wU = workDatabase.y().u(c1834oD.f17128a);
                if (c1842wU == null) {
                    m.e().h(str4, "Skipping scheduling " + c1834oD + " because it's no longer in the DB");
                    return;
                }
                if (c1842wU.f17139b.isFinished()) {
                    m.e().h(str4, "Skipping scheduling " + c1834oD + "because it is finished.");
                    return;
                }
                long jA = c1842wU.a();
                boolean zC = c1842wU.c();
                Context context2 = this.f12872b;
                if (zC) {
                    m.e().a(str4, "Opportunistically setting an alarm for " + c1834oD + "at " + jA);
                    a.b(context2, workDatabase, c1834oD, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    eVar.f12898c.b().execute(new e.b(i, eVar, intent4));
                } else {
                    m.e().a(str4, "Setting up Alarms for " + c1834oD + "at " + jA);
                    a.b(context2, workDatabase, c1834oD, jA);
                }
                workDatabase.r();
                return;
            } finally {
                workDatabase.n();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f12874d) {
                try {
                    C1834o c1834oD2 = d(intent);
                    m mVarE = m.e();
                    String str5 = f12871g;
                    mVarE.a(str5, "Handing delay met for " + c1834oD2);
                    if (this.f12873c.containsKey(c1834oD2)) {
                        m.e().a(str5, "WorkSpec " + c1834oD2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        d dVar2 = new d(this.f12872b, i, eVar, this.f12876f.r(c1834oD2));
                        this.f12873c.put(c1834oD2, dVar2);
                        dVar2.f();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                m.e().h(f12871g, "Ignoring intent " + intent);
                return;
            }
            C1834o c1834oD3 = d(intent);
            boolean z14 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            m.e().a(f12871g, "Handling onExecutionCompleted " + intent + ", " + i);
            c(c1834oD3, z14);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean zContainsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        E7.b bVar = this.f12876f;
        if (zContainsKey) {
            int i10 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            r rVarO = bVar.o(new C1834o(string, i10));
            listP = arrayList2;
            if (rVarO != null) {
                arrayList2.add(rVarO);
                listP = arrayList2;
            }
        } else {
            listP = bVar.p(string);
        }
        for (r rVar : listP) {
            m.e().a(f12871g, s.d("Handing stopWork work for ", string));
            eVar.f12905k.a(rVar);
            WorkDatabase workDatabase2 = eVar.f12901f.f12232c;
            C1834o c1834o = rVar.f12210a;
            String str6 = a.f12870a;
            InterfaceC1829j interfaceC1829jV = workDatabase2.v();
            C1828i c1828iB = interfaceC1829jV.b(c1834o);
            if (c1828iB != null) {
                a.a(this.f12872b, c1834o, c1828iB.f17121c);
                m.e().a(a.f12870a, "Removing SystemIdInfo for workSpecId (" + c1834o + ")");
                interfaceC1829jV.c(c1834o);
            }
            eVar.c(rVar.f12210a, false);
        }
    }

    @Override // T1.InterfaceC1591c
    public final void c(C1834o c1834o, boolean z10) {
        synchronized (this.f12874d) {
            try {
                d dVar = (d) this.f12873c.remove(c1834o);
                this.f12876f.o(c1834o);
                if (dVar != null) {
                    dVar.g(z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
