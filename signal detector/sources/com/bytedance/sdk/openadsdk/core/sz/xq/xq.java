package com.bytedance.sdk.openadsdk.core.sz.xq;

import com.bytedance.sdk.component.utils.uym;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public class xq extends com.bytedance.sdk.openadsdk.ypw.ypw {
    public xq(int i, int i3) {
        super(i, i3);
    }

    @Override // com.bytedance.sdk.openadsdk.ypw.ypw, com.bytedance.sdk.openadsdk.ypw.emc
    public void emc(List<File> list) {
        int size = list.size();
        if (emc(0L, size)) {
            return;
        }
        for (File file : list) {
            uym.xq(file);
            size--;
            if (emc(file, 0L, size)) {
                return;
            }
        }
    }

    public xq(int i, int i3, boolean z6) {
        super(i, i3);
        this.emc = z6;
    }
}
