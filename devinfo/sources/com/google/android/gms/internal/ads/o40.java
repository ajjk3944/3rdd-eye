package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class o40 implements oj0 {

    /* renamed from: a, reason: collision with root package name */
    public final dq0 f14532a;

    /* renamed from: b, reason: collision with root package name */
    public final wp0 f14533b;

    /* renamed from: c, reason: collision with root package name */
    public final s60 f14534c;

    /* renamed from: d, reason: collision with root package name */
    public final v60 f14535d;

    /* renamed from: e, reason: collision with root package name */
    public final cp0 f14536e;

    /* renamed from: f, reason: collision with root package name */
    public final c60 f14537f;
    public final p70 g;

    /* renamed from: h, reason: collision with root package name */
    public final x60 f14538h;

    /* renamed from: i, reason: collision with root package name */
    public final o80 f14539i;
    public final o50 j;

    /* renamed from: k, reason: collision with root package name */
    public final be0 f14540k;

    public o40(c1.o oVar) {
        this.f14532a = (dq0) oVar.f2570b;
        this.f14533b = (wp0) oVar.f2571c;
        this.f14534c = (s60) oVar.f2572d;
        this.f14535d = (v60) oVar.f2573e;
        this.f14536e = (cp0) oVar.f2574f;
        this.f14537f = (c60) oVar.g;
        this.g = (p70) oVar.f2575h;
        this.f14538h = (x60) oVar.f2576i;
        this.f14539i = (o80) oVar.j;
        this.j = (o50) oVar.f2577k;
        this.f14540k = (be0) oVar.f2569a;
    }

    @Override // com.google.android.gms.internal.ads.oj0
    public final void F1() {
        this.f14539i.C1();
    }

    public void a() {
        this.f14535d.e();
        this.f14538h.v(this);
    }

    public final void b() {
        be0 be0Var;
        u51 u51Var = this.f14533b.C0;
        if (u51Var == null || u51Var.isEmpty() || (be0Var = this.f14540k) == null) {
            return;
        }
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.H8)).booleanValue() || u51Var.isEmpty()) {
            return;
        }
        v41 v41VarListIterator = u51Var.listIterator(0);
        while (v41VarListIterator.hasNext()) {
            ce0 ce0Var = (ce0) v41VarListIterator.next();
            int[] iArr = ce0Var.f10091b;
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (iArr[i4] == 1) {
                    long j = ce0Var.f10090a;
                    ua.j.C.f35267k.getClass();
                    be0Var.a(j, System.currentTimeMillis(), 1);
                    break;
                }
                i4++;
            }
        }
    }
}
