package com.google.android.gms.internal.ads;

import N7.C1154e9;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcep extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzhd zze;
    private zzgo zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcep(String str, zzhj zzhjVar, int i, int i10, long j4, long j10) {
        super(true);
        zzdd.zzc(str);
        this.zzd = str;
        this.zze = new zzhd();
        this.zzb = i;
        this.zzc = i10;
        this.zzh = new ArrayDeque();
        this.zzq = j4;
        this.zzr = j10;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzl() {
        while (true) {
            Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((HttpURLConnection) queue.remove()).disconnect();
            } catch (Exception e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e4);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j4 = this.zzl;
            long j10 = this.zzm;
            if (j4 - j10 == 0) {
                return -1;
            }
            long j11 = this.zzn + j10;
            long j12 = i10;
            long j13 = j11 + j12 + this.zzr;
            long j14 = this.zzp;
            long j15 = j14 + 1;
            if (j13 > j15) {
                long j16 = this.zzo;
                if (j14 < j16) {
                    long jMin = Math.min(j16, Math.max(((this.zzq + j15) - r4) - 1, (j15 + j12) - 1));
                    zzk(j15, jMin, 2);
                    this.zzp = jMin;
                    j14 = jMin;
                }
            }
            int i11 = this.zzi.read(bArr, i, (int) Math.min(j12, ((j14 + 1) - this.zzn) - this.zzm));
            if (i11 == -1) {
                throw new EOFException();
            }
            this.zzm += i11;
            zzg(i11);
            return i11;
        } catch (IOException e4) {
            throw new zzha(e4, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException, NumberFormatException {
        this.zzf = zzgoVar;
        this.zzm = 0L;
        long j4 = zzgoVar.zze;
        long j10 = zzgoVar.zzf;
        long jMin = j10 == -1 ? this.zzq : Math.min(this.zzq, j10);
        this.zzn = j4;
        HttpURLConnection httpURLConnectionZzk = zzk(j4, (jMin + j4) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j11 = Long.parseLong(matcher.group(2));
                    long j12 = Long.parseLong(matcher.group(3));
                    long j13 = zzgoVar.zzf;
                    if (j13 != -1) {
                        this.zzl = j13;
                        this.zzo = Math.max(j11, (this.zzn + j13) - 1);
                    } else {
                        this.zzl = j12 - this.zzn;
                        this.zzo = j12 - 1;
                    }
                    this.zzp = j11;
                    this.zzj = true;
                    zzj(zzgoVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strI = C1154e9.i("Unexpected Content-Range [", headerField, "]");
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(strI);
                }
            }
        }
        throw new zzcen(headerField, zzgoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzha {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzha(e4, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j4, long j10, int i) throws IOException {
        int i10;
        IOException iOException;
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e4) {
                    iOException = e4;
                    i10 = i;
                    throw new zzha("Unable to connect to ".concat(String.valueOf(string)), iOException, this.zzf, 2000, i10);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j4 + "-" + j10);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzceo(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    zzl();
                    throw new zzha(e10, this.zzf, 2000, i);
                }
            } catch (IOException e11) {
                zzl();
                throw new zzha("Unable to connect to ".concat(String.valueOf(string2)), e11, this.zzf, 2000, i);
            }
        } catch (IOException e12) {
            i10 = i;
            iOException = e12;
        }
    }
}
