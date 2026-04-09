package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbso implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsp zza;

    public zzbso(zzbsp zzbspVar) {
        this.zza = zzbspVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.zza.zzh("User canceled the download.");
    }
}
