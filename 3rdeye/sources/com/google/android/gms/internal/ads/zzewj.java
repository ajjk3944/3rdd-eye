package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzewj implements zzhfy {
    public static zzetx zza(Context context, zzbze zzbzeVar, zzbzf zzbzfVar, Object obj, zzeva zzevaVar, zzevu zzevuVar, zzhfs zzhfsVar, zzhfs zzhfsVar2, zzhfs zzhfsVar3, zzhfs zzhfsVar4, zzhfs zzhfsVar5, zzhfs zzhfsVar6, zzhfs zzhfsVar7, Executor executor, zzfhm zzfhmVar, zzdsc zzdscVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzevn) obj);
        hashSet.add(zzevaVar);
        hashSet.add(zzevuVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfW)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfX)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfZ)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzga)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar5.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzdl)).booleanValue()) {
            hashSet.add((zzetu) zzhfsVar7.zzb());
        }
        return new zzetx(context, executor, hashSet, zzfhmVar, zzdscVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
