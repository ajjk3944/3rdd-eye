package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzank(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.zzg = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        String strZzK;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i10 + i11);
        zzerVar.zzh(i10);
        int i21 = 1;
        int i22 = 0;
        int i23 = 2;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int iZzt = zzerVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzerVar.zzg();
            Charset charsetZzR = zzerVar.zzR();
            int iZzg2 = zzerVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzerVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i24 = this.zzc;
        zzb(spannableStringBuilder, i24, 0, 0, spannableStringBuilder.length(), 16711680);
        int i25 = i24;
        int i26 = this.zzd;
        zzc(spannableStringBuilder, i26, -1, 0, spannableStringBuilder.length(), 16711680);
        int i27 = i26;
        String str = this.zze;
        int length = spannableStringBuilder.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int iZzg3 = zzerVar.zzg();
            int iZzB = zzerVar.zzB();
            int iZzB2 = zzerVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i23 ? i21 : i22);
                int iZzt2 = zzerVar.zzt();
                int i28 = i22;
                while (i28 < iZzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i21 : i22);
                    int iZzt3 = zzerVar.zzt();
                    int iZzt4 = zzerVar.zzt();
                    zzerVar.zzk(i23);
                    int i29 = iZzt2;
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzk(i21);
                    int iZzB3 = zzerVar.zzB();
                    int i30 = i23;
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length2 = spannableStringBuilder.length();
                        i15 = i25;
                        i16 = i27;
                        StringBuilder sb = new StringBuilder(String.valueOf(iZzt4).length() + 44 + String.valueOf(length2).length() + 2);
                        sb.append("Truncating styl end (");
                        sb.append(iZzt4);
                        sb.append(") to cueText.length() (");
                        sb.append(length2);
                        sb.append(").");
                        zzee.zzc("Tx3gParser", sb.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        i15 = i25;
                        i16 = i27;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt3).length() + 36 + String.valueOf(iZzt4).length() + 2);
                        sb2.append("Ignoring styl with start (");
                        sb2.append(iZzt3);
                        sb2.append(") >= end (");
                        sb2.append(iZzt4);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                        i19 = i15;
                        i18 = i28;
                        i17 = i29;
                        i20 = i16;
                    } else {
                        i17 = i29;
                        i18 = i28;
                        int i31 = i15;
                        zzb(spannableStringBuilder, iZzs, i31, iZzt3, iZzt4, 0);
                        i19 = i31;
                        i20 = i16;
                        zzc(spannableStringBuilder, iZzB3, i20, iZzt3, iZzt4, 0);
                    }
                    i23 = i30;
                    iZzt2 = i17;
                    i25 = i19;
                    i27 = i20;
                    i21 = 1;
                    i28 = i18 + 1;
                    i22 = 0;
                }
                i12 = i25;
                i13 = i27;
                i14 = i23;
            } else {
                i12 = i25;
                int i32 = i23;
                i13 = i27;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i14 = i32;
                    zzgrc.zza(zzerVar.zzd() >= i14);
                    float fZzt = zzerVar.zzt();
                    int i33 = this.zzg;
                    String str2 = zzfj.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i33, 0.95f));
                } else {
                    i14 = i32;
                }
            }
            zzerVar.zzh(iZzg3 + iZzB);
            i25 = i12;
            i23 = i14;
            i27 = i13;
            i21 = 1;
            i22 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
