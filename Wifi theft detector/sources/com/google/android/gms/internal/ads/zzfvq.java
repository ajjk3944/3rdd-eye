package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

@ShowFirstParty
/* loaded from: classes2.dex */
public final class zzfvq {
    public static zzfwv zza(Context context, int i10, zzbch zzbchVar, String str, String str2, String str3, zzfvh zzfvhVar) {
        return new zzfvp(context, 1, zzbchVar, str, str2, "1", zzfvhVar).zza(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS);
    }
}
