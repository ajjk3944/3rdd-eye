package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kz extends px {

    /* renamed from: c, reason: collision with root package name */
    public final zx f13293c;

    /* renamed from: d, reason: collision with root package name */
    public lz f13294d;

    /* renamed from: e, reason: collision with root package name */
    public sx f13295e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13296f;
    public int g;

    public kz(Context context, zx zxVar) {
        super(context);
        this.g = 1;
        this.f13296f = false;
        this.f13293c = zxVar;
        zxVar.a(this);
    }

    public final boolean C() {
        int i4 = this.g;
        return (i4 == 1 || i4 == 2 || this.f13294d == null) ? false : true;
    }

    public final void D(int i4) {
        cy cyVar = this.f15133b;
        zx zxVar = this.f13293c;
        if (i4 == 4) {
            zxVar.d();
            cyVar.f10256d = true;
            cyVar.a();
        } else if (this.g == 4) {
            zxVar.f19223m = false;
            cyVar.f10256d = false;
            cyVar.a();
        }
        this.g = i4;
    }

    @Override // com.google.android.gms.internal.ads.ay
    public final void E1() {
        if (this.f13294d != null) {
            this.f15133b.getClass();
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final String d() {
        return "ImmersivePlayer";
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void e(sx sxVar) {
        this.f13295e = sxVar;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void f(String str) {
        if (str != null) {
            Uri.parse(str).toString();
            this.f13294d = new lz(0);
            D(3);
            ya.f0.f37440l.post(new iz(this, 2));
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void g() {
        ya.a0.m("AdImmersivePlayerView stop");
        lz lzVar = this.f13294d;
        if (lzVar != null) {
            lzVar.f13683a.set(false);
            this.f13294d = null;
            D(1);
        }
        this.f13293c.b();
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void h() {
        ya.a0.m("AdImmersivePlayerView play");
        if (C()) {
            this.f13294d.f13683a.set(true);
            D(4);
            this.f15132a.f17376c = true;
            ya.f0.f37440l.post(new iz(this, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void n() {
        ya.a0.m("AdImmersivePlayerView pause");
        if (C() && this.f13294d.f13683a.get()) {
            this.f13294d.f13683a.set(false);
            D(5);
            ya.f0.f37440l.post(new iz(this, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int o() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int p() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void q(int i4) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 27);
        sb2.append("AdImmersivePlayerView seek ");
        sb2.append(i4);
        ya.a0.m(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int s() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int t() {
        return 0;
    }

    @Override // android.view.View
    public final String toString() {
        String name = kz.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return r5.c.m(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long u() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long v() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final long w() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final int x() {
        return C() ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.px
    public final void r(float f10, float f11) {
    }
}
