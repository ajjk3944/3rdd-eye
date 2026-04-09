package h7;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final kg.r f10069a;

    /* renamed from: b, reason: collision with root package name */
    public final s1 f10070b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f10071c;

    /* renamed from: d, reason: collision with root package name */
    public final a8.f f10072d;

    /* renamed from: e, reason: collision with root package name */
    public int f10073e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f10074f;

    public g0(q0 q0Var, a8.f fVar, ag.b bVar, s1 s1Var) {
        f0 f0Var = new f0(this);
        this.f10074f = f0Var;
        this.f10071c = q0Var;
        this.f10072d = fVar;
        bVar.getClass();
        kg.r rVar = new kg.r();
        rVar.f14398r = bVar;
        rVar.f14395a = new SparseIntArray(1);
        rVar.f14396d = new SparseIntArray(1);
        rVar.f14397g = this;
        this.f10069a = rVar;
        this.f10070b = s1Var;
        this.f10073e = q0Var.b();
        q0Var.f10189a.registerObserver(f0Var);
    }
}
