package com.bytedance.sdk.openadsdk.vt;

import com.bytedance.sdk.component.utils.ko;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class vt extends ouw {

    /* renamed from: lh, reason: collision with root package name */
    private int f8753lh;
    private int vt;
    private volatile boolean yu;

    public vt(int i4, int i10) {
        this.vt = 15;
        this.f8753lh = 3;
        if (i4 <= 0) {
            throw new IllegalArgumentException("Max count must be positive number!");
        }
        this.vt = i4;
        this.f8753lh = i10;
    }

    private void lh(List<File> list) {
        ouw.vt(list);
        int size = list.size();
        if (ouw(size)) {
            return;
        }
        for (File file : list) {
            file.length();
            if (file.delete()) {
                size--;
            }
            if (vt(size)) {
                return;
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public final boolean ouw(int i4) {
        return i4 <= this.vt;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public final boolean vt(int i4) {
        return i4 <= this.f8753lh;
    }

    @Override // com.bytedance.sdk.openadsdk.vt.ouw
    public void ouw(List<File> list) {
        if (!this.yu) {
            lh(list);
            return;
        }
        if (list != null) {
            try {
                if (list.size() != 0) {
                    ouw.vt(list);
                    int size = list.size();
                    boolean zOuw = ouw(size);
                    if (!zOuw) {
                        TreeMap treeMap = new TreeMap();
                        for (File file : list) {
                            treeMap.put(Long.valueOf(file.lastModified()), file);
                        }
                        for (Map.Entry entry : treeMap.entrySet()) {
                            if (entry != null && !zOuw) {
                                ((Long) entry.getKey()).getClass();
                                File file2 = (File) entry.getValue();
                                file2.length();
                                if (file2.delete()) {
                                    size--;
                                }
                                if (vt(size)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        ko.lh("splashLoadAd", "Do not meet the delete condition, do not perform a delete operation(true)".concat(String.valueOf(zOuw)));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.yu = false;
    }

    public vt() {
        this.vt = 10;
        this.f8753lh = 8;
        this.yu = true;
    }
}
