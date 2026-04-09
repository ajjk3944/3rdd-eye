package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16464a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16465b;

    public /* synthetic */ sl0(int i4, ArrayList arrayList) {
        this.f16464a = i4;
        this.f16465b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.f16464a) {
            case 0:
                ((t50) obj).f16705a.putStringArrayList("ad_types", this.f16465b);
                break;
            default:
                mq0.a0(((t50) obj).f16705a, "android_permissions", this.f16465b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f16464a) {
            case 0:
                ((t50) obj).f16706b.putStringArrayList("ad_types", this.f16465b);
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }
}
