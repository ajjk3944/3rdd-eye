package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yk extends u.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zk f18784c;

    public yk(zk zkVar) {
        this.f18784c = zkVar;
    }

    @Override // u.a
    public final void onNavigationEvent(int i4, Bundle bundle) {
        zk zkVar = this.f18784c;
        zkVar.getClass();
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16271p5)).booleanValue() || zkVar.f19097d == null) {
            return;
        }
        fx.f11274a.execute(new b4.a(zkVar, i4, 3));
    }
}
