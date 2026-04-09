.class public abstract Lcom/valentinilk/shimmer/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Landroidx/compose/ui/e;LVf/b;LT/l;II)Landroidx/compose/ui/e;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6f2dfb61

    invoke-interface {p2, v0}, LT/l;->U(I)V

    and-int/lit8 p4, p4, 0x1

    const/4 v1, 0x0

    if-eqz p4, :cond_0

    sget-object p1, Lcom/valentinilk/shimmer/a$b;->a:Lcom/valentinilk/shimmer/a$b;

    const/4 p4, 0x6

    const/4 v2, 0x2

    invoke-static {p1, v1, p2, p4, v2}, LVf/f;->a(Lcom/valentinilk/shimmer/a;LVf/h;LT/l;II)LVf/b;

    move-result-object p1

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v2, "com.valentinilk.shimmer.shimmer (ShimmerModifier.kt:16)"

    invoke-static {v0, p3, p4, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p4

    invoke-interface {p2, p4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, LY0/d;

    invoke-virtual {p1}, LVf/b;->c()LVf/h;

    move-result-object v0

    invoke-virtual {v0}, LVf/h;->h()F

    move-result v0

    invoke-interface {p4, v0}, LY0/d;->d1(F)F

    move-result p4

    invoke-virtual {p1}, LVf/b;->c()LVf/h;

    move-result-object v0

    invoke-virtual {v0}, LVf/h;->e()F

    move-result v0

    const v2, 0x45e8cbe0

    invoke-interface {p2, v2}, LT/l;->U(I)V

    invoke-interface {p2, p4}, LT/l;->g(F)Z

    move-result v2

    invoke-interface {p2, v0}, LT/l;->g(F)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_3

    :cond_2
    new-instance v2, LVf/c;

    invoke-virtual {p1}, LVf/b;->c()LVf/h;

    move-result-object v0

    invoke-virtual {v0}, LVf/h;->e()F

    move-result v0

    invoke-direct {v2, p4, v0}, LVf/c;-><init>(FF)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, LVf/c;

    invoke-interface {p2}, LT/l;->J()V

    const p4, 0x45e8deb0

    invoke-interface {p2, p4}, LT/l;->U(I)V

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p4, v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p4, :cond_4

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v0, p4, :cond_5

    :cond_4
    new-instance v0, Lcom/valentinilk/shimmer/c$a;

    invoke-direct {v0, p1, v2, v1}, Lcom/valentinilk/shimmer/c$a;-><init>(LVf/b;LVf/c;Ldh/e;)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Lmh/p;

    invoke-interface {p2}, LT/l;->J()V

    and-int/lit8 p3, p3, 0x70

    invoke-static {v2, p1, v0, p2, p3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    new-instance p3, Lcom/valentinilk/shimmer/ShimmerElement;

    invoke-virtual {p1}, LVf/b;->b()LVf/d;

    move-result-object p1

    invoke-direct {p3, v2, p1}, Lcom/valentinilk/shimmer/ShimmerElement;-><init>(LVf/c;LVf/d;)V

    invoke-interface {p0, p3}, Landroidx/compose/ui/e;->b0(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object p0

    invoke-static {}, LT/o;->H()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LT/o;->P()V

    :cond_6
    invoke-interface {p2}, LT/l;->J()V

    return-object p0
.end method
