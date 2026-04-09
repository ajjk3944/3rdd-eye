package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpv {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfpw zzc;
    private final zzfnz zzd;
    private final zzfnu zze;
    private zzfpk zzf;
    private final Object zzg = new Object();

    public zzfpv(Context context, zzfpw zzfpwVar, zzfnz zzfnzVar, zzfnu zzfnuVar, boolean z10) {
        this.zzb = context;
        this.zzc = zzfpwVar;
        this.zzd = zzfnzVar;
        this.zze = zzfnuVar;
    }

    private final synchronized Class zzd(zzfpl zzfplVar) throws zzfpu {
        try {
            String strZzk = zzfplVar.zza().zzk();
            HashMap map = zza;
            Class cls = (Class) map.get(strZzk);
            if (cls != null) {
                return cls;
            }
            try {
                if (!this.zze.zza(zzfplVar.zzc())) {
                    throw new zzfpu(2026, "VM did not pass signature verification");
                }
                try {
                    File fileZzb = zzfplVar.zzb();
                    if (!fileZzb.exists()) {
                        fileZzb.mkdirs();
                    }
                    Class<?> clsLoadClass = new DexClassLoader(zzfplVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                    map.put(strZzk, clsLoadClass);
                    return clsLoadClass;
                } catch (ClassNotFoundException e4) {
                    e = e4;
                    throw new zzfpu(2008, e);
                } catch (IllegalArgumentException e10) {
                    e = e10;
                    throw new zzfpu(2008, e);
                } catch (SecurityException e11) {
                    e = e11;
                    throw new zzfpu(2008, e);
                }
            } catch (GeneralSecurityException e12) {
                throw new zzfpu(2026, e12);
            }
        } finally {
        }
    }

    public final zzfoc zza() {
        zzfpk zzfpkVar;
        synchronized (this.zzg) {
            zzfpkVar = this.zzf;
        }
        return zzfpkVar;
    }

    public final zzfpl zzb() {
        synchronized (this.zzg) {
            try {
                zzfpk zzfpkVar = this.zzf;
                if (zzfpkVar == null) {
                    return null;
                }
                return zzfpkVar.zzf();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc(zzfpl zzfplVar) throws zzfpu {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfpk zzfpkVar = new zzfpk(zzd(zzfplVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfplVar.zze(), null, new Bundle(), 2), zzfplVar, this.zzc, this.zzd, false);
                if (!zzfpkVar.zzh()) {
                    throw new zzfpu(4000, "init failed");
                }
                int iZze = zzfpkVar.zze();
                if (iZze != 0) {
                    throw new zzfpu(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfpk zzfpkVar2 = this.zzf;
                    if (zzfpkVar2 != null) {
                        try {
                            zzfpkVar2.zzg();
                        } catch (zzfpu e4) {
                            this.zzd.zzc(e4.zza(), -1L, e4);
                        }
                        this.zzf = zzfpkVar;
                    } else {
                        this.zzf = zzfpkVar;
                    }
                }
                this.zzd.zzd(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e10) {
                throw new zzfpu(2004, e10);
            }
        } catch (zzfpu e11) {
            this.zzd.zzc(e11.zza(), System.currentTimeMillis() - jCurrentTimeMillis, e11);
            return false;
        } catch (Exception e12) {
            this.zzd.zzc(4010, System.currentTimeMillis() - jCurrentTimeMillis, e12);
            return false;
        }
    }
}
