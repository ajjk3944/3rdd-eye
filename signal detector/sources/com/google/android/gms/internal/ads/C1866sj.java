package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.sj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1866sj implements InterfaceC1920tj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f16775a;

    public C1866sj(Map map) {
        this.f16775a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1920tj
    public final InterfaceC0956bq a(int i, String str) {
        return (InterfaceC0956bq) this.f16775a.get(str);
    }
}
