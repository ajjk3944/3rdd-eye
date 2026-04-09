.class final LWe/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWe/g$a;->a(LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/e;

.field final synthetic b:LWe/b;

.field final synthetic c:LWe/c;


# direct methods
.method constructor <init>(Landroidx/compose/ui/e;LWe/b;LWe/c;)V
    .locals 0

    iput-object p1, p0, LWe/g$a$a;->a:Landroidx/compose/ui/e;

    iput-object p2, p0, LWe/g$a$a;->b:LWe/b;

    iput-object p3, p0, LWe/g$a$a;->c:LWe/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-static {p0}, LWe/g$a$a;->c(Lxe/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lxe/f$b;)LYg/J;
    .locals 0

    invoke-interface {p0}, Lxe/f$b;->a()V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method


# virtual methods
.method public final b(LT/l;I)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v15, p1

    move/from16 v1, p2

    const/4 v2, 0x3

    and-int/lit8 v3, v1, 0x3

    const/4 v4, 0x2

    if-ne v3, v4, :cond_1

    invoke-interface/range {p1 .. p1}, LT/l;->v()Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LT/l;->C()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, -0x1

    const-string v4, "com.ui.wifiman.ui.signal.floorplan.detail.FloorplanDetailUi.<anonymous>.<anonymous> (FloorplanDetailUi.kt:40)"

    const v5, -0xac1b9b7

    invoke-static {v5, v1, v3, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, LWe/g$a$a;->a:Landroidx/compose/ui/e;

    const/4 v3, 0x0

    const/4 v14, 0x1

    const/4 v13, 0x0

    invoke-static {v1, v3, v14, v13}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    iget-object v12, v0, LWe/g$a$a;->b:LWe/b;

    iget-object v5, v0, LWe/g$a$a;->c:LWe/c;

    sget-object v4, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v4}, Lf0/c$a;->o()Lf0/c;

    move-result-object v6

    const/4 v10, 0x0

    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/d;->h(Lf0/c;Z)LC0/C;

    move-result-object v6

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v9, LE0/g;->K:LE0/g$a;

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v11

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_3

    invoke-static {}, LT/j;->c()V

    :cond_3
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-interface {v15, v11}, LT/l;->D(Lmh/a;)V

    goto :goto_1

    :cond_4
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_1
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v11

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v2

    invoke-static {v11, v6, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v2

    invoke-static {v11, v8, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v2

    invoke-interface {v11}, LT/l;->o()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v11}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v6}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v11, v6, v2}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_6
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v2

    invoke-static {v11, v1, v2}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v1, Landroidx/compose/foundation/layout/f;->a:Landroidx/compose/foundation/layout/f;

    const v1, -0x60c0a4da

    invoke-interface {v15, v1}, LT/l;->U(I)V

    const/4 v1, 0x6

    if-nez v12, :cond_7

    goto :goto_2

    :cond_7
    sget-object v2, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v2, v3, v14, v13}, Landroidx/compose/foundation/layout/r;->f(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v2

    invoke-static {v2, v12, v15, v1, v10}, LWe/g;->g(Landroidx/compose/ui/e;LWe/b;LT/l;II)V

    :goto_2
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    invoke-static {}, Lxe/B;->K()LT/H0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lxe/f$b;

    sget-object v11, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    invoke-static {v11, v3, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v6, v13, v13, v7, v13}, Landroidx/compose/animation/f;->b(Landroidx/compose/ui/e;Lr/H;Lmh/p;ILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v6

    sget-object v7, Lz/c;->a:Lz/c;

    invoke-virtual {v7}, Lz/c;->g()Lz/c$m;

    move-result-object v7

    invoke-virtual {v4}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v4

    invoke-static {v7, v4, v15, v10}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v4

    invoke-static {v15, v10}, LT/j;->a(LT/l;I)I

    move-result v7

    invoke-interface/range {p1 .. p1}, LT/l;->G()LT/x;

    move-result-object v8

    invoke-static {v15, v6}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v6

    invoke-virtual {v9}, LE0/g$a;->a()Lmh/a;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, LT/l;->x()LT/f;

    move-result-object v16

    if-nez v16, :cond_8

    invoke-static {}, LT/j;->c()V

    :cond_8
    invoke-interface/range {p1 .. p1}, LT/l;->u()V

    invoke-interface/range {p1 .. p1}, LT/l;->o()Z

    move-result v16

    if-eqz v16, :cond_9

    invoke-interface {v15, v1}, LT/l;->D(Lmh/a;)V

    goto :goto_3

    :cond_9
    invoke-interface/range {p1 .. p1}, LT/l;->I()V

    :goto_3
    invoke-static/range {p1 .. p1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v1

    invoke-virtual {v9}, LE0/g$a;->e()Lmh/p;

    move-result-object v10

    invoke-static {v1, v4, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->g()Lmh/p;

    move-result-object v4

    invoke-static {v1, v8, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v9}, LE0/g$a;->b()Lmh/p;

    move-result-object v4

    invoke-interface {v1}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_a

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v1, v7, v4}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_b
    invoke-virtual {v9}, LE0/g$a;->f()Lmh/p;

    move-result-object v4

    invoke-static {v1, v6, v4}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v20, Lz/k;->a:Lz/k;

    invoke-static {v11, v3, v14, v13}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v1

    invoke-static {v1}, Lz/j0;->c(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v1

    sget-object v21, LL9/d$a;->b:LL9/d$a;

    if-eqz v12, :cond_c

    invoke-virtual {v12}, LWe/b;->b()Ls9/d;

    move-result-object v4

    goto :goto_4

    :cond_c
    move-object v4, v13

    :goto_4
    const v6, 0x1fcb99e1

    invoke-interface {v15, v6}, LT/l;->U(I)V

    if-nez v4, :cond_d

    move-object/from16 v19, v13

    const/4 v10, 0x0

    goto :goto_5

    :cond_d
    const/4 v10, 0x0

    invoke-static {v4, v15, v10}, Lsa/a;->b(Ls9/d;LT/l;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v19, v4

    :goto_5
    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    const v4, 0x1fcb9034

    invoke-interface {v15, v4}, LT/l;->U(I)V

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface/range {p1 .. p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_e

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v6, v4, :cond_f

    :cond_e
    new-instance v6, LWe/f;

    invoke-direct {v6, v2}, LWe/f;-><init>(Lxe/f$b;)V

    invoke-interface {v15, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_f
    move-object v4, v6

    check-cast v4, Lmh/a;

    invoke-interface/range {p1 .. p1}, LT/l;->J()V

    new-instance v2, LWe/g$a$a$a;

    invoke-direct {v2, v12, v5}, LWe/g$a$a$a;-><init>(LWe/b;LWe/c;)V

    const v5, 0x93c8535

    const/16 v8, 0x36

    invoke-static {v5, v14, v2, v15, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v5

    sget v2, LL9/d$a;->c:I

    const/4 v6, 0x6

    shl-int/2addr v2, v6

    or-int/lit16 v2, v2, 0x6000

    move/from16 v16, v2

    const/16 v17, 0x0

    const/16 v18, 0x7e0

    const-wide/16 v6, 0x0

    const-wide/16 v22, 0x0

    move v2, v8

    move-wide/from16 v8, v22

    move/from16 v24, v10

    move-object/from16 v25, v11

    move-wide/from16 v10, v22

    const/16 v22, 0x0

    move-object/from16 v23, v12

    move/from16 v12, v22

    const/16 v22, 0x0

    move-object/from16 v13, v22

    const/16 v22, 0x0

    move/from16 v14, v22

    move-object/from16 v2, v19

    move-object/from16 v3, v21

    move-object v0, v15

    move-object/from16 v15, p1

    invoke-static/range {v1 .. v18}, LL9/E;->i(Landroidx/compose/ui/e;Ljava/lang/String;LL9/d;Lmh/a;Lmh/q;JJJFLz/N;FLT/l;III)V

    if-eqz v23, :cond_10

    invoke-virtual/range {v23 .. v23}, LWe/b;->d()Ls9/d;

    move-result-object v13

    move-object/from16 v4, v25

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    goto :goto_6

    :cond_10
    move-object/from16 v4, v25

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_6
    invoke-static {v4, v1, v2, v3}, Landroidx/compose/foundation/layout/r;->h(Landroidx/compose/ui/e;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v3

    if-eqz v13, :cond_11

    move/from16 v24, v2

    :cond_11
    new-instance v1, LWe/g$a$a$b;

    invoke-direct {v1, v13}, LWe/g$a$a$b;-><init>(Ls9/d;)V

    const v4, 0xd30871d

    const/16 v5, 0x36

    invoke-static {v4, v2, v1, v0, v5}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v7

    const v9, 0x180186

    const/16 v10, 0x1c

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, v20

    move/from16 v2, v24

    move-object/from16 v8, p1

    invoke-static/range {v1 .. v10}, Lq/d;->d(Lz/j;ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-interface/range {p1 .. p1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    :goto_7
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LT/l;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LWe/g$a$a;->b(LT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
