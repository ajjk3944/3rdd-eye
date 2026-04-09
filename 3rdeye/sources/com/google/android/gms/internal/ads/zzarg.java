package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzarg extends zzaqb {
    private final Object zza;
    private final zzaqg zzb;

    public zzarg(int i, String str, zzaqg zzaqgVar, zzaqf zzaqfVar) {
        super(i, str, zzaqfVar);
        this.zza = new Object();
        this.zzb = zzaqgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    public final zzaqh zzh(zzapx zzapxVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapxVar.zzb;
            Map map = zzapxVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapxVar.zzb);
        }
        return zzaqh.zzb(str, zzaqy.zzb(zzapxVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaqb
    /* renamed from: zzz, reason: merged with bridge method [inline-methods] */
    public void zzo(String str) {
        zzaqg zzaqgVar;
        synchronized (this.zza) {
            zzaqgVar = this.zzb;
        }
        zzaqgVar.zza(str);
    }
}
