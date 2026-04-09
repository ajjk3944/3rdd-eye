package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
final class zz implements tu0 {

    /* renamed from: b, reason: collision with root package name */
    private final z12 f36795b;

    /* renamed from: c, reason: collision with root package name */
    private final a f36796c;

    /* renamed from: d, reason: collision with root package name */
    private so1 f36797d;

    /* renamed from: e, reason: collision with root package name */
    private tu0 f36798e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f36799f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f36800g;

    public interface a {
    }

    public zz(a aVar, m32 m32Var) {
        this.f36796c = aVar;
        this.f36795b = new z12(m32Var);
    }

    public final void a(so1 so1Var) {
        if (so1Var == this.f36797d) {
            this.f36798e = null;
            this.f36797d = null;
            this.f36799f = true;
        }
    }

    public final void b(so1 so1Var) throws h60 {
        tu0 tu0Var;
        tu0 tu0VarL = so1Var.l();
        if (tu0VarL == null || tu0VarL == (tu0Var = this.f36798e)) {
            return;
        }
        if (tu0Var != null) {
            throw h60.a(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f36798e = tu0VarL;
        this.f36797d = so1Var;
        ((vu0) tu0VarL).a(this.f36795b.getPlaybackParameters());
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final vh1 getPlaybackParameters() {
        tu0 tu0Var = this.f36798e;
        return tu0Var != null ? tu0Var.getPlaybackParameters() : this.f36795b.getPlaybackParameters();
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final long o() {
        if (this.f36799f) {
            return this.f36795b.o();
        }
        tu0 tu0Var = this.f36798e;
        tu0Var.getClass();
        return tu0Var.o();
    }

    public final void a(long j4) {
        this.f36795b.a(j4);
    }

    @Override // com.yandex.mobile.ads.impl.tu0
    public final void a(vh1 vh1Var) {
        tu0 tu0Var = this.f36798e;
        if (tu0Var != null) {
            tu0Var.a(vh1Var);
            vh1Var = this.f36798e.getPlaybackParameters();
        }
        this.f36795b.a(vh1Var);
    }

    public final void b() {
        this.f36800g = false;
        this.f36795b.b();
    }

    public final void a() {
        this.f36800g = true;
        this.f36795b.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r5) {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.so1 r0 = r4.f36797d
            if (r0 == 0) goto L68
            boolean r0 = r0.a()
            if (r0 != 0) goto L68
            com.yandex.mobile.ads.impl.so1 r0 = r4.f36797d
            boolean r0 = r0.d()
            if (r0 != 0) goto L1d
            if (r5 != 0) goto L68
            com.yandex.mobile.ads.impl.so1 r5 = r4.f36797d
            boolean r5 = r5.e()
            if (r5 == 0) goto L1d
            goto L68
        L1d:
            com.yandex.mobile.ads.impl.tu0 r5 = r4.f36798e
            r5.getClass()
            long r0 = r5.o()
            boolean r2 = r4.f36799f
            if (r2 == 0) goto L46
            com.yandex.mobile.ads.impl.z12 r2 = r4.f36795b
            long r2 = r2.o()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L3a
            com.yandex.mobile.ads.impl.z12 r5 = r4.f36795b
            r5.b()
            goto L74
        L3a:
            r2 = 0
            r4.f36799f = r2
            boolean r2 = r4.f36800g
            if (r2 == 0) goto L46
            com.yandex.mobile.ads.impl.z12 r2 = r4.f36795b
            r2.a()
        L46:
            com.yandex.mobile.ads.impl.z12 r2 = r4.f36795b
            r2.a(r0)
            com.yandex.mobile.ads.impl.vh1 r5 = r5.getPlaybackParameters()
            com.yandex.mobile.ads.impl.z12 r0 = r4.f36795b
            com.yandex.mobile.ads.impl.vh1 r0 = r0.getPlaybackParameters()
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L74
            com.yandex.mobile.ads.impl.z12 r0 = r4.f36795b
            r0.a(r5)
            com.yandex.mobile.ads.impl.zz$a r0 = r4.f36796c
            com.yandex.mobile.ads.impl.o60 r0 = (com.yandex.mobile.ads.impl.o60) r0
            r0.a(r5)
            goto L74
        L68:
            r5 = 1
            r4.f36799f = r5
            boolean r5 = r4.f36800g
            if (r5 == 0) goto L74
            com.yandex.mobile.ads.impl.z12 r5 = r4.f36795b
            r5.a()
        L74:
            long r0 = r4.o()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zz.a(boolean):long");
    }
}
