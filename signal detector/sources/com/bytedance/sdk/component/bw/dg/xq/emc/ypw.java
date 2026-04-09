package com.bytedance.sdk.component.bw.dg.xq.emc;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public class ypw implements com.bytedance.sdk.component.bw.ypw, Cloneable {
    private static volatile com.bytedance.sdk.component.bw.ypw zz;
    private boolean bw;
    private int dg;
    private long emc;
    private File msw;
    private boolean uym;
    private int xq;
    private boolean ycc;
    private int ypw;

    public ypw(int i, int i3, int i6, long j6, File file) {
        this(i, i3, i6, j6, i3 != 0, j6 != 0, file);
    }

    public static com.bytedance.sdk.component.bw.ypw ru() {
        return zz;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean bw() {
        return this.bw;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int dg() {
        return this.dg;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public long emc() {
        return this.emc;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public File msw() {
        return this.msw;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean uym() {
        return this.ycc;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int xq() {
        return this.xq;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean ycc() {
        return this.uym;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public int ypw() {
        return this.ypw;
    }

    @Override // com.bytedance.sdk.component.bw.ypw
    public boolean zz() {
        return true;
    }

    public ypw(int i, int i3, int i6, long j6, boolean z6, boolean z7, File file) {
        this.emc = j6;
        this.ypw = i;
        this.xq = i3;
        this.dg = i6;
        this.bw = z6;
        this.ycc = z7;
        this.msw = file;
        this.uym = i6 != 0;
    }

    public static void emc(Context context, com.bytedance.sdk.component.bw.ypw ypwVar) {
        if (ypwVar != null) {
            zz = ypwVar;
        } else {
            zz = emc(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.bw.ypw emc(File file) {
        long jEmc;
        int iXq;
        int iDg;
        file.mkdirs();
        if (zz == null) {
            iXq = 10;
            iDg = 14;
            jEmc = 20;
        } else {
            jEmc = zz.emc();
            iXq = zz.xq();
            iDg = zz.dg();
        }
        return new ypw(0, iXq, iDg, jEmc, file);
    }
}
