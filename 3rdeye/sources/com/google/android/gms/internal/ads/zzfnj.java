package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfnj implements zzfmk {
    private static final zzfnj zza = new zzfnj();
    private static final Handler zzb = new Handler(Looper.getMainLooper());
    private static Handler zzc = null;
    private static final Runnable zzd = new zzfnf();
    private static final Runnable zze = new zzfng();
    private int zzg;
    private long zzm;
    private final List zzf = new ArrayList();
    private boolean zzh = false;
    private final List zzi = new ArrayList();
    private final zzfnc zzk = new zzfnc();
    private final zzfmm zzj = new zzfmm();
    private final zzfnd zzl = new zzfnd(new zzfnm());

    public static zzfnj zzd() {
        return zza;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzfnj zzfnjVar) throws JSONException {
        zzfnj zzfnjVar2;
        zzfnjVar.zzg = 0;
        zzfnjVar.zzi.clear();
        zzfnjVar.zzh = false;
        for (zzflh zzflhVar : zzflz.zza().zzb()) {
        }
        zzfnjVar.zzm = System.nanoTime();
        zzfnc zzfncVar = zzfnjVar.zzk;
        zzfncVar.zzi();
        long jNanoTime = System.nanoTime();
        zzfmm zzfmmVar = zzfnjVar.zzj;
        zzfml zzfmlVarZza = zzfmmVar.zza();
        if (zzfncVar.zze().size() > 0) {
            Iterator it = zzfncVar.zze().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONObject jSONObjectZza = zzfmlVarZza.zza(null);
                View viewZza = zzfncVar.zza(str);
                zzfml zzfmlVarZzb = zzfmmVar.zzb();
                String strZzc = zzfncVar.zzc(str);
                if (strZzc != null) {
                    JSONObject jSONObjectZza2 = zzfmlVarZzb.zza(viewZza);
                    zzfmv.zzb(jSONObjectZza2, str);
                    try {
                        jSONObjectZza2.put("notVisibleReason", strZzc);
                    } catch (JSONException e4) {
                        zzfmw.zza("Error with setting not visible reason", e4);
                    }
                    zzfmv.zzc(jSONObjectZza, jSONObjectZza2);
                }
                zzfmv.zzf(jSONObjectZza);
                HashSet hashSet = new HashSet();
                hashSet.add(str);
                zzfnjVar.zzl.zzc(jSONObjectZza, hashSet, jNanoTime);
            }
        }
        zzfnc zzfncVar2 = zzfnjVar.zzk;
        if (zzfncVar2.zzf().size() > 0) {
            JSONObject jSONObjectZza3 = zzfmlVarZza.zza(null);
            zzfnjVar2 = zzfnjVar;
            zzfnjVar2.zzk(null, zzfmlVarZza, jSONObjectZza3, 1, false);
            zzfmv.zzf(jSONObjectZza3);
            zzfnjVar2.zzl.zzd(jSONObjectZza3, zzfncVar2.zzf(), jNanoTime);
        } else {
            zzfnjVar2 = zzfnjVar;
            zzfnjVar2.zzl.zzb();
        }
        zzfncVar2.zzg();
        long jNanoTime2 = System.nanoTime() - zzfnjVar2.zzm;
        List<zzfni> list = zzfnjVar2.zzf;
        if (list.size() > 0) {
            for (zzfni zzfniVar : list) {
                TimeUnit.NANOSECONDS.toMillis(jNanoTime2);
                zzfniVar.zzb();
                if (zzfniVar instanceof zzfnh) {
                    ((zzfnh) zzfniVar).zza();
                }
            }
        }
        zzfmj.zza().zzc();
    }

    private final void zzk(View view, zzfml zzfmlVar, JSONObject jSONObject, int i, boolean z10) {
        zzfmlVar.zzb(view, jSONObject, this, i == 1, z10);
    }

    private static final void zzl() {
        Handler handler = zzc;
        if (handler != null) {
            handler.removeCallbacks(zze);
            zzc = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmk
    public final void zza(View view, zzfml zzfmlVar, JSONObject jSONObject, boolean z10) throws JSONException {
        zzfnc zzfncVar;
        int iZzl;
        boolean z11;
        zzfnj zzfnjVar;
        View view2;
        zzfml zzfmlVar2;
        boolean z12;
        if (zzfna.zza(view) != null || (iZzl = (zzfncVar = this.zzk).zzl(view)) == 3) {
            return;
        }
        JSONObject jSONObjectZza = zzfmlVar.zza(view);
        zzfmv.zzc(jSONObject, jSONObjectZza);
        String strZzd = zzfncVar.zzd(view);
        if (strZzd != null) {
            zzfmv.zzb(jSONObjectZza, strZzd);
            try {
                jSONObjectZza.put("hasWindowFocus", Boolean.valueOf(this.zzk.zzk(view)));
            } catch (JSONException e4) {
                zzfmw.zza("Error with setting has window focus", e4);
            }
            boolean zZzj = this.zzk.zzj(strZzd);
            Boolean boolValueOf = Boolean.valueOf(zZzj);
            if (zZzj) {
                try {
                    jSONObjectZza.put("isPipActive", boolValueOf);
                } catch (JSONException e10) {
                    zzfmw.zza("Error with setting is picture-in-picture active", e10);
                }
            }
            this.zzk.zzh();
            zzfnjVar = this;
        } else {
            zzfnb zzfnbVarZzb = zzfncVar.zzb(view);
            if (zzfnbVarZzb != null) {
                zzfmc zzfmcVarZza = zzfnbVarZzb.zza();
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayListZzb = zzfnbVarZzb.zzb();
                int size = arrayListZzb.size();
                for (int i = 0; i < size; i++) {
                    jSONArray.put((String) arrayListZzb.get(i));
                }
                try {
                    jSONObjectZza.put("isFriendlyObstructionFor", jSONArray);
                    jSONObjectZza.put("friendlyObstructionClass", zzfmcVarZza.zzd());
                    jSONObjectZza.put("friendlyObstructionPurpose", zzfmcVarZza.zza());
                    jSONObjectZza.put("friendlyObstructionReason", zzfmcVarZza.zzc());
                } catch (JSONException e11) {
                    zzfmw.zza("Error with setting friendly obstruction", e11);
                }
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10 || z11) {
                zzfnjVar = this;
                view2 = view;
                zzfmlVar2 = zzfmlVar;
                z12 = true;
            } else {
                view2 = view;
                zzfmlVar2 = zzfmlVar;
                z12 = false;
                zzfnjVar = this;
            }
            zzfnjVar.zzk(view2, zzfmlVar2, jSONObjectZza, iZzl, z12);
        }
        zzfnjVar.zzg++;
    }

    public final void zzh() {
        zzl();
    }

    public final void zzi() {
        if (zzc == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            zzc = handler;
            handler.post(zzd);
            zzc.postDelayed(zze, 200L);
        }
    }

    public final void zzj() {
        zzl();
        this.zzf.clear();
        zzb.post(new zzfne(this));
    }
}
