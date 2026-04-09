package com.bytedance.sdk.component.fkw.yu.vt;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.th;
import com.bytedance.sdk.component.utils.ko;
import d.h;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw<T> implements le {
    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final String ouw() {
        return "bitmap_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.yu.vt.le
    public final boolean ouw(com.bytedance.sdk.component.fkw.yu.lh.lh lhVar, th thVar, com.bytedance.sdk.component.fkw.yu.lh.ouw ouwVar) {
        int i4;
        Bitmap bitmapOuw;
        String str = lhVar.vt;
        StringBuilder sbA = h.A("step 3 look  bitmap cache image key is ", str, " url is ");
        sbA.append(lhVar.ouw);
        ko.vt("PagImageRequest", sbA.toString());
        com.bytedance.sdk.component.fkw.vt vtVar = lhVar.zin;
        com.bytedance.sdk.component.fkw.yu.lh.le leVar = lhVar.qbp;
        if (vtVar == null || leVar == null || !vtVar.fkw() || (!((i4 = lhVar.tlj) == 1 || i4 == 2) || (bitmapOuw = leVar.ouw(vtVar).ouw(str)) == null)) {
            return true;
        }
        StringBuilder sbA2 = h.A("step 3-1 hit bitmap cache image key is ", str, " url is ");
        sbA2.append(lhVar.ouw);
        ko.vt("PagImageRequest", sbA2.toString());
        ouwVar.ouw(new com.bytedance.sdk.component.fkw.yu.lh.yu().ouw(lhVar, bitmapOuw, null, false));
        return false;
    }
}
