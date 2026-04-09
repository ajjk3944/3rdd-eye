package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzgqt;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final /* synthetic */ class zzaq implements zzgqt {
    static final /* synthetic */ zzaq zza = new zzaq();

    private /* synthetic */ zzaq() {
    }

    @Override // com.google.android.gms.internal.ads.zzgqt
    public final /* synthetic */ Object apply(Object obj) {
        int i10 = zzau.zze;
        return ((JSONObject) obj).optString("nas");
    }
}
