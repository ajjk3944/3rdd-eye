package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.vungle.ads.internal.presenter.g;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfpk implements zzfoc {
    private final Object zza;
    private final zzfpl zzb;
    private final zzfpw zzc;
    private final zzfnz zzd;

    public zzfpk(Object obj, zzfpl zzfplVar, zzfpw zzfpwVar, zzfnz zzfnzVar, boolean z10) {
        this.zza = obj;
        this.zzb = zzfplVar;
        this.zzc = zzfpwVar;
        this.zzd = zzfnzVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaue zzaueVarZza = zzauf.zza();
        zzaueVarZza.zzc(5);
        zzaueVarZza.zza(zzgxn.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzauf) zzaueVarZza.zzbr()).zzaV(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (Exception e4) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e4);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfoc
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfpu {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", Map.class).invoke(obj, map);
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e4) {
            throw new zzfpu(2005, e4);
        }
    }

    public final synchronized int zze() throws zzfpu {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e4) {
            throw new zzfpu(2006, e4);
        }
        return ((Integer) obj.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(obj, new Object[0])).intValue();
    }

    public final zzfpl zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfpu {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object obj = this.zza;
            obj.getClass().getDeclaredMethod(g.CLOSE, new Class[0]).invoke(obj, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e4) {
            throw new zzfpu(2003, e4);
        }
    }

    public final synchronized boolean zzh() throws zzfpu {
        Object obj;
        try {
            obj = this.zza;
        } catch (Exception e4) {
            throw new zzfpu(2001, e4);
        }
        return ((Boolean) obj.getClass().getDeclaredMethod("init", new Class[0]).invoke(obj, new Object[0])).booleanValue();
    }
}
