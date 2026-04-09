package com.bytedance.sdk.component.fkw.fkw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.fkw.zih;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class tlj extends ouw {
    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final String ouw() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.fkw.fkw.bly
    public final void ouw(com.bytedance.sdk.component.fkw.lh.lh lhVar) {
        Collection<zih> collectionValues;
        Bitmap bitmapOuw;
        int i4 = lhVar.tlj;
        if ((i4 == 2 || i4 == 1) && (collectionValues = lhVar.jqy.f7451lh.values()) != null) {
            Iterator<zih> it = collectionValues.iterator();
            bitmapOuw = null;
            while (it.hasNext() && (bitmapOuw = it.next().ouw(lhVar.vt)) == null) {
            }
        } else {
            bitmapOuw = null;
        }
        if (bitmapOuw == null) {
            lhVar.ouw(new ryl());
        } else {
            lhVar.ouw(new mwh(bitmapOuw, null, false));
        }
    }
}
