package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzpj {
    static final zzfyi zzb;
    private final SparseArray zzd = new SparseArray();
    private final int zze;
    public static final zzpj zza = new zzpj(zzfyf.zzo(zzpi.zza));

    @SuppressLint({"InlinedApi"})
    private static final zzfyf zzc = zzfyf.zzq(2, 5, 6);

    static {
        zzfyh zzfyhVar = new zzfyh();
        zzfyhVar.zza(5, 6);
        zzfyhVar.zza(17, 6);
        zzfyhVar.zza(7, 6);
        zzfyhVar.zza(30, 10);
        zzfyhVar.zza(18, 6);
        zzfyhVar.zza(6, 8);
        zzfyhVar.zza(8, 8);
        zzfyhVar.zza(14, 8);
        zzb = zzfyhVar.zzc();
    }

    private zzpj(List list) {
        for (int i = 0; i < list.size(); i++) {
            zzpi zzpiVar = (zzpi) list.get(i);
            this.zzd.put(zzpiVar.zzb, zzpiVar);
        }
        int iMax = 0;
        for (int i10 = 0; i10 < this.zzd.size(); i10++) {
            iMax = Math.max(iMax, ((zzpi) this.zzd.valueAt(i10)).zzc);
        }
        this.zze = iMax;
    }

    public static Uri zza() {
        if (zzf()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public static zzpj zzc(Context context, zze zzeVar, zzpp zzppVar) {
        return zzd(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), zzeVar, zzppVar);
    }

    @SuppressLint({"InlinedApi"})
    public static zzpj zzd(Context context, Intent intent, zze zzeVar, zzpp zzppVar) {
        AudioManager audioManagerZzc = zzcj.zzc(context);
        if (zzppVar == null) {
            zzpp zzppVar2 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                try {
                    List audioDevicesForAttributes = audioManagerZzc.getAudioDevicesForAttributes(zzeVar.zza().zza);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        zzppVar2 = new zzpp((AudioDeviceInfo) audioDevicesForAttributes.get(0));
                    }
                } catch (RuntimeException unused) {
                }
            }
            zzppVar = zzppVar2;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (zzex.zzN(context) || zzex.zzJ(context))) {
            List directProfilesForAttributes = audioManagerZzc.getDirectProfilesForAttributes(zzeVar.zza().zza);
            HashMap map = new HashMap();
            map.put(2, new HashSet(zzgbi.zzh(12)));
            for (int i10 = 0; i10 < directProfilesForAttributes.size(); i10++) {
                AudioProfile audioProfileB = I0.e.b(directProfilesForAttributes.get(i10));
                if (audioProfileB.getEncapsulationType() != 1) {
                    int format = audioProfileB.getFormat();
                    if (zzex.zzK(format) || zzb.containsKey(Integer.valueOf(format))) {
                        Integer numValueOf = Integer.valueOf(format);
                        if (map.containsKey(numValueOf)) {
                            Set set = (Set) map.get(numValueOf);
                            set.getClass();
                            set.addAll(zzgbi.zzh(audioProfileB.getChannelMasks()));
                        } else {
                            map.put(numValueOf, new HashSet(zzgbi.zzh(audioProfileB.getChannelMasks())));
                        }
                    }
                }
            }
            int i11 = zzfyf.zzd;
            zzfyc zzfycVar = new zzfyc();
            for (Map.Entry entry : map.entrySet()) {
                zzfycVar.zzf(new zzpi(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new zzpj(zzfycVar.zzi());
        }
        AudioDeviceInfo[] devices = zzppVar == null ? audioManagerZzc.getDevices(2) : new AudioDeviceInfo[]{zzppVar.zza};
        zzfyj zzfyjVar = new zzfyj();
        zzfyjVar.zzg(8, 7);
        if (i >= 31) {
            zzfyjVar.zzg(26, 27);
        }
        if (i >= 33) {
            zzfyjVar.zzf((Object) 30);
        }
        zzfyk zzfykVarZzi = zzfyjVar.zzi();
        for (AudioDeviceInfo audioDeviceInfo : devices) {
            if (zzfykVarZzi.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                return zza;
            }
        }
        zzfyj zzfyjVar2 = new zzfyj();
        zzfyjVar2.zzf((Object) 2);
        if (Build.VERSION.SDK_INT >= 29 && (zzex.zzN(context) || zzex.zzJ(context))) {
            int i12 = zzfyf.zzd;
            zzfyc zzfycVar2 = new zzfyc();
            zzgal it = zzb.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= zzex.zzh(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), zzeVar.zza().zza)) {
                    zzfycVar2.zzf(num);
                }
            }
            zzfycVar2.zzf((Object) 2);
            zzfyjVar2.zzh(zzfycVar2.zzi());
            return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z10 || zzf()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            zzfyjVar2.zzh(zzc);
        }
        if (intent == null || z10 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            zzfyjVar2.zzh(zzgbi.zzh(intArrayExtra));
        }
        return new zzpj(zze(zzgbi.zzi(zzfyjVar2.zzi()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    private static zzfyf zze(int[] iArr, int i) {
        int i10 = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        for (int i11 : iArr) {
            zzfycVar.zzf(new zzpi(i11, i));
        }
        return zzfycVar.zzi();
    }

    private static boolean zzf() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzpj) {
                zzpj zzpjVar = (zzpj) obj;
                SparseArray sparseArray = this.zzd;
                SparseArray sparseArray2 = zzpjVar.zzd;
                String str = zzex.zza;
                if (Build.VERSION.SDK_INT < 31) {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        for (int i = 0; i < size; i++) {
                            if (!Objects.equals(sparseArray.valueAt(i), sparseArray2.get(sparseArray.keyAt(i)))) {
                                break;
                            }
                        }
                        if (this.zze != zzpjVar.zze) {
                            break;
                        }
                    }
                } else if (sparseArray.contentEquals(sparseArray2)) {
                    if (this.zze != zzpjVar.zze) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        String str = zzex.zza;
        int i = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.zzd;
        if (i >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i10)) + ((sparseArray.keyAt(i10) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.zze;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.zze + ", audioProfiles=" + this.zzd.toString() + "]";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[PHI: r1
  0x003a: PHI (r1v3 int) = (r1v2 int), (r1v7 int) binds: [B:11:0x002c, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair zzb(com.google.android.gms.internal.ads.zzz r10, com.google.android.gms.internal.ads.zze r11) {
        /*
            r9 = this;
            java.lang.String r0 = r10.zzo
            r0.getClass()
            java.lang.String r1 = r10.zzk
            int r1 = com.google.android.gms.internal.ads.zzay.zza(r0, r1)
            com.google.android.gms.internal.ads.zzfyi r2 = com.google.android.gms.internal.ads.zzpj.zzb
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L19
            goto Lbf
        L19:
            r2 = 7
            r3 = 8
            r4 = 6
            r5 = 18
            if (r1 != r5) goto L2c
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r5)
            if (r1 != 0) goto L2b
            r1 = r4
            goto L47
        L2b:
            r1 = r5
        L2c:
            if (r1 != r3) goto L3a
            android.util.SparseArray r1 = r9.zzd
            boolean r1 = com.google.android.gms.internal.ads.zzex.zzH(r1, r3)
            if (r1 == 0) goto L38
            r1 = r3
            goto L3a
        L38:
            r1 = r2
            goto L47
        L3a:
            r6 = 30
            if (r1 != r6) goto L47
            android.util.SparseArray r7 = r9.zzd
            boolean r6 = com.google.android.gms.internal.ads.zzex.zzH(r7, r6)
            if (r6 != 0) goto L47
            goto L38
        L47:
            android.util.SparseArray r6 = r9.zzd
            boolean r7 = com.google.android.gms.internal.ads.zzex.zzH(r6, r1)
            if (r7 == 0) goto Lbf
            java.lang.Object r6 = r6.get(r1)
            com.google.android.gms.internal.ads.zzpi r6 = (com.google.android.gms.internal.ads.zzpi) r6
            r6.getClass()
            int r7 = r10.zzG
            r8 = -1
            if (r7 == r8) goto L7a
            if (r1 != r5) goto L60
            goto L7a
        L60:
            java.lang.String r10 = "audio/vnd.dts.uhd;profile=p2"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L73
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 33
            if (r10 >= r11) goto L73
            r10 = 10
            if (r7 <= r10) goto L85
            goto Lbf
        L73:
            boolean r10 = r6.zzb(r7)
            if (r10 != 0) goto L85
            goto Lbf
        L7a:
            int r10 = r10.zzH
            if (r10 != r8) goto L81
            r10 = 48000(0xbb80, float:6.7262E-41)
        L81:
            int r7 = r6.zza(r10, r11)
        L85:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 28
            if (r10 > r11) goto L99
            if (r7 != r2) goto L8e
            goto L9a
        L8e:
            r11 = 3
            if (r7 == r11) goto L97
            r11 = 4
            if (r7 == r11) goto L97
            r11 = 5
            if (r7 != r11) goto L99
        L97:
            r3 = r4
            goto L9a
        L99:
            r3 = r7
        L9a:
            r11 = 26
            if (r10 > r11) goto Lac
            java.lang.String r10 = "fugu"
            java.lang.String r11 = android.os.Build.DEVICE
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lac
            r10 = 1
            if (r3 != r10) goto Lac
            r3 = 2
        Lac:
            int r10 = com.google.android.gms.internal.ads.zzex.zzi(r3)
            if (r10 == 0) goto Lbf
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r11, r10)
            return r10
        Lbf:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpj.zzb(com.google.android.gms.internal.ads.zzz, com.google.android.gms.internal.ads.zze):android.util.Pair");
    }
}
