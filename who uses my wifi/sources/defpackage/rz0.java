package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class rz0 implements u91, gt {
    public static final String o = h80.f("SystemFgDispatcher");
    public final ha1 f;
    public final l01 g;
    public final Object h = new Object();
    public String i;
    public final LinkedHashMap j;
    public final HashMap k;
    public final HashSet l;
    public final v91 m;
    public SystemForegroundService n;

    public rz0(Context context) {
        ha1 ha1VarJ0 = ha1.j0(context);
        this.f = ha1VarJ0;
        xb4 xb4Var = ha1VarJ0.s;
        this.g = xb4Var;
        this.i = null;
        this.j = new LinkedHashMap();
        this.l = new HashSet();
        this.k = new HashMap();
        this.m = new v91(context, xb4Var, this);
        ha1VarJ0.u.b(this);
    }

    public static Intent b(Context context, String str, yv yvVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", yvVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yvVar.b);
        intent.putExtra("KEY_NOTIFICATION", yvVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, yv yvVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", yvVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", yvVar.b);
        intent.putExtra("KEY_NOTIFICATION", yvVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.h) {
            try {
                oa1 oa1Var = (oa1) this.k.remove(str);
                if (oa1Var != null ? this.l.remove(oa1Var) : false) {
                    this.m.b(this.l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        yv yvVar = (yv) this.j.remove(str);
        if (str.equals(this.i) && this.j.size() > 0) {
            Iterator it = this.j.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.i = (String) entry.getKey();
            if (this.n != null) {
                yv yvVar2 = (yv) entry.getValue();
                SystemForegroundService systemForegroundService = this.n;
                systemForegroundService.g.post(new ml(systemForegroundService, yvVar2.a, yvVar2.c, yvVar2.b));
                SystemForegroundService systemForegroundService2 = this.n;
                systemForegroundService2.g.post(new cd(systemForegroundService2, yvVar2.a, 3));
            }
        }
        SystemForegroundService systemForegroundService3 = this.n;
        if (yvVar == null || systemForegroundService3 == null) {
            return;
        }
        h80.d().a(new Throwable[0]);
        systemForegroundService3.g.post(new cd(systemForegroundService3, yvVar.a, 3));
    }

    @Override // defpackage.u91
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            h80.d().a(new Throwable[0]);
            ha1 ha1Var = this.f;
            ha1Var.s.j(new iy0(ha1Var, (String) obj, true));
        }
    }

    public final void f(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        h80.d().a(new Throwable[0]);
        if (notification == null || this.n == null) {
            return;
        }
        yv yvVar = new yv(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.j;
        linkedHashMap.put(stringExtra, yvVar);
        if (TextUtils.isEmpty(this.i)) {
            this.i = stringExtra;
            SystemForegroundService systemForegroundService = this.n;
            systemForegroundService.g.post(new ml(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.n;
        systemForegroundService2.g.post(new k7((Object) systemForegroundService2, intExtra, (Parcelable) notification, 4));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((yv) ((Map.Entry) it.next()).getValue()).b;
        }
        yv yvVar2 = (yv) linkedHashMap.get(this.i);
        if (yvVar2 != null) {
            SystemForegroundService systemForegroundService3 = this.n;
            systemForegroundService3.g.post(new ml(systemForegroundService3, yvVar2.a, yvVar2.c, i));
        }
    }

    public final void g() {
        this.n = null;
        synchronized (this.h) {
            this.m.c();
        }
        this.f.u.e(this);
    }

    @Override // defpackage.u91
    public final void e(List list) {
    }
}
