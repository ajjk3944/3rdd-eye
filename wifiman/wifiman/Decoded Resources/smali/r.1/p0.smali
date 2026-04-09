.class public abstract Lr/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lmh/l;

.field private static final b:LYg/m;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lr/p0$b;->a:Lr/p0$b;

    sput-object v0, Lr/p0;->a:Lmh/l;

    sget-object v0, LYg/q;->NONE:LYg/q;

    sget-object v1, Lr/p0$a;->a:Lr/p0$a;

    invoke-static {v0, v1}, LYg/n;->a(LYg/q;Lmh/a;)LYg/m;

    move-result-object v0

    sput-object v0, Lr/p0;->b:LYg/m;

    return-void
.end method

.method public static final synthetic a()Lmh/l;
    .locals 1

    sget-object v0, Lr/p0;->a:Lmh/l;

    return-object v0
.end method

.method public static final b(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;LT/l;I)Lr/o0;
    .locals 8

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1825)"

    const v2, -0xbd1ef36

    invoke-static {v2, p5, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, p5, 0xe

    xor-int/lit8 v0, v0, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x4

    if-le v0, v3, :cond_1

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    and-int/lit8 v4, p5, 0x6

    if-ne v4, v3, :cond_3

    :cond_2
    move v4, v1

    goto :goto_0

    :cond_3
    move v4, v2

    :goto_0
    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_4

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_5

    :cond_4
    new-instance v5, Lr/o0;

    new-instance v4, Lr/W;

    invoke-direct {v4, p1}, Lr/W;-><init>(Ljava/lang/Object;)V

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lr/o0;->k()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " > "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {v5, v4, p0, p3}, Lr/o0;-><init>(Lr/q0;Lr/o0;Ljava/lang/String;)V

    invoke-interface {p4, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lr/o0;

    if-le v0, v3, :cond_6

    invoke-interface {p4, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_8

    :cond_6
    and-int/lit8 p3, p5, 0x6

    if-ne p3, v3, :cond_7

    goto :goto_1

    :cond_7
    move v1, v2

    :cond_8
    :goto_1
    invoke-interface {p4, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    or-int/2addr p3, v1

    invoke-interface {p4}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    if-nez p3, :cond_9

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p5, p3, :cond_a

    :cond_9
    new-instance p5, Lr/p0$c;

    invoke-direct {p5, p0, v5}, Lr/p0$c;-><init>(Lr/o0;Lr/o0;)V

    invoke-interface {p4, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_a
    check-cast p5, Lmh/l;

    invoke-static {v5, p5, p4, v2}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-virtual {p0}, Lr/o0;->u()Z

    move-result p3

    if-eqz p3, :cond_b

    invoke-virtual {p0}, Lr/o0;->l()J

    move-result-wide p3

    invoke-virtual {v5, p1, p2, p3, p4}, Lr/o0;->G(Ljava/lang/Object;Ljava/lang/Object;J)V

    goto :goto_2

    :cond_b
    invoke-virtual {v5, p2}, Lr/o0;->R(Ljava/lang/Object;)V

    invoke-virtual {v5, v2}, Lr/o0;->K(Z)V

    :goto_2
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    return-object v5
.end method

.method public static final c(Lr/o0;Lr/s0;Ljava/lang/String;LT/l;II)Lr/o0$a;
    .locals 5

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    const-string p2, "DeferredAnimation"

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v0, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1779)"

    const v1, -0x662b6f20

    invoke-static {v1, p4, p5, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p5, p4, 0xe

    xor-int/lit8 p5, p5, 0x6

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x4

    if-le p5, v2, :cond_2

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    and-int/lit8 v3, p4, 0x6

    if-ne v3, v2, :cond_4

    :cond_3
    move v3, v0

    goto :goto_0

    :cond_4
    move v3, v1

    :goto_0
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v4, v3, :cond_6

    :cond_5
    new-instance v4, Lr/o0$a;

    invoke-direct {v4, p0, p1, p2}, Lr/o0$a;-><init>(Lr/o0;Lr/s0;Ljava/lang/String;)V

    invoke-interface {p3, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lr/o0$a;

    if-le p5, v2, :cond_7

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    :cond_7
    and-int/lit8 p1, p4, 0x6

    if-ne p1, v2, :cond_8

    goto :goto_1

    :cond_8
    move v0, v1

    :cond_9
    :goto_1
    invoke-interface {p3, v4}, LT/l;->l(Ljava/lang/Object;)Z

    move-result p1

    or-int/2addr p1, v0

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_a

    sget-object p1, LT/l;->a:LT/l$a;

    invoke-virtual {p1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_b

    :cond_a
    new-instance p2, Lr/p0$d;

    invoke-direct {p2, p0, v4}, Lr/p0$d;-><init>(Lr/o0;Lr/o0$a;)V

    invoke-interface {p3, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p2, Lmh/l;

    invoke-static {v4, p2, p3, v1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-virtual {p0}, Lr/o0;->u()Z

    move-result p0

    if-eqz p0, :cond_c

    invoke-virtual {v4}, Lr/o0$a;->d()V

    :cond_c
    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_d

    invoke-static {}, LT/o;->P()V

    :cond_d
    return-object v4
.end method

.method public static final d(Lr/o0;Ljava/lang/Object;Ljava/lang/Object;Lr/H;Lr/s0;Ljava/lang/String;LT/l;I)LT/z1;
    .locals 16

    move-object/from16 v6, p0

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p6

    move/from16 v10, p7

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    const-string v1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1900)"

    const v2, -0x122b33ce

    invoke-static {v2, v10, v0, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v0, v10, 0xe

    xor-int/lit8 v11, v0, 0x6

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x4

    if-le v11, v14, :cond_1

    invoke-interface {v9, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    and-int/lit8 v0, v10, 0x6

    if-ne v0, v14, :cond_3

    :cond_2
    move v0, v12

    goto :goto_0

    :cond_3
    move v0, v13

    :goto_0
    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v1, v0, :cond_5

    :cond_4
    new-instance v15, Lr/o0$d;

    move-object/from16 v4, p4

    invoke-static {v4, v7}, Lr/l;->i(Lr/s0;Ljava/lang/Object;)Lr/q;

    move-result-object v3

    move-object v0, v15

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lr/o0$d;-><init>(Lr/o0;Ljava/lang/Object;Lr/q;Lr/s0;Ljava/lang/String;)V

    invoke-interface {v9, v15}, LT/l;->K(Ljava/lang/Object;)V

    move-object v1, v15

    :cond_5
    check-cast v1, Lr/o0$d;

    invoke-virtual/range {p0 .. p0}, Lr/o0;->u()Z

    move-result v0

    if-eqz v0, :cond_6

    move-object/from16 v0, p1

    invoke-virtual {v1, v0, v7, v8}, Lr/o0$d;->I(Ljava/lang/Object;Ljava/lang/Object;Lr/H;)V

    goto :goto_1

    :cond_6
    invoke-virtual {v1, v7, v8}, Lr/o0$d;->K(Ljava/lang/Object;Lr/H;)V

    :goto_1
    if-le v11, v14, :cond_7

    invoke-interface {v9, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_7
    and-int/lit8 v0, v10, 0x6

    if-ne v0, v14, :cond_8

    goto :goto_2

    :cond_8
    move v12, v13

    :cond_9
    :goto_2
    invoke-interface {v9, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v12

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_a

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_b

    :cond_a
    new-instance v2, Lr/p0$e;

    invoke-direct {v2, v6, v1}, Lr/p0$e;-><init>(Lr/o0;Lr/o0$d;)V

    invoke-interface {v9, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lmh/l;

    invoke-static {v1, v2, v9, v13}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LT/o;->P()V

    :cond_c
    return-object v1
.end method

.method public static final e()Landroidx/compose/runtime/snapshots/l;
    .locals 1

    sget-object v0, Lr/p0;->b:LYg/m;

    invoke-interface {v0}, LYg/m;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/snapshots/l;

    return-object v0
.end method

.method public static final f(Lr/q0;Ljava/lang/String;LT/l;II)Lr/o0;
    .locals 6

    and-int/lit8 p4, p4, 0x2

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "androidx.compose.animation.core.rememberTransition (Transition.kt:820)"

    const v2, 0x61f14c21

    invoke-static {v2, p3, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    and-int/lit8 p4, p3, 0xe

    xor-int/lit8 p4, p4, 0x6

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le p4, v2, :cond_2

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    and-int/lit8 v4, p3, 0x6

    if-ne v4, v2, :cond_4

    :cond_3
    move v4, v1

    goto :goto_0

    :cond_4
    move v4, v3

    :goto_0
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v5, v4, :cond_6

    :cond_5
    new-instance v5, Lr/o0;

    invoke-direct {v5, p0, p1}, Lr/o0;-><init>(Lr/q0;Ljava/lang/String;)V

    invoke-interface {p2, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lr/o0;

    instance-of p1, p0, Lr/c0;

    if-eqz p1, :cond_c

    const p1, 0x3d6add44

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-virtual {p0}, Lr/q0;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lr/q0;->b()Ljava/lang/Object;

    move-result-object v4

    if-le p4, v2, :cond_7

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_9

    :cond_7
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v2, :cond_8

    goto :goto_1

    :cond_8
    move v1, v3

    :cond_9
    :goto_1
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    if-nez v1, :cond_a

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p3, p4, :cond_b

    :cond_a
    new-instance p3, Lr/p0$f;

    invoke-direct {p3, p0, v0}, Lr/p0$f;-><init>(Lr/q0;Ldh/e;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_b
    check-cast p3, Lmh/p;

    invoke-static {p1, v4, p3, p2, v3}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    goto :goto_2

    :cond_c
    const p1, 0x3d71e83b

    invoke-interface {p2, p1}, LT/l;->U(I)V

    invoke-virtual {p0}, Lr/q0;->b()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v5, p0, p2, v3}, Lr/o0;->e(Ljava/lang/Object;LT/l;I)V

    invoke-interface {p2}, LT/l;->J()V

    :goto_2
    invoke-interface {p2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p0

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_d

    sget-object p0, LT/l;->a:LT/l$a;

    invoke-virtual {p0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p0

    if-ne p1, p0, :cond_e

    :cond_d
    new-instance p1, Lr/p0$g;

    invoke-direct {p1, v5}, Lr/p0$g;-><init>(Lr/o0;)V

    invoke-interface {p2, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast p1, Lmh/l;

    invoke-static {v5, p1, p2, v3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    return-object v5
.end method

.method public static final g(Ljava/lang/Object;Ljava/lang/String;LT/l;II)Lr/o0;
    .locals 2

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v0, "androidx.compose.animation.core.updateTransition (Transition.kt:91)"

    const v1, 0x78f2a0ad

    invoke-static {v1, p3, p4, v0}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p4

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne p4, v1, :cond_2

    new-instance p4, Lr/o0;

    invoke-direct {p4, p0, p1}, Lr/o0;-><init>(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p4, Lr/o0;

    and-int/lit8 p1, p3, 0x8

    or-int/lit8 p1, p1, 0x30

    and-int/lit8 p3, p3, 0xe

    or-int/2addr p1, p3

    invoke-virtual {p4, p0, p2, p1}, Lr/o0;->e(Ljava/lang/Object;LT/l;I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_3

    new-instance p0, Lr/p0$h;

    invoke-direct {p0, p4}, Lr/p0$h;-><init>(Lr/o0;)V

    invoke-interface {p2, p0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p0, Lmh/l;

    const/16 p1, 0x36

    invoke-static {p4, p0, p2, p1}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-static {}, LT/o;->P()V

    :cond_4
    return-object p4
.end method
