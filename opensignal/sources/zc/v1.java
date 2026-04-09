package zc;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzr;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class v1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27244a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27245d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d2 f27246g;

    public v1(d2 d2Var, long j, int i10) {
        this.f27244a = i10;
        switch (i10) {
            case 1:
                this.f27245d = j;
                Objects.requireNonNull(d2Var);
                this.f27246g = d2Var;
                break;
            default:
                this.f27245d = j;
                Objects.requireNonNull(d2Var);
                this.f27246g = d2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f27244a) {
            case 0:
                c1 c1Var = (c1) this.f27246g.f1504d;
                r0 r0Var = c1Var.f26888x;
                c1.e(r0Var);
                d5.y0 y0Var = r0Var.H;
                long j = this.f27245d;
                y0Var.f(j);
                j0 j0Var = c1Var.f26889y;
                c1.g(j0Var);
                j0Var.J.c(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                d2 d2Var = this.f27246g;
                d2Var.s1();
                d2Var.t1();
                c1 c1Var2 = (c1) d2Var.f1504d;
                j0 j0Var2 = c1Var2.f26889y;
                c1.g(j0Var2);
                j0Var2.J.b("Resetting analytics data (FE)");
                e3 e3Var = c1Var2.D;
                c1.f(e3Var);
                e3Var.s1();
                io.sentry.android.replay.gestures.c cVar = e3Var.B;
                ((d3) cVar.f11923r).c();
                ((c1) ((e3) cVar.f11924x).f1504d).G.getClass();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                cVar.f11921d = jElapsedRealtime;
                cVar.f11922g = jElapsedRealtime;
                c1Var2.l().x1();
                boolean z10 = !c1Var2.a();
                r0 r0Var2 = c1Var2.f26888x;
                c1.e(r0Var2);
                r0Var2.B.f(this.f27245d);
                c1 c1Var3 = (c1) r0Var2.f1504d;
                r0 r0Var3 = c1Var3.f26888x;
                c1.e(r0Var3);
                if (!TextUtils.isEmpty(r0Var3.S.n())) {
                    r0Var2.S.o(null);
                }
                r0Var2.M.f(0L);
                r0Var2.N.f(0L);
                if (!c1Var3.f26887r.F1()) {
                    r0Var2.B1(z10);
                }
                r0Var2.T.o(null);
                r0Var2.U.f(0L);
                r0Var2.V.t0(null);
                x2 x2VarJ = c1Var2.j();
                x2VarJ.s1();
                x2VarJ.t1();
                zzr zzrVarI1 = x2VarJ.I1(false);
                x2VarJ.E1();
                ((c1) x2VarJ.f1504d).i().w1();
                x2VarJ.G1(new s2(x2VarJ, zzrVarI1, 0));
                c1.f(e3Var);
                e3Var.f26919y.c();
                d2Var.P = z10;
                c1Var2.j().w1(new AtomicReference());
                break;
        }
    }
}
