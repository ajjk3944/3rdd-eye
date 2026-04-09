package com.bytedance.sdk.component.bw.bw;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.bw.aa;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ru extends emc {
    private Bitmap xq(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        return xqVar.sba().emc(xqVar.yzg()).emc(xqVar.ru());
    }

    private Bitmap ypw(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        Collection<aa> collectionEmc = xqVar.sba().emc();
        Bitmap bitmapEmc = null;
        if (collectionEmc == null) {
            return null;
        }
        Iterator<aa> it = collectionEmc.iterator();
        while (it.hasNext() && (bitmapEmc = it.next().emc(xqVar.ru())) == null) {
        }
        return bitmapEmc;
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public void emc(com.bytedance.sdk.component.bw.xq.xq xqVar) {
        int iSup = xqVar.sup();
        Bitmap bitmapYpw = (iSup == 2 || iSup == 1) ? (xqVar.ul() || xqVar.yzg().zz()) ? ypw(xqVar) : xq(xqVar) : null;
        if (bitmapYpw == null) {
            xqVar.emc(new sup());
        } else {
            xqVar.emc(new sz(bitmapYpw, null, false));
        }
    }

    @Override // com.bytedance.sdk.component.bw.bw.zz
    public String emc() {
        return "memory_cache";
    }
}
