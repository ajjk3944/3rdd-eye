package ya;

import android.content.Context;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.rt;
import com.google.android.gms.internal.ads.sa;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.w5;
import com.google.android.gms.internal.ads.w9;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static c1.o f37485a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f37486b = new Object();

    public r(Context context) {
        c1.o oVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f37486b) {
            try {
                if (f37485a == null) {
                    sk.a(context);
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.g5)).booleanValue()) {
                        oVar = j.C(context);
                    } else {
                        oVar = new c1.o(new sa(new l90(context.getApplicationContext())), new rt(new w5(21)));
                        oVar.h();
                    }
                    f37485a = oVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final p a(int i4, String str, HashMap map, byte[] bArr) {
        p pVar = new p();
        n nVar = new n(this, str, pVar);
        za.f fVar = new za.f();
        o oVar = new o(this, i4, str, pVar, nVar, bArr, map, fVar);
        if (za.f.c()) {
            try {
                Map mapF = oVar.f();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (za.f.c()) {
                    fVar.e("onNetworkRequest", new se.b(str, "GET", mapF, bArr2));
                }
            } catch (w9 e2) {
                za.i.h(e2.getMessage());
            }
        }
        f37485a.i(oVar);
        return pVar;
    }
}
