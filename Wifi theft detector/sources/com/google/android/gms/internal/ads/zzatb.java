package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class zzatb extends zzary {
    private final Object zza;

    @Nullable
    @GuardedBy("mLock")
    private final zzasd zzb;

    public zzatb(int i10, String str, zzasd zzasdVar, @Nullable zzasc zzascVar) {
        super(i10, str, zzascVar);
        this.zza = new Object();
        this.zzb = zzasdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final zzase zzr(zzaru zzaruVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaruVar.zzb;
            Map map = zzaruVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(CommonGatewayClient.HEADER_CONTENT_TYPE)) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i10 = 1;
                while (true) {
                    if (i10 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i10++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaruVar.zzb);
        }
        return zzase.zza(str, zzasv.zza(zzaruVar));
    }

    @Override // com.google.android.gms.internal.ads.zzary
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzs(String str) {
        zzasd zzasdVar;
        synchronized (this.zza) {
            zzasdVar = this.zzb;
        }
        zzasdVar.zza(str);
    }
}
