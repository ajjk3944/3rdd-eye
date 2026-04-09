package com.bytedance.sdk.component.bw.dg.xq;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.bw.cf;
import com.bytedance.sdk.component.bw.dg.xq.xq;
import com.bytedance.sdk.component.bw.ru;
import com.bytedance.sdk.component.bw.sba;
import com.bytedance.sdk.component.bw.sz;
import com.bytedance.sdk.component.utils.vk;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ypw implements cf {
    private volatile ycc emc;

    private ypw() {
    }

    public static cf emc(Context context, sz szVar) {
        ypw ypwVar = new ypw();
        ypwVar.ypw(context, szVar);
        return ypwVar;
    }

    private void ypw(Context context, sz szVar) {
        if (this.emc != null) {
            Log.w("ImageLoader", "already init!");
        }
        if (szVar == null) {
            szVar = bw.emc(context);
        }
        this.emc = new ycc(context, szVar);
    }

    @Override // com.bytedance.sdk.component.bw.cf
    public ru emc(String str) {
        return new xq.ypw(this.emc).xq(str);
    }

    @Override // com.bytedance.sdk.component.bw.cf
    public InputStream emc(String str, String str2) throws NoSuchAlgorithmException {
        byte[] bArrEmc;
        if (this.emc != null) {
            if (TextUtils.isEmpty(str2)) {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                str2 = vk.emc(str);
            }
            sba sbaVarYpw = this.emc.ypw();
            if (sbaVarYpw != null && (bArrEmc = sbaVarYpw.emc(str2)) != null) {
                return new ByteArrayInputStream(bArrEmc);
            }
            Collection<com.bytedance.sdk.component.bw.xq> collectionXq = this.emc.xq();
            if (collectionXq != null) {
                Iterator<com.bytedance.sdk.component.bw.xq> it = collectionXq.iterator();
                while (it.hasNext()) {
                    InputStream inputStreamEmc = it.next().emc(str2);
                    if (inputStreamEmc != null) {
                        return inputStreamEmc;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.bw.cf
    public boolean emc(String str, String str2, String str3) throws NoSuchAlgorithmException {
        if (this.emc == null || TextUtils.isEmpty(str3)) {
            return false;
        }
        if (TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            str2 = vk.emc(str);
        }
        com.bytedance.sdk.component.bw.xq xqVarEmc = this.emc.emc(str3);
        if (xqVarEmc != null) {
            return xqVarEmc.ypw(str2);
        }
        return false;
    }
}
