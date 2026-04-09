package pa;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.qm;
import com.google.android.gms.internal.ads.yq;
import pb.y;
import va.h0;
import va.m2;
import va.n2;
import va.w2;
import va.x2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31522a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f31523b;

    public d(Context context, String str) {
        y.i(context, "context cannot be null");
        va.o oVar = va.r.g.f36158b;
        yq yqVar = new yq();
        oVar.getClass();
        h0 h0Var = (h0) new va.k(oVar, context, str, yqVar).d(context, false);
        this.f31522a = context;
        this.f31523b = h0Var;
    }

    public final e a() {
        Context context = this.f31522a;
        try {
            return new e(context, this.f31523b.c());
        } catch (RemoteException e2) {
            za.i.f("Failed to build AdLoader.", e2);
            return new e(context, new m2(new n2()));
        }
    }

    public final void b(c cVar) {
        try {
            this.f31523b.s2(new w2(cVar));
        } catch (RemoteException e2) {
            za.i.i("Failed to set AdListener.", e2);
        }
    }

    public final void c(eb.d dVar) {
        try {
            h0 h0Var = this.f31523b;
            boolean z3 = dVar.f22522a;
            boolean z10 = dVar.f22524c;
            int i4 = dVar.f22525d;
            t tVar = dVar.f22526e;
            h0Var.G2(new qm(4, z3, -1, z10, i4, tVar != null ? new x2(tVar) : null, dVar.f22527f, dVar.f22523b, dVar.f22528h, dVar.g, dVar.f22529i - 1));
        } catch (RemoteException e2) {
            za.i.i("Failed to specify native ad options", e2);
        }
    }
}
