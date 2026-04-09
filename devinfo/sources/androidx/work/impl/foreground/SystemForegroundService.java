package androidx.work.impl.foreground;

import a0.x0;
import a7.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.d0;
import c0.p;
import c7.l;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.UUID;
import nk.k;
import t6.v;
import t6.x;
import u6.r;
import vd.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class SystemForegroundService extends d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f1623e = v.g("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public boolean f1624b;

    /* renamed from: c, reason: collision with root package name */
    public b f1625c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f1626d;

    public final void a() {
        this.f1626d = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f1625c = bVar;
        if (bVar.j != null) {
            v.e().c(b.f208k, "A callback already exists.");
        } else {
            bVar.j = this;
        }
    }

    @Override // androidx.lifecycle.d0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.d0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f1625c.d();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i4, int i10) {
        super.onStartCommand(intent, i4, i10);
        boolean z3 = this.f1624b;
        String str = f1623e;
        if (z3) {
            v.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f1625c.d();
            a();
            this.f1624b = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f1625c;
        bVar.getClass();
        String str2 = b.f208k;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            v.e().f(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((l) ((x0) bVar.f211c).f148e).execute(new a(bVar, false, stringExtra, 1));
            bVar.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            v.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f1624b = true;
            v.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i10);
            return 3;
        }
        v.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        r rVar = bVar.f210b;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        rVar.getClass();
        k.e(uuidFromString, FacebookMediationAdapter.KEY_ID);
        x xVar = rVar.f35176e.f34322m;
        l lVar = (l) ((x0) rVar.g).f148e;
        k.d(lVar, "getSerialTaskExecutor(...)");
        pd.b.l(xVar, "CancelWorkById", lVar, new p(3, rVar, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i4) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f1625c.f(i4, 2048);
    }

    public final void onTimeout(int i4, int i10) {
        this.f1625c.f(i4, i10);
    }
}
