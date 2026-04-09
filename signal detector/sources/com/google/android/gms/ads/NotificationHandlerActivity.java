package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import q2.C2816f;
import q2.C2834o;
import q2.r;
import u2.k;

/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            C2834o c2834o = r.f23260g.f23262b;
            BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
            c2834o.getClass();
            InterfaceC0570Jd interfaceC0570Jd = (InterfaceC0570Jd) new C2816f(c2834o, this, binderC0569Jc).d(this, false);
            if (interfaceC0570Jd == null) {
                k.e("OfflineUtils is null");
            } else {
                interfaceC0570Jd.u0(getIntent());
            }
        } catch (RemoteException e6) {
            k.e("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
