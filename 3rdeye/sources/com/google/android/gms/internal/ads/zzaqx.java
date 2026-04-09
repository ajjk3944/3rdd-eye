package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.s;
import com.singular.sdk.internal.Constants;
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
import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaqx implements zzapl {
    private final zzaqw zzc;
    private final Map zza = new LinkedHashMap(16, 0.75f, true);
    private long zzb = 0;
    private final int zzd = 5242880;

    public zzaqx(zzaqw zzaqwVar, int i) {
        this.zzc = zzaqwVar;
    }

    public static int zze(InputStream inputStream) throws IOException {
        return (zzn(inputStream) << 24) | zzn(inputStream) | (zzn(inputStream) << 8) | (zzn(inputStream) << 16);
    }

    public static long zzf(InputStream inputStream) throws IOException {
        return (zzn(inputStream) & 255) | ((zzn(inputStream) & 255) << 8) | ((zzn(inputStream) & 255) << 16) | ((zzn(inputStream) & 255) << 24) | ((zzn(inputStream) & 255) << 32) | ((zzn(inputStream) & 255) << 40) | ((zzn(inputStream) & 255) << 48) | ((zzn(inputStream) & 255) << 56);
    }

    public static String zzh(zzaqv zzaqvVar) throws IOException {
        return new String(zzm(zzaqvVar, zzf(zzaqvVar)), Constants.ENCODING);
    }

    public static void zzj(OutputStream outputStream, int i) throws IOException {
        outputStream.write(i & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        outputStream.write((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public static void zzk(OutputStream outputStream, long j4) throws IOException {
        outputStream.write((byte) j4);
        outputStream.write((byte) (j4 >>> 8));
        outputStream.write((byte) (j4 >>> 16));
        outputStream.write((byte) (j4 >>> 24));
        outputStream.write((byte) (j4 >>> 32));
        outputStream.write((byte) (j4 >>> 40));
        outputStream.write((byte) (j4 >>> 48));
        outputStream.write((byte) (j4 >>> 56));
    }

    public static void zzl(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(Constants.ENCODING);
        int length = bytes.length;
        zzk(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static byte[] zzm(zzaqv zzaqvVar, long j4) throws IOException {
        long jZza = zzaqvVar.zza();
        if (j4 >= 0 && j4 <= jZza) {
            int i = (int) j4;
            if (i == j4) {
                byte[] bArr = new byte[i];
                new DataInputStream(zzaqvVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbJ = s.j("streamToBytes length=", ", maxLength=", j4);
        sbJ.append(jZza);
        throw new IOException(sbJ.toString());
    }

    private static int zzn(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    private final void zzo(String str, zzaqu zzaquVar) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            this.zzb = (zzaquVar.zza - ((zzaqu) map.get(str)).zza) + this.zzb;
        } else {
            this.zzb += zzaquVar.zza;
        }
        map.put(str, zzaquVar);
    }

    private final void zzp(String str) {
        zzaqu zzaquVar = (zzaqu) this.zza.remove(str);
        if (zzaquVar != null) {
            this.zzb -= zzaquVar.zza;
        }
    }

    private static final String zzq(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized zzapk zza(String str) {
        zzaqu zzaquVar = (zzaqu) this.zza.get(str);
        if (zzaquVar == null) {
            return null;
        }
        File fileZzg = zzg(str);
        try {
            zzaqv zzaqvVar = new zzaqv(new BufferedInputStream(new FileInputStream(fileZzg)), fileZzg.length());
            try {
                String str2 = zzaqu.zza(zzaqvVar).zzb;
                if (!TextUtils.equals(str, str2)) {
                    zzaqn.zza("%s: key=%s, found=%s", fileZzg.getAbsolutePath(), str, str2);
                    zzp(str);
                    return null;
                }
                byte[] bArrZzm = zzm(zzaqvVar, zzaqvVar.zza());
                zzapk zzapkVar = new zzapk();
                zzapkVar.zza = bArrZzm;
                zzapkVar.zzb = zzaquVar.zzc;
                zzapkVar.zzc = zzaquVar.zzd;
                zzapkVar.zzd = zzaquVar.zze;
                zzapkVar.zze = zzaquVar.zzf;
                zzapkVar.zzf = zzaquVar.zzg;
                List<zzapt> list = zzaquVar.zzh;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (zzapt zzaptVar : list) {
                    treeMap.put(zzaptVar.zza(), zzaptVar.zzb());
                }
                zzapkVar.zzg = treeMap;
                zzapkVar.zzh = Collections.unmodifiableList(list);
                return zzapkVar;
            } finally {
                zzaqvVar.close();
            }
        } catch (IOException e4) {
            zzaqn.zza("%s: %s", fileZzg.getAbsolutePath(), e4.toString());
            zzi(str);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzb() {
        long length;
        zzaqv zzaqvVar;
        synchronized (this) {
            File fileZza = this.zzc.zza();
            if (fileZza.exists()) {
                File[] fileArrListFiles = fileZza.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        try {
                            length = file.length();
                            zzaqvVar = new zzaqv(new BufferedInputStream(new FileInputStream(file)), length);
                        } catch (IOException unused) {
                            file.delete();
                        }
                        try {
                            zzaqu zzaquVarZza = zzaqu.zza(zzaqvVar);
                            zzaquVarZza.zza = length;
                            zzo(zzaquVarZza.zzb, zzaquVarZza);
                            zzaqvVar.close();
                        } catch (Throwable th) {
                            zzaqvVar.close();
                            throw th;
                        }
                    }
                }
            } else if (!fileZza.mkdirs()) {
                zzaqn.zzb("Unable to create cache dir %s", fileZza.getAbsolutePath());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzc(String str, boolean z10) {
        zzapk zzapkVarZza = zza(str);
        if (zzapkVarZza != null) {
            zzapkVarZza.zzf = 0L;
            zzapkVarZza.zze = 0L;
            zzd(str, zzapkVarZza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapl
    public final synchronized void zzd(String str, zzapk zzapkVar) {
        long j4;
        float f10;
        try {
            long j10 = this.zzb;
            int length = zzapkVar.zza.length;
            long j11 = j10 + length;
            int i = this.zzd;
            float f11 = 0.9f;
            if (j11 <= i || length <= i * 0.9f) {
                File fileZzg = zzg(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileZzg));
                    zzaqu zzaquVar = new zzaqu(str, zzapkVar);
                    try {
                        zzj(bufferedOutputStream, 538247942);
                        zzl(bufferedOutputStream, zzaquVar.zzb);
                        String str2 = zzaquVar.zzc;
                        if (str2 == null) {
                            str2 = "";
                        }
                        zzl(bufferedOutputStream, str2);
                        zzk(bufferedOutputStream, zzaquVar.zzd);
                        zzk(bufferedOutputStream, zzaquVar.zze);
                        zzk(bufferedOutputStream, zzaquVar.zzf);
                        zzk(bufferedOutputStream, zzaquVar.zzg);
                        List<zzapt> list = zzaquVar.zzh;
                        if (list != null) {
                            zzj(bufferedOutputStream, list.size());
                            for (zzapt zzaptVar : list) {
                                zzl(bufferedOutputStream, zzaptVar.zza());
                                zzl(bufferedOutputStream, zzaptVar.zzb());
                            }
                        } else {
                            zzj(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(zzapkVar.zza);
                        bufferedOutputStream.close();
                        zzaquVar.zza = fileZzg.length();
                        zzo(str, zzaquVar);
                        long j12 = this.zzb;
                        int i10 = this.zzd;
                        if (j12 >= i10) {
                            boolean z10 = zzaqn.zzb;
                            if (z10) {
                                zzaqn.zzd("Pruning old cache entries.", new Object[0]);
                            }
                            long j13 = this.zzb;
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = this.zza.entrySet().iterator();
                            int i11 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j4 = j13;
                                    break;
                                }
                                zzaqu zzaquVar2 = (zzaqu) ((Map.Entry) it.next()).getValue();
                                String str3 = zzaquVar2.zzb;
                                if (zzg(str3).delete()) {
                                    f10 = f11;
                                    j4 = j13;
                                    this.zzb -= zzaquVar2.zza;
                                } else {
                                    f10 = f11;
                                    j4 = j13;
                                    zzaqn.zza("Could not delete cache entry for key=%s, filename=%s", str3, zzq(str3));
                                }
                                it.remove();
                                i11++;
                                if (this.zzb < i10 * f10) {
                                    break;
                                }
                                j13 = j4;
                                f11 = f10;
                            }
                            if (z10) {
                                zzaqn.zzd("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.zzb - j4), Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                            }
                        }
                    } catch (IOException e4) {
                        zzaqn.zza("%s", e4.toString());
                        bufferedOutputStream.close();
                        zzaqn.zza("Failed to write header for %s", fileZzg.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!fileZzg.delete()) {
                        zzaqn.zza("Could not clean up file %s", fileZzg.getAbsolutePath());
                    }
                    if (!this.zzc.zza().exists()) {
                        zzaqn.zza("Re-initializing cache after external clearing.", new Object[0]);
                        this.zza.clear();
                        this.zzb = 0L;
                        zzb();
                    }
                }
            }
        } finally {
        }
    }

    public final File zzg(String str) {
        return new File(this.zzc.zza(), zzq(str));
    }

    public final synchronized void zzi(String str) {
        boolean zDelete = zzg(str).delete();
        zzp(str);
        if (zDelete) {
            return;
        }
        zzaqn.zza("Could not delete cache entry for key=%s, filename=%s", str, zzq(str));
    }

    public zzaqx(File file, int i) {
        this.zzc = new zzaqt(this, file);
    }
}
