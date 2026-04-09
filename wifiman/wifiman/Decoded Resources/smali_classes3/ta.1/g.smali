.class public final Lta/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lta/d;


# static fields
.field public static final a:I


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

.method public static synthetic b(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p12}, Lta/g;->d(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p10}, Lta/g;->f(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;
    .locals 13

    or-int/lit8 v0, p10, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v12

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p11

    invoke-virtual/range {v1 .. v12}, Lta/g;->a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private final e(Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V
    .locals 20

    move-object/from16 v2, p1

    move/from16 v9, p9

    const v0, 0x3a43afc7

    move-object/from16 v1, p8

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v3, v9, 0x6

    if-nez v3, :cond_1

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p2

    invoke-interface {v1, v4}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    goto :goto_3

    :cond_3
    move-object/from16 v4, p2

    :goto_3
    and-int/lit16 v5, v9, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p3

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    goto :goto_5

    :cond_5
    move-object/from16 v5, p3

    :goto_5
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_7

    move-object/from16 v6, p4

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_6

    :cond_6
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v3, v7

    goto :goto_7

    :cond_7
    move-object/from16 v6, p4

    :goto_7
    and-int/lit16 v7, v9, 0x6000

    if-nez v7, :cond_9

    move-object/from16 v7, p5

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_8

    :cond_8
    const/16 v8, 0x2000

    :goto_8
    or-int/2addr v3, v8

    goto :goto_9

    :cond_9
    move-object/from16 v7, p5

    :goto_9
    const/high16 v8, 0x30000

    and-int/2addr v8, v9

    if-nez v8, :cond_b

    move/from16 v8, p6

    invoke-interface {v1, v8}, LT/l;->g(F)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_a

    :cond_a
    const/high16 v10, 0x10000

    :goto_a
    or-int/2addr v3, v10

    goto :goto_b

    :cond_b
    move/from16 v8, p6

    :goto_b
    const/high16 v10, 0x180000

    and-int/2addr v10, v9

    move-object/from16 v15, p7

    if-nez v10, :cond_d

    invoke-interface {v1, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_c

    const/high16 v10, 0x100000

    goto :goto_c

    :cond_c
    const/high16 v10, 0x80000

    :goto_c
    or-int/2addr v3, v10

    :cond_d
    const v10, 0x92493

    and-int/2addr v10, v3

    const v11, 0x92492

    if-ne v10, v11, :cond_f

    invoke-interface {v1}, LT/l;->v()Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_d

    :cond_e
    invoke-interface {v1}, LT/l;->C()V

    goto :goto_e

    :cond_f
    :goto_d
    invoke-static {}, LT/o;->H()Z

    move-result v10

    if-eqz v10, :cond_10

    const/4 v10, -0x1

    const-string/jumbo v11, "com.ui.core.ui.util.img.UiImageLoaderDefault.LocalImage (UiImageLoaderDefault.kt:20)"

    invoke-static {v0, v3, v10, v11}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_10
    and-int/lit8 v0, v3, 0xe

    invoke-static {v2, v1, v0}, Lta/c;->i(Ls9/a$b;LT/l;I)Lr0/d;

    move-result-object v10

    shr-int/lit8 v0, v3, 0x3

    and-int/lit8 v0, v0, 0x70

    shl-int/lit8 v11, v3, 0x3

    and-int/lit16 v11, v11, 0x380

    or-int/2addr v0, v11

    and-int/lit16 v11, v3, 0x1c00

    or-int/2addr v0, v11

    const v11, 0xe000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v3

    or-int/2addr v0, v11

    const/high16 v11, 0x380000

    and-int/2addr v3, v11

    or-int v18, v0, v3

    const/16 v19, 0x0

    move-object/from16 v11, p3

    move-object/from16 v12, p2

    move-object/from16 v13, p4

    move-object/from16 v14, p5

    move/from16 v15, p6

    move-object/from16 v16, p7

    move-object/from16 v17, v1

    invoke-static/range {v10 .. v19}, Ls/F;->a(Lr0/d;Ljava/lang/String;Landroidx/compose/ui/e;Lf0/c;LC0/h;FLm0/w0;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-static {}, LT/o;->P()V

    :cond_11
    :goto_e
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_12

    new-instance v11, Lta/f;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lta/f;-><init>(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;I)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_12
    return-void
.end method

.method private static final f(Lta/g;Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;ILT/l;I)LYg/J;
    .locals 11

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p9

    invoke-direct/range {v1 .. v10}, Lta/g;->e(Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method


# virtual methods
.method public a(Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v13, p2

    move-object/from16 v14, p6

    move-object/from16 v15, p7

    move/from16 v1, p11

    const-string/jumbo v0, "img"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "modifier"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "alignment"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentScale"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x6cc3e154

    move-object/from16 v3, p10

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v12

    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_1

    invoke-interface {v12, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_3

    invoke-interface {v12, v13}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v1, 0x6000

    move-object/from16 v11, p5

    if-nez v4, :cond_5

    invoke-interface {v12, v11}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x4000

    goto :goto_3

    :cond_4
    const/16 v4, 0x2000

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    const/high16 v4, 0x30000

    and-int/2addr v4, v1

    if-nez v4, :cond_7

    invoke-interface {v12, v14}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x20000

    goto :goto_4

    :cond_6
    const/high16 v4, 0x10000

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    const/high16 v4, 0x180000

    and-int/2addr v4, v1

    if-nez v4, :cond_9

    invoke-interface {v12, v15}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x100000

    goto :goto_5

    :cond_8
    const/high16 v4, 0x80000

    :goto_5
    or-int/2addr v3, v4

    :cond_9
    const/high16 v4, 0xc00000

    and-int/2addr v4, v1

    move/from16 v10, p8

    if-nez v4, :cond_b

    invoke-interface {v12, v10}, LT/l;->g(F)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x800000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x400000

    :goto_6
    or-int/2addr v3, v4

    :cond_b
    const/high16 v4, 0x6000000

    and-int/2addr v4, v1

    move-object/from16 v9, p9

    if-nez v4, :cond_d

    invoke-interface {v12, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x4000000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x2000000

    :goto_7
    or-int/2addr v3, v4

    :cond_d
    const/high16 v4, 0x30000000

    and-int/2addr v4, v1

    move-object/from16 v8, p0

    if-nez v4, :cond_f

    invoke-interface {v12, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/high16 v4, 0x20000000

    goto :goto_8

    :cond_e
    const/high16 v4, 0x10000000

    :goto_8
    or-int/2addr v3, v4

    :cond_f
    const v4, 0x12492013

    and-int/2addr v4, v3

    const v5, 0x12492012

    if-ne v4, v5, :cond_11

    invoke-interface {v12}, LT/l;->v()Z

    move-result v4

    if-nez v4, :cond_10

    goto :goto_9

    :cond_10
    invoke-interface {v12}, LT/l;->C()V

    move-object/from16 v16, v12

    goto :goto_a

    :cond_11
    :goto_9
    invoke-static {}, LT/o;->H()Z

    move-result v4

    if-eqz v4, :cond_12

    const/4 v4, -0x1

    const-string/jumbo v5, "com.ui.core.ui.util.img.UiImageLoaderDefault.Image (UiImageLoaderDefault.kt:43)"

    invoke-static {v0, v3, v4, v5}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_12
    instance-of v0, v2, Ls9/a$b;

    if-eqz v0, :cond_15

    move-object v4, v2

    check-cast v4, Ls9/a$b;

    and-int/lit8 v0, v3, 0x70

    shr-int/lit8 v3, v3, 0x6

    and-int/lit16 v5, v3, 0x380

    or-int/2addr v0, v5

    and-int/lit16 v5, v3, 0x1c00

    or-int/2addr v0, v5

    const v5, 0xe000

    and-int/2addr v5, v3

    or-int/2addr v0, v5

    const/high16 v5, 0x70000

    and-int/2addr v5, v3

    or-int/2addr v0, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v3

    or-int/2addr v0, v5

    const/high16 v5, 0x1c00000

    and-int/2addr v3, v5

    or-int/2addr v0, v3

    move-object/from16 v3, p0

    move-object/from16 v5, p2

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object v11, v12

    move-object/from16 v16, v12

    move v12, v0

    invoke-direct/range {v3 .. v12}, Lta/g;->e(Ls9/a$b;Landroidx/compose/ui/e;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;LT/l;I)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_13

    invoke-static {}, LT/o;->P()V

    :cond_13
    :goto_a
    invoke-interface/range {v16 .. v16}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_14

    new-instance v11, Lta/e;

    move-object v0, v11

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object v13, v11

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lta/e;-><init>(Lta/g;Ls9/a;Landroidx/compose/ui/e;Ls9/a$b;Ls9/a$b;Ljava/lang/String;Lf0/c;LC0/h;FLm0/w0;I)V

    invoke-interface {v12, v13}, LT/X0;->a(Lmh/p;)V

    :cond_14
    return-void

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DefaultCommonImageLoader doesn\'t support images remote image sources, import any of core-ui-img libs or provide custom implementation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
