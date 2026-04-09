package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import com.singular.sdk.internal.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbch {

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    /* renamed from: com.google.android.gms.internal.ads.zzbch$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] zza;

        static {
            int[] iArr = new int[zzgyu.values().length];
            zza = iArr;
            try {
                iArr[zzgyu.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                zza[zzgyu.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                zza[zzgyu.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                zza[zzgyu.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                zza[zzgyu.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                zza[zzgyu.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                zza[zzgyu.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zza extends zzgyv<zza, zzb> implements zzf {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        public static final int zzk = 17;
        private static final zza zzl;
        private static volatile zzhao<zza> zzm;
        private zzx zzA;
        private zzz zzB;
        private int zzn;
        private int zzo;
        private zzg zzu;
        private zzi zzv;
        private zzk zzx;
        private zzah zzy;
        private zzac zzz;
        private int zzp = 1000;
        private zzgzh<zzd> zzw = zzgyv.zzbK();
        private zzgzh<zzat> zzC = zzgyv.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbch$zza$zza, reason: collision with other inner class name */
        public enum EnumC0333zza implements zzgyz {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10),
            REWARDED_INTERSTITIAL(11);

            public static final int zzm = 0;
            public static final int zzn = 1;
            public static final int zzo = 2;
            public static final int zzp = 3;
            public static final int zzq = 4;
            public static final int zzr = 5;
            public static final int zzs = 6;
            public static final int zzt = 7;
            public static final int zzu = 8;
            public static final int zzv = 9;
            public static final int zzw = 10;
            public static final int zzx = 11;
            private static final zzgza<EnumC0333zza> zzy = new zzgza<EnumC0333zza>() { // from class: com.google.android.gms.internal.ads.zzbch.zza.zza.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public EnumC0333zza zzb(int i) {
                    return EnumC0333zza.zzb(i);
                }
            };
            private final int zzA;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbch$zza$zza$zza, reason: collision with other inner class name */
            final class C0334zza implements zzgzb {
                static final zzgzb zza = new C0334zza();

                private C0334zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return EnumC0333zza.zzb(i) != null;
                }
            }

            EnumC0333zza(int i) {
                this.zzA = i;
            }

            public static EnumC0333zza zzb(int i) {
                switch (i) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    case 11:
                        return REWARDED_INTERSTITIAL;
                    default:
                        return null;
                }
            }

            public static zzgza<EnumC0333zza> zzd() {
                return zzy;
            }

            public static zzgzb zze() {
                return C0334zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzA);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzA;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zzb extends zzgyp<zza, zzb> implements zzf {
            public zzb zzA(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcu(zzacVar);
                return this;
            }

            public zzb zzB(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcv(zzgVar);
                return this;
            }

            public zzb zzC(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcw(zziVar);
                return this;
            }

            public zzb zzD(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcx(zzahVar);
                return this;
            }

            public zzb zzE(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcy(zzkVar);
                return this;
            }

            public zzb zzF(int i) {
                zzbu();
                ((zza) this.zza).zzcz(i);
                return this;
            }

            public zzb zzG(int i) {
                zzbu();
                ((zza) this.zza).zzcA(i);
                return this;
            }

            public zzb zzH(EnumC0333zza enumC0333zza) {
                zzbu();
                ((zza) this.zza).zzcB(enumC0333zza);
                return this;
            }

            public zzb zzI(zzx.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzaVar.zzbr());
                return this;
            }

            public zzb zzJ(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcC(zzxVar);
                return this;
            }

            public zzb zzK(zzq zzqVar) {
                zzbu();
                ((zza) this.zza).zzcD(zzqVar);
                return this;
            }

            public zzb zzL(zzz.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zzb zzM(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzcE(zzzVar);
                return this;
            }

            public zzb zzN(zzac.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zzb zzO(zzac zzacVar) {
                zzbu();
                ((zza) this.zza).zzcF(zzacVar);
                return this;
            }

            public zzb zzP(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzcG(i, zzbVar.zzbr());
                return this;
            }

            public zzb zzQ(int i, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzcG(i, zzdVar);
                return this;
            }

            public zzb zzR(zzg.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zzb zzS(zzg zzgVar) {
                zzbu();
                ((zza) this.zza).zzcH(zzgVar);
                return this;
            }

            public zzb zzT(zzi.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zzb zzU(zzi zziVar) {
                zzbu();
                ((zza) this.zza).zzcI(zziVar);
                return this;
            }

            public zzb zzV(zzah.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzW(zzah zzahVar) {
                zzbu();
                ((zza) this.zza).zzcJ(zzahVar);
                return this;
            }

            public zzb zzX(zzk.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzaVar.zzbr());
                return this;
            }

            public zzb zzY(zzk zzkVar) {
                zzbu();
                ((zza) this.zza).zzcK(zzkVar);
                return this;
            }

            public zzb zzZ(int i, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzcL(i, zzaVar.zzbr());
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public int zza() {
                return ((zza) this.zza).zza();
            }

            public zzb zzaa(int i, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzcL(i, zzatVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzd zzab(int i) {
                return ((zza) this.zza).zzab(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzg zzac() {
                return ((zza) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzi zzad() {
                return ((zza) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzk zzae() {
                return ((zza) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzq zzaf() {
                return ((zza) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzx zzag() {
                return ((zza) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzz zzah() {
                return ((zza) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzac zzai() {
                return ((zza) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzah zzaj() {
                return ((zza) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public zzat zzak(int i) {
                return ((zza) this.zza).zzak(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public List<zzd> zzal() {
                return Collections.unmodifiableList(((zza) this.zza).zzal());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public List<zzat> zzam() {
                return Collections.unmodifiableList(((zza) this.zza).zzam());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzan() {
                return ((zza) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzao() {
                return ((zza) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzap() {
                return ((zza) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzaq() {
                return ((zza) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzar() {
                return ((zza) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzas() {
                return ((zza) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzat() {
                return ((zza) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzau() {
                return ((zza) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public boolean zzav() {
                return ((zza) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public int zzb() {
                return ((zza) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzf
            public EnumC0333zza zzc() {
                return ((zza) this.zza).zzc();
            }

            public zzb zzd(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zza) this.zza).zzaF(iterable);
                return this;
            }

            public zzb zze(Iterable<? extends zzat> iterable) {
                zzbu();
                ((zza) this.zza).zzaG(iterable);
                return this;
            }

            public zzb zzf(zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzbVar.zzbr());
                return this;
            }

            public zzb zzg(zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaH(zzdVar);
                return this;
            }

            public zzb zzh(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zza) this.zza).zzaI(i, zzbVar.zzbr());
                return this;
            }

            public zzb zzi(int i, zzd zzdVar) {
                zzbu();
                ((zza) this.zza).zzaI(i, zzdVar);
                return this;
            }

            public zzb zzj(zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzaVar.zzbr());
                return this;
            }

            public zzb zzk(zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaJ(zzatVar);
                return this;
            }

            public zzb zzl(int i, zzat.zza zzaVar) {
                zzbu();
                ((zza) this.zza).zzaK(i, zzaVar.zzbr());
                return this;
            }

            public zzb zzm(int i, zzat zzatVar) {
                zzbu();
                ((zza) this.zza).zzaK(i, zzatVar);
                return this;
            }

            public zzb zzn() {
                zzbu();
                ((zza) this.zza).zzcf();
                return this;
            }

            public zzb zzo() {
                zzbu();
                ((zza) this.zza).zzcg();
                return this;
            }

            public zzb zzp() {
                zzbu();
                ((zza) this.zza).zzch();
                return this;
            }

            public zzb zzq() {
                zzbu();
                ((zza) this.zza).zzci();
                return this;
            }

            public zzb zzr() {
                zzbu();
                ((zza) this.zza).zzcj();
                return this;
            }

            public zzb zzs() {
                zzbu();
                ((zza) this.zza).zzck();
                return this;
            }

            public zzb zzt() {
                zzbu();
                ((zza) this.zza).zzcl();
                return this;
            }

            public zzb zzu() {
                zzbu();
                ((zza) this.zza).zzcm();
                return this;
            }

            public zzb zzv() {
                zzbu();
                ((zza) this.zza).zzcn();
                return this;
            }

            public zzb zzw() {
                zzbu();
                ((zza) this.zza).zzco();
                return this;
            }

            public zzb zzx() {
                zzbu();
                ((zza) this.zza).zzcp();
                return this;
            }

            public zzb zzy(zzx zzxVar) {
                zzbu();
                ((zza) this.zza).zzcs(zzxVar);
                return this;
            }

            public zzb zzz(zzz zzzVar) {
                zzbu();
                ((zza) this.zza).zzct(zzzVar);
                return this;
            }

            private zzb() {
                super(zza.zzl);
            }
        }

        static {
            zza zzaVar = new zza();
            zzl = zzaVar;
            zzgyv.zzbZ(zza.class, zzaVar);
        }

        private zza() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(Iterable<? extends zzd> iterable) {
            zzcq();
            zzgww.zzaQ(iterable, this.zzw);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(Iterable<? extends zzat> iterable) {
            zzcr();
            zzgww.zzaQ(iterable, this.zzC);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH(zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.add(i, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(int i) {
            zzcr();
            this.zzC.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(EnumC0333zza enumC0333zza) {
            this.zzo = enumC0333zza.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzx zzxVar) {
            zzxVar.getClass();
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzz zzzVar) {
            zzzVar.getClass();
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzac zzacVar) {
            zzacVar.getClass();
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzcq();
            this.zzw.set(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzg zzgVar) {
            zzgVar.getClass();
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzi zziVar) {
            zziVar.getClass();
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzah zzahVar) {
            zzahVar.getClass();
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(zzk zzkVar) {
            zzkVar.getClass();
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i, zzat zzatVar) {
            zzatVar.getClass();
            zzcr();
            this.zzC.set(i, zzatVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcf() {
            this.zzn &= -2;
            this.zzo = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzA = null;
            this.zzn &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzB = null;
            this.zzn &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzz = null;
            this.zzn &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzw = zzgyv.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzu = null;
            this.zzn &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzv = null;
            this.zzn &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzy = null;
            this.zzn &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzx = null;
            this.zzn &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzC = zzgyv.zzbK();
        }

        private void zzcq() {
            zzgzh<zzd> zzgzhVar = this.zzw;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzw = zzgyv.zzbL(zzgzhVar);
        }

        private void zzcr() {
            zzgzh<zzat> zzgzhVar = this.zzC;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzC = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzx zzxVar) {
            zzxVar.getClass();
            zzx zzxVar2 = this.zzA;
            if (zzxVar2 != null && zzxVar2 != zzx.zzh()) {
                zzx.zza zzaVarZzf = zzx.zzf(zzxVar2);
                zzaVarZzf.zzbj(zzxVar);
                zzxVar = zzaVarZzf.zzbs();
            }
            this.zzA = zzxVar;
            this.zzn |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzz zzzVar) {
            zzzVar.getClass();
            zzz zzzVar2 = this.zzB;
            if (zzzVar2 != null && zzzVar2 != zzz.zzh()) {
                zzz.zza zzaVarZzf = zzz.zzf(zzzVar2);
                zzaVarZzf.zzbj(zzzVar);
                zzzVar = zzaVarZzf.zzbs();
            }
            this.zzB = zzzVar;
            this.zzn |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzac zzacVar) {
            zzacVar.getClass();
            zzac zzacVar2 = this.zzz;
            if (zzacVar2 != null && zzacVar2 != zzac.zzf()) {
                zzac.zza zzaVarZzc = zzac.zzc(zzacVar2);
                zzaVarZzc.zzbj(zzacVar);
                zzacVar = zzaVarZzc.zzbs();
            }
            this.zzz = zzacVar;
            this.zzn |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzg zzgVar) {
            zzgVar.getClass();
            zzg zzgVar2 = this.zzu;
            if (zzgVar2 != null && zzgVar2 != zzg.zzh()) {
                zzg.zza zzaVarZzf = zzg.zzf(zzgVar2);
                zzaVarZzf.zzbj(zzgVar);
                zzgVar = zzaVarZzf.zzbs();
            }
            this.zzu = zzgVar;
            this.zzn |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzi zziVar) {
            zziVar.getClass();
            zzi zziVar2 = this.zzv;
            if (zziVar2 != null && zziVar2 != zzi.zzh()) {
                zzi.zza zzaVarZzf = zzi.zzf(zziVar2);
                zzaVarZzf.zzbj(zziVar);
                zziVar = zzaVarZzf.zzbs();
            }
            this.zzv = zziVar;
            this.zzn |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzah zzahVar) {
            zzahVar.getClass();
            zzah zzahVar2 = this.zzy;
            if (zzahVar2 != null && zzahVar2 != zzah.zzn()) {
                zzah.zza zzaVarZzl = zzah.zzl(zzahVar2);
                zzaVarZzl.zzbj(zzahVar);
                zzahVar = zzaVarZzl.zzbs();
            }
            this.zzy = zzahVar;
            this.zzn |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzk zzkVar) {
            zzkVar.getClass();
            zzk zzkVar2 = this.zzx;
            if (zzkVar2 != null && zzkVar2 != zzk.zzh()) {
                zzk.zza zzaVarZzf = zzk.zzf(zzkVar2);
                zzaVarZzf.zzbj(zzkVar);
                zzkVar = zzaVarZzf.zzbs();
            }
            this.zzx = zzkVar;
            this.zzn |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(int i) {
            zzcq();
            this.zzw.remove(i);
        }

        public static zzb zzd() {
            return (zzb) zzl.zzaZ();
        }

        public static zzb zzf(zza zzaVar) {
            return (zzb) zzl.zzba(zzaVar);
        }

        public static zza zzh() {
            return zzl;
        }

        public static zza zzi(InputStream inputStream) throws IOException {
            return (zza) zzgyv.zzbk(zzl, inputStream);
        }

        public static zza zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zza) zzgyv.zzbl(zzl, inputStream, zzgyfVar);
        }

        public static zza zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zza) zzgyv.zzbm(zzl, zzgxnVar);
        }

        public static zza zzl(zzgxt zzgxtVar) throws IOException {
            return (zza) zzgyv.zzbn(zzl, zzgxtVar);
        }

        public static zza zzm(InputStream inputStream) throws IOException {
            return (zza) zzgyv.zzbo(zzl, inputStream);
        }

        public static zza zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zza) zzgyv.zzbp(zzl, byteBuffer);
        }

        public static zza zzo(byte[] bArr) throws zzgzk {
            return (zza) zzgyv.zzbq(zzl, bArr);
        }

        public static zza zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zza) zzgyv.zzbr(zzl, zzgxnVar, zzgyfVar);
        }

        public static zza zzq(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zza) zzgyv.zzbs(zzl, zzgxtVar, zzgyfVar);
        }

        public static zza zzr(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zza) zzgyv.zzbu(zzl, inputStream, zzgyfVar);
        }

        public static zza zzs(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zza) zzgyv.zzbv(zzl, byteBuffer, zzgyfVar);
        }

        public static zza zzt(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zza) zzgyv.zzbx(zzl, bArr, zzgyfVar);
        }

        public static zzhao<zza> zzw() {
            return zzl.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public int zza() {
            return this.zzw.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzd zzab(int i) {
            return this.zzw.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzg zzac() {
            zzg zzgVar = this.zzu;
            return zzgVar == null ? zzg.zzh() : zzgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzi zzad() {
            zzi zziVar = this.zzv;
            return zziVar == null ? zzi.zzh() : zziVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzk zzae() {
            zzk zzkVar = this.zzx;
            return zzkVar == null ? zzk.zzh() : zzkVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzq zzaf() {
            zzq zzqVarZzb = zzq.zzb(this.zzp);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzx zzag() {
            zzx zzxVar = this.zzA;
            return zzxVar == null ? zzx.zzh() : zzxVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzz zzah() {
            zzz zzzVar = this.zzB;
            return zzzVar == null ? zzz.zzh() : zzzVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzac zzai() {
            zzac zzacVar = this.zzz;
            return zzacVar == null ? zzac.zzf() : zzacVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzah zzaj() {
            zzah zzahVar = this.zzy;
            return zzahVar == null ? zzah.zzn() : zzahVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public zzat zzak(int i) {
            return this.zzC.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public List<zzd> zzal() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public List<zzat> zzam() {
            return this.zzC;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzan() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzao() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzap() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzaq() {
            return (this.zzn & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzar() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzas() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzat() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzau() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public boolean zzav() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzf
        public EnumC0333zza zzc() {
            EnumC0333zza enumC0333zzaZzb = EnumC0333zza.zzb(this.zzo);
            return enumC0333zzaZzb == null ? EnumC0333zza.AD_INITIATER_UNSPECIFIED : enumC0333zzaZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", EnumC0333zza.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", zzd.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", zzat.class});
            }
            if (iOrdinal == 3) {
                return new zza();
            }
            if (iOrdinal == 4) {
                return new zzb();
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zza> zzhaoVar = zzm;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zza.class) {
                try {
                    zzgyqVar = zzm;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzl);
                        zzm = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        public zze zzu(int i) {
            return this.zzw.get(i);
        }

        public zzbi zzv(int i) {
            return this.zzC.get(i);
        }

        public List<? extends zze> zzx() {
            return this.zzw;
        }

        public List<? extends zzbi> zzy() {
            return this.zzC;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzaa extends zzhah {
        boolean zzA();

        boolean zzB();

        int zza();

        zzq zzb();

        zzv zzc();

        zzan zzw(int i);

        zzap zzx();

        List<zzan> zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzab extends zzgyv<zzab, zza> implements zzae {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzab zzc;
        private static volatile zzhao<zzab> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzab, zza> implements zzae {
            public zza zza() {
                zzbu();
                ((zzab) this.zza).zzz();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzab) this.zza).zzA();
                return this;
            }

            public zza zzc(zzb zzbVar) {
                zzbu();
                ((zzab) this.zza).zzB(zzbVar);
                return this;
            }

            public zza zzd(zzc zzcVar) {
                zzbu();
                ((zzab) this.zza).zzC(zzcVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzae
            public zzb zze() {
                return ((zzab) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzae
            public zzc zzf() {
                return ((zzab) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzae
            public boolean zzg() {
                return ((zzab) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzae
            public boolean zzh() {
                return ((zzab) this.zza).zzh();
            }

            private zza() {
                super(zzab.zzc);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzb implements zzgyz {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 4;
            private static final zzgza<zzb> zzi = new zzgza<zzb>() { // from class: com.google.android.gms.internal.ads.zzbch.zzab.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzk;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzb.zzb(i) != null;
                }
            }

            zzb(int i) {
                this.zzk = i;
            }

            public static zzb zzb(int i) {
                if (i == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return TWO_G;
                }
                if (i == 2) {
                    return THREE_G;
                }
                if (i != 4) {
                    return null;
                }
                return LTE;
            }

            public static zzgza<zzb> zzd() {
                return zzi;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzk);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzk;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzc implements zzgyz {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgza<zzc> zzg = new zzgza<zzc>() { // from class: com.google.android.gms.internal.ads.zzbch.zzab.zzc.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzc zzb(int i) {
                    return zzc.zzb(i);
                }
            };
            private final int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzc.zzb(i) != null;
                }
            }

            zzc(int i) {
                this.zzi = i;
            }

            public static zzc zzb(int i) {
                if (i == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return CELL;
                }
                if (i != 2) {
                    return null;
                }
                return WIFI;
            }

            public static zzgza<zzc> zzd() {
                return zzg;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzi);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzab zzabVar = new zzab();
            zzc = zzabVar;
            zzgyv.zzbZ(zzab.class, zzabVar);
        }

        private zzab() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB(zzb zzbVar) {
            this.zzg = zzbVar.zza();
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(zzc zzcVar) {
            this.zzf = zzcVar.zza();
            this.zze |= 1;
        }

        public static zza zza() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzb(zzab zzabVar) {
            return (zza) zzc.zzba(zzabVar);
        }

        public static zzab zzd() {
            return zzc;
        }

        public static zzab zzi(InputStream inputStream) throws IOException {
            return (zzab) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzab zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzab) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzab zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzab) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzab zzl(zzgxt zzgxtVar) throws IOException {
            return (zzab) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzab zzm(InputStream inputStream) throws IOException {
            return (zzab) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzab zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzab) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzab zzo(byte[] bArr) throws zzgzk {
            return (zzab) zzgyv.zzbq(zzc, bArr);
        }

        public static zzab zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzab) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzab zzq(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzab) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzab zzr(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzab) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzab zzs(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzab) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzab zzt(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzab) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzab> zzu() {
            return zzc.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzz() {
            this.zze &= -3;
            this.zzg = 0;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zzc.zze(), "zzg", zzb.zze()});
            }
            if (iOrdinal == 3) {
                return new zzab();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzab> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzab.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzae
        public zzb zze() {
            zzb zzbVarZzb = zzb.zzb(this.zzg);
            return zzbVarZzb == null ? zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED : zzbVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzae
        public zzc zzf() {
            zzc zzcVarZzb = zzc.zzb(this.zzf);
            return zzcVarZzb == null ? zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzae
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzae
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzac extends zzgyv<zzac, zza> implements zzad {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzac zzc;
        private static volatile zzhao<zzac> zzd;
        private int zze;
        private int zzf;
        private zzap zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzac, zza> implements zzad {
            @Override // com.google.android.gms.internal.ads.zzbch.zzad
            public zzq zza() {
                return ((zzac) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzac) this.zza).zzB();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzac) this.zza).zzC();
                return this;
            }

            public zza zzd(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzD(zzapVar);
                return this;
            }

            public zza zze(zzap.zza zzaVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzap zzapVar) {
                zzbu();
                ((zzac) this.zza).zzE(zzapVar);
                return this;
            }

            public zza zzg(zzq zzqVar) {
                zzbu();
                ((zzac) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzad
            public zzap zzh() {
                return ((zzac) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzad
            public boolean zzi() {
                return ((zzac) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzad
            public boolean zzj() {
                return ((zzac) this.zza).zzj();
            }

            private zza() {
                super(zzac.zzc);
            }
        }

        static {
            zzac zzacVar = new zzac();
            zzc = zzacVar;
            zzgyv.zzbZ(zzac.class, zzacVar);
        }

        private zzac() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzg;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzap zzapVar) {
            zzapVar.getClass();
            this.zzg = zzapVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzb() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzc(zzac zzacVar) {
            return (zza) zzc.zzba(zzacVar);
        }

        public static zzac zzf() {
            return zzc;
        }

        public static zzac zzg(InputStream inputStream) throws IOException {
            return (zzac) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzac zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzac) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzac zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzac) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzac zzm(zzgxt zzgxtVar) throws IOException {
            return (zzac) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzac zzn(InputStream inputStream) throws IOException {
            return (zzac) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzac zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzac) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzac zzp(byte[] bArr) throws zzgzk {
            return (zzac) zzgyv.zzbq(zzc, bArr);
        }

        public static zzac zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzac) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzac zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzac) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzac zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzac) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzac zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzac) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzac zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzac) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzac> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzad
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzf);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzac();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzac> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzac.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzad
        public zzap zzh() {
            zzap zzapVar = this.zzg;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzad
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzad
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzad extends zzhah {
        zzq zza();

        zzap zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzae extends zzhah {
        zzab.zzb zze();

        zzab.zzc zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzaf extends zzgyv<zzaf, zzc> implements zzag {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzaf zzi;
        private static volatile zzhao<zzaf> zzj;
        private int zzk;
        private int zzm;
        private int zzn;
        private long zzo;
        private long zzv;
        private int zzw;
        private zzgzh<zza> zzl = zzgyv.zzbK();
        private String zzp = "";
        private String zzu = "";

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyv<zza, C0335zza> implements zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            public static final int zzd = 4;
            public static final int zze = 5;
            public static final int zzf = 6;
            public static final int zzg = 7;
            public static final int zzh = 8;
            public static final int zzi = 9;
            public static final int zzj = 10;
            public static final int zzk = 11;
            public static final int zzl = 12;
            public static final int zzm = 13;
            private static final zzgze<zzd.zza> zzn = new zzgze<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbch.zzaf.zza.1
                @Override // com.google.android.gms.internal.ads.zzgze
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd.zza zzb(int i) {
                    zzd.zza zzaVarZzb = zzd.zza.zzb(i);
                    return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
                }
            };
            private static final zza zzo;
            private static volatile zzhao<zza> zzp;
            private zzab zzA;
            private int zzB;
            private int zzC;
            private int zzD;
            private int zzE;
            private int zzF;
            private int zzG;
            private long zzH;
            private int zzu;
            private long zzv;
            private int zzw;
            private long zzx;
            private long zzy;
            private zzgzd zzz = zzgyv.zzbG();

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbch$zzaf$zza$zza, reason: collision with other inner class name */
            public final class C0335zza extends zzgyp<zza, C0335zza> implements zzb {
                public C0335zza zzA() {
                    zzbu();
                    ((zza) this.zza).zzaI();
                    return this;
                }

                public C0335zza zzB() {
                    zzbu();
                    ((zza) this.zza).zzaJ();
                    return this;
                }

                public C0335zza zzC(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcf(zzabVar);
                    return this;
                }

                public C0335zza zzD(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcg(zzqVar);
                    return this;
                }

                public C0335zza zzE(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzch(zzqVar);
                    return this;
                }

                public C0335zza zzF(int i, zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzci(i, zzaVar);
                    return this;
                }

                public C0335zza zzG(int i) {
                    zzbu();
                    ((zza) this.zza).zzcj(i);
                    return this;
                }

                public C0335zza zzH(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzck(zzdVar);
                    return this;
                }

                public C0335zza zzI(zzab.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzcl(zzaVar.zzbr());
                    return this;
                }

                public C0335zza zzJ(zzab zzabVar) {
                    zzbu();
                    ((zza) this.zza).zzcl(zzabVar);
                    return this;
                }

                public C0335zza zzK(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcm(zzqVar);
                    return this;
                }

                public C0335zza zzL(long j4) {
                    zzbu();
                    ((zza) this.zza).zzcn(j4);
                    return this;
                }

                public C0335zza zzM(long j4) {
                    zzbu();
                    ((zza) this.zza).zzco(j4);
                    return this;
                }

                public C0335zza zzN(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcp(zzqVar);
                    return this;
                }

                public C0335zza zzO(long j4) {
                    zzbu();
                    ((zza) this.zza).zzcq(j4);
                    return this;
                }

                public C0335zza zzP(long j4) {
                    zzbu();
                    ((zza) this.zza).zzcr(j4);
                    return this;
                }

                public C0335zza zzQ(zzq zzqVar) {
                    zzbu();
                    ((zza) this.zza).zzcs(zzqVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzd zzR() {
                    return ((zza) this.zza).zzR();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public List<zzd.zza> zzS() {
                    return ((zza) this.zza).zzS();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzT() {
                    return ((zza) this.zza).zzT();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzU() {
                    return ((zza) this.zza).zzU();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzV() {
                    return ((zza) this.zza).zzV();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzW() {
                    return ((zza) this.zza).zzW();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzX() {
                    return ((zza) this.zza).zzX();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzY() {
                    return ((zza) this.zza).zzY();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzZ() {
                    return ((zza) this.zza).zzZ();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public int zza() {
                    return ((zza) this.zza).zza();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzaa() {
                    return ((zza) this.zza).zzaa();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzab() {
                    return ((zza) this.zza).zzab();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzac() {
                    return ((zza) this.zza).zzac();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzad() {
                    return ((zza) this.zza).zzad();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public boolean zzae() {
                    return ((zza) this.zza).zzae();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public int zzb() {
                    return ((zza) this.zza).zzb();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public long zzc() {
                    return ((zza) this.zza).zzc();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public long zzd() {
                    return ((zza) this.zza).zzd();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public long zze() {
                    return ((zza) this.zza).zze();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public long zzf() {
                    return ((zza) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzd.zza zzg(int i) {
                    return ((zza) this.zza).zzg(i);
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzq zzh() {
                    return ((zza) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzq zzi() {
                    return ((zza) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzq zzj() {
                    return ((zza) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzq zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzq zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
                public zzab zzm() {
                    return ((zza) this.zza).zzm();
                }

                public C0335zza zzn(Iterable<? extends zzd.zza> iterable) {
                    zzbu();
                    ((zza) this.zza).zzav(iterable);
                    return this;
                }

                public C0335zza zzo(zzd.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzaw(zzaVar);
                    return this;
                }

                public C0335zza zzp() {
                    zzbu();
                    ((zza) this.zza).zzax();
                    return this;
                }

                public C0335zza zzq() {
                    zzbu();
                    ((zza) this.zza).zzay();
                    return this;
                }

                public C0335zza zzr() {
                    zzbu();
                    ((zza) this.zza).zzaz();
                    return this;
                }

                public C0335zza zzs() {
                    zzbu();
                    ((zza) this.zza).zzaA();
                    return this;
                }

                public C0335zza zzt() {
                    zzbu();
                    ((zza) this.zza).zzaB();
                    return this;
                }

                public C0335zza zzu() {
                    zzbu();
                    ((zza) this.zza).zzaC();
                    return this;
                }

                public C0335zza zzv() {
                    zzbu();
                    ((zza) this.zza).zzaD();
                    return this;
                }

                public C0335zza zzw() {
                    zzbu();
                    ((zza) this.zza).zzaE();
                    return this;
                }

                public C0335zza zzx() {
                    zzbu();
                    ((zza) this.zza).zzaF();
                    return this;
                }

                public C0335zza zzy() {
                    zzbu();
                    ((zza) this.zza).zzaG();
                    return this;
                }

                public C0335zza zzz() {
                    zzbu();
                    ((zza) this.zza).zzaH();
                    return this;
                }

                private C0335zza() {
                    super(zza.zzo);
                }
            }

            static {
                zza zzaVar = new zza();
                zzo = zzaVar;
                zzgyv.zzbZ(zza.class, zzaVar);
            }

            private zza() {
            }

            public static zza zzA(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbu(zzo, inputStream, zzgyfVar);
            }

            public static zza zzB(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbv(zzo, byteBuffer, zzgyfVar);
            }

            public static zza zzC(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbx(zzo, bArr, zzgyfVar);
            }

            public static zzhao<zza> zzD() {
                return zzo.zzbN();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaA() {
                this.zzu &= -257;
                this.zzE = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaB() {
                this.zzu &= -1025;
                this.zzG = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaC() {
                this.zzA = null;
                this.zzu &= -17;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaD() {
                this.zzu &= -513;
                this.zzF = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaE() {
                this.zzu &= -9;
                this.zzy = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaF() {
                this.zzu &= -5;
                this.zzx = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaG() {
                this.zzu &= -3;
                this.zzw = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaH() {
                this.zzu &= -2;
                this.zzv = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaI() {
                this.zzu &= -2049;
                this.zzH = 0L;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaJ() {
                this.zzu &= -33;
                this.zzB = 0;
            }

            private void zzaK() {
                zzgzd zzgzdVar = this.zzz;
                if (zzgzdVar.zzc()) {
                    return;
                }
                this.zzz = zzgyv.zzbH(zzgzdVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzav(Iterable<? extends zzd.zza> iterable) {
                zzaK();
                Iterator<? extends zzd.zza> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzz.zzi(it.next().zza());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaw(zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zzi(zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzax() {
                this.zzu &= -65;
                this.zzC = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzay() {
                this.zzu &= -129;
                this.zzD = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzaz() {
                this.zzz = zzgyv.zzbG();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcf(zzab zzabVar) {
                zzabVar.getClass();
                zzab zzabVar2 = this.zzA;
                if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                    zzab.zza zzaVarZzb = zzab.zzb(zzabVar2);
                    zzaVarZzb.zzbj(zzabVar);
                    zzabVar = zzaVarZzb.zzbs();
                }
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcg(zzq zzqVar) {
                this.zzC = zzqVar.zza();
                this.zzu |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzch(zzq zzqVar) {
                this.zzD = zzqVar.zza();
                this.zzu |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzci(int i, zzd.zza zzaVar) {
                zzaVar.getClass();
                zzaK();
                this.zzz.zze(i, zzaVar.zza());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcj(int i) {
                this.zzu |= 256;
                this.zzE = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzck(zzd zzdVar) {
                this.zzG = zzdVar.zza();
                this.zzu |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcl(zzab zzabVar) {
                zzabVar.getClass();
                this.zzA = zzabVar;
                this.zzu |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcm(zzq zzqVar) {
                this.zzF = zzqVar.zza();
                this.zzu |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcn(long j4) {
                this.zzu |= 8;
                this.zzy = j4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzco(long j4) {
                this.zzu |= 4;
                this.zzx = j4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcp(zzq zzqVar) {
                this.zzw = zzqVar.zza();
                this.zzu |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcq(long j4) {
                this.zzu |= 1;
                this.zzv = j4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcr(long j4) {
                this.zzu |= 2048;
                this.zzH = j4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzcs(zzq zzqVar) {
                this.zzB = zzqVar.zza();
                this.zzu |= 32;
            }

            public static C0335zza zzn() {
                return (C0335zza) zzo.zzaZ();
            }

            public static C0335zza zzo(zza zzaVar) {
                return (C0335zza) zzo.zzba(zzaVar);
            }

            public static zza zzq() {
                return zzo;
            }

            public static zza zzr(InputStream inputStream) throws IOException {
                return (zza) zzgyv.zzbk(zzo, inputStream);
            }

            public static zza zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbl(zzo, inputStream, zzgyfVar);
            }

            public static zza zzt(zzgxn zzgxnVar) throws zzgzk {
                return (zza) zzgyv.zzbm(zzo, zzgxnVar);
            }

            public static zza zzu(zzgxt zzgxtVar) throws IOException {
                return (zza) zzgyv.zzbn(zzo, zzgxtVar);
            }

            public static zza zzv(InputStream inputStream) throws IOException {
                return (zza) zzgyv.zzbo(zzo, inputStream);
            }

            public static zza zzw(ByteBuffer byteBuffer) throws zzgzk {
                return (zza) zzgyv.zzbp(zzo, byteBuffer);
            }

            public static zza zzx(byte[] bArr) throws zzgzk {
                return (zza) zzgyv.zzbq(zzo, bArr);
            }

            public static zza zzy(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbr(zzo, zzgxnVar, zzgyfVar);
            }

            public static zza zzz(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbs(zzo, zzgxtVar, zzgyfVar);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzd zzR() {
                zzd zzdVarZzb = zzd.zzb(this.zzG);
                return zzdVarZzb == null ? zzd.UNSPECIFIED : zzdVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public List<zzd.zza> zzS() {
                return new zzgzf(this.zzz, zzn);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzT() {
                return (this.zzu & 64) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzU() {
                return (this.zzu & 128) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzV() {
                return (this.zzu & 256) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzW() {
                return (this.zzu & 1024) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzX() {
                return (this.zzu & 16) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzY() {
                return (this.zzu & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzZ() {
                return (this.zzu & 8) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public int zza() {
                return this.zzz.size();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzaa() {
                return (this.zzu & 4) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzab() {
                return (this.zzu & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzac() {
                return (this.zzu & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzad() {
                return (this.zzu & 2048) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public boolean zzae() {
                return (this.zzu & 32) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public int zzb() {
                return this.zzE;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public long zzc() {
                return this.zzy;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public long zzd() {
                return this.zzx;
            }

            @Override // com.google.android.gms.internal.ads.zzgyv
            public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
                zzhao zzgyqVar;
                int iOrdinal = zzgyuVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zzgyv.zzbQ(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", zzq.zze(), "zzx", "zzy", "zzz", zzd.zza.zze(), "zzA", "zzB", zzq.zze(), "zzC", zzq.zze(), "zzD", zzq.zze(), "zzE", "zzF", zzq.zze(), "zzG", zzd.zze(), "zzH"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                if (iOrdinal == 4) {
                    return new C0335zza();
                }
                if (iOrdinal == 5) {
                    return zzo;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzhao<zza> zzhaoVar = zzp;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zza.class) {
                    try {
                        zzgyqVar = zzp;
                        if (zzgyqVar == null) {
                            zzgyqVar = new zzgyq(zzo);
                            zzp = zzgyqVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzgyqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public long zze() {
                return this.zzv;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public long zzf() {
                return this.zzH;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzd.zza zzg(int i) {
                zzd.zza zzaVarZzb = zzd.zza.zzb(this.zzz.zzd(i));
                return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzq zzh() {
                zzq zzqVarZzb = zzq.zzb(this.zzC);
                return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzq zzi() {
                zzq zzqVarZzb = zzq.zzb(this.zzD);
                return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzq zzj() {
                zzq zzqVarZzb = zzq.zzb(this.zzF);
                return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzq zzk() {
                zzq zzqVarZzb = zzq.zzb(this.zzw);
                return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzq zzl() {
                zzq zzqVarZzb = zzq.zzb(this.zzB);
                return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaf.zzb
            public zzab zzm() {
                zzab zzabVar = this.zzA;
                return zzabVar == null ? zzab.zzd() : zzabVar;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public interface zzb extends zzhah {
            zzd zzR();

            List<zzd.zza> zzS();

            boolean zzT();

            boolean zzU();

            boolean zzV();

            boolean zzW();

            boolean zzX();

            boolean zzY();

            boolean zzZ();

            int zza();

            boolean zzaa();

            boolean zzab();

            boolean zzac();

            boolean zzad();

            boolean zzae();

            int zzb();

            long zzc();

            long zzd();

            long zze();

            long zzf();

            zzd.zza zzg(int i);

            zzq zzh();

            zzq zzi();

            zzq zzj();

            zzq zzk();

            zzq zzl();

            zzab zzm();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zzc extends zzgyp<zzaf, zzc> implements zzag {
            public zzc zzA(int i) {
                zzbu();
                ((zzaf) this.zza).zzaA(i);
                return this;
            }

            public zzc zzB(long j4) {
                zzbu();
                ((zzaf) this.zza).zzaB(j4);
                return this;
            }

            public zzc zzC(int i, zza.C0335zza c0335zza) {
                zzbu();
                ((zzaf) this.zza).zzaC(i, c0335zza.zzbr());
                return this;
            }

            public zzc zzD(int i, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaC(i, zzaVar);
                return this;
            }

            public zzc zzE(int i) {
                zzbu();
                ((zzaf) this.zza).zzaD(i);
                return this;
            }

            public zzc zzF(long j4) {
                zzbu();
                ((zzaf) this.zza).zzaE(j4);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public zzgxn zzG() {
                return ((zzaf) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public zzgxn zzH() {
                return ((zzaf) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public String zzI() {
                return ((zzaf) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public String zzJ() {
                return ((zzaf) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public List<zza> zzK() {
                return Collections.unmodifiableList(((zzaf) this.zza).zzK());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzL() {
                return ((zzaf) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzM() {
                return ((zzaf) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzN() {
                return ((zzaf) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzO() {
                return ((zzaf) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzP() {
                return ((zzaf) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzQ() {
                return ((zzaf) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public boolean zzR() {
                return ((zzaf) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public int zza() {
                return ((zzaf) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public int zzb() {
                return ((zzaf) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public int zzc() {
                return ((zzaf) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public int zzd() {
                return ((zzaf) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public long zze() {
                return ((zzaf) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public long zzf() {
                return ((zzaf) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzag
            public zza zzg(int i) {
                return ((zzaf) this.zza).zzg(i);
            }

            public zzc zzh(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzaf) this.zza).zzai(iterable);
                return this;
            }

            public zzc zzi(zza.C0335zza c0335zza) {
                zzbu();
                ((zzaf) this.zza).zzaj(c0335zza.zzbr());
                return this;
            }

            public zzc zzj(zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzaj(zzaVar);
                return this;
            }

            public zzc zzk(int i, zza.C0335zza c0335zza) {
                zzbu();
                ((zzaf) this.zza).zzak(i, c0335zza.zzbr());
                return this;
            }

            public zzc zzl(int i, zza zzaVar) {
                zzbu();
                ((zzaf) this.zza).zzak(i, zzaVar);
                return this;
            }

            public zzc zzm() {
                zzbu();
                ((zzaf) this.zza).zzal();
                return this;
            }

            public zzc zzn() {
                zzbu();
                ((zzaf) this.zza).zzam();
                return this;
            }

            public zzc zzo() {
                zzbu();
                ((zzaf) this.zza).zzan();
                return this;
            }

            public zzc zzp() {
                zzbu();
                ((zzaf) this.zza).zzao();
                return this;
            }

            public zzc zzq() {
                zzbu();
                ((zzaf) this.zza).zzap();
                return this;
            }

            public zzc zzr() {
                zzbu();
                ((zzaf) this.zza).zzaq();
                return this;
            }

            public zzc zzs() {
                zzbu();
                ((zzaf) this.zza).zzar();
                return this;
            }

            public zzc zzt() {
                zzbu();
                ((zzaf) this.zza).zzas();
                return this;
            }

            public zzc zzu(int i) {
                zzbu();
                ((zzaf) this.zza).zzau(i);
                return this;
            }

            public zzc zzv(String str) {
                zzbu();
                ((zzaf) this.zza).zzav(str);
                return this;
            }

            public zzc zzw(zzgxn zzgxnVar) {
                zzbu();
                ((zzaf) this.zza).zzaw(zzgxnVar);
                return this;
            }

            public zzc zzx(int i) {
                zzbu();
                ((zzaf) this.zza).zzax(i);
                return this;
            }

            public zzc zzy(String str) {
                zzbu();
                ((zzaf) this.zza).zzay(str);
                return this;
            }

            public zzc zzz(zzgxn zzgxnVar) {
                zzbu();
                ((zzaf) this.zza).zzaz(zzgxnVar);
                return this;
            }

            private zzc() {
                super(zzaf.zzi);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzd implements zzgyz {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            public static final int zzg = 0;
            public static final int zzh = 1;
            public static final int zzi = 2;
            public static final int zzj = 3;
            public static final int zzk = 4;
            public static final int zzl = 5;
            private static final zzgza<zzd> zzm = new zzgza<zzd>() { // from class: com.google.android.gms.internal.ads.zzbch.zzaf.zzd.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i) {
                    return zzd.zzb(i);
                }
            };
            private final int zzo;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzd.zzb(i) != null;
                }
            }

            zzd(int i) {
                this.zzo = i;
            }

            public static zzd zzb(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i == 1) {
                    return CONNECTING;
                }
                if (i == 2) {
                    return CONNECTED;
                }
                if (i == 3) {
                    return DISCONNECTING;
                }
                if (i == 4) {
                    return DISCONNECTED;
                }
                if (i != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static zzgza<zzd> zzd() {
                return zzm;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzo);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzo;
            }
        }

        static {
            zzaf zzafVar = new zzaf();
            zzi = zzafVar;
            zzgyv.zzbZ(zzaf.class, zzafVar);
        }

        private zzaf() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i) {
            this.zzk |= 1;
            this.zzm = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(long j4) {
            this.zzk |= 32;
            this.zzv = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.set(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(int i) {
            this.zzk |= 2;
            this.zzn = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(long j4) {
            this.zzk |= 4;
            this.zzo = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(Iterable<? extends zza> iterable) {
            zzat();
            zzgww.zzaQ(iterable, this.zzl);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i, zza zzaVar) {
            zzaVar.getClass();
            zzat();
            this.zzl.add(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzk &= -9;
            this.zzp = zzl().zzI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzk &= -65;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzk &= -17;
            this.zzu = zzl().zzJ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzk &= -2;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzk &= -33;
            this.zzv = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzl = zzgyv.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzk &= -3;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzk &= -5;
            this.zzo = 0L;
        }

        private void zzat() {
            zzgzh<zza> zzgzhVar = this.zzl;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzl = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(int i) {
            zzat();
            this.zzl.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(String str) {
            str.getClass();
            this.zzk |= 8;
            this.zzp = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzgxn zzgxnVar) {
            this.zzp = zzgxnVar.zzx();
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(int i) {
            this.zzk |= 64;
            this.zzw = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(String str) {
            str.getClass();
            this.zzk |= 16;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(zzgxn zzgxnVar) {
            this.zzu = zzgxnVar.zzx();
            this.zzk |= 16;
        }

        public static zzc zzi() {
            return (zzc) zzi.zzaZ();
        }

        public static zzc zzj(zzaf zzafVar) {
            return (zzc) zzi.zzba(zzafVar);
        }

        public static zzaf zzl() {
            return zzi;
        }

        public static zzaf zzm(InputStream inputStream) throws IOException {
            return (zzaf) zzgyv.zzbk(zzi, inputStream);
        }

        public static zzaf zzn(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzaf) zzgyv.zzbl(zzi, inputStream, zzgyfVar);
        }

        public static zzaf zzo(zzgxn zzgxnVar) throws zzgzk {
            return (zzaf) zzgyv.zzbm(zzi, zzgxnVar);
        }

        public static zzaf zzp(zzgxt zzgxtVar) throws IOException {
            return (zzaf) zzgyv.zzbn(zzi, zzgxtVar);
        }

        public static zzaf zzq(InputStream inputStream) throws IOException {
            return (zzaf) zzgyv.zzbo(zzi, inputStream);
        }

        public static zzaf zzr(ByteBuffer byteBuffer) throws zzgzk {
            return (zzaf) zzgyv.zzbp(zzi, byteBuffer);
        }

        public static zzaf zzs(byte[] bArr) throws zzgzk {
            return (zzaf) zzgyv.zzbq(zzi, bArr);
        }

        public static zzaf zzt(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzaf) zzgyv.zzbr(zzi, zzgxnVar, zzgyfVar);
        }

        public static zzaf zzu(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzaf) zzgyv.zzbs(zzi, zzgxtVar, zzgyfVar);
        }

        public static zzaf zzv(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzaf) zzgyv.zzbu(zzi, inputStream, zzgyfVar);
        }

        public static zzaf zzw(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzaf) zzgyv.zzbv(zzi, byteBuffer, zzgyfVar);
        }

        public static zzaf zzx(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzaf) zzgyv.zzbx(zzi, bArr, zzgyfVar);
        }

        public static zzhao<zzaf> zzy() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public zzgxn zzG() {
            return zzgxn.zzw(this.zzp);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public zzgxn zzH() {
            return zzgxn.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public String zzI() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public String zzJ() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public List<zza> zzK() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzM() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzN() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzO() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzP() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzQ() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public boolean zzR() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public int zza() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public int zzb() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public int zzc() {
            return this.zzl.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public int zzd() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", zza.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
            }
            if (iOrdinal == 3) {
                return new zzaf();
            }
            if (iOrdinal == 4) {
                return new zzc();
            }
            if (iOrdinal == 5) {
                return zzi;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzaf> zzhaoVar = zzj;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzaf.class) {
                try {
                    zzgyqVar = zzj;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzi);
                        zzj = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public long zze() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public long zzf() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzag
        public zza zzg(int i) {
            return this.zzl.get(i);
        }

        public zzb zzh(int i) {
            return this.zzl.get(i);
        }

        public List<? extends zzb> zzz() {
            return this.zzl;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzag extends zzhah {
        zzgxn zzG();

        zzgxn zzH();

        String zzI();

        String zzJ();

        List<zzaf.zza> zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        long zze();

        long zzf();

        zzaf.zza zzg(int i);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzah extends zzgyv<zzah, zza> implements zzak {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        public static final int zzi = 9;
        public static final int zzj = 10;
        public static final int zzk = 11;
        private static final zzah zzl;
        private static volatile zzhao<zzah> zzm;
        private int zzA;
        private int zzB;
        private zzai zzC;
        private int zzn;
        private int zzo = 1000;
        private int zzp = 1000;
        private int zzu;
        private int zzv;
        private int zzw;
        private int zzx;
        private int zzy;
        private int zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzah, zza> implements zzak {
            public zza zzA(int i) {
                zzbu();
                ((zzah) this.zza).zzaA(i);
                return this;
            }

            public zza zzB(int i) {
                zzbu();
                ((zzah) this.zza).zzaB(i);
                return this;
            }

            public zza zzC(int i) {
                zzbu();
                ((zzah) this.zza).zzaC(i);
                return this;
            }

            public zza zzD(zzai.zza zzaVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaVar.zzbr());
                return this;
            }

            public zza zzE(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzaD(zzaiVar);
                return this;
            }

            public zza zzF(int i) {
                zzbu();
                ((zzah) this.zza).zzaE(i);
                return this;
            }

            public zza zzG(int i) {
                zzbu();
                ((zzah) this.zza).zzaF(i);
                return this;
            }

            public zza zzH(int i) {
                zzbu();
                ((zzah) this.zza).zzaG(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public zzai zzI() {
                return ((zzah) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzJ() {
                return ((zzah) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzK() {
                return ((zzah) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzL() {
                return ((zzah) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzM() {
                return ((zzah) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzN() {
                return ((zzah) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzO() {
                return ((zzah) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzP() {
                return ((zzah) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzQ() {
                return ((zzah) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzR() {
                return ((zzah) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzS() {
                return ((zzah) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public boolean zzT() {
                return ((zzah) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zza() {
                return ((zzah) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzb() {
                return ((zzah) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzc() {
                return ((zzah) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzd() {
                return ((zzah) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zze() {
                return ((zzah) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzf() {
                return ((zzah) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzg() {
                return ((zzah) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public int zzh() {
                return ((zzah) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public zzq zzi() {
                return ((zzah) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzak
            public zzq zzj() {
                return ((zzah) this.zza).zzj();
            }

            public zza zzk() {
                zzbu();
                ((zzah) this.zza).zzak();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzah) this.zza).zzal();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzah) this.zza).zzam();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzah) this.zza).zzan();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzah) this.zza).zzao();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzah) this.zza).zzap();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzah) this.zza).zzaq();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzah) this.zza).zzar();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzah) this.zza).zzas();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzah) this.zza).zzat();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzah) this.zza).zzau();
                return this;
            }

            public zza zzv(zzai zzaiVar) {
                zzbu();
                ((zzah) this.zza).zzav(zzaiVar);
                return this;
            }

            public zza zzw(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzaw(zzqVar);
                return this;
            }

            public zza zzx(zzq zzqVar) {
                zzbu();
                ((zzah) this.zza).zzax(zzqVar);
                return this;
            }

            public zza zzy(int i) {
                zzbu();
                ((zzah) this.zza).zzay(i);
                return this;
            }

            public zza zzz(int i) {
                zzbu();
                ((zzah) this.zza).zzaz(i);
                return this;
            }

            private zza() {
                super(zzah.zzl);
            }
        }

        static {
            zzah zzahVar = new zzah();
            zzl = zzahVar;
            zzgyv.zzbZ(zzah.class, zzahVar);
        }

        private zzah() {
        }

        public static zzhao<zzah> zzA() {
            return zzl.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA(int i) {
            this.zzn |= 8;
            this.zzv = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB(int i) {
            this.zzn |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.zzB = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC(int i) {
            this.zzn |= 256;
            this.zzA = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD(zzai zzaiVar) {
            zzaiVar.getClass();
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(int i) {
            this.zzn |= 4;
            this.zzu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(int i) {
            this.zzn |= 32;
            this.zzx = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG(int i) {
            this.zzn |= 16;
            this.zzw = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak() {
            this.zzn &= -3;
            this.zzp = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal() {
            this.zzn &= -2;
            this.zzo = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam() {
            this.zzn &= -65;
            this.zzy = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan() {
            this.zzn &= -129;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao() {
            this.zzn &= -9;
            this.zzv = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap() {
            this.zzn &= -513;
            this.zzB = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq() {
            this.zzn &= -257;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar() {
            this.zzC = null;
            this.zzn &= -1025;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas() {
            this.zzn &= -5;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat() {
            this.zzn &= -33;
            this.zzx = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau() {
            this.zzn &= -17;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzai zzaiVar) {
            zzaiVar.getClass();
            zzai zzaiVar2 = this.zzC;
            if (zzaiVar2 != null && zzaiVar2 != zzai.zzi()) {
                zzai.zza zzaVarZzd = zzai.zzd(zzaiVar2);
                zzaVarZzd.zzbj(zzaiVar);
                zzaiVar = zzaVarZzd.zzbs();
            }
            this.zzC = zzaiVar;
            this.zzn |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw(zzq zzqVar) {
            this.zzp = zzqVar.zza();
            this.zzn |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax(zzq zzqVar) {
            this.zzo = zzqVar.zza();
            this.zzn |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay(int i) {
            this.zzn |= 64;
            this.zzy = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz(int i) {
            this.zzn |= 128;
            this.zzz = i;
        }

        public static zza zzk() {
            return (zza) zzl.zzaZ();
        }

        public static zza zzl(zzah zzahVar) {
            return (zza) zzl.zzba(zzahVar);
        }

        public static zzah zzn() {
            return zzl;
        }

        public static zzah zzo(InputStream inputStream) throws IOException {
            return (zzah) zzgyv.zzbk(zzl, inputStream);
        }

        public static zzah zzp(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzah) zzgyv.zzbl(zzl, inputStream, zzgyfVar);
        }

        public static zzah zzq(zzgxn zzgxnVar) throws zzgzk {
            return (zzah) zzgyv.zzbm(zzl, zzgxnVar);
        }

        public static zzah zzr(zzgxt zzgxtVar) throws IOException {
            return (zzah) zzgyv.zzbn(zzl, zzgxtVar);
        }

        public static zzah zzs(InputStream inputStream) throws IOException {
            return (zzah) zzgyv.zzbo(zzl, inputStream);
        }

        public static zzah zzt(ByteBuffer byteBuffer) throws zzgzk {
            return (zzah) zzgyv.zzbp(zzl, byteBuffer);
        }

        public static zzah zzu(byte[] bArr) throws zzgzk {
            return (zzah) zzgyv.zzbq(zzl, bArr);
        }

        public static zzah zzv(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzah) zzgyv.zzbr(zzl, zzgxnVar, zzgyfVar);
        }

        public static zzah zzw(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzah) zzgyv.zzbs(zzl, zzgxtVar, zzgyfVar);
        }

        public static zzah zzx(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzah) zzgyv.zzbu(zzl, inputStream, zzgyfVar);
        }

        public static zzah zzy(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzah) zzgyv.zzbv(zzl, byteBuffer, zzgyfVar);
        }

        public static zzah zzz(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzah) zzgyv.zzbx(zzl, bArr, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public zzai zzI() {
            zzai zzaiVar = this.zzC;
            return zzaiVar == null ? zzai.zzi() : zzaiVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzJ() {
            return (this.zzn & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzK() {
            return (this.zzn & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzL() {
            return (this.zzn & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzM() {
            return (this.zzn & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzN() {
            return (this.zzn & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzO() {
            return (this.zzn & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzP() {
            return (this.zzn & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzQ() {
            return (this.zzn & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzR() {
            return (this.zzn & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzS() {
            return (this.zzn & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public boolean zzT() {
            return (this.zzn & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zza() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzb() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzc() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzd() {
            return this.zzB;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", zzq.zze(), "zzp", zzq.zze(), "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
            }
            if (iOrdinal == 3) {
                return new zzah();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzl;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzah> zzhaoVar = zzm;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzah.class) {
                try {
                    zzgyqVar = zzm;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzl);
                        zzm = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zze() {
            return this.zzA;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzf() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzg() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public int zzh() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public zzq zzi() {
            zzq zzqVarZzb = zzq.zzb(this.zzp);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzak
        public zzq zzj() {
            zzq zzqVarZzb = zzq.zzb(this.zzo);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzai extends zzgyv<zzai, zza> implements zzaj {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzai zzc;
        private static volatile zzhao<zzai> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzai, zza> implements zzaj {
            @Override // com.google.android.gms.internal.ads.zzbch.zzaj
            public int zza() {
                return ((zzai) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaj
            public int zzb() {
                return ((zzai) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzai) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzai) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzai) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzai) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaj
            public boolean zzg() {
                return ((zzai) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaj
            public boolean zzh() {
                return ((zzai) this.zza).zzh();
            }

            private zza() {
                super(zzai.zzc);
            }
        }

        static {
            zzai zzaiVar = new zzai();
            zzc = zzaiVar;
            zzgyv.zzbZ(zzai.class, zzaiVar);
        }

        private zzai() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public static zza zzc() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzd(zzai zzaiVar) {
            return (zza) zzc.zzba(zzaiVar);
        }

        public static zzai zzi() {
            return zzc;
        }

        public static zzai zzj(InputStream inputStream) throws IOException {
            return (zzai) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzai zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzai) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzai zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzai) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzai zzm(zzgxt zzgxtVar) throws IOException {
            return (zzai) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzai zzn(InputStream inputStream) throws IOException {
            return (zzai) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzai zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzai) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzai zzp(byte[] bArr) throws zzgzk {
            return (zzai) zzgyv.zzbq(zzc, bArr);
        }

        public static zzai zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzai) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzai zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzai) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzai zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzai) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzai zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzai) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzai zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzai) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzai> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaj
        public int zza() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaj
        public int zzb() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzai();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzai> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzai.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaj
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaj
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzaj extends zzhah {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzak extends zzhah {
        zzai zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        boolean zzM();

        boolean zzN();

        boolean zzO();

        boolean zzP();

        boolean zzQ();

        boolean zzR();

        boolean zzS();

        boolean zzT();

        int zza();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        int zzh();

        zzq zzi();

        zzq zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzal extends zzgyv<zzal, zza> implements zzam {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzal zzc;
        private static volatile zzhao<zzal> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzal, zza> implements zzam {
            @Override // com.google.android.gms.internal.ads.zzbch.zzam
            public int zza() {
                return ((zzal) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzam
            public int zzb() {
                return ((zzal) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzal) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzal) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzal) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzal) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzam
            public boolean zzg() {
                return ((zzal) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzam
            public boolean zzh() {
                return ((zzal) this.zza).zzh();
            }

            private zza() {
                super(zzal.zzc);
            }
        }

        static {
            zzal zzalVar = new zzal();
            zzc = zzalVar;
            zzgyv.zzbZ(zzal.class, zzalVar);
        }

        private zzal() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza zzc() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzd(zzal zzalVar) {
            return (zza) zzc.zzba(zzalVar);
        }

        public static zzal zzi() {
            return zzc;
        }

        public static zzal zzj(InputStream inputStream) throws IOException {
            return (zzal) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzal zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzal) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzal zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzal) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzal zzm(zzgxt zzgxtVar) throws IOException {
            return (zzal) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzal zzn(InputStream inputStream) throws IOException {
            return (zzal) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzal zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzal) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzal zzp(byte[] bArr) throws zzgzk {
            return (zzal) zzgyv.zzbq(zzc, bArr);
        }

        public static zzal zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzal) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzal zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzal) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzal zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzal) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzal zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzal) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzal zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzal) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzal> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzam
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzam
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzal();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzal> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzal.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzam
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzam
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzam extends zzhah {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzan extends zzgyv<zzan, zza> implements zzao {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzan zzd;
        private static volatile zzhao<zzan> zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzan, zza> implements zzao {
            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public zzq zza() {
                return ((zzan) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzan) this.zza).zzH();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzan) this.zza).zzI();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzan) this.zza).zzJ();
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzan) this.zza).zzL(str);
                return this;
            }

            public zza zzg(zzgxn zzgxnVar) {
                zzbu();
                ((zzan) this.zza).zzM(zzgxnVar);
                return this;
            }

            public zza zzh(zzap.zza zzaVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzap zzapVar) {
                zzbu();
                ((zzan) this.zza).zzN(zzapVar);
                return this;
            }

            public zza zzj(zzq zzqVar) {
                zzbu();
                ((zzan) this.zza).zzO(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public zzap zzk() {
                return ((zzan) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public zzgxn zzl() {
                return ((zzan) this.zza).zzl();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public String zzm() {
                return ((zzan) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public boolean zzn() {
                return ((zzan) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public boolean zzo() {
                return ((zzan) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzao
            public boolean zzp() {
                return ((zzan) this.zza).zzp();
            }

            private zza() {
                super(zzan.zzd);
            }
        }

        static {
            zzan zzanVar = new zzan();
            zzd = zzanVar;
            zzgyv.zzbZ(zzan.class, zzanVar);
        }

        private zzan() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzf &= -2;
            this.zzg = zzf().zzm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzgxn zzgxnVar) {
            this.zzg = zzgxnVar.zzx();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzq zzqVar) {
            this.zzh = zzqVar.zza();
            this.zzf |= 2;
        }

        public static zza zzb() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzc(zzan zzanVar) {
            return (zza) zzd.zzba(zzanVar);
        }

        public static zzan zzf() {
            return zzd;
        }

        public static zzan zzg(InputStream inputStream) throws IOException {
            return (zzan) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzan zzh(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzan) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzan zzi(zzgxn zzgxnVar) throws zzgzk {
            return (zzan) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzan zzj(zzgxt zzgxtVar) throws IOException {
            return (zzan) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzan zzq(InputStream inputStream) throws IOException {
            return (zzan) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzan zzr(ByteBuffer byteBuffer) throws zzgzk {
            return (zzan) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzan zzs(byte[] bArr) throws zzgzk {
            return (zzan) zzgyv.zzbq(zzd, bArr);
        }

        public static zzan zzt(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzan) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzan zzu(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzan) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzan zzv(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzan) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzan zzw(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzan) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzan zzx(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzan) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public static zzhao<zzan> zzy() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzh);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", zzq.zze(), "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzan();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzan> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzan.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public zzap zzk() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public zzgxn zzl() {
            return zzgxn.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public String zzm() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public boolean zzn() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzao
        public boolean zzp() {
            return (this.zzf & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzao extends zzhah {
        zzq zza();

        zzap zzk();

        zzgxn zzl();

        String zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzap extends zzgyv<zzap, zza> implements zzaq {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzap zzc;
        private static volatile zzhao<zzap> zzd;
        private int zze;
        private int zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzap, zza> implements zzaq {
            @Override // com.google.android.gms.internal.ads.zzbch.zzaq
            public int zza() {
                return ((zzap) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaq
            public int zzb() {
                return ((zzap) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzap) this.zza).zzA();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzap) this.zza).zzB();
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzap) this.zza).zzC(i);
                return this;
            }

            public zza zzf(int i) {
                zzbu();
                ((zzap) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaq
            public boolean zzg() {
                return ((zzap) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaq
            public boolean zzh() {
                return ((zzap) this.zza).zzh();
            }

            private zza() {
                super(zzap.zzc);
            }
        }

        static {
            zzap zzapVar = new zzap();
            zzc = zzapVar;
            zzgyv.zzbZ(zzap.class, zzapVar);
        }

        private zzap() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i) {
            this.zze |= 1;
            this.zzf = i;
        }

        public static zza zzc() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzd(zzap zzapVar) {
            return (zza) zzc.zzba(zzapVar);
        }

        public static zzap zzi() {
            return zzc;
        }

        public static zzap zzj(InputStream inputStream) throws IOException {
            return (zzap) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzap zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzap) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzap zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzap) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzap zzm(zzgxt zzgxtVar) throws IOException {
            return (zzap) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzap zzn(InputStream inputStream) throws IOException {
            return (zzap) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzap zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzap) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzap zzp(byte[] bArr) throws zzgzk {
            return (zzap) zzgyv.zzbq(zzc, bArr);
        }

        public static zzap zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzap) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzap zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzap) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzap zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzap) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzap zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzap) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzap zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzap) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzap> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaq
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaq
        public int zzb() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzap();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzap> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzap.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaq
        public boolean zzg() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaq
        public boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzaq extends zzhah {
        int zza();

        int zzb();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzar extends zzgyv<zzar, zza> implements zzas {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzar zzd;
        private static volatile zzhao<zzar> zze;
        private int zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzar, zza> implements zzas {
            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public int zza() {
                return ((zzar) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public int zzb() {
                return ((zzar) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public int zzc() {
                return ((zzar) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzar) this.zza).zzE();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzar) this.zza).zzF();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzar) this.zza).zzG();
                return this;
            }

            public zza zzg(int i) {
                zzbu();
                ((zzar) this.zza).zzH(i);
                return this;
            }

            public zza zzh(int i) {
                zzbu();
                ((zzar) this.zza).zzI(i);
                return this;
            }

            public zza zzi(int i) {
                zzbu();
                ((zzar) this.zza).zzJ(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public boolean zzj() {
                return ((zzar) this.zza).zzj();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public boolean zzk() {
                return ((zzar) this.zza).zzk();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzas
            public boolean zzl() {
                return ((zzar) this.zza).zzl();
            }

            private zza() {
                super(zzar.zzd);
            }
        }

        static {
            zzar zzarVar = new zzar();
            zzd = zzarVar;
            zzgyv.zzbZ(zzar.class, zzarVar);
        }

        private zzar() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE() {
            this.zzf &= -2;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzf &= -5;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzf &= -3;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH(int i) {
            this.zzf |= 1;
            this.zzg = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i) {
            this.zzf |= 4;
            this.zzi = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(int i) {
            this.zzf |= 2;
            this.zzh = i;
        }

        public static zza zzd() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzf(zzar zzarVar) {
            return (zza) zzd.zzba(zzarVar);
        }

        public static zzar zzh() {
            return zzd;
        }

        public static zzar zzi(InputStream inputStream) throws IOException {
            return (zzar) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzar zzm(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzar) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzar zzn(zzgxn zzgxnVar) throws zzgzk {
            return (zzar) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzar zzo(zzgxt zzgxtVar) throws IOException {
            return (zzar) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzar zzp(InputStream inputStream) throws IOException {
            return (zzar) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzar zzq(ByteBuffer byteBuffer) throws zzgzk {
            return (zzar) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzar zzr(byte[] bArr) throws zzgzk {
            return (zzar) zzgyv.zzbq(zzd, bArr);
        }

        public static zzar zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzar) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzar zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzar) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzar zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzar) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzar zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzar) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzar zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzar) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public static zzhao<zzar> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public int zzb() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public int zzc() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzar();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzar> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzar.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public boolean zzj() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public boolean zzk() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzas
        public boolean zzl() {
            return (this.zzf & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzas extends zzhah {
        int zza();

        int zzb();

        int zzc();

        boolean zzj();

        boolean zzk();

        boolean zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzat extends zzgyv<zzat, zza> implements zzbi {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        public static final int zze = 9;
        public static final int zzf = 10;
        public static final int zzg = 11;
        public static final int zzh = 12;
        public static final int zzi = 13;
        public static final int zzj = 14;
        public static final int zzk = 15;
        public static final int zzl = 16;
        public static final int zzm = 17;
        public static final int zzn = 18;
        public static final int zzo = 19;
        public static final int zzp = 20;
        private static final zzat zzu;
        private static volatile zzhao<zzat> zzv;
        private zzbj zzA;
        private zzau zzB;
        private zzbc zzC;
        private zzay zzD;
        private int zzE;
        private int zzF;
        private zzap zzG;
        private int zzH;
        private int zzI;
        private int zzJ;
        private int zzK;
        private int zzL;
        private long zzM;
        private int zzw;
        private zzba zzx;
        private zzbe zzy;
        private zzbg zzz;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzat, zza> implements zzbi {
            public zza zzA(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcw(zzayVar);
                return this;
            }

            public zza zzB(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcx(zzbaVar);
                return this;
            }

            public zza zzC(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcy(zzbcVar);
                return this;
            }

            public zza zzD(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcz(zzbeVar);
                return this;
            }

            public zza zzE(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcA(zzbgVar);
                return this;
            }

            public zza zzF(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcB(zzapVar);
                return this;
            }

            public zza zzG(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcC(zzbjVar);
                return this;
            }

            public zza zzH(zzau.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzaVar.zzbr());
                return this;
            }

            public zza zzI(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcD(zzauVar);
                return this;
            }

            public zza zzJ(zzay.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzaVar.zzbr());
                return this;
            }

            public zza zzK(zzay zzayVar) {
                zzbu();
                ((zzat) this.zza).zzcE(zzayVar);
                return this;
            }

            public zza zzL(zzba.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzM(zzba zzbaVar) {
                zzbu();
                ((zzat) this.zza).zzcF(zzbaVar);
                return this;
            }

            public zza zzN(zzbc.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzaVar.zzbr());
                return this;
            }

            public zza zzO(zzbc zzbcVar) {
                zzbu();
                ((zzat) this.zza).zzcG(zzbcVar);
                return this;
            }

            public zza zzP(zzbe.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzQ(zzbe zzbeVar) {
                zzbu();
                ((zzat) this.zza).zzcH(zzbeVar);
                return this;
            }

            public zza zzR(zzbg.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzaVar.zzbr());
                return this;
            }

            public zza zzS(zzbg zzbgVar) {
                zzbu();
                ((zzat) this.zza).zzcI(zzbgVar);
                return this;
            }

            public zza zzT(int i) {
                zzbu();
                ((zzat) this.zza).zzcJ(i);
                return this;
            }

            public zza zzU(int i) {
                zzbu();
                ((zzat) this.zza).zzcK(i);
                return this;
            }

            public zza zzV(int i) {
                zzbu();
                ((zzat) this.zza).zzcL(i);
                return this;
            }

            public zza zzW(int i) {
                zzbu();
                ((zzat) this.zza).zzcM(i);
                return this;
            }

            public zza zzX(int i) {
                zzbu();
                ((zzat) this.zza).zzcN(i);
                return this;
            }

            public zza zzY(int i) {
                zzbu();
                ((zzat) this.zza).zzcO(i);
                return this;
            }

            public zza zzZ(int i) {
                zzbu();
                ((zzat) this.zza).zzcP(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zza() {
                return ((zzat) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzaA() {
                return ((zzat) this.zza).zzaA();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzaB() {
                return ((zzat) this.zza).zzaB();
            }

            public zza zzaa(zzap.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcQ(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzap zzapVar) {
                zzbu();
                ((zzat) this.zza).zzcQ(zzapVar);
                return this;
            }

            public zza zzac(long j4) {
                zzbu();
                ((zzat) this.zza).zzcR(j4);
                return this;
            }

            public zza zzad(zzbj.zza zzaVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzaVar.zzbr());
                return this;
            }

            public zza zzae(zzbj zzbjVar) {
                zzbu();
                ((zzat) this.zza).zzcS(zzbjVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzau zzaf() {
                return ((zzat) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzay zzag() {
                return ((zzat) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzba zzah() {
                return ((zzat) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzbc zzai() {
                return ((zzat) this.zza).zzai();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzbe zzaj() {
                return ((zzat) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzbg zzak() {
                return ((zzat) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzbj zzal() {
                return ((zzat) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzam() {
                return ((zzat) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzan() {
                return ((zzat) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzao() {
                return ((zzat) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzap() {
                return ((zzat) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzaq() {
                return ((zzat) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzar() {
                return ((zzat) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzas() {
                return ((zzat) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzat() {
                return ((zzat) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzau() {
                return ((zzat) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzav() {
                return ((zzat) this.zza).zzav();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzaw() {
                return ((zzat) this.zza).zzaw();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzax() {
                return ((zzat) this.zza).zzax();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzay() {
                return ((zzat) this.zza).zzay();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public boolean zzaz() {
                return ((zzat) this.zza).zzaz();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zzb() {
                return ((zzat) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zzc() {
                return ((zzat) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zzd() {
                return ((zzat) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zze() {
                return ((zzat) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zzf() {
                return ((zzat) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public int zzg() {
                return ((zzat) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public long zzh() {
                return ((zzat) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbi
            public zzap zzi() {
                return ((zzat) this.zza).zzi();
            }

            public zza zzj() {
                zzbu();
                ((zzat) this.zza).zzcf();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzat) this.zza).zzcg();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzat) this.zza).zzch();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzat) this.zza).zzci();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzat) this.zza).zzcj();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzat) this.zza).zzck();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzat) this.zza).zzcl();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzat) this.zza).zzcm();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzat) this.zza).zzcn();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzat) this.zza).zzco();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzat) this.zza).zzcp();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzat) this.zza).zzcq();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzat) this.zza).zzcr();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzat) this.zza).zzcs();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzat) this.zza).zzct();
                return this;
            }

            public zza zzy() {
                zzbu();
                ((zzat) this.zza).zzcu();
                return this;
            }

            public zza zzz(zzau zzauVar) {
                zzbu();
                ((zzat) this.zza).zzcv(zzauVar);
                return this;
            }

            private zza() {
                super(zzat.zzu);
            }
        }

        static {
            zzat zzatVar = new zzat();
            zzu = zzatVar;
            zzgyv.zzbZ(zzat.class, zzatVar);
        }

        private zzat() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(zzbg zzbgVar) {
            zzbgVar.getClass();
            zzbg zzbgVar2 = this.zzz;
            if (zzbgVar2 != null && zzbgVar2 != zzbg.zzh()) {
                zzbg.zza zzaVarZzf = zzbg.zzf(zzbgVar2);
                zzaVarZzf.zzbj(zzbgVar);
                zzbgVar = zzaVarZzf.zzbs();
            }
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzG;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzG = zzapVar;
            this.zzw |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(zzbj zzbjVar) {
            zzbjVar.getClass();
            zzbj zzbjVar2 = this.zzA;
            if (zzbjVar2 != null && zzbjVar2 != zzbj.zzg()) {
                zzbj.zza zzaVarZzd = zzbj.zzd(zzbjVar2);
                zzaVarZzd.zzbj(zzbjVar);
                zzbjVar = zzaVarZzd.zzbs();
            }
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzau zzauVar) {
            zzauVar.getClass();
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(zzay zzayVar) {
            zzayVar.getClass();
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzba zzbaVar) {
            zzbaVar.getClass();
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzbc zzbcVar) {
            zzbcVar.getClass();
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzbe zzbeVar) {
            zzbeVar.getClass();
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(zzbg zzbgVar) {
            zzbgVar.getClass();
            this.zzz = zzbgVar;
            this.zzw |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(int i) {
            this.zzw |= 8192;
            this.zzK = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcK(int i) {
            this.zzw |= 16384;
            this.zzL = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcL(int i) {
            this.zzw |= 1024;
            this.zzH = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcM(int i) {
            this.zzw |= 128;
            this.zzE = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcN(int i) {
            this.zzw |= 256;
            this.zzF = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcO(int i) {
            this.zzw |= 2048;
            this.zzI = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcP(int i) {
            this.zzw |= 4096;
            this.zzJ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcQ(zzap zzapVar) {
            zzapVar.getClass();
            this.zzG = zzapVar;
            this.zzw |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcR(long j4) {
            this.zzw |= Constants.QUEUE_ELEMENT_MAX_SIZE;
            this.zzM = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcS(zzbj zzbjVar) {
            zzbjVar.getClass();
            this.zzA = zzbjVar;
            this.zzw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcf() {
            this.zzB = null;
            this.zzw &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzD = null;
            this.zzw &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzx = null;
            this.zzw &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzC = null;
            this.zzw &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzy = null;
            this.zzw &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzz = null;
            this.zzw &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzw &= -8193;
            this.zzK = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzw &= -16385;
            this.zzL = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn() {
            this.zzw &= -1025;
            this.zzH = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco() {
            this.zzw &= -129;
            this.zzE = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp() {
            this.zzw &= -257;
            this.zzF = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq() {
            this.zzw &= -2049;
            this.zzI = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr() {
            this.zzw &= -4097;
            this.zzJ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs() {
            this.zzG = null;
            this.zzw &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct() {
            this.zzw &= -32769;
            this.zzM = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu() {
            this.zzA = null;
            this.zzw &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzau zzauVar) {
            zzauVar.getClass();
            zzau zzauVar2 = this.zzB;
            if (zzauVar2 != null && zzauVar2 != zzau.zzg()) {
                zzau.zza zzaVarZzd = zzau.zzd(zzauVar2);
                zzaVarZzd.zzbj(zzauVar);
                zzauVar = zzaVarZzd.zzbs();
            }
            this.zzB = zzauVar;
            this.zzw |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zzay zzayVar) {
            zzayVar.getClass();
            zzay zzayVar2 = this.zzD;
            if (zzayVar2 != null && zzayVar2 != zzay.zzi()) {
                zzay.zza zzaVarZzg = zzay.zzg(zzayVar2);
                zzaVarZzg.zzbj(zzayVar);
                zzayVar = zzaVarZzg.zzbs();
            }
            this.zzD = zzayVar;
            this.zzw |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzba zzbaVar) {
            zzbaVar.getClass();
            zzba zzbaVar2 = this.zzx;
            if (zzbaVar2 != null && zzbaVar2 != zzba.zzi()) {
                zzba.zza zzaVarZzg = zzba.zzg(zzbaVar2);
                zzaVarZzg.zzbj(zzbaVar);
                zzbaVar = zzaVarZzg.zzbs();
            }
            this.zzx = zzbaVar;
            this.zzw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzbc zzbcVar) {
            zzbcVar.getClass();
            zzbc zzbcVar2 = this.zzC;
            if (zzbcVar2 != null && zzbcVar2 != zzbc.zzh()) {
                zzbc.zza zzaVarZzf = zzbc.zzf(zzbcVar2);
                zzaVarZzf.zzbj(zzbcVar);
                zzbcVar = zzaVarZzf.zzbs();
            }
            this.zzC = zzbcVar;
            this.zzw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzbe zzbeVar) {
            zzbeVar.getClass();
            zzbe zzbeVar2 = this.zzy;
            if (zzbeVar2 != null && zzbeVar2 != zzbe.zzj()) {
                zzbe.zza zzaVarZzh = zzbe.zzh(zzbeVar2);
                zzaVarZzh.zzbj(zzbeVar);
                zzbeVar = zzaVarZzh.zzbs();
            }
            this.zzy = zzbeVar;
            this.zzw |= 2;
        }

        public static zza zzj() {
            return (zza) zzu.zzaZ();
        }

        public static zza zzk(zzat zzatVar) {
            return (zza) zzu.zzba(zzatVar);
        }

        public static zzat zzm() {
            return zzu;
        }

        public static zzat zzn(InputStream inputStream) throws IOException {
            return (zzat) zzgyv.zzbk(zzu, inputStream);
        }

        public static zzat zzo(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzat) zzgyv.zzbl(zzu, inputStream, zzgyfVar);
        }

        public static zzat zzp(zzgxn zzgxnVar) throws zzgzk {
            return (zzat) zzgyv.zzbm(zzu, zzgxnVar);
        }

        public static zzat zzq(zzgxt zzgxtVar) throws IOException {
            return (zzat) zzgyv.zzbn(zzu, zzgxtVar);
        }

        public static zzat zzr(InputStream inputStream) throws IOException {
            return (zzat) zzgyv.zzbo(zzu, inputStream);
        }

        public static zzat zzs(ByteBuffer byteBuffer) throws zzgzk {
            return (zzat) zzgyv.zzbp(zzu, byteBuffer);
        }

        public static zzat zzt(byte[] bArr) throws zzgzk {
            return (zzat) zzgyv.zzbq(zzu, bArr);
        }

        public static zzat zzu(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzat) zzgyv.zzbr(zzu, zzgxnVar, zzgyfVar);
        }

        public static zzat zzv(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzat) zzgyv.zzbs(zzu, zzgxtVar, zzgyfVar);
        }

        public static zzat zzw(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzat) zzgyv.zzbu(zzu, inputStream, zzgyfVar);
        }

        public static zzat zzx(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzat) zzgyv.zzbv(zzu, byteBuffer, zzgyfVar);
        }

        public static zzat zzy(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzat) zzgyv.zzbx(zzu, bArr, zzgyfVar);
        }

        public static zzhao<zzat> zzz() {
            return zzu.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zza() {
            return this.zzK;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzaA() {
            return (this.zzw & Constants.QUEUE_ELEMENT_MAX_SIZE) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzaB() {
            return (this.zzw & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzau zzaf() {
            zzau zzauVar = this.zzB;
            return zzauVar == null ? zzau.zzg() : zzauVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzay zzag() {
            zzay zzayVar = this.zzD;
            return zzayVar == null ? zzay.zzi() : zzayVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzba zzah() {
            zzba zzbaVar = this.zzx;
            return zzbaVar == null ? zzba.zzi() : zzbaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzbc zzai() {
            zzbc zzbcVar = this.zzC;
            return zzbcVar == null ? zzbc.zzh() : zzbcVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzbe zzaj() {
            zzbe zzbeVar = this.zzy;
            return zzbeVar == null ? zzbe.zzj() : zzbeVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzbg zzak() {
            zzbg zzbgVar = this.zzz;
            return zzbgVar == null ? zzbg.zzh() : zzbgVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzbj zzal() {
            zzbj zzbjVar = this.zzA;
            return zzbjVar == null ? zzbj.zzg() : zzbjVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzam() {
            return (this.zzw & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzan() {
            return (this.zzw & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzao() {
            return (this.zzw & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzap() {
            return (this.zzw & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzaq() {
            return (this.zzw & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzar() {
            return (this.zzw & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzas() {
            return (this.zzw & 8192) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzat() {
            return (this.zzw & 16384) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzau() {
            return (this.zzw & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzav() {
            return (this.zzw & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzaw() {
            return (this.zzw & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzax() {
            return (this.zzw & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzay() {
            return (this.zzw & 4096) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public boolean zzaz() {
            return (this.zzw & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zzb() {
            return this.zzL;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zzc() {
            return this.zzH;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zzd() {
            return this.zzE;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
            }
            if (iOrdinal == 3) {
                return new zzat();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzu;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzat> zzhaoVar = zzv;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzat.class) {
                try {
                    zzgyqVar = zzv;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzu);
                        zzv = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zze() {
            return this.zzF;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zzf() {
            return this.zzI;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public int zzg() {
            return this.zzJ;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public long zzh() {
            return this.zzM;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbi
        public zzap zzi() {
            zzap zzapVar = this.zzG;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzau extends zzgyv<zzau, zza> implements zzav {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzau zzd;
        private static volatile zzhao<zzau> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzau, zza> implements zzav {
            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public zzq zza() {
                return ((zzau) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public zzap zzb() {
                return ((zzau) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzau) this.zza).zzG();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzau) this.zza).zzH();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzau) this.zza).zzI();
                return this;
            }

            public zza zzf(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzg(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzh(zzaw.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzau) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzj(zzap.zza zzaVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzau) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzl(zzq zzqVar) {
                zzbu();
                ((zzau) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public zzaw zzm() {
                return ((zzau) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public boolean zzn() {
                return ((zzau) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public boolean zzo() {
                return ((zzau) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzav
            public boolean zzp() {
                return ((zzau) this.zza).zzp();
            }

            private zza() {
                super(zzau.zzd);
            }
        }

        static {
            zzau zzauVar = new zzau();
            zzd = zzauVar;
            zzgyv.zzbZ(zzau.class, zzauVar);
        }

        private zzau() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzc() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzd(zzau zzauVar) {
            return (zza) zzd.zzba(zzauVar);
        }

        public static zzau zzg() {
            return zzd;
        }

        public static zzau zzh(InputStream inputStream) throws IOException {
            return (zzau) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzau zzi(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzau) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzau zzj(zzgxn zzgxnVar) throws zzgzk {
            return (zzau) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzau zzk(zzgxt zzgxtVar) throws IOException {
            return (zzau) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzau zzl(InputStream inputStream) throws IOException {
            return (zzau) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzau zzq(ByteBuffer byteBuffer) throws zzgzk {
            return (zzau) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzau zzr(byte[] bArr) throws zzgzk {
            return (zzau) zzgyv.zzbq(zzd, bArr);
        }

        public static zzau zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzau) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzau zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzau) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzau zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzau) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzau zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzau) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzau zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzau) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public static zzhao<zzau> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzg);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzau();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzau> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzau.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public zzaw zzm() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzav
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzav extends zzhah {
        zzq zza();

        zzap zzb();

        zzaw zzm();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzaw extends zzgyv<zzaw, zza> implements zzax {
        public static final int zza = 1;
        private static final zzaw zzb;
        private static volatile zzhao<zzaw> zzc;
        private int zzd;
        private int zze;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzaw, zza> implements zzax {
            public zza zza() {
                zzbu();
                ((zzaw) this.zza).zzw();
                return this;
            }

            public zza zzb(zzb zzbVar) {
                zzbu();
                ((zzaw) this.zza).zzx(zzbVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzax
            public zzb zzc() {
                return ((zzaw) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzax
            public boolean zzd() {
                return ((zzaw) this.zza).zzd();
            }

            private zza() {
                super(zzaw.zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzb implements zzgyz {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            public static final int zze = 0;
            public static final int zzf = 1;
            public static final int zzg = 2;
            public static final int zzh = 3;
            private static final zzgza<zzb> zzi = new zzgza<zzb>() { // from class: com.google.android.gms.internal.ads.zzbch.zzaw.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzk;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzb.zzb(i) != null;
                }
            }

            zzb(int i) {
                this.zzk = i;
            }

            public static zzb zzb(int i) {
                if (i == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (i == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (i == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (i != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static zzgza<zzb> zzd() {
                return zzi;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzk);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzk;
            }
        }

        static {
            zzaw zzawVar = new zzaw();
            zzb = zzawVar;
            zzgyv.zzbZ(zzaw.class, zzawVar);
        }

        private zzaw() {
        }

        public static zza zza() {
            return (zza) zzb.zzaZ();
        }

        public static zza zzb(zzaw zzawVar) {
            return (zza) zzb.zzba(zzawVar);
        }

        public static zzaw zzg() {
            return zzb;
        }

        public static zzaw zzh(InputStream inputStream) throws IOException {
            return (zzaw) zzgyv.zzbk(zzb, inputStream);
        }

        public static zzaw zzi(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzaw) zzgyv.zzbl(zzb, inputStream, zzgyfVar);
        }

        public static zzaw zzj(zzgxn zzgxnVar) throws zzgzk {
            return (zzaw) zzgyv.zzbm(zzb, zzgxnVar);
        }

        public static zzaw zzk(zzgxt zzgxtVar) throws IOException {
            return (zzaw) zzgyv.zzbn(zzb, zzgxtVar);
        }

        public static zzaw zzl(InputStream inputStream) throws IOException {
            return (zzaw) zzgyv.zzbo(zzb, inputStream);
        }

        public static zzaw zzm(ByteBuffer byteBuffer) throws zzgzk {
            return (zzaw) zzgyv.zzbp(zzb, byteBuffer);
        }

        public static zzaw zzn(byte[] bArr) throws zzgzk {
            return (zzaw) zzgyv.zzbq(zzb, bArr);
        }

        public static zzaw zzo(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzaw) zzgyv.zzbr(zzb, zzgxnVar, zzgyfVar);
        }

        public static zzaw zzp(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzaw) zzgyv.zzbs(zzb, zzgxtVar, zzgyfVar);
        }

        public static zzaw zzq(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzaw) zzgyv.zzbu(zzb, inputStream, zzgyfVar);
        }

        public static zzaw zzr(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzaw) zzgyv.zzbv(zzb, byteBuffer, zzgyfVar);
        }

        public static zzaw zzs(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzaw) zzgyv.zzbx(zzb, bArr, zzgyfVar);
        }

        public static zzhao<zzaw> zzt() {
            return zzb.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzw() {
            this.zzd &= -2;
            this.zze = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzx(zzb zzbVar) {
            this.zze = zzbVar.zza();
            this.zzd |= 1;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzax
        public zzb zzc() {
            zzb zzbVarZzb = zzb.zzb(this.zze);
            return zzbVarZzb == null ? zzb.VIDEO_ERROR_CODE_UNSPECIFIED : zzbVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzax
        public boolean zzd() {
            return (this.zzd & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzb.zze()});
            }
            if (iOrdinal == 3) {
                return new zzaw();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzb;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzaw> zzhaoVar = zzc;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzaw.class) {
                try {
                    zzgyqVar = zzc;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzb);
                        zzc = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzax extends zzhah {
        zzaw.zzb zzc();

        boolean zzd();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzay extends zzgyv<zzay, zza> implements zzaz {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzay zze;
        private static volatile zzhao<zzay> zzf;
        private int zzg;
        private zzar zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzay, zza> implements zzaz {
            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public zzq zza() {
                return ((zzay) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public zzap zzb() {
                return ((zzay) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public zzar zzc() {
                return ((zzay) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public zzaw zzd() {
                return ((zzay) this.zza).zzd();
            }

            public zza zze() {
                zzbu();
                ((zzay) this.zza).zzL();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzay) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzay) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzay) this.zza).zzO();
                return this;
            }

            public zza zzi(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzP(zzawVar);
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzQ(zzapVar);
                return this;
            }

            public zza zzk(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzay) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzap.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzaVar.zzbr());
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzay) this.zza).zzT(zzapVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzay) this.zza).zzU(zzqVar);
                return this;
            }

            public zza zzq(zzar.zza zzaVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzaVar.zzbr());
                return this;
            }

            public zza zzr(zzar zzarVar) {
                zzbu();
                ((zzay) this.zza).zzV(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public boolean zzs() {
                return ((zzay) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public boolean zzt() {
                return ((zzay) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public boolean zzu() {
                return ((zzay) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaz
            public boolean zzv() {
                return ((zzay) this.zza).zzv();
            }

            private zza() {
                super(zzay.zze);
            }
        }

        static {
            zzay zzayVar = new zzay();
            zze = zzayVar;
            zzgyv.zzbZ(zzay.class, zzayVar);
        }

        private zzay() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL() {
            this.zzj = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzk = null;
            this.zzg &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -3;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzh;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzaVarZzf = zzar.zzf(zzarVar2);
                zzaVarZzf.zzbj(zzarVar);
                zzarVar = zzaVarZzf.zzbs();
            }
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzar zzarVar) {
            zzarVar.getClass();
            this.zzh = zzarVar;
            this.zzg |= 1;
        }

        public static zza zzf() {
            return (zza) zze.zzaZ();
        }

        public static zza zzg(zzay zzayVar) {
            return (zza) zze.zzba(zzayVar);
        }

        public static zzay zzi() {
            return zze;
        }

        public static zzay zzj(InputStream inputStream) throws IOException {
            return (zzay) zzgyv.zzbk(zze, inputStream);
        }

        public static zzay zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzay) zzgyv.zzbl(zze, inputStream, zzgyfVar);
        }

        public static zzay zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzay) zzgyv.zzbm(zze, zzgxnVar);
        }

        public static zzay zzm(zzgxt zzgxtVar) throws IOException {
            return (zzay) zzgyv.zzbn(zze, zzgxtVar);
        }

        public static zzay zzn(InputStream inputStream) throws IOException {
            return (zzay) zzgyv.zzbo(zze, inputStream);
        }

        public static zzay zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzay) zzgyv.zzbp(zze, byteBuffer);
        }

        public static zzay zzp(byte[] bArr) throws zzgzk {
            return (zzay) zzgyv.zzbq(zze, bArr);
        }

        public static zzay zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzay) zzgyv.zzbr(zze, zzgxnVar, zzgyfVar);
        }

        public static zzay zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzay) zzgyv.zzbs(zze, zzgxtVar, zzgyfVar);
        }

        public static zzay zzw(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzay) zzgyv.zzbu(zze, inputStream, zzgyfVar);
        }

        public static zzay zzx(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzay) zzgyv.zzbv(zze, byteBuffer, zzgyfVar);
        }

        public static zzay zzy(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzay) zzgyv.zzbx(zze, bArr, zzgyfVar);
        }

        public static zzhao<zzay> zzz() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzi);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public zzap zzb() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public zzar zzc() {
            zzar zzarVar = this.zzh;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public zzaw zzd() {
            zzaw zzawVar = this.zzj;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzay();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zze;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzay> zzhaoVar = zzf;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzay.class) {
                try {
                    zzgyqVar = zzf;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zze);
                        zzf = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public boolean zzt() {
            return (this.zzg & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public boolean zzu() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaz
        public boolean zzv() {
            return (this.zzg & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzaz extends zzhah {
        zzq zza();

        zzap zzb();

        zzar zzc();

        zzaw zzd();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzb extends zzgyv<zzb, zzc> implements zzc {
        public static final int zza = 1;
        private static final zzb zzb;
        private static volatile zzhao<zzb> zzc;
        private zzgzh<zza> zzd = zzgyv.zzbK();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyv<zza, C0336zza> implements InterfaceC0337zzb {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zza zzd;
            private static volatile zzhao<zza> zze;
            private int zzf;
            private int zzg;
            private zze zzh;
            private zzg zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbch$zzb$zza$zza, reason: collision with other inner class name */
            public final class C0336zza extends zzgyp<zza, C0336zza> implements InterfaceC0337zzb {
                public C0336zza zza() {
                    zzbu();
                    ((zza) this.zza).zzG();
                    return this;
                }

                public C0336zza zzb() {
                    zzbu();
                    ((zza) this.zza).zzH();
                    return this;
                }

                public C0336zza zzc() {
                    zzbu();
                    ((zza) this.zza).zzI();
                    return this;
                }

                public C0336zza zzd(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzJ(zzeVar);
                    return this;
                }

                public C0336zza zze(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzK(zzgVar);
                    return this;
                }

                public C0336zza zzf(zzd zzdVar) {
                    zzbu();
                    ((zza) this.zza).zzL(zzdVar);
                    return this;
                }

                public C0336zza zzg(zze.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzaVar.zzbr());
                    return this;
                }

                public C0336zza zzh(zze zzeVar) {
                    zzbu();
                    ((zza) this.zza).zzM(zzeVar);
                    return this;
                }

                public C0336zza zzi(zzg.zza zzaVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzaVar.zzbr());
                    return this;
                }

                public C0336zza zzj(zzg zzgVar) {
                    zzbu();
                    ((zza) this.zza).zzN(zzgVar);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public zzd zzk() {
                    return ((zza) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public zze zzl() {
                    return ((zza) this.zza).zzl();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public zzg zzm() {
                    return ((zza) this.zza).zzm();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public boolean zzn() {
                    return ((zza) this.zza).zzn();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public boolean zzo() {
                    return ((zza) this.zza).zzo();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
                public boolean zzp() {
                    return ((zza) this.zza).zzp();
                }

                private C0336zza() {
                    super(zza.zzd);
                }
            }

            static {
                zza zzaVar = new zza();
                zzd = zzaVar;
                zzgyv.zzbZ(zza.class, zzaVar);
            }

            private zza() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -2;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH() {
                this.zzh = null;
                this.zzf &= -3;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI() {
                this.zzi = null;
                this.zzf &= -5;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(zze zzeVar) {
                zzeVar.getClass();
                zze zzeVar2 = this.zzh;
                if (zzeVar2 != null && zzeVar2 != zze.zzi()) {
                    zze.zza zzaVarZzc = zze.zzc(zzeVar2);
                    zzaVarZzc.zzbj(zzeVar);
                    zzeVar = zzaVarZzc.zzbs();
                }
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzK(zzg zzgVar) {
                zzgVar.getClass();
                zzg zzgVar2 = this.zzi;
                if (zzgVar2 != null && zzgVar2 != zzg.zzf()) {
                    zzg.zza zzaVarZzc = zzg.zzc(zzgVar2);
                    zzaVarZzc.zzbj(zzgVar);
                    zzgVar = zzaVarZzc.zzbs();
                }
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzL(zzd zzdVar) {
                this.zzg = zzdVar.zza();
                this.zzf |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzM(zze zzeVar) {
                zzeVar.getClass();
                this.zzh = zzeVar;
                this.zzf |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzN(zzg zzgVar) {
                zzgVar.getClass();
                this.zzi = zzgVar;
                this.zzf |= 4;
            }

            public static C0336zza zza() {
                return (C0336zza) zzd.zzaZ();
            }

            public static C0336zza zzb(zza zzaVar) {
                return (C0336zza) zzd.zzba(zzaVar);
            }

            public static zza zzd() {
                return zzd;
            }

            public static zza zzf(InputStream inputStream) throws IOException {
                return (zza) zzgyv.zzbk(zzd, inputStream);
            }

            public static zza zzg(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
            }

            public static zza zzh(zzgxn zzgxnVar) throws zzgzk {
                return (zza) zzgyv.zzbm(zzd, zzgxnVar);
            }

            public static zza zzi(zzgxt zzgxtVar) throws IOException {
                return (zza) zzgyv.zzbn(zzd, zzgxtVar);
            }

            public static zza zzj(InputStream inputStream) throws IOException {
                return (zza) zzgyv.zzbo(zzd, inputStream);
            }

            public static zza zzq(ByteBuffer byteBuffer) throws zzgzk {
                return (zza) zzgyv.zzbp(zzd, byteBuffer);
            }

            public static zza zzr(byte[] bArr) throws zzgzk {
                return (zza) zzgyv.zzbq(zzd, bArr);
            }

            public static zza zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
            }

            public static zza zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
            }

            public static zza zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zza) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
            }

            public static zza zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
            }

            public static zza zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
                return (zza) zzgyv.zzbx(zzd, bArr, zzgyfVar);
            }

            public static zzhao<zza> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzgyv
            public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
                zzhao zzgyqVar;
                int iOrdinal = zzgyuVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzd.zze(), "zzh", "zzi"});
                }
                if (iOrdinal == 3) {
                    return new zza();
                }
                if (iOrdinal == 4) {
                    return new C0336zza();
                }
                if (iOrdinal == 5) {
                    return zzd;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzhao<zza> zzhaoVar = zze;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zza.class) {
                    try {
                        zzgyqVar = zze;
                        if (zzgyqVar == null) {
                            zzgyqVar = new zzgyq(zzd);
                            zze = zzgyqVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzgyqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public zzd zzk() {
                zzd zzdVarZzb = zzd.zzb(this.zzg);
                return zzdVarZzb == null ? zzd.UNSPECIFIED : zzdVarZzb;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public zze zzl() {
                zze zzeVar = this.zzh;
                return zzeVar == null ? zze.zzi() : zzeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public zzg zzm() {
                zzg zzgVar = this.zzi;
                return zzgVar == null ? zzg.zzf() : zzgVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public boolean zzn() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public boolean zzo() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.InterfaceC0337zzb
            public boolean zzp() {
                return (this.zzf & 4) != 0;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        /* renamed from: com.google.android.gms.internal.ads.zzbch$zzb$zzb, reason: collision with other inner class name */
        public interface InterfaceC0337zzb extends zzhah {
            zzd zzk();

            zze zzl();

            zzg zzm();

            boolean zzn();

            boolean zzo();

            boolean zzp();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zzc extends zzgyp<zzb, zzc> implements zzc {
            @Override // com.google.android.gms.internal.ads.zzbch.zzc
            public int zza() {
                return ((zzb) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzc
            public zza zzb(int i) {
                return ((zzb) this.zza).zzb(i);
            }

            public zzc zzc(Iterable<? extends zza> iterable) {
                zzbu();
                ((zzb) this.zza).zzD(iterable);
                return this;
            }

            public zzc zzd(zza.C0336zza c0336zza) {
                zzbu();
                ((zzb) this.zza).zzE(c0336zza.zzbr());
                return this;
            }

            public zzc zze(zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzE(zzaVar);
                return this;
            }

            public zzc zzf(int i, zza.C0336zza c0336zza) {
                zzbu();
                ((zzb) this.zza).zzF(i, c0336zza.zzbr());
                return this;
            }

            public zzc zzg(int i, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzF(i, zzaVar);
                return this;
            }

            public zzc zzh() {
                zzbu();
                ((zzb) this.zza).zzG();
                return this;
            }

            public zzc zzi(int i) {
                zzbu();
                ((zzb) this.zza).zzI(i);
                return this;
            }

            public zzc zzj(int i, zza.C0336zza c0336zza) {
                zzbu();
                ((zzb) this.zza).zzJ(i, c0336zza.zzbr());
                return this;
            }

            public zzc zzk(int i, zza zzaVar) {
                zzbu();
                ((zzb) this.zza).zzJ(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzc
            public List<zza> zzl() {
                return Collections.unmodifiableList(((zzb) this.zza).zzl());
            }

            private zzc() {
                super(zzb.zzb);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzd implements zzgyz {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            public static final int zzc = 0;
            public static final int zzd = 1;
            private static final zzgza<zzd> zze = new zzgza<zzd>() { // from class: com.google.android.gms.internal.ads.zzbch.zzb.zzd.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzd zzb(int i) {
                    return zzd.zzb(i);
                }
            };
            private final int zzg;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzd.zzb(i) != null;
                }
            }

            zzd(int i) {
                this.zzg = i;
            }

            public static zzd zzb(int i) {
                if (i == 0) {
                    return UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static zzgza<zzd> zzd() {
                return zze;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzg);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzg;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zze extends zzgyv<zze, zza> implements zzf {
            public static final int zza = 1;
            public static final int zzb = 2;
            private static final zze zzc;
            private static volatile zzhao<zze> zzd;
            private int zze;
            private boolean zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            public final class zza extends zzgyp<zze, zza> implements zzf {
                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
                public int zza() {
                    return ((zze) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zze) this.zza).zzA();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zze) this.zza).zzB();
                    return this;
                }

                public zza zzd(boolean z10) {
                    zzbu();
                    ((zze) this.zza).zzC(z10);
                    return this;
                }

                public zza zze(int i) {
                    zzbu();
                    ((zze) this.zza).zzD(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
                public boolean zzf() {
                    return ((zze) this.zza).zzf();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
                public boolean zzg() {
                    return ((zze) this.zza).zzg();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
                public boolean zzh() {
                    return ((zze) this.zza).zzh();
                }

                private zza() {
                    super(zze.zzc);
                }
            }

            static {
                zze zzeVar = new zze();
                zzc = zzeVar;
                zzgyv.zzbZ(zze.class, zzeVar);
            }

            private zze() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzA() {
                this.zze &= -2;
                this.zzf = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzB() {
                this.zze &= -3;
                this.zzg = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzC(boolean z10) {
                this.zze |= 1;
                this.zzf = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzD(int i) {
                this.zze |= 2;
                this.zzg = i;
            }

            public static zza zzb() {
                return (zza) zzc.zzaZ();
            }

            public static zza zzc(zze zzeVar) {
                return (zza) zzc.zzba(zzeVar);
            }

            public static zze zzi() {
                return zzc;
            }

            public static zze zzj(InputStream inputStream) throws IOException {
                return (zze) zzgyv.zzbk(zzc, inputStream);
            }

            public static zze zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zze) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
            }

            public static zze zzl(zzgxn zzgxnVar) throws zzgzk {
                return (zze) zzgyv.zzbm(zzc, zzgxnVar);
            }

            public static zze zzm(zzgxt zzgxtVar) throws IOException {
                return (zze) zzgyv.zzbn(zzc, zzgxtVar);
            }

            public static zze zzn(InputStream inputStream) throws IOException {
                return (zze) zzgyv.zzbo(zzc, inputStream);
            }

            public static zze zzo(ByteBuffer byteBuffer) throws zzgzk {
                return (zze) zzgyv.zzbp(zzc, byteBuffer);
            }

            public static zze zzp(byte[] bArr) throws zzgzk {
                return (zze) zzgyv.zzbq(zzc, bArr);
            }

            public static zze zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
                return (zze) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
            }

            public static zze zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
                return (zze) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
            }

            public static zze zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zze) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
            }

            public static zze zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
                return (zze) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
            }

            public static zze zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
                return (zze) zzgyv.zzbx(zzc, bArr, zzgyfVar);
            }

            public static zzhao<zze> zzv() {
                return zzc.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
            public int zza() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzgyv
            public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
                zzhao zzgyqVar;
                int iOrdinal = zzgyuVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
                }
                if (iOrdinal == 3) {
                    return new zze();
                }
                if (iOrdinal == 4) {
                    return new zza();
                }
                if (iOrdinal == 5) {
                    return zzc;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzhao<zze> zzhaoVar = zzd;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zze.class) {
                    try {
                        zzgyqVar = zzd;
                        if (zzgyqVar == null) {
                            zzgyqVar = new zzgyq(zzc);
                            zzd = zzgyqVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzgyqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
            public boolean zzf() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
            public boolean zzg() {
                return (this.zze & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzf
            public boolean zzh() {
                return (this.zze & 2) != 0;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public interface zzf extends zzhah {
            int zza();

            boolean zzf();

            boolean zzg();

            boolean zzh();
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zzg extends zzgyv<zzg, zza> implements zzh {
            public static final int zza = 1;
            public static final int zzb = 2;
            public static final int zzc = 3;
            private static final zzg zzd;
            private static volatile zzhao<zzg> zze;
            private int zzf;
            private boolean zzg;
            private boolean zzh;
            private int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            public final class zza extends zzgyp<zzg, zza> implements zzh {
                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public int zza() {
                    return ((zzg) this.zza).zza();
                }

                public zza zzb() {
                    zzbu();
                    ((zzg) this.zza).zzE();
                    return this;
                }

                public zza zzc() {
                    zzbu();
                    ((zzg) this.zza).zzF();
                    return this;
                }

                public zza zzd() {
                    zzbu();
                    ((zzg) this.zza).zzG();
                    return this;
                }

                public zza zze(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzH(z10);
                    return this;
                }

                public zza zzf(boolean z10) {
                    zzbu();
                    ((zzg) this.zza).zzI(z10);
                    return this;
                }

                public zza zzg(int i) {
                    zzbu();
                    ((zzg) this.zza).zzJ(i);
                    return this;
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public boolean zzh() {
                    return ((zzg) this.zza).zzh();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public boolean zzi() {
                    return ((zzg) this.zza).zzi();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public boolean zzj() {
                    return ((zzg) this.zza).zzj();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public boolean zzk() {
                    return ((zzg) this.zza).zzk();
                }

                @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
                public boolean zzl() {
                    return ((zzg) this.zza).zzl();
                }

                private zza() {
                    super(zzg.zzd);
                }
            }

            static {
                zzg zzgVar = new zzg();
                zzd = zzgVar;
                zzgyv.zzbZ(zzg.class, zzgVar);
            }

            private zzg() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzE() {
                this.zzf &= -2;
                this.zzg = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzF() {
                this.zzf &= -3;
                this.zzh = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzG() {
                this.zzf &= -5;
                this.zzi = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzH(boolean z10) {
                this.zzf |= 1;
                this.zzg = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzI(boolean z10) {
                this.zzf |= 2;
                this.zzh = z10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void zzJ(int i) {
                this.zzf |= 4;
                this.zzi = i;
            }

            public static zza zzb() {
                return (zza) zzd.zzaZ();
            }

            public static zza zzc(zzg zzgVar) {
                return (zza) zzd.zzba(zzgVar);
            }

            public static zzg zzf() {
                return zzd;
            }

            public static zzg zzg(InputStream inputStream) throws IOException {
                return (zzg) zzgyv.zzbk(zzd, inputStream);
            }

            public static zzg zzm(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zzg) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
            }

            public static zzg zzn(zzgxn zzgxnVar) throws zzgzk {
                return (zzg) zzgyv.zzbm(zzd, zzgxnVar);
            }

            public static zzg zzo(zzgxt zzgxtVar) throws IOException {
                return (zzg) zzgyv.zzbn(zzd, zzgxtVar);
            }

            public static zzg zzp(InputStream inputStream) throws IOException {
                return (zzg) zzgyv.zzbo(zzd, inputStream);
            }

            public static zzg zzq(ByteBuffer byteBuffer) throws zzgzk {
                return (zzg) zzgyv.zzbp(zzd, byteBuffer);
            }

            public static zzg zzr(byte[] bArr) throws zzgzk {
                return (zzg) zzgyv.zzbq(zzd, bArr);
            }

            public static zzg zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
                return (zzg) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
            }

            public static zzg zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
                return (zzg) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
            }

            public static zzg zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
                return (zzg) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
            }

            public static zzg zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
                return (zzg) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
            }

            public static zzg zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
                return (zzg) zzgyv.zzbx(zzd, bArr, zzgyfVar);
            }

            public static zzhao<zzg> zzx() {
                return zzd.zzbN();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public int zza() {
                return this.zzi;
            }

            @Override // com.google.android.gms.internal.ads.zzgyv
            public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
                zzhao zzgyqVar;
                int iOrdinal = zzgyuVar.ordinal();
                if (iOrdinal == 0) {
                    return (byte) 1;
                }
                if (iOrdinal == 2) {
                    return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                }
                if (iOrdinal == 3) {
                    return new zzg();
                }
                if (iOrdinal == 4) {
                    return new zza();
                }
                if (iOrdinal == 5) {
                    return zzd;
                }
                if (iOrdinal != 6) {
                    throw null;
                }
                zzhao<zzg> zzhaoVar = zze;
                if (zzhaoVar != null) {
                    return zzhaoVar;
                }
                synchronized (zzg.class) {
                    try {
                        zzgyqVar = zze;
                        if (zzgyqVar == null) {
                            zzgyqVar = new zzgyq(zzd);
                            zze = zzgyqVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return zzgyqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public boolean zzh() {
                return this.zzg;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public boolean zzi() {
                return this.zzh;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public boolean zzj() {
                return (this.zzf & 1) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public boolean zzk() {
                return (this.zzf & 2) != 0;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzb.zzh
            public boolean zzl() {
                return (this.zzf & 4) != 0;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public interface zzh extends zzhah {
            int zza();

            boolean zzh();

            boolean zzi();

            boolean zzj();

            boolean zzk();

            boolean zzl();
        }

        static {
            zzb zzbVar = new zzb();
            zzb = zzbVar;
            zzgyv.zzbZ(zzb.class, zzbVar);
        }

        private zzb() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(Iterable<? extends zza> iterable) {
            zzH();
            zzgww.zzaQ(iterable, this.zzd);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(int i, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.add(i, zzaVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzd = zzgyv.zzbK();
        }

        private void zzH() {
            zzgzh<zza> zzgzhVar = this.zzd;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzd = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i) {
            zzH();
            this.zzd.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(int i, zza zzaVar) {
            zzaVar.getClass();
            zzH();
            this.zzd.set(i, zzaVar);
        }

        public static zzc zzd() {
            return (zzc) zzb.zzaZ();
        }

        public static zzc zzf(zzb zzbVar) {
            return (zzc) zzb.zzba(zzbVar);
        }

        public static zzb zzh() {
            return zzb;
        }

        public static zzb zzi(InputStream inputStream) throws IOException {
            return (zzb) zzgyv.zzbk(zzb, inputStream);
        }

        public static zzb zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzb) zzgyv.zzbl(zzb, inputStream, zzgyfVar);
        }

        public static zzb zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzb) zzgyv.zzbm(zzb, zzgxnVar);
        }

        public static zzb zzm(zzgxt zzgxtVar) throws IOException {
            return (zzb) zzgyv.zzbn(zzb, zzgxtVar);
        }

        public static zzb zzn(InputStream inputStream) throws IOException {
            return (zzb) zzgyv.zzbo(zzb, inputStream);
        }

        public static zzb zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzb) zzgyv.zzbp(zzb, byteBuffer);
        }

        public static zzb zzp(byte[] bArr) throws zzgzk {
            return (zzb) zzgyv.zzbq(zzb, bArr);
        }

        public static zzb zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzb) zzgyv.zzbr(zzb, zzgxnVar, zzgyfVar);
        }

        public static zzb zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzb) zzgyv.zzbs(zzb, zzgxtVar, zzgyfVar);
        }

        public static zzb zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzb) zzgyv.zzbu(zzb, inputStream, zzgyfVar);
        }

        public static zzb zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzb) zzgyv.zzbv(zzb, byteBuffer, zzgyfVar);
        }

        public static zzb zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzb) zzgyv.zzbx(zzb, bArr, zzgyfVar);
        }

        public static zzhao<zzb> zzv() {
            return zzb.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzc
        public int zza() {
            return this.zzd.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzc
        public zza zzb(int i) {
            return this.zzd.get(i);
        }

        public InterfaceC0337zzb zzc(int i) {
            return this.zzd.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zza.class});
            }
            if (iOrdinal == 3) {
                return new zzb();
            }
            if (iOrdinal == 4) {
                return new zzc();
            }
            if (iOrdinal == 5) {
                return zzb;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzb> zzhaoVar = zzc;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzb.class) {
                try {
                    zzgyqVar = zzc;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzb);
                        zzc = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzc
        public List<zza> zzl() {
            return this.zzd;
        }

        public List<? extends InterfaceC0337zzb> zzw() {
            return this.zzd;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzba extends zzgyv<zzba, zza> implements zzbb {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzba zzf;
        private static volatile zzhao<zzba> zzg;
        private int zzh;
        private int zzi = 1000;
        private zzaw zzj;
        private int zzk;
        private int zzl;
        private int zzm;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzba, zza> implements zzbb {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public int zza() {
                return ((zzba) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public int zzb() {
                return ((zzba) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public int zzc() {
                return ((zzba) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public zzq zzd() {
                return ((zzba) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public zzaw zze() {
                return ((zzba) this.zza).zze();
            }

            public zza zzf() {
                zzbu();
                ((zzba) this.zza).zzM();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzba) this.zza).zzN();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzba) this.zza).zzO();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzba) this.zza).zzP();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzba) this.zza).zzQ();
                return this;
            }

            public zza zzk(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzR(zzawVar);
                return this;
            }

            public zza zzl(zzaw.zza zzaVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzba) this.zza).zzS(zzawVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzba) this.zza).zzT(zzqVar);
                return this;
            }

            public zza zzo(int i) {
                zzbu();
                ((zzba) this.zza).zzU(i);
                return this;
            }

            public zza zzp(int i) {
                zzbu();
                ((zzba) this.zza).zzV(i);
                return this;
            }

            public zza zzq(int i) {
                zzbu();
                ((zzba) this.zza).zzW(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public boolean zzr() {
                return ((zzba) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public boolean zzs() {
                return ((zzba) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public boolean zzt() {
                return ((zzba) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public boolean zzu() {
                return ((zzba) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbb
            public boolean zzv() {
                return ((zzba) this.zza).zzv();
            }

            private zza() {
                super(zzba.zzf);
            }
        }

        static {
            zzba zzbaVar = new zzba();
            zzf = zzbaVar;
            zzgyv.zzbZ(zzba.class, zzbaVar);
        }

        private zzba() {
        }

        public static zzhao<zzba> zzA() {
            return zzf.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM() {
            this.zzj = null;
            this.zzh &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzh &= -2;
            this.zzi = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzh &= -17;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzh &= -5;
            this.zzk = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzh &= -9;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzj;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzj = zzawVar;
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(int i) {
            this.zzh |= 16;
            this.zzm = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(int i) {
            this.zzh |= 4;
            this.zzk = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(int i) {
            this.zzh |= 8;
            this.zzl = i;
        }

        public static zza zzf() {
            return (zza) zzf.zzaZ();
        }

        public static zza zzg(zzba zzbaVar) {
            return (zza) zzf.zzba(zzbaVar);
        }

        public static zzba zzi() {
            return zzf;
        }

        public static zzba zzj(InputStream inputStream) throws IOException {
            return (zzba) zzgyv.zzbk(zzf, inputStream);
        }

        public static zzba zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzba) zzgyv.zzbl(zzf, inputStream, zzgyfVar);
        }

        public static zzba zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzba) zzgyv.zzbm(zzf, zzgxnVar);
        }

        public static zzba zzm(zzgxt zzgxtVar) throws IOException {
            return (zzba) zzgyv.zzbn(zzf, zzgxtVar);
        }

        public static zzba zzn(InputStream inputStream) throws IOException {
            return (zzba) zzgyv.zzbo(zzf, inputStream);
        }

        public static zzba zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzba) zzgyv.zzbp(zzf, byteBuffer);
        }

        public static zzba zzp(byte[] bArr) throws zzgzk {
            return (zzba) zzgyv.zzbq(zzf, bArr);
        }

        public static zzba zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzba) zzgyv.zzbr(zzf, zzgxnVar, zzgyfVar);
        }

        public static zzba zzw(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzba) zzgyv.zzbs(zzf, zzgxtVar, zzgyfVar);
        }

        public static zzba zzx(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzba) zzgyv.zzbu(zzf, inputStream, zzgyfVar);
        }

        public static zzba zzy(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzba) zzgyv.zzbv(zzf, byteBuffer, zzgyfVar);
        }

        public static zzba zzz(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzba) zzgyv.zzbx(zzf, bArr, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public int zza() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public int zzb() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public int zzc() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public zzq zzd() {
            zzq zzqVarZzb = zzq.zzb(this.zzi);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", zzq.zze(), "zzj", "zzk", "zzl", "zzm"});
            }
            if (iOrdinal == 3) {
                return new zzba();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzba> zzhaoVar = zzg;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzba.class) {
                try {
                    zzgyqVar = zzg;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzf);
                        zzg = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public zzaw zze() {
            zzaw zzawVar = this.zzj;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public boolean zzr() {
            return (this.zzh & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public boolean zzs() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public boolean zzt() {
            return (this.zzh & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public boolean zzu() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbb
        public boolean zzv() {
            return (this.zzh & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbb extends zzhah {
        int zza();

        int zzb();

        int zzc();

        zzq zzd();

        zzaw zze();

        boolean zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzbc extends zzgyv<zzbc, zza> implements zzbd {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbc zzd;
        private static volatile zzhao<zzbc> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzbc, zza> implements zzbd {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public zzq zza() {
                return ((zzbc) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public zzap zzb() {
                return ((zzbc) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public zzaw zzc() {
                return ((zzbc) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbc) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbc) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbc) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbc) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbc) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbc) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public boolean zzn() {
                return ((zzbc) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public boolean zzo() {
                return ((zzbc) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbd
            public boolean zzp() {
                return ((zzbc) this.zza).zzp();
            }

            private zza() {
                super(zzbc.zzd);
            }
        }

        static {
            zzbc zzbcVar = new zzbc();
            zzd = zzbcVar;
            zzgyv.zzbZ(zzbc.class, zzbcVar);
        }

        private zzbc() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzf(zzbc zzbcVar) {
            return (zza) zzd.zzba(zzbcVar);
        }

        public static zzbc zzh() {
            return zzd;
        }

        public static zzbc zzi(InputStream inputStream) throws IOException {
            return (zzbc) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzbc zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbc) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzbc zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzbc) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzbc zzl(zzgxt zzgxtVar) throws IOException {
            return (zzbc) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzbc zzm(InputStream inputStream) throws IOException {
            return (zzbc) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzbc zzq(ByteBuffer byteBuffer) throws zzgzk {
            return (zzbc) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzbc zzr(byte[] bArr) throws zzgzk {
            return (zzbc) zzgyv.zzbq(zzd, bArr);
        }

        public static zzbc zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzbc) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzbc zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzbc) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzbc zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbc) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzbc zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzbc) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzbc zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzbc) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public static zzhao<zzbc> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzg);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzbc();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzbc> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzbc.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbd
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbd extends zzhah {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzbe extends zzgyv<zzbe, zza> implements zzbf {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzbe zzg;
        private static volatile zzhao<zzbe> zzh;
        private int zzi;
        private int zzj = 1000;
        private zzaw zzk;
        private int zzl;
        private int zzm;
        private int zzn;
        private long zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzbe, zza> implements zzbf {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public int zza() {
                return ((zzbe) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public int zzb() {
                return ((zzbe) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public int zzc() {
                return ((zzbe) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public long zzd() {
                return ((zzbe) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public zzq zze() {
                return ((zzbe) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public zzaw zzf() {
                return ((zzbe) this.zza).zzf();
            }

            public zza zzg() {
                zzbu();
                ((zzbe) this.zza).zzQ();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzbe) this.zza).zzR();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzbe) this.zza).zzS();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzbe) this.zza).zzT();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzbe) this.zza).zzU();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzbe) this.zza).zzV();
                return this;
            }

            public zza zzm(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzW(zzawVar);
                return this;
            }

            public zza zzn(long j4) {
                zzbu();
                ((zzbe) this.zza).zzX(j4);
                return this;
            }

            public zza zzo(zzaw.zza zzaVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzp(zzaw zzawVar) {
                zzbu();
                ((zzbe) this.zza).zzY(zzawVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzbe) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzr(int i) {
                zzbu();
                ((zzbe) this.zza).zzaa(i);
                return this;
            }

            public zza zzs(int i) {
                zzbu();
                ((zzbe) this.zza).zzab(i);
                return this;
            }

            public zza zzt(int i) {
                zzbu();
                ((zzbe) this.zza).zzac(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzu() {
                return ((zzbe) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzv() {
                return ((zzbe) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzw() {
                return ((zzbe) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzx() {
                return ((zzbe) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzy() {
                return ((zzbe) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbf
            public boolean zzz() {
                return ((zzbe) this.zza).zzz();
            }

            private zza() {
                super(zzbe.zzg);
            }
        }

        static {
            zzbe zzbeVar = new zzbe();
            zzg = zzbeVar;
            zzgyv.zzbZ(zzbe.class, zzbeVar);
        }

        private zzbe() {
        }

        public static zzbe zzA(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzbe) zzgyv.zzbv(zzg, byteBuffer, zzgyfVar);
        }

        public static zzbe zzB(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzbe) zzgyv.zzbx(zzg, bArr, zzgyfVar);
        }

        public static zzhao<zzbe> zzC() {
            return zzg.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzi &= -33;
            this.zzo = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzi &= -2;
            this.zzj = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzi &= -17;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzi &= -5;
            this.zzl = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzi &= -9;
            this.zzm = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzk;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(long j4) {
            this.zzi |= 32;
            this.zzo = j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzk = zzawVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzi |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i) {
            this.zzi |= 16;
            this.zzn = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i) {
            this.zzi |= 4;
            this.zzl = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(int i) {
            this.zzi |= 8;
            this.zzm = i;
        }

        public static zza zzg() {
            return (zza) zzg.zzaZ();
        }

        public static zza zzh(zzbe zzbeVar) {
            return (zza) zzg.zzba(zzbeVar);
        }

        public static zzbe zzj() {
            return zzg;
        }

        public static zzbe zzk(InputStream inputStream) throws IOException {
            return (zzbe) zzgyv.zzbk(zzg, inputStream);
        }

        public static zzbe zzl(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbe) zzgyv.zzbl(zzg, inputStream, zzgyfVar);
        }

        public static zzbe zzm(zzgxn zzgxnVar) throws zzgzk {
            return (zzbe) zzgyv.zzbm(zzg, zzgxnVar);
        }

        public static zzbe zzn(zzgxt zzgxtVar) throws IOException {
            return (zzbe) zzgyv.zzbn(zzg, zzgxtVar);
        }

        public static zzbe zzo(InputStream inputStream) throws IOException {
            return (zzbe) zzgyv.zzbo(zzg, inputStream);
        }

        public static zzbe zzp(ByteBuffer byteBuffer) throws zzgzk {
            return (zzbe) zzgyv.zzbp(zzg, byteBuffer);
        }

        public static zzbe zzq(byte[] bArr) throws zzgzk {
            return (zzbe) zzgyv.zzbq(zzg, bArr);
        }

        public static zzbe zzr(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzbe) zzgyv.zzbr(zzg, zzgxnVar, zzgyfVar);
        }

        public static zzbe zzs(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzbe) zzgyv.zzbs(zzg, zzgxtVar, zzgyfVar);
        }

        public static zzbe zzt(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbe) zzgyv.zzbu(zzg, inputStream, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public int zza() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public int zzb() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public int zzc() {
            return this.zzm;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public long zzd() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", zzq.zze(), "zzk", "zzl", "zzm", "zzn", "zzo"});
            }
            if (iOrdinal == 3) {
                return new zzbe();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzg;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzbe> zzhaoVar = zzh;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzbe.class) {
                try {
                    zzgyqVar = zzh;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzg);
                        zzh = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public zzq zze() {
            zzq zzqVarZzb = zzq.zzb(this.zzj);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public zzaw zzf() {
            zzaw zzawVar = this.zzk;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzu() {
            return (this.zzi & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzv() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzw() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzx() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzy() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbf
        public boolean zzz() {
            return (this.zzi & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbf extends zzhah {
        int zza();

        int zzb();

        int zzc();

        long zzd();

        zzq zze();

        zzaw zzf();

        boolean zzu();

        boolean zzv();

        boolean zzw();

        boolean zzx();

        boolean zzy();

        boolean zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzbg extends zzgyv<zzbg, zza> implements zzbh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzbg zzd;
        private static volatile zzhao<zzbg> zze;
        private int zzf;
        private int zzg = 1000;
        private zzaw zzh;
        private zzap zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzbg, zza> implements zzbh {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public zzq zza() {
                return ((zzbg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public zzap zzb() {
                return ((zzbg) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public zzaw zzc() {
                return ((zzbg) this.zza).zzc();
            }

            public zza zzd() {
                zzbu();
                ((zzbg) this.zza).zzG();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzbg) this.zza).zzH();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzbg) this.zza).zzI();
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzJ(zzawVar);
                return this;
            }

            public zza zzh(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzK(zzapVar);
                return this;
            }

            public zza zzi(zzaw.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzaVar.zzbr());
                return this;
            }

            public zza zzj(zzaw zzawVar) {
                zzbu();
                ((zzbg) this.zza).zzL(zzawVar);
                return this;
            }

            public zza zzk(zzap.zza zzaVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzaVar.zzbr());
                return this;
            }

            public zza zzl(zzap zzapVar) {
                zzbu();
                ((zzbg) this.zza).zzM(zzapVar);
                return this;
            }

            public zza zzm(zzq zzqVar) {
                zzbu();
                ((zzbg) this.zza).zzN(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public boolean zzn() {
                return ((zzbg) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public boolean zzo() {
                return ((zzbg) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbh
            public boolean zzp() {
                return ((zzbg) this.zza).zzp();
            }

            private zza() {
                super(zzbg.zzd);
            }
        }

        static {
            zzbg zzbgVar = new zzbg();
            zzd = zzbgVar;
            zzgyv.zzbZ(zzbg.class, zzbgVar);
        }

        private zzbg() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zzh = null;
            this.zzf &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzH() {
            this.zzi = null;
            this.zzf &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI() {
            this.zzf &= -2;
            this.zzg = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzh;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzK(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzi;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzL(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzh = zzawVar;
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzM(zzap zzapVar) {
            zzapVar.getClass();
            this.zzi = zzapVar;
            this.zzf |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(zzq zzqVar) {
            this.zzg = zzqVar.zza();
            this.zzf |= 1;
        }

        public static zza zzd() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzf(zzbg zzbgVar) {
            return (zza) zzd.zzba(zzbgVar);
        }

        public static zzbg zzh() {
            return zzd;
        }

        public static zzbg zzi(InputStream inputStream) throws IOException {
            return (zzbg) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzbg zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbg) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzbg zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzbg) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzbg zzl(zzgxt zzgxtVar) throws IOException {
            return (zzbg) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzbg zzm(InputStream inputStream) throws IOException {
            return (zzbg) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzbg zzq(ByteBuffer byteBuffer) throws zzgzk {
            return (zzbg) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzbg zzr(byte[] bArr) throws zzgzk {
            return (zzbg) zzgyv.zzbq(zzd, bArr);
        }

        public static zzbg zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzbg) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzbg zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzbg) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzbg zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbg) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzbg zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzbg) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzbg zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzbg) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public static zzhao<zzbg> zzx() {
            return zzd.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzg);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public zzap zzb() {
            zzap zzapVar = this.zzi;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public zzaw zzc() {
            zzaw zzawVar = this.zzh;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", zzq.zze(), "zzh", "zzi"});
            }
            if (iOrdinal == 3) {
                return new zzbg();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzbg> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzbg.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public boolean zzn() {
            return (this.zzf & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public boolean zzo() {
            return (this.zzf & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbh
        public boolean zzp() {
            return (this.zzf & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbh extends zzhah {
        zzq zza();

        zzap zzb();

        zzaw zzc();

        boolean zzn();

        boolean zzo();

        boolean zzp();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbi extends zzhah {
        int zza();

        boolean zzaA();

        boolean zzaB();

        zzau zzaf();

        zzay zzag();

        zzba zzah();

        zzbc zzai();

        zzbe zzaj();

        zzbg zzak();

        zzbj zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        boolean zzaw();

        boolean zzax();

        boolean zzay();

        boolean zzaz();

        int zzb();

        int zzc();

        int zzd();

        int zze();

        int zzf();

        int zzg();

        long zzh();

        zzap zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzbj extends zzgyv<zzbj, zza> implements zzbk {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbj zzc;
        private static volatile zzhao<zzbj> zzd;
        private int zze;
        private int zzf = 1000;
        private zzaw zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzbj, zza> implements zzbk {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbk
            public zzq zza() {
                return ((zzbj) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbk
            public zzaw zzb() {
                return ((zzbj) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzbj) this.zza).zzB();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzbj) this.zza).zzC();
                return this;
            }

            public zza zze(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzD(zzawVar);
                return this;
            }

            public zza zzf(zzaw.zza zzaVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zza zzg(zzaw zzawVar) {
                zzbu();
                ((zzbj) this.zza).zzE(zzawVar);
                return this;
            }

            public zza zzh(zzq zzqVar) {
                zzbu();
                ((zzbj) this.zza).zzF(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbk
            public boolean zzi() {
                return ((zzbj) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbk
            public boolean zzj() {
                return ((zzbj) this.zza).zzj();
            }

            private zza() {
                super(zzbj.zzc);
            }
        }

        static {
            zzbj zzbjVar = new zzbj();
            zzc = zzbjVar;
            zzgyv.zzbZ(zzbj.class, zzbjVar);
        }

        private zzbj() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzaw zzawVar) {
            zzawVar.getClass();
            zzaw zzawVar2 = this.zzg;
            if (zzawVar2 != null && zzawVar2 != zzaw.zzg()) {
                zzaw.zza zzaVarZzb = zzaw.zzb(zzawVar2);
                zzaVarZzb.zzbj(zzawVar);
                zzawVar = zzaVarZzb.zzbs();
            }
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzaw zzawVar) {
            zzawVar.getClass();
            this.zzg = zzawVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzc() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzd(zzbj zzbjVar) {
            return (zza) zzc.zzba(zzbjVar);
        }

        public static zzbj zzg() {
            return zzc;
        }

        public static zzbj zzh(InputStream inputStream) throws IOException {
            return (zzbj) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzbj zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbj) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzbj zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzbj) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzbj zzm(zzgxt zzgxtVar) throws IOException {
            return (zzbj) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzbj zzn(InputStream inputStream) throws IOException {
            return (zzbj) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzbj zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzbj) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzbj zzp(byte[] bArr) throws zzgzk {
            return (zzbj) zzgyv.zzbq(zzc, bArr);
        }

        public static zzbj zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzbj) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzbj zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzbj) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzbj zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbj) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzbj zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzbj) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzbj zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzbj) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzbj> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbk
        public zzq zza() {
            zzq zzqVarZzb = zzq.zzb(this.zzf);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbk
        public zzaw zzb() {
            zzaw zzawVar = this.zzg;
            return zzawVar == null ? zzaw.zzg() : zzawVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbj();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzbj> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzbj.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbk
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbk
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbk extends zzhah {
        zzq zza();

        zzaw zzb();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzbl extends zzgyv<zzbl, zza> implements zzbm {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzbl zzc;
        private static volatile zzhao<zzbl> zzd;
        private int zze;
        private boolean zzf;
        private int zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzbl, zza> implements zzbm {
            @Override // com.google.android.gms.internal.ads.zzbch.zzbm
            public int zza() {
                return ((zzbl) this.zza).zza();
            }

            public zza zzb() {
                zzbu();
                ((zzbl) this.zza).zzA();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzbl) this.zza).zzB();
                return this;
            }

            public zza zzd(boolean z10) {
                zzbu();
                ((zzbl) this.zza).zzC(z10);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzbl) this.zza).zzD(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbm
            public boolean zzf() {
                return ((zzbl) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbm
            public boolean zzg() {
                return ((zzbl) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzbm
            public boolean zzh() {
                return ((zzbl) this.zza).zzh();
            }

            private zza() {
                super(zzbl.zzc);
            }
        }

        static {
            zzbl zzblVar = new zzbl();
            zzc = zzblVar;
            zzgyv.zzbZ(zzbl.class, zzblVar);
        }

        private zzbl() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzA() {
            this.zze &= -2;
            this.zzf = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zze &= -3;
            this.zzg = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC(boolean z10) {
            this.zze |= 1;
            this.zzf = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(int i) {
            this.zze |= 2;
            this.zzg = i;
        }

        public static zza zzb() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzc(zzbl zzblVar) {
            return (zza) zzc.zzba(zzblVar);
        }

        public static zzbl zzi() {
            return zzc;
        }

        public static zzbl zzj(InputStream inputStream) throws IOException {
            return (zzbl) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzbl zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbl) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzbl zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzbl) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzbl zzm(zzgxt zzgxtVar) throws IOException {
            return (zzbl) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzbl zzn(InputStream inputStream) throws IOException {
            return (zzbl) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzbl zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzbl) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzbl zzp(byte[] bArr) throws zzgzk {
            return (zzbl) zzgyv.zzbq(zzc, bArr);
        }

        public static zzbl zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzbl) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzbl zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzbl) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzbl zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzbl) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzbl zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzbl) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzbl zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzbl) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzbl> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbm
        public int zza() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzbl();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzbl> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzbl.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbm
        public boolean zzf() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbm
        public boolean zzg() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzbm
        public boolean zzh() {
            return (this.zze & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzbm extends zzhah {
        int zza();

        boolean zzf();

        boolean zzg();

        boolean zzh();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzc extends zzhah {
        int zza();

        zzb.zza zzb(int i);

        List<zzb.zza> zzl();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzd extends zzgyv<zzd, zzb> implements zze {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzd zzc;
        private static volatile zzhao<zzd> zzd;
        private int zze;
        private int zzf;
        private zzal zzg;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zza implements zzgyz {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            public static final int zzl = 0;
            public static final int zzm = 1;
            public static final int zzn = 2;
            public static final int zzo = 3;
            public static final int zzp = 4;
            public static final int zzq = 5;
            public static final int zzr = 6;
            public static final int zzs = 7;
            public static final int zzt = 8;
            public static final int zzu = 9;
            public static final int zzv = 10;
            private static final zzgza<zza> zzw = new zzgza<zza>() { // from class: com.google.android.gms.internal.ads.zzbch.zzd.zza.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zza zzb(int i) {
                    return zza.zzb(i);
                }
            };
            private final int zzy;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            /* renamed from: com.google.android.gms.internal.ads.zzbch$zzd$zza$zza, reason: collision with other inner class name */
            final class C0338zza implements zzgzb {
                static final zzgzb zza = new C0338zza();

                private C0338zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zza.zzb(i) != null;
                }
            }

            zza(int i) {
                this.zzy = i;
            }

            public static zza zzb(int i) {
                switch (i) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static zzgza<zza> zzd() {
                return zzw;
            }

            public static zzgzb zze() {
                return C0338zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzy);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzy;
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zzb extends zzgyp<zzd, zzb> implements zze {
            @Override // com.google.android.gms.internal.ads.zzbch.zze
            public zza zza() {
                return ((zzd) this.zza).zza();
            }

            public zzb zzb() {
                zzbu();
                ((zzd) this.zza).zzB();
                return this;
            }

            public zzb zzc() {
                zzbu();
                ((zzd) this.zza).zzC();
                return this;
            }

            public zzb zzd(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzD(zzalVar);
                return this;
            }

            public zzb zze(zzal.zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzaVar.zzbr());
                return this;
            }

            public zzb zzf(zzal zzalVar) {
                zzbu();
                ((zzd) this.zza).zzE(zzalVar);
                return this;
            }

            public zzb zzg(zza zzaVar) {
                zzbu();
                ((zzd) this.zza).zzF(zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zze
            public zzal zzh() {
                return ((zzd) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zze
            public boolean zzi() {
                return ((zzd) this.zza).zzi();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zze
            public boolean zzj() {
                return ((zzd) this.zza).zzj();
            }

            private zzb() {
                super(zzd.zzc);
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzgyv.zzbZ(zzd.class, zzdVar);
        }

        private zzd() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzB() {
            this.zzg = null;
            this.zze &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzC() {
            this.zze &= -2;
            this.zzf = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(zzal zzalVar) {
            zzalVar.getClass();
            zzal zzalVar2 = this.zzg;
            if (zzalVar2 != null && zzalVar2 != zzal.zzi()) {
                zzal.zza zzaVarZzd = zzal.zzd(zzalVar2);
                zzaVarZzd.zzbj(zzalVar);
                zzalVar = zzaVarZzd.zzbs();
            }
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(zzal zzalVar) {
            zzalVar.getClass();
            this.zzg = zzalVar;
            this.zze |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF(zza zzaVar) {
            this.zzf = zzaVar.zza();
            this.zze |= 1;
        }

        public static zzb zzb() {
            return (zzb) zzc.zzaZ();
        }

        public static zzb zzc(zzd zzdVar) {
            return (zzb) zzc.zzba(zzdVar);
        }

        public static zzd zzf() {
            return zzc;
        }

        public static zzd zzg(InputStream inputStream) throws IOException {
            return (zzd) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzd zzk(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzd) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzd zzl(zzgxn zzgxnVar) throws zzgzk {
            return (zzd) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzd zzm(zzgxt zzgxtVar) throws IOException {
            return (zzd) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzd zzn(InputStream inputStream) throws IOException {
            return (zzd) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzd zzo(ByteBuffer byteBuffer) throws zzgzk {
            return (zzd) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzd zzp(byte[] bArr) throws zzgzk {
            return (zzd) zzgyv.zzbq(zzc, bArr);
        }

        public static zzd zzq(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzd) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzd zzr(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzd) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzd zzs(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzd) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzd zzt(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzd) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzd zzu(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzd) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzd> zzv() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zze
        public zza zza() {
            zza zzaVarZzb = zza.zzb(this.zzf);
            return zzaVarZzb == null ? zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", zza.zze(), "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzd();
            }
            if (iOrdinal == 4) {
                return new zzb();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzd> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzd.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zze
        public zzal zzh() {
            zzal zzalVar = this.zzg;
            return zzalVar == null ? zzal.zzi() : zzalVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zze
        public boolean zzi() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zze
        public boolean zzj() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zze extends zzhah {
        zzd.zza zza();

        zzal zzh();

        boolean zzi();

        boolean zzj();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzf extends zzhah {
        int zza();

        zzd zzab(int i);

        zzg zzac();

        zzi zzad();

        zzk zzae();

        zzq zzaf();

        zzx zzag();

        zzz zzah();

        zzac zzai();

        zzah zzaj();

        zzat zzak(int i);

        List<zzd> zzal();

        List<zzat> zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        boolean zzav();

        int zzb();

        zza.EnumC0333zza zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzg extends zzgyv<zzg, zza> implements zzh {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        private static final zzg zzd;
        private static volatile zzhao<zzg> zze;
        private int zzf;
        private String zzg = "";
        private zzgzh<zzd> zzh = zzgyv.zzbK();
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzg, zza> implements zzh {
            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public int zza() {
                return ((zzg) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public zzd zzb(int i) {
                return ((zzg) this.zza).zzb(i);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzg) this.zza).zzN(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzO(zzdVar);
                return this;
            }

            public zza zzf(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzP(i, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzP(i, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzg) this.zza).zzQ();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzg) this.zza).zzR();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzg) this.zza).zzS();
                return this;
            }

            public zza zzk(int i) {
                zzbu();
                ((zzg) this.zza).zzU(i);
                return this;
            }

            public zza zzl(String str) {
                zzbu();
                ((zzg) this.zza).zzV(str);
                return this;
            }

            public zza zzm(zzgxn zzgxnVar) {
                zzbu();
                ((zzg) this.zza).zzW(zzgxnVar);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzg) this.zza).zzX(zzqVar);
                return this;
            }

            public zza zzo(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzg) this.zza).zzY(i, zzbVar.zzbr());
                return this;
            }

            public zza zzp(int i, zzd zzdVar) {
                zzbu();
                ((zzg) this.zza).zzY(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public zzq zzq() {
                return ((zzg) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public zzgxn zzr() {
                return ((zzg) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public String zzs() {
                return ((zzg) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public List<zzd> zzt() {
                return Collections.unmodifiableList(((zzg) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public boolean zzu() {
                return ((zzg) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzh
            public boolean zzv() {
                return ((zzg) this.zza).zzv();
            }

            private zza() {
                super(zzg.zzd);
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzd = zzgVar;
            zzgyv.zzbZ(zzg.class, zzgVar);
        }

        private zzg() {
        }

        public static zzhao<zzg> zzA() {
            return zzd.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN(Iterable<? extends zzd> iterable) {
            zzT();
            zzgww.zzaQ(iterable, this.zzh);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzf &= -2;
            this.zzg = zzh().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzf &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzh = zzgyv.zzbK();
        }

        private void zzT() {
            zzgzh<zzd> zzgzhVar = this.zzh;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzh = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(int i) {
            zzT();
            this.zzh.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(String str) {
            str.getClass();
            this.zzf |= 1;
            this.zzg = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzgxn zzgxnVar) {
            this.zzg = zzgxnVar.zzx();
            this.zzf |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzf |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzT();
            this.zzh.set(i, zzdVar);
        }

        public static zza zzd() {
            return (zza) zzd.zzaZ();
        }

        public static zza zzf(zzg zzgVar) {
            return (zza) zzd.zzba(zzgVar);
        }

        public static zzg zzh() {
            return zzd;
        }

        public static zzg zzi(InputStream inputStream) throws IOException {
            return (zzg) zzgyv.zzbk(zzd, inputStream);
        }

        public static zzg zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzg) zzgyv.zzbl(zzd, inputStream, zzgyfVar);
        }

        public static zzg zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzg) zzgyv.zzbm(zzd, zzgxnVar);
        }

        public static zzg zzl(zzgxt zzgxtVar) throws IOException {
            return (zzg) zzgyv.zzbn(zzd, zzgxtVar);
        }

        public static zzg zzm(InputStream inputStream) throws IOException {
            return (zzg) zzgyv.zzbo(zzd, inputStream);
        }

        public static zzg zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzg) zzgyv.zzbp(zzd, byteBuffer);
        }

        public static zzg zzo(byte[] bArr) throws zzgzk {
            return (zzg) zzgyv.zzbq(zzd, bArr);
        }

        public static zzg zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzg) zzgyv.zzbr(zzd, zzgxnVar, zzgyfVar);
        }

        public static zzg zzw(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzg) zzgyv.zzbs(zzd, zzgxtVar, zzgyfVar);
        }

        public static zzg zzx(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzg) zzgyv.zzbu(zzd, inputStream, zzgyfVar);
        }

        public static zzg zzy(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzg) zzgyv.zzbv(zzd, byteBuffer, zzgyfVar);
        }

        public static zzg zzz(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzg) zzgyv.zzbx(zzd, bArr, zzgyfVar);
        }

        public List<? extends zze> zzB() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public int zza() {
            return this.zzh.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public zzd zzb(int i) {
            return this.zzh.get(i);
        }

        public zze zzc(int i) {
            return this.zzh.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzf", "zzg", "zzh", zzd.class, "zzi", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzg();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzd;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzg> zzhaoVar = zze;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzg.class) {
                try {
                    zzgyqVar = zze;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzd);
                        zze = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public zzq zzq() {
            zzq zzqVarZzb = zzq.zzb(this.zzi);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public zzgxn zzr() {
            return zzgxn.zzw(this.zzg);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public String zzs() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public List<zzd> zzt() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public boolean zzu() {
            return (this.zzf & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzh
        public boolean zzv() {
            return (this.zzf & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzh extends zzhah {
        int zza();

        zzd zzb(int i);

        zzq zzq();

        zzgxn zzr();

        String zzs();

        List<zzd> zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzi extends zzgyv<zzi, zza> implements zzj {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        private static final zzi zzf;
        private static volatile zzhao<zzi> zzg;
        private int zzh;
        private String zzi = "";
        private zzgzh<zzd> zzj = zzgyv.zzbK();
        private int zzk = 1000;
        private int zzl = 1000;
        private int zzm = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzi, zza> implements zzj {
            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public boolean zzA() {
                return ((zzi) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public boolean zzB() {
                return ((zzi) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public boolean zzC() {
                return ((zzi) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public boolean zzD() {
                return ((zzi) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public int zza() {
                return ((zzi) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public zzd zzb(int i) {
                return ((zzi) this.zza).zzb(i);
            }

            public zza zzc(Iterable<? extends zzd> iterable) {
                zzbu();
                ((zzi) this.zza).zzV(iterable);
                return this;
            }

            public zza zzd(zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzbVar.zzbr());
                return this;
            }

            public zza zze(zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzW(zzdVar);
                return this;
            }

            public zza zzf(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzX(i, zzbVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzX(i, zzdVar);
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzi) this.zza).zzY();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzi) this.zza).zzZ();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzi) this.zza).zzaa();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzi) this.zza).zzab();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzi) this.zza).zzac();
                return this;
            }

            public zza zzm(int i) {
                zzbu();
                ((zzi) this.zza).zzae(i);
                return this;
            }

            public zza zzn(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaf(zzqVar);
                return this;
            }

            public zza zzo(String str) {
                zzbu();
                ((zzi) this.zza).zzag(str);
                return this;
            }

            public zza zzp(zzgxn zzgxnVar) {
                zzbu();
                ((zzi) this.zza).zzah(zzgxnVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzai(zzqVar);
                return this;
            }

            public zza zzr(zzq zzqVar) {
                zzbu();
                ((zzi) this.zza).zzaj(zzqVar);
                return this;
            }

            public zza zzs(int i, zzd.zzb zzbVar) {
                zzbu();
                ((zzi) this.zza).zzak(i, zzbVar.zzbr());
                return this;
            }

            public zza zzt(int i, zzd zzdVar) {
                zzbu();
                ((zzi) this.zza).zzak(i, zzdVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public zzq zzu() {
                return ((zzi) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public zzq zzv() {
                return ((zzi) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public zzq zzw() {
                return ((zzi) this.zza).zzw();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public zzgxn zzx() {
                return ((zzi) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public String zzy() {
                return ((zzi) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzj
            public List<zzd> zzz() {
                return Collections.unmodifiableList(((zzi) this.zza).zzz());
            }

            private zza() {
                super(zzi.zzf);
            }
        }

        static {
            zzi zziVar = new zzi();
            zzf = zziVar;
            zzgyv.zzbZ(zzi.class, zziVar);
        }

        private zzi() {
        }

        public static zzhao<zzi> zzE() {
            return zzf.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(Iterable<? extends zzd> iterable) {
            zzad();
            zzgww.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.add(i, zzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY() {
            this.zzh &= -9;
            this.zzm = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ() {
            this.zzh &= -2;
            this.zzi = zzh().zzy();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa() {
            this.zzh &= -5;
            this.zzl = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab() {
            this.zzh &= -3;
            this.zzk = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzj = zzgyv.zzbK();
        }

        private void zzad() {
            zzgzh<zzd> zzgzhVar = this.zzj;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzj = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(int i) {
            zzad();
            this.zzj.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(zzq zzqVar) {
            this.zzm = zzqVar.zza();
            this.zzh |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag(String str) {
            str.getClass();
            this.zzh |= 1;
            this.zzi = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah(zzgxn zzgxnVar) {
            this.zzi = zzgxnVar.zzx();
            this.zzh |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai(zzq zzqVar) {
            this.zzl = zzqVar.zza();
            this.zzh |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj(zzq zzqVar) {
            this.zzk = zzqVar.zza();
            this.zzh |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(int i, zzd zzdVar) {
            zzdVar.getClass();
            zzad();
            this.zzj.set(i, zzdVar);
        }

        public static zza zzd() {
            return (zza) zzf.zzaZ();
        }

        public static zza zzf(zzi zziVar) {
            return (zza) zzf.zzba(zziVar);
        }

        public static zzi zzh() {
            return zzf;
        }

        public static zzi zzi(InputStream inputStream) throws IOException {
            return (zzi) zzgyv.zzbk(zzf, inputStream);
        }

        public static zzi zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzi) zzgyv.zzbl(zzf, inputStream, zzgyfVar);
        }

        public static zzi zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzi) zzgyv.zzbm(zzf, zzgxnVar);
        }

        public static zzi zzl(zzgxt zzgxtVar) throws IOException {
            return (zzi) zzgyv.zzbn(zzf, zzgxtVar);
        }

        public static zzi zzm(InputStream inputStream) throws IOException {
            return (zzi) zzgyv.zzbo(zzf, inputStream);
        }

        public static zzi zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzi) zzgyv.zzbp(zzf, byteBuffer);
        }

        public static zzi zzo(byte[] bArr) throws zzgzk {
            return (zzi) zzgyv.zzbq(zzf, bArr);
        }

        public static zzi zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzi) zzgyv.zzbr(zzf, zzgxnVar, zzgyfVar);
        }

        public static zzi zzq(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzi) zzgyv.zzbs(zzf, zzgxtVar, zzgyfVar);
        }

        public static zzi zzr(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzi) zzgyv.zzbu(zzf, inputStream, zzgyfVar);
        }

        public static zzi zzs(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzi) zzgyv.zzbv(zzf, byteBuffer, zzgyfVar);
        }

        public static zzi zzt(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzi) zzgyv.zzbx(zzf, bArr, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public boolean zzA() {
            return (this.zzh & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public boolean zzB() {
            return (this.zzh & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public boolean zzC() {
            return (this.zzh & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public boolean zzD() {
            return (this.zzh & 2) != 0;
        }

        public List<? extends zze> zzF() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public int zza() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public zzd zzb(int i) {
            return this.zzj.get(i);
        }

        public zze zzc(int i) {
            return this.zzj.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", zzd.class, "zzk", zzq.zze(), "zzl", zzq.zze(), "zzm", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzi();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzf;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzi> zzhaoVar = zzg;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzi.class) {
                try {
                    zzgyqVar = zzg;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzf);
                        zzg = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public zzq zzu() {
            zzq zzqVarZzb = zzq.zzb(this.zzm);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public zzq zzv() {
            zzq zzqVarZzb = zzq.zzb(this.zzl);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public zzq zzw() {
            zzq zzqVarZzb = zzq.zzb(this.zzk);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public zzgxn zzx() {
            return zzgxn.zzw(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public String zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzj
        public List<zzd> zzz() {
            return this.zzj;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzj extends zzhah {
        boolean zzA();

        boolean zzB();

        boolean zzC();

        boolean zzD();

        int zza();

        zzd zzb(int i);

        zzq zzu();

        zzq zzv();

        zzq zzw();

        zzgxn zzx();

        String zzy();

        List<zzd> zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzk extends zzgyv<zzk, zza> implements zzl {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        private static final zzk zzg;
        private static volatile zzhao<zzk> zzh;
        private int zzi;
        private int zzj;
        private zzap zzk;
        private zzap zzl;
        private zzap zzm;
        private zzgzh<zzap> zzn = zzgyv.zzbK();
        private int zzo;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzk, zza> implements zzl {
            public zza zzA(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzapVar);
                return this;
            }

            public zza zzB(int i) {
                zzbu();
                ((zzk) this.zza).zzat(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public zzap zzC() {
                return ((zzk) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public zzap zzD() {
                return ((zzk) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public zzap zzE(int i) {
                return ((zzk) this.zza).zzE(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public zzap zzF() {
                return ((zzk) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public List<zzap> zzG() {
                return Collections.unmodifiableList(((zzk) this.zza).zzG());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public boolean zzH() {
                return ((zzk) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public boolean zzI() {
                return ((zzk) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public boolean zzJ() {
                return ((zzk) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public boolean zzK() {
                return ((zzk) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public boolean zzL() {
                return ((zzk) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public int zza() {
                return ((zzk) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public int zzb() {
                return ((zzk) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzl
            public int zzc() {
                return ((zzk) this.zza).zzc();
            }

            public zza zzd(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzaVar.zzbr());
                return this;
            }

            public zza zze(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzf(int i, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzab(i, zzaVar.zzbr());
                return this;
            }

            public zza zzg(int i, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzab(i, zzapVar);
                return this;
            }

            public zza zzh(Iterable<? extends zzap> iterable) {
                zzbu();
                ((zzk) this.zza).zzac(iterable);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzk) this.zza).zzad();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzk) this.zza).zzae();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzk) this.zza).zzaf();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzk) this.zza).zzag();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzk) this.zza).zzah();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzk) this.zza).zzai();
                return this;
            }

            public zza zzo(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzp(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzal(zzapVar);
                return this;
            }

            public zza zzq(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzam(zzapVar);
                return this;
            }

            public zza zzr(int i) {
                zzbu();
                ((zzk) this.zza).zzan(i);
                return this;
            }

            public zza zzs(int i) {
                zzbu();
                ((zzk) this.zza).zzao(i);
                return this;
            }

            public zza zzt(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzaVar.zzbr());
                return this;
            }

            public zza zzu(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzap(zzapVar);
                return this;
            }

            public zza zzv(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzaq(zzapVar);
                return this;
            }

            public zza zzx(int i, zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzar(i, zzaVar.zzbr());
                return this;
            }

            public zza zzy(int i, zzap zzapVar) {
                zzbu();
                ((zzk) this.zza).zzar(i, zzapVar);
                return this;
            }

            public zza zzz(zzap.zza zzaVar) {
                zzbu();
                ((zzk) this.zza).zzas(zzaVar.zzbr());
                return this;
            }

            private zza() {
                super(zzk.zzg);
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzg = zzkVar;
            zzgyv.zzbZ(zzk.class, zzkVar);
        }

        private zzk() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.add(i, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(Iterable<? extends zzap> iterable) {
            zzaj();
            zzgww.zzaQ(iterable, this.zzn);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzi &= -2;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzl = null;
            this.zzi &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzk = null;
            this.zzi &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzn = zzgyv.zzbK();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzm = null;
            this.zzi &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzi &= -17;
            this.zzo = 0;
        }

        private void zzaj() {
            zzgzh<zzap> zzgzhVar = this.zzn;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzn = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzl;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(int i) {
            zzaj();
            this.zzn.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(int i) {
            this.zzi |= 1;
            this.zzj = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzap zzapVar) {
            zzapVar.getClass();
            this.zzl = zzapVar;
            this.zzi |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzi |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(int i, zzap zzapVar) {
            zzapVar.getClass();
            zzaj();
            this.zzn.set(i, zzapVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzi |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(int i) {
            this.zzi |= 16;
            this.zzo = i;
        }

        public static zza zzd() {
            return (zza) zzg.zzaZ();
        }

        public static zza zzf(zzk zzkVar) {
            return (zza) zzg.zzba(zzkVar);
        }

        public static zzk zzh() {
            return zzg;
        }

        public static zzk zzi(InputStream inputStream) throws IOException {
            return (zzk) zzgyv.zzbk(zzg, inputStream);
        }

        public static zzk zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzk) zzgyv.zzbl(zzg, inputStream, zzgyfVar);
        }

        public static zzk zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzk) zzgyv.zzbm(zzg, zzgxnVar);
        }

        public static zzk zzl(zzgxt zzgxtVar) throws IOException {
            return (zzk) zzgyv.zzbn(zzg, zzgxtVar);
        }

        public static zzk zzm(InputStream inputStream) throws IOException {
            return (zzk) zzgyv.zzbo(zzg, inputStream);
        }

        public static zzk zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzk) zzgyv.zzbp(zzg, byteBuffer);
        }

        public static zzk zzo(byte[] bArr) throws zzgzk {
            return (zzk) zzgyv.zzbq(zzg, bArr);
        }

        public static zzk zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzk) zzgyv.zzbr(zzg, zzgxnVar, zzgyfVar);
        }

        public static zzk zzq(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzk) zzgyv.zzbs(zzg, zzgxtVar, zzgyfVar);
        }

        public static zzk zzr(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzk) zzgyv.zzbu(zzg, inputStream, zzgyfVar);
        }

        public static zzk zzs(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzk) zzgyv.zzbv(zzg, byteBuffer, zzgyfVar);
        }

        public static zzk zzt(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzk) zzgyv.zzbx(zzg, bArr, zzgyfVar);
        }

        public static zzhao<zzk> zzv() {
            return zzg.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public zzap zzC() {
            zzap zzapVar = this.zzl;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public zzap zzD() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public zzap zzE(int i) {
            return this.zzn.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public zzap zzF() {
            zzap zzapVar = this.zzm;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public List<zzap> zzG() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public boolean zzH() {
            return (this.zzi & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public boolean zzI() {
            return (this.zzi & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public boolean zzJ() {
            return (this.zzi & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public boolean zzK() {
            return (this.zzi & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public boolean zzL() {
            return (this.zzi & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public int zza() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public int zzb() {
            return this.zzn.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzl
        public int zzc() {
            return this.zzo;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzap.class, "zzo"});
            }
            if (iOrdinal == 3) {
                return new zzk();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzg;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzk> zzhaoVar = zzh;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzk.class) {
                try {
                    zzgyqVar = zzh;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzg);
                        zzh = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        public zzaq zzu(int i) {
            return this.zzn.get(i);
        }

        public List<? extends zzaq> zzw() {
            return this.zzn;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzl extends zzhah {
        zzap zzC();

        zzap zzD();

        zzap zzE(int i);

        zzap zzF();

        List<zzap> zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        int zzc();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzm extends zzgyv<zzm, zza> implements zzn {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;
        public static final int zzh = 8;
        private static final zzm zzi;
        private static volatile zzhao<zzm> zzj;
        private int zzk;
        private zzap zzm;
        private int zzn;
        private zzar zzo;
        private int zzp;
        private String zzl = "";
        private int zzu = 1000;
        private int zzv = 1000;
        private int zzw = 1000;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzm, zza> implements zzn {
            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzap zzA() {
                return ((zzm) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzar zzB() {
                return ((zzm) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzgxn zzC() {
                return ((zzm) this.zza).zzC();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public String zzD() {
                return ((zzm) this.zza).zzD();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzE() {
                return ((zzm) this.zza).zzE();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzF() {
                return ((zzm) this.zza).zzF();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzG() {
                return ((zzm) this.zza).zzG();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzH() {
                return ((zzm) this.zza).zzH();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzI() {
                return ((zzm) this.zza).zzI();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzJ() {
                return ((zzm) this.zza).zzJ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzK() {
                return ((zzm) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public boolean zzL() {
                return ((zzm) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public int zza() {
                return ((zzm) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public int zzb() {
                return ((zzm) this.zza).zzb();
            }

            public zza zzc() {
                zzbu();
                ((zzm) this.zza).zzac();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzm) this.zza).zzad();
                return this;
            }

            public zza zze() {
                zzbu();
                ((zzm) this.zza).zzae();
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzm) this.zza).zzaf();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzm) this.zza).zzag();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzm) this.zza).zzah();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzm) this.zza).zzai();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzm) this.zza).zzaj();
                return this;
            }

            public zza zzk(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzak(zzapVar);
                return this;
            }

            public zza zzl(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzal(zzarVar);
                return this;
            }

            public zza zzm(String str) {
                zzbu();
                ((zzm) this.zza).zzam(str);
                return this;
            }

            public zza zzn(zzgxn zzgxnVar) {
                zzbu();
                ((zzm) this.zza).zzan(zzgxnVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzao(zzqVar);
                return this;
            }

            public zza zzp(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzap(zzqVar);
                return this;
            }

            public zza zzq(zzq zzqVar) {
                zzbu();
                ((zzm) this.zza).zzaq(zzqVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzm) this.zza).zzar(zzapVar);
                return this;
            }

            public zza zzt(int i) {
                zzbu();
                ((zzm) this.zza).zzas(i);
                return this;
            }

            public zza zzu(int i) {
                zzbu();
                ((zzm) this.zza).zzat(i);
                return this;
            }

            public zza zzv(zzar.zza zzaVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzaVar.zzbr());
                return this;
            }

            public zza zzw(zzar zzarVar) {
                zzbu();
                ((zzm) this.zza).zzau(zzarVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzq zzx() {
                return ((zzm) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzq zzy() {
                return ((zzm) this.zza).zzy();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzn
            public zzq zzz() {
                return ((zzm) this.zza).zzz();
            }

            private zza() {
                super(zzm.zzi);
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzi = zzmVar;
            zzgyv.zzbZ(zzm.class, zzmVar);
        }

        private zzm() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac() {
            this.zzk &= -2;
            this.zzl = zzg().zzD();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad() {
            this.zzk &= -33;
            this.zzu = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae() {
            this.zzk &= -65;
            this.zzv = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf() {
            this.zzk &= -129;
            this.zzw = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzag() {
            this.zzm = null;
            this.zzk &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzah() {
            this.zzk &= -17;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzai() {
            this.zzk &= -5;
            this.zzn = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaj() {
            this.zzo = null;
            this.zzk &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzak(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzm;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzal(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzo;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzaVarZzf = zzar.zzf(zzarVar2);
                zzaVarZzf.zzbj(zzarVar);
                zzarVar = zzaVarZzf.zzbs();
            }
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzam(String str) {
            str.getClass();
            this.zzk |= 1;
            this.zzl = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzan(zzgxn zzgxnVar) {
            this.zzl = zzgxnVar.zzx();
            this.zzk |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzao(zzq zzqVar) {
            this.zzu = zzqVar.zza();
            this.zzk |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzap(zzq zzqVar) {
            this.zzv = zzqVar.zza();
            this.zzk |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaq(zzq zzqVar) {
            this.zzw = zzqVar.zza();
            this.zzk |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzar(zzap zzapVar) {
            zzapVar.getClass();
            this.zzm = zzapVar;
            this.zzk |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(int i) {
            this.zzk |= 16;
            this.zzp = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(int i) {
            this.zzk |= 4;
            this.zzn = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(zzar zzarVar) {
            zzarVar.getClass();
            this.zzo = zzarVar;
            this.zzk |= 8;
        }

        public static zza zzc() {
            return (zza) zzi.zzaZ();
        }

        public static zza zzd(zzm zzmVar) {
            return (zza) zzi.zzba(zzmVar);
        }

        public static zzm zzg() {
            return zzi;
        }

        public static zzm zzh(InputStream inputStream) throws IOException {
            return (zzm) zzgyv.zzbk(zzi, inputStream);
        }

        public static zzm zzi(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzm) zzgyv.zzbl(zzi, inputStream, zzgyfVar);
        }

        public static zzm zzj(zzgxn zzgxnVar) throws zzgzk {
            return (zzm) zzgyv.zzbm(zzi, zzgxnVar);
        }

        public static zzm zzk(zzgxt zzgxtVar) throws IOException {
            return (zzm) zzgyv.zzbn(zzi, zzgxtVar);
        }

        public static zzm zzl(InputStream inputStream) throws IOException {
            return (zzm) zzgyv.zzbo(zzi, inputStream);
        }

        public static zzm zzm(ByteBuffer byteBuffer) throws zzgzk {
            return (zzm) zzgyv.zzbp(zzi, byteBuffer);
        }

        public static zzm zzn(byte[] bArr) throws zzgzk {
            return (zzm) zzgyv.zzbq(zzi, bArr);
        }

        public static zzm zzo(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzm) zzgyv.zzbr(zzi, zzgxnVar, zzgyfVar);
        }

        public static zzm zzp(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzm) zzgyv.zzbs(zzi, zzgxtVar, zzgyfVar);
        }

        public static zzm zzq(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzm) zzgyv.zzbu(zzi, inputStream, zzgyfVar);
        }

        public static zzm zzr(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzm) zzgyv.zzbv(zzi, byteBuffer, zzgyfVar);
        }

        public static zzm zzs(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzm) zzgyv.zzbx(zzi, bArr, zzgyfVar);
        }

        public static zzhao<zzm> zzt() {
            return zzi.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzap zzA() {
            zzap zzapVar = this.zzm;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzar zzB() {
            zzar zzarVar = this.zzo;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzgxn zzC() {
            return zzgxn.zzw(this.zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public String zzD() {
            return this.zzl;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzE() {
            return (this.zzk & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzF() {
            return (this.zzk & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzG() {
            return (this.zzk & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzH() {
            return (this.zzk & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzI() {
            return (this.zzk & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzJ() {
            return (this.zzk & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzK() {
            return (this.zzk & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public boolean zzL() {
            return (this.zzk & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public int zzb() {
            return this.zzn;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", zzq.zze(), "zzv", zzq.zze(), "zzw", zzq.zze()});
            }
            if (iOrdinal == 3) {
                return new zzm();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzi;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzm> zzhaoVar = zzj;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzm.class) {
                try {
                    zzgyqVar = zzj;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzi);
                        zzj = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzq zzx() {
            zzq zzqVarZzb = zzq.zzb(this.zzu);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzq zzy() {
            zzq zzqVarZzb = zzq.zzb(this.zzv);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzn
        public zzq zzz() {
            zzq zzqVarZzb = zzq.zzb(this.zzw);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzn extends zzhah {
        zzap zzA();

        zzar zzB();

        zzgxn zzC();

        String zzD();

        boolean zzE();

        boolean zzF();

        boolean zzG();

        boolean zzH();

        boolean zzI();

        boolean zzJ();

        boolean zzK();

        boolean zzL();

        int zza();

        int zzb();

        zzq zzx();

        zzq zzy();

        zzq zzz();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzo extends zzgyv<zzo, zza> implements zzp {
        public static final int zza = 5;
        public static final int zzb = 6;
        public static final int zzc = 7;
        public static final int zzd = 8;
        private static final zzo zze;
        private static volatile zzhao<zzo> zzf;
        private int zzg;
        private int zzh;
        private zzar zzi;
        private String zzj = "";
        private String zzk = "";

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzo, zza> implements zzp {
            public zza zza() {
                zzbu();
                ((zzo) this.zza).zzN();
                return this;
            }

            public zza zzb() {
                zzbu();
                ((zzo) this.zza).zzO();
                return this;
            }

            public zza zzc() {
                zzbu();
                ((zzo) this.zza).zzP();
                return this;
            }

            public zza zzd() {
                zzbu();
                ((zzo) this.zza).zzQ();
                return this;
            }

            public zza zze(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzR(zzarVar);
                return this;
            }

            public zza zzf(String str) {
                zzbu();
                ((zzo) this.zza).zzS(str);
                return this;
            }

            public zza zzg(zzgxn zzgxnVar) {
                zzbu();
                ((zzo) this.zza).zzT(zzgxnVar);
                return this;
            }

            public zza zzh(zzar.zza zzaVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzaVar.zzbr());
                return this;
            }

            public zza zzi(zzar zzarVar) {
                zzbu();
                ((zzo) this.zza).zzU(zzarVar);
                return this;
            }

            public zza zzj(zzb zzbVar) {
                zzbu();
                ((zzo) this.zza).zzV(zzbVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzo) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgxn zzgxnVar) {
                zzbu();
                ((zzo) this.zza).zzX(zzgxnVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public zzb zzm() {
                return ((zzo) this.zza).zzm();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public zzar zzn() {
                return ((zzo) this.zza).zzn();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public zzgxn zzo() {
                return ((zzo) this.zza).zzo();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public zzgxn zzp() {
                return ((zzo) this.zza).zzp();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public String zzq() {
                return ((zzo) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public String zzr() {
                return ((zzo) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public boolean zzs() {
                return ((zzo) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public boolean zzt() {
                return ((zzo) this.zza).zzt();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public boolean zzu() {
                return ((zzo) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzp
            public boolean zzv() {
                return ((zzo) this.zza).zzv();
            }

            private zza() {
                super(zzo.zze);
            }
        }

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public enum zzb implements zzgyz {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            public static final int zzd = 0;
            public static final int zze = 1;
            public static final int zzf = 2;
            private static final zzgza<zzb> zzg = new zzgza<zzb>() { // from class: com.google.android.gms.internal.ads.zzbch.zzo.zzb.1
                /* renamed from: zza, reason: merged with bridge method [inline-methods] */
                public zzb zzb(int i) {
                    return zzb.zzb(i);
                }
            };
            private final int zzi;

            /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
            final class zza implements zzgzb {
                static final zzgzb zza = new zza();

                private zza() {
                }

                @Override // com.google.android.gms.internal.ads.zzgzb
                public boolean zza(int i) {
                    return zzb.zzb(i) != null;
                }
            }

            zzb(int i) {
                this.zzi = i;
            }

            public static zzb zzb(int i) {
                if (i == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (i == 1) {
                    return IOS;
                }
                if (i != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static zzgza<zzb> zzd() {
                return zzg;
            }

            public static zzgzb zze() {
                return zza.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return Integer.toString(this.zzi);
            }

            @Override // com.google.android.gms.internal.ads.zzgyz
            public final int zza() {
                return this.zzi;
            }
        }

        static {
            zzo zzoVar = new zzo();
            zze = zzoVar;
            zzgyv.zzbZ(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static zzo zzA(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzo) zzgyv.zzbx(zze, bArr, zzgyfVar);
        }

        public static zzhao<zzo> zzB() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzN() {
            this.zzg &= -5;
            this.zzj = zzd().zzq();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO() {
            this.zzi = null;
            this.zzg &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP() {
            this.zzg &= -2;
            this.zzh = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzg &= -9;
            this.zzk = zzd().zzr();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzi;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzaVarZzf = zzar.zzf(zzarVar2);
                zzaVarZzf.zzbj(zzarVar);
                zzarVar = zzaVarZzf.zzbs();
            }
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(String str) {
            str.getClass();
            this.zzg |= 4;
            this.zzj = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(zzgxn zzgxnVar) {
            this.zzj = zzgxnVar.zzx();
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU(zzar zzarVar) {
            zzarVar.getClass();
            this.zzi = zzarVar;
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzb zzbVar) {
            this.zzh = zzbVar.zza();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(String str) {
            str.getClass();
            this.zzg |= 8;
            this.zzk = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzgxn zzgxnVar) {
            this.zzk = zzgxnVar.zzx();
            this.zzg |= 8;
        }

        public static zza zza() {
            return (zza) zze.zzaZ();
        }

        public static zza zzb(zzo zzoVar) {
            return (zza) zze.zzba(zzoVar);
        }

        public static zzo zzd() {
            return zze;
        }

        public static zzo zzf(InputStream inputStream) throws IOException {
            return (zzo) zzgyv.zzbk(zze, inputStream);
        }

        public static zzo zzg(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzo) zzgyv.zzbl(zze, inputStream, zzgyfVar);
        }

        public static zzo zzh(zzgxn zzgxnVar) throws zzgzk {
            return (zzo) zzgyv.zzbm(zze, zzgxnVar);
        }

        public static zzo zzi(zzgxt zzgxtVar) throws IOException {
            return (zzo) zzgyv.zzbn(zze, zzgxtVar);
        }

        public static zzo zzj(InputStream inputStream) throws IOException {
            return (zzo) zzgyv.zzbo(zze, inputStream);
        }

        public static zzo zzk(ByteBuffer byteBuffer) throws zzgzk {
            return (zzo) zzgyv.zzbp(zze, byteBuffer);
        }

        public static zzo zzl(byte[] bArr) throws zzgzk {
            return (zzo) zzgyv.zzbq(zze, bArr);
        }

        public static zzo zzw(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzo) zzgyv.zzbr(zze, zzgxnVar, zzgyfVar);
        }

        public static zzo zzx(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzo) zzgyv.zzbs(zze, zzgxtVar, zzgyfVar);
        }

        public static zzo zzy(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzo) zzgyv.zzbu(zze, inputStream, zzgyfVar);
        }

        public static zzo zzz(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzo) zzgyv.zzbv(zze, byteBuffer, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", zzb.zze(), "zzi", "zzj", "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzo();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zze;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzo> zzhaoVar = zzf;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzo.class) {
                try {
                    zzgyqVar = zzf;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zze);
                        zzf = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public zzb zzm() {
            zzb zzbVarZzb = zzb.zzb(this.zzh);
            return zzbVarZzb == null ? zzb.PLATFORM_UNSPECIFIED : zzbVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public zzar zzn() {
            zzar zzarVar = this.zzi;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public zzgxn zzo() {
            return zzgxn.zzw(this.zzj);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public zzgxn zzp() {
            return zzgxn.zzw(this.zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public String zzq() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public String zzr() {
            return this.zzk;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public boolean zzs() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public boolean zzt() {
            return (this.zzg & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzp
        public boolean zzv() {
            return (this.zzg & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzp extends zzhah {
        zzo.zzb zzm();

        zzar zzn();

        zzgxn zzo();

        zzgxn zzp();

        String zzq();

        String zzr();

        boolean zzs();

        boolean zzt();

        boolean zzu();

        boolean zzv();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public enum zzq implements zzgyz {
        ENUM_FALSE(0),
        ENUM_TRUE(1),
        ENUM_UNKNOWN(1000);

        public static final int zzd = 0;
        public static final int zze = 1;
        public static final int zzf = 1000;
        private static final zzgza<zzq> zzg = new zzgza<zzq>() { // from class: com.google.android.gms.internal.ads.zzbch.zzq.1
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzq zzb(int i) {
                return zzq.zzb(i);
            }
        };
        private final int zzi;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        final class zza implements zzgzb {
            static final zzgzb zza = new zza();

            private zza() {
            }

            @Override // com.google.android.gms.internal.ads.zzgzb
            public boolean zza(int i) {
                return zzq.zzb(i) != null;
            }
        }

        zzq(int i) {
            this.zzi = i;
        }

        public static zzq zzb(int i) {
            if (i == 0) {
                return ENUM_FALSE;
            }
            if (i == 1) {
                return ENUM_TRUE;
            }
            if (i != 1000) {
                return null;
            }
            return ENUM_UNKNOWN;
        }

        public static zzgza<zzq> zzd() {
            return zzg;
        }

        public static zzgzb zze() {
            return zza.zza;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.zzi);
        }

        @Override // com.google.android.gms.internal.ads.zzgyz
        public final int zza() {
            return this.zzi;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzr extends zzgyv<zzr, zza> implements zzs {
        public static final int zza = 7;
        public static final int zzb = 8;
        public static final int zzc = 9;
        public static final int zzd = 10;
        public static final int zze = 11;
        public static final int zzf = 12;
        public static final int zzg = 13;
        public static final int zzh = 14;
        public static final int zzi = 15;
        public static final int zzj = 16;
        private static final zzgze<zzd.zza> zzk = new zzgze<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbch.zzr.1
            @Override // com.google.android.gms.internal.ads.zzgze
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i) {
                zzd.zza zzaVarZzb = zzd.zza.zzb(i);
                return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
            }
        };
        private static final zzgze<zzd.zza> zzl = new zzgze<zzd.zza>() { // from class: com.google.android.gms.internal.ads.zzbch.zzr.2
            @Override // com.google.android.gms.internal.ads.zzgze
            /* renamed from: zza, reason: merged with bridge method [inline-methods] */
            public zzd.zza zzb(int i) {
                zzd.zza zzaVarZzb = zzd.zza.zzb(i);
                return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
            }
        };
        private static final zzr zzm;
        private static volatile zzhao<zzr> zzn;
        private int zzA;
        private int zzo;
        private int zzp;
        private zzar zzv;
        private int zzw;
        private int zzz;
        private String zzu = "";
        private String zzx = "";
        private String zzy = "";
        private zzgzd zzB = zzgyv.zzbG();
        private zzgzd zzC = zzgyv.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzr, zza> implements zzs {
            public zza zzA(String str) {
                zzbu();
                ((zzr) this.zza).zzch(str);
                return this;
            }

            public zza zzB(zzgxn zzgxnVar) {
                zzbu();
                ((zzr) this.zza).zzci(zzgxnVar);
                return this;
            }

            public zza zzC(String str) {
                zzbu();
                ((zzr) this.zza).zzcj(str);
                return this;
            }

            public zza zzD(zzgxn zzgxnVar) {
                zzbu();
                ((zzr) this.zza).zzck(zzgxnVar);
                return this;
            }

            public zza zzE(int i) {
                zzbu();
                ((zzr) this.zza).zzcl(i);
                return this;
            }

            public zza zzF(zzar.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzaVar.zzbr());
                return this;
            }

            public zza zzG(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzcm(zzarVar);
                return this;
            }

            public zza zzH(zzo.zzb zzbVar) {
                zzbu();
                ((zzr) this.zza).zzcn(zzbVar);
                return this;
            }

            public zza zzI(int i, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzco(i, zzaVar);
                return this;
            }

            public zza zzJ(int i, zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzcp(i, zzaVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzab.zzc zzK() {
                return ((zzr) this.zza).zzK();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzar zzL() {
                return ((zzr) this.zza).zzL();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzgxn zzM() {
                return ((zzr) this.zza).zzM();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzgxn zzN() {
                return ((zzr) this.zza).zzN();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzgxn zzO() {
                return ((zzr) this.zza).zzO();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public String zzP() {
                return ((zzr) this.zza).zzP();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public String zzQ() {
                return ((zzr) this.zza).zzQ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public String zzR() {
                return ((zzr) this.zza).zzR();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public List<zzd.zza> zzS() {
                return ((zzr) this.zza).zzS();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public List<zzd.zza> zzT() {
                return ((zzr) this.zza).zzT();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzU() {
                return ((zzr) this.zza).zzU();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzV() {
                return ((zzr) this.zza).zzV();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzW() {
                return ((zzr) this.zza).zzW();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzX() {
                return ((zzr) this.zza).zzX();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzY() {
                return ((zzr) this.zza).zzY();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzZ() {
                return ((zzr) this.zza).zzZ();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public int zza() {
                return ((zzr) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzaa() {
                return ((zzr) this.zza).zzaa();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public boolean zzab() {
                return ((zzr) this.zza).zzab();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public int zzb() {
                return ((zzr) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public int zzc() {
                return ((zzr) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zza.EnumC0333zza zzd() {
                return ((zzr) this.zza).zzd();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzd.zza zze(int i) {
                return ((zzr) this.zza).zze(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzd.zza zzf(int i) {
                return ((zzr) this.zza).zzf(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzs
            public zzo.zzb zzg() {
                return ((zzr) this.zza).zzg();
            }

            public zza zzh(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzas(iterable);
                return this;
            }

            public zza zzi(Iterable<? extends zzd.zza> iterable) {
                zzbu();
                ((zzr) this.zza).zzat(iterable);
                return this;
            }

            public zza zzj(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzau(zzaVar);
                return this;
            }

            public zza zzk(zzd.zza zzaVar) {
                zzbu();
                ((zzr) this.zza).zzav(zzaVar);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzr) this.zza).zzaw();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzr) this.zza).zzax();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzr) this.zza).zzay();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzr) this.zza).zzaz();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzr) this.zza).zzaA();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzr) this.zza).zzaB();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzr) this.zza).zzaC();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzr) this.zza).zzaD();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzr) this.zza).zzaE();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzr) this.zza).zzaF();
                return this;
            }

            public zza zzv(zzar zzarVar) {
                zzbu();
                ((zzr) this.zza).zzaI(zzarVar);
                return this;
            }

            public zza zzw(zza.EnumC0333zza enumC0333zza) {
                zzbu();
                ((zzr) this.zza).zzaJ(enumC0333zza);
                return this;
            }

            public zza zzx(String str) {
                zzbu();
                ((zzr) this.zza).zzaK(str);
                return this;
            }

            public zza zzy(zzgxn zzgxnVar) {
                zzbu();
                ((zzr) this.zza).zzcf(zzgxnVar);
                return this;
            }

            public zza zzz(zzab.zzc zzcVar) {
                zzbu();
                ((zzr) this.zza).zzcg(zzcVar);
                return this;
            }

            private zza() {
                super(zzr.zzm);
            }
        }

        static {
            zzr zzrVar = new zzr();
            zzm = zzrVar;
            zzgyv.zzbZ(zzr.class, zzrVar);
        }

        private zzr() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaA() {
            this.zzo &= -3;
            this.zzu = zzk().zzR();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaB() {
            this.zzo &= -2;
            this.zzp = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaC() {
            this.zzv = null;
            this.zzo &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaD() {
            this.zzo &= -9;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE() {
            this.zzC = zzgyv.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF() {
            this.zzB = zzgyv.zzbG();
        }

        private void zzaG() {
            zzgzd zzgzdVar = this.zzC;
            if (zzgzdVar.zzc()) {
                return;
            }
            this.zzC = zzgyv.zzbH(zzgzdVar);
        }

        private void zzaH() {
            zzgzd zzgzdVar = this.zzB;
            if (zzgzdVar.zzc()) {
                return;
            }
            this.zzB = zzgyv.zzbH(zzgzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzv;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzaVarZzf = zzar.zzf(zzarVar2);
                zzaVarZzf.zzbj(zzarVar);
                zzarVar = zzaVarZzf.zzbs();
            }
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ(zza.EnumC0333zza enumC0333zza) {
            this.zzA = enumC0333zza.zza();
            this.zzo |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK(String str) {
            str.getClass();
            this.zzo |= 16;
            this.zzx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzas(Iterable<? extends zzd.zza> iterable) {
            zzaG();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzC.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzat(Iterable<? extends zzd.zza> iterable) {
            zzaH();
            Iterator<? extends zzd.zza> it = iterable.iterator();
            while (it.hasNext()) {
                this.zzB.zzi(it.next().zza());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzau(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzav(zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zzi(zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaw() {
            this.zzo &= -129;
            this.zzA = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzax() {
            this.zzo &= -17;
            this.zzx = zzk().zzP();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzay() {
            this.zzo &= -65;
            this.zzz = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaz() {
            this.zzo &= -33;
            this.zzy = zzk().zzQ();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcf(zzgxn zzgxnVar) {
            this.zzx = zzgxnVar.zzx();
            this.zzo |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg(zzab.zzc zzcVar) {
            this.zzz = zzcVar.zza();
            this.zzo |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch(String str) {
            str.getClass();
            this.zzo |= 32;
            this.zzy = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci(zzgxn zzgxnVar) {
            this.zzy = zzgxnVar.zzx();
            this.zzo |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj(String str) {
            str.getClass();
            this.zzo |= 2;
            this.zzu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck(zzgxn zzgxnVar) {
            this.zzu = zzgxnVar.zzx();
            this.zzo |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl(int i) {
            this.zzo |= 1;
            this.zzp = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm(zzar zzarVar) {
            zzarVar.getClass();
            this.zzv = zzarVar;
            this.zzo |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcn(zzo.zzb zzbVar) {
            this.zzw = zzbVar.zza();
            this.zzo |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaG();
            this.zzC.zze(i, zzaVar.zza());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(int i, zzd.zza zzaVar) {
            zzaVar.getClass();
            zzaH();
            this.zzB.zze(i, zzaVar.zza());
        }

        public static zza zzh() {
            return (zza) zzm.zzaZ();
        }

        public static zza zzi(zzr zzrVar) {
            return (zza) zzm.zzba(zzrVar);
        }

        public static zzr zzk() {
            return zzm;
        }

        public static zzr zzl(InputStream inputStream) throws IOException {
            return (zzr) zzgyv.zzbk(zzm, inputStream);
        }

        public static zzr zzm(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzr) zzgyv.zzbl(zzm, inputStream, zzgyfVar);
        }

        public static zzr zzn(zzgxn zzgxnVar) throws zzgzk {
            return (zzr) zzgyv.zzbm(zzm, zzgxnVar);
        }

        public static zzr zzo(zzgxt zzgxtVar) throws IOException {
            return (zzr) zzgyv.zzbn(zzm, zzgxtVar);
        }

        public static zzr zzp(InputStream inputStream) throws IOException {
            return (zzr) zzgyv.zzbo(zzm, inputStream);
        }

        public static zzr zzq(ByteBuffer byteBuffer) throws zzgzk {
            return (zzr) zzgyv.zzbp(zzm, byteBuffer);
        }

        public static zzr zzr(byte[] bArr) throws zzgzk {
            return (zzr) zzgyv.zzbq(zzm, bArr);
        }

        public static zzr zzs(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzr) zzgyv.zzbr(zzm, zzgxnVar, zzgyfVar);
        }

        public static zzr zzt(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzr) zzgyv.zzbs(zzm, zzgxtVar, zzgyfVar);
        }

        public static zzr zzu(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzr) zzgyv.zzbu(zzm, inputStream, zzgyfVar);
        }

        public static zzr zzv(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzr) zzgyv.zzbv(zzm, byteBuffer, zzgyfVar);
        }

        public static zzr zzw(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzr) zzgyv.zzbx(zzm, bArr, zzgyfVar);
        }

        public static zzhao<zzr> zzx() {
            return zzm.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzab.zzc zzK() {
            zzab.zzc zzcVarZzb = zzab.zzc.zzb(this.zzz);
            return zzcVarZzb == null ? zzab.zzc.NETWORKTYPE_UNSPECIFIED : zzcVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzar zzL() {
            zzar zzarVar = this.zzv;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzgxn zzM() {
            return zzgxn.zzw(this.zzx);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzgxn zzN() {
            return zzgxn.zzw(this.zzy);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzgxn zzO() {
            return zzgxn.zzw(this.zzu);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public String zzP() {
            return this.zzx;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public String zzQ() {
            return this.zzy;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public String zzR() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public List<zzd.zza> zzS() {
            return new zzgzf(this.zzC, zzl);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public List<zzd.zza> zzT() {
            return new zzgzf(this.zzB, zzk);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzU() {
            return (this.zzo & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzV() {
            return (this.zzo & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzW() {
            return (this.zzo & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzX() {
            return (this.zzo & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzY() {
            return (this.zzo & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzZ() {
            return (this.zzo & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public int zza() {
            return this.zzp;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzaa() {
            return (this.zzo & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public boolean zzab() {
            return (this.zzo & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public int zzb() {
            return this.zzC.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public int zzc() {
            return this.zzB.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zza.EnumC0333zza zzd() {
            zza.EnumC0333zza enumC0333zzaZzb = zza.EnumC0333zza.zzb(this.zzA);
            return enumC0333zzaZzb == null ? zza.EnumC0333zza.AD_INITIATER_UNSPECIFIED : enumC0333zzaZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzm, "\u0004\n\u0000\u0001\u0007\u0010\n\u0000\u0002\u0000\u0007င\u0000\bဈ\u0001\tဉ\u0002\n᠌\u0003\u000bဈ\u0004\fဈ\u0005\r᠌\u0006\u000e᠌\u0007\u000fࠞ\u0010ࠞ", new Object[]{"zzo", "zzp", "zzu", "zzv", "zzw", zzo.zzb.zze(), "zzx", "zzy", "zzz", zzab.zzc.zze(), "zzA", zza.EnumC0333zza.zze(), "zzB", zzd.zza.zze(), "zzC", zzd.zza.zze()});
            }
            if (iOrdinal == 3) {
                return new zzr();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzm;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzr> zzhaoVar = zzn;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzr.class) {
                try {
                    zzgyqVar = zzn;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzm);
                        zzn = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzd.zza zze(int i) {
            zzd.zza zzaVarZzb = zzd.zza.zzb(this.zzC.zzd(i));
            return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzd.zza zzf(int i) {
            zzd.zza zzaVarZzb = zzd.zza.zzb(this.zzB.zzd(i));
            return zzaVarZzb == null ? zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED : zzaVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzs
        public zzo.zzb zzg() {
            zzo.zzb zzbVarZzb = zzo.zzb.zzb(this.zzw);
            return zzbVarZzb == null ? zzo.zzb.PLATFORM_UNSPECIFIED : zzbVarZzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzs extends zzhah {
        zzab.zzc zzK();

        zzar zzL();

        zzgxn zzM();

        zzgxn zzN();

        zzgxn zzO();

        String zzP();

        String zzQ();

        String zzR();

        List<zzd.zza> zzS();

        List<zzd.zza> zzT();

        boolean zzU();

        boolean zzV();

        boolean zzW();

        boolean zzX();

        boolean zzY();

        boolean zzZ();

        int zza();

        boolean zzaa();

        boolean zzab();

        int zzb();

        int zzc();

        zza.EnumC0333zza zzd();

        zzd.zza zze(int i);

        zzd.zza zzf(int i);

        zzo.zzb zzg();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzt extends zzgyv<zzt, zza> implements zzu {
        public static final int zza = 9;
        public static final int zzb = 10;
        public static final int zzc = 11;
        public static final int zzd = 12;
        public static final int zze = 13;
        public static final int zzf = 14;
        public static final int zzg = 15;
        public static final int zzh = 16;
        public static final int zzi = 17;
        public static final int zzj = 18;
        public static final int zzk = 19;
        public static final int zzl = 20;
        public static final int zzm = 21;
        private static final zzt zzn;
        private static volatile zzhao<zzt> zzo;
        private zzm zzA;
        private zzo zzB;
        private zzab zzC;
        private zza zzD;
        private zzaf zzE;
        private zzbl zzF;
        private zzb zzG;
        private int zzp;
        private int zzu;
        private int zzw;
        private zzar zzy;
        private String zzv = "";
        private int zzx = 1000;
        private zzgzg zzz = zzgyv.zzbI();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzt, zza> implements zzu {
            public zza zzA(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcq(zzmVar);
                return this;
            }

            public zza zzB(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcr(zzoVar);
                return this;
            }

            public zza zzC(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcs(zzabVar);
                return this;
            }

            public zza zzD(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzct(zzafVar);
                return this;
            }

            public zza zzE(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcu(zzarVar);
                return this;
            }

            public zza zzF(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcv(zzblVar);
                return this;
            }

            public zza zzG(zza.zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzbVar.zzbr());
                return this;
            }

            public zza zzH(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcw(zzaVar);
                return this;
            }

            public zza zzI(zzb.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzcVar.zzbr());
                return this;
            }

            public zza zzJ(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcx(zzbVar);
                return this;
            }

            public zza zzK(zzm.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzaVar.zzbr());
                return this;
            }

            public zza zzL(zzm zzmVar) {
                zzbu();
                ((zzt) this.zza).zzcy(zzmVar);
                return this;
            }

            public zza zzM(zzo.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzaVar.zzbr());
                return this;
            }

            public zza zzN(zzo zzoVar) {
                zzbu();
                ((zzt) this.zza).zzcz(zzoVar);
                return this;
            }

            public zza zzO(String str) {
                zzbu();
                ((zzt) this.zza).zzcA(str);
                return this;
            }

            public zza zzP(zzgxn zzgxnVar) {
                zzbu();
                ((zzt) this.zza).zzcB(zzgxnVar);
                return this;
            }

            public zza zzQ(int i, long j4) {
                zzbu();
                ((zzt) this.zza).zzcC(i, j4);
                return this;
            }

            public zza zzR(zzq zzqVar) {
                zzbu();
                ((zzt) this.zza).zzcD(zzqVar);
                return this;
            }

            public zza zzS(int i) {
                zzbu();
                ((zzt) this.zza).zzcE(i);
                return this;
            }

            public zza zzT(zzab.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzaVar.zzbr());
                return this;
            }

            public zza zzU(zzab zzabVar) {
                zzbu();
                ((zzt) this.zza).zzcF(zzabVar);
                return this;
            }

            public zza zzV(zzaf.zzc zzcVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzcVar.zzbr());
                return this;
            }

            public zza zzW(zzaf zzafVar) {
                zzbu();
                ((zzt) this.zza).zzcG(zzafVar);
                return this;
            }

            public zza zzX(zzar.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzaVar.zzbr());
                return this;
            }

            public zza zzY(zzar zzarVar) {
                zzbu();
                ((zzt) this.zza).zzcH(zzarVar);
                return this;
            }

            public zza zzZ(int i) {
                zzbu();
                ((zzt) this.zza).zzcI(i);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public int zza() {
                return ((zzt) this.zza).zza();
            }

            public zza zzaa(zzbl.zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzaVar.zzbr());
                return this;
            }

            public zza zzab(zzbl zzblVar) {
                zzbu();
                ((zzt) this.zza).zzcJ(zzblVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzab zzac() {
                return ((zzt) this.zza).zzac();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzaf zzad() {
                return ((zzt) this.zza).zzad();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzar zzae() {
                return ((zzt) this.zza).zzae();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzbl zzaf() {
                return ((zzt) this.zza).zzaf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzgxn zzag() {
                return ((zzt) this.zza).zzag();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public String zzah() {
                return ((zzt) this.zza).zzah();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public List<Long> zzai() {
                return Collections.unmodifiableList(((zzt) this.zza).zzai());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzaj() {
                return ((zzt) this.zza).zzaj();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzak() {
                return ((zzt) this.zza).zzak();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzal() {
                return ((zzt) this.zza).zzal();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzam() {
                return ((zzt) this.zza).zzam();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzan() {
                return ((zzt) this.zza).zzan();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzao() {
                return ((zzt) this.zza).zzao();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzap() {
                return ((zzt) this.zza).zzap();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzaq() {
                return ((zzt) this.zza).zzaq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzar() {
                return ((zzt) this.zza).zzar();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzas() {
                return ((zzt) this.zza).zzas();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzat() {
                return ((zzt) this.zza).zzat();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public boolean zzau() {
                return ((zzt) this.zza).zzau();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public int zzb() {
                return ((zzt) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public int zzc() {
                return ((zzt) this.zza).zzc();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public long zzd(int i) {
                return ((zzt) this.zza).zzd(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zza zze() {
                return ((zzt) this.zza).zze();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzb zzf() {
                return ((zzt) this.zza).zzf();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzm zzg() {
                return ((zzt) this.zza).zzg();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzo zzh() {
                return ((zzt) this.zza).zzh();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzu
            public zzq zzi() {
                return ((zzt) this.zza).zzi();
            }

            public zza zzj(Iterable<? extends Long> iterable) {
                zzbu();
                ((zzt) this.zza).zzaE(iterable);
                return this;
            }

            public zza zzk(long j4) {
                zzbu();
                ((zzt) this.zza).zzaF(j4);
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzt) this.zza).zzaG();
                return this;
            }

            public zza zzm() {
                zzbu();
                ((zzt) this.zza).zzaH();
                return this;
            }

            public zza zzn() {
                zzbu();
                ((zzt) this.zza).zzaI();
                return this;
            }

            public zza zzo() {
                zzbu();
                ((zzt) this.zza).zzaJ();
                return this;
            }

            public zza zzp() {
                zzbu();
                ((zzt) this.zza).zzaK();
                return this;
            }

            public zza zzq() {
                zzbu();
                ((zzt) this.zza).zzcf();
                return this;
            }

            public zza zzr() {
                zzbu();
                ((zzt) this.zza).zzcg();
                return this;
            }

            public zza zzs() {
                zzbu();
                ((zzt) this.zza).zzch();
                return this;
            }

            public zza zzt() {
                zzbu();
                ((zzt) this.zza).zzci();
                return this;
            }

            public zza zzu() {
                zzbu();
                ((zzt) this.zza).zzcj();
                return this;
            }

            public zza zzv() {
                zzbu();
                ((zzt) this.zza).zzck();
                return this;
            }

            public zza zzw() {
                zzbu();
                ((zzt) this.zza).zzcl();
                return this;
            }

            public zza zzx() {
                zzbu();
                ((zzt) this.zza).zzcm();
                return this;
            }

            public zza zzy(zza zzaVar) {
                zzbu();
                ((zzt) this.zza).zzco(zzaVar);
                return this;
            }

            public zza zzz(zzb zzbVar) {
                zzbu();
                ((zzt) this.zza).zzcp(zzbVar);
                return this;
            }

            private zza() {
                super(zzt.zzn);
            }
        }

        static {
            zzt zztVar = new zzt();
            zzn = zztVar;
            zzgyv.zzbZ(zzt.class, zztVar);
        }

        private zzt() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaE(Iterable<? extends Long> iterable) {
            zzcn();
            zzgww.zzaQ(iterable, this.zzz);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaF(long j4) {
            zzcn();
            this.zzz.zzg(j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaG() {
            this.zzD = null;
            this.zzp &= -257;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaH() {
            this.zzG = null;
            this.zzp &= -2049;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaI() {
            this.zzA = null;
            this.zzp &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaJ() {
            this.zzB = null;
            this.zzp &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaK() {
            this.zzp &= -3;
            this.zzv = zzm().zzah();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcA(String str) {
            str.getClass();
            this.zzp |= 2;
            this.zzv = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcB(zzgxn zzgxnVar) {
            this.zzv = zzgxnVar.zzx();
            this.zzp |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcC(int i, long j4) {
            zzcn();
            this.zzz.zzd(i, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcD(zzq zzqVar) {
            this.zzx = zzqVar.zza();
            this.zzp |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcE(int i) {
            this.zzp |= 1;
            this.zzu = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcF(zzab zzabVar) {
            zzabVar.getClass();
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcG(zzaf zzafVar) {
            zzafVar.getClass();
            this.zzE = zzafVar;
            this.zzp |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcH(zzar zzarVar) {
            zzarVar.getClass();
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcI(int i) {
            this.zzp |= 4;
            this.zzw = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcJ(zzbl zzblVar) {
            zzblVar.getClass();
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcf() {
            this.zzz = zzgyv.zzbI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcg() {
            this.zzp &= -9;
            this.zzx = 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzch() {
            this.zzp &= -2;
            this.zzu = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzci() {
            this.zzC = null;
            this.zzp &= -129;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcj() {
            this.zzE = null;
            this.zzp &= -513;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzck() {
            this.zzy = null;
            this.zzp &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcl() {
            this.zzp &= -5;
            this.zzw = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcm() {
            this.zzF = null;
            this.zzp &= -1025;
        }

        private void zzcn() {
            zzgzg zzgzgVar = this.zzz;
            if (zzgzgVar.zzc()) {
                return;
            }
            this.zzz = zzgyv.zzbJ(zzgzgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzco(zza zzaVar) {
            zzaVar.getClass();
            zza zzaVar2 = this.zzD;
            if (zzaVar2 != null && zzaVar2 != zza.zzh()) {
                zza.zzb zzbVarZzf = zza.zzf(zzaVar2);
                zzbVarZzf.zzbj(zzaVar);
                zzaVar = zzbVarZzf.zzbs();
            }
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcp(zzb zzbVar) {
            zzbVar.getClass();
            zzb zzbVar2 = this.zzG;
            if (zzbVar2 != null && zzbVar2 != zzb.zzh()) {
                zzb.zzc zzcVarZzf = zzb.zzf(zzbVar2);
                zzcVarZzf.zzbj(zzbVar);
                zzbVar = zzcVarZzf.zzbs();
            }
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcq(zzm zzmVar) {
            zzmVar.getClass();
            zzm zzmVar2 = this.zzA;
            if (zzmVar2 != null && zzmVar2 != zzm.zzg()) {
                zzm.zza zzaVarZzd = zzm.zzd(zzmVar2);
                zzaVarZzd.zzbj(zzmVar);
                zzmVar = zzaVarZzd.zzbs();
            }
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcr(zzo zzoVar) {
            zzoVar.getClass();
            zzo zzoVar2 = this.zzB;
            if (zzoVar2 != null && zzoVar2 != zzo.zzd()) {
                zzo.zza zzaVarZzb = zzo.zzb(zzoVar2);
                zzaVarZzb.zzbj(zzoVar);
                zzoVar = zzaVarZzb.zzbs();
            }
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcs(zzab zzabVar) {
            zzabVar.getClass();
            zzab zzabVar2 = this.zzC;
            if (zzabVar2 != null && zzabVar2 != zzab.zzd()) {
                zzab.zza zzaVarZzb = zzab.zzb(zzabVar2);
                zzaVarZzb.zzbj(zzabVar);
                zzabVar = zzaVarZzb.zzbs();
            }
            this.zzC = zzabVar;
            this.zzp |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzct(zzaf zzafVar) {
            zzafVar.getClass();
            zzaf zzafVar2 = this.zzE;
            if (zzafVar2 != null && zzafVar2 != zzaf.zzl()) {
                zzaf.zzc zzcVarZzj = zzaf.zzj(zzafVar2);
                zzcVarZzj.zzbj(zzafVar);
                zzafVar = zzcVarZzj.zzbs();
            }
            this.zzE = zzafVar;
            this.zzp |= AdRequest.MAX_CONTENT_URL_LENGTH;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcu(zzar zzarVar) {
            zzarVar.getClass();
            zzar zzarVar2 = this.zzy;
            if (zzarVar2 != null && zzarVar2 != zzar.zzh()) {
                zzar.zza zzaVarZzf = zzar.zzf(zzarVar2);
                zzaVarZzf.zzbj(zzarVar);
                zzarVar = zzaVarZzf.zzbs();
            }
            this.zzy = zzarVar;
            this.zzp |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcv(zzbl zzblVar) {
            zzblVar.getClass();
            zzbl zzblVar2 = this.zzF;
            if (zzblVar2 != null && zzblVar2 != zzbl.zzi()) {
                zzbl.zza zzaVarZzc = zzbl.zzc(zzblVar2);
                zzaVarZzc.zzbj(zzblVar);
                zzblVar = zzaVarZzc.zzbs();
            }
            this.zzF = zzblVar;
            this.zzp |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcw(zza zzaVar) {
            zzaVar.getClass();
            this.zzD = zzaVar;
            this.zzp |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcx(zzb zzbVar) {
            zzbVar.getClass();
            this.zzG = zzbVar;
            this.zzp |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcy(zzm zzmVar) {
            zzmVar.getClass();
            this.zzA = zzmVar;
            this.zzp |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzcz(zzo zzoVar) {
            zzoVar.getClass();
            this.zzB = zzoVar;
            this.zzp |= 64;
        }

        public static zza zzj() {
            return (zza) zzn.zzaZ();
        }

        public static zza zzk(zzt zztVar) {
            return (zza) zzn.zzba(zztVar);
        }

        public static zzt zzm() {
            return zzn;
        }

        public static zzt zzn(InputStream inputStream) throws IOException {
            return (zzt) zzgyv.zzbk(zzn, inputStream);
        }

        public static zzt zzo(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzt) zzgyv.zzbl(zzn, inputStream, zzgyfVar);
        }

        public static zzt zzp(zzgxn zzgxnVar) throws zzgzk {
            return (zzt) zzgyv.zzbm(zzn, zzgxnVar);
        }

        public static zzt zzq(zzgxt zzgxtVar) throws IOException {
            return (zzt) zzgyv.zzbn(zzn, zzgxtVar);
        }

        public static zzt zzr(InputStream inputStream) throws IOException {
            return (zzt) zzgyv.zzbo(zzn, inputStream);
        }

        public static zzt zzs(ByteBuffer byteBuffer) throws zzgzk {
            return (zzt) zzgyv.zzbp(zzn, byteBuffer);
        }

        public static zzt zzt(byte[] bArr) throws zzgzk {
            return (zzt) zzgyv.zzbq(zzn, bArr);
        }

        public static zzt zzu(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzt) zzgyv.zzbr(zzn, zzgxnVar, zzgyfVar);
        }

        public static zzt zzv(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzt) zzgyv.zzbs(zzn, zzgxtVar, zzgyfVar);
        }

        public static zzt zzw(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzt) zzgyv.zzbu(zzn, inputStream, zzgyfVar);
        }

        public static zzt zzx(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzt) zzgyv.zzbv(zzn, byteBuffer, zzgyfVar);
        }

        public static zzt zzy(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzt) zzgyv.zzbx(zzn, bArr, zzgyfVar);
        }

        public static zzhao<zzt> zzz() {
            return zzn.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public int zza() {
            return this.zzz.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzab zzac() {
            zzab zzabVar = this.zzC;
            return zzabVar == null ? zzab.zzd() : zzabVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzaf zzad() {
            zzaf zzafVar = this.zzE;
            return zzafVar == null ? zzaf.zzl() : zzafVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzar zzae() {
            zzar zzarVar = this.zzy;
            return zzarVar == null ? zzar.zzh() : zzarVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzbl zzaf() {
            zzbl zzblVar = this.zzF;
            return zzblVar == null ? zzbl.zzi() : zzblVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzgxn zzag() {
            return zzgxn.zzw(this.zzv);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public String zzah() {
            return this.zzv;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public List<Long> zzai() {
            return this.zzz;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzaj() {
            return (this.zzp & 256) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzak() {
            return (this.zzp & 2048) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzal() {
            return (this.zzp & 32) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzam() {
            return (this.zzp & 64) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzan() {
            return (this.zzp & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzao() {
            return (this.zzp & 8) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzap() {
            return (this.zzp & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzaq() {
            return (this.zzp & 128) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzar() {
            return (this.zzp & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzas() {
            return (this.zzp & 16) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzat() {
            return (this.zzp & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public boolean zzau() {
            return (this.zzp & 1024) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public int zzb() {
            return this.zzu;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public int zzc() {
            return this.zzw;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public long zzd(int i) {
            return this.zzz.zza(i);
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", zzq.zze(), "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
            }
            if (iOrdinal == 3) {
                return new zzt();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzn;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzt> zzhaoVar = zzo;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzt.class) {
                try {
                    zzgyqVar = zzo;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzn);
                        zzo = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zza zze() {
            zza zzaVar = this.zzD;
            return zzaVar == null ? zza.zzh() : zzaVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzb zzf() {
            zzb zzbVar = this.zzG;
            return zzbVar == null ? zzb.zzh() : zzbVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzm zzg() {
            zzm zzmVar = this.zzA;
            return zzmVar == null ? zzm.zzg() : zzmVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzo zzh() {
            zzo zzoVar = this.zzB;
            return zzoVar == null ? zzo.zzd() : zzoVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzu
        public zzq zzi() {
            zzq zzqVarZzb = zzq.zzb(this.zzx);
            return zzqVarZzb == null ? zzq.ENUM_UNKNOWN : zzqVarZzb;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzu extends zzhah {
        int zza();

        zzab zzac();

        zzaf zzad();

        zzar zzae();

        zzbl zzaf();

        zzgxn zzag();

        String zzah();

        List<Long> zzai();

        boolean zzaj();

        boolean zzak();

        boolean zzal();

        boolean zzam();

        boolean zzan();

        boolean zzao();

        boolean zzap();

        boolean zzaq();

        boolean zzar();

        boolean zzas();

        boolean zzat();

        boolean zzau();

        int zzb();

        int zzc();

        long zzd(int i);

        zza zze();

        zzb zzf();

        zzm zzg();

        zzo zzh();

        zzq zzi();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzv extends zzgyv<zzv, zza> implements zzw {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzv zze;
        private static volatile zzhao<zzv> zzf;
        private int zzg;
        private int zzi;
        private zzap zzk;
        private String zzh = "";
        private zzgzd zzj = zzgyv.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzv, zza> implements zzw {
            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public int zza(int i) {
                return ((zzv) this.zza).zza(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public int zzb() {
                return ((zzv) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public zzq zzc() {
                return ((zzv) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzv) this.zza).zzO(iterable);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzv) this.zza).zzP(i);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzv) this.zza).zzQ();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzv) this.zza).zzR();
                return this;
            }

            public zza zzh() {
                zzbu();
                ((zzv) this.zza).zzS();
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzv) this.zza).zzT();
                return this;
            }

            public zza zzj(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzV(zzapVar);
                return this;
            }

            public zza zzk(String str) {
                zzbu();
                ((zzv) this.zza).zzW(str);
                return this;
            }

            public zza zzl(zzgxn zzgxnVar) {
                zzbu();
                ((zzv) this.zza).zzX(zzgxnVar);
                return this;
            }

            public zza zzm(zzap.zza zzaVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzaVar.zzbr());
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzv) this.zza).zzY(zzapVar);
                return this;
            }

            public zza zzo(zzq zzqVar) {
                zzbu();
                ((zzv) this.zza).zzZ(zzqVar);
                return this;
            }

            public zza zzp(int i, int i10) {
                zzbu();
                ((zzv) this.zza).zzaa(i, i10);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public zzap zzq() {
                return ((zzv) this.zza).zzq();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public zzgxn zzr() {
                return ((zzv) this.zza).zzr();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public String zzs() {
                return ((zzv) this.zza).zzs();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public List<Integer> zzt() {
                return Collections.unmodifiableList(((zzv) this.zza).zzt());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public boolean zzu() {
                return ((zzv) this.zza).zzu();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public boolean zzv() {
                return ((zzv) this.zza).zzv();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzw
            public boolean zzw() {
                return ((zzv) this.zza).zzw();
            }

            private zza() {
                super(zzv.zze);
            }
        }

        static {
            zzv zzvVar = new zzv();
            zze = zzvVar;
            zzgyv.zzbZ(zzv.class, zzvVar);
        }

        private zzv() {
        }

        public static zzv zzA(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzv) zzgyv.zzbx(zze, bArr, zzgyfVar);
        }

        public static zzhao<zzv> zzB() {
            return zze.zzbN();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzO(Iterable<? extends Integer> iterable) {
            zzU();
            zzgww.zzaQ(iterable, this.zzj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzP(int i) {
            zzU();
            this.zzj.zzi(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzQ() {
            this.zzg &= -2;
            this.zzh = zzh().zzs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS() {
            this.zzg &= -3;
            this.zzi = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT() {
            this.zzj = zzgyv.zzbG();
        }

        private void zzU() {
            zzgzd zzgzdVar = this.zzj;
            if (zzgzdVar.zzc()) {
                return;
            }
            this.zzj = zzgyv.zzbH(zzgzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW(String str) {
            str.getClass();
            this.zzg |= 1;
            this.zzh = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX(zzgxn zzgxnVar) {
            this.zzh = zzgxnVar.zzx();
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzY(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzq zzqVar) {
            this.zzi = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(int i, int i10) {
            zzU();
            this.zzj.zze(i, i10);
        }

        public static zza zzd() {
            return (zza) zze.zzaZ();
        }

        public static zza zzf(zzv zzvVar) {
            return (zza) zze.zzba(zzvVar);
        }

        public static zzv zzh() {
            return zze;
        }

        public static zzv zzi(InputStream inputStream) throws IOException {
            return (zzv) zzgyv.zzbk(zze, inputStream);
        }

        public static zzv zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzv) zzgyv.zzbl(zze, inputStream, zzgyfVar);
        }

        public static zzv zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzv) zzgyv.zzbm(zze, zzgxnVar);
        }

        public static zzv zzl(zzgxt zzgxtVar) throws IOException {
            return (zzv) zzgyv.zzbn(zze, zzgxtVar);
        }

        public static zzv zzm(InputStream inputStream) throws IOException {
            return (zzv) zzgyv.zzbo(zze, inputStream);
        }

        public static zzv zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzv) zzgyv.zzbp(zze, byteBuffer);
        }

        public static zzv zzo(byte[] bArr) throws zzgzk {
            return (zzv) zzgyv.zzbq(zze, bArr);
        }

        public static zzv zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzv) zzgyv.zzbr(zze, zzgxnVar, zzgyfVar);
        }

        public static zzv zzx(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzv) zzgyv.zzbs(zze, zzgxtVar, zzgyfVar);
        }

        public static zzv zzy(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzv) zzgyv.zzbu(zze, inputStream, zzgyfVar);
        }

        public static zzv zzz(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzv) zzgyv.zzbv(zze, byteBuffer, zzgyfVar);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public int zza(int i) {
            return this.zzj.zzd(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public int zzb() {
            return this.zzj.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public zzq zzc() {
            zzq zzqVarZzb = zzq.zzb(this.zzi);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzq.zze(), "zzj", "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzv();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zze;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzv> zzhaoVar = zzf;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzv.class) {
                try {
                    zzgyqVar = zzf;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zze);
                        zzf = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public zzap zzq() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public zzgxn zzr() {
            return zzgxn.zzw(this.zzh);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public String zzs() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public List<Integer> zzt() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public boolean zzu() {
            return (this.zzg & 1) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public boolean zzv() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzw
        public boolean zzw() {
            return (this.zzg & 2) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzw extends zzhah {
        int zza(int i);

        int zzb();

        zzq zzc();

        zzap zzq();

        zzgxn zzr();

        String zzs();

        List<Integer> zzt();

        boolean zzu();

        boolean zzv();

        boolean zzw();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzx extends zzgyv<zzx, zza> implements zzy {
        public static final int zza = 1;
        public static final int zzb = 2;
        private static final zzx zzc;
        private static volatile zzhao<zzx> zzd;
        private int zze;
        private int zzf;
        private zzgzd zzg = zzgyv.zzbG();

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzx, zza> implements zzy {
            @Override // com.google.android.gms.internal.ads.zzbch.zzy
            public int zza(int i) {
                return ((zzx) this.zza).zza(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzy
            public int zzb() {
                return ((zzx) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzy
            public zzq zzc() {
                return ((zzx) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends Integer> iterable) {
                zzbu();
                ((zzx) this.zza).zzD(iterable);
                return this;
            }

            public zza zze(int i) {
                zzbu();
                ((zzx) this.zza).zzE(i);
                return this;
            }

            public zza zzf() {
                zzbu();
                ((zzx) this.zza).zzF();
                return this;
            }

            public zza zzg() {
                zzbu();
                ((zzx) this.zza).zzG();
                return this;
            }

            public zza zzh(int i, int i10) {
                zzbu();
                ((zzx) this.zza).zzI(i, i10);
                return this;
            }

            public zza zzi(zzq zzqVar) {
                zzbu();
                ((zzx) this.zza).zzJ(zzqVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzy
            public List<Integer> zzj() {
                return Collections.unmodifiableList(((zzx) this.zza).zzj());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzy
            public boolean zzk() {
                return ((zzx) this.zza).zzk();
            }

            private zza() {
                super(zzx.zzc);
            }
        }

        static {
            zzx zzxVar = new zzx();
            zzc = zzxVar;
            zzgyv.zzbZ(zzx.class, zzxVar);
        }

        private zzx() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzD(Iterable<? extends Integer> iterable) {
            zzH();
            zzgww.zzaQ(iterable, this.zzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzE(int i) {
            zzH();
            this.zzg.zzi(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzF() {
            this.zzg = zzgyv.zzbG();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzG() {
            this.zze &= -2;
            this.zzf = 0;
        }

        private void zzH() {
            zzgzd zzgzdVar = this.zzg;
            if (zzgzdVar.zzc()) {
                return;
            }
            this.zzg = zzgyv.zzbH(zzgzdVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzI(int i, int i10) {
            zzH();
            this.zzg.zze(i, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzJ(zzq zzqVar) {
            this.zzf = zzqVar.zza();
            this.zze |= 1;
        }

        public static zza zzd() {
            return (zza) zzc.zzaZ();
        }

        public static zza zzf(zzx zzxVar) {
            return (zza) zzc.zzba(zzxVar);
        }

        public static zzx zzh() {
            return zzc;
        }

        public static zzx zzi(InputStream inputStream) throws IOException {
            return (zzx) zzgyv.zzbk(zzc, inputStream);
        }

        public static zzx zzl(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzx) zzgyv.zzbl(zzc, inputStream, zzgyfVar);
        }

        public static zzx zzm(zzgxn zzgxnVar) throws zzgzk {
            return (zzx) zzgyv.zzbm(zzc, zzgxnVar);
        }

        public static zzx zzn(zzgxt zzgxtVar) throws IOException {
            return (zzx) zzgyv.zzbn(zzc, zzgxtVar);
        }

        public static zzx zzo(InputStream inputStream) throws IOException {
            return (zzx) zzgyv.zzbo(zzc, inputStream);
        }

        public static zzx zzp(ByteBuffer byteBuffer) throws zzgzk {
            return (zzx) zzgyv.zzbp(zzc, byteBuffer);
        }

        public static zzx zzq(byte[] bArr) throws zzgzk {
            return (zzx) zzgyv.zzbq(zzc, bArr);
        }

        public static zzx zzr(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzx) zzgyv.zzbr(zzc, zzgxnVar, zzgyfVar);
        }

        public static zzx zzs(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzx) zzgyv.zzbs(zzc, zzgxtVar, zzgyfVar);
        }

        public static zzx zzt(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzx) zzgyv.zzbu(zzc, inputStream, zzgyfVar);
        }

        public static zzx zzu(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzx) zzgyv.zzbv(zzc, byteBuffer, zzgyfVar);
        }

        public static zzx zzv(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzx) zzgyv.zzbx(zzc, bArr, zzgyfVar);
        }

        public static zzhao<zzx> zzw() {
            return zzc.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzy
        public int zza(int i) {
            return this.zzg.zzd(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzy
        public int zzb() {
            return this.zzg.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzy
        public zzq zzc() {
            zzq zzqVarZzb = zzq.zzb(this.zzf);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u0016", new Object[]{"zze", "zzf", zzq.zze(), "zzg"});
            }
            if (iOrdinal == 3) {
                return new zzx();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zzc;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzx> zzhaoVar = zzd;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzx.class) {
                try {
                    zzgyqVar = zzd;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zzc);
                        zzd = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzy
        public List<Integer> zzj() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzy
        public boolean zzk() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public interface zzy extends zzhah {
        int zza(int i);

        int zzb();

        zzq zzc();

        List<Integer> zzj();

        boolean zzk();
    }

    /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
    public final class zzz extends zzgyv<zzz, zza> implements zzaa {
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        private static final zzz zze;
        private static volatile zzhao<zzz> zzf;
        private int zzg;
        private zzv zzh;
        private zzgzh<zzan> zzi = zzgyv.zzbK();
        private int zzj;
        private zzap zzk;

        /* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
        public final class zza extends zzgyp<zzz, zza> implements zzaa {
            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public boolean zzA() {
                return ((zzz) this.zza).zzA();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public boolean zzB() {
                return ((zzz) this.zza).zzB();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public int zza() {
                return ((zzz) this.zza).zza();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public zzq zzb() {
                return ((zzz) this.zza).zzb();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public zzv zzc() {
                return ((zzz) this.zza).zzc();
            }

            public zza zzd(Iterable<? extends zzan> iterable) {
                zzbu();
                ((zzz) this.zza).zzR(iterable);
                return this;
            }

            public zza zze(zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzaVar.zzbr());
                return this;
            }

            public zza zzf(zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzS(zzanVar);
                return this;
            }

            public zza zzg(int i, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzT(i, zzaVar.zzbr());
                return this;
            }

            public zza zzh(int i, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzT(i, zzanVar);
                return this;
            }

            public zza zzi() {
                zzbu();
                ((zzz) this.zza).zzU();
                return this;
            }

            public zza zzj() {
                zzbu();
                ((zzz) this.zza).zzV();
                return this;
            }

            public zza zzk() {
                zzbu();
                ((zzz) this.zza).zzW();
                return this;
            }

            public zza zzl() {
                zzbu();
                ((zzz) this.zza).zzX();
                return this;
            }

            public zza zzm(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzZ(zzvVar);
                return this;
            }

            public zza zzn(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzaa(zzapVar);
                return this;
            }

            public zza zzo(int i) {
                zzbu();
                ((zzz) this.zza).zzab(i);
                return this;
            }

            public zza zzp(zzv.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzaVar.zzbr());
                return this;
            }

            public zza zzq(zzv zzvVar) {
                zzbu();
                ((zzz) this.zza).zzac(zzvVar);
                return this;
            }

            public zza zzr(zzap.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzaVar.zzbr());
                return this;
            }

            public zza zzs(zzap zzapVar) {
                zzbu();
                ((zzz) this.zza).zzad(zzapVar);
                return this;
            }

            public zza zzt(zzq zzqVar) {
                zzbu();
                ((zzz) this.zza).zzae(zzqVar);
                return this;
            }

            public zza zzu(int i, zzan.zza zzaVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i, zzaVar.zzbr());
                return this;
            }

            public zza zzv(int i, zzan zzanVar) {
                zzbu();
                ((zzz) this.zza).zzaf(i, zzanVar);
                return this;
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public zzan zzw(int i) {
                return ((zzz) this.zza).zzw(i);
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public zzap zzx() {
                return ((zzz) this.zza).zzx();
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public List<zzan> zzy() {
                return Collections.unmodifiableList(((zzz) this.zza).zzy());
            }

            @Override // com.google.android.gms.internal.ads.zzbch.zzaa
            public boolean zzz() {
                return ((zzz) this.zza).zzz();
            }

            private zza() {
                super(zzz.zze);
            }
        }

        static {
            zzz zzzVar = new zzz();
            zze = zzzVar;
            zzgyv.zzbZ(zzz.class, zzzVar);
        }

        private zzz() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzR(Iterable<? extends zzan> iterable) {
            zzY();
            zzgww.zzaQ(iterable, this.zzi);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzS(zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzT(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.add(i, zzanVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzU() {
            this.zzh = null;
            this.zzg &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzV() {
            this.zzk = null;
            this.zzg &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzW() {
            this.zzg &= -3;
            this.zzj = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzX() {
            this.zzi = zzgyv.zzbK();
        }

        private void zzY() {
            zzgzh<zzan> zzgzhVar = this.zzi;
            if (zzgzhVar.zzc()) {
                return;
            }
            this.zzi = zzgyv.zzbL(zzgzhVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzZ(zzv zzvVar) {
            zzvVar.getClass();
            zzv zzvVar2 = this.zzh;
            if (zzvVar2 != null && zzvVar2 != zzv.zzh()) {
                zzv.zza zzaVarZzf = zzv.zzf(zzvVar2);
                zzaVarZzf.zzbj(zzvVar);
                zzvVar = zzaVarZzf.zzbs();
            }
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaa(zzap zzapVar) {
            zzapVar.getClass();
            zzap zzapVar2 = this.zzk;
            if (zzapVar2 != null && zzapVar2 != zzap.zzi()) {
                zzap.zza zzaVarZzd = zzap.zzd(zzapVar2);
                zzaVarZzd.zzbj(zzapVar);
                zzapVar = zzaVarZzd.zzbs();
            }
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzab(int i) {
            zzY();
            this.zzi.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzac(zzv zzvVar) {
            zzvVar.getClass();
            this.zzh = zzvVar;
            this.zzg |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzad(zzap zzapVar) {
            zzapVar.getClass();
            this.zzk = zzapVar;
            this.zzg |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzae(zzq zzqVar) {
            this.zzj = zzqVar.zza();
            this.zzg |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void zzaf(int i, zzan zzanVar) {
            zzanVar.getClass();
            zzY();
            this.zzi.set(i, zzanVar);
        }

        public static zza zzd() {
            return (zza) zze.zzaZ();
        }

        public static zza zzf(zzz zzzVar) {
            return (zza) zze.zzba(zzzVar);
        }

        public static zzz zzh() {
            return zze;
        }

        public static zzz zzi(InputStream inputStream) throws IOException {
            return (zzz) zzgyv.zzbk(zze, inputStream);
        }

        public static zzz zzj(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzz) zzgyv.zzbl(zze, inputStream, zzgyfVar);
        }

        public static zzz zzk(zzgxn zzgxnVar) throws zzgzk {
            return (zzz) zzgyv.zzbm(zze, zzgxnVar);
        }

        public static zzz zzl(zzgxt zzgxtVar) throws IOException {
            return (zzz) zzgyv.zzbn(zze, zzgxtVar);
        }

        public static zzz zzm(InputStream inputStream) throws IOException {
            return (zzz) zzgyv.zzbo(zze, inputStream);
        }

        public static zzz zzn(ByteBuffer byteBuffer) throws zzgzk {
            return (zzz) zzgyv.zzbp(zze, byteBuffer);
        }

        public static zzz zzo(byte[] bArr) throws zzgzk {
            return (zzz) zzgyv.zzbq(zze, bArr);
        }

        public static zzz zzp(zzgxn zzgxnVar, zzgyf zzgyfVar) throws zzgzk {
            return (zzz) zzgyv.zzbr(zze, zzgxnVar, zzgyfVar);
        }

        public static zzz zzq(zzgxt zzgxtVar, zzgyf zzgyfVar) throws IOException {
            return (zzz) zzgyv.zzbs(zze, zzgxtVar, zzgyfVar);
        }

        public static zzz zzr(InputStream inputStream, zzgyf zzgyfVar) throws IOException {
            return (zzz) zzgyv.zzbu(zze, inputStream, zzgyfVar);
        }

        public static zzz zzs(ByteBuffer byteBuffer, zzgyf zzgyfVar) throws zzgzk {
            return (zzz) zzgyv.zzbv(zze, byteBuffer, zzgyfVar);
        }

        public static zzz zzt(byte[] bArr, zzgyf zzgyfVar) throws zzgzk {
            return (zzz) zzgyv.zzbx(zze, bArr, zzgyfVar);
        }

        public static zzhao<zzz> zzv() {
            return zze.zzbN();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public boolean zzA() {
            return (this.zzg & 4) != 0;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public boolean zzB() {
            return (this.zzg & 2) != 0;
        }

        public List<? extends zzao> zzC() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public int zza() {
            return this.zzi.size();
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public zzq zzb() {
            zzq zzqVarZzb = zzq.zzb(this.zzj);
            return zzqVarZzb == null ? zzq.ENUM_FALSE : zzqVarZzb;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public zzv zzc() {
            zzv zzvVar = this.zzh;
            return zzvVar == null ? zzv.zzh() : zzvVar;
        }

        @Override // com.google.android.gms.internal.ads.zzgyv
        public final Object zzdd(zzgyu zzgyuVar, Object obj, Object obj2) {
            zzhao zzgyqVar;
            int iOrdinal = zzgyuVar.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return zzgyv.zzbQ(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", zzan.class, "zzj", zzq.zze(), "zzk"});
            }
            if (iOrdinal == 3) {
                return new zzz();
            }
            if (iOrdinal == 4) {
                return new zza();
            }
            if (iOrdinal == 5) {
                return zze;
            }
            if (iOrdinal != 6) {
                throw null;
            }
            zzhao<zzz> zzhaoVar = zzf;
            if (zzhaoVar != null) {
                return zzhaoVar;
            }
            synchronized (zzz.class) {
                try {
                    zzgyqVar = zzf;
                    if (zzgyqVar == null) {
                        zzgyqVar = new zzgyq(zze);
                        zzf = zzgyqVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzgyqVar;
        }

        public zzao zzu(int i) {
            return this.zzi.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public zzan zzw(int i) {
            return this.zzi.get(i);
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public zzap zzx() {
            zzap zzapVar = this.zzk;
            return zzapVar == null ? zzap.zzi() : zzapVar;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public List<zzan> zzy() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.ads.zzbch.zzaa
        public boolean zzz() {
            return (this.zzg & 1) != 0;
        }
    }

    private zzbch() {
    }

    public static void zza(zzgyf zzgyfVar) {
    }
}
