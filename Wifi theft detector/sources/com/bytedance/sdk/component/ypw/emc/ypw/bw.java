package com.bytedance.sdk.component.ypw.emc.ypw;

/* loaded from: classes.dex */
final class bw {
    boolean bw;
    boolean dg;
    final byte[] emc;
    bw uym;
    int xq;
    bw ycc;
    int ypw;

    public bw() {
        this.emc = new byte[8192];
        this.bw = true;
        this.dg = false;
    }

    public final bw emc() {
        this.dg = true;
        return new bw(this.emc, this.ypw, this.xq, true, false);
    }

    public final bw ypw() {
        bw bwVar = this.ycc;
        bw bwVar2 = bwVar != this ? bwVar : null;
        bw bwVar3 = this.uym;
        if (bwVar3 != null) {
            bwVar3.ycc = bwVar;
        }
        bw bwVar4 = this.ycc;
        if (bwVar4 != null) {
            bwVar4.uym = bwVar3;
        }
        this.ycc = null;
        this.uym = null;
        return bwVar2;
    }

    public final bw emc(bw bwVar) {
        bwVar.uym = this;
        bwVar.ycc = this.ycc;
        this.ycc.uym = bwVar;
        this.ycc = bwVar;
        return bwVar;
    }

    public bw(byte[] bArr, int i10, int i11, boolean z10, boolean z11) {
        this.emc = bArr;
        this.ypw = i10;
        this.xq = i11;
        this.dg = z10;
        this.bw = z11;
    }
}
