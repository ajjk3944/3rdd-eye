package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zs;
import va.f;
import va.o;
import va.r;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            o oVar = r.g.f36158b;
            yq yqVar = new yq();
            oVar.getClass();
            ((zs) new f(oVar, this, yqVar).d(this, false)).d0(intent);
        } catch (RemoteException e2) {
            i.e("RemoteException calling handleNotificationIntent: ".concat(e2.toString()));
        }
    }
}
