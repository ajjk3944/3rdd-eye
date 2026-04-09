package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.util.Pair;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class zzgfz implements zzgfx {
    ClassLoader zza;
    private final Context zzb;
    private final ExecutorService zzc;
    private final zzgfe zzd;
    private final zzgfw zze;
    private final zzgoe zzf;
    private final Set zzh;
    private final long zzj;
    private final File zzk;
    private boolean zzl;
    private byte[] zzm;
    private final String zzg = "1764808731656";
    private final Map zzi = new HashMap();

    public zzgfz(Context context, ExecutorService executorService, zzgfe zzgfeVar, zzgfw zzgfwVar, File file, zzgoe zzgoeVar, long j10, String str, String str2, String str3, Set set) {
        this.zzb = context;
        this.zzc = executorService;
        this.zzd = zzgfeVar;
        this.zze = zzgfwVar;
        this.zzf = zzgoeVar;
        this.zzh = set;
        this.zzk = new File(file, "rbp");
        this.zzj = j10;
    }

    private final void zze(File file, String str) throws Throwable {
        FileInputStream fileInputStream;
        if (new File(file.toString().concat("/1764808731656.tmp")).exists()) {
            return;
        }
        File file2 = new File(file.toString().concat("/1764808731656.dex"));
        if (!file2.exists()) {
            return;
        }
        long length = file2.length();
        if (length <= 0) {
            return;
        }
        byte[] bArr = new byte[(int) length];
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file2);
                try {
                } catch (zzgfv e10) {
                    e = e10;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(Sdk$SDKError.Reason.MRAID_ERROR_VALUE, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (IOException e11) {
                    e = e11;
                    fileInputStream2 = fileInputStream;
                    this.zzf.zzd(Sdk$SDKError.Reason.MRAID_ERROR_VALUE, e);
                    zzh(fileInputStream2);
                    zzf(file2);
                    return;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    zzh(fileInputStream2);
                    zzf(file2);
                    throw th;
                }
            } catch (zzgfv e12) {
                e = e12;
            } catch (IOException e13) {
                e = e13;
            }
            if (fileInputStream.read(bArr) <= 0) {
                zzh(fileInputStream);
                zzf(file2);
                return;
            }
            zzaxj zzaxjVarZzg = zzaxk.zzg();
            byte[] bytes = Build.VERSION.SDK.getBytes();
            zzian zzianVar = zzian.zza;
            zzaxjVarZzg.zzd(zzian.zzs(bytes, 0, bytes.length));
            byte[] bytes2 = "1764808731656".getBytes();
            zzaxjVarZzg.zzc(zzian.zzs(bytes2, 0, bytes2.length));
            throw new zzgfv();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void zzf(File file) {
        if (file.exists()) {
            file.delete();
        }
    }

    private static void zzg(String str) {
        zzf(new File(str));
    }

    private static void zzh(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 0, insn: 0x0270: INVOKE (r0 I:com.google.android.gms.internal.ads.zzgoc) VIRTUAL call: com.google.android.gms.internal.ads.zzgoc.zzc():void A[Catch: all -> 0x026e, MD:():void (m), TRY_ENTER] (LINE:625), block:B:118:0x0270 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc A[Catch: all -> 0x0031, zzgcb -> 0x0034, TryCatch #18 {zzgcb -> 0x0034, all -> 0x0031, blocks: (B:4:0x0009, B:7:0x000f, B:9:0x0018, B:11:0x0027, B:21:0x003d, B:22:0x003f, B:33:0x009b, B:83:0x01d7, B:84:0x01f0, B:85:0x01f6, B:87:0x01fc, B:89:0x0212, B:90:0x0221, B:93:0x0225, B:94:0x023e, B:36:0x00d2, B:47:0x011f, B:66:0x019d, B:67:0x01a0, B:76:0x01b1, B:77:0x01b7, B:79:0x01ba, B:25:0x0077, B:32:0x0098, B:99:0x0247, B:98:0x0244, B:100:0x0248, B:101:0x024d, B:102:0x024e, B:103:0x0253, B:104:0x0254, B:105:0x0259, B:106:0x025a, B:107:0x025f), top: B:133:0x0009, outer: #11 }] */
    @Override // com.google.android.gms.internal.ads.zzgfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zza() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgfz.zza():void");
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final synchronized boolean zzb() {
        return this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzgfx
    public final Method zzc(String str, String str2) {
        Future future = (Future) this.zzi.get(new Pair(str, str2));
        if (future == null) {
            this.zzf.zzb(Sdk$SDKError.Reason.INVALID_IFA_STATUS_VALUE);
            return null;
        }
        try {
            return (Method) future.get(this.zzj, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            this.zzf.zzb(Sdk$SDKError.Reason.AD_EXPIRED_VALUE);
            return null;
        } catch (TimeoutException unused2) {
            this.zzf.zzb(303);
            return null;
        }
    }

    public final /* synthetic */ Method zzd(zzggb zzggbVar) {
        ClassLoader classLoader = this.zza;
        zzgfw zzgfwVar = this.zze;
        byte[] bArr = this.zzm;
        String str = zzggbVar.zza;
        String str2 = zzggbVar.zzb;
        try {
            return classLoader.loadClass(zzgfwVar.zzb(bArr, str)).getMethod(zzgfwVar.zzb(bArr, str2), zzggbVar.zzc);
        } catch (zzgfv | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
