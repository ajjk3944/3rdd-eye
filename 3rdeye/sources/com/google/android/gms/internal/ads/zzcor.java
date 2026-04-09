package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcor implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;
    private final zzhgh zzf;
    private final zzhgh zzg;
    private final zzhgh zzh;
    private final zzhgh zzi;
    private final zzhgh zzj;

    public zzcor(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5, zzhgh zzhghVar6, zzhgh zzhghVar7, zzhgh zzhghVar8, zzhgh zzhghVar9, zzhgh zzhghVar10) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
        this.zze = zzhghVar5;
        this.zzf = zzhghVar6;
        this.zzg = zzhghVar7;
        this.zzh = zzhghVar8;
        this.zzi = zzhghVar9;
        this.zzj = zzhghVar10;
    }

    public static zzcoq zzc(zzcqu zzcquVar, Context context, zzfbu zzfbuVar, View view, zzcfe zzcfeVar, zzcqt zzcqtVar, zzdix zzdixVar, zzddy zzddyVar, zzhfs zzhfsVar, Executor executor) {
        return new zzcoq(zzcquVar, context, zzfbuVar, view, zzcfeVar, zzcqtVar, zzdixVar, zzddyVar, zzhfsVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcoq zzb() {
        return new zzcoq(((zzctc) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcox) this.zzc).zza(), ((zzcow) this.zzd).zza(), ((zzcpl) this.zze).zza(), ((zzcoy) this.zzf).zza(), ((zzdgs) this.zzg).zza(), (zzddy) this.zzh.zzb(), zzhfx.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
