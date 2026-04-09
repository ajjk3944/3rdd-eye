.class public abstract LVf/e;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(LVf/h;LT/l;I)LVf/d;
    .locals 9

    const-string v0, "theme"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x4b74a798    # 1.6033688E7f

    invoke-interface {p1, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.valentinilk.shimmer.rememberShimmerEffect (ShimmerEffect.kt:21)"

    invoke-static {v0, p2, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object p2

    invoke-interface {p1, p2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, LY0/d;

    invoke-virtual {p0}, LVf/h;->h()F

    move-result v0

    invoke-interface {p2, v0}, LY0/d;->d1(F)F

    move-result v7

    const p2, 0x5b4706de

    invoke-interface {p1, p2}, LT/l;->U(I)V

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_1

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne v0, p2, :cond_2

    :cond_1
    new-instance v0, LVf/d;

    invoke-virtual {p0}, LVf/h;->c()Lr/i;

    move-result-object v2

    invoke-virtual {p0}, LVf/h;->d()I

    move-result v3

    invoke-virtual {p0}, LVf/h;->e()F

    move-result v4

    invoke-virtual {p0}, LVf/h;->g()Ljava/util/List;

    move-result-object v5

    invoke-virtual {p0}, LVf/h;->f()Ljava/util/List;

    move-result-object v6

    const/4 v8, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, LVf/d;-><init>(Lr/i;IFLjava/util/List;Ljava/util/List;FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, LVf/d;

    invoke-interface {p1}, LT/l;->J()V

    const p0, 0x5b473344

    invoke-interface {p1, p0}, LT/l;->U(I)V

    invoke-interface {p1, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_3

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p2, p0, :cond_4

    :cond_3
    new-instance p2, LVf/e$a;

    const/4 p0, 0x0

    invoke-direct {p2, v0, p0}, LVf/e$a;-><init>(LVf/d;Ldh/e;)V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast p2, Lmh/p;

    invoke-interface {p1}, LT/l;->J()V

    const/4 p0, 0x0

    invoke-static {v0, p2, p1, p0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->J()V

    return-object v0
.end method
