package d1;

import A.f;
import V0.g;
import V0.m;
import V2.e;
import W0.k;
import a1.C0264c;
import a1.InterfaceC0263b;
import a4.u;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import e1.h;
import h1.InterfaceC2361a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o4.AbstractC2763b;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2264b implements InterfaceC0263b, W0.a {

    /* renamed from: k, reason: collision with root package name */
    public static final String f19713k = m.h("SystemFgDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f19714a;

    /* renamed from: b, reason: collision with root package name */
    public final k f19715b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2361a f19716c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19717d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public String f19718e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f19719f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f19720g;

    /* renamed from: h, reason: collision with root package name */
    public final HashSet f19721h;
    public final C0264c i;

    /* renamed from: j, reason: collision with root package name */
    public SystemForegroundService f19722j;

    public C2264b(Context context) {
        this.f19714a = context;
        k kVarG = k.G(context);
        this.f19715b = kVarG;
        e eVar = kVarG.f3993l;
        this.f19716c = eVar;
        this.f19718e = null;
        this.f19719f = new LinkedHashMap();
        this.f19721h = new HashSet();
        this.f19720g = new HashMap();
        this.i = new C0264c(context, eVar, this);
        kVarG.f3995n.a(this);
    }

    public static Intent b(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f3822a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f3823b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f3824c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, g gVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", gVar.f3822a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", gVar.f3823b);
        intent.putExtra("KEY_NOTIFICATION", gVar.f3824c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // a1.InterfaceC0263b
    public final void a(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.f().a(f19713k, f.l("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            k kVar = this.f19715b;
            kVar.f3993l.o(new f1.k(kVar, str, true));
        }
    }

    @Override // W0.a
    public final void c(String str, boolean z6) {
        Map.Entry entry;
        synchronized (this.f19717d) {
            try {
                h hVar = (h) this.f19720g.remove(str);
                if (hVar != null ? this.f19721h.remove(hVar) : false) {
                    this.i.c(this.f19721h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g gVar = (g) this.f19719f.remove(str);
        if (str.equals(this.f19718e) && this.f19719f.size() > 0) {
            Iterator it = this.f19719f.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f19718e = (String) entry.getKey();
            if (this.f19722j != null) {
                g gVar2 = (g) entry.getValue();
                SystemForegroundService systemForegroundService = this.f19722j;
                systemForegroundService.f5694b.post(new u(systemForegroundService, gVar2.f3822a, gVar2.f3824c, gVar2.f3823b));
                SystemForegroundService systemForegroundService2 = this.f19722j;
                systemForegroundService2.f5694b.post(new A3.h(gVar2.f3822a, 14, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f19722j;
        if (gVar == null || systemForegroundService3 == null) {
            return;
        }
        m mVarF = m.f();
        String str2 = f19713k;
        int i = gVar.f3822a;
        int i3 = gVar.f3823b;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        mVarF.a(str2, AbstractC2763b.d(i3, ")", sb), new Throwable[0]);
        systemForegroundService3.f5694b.post(new A3.h(gVar.f3822a, 14, systemForegroundService3));
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        m mVarF = m.f();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        mVarF.a(f19713k, AbstractC2763b.d(intExtra2, ")", sb), new Throwable[0]);
        if (notification == null || this.f19722j == null) {
            return;
        }
        g gVar = new g(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f19719f;
        linkedHashMap.put(stringExtra, gVar);
        if (TextUtils.isEmpty(this.f19718e)) {
            this.f19718e = stringExtra;
            SystemForegroundService systemForegroundService = this.f19722j;
            systemForegroundService.f5694b.post(new u(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f19722j;
        systemForegroundService2.f5694b.post(new Y0.g(systemForegroundService2, intExtra, notification, 1));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((g) ((Map.Entry) it.next()).getValue()).f3823b;
        }
        g gVar2 = (g) linkedHashMap.get(this.f19718e);
        if (gVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.f19722j;
            systemForegroundService3.f5694b.post(new u(systemForegroundService3, gVar2.f3822a, gVar2.f3824c, i));
        }
    }

    public final void g() {
        this.f19722j = null;
        synchronized (this.f19717d) {
            this.i.d();
        }
        this.f19715b.f3995n.f(this);
    }

    @Override // a1.InterfaceC0263b
    public final void f(List list) {
    }
}
