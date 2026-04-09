package com.bytedance.sdk.component.fkw.yu.vt;

import android.text.TextUtils;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.rn;
import d.h;
import java.security.NoSuchAlgorithmException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) throws NoSuchAlgorithmException {
        String strOuw = lhVar.vt;
        if (TextUtils.isEmpty(strOuw)) {
            strOuw = rn.ouw(lhVar.ouw);
            lhVar.ouw(strOuw);
            lhVar.f7501lh = strOuw;
        }
        StringBuilder sbA = h.A("step 1 generate  key is ", strOuw, " url is ");
        sbA.append(lhVar.ouw);
        ko.vt("PagImageRequest", sbA.toString());
        return true;
    }
}
