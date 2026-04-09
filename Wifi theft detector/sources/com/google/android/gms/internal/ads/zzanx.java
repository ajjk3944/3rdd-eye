package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class zzanx implements zzamf {
    private final zzer zza = new zzer();
    private final zzano zzb = new zzano();

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) throws zzat {
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i11 + i10);
        zzerVar.zzh(i10);
        ArrayList arrayList = new ArrayList();
        try {
            int iZzg = zzerVar.zzg();
            Charset charset = StandardCharsets.UTF_8;
            String strZzN = zzerVar.zzN(charset);
            if (strZzN == null || !strZzN.startsWith("WEBVTT")) {
                zzerVar.zzh(iZzg);
                throw zzat.zzb("Expected WEBVTT. Got ".concat(String.valueOf(zzerVar.zzN(charset))), null);
            }
            while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                char c10 = 65535;
                int iZzg2 = 0;
                while (c10 == 65535) {
                    iZzg2 = zzerVar.zzg();
                    String strZzN2 = zzerVar.zzN(StandardCharsets.UTF_8);
                    c10 = strZzN2 == null ? (char) 0 : "STYLE".equals(strZzN2) ? (char) 2 : strZzN2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzerVar.zzh(iZzg2);
                if (c10 == 0) {
                    zzalz.zza(new zzaoa(arrayList2), zzameVar, zzdrVar);
                    return;
                }
                if (c10 == 1) {
                    while (!TextUtils.isEmpty(zzerVar.zzN(StandardCharsets.UTF_8))) {
                    }
                } else if (c10 != 2) {
                    zzanq zzanqVarZza = zzanw.zza(zzerVar, arrayList);
                    if (zzanqVarZza != null) {
                        arrayList2.add(zzanqVarZza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzerVar.zzN(StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzerVar));
                }
            }
        } catch (zzat e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
