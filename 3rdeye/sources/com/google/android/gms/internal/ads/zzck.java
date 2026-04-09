package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzck {
    private final zzfyf zza;
    private final List zzb = new ArrayList();
    private ByteBuffer[] zzc = new ByteBuffer[0];
    private boolean zzd;

    public zzck(zzfyf zzfyfVar) {
        this.zza = zzfyfVar;
        zzcl zzclVar = zzcl.zza;
        this.zzd = false;
    }

    private final int zzi() {
        return this.zzc.length - 1;
    }

    private final void zzj(ByteBuffer byteBuffer) {
        boolean z10;
        do {
            int i = 0;
            z10 = false;
            while (i <= zzi()) {
                if (!this.zzc[i].hasRemaining()) {
                    List list = this.zzb;
                    zzcn zzcnVar = (zzcn) list.get(i);
                    if (!zzcnVar.zzh()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.zzc[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : zzcn.zza;
                        long jRemaining = byteBuffer2.remaining();
                        zzcnVar.zze(byteBuffer2);
                        this.zzc[i] = zzcnVar.zzb();
                        boolean z11 = true;
                        if (jRemaining - byteBuffer2.remaining() <= 0 && !this.zzc[i].hasRemaining()) {
                            z11 = false;
                        }
                        z10 |= z11;
                    } else if (!this.zzc[i].hasRemaining() && i < zzi()) {
                        ((zzcn) list.get(i + 1)).zzd();
                    }
                }
                i++;
            }
        } while (z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzfyf zzfyfVar = this.zza;
        int size = zzfyfVar.size();
        zzfyf zzfyfVar2 = ((zzck) obj).zza;
        if (size != zzfyfVar2.size()) {
            return false;
        }
        for (int i = 0; i < zzfyfVar.size(); i++) {
            if (zzfyfVar.get(i) != zzfyfVar2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final zzcl zza(zzcl zzclVar) throws zzcm {
        if (zzclVar.equals(zzcl.zza)) {
            throw new zzcm("Unhandled input format:", zzclVar);
        }
        int i = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                return zzclVar;
            }
            zzcn zzcnVar = (zzcn) zzfyfVar.get(i);
            zzcl zzclVarZza = zzcnVar.zza(zzclVar);
            if (zzcnVar.zzg()) {
                zzdd.zzf(!zzclVarZza.equals(r0));
                zzclVar = zzclVarZza;
            }
            i++;
        }
    }

    public final ByteBuffer zzb() {
        if (!zzh()) {
            return zzcn.zza;
        }
        ByteBuffer byteBuffer = this.zzc[zzi()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        zzj(zzcn.zza);
        return this.zzc[zzi()];
    }

    public final void zzc() {
        List list = this.zzb;
        list.clear();
        this.zzd = false;
        int i = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                break;
            }
            zzcn zzcnVar = (zzcn) zzfyfVar.get(i);
            zzcnVar.zzc();
            if (zzcnVar.zzg()) {
                list.add(zzcnVar);
            }
            i++;
        }
        this.zzc = new ByteBuffer[list.size()];
        for (int i10 = 0; i10 <= zzi(); i10++) {
            this.zzc[i10] = ((zzcn) list.get(i10)).zzb();
        }
    }

    public final void zzd() {
        if (!zzh() || this.zzd) {
            return;
        }
        this.zzd = true;
        ((zzcn) this.zzb.get(0)).zzd();
    }

    public final void zze(ByteBuffer byteBuffer) {
        if (!zzh() || this.zzd) {
            return;
        }
        zzj(byteBuffer);
    }

    public final void zzf() {
        int i = 0;
        while (true) {
            zzfyf zzfyfVar = this.zza;
            if (i >= zzfyfVar.size()) {
                this.zzc = new ByteBuffer[0];
                zzcl zzclVar = zzcl.zza;
                this.zzd = false;
                return;
            } else {
                zzcn zzcnVar = (zzcn) zzfyfVar.get(i);
                zzcnVar.zzc();
                zzcnVar.zzf();
                i++;
            }
        }
    }

    public final boolean zzg() {
        return this.zzd && ((zzcn) this.zzb.get(zzi())).zzh() && !this.zzc[zzi()].hasRemaining();
    }

    public final boolean zzh() {
        return !this.zzb.isEmpty();
    }
}
