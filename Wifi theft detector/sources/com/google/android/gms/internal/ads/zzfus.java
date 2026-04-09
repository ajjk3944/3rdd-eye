package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class zzfus extends zzfut {
    protected final HashSet zza;
    protected final JSONObject zzb;
    protected final long zzc;

    public zzfus(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfulVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
