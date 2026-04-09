package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzuk implements zzwz {
    public final zzwz zza;
    final /* synthetic */ zzul zzb;
    private boolean zzc;

    public zzuk(zzul zzulVar, zzwz zzwzVar) {
        this.zzb = zzulVar;
        this.zza = zzwzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    @Override // com.google.android.gms.internal.ads.zzwz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzkv r12, com.google.android.gms.internal.ads.zzhs r13, int r14) {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzul r0 = r11.zzb
            boolean r1 = r0.zzq()
            r2 = -3
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r11.zzc
            r3 = 4
            r4 = -4
            if (r1 == 0) goto L14
            r13.zzc(r3)
            return r4
        L14:
            long r5 = r0.zzb()
            com.google.android.gms.internal.ads.zzwz r1 = r11.zza
            int r14 = r1.zza(r12, r13, r14)
            r1 = -5
            r7 = -9223372036854775808
            if (r14 != r1) goto L4c
            com.google.android.gms.internal.ads.zzz r13 = r12.zza
            r13.getClass()
            int r14 = r13.zzJ
            r2 = 0
            if (r14 != 0) goto L32
            int r14 = r13.zzK
            if (r14 == 0) goto L4b
            r14 = r2
        L32:
            long r3 = r0.zzb
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L39
            goto L3b
        L39:
            int r2 = r13.zzK
        L3b:
            com.google.android.gms.internal.ads.zzx r13 = r13.zzb()
            r13.zzM(r14)
            r13.zzN(r2)
            com.google.android.gms.internal.ads.zzz r13 = r13.zzan()
            r12.zza = r13
        L4b:
            return r1
        L4c:
            long r0 = r0.zzb
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L6e
            if (r14 != r4) goto L5a
            long r9 = r13.zze
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 >= 0) goto L64
        L5a:
            if (r14 != r2) goto L6e
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 != 0) goto L6e
            boolean r12 = r13.zzd
            if (r12 != 0) goto L6e
        L64:
            r13.zzb()
            r13.zzc(r3)
            r12 = 1
            r11.zzc = r12
            return r4
        L6e:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuk.zza(com.google.android.gms.internal.ads.zzkv, com.google.android.gms.internal.ads.zzhs, int):int");
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final int zzb(long j4) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j4);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzwz
    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
