package n0;

import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements ar.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17199a = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17200d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f17201g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f17202r;

    public /* synthetic */ k(a aVar, v1 v1Var, o0.g0 g0Var) {
        this.f17200d = aVar;
        this.f17201g = v1Var;
        this.f17202r = g0Var;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f17199a) {
            case 0:
                p pVar = (p) this.f17200d;
                o0.a aVar = (o0.a) this.f17201g;
                r1 r1Var = (r1) this.f17202r;
                o0.b bVar = pVar.M;
                o0.a aVar2 = bVar.f18685b;
                try {
                    bVar.f18685b = aVar;
                    r1 r1Var2 = pVar.G;
                    int[] iArr = pVar.f17266o;
                    u.t tVar = pVar.f17273v;
                    pVar.f17266o = null;
                    pVar.f17273v = null;
                    try {
                        pVar.G = r1Var;
                        boolean z10 = bVar.f18688e;
                        try {
                            bVar.f18688e = false;
                            throw null;
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    bVar.f18685b = aVar2;
                    throw th2;
                }
            default:
                a aVar3 = (a) this.f17200d;
                v1 v1Var = (v1) this.f17201g;
                o0.g0 g0Var = (o0.g0) this.f17202r;
                if (aVar3 != null) {
                    v1Var.a(v1Var.c(aVar3) - v1Var.f17350t);
                }
                List listI = i4.i(v1Var, null, v1Var.f17350t, null);
                y0.a aVar4 = (y0.a) mq.o.A0(listI);
                Integer num = aVar4 != null ? aVar4.f25612a : null;
                List listC = g0Var.c(num);
                if (num != null && !listC.isEmpty()) {
                    y0.a aVar5 = (y0.a) mq.o.r0(listC);
                    List listM0 = mq.o.m0(1, listC);
                    aVar5.getClass();
                    listC = mq.o.E0(e5.H(new y0.a(null, num)), listM0);
                }
                return mq.o.E0(listI, listC);
        }
    }

    public /* synthetic */ k(p pVar, o0.a aVar, r1 r1Var, w0 w0Var) {
        this.f17200d = pVar;
        this.f17201g = aVar;
        this.f17202r = r1Var;
    }
}
