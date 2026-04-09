package c0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class y0 extends ek.j implements mk.e {

    /* renamed from: b, reason: collision with root package name */
    public gl.a f2530b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2531c;

    /* renamed from: d, reason: collision with root package name */
    public d0.l f2532d;

    /* renamed from: e, reason: collision with root package name */
    public z0 f2533e;

    /* renamed from: f, reason: collision with root package name */
    public int f2534f;
    public /* synthetic */ Object g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v0 f2535h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z0 f2536i;
    public final /* synthetic */ bh.t j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ d0.l f2537k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(v0 v0Var, z0 z0Var, bh.t tVar, d0.l lVar, ck.c cVar) {
        super(2, cVar);
        this.f2535h = v0Var;
        this.f2536i = z0Var;
        this.j = tVar;
        this.f2537k = lVar;
    }

    @Override // ek.a
    public final ck.c create(Object obj, ck.c cVar) {
        y0 y0Var = new y0(this.f2535h, this.f2536i, this.j, this.f2537k, cVar);
        y0Var.g = obj;
        return y0Var;
    }

    @Override // mk.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y0) create((xk.v) obj, (ck.c) obj2)).invokeSuspend(yj.u.f37649a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // ek.a
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
