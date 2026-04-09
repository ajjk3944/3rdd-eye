package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import m0.C5308a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzdih extends zzcqv {
    public static final zzfyf zzc = zzfyf.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA;
    private final Executor zzd;
    private final zzdim zze;
    private final zzdiu zzf;
    private final zzdjm zzg;
    private final zzdir zzh;
    private final zzdix zzi;
    private final zzhfs zzj;
    private final zzhfs zzk;
    private final zzhfs zzl;
    private final zzhfs zzm;
    private final zzhfs zzn;
    private zzdkk zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbyi zzt;
    private final zzavs zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdij zzx;
    private final zzekt zzy;
    private final Map zzz;

    public zzdih(zzcqu zzcquVar, Executor executor, zzdim zzdimVar, zzdiu zzdiuVar, zzdjm zzdjmVar, zzdir zzdirVar, zzdix zzdixVar, zzhfs zzhfsVar, zzhfs zzhfsVar2, zzhfs zzhfsVar3, zzhfs zzhfsVar4, zzhfs zzhfsVar5, zzbyi zzbyiVar, zzavs zzavsVar, VersionInfoParcel versionInfoParcel, Context context, zzdij zzdijVar, zzekt zzektVar, zzazd zzazdVar) {
        super(zzcquVar);
        this.zzd = executor;
        this.zze = zzdimVar;
        this.zzf = zzdiuVar;
        this.zzg = zzdjmVar;
        this.zzh = zzdirVar;
        this.zzi = zzdixVar;
        this.zzj = zzhfsVar;
        this.zzk = zzhfsVar2;
        this.zzl = zzhfsVar3;
        this.zzm = zzhfsVar4;
        this.zzn = zzhfsVar5;
        this.zzt = zzbyiVar;
        this.zzu = zzavsVar;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdijVar;
        this.zzy = zzektVar;
        this.zzz = new HashMap();
        this.zzA = new ArrayList();
    }

    public static boolean zzY(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkQ)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        com.google.android.gms.ads.internal.zzv.zzr();
        long jZzx = com.google.android.gms.ads.internal.util.zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (jZzx >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzkR)).intValue()) {
                return true;
            }
        }
        return false;
    }

    private final synchronized View zzaa(Map map) {
        if (map != null) {
            zzfyf zzfyfVar = zzc;
            int size = zzfyfVar.size();
            int i = 0;
            while (i < size) {
                WeakReference weakReference = (WeakReference) map.get((String) zzfyfVar.get(i));
                i++;
                if (weakReference != null) {
                    return (View) weakReference.get();
                }
            }
        }
        return null;
    }

    private final synchronized ImageView.ScaleType zzab() {
        zzdkk zzdkkVar = this.zzo;
        if (zzdkkVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper iObjectWrapperZzj = zzdkkVar.zzj();
        if (iObjectWrapperZzj != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(iObjectWrapperZzj);
        }
        return zzdjm.zza;
    }

    private final void zzac(String str, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfB)).booleanValue()) {
            zzf("Google", true);
            return;
        }
        A4.a aVarZzw = this.zze.zzw();
        if (aVarZzw == null) {
            return;
        }
        zzgdb.zzr(aVarZzw, new zzdif(this, "Google", true), this.zzd);
    }

    private final synchronized void zzad(View view, Map map, Map map2) {
        View viewZzaa;
        if (!this.zzr && (viewZzaa = zzaa(map)) != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznB)).booleanValue()) {
                Rect rect = new Rect();
                if (viewZzaa.getGlobalVisibleRect(rect, new Point()) && viewZzaa.getHeight() == rect.height() && viewZzaa.getWidth() == rect.width()) {
                    this.zzf.zzr(view, map, map2, zzab());
                    this.zzr = true;
                }
            } else if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zznC)).booleanValue()) {
                zzbct zzbctVar = zzbdc.zznD;
                if (((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).floatValue() > 0.0d) {
                    double dFloatValue = ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).floatValue();
                    if (viewZzaa.getGlobalVisibleRect(new Rect(), new Point())) {
                        if (r1.height() * r1.width() >= viewZzaa.getHeight() * viewZzaa.getWidth() * (dFloatValue / 100.0d)) {
                            this.zzf.zzr(view, map, map2, zzab());
                            this.zzr = true;
                        }
                    }
                }
            } else if (zzY(viewZzaa)) {
                this.zzf.zzr(view, map, map2, zzab());
                this.zzr = true;
            }
        }
    }

    private final synchronized void zzae(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzt(view, map, map2, zzab());
        this.zzq = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzaf(View view, zzecz zzeczVar) {
        zzcfe zzcfeVarZzr = this.zze.zzr();
        if (!this.zzh.zzd() || zzeczVar == null || zzcfeVarZzr == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzC().zzj(zzeczVar.zza(), view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzag(zzdkk zzdkkVar) {
        Iterator<String> itKeys;
        View view;
        zzavn zzavnVarZzc;
        try {
            if (!this.zzp) {
                this.zzo = zzdkkVar;
                this.zzg.zze(zzdkkVar);
                this.zzf.zzB(zzdkkVar.zzf(), zzdkkVar.zzm(), zzdkkVar.zzn(), zzdkkVar, zzdkkVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcR)).booleanValue() && (zzavnVarZzc = this.zzu.zzc()) != null) {
                    zzavnVarZzc.zzo(zzdkkVar.zzf());
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbU)).booleanValue()) {
                    zzfbt zzfbtVar = this.zzb;
                    if (zzfbtVar.zzak && (itKeys = zzfbtVar.zzaj.keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            zzdkk zzdkkVar2 = this.zzo;
                            WeakReference weakReference = zzdkkVar2 == null ? null : (WeakReference) zzdkkVar2.zzl().get(next);
                            this.zzz.put(next, Boolean.FALSE);
                            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                                zzazc zzazcVar = new zzazc(this.zzw, view);
                                this.zzA.add(zzazcVar);
                                zzazcVar.zzd(new zzdie(this, next));
                            }
                        }
                    }
                }
                if (zzdkkVar.zzi() != null) {
                    zzdkkVar.zzi().zzd(this.zzt);
                }
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzah(zzdkk zzdkkVar) {
        this.zzf.zzC(zzdkkVar.zzf(), zzdkkVar.zzl());
        if (zzdkkVar.zzh() != null) {
            zzdkkVar.zzh().setClickable(false);
            zzdkkVar.zzh().removeAllViews();
        }
        if (zzdkkVar.zzi() != null) {
            zzdkkVar.zzi().zze(this.zzt);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzs(zzdih zzdihVar, boolean z10) {
        zzdkk zzdkkVar = zzdihVar.zzo;
        if (zzdkkVar != null) {
            zzdihVar.zzf.zzq(null, zzdkkVar.zzf(), zzdihVar.zzo.zzl(), zzdihVar.zzo.zzm(), z10, zzdihVar.zzab(), 0);
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        }
    }

    public static /* synthetic */ void zzt(zzdih zzdihVar) {
        try {
            zzdim zzdimVar = zzdihVar.zze;
            int iZzc = zzdimVar.zzc();
            if (iZzc == 1) {
                zzbho zzbhoVarZzb = zzdihVar.zzi.zzb();
                if (zzbhoVarZzb != null) {
                    zzdihVar.zzac("Google", true);
                    zzbhoVarZzb.zze((zzbhe) zzdihVar.zzj.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 2) {
                zzbhl zzbhlVarZza = zzdihVar.zzi.zza();
                if (zzbhlVarZza != null) {
                    zzdihVar.zzac("Google", true);
                    zzbhlVarZza.zze((zzbhc) zzdihVar.zzk.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 3) {
                zzbhu zzbhuVarZzd = zzdihVar.zzi.zzd(zzdimVar.zzA());
                if (zzbhuVarZzd != null) {
                    if (zzdimVar.zzs() != null) {
                        zzdihVar.zzf("Google", true);
                    }
                    zzbhuVarZzd.zze((zzbhh) zzdihVar.zzn.zzb());
                    return;
                }
                return;
            }
            if (iZzc == 6) {
                zzbib zzbibVarZzf = zzdihVar.zzi.zzf();
                if (zzbibVarZzf != null) {
                    zzdihVar.zzac("Google", true);
                    zzbibVarZzf.zze((zzbih) zzdihVar.zzl.zzb());
                    return;
                }
                return;
            }
            if (iZzc != 7) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Wrong native template id!");
            } else {
                zzbmw zzbmwVarZzg = zzdihVar.zzi.zzg();
                if (zzbmwVarZzg != null) {
                    zzbmwVarZzg.zzg((zzbmq) zzdihVar.zzm.zzb());
                }
            }
        } catch (RemoteException e4) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("RemoteException when notifyAdLoad is called", e4);
        }
    }

    public static /* synthetic */ void zzu(zzdih zzdihVar, View view, boolean z10, int i) {
        zzdkk zzdkkVar = zzdihVar.zzo;
        if (zzdkkVar != null) {
            zzdihVar.zzf.zzq(view, zzdkkVar.zzf(), zzdihVar.zzo.zzl(), zzdihVar.zzo.zzm(), z10, zzdihVar.zzab(), i);
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
        }
    }

    public static /* synthetic */ void zzv(zzdih zzdihVar) {
        zzdihVar.zzf.zzk();
        zzdihVar.zze.zzI();
    }

    public final synchronized void zzA() {
        this.zzf.zzj();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: all -> 0x000a, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d A[Catch: all -> 0x000a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:10:0x000d, B:12:0x001f, B:14:0x0025, B:15:0x002f, B:17:0x0035, B:21:0x004a, B:24:0x005e, B:25:0x0066, B:27:0x006c, B:29:0x0080, B:31:0x0086, B:36:0x008d), top: B:41:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto Ld
            r3.zzad(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        La:
            r4 = move-exception
            goto L95
        Ld:
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.internal.ads.zzbdc.zzbU     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbda r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            com.google.android.gms.internal.ads.zzfbt r0 = r3.zzb     // Catch: java.lang.Throwable -> La
            boolean r0 = r0.zzak     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L48
            java.util.Map r0 = r3.zzz     // Catch: java.lang.Throwable -> La
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La
        L2f:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> La
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> La
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r2 != 0) goto L2f
            goto L8b
        L48:
            if (r7 != 0) goto L8d
            com.google.android.gms.internal.ads.zzbct r7 = com.google.android.gms.internal.ads.zzbdc.zzef     // Catch: java.lang.Throwable -> La
            com.google.android.gms.internal.ads.zzbda r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> La
            java.lang.Object r7 = r0.zzb(r7)     // Catch: java.lang.Throwable -> La
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> La
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> La
            if (r7 == 0) goto L8b
            if (r5 == 0) goto L8b
            java.util.Set r7 = r5.entrySet()     // Catch: java.lang.Throwable -> La
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> La
        L66:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> La
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> La
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch: java.lang.Throwable -> La
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> La
            android.view.View r0 = (android.view.View) r0     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            boolean r0 = zzY(r0)     // Catch: java.lang.Throwable -> La
            if (r0 == 0) goto L66
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L8b:
            monitor-exit(r3)
            return
        L8d:
            r3.zzae(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            r3.zzad(r4, r5, r6)     // Catch: java.lang.Throwable -> La
            monitor-exit(r3)
            return
        L95:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> La
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdih.zzB(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzC(com.google.android.gms.ads.internal.client.zzdj zzdjVar) {
        this.zzf.zzl(zzdjVar);
    }

    public final synchronized void zzD(View view, View view2, Map map, Map map2, boolean z10) {
        zzcfe zzcfeVarZzs;
        this.zzg.zzc(this.zzo);
        this.zzf.zzm(view, view2, map, map2, z10, zzab());
        if (this.zzs) {
            zzdim zzdimVar = this.zze;
            if (zzdimVar.zzs() != null && (zzcfeVarZzs = zzdimVar.zzs()) != null) {
                zzcfeVarZzs.zzd("onSdkAdUserInteractionClick", new C5308a());
            }
        }
    }

    public final synchronized void zzE(final View view, final int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzlM)).booleanValue()) {
            zzdkk zzdkkVar = this.zzo;
            if (zzdkkVar == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            } else {
                final boolean z10 = zzdkkVar instanceof zzdjg;
                this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdib
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdih.zzu(this.zza, view, z10, i);
                    }
                });
            }
        }
    }

    public final synchronized void zzF(String str) {
        this.zzf.zzn(str);
    }

    public final synchronized void zzG(Bundle bundle) {
        this.zzf.zzo(bundle);
    }

    public final synchronized void zzH() {
        zzdkk zzdkkVar = this.zzo;
        if (zzdkkVar == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z10 = zzdkkVar instanceof zzdjg;
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdid
                @Override // java.lang.Runnable
                public final void run() {
                    zzdih.zzs(this.zza, z10);
                }
            });
        }
    }

    public final void zzI(Bundle bundle) throws JSONException {
        final zzcfe zzcfeVarZzs = this.zze.zzs();
        if (zzcfeVarZzs == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Video webview is null");
            return;
        }
        try {
            final JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdia
                @Override // java.lang.Runnable
                public final void run() {
                    zzfyf zzfyfVar = zzdih.zzc;
                    zzcfeVarZzs.zze("onVideoEvent", jSONObject);
                }
            });
        } catch (JSONException e4) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Error reading event signals", e4);
        }
    }

    public final synchronized void zzJ() {
        if (this.zzq) {
            return;
        }
        this.zzf.zzu();
    }

    public final void zzK(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfB)).booleanValue()) {
            zzdim zzdimVar = this.zze;
            if (zzdimVar.zzc() != 3) {
                zzcai zzcaiVarZzp = zzdimVar.zzp();
                if (zzcaiVarZzp == null) {
                    return;
                }
                zzgdb.zzr(zzcaiVarZzp, new zzdig(this, view), this.zzd);
                return;
            }
        }
        zzaf(view, this.zze.zzu());
    }

    public final synchronized void zzL(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzv(view, motionEvent, view2);
    }

    public final synchronized void zzM(Bundle bundle) {
        this.zzf.zzw(bundle);
    }

    public final synchronized void zzN(View view) {
        this.zzf.zzx(view);
    }

    public final synchronized void zzO() {
        this.zzf.zzy();
    }

    public final synchronized void zzP(com.google.android.gms.ads.internal.client.zzdf zzdfVar) {
        this.zzf.zzz(zzdfVar);
    }

    public final synchronized void zzQ(com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        this.zzy.zza(zzdtVar);
    }

    public final synchronized void zzR(zzbie zzbieVar) {
        this.zzf.zzA(zzbieVar);
    }

    public final synchronized void zzS(final zzdkk zzdkkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhw
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzag(zzdkkVar);
                }
            });
        } else {
            zzag(zzdkkVar);
        }
    }

    public final synchronized void zzT(final zzdkk zzdkkVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzbS)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhx
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzah(zzdkkVar);
                }
            });
        } else {
            zzah(zzdkkVar);
        }
    }

    public final boolean zzU() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzV() {
        return this.zzf.zzD();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzE();
    }

    public final boolean zzX() {
        return this.zzh.zzd();
    }

    public final synchronized boolean zzZ(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zZzF = this.zzf.zzF(bundle);
        this.zzq = zZzF;
        return zZzF;
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdic
            @Override // java.lang.Runnable
            public final void run() {
                zzdih.zzv(this.zza);
            }
        });
        super.zzb();
    }

    public final zzdij zzc() {
        return this.zzx;
    }

    public final zzecz zzf(String str, boolean z10) {
        boolean z11;
        String str2;
        zzecv zzecvVar;
        zzecw zzecwVar;
        zzdir zzdirVar = this.zzh;
        if (zzdirVar.zzd() && !TextUtils.isEmpty(str)) {
            zzdim zzdimVar = this.zze;
            zzcfe zzcfeVarZzr = zzdimVar.zzr();
            zzcfe zzcfeVarZzs = zzdimVar.zzs();
            if (zzcfeVarZzr == null && zzcfeVarZzs == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdirVar.zza();
            int iZzc = zzdirVar.zza().zzc();
            int i10 = iZzc - 1;
            boolean z12 = false;
            if (i10 != 0) {
                if (i10 != 1) {
                    String strI = C1154e9.i("Unknown omid media type: ", iZzc != 1 ? iZzc != 2 ? "UNKNOWN" : "DISPLAY" : "VIDEO", ". Not initializing Omid.");
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj(strI);
                    return null;
                }
                if (zzcfeVarZzr == null) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
                z11 = false;
                z12 = true;
            } else if (zzcfeVarZzs != null) {
                z11 = true;
            } else {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Omid media type was video but there was no video webview.");
            }
            if (z12) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzcfeVarZzr = zzcfeVarZzs;
            }
            if (zzcfeVarZzr == null) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Webview is null in InternalNativeAd");
                return null;
            }
            if (!com.google.android.gms.ads.internal.zzv.zzC().zzl(this.zzw)) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to initialize omid in InternalNativeAd");
                return null;
            }
            VersionInfoParcel versionInfoParcel = this.zzv;
            String str3 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            if (z11) {
                zzecvVar = zzecv.VIDEO;
                zzecwVar = zzecw.DEFINED_BY_JAVASCRIPT;
            } else {
                zzecvVar = zzecv.NATIVE_DISPLAY;
                zzecwVar = zzdimVar.zzc() == 3 ? zzecw.UNSPECIFIED : zzecw.ONE_PIXEL;
            }
            zzecz zzeczVarZzb = com.google.android.gms.ads.internal.zzv.zzC().zzb(str3, zzcfeVarZzr.zzG(), "", "javascript", str2, str, zzecwVar, zzecvVar, this.zzb.zzal);
            if (zzeczVarZzb == null) {
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to create omid session in InternalNativeAd");
                return null;
            }
            zzdimVar.zzW(zzeczVarZzb);
            zzcfeVarZzr.zzat(zzeczVarZzb);
            if (z11) {
                zzfld zzfldVarZza = zzeczVarZzb.zza();
                if (zzcfeVarZzs != null) {
                    com.google.android.gms.ads.internal.zzv.zzC().zzj(zzfldVarZza, zzcfeVarZzs.zzF());
                }
                this.zzs = true;
            }
            if (z10) {
                com.google.android.gms.ads.internal.zzv.zzC().zzk(zzeczVarZzb.zza());
                zzcfeVarZzr.zzd("onSdkLoaded", new C5308a());
            }
            return zzeczVarZzb;
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzab());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzg(view, map, map2, zzab());
    }

    @Override // com.google.android.gms.internal.ads.zzcqv
    public final void zzk() {
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhy
            @Override // java.lang.Runnable
            public final void run() {
                zzdih.zzt(this.zza);
            }
        };
        Executor executor = this.zzd;
        executor.execute(runnable);
        if (this.zze.zzc() != 7) {
            final zzdiu zzdiuVar = this.zzf;
            Objects.requireNonNull(zzdiuVar);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdhz
                @Override // java.lang.Runnable
                public final void run() {
                    zzdiuVar.zzs();
                }
            });
        }
        super.zzk();
    }

    public final void zzz(View view) {
        zzecz zzeczVarZzu = this.zze.zzu();
        if (!this.zzh.zzd() || zzeczVarZzu == null || view == null) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzC().zzg(zzeczVarZzu.zza(), view);
    }
}
