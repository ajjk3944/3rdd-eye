package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzado implements zzady {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    private static final zzadn zzc = new zzadn(new zzadm() { // from class: com.google.android.gms.internal.ads.zzadk
        @Override // com.google.android.gms.internal.ads.zzadm
        public final Constructor zza() {
            int i = zzado.zza;
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(zzadt.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });
    private static final zzadn zzd = new zzadn(new zzadm() { // from class: com.google.android.gms.internal.ads.zzadl
        @Override // com.google.android.gms.internal.ads.zzadm
        public final Constructor zza() {
            int i = zzado.zza;
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(zzadt.class).getConstructor(new Class[0]);
        }
    });
    private zzfyf zze;
    private final zzakp zzf = new zzakk();

    private final void zzb(int i, List list) {
        switch (i) {
            case 0:
                list.add(new zzamo());
                break;
            case 1:
                list.add(new zzamq());
                break;
            case 2:
                list.add(new zzams(0));
                break;
            case 3:
                list.add(new zzafg(0));
                break;
            case 4:
                zzadt zzadtVarZza = zzc.zza(0);
                if (zzadtVarZza == null) {
                    list.add(new zzafy(0));
                    break;
                } else {
                    list.add(zzadtVarZza);
                    break;
                }
            case 5:
                list.add(new zzaga());
                break;
            case 6:
                list.add(new zzahw(this.zzf, 0));
                break;
            case 7:
                list.add(new zzaic(0));
                break;
            case 8:
                zzakp zzakpVar = this.zzf;
                list.add(new zzajb(zzakpVar, 0, null, null, zzfyf.zzn(), null));
                list.add(new zzajh(zzakpVar, 0));
                break;
            case 9:
                list.add(new zzajx());
                break;
            case 10:
                list.add(new zzanx());
                break;
            case 11:
                if (this.zze == null) {
                    this.zze = zzfyf.zzn();
                }
                list.add(new zzaoh(1, 0, this.zzf, new zzeu(0L), new zzamu(0, this.zze), 112800));
                break;
            case 12:
                list.add(new zzaot());
                break;
            case 14:
                list.add(new zzagg(0));
                break;
            case 15:
                zzadt zzadtVarZza2 = zzd.zza(new Object[0]);
                if (zzadtVarZza2 != null) {
                    list.add(zzadtVarZza2);
                    break;
                }
                break;
            case 16:
                list.add(new zzafl(0, this.zzf));
                break;
            case 17:
                list.add(new zzaki());
                break;
            case 18:
                list.add(new zzaoy());
                break;
            case 19:
                list.add(new zzaft());
                break;
            case 20:
                list.add(new zzagf());
                break;
            case 21:
                list.add(new zzafs());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.zzady
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.google.android.gms.internal.ads.zzadt[] zza(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzado.zza(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.zzadt[]");
    }
}
