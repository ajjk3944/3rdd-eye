package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C4274c;

/* renamed from: com.google.android.gms.common.api.internal.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4291u implements ComponentCallbacks2C4274c.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4276e f34854a;

    C4291u(C4276e c4276e) {
        this.f34854a = c4276e;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C4274c.a
    public final void a(boolean z10) {
        C4276e c4276e = this.f34854a;
        c4276e.f34836n.sendMessage(c4276e.f34836n.obtainMessage(1, Boolean.valueOf(z10)));
    }
}
