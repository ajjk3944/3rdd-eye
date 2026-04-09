package com.google.android.gms.internal.ads;

import com.applovin.sdk.AppLovinMediationProvider;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nt0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f14406a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.b f14407b;

    /* renamed from: c, reason: collision with root package name */
    public final String f14408c;

    public /* synthetic */ nt0(pq0 pq0Var) {
        this.f14406a = (String) pq0Var.f15073b;
        this.f14407b = (pa.b) pq0Var.f15074c;
        this.f14408c = (String) pq0Var.f15075d;
    }

    public final String a() {
        pa.b bVar = this.f14407b;
        return bVar == null ? AppLovinMediationProvider.UNKNOWN : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        pa.b bVar;
        pa.b bVar2;
        if (obj instanceof nt0) {
            nt0 nt0Var = (nt0) obj;
            if (this.f14406a.equals(nt0Var.f14406a) && (bVar = this.f14407b) != null && (bVar2 = nt0Var.f14407b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f14406a, this.f14407b);
    }
}
