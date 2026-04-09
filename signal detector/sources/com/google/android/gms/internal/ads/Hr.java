package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Hr implements Ls {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9009a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9010b;

    public /* synthetic */ Hr(int i, boolean z6) {
        this.f9009a = i;
        this.f9010b = z6;
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void e(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f9009a) {
            case 0:
                ((C0797Wj) obj).f12308a.putString("adid_p", true != this.f9010b ? "0" : "1");
                break;
            case 1:
                ((C0797Wj) obj).f12308a.putBoolean("ibrr", this.f9010b);
                break;
            case 2:
                ((C0797Wj) obj).f12308a.putBoolean("is_gbid", this.f9010b);
                break;
            default:
                C0797Wj c0797Wj = (C0797Wj) obj;
                if (this.f9010b) {
                    c0797Wj.f12308a.putBoolean("sdk_prefetch", true);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ls
    public final /* synthetic */ void d(Object obj) {
        switch (this.f9009a) {
            case 2:
                ((C0797Wj) obj).f12309b.putBoolean("is_gbid", this.f9010b);
                break;
        }
    }
}
