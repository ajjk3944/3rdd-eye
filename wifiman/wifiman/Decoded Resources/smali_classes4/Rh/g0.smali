.class final LRh/g0;
.super LRh/d;
.source "SourceFile"


# instance fields
.field private final a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;

.field private final b:Z

.field private final c:LMh/k;

.field private final d:LJh/c;

.field private final e:Z


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;Z)V
    .locals 1

    const-string v0, "containerContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containerApplicabilityType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, LRh/d;-><init>()V

    .line 3
    iput-object p1, p0, LRh/g0;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;

    .line 4
    iput-boolean p2, p0, LRh/g0;->b:Z

    .line 5
    iput-object p3, p0, LRh/g0;->c:LMh/k;

    .line 6
    iput-object p4, p0, LRh/g0;->d:LJh/c;

    .line 7
    iput-boolean p5, p0, LRh/g0;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 1
    invoke-direct/range {v0 .. v5}, LRh/g0;-><init>(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;ZLMh/k;LJh/c;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A()Lri/o;
    .locals 1

    invoke-virtual {p0}, LRh/g0;->M()Lri/q;

    move-result-object v0

    return-object v0
.end method

.method public B(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->e0(Lpi/S;)Z

    move-result p1

    return p1
.end method

.method public C()Z
    .locals 1

    iget-boolean v0, p0, LRh/g0;->b:Z

    return v0
.end method

.method public D(Lri/i;Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LRh/g0;->c:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->k()Lkotlin/reflect/jvm/internal/impl/types/checker/p;

    move-result-object v0

    check-cast p1, Lpi/S;

    check-cast p2, Lpi/S;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/types/checker/e;->b(Lpi/S;Lpi/S;)Z

    move-result p1

    return p1
.end method

.method public E(Lri/n;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p1, p1, LNh/c0;

    return p1
.end method

.method public F(Lri/i;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    invoke-virtual {p1}, Lpi/S;->Q0()Lpi/M0;

    move-result-object p1

    instance-of p1, p1, LRh/j;

    return p1
.end method

.method public J(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;Lri/i;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LLh/g;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LLh/g;

    invoke-interface {v0}, LLh/g;->d()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_0
    instance-of v0, p1, LNh/j;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LRh/g0;->u()Z

    move-result v0

    if-nez v0, :cond_1

    move-object v0, p1

    check-cast v0, LNh/j;

    invoke-virtual {v0}, LNh/j;->m()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, LRh/g0;->q()LJh/c;

    move-result-object v0

    sget-object v1, LJh/c;->TYPE_PARAMETER_BOUNDS:LJh/c;

    if-eq v0, v1, :cond_2

    :cond_1
    if-eqz p2, :cond_3

    check-cast p2, Lpi/S;

    invoke-static {p2}, Lkotlin/reflect/jvm/internal/impl/builtins/i;->q0(Lpi/S;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, LRh/g0;->K()LJh/d;

    move-result-object p2

    invoke-virtual {p2, p1}, LJh/b;->p(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, LRh/g0;->c:LMh/k;

    invoke-virtual {p1}, LMh/k;->a()LMh/d;

    move-result-object p1

    invoke-virtual {p1}, LMh/d;->q()LMh/e;

    move-result-object p1

    invoke-interface {p1}, LMh/e;->c()Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public K()LJh/d;
    .locals 1

    iget-object v0, p0, LRh/g0;->c:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->a()LJh/d;

    move-result-object v0

    return-object v0
.end method

.method public L(Lri/i;)Lpi/S;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lpi/L0;->a(Lpi/S;)Lpi/S;

    move-result-object p1

    return-object p1
.end method

.method public M()Lri/q;
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/types/checker/s;->a:Lkotlin/reflect/jvm/internal/impl/types/checker/s;

    return-object v0
.end method

.method public bridge synthetic l(Ljava/lang/Object;Lri/i;)Z
    .locals 0

    check-cast p1, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;

    invoke-virtual {p0, p1, p2}, LRh/g0;->J(Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/c;Lri/i;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic m()LJh/b;
    .locals 1

    invoke-virtual {p0}, LRh/g0;->K()LJh/d;

    move-result-object v0

    return-object v0
.end method

.method public n(Lri/i;)Ljava/lang/Iterable;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    invoke-virtual {p1}, Lpi/S;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object p1

    return-object p1
.end method

.method public p()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, LRh/g0;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;->getAnnotations()Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/h;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    :goto_0
    return-object v0
.end method

.method public q()LJh/c;
    .locals 1

    iget-object v0, p0, LRh/g0;->d:LJh/c;

    return-object v0
.end method

.method public r()LJh/E;
    .locals 1

    iget-object v0, p0, LRh/g0;->c:LMh/k;

    invoke-virtual {v0}, LMh/k;->b()LJh/E;

    move-result-object v0

    return-object v0
.end method

.method public s()Z
    .locals 2

    iget-object v0, p0, LRh/g0;->a:Lkotlin/reflect/jvm/internal/impl/descriptors/annotations/a;

    instance-of v1, v0, LBh/s0;

    if-eqz v1, :cond_0

    check-cast v0, LBh/s0;

    invoke-interface {v0}, LBh/s0;->j0()Lpi/S;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected t(LRh/l;LJh/w;)LRh/l;
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    sget-object v1, LRh/k;->NOT_NULL:LRh/k;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {p1, v1, v2, v3, v0}, LRh/l;->b(LRh/l;LRh/k;ZILjava/lang/Object;)LRh/l;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    goto :goto_1

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LJh/w;->d()LRh/l;

    move-result-object v0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, LRh/g0;->c:LMh/k;

    invoke-virtual {v0}, LMh/k;->a()LMh/d;

    move-result-object v0

    invoke-virtual {v0}, LMh/d;->q()LMh/e;

    move-result-object v0

    invoke-interface {v0}, LMh/e;->d()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic v(Lri/i;)Lri/i;
    .locals 0

    invoke-virtual {p0, p1}, LRh/g0;->L(Lri/i;)Lpi/S;

    move-result-object p1

    return-object p1
.end method

.method public x(Lri/i;)LZh/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpi/S;

    invoke-static {p1}, Lpi/J0;->f(Lpi/S;)LBh/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lbi/i;->m(LBh/m;)LZh/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public z()Z
    .locals 1

    iget-boolean v0, p0, LRh/g0;->e:Z

    return v0
.end method
