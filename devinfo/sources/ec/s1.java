package ec;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class s1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23062b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23063c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u1 f23065e;

    public /* synthetic */ s1(u1 u1Var, String str, String str2, String str3, int i4) {
        this.f23061a = i4;
        this.f23062b = str;
        this.f23063c = str2;
        this.f23064d = str3;
        this.f23065e = u1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23061a) {
            case 0:
                u1 u1Var = this.f23065e;
                u1Var.f23089a.B();
                m mVar = u1Var.f23089a.f22733c;
                g4.U(mVar);
                return mVar.x0(this.f23062b, this.f23063c, this.f23064d);
            case 1:
                u1 u1Var2 = this.f23065e;
                u1Var2.f23089a.B();
                m mVar2 = u1Var2.f23089a.f22733c;
                g4.U(mVar2);
                return mVar2.x0(this.f23062b, this.f23063c, this.f23064d);
            case 2:
                u1 u1Var3 = this.f23065e;
                u1Var3.f23089a.B();
                m mVar3 = u1Var3.f23089a.f22733c;
                g4.U(mVar3);
                return mVar3.B0(this.f23062b, this.f23063c, this.f23064d);
            default:
                u1 u1Var4 = this.f23065e;
                u1Var4.f23089a.B();
                m mVar4 = u1Var4.f23089a.f22733c;
                g4.U(mVar4);
                return mVar4.B0(this.f23062b, this.f23063c, this.f23064d);
        }
    }
}
