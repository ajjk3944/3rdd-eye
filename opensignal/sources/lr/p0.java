package lr;

/* loaded from: classes.dex */
public final class p0 extends a0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ir.v[] f15664g;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f15665c;

    /* renamed from: d, reason: collision with root package name */
    public final r1 f15666d;

    /* renamed from: e, reason: collision with root package name */
    public final s1 f15667e;

    /* renamed from: f, reason: collision with root package name */
    public final s1 f15668f;

    static {
        br.y yVar = br.x.f2918a;
        f15664g = new ir.v[]{yVar.f(new br.q(yVar.b(p0.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), yVar.f(new br.q(yVar.b(p0.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), yVar.f(new br.q(yVar.b(p0.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), yVar.f(new br.q(yVar.b(p0.class), "metadata", "getMetadata()Lkotlin/Triple;")), yVar.f(new br.q(yVar.b(p0.class), "members", "getMembers()Ljava/util/Collection;"))};
    }

    public p0(r0 r0Var) {
        super(r0Var);
        this.f15665c = t1.n(null, new m0(r0Var, 0));
        this.f15666d = t1.n(null, new o0(this, 1));
        this.f15667e = new s1(new n0(this, r0Var));
        this.f15668f = new s1(new o0(this, 0));
        t1.n(null, new n0(r0Var, this));
    }
}
