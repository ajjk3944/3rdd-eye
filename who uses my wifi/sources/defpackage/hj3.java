package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hj3 implements ge3 {
    public final Context a;
    public final xj3 b;
    public final String c;
    public final long d;
    public final long e;

    public hj3(Context context, vf3 vf3Var, xj3 xj3Var) {
        this.a = context;
        this.c = vf3Var.E();
        this.d = vf3Var.L();
        this.e = vf3Var.M();
        this.b = xj3Var;
    }

    public final void a(HashMap map) {
        n70 n70Var;
        qr1 qr1Var;
        map.put("v", this.c);
        map.put("t", new Throwable());
        try {
            n70Var = (n70) map.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        String strV0 = (n70Var == null || (Build.VERSION.SDK_INT >= 31 && !n70Var.isDone()) || (qr1Var = (qr1) n70Var.get(this.d, TimeUnit.MILLISECONDS)) == null || qr1Var.v0().length() <= 1) ? "E" : qr1Var.v0();
        if (strV0.equals("E")) {
            try {
                n70 n70Var2 = (n70) map.get("ai");
                if (n70Var2 != null) {
                    String str = (String) n70Var2.get(this.e, TimeUnit.MILLISECONDS);
                    if (!yc0.s(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strV0);
    }

    @Override // defpackage.ge3
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }

    @Override // defpackage.ge3
    public final HashMap d() {
        HashMap mapA = this.b.a();
        a(mapA);
        return mapA;
    }

    @Override // defpackage.ge3
    public final HashMap h() {
        HashMap mapB = this.b.b(this.a, null);
        a(mapB);
        return mapB;
    }

    @Override // defpackage.ge3
    public final HashMap l() {
        HashMap mapC = this.b.c();
        a(mapC);
        return mapC;
    }
}
