package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ek3 implements yj3, ng3 {
    public static final String[] g = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    public final Context a;
    public final ExecutorService b;
    public long c = 0;
    public long d = 0;
    public long e = -1;
    public boolean f = false;

    public ek3(Context context, ExecutorService executorService, String[] strArr) {
        this.a = context;
        this.b = executorService;
    }

    @Override // defpackage.ng3
    public final n70 a() {
        if (Build.VERSION.SDK_INT < 30) {
            return lq3.g;
        }
        ar3 ar3Var = new ar3(Executors.callable(new bh3(3, this), null));
        this.b.execute(ar3Var);
        return ar3Var;
    }

    @Override // defpackage.yj3
    public final void b(HashMap map, Context context, View view) {
        e();
    }

    @Override // defpackage.yj3
    public final void c(HashMap map) {
        e();
    }

    @Override // defpackage.yj3
    public final void d(HashMap map) {
        long j;
        long j2;
        e();
        synchronized (this) {
            try {
                j = this.f ? this.d - this.c : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j2 = this.e;
            this.e = -1L;
        }
        map.put("vf", Long.valueOf(j2));
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f) {
                    this.d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
