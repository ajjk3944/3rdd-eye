package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ql0 implements qn0 {

    /* renamed from: a, reason: collision with root package name */
    public final mm0 f15356a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f15357b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f15358c;

    /* renamed from: d, reason: collision with root package name */
    public final zw f15359d;

    public ql0(mm0 mm0Var, hq0 hq0Var, Context context, zw zwVar) {
        this.f15356a = mm0Var;
        this.f15357b = hq0Var;
        this.f15358c = context;
        this.f15359d = zwVar;
    }

    public static final int d(int i4, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i4 / f10);
    }

    public static final v3.b e(v3.b bVar, float f10) {
        return f10 == 0.0f ? v3.b.f35792e : v3.b.c((int) Math.ceil(bVar.f35793a / f10), (int) Math.ceil(bVar.f35794b / f10), (int) Math.ceil(bVar.f35795c / f10), (int) Math.ceil(bVar.f35796d / f10));
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int a() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final vd.b b() {
        return yo0.G(this.f15356a.b(), new hu(3, this), fx.g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v2 com.google.android.gms.internal.ads.rl0, still in use, count: 4, list:
          (r3v2 com.google.android.gms.internal.ads.rl0) from 0x0306: MOVE (r21v0 com.google.android.gms.internal.ads.rl0) = (r3v2 com.google.android.gms.internal.ads.rl0) (LINE:775)
          (r3v2 com.google.android.gms.internal.ads.rl0) from 0x01a6: MOVE (r21v4 com.google.android.gms.internal.ads.rl0) = (r3v2 com.google.android.gms.internal.ads.rl0) (LINE:423)
          (r3v2 com.google.android.gms.internal.ads.rl0) from 0x01cb: MOVE (r21v5 com.google.android.gms.internal.ads.rl0) = (r3v2 com.google.android.gms.internal.ads.rl0) (LINE:460)
          (r3v2 com.google.android.gms.internal.ads.rl0) from 0x0181: MOVE (r21v7 com.google.android.gms.internal.ads.rl0) = (r3v2 com.google.android.gms.internal.ads.rl0) (LINE:386)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final com.google.android.gms.internal.ads.rl0 c() {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ql0.c():com.google.android.gms.internal.ads.rl0");
    }
}
