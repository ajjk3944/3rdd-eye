package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class z60 extends hp1 implements eo {

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f19027c;

    public z60(Set set) {
        super(set);
        this.f19027c = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final synchronized void b(Bundle bundle, String str) {
        this.f19027c.putAll(bundle);
        p1(k60.j);
    }
}
