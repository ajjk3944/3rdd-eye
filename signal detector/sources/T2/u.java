package t2;

import android.content.Context;
import com.google.android.gms.internal.ads.C0697Ql;
import com.google.android.gms.internal.ads.C0889ae;
import com.google.android.gms.internal.ads.C1780r4;
import com.google.android.gms.internal.ads.C1994v2;
import com.google.android.gms.internal.ads.H9;
import com.google.android.gms.internal.ads.N4;
import java.util.HashMap;
import java.util.Map;
import q2.C2841s;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static K4.j f23657a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f23658b = new Object();

    public u(Context context) {
        K4.j jVar;
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (f23658b) {
            try {
                if (f23657a == null) {
                    H9.a(context);
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.f8750g5)).booleanValue()) {
                        jVar = C2929m.E(context);
                    } else {
                        jVar = new K4.j(new N4(new C0889ae(context.getApplicationContext())), new C0697Ql(new C1994v2(21)));
                        jVar.a();
                    }
                    f23657a = jVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final s a(int i, String str, HashMap map, byte[] bArr) {
        s sVar = new s();
        q qVar = new q(this, str, sVar);
        u2.h hVar = new u2.h();
        r rVar = new r(this, i, str, sVar, qVar, bArr, map, hVar);
        if (u2.h.c()) {
            try {
                Map mapF = rVar.f();
                byte[] bArr2 = bArr == null ? null : bArr;
                if (u2.h.c()) {
                    hVar.e("onNetworkRequest", new c1.g(str, "GET", mapF, bArr2, 26));
                }
            } catch (C1780r4 e6) {
                u2.k.h(e6.getMessage());
            }
        }
        f23657a.b(rVar);
        return sVar;
    }
}
