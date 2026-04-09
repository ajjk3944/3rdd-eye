package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import q2.C2816f;
import q2.C2834o;
import q2.r;
import u2.k;

/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            C2834o c2834o = r.f23260g.f23262b;
            BinderC0569Jc binderC0569Jc = new BinderC0569Jc();
            c2834o.getClass();
            ((InterfaceC0570Jd) new C2816f(c2834o, this, binderC0569Jc).d(this, false)).u0(intent);
        } catch (RemoteException e6) {
            k.e("RemoteException calling handleNotificationIntent: ".concat(e6.toString()));
        }
    }
}
