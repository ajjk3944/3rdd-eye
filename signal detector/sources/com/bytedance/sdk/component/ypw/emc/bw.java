package com.bytedance.sdk.component.ypw.emc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class bw extends sz {
    List<String> emc;
    List<String> ypw;

    public bw(List<String> list, List<String> list2) {
        this.emc = list;
        this.ypw = list2;
    }

    public static final class emc {
        private final List<String> emc = new ArrayList();
        private final List<String> ypw = new ArrayList();

        public emc emc(String str, String str2) {
            this.emc.add(str);
            this.ypw.add(str2);
            return this;
        }

        public bw emc() {
            return new bw(this.emc, this.ypw);
        }
    }
}
