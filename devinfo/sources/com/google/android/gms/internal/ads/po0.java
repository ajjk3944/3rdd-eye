package com.google.android.gms.internal.ads;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class po0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15058a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f15059b;

    /* renamed from: c, reason: collision with root package name */
    public final k10 f15060c;

    /* renamed from: d, reason: collision with root package name */
    public final oo0 f15061d;

    /* renamed from: e, reason: collision with root package name */
    public final fp0 f15062e;

    /* renamed from: f, reason: collision with root package name */
    public final za.a f15063f;
    public final FrameLayout g;

    /* renamed from: h, reason: collision with root package name */
    public final cs0 f15064h;

    /* renamed from: i, reason: collision with root package name */
    public final gq0 f15065i;
    public vd.b j;

    public po0(Context context, Executor executor, k10 k10Var, fp0 fp0Var, oo0 oo0Var, gq0 gq0Var, za.a aVar) {
        this.f15058a = context;
        this.f15059b = executor;
        this.f15060c = k10Var;
        this.f15062e = fp0Var;
        this.f15061d = oo0Var;
        this.f15065i = gq0Var;
        this.f15063f = aVar;
        this.g = new FrameLayout(context);
        this.f15064h = k10Var.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a(va.z2 r11, java.lang.String r12, com.google.android.gms.internal.ads.al0 r13, com.google.android.gms.internal.ads.bl0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.po0.a(va.z2, java.lang.String, com.google.android.gms.internal.ads.al0, com.google.android.gms.internal.ads.bl0):boolean");
    }

    public final synchronized m10 b(dp0 dp0Var) {
        mo0 mo0Var = (mo0) dp0Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16259o9)).booleanValue()) {
            y50 y50Var = new y50();
            y50Var.f18642a = this.f15058a;
            y50Var.f18643b = mo0Var.f13974a;
            y50 y50Var2 = new y50(y50Var);
            d80 d80Var = new d80();
            oo0 oo0Var = this.f15061d;
            Executor executor = this.f15059b;
            ((HashSet) d80Var.f10372l).add(new q80(oo0Var, executor));
            d80Var.c(oo0Var, executor);
            e80 e80Var = new e80(d80Var);
            m10 m10Var = new m10(this.f15060c.f12924b, 0);
            m10Var.f13721f = y50Var2;
            m10Var.f13720e = e80Var;
            return m10Var;
        }
        oo0 oo0Var2 = this.f15061d;
        oo0 oo0Var3 = new oo0(oo0Var2.f14756a);
        oo0Var3.f14762h = oo0Var2;
        d80 d80Var2 = new d80();
        Executor executor2 = this.f15059b;
        d80Var2.a(oo0Var3, executor2);
        ((HashSet) d80Var2.g).add(new q80(oo0Var3, executor2));
        ((HashSet) d80Var2.f10374n).add(new q80(oo0Var3, executor2));
        ((HashSet) d80Var2.f10373m).add(new q80(oo0Var3, executor2));
        ((HashSet) d80Var2.f10372l).add(new q80(oo0Var3, executor2));
        d80Var2.c(oo0Var3, executor2);
        d80Var2.f10375o = oo0Var3;
        y50 y50Var3 = new y50();
        y50Var3.f18642a = this.f15058a;
        y50Var3.f18643b = mo0Var.f13974a;
        y50 y50Var4 = new y50(y50Var3);
        e80 e80Var2 = new e80(d80Var2);
        m10 m10Var2 = new m10(this.f15060c.f12924b, 0);
        m10Var2.f13721f = y50Var4;
        m10Var2.f13720e = e80Var2;
        return m10Var2;
    }
}
