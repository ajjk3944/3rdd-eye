package com.bytedance.sdk.component.bw.emc;

import com.bytedance.sdk.component.bw.sup;
import com.bytedance.sdk.component.bw.zz;
import com.bytedance.sdk.component.utils.vk;
import java.security.NoSuchAlgorithmException;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ypw {
    public static sup emc() {
        return new sup() { // from class: com.bytedance.sdk.component.bw.emc.ypw.1
            private WeakHashMap<String, String> emc = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.bw.sup
            public String emc(zz zzVar) {
                return emc(zzVar.emc() + "#width=" + zzVar.ypw() + "#height=" + zzVar.xq() + "#scaletype=" + zzVar.dg() + "#bitmapConfig=" + zzVar.bw());
            }

            @Override // com.bytedance.sdk.component.bw.sup
            public String ypw(zz zzVar) {
                return emc(zzVar.emc());
            }

            private String emc(String str) throws NoSuchAlgorithmException {
                String str2 = this.emc.get(str);
                if (str2 != null) {
                    return str2;
                }
                String strEmc = vk.emc(str);
                this.emc.put(str, strEmc);
                return strEmc;
            }
        };
    }
}
