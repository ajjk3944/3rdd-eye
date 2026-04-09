package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.singular.sdk.internal.Constants;
import j6.l;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgy extends zzgc {
    private RandomAccessFile zza;
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgy() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i10) throws IOException {
        if (i10 == 0) {
            return 0;
        }
        long j4 = this.zzc;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzex.zza;
            int i11 = randomAccessFile.read(bArr, i, (int) Math.min(j4, i10));
            if (i11 > 0) {
                this.zzc -= i11;
                zzg(i11);
            }
            return i11;
        } catch (IOException e4) {
            throw new zzgx(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final long zzb(zzgo zzgoVar) throws IOException {
        Uri uri = zzgoVar.zza;
        this.zzb = uri;
        zzi(zzgoVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, Constants.REVENUE_AMOUNT_KEY);
            this.zza = randomAccessFile;
            try {
                long j4 = zzgoVar.zze;
                randomAccessFile.seek(j4);
                long length = zzgoVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j4;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgx(null, null, 2008);
                }
                this.zzd = true;
                zzj(zzgoVar);
                return this.zzc;
            } catch (IOException e4) {
                throw new zzgx(e4, 2000);
            }
        } catch (FileNotFoundException e10) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgx(e10, ((e10.getCause() instanceof ErrnoException) && ((ErrnoException) e10.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbD = l.d("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbD.append(fragment);
            throw new zzgx(sbD.toString(), e10, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e11) {
            throw new zzgx(e11, 2006);
        } catch (RuntimeException e12) {
            throw new zzgx(e12, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzd() throws zzgx {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzh();
                }
            } catch (IOException e4) {
                throw new zzgx(e4, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzh();
            }
            throw th;
        }
    }
}
