package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzcdw extends zzgc implements zzhe {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzhd zzg;
    private zzgo zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcdw(String str, zzhj zzhjVar, int i, int i10, int i11) {
        super(true);
        this.zzc = new zzcdv(this);
        this.zzr = new HashSet();
        zzdd.zzc(str);
        this.zzf = str;
        this.zzg = new zzhd();
        this.zzd = i;
        this.zze = i10;
        this.zzq = i11;
        if (zzhjVar != null) {
            zzf(zzhjVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e4);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j4 = this.zzo;
                    long j10 = this.zzm;
                    if (j4 == j10) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i11 = this.zzj.read(bArr2, 0, (int) Math.min(j10 - j4, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += i11;
                    zzg(i11);
                }
            }
            if (i10 == 0) {
                return 0;
            }
            long j11 = this.zzn;
            if (j11 != -1) {
                long j12 = j11 - this.zzp;
                if (j12 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j12);
            }
            int i12 = this.zzj.read(bArr, i, i10);
            if (i12 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += i12;
            zzg(i12);
            return i12;
        } catch (IOException e4) {
            throw new zzha(e4, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000f, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x021c, B:97:0x0227, B:99:0x0238, B:102:0x0241, B:103:0x0250, B:105:0x0258, B:106:0x025f, B:107:0x0260, B:108:0x0276), top: B:115:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0227 A[Catch: IOException -> 0x003f, TryCatch #2 {IOException -> 0x003f, blocks: (B:3:0x000f, B:4:0x0024, B:6:0x002a, B:8:0x0034, B:12:0x0045, B:13:0x005d, B:15:0x0063, B:22:0x0087, B:24:0x00a1, B:25:0x00b3, B:26:0x00b8, B:28:0x00c1, B:29:0x00c8, B:42:0x00f0, B:95:0x021c, B:97:0x0227, B:99:0x0238, B:102:0x0241, B:103:0x0250, B:105:0x0258, B:106:0x025f, B:107:0x0260, B:108:0x0276), top: B:115:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzgo r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdw.zzb(com.google.android.gms.internal.ads.zzgo):long");
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzha {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                String str = zzex.zza;
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    throw new zzha(e4, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgc, com.google.android.gms.internal.ads.zzgj
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e4) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e4);
                }
            }
        }
    }
}
