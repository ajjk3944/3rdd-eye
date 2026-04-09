package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.utils.iyl;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends com.bytedance.sdk.component.msw.msw {
    private final List<? extends com.bytedance.sdk.component.msw.msw> emc;

    public xq(String str, List<? extends com.bytedance.sdk.component.msw.msw> list) {
        super(str);
        this.emc = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List<? extends com.bytedance.sdk.component.msw.msw> list;
        if (com.bytedance.sdk.component.utils.sba.xq(com.bytedance.sdk.openadsdk.core.aa.emc()) != 0 && (list = this.emc) != null) {
            Iterator<? extends com.bytedance.sdk.component.msw.msw> it = list.iterator();
            while (it.hasNext()) {
                iyl.emc(it.next(), 1);
                it.remove();
            }
        }
        try {
            com.bytedance.sdk.component.utils.zz.emc().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
