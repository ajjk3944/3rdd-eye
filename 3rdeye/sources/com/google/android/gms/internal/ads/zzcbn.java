package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.work.s;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.vungle.ads.internal.presenter.g;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzcbn extends FrameLayout implements zzcbe {
    final zzccb zza;
    private final zzcbz zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdr zze;
    private final long zzf;
    private final zzcbf zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbn(Context context, zzcbz zzcbzVar, int i, boolean z10, zzbdr zzbdrVar, zzcby zzcbyVar, zzdsc zzdscVar) {
        zzcbf zzcbdVar;
        zzbdr zzbdrVar2;
        zzcbf zzcetVar;
        super(context);
        this.zzb = zzcbzVar;
        this.zze = zzbdrVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbzVar.zzj());
        zzcbg zzcbgVar = zzcbzVar.zzj().zza;
        zzcca zzccaVar = new zzcca(context, zzcbzVar.zzm(), zzcbzVar.zzs(), zzbdrVar, zzcbzVar.zzk());
        if (i == 3) {
            zzcetVar = new zzcet(context, zzccaVar);
            zzbdrVar2 = zzbdrVar;
        } else {
            if (i == 2) {
                zzcbdVar = new zzccr(context, zzccaVar, zzcbzVar, z10, zzcbg.zza(zzcbzVar), zzcbyVar, zzdscVar);
                zzbdrVar2 = zzbdrVar;
            } else {
                zzbdrVar2 = zzbdrVar;
                zzcbdVar = new zzcbd(context, zzcbzVar, z10, zzcbg.zza(zzcbzVar), zzcbyVar, new zzcca(context, zzcbzVar.zzm(), zzcbzVar.zzs(), zzbdrVar, zzcbzVar.zzk()), zzdscVar);
            }
            zzcetVar = zzcbdVar;
        }
        this.zzg = zzcetVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcetVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzV)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzS)).booleanValue()) {
            zzp();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzX)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzU)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbdrVar2 != null) {
            zzbdrVar2.zzd("spinner_used", true != zBooleanValue ? CommonUrlParts.Values.FALSE_INTEGER : "1");
        }
        this.zza = new zzccb(this);
        zzcetVar.zzr(this);
    }

    private final void zzJ() {
        zzcbz zzcbzVar = this.zzb;
        if (zzcbzVar.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcbzVar.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbf zzcbfVar = this.zzg;
            if (zzcbfVar != null) {
                zzcad.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbfVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbe
    public final void onWindowVisibilityChanged(int i) {
        boolean z10;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbm(this, z10));
    }

    public final void zzA(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzV)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i10, int i11, int i12) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbI = s.i("Set video bounds to x:", i, ";y:", i10, ";w:");
            sbI.append(i11);
            sbI.append(";h:");
            sbI.append(i12);
            com.google.android.gms.ads.internal.util.zze.zza(sbI.toString());
        }
        if (i11 == 0 || i12 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
        layoutParams.setMargins(i, i10, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f10) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zze(f10);
        zzcbfVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            zzcbfVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zzd(false);
        zzcbfVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcc)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzb(String str, String str2) {
        zzK(g.ERROR, "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzc(String str, String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcc)).booleanValue()) {
            this.zza.zzb();
        }
        zzcbz zzcbzVar = this.zzb;
        if (zzcbzVar.zzi() != null && !this.zzi) {
            boolean z10 = (zzcbzVar.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                zzcbzVar.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzf() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null && this.zzm == 0) {
            zzK("canplaythrough", "duration", String.valueOf(zzcbfVar.zzc() / 1000.0f), "videoWidth", String.valueOf(zzcbfVar.zze()), "videoHeight", String.valueOf(zzcbfVar.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK("firstFrameRendered", new String[0]);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbl(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(int i, int i10) {
        if (this.zzk) {
            zzbct zzbctVar = zzbdc.zzW;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).intValue(), 1);
            int iMax2 = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbctVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbe
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        if (zzcbfVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbdr zzbdrVar = this.zze;
            if (zzbdrVar != null) {
                zzbdrVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    public final Integer zzl() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            return zzcbfVar.zzw();
        }
        return null;
    }

    public final void zzp() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbfVar.getContext());
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(zzcbfVar.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzq() {
        this.zza.zza();
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar != null) {
            zzcbfVar.zzt();
        }
        zzJ();
    }

    public final void zzr(Integer num) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            zzcbfVar.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzb.zzd(true);
        zzcbfVar.zzn();
    }

    public final void zzt() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        long jZza = zzcbfVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f10 = jZza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzca)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(zzcbfVar.zzh()), "qoeCachedBytes", String.valueOf(zzcbfVar.zzf()), "qoeLoadedBytes", String.valueOf(zzcbfVar.zzg()), "droppedFrames", String.valueOf(zzcbfVar.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f10));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzo();
    }

    public final void zzv() {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzp();
    }

    public final void zzw(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcbf zzcbfVar = this.zzg;
        if (zzcbfVar == null) {
            return;
        }
        zzcbfVar.zzy(i);
    }
}
