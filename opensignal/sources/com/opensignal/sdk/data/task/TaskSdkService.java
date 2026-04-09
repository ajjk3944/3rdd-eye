package com.opensignal.sdk.data.task;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import ch.l;
import ch.n;
import cj.e;
import cj.o;
import cj.p;
import cj.r;
import h7.r1;
import i.g0;
import ic.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import mk.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u0003J)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/opensignal/sdk/data/task/TaskSdkService;", "Landroid/app/Service;", "<init>", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "Llq/b0;", "onDestroy", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "Companion", "cj/r", "com.opensignal_internalRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TaskSdkService extends Service {
    public static final r Companion = new r();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String string;
        n.b("TaskSdkService", "onBind called.");
        n.f("TaskSdkService", intent);
        Bundle extras = intent.getExtras();
        c cVarValueOf = (extras == null || (string = extras.getString("BINDER_TYPE")) == null) ? null : c.valueOf(string);
        if (cVarValueOf == null) {
            n.c("TaskSdkService", "Binder type is null.");
            return null;
        }
        try {
            l lVar = l.f3962t5;
            if (l.f3963u5 == null) {
                l.f3963u5 = new g0(lVar.A());
            } else {
                lVar.getClass();
            }
            g0 g0Var = l.f3963u5;
            if (g0Var == null) {
                br.l.l("binderFactory");
                throw null;
            }
            Binder binderR = g0Var.r(cVarValueOf);
            if (binderR == null) {
                return binderR;
            }
            n.b("TaskSdkService", "Return binder: " + binderR.getClass().getSimpleName() + " for binderType: " + cVarValueOf);
            r1 r1VarI = lVar.i();
            n.b("BinderRegistry", "register binder");
            ((ConcurrentHashMap) r1VarI.f10199d).put(cVarValueOf, binderR);
            return binderR;
        } catch (Throwable th2) {
            n.e("TaskSdkService", th2);
            return null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        r1 r1VarI = l.f3962t5.i();
        n.b("BinderRegistry", "unregistering binders");
        ((ConcurrentHashMap) r1VarI.f10199d).clear();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        l lVar = l.f3962t5;
        Context applicationContext = getApplicationContext();
        br.l.d(applicationContext, "getApplicationContext(...)");
        if (lVar.f3775a == null) {
            lVar.f3775a = applicationContext;
        }
        if (intent != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    n.b("TaskSdkService", "[onStartCommand] with bundle: ".concat(a.z(extras)));
                    String string = extras.getString("EXECUTION_TYPE");
                    e eVarValueOf = string != null ? e.valueOf(string) : null;
                    o oVar = new o(3, extras);
                    if (lVar.f3897s3 == null) {
                        lVar.f3897s3 = new p(lVar);
                    }
                    p pVar = lVar.f3897s3;
                    if (pVar != null) {
                        pVar.b1(eVarValueOf, oVar);
                        return 1;
                    }
                    br.l.l("_serviceCommandExecutor");
                    throw null;
                }
            } catch (BadParcelableException e4) {
                n.e("TaskSdkService", e4);
            }
        }
        return 2;
    }
}
