package d0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class r1 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public int f21823b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f21824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f21825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f21826e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(s1 s1Var, float f10, float f11, ck.c cVar) {
        super(2, cVar);
        this.f21824c = s1Var;
        this.f21825d = f10;
        this.f21826e = f11;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        return new r1(this.f21824c, this.f21825d, this.f21826e, cVar);
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        int i4 = this.f21823b;
        if (i4 == 0) {
            ci.b.D(obj);
            this.f21823b = 1;
            Object objC = m1.c(this.f21824c.N, (Float.floatToRawIntBits(this.f21825d) << 32) | (Float.floatToRawIntBits(this.f21826e) & 4294967295L), this);
            dk.a aVar = dk.a.f22275a;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ci.b.D(obj);
        }
        return yj.u.f37649a;
    }
}
