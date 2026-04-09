.class public abstract LA9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA9/i;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(LA9/k;Landroidx/compose/ui/e;ZLmh/p;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p6}, LA9/k;->c(LA9/k;Landroidx/compose/ui/e;ZLmh/p;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(LA9/k;Landroidx/compose/ui/e;ZLmh/p;ILT/l;I)LYg/J;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, LT/L0;->a(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, LA9/k;->a(Landroidx/compose/ui/e;ZLmh/p;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public a(Landroidx/compose/ui/e;ZLmh/p;LT/l;I)V
    .locals 21

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move/from16 v11, p5

    const/4 v0, 0x3

    const-string/jumbo v1, "modifier"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v1, "content"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, -0x708567f2

    move-object/from16 v2, p4

    invoke-interface {v2, v1}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_1
    move v2, v11

    :goto_1
    and-int/lit8 v3, v11, 0x30

    move/from16 v13, p2

    if-nez v3, :cond_3

    invoke-interface {v12, v13}, LT/l;->c(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_5

    invoke-interface {v12, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v11, 0xc00

    move-object/from16 v14, p0

    if-nez v3, :cond_7

    invoke-interface {v12, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v2, 0x493

    const/16 v4, 0x492

    if-ne v3, v4, :cond_9

    invoke-interface {v12}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v12}, LT/l;->C()V

    goto/16 :goto_7

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_a

    const/4 v3, -0x1

    const-string/jumbo v4, "com.ui.core.ui.component.layout.UiColumnWithDividersScopeImpl.AnimatedVisibility (UiColumnWithDividersScopeImpl.kt:21)"

    invoke-static {v1, v2, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-virtual/range {p0 .. p2}, LA9/k;->d(Landroidx/compose/ui/e;Z)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->o()Lf0/c;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v3

    invoke-static {v12, v4}, LT/j;->a(LT/l;I)I

    move-result v4

    invoke-interface {v12}, LT/l;->G()LT/x;

    move-result-object v5

    invoke-static {v12, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v6, LE0/g;->K:LE0/g$a;

    invoke-virtual {v6}, LE0/g$a;->a()Lmh/a;

    move-result-object v7

    invoke-interface {v12}, LT/l;->x()LT/f;

    move-result-object v8

    if-nez v8, :cond_b

    invoke-static {}, LT/j;->c()V

    :cond_b
    invoke-interface {v12}, LT/l;->u()V

    invoke-interface {v12}, LT/l;->o()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v12, v7}, LT/l;->D(Lmh/a;)V

    goto :goto_6

    :cond_c
    invoke-interface {v12}, LT/l;->I()V

    :goto_6
    invoke-static {v12}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v7

    invoke-virtual {v6}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v7, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v7, v5, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v6}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v7}, LT/l;->o()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-interface {v7}, LT/l;->f()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_e

    :cond_d
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v7, v5}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v7, v4, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_e
    invoke-virtual {v6}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v7, v1, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const/16 v7, 0xf

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/animation/g;->m(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v1

    const/4 v4, 0x0

    invoke-static {v3, v4, v0, v3}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v5

    invoke-virtual {v1, v5}, Landroidx/compose/animation/i;->c(Landroidx/compose/animation/i;)Landroidx/compose/animation/i;

    move-result-object v5

    const/16 v19, 0xf

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/animation/g;->y(Lr/H;Lf0/c$c;ZLmh/l;ILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v1

    invoke-static {v3, v4, v0, v3}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/compose/animation/k;->c(Landroidx/compose/animation/k;)Landroidx/compose/animation/k;

    move-result-object v3

    new-instance v1, LA9/k$a;

    invoke-direct {v1, v10}, LA9/k$a;-><init>(Lmh/p;)V

    const/16 v4, 0x36

    const v6, 0x3d411ef0

    const/4 v7, 0x1

    invoke-static {v6, v7, v1, v12, v4}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    shr-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0xe

    const v4, 0x30d80

    or-int/2addr v1, v4

    shl-int/lit8 v0, v2, 0x3

    and-int/lit8 v0, v0, 0x70

    or-int v7, v1, v0

    const/16 v8, 0x10

    const/4 v4, 0x0

    move/from16 v0, p2

    move-object/from16 v1, p1

    move-object v2, v5

    move-object v5, v6

    move-object v6, v12

    invoke-static/range {v0 .. v8}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface {v12}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    :goto_7
    invoke-interface {v12}, LT/l;->z()LT/X0;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v7, LA9/j;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, LA9/j;-><init>(LA9/k;Landroidx/compose/ui/e;ZLmh/p;I)V

    invoke-interface {v6, v7}, LT/X0;->a(Lmh/p;)V

    :cond_10
    return-void
.end method

.method public d(Landroidx/compose/ui/e;Z)Landroidx/compose/ui/e;
    .locals 0

    invoke-static {p0, p1, p2}, LA9/i$a;->a(LA9/i;Landroidx/compose/ui/e;Z)Landroidx/compose/ui/e;

    move-result-object p1

    return-object p1
.end method
