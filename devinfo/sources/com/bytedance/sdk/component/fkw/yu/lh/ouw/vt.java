package com.bytedance.sdk.component.fkw.yu.lh.ouw;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class vt implements com.bytedance.sdk.component.fkw.vt, Cloneable {
    private static volatile com.bytedance.sdk.component.fkw.vt bly;
    private boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    private boolean f7512le;

    /* renamed from: lh, reason: collision with root package name */
    private int f7513lh;
    private long ouw;
    private File pno;
    private boolean ra;
    private int vt;
    private int yu;

    public vt(int i4, int i10, long j, File file) {
        this(i4, i10, j, i4 != 0, j != 0, file);
    }

    public static com.bytedance.sdk.component.fkw.vt bly() {
        return bly;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean fkw() {
        return this.fkw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean le() {
        return this.ra;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int lh() {
        return this.f7513lh;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final long ouw() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final File pno() {
        return this.pno;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final boolean ra() {
        return this.f7512le;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int vt() {
        return this.vt;
    }

    @Override // com.bytedance.sdk.component.fkw.vt
    public final int yu() {
        return this.yu;
    }

    private vt(int i4, int i10, long j, boolean z3, boolean z10, File file) {
        this.ouw = j;
        this.vt = 0;
        this.f7513lh = i4;
        this.yu = i10;
        this.fkw = z3;
        this.f7512le = z10;
        this.pno = file;
        this.ra = i10 != 0;
    }

    public static void ouw(Context context, com.bytedance.sdk.component.fkw.vt vtVar) {
        if (vtVar != null) {
            bly = vtVar;
        } else {
            bly = ouw(new File(context.getCacheDir(), "image"));
        }
    }

    public static com.bytedance.sdk.component.fkw.vt ouw(File file) {
        long jOuw;
        int iLh;
        int iYu;
        file.mkdirs();
        if (bly == null) {
            iLh = 10;
            iYu = 14;
            jOuw = 20;
        } else {
            jOuw = bly.ouw();
            iLh = bly.lh();
            iYu = bly.yu();
        }
        return new vt(iLh, iYu, jOuw, file);
    }
}
