.class public abstract Lcom/ui/wifiman/ui/component/network/B;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LT/H0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ui/wifiman/ui/component/network/A;

    invoke-direct {v0}, Lcom/ui/wifiman/ui/component/network/A;-><init>()V

    invoke-static {v0}, LT/w;->f(Lmh/a;)LT/H0;

    move-result-object v0

    sput-object v0, Lcom/ui/wifiman/ui/component/network/B;->a:LT/H0;

    return-void
.end method

.method public static final synthetic A(LA/y;ILmh/l;Lmh/l;Lmh/r;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B;->B(LA/y;ILmh/l;Lmh/l;Lmh/r;)V

    return-void
.end method

.method private static final B(LA/y;ILmh/l;Lmh/l;Lmh/r;)V
    .locals 2

    add-int/lit8 p1, p1, 0x2

    new-instance v0, Lcom/ui/wifiman/ui/component/network/w;

    invoke-direct {v0, p1, p3, p2}, Lcom/ui/wifiman/ui/component/network/w;-><init>(ILmh/l;Lmh/l;)V

    new-instance p3, Lcom/ui/wifiman/ui/component/network/x;

    invoke-direct {p3, p1}, Lcom/ui/wifiman/ui/component/network/x;-><init>(I)V

    new-instance v1, Lcom/ui/wifiman/ui/component/network/B$d;

    invoke-direct {v1, p1, p4, p2}, Lcom/ui/wifiman/ui/component/network/B$d;-><init>(ILmh/r;Lmh/l;)V

    const p2, 0x72373b10

    const/4 p4, 0x1

    invoke-static {p2, p4, v1}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object p2

    invoke-interface {p0, p1, v0, p3, p2}, LA/y;->a(ILmh/l;Lmh/l;Lmh/r;)V

    return-void
.end method

.method private static final C(ILmh/l;Lmh/l;I)Ljava/lang/Object;
    .locals 0

    if-nez p3, :cond_0

    const-string p0, "paddingStart"

    goto :goto_0

    :cond_0
    add-int/lit8 p0, p0, -0x1

    if-ne p3, p0, :cond_1

    const-string p0, "paddingEnd"

    goto :goto_0

    :cond_1
    add-int/lit8 p3, p3, -0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-interface {p2, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    :goto_0
    return-object p0
.end method

.method private static final D(II)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_1

    add-int/lit8 p0, p0, -0x1

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    const-string p0, "item"

    goto :goto_1

    :cond_1
    :goto_0
    const-string p0, "padding"

    :goto_1
    return-object p0
.end method

.method public static synthetic a(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B;->r(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lcom/ui/wifiman/ui/component/network/B;->x(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/ui/wifiman/ui/component/network/B;->n(ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(II)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/B;->D(II)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILmh/l;Lmh/l;I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/ui/wifiman/ui/component/network/B;->C(ILmh/l;Lmh/l;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B;->w(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(JFLm0/V0;Lo0/f;)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B;->q(JFLm0/V0;Lo0/f;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p11}, Lcom/ui/wifiman/ui/component/network/B;->l(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/ui/wifiman/ui/component/network/B;->u(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()LY0/h;
    .locals 1

    invoke-static {}, Lcom/ui/wifiman/ui/component/network/B;->o()LY0/h;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p9

    move/from16 v10, p10

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibleTopologyProvider"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2e283cb1

    move-object/from16 v3, p8

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, v10, 0x1

    if-eqz v4, :cond_0

    or-int/lit8 v4, v9, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    invoke-interface {v3, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v9

    goto :goto_1

    :cond_2
    move v4, v9

    :goto_1
    and-int/lit8 v5, v10, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v4, v4, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v9, 0x30

    if-nez v5, :cond_5

    invoke-interface {v3, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_5
    :goto_3
    and-int/lit8 v5, v10, 0x4

    if-eqz v5, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move/from16 v6, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-interface {v3, v6}, LT/l;->c(Z)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_4

    :cond_8
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v4, v7

    :goto_5
    and-int/lit8 v7, v10, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v8, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v8, v9, 0xc00

    if-nez v8, :cond_9

    move/from16 v8, p3

    invoke-interface {v3, v8}, LT/l;->g(F)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit16 v11, v9, 0x6000

    if-nez v11, :cond_e

    and-int/lit8 v11, v10, 0x10

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-interface {v3, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_c
    move-object/from16 v11, p4

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v4, v12

    goto :goto_9

    :cond_e
    move-object/from16 v11, p4

    :goto_9
    and-int/lit8 v12, v10, 0x20

    const/high16 v13, 0x30000

    if-eqz v12, :cond_10

    or-int/2addr v4, v13

    :cond_f
    move-object/from16 v13, p5

    goto :goto_b

    :cond_10
    and-int/2addr v13, v9

    if-nez v13, :cond_f

    move-object/from16 v13, p5

    invoke-interface {v3, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_11

    const/high16 v14, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v14, 0x10000

    :goto_a
    or-int/2addr v4, v14

    :goto_b
    and-int/lit8 v14, v10, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_13

    or-int/2addr v4, v15

    :cond_12
    move-object/from16 v15, p6

    goto :goto_d

    :cond_13
    and-int/2addr v15, v9

    if-nez v15, :cond_12

    move-object/from16 v15, p6

    invoke-interface {v3, v15}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x80000

    :goto_c
    or-int v4, v4, v16

    :goto_d
    and-int/lit16 v0, v10, 0x80

    const/high16 v17, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v17

    move-object/from16 v1, p7

    goto :goto_f

    :cond_15
    and-int v17, v9, v17

    move-object/from16 v1, p7

    if-nez v17, :cond_17

    invoke-interface {v3, v1}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_16

    const/high16 v17, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v17, 0x400000

    :goto_e
    or-int v4, v4, v17

    :cond_17
    :goto_f
    const v17, 0x492493

    and-int v1, v4, v17

    const v2, 0x492492

    if-ne v1, v2, :cond_19

    invoke-interface {v3}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v3}, LT/l;->C()V

    move v4, v8

    move-object v5, v11

    move-object v7, v15

    move-object/from16 v8, p7

    goto/16 :goto_14

    :cond_19
    :goto_10
    invoke-interface {v3}, LT/l;->q()V

    and-int/lit8 v1, v9, 0x1

    const/4 v2, 0x1

    if-eqz v1, :cond_1c

    invoke-interface {v3}, LT/l;->H()Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-interface {v3}, LT/l;->C()V

    and-int/lit8 v0, v10, 0x10

    if-eqz v0, :cond_1b

    const v0, -0xe001

    and-int/2addr v4, v0

    :cond_1b
    move-object/from16 v0, p7

    goto :goto_13

    :cond_1c
    :goto_11
    const/4 v1, 0x0

    if-eqz v5, :cond_1d

    move v6, v1

    :cond_1d
    if-eqz v7, :cond_1e

    int-to-float v1, v1

    invoke-static {v1}, LY0/h;->j(F)F

    move-result v1

    move v8, v1

    :cond_1e
    and-int/lit8 v1, v10, 0x10

    if-eqz v1, :cond_1f

    sget-object v1, Lcom/ui/wifiman/ui/component/network/q;->a:Lcom/ui/wifiman/ui/component/network/q;

    invoke-virtual {v1}, Lcom/ui/wifiman/ui/component/network/q;->b()Lmh/r;

    move-result-object v1

    const v5, -0xe001

    and-int/2addr v4, v5

    move-object v11, v1

    :cond_1f
    if-eqz v12, :cond_20

    new-instance v1, Lcom/ui/wifiman/ui/component/network/B$a;

    invoke-direct {v1, v6}, Lcom/ui/wifiman/ui/component/network/B$a;-><init>(Z)V

    const v5, 0x5dfd884e

    const/16 v7, 0x36

    invoke-static {v5, v2, v1, v3, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    move-object v13, v1

    goto :goto_12

    :cond_20
    const/16 v7, 0x36

    :goto_12
    if-eqz v14, :cond_21

    new-instance v1, Lcom/ui/wifiman/ui/component/network/B$b;

    invoke-direct {v1, v6}, Lcom/ui/wifiman/ui/component/network/B$b;-><init>(Z)V

    const v5, 0x1b1be637

    invoke-static {v5, v2, v1, v3, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v1

    move-object v15, v1

    :cond_21
    if-eqz v0, :cond_1b

    sget-object v0, Lcom/ui/wifiman/ui/component/network/a;->a:Lcom/ui/wifiman/ui/component/network/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/a;->a()Lmh/t;

    move-result-object v0

    :goto_13
    invoke-interface {v3}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_22

    const/4 v1, -0x1

    const-string v5, "com.ui.wifiman.ui.component.network.BaseNetworkTopology (NetworkTopology.kt:202)"

    const v7, -0x2e283cb1

    invoke-static {v7, v4, v1, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_22
    sget-object v1, Lcom/ui/wifiman/ui/component/network/B;->a:LT/H0;

    invoke-static {v8}, LY0/h;->d(F)LY0/h;

    move-result-object v4

    invoke-virtual {v1, v4}, LT/H0;->d(Ljava/lang/Object;)LT/I0;

    move-result-object v1

    new-instance v4, Lcom/ui/wifiman/ui/component/network/B$c;

    move-object/from16 p2, v4

    move-object/from16 p3, p0

    move-object/from16 p4, p1

    move-object/from16 p5, v11

    move-object/from16 p6, v0

    move-object/from16 p7, v13

    move-object/from16 p8, v15

    invoke-direct/range {p2 .. p8}, Lcom/ui/wifiman/ui/component/network/B$c;-><init>(Landroidx/compose/ui/e;Lmh/q;Lmh/r;Lmh/t;Lmh/s;Lmh/s;)V

    const v5, -0x6bc62971

    const/16 v7, 0x36

    invoke-static {v5, v2, v4, v3, v7}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    sget v4, LT/I0;->i:I

    or-int/lit8 v4, v4, 0x30

    invoke-static {v1, v2, v3, v4}, LT/w;->a(LT/I0;Lmh/p;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_23

    invoke-static {}, LT/o;->P()V

    :cond_23
    move v4, v8

    move-object v5, v11

    move-object v7, v15

    move-object v8, v0

    :goto_14
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v11

    if-eqz v11, :cond_24

    new-instance v12, Lcom/ui/wifiman/ui/component/network/z;

    move-object v0, v12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v3, v6

    move-object v6, v13

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/ui/wifiman/ui/component/network/z;-><init>(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;II)V

    invoke-interface {v11, v12}, LT/X0;->a(Lmh/p;)V

    :cond_24
    return-void
.end method

.method private static final l(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;IILT/l;I)LYg/J;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p10

    move/from16 v11, p9

    invoke-static/range {v1 .. v11}, Lcom/ui/wifiman/ui/component/network/B;->k(Landroidx/compose/ui/e;Lmh/q;ZFLmh/r;Lmh/s;Lmh/s;Lmh/t;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final m(LT/l;I)V
    .locals 3

    const v0, -0x7368bb64

    invoke-interface {p0, v0}, LT/l;->r(I)LT/l;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LT/l;->C()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.ui.wifiman.ui.component.network.HorizontalPaddingItem (NetworkTopology.kt:284)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    sget-object v1, Lcom/ui/wifiman/ui/component/network/B;->a:LT/H0;

    invoke-interface {p0, v1}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/h;

    invoke-virtual {v1}, LY0/h;->s()F

    move-result v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/r;->z(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p0, v1}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LT/l;->z()LT/X0;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lcom/ui/wifiman/ui/component/network/y;

    invoke-direct {v0, p1}, Lcom/ui/wifiman/ui/component/network/y;-><init>(I)V

    invoke-interface {p0, v0}, LT/X0;->a(Lmh/p;)V

    :cond_4
    return-void
.end method

.method private static final n(ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, LT/L0;->a(I)I

    move-result p0

    invoke-static {p1, p0}, Lcom/ui/wifiman/ui/component/network/B;->m(LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o()LY0/h;
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No padding set"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;LT/l;I)V
    .locals 8

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "modifier"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "connection"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v2, 0x329bcd2

    invoke-interface {p2, v2}, LT/l;->r(I)LT/l;

    move-result-object p2

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-interface {p2, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, p3

    goto :goto_1

    :cond_1
    move v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    invoke-interface {p2, p1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-ne v5, v6, :cond_5

    invoke-interface {p2}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {p2}, LT/l;->C()V

    goto/16 :goto_5

    :cond_5
    :goto_3
    invoke-static {}, LT/o;->H()Z

    move-result v5

    if-eqz v5, :cond_6

    const/4 v5, -0x1

    const-string v6, "com.ui.wifiman.ui.component.network.TopologyConnection (NetworkTopology.kt:346)"

    invoke-static {v2, v3, v5, v6}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_6
    const v2, 0x325374a6

    invoke-interface {p2, v2}, LT/l;->U(I)V

    sget-object v2, Lcom/ui/wifiman/ui/component/network/q$a;->WIRELESS:Lcom/ui/wifiman/ui/component/network/q$a;

    const/4 v3, 0x0

    if-ne p1, v2, :cond_7

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    sget-object v5, Lm0/V0;->a:Lm0/V0$a;

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {v6}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v6

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v7}, LY0/h;->j(F)F

    move-result v7

    invoke-interface {v2, v7}, LY0/d;->d1(F)F

    move-result v2

    new-array v7, v4, [F

    aput v6, v7, v1

    aput v2, v7, v0

    const/4 v2, 0x0

    invoke-static {v5, v7, v2, v4, v3}, Lm0/V0$a;->c(Lm0/V0$a;[FFILjava/lang/Object;)Lm0/V0;

    move-result-object v3

    goto :goto_4

    :cond_7
    sget-object v2, Lcom/ui/wifiman/ui/component/network/q$a;->WIRED:Lcom/ui/wifiman/ui/component/network/q$a;

    if-ne p1, v2, :cond_c

    :goto_4
    invoke-interface {p2}, LT/l;->J()V

    invoke-static {}, LN/t;->a()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm0/v0;

    invoke-virtual {v2}, Lm0/v0;->u()J

    move-result-wide v4

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v2

    invoke-interface {p2, v2}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY0/d;

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v6

    invoke-interface {v2, v6}, LY0/d;->d1(F)F

    move-result v2

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/r;->l(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v0

    const v6, 0x3253cf17

    invoke-interface {p2, v6}, LT/l;->U(I)V

    invoke-interface {p2, v4, v5}, LT/l;->j(J)Z

    move-result v6

    invoke-interface {p2, v2}, LT/l;->g(F)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2, v3}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_8

    sget-object v6, LT/l;->a:LT/l$a;

    invoke-virtual {v6}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v7, v6, :cond_9

    :cond_8
    new-instance v7, Lcom/ui/wifiman/ui/component/network/u;

    invoke-direct {v7, v4, v5, v2, v3}, Lcom/ui/wifiman/ui/component/network/u;-><init>(JFLm0/V0;)V

    invoke-interface {p2, v7}, LT/l;->K(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lmh/l;

    invoke-interface {p2}, LT/l;->J()V

    invoke-static {v0, v7, p2, v1}, Ls/i;->a(Landroidx/compose/ui/e;Lmh/l;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-static {}, LT/o;->P()V

    :cond_a
    :goto_5
    invoke-interface {p2}, LT/l;->z()LT/X0;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lcom/ui/wifiman/ui/component/network/v;

    invoke-direct {v0, p0, p1, p3}, Lcom/ui/wifiman/ui/component/network/v;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;I)V

    invoke-interface {p2, v0}, LT/X0;->a(Lmh/p;)V

    :cond_b
    return-void

    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final q(JFLm0/V0;Lo0/f;)LYg/J;
    .locals 16

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {v0, v0}, Ll0/h;->a(FF)J

    move-result-wide v4

    invoke-interface/range {p4 .. p4}, Lo0/f;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    invoke-static {v2, v0}, Ll0/h;->a(FF)J

    move-result-wide v6

    const/16 v14, 0x1d0

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v2, p0

    move/from16 v8, p2

    move-object/from16 v10, p3

    invoke-static/range {v1 .. v15}, Lo0/f;->w1(Lo0/f;JJJFILm0/V0;FLm0/w0;IILjava/lang/Object;)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final r(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/component/network/B;->p(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$a;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final s(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    const/16 v0, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x40

    const/4 v5, 0x2

    const/16 v6, 0x30

    const/4 v7, 0x6

    const-string v9, "modifier"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "item"

    invoke-static {v2, v9}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v9, 0x606114e4

    move-object/from16 v10, p7

    invoke-interface {v10, v9}, LT/l;->r(I)LT/l;

    move-result-object v15

    const/4 v10, 0x1

    and-int/lit8 v11, p9, 0x1

    const/4 v14, 0x4

    if-eqz v11, :cond_0

    or-int/lit8 v11, v8, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v11, v8, 0x6

    if-nez v11, :cond_2

    invoke-interface {v15, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1

    move v11, v14

    goto :goto_0

    :cond_1
    move v11, v5

    :goto_0
    or-int/2addr v11, v8

    goto :goto_1

    :cond_2
    move v11, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_3

    or-int/2addr v11, v6

    goto :goto_4

    :cond_3
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_6

    and-int/lit8 v5, v8, 0x40

    if-nez v5, :cond_4

    invoke-interface {v15, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_4
    invoke-interface {v15, v2}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_5

    move v5, v3

    goto :goto_3

    :cond_5
    move v5, v0

    :goto_3
    or-int/2addr v11, v5

    :cond_6
    :goto_4
    and-int/lit8 v5, p9, 0x4

    if-eqz v5, :cond_8

    or-int/lit16 v11, v11, 0x180

    :cond_7
    move-object/from16 v12, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v12, v8, 0x180

    if-nez v12, :cond_7

    move-object/from16 v12, p2

    invoke-interface {v15, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x100

    goto :goto_5

    :cond_9
    const/16 v13, 0x80

    :goto_5
    or-int/2addr v11, v13

    :goto_6
    and-int/lit8 v13, p9, 0x8

    if-eqz v13, :cond_b

    or-int/lit16 v11, v11, 0xc00

    :cond_a
    move-object/from16 v10, p3

    goto :goto_8

    :cond_b
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_a

    move-object/from16 v10, p3

    invoke-interface {v15, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    const/16 v16, 0x800

    goto :goto_7

    :cond_c
    const/16 v16, 0x400

    :goto_7
    or-int v11, v11, v16

    :goto_8
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_e

    or-int/lit16 v11, v11, 0x6000

    :cond_d
    move-object/from16 v14, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_d

    move-object/from16 v14, p4

    invoke-interface {v15, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    const/16 v17, 0x4000

    goto :goto_9

    :cond_f
    const/16 v17, 0x2000

    :goto_9
    or-int v11, v11, v17

    :goto_a
    and-int/lit8 v3, p9, 0x20

    const/high16 v17, 0x30000

    if-eqz v3, :cond_10

    or-int v11, v11, v17

    move-wide/from16 v7, p5

    goto :goto_c

    :cond_10
    and-int v17, v8, v17

    move-wide/from16 v7, p5

    if-nez v17, :cond_12

    invoke-interface {v15, v7, v8}, LT/l;->j(J)Z

    move-result v18

    if-eqz v18, :cond_11

    const/high16 v18, 0x20000

    goto :goto_b

    :cond_11
    const/high16 v18, 0x10000

    :goto_b
    or-int v11, v11, v18

    :cond_12
    :goto_c
    const v18, 0x12493

    and-int v4, v11, v18

    const v6, 0x12492

    if-ne v4, v6, :cond_14

    invoke-interface {v15}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_13

    goto :goto_d

    :cond_13
    invoke-interface {v15}, LT/l;->C()V

    move-wide v6, v7

    move-object v4, v10

    move-object v3, v12

    move-object v5, v14

    move-object v8, v15

    goto/16 :goto_14

    :cond_14
    :goto_d
    if-eqz v5, :cond_15

    sget-object v4, Lcom/ui/wifiman/ui/component/network/a;->a:Lcom/ui/wifiman/ui/component/network/a;

    invoke-virtual {v4}, Lcom/ui/wifiman/ui/component/network/a;->b()Lmh/q;

    move-result-object v4

    goto :goto_e

    :cond_15
    move-object v4, v12

    :goto_e
    if-eqz v13, :cond_16

    sget-object v5, Lcom/ui/wifiman/ui/component/network/a;->a:Lcom/ui/wifiman/ui/component/network/a;

    invoke-virtual {v5}, Lcom/ui/wifiman/ui/component/network/a;->c()Lmh/q;

    move-result-object v5

    goto :goto_f

    :cond_16
    move-object v5, v10

    :goto_f
    if-eqz v0, :cond_17

    sget-object v0, Lcom/ui/wifiman/ui/component/network/a;->a:Lcom/ui/wifiman/ui/component/network/a;

    invoke-virtual {v0}, Lcom/ui/wifiman/ui/component/network/a;->d()Lmh/q;

    move-result-object v0

    goto :goto_10

    :cond_17
    move-object v0, v14

    :goto_10
    if-eqz v3, :cond_18

    sget-object v3, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v3}, Lm0/v0$a;->e()J

    move-result-wide v6

    goto :goto_11

    :cond_18
    move-wide v6, v7

    :goto_11
    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_19

    const/4 v3, -0x1

    const-string v8, "com.ui.wifiman.ui.component.network.TopologyItem (NetworkTopology.kt:306)"

    invoke-static {v9, v11, v3, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_19
    sget-object v3, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v3}, Lf0/c$a;->g()Lf0/c$b;

    move-result-object v3

    sget-object v8, Lz/c;->a:Lz/c;

    invoke-virtual {v8}, Lz/c;->g()Lz/c$m;

    move-result-object v8

    const/16 v9, 0x30

    invoke-static {v8, v3, v15, v9}, Lz/h;->a(Lz/c$m;Lf0/c$b;LT/l;I)LC0/C;

    move-result-object v3

    const/4 v8, 0x0

    invoke-static {v15, v8}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v15}, LT/l;->G()LT/x;

    move-result-object v10

    invoke-static {v15, v1}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v12

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v15}, LT/l;->x()LT/f;

    move-result-object v18

    if-nez v18, :cond_1a

    invoke-static {}, LT/j;->c()V

    :cond_1a
    invoke-interface {v15}, LT/l;->u()V

    invoke-interface {v15}, LT/l;->o()Z

    move-result v18

    if-eqz v18, :cond_1b

    invoke-interface {v15, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_12

    :cond_1b
    invoke-interface {v15}, LT/l;->I()V

    :goto_12
    invoke-static {v15}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v8

    invoke-static {v14, v3, v8}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v3

    invoke-static {v14, v10, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v3

    invoke-interface {v14}, LT/l;->o()Z

    move-result v8

    if-nez v8, :cond_1c

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1d

    :cond_1c
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v14, v8, v3}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_1d
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v3

    invoke-static {v14, v12, v3}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    sget-object v3, Lz/k;->a:Lz/k;

    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/q$b;->a()Ls9/a;

    move-result-object v10

    const v3, -0x5e0e984d

    invoke-interface {v15, v3}, LT/l;->U(I)V

    sget-object v3, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    const/16 v8, 0x40

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/r;->v(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v8

    const v9, -0x5e0e8eed

    invoke-interface {v15, v9}, LT/l;->U(I)V

    sget-object v9, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {v9}, Lm0/v0$a;->e()J

    move-result-wide v12

    invoke-static {v6, v7, v12, v13}, Lm0/v0;->m(JJ)Z

    move-result v9

    if-nez v9, :cond_21

    const v9, -0x66c0ec4f

    invoke-interface {v15, v9}, LT/l;->U(I)V

    const/high16 v9, 0x70000

    and-int/2addr v9, v11

    const/high16 v12, 0x20000

    if-ne v9, v12, :cond_1e

    const/4 v9, 0x1

    goto :goto_13

    :cond_1e
    const/4 v9, 0x0

    :goto_13
    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_1f

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v12, v9, :cond_20

    :cond_1f
    sget-object v9, Lm0/l0;->b:Lm0/l0$a;

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v12

    invoke-static {v6, v7}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v13

    const/16 v27, 0xe

    const/16 v28, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-wide/from16 v21, v6

    invoke-static/range {v21 .. v28}, Lm0/v0;->k(JFFFFILjava/lang/Object;)J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Lm0/v0;->g(J)Lm0/v0;

    move-result-object v14

    filled-new-array {v12, v13, v14}, [Lm0/v0;

    move-result-object v12

    invoke-static {v12}, LZg/v;->o([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v22

    const-wide/16 v23, 0x0

    const/16 v26, 0x0

    move-object/from16 v21, v9

    invoke-static/range {v21 .. v28}, Lm0/l0$a;->f(Lm0/l0$a;Ljava/util/List;JFIILjava/lang/Object;)Lm0/l0;

    move-result-object v12

    invoke-interface {v15, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v22, v12

    check-cast v22, Lm0/l0;

    invoke-interface {v15}, LT/l;->J()V

    const/16 v25, 0x6

    const/16 v26, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v21, v8

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/b;->b(Landroidx/compose/ui/e;Lm0/l0;Lm0/i1;FILjava/lang/Object;)Landroidx/compose/ui/e;

    move-result-object v8

    :cond_21
    invoke-interface {v15}, LT/l;->J()V

    invoke-interface {v15}, LT/l;->J()V

    const/16 v19, 0x0

    const/16 v20, 0x3e

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v9, 0x0

    const-wide/16 v17, 0x0

    move/from16 v21, v11

    move-object v11, v8

    const/4 v8, 0x4

    move-object/from16 p2, v15

    move v15, v9

    move-wide/from16 v16, v17

    move-object/from16 v18, p2

    invoke-static/range {v10 .. v20}, LBe/w;->b(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;FJLT/l;II)V

    int-to-float v8, v8

    invoke-static {v8}, LY0/h;->j(F)F

    move-result v8

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/r;->i(Landroidx/compose/ui/e;F)Landroidx/compose/ui/e;

    move-result-object v3

    move-object/from16 v8, p2

    const/4 v9, 0x6

    invoke-static {v3, v8, v9}, Lz/a0;->a(Landroidx/compose/ui/e;LT/l;I)V

    shr-int/lit8 v3, v21, 0x3

    and-int/lit8 v10, v3, 0xe

    and-int/lit8 v3, v3, 0x7e

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v2, v8, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 v3, v21, 0x6

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v5, v2, v8, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    shr-int/lit8 v3, v21, 0x9

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v2, v8, v3}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v8}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v3

    if-eqz v3, :cond_22

    invoke-static {}, LT/o;->P()V

    :cond_22
    move-object v3, v4

    move-object v4, v5

    move-object v5, v0

    :goto_14
    invoke-interface {v8}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_23

    new-instance v11, Lcom/ui/wifiman/ui/component/network/r;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lcom/ui/wifiman/ui/component/network/r;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JII)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_23
    return-void
.end method

.method public static final t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0xd10296d

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v14, 0x40

    if-nez v3, :cond_2

    invoke-interface {v11, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-interface {v11, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v2, v3

    :cond_4
    move v4, v2

    and-int/lit8 v2, v4, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {v11}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v11}, LT/l;->C()V

    move-object/from16 v26, v11

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.network.TopologyItemSubtitle (NetworkTopology.kt:398)"

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/q$b;->b()Ls9/d;

    move-result-object v0

    if-nez v0, :cond_8

    move-object/from16 v26, v11

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    invoke-static {v0, v11, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v2, LW0/j;->b:LW0/j$a;

    invoke-virtual {v2}, LW0/j$a;->a()I

    move-result v5

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v15

    sget-object v6, Lla/a;->a:Lla/a;

    sget v7, Lla/a;->b:I

    invoke-virtual {v6, v11, v7}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->c()J

    move-result-wide v2

    invoke-virtual {v6, v11, v7}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->f()LL0/U;

    move-result-object v21

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    shl-int/lit8 v4, v4, 0x3

    and-int/lit8 v23, v4, 0x70

    const/16 v24, 0xc30

    const v25, 0x1d5f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v26, v11

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move-object/from16 v22, v26

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_6
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lcom/ui/wifiman/ui/component/network/t;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lcom/ui/wifiman/ui/component/network/t;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final u(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/component/network/B;->t(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method public static final v(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v13, p1

    move/from16 v14, p3

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x50439d0d

    move-object/from16 v2, p2

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v11

    and-int/lit8 v2, v14, 0x6

    if-nez v2, :cond_1

    invoke-interface {v11, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v14

    goto :goto_1

    :cond_1
    move v2, v14

    :goto_1
    and-int/lit8 v3, v14, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v14, 0x40

    if-nez v3, :cond_2

    invoke-interface {v11, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-interface {v11, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v2, v3

    :cond_4
    move v4, v2

    and-int/lit8 v2, v4, 0x13

    const/16 v3, 0x12

    if-ne v2, v3, :cond_6

    invoke-interface {v11}, LT/l;->v()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-interface {v11}, LT/l;->C()V

    move-object/from16 v26, v11

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_7

    const/4 v2, -0x1

    const-string v3, "com.ui.wifiman.ui.component.network.TopologyItemTitle (NetworkTopology.kt:379)"

    invoke-static {v0, v4, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_7
    invoke-interface/range {p1 .. p1}, Lcom/ui/wifiman/ui/component/network/q$b;->getTitle()Ls9/d;

    move-result-object v0

    if-nez v0, :cond_8

    move-object/from16 v26, v11

    goto :goto_5

    :cond_8
    const/4 v2, 0x0

    invoke-static {v0, v11, v2}, Lsa/a;->a(Ls9/d;LT/l;I)LL0/d;

    move-result-object v0

    sget-object v2, LW0/j;->b:LW0/j$a;

    invoke-virtual {v2}, LW0/j$a;->a()I

    move-result v5

    sget-object v2, LW0/t;->a:LW0/t$a;

    invoke-virtual {v2}, LW0/t$a;->b()I

    move-result v15

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v11, v3}, Lla/a;->c(LT/l;I)Lpa/c;

    move-result-object v6

    invoke-virtual {v6}, Lpa/c;->b()Lpa/b;

    move-result-object v6

    invoke-virtual {v6}, Lpa/b;->a()LL0/U;

    move-result-object v21

    invoke-virtual {v2, v11, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->f()Lma/a$f;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$f;->a()J

    move-result-wide v2

    invoke-static {v5}, LW0/j;->h(I)LW0/j;

    move-result-object v12

    shl-int/lit8 v4, v4, 0x3

    and-int/lit8 v23, v4, 0x70

    const/16 v24, 0xc30

    const v25, 0x1d5f8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 v26, v11

    move-object/from16 v11, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v13, v16

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v1, p0

    move-object/from16 v22, v26

    invoke-static/range {v0 .. v25}, LN/a1;->c(LL0/d;Landroidx/compose/ui/e;JJLQ0/v;LQ0/A;LQ0/k;JLW0/k;LW0/j;JIZIILjava/util/Map;Lmh/l;LL0/U;LT/l;III)V

    :goto_5
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-static {}, LT/o;->P()V

    :cond_9
    :goto_6
    invoke-interface/range {v26 .. v26}, LT/l;->z()LT/X0;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v1, Lcom/ui/wifiman/ui/component/network/s;

    move-object/from16 v2, p0

    move-object/from16 v3, p1

    move/from16 v4, p3

    invoke-direct {v1, v2, v3, v4}, Lcom/ui/wifiman/ui/component/network/s;-><init>(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;I)V

    invoke-interface {v0, v1}, LT/X0;->a(Lmh/p;)V

    :cond_a
    return-void
.end method

.method private static final w(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;ILT/l;I)LYg/J;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, LT/L0;->a(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcom/ui/wifiman/ui/component/network/B;->v(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;LT/l;I)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final x(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JIILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-wide/from16 v6, p5

    move-object/from16 v8, p9

    move/from16 v10, p8

    invoke-static/range {v1 .. v10}, Lcom/ui/wifiman/ui/component/network/B;->s(Landroidx/compose/ui/e;Lcom/ui/wifiman/ui/component/network/q$b;Lmh/q;Lmh/q;Lmh/q;JLT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic y(LT/l;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ui/wifiman/ui/component/network/B;->m(LT/l;I)V

    return-void
.end method

.method public static final synthetic z()LT/H0;
    .locals 1

    sget-object v0, Lcom/ui/wifiman/ui/component/network/B;->a:LT/H0;

    return-object v0
.end method
