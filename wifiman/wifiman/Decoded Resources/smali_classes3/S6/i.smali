.class public abstract LS6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, LY0/b;->b:LY0/b$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, LY0/b$a;->c(II)J

    move-result-wide v0

    sput-wide v0, LS6/i;->a:J

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p9}, LS6/i;->e(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;LT/l;II)V
    .locals 21

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p3

    move-object/from16 v10, p5

    move/from16 v11, p7

    const-string/jumbo v0, "executeImageRequest"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "imageOptions"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "content"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x2cd0dff3    # -7.52157E11f

    move-object/from16 v1, p6

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v15

    and-int/lit8 v1, p8, 0x1

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v1, v11, 0x6

    goto :goto_2

    :cond_0
    and-int/lit8 v1, v11, 0x6

    if-nez v1, :cond_3

    and-int/lit8 v1, v11, 0x8

    if-nez v1, :cond_1

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_1
    invoke-interface {v15, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_1

    :cond_2
    const/4 v1, 0x2

    :goto_1
    or-int/2addr v1, v11

    goto :goto_2

    :cond_3
    move v1, v11

    :goto_2
    and-int/lit8 v4, p8, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v1, v1, 0x30

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v11, 0x30

    if-nez v4, :cond_6

    invoke-interface {v15, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v1, v4

    :cond_6
    :goto_4
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_8

    or-int/lit16 v1, v1, 0x180

    :cond_7
    move-object/from16 v5, p2

    goto :goto_6

    :cond_8
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_7

    move-object/from16 v5, p2

    invoke-interface {v15, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x100

    goto :goto_5

    :cond_9
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v1, v6

    :goto_6
    and-int/lit8 v6, p8, 0x8

    const/16 v12, 0x800

    if-eqz v6, :cond_a

    or-int/lit16 v1, v1, 0xc00

    goto :goto_8

    :cond_a
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_c

    invoke-interface {v15, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    move v6, v12

    goto :goto_7

    :cond_b
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v1, v6

    :cond_c
    :goto_8
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_e

    or-int/lit16 v1, v1, 0x6000

    :cond_d
    move-object/from16 v13, p4

    goto :goto_a

    :cond_e
    and-int/lit16 v13, v11, 0x6000

    if-nez v13, :cond_d

    move-object/from16 v13, p4

    invoke-interface {v15, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/16 v14, 0x4000

    goto :goto_9

    :cond_f
    const/16 v14, 0x2000

    :goto_9
    or-int/2addr v1, v14

    :goto_a
    and-int/lit8 v14, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v14, :cond_11

    or-int v1, v1, v16

    :cond_10
    :goto_b
    move v14, v1

    goto :goto_d

    :cond_11
    and-int v14, v11, v16

    if-nez v14, :cond_10

    invoke-interface {v15, v10}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    const/high16 v14, 0x20000

    goto :goto_c

    :cond_12
    const/high16 v14, 0x10000

    :goto_c
    or-int/2addr v1, v14

    goto :goto_b

    :goto_d
    const v1, 0x12493

    and-int/2addr v1, v14

    const v2, 0x12492

    if-ne v1, v2, :cond_14

    invoke-interface {v15}, LT/l;->v()Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v15}, LT/l;->C()V

    move-object v3, v5

    move-object v5, v13

    move-object v1, v15

    goto/16 :goto_12

    :cond_14
    :goto_e
    if-eqz v4, :cond_15

    sget-object v1, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    move-object v5, v1

    :cond_15
    const/4 v1, 0x0

    if-eqz v6, :cond_16

    move-object/from16 v19, v1

    goto :goto_f

    :cond_16
    move-object/from16 v19, v13

    :goto_f
    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_17

    const/4 v2, -0x1

    const-string/jumbo v4, "com.skydoves.landscapist.ImageLoad (ImageLoad.kt:53)"

    invoke-static {v0, v14, v2, v4}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_17
    const v0, 0x3ca5bbac

    invoke-interface {v15, v0}, LT/l;->U(I)V

    and-int/lit8 v0, v14, 0xe

    const/4 v2, 0x0

    const/4 v13, 0x1

    if-eq v0, v3, :cond_19

    and-int/lit8 v0, v14, 0x8

    if-eqz v0, :cond_18

    invoke-interface {v15, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_18

    goto :goto_10

    :cond_18
    move v0, v2

    goto :goto_11

    :cond_19
    :goto_10
    move v0, v13

    :goto_11
    and-int/lit16 v3, v14, 0x1c00

    if-ne v3, v12, :cond_1a

    move v2, v13

    :cond_1a
    or-int/2addr v0, v2

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1b

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_1c

    :cond_1b
    sget-object v0, LS6/j$c;->a:LS6/j$c;

    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v2

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    move-object v6, v2

    check-cast v6, LT/q0;

    invoke-interface {v15}, LT/l;->J()V

    const v0, 0x3ca5cdaa

    invoke-interface {v15, v0}, LT/l;->U(I)V

    invoke-interface {v15, v8}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    invoke-interface {v15, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-interface {v15}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1d

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v2, v0, :cond_1e

    :cond_1d
    new-instance v2, LS6/i$a;

    invoke-direct {v2, v8, v6, v1}, LS6/i$a;-><init>(Lmh/l;LT/q0;Ldh/e;)V

    invoke-interface {v15, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1e
    check-cast v2, Lmh/p;

    invoke-interface {v15}, LT/l;->J()V

    and-int/lit8 v0, v14, 0xe

    shr-int/lit8 v1, v14, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    invoke-static {v7, v9, v2, v15, v0}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    invoke-static {v5, v9}, LS6/m;->b(Landroidx/compose/ui/e;LS6/k;)Landroidx/compose/ui/e;

    move-result-object v12

    new-instance v4, LS6/i$b;

    move-object v0, v4

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, v19

    move-object v7, v4

    move v4, v14

    move-object/from16 v20, v5

    move-object/from16 v5, p5

    invoke-direct/range {v0 .. v6}, LS6/i$b;-><init>(Ljava/lang/Object;LS6/k;LU6/a;ILmh/r;LT/q0;)V

    const/16 v0, 0x36

    const v1, -0x3603b309

    invoke-static {v1, v13, v7, v15, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v0

    const/16 v17, 0xd80

    const/16 v18, 0x2

    const/4 v13, 0x0

    const/4 v14, 0x1

    move-object v1, v15

    move-object v15, v0

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v18}, Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    move-object/from16 v5, v19

    move-object/from16 v3, v20

    :goto_12
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_20

    new-instance v13, LS6/h;

    move-object v0, v13

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, LS6/h;-><init>(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;II)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_20
    return-void
.end method

.method private static final c(LT/q0;)LS6/j;
    .locals 0

    invoke-interface {p0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LS6/j;

    return-object p0
.end method

.method private static final d(LT/q0;LS6/j;)V
    .locals 0

    invoke-interface {p0, p1}, LT/q0;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final e(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;IILT/l;I)LYg/J;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p8

    move/from16 v9, p7

    invoke-static/range {v1 .. v9}, LS6/i;->b(Ljava/lang/Object;Lmh/l;Landroidx/compose/ui/e;LS6/k;LU6/a;Lmh/r;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final synthetic f(LT/q0;)LS6/j;
    .locals 0

    invoke-static {p0}, LS6/i;->c(LT/q0;)LS6/j;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(LT/q0;LS6/j;)V
    .locals 0

    invoke-static {p0, p1}, LS6/i;->d(LT/q0;LS6/j;)V

    return-void
.end method

.method public static final synthetic h(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, LS6/i;->i(Lmh/l;Ldh/e;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lmh/l;Ldh/e;)Ljava/lang/Object;
    .locals 1

    new-instance p1, LS6/i$c;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, LS6/i$c;-><init>(Lmh/l;Ldh/e;)V

    invoke-static {p1}, LLi/i;->A(Lmh/p;)LLi/g;

    move-result-object p0

    new-instance p1, LS6/i$d;

    invoke-direct {p1, v0}, LS6/i$d;-><init>(Ldh/e;)V

    invoke-static {p0, p1}, LLi/i;->f(LLi/g;Lmh/q;)LLi/g;

    move-result-object p0

    invoke-static {p0}, LLi/i;->n(LLi/g;)LLi/g;

    move-result-object p0

    invoke-static {}, LW6/a;->a()LIi/J;

    move-result-object p1

    invoke-static {p0, p1}, LLi/i;->C(LLi/g;Ldh/i;)LLi/g;

    move-result-object p0

    return-object p0
.end method
