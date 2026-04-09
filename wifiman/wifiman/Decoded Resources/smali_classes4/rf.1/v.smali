.class public abstract Lrf/v;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrf/v$f;
    }
.end annotation


# static fields
.field private static final a:Lr/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lr/r0;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/16 v1, 0x64

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lr/r0;-><init>(IILr/E;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lrf/v;->a:Lr/r0;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;LT/L;)LT/K;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrf/v;->y(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;LT/L;)LT/K;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0}, Lrf/v;->x(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Z)LYg/J;
    .locals 0

    invoke-static {p0}, Lrf/v;->t(Z)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/animation/d;)Lq/i;
    .locals 0

    invoke-static {p0}, Lrf/v;->l(Landroidx/compose/animation/d;)Lq/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LT/z1;LY0/d;)LY0/n;
    .locals 0

    invoke-static {p0, p1}, Lrf/v;->r(LT/z1;LY0/d;)LY0/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lrf/v;->q(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LIi/N;LN/R0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lrf/v;->o(LIi/N;LN/R0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/e;Ls9/d;Lrf/b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrf/v;->m(Landroidx/compose/ui/e;Ls9/d;Lrf/b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Lrf/v;->u(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(LIi/N;LN/R0;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, Lrf/v;->p(LIi/N;LN/R0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/e;Ls9/d;Lrf/b;LT/l;I)V
    .locals 11

    const v0, -0x3f6e6eb

    invoke-interface {p3, v0}, LT/l;->r(I)LT/l;

    move-result-object p3

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x30

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x180

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v1, 0x93

    const/16 v3, 0x92

    if-ne v2, v3, :cond_7

    invoke-interface {p3}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LT/l;->C()V

    goto :goto_5

    :cond_7
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.teleport.component.SwitchButton (TeleportTunnelSwitch.kt:232)"

    invoke-static {v0, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_8
    const v0, 0x38d6a439

    invoke-interface {p3, v0}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_9

    new-instance v0, Lrf/r;

    invoke-direct {v0}, Lrf/r;-><init>()V

    invoke-interface {p3, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    move-object v3, v0

    check-cast v3, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    new-instance v0, Lrf/v$a;

    invoke-direct {v0, p1}, Lrf/v$a;-><init>(Ls9/d;)V

    const/16 v2, 0x36

    const v4, 0x26ee98b3

    const/4 v5, 0x1

    invoke-static {v4, v5, v0, p3, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    shr-int/lit8 v0, v1, 0x6

    and-int/lit8 v0, v0, 0xe

    const v2, 0x186180

    or-int/2addr v0, v2

    shl-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v9, v0, v1

    const/16 v10, 0x28

    const/4 v4, 0x0

    const-string v5, "teleport switch"

    const/4 v6, 0x0

    move-object v1, p2

    move-object v2, p0

    move-object v8, p3

    invoke-static/range {v1 .. v10}, Landroidx/compose/animation/a;->a(Ljava/lang/Object;Landroidx/compose/ui/e;Lmh/l;Lf0/c;Ljava/lang/String;Lmh/l;Lmh/r;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p3}, LT/l;->z()LT/X0;

    move-result-object p3

    if-eqz p3, :cond_b

    new-instance v0, Lrf/s;

    invoke-direct {v0, p0, p1, p2, p4}, Lrf/s;-><init>(Landroidx/compose/ui/e;Ls9/d;Lrf/b;I)V

    invoke-interface {p3, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void
.end method

.method private static final l(Landroidx/compose/animation/d;)Lq/i;
    .locals 6

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x6

    const/16 v0, 0x190

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2, p0, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v3, 0x2

    invoke-static {p0, v1, v3, v2}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object p0

    const/16 v4, 0xc8

    const/4 v5, 0x4

    invoke-static {v0, v4, v2, v5, v2}, Lr/j;->l(IILr/E;ILjava/lang/Object;)Lr/r0;

    move-result-object v0

    invoke-static {v0, v1, v3, v2}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/animation/a;->e(Landroidx/compose/animation/i;Landroidx/compose/animation/k;)Lq/i;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/e;Ls9/d;Lrf/b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, LT/L0;->a(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lrf/v;->k(Landroidx/compose/ui/e;Ls9/d;Lrf/b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final n(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    const v0, 0x7d59e8f7

    move-object/from16 v10, p8

    invoke-interface {v10, v0}, LT/l;->r(I)LT/l;

    move-result-object v10

    and-int/lit8 v11, v9, 0x6

    if-nez v11, :cond_1

    invoke-interface {v10, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x4

    goto :goto_0

    :cond_0
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v11, v9

    goto :goto_1

    :cond_1
    move v11, v9

    :goto_1
    and-int/lit8 v13, v9, 0x30

    if-nez v13, :cond_3

    invoke-interface {v10, v2}, LT/l;->g(F)Z

    move-result v13

    if-eqz v13, :cond_2

    const/16 v13, 0x20

    goto :goto_2

    :cond_2
    const/16 v13, 0x10

    :goto_2
    or-int/2addr v11, v13

    :cond_3
    and-int/lit16 v13, v9, 0x180

    if-nez v13, :cond_5

    invoke-interface {v10, v3}, LT/l;->g(F)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v11, v13

    :cond_5
    and-int/lit16 v13, v9, 0xc00

    if-nez v13, :cond_7

    invoke-interface {v10, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    const/16 v13, 0x800

    goto :goto_4

    :cond_6
    const/16 v13, 0x400

    :goto_4
    or-int/2addr v11, v13

    :cond_7
    and-int/lit16 v13, v9, 0x6000

    if-nez v13, :cond_9

    invoke-interface {v10, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x4000

    goto :goto_5

    :cond_8
    const/16 v13, 0x2000

    :goto_5
    or-int/2addr v11, v13

    :cond_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v9

    if-nez v13, :cond_b

    invoke-interface {v10, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_a

    const/high16 v13, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v13, 0x10000

    :goto_6
    or-int/2addr v11, v13

    :cond_b
    const/high16 v13, 0x180000

    and-int/2addr v13, v9

    if-nez v13, :cond_d

    invoke-interface {v10, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/high16 v13, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v13, 0x80000

    :goto_7
    or-int/2addr v11, v13

    :cond_d
    const/high16 v13, 0xc00000

    and-int/2addr v13, v9

    const/high16 v12, 0x800000

    if-nez v13, :cond_f

    invoke-interface {v10, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    move v13, v12

    goto :goto_8

    :cond_e
    const/high16 v13, 0x400000

    :goto_8
    or-int/2addr v11, v13

    :cond_f
    const v13, 0x492493

    and-int/2addr v13, v11

    const v15, 0x492492

    if-ne v13, v15, :cond_11

    invoke-interface {v10}, LT/l;->v()Z

    move-result v13

    if-nez v13, :cond_10

    goto :goto_9

    :cond_10
    invoke-interface {v10}, LT/l;->C()V

    move-object v6, v5

    move-object v15, v7

    goto/16 :goto_16

    :cond_11
    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v13

    if-eqz v13, :cond_12

    const/4 v13, -0x1

    const-string v15, "com.ui.wifiman.ui.teleport.component.SwitchImpl (TeleportTunnelSwitch.kt:132)"

    invoke-static {v0, v11, v13, v15}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    const v0, 0x230232f2

    invoke-interface {v10, v0}, LT/l;->U(I)V

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v0, v15, :cond_13

    invoke-static {}, LT/o1;->f()Landroidx/compose/runtime/snapshots/k;

    move-result-object v0

    invoke-interface {v10, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_13
    check-cast v0, Landroidx/compose/runtime/snapshots/k;

    invoke-interface {v10}, LT/l;->J()V

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v15

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v14

    if-ne v15, v14, :cond_14

    sget-object v14, Ldh/j;->a:Ldh/j;

    invoke-static {v14, v10}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object v14

    new-instance v15, LT/A;

    invoke-direct {v15, v14}, LT/A;-><init>(LIi/N;)V

    invoke-interface {v10, v15}, LT/l;->K(Ljava/lang/Object;)V

    :cond_14
    check-cast v15, LT/A;

    invoke-virtual {v15}, LT/A;->a()LIi/N;

    move-result-object v14

    const v15, 0x2302462a

    invoke-interface {v10, v15}, LT/l;->U(I)V

    const/high16 v15, 0x1c00000

    and-int/2addr v15, v11

    if-ne v15, v12, :cond_15

    const/4 v12, 0x1

    goto :goto_a

    :cond_15
    const/4 v12, 0x0

    :goto_a
    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_16

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v12

    if-ne v15, v12, :cond_17

    :cond_16
    new-instance v15, Lrf/v$b;

    const/4 v12, 0x0

    invoke-direct {v15, v8, v0, v12}, Lrf/v$b;-><init>(Ly/k;Landroidx/compose/runtime/snapshots/k;Ldh/e;)V

    invoke-interface {v10, v15}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v15, Lmh/p;

    invoke-interface {v10}, LT/l;->J()V

    shr-int/lit8 v0, v11, 0x15

    and-int/lit8 v0, v0, 0xe

    invoke-static {v8, v15, v10, v0}, LT/O;->f(Ljava/lang/Object;Lmh/p;LT/l;I)V

    const/16 v0, 0x20

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    sget-object v12, Lla/a;->a:Lla/a;

    sget v15, Lla/a;->b:I

    invoke-virtual {v12, v10, v15}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v12

    const v15, 0x23029e71

    invoke-interface {v10, v15}, LT/l;->U(I)V

    invoke-interface {v10, v12}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v15

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    if-nez v15, :cond_18

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v9, v15, :cond_1a

    :cond_18
    instance-of v9, v12, Lma/a$d;

    if-eqz v9, :cond_19

    check-cast v12, Lma/a$d;

    invoke-virtual {v12}, Lma/a$d;->e()Lma/a$e;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$e;->b()J

    move-result-wide v17

    goto :goto_b

    :cond_19
    instance-of v9, v12, Lma/a$b;

    if-eqz v9, :cond_33

    check-cast v12, Lma/a$b;

    invoke-virtual {v12}, Lma/a$b;->a()Lma/a$a;

    move-result-object v9

    invoke-virtual {v9}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v9

    invoke-virtual {v9}, Lr9/a$b;->b()J

    move-result-wide v17

    :goto_b
    invoke-static/range {v17 .. v18}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v9

    invoke-interface {v10, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1a
    check-cast v9, Lm0/v0;

    invoke-virtual {v9}, Lm0/v0;->u()J

    move-result-wide v4

    invoke-interface {v10}, LT/l;->J()V

    sget-object v9, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v12, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v12}, Lf0/c$a;->h()Lf0/c;

    move-result-object v15

    invoke-interface {v1, v9, v15}, Lz/d;->f(Landroidx/compose/ui/e;Lf0/c;)Landroidx/compose/ui/e;

    move-result-object v15

    const v1, 0x2302c3fd

    invoke-interface {v10, v1}, LT/l;->U(I)V

    const/high16 v1, 0x70000

    and-int/2addr v1, v11

    const/high16 v7, 0x20000

    if-ne v1, v7, :cond_1b

    const/4 v1, 0x1

    goto :goto_c

    :cond_1b
    const/4 v1, 0x0

    :goto_c
    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_1c

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v7, v1, :cond_1d

    :cond_1c
    new-instance v7, Lrf/n;

    invoke-direct {v7, v6}, Lrf/n;-><init>(LT/z1;)V

    invoke-interface {v10, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    check-cast v7, Lmh/l;

    invoke-interface {v10}, LT/l;->J()V

    invoke-static {v15, v7}, Landroidx/compose/foundation/layout/l;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object v1

    const/16 v21, 0x4

    const/16 v22, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    move/from16 v18, v0

    invoke-static/range {v17 .. v22}, LQ/o;->c(ZFJILjava/lang/Object;)Ls/I;

    move-result-object v7

    invoke-static {v1, v8, v7}, Landroidx/compose/foundation/j;->b(Landroidx/compose/ui/e;Ly/k;Ls/G;)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v7, 0x2

    int-to-float v15, v7

    div-float v7, v2, v15

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-static {v1, v7, v3}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    const/4 v7, 0x3

    int-to-float v15, v7

    invoke-static {v15}, LY0/h;->j(F)F

    move-result v15

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/o;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v17

    const/4 v1, 0x5

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v18

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v19

    const/16 v25, 0x18

    const/16 v26, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const-wide/16 v23, 0x0

    invoke-static/range {v17 .. v26}, Lj0/k;->b(Landroidx/compose/ui/e;FLm0/i1;ZJJILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    invoke-static {v1, v4, v5, v0}, Landroidx/compose/foundation/b;->c(Landroidx/compose/ui/e;JLm0/i1;)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v10, v1}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-virtual/range {p6 .. p6}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual/range {p6 .. p6}, LN/R0;->u()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eq v0, v1, :cond_1e

    sget-object v0, Lrf/c;->SWIPING:Lrf/c;

    goto :goto_d

    :cond_1e
    invoke-virtual/range {p6 .. p6}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Lrf/c;->ENABLED:Lrf/c;

    goto :goto_d

    :cond_1f
    sget-object v0, Lrf/c;->DISABLED:Lrf/c;

    :goto_d
    invoke-static {v9, v2, v3}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v12}, Lf0/c$a;->i()Lf0/c$c;

    move-result-object v4

    sget-object v5, Lz/c;->a:Lz/c;

    invoke-virtual {v5}, Lz/c;->f()Lz/c$e;

    move-result-object v5

    const/16 v12, 0x30

    invoke-static {v5, v4, v10, v12}, Lz/W;->b(Lz/c$e;Lf0/c$c;LT/l;I)LC0/C;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v10, v5}, LT/j;->a(LT/l;I)I

    move-result v12

    invoke-interface {v10}, LT/l;->G()LT/x;

    move-result-object v15

    invoke-static {v10, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v16, LE0/g;->K:LE0/g$a;

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->a()Lmh/a;

    move-result-object v5

    invoke-interface {v10}, LT/l;->x()LT/f;

    move-result-object v17

    if-nez v17, :cond_20

    invoke-static {}, LT/j;->c()V

    :cond_20
    invoke-interface {v10}, LT/l;->u()V

    invoke-interface {v10}, LT/l;->o()Z

    move-result v17

    if-eqz v17, :cond_21

    invoke-interface {v10, v5}, LT/l;->D(Lmh/a;)V

    goto :goto_e

    :cond_21
    invoke-interface {v10}, LT/l;->I()V

    :goto_e
    invoke-static {v10}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v5

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->e()Lmh/p;

    move-result-object v7

    invoke-static {v5, v4, v7}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v5, v15, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual/range {v16 .. v16}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v5}, LT/l;->o()Z

    move-result v7

    if-nez v7, :cond_22

    invoke-interface {v5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_23

    :cond_22
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v5, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_23
    invoke-virtual/range {v16 .. v16}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v5, v1, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Lz/Z;->a:Lz/Z;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x1

    invoke-interface {v1, v9, v4, v5}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v18

    const v5, -0x18f2dbb6

    invoke-interface {v10, v5}, LT/l;->U(I)V

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v5, v7, :cond_24

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v5

    invoke-interface {v10, v5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_24
    move-object/from16 v19, v5

    check-cast v19, Ly/m;

    invoke-interface {v10}, LT/l;->J()V

    const v5, -0x18f2cde0

    invoke-interface {v10, v5}, LT/l;->U(I)V

    invoke-interface {v10, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    const/high16 v7, 0x380000

    and-int/2addr v7, v11

    const/high16 v12, 0x100000

    if-ne v7, v12, :cond_25

    const/4 v12, 0x1

    goto :goto_f

    :cond_25
    const/4 v12, 0x0

    :goto_f
    or-int/2addr v5, v12

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v5, :cond_27

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v5

    if-ne v12, v5, :cond_26

    goto :goto_10

    :cond_26
    move-object/from16 v15, p6

    goto :goto_11

    :cond_27
    :goto_10
    new-instance v12, Lrf/o;

    move-object/from16 v15, p6

    invoke-direct {v12, v14, v15}, Lrf/o;-><init>(LIi/N;LN/R0;)V

    invoke-interface {v10, v12}, LT/l;->K(Ljava/lang/Object;)V

    :goto_11
    move-object/from16 v24, v12

    check-cast v24, Lmh/a;

    invoke-interface {v10}, LT/l;->J()V

    const/16 v25, 0x1c

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v18 .. v26}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v5

    sget-object v12, Lrf/v$f;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v16

    aget v4, v12, v16

    const/4 v2, 0x1

    if-eq v4, v2, :cond_29

    const/4 v2, 0x2

    if-eq v4, v2, :cond_29

    const/4 v2, 0x3

    if-ne v4, v2, :cond_28

    sget-object v2, Lrf/b;->DISABLED:Lrf/b;

    goto :goto_12

    :cond_28
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_29
    sget-object v2, Lrf/b;->IDLE:Lrf/b;

    :goto_12
    shr-int/lit8 v4, v11, 0x9

    and-int/lit8 v4, v4, 0x70

    move-object/from16 v6, p4

    invoke-static {v5, v6, v2, v10, v4}, Lrf/v;->k(Landroidx/compose/ui/e;Ls9/d;Lrf/b;LT/l;I)V

    const/4 v2, 0x1

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-interface {v1, v9, v4, v2}, Lz/Y;->a(Landroidx/compose/ui/e;FZ)Landroidx/compose/ui/e;

    move-result-object v18

    const v1, -0x18f28d96

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v1, v2, :cond_2a

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v1

    invoke-interface {v10, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2a
    move-object/from16 v19, v1

    check-cast v19, Ly/m;

    invoke-interface {v10}, LT/l;->J()V

    const v1, -0x18f27fc1

    invoke-interface {v10, v1}, LT/l;->U(I)V

    invoke-interface {v10, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x100000

    if-ne v7, v2, :cond_2b

    const/4 v9, 0x1

    goto :goto_13

    :cond_2b
    const/4 v9, 0x0

    :goto_13
    or-int/2addr v1, v9

    invoke-interface {v10}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2c

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_2d

    :cond_2c
    new-instance v2, Lrf/p;

    invoke-direct {v2, v14, v15}, Lrf/p;-><init>(LIi/N;LN/R0;)V

    invoke-interface {v10, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2d
    move-object/from16 v24, v2

    check-cast v24, Lmh/a;

    invoke-interface {v10}, LT/l;->J()V

    const/16 v25, 0x1c

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v18 .. v26}, Landroidx/compose/foundation/d;->b(Landroidx/compose/ui/e;Ly/m;Ls/G;ZLjava/lang/String;LJ0/g;Lmh/a;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v12, v0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_30

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2f

    const/4 v2, 0x3

    if-ne v0, v2, :cond_2e

    goto :goto_14

    :cond_2e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2f
    :goto_14
    sget-object v0, Lrf/b;->IDLE:Lrf/b;

    goto :goto_15

    :cond_30
    sget-object v0, Lrf/b;->ENABLED:Lrf/b;

    :goto_15
    shr-int/lit8 v2, v11, 0x6

    and-int/lit8 v2, v2, 0x70

    move-object/from16 v4, p3

    invoke-static {v1, v4, v0, v10, v2}, Lrf/v;->k(Landroidx/compose/ui/e;Ls9/d;Lrf/b;LT/l;I)V

    invoke-interface {v10}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_31

    invoke-static {}, LT/o;->P()V

    :cond_31
    :goto_16
    invoke-interface {v10}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_32

    new-instance v11, Lrf/q;

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lrf/q;-><init>(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;I)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_32
    return-void

    :cond_33
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final o(LIi/N;LN/R0;)LYg/J;
    .locals 6

    new-instance v3, Lrf/v$c;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lrf/v$c;-><init>(LN/R0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p(LIi/N;LN/R0;)LYg/J;
    .locals 6

    new-instance v3, Lrf/v$d;

    const/4 v0, 0x0

    invoke-direct {v3, p1, v0}, Lrf/v$d;-><init>(LN/R0;Ldh/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final q(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;ILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-static/range {v1 .. v10}, Lrf/v;->n(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final r(LT/z1;LY0/d;)LY0/n;
    .locals 1

    const-string v0, "$this$offset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Loh/b;->e(F)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p0, p1}, LY0/o;->a(II)J

    move-result-wide p0

    invoke-static {p0, p1}, LY0/n;->b(J)LY0/n;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;LT/l;I)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v9, p2

    move-object/from16 v10, p3

    move-object/from16 v11, p4

    move/from16 v12, p6

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabledText"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "disabledText"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6e3918a6

    move-object/from16 v2, p5

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v13

    and-int/lit8 v2, v12, 0x6

    if-nez v2, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v3, v12, 0x30

    const/16 v8, 0x20

    move/from16 v14, p1

    if-nez v3, :cond_3

    invoke-interface {v13, v14}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v8

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v12, 0x180

    if-nez v3, :cond_5

    invoke-interface {v13, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v12, 0xc00

    if-nez v3, :cond_7

    invoke-interface {v13, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v12, 0x6000

    if-nez v3, :cond_9

    invoke-interface {v13, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    and-int/lit16 v3, v2, 0x2493

    const/16 v4, 0x2492

    if-ne v3, v4, :cond_b

    invoke-interface {v13}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v13}, LT/l;->C()V

    goto/16 :goto_9

    :cond_b
    :goto_6
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_c

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.teleport.component.TeleportTunnelSwitch (TeleportTunnelSwitch.kt:81)"

    invoke-static {v0, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_c
    invoke-static/range {p1 .. p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v3, -0xf0f4bd4

    invoke-interface {v13, v3}, LT/l;->U(I)V

    if-nez v11, :cond_e

    const v3, -0xf0f4987

    invoke-interface {v13, v3}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v3, v4, :cond_d

    new-instance v3, Lrf/t;

    invoke-direct {v3}, Lrf/t;-><init>()V

    invoke-interface {v13, v3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v3, Lmh/l;

    invoke-interface {v13}, LT/l;->J()V

    goto :goto_7

    :cond_e
    move-object v3, v11

    :goto_7
    invoke-interface {v13}, LT/l;->J()V

    sget-object v4, Lrf/v;->a:Lr/r0;

    shr-int/lit8 v2, v2, 0x3

    and-int/lit8 v2, v2, 0xe

    or-int/lit16 v6, v2, 0x180

    const/4 v7, 0x0

    move-object v2, v0

    move-object v5, v13

    invoke-static/range {v2 .. v7}, Lrf/v;->w(Ljava/lang/Object;Lmh/l;Lr/i;LT/l;II)LN/R0;

    move-result-object v4

    invoke-static {}, Landroidx/compose/ui/platform/k0;->m()LT/H0;

    move-result-object v0

    invoke-interface {v13, v0}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LY0/t;->Rtl:LY0/t;

    const/4 v15, 0x1

    if-ne v0, v2, :cond_f

    move v5, v15

    goto :goto_8

    :cond_f
    const/4 v0, 0x0

    move v5, v0

    :goto_8
    const v0, -0xf0f3b02

    invoke-interface {v13, v0}, LT/l;->U(I)V

    invoke-interface {v13}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_10

    invoke-static {}, Ly/l;->a()Ly/m;

    move-result-object v0

    invoke-interface {v13, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    move-object v6, v0

    check-cast v6, Ly/m;

    invoke-interface {v13}, LT/l;->J()V

    int-to-float v0, v8

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    invoke-static {v1, v0}, Lj0/e;->a(Landroidx/compose/ui/e;Lm0/i1;)Landroidx/compose/ui/e;

    move-result-object v16

    sget-object v0, Lla/a;->a:Lla/a;

    sget v2, Lla/a;->b:I

    invoke-virtual {v0, v13, v2}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a;->a()Lma/a$a;

    move-result-object v0

    invoke-virtual {v0}, Lma/a$a;->g()Lr9/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lr9/a$b;->f()J

    move-result-wide v17

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/b;->d(Landroidx/compose/ui/e;JLm0/i1;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v0

    const/16 v2, 0xe6

    int-to-float v2, v2

    invoke-static {v2}, LY0/h;->j(F)F

    move-result v2

    const/16 v3, 0x2a

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    invoke-static {v0, v2, v3}, Landroidx/compose/foundation/layout/r;->w(Landroidx/compose/ui/e;FF)Landroidx/compose/ui/e;

    move-result-object v0

    new-instance v8, Lrf/v$e;

    move-object v2, v8

    move-object/from16 v3, p4

    move-object/from16 v7, p2

    move-object v1, v8

    move-object/from16 v8, p3

    invoke-direct/range {v2 .. v8}, Lrf/v$e;-><init>(Lmh/l;LN/R0;ZLy/m;Ls9/d;Ls9/d;)V

    const/16 v2, 0x36

    const v3, 0x45f60544

    invoke-static {v3, v15, v1, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    move-object v6, v13

    invoke-static/range {v2 .. v8}, Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_9
    invoke-interface {v13}, LT/l;->z()LT/X0;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v8, Lrf/u;

    move-object v0, v8

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lrf/u;-><init>(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;I)V

    invoke-interface {v7, v8}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final t(Z)LYg/J;
    .locals 0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;ILT/l;I)LYg/J;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, LT/L0;->a(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lrf/v;->s(Landroidx/compose/ui/e;ZLs9/d;Ls9/d;Lmh/l;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final synthetic v(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;LT/l;I)V
    .locals 0

    invoke-static/range {p0 .. p9}, Lrf/v;->n(Lz/d;FFLs9/d;Ls9/d;LT/z1;LN/R0;Ly/k;LT/l;I)V

    return-void
.end method

.method private static final w(Ljava/lang/Object;Lmh/l;Lr/i;LT/l;II)LN/R0;
    .locals 9

    const v0, 0x308aa009

    invoke-interface {p3, v0}, LT/l;->U(I)V

    const/4 v1, 0x4

    and-int/2addr p5, v1

    if-eqz p5, :cond_0

    sget-object p2, LN/P0;->a:LN/P0;

    invoke-virtual {p2}, LN/P0;->a()Lr/h0;

    move-result-object p2

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p5

    if-eqz p5, :cond_1

    const/4 p5, -0x1

    const-string v2, "com.ui.wifiman.ui.teleport.component.rememberSwipeableStateFor (TeleportTunnelSwitch.kt:279)"

    invoke-static {v0, p4, p5, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    const p5, -0x1a36fee8

    invoke-interface {p3, p5}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p5

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne p5, v2, :cond_2

    new-instance p5, LN/R0;

    new-instance v2, Lrf/l;

    invoke-direct {v2}, Lrf/l;-><init>()V

    invoke-direct {p5, p0, p2, v2}, LN/R0;-><init>(Ljava/lang/Object;Lr/i;Lmh/l;)V

    invoke-interface {p3, p5}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p5, LN/R0;

    invoke-interface {p3}, LT/l;->J()V

    const p2, -0x1a36e66f

    invoke-interface {p3, p2}, LT/l;->U(I)V

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-ne p2, v2, :cond_3

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    invoke-static {p2, v3, v2, v3}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p2

    invoke-interface {p3, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, LT/q0;

    invoke-interface {p3}, LT/l;->J()V

    invoke-interface {p2}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v2

    const v4, -0x1a36db20

    invoke-interface {p3, v4}, LT/l;->U(I)V

    and-int/lit8 v4, p4, 0xe

    xor-int/lit8 v4, v4, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-le v4, v1, :cond_4

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    and-int/lit8 v7, p4, 0x6

    if-ne v7, v1, :cond_6

    :cond_5
    move v7, v6

    goto :goto_0

    :cond_6
    move v7, v5

    :goto_0
    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_7

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v8, v7, :cond_8

    :cond_7
    new-instance v8, Lrf/v$g;

    invoke-direct {v8, p0, p5, v3}, Lrf/v$g;-><init>(Ljava/lang/Object;LN/R0;Ldh/e;)V

    invoke-interface {p3, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lmh/p;

    invoke-interface {p3}, LT/l;->J()V

    and-int/lit8 v3, p4, 0x8

    and-int/lit8 v7, p4, 0xe

    invoke-static {p0, v2, v8, p3, v7}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-virtual {p5}, LN/R0;->o()Ljava/lang/Object;

    move-result-object v2

    const v7, -0x1a36c63c

    invoke-interface {p3, v7}, LT/l;->U(I)V

    if-le v4, v1, :cond_9

    invoke-interface {p3, p0}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    and-int/lit8 v4, p4, 0x6

    if-ne v4, v1, :cond_b

    :cond_a
    move v1, v6

    goto :goto_1

    :cond_b
    move v1, v5

    :goto_1
    and-int/lit8 v4, p4, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/16 v7, 0x20

    if-le v4, v7, :cond_c

    invoke-interface {p3, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    and-int/lit8 p4, p4, 0x30

    if-ne p4, v7, :cond_e

    :cond_d
    move v5, v6

    :cond_e
    or-int p4, v1, v5

    invoke-interface {p3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v1

    if-nez p4, :cond_f

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne v1, p4, :cond_10

    :cond_f
    new-instance v1, Lrf/m;

    invoke-direct {v1, p0, p5, p1, p2}, Lrf/m;-><init>(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;)V

    invoke-interface {p3, v1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_10
    check-cast v1, Lmh/l;

    invoke-interface {p3}, LT/l;->J()V

    invoke-static {v2, v1, p3, v3}, LT/O;->c(Ljava/lang/Object;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    invoke-interface {p3}, LT/l;->J()V

    return-object p5
.end method

.method private static final x(Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method private static final y(Ljava/lang/Object;LN/R0;Lmh/l;LT/q0;LT/L;)LT/K;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p4

    invoke-static {p0, p4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p1}, LN/R0;->o()Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-interface {p3, p0}, LT/q0;->setValue(Ljava/lang/Object;)V

    :cond_0
    new-instance p0, Lrf/v$h;

    invoke-direct {p0}, Lrf/v$h;-><init>()V

    return-object p0
.end method
