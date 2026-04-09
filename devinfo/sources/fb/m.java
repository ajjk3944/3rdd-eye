package fb;

import android.os.Binder;
import com.google.android.gms.internal.ads.ae;
import com.google.android.gms.internal.ads.dg0;
import com.google.android.gms.internal.ads.e81;
import com.google.android.gms.internal.ads.em;
import com.google.android.gms.internal.ads.ex;
import com.google.android.gms.internal.ads.iu;
import com.google.android.gms.internal.ads.n81;
import com.google.android.gms.internal.ads.og0;
import com.google.android.gms.internal.ads.r7;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.w81;
import com.google.android.gms.internal.ads.wf0;
import com.google.android.gms.internal.ads.yo0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m implements e81 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f23949a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f23950b;

    public m(ex exVar, r7 r7Var) {
        this.f23949a = exVar;
        this.f23950b = r7Var;
    }

    @Override // com.google.android.gms.internal.ads.e81
    public final vd.b c(Object obj) {
        vd.b bVarE;
        iu iuVar = (iu) obj;
        String str = iuVar.f12476d;
        ya.f0 f0Var = ua.j.C.f35261c;
        boolean zF = ya.f0.f(str);
        r7 r7Var = this.f23950b;
        if (zF) {
            bVarE = yo0.w(new og0(1));
        } else {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16226m8)).booleanValue() || ((Boolean) em.f10827a.u()).booleanValue()) {
                bVarE = ((ex) ((w81) r7Var.f15559d)).e(new ae(6, r7Var, iuVar));
            } else {
                bVarE = ((dg0) r7Var.f15560e).d(iuVar);
            }
        }
        return yo0.F(yo0.D((n81) yo0.E(n81.s(bVarE), ((Integer) va.s.f36163e.f36166c.a(sk.f16337t6)).intValue(), TimeUnit.SECONDS, (ScheduledExecutorService) r7Var.f15557b), Throwable.class, new wf0(r7Var, iuVar, Binder.getCallingUid(), 1), (w81) r7Var.f15558c), new c(2, iuVar), this.f23949a);
    }
}
