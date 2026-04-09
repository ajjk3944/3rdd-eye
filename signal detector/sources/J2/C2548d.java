package j2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.C0499Fa;
import q2.C2826k;
import q2.C2834o;
import q2.H;
import q2.N0;
import q2.O0;
import q2.X0;
import q2.Y0;

/* renamed from: j2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2548d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21333a;

    /* renamed from: b, reason: collision with root package name */
    public final H f21334b;

    public C2548d(Context context, String str) {
        M2.u.f(context, "context cannot be null");
        C2834o c2834o = q2.r.f23260g.f23262b;
        BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
        c2834o.getClass();
        H h6 = (H) new C2826k(c2834o, context, str, binderC0569Jc).d(context, false);
        this.f21333a = context;
        this.f21334b = h6;
    }

    public final C2549e a() {
        Context context = this.f21333a;
        try {
            return new C2549e(context, this.f21334b.b());
        } catch (RemoteException e6) {
            u2.k.f("Failed to build AdLoader.", e6);
            return new C2549e(context, new N0(new O0()));
        }
    }

    public final void b(AbstractC2547c abstractC2547c) {
        try {
            this.f21334b.Y1(new X0(abstractC2547c));
        } catch (RemoteException e6) {
            u2.k.i("Failed to set AdListener.", e6);
        }
    }

    public final void c(z2.c cVar) {
        try {
            H h6 = this.f21334b;
            boolean z6 = cVar.f24454a;
            boolean z7 = cVar.f24456c;
            int i = cVar.f24457d;
            t tVar = cVar.f24458e;
            h6.l2(new C0499Fa(4, z6, -1, z7, i, tVar != null ? new Y0(tVar) : null, cVar.f24459f, cVar.f24455b, cVar.f24461h, cVar.f24460g, cVar.i - 1));
        } catch (RemoteException e6) {
            u2.k.i("Failed to specify native ad options", e6);
        }
    }
}
