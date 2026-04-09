package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21817b;

    /* renamed from: c, reason: collision with root package name */
    public int f21818c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1 f21819d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long f21820e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1(s1 s1Var, long j, ck.c cVar, int i4) {
        super(2, cVar);
        this.f21817b = i4;
        this.f21819d = s1Var;
        this.f21820e = j;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        switch (this.f21817b) {
            case 0:
                return new q1(this.f21819d, this.f21820e, cVar, 0);
            case 1:
                return new q1(this.f21819d, this.f21820e, cVar, 1);
            default:
                q1 q1Var = new q1(this.f21819d, cVar);
                q1Var.f21820e = ((o1.b) obj).f30364a;
                return q1Var;
        }
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f21817b) {
            case 0:
                return ((q1) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            case 1:
                return ((q1) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
            default:
                long j = ((o1.b) obj).f30364a;
                q1 q1Var = new q1(this.f21819d, (ck.c) obj2);
                q1Var.f21820e = j;
                return q1Var.invokeSuspend(yj.u.f37649a);
        }
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f21817b) {
            case 0:
                int i4 = this.f21818c;
                if (i4 == 0) {
                    ci.b.D(obj);
                    z1 z1Var = this.f21819d.N;
                    p1 p1Var = new p1(this.f21820e, null);
                    this.f21818c = 1;
                    Object objF = z1Var.f(c0.v0.f2517b, p1Var, this);
                    dk.a aVar = dk.a.f22275a;
                    if (objF == aVar) {
                        return aVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            case 1:
                int i10 = this.f21818c;
                if (i10 == 0) {
                    ci.b.D(obj);
                    z1 z1Var2 = this.f21819d.N;
                    long j = this.f21820e;
                    this.f21818c = 1;
                    Object objB = z1Var2.b(j, true, this);
                    dk.a aVar2 = dk.a.f22275a;
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                }
                return yj.u.f37649a;
            default:
                int i11 = this.f21818c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ci.b.D(obj);
                    return obj;
                }
                ci.b.D(obj);
                long j8 = this.f21820e;
                z1 z1Var3 = this.f21819d.N;
                this.f21818c = 1;
                Object objC = m1.c(z1Var3, j8, this);
                dk.a aVar3 = dk.a.f22275a;
                return objC == aVar3 ? aVar3 : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(s1 s1Var, ck.c cVar) {
        super(2, cVar);
        this.f21817b = 2;
        this.f21819d = s1Var;
    }
}
