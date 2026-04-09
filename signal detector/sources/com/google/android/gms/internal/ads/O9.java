package com.google.android.gms.internal.ads;

import android.os.Bundle;
import q2.C2841s;
import r.AbstractC2858a;

/* loaded from: classes.dex */
public final class O9 extends AbstractC2858a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P9 f10166a;

    public O9(P9 p9) {
        this.f10166a = p9;
    }

    @Override // r.AbstractC2858a
    public final void e(int i, Bundle bundle) {
        P9 p9 = this.f10166a;
        p9.getClass();
        if (!((Boolean) C2841s.f23267e.f23270c.a(H9.f8808p5)).booleanValue() || p9.f10328d == null) {
            return;
        }
        AbstractC0640Nf.f10005a.execute(new A3.h(i, 6, p9));
    }
}
