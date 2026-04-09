package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c0 extends ek.i implements mk.e {

    /* renamed from: a, reason: collision with root package name */
    public a1.d f36860a;

    /* renamed from: b, reason: collision with root package name */
    public d0 f36861b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f36862c;

    /* renamed from: d, reason: collision with root package name */
    public int f36863d;

    /* renamed from: e, reason: collision with root package name */
    public int f36864e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f36865f;
    public final /* synthetic */ d0 g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1.d f36866h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, a1.d dVar, ck.c cVar) {
        super(2, cVar);
        this.g = d0Var;
        this.f36866h = dVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        c0 c0Var = new c0(this.g, this.f36866h, cVar);
        c0Var.f36865f = obj;
        return c0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((uk.h) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    @Override // ek.a
    public final Object invokeSuspend(Object obj) {
        uk.h hVar;
        d0 d0Var;
        long[] jArr;
        int i4;
        a1.d dVar;
        int i10 = this.f36864e;
        if (i10 == 0) {
            ci.b.D(obj);
            hVar = (uk.h) this.f36865f;
            d0Var = this.g;
            b0 b0Var = d0Var.f36869b;
            jArr = b0Var.f36851c;
            i4 = b0Var.f36853e;
            dVar = this.f36866h;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = this.f36863d;
            jArr = this.f36862c;
            d0Var = this.f36861b;
            dVar = this.f36860a;
            hVar = (uk.h) this.f36865f;
            ci.b.D(obj);
        }
        if (i4 == Integer.MAX_VALUE) {
            return yj.u.f37649a;
        }
        int i11 = (int) ((jArr[i4] >> 31) & 2147483647L);
        dVar.f164c = i4;
        Object obj2 = d0Var.f36869b.f36850b[i4];
        this.f36865f = hVar;
        this.f36860a = dVar;
        this.f36861b = d0Var;
        this.f36862c = jArr;
        this.f36863d = i11;
        this.f36864e = 1;
        hVar.a(this, obj2);
        return dk.a.f22275a;
    }
}
