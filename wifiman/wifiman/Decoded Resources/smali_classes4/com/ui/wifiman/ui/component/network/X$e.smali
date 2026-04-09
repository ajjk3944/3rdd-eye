.class final Lcom/ui/wifiman/ui/component/network/X$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmh/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ui/wifiman/ui/component/network/X;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/N;JJFZLmh/l;Lmh/l;LT/l;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/ui/wifiman/ui/component/network/N;

.field final synthetic b:LT/q0;

.field final synthetic c:F

.field final synthetic d:J


# direct methods
.method constructor <init>(Lcom/ui/wifiman/ui/component/network/N;LT/q0;FJ)V
    .locals 0

    iput-object p1, p0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    iput-object p2, p0, Lcom/ui/wifiman/ui/component/network/X$e;->b:LT/q0;

    iput p3, p0, Lcom/ui/wifiman/ui/component/network/X$e;->c:F

    iput-wide p4, p0, Lcom/ui/wifiman/ui/component/network/X$e;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(LA/B;)I
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/X$e;->f(LA/B;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(LA/B;)I
    .locals 0

    invoke-static {p0}, Lcom/ui/wifiman/ui/component/network/X$e;->e(LA/B;)I

    move-result p0

    return p0
.end method

.method private static final e(LA/B;)I
    .locals 0

    invoke-virtual {p0}, LA/B;->r()I

    move-result p0

    return p0
.end method

.method private static final f(LA/B;)I
    .locals 0

    invoke-virtual {p0}, LA/B;->s()I

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    move-object v1, p1

    check-cast v1, Lz/f;

    move-object v2, p2

    check-cast v2, LA/B;

    check-cast p3, LY0/h;

    invoke-virtual {p3}, LY0/h;->s()F

    move-result v3

    check-cast p4, Lm0/v0;

    invoke-virtual {p4}, Lm0/v0;->u()J

    move-result-wide v4

    move-object v6, p5

    check-cast v6, LT/l;

    check-cast p6, Ljava/lang/Number;

    invoke-virtual {p6}, Ljava/lang/Number;->intValue()I

    move-result v7

    move-object v0, p0

    invoke-virtual/range {v0 .. v7}, Lcom/ui/wifiman/ui/component/network/X$e;->c(Lz/f;LA/B;FJLT/l;I)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final c(Lz/f;LA/B;FJLT/l;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    move-object/from16 v13, p6

    move/from16 v4, p7

    const-string v5, "$this$BaseNetworkTopology"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "itemListState"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x2

    if-nez v5, :cond_1

    invoke-interface {v13, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v6

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-interface {v13, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    invoke-interface {v13, v3}, LT/l;->g(F)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v4, v4, 0xc00

    move-wide/from16 v11, p4

    if-nez v4, :cond_7

    invoke-interface {v13, v11, v12}, LT/l;->j(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v5, v4

    :cond_7
    and-int/lit16 v4, v5, 0x2493

    const/16 v7, 0x2492

    if-ne v4, v7, :cond_9

    invoke-interface/range {p6 .. p6}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface/range {p6 .. p6}, LT/l;->C()V

    goto/16 :goto_10

    :cond_9
    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_a

    const/4 v4, -0x1

    const-string v7, "com.ui.wifiman.ui.component.network.WifimanNetworkTopology.<anonymous> (WifimanNetworkTopology.kt:216)"

    const v8, 0x3a629a8

    invoke-static {v8, v5, v4, v7}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    sget-object v4, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    iget-object v7, v0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    and-int/lit8 v5, v5, 0xe

    or-int/lit16 v8, v5, 0x180

    invoke-virtual {v4, v1, v7, v13, v8}, Lcom/ui/wifiman/ui/component/network/q;->f(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)Z

    move-result v23

    iget-object v7, v0, Lcom/ui/wifiman/ui/component/network/X$e;->b:LT/q0;

    invoke-interface {v7}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v24

    or-int/lit8 v5, v5, 0x30

    invoke-virtual {v4, v1, v13, v5}, Lcom/ui/wifiman/ui/component/network/q;->d(Lz/f;LT/l;I)I

    move-result v25

    const v5, 0x4112a444

    invoke-interface {v13, v5}, LT/l;->U(I)V

    if-eqz v23, :cond_b

    iget-object v5, v0, Lcom/ui/wifiman/ui/component/network/X$e;->b:LT/q0;

    invoke-interface {v5}, LT/q0;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_b

    iget-object v5, v0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {v4, v1, v5, v13, v8}, Lcom/ui/wifiman/ui/component/network/q;->g(Lz/f;Lcom/ui/wifiman/ui/component/network/q$c;LT/l;I)I

    move-result v4

    :goto_6
    move v10, v4

    goto :goto_7

    :cond_b
    iget-object v5, v0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {v4, v5}, Lcom/ui/wifiman/ui/component/network/q;->e(Lcom/ui/wifiman/ui/component/network/q$c;)I

    move-result v4

    goto :goto_6

    :goto_7
    invoke-interface/range {p6 .. p6}, LT/l;->J()V

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v4

    invoke-interface {v13, v4}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v26, v4

    check-cast v26, LY0/d;

    const/16 v4, 0x1a

    int-to-float v4, v4

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v9

    int-to-float v4, v6

    div-float v5, v9, v4

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    const v6, 0x4112c82f

    invoke-interface {v13, v6}, LT/l;->U(I)V

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, LT/l;->a:LT/l$a;

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v6, v8, :cond_c

    new-instance v6, Lcom/ui/wifiman/ui/component/network/a0;

    invoke-direct {v6, v2}, Lcom/ui/wifiman/ui/component/network/a0;-><init>(LA/B;)V

    invoke-static {v6}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v6

    invoke-interface {v13, v6}, LT/l;->K(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, LT/z1;

    invoke-interface/range {p6 .. p6}, LT/l;->J()V

    invoke-interface {v6}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v8

    int-to-float v6, v8

    invoke-interface/range {p1 .. p1}, Lz/f;->b()F

    move-result v1

    div-float/2addr v1, v3

    add-float/2addr v6, v1

    float-to-double v14, v6

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-float v1, v14

    float-to-int v1, v1

    const/4 v6, 0x1

    sub-int/2addr v1, v6

    const v14, 0x4112e656

    invoke-interface {v13, v14}, LT/l;->U(I)V

    invoke-interface/range {p6 .. p6}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v7

    if-ne v14, v7, :cond_d

    new-instance v7, Lcom/ui/wifiman/ui/component/network/b0;

    invoke-direct {v7, v2}, Lcom/ui/wifiman/ui/component/network/b0;-><init>(LA/B;)V

    invoke-static {v7}, LT/o1;->e(Lmh/a;)LT/z1;

    move-result-object v14

    invoke-interface {v13, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_d
    check-cast v14, LT/z1;

    invoke-interface/range {p6 .. p6}, LT/l;->J()V

    invoke-interface {v14}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const/16 v7, 0x40

    int-to-float v7, v7

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    div-float/2addr v7, v4

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v4

    sub-float/2addr v4, v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v27

    neg-float v4, v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    add-float/2addr v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    const/4 v7, 0x0

    if-nez v8, :cond_e

    iget v5, v0, Lcom/ui/wifiman/ui/component/network/X$e;->c:F

    goto :goto_8

    :cond_e
    int-to-float v5, v7

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    :goto_8
    add-float/2addr v4, v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    add-int/lit8 v5, v8, -0x1

    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    int-to-float v5, v5

    mul-float/2addr v5, v3

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    neg-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    add-float/2addr v4, v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    int-to-float v5, v2

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    invoke-interface/range {v26 .. v26}, LY0/d;->getDensity()F

    move-result v14

    div-float/2addr v5, v14

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    neg-float v5, v5

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v5

    add-float/2addr v4, v5

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v5

    const v4, 0x41136b74

    invoke-interface {v13, v4}, LT/l;->U(I)V

    neg-float v4, v9

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v14

    invoke-static {v5, v14}, LY0/h;->h(FF)I

    move-result v14

    const/16 v15, 0x36

    const/4 v12, 0x3

    const/4 v11, 0x0

    move/from16 p7, v8

    const/4 v8, 0x0

    if-lez v14, :cond_10

    if-eqz v23, :cond_f

    if-nez v24, :cond_f

    move/from16 v28, v6

    goto :goto_9

    :cond_f
    move/from16 v28, v7

    :goto_9
    invoke-static {v8, v11, v12, v8}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v29

    invoke-static {v8, v11, v12, v8}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v30

    new-instance v14, Lcom/ui/wifiman/ui/component/network/X$e$a;

    iget-wide v7, v0, Lcom/ui/wifiman/ui/component/network/X$e;->d:J

    iget-object v11, v0, Lcom/ui/wifiman/ui/component/network/X$e;->b:LT/q0;

    move-object/from16 v31, v14

    move v12, v15

    move v15, v9

    move/from16 v16, v5

    move/from16 v17, v27

    move-wide/from16 v18, v7

    move-wide/from16 v20, p4

    move-object/from16 v22, v11

    invoke-direct/range {v14 .. v22}, Lcom/ui/wifiman/ui/component/network/X$e$a;-><init>(FFFJJLT/q0;)V

    const v7, -0x29940065

    move-object/from16 v8, v31

    invoke-static {v7, v6, v8, v13, v12}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v11

    const v14, 0x30d80

    const/16 v15, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v16, v4

    move/from16 v4, v28

    move/from16 v17, v5

    move-object v5, v7

    move v7, v6

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move/from16 v28, p7

    move/from16 v18, v9

    move-object v9, v11

    move v11, v10

    move-object/from16 v10, p6

    move/from16 v32, v11

    move v11, v14

    move/from16 p1, v2

    move v14, v12

    const/4 v2, 0x3

    move v12, v15

    invoke-static/range {v4 .. v12}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    goto :goto_a

    :cond_10
    move/from16 v28, p7

    move/from16 p1, v2

    move/from16 v16, v4

    move/from16 v17, v5

    move/from16 v18, v9

    move/from16 v32, v10

    move v2, v12

    move v14, v15

    :goto_a
    invoke-interface/range {p6 .. p6}, LT/l;->J()V

    iget-object v4, v0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/component/network/N;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    const/4 v12, 0x1

    add-int/lit8 v25, v25, -0x1

    sub-int v4, v4, v25

    const/4 v11, 0x0

    invoke-static {v11, v4}, Ljava/lang/Math;->max(II)I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v3

    invoke-static {v4}, LY0/h;->j(F)F

    move-result v4

    add-float v5, v17, v4

    invoke-static {v5}, LY0/h;->j(F)F

    move-result v4

    const v5, 0x4113fad8

    invoke-interface {v13, v5}, LT/l;->U(I)V

    invoke-static/range {v16 .. v16}, LY0/h;->j(F)F

    move-result v5

    invoke-static {v4, v5}, LY0/h;->h(FF)I

    move-result v5

    if-lez v5, :cond_12

    if-eqz v23, :cond_11

    if-eqz v24, :cond_11

    move v5, v12

    :goto_b
    const/4 v9, 0x0

    const/4 v10, 0x0

    goto :goto_c

    :cond_11
    move v5, v11

    goto :goto_b

    :goto_c
    invoke-static {v9, v10, v2, v9}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v6

    invoke-static {v9, v10, v2, v9}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v7

    new-instance v8, Lcom/ui/wifiman/ui/component/network/X$e$b;

    iget-wide v9, v0, Lcom/ui/wifiman/ui/component/network/X$e;->d:J

    iget-object v15, v0, Lcom/ui/wifiman/ui/component/network/X$e;->b:LT/q0;

    move v2, v14

    move-object v14, v8

    move-object/from16 v22, v15

    move/from16 v15, v18

    move/from16 v16, v4

    move/from16 v17, v27

    move-wide/from16 v18, v9

    move-wide/from16 v20, p4

    invoke-direct/range {v14 .. v22}, Lcom/ui/wifiman/ui/component/network/X$e$b;-><init>(FFFJJLT/q0;)V

    const v4, 0x27ee9ad2

    invoke-static {v4, v12, v8, v13, v2}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v9

    const v14, 0x30d80

    const/16 v15, 0x12

    const/4 v8, 0x0

    const/4 v10, 0x0

    move v4, v5

    move-object v5, v8

    move-object v8, v10

    const/4 v10, 0x0

    const/4 v2, 0x0

    move-object/from16 v10, p6

    move/from16 v17, v11

    move v11, v14

    move v14, v12

    move v12, v15

    invoke-static/range {v4 .. v12}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    goto :goto_d

    :cond_12
    move/from16 v17, v11

    move v14, v12

    const/4 v2, 0x0

    :goto_d
    invoke-interface/range {p6 .. p6}, LT/l;->J()V

    sget-object v4, Lla/a;->a:Lla/a;

    sget v5, Lla/a;->b:I

    invoke-virtual {v4, v13, v5}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a;->a()Lma/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lma/a$a;->b()Lr9/a$a;

    move-result-object v4

    invoke-virtual {v4}, Lr9/a$a;->f()J

    move-result-wide v8

    iget-object v4, v0, Lcom/ui/wifiman/ui/component/network/X$e;->a:Lcom/ui/wifiman/ui/component/network/N;

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/component/network/N;->i()Z

    move-result v4

    if-eqz v4, :cond_14

    move/from16 v4, v32

    if-ne v1, v4, :cond_13

    move/from16 v17, v14

    :cond_13
    :goto_e
    const/4 v1, 0x3

    const/4 v5, 0x0

    goto :goto_f

    :cond_14
    move/from16 v4, v32

    goto :goto_e

    :goto_f
    invoke-static {v5, v2, v1, v5}, Landroidx/compose/animation/g;->o(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/i;

    move-result-object v10

    invoke-static {v5, v2, v1, v5}, Landroidx/compose/animation/g;->q(Lr/H;FILjava/lang/Object;)Landroidx/compose/animation/k;

    move-result-object v11

    new-instance v12, Lcom/ui/wifiman/ui/component/network/X$e$c;

    iget v2, v0, Lcom/ui/wifiman/ui/component/network/X$e;->c:F

    move-object v1, v12

    move/from16 v6, p1

    const/16 v15, 0x36

    move/from16 v3, p3

    move/from16 v5, v28

    move-object/from16 v7, v26

    invoke-direct/range {v1 .. v9}, Lcom/ui/wifiman/ui/component/network/X$e$c;-><init>(FFIIILY0/d;J)V

    const v1, -0x74580780    # -6.469996E-32f

    invoke-static {v1, v14, v12, v13, v15}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v6

    const v8, 0x30d80

    const/16 v9, 0x12

    const/4 v2, 0x0

    const/4 v5, 0x0

    move/from16 v1, v17

    move-object v3, v10

    move-object v4, v11

    move-object/from16 v7, p6

    invoke-static/range {v1 .. v9}, Lq/d;->f(ZLandroidx/compose/ui/e;Landroidx/compose/animation/i;Landroidx/compose/animation/k;Ljava/lang/String;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static {}, LT/o;->P()V

    :cond_15
    :goto_10
    return-void
.end method
