package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.singular.sdk.internal.SingularParamsBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzalo {
    public final String zza;
    public final String zzb;
    public final boolean zzc;
    public final long zzd;
    public final long zze;
    public final zzalu zzf;
    public final String zzg;
    public final String zzh;
    public final zzalo zzi;
    private final String[] zzj;
    private final HashMap zzk;
    private final HashMap zzl;
    private List zzm;

    private zzalo(String str, String str2, long j4, long j10, zzalu zzaluVar, String[] strArr, String str3, String str4, zzalo zzaloVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzh = str4;
        this.zzf = zzaluVar;
        this.zzj = strArr;
        this.zzc = str2 != null;
        this.zzd = j4;
        this.zze = j10;
        str3.getClass();
        this.zzg = str3;
        this.zzi = zzaloVar;
        this.zzk = new HashMap();
        this.zzl = new HashMap();
    }

    public static zzalo zzb(String str, long j4, long j10, zzalu zzaluVar, String[] strArr, String str2, String str3, zzalo zzaloVar) {
        return new zzalo(str, null, j4, j10, zzaluVar, strArr, str2, str3, zzaloVar);
    }

    public static zzalo zzc(String str) {
        return new zzalo(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    private static SpannableStringBuilder zzi(String str, Map map) {
        if (!map.containsKey(str)) {
            zzcs zzcsVar = new zzcs();
            zzcsVar.zzl(new SpannableStringBuilder());
            map.put(str, zzcsVar);
        }
        CharSequence charSequenceZzr = ((zzcs) map.get(str)).zzr();
        charSequenceZzr.getClass();
        return (SpannableStringBuilder) charSequenceZzr;
    }

    private final void zzj(TreeSet treeSet, boolean z10) {
        String str = this.zza;
        boolean zEquals = SingularParamsBase.Constants.PLATFORM_KEY.equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z10 || zEquals || (zEquals2 && this.zzh != null)) {
            long j4 = this.zzd;
            if (j4 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j4));
            }
            long j10 = this.zze;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.zzm != null) {
            for (int i = 0; i < this.zzm.size(); i++) {
                zzalo zzaloVar = (zzalo) this.zzm.get(i);
                boolean z11 = true;
                if (!z10 && !zEquals) {
                    z11 = false;
                }
                zzaloVar.zzj(treeSet, z11);
            }
        }
    }

    private final void zzk(long j4, String str, List list) {
        String str2;
        String str3 = this.zzg;
        if (true != "".equals(str3)) {
            str = str3;
        }
        if (zzg(j4) && "div".equals(this.zza) && (str2 = this.zzh) != null) {
            list.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < zza(); i++) {
            zzd(i).zzk(j4, str, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzl(long r20, java.util.Map r22, java.util.Map r23, java.lang.String r24, java.util.Map r25) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalo.zzl(long, java.util.Map, java.util.Map, java.lang.String, java.util.Map):void");
    }

    private final void zzm(long j4, boolean z10, String str, Map map) {
        long j10;
        boolean z11;
        HashMap map2 = this.zzk;
        map2.clear();
        HashMap map3 = this.zzl;
        map3.clear();
        String str2 = this.zza;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.zzg;
        String str4 = true != "".equals(str3) ? str3 : str;
        if (this.zzc && z10) {
            SpannableStringBuilder spannableStringBuilderZzi = zzi(str4, map);
            String str5 = this.zzb;
            str5.getClass();
            spannableStringBuilderZzi.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z10) {
            zzi(str4, map).append('\n');
            return;
        }
        if (zzg(j4)) {
            for (Map.Entry entry : map.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequenceZzr = ((zzcs) entry.getValue()).zzr();
                charSequenceZzr.getClass();
                map2.put(str6, Integer.valueOf(charSequenceZzr.length()));
            }
            boolean zEquals = SingularParamsBase.Constants.PLATFORM_KEY.equals(str2);
            for (int i = 0; i < zza(); i++) {
                zzalo zzaloVarZzd = zzd(i);
                if (z10 || zEquals) {
                    j10 = j4;
                    z11 = true;
                } else {
                    j10 = j4;
                    z11 = false;
                }
                zzaloVarZzd.zzm(j10, z11, str4, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderZzi2 = zzi(str4, map);
                int length = spannableStringBuilderZzi2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderZzi2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderZzi2.charAt(length) != '\n') {
                    spannableStringBuilderZzi2.append('\n');
                }
            }
            for (Map.Entry entry2 : map.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequenceZzr2 = ((zzcs) entry2.getValue()).zzr();
                charSequenceZzr2.getClass();
                map3.put(str7, Integer.valueOf(charSequenceZzr2.length()));
            }
        }
    }

    public final int zza() {
        List list = this.zzm;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final zzalo zzd(int i) {
        List list = this.zzm;
        if (list != null) {
            return (zzalo) list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final List zze(long j4, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        String str = this.zzg;
        zzk(j4, str, arrayList);
        TreeMap treeMap = new TreeMap();
        zzm(j4, false, str, treeMap);
        zzl(j4, map, map2, str, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Pair pair = (Pair) arrayList.get(i);
            String str2 = (String) map3.get(pair.second);
            if (str2 != null) {
                byte[] bArrDecode = Base64.decode(str2, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                zzals zzalsVar = (zzals) map2.get(pair.first);
                zzalsVar.getClass();
                zzcs zzcsVar = new zzcs();
                zzcsVar.zzc(bitmapDecodeByteArray);
                zzcsVar.zzh(zzalsVar.zzb);
                zzcsVar.zzi(0);
                zzcsVar.zze(zzalsVar.zzc, 0);
                zzcsVar.zzf(zzalsVar.zze);
                zzcsVar.zzk(zzalsVar.zzf);
                zzcsVar.zzd(zzalsVar.zzg);
                zzcsVar.zzo(zzalsVar.zzj);
                arrayList2.add(zzcsVar.zzq());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            zzals zzalsVar2 = (zzals) map2.get(entry.getKey());
            zzalsVar2.getClass();
            zzcs zzcsVar2 = (zzcs) entry.getValue();
            CharSequence charSequenceZzr = zzcsVar2.zzr();
            charSequenceZzr.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceZzr;
            for (zzalm zzalmVar : (zzalm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), zzalm.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(zzalmVar), spannableStringBuilder.getSpanEnd(zzalmVar), (CharSequence) "");
            }
            int i10 = 0;
            while (i10 < spannableStringBuilder.length()) {
                int i11 = i10 + 1;
                if (spannableStringBuilder.charAt(i10) == ' ') {
                    int i12 = i11;
                    while (i12 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i12) == ' ') {
                        i12++;
                    }
                    int i13 = i12 - i11;
                    if (i13 > 0) {
                        spannableStringBuilder.delete(i10, i13 + i10);
                    }
                }
                i10 = i11;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            int i14 = 0;
            while (i14 < spannableStringBuilder.length() - 1) {
                int i15 = i14 + 1;
                if (spannableStringBuilder.charAt(i14) == '\n' && spannableStringBuilder.charAt(i15) == ' ') {
                    spannableStringBuilder.delete(i15, i14 + 2);
                }
                i14 = i15;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            int i16 = 0;
            while (i16 < spannableStringBuilder.length() - 1) {
                int i17 = i16 + 1;
                if (spannableStringBuilder.charAt(i16) == ' ' && spannableStringBuilder.charAt(i17) == '\n') {
                    spannableStringBuilder.delete(i16, i17);
                }
                i16 = i17;
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            zzcsVar2.zze(zzalsVar2.zzc, zzalsVar2.zzd);
            zzcsVar2.zzf(zzalsVar2.zze);
            zzcsVar2.zzh(zzalsVar2.zzb);
            zzcsVar2.zzk(zzalsVar2.zzf);
            zzcsVar2.zzn(zzalsVar2.zzi, zzalsVar2.zzh);
            zzcsVar2.zzo(zzalsVar2.zzj);
            arrayList2.add(zzcsVar2.zzq());
        }
        return arrayList2;
    }

    public final void zzf(zzalo zzaloVar) {
        if (this.zzm == null) {
            this.zzm = new ArrayList();
        }
        this.zzm.add(zzaloVar);
    }

    public final boolean zzg(long j4) {
        long j10 = this.zzd;
        if (j10 == -9223372036854775807L) {
            if (this.zze == -9223372036854775807L) {
                return true;
            }
            j10 = -9223372036854775807L;
        }
        if (j10 <= j4 && this.zze == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j4 >= this.zze) {
            return j10 <= j4 && j4 < this.zze;
        }
        return true;
    }

    public final long[] zzh() {
        TreeSet treeSet = new TreeSet();
        int i = 0;
        zzj(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
