package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfnk extends zzfnl {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfnk(zzfnd zzfndVar, HashSet hashSet, JSONObject jSONObject, long j4) {
        super(zzfndVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j4;
    }
}
