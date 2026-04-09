package com.bytedance.adsdk.ypw.emc.emc;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ypw {
    private final List<ylm> emc = new ArrayList();

    public void emc(ylm ylmVar) {
        this.emc.add(ylmVar);
    }

    public void emc(Path path) {
        for (int size = this.emc.size() - 1; size >= 0; size--) {
            com.bytedance.adsdk.ypw.ycc.ycc.emc(path, this.emc.get(size));
        }
    }
}
