package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class mi3 extends ti3 {
    public final Map f;
    public final Context g;
    public final eg3 h;
    public final long i;
    public final long j;

    public mi3(fr1 fr1Var, gi3 gi3Var, Map map, Context context, eg3 eg3Var, vf3 vf3Var, gk3 gk3Var) {
        super("zRITP136LTX4rFLknKK5s+BdzyKXJ24gjaP1ECV594x04Hyj3q+IVU95/J2vSCm1", "E6K+C1ogZN29OFWU2j1wUPRhMI7Lv3qBcqHzi1vCWW4=", fr1Var, gi3Var, gk3Var.a(113));
        this.g = context;
        this.f = map;
        this.h = eg3Var;
        this.i = vf3Var.L();
        this.j = vf3Var.M();
    }

    @Override // defpackage.ti3
    public final void a(Method method, fr1 fr1Var) {
        qr1 qr1Var;
        Object[] objArr = (Object[]) method.invoke("", this.g, Integer.valueOf(this.h.ordinal()));
        objArr.getClass();
        String strV0 = "E";
        int i = 1;
        try {
            n70 n70Var = (n70) this.f.get("gs");
            if (n70Var != null && ((Build.VERSION.SDK_INT < 31 || n70Var.isDone()) && (qr1Var = (qr1) n70Var.get(this.i, TimeUnit.MILLISECONDS)) != null && qr1Var.v0().length() > 1)) {
                strV0 = qr1Var.v0();
            }
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strV0.equals("E")) {
            try {
                n70 n70Var2 = (n70) this.f.get("ai");
                if (n70Var2 != null) {
                    String str = (String) n70Var2.get(this.j, TimeUnit.MILLISECONDS);
                    if (!yc0.s(str)) {
                        strV0 = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        Boolean bool = (Boolean) objArr[5];
        synchronized (fr1Var) {
            try {
                long jLongValue = ((Long) objArr[0]).longValue();
                fr1Var.b();
                ((qr1) fr1Var.g).F(jLongValue);
                String str2 = (String) objArr[1];
                fr1Var.b();
                ((qr1) fr1Var.g).E(str2);
                String str3 = (String) objArr[2];
                fr1Var.b();
                ((qr1) fr1Var.g).O(str3);
                String str4 = (String) objArr[3];
                fr1Var.b();
                ((qr1) fr1Var.g).P(str4);
                jo3 jo3VarF = jo3.f.f();
                byte[] bArr = (byte[]) objArr[4];
                String strG = jo3VarF.g(bArr.length, bArr);
                fr1Var.b();
                ((qr1) fr1Var.g).A(strG);
                fr1Var.b();
                ((qr1) fr1Var.g).S0(strV0);
                if (bool != null) {
                    if (true == bool.booleanValue()) {
                        i = 2;
                    }
                    fr1Var.b();
                    ((qr1) fr1Var.g).t0(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
