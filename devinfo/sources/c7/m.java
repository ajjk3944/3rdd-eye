package c7;

import android.view.View;
import com.google.android.gms.internal.ads.ca0;
import t6.v;
import u6.c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2791a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2793c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2794d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2795e;

    public /* synthetic */ m(ca0 ca0Var, View view, boolean z3, int i4) {
        this.f2794d = ca0Var;
        this.f2795e = view;
        this.f2792b = z3;
        this.f2793c = i4;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zI;
        c0 c0VarB;
        switch (this.f2791a) {
            case 0:
                if (this.f2792b) {
                    u6.c cVar = (u6.c) this.f2794d;
                    u6.h hVar = (u6.h) this.f2795e;
                    int i4 = this.f2793c;
                    cVar.getClass();
                    String str = hVar.f35152a.f2007a;
                    synchronized (cVar.f35131k) {
                        c0VarB = cVar.b(str);
                    }
                    zI = u6.c.e(str, c0VarB, i4);
                } else {
                    zI = ((u6.c) this.f2794d).i((u6.h) this.f2795e, this.f2793c);
                }
                v.e().a(v.g("StopWorkRunnable"), "StopWorkRunnable for " + ((u6.h) this.f2795e).f35152a.f2007a + "; Processor.stopWork = " + zI);
                return;
            default:
                ca0 ca0Var = (ca0) this.f2794d;
                View view = (View) this.f2795e;
                boolean z3 = this.f2792b;
                int i10 = this.f2793c;
                ?? r12 = ca0Var.f10033w;
                if (r12 == 0) {
                    za.i.c("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                    return;
                } else {
                    ca0Var.f10024n.n(view, r12.f2(), ca0Var.f10033w.A1(), ca0Var.f10033w.D1(), z3, ca0Var.o(), i10);
                    return;
                }
        }
    }

    public m(u6.c cVar, u6.h hVar, boolean z3, int i4) {
        nk.k.e(cVar, "processor");
        nk.k.e(hVar, "token");
        this.f2794d = cVar;
        this.f2795e = hVar;
        this.f2792b = z3;
        this.f2793c = i4;
    }
}
