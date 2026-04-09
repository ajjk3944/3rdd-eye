package pa;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.sl;
import va.b3;
import va.d2;
import va.e0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31524a;

    /* renamed from: b, reason: collision with root package name */
    public final e0 f31525b;

    public e(Context context, e0 e0Var) {
        this.f31524a = context;
        this.f31525b = e0Var;
    }

    public final void a(g gVar) {
        d2 d2Var = gVar.f31526a;
        Context context = this.f31524a;
        sk.a(context);
        if (((Boolean) sl.f16457c.u()).booleanValue()) {
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new fb.r(6, this, d2Var));
                return;
            }
        }
        try {
            this.f31525b.P(b3.a(context, d2Var));
        } catch (RemoteException e2) {
            za.i.f("Failed to load ad.", e2);
        }
    }
}
