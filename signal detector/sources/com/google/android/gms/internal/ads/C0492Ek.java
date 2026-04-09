package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ek, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492Ek extends VL implements InterfaceC1912tb {

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f7990c;

    public C0492Ek(Set set) {
        super(set);
        this.f7990c = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1912tb
    public final synchronized void u(String str, Bundle bundle) {
        this.f7990c.putAll(bundle);
        C1(C1652ok.f16047k);
    }
}
