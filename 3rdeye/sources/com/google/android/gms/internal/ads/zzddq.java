package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzddq extends zzdbm implements zzazb {
    private final Map zzb;
    private final Context zzc;
    private final zzfbt zzd;

    public zzddq(Context context, Set set, zzfbt zzfbtVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzfbtVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzazc zzazcVar = (zzazc) map.get(view);
            if (zzazcVar == null) {
                zzazc zzazcVar2 = new zzazc(this.zzc, view);
                zzazcVar2.zzd(this);
                map.put(view, zzazcVar2);
                zzazcVar = zzazcVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbz)).booleanValue()) {
                    zzazcVar.zzg(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzby)).longValue());
                    return;
                }
            }
            zzazcVar.zzf();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzazc) map.get(view)).zze(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazb
    public final synchronized void zzdr(final zzaza zzazaVar) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzddp
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzazb) obj).zzdr(zzazaVar);
            }
        });
    }
}
