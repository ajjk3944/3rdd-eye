package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.es, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1121es implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13994a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f13995b;

    public /* synthetic */ C1121es(Integer num, int i) {
        this.f13994a = i;
        this.f13995b = num;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f13994a) {
            case 0:
                C0797Wj c0797Wj = (C0797Wj) obj;
                Integer num = this.f13995b;
                if (num != null) {
                    c0797Wj.f12308a.putInt("aos", num.intValue());
                    break;
                }
                break;
            default:
                C0797Wj c0797Wj2 = (C0797Wj) obj;
                Integer num2 = this.f13995b;
                if (num2 != null) {
                    c0797Wj2.f12308a.putInt("dspct", Math.min(num2.intValue(), 20));
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        int i = this.f13994a;
    }
}
