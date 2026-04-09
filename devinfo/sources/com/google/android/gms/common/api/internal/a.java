package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f9064a;

    /* renamed from: b, reason: collision with root package name */
    public final km.n f9065b;

    /* renamed from: c, reason: collision with root package name */
    public final ob.b f9066c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9067d;

    public a(km.n nVar, ob.b bVar, String str) {
        this.f9065b = nVar;
        this.f9066c = bVar;
        this.f9067d = str;
        this.f9064a = Arrays.hashCode(new Object[]{nVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return pb.y.l(this.f9065b, aVar.f9065b) && pb.y.l(this.f9066c, aVar.f9066c) && pb.y.l(this.f9067d, aVar.f9067d);
    }

    public final int hashCode() {
        return this.f9064a;
    }
}
