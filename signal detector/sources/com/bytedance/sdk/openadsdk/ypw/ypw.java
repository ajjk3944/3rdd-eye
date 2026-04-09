package com.bytedance.sdk.openadsdk.ypw;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ypw extends emc {
    private volatile boolean dg;
    private int xq;
    private int ypw;

    public ypw(int i, int i3) {
        this.ypw = 15;
        this.xq = 3;
        if (i <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.ypw = i;
        this.xq = i3;
    }

    private void dg(List<File> list) {
        long jYpw;
        int size;
        boolean zEmc;
        if (list != null) {
            try {
                if (list.size() != 0 && !(zEmc = emc((jYpw = ypw(list)), (size = list.size())))) {
                    TreeMap treeMap = new TreeMap();
                    for (File file : list) {
                        treeMap.put(Long.valueOf(file.lastModified()), file);
                    }
                    for (Map.Entry entry : treeMap.entrySet()) {
                        if (entry != null && !zEmc) {
                            ((Long) entry.getKey()).getClass();
                            File file2 = (File) entry.getValue();
                            long length = file2.length();
                            if (file2.delete()) {
                                size--;
                                jYpw -= length;
                            }
                            if (emc(file2, jYpw, size)) {
                                return;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void xq(List<File> list) {
        long jYpw = ypw(list);
        int size = list.size();
        if (emc(jYpw, size)) {
            return;
        }
        for (File file : list) {
            long length = file.length();
            if (file.delete()) {
                size--;
                jYpw -= length;
            }
            if (emc(file, jYpw, size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.ypw.emc
    public boolean emc(long j6, int i) {
        return i <= this.ypw;
    }

    @Override // com.bytedance.sdk.openadsdk.ypw.emc
    public boolean emc(File file, long j6, int i) {
        return i <= this.xq;
    }

    @Override // com.bytedance.sdk.openadsdk.ypw.emc
    public void emc(List<File> list) {
        if (this.dg) {
            dg(list);
            this.dg = false;
        } else {
            xq(list);
        }
    }

    public ypw(int i, int i3, boolean z6) {
        this.ypw = 15;
        this.xq = 3;
        if (i > 0) {
            this.ypw = i;
            this.xq = i3;
            this.dg = z6;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }
}
