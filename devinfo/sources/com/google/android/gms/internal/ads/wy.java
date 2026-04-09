package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wy extends uy {
    @Override // com.google.android.gms.internal.ads.uy
    public final boolean b(String str) {
        String strD = za.d.d(str, "MD5");
        qz qzVar = (qz) this.f17383c.get();
        if (qzVar != null && strD != null) {
            qzVar.B0(strD, this);
        }
        za.i.h("VideoStreamNoopCache is doing nothing.");
        r(str, strD, "noop", "Noop cache is a noop.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.uy
    public final void q() {
    }
}
