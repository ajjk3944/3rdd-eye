package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class p32 {
    public static ko1 a;
    public static final Object b = new Object();

    public p32(Context context) {
        ko1 ko1Var;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            try {
                if (a == null) {
                    mz1.a(context);
                    if (((Boolean) tw1.e.c.a(mz1.P4)).booleanValue()) {
                        ko1Var = ht1.u(context);
                    } else {
                        ko1Var = new ko1(new wo1(new gw3(21, context.getApplicationContext())), new vq2(new us0()));
                        ko1Var.a();
                    }
                    a = ko1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final t12 a(int i, String str, HashMap map, byte[] bArr) {
        t12 t12Var = new t12();
        l92 l92Var = new l92(this, str, t12Var);
        wb4 wb4Var = new wb4();
        y02 y02Var = new y02(this, i, str, t12Var, l92Var, bArr, map, wb4Var);
        if (wb4.c()) {
            try {
                Map mapE = y02Var.e();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (wb4.c()) {
                    wb4Var.e("onNetworkRequest", new mc2(str, "GET", mapE, bArr2, 26, false));
                }
            } catch (zn1 e) {
                gi2.i0(e.getMessage());
            }
        }
        a.b(y02Var);
        return t12Var;
    }
}
