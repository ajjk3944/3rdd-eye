package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.aj1;
import defpackage.bu1;
import defpackage.gi2;
import defpackage.s62;
import defpackage.sv1;
import defpackage.w82;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            bu1 bu1Var = sv1.f.b;
            s62 s62Var = new s62();
            bu1Var.getClass();
            w82 w82Var = (w82) new aj1(bu1Var, this, s62Var).d(this, false);
            if (w82Var == null) {
                gi2.Z("OfflineUtils is null");
            } else {
                w82Var.s0(getIntent());
            }
        } catch (RemoteException e) {
            gi2.Z("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
