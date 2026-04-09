package com.google.android.gms.internal.ads;

import I0.f;
import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxj extends zzayi {
    private static final zzayj zzh = new zzayj();
    private final zzasn zzi;
    private final Context zzj;
    private final zzaun zzk;

    public zzaxj(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, Context context, zzase zzaseVar, zzasn zzasnVar, zzaun zzaunVar) {
        super(zzawvVar, "5l2BxulTXy+0Wovy9T0xreNvMgccuxz9Mfzqj2nIzDWreku9cf/hyHYbFP2gke7n", "rfz55QLsxMWzB2XqDjYWCElC2tXCWyMh5Hq3cP2KfWk=", zzasrVar, i, 27);
        this.zzj = context;
        this.zzi = zzasnVar;
        this.zzk = zzaunVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final zzauk zzc() throws IllegalAccessException, InvocationTargetException {
        String str;
        int iIntValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcU)).booleanValue() ? ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcZ)).intValue() : this.zzi.zza();
        zzauk zzaukVar = new zzauk((String) this.zze.invoke(null, this.zzj, Boolean.FALSE, ""));
        zzaun zzaunVar = this.zzk;
        if (zzaunVar == null || zzaunVar.zza() == null) {
            str = "E";
        } else {
            try {
                str = (String) zzaunVar.zza().get(iIntValue, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            }
        }
        zzaukVar.zza = str;
        return zzaukVar;
    }

    private final String zzd() throws ExecutionException, InterruptedException {
        try {
            zzawv zzawvVar = this.zza;
            if (zzawvVar.zzk() != null) {
                zzawvVar.zzk().get();
            }
            zzato zzatoVarZzc = zzawvVar.zzc();
            if (zzatoVarZzc == null || !zzatoVarZzc.zzaf()) {
                return null;
            }
            return zzatoVarZzc.zzg();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int i;
        zzauk zzaukVarZzc;
        zzauk zzaukVar;
        zzayj zzayjVar = zzh;
        Context context = this.zzj;
        AtomicReference atomicReferenceZza = zzayjVar.zza(context.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                zzauk zzaukVar2 = (zzauk) atomicReferenceZza.get();
                if (zzaukVar2 == null || zzawy.zzd(zzaukVar2.zza) || zzaukVar2.zza.equals("E") || zzaukVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (zzawy.zzd(null)) {
                        zzawy.zzd(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    if (this.zzk != null) {
                        zzaukVarZzc = zzc();
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(i == 3 && !this.zzi.zzd());
                        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcI);
                        String strZzb = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcH)).booleanValue() ? zzb() : null;
                        if (bool.booleanValue() && this.zza.zzo() && zzawy.zzd(strZzb)) {
                            strZzb = zzd();
                        }
                        zzauk zzaukVar3 = new zzauk((String) this.zze.invoke(null, context, boolValueOf, strZzb));
                        if (zzawy.zzd(zzaukVar3.zza) || zzaukVar3.zza.equals("E")) {
                            int i10 = i - 1;
                            if (i10 == 3) {
                                String strZzd = zzd();
                                if (!zzawy.zzd(strZzd)) {
                                    zzaukVar3.zza = strZzd;
                                }
                            } else if (i10 == 4) {
                                throw null;
                            }
                        }
                        zzaukVarZzc = zzaukVar3;
                    }
                    atomicReferenceZza.set(zzaukVarZzc);
                }
                zzaukVar = (zzauk) atomicReferenceZza.get();
            } finally {
            }
        }
        zzasr zzasrVar = this.zzd;
        synchronized (zzasrVar) {
            if (zzaukVar != null) {
                try {
                    zzasrVar.zzv(zzaukVar.zza);
                    zzasrVar.zzV(zzaukVar.zzb);
                    zzasrVar.zzX(zzaukVar.zzc);
                    zzasrVar.zzi(zzaukVar.zzd);
                    zzasrVar.zzu(zzaukVar.zze);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.zzayk] */
    public final String zzb() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = zzawy.zzf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcJ));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzawy.zzf((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzcK)))));
            }
            Context context = this.zzj;
            String packageName = context.getPackageName();
            this.zza.zzj();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final zzgdv zzgdvVarZze = zzgdv.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzayk
                public final void onChecksumsReady(List list) {
                    zzgdv zzgdvVar = zzgdvVarZze;
                    if (list == null) {
                        zzgdvVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumC = f.c(list.get(i));
                            if (apkChecksumC.getType() == 8) {
                                zzgdvVar.zzc(zzawy.zzb(apkChecksumC.getValue()));
                                return;
                            }
                        }
                        zzgdvVar.zzc(null);
                    } catch (Throwable unused) {
                        zzgdvVar.zzc(null);
                    }
                }
            });
            return (String) zzgdvVarZze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
