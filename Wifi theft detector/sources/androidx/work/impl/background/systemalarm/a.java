package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.k;
import java.util.HashMap;
import java.util.Map;
import l2.p;

/* loaded from: classes.dex */
public class a implements d2.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4410d = k.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f4411a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f4412b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f4413c = new Object();

    public a(Context context) {
        this.f4411a = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        synchronized (this.f4413c) {
            try {
                d2.b bVar = (d2.b) this.f4412b.remove(str);
                if (bVar != null) {
                    bVar.e(str, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i10, d dVar) {
        k.c().a(f4410d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.f4411a, i10, dVar).a();
    }

    public final void h(Intent intent, int i10, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4413c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                k kVarC = k.c();
                String str = f4410d;
                kVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f4412b.containsKey(string)) {
                    k.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    c cVar = new c(this.f4411a, i10, string, dVar);
                    this.f4412b.put(string, cVar);
                    cVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        k.c().a(f4410d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        e(string, z10);
    }

    public final void j(Intent intent, int i10, d dVar) {
        k.c().a(f4410d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        dVar.g().s();
    }

    public final void k(Intent intent, int i10, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k kVarC = k.c();
        String str = f4410d;
        kVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseO = dVar.g().o();
        workDatabaseO.c();
        try {
            p pVarG = workDatabaseO.B().g(string);
            if (pVarG == null) {
                k.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (pVarG.f23093b.d()) {
                k.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = pVarG.a();
            if (pVarG.b()) {
                k.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                f2.a.c(this.f4411a, dVar.g(), string, jA);
                dVar.k(new d.b(dVar, a(this.f4411a), i10));
            } else {
                k.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                f2.a.c(this.f4411a, dVar.g(), string, jA);
            }
            workDatabaseO.r();
        } finally {
            workDatabaseO.g();
        }
    }

    public final void l(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k.c().a(f4410d, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dVar.g().x(string);
        f2.a.a(this.f4411a, dVar.g(), string);
        dVar.e(string, false);
    }

    public boolean n() {
        boolean z10;
        synchronized (this.f4413c) {
            z10 = !this.f4412b.isEmpty();
        }
        return z10;
    }

    public void o(Intent intent, int i10, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i10, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i10, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            k.c().b(f4410d, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i10, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i10, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i10);
        } else {
            k.c().h(f4410d, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
