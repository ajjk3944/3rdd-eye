package c0;

import android.content.Context;
import com.google.android.gms.internal.measurement.y3;
import com.staircase3.opensignal.goldstar.speedtest.result.SpeedTestResult;
import java.io.File;
import java.util.concurrent.TimeUnit;
import n0.h2;

/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3063a;

    public /* synthetic */ a0(int i10) {
        this.f3063a = i10;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f3063a) {
            case 0:
                return new q();
            case 1:
                ou.x xVar = new ou.x();
                ou.w wVar = new ou.w();
                wVar.f19980a = xVar.f20004a;
                wVar.f19981b = xVar.f20005d;
                mq.t.d0(wVar.f19982c, xVar.f20006g);
                mq.t.d0(wVar.f19983d, xVar.f20007r);
                wVar.f19984e = xVar.f20008x;
                wVar.f19985f = xVar.f20009y;
                wVar.f19986g = xVar.B;
                wVar.f19987h = xVar.D;
                wVar.f19988i = xVar.E;
                wVar.j = xVar.F;
                wVar.k = xVar.G;
                wVar.f19989l = xVar.H;
                wVar.f19990m = xVar.I;
                wVar.f19991n = xVar.J;
                wVar.f19992o = xVar.K;
                wVar.f19993p = xVar.L;
                wVar.f19994q = xVar.M;
                wVar.f19995r = xVar.N;
                wVar.f19996s = xVar.O;
                wVar.f19997t = xVar.P;
                wVar.f19998u = xVar.Q;
                wVar.f19999v = xVar.R;
                wVar.f20000w = xVar.S;
                wVar.f20001x = xVar.T;
                wVar.f20002y = xVar.U;
                wVar.f20003z = xVar.V;
                wVar.A = xVar.W;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                br.l.e(timeUnit, "unit");
                wVar.f20001x = pu.b.b(30L, timeUnit);
                wVar.f20000w = pu.b.b(30L, timeUnit);
                wVar.k = new ou.g(new File(((Context) y3.s(Context.class)).getExternalCacheDir(), "opensignal"), 10485760);
                return new ou.x(wVar);
            case 2:
                h2 h2Var = f0.c.f8393a;
                return null;
            case 3:
                n0.a0 a0Var = h0.a.f9672a;
                return null;
            case 4:
                return h0.d.f9676b;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                return new fm.l();
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                fm.i iVar = new fm.i();
                iVar.f9012a = new SpeedTestResult();
                return iVar;
            case g4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                return new fm.j();
            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                return new fm.k();
            case 9:
                return new xj.l();
            case 10:
                long j = m0.a.f15991y;
                return new k0.a(j, m0.a.j, m0.a.f15992z, m0.a.k, m0.a.f15973e, m0.a.D, m0.a.f15979m, m0.a.E, m0.a.f15980n, m0.a.Q, m0.a.f15985s, m0.a.R, m0.a.f15986t, m0.a.f15969a, m0.a.f15975g, m0.a.H, m0.a.f15983q, m0.a.P, m0.a.f15984r, j, m0.a.f15974f, m0.a.f15972d, m0.a.f15970b, m0.a.f15976h, m0.a.f15971c, m0.a.f15977i, m0.a.f15989w, m0.a.f15990x, m0.a.C, m0.a.I, m0.a.O, m0.a.J, m0.a.K, m0.a.L, m0.a.M, m0.a.N, m0.a.A, m0.a.B, m0.a.f15978l, m0.a.F, m0.a.G, m0.a.f15981o, m0.a.f15982p, m0.a.S, m0.a.T, m0.a.f15987u, m0.a.f15988v);
            case 11:
                h2 h2Var2 = k0.b.f13891a;
                return Boolean.TRUE;
            case 12:
                h2 h2Var3 = k0.j.f13912a;
                return Boolean.FALSE;
            case 13:
                return k0.k.f13913a;
            case 14:
                return new k0.l();
            case 15:
                return new k0.q();
            case 16:
                return m0.i.f16116a;
            case 17:
                return new k0.u();
            case 18:
                return lu.b0.f15932b;
            case 19:
                return lu.t.f15958b;
            case 20:
                return lu.q.f15956b;
            case 21:
                return lu.y.f15965b;
            case 22:
                return lu.g.f15942b;
            case 23:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 24:
                n0.q.d("Unexpected call to default provider");
                throw new bf.n();
            case 25:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 26:
                h2 h2Var4 = w0.c.f24161a;
                return null;
            case 27:
                n0.a0 a0Var2 = androidx.compose.foundation.b.f1071a;
                return y.k.f25597a;
            case 28:
                h2 h2Var5 = y0.c.f25615a;
                return null;
            default:
                h2 h2Var6 = y0.e.f25617a;
                return null;
        }
    }
}
