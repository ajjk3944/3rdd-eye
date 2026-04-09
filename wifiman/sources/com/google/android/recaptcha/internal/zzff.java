package com.google.android.recaptcha.internal;

import Ii.O;
import Yg.m;
import Yg.n;
import com.google.android.recaptcha.RecaptchaException;
import dh.InterfaceC5380e;
import kotlin.text.t;

/* loaded from: classes3.dex */
public final class zzff {
    private final m zza;
    private final m zzb;
    private final m zzc;

    public zzff() {
        int i10 = zzav.zza;
        this.zza = n.b(zzfc.zza);
        this.zzb = n.b(zzfd.zza);
        this.zzc = n.b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, InterfaceC5380e interfaceC5380e) throws Exception {
        String strZza;
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    strZza = zzffVar.zzf().zza(strZzM);
                } catch (Exception e10) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e10.getMessage()));
                }
                if (strZza != null) {
                    zzenVarZzf.zza();
                    strZzb = strZza;
                } else {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e11) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e11.getMessage()));
                    }
                } catch (zzbd e12) {
                    zzenVarZzf2.zzb(e12);
                    throw e12;
                }
            }
            return t.L(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb, false, 4, null);
        } catch (Exception e13) {
            if (e13 instanceof zzbd) {
                throw e13;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e13.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, InterfaceC5380e interfaceC5380e) throws RecaptchaException {
        return O.g(new zzfb(this, str, zztoVar, null), interfaceC5380e);
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, InterfaceC5380e interfaceC5380e) throws zzbd {
        return zze(this, zzscVar, zzekVar, interfaceC5380e);
    }
}
