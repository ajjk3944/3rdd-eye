package com.bytedance.sdk.component.fkw.lh.ouw;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements com.bytedance.sdk.component.fkw.vt, Cloneable {

    /* renamed from: le, reason: collision with root package name */
    private static volatile com.bytedance.sdk.component.fkw.vt f7470le;
    private File fkw;

    /* renamed from: lh, reason: collision with root package name */
    private boolean f7471lh;
    private long ouw;
    private int vt;
    private boolean yu;

    public ouw(int i4, long j, File file) {
        this(i4, j, i4 != 0, j != 0, file);
    }

    public static com.bytedance.sdk.component.fkw.vt bly() {
        return f7470le;
    }

    private static long tlj() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean fkw() {
        return this.f7471lh;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean le() {
        return false;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int lh() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final long ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final File pno() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean ra() {
        return this.yu;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int vt() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int yu() {
        return 0;
    }

    private ouw(int i4, long j, boolean z3, boolean z10, File file) {
        this.ouw = j;
        this.vt = i4;
        this.f7471lh = z3;
        this.yu = z10;
        this.fkw = file;
    }

    public static void ouw(Context context, com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar != null) {
            f7470le = vtVar;
        } else {
            f7470le = ouw(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.fkw.vt ouw(File file) {
        int iMin;
        long jMin;
        file.mkdirs();
        if (f7470le == null) {
            iMin = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            jMin = Math.min(tlj() / 16, 41943040L);
        } else {
            iMin = Math.min(f7470le.vt() / 2, 31457280);
            jMin = Math.min(f7470le.ouw() / 2, 41943040L);
        }
        return new ouw(Math.max(iMin, 26214400), Math.max(jMin, 20971520L), file);
    }
}
