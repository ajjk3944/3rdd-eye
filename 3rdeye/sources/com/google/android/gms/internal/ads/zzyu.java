package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzyu extends zzza implements zzmc {
    public static final /* synthetic */ int zzb = 0;
    private static final zzfzq zzc = zzfzq.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.zzxu
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            int i = zzyu.zzb;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });
    public final Context zza;
    private final Object zzd;
    private zzyi zze;
    private Thread zzf;
    private zzym zzg;
    private zze zzh;
    private final zzxq zzi;

    public zzyu(Context context) {
        zzxq zzxqVar = new zzxq();
        zzyi zzyiVar = zzyi.zzF;
        this.zzd = new Object();
        zzyt zzytVar = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzi = zzxqVar;
        if (zzyiVar != null) {
            this.zze = zzyiVar;
        } else {
            zzyh zzyhVar = new zzyh(zzyiVar, zzytVar);
            zzyhVar.zzw(zzyiVar);
            this.zze = new zzyi(zzyhVar);
        }
        this.zzh = zze.zza;
        if (this.zze.zzQ && context == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static /* bridge */ /* synthetic */ int zzb(int i, int i10) {
        if (i == 0 || i != i10) {
            return Integer.bitCount(i & i10);
        }
        return Integer.MAX_VALUE;
    }

    public static int zzc(zzz zzzVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzzVar.zzd)) {
            return 4;
        }
        String strZzh = zzh(str);
        String strZzh2 = zzh(zzzVar.zzd);
        if (strZzh2 == null || strZzh == null) {
            return (z10 && strZzh2 == null) ? 1 : 0;
        }
        if (strZzh2.startsWith(strZzh) || strZzh.startsWith(strZzh2)) {
            return 3;
        }
        String str2 = zzex.zza;
        return strZzh2.split("-", 2)[0].equals(strZzh.split("-", 2)[0]) ? 2 : 0;
    }

    public static String zzh(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ boolean zzm(zzyu zzyuVar, zzyi zzyiVar, zzz zzzVar) {
        zzym zzymVar;
        zzym zzymVar2;
        if (zzyiVar.zzQ) {
            int i = zzzVar.zzG;
            char c10 = 65535;
            if (i != -1 && i > 2) {
                String str = zzzVar.zzo;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c10 = 3;
                                break;
                            }
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c10 = 1;
                                break;
                            }
                            break;
                    }
                    if ((c10 == 0 || c10 == 1 || c10 == 2 || c10 == 3) && (Build.VERSION.SDK_INT < 32 || (zzymVar2 = zzyuVar.zzg) == null || !zzymVar2.zze())) {
                        return true;
                    }
                }
                return Build.VERSION.SDK_INT >= 32 && (zzymVar = zzyuVar.zzg) != null && zzymVar.zze() && zzymVar.zzc() && zzyuVar.zzg.zzd() && zzyuVar.zzg.zzb(zzyuVar.zzh, zzzVar);
            }
        }
        return true;
    }

    private static void zzt(zzxk zzxkVar, zzbr zzbrVar, Map map) {
        for (int i = 0; i < zzxkVar.zzb; i++) {
            if (((zzbn) zzbrVar.zzD.get(zzxkVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzu() {
        boolean z10;
        zzym zzymVar;
        synchronized (this.zzd) {
            try {
                z10 = false;
                if (this.zze.zzQ && Build.VERSION.SDK_INT >= 32 && (zzymVar = this.zzg) != null && zzymVar.zze()) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static final Pair zzv(int i, zzyz zzyzVar, int[][][] iArr, zzyo zzyoVar, Comparator comparator) {
        RandomAccess randomAccessZzo;
        zzyz zzyzVar2 = zzyzVar;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < 2) {
            if (i == zzyzVar2.zzc(i10)) {
                zzxk zzxkVarZzd = zzyzVar2.zzd(i10);
                for (int i11 = 0; i11 < zzxkVarZzd.zzb; i11++) {
                    zzbm zzbmVarZzb = zzxkVarZzd.zzb(i11);
                    List listZza = zzyoVar.zza(i10, zzbmVarZzb, iArr[i10][i11]);
                    int i12 = zzbmVarZzb.zza;
                    boolean[] zArr = new boolean[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        int i14 = i13 + 1;
                        zzyp zzypVar = (zzyp) listZza.get(i13);
                        int iZzb = zzypVar.zzb();
                        if (!zArr[i13] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzo = zzfyf.zzo(zzypVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzypVar);
                                for (int i15 = i14; i15 < i12; i15++) {
                                    zzyp zzypVar2 = (zzyp) listZza.get(i15);
                                    if (zzypVar2.zzb() == 2 && zzypVar.zzc(zzypVar2)) {
                                        arrayList2.add(zzypVar2);
                                        zArr[i15] = true;
                                    }
                                }
                                randomAccessZzo = arrayList2;
                            }
                            arrayList.add(randomAccessZzo);
                        }
                        i13 = i14;
                    }
                }
            }
            i10++;
            zzyzVar2 = zzyzVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i16 = 0; i16 < list.size(); i16++) {
            iArr2[i16] = ((zzyp) list.get(i16)).zzc;
        }
        zzyp zzypVar3 = (zzyp) list.get(0);
        return Pair.create(new zzyv(zzypVar3.zzb, iArr2, 0), Integer.valueOf(zzypVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzmc
    public final void zza(zzma zzmaVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzU;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzza
    public final Pair zzd(zzyz zzyzVar, int[][][] iArr, final int[] iArr2, zzvh zzvhVar, zzbl zzblVar) throws zzin {
        final zzyi zzyiVar;
        final boolean z10;
        final String str;
        final String languageTag;
        int i;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        int i10 = 1;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzyiVar = this.zze;
        }
        if (zzyiVar.zzQ && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzym(this.zza, this);
        }
        int i11 = 2;
        zzyv[] zzyvVarArr = new zzyv[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (zzyzVar.zzc(i13) == 2 && zzyzVar.zzd(i13).zzb > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairZzv = zzv(1, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxz
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i14, zzbm zzbmVar, int[] iArr3) {
                final zzyu zzyuVar = this.zza;
                final zzyi zzyiVar2 = zzyiVar;
                zzfvf zzfvfVar = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzyb
                    @Override // com.google.android.gms.internal.ads.zzfvf
                    public final boolean zza(Object obj) {
                        return zzyu.zzm(zzyuVar, zzyiVar2, (zzz) obj);
                    }
                };
                int i15 = iArr2[i14];
                int i16 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i17 = 0; i17 < zzbmVar.zza; i17++) {
                    zzfycVar.zzf(new zzye(i14, zzbmVar, i17, zzyiVar2, iArr3[i17], z10, zzfvfVar, i15));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzya
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((zzye) Collections.max((List) obj)).zza((zzye) Collections.max((List) obj2));
            }
        });
        if (pairZzv != null) {
            zzyvVarArr[((Integer) pairZzv.second).intValue()] = (zzyv) pairZzv.first;
        }
        if (pairZzv == null) {
            str = null;
        } else {
            Object obj = pairZzv.first;
            str = ((zzyv) obj).zza.zzb(((zzyv) obj).zzb[0]).zzd;
        }
        int i14 = zzyiVar.zzu.zzb;
        final Point pointZzw = (!zzyiVar.zzk || (context2 = this.zza) == null) ? null : zzex.zzw(context2);
        Pair pairZzv2 = zzv(2, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxx
            /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
            @Override // com.google.android.gms.internal.ads.zzyo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r19, com.google.android.gms.internal.ads.zzbm r20, int[] r21) {
                /*
                    Method dump skipped, instructions count: 221
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxx.zza(int, com.google.android.gms.internal.ads.zzbm, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxy
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                List list = (List) obj2;
                List list2 = (List) obj3;
                return zzfxu.zzj().zzc((zzys) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }), (zzys) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyq
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zzd((zzys) obj4, (zzys) obj5);
                    }
                }).zzb(list.size(), list2.size()).zzc((zzys) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }), (zzys) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.zzyr
                    @Override // java.util.Comparator
                    public final int compare(Object obj4, Object obj5) {
                        return zzys.zza((zzys) obj4, (zzys) obj5);
                    }
                }).zza();
            }
        });
        int i15 = 4;
        Pair pairZzv3 = pairZzv2 == null ? zzv(4, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzxv
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i16, zzbm zzbmVar, int[] iArr3) {
                int i17 = zzyu.zzb;
                int i18 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i19 = 0; i19 < zzbmVar.zza; i19++) {
                    zzfycVar.zzf(new zzyf(i16, zzbmVar, i19, zzyiVar, iArr3[i19]));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzxw
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyf) ((List) obj2).get(0)).compareTo((zzyf) ((List) obj3).get(0));
            }
        }) : null;
        if (pairZzv3 != null) {
            zzyvVarArr[((Integer) pairZzv3.second).intValue()] = (zzyv) pairZzv3.first;
        } else if (pairZzv2 != null) {
            zzyvVarArr[((Integer) pairZzv2.second).intValue()] = (zzyv) pairZzv2.first;
        }
        if (!zzyiVar.zzx || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzex.zza;
            languageTag = locale.toLanguageTag();
        }
        int i16 = 3;
        Pair pairZzv4 = zzv(3, zzyzVar, iArr, new zzyo() { // from class: com.google.android.gms.internal.ads.zzyc
            @Override // com.google.android.gms.internal.ads.zzyo
            public final List zza(int i17, zzbm zzbmVar, int[] iArr3) {
                int i18 = zzyu.zzb;
                int i19 = zzfyf.zzd;
                zzfyc zzfycVar = new zzfyc();
                for (int i20 = 0; i20 < zzbmVar.zza; i20++) {
                    zzfycVar.zzf(new zzyn(i17, zzbmVar, i20, zzyiVar, iArr3[i20], str, languageTag));
                }
                return zzfycVar.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.zzyd
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((zzyn) ((List) obj2).get(0)).zza((zzyn) ((List) obj3).get(0));
            }
        });
        if (pairZzv4 != null) {
            zzyvVarArr[((Integer) pairZzv4.second).intValue()] = (zzyv) pairZzv4.first;
        }
        int i17 = 0;
        while (i17 < i11) {
            int iZzc = zzyzVar.zzc(i17);
            if (iZzc == i11 || iZzc == i10 || iZzc == i16 || iZzc == i15) {
                i = i10;
            } else {
                zzxk zzxkVarZzd = zzyzVar.zzd(i17);
                int[][] iArr3 = iArr[i17];
                int i18 = i12;
                int i19 = i18;
                zzbm zzbmVar = null;
                zzyg zzygVar = null;
                while (i18 < zzxkVarZzd.zzb) {
                    zzbm zzbmVarZzb = zzxkVarZzd.zzb(i18);
                    int[] iArr4 = iArr3[i18];
                    zzyg zzygVar2 = zzygVar;
                    int i20 = i10;
                    for (int i21 = i12; i21 < zzbmVarZzb.zza; i21++) {
                        if (zzmb.zza(iArr4[i21], zzyiVar.zzR)) {
                            zzyg zzygVar3 = new zzyg(zzbmVarZzb.zzb(i21), iArr4[i21]);
                            if (zzygVar2 == null || zzygVar3.compareTo(zzygVar2) > 0) {
                                zzygVar2 = zzygVar3;
                                zzbmVar = zzbmVarZzb;
                                i19 = i21;
                            }
                        }
                    }
                    i18++;
                    i10 = i20;
                    i12 = 0;
                    zzygVar = zzygVar2;
                }
                i = i10;
                zzyvVarArr[i17] = zzbmVar == null ? null : new zzyv(zzbmVar, new int[]{i19}, 0);
            }
            i17++;
            i10 = i;
            i11 = 2;
            i12 = 0;
            i16 = 3;
            i15 = 4;
        }
        int i22 = i10;
        HashMap map = new HashMap();
        int i23 = 2;
        for (int i24 = 0; i24 < 2; i24++) {
            zzt(zzyzVar.zzd(i24), zzyiVar, map);
        }
        zzt(zzyzVar.zze(), zzyiVar, map);
        for (int i25 = 0; i25 < 2; i25++) {
            if (((zzbn) map.get(Integer.valueOf(zzyzVar.zzc(i25)))) != null) {
                throw null;
            }
        }
        int i26 = 0;
        while (i26 < i23) {
            zzxk zzxkVarZzd2 = zzyzVar.zzd(i26);
            if (zzyiVar.zzf(i26, zzxkVarZzd2)) {
                if (zzyiVar.zzd(i26, zzxkVarZzd2) != null) {
                    throw null;
                }
                zzyvVarArr[i26] = null;
            }
            i26++;
            i23 = 2;
        }
        int i27 = 0;
        while (i27 < i23) {
            int iZzc2 = zzyzVar.zzc(i27);
            if (zzyiVar.zze(i27) || zzyiVar.zzE.contains(Integer.valueOf(iZzc2))) {
                zzyvVarArr[i27] = null;
            }
            i27++;
            i23 = 2;
        }
        zzxq zzxqVar = this.zzi;
        zzzl zzzlVarZzq = zzq();
        zzfyf zzfyfVarZzd = zzxr.zzd(zzyvVarArr);
        int i28 = 2;
        zzyw[] zzywVarArr = new zzyw[2];
        int i29 = 0;
        while (i29 < i28) {
            zzyv zzyvVar = zzyvVarArr[i29];
            if (zzyvVar != null) {
                int[] iArr5 = zzyvVar.zzb;
                int length = iArr5.length;
                if (length != 0) {
                    zzywVarArr[i29] = length == i22 ? new zzyx(zzyvVar.zza, iArr5[0], 0, 0, null) : zzxqVar.zza(zzyvVar.zza, iArr5, 0, zzzlVarZzq, (zzfyf) zzfyfVarZzd.get(i29));
                } else {
                    i29++;
                    i28 = 2;
                    i22 = 1;
                }
            }
            i29++;
            i28 = 2;
            i22 = 1;
        }
        zzme[] zzmeVarArr = new zzme[i28];
        for (int i30 = 0; i30 < i28; i30++) {
            zzmeVarArr[i30] = (zzyiVar.zze(i30) || zzyiVar.zzE.contains(Integer.valueOf(zzyzVar.zzc(i30))) || (zzyzVar.zzc(i30) != -2 && zzywVarArr[i30] == null)) ? null : zzme.zza;
        }
        return Pair.create(zzmeVarArr, zzywVarArr);
    }

    public final zzyi zzf() {
        zzyi zzyiVar;
        synchronized (this.zzd) {
            zzyiVar = this.zze;
        }
        return zzyiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzj() {
        zzym zzymVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzdd.zzg(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzymVar = this.zzg) != null) {
            zzymVar.zza();
            this.zzg = null;
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final void zzk(zze zzeVar) {
        if (this.zzh.equals(zzeVar)) {
            return;
        }
        this.zzh = zzeVar;
        zzu();
    }

    public final void zzl(zzyh zzyhVar) {
        boolean zEquals;
        zzyi zzyiVar = new zzyi(zzyhVar);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzyiVar);
            this.zze = zzyiVar;
        }
        if (zEquals) {
            return;
        }
        if (zzyiVar.zzQ && this.zza == null) {
            zzea.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final boolean zzn() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzzd
    public final zzmc zze() {
        return this;
    }
}
