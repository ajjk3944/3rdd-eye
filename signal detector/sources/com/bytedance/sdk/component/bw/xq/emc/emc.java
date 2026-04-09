package com.bytedance.sdk.component.bw.xq.emc;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* loaded from: classes.dex */
public class emc implements com.bytedance.sdk.component.bw.ypw, Cloneable {
    private static volatile com.bytedance.sdk.component.bw.ypw ycc;
    private File bw;
    private boolean dg;
    private long emc;
    private boolean xq;
    private int ypw;

    public emc(int i, long j6, File file) {
        this(i, j6, i != 0, j6 != 0, file);
    }

    private static long gbl() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    public static com.bytedance.sdk.component.bw.ypw ru() {
        return ycc;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean bw() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int dg() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public long emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public File msw() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean uym() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int xq() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean ycc() {
        return false;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean zz() {
        return true;
    }

    public emc(int i, long j6, boolean z6, boolean z7, File file) {
        this.emc = j6;
        this.ypw = i;
        this.xq = z6;
        this.dg = z7;
        this.bw = file;
    }

    public static void emc(Context context, com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar != null) {
            ycc = ypwVar;
        } else {
            ycc = emc(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.bw.ypw emc(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (ycc == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(gbl() / 16, 41943040L);
        } else {
            iMin = Math.min(ycc.ypw() / 2, 31457280);
            jMin = Math.min(ycc.emc() / 2, 41943040L);
        }
        return new emc(Math.max(iMin, 26214400), Math.max(jMin, 20971520L), file);
    }
}
