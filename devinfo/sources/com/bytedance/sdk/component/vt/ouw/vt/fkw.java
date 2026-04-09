package com.bytedance.sdk.component.vt.ouw.vt;

import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
final class fkw {
    boolean fkw;

    /* renamed from: le, reason: collision with root package name */
    fkw f7669le;

    /* renamed from: lh, reason: collision with root package name */
    int f7670lh;
    final byte[] ouw;
    fkw ra;
    int vt;
    boolean yu;

    public fkw() {
        this.ouw = new byte[Segment.SIZE];
        this.fkw = true;
        this.yu = false;
    }

    public final fkw ouw() {
        this.yu = true;
        return new fkw(this.ouw, this.vt, this.f7670lh);
    }

    public final fkw vt() {
        fkw fkwVar = this.f7669le;
        fkw fkwVar2 = fkwVar != this ? fkwVar : null;
        fkw fkwVar3 = this.ra;
        if (fkwVar3 != null) {
            fkwVar3.f7669le = fkwVar;
        }
        fkw fkwVar4 = this.f7669le;
        if (fkwVar4 != null) {
            fkwVar4.ra = fkwVar3;
        }
        this.f7669le = null;
        this.ra = null;
        return fkwVar2;
    }

    public final fkw ouw(fkw fkwVar) {
        fkwVar.ra = this;
        fkwVar.f7669le = this.f7669le;
        this.f7669le.ra = fkwVar;
        this.f7669le = fkwVar;
        return fkwVar;
    }

    private fkw(byte[] bArr, int i4, int i10) {
        this.ouw = bArr;
        this.vt = i4;
        this.f7670lh = i10;
        this.yu = true;
        this.fkw = false;
    }
}
