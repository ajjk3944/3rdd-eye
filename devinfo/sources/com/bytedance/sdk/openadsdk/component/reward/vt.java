package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.bs;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt extends com.bytedance.sdk.component.pno.pno {
    private final List<? extends com.bytedance.sdk.component.pno.pno> ouw;

    public vt(String str, List<? extends com.bytedance.sdk.component.pno.pno> list) {
        super(str);
        this.ouw = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<? extends com.bytedance.sdk.component.pno.pno> list;
        if (ksc.ouw(zih.ouw(), 60000L) != 0 && (list = this.ouw) != null) {
            Iterator<? extends com.bytedance.sdk.component.pno.pno> it = list.iterator();
            while (it.hasNext()) {
                bs.ouw(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.bly.ouw().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
