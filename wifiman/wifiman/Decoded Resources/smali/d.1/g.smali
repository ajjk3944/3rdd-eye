.class public abstract Ld/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLmh/p;LT/l;II)V
    .locals 9

    const v0, -0x264426c9

    invoke-interface {p2, v0}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    invoke-interface {p2, p0}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, p3

    goto :goto_1

    :cond_2
    move v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    invoke-interface {p2, p1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_5
    :goto_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    if-ne v4, v5, :cond_7

    invoke-interface {p2}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    const/4 v4, 0x1

    if-eqz v1, :cond_8

    move p0, v4

    :cond_8
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_9

    const/4 v1, -0x1

    const-string v5, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)"

    invoke-static {v0, v3, v1, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_9
    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v0, v0, 0xe

    invoke-static {p1, p2, v0}, LT/o1;->n(Ljava/lang/Object;LT/l;I)LT/z1;

    move-result-object v0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, LT/l;->a:LT/l$a;

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v1, v6, :cond_a

    sget-object v1, Ldh/j;->a:Ldh/j;

    invoke-static {v1, p2}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v1

    new-instance v6, LT/A;

    invoke-direct {v6, v1}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v6

    :cond_a
    check-cast v1, LT/A;

    invoke-virtual {v1}, LT/A;->a()LIi/N;

    move-result-object v1

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v6, v7, :cond_b

    new-instance v6, Ld/f;

    invoke-static {v0}, Ld/g;->b(LT/z1;)Lmh/p;

    move-result-object v7

    invoke-direct {v6, p0, v1, v7}, Ld/f;-><init>(ZLIi/N;Lmh/p;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Ld/f;

    invoke-static {v0}, Ld/g;->b(LT/z1;)Lmh/p;

    move-result-object v7

    invoke-interface {p2, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    invoke-interface {p2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_c

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_d

    :cond_c
    invoke-static {v0}, Ld/g;->b(LT/z1;)Lmh/p;

    move-result-object v0

    invoke-virtual {v6, v0}, Ld/f;->l(Lmh/p;)V

    invoke-virtual {v6, v1}, Ld/f;->n(LIi/N;)V

    sget-object v0, LYg/J;->a:LYg/J;

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p2, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit8 v3, v3, 0xe

    const/4 v7, 0x0

    if-ne v3, v2, :cond_e

    goto :goto_5

    :cond_e
    move v4, v7

    :goto_5
    or-int/2addr v1, v4

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_f

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_10

    :cond_f
    new-instance v2, Ld/g$a;

    const/4 v1, 0x0

    invoke-direct {v2, v6, p0, v1}, Ld/g$a;-><init>(Ld/f;ZLdh/e;)V

    invoke-interface {p2, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lmh/p;

    invoke-static {v0, v2, p2, v3}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v0, Ld/d;->a:Ld/d;

    const/4 v1, 0x6

    invoke-virtual {v0, p2, v1}, Ld/d;->a(LT/l;I)Lc/J;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-interface {v0}, Lc/J;->b()Lc/G;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v1

    invoke-interface {p2, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/lifecycle/o;

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    invoke-interface {p2, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2, v6}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v3, v2, :cond_12

    :cond_11
    new-instance v3, Ld/g$b;

    invoke-direct {v3, v0, v1, v6}, Ld/g$b;-><init>(Lc/G;Landroidx/lifecycle/o;Ld/f;)V

    invoke-interface {p2, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_12
    check-cast v3, Lmh/l;

    invoke-static {v1, v0, v3, p2, v7}, LT/O;->b(Ljava/lang/Object;Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_6
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_14

    new-instance v0, Ld/g$c;

    invoke-direct {v0, p0, p1, p3, p4}, Ld/g$c;-><init>(ZLmh/p;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void

    :cond_15
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final b(LT/z1;)Lmh/p;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/p;

    return-object p0
.end method
