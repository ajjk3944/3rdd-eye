.class public abstract LO/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLmh/a;FFLT/l;II)LO/g;
    .locals 5

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_0

    sget-object p2, LO/b;->a:LO/b;

    invoke-virtual {p2}, LO/b;->a()F

    move-result p2

    :cond_0
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_1

    sget-object p3, LO/b;->a:LO/b;

    invoke-virtual {p3}, LO/b;->b()F

    move-result p3

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p6

    if-eqz p6, :cond_2

    const/4 p6, -0x1

    const-string v0, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:62)"

    const v1, -0xa6df1e8

    invoke-static {v1, p5, p6, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const/4 p6, 0x0

    int-to-float v0, p6

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p2, v0}, LY0/h;->h(FF)I

    move-result v0

    if-lez v0, :cond_c

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_3

    sget-object v0, Ldh/j;->a:Ldh/j;

    invoke-static {v0, p4}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v0

    new-instance v2, LT/A;

    invoke-direct {v2, v0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p4, v2}, LT/l;->K(Ljava/lang/Object;)V

    move-object v0, v2

    :cond_3
    check-cast v0, LT/A;

    invoke-virtual {v0}, LT/A;->a()LIi/N;

    move-result-object v0

    shr-int/lit8 v2, p5, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {p1, p4, v2}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object p1

    new-instance v2, Lkotlin/jvm/internal/K;

    invoke-direct {v2}, Lkotlin/jvm/internal/K;-><init>()V

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v4

    invoke-interface {p4, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LY0/d;

    invoke-interface {v4, p2}, LY0/d;->d1(F)F

    move-result p2

    iput p2, v2, Lkotlin/jvm/internal/K;->a:F

    invoke-interface {v4, p3}, LY0/d;->d1(F)F

    move-result p2

    iput p2, v3, Lkotlin/jvm/internal/K;->a:F

    invoke-interface {p4, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_4

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p3, p2, :cond_5

    :cond_4
    new-instance p3, LO/g;

    iget p2, v3, Lkotlin/jvm/internal/K;->a:F

    iget v4, v2, Lkotlin/jvm/internal/K;->a:F

    invoke-direct {p3, v0, p1, p2, v4}, LO/g;-><init>(LIi/N;LT/z1;FF)V

    invoke-interface {p4, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast p3, LO/g;

    invoke-interface {p4, p3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    and-int/lit8 p2, p5, 0xe

    xor-int/lit8 p2, p2, 0x6

    const/4 v0, 0x4

    if-le p2, v0, :cond_6

    invoke-interface {p4, p0}, LT/l;->c(Z)Z

    move-result p2

    if-nez p2, :cond_7

    :cond_6
    and-int/lit8 p2, p5, 0x6

    if-ne p2, v0, :cond_8

    :cond_7
    const/4 p2, 0x1

    goto :goto_0

    :cond_8
    move p2, p6

    :goto_0
    or-int/2addr p1, p2

    iget p2, v2, Lkotlin/jvm/internal/K;->a:F

    invoke-interface {p4, p2}, LT/l;->g(F)Z

    move-result p2

    or-int/2addr p1, p2

    iget p2, v3, Lkotlin/jvm/internal/K;->a:F

    invoke-interface {p4, p2}, LT/l;->g(F)Z

    move-result p2

    or-int/2addr p1, p2

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_9

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_a

    :cond_9
    new-instance p2, LO/h$a;

    invoke-direct {p2, p3, p0, v2, v3}, LO/h$a;-><init>(LO/g;ZLkotlin/jvm/internal/K;Lkotlin/jvm/internal/K;)V

    invoke-interface {p4, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast p2, Lmh/a;

    invoke-static {p2, p4, p6}, LT/O;->g(Lmh/a;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_b

    invoke-static {}, LT/o;->P()V

    :cond_b
    return-object p3

    :cond_c
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "The refresh trigger must be greater than zero!"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
