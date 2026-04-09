package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzbsi implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsj zza;

    public zzbsi(zzbsj zzbsjVar) {
        this.zza = zzbsjVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws JSONException {
        this.zza.zzh("Operation denied by user.");
    }
}
