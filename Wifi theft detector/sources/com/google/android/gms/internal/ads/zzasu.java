package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class zzasu implements zzari {
    private final zzast zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzasu(zzast zzastVar, int i10) {
        this.zzc = zzastVar;
    }

    @VisibleForTesting
    public static byte[] zzg(zzass zzassVar, long j10) throws IOException {
        long jZza = zzassVar.zza();
        if (j10 >= 0 && j10 <= jZza) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(zzassVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j10).length() + 33 + String.valueOf(jZza).length());
        sb.append("streamToBytes length=");
        sb.append(j10);
        sb.append(", maxLength=");
        sb.append(jZza);
        throw new IOException(sb.toString());
    }

    public static void zzh(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static int zzi(InputStream inputStream) throws IOException {
        return (zzp(inputStream) << 24) | zzp(inputStream) | (zzp(inputStream) << 8) | (zzp(inputStream) << 16);
    }

    public static void zzj(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static long zzk(InputStream inputStream) throws IOException {
        return (zzp(inputStream) & 255) | ((zzp(inputStream) & 255) << 8) | ((zzp(inputStream) & 255) << 16) | ((zzp(inputStream) & 255) << 24) | ((zzp(inputStream) & 255) << 32) | ((zzp(inputStream) & 255) << 40) | ((zzp(inputStream) & 255) << 48) | ((zzp(inputStream) & 255) << 56);
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        zzj(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String zzm(zzass zzassVar) throws IOException {
        return new String(zzg(zzassVar, zzk(zzassVar)), C.UTF8_NAME);
    }

    private final void zzn(String str, zzasr zzasrVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb += zzasrVar.zza - ((zzasr) map.get(str)).zza;
        } else {
            this.zzb += zzasrVar.zza;
        }
        map.put(str, zzasrVar);
    }

    private final void zzo(String str) {
        zzasr zzasrVar = (zzasr) this.zza.remove(str);
        if (zzasrVar != null) {
            this.zzb -= zzasrVar.zza;
        }
    }

    private static int zzp(InputStream inputStream) throws IOException {
        int i10 = inputStream.read();
        if (i10 != -1) {
            return i10;
        }
        throw new EOFException();
    }

    private static final String zzq(String str) {
        int length = str.length() >> 1;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized zzarh zza(String str) {
        zzasr zzasrVar = (zzasr) this.zza.get(str);
        if (zzasrVar == null) {
            return null;
        }
        File fileZzf = zzf(str);
        try {
            zzass zzassVar = new zzass(new BufferedInputStream(new FileInputStream(fileZzf)), fileZzf.length());
            try {
                String str2 = zzasr.zza(zzassVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzask.zzb("%s: key=%s, found=%s", fileZzf.getAbsolutePath(), str, str2);
                    zzo(str);
                    return null;
                }
                byte[] bArrZzg = zzg(zzassVar, zzassVar.zza());
                zzarh zzarhVar = new zzarh();
                zzarhVar.zza = bArrZzg;
                zzarhVar.zzb = zzasrVar.zzc;
                zzarhVar.zzc = zzasrVar.zzd;
                zzarhVar.zzd = zzasrVar.zze;
                zzarhVar.zze = zzasrVar.zzf;
                zzarhVar.zzf = zzasrVar.zzg;
                List<zzarq> list = zzasrVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzarq zzarqVar : list) {
                    treeMap.put(zzarqVar.zza(), zzarqVar.zzb());
                }
                zzarhVar.zzg = treeMap;
                zzarhVar.zzh = Collections.unmodifiableList(list);
                return zzarhVar;
            } finally {
                zzassVar.close();
            }
        } catch (IOException e10) {
            zzask.zzb("%s: %s", fileZzf.getAbsolutePath(), e10.toString());
            zze(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzb(String str, zzarh zzarhVar) {
        int i10;
        BufferedOutputStream bufferedOutputStream;
        zzasr zzasrVar;
        int i11;
        long j10;
        char c10;
        float f10;
        try {
            long j11 = this.zzb;
            int length = zzarhVar.zza.length;
            long j12 = j11 + length;
            int i12 = this.zzd;
            float f11 = 0.9f;
            if (j12 <= i12 || length <= i12 * 0.9f) {
                File fileZzf = zzf(str);
                int i13 = 0;
                try {
                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzf));
                    zzasrVar = new zzasr(str, zzarhVar);
                } catch (IOException unused) {
                    i10 = i13;
                }
                try {
                    try {
                        zzh(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzasrVar.zzb);
                        String str2 = zzasrVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzj(bufferedOutputStream, zzasrVar.zzd);
                        zzj(bufferedOutputStream, zzasrVar.zze);
                        zzj(bufferedOutputStream, zzasrVar.zzf);
                        zzj(bufferedOutputStream, zzasrVar.zzg);
                        List<zzarq> list = zzasrVar.zzh;
                        if (list != null) {
                            zzh(bufferedOutputStream, list.size());
                            for (zzarq zzarqVar : list) {
                                zzl(bufferedOutputStream, zzarqVar.zza());
                                zzl(bufferedOutputStream, zzarqVar.zzb());
                            }
                        } else {
                            zzh(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzarhVar.zza);
                        bufferedOutputStream.close();
                        zzasrVar.zza = fileZzf.length();
                        zzn(str, zzasrVar);
                        long j13 = this.zzb;
                        int i14 = this.zzd;
                        if (j13 >= i14) {
                            boolean z10 = zzask.zzb;
                            if (z10) {
                                zzask.zza("Pruning old cache entries.", new Object[0]);
                            }
                            long j14 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i15 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i11 = i13;
                                    j10 = j14;
                                    c10 = 1;
                                    break;
                                }
                                zzasr zzasrVar2 = (zzasr) ((Map.Entry) it.next()).getValue();
                                String str3 = zzasrVar2.zzb;
                                if (zzf(str3).delete()) {
                                    i11 = i13;
                                    j10 = j14;
                                    f10 = f11;
                                    c10 = 1;
                                    this.zzb -= zzasrVar2.zza;
                                } else {
                                    f10 = f11;
                                    i11 = i13;
                                    j10 = j14;
                                    c10 = 1;
                                    String strZzq = zzq(str3);
                                    Object[] objArr = new Object[2];
                                    objArr[i11] = str3;
                                    objArr[1] = strZzq;
                                    zzask.zzb("Could not delete cache entry for key=%s, filename=%s", objArr);
                                }
                                it.remove();
                                i15++;
                                if (this.zzb < i14 * f10) {
                                    break;
                                }
                                j14 = j10;
                                i13 = i11;
                                f11 = f10;
                            }
                            if (z10) {
                                Integer numValueOf = Integer.valueOf(i15);
                                Long lValueOf = Long.valueOf(this.zzb - j10);
                                Long lValueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime);
                                Object[] objArr2 = new Object[3];
                                objArr2[i11] = numValueOf;
                                objArr2[c10] = lValueOf;
                                objArr2[2] = lValueOf2;
                                zzask.zza("pruned %d files, %d bytes, %d ms", objArr2);
                            }
                        }
                    } catch (IOException e10) {
                        zzask.zzb("%s", e10.toString());
                        bufferedOutputStream.close();
                        zzask.zzb("Failed to write header for %s", fileZzf.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused2) {
                    if (!fileZzf.delete()) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i10] = fileZzf.getAbsolutePath();
                        zzask.zzb("Could not clean up file %s", objArr3);
                    }
                    if (!this.zzc.zza().exists()) {
                        zzask.zzb("Re-initializing cache after external clearing.", new Object[i10]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzc();
                    }
                }
            }
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzc() {
        long length;
        zzass zzassVar;
        File fileZza = this.zzc.zza();
        if (fileZza.exists()) {
            File[] fileArrListFiles = fileZza.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    try {
                        length = file.length();
                        zzassVar = new zzass(new BufferedInputStream(new FileInputStream(file)), length);
                    } catch (IOException unused) {
                        file.delete();
                    }
                    try {
                        zzasr zzasrVarZza = zzasr.zza(zzassVar);
                        zzasrVarZza.zza = length;
                        zzn(zzasrVarZza.zzb, zzasrVarZza);
                        zzassVar.close();
                    } catch (Throwable th) {
                        zzassVar.close();
                        throw th;
                    }
                }
            }
        } else if (!fileZza.mkdirs()) {
            zzask.zzc("Unable to create cache dir %s", fileZza.getAbsolutePath());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzari
    public final synchronized void zzd(String str, boolean z10) {
        zzarh zzarhVarZza = zza(str);
        if (zzarhVarZza != null) {
            zzarhVarZza.zzf = 0L;
            zzarhVarZza.zze = 0L;
            zzb(str, zzarhVarZza);
        }
    }

    public final synchronized void zze(String str) {
        boolean zDelete = zzf(str).delete();
        zzo(str);
        if (zDelete) {
            return;
        }
        zzask.zzb("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public final File zzf(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public zzasu(File file, int i10) {
        this.zzc = new zzasq(this, file);
    }
}
