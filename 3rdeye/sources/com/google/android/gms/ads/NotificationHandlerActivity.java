package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbth;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class NotificationHandlerActivity extends Activity {

    @KeepForSdk
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbth zzbthVarZzo = zzbb.zza().zzo(this, new zzbpk());
            if (zzbthVarZzo == null) {
                zzo.zzg("OfflineUtils is null");
            } else {
                zzbthVarZzo.zze(getIntent());
            }
        } catch (RemoteException e4) {
            zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e4.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}
