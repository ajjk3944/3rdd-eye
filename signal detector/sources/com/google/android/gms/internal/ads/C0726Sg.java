package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import t2.AbstractC2907C;
import t2.C2911G;

/* renamed from: com.google.android.gms.internal.ads.Sg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726Sg extends AbstractC0827Yf {

    /* renamed from: c, reason: collision with root package name */
    public final C1325ig f11189c;

    /* renamed from: d, reason: collision with root package name */
    public C0743Tg f11190d;

    /* renamed from: e, reason: collision with root package name */
    public C0946bg f11191e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11192f;

    /* renamed from: g, reason: collision with root package name */
    public int f11193g;

    public C0726Sg(Context context, C1325ig c1325ig) {
        super(context);
        this.f11193g = 1;
        this.f11192f = false;
        this.f11189c = c1325ig;
        c1325ig.a(this);
    }

    public final boolean D() {
        int i = this.f11193g;
        return (i == 1 || i == 2 || this.f11190d == null) ? false : true;
    }

    public final void E(int i) {
        C1432kg c1432kg = this.f12647b;
        C1325ig c1325ig = this.f11189c;
        if (i == 4) {
            c1325ig.d();
            c1432kg.f15180d = true;
            c1432kg.a();
        } else if (this.f11193g == 4) {
            c1325ig.f14744m = false;
            c1432kg.f15180d = false;
            c1432kg.a();
        }
        this.f11193g = i;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void e(C0946bg c0946bg) {
        this.f11191e = c0946bg;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f11190d = new C0743Tg(0);
            E(3);
            C2911G.f23576l.post(new RunnableC0692Qg(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void g() {
        AbstractC2907C.m("AdImmersivePlayerView stop");
        C0743Tg c0743Tg = this.f11190d;
        if (c0743Tg != null) {
            c0743Tg.f11420a.set(false);
            this.f11190d = null;
            E(1);
        }
        this.f11189c.b();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void h() {
        AbstractC2907C.m("AdImmersivePlayerView play");
        if (D()) {
            this.f11190d.f11420a.set(true);
            E(4);
            this.f12646a.f13790c = true;
            C2911G.f23576l.post(new RunnableC0692Qg(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void i() {
        AbstractC2907C.m("AdImmersivePlayerView pause");
        if (D() && this.f11190d.f11420a.get()) {
            this.f11190d.f11420a.set(false);
            E(5);
            C2911G.f23576l.post(new RunnableC0692Qg(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int j() {
        return D() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1378jg
    public final void l() {
        if (this.f11190d != null) {
            this.f12647b.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void m(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27);
        sb.append("AdImmersivePlayerView seek ");
        sb.append(i);
        AbstractC2907C.m(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final void n(float f2, float f5) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int o() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long q() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long r() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final long s() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = C0726Sg.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return AbstractC1135f5.n(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC0827Yf
    public final int y() {
        return D() ? 0 : -1;
    }
}
