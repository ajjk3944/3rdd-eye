package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class kg implements gt {
    public static final String i = h80.f("CommandHandler");
    public final Context f;
    public final HashMap g = new HashMap();
    public final Object h = new Object();

    public kg(Context context) {
        this.f = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        synchronized (this.h) {
            try {
                gt gtVar = (gt) this.g.remove(str);
                if (gtVar != null) {
                    gtVar.a(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i2, qz0 qz0Var) {
        String action = intent.getAction();
        int i3 = 3;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h80 h80VarD = h80.d();
            String.format("Handling constraints changed %s", intent);
            h80VarD.a(new Throwable[0]);
            Context context = this.f;
            ti tiVar = new ti(context, i2, qz0Var);
            v91 v91Var = tiVar.b;
            ArrayList arrayListD = qz0Var.j.r.n().d();
            int i4 = fi.a;
            int size = arrayListD.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayListD.get(i5);
                i5++;
                ri riVar = ((oa1) obj).j;
                z |= riVar.d;
                z2 |= riVar.b;
                z3 |= riVar.e;
                z4 |= riVar.a != 1;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            int i6 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            v91Var.b(arrayListD);
            ArrayList arrayList = new ArrayList(arrayListD.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListD.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayListD.get(i7);
                i7++;
                oa1 oa1Var = (oa1) obj2;
                String str = oa1Var.a;
                if (jCurrentTimeMillis >= oa1Var.a() && (!oa1Var.b() || v91Var.a(str))) {
                    arrayList.add(oa1Var);
                }
            }
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                Intent intentB = b(context, ((oa1) obj3).a);
                h80 h80VarD2 = h80.d();
                int i9 = ti.c;
                h80VarD2.a(new Throwable[0]);
                qz0Var.e(new k7(qz0Var, intentB, tiVar.a, i3));
            }
            v91Var.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            h80 h80VarD3 = h80.d();
            String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i2));
            h80VarD3.a(new Throwable[0]);
            qz0Var.j.m0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            h80.d().b(i, ex0.h("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.f;
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            h80.d().a(new Throwable[0]);
            ha1 ha1Var = qz0Var.j;
            WorkDatabase workDatabase = ha1Var.r;
            workDatabase.c();
            try {
                oa1 oa1VarH = workDatabase.n().h(string);
                if (oa1VarH == null) {
                    h80.d().g(new Throwable[0]);
                    return;
                }
                if (ga1.a(oa1VarH.b)) {
                    h80.d().g(new Throwable[0]);
                    return;
                }
                long jA = oa1VarH.a();
                if (oa1VarH.b()) {
                    h80.d().a(new Throwable[0]);
                    l3.b(context2, ha1Var, string, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    qz0Var.e(new k7(qz0Var, intent3, i2, i3));
                } else {
                    h80.d().a(new Throwable[0]);
                    l3.b(context2, ha1Var, string, jA);
                }
                workDatabase.h();
                return;
            } finally {
                workDatabase.f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.h) {
                try {
                    String string2 = extras2.getString("KEY_WORKSPEC_ID");
                    h80.d().a(new Throwable[0]);
                    if (this.g.containsKey(string2)) {
                        h80.d().a(new Throwable[0]);
                    } else {
                        ao aoVar = new ao(this.f, i2, string2, qz0Var);
                        this.g.put(string2, aoVar);
                        aoVar.d();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                h80 h80VarD4 = h80.d();
                String.format("Ignoring intent %s", intent);
                h80VarD4.g(new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z5 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            h80 h80VarD5 = h80.d();
            String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i2));
            h80VarD5.a(new Throwable[0]);
            a(string3, z5);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        h80.d().a(new Throwable[0]);
        qz0Var.j.o0(string4);
        Context context3 = this.f;
        ha1 ha1Var2 = qz0Var.j;
        int i10 = l3.a;
        t83 t83VarK = ha1Var2.r.k();
        sz0 sz0VarF = t83VarK.F(string4);
        if (sz0VarF != null) {
            l3.a(sz0VarF.b, context3, string4);
            h80.d().a(new Throwable[0]);
            t83VarK.O(string4);
        }
        qz0Var.a(string4, false);
    }
}
