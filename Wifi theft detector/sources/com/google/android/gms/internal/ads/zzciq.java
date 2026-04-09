package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes2.dex */
final /* synthetic */ class zzciq implements zzafa {
    static final /* synthetic */ zzciq zza = new zzciq();

    private /* synthetic */ zzciq() {
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public final /* synthetic */ zzaeu[] zza() {
        int i10 = zzcit.zza;
        return new zzaeu[]{new zzakw(), new zzajh(), new zzako(zzamd.zza, 32, null, null, zzguf.zzi(), null)};
    }

    @Override // com.google.android.gms.internal.ads.zzafa
    public /* synthetic */ zzaeu[] zzb(Uri uri, Map map) {
        return p.a(this, uri, map);
    }
}
