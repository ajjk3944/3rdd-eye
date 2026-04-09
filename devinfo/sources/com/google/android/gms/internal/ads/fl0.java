package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class fl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11202a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11203b;

    public /* synthetic */ fl0(int i4, boolean z3) {
        this.f11202a = i4;
        this.f11203b = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        switch (this.f11202a) {
            case 0:
                ((t50) obj).f16705a.putString("adid_p", true != this.f11203b ? "0" : "1");
                break;
            case 1:
                ((t50) obj).f16705a.putBoolean("ibrr", this.f11203b);
                break;
            case 2:
                ((t50) obj).f16705a.putBoolean("is_gbid", this.f11203b);
                break;
            default:
                t50 t50Var = (t50) obj;
                if (this.f11203b) {
                    t50Var.f16705a.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* synthetic */ void h(Object obj) {
        switch (this.f11202a) {
            case 2:
                ((t50) obj).f16706b.putBoolean("is_gbid", this.f11203b);
                break;
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }
}
