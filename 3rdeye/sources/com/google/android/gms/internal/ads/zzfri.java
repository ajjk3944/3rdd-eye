package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfri extends zzfqw {
    private zzfvw<Integer> zza;
    private zzfvw<Integer> zzb;
    private zzfrh zzc;
    private HttpURLConnection zzd;

    public zzfri(zzfvw<Integer> zzfvwVar, zzfvw<Integer> zzfvwVar2, zzfrh zzfrhVar) {
        this.zza = zzfvwVar;
        this.zzb = zzfvwVar2;
        this.zzc = zzfrhVar;
    }

    public static /* synthetic */ Integer zzf() {
        return -1;
    }

    public static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfqx.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfqx.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfrh zzfrhVar = this.zzc;
        zzfrhVar.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfrhVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfrh zzfrhVar, final int i, final int i10) throws IOException {
        this.zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfra
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfrb
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = zzfrhVar;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i, final int i10) throws IOException {
        this.zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfrc
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzb = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfrd
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i10);
            }
        };
        this.zzc = new zzfrh() { // from class: com.google.android.gms.internal.ads.zzfre
            @Override // com.google.android.gms.internal.ads.zzfrh
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i) throws IOException {
        this.zza = new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfrf
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.zzc = new zzfrh() { // from class: com.google.android.gms.internal.ads.zzfrg
            @Override // com.google.android.gms.internal.ads.zzfrh
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }

    public zzfri() {
        this(new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqy
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzfri.zzf();
            }
        }, new zzfvw() { // from class: com.google.android.gms.internal.ads.zzfqz
            @Override // com.google.android.gms.internal.ads.zzfvw
            public final Object zza() {
                return zzfri.zzg();
            }
        }, null);
    }
}
