package com.google.android.gms.internal.ads;

import N7.G8;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzalw implements zzakr {
    private final zzen zza = new zzen();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzalw(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = "sans-serif";
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzex.zzC(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.zzg = i;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & KotlinVersion.MAX_COMPONENT_VALUE) << 24)), i11, i12, i13 | 33);
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            int i15 = i & 1;
            int i16 = i & 2;
            boolean z10 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                    z10 = false;
                }
            } else if (i16 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
            } else {
                z10 = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
            } else {
                if (i15 != 0 || z10) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i, int i10, zzakq zzakqVar, zzdn zzdnVar) {
        String strZzB;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzen zzenVar = this.zza;
        zzenVar.zzJ(bArr, i + i10);
        zzenVar.zzL(i);
        int i21 = 1;
        int i22 = 0;
        int i23 = 2;
        zzdd.zzd(zzenVar.zza() >= 2);
        int iZzq = zzenVar.zzq();
        if (iZzq == 0) {
            strZzB = "";
        } else {
            int iZzc = zzenVar.zzc();
            Charset charsetZzC = zzenVar.zzC();
            int iZzc2 = zzenVar.zzc() - iZzc;
            if (charsetZzC == null) {
                charsetZzC = StandardCharsets.UTF_8;
            }
            strZzB = zzenVar.zzB(iZzq - iZzc2, charsetZzC);
        }
        if (strZzB.isEmpty()) {
            zzdnVar.zza(new zzakj(zzfyf.zzn(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzB);
        int i24 = this.zzc;
        zzc(spannableStringBuilder, i24, 0, 0, spannableStringBuilder.length(), 16711680);
        int i25 = i24;
        int i26 = this.zzd;
        zzb(spannableStringBuilder, i26, -1, 0, spannableStringBuilder.length(), 16711680);
        int i27 = i26;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzenVar.zza() >= 8) {
            int iZzc3 = zzenVar.zzc();
            int iZzg = zzenVar.zzg();
            int iZzg2 = zzenVar.zzg();
            if (iZzg2 == 1937013100) {
                zzdd.zzd(zzenVar.zza() >= i23 ? i21 : i22);
                int iZzq2 = zzenVar.zzq();
                int i28 = i22;
                while (i28 < iZzq2) {
                    zzdd.zzd(zzenVar.zza() >= 12 ? i21 : i22);
                    int iZzq3 = zzenVar.zzq();
                    int iZzq4 = zzenVar.zzq();
                    zzenVar.zzM(i23);
                    int i29 = iZzq2;
                    int iZzm = zzenVar.zzm();
                    zzenVar.zzM(i21);
                    int iZzg3 = zzenVar.zzg();
                    int i30 = i21;
                    if (iZzq4 > spannableStringBuilder.length()) {
                        i15 = i25;
                        i16 = i27;
                        zzea.zzf("Tx3gParser", G8.r("Truncating styl end (", iZzq4, ") to cueText.length() (", spannableStringBuilder.length(), ")."));
                        iZzq4 = spannableStringBuilder.length();
                    } else {
                        i15 = i25;
                        i16 = i27;
                    }
                    if (iZzq3 >= iZzq4) {
                        zzea.zzf("Tx3gParser", G8.r("Ignoring styl with start (", iZzq3, ") >= end (", iZzq4, ")."));
                        i19 = i15;
                        i18 = i28;
                        i17 = i29;
                        i20 = i16;
                    } else {
                        i17 = i29;
                        i18 = i28;
                        int i31 = i15;
                        zzc(spannableStringBuilder, iZzm, i31, iZzq3, iZzq4, 0);
                        i19 = i31;
                        i20 = i16;
                        zzb(spannableStringBuilder, iZzg3, i20, iZzq3, iZzq4, 0);
                    }
                    iZzq2 = i17;
                    i25 = i19;
                    i27 = i20;
                    i23 = 2;
                    i21 = i30;
                    i28 = i18 + 1;
                    i22 = 0;
                }
                i11 = i21;
                i12 = i27;
                i13 = i25;
                i14 = i23;
            } else {
                i11 = i21;
                i12 = i27;
                i13 = i25;
                if (iZzg2 == 1952608120 && this.zzb) {
                    i14 = 2;
                    zzdd.zzd(zzenVar.zza() >= 2 ? i11 : 0);
                    float fZzq = zzenVar.zzq();
                    int i32 = this.zzg;
                    String str2 = zzex.zza;
                    fMax = Math.max(0.0f, Math.min(fZzq / i32, 0.95f));
                } else {
                    i14 = 2;
                }
            }
            zzenVar.zzL(iZzc3 + iZzg);
            i25 = i13;
            i23 = i14;
            i27 = i12;
            i22 = 0;
            i21 = i11;
        }
        zzcs zzcsVar = new zzcs();
        zzcsVar.zzl(spannableStringBuilder);
        zzcsVar.zze(fMax, 0);
        zzcsVar.zzf(0);
        zzdnVar.zza(new zzakj(zzfyf.zzo(zzcsVar.zzq()), -9223372036854775807L, -9223372036854775807L));
    }
}
