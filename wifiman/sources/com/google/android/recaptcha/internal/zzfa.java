package com.google.android.recaptcha.internal;

import Yg.m;
import Yg.n;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import jh.AbstractC6339l;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class zzfa implements zzey {
    private final m zza;

    public zzfa() {
        int i10 = zzav.zza;
        this.zza = n.b(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) throws zzbd {
        zzew zzewVarZza = null;
        try {
            try {
                try {
                    zzewVarZza = ((zzex) this.zza.getValue()).zza(str);
                    zzewVarZza.zzc();
                    zzewVarZza.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVarZza.zza(zzsc.zzi());
                    zzewVarZza.zzd();
                    return zzscVar;
                } catch (Exception e10) {
                    throw new zzbd(zzbb.zzc, zzba.zzF, e10.getMessage());
                }
            } catch (zzbd e11) {
                if (zzewVarZza == null || !AbstractC6492s.d(e11.zza(), zzba.zzau)) {
                    throw e11;
                }
                try {
                    throw zzbc.zza(zztu.zzg(zzewVarZza.zzb().getErrorStream()).zzi());
                } catch (Exception e12) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e12.getMessage());
                }
            }
        } catch (Throwable th2) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th2;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) throws IOException, zzbd {
        try {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                AbstractC6492s.g(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return AbstractC6339l.h(AbstractC6492s.d("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
