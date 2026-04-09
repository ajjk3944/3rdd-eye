package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zs;
import va.f;
import va.o;
import va.r;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            o oVar = r.g.f36158b;
            yq yqVar = new yq();
            oVar.getClass();
            zs zsVar = (zs) new f(oVar, this, yqVar).d(this, false);
            if (zsVar == null) {
                i.e("OfflineUtils is null");
            } else {
                zsVar.d0(getIntent());
            }
        } catch (RemoteException e2) {
            i.e("RemoteException calling handleNotificationIntent: ".concat(e2.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
