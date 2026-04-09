package com.yandex.mobile.ads.impl;

import ia.C4468d;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class wg0 extends v32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ sg0 f34965e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f34966f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C4468d f34967g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f34968h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(String str, sg0 sg0Var, int i, C4468d c4468d, int i10, boolean z10) {
        super(str, true);
        this.f34965e = sg0Var;
        this.f34966f = i;
        this.f34967g = c4468d;
        this.f34968h = i10;
    }

    @Override // com.yandex.mobile.ads.impl.v32
    public final long e() {
        try {
            wm1 wm1Var = this.f34965e.f32989l;
            C4468d source = this.f34967g;
            int i = this.f34968h;
            ((vm1) wm1Var).getClass();
            kotlin.jvm.internal.l.f(source, "source");
            source.skip(i);
            this.f34965e.k().a(this.f34966f, o50.i);
            synchronized (this.f34965e) {
                this.f34965e.f32978B.remove(Integer.valueOf(this.f34966f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
