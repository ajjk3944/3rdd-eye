package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ja4 extends tl {
    public final WeakReference b;

    public ja4(yz1 yz1Var) {
        this.b = new WeakReference(yz1Var);
    }

    @Override // defpackage.tl
    public final void a(sl slVar) {
        yz1 yz1Var = (yz1) this.b.get();
        if (yz1Var != null) {
            yz1Var.b = slVar;
            try {
                ((n10) slVar.a).X0();
            } catch (RemoteException unused) {
            }
            p21 p21Var = yz1Var.d;
            if (p21Var != null) {
                yz1 yz1Var2 = (yz1) p21Var.f;
                sl slVar2 = yz1Var2.b;
                if (slVar2 == null) {
                    yz1Var2.a = null;
                } else if (yz1Var2.a == null) {
                    yz1Var2.a = slVar2.b(null);
                }
                rl rlVar = new rl(yz1Var2.a);
                lf4.y(rlVar, (Bundle) p21Var.g);
                l92 l92VarA = rlVar.a();
                Intent intent = (Intent) l92VarA.f;
                Context context = (Context) p21Var.h;
                intent.setPackage(ob1.s(context));
                intent.setData((Uri) p21Var.i);
                context.startActivity(intent, (Bundle) l92VarA.g);
                Activity activity = (Activity) context;
                ja4 ja4Var = yz1Var2.c;
                if (ja4Var == null) {
                    return;
                }
                activity.unbindService(ja4Var);
                yz1Var2.b = null;
                yz1Var2.a = null;
                yz1Var2.c = null;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        yz1 yz1Var = (yz1) this.b.get();
        if (yz1Var != null) {
            yz1Var.b = null;
            yz1Var.a = null;
        }
    }
}
