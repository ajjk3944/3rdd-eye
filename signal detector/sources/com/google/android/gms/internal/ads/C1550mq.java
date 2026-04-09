package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.mq, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1550mq implements InterfaceC0595Kl {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1119eq f15675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Qt f15676c;

    public /* synthetic */ C1550mq(InterfaceC1282hq interfaceC1282hq, C1119eq c1119eq, Qt qt, int i) {
        this.f15674a = i;
        this.f15675b = c1119eq;
        this.f15676c = qt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public final Qt c() {
        switch (this.f15674a) {
        }
        return this.f15676c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0595Kl
    public final void p(boolean z6, Context context, C1760qk c1760qk) throws C0578Jl {
        C1123eu c1123eu;
        switch (this.f15674a) {
            case 0:
                try {
                    C1392ju c1392ju = (C1392ju) this.f15675b.f13987b;
                    c1392ju.b(z6);
                    try {
                        c1392ju.f15016a.V0(new S2.b(context));
                        return;
                    } finally {
                    }
                } catch (C1123eu e6) {
                    throw new C0578Jl(e6.getCause());
                }
            default:
                try {
                    C1392ju c1392ju2 = (C1392ju) this.f15675b.f13987b;
                    c1392ju2.b(z6);
                    try {
                        c1392ju2.f15016a.Q0(new S2.b(context));
                        return;
                    } finally {
                    }
                } catch (C1123eu e7) {
                    throw new C0578Jl(e7.getCause());
                }
        }
    }
}
