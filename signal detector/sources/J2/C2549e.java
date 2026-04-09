package j2;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractC1266ha;
import com.google.android.gms.internal.ads.H9;
import q2.C2841s;
import q2.E;
import q2.E0;
import q2.c1;
import u2.AbstractC2953c;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2549e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f21335a;

    /* renamed from: b, reason: collision with root package name */
    public final E f21336b;

    public C2549e(Context context, E e6) {
        this.f21335a = context;
        this.f21336b = e6;
    }

    public final void a(C2551g c2551g) {
        E0 e02 = c2551g.f21337a;
        Context context = this.f21335a;
        H9.a(context);
        if (((Boolean) AbstractC1266ha.f14501c.v()).booleanValue()) {
            if (((Boolean) C2841s.f23267e.f23270c.a(H9.tc)).booleanValue()) {
                AbstractC2953c.f23792b.execute(new f1.i(this, 2, e02));
                return;
            }
        }
        try {
            this.f21336b.f0(c1.a(context, e02));
        } catch (RemoteException e6) {
            u2.k.f("Failed to load ad.", e6);
        }
    }
}
