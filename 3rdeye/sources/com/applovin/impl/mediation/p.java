package com.applovin.impl.mediation;

import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.d;
import com.applovin.impl.mediation.e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f20506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f20507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC0312a f20508e;

    public /* synthetic */ p(a.InterfaceC0312a interfaceC0312a, int i, String str, int i10) {
        this.f20505b = i10;
        this.f20508e = interfaceC0312a;
        this.f20506c = i;
        this.f20507d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20505b) {
            case 0:
                ((d.b) this.f20508e).a(this.f20506c, this.f20507d);
                break;
            default:
                ((e.b) this.f20508e).a(this.f20506c, this.f20507d);
                break;
        }
    }
}
