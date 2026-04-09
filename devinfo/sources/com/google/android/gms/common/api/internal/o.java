package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final a f9112a;

    /* renamed from: b, reason: collision with root package name */
    public final nb.d f9113b;

    public /* synthetic */ o(a aVar, nb.d dVar) {
        this.f9112a = aVar;
        this.f9113b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof o)) {
            o oVar = (o) obj;
            if (pb.y.l(this.f9112a, oVar.f9112a) && pb.y.l(this.f9113b, oVar.f9113b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9112a, this.f9113b});
    }

    public final String toString() {
        km.n nVar = new km.n(this);
        nVar.f(this.f9112a, "key");
        nVar.f(this.f9113b, "feature");
        return nVar.toString();
    }
}
