package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.e;
import androidx.work.impl.WorkDatabase;
import androidx.work.k;
import d2.j;
import h2.c;
import h2.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import l2.p;

/* loaded from: classes.dex */
public class a implements c, d2.b {

    /* renamed from: k, reason: collision with root package name */
    public static final String f4464k = k.f("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public Context f4465a;

    /* renamed from: b, reason: collision with root package name */
    public j f4466b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.a f4467c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4468d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public String f4469e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f4470f;

    /* renamed from: g, reason: collision with root package name */
    public final Map f4471g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f4472h;

    /* renamed from: i, reason: collision with root package name */
    public final d f4473i;

    /* renamed from: j, reason: collision with root package name */
    public b f4474j;

    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    public class RunnableC0054a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f4475a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f4476b;

        public RunnableC0054a(WorkDatabase workDatabase, String str) {
            this.f4475a = workDatabase;
            this.f4476b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p pVarG = this.f4475a.B().g(this.f4476b);
            if (pVarG == null || !pVarG.b()) {
                return;
            }
            synchronized (a.this.f4468d) {
                a.this.f4471g.put(this.f4476b, pVarG);
                a.this.f4472h.add(pVarG);
                a aVar = a.this;
                aVar.f4473i.d(aVar.f4472h);
            }
        }
    }

    public interface b {
        void a(int i10, Notification notification);

        void c(int i10, int i11, Notification notification);

        void d(int i10);

        void stop();
    }

    public a(Context context) {
        this.f4465a = context;
        j jVarK = j.k(context);
        this.f4466b = jVarK;
        o2.a aVarP = jVarK.p();
        this.f4467c = aVarP;
        this.f4469e = null;
        this.f4470f = new LinkedHashMap();
        this.f4472h = new HashSet();
        this.f4471g = new HashMap();
        this.f4473i = new d(this.f4465a, aVarP, this);
        this.f4466b.m().c(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // h2.c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            k.c().a(f4464k, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f4466b.w(str);
        }
    }

    @Override // d2.b
    public void e(String str, boolean z10) {
        Map.Entry entry;
        synchronized (this.f4468d) {
            try {
                p pVar = (p) this.f4471g.remove(str);
                if (pVar != null ? this.f4472h.remove(pVar) : false) {
                    this.f4473i.d(this.f4472h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) this.f4470f.remove(str);
        if (str.equals(this.f4469e) && this.f4470f.size() > 0) {
            Iterator it = this.f4470f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f4469e = (String) entry.getKey();
            if (this.f4474j != null) {
                e eVar2 = (e) entry.getValue();
                this.f4474j.c(eVar2.c(), eVar2.a(), eVar2.b());
                this.f4474j.d(eVar2.c());
            }
        }
        b bVar = this.f4474j;
        if (eVar == null || bVar == null) {
            return;
        }
        k.c().a(f4464k, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(eVar.c()), str, Integer.valueOf(eVar.a())), new Throwable[0]);
        bVar.d(eVar.c());
    }

    @Override // h2.c
    public void f(List list) {
    }

    public final void g(Intent intent) {
        k.c().d(f4464k, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f4466b.f(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int iA = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        k.c().a(f4464k, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f4474j == null) {
            return;
        }
        this.f4470f.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f4469e)) {
            this.f4469e = stringExtra;
            this.f4474j.c(intExtra, intExtra2, notification);
            return;
        }
        this.f4474j.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f4470f.entrySet().iterator();
        while (it.hasNext()) {
            iA |= ((e) ((Map.Entry) it.next()).getValue()).a();
        }
        e eVar = (e) this.f4470f.get(this.f4469e);
        if (eVar != null) {
            this.f4474j.c(eVar.c(), iA, eVar.b());
        }
    }

    public final void i(Intent intent) {
        k.c().d(f4464k, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f4467c.b(new RunnableC0054a(this.f4466b.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void j(Intent intent) {
        k.c().d(f4464k, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f4474j;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.f4474j = null;
        synchronized (this.f4468d) {
            this.f4473i.e();
        }
        this.f4466b.m().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    public void m(b bVar) {
        if (this.f4474j != null) {
            k.c().b(f4464k, "A callback already exists.", new Throwable[0]);
        } else {
            this.f4474j = bVar;
        }
    }
}
