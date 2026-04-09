package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import defpackage.aj1;
import defpackage.bu1;
import defpackage.gi2;
import defpackage.s62;
import defpackage.sv1;
import defpackage.w82;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        try {
            bu1 bu1Var = sv1.f.b;
            s62 s62Var = new s62();
            bu1Var.getClass();
            ((w82) new aj1(bu1Var, this, s62Var).d(this, false)).s0(intent);
        } catch (RemoteException e) {
            gi2.Z("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
