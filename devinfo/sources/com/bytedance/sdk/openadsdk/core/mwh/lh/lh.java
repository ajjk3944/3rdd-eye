package com.bytedance.sdk.openadsdk.core.mwh.lh;

import com.bytedance.sdk.component.utils.ra;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh extends com.bytedance.sdk.openadsdk.vt.vt {
    public lh(byte b10) {
        super(10, 8);
    }

    @Override // com.bytedance.sdk.openadsdk.vt.vt, com.bytedance.sdk.openadsdk.vt.ouw
    public final void ouw(List<File> list) {
        int size = list.size();
        if (ouw(size)) {
            return;
        }
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            ra.lh(it.next());
            size--;
            if (vt(size)) {
                return;
            }
        }
    }

    public lh() {
        super(5, 5);
        this.ouw = true;
    }
}
