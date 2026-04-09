package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import defpackage.e60;
import defpackage.ed;
import defpackage.gi;
import defpackage.h80;
import defpackage.ha1;
import defpackage.rz0;
import defpackage.xb4;
import java.util.UUID;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class SystemForegroundService extends e60 {
    public Handler g;
    public boolean h;
    public rz0 i;
    public NotificationManager j;

    static {
        h80.f("SystemFgService");
    }

    public final void b() {
        this.g = new Handler(Looper.getMainLooper());
        this.j = (NotificationManager) getApplicationContext().getSystemService("notification");
        rz0 rz0Var = new rz0(getApplicationContext());
        this.i = rz0Var;
        if (rz0Var.n != null) {
            h80.d().b(rz0.o, "A callback already exists.", new Throwable[0]);
        } else {
            rz0Var.n = this;
        }
    }

    @Override // defpackage.e60, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // defpackage.e60, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.i.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.h) {
            h80.d().e(new Throwable[0]);
            this.i.g();
            b();
            this.h = false;
        }
        if (intent == null) {
            return 3;
        }
        rz0 rz0Var = this.i;
        ha1 ha1Var = rz0Var.f;
        String str = rz0.o;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            h80 h80VarD = h80.d();
            String.format("Started foreground service %s", intent);
            h80VarD.e(new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = ha1Var.r;
            ((xb4) rz0Var.g).j(new gi(rz0Var, workDatabase, stringExtra, 5, false));
            rz0Var.f(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            rz0Var.f(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            h80.d().e(new Throwable[0]);
            SystemForegroundService systemForegroundService = rz0Var.n;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.h = true;
            h80.d().a(new Throwable[0]);
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        h80 h80VarD2 = h80.d();
        String.format("Stopping foreground work for %s", intent);
        h80VarD2.e(new Throwable[0]);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra2);
        ha1Var.getClass();
        ha1Var.s.j(new ed(ha1Var, uuidFromString));
        return 3;
    }
}
