.class public abstract Ld/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(ZLmh/a;LT/l;II)V
    .locals 7

    const v0, -0x158b58d6

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

    const-string v5, "androidx.activity.compose.BackHandler (BackHandler.kt:81)"

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

    new-instance v1, Ld/a$d;

    invoke-direct {v1, p0, v0}, Ld/a$d;-><init>(ZLT/z1;)V

    invoke-interface {p2, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast v1, Ld/a$d;

    and-int/lit8 v0, v3, 0xe

    const/4 v3, 0x0

    if-ne v0, v2, :cond_b

    goto :goto_5

    :cond_b
    move v4, v3

    :goto_5
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_c

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_d

    :cond_c
    new-instance v0, Ld/a$a;

    invoke-direct {v0, v1, p0}, Ld/a$a;-><init>(Ld/a$d;Z)V

    invoke-interface {p2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v0, Lmh/a;

    invoke-static {v0, p2, v3}, LT/O;->g(Lmh/a;LT/l;I)V

    sget-object v0, Ld/d;->a:Ld/d;

    const/4 v2, 0x6

    invoke-virtual {v0, p2, v2}, Ld/d;->a(LT/l;I)Lc/J;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-interface {v0}, Lc/J;->b()Lc/G;

    move-result-object v0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/lifecycle/o;

    invoke-interface {p2, v0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p2, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_e

    invoke-virtual {v5}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_f

    :cond_e
    new-instance v6, Ld/a$b;

    invoke-direct {v6, v0, v2, v1}, Ld/a$b;-><init>(Lc/G;Landroidx/lifecycle/o;Ld/a$d;)V

    invoke-interface {p2, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lmh/l;

    invoke-static {v2, v0, v6, p2, v3}, LT/O;->b(Ljava/lang/Object;Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-static {}, LT/o;->P()V

    :cond_10
    :goto_6
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_11

    new-instance v0, Ld/a$c;

    invoke-direct {v0, p0, p1, p3, p4}, Ld/a$c;-><init>(ZLmh/a;II)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_11
    return-void

    :cond_12
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final b(LT/z1;)Lmh/a;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh/a;

    return-object p0
.end method

.method public static final synthetic c(LT/z1;)Lmh/a;
    .locals 0

    invoke-static {p0}, Ld/a;->b(LT/z1;)Lmh/a;

    move-result-object p0

    return-object p0
.end method
