package rb;

import a5.d0;
import android.os.Handler;
import android.os.Message;
import l5.a0;

/* loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21457a = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f21458d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f21459g;

    public f(g gVar, a0 a0Var) {
        this.f21459g = gVar;
        Handler handlerL = qb.v.l(this);
        this.f21458d = handlerL;
        a0Var.f14679b.setOnFrameRenderedListener(new l5.a(a0Var, this, 2), handlerL);
    }

    public void a(long j) {
        s5.c cVar = (s5.c) this.f21459g;
        if (this != cVar.F1 || cVar.f14740b0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            cVar.Q0 = true;
            return;
        }
        try {
            cVar.m0(j);
            cVar.u0();
            cVar.S0.f6939e++;
            cVar.t0();
            cVar.V(j);
        } catch (d5.f e4) {
            cVar.R0 = e4;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f21457a) {
            case 0:
                if (message.what != 0) {
                    break;
                } else {
                    int i10 = message.arg1;
                    int i11 = message.arg2;
                    int i12 = qb.v.f20828a;
                    long j = (i11 & 4294967295L) | ((i10 & 4294967295L) << 32);
                    g gVar = (g) this.f21459g;
                    if (this == gVar.G1) {
                        if (j == Long.MAX_VALUE) {
                            gVar.S0 = true;
                            break;
                        } else {
                            try {
                                gVar.k0(j);
                                gVar.s0();
                                gVar.U0.f26783b++;
                                gVar.r0();
                                gVar.U(j);
                                break;
                            } catch (com.google.android.exoplayer2.n e4) {
                                gVar.T0 = e4;
                                return true;
                            }
                        }
                    }
                }
                break;
            default:
                if (message.what == 0) {
                    int i13 = message.arg1;
                    int i14 = message.arg2;
                    int i15 = d0.f105a;
                    a((i14 & 4294967295L) | ((i13 & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    public f(s5.c cVar, l5.k kVar) {
        this.f21459g = cVar;
        Handler handlerK = d0.k(this);
        this.f21458d = handlerK;
        kVar.a(this, handlerK);
    }
}
