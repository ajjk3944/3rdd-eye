package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ao implements u91, gt, ra1 {
    public static final /* synthetic */ int o = 0;
    public final Context f;
    public final int g;
    public final String h;
    public final qz0 i;
    public final v91 j;
    public PowerManager.WakeLock m;
    public boolean n = false;
    public int l = 0;
    public final Object k = new Object();

    static {
        h80.f("DelayMetCommandHandler");
    }

    public ao(Context context, int i, String str, qz0 qz0Var) {
        this.f = context;
        this.g = i;
        this.i = qz0Var;
        this.h = str;
        this.j = new v91(context, qz0Var.g, this);
    }

    @Override // defpackage.gt
    public final void a(String str, boolean z) {
        h80.d().a(new Throwable[0]);
        b();
        int i = this.g;
        qz0 qz0Var = this.i;
        Context context = this.f;
        if (z) {
            qz0Var.e(new k7(qz0Var, kg.c(context, this.h), i, 3));
        }
        if (this.n) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            qz0Var.e(new k7(qz0Var, intent, i, 3));
        }
    }

    public final void b() {
        synchronized (this.k) {
            try {
                this.j.c();
                this.i.h.b(this.h);
                PowerManager.WakeLock wakeLock = this.m;
                if (wakeLock != null && wakeLock.isHeld()) {
                    h80 h80VarD = h80.d();
                    Objects.toString(this.m);
                    h80VarD.a(new Throwable[0]);
                    this.m.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.u91
    public final void c(ArrayList arrayList) {
        f();
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.h;
        sb.append(str);
        sb.append(" (");
        sb.append(this.g);
        sb.append(")");
        this.m = y71.a(this.f, sb.toString());
        h80 h80VarD = h80.d();
        Objects.toString(this.m);
        h80VarD.a(new Throwable[0]);
        this.m.acquire();
        oa1 oa1VarH = this.i.j.r.n().h(str);
        if (oa1VarH == null) {
            f();
            return;
        }
        boolean zB = oa1VarH.b();
        this.n = zB;
        if (zB) {
            this.j.b(Collections.singletonList(oa1VarH));
        } else {
            h80.d().a(new Throwable[0]);
            e(Collections.singletonList(str));
        }
    }

    @Override // defpackage.u91
    public final void e(List list) {
        if (list.contains(this.h)) {
            synchronized (this.k) {
                try {
                    if (this.l == 0) {
                        this.l = 1;
                        h80.d().a(new Throwable[0]);
                        if (this.i.i.g(this.h, null)) {
                            this.i.h.a(this.h, this);
                        } else {
                            b();
                        }
                    } else {
                        h80.d().a(new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f() {
        synchronized (this.k) {
            try {
                if (this.l < 2) {
                    this.l = 2;
                    h80.d().a(new Throwable[0]);
                    Context context = this.f;
                    String str = this.h;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str);
                    qz0 qz0Var = this.i;
                    qz0Var.e(new k7(qz0Var, intent, this.g, 3));
                    if (this.i.i.d(this.h)) {
                        h80.d().a(new Throwable[0]);
                        Intent intentC = kg.c(this.f, this.h);
                        qz0 qz0Var2 = this.i;
                        qz0Var2.e(new k7(qz0Var2, intentC, this.g, 3));
                    } else {
                        h80.d().a(new Throwable[0]);
                    }
                } else {
                    h80.d().a(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
