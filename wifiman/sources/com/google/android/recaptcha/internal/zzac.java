package com.google.android.recaptcha.internal;

import Ii.N;
import Yg.J;
import Yg.v;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
final class zzac extends l implements InterfaceC6839p {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzac(zzae zzaeVar, String str, InterfaceC5380e interfaceC5380e) {
        super(2, interfaceC5380e);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
        return new zzac(this.zzc, this.zzd, interfaceC5380e);
    }

    @Override // mh.InterfaceC6839p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((N) obj, (InterfaceC5380e) obj2)).invokeSuspend(J.f24997a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.google.android.recaptcha.internal.zzen] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        zzy zzyVar;
        Object objG = AbstractC5467b.g();
        zzen zzenVar = this.zzb;
        try {
        } catch (Exception e10) {
            zzenVar.zzb(new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage()));
            zzae zzaeVar = this.zzc;
            this.zza = zzaeVar;
            int i10 = 2;
            this.zzb = 2;
            if (e10 instanceof StandardIntegrityException) {
                int errorCode = ((StandardIntegrityException) e10).getErrorCode();
                if (errorCode == -100) {
                    i10 = 44;
                } else if (errorCode == -12) {
                    i10 = 39;
                } else if (errorCode == -3) {
                    i10 = 30;
                } else if (errorCode == -2) {
                    i10 = 29;
                } else if (errorCode != -1) {
                    switch (errorCode) {
                        case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                            i10 = 54;
                            break;
                        case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                            i10 = 53;
                            break;
                        case -17:
                            i10 = 52;
                            break;
                        case -16:
                            i10 = 43;
                            break;
                        case -15:
                            i10 = 42;
                            break;
                        case -14:
                            i10 = 41;
                            break;
                        default:
                            switch (errorCode) {
                                case -9:
                                    i10 = 36;
                                    break;
                                case -8:
                                    i10 = 35;
                                    break;
                                case -7:
                                    i10 = 34;
                                    break;
                                case -6:
                                    i10 = 33;
                                    break;
                                case -5:
                                    i10 = 32;
                                    break;
                            }
                    }
                } else {
                    i10 = 28;
                }
            } else {
                i10 = 45;
            }
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zzq(i10);
            zztdVarZzf.zzr(15);
            obj = zztdVarZzf.zzk();
            if (obj == objG) {
                return objG;
            }
            zzyVar = zzaeVar;
        }
        if (zzenVar == 0) {
            v.b(obj);
            zzen zzenVarZzb = zzz.zzb(this.zzc, this.zzd);
            zzae zzaeVar2 = this.zzc;
            zzan zzanVar = zzaeVar2.zzc;
            String str = zzaeVar2.zze;
            this.zza = zzenVarZzb;
            this.zzb = 1;
            obj = zzanVar.zzc(str, this);
            zzenVar = zzenVarZzb;
            if (obj == objG) {
                return objG;
            }
        } else {
            if (zzenVar != 1) {
                zzyVar = (zzy) this.zza;
                v.b(obj);
                int iZza = zzyVar.zza();
                zztd zztdVar = (zztd) ((zzte) obj).zzr();
                zztdVar.zzf(zzyVar.zza());
                return new zzw(iZza, (zzte) zztdVar.zzk());
            }
            zzen zzenVar2 = (zzen) this.zza;
            v.b(obj);
            zzenVar = zzenVar2;
        }
        zzenVar.zza();
        zzae zzaeVar3 = this.zzc;
        zztf zztfVarZzf = zzti.zzf();
        zztg zztgVarZzf = zzth.zzf();
        zztgVarZzf.zzw((String) obj);
        zztfVarZzf.zzf((zzth) zztgVarZzf.zzk());
        return zzz.zza(zzaeVar3, (zzti) zztfVarZzf.zzk());
    }
}
