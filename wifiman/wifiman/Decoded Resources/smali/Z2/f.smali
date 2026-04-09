.class public abstract LZ2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lc0/k;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, LZ2/f$a;

    const-string v1, "pagetitle"

    const-string v2, "lastloaded"

    const-string v3, "bundle"

    invoke-direct {v0, v1, v2, v3}, LZ2/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, LZ2/f$b;

    invoke-direct {v4, v1, v2, v3}, LZ2/f$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lc0/b;->a(Lmh/p;Lmh/l;)Lc0/k;

    move-result-object v0

    sput-object v0, LZ2/f;->a:Lc0/k;

    return-void
.end method

.method public static final a(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
    .locals 18

    move-object/from16 v1, p0

    move/from16 v12, p12

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "layoutParams"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x5386ce65

    move-object/from16 v3, p10

    invoke-interface {v3, v0}, LT/l;->r(I)LT/l;

    move-result-object v3

    and-int/lit8 v4, v12, 0x4

    if-eqz v4, :cond_0

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v5, v12, 0x8

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move/from16 v5, p3

    :goto_1
    and-int/lit8 v7, v12, 0x10

    const/4 v8, 0x0

    const/4 v9, 0x0

    if-eqz v7, :cond_2

    invoke-static {v8, v3, v9, v6}, LZ2/f;->c(LIi/N;LT/l;II)LZ2/g;

    move-result-object v7

    const v10, -0xe001

    and-int v10, p11, v10

    goto :goto_2

    :cond_2
    move-object/from16 v7, p4

    move/from16 v10, p11

    :goto_2
    and-int/lit8 v11, v12, 0x20

    if-eqz v11, :cond_3

    sget-object v11, LZ2/f$m;->a:LZ2/f$m;

    goto :goto_3

    :cond_3
    move-object/from16 v11, p5

    :goto_3
    and-int/lit8 v13, v12, 0x40

    if-eqz v13, :cond_4

    sget-object v13, LZ2/f$n;->a:LZ2/f$n;

    goto :goto_4

    :cond_4
    move-object/from16 v13, p6

    :goto_4
    and-int/lit16 v14, v12, 0x80

    if-eqz v14, :cond_6

    const v14, 0x51b3502b

    invoke-interface {v3, v14}, LT/l;->e(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, LT/l;->a:LT/l$a;

    invoke-virtual {v15}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v15

    if-ne v14, v15, :cond_5

    new-instance v14, LZ2/b;

    invoke-direct {v14}, LZ2/b;-><init>()V

    invoke-interface {v3, v14}, LT/l;->K(Ljava/lang/Object;)V

    :cond_5
    check-cast v14, LZ2/b;

    invoke-interface {v3}, LT/l;->P()V

    const v15, -0x1c00001

    and-int/2addr v10, v15

    goto :goto_5

    :cond_6
    move-object/from16 v14, p7

    :goto_5
    and-int/lit16 v15, v12, 0x100

    if-eqz v15, :cond_8

    const v15, 0x51b35083

    invoke-interface {v3, v15}, LT/l;->e(I)V

    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v15

    sget-object v16, LT/l;->a:LT/l$a;

    invoke-virtual/range {v16 .. v16}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v6

    if-ne v15, v6, :cond_7

    new-instance v15, LZ2/a;

    invoke-direct {v15}, LZ2/a;-><init>()V

    invoke-interface {v3, v15}, LT/l;->K(Ljava/lang/Object;)V

    :cond_7
    move-object v6, v15

    check-cast v6, LZ2/a;

    invoke-interface {v3}, LT/l;->P()V

    const v15, -0xe000001

    and-int/2addr v10, v15

    move/from16 v17, v10

    move-object v10, v6

    move/from16 v6, v17

    goto :goto_6

    :cond_8
    move v6, v10

    move-object/from16 v10, p8

    :goto_6
    and-int/lit16 v15, v12, 0x200

    if-eqz v15, :cond_9

    move-object v15, v8

    goto :goto_7

    :cond_9
    move-object/from16 v15, p9

    :goto_7
    invoke-static {}, LT/o;->H()Z

    move-result v16

    if-eqz v16, :cond_a

    const/4 v8, -0x1

    const-string v9, "com.google.accompanist.web.WebView (WebView.kt:180)"

    invoke-static {v0, v6, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_a
    invoke-virtual/range {p0 .. p0}, LZ2/h;->g()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v5, :cond_b

    invoke-virtual {v7}, LZ2/g;->b()Z

    move-result v8

    if-eqz v8, :cond_b

    const/4 v8, 0x1

    goto :goto_8

    :cond_b
    const/4 v8, 0x0

    :goto_8
    new-instance v9, LZ2/f$c;

    invoke-direct {v9, v0}, LZ2/f$c;-><init>(Landroid/webkit/WebView;)V

    const/4 v2, 0x0

    invoke-static {v8, v9, v3, v2, v2}, Ld/a;->a(ZLmh/a;LT/l;II)V

    const v8, 0x51b3516b

    invoke-interface {v3, v8}, LT/l;->e(I)V

    if-nez v0, :cond_c

    goto :goto_9

    :cond_c
    new-instance v8, LZ2/f$d;

    const/4 v9, 0x0

    invoke-direct {v8, v7, v0, v9}, LZ2/f$d;-><init>(LZ2/g;Landroid/webkit/WebView;Ldh/e;)V

    shr-int/lit8 v16, v6, 0x9

    and-int/lit8 v2, v16, 0x70

    or-int/lit16 v2, v2, 0x208

    invoke-static {v0, v7, v8, v3, v2}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    new-instance v2, LZ2/f$e;

    invoke-direct {v2, v1, v0, v9}, LZ2/f$e;-><init>(LZ2/h;Landroid/webkit/WebView;Ldh/e;)V

    shl-int/lit8 v8, v6, 0x3

    and-int/lit8 v8, v8, 0x70

    or-int/lit16 v8, v8, 0x208

    invoke-static {v0, v1, v2, v3, v8}, LT/O;->e(Ljava/lang/Object;Ljava/lang/Object;Lmh/p;LT/l;I)V

    sget-object v0, LYg/J;->a:LYg/J;

    :goto_9
    invoke-interface {v3}, LT/l;->P()V

    invoke-virtual {v14, v1}, LZ2/b;->d(LZ2/h;)V

    invoke-virtual {v14, v7}, LZ2/b;->c(LZ2/g;)V

    invoke-virtual {v10, v1}, LZ2/a;->b(LZ2/h;)V

    new-instance v0, LZ2/f$f;

    move-object/from16 p2, v0

    move-object/from16 p3, v15

    move-object/from16 p4, v11

    move-object/from16 p5, p1

    move-object/from16 p6, p0

    move-object/from16 p7, v10

    move-object/from16 p8, v14

    invoke-direct/range {p2 .. p8}, LZ2/f$f;-><init>(Lmh/l;Lmh/l;Landroid/widget/FrameLayout$LayoutParams;LZ2/h;LZ2/a;LZ2/b;)V

    const v2, 0x51b358df

    invoke-interface {v3, v2}, LT/l;->e(I)V

    const/high16 v2, 0x380000

    and-int v2, p11, v2

    const/high16 v8, 0x180000

    xor-int/2addr v2, v8

    const/high16 v9, 0x100000

    if-le v2, v9, :cond_d

    invoke-interface {v3, v13}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    and-int v2, p11, v8

    if-ne v2, v9, :cond_f

    :cond_e
    const/4 v2, 0x1

    goto :goto_a

    :cond_f
    const/4 v2, 0x0

    :goto_a
    invoke-interface {v3}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_10

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v8, v2, :cond_11

    :cond_10
    new-instance v8, LZ2/f$g;

    invoke-direct {v8, v13}, LZ2/f$g;-><init>(Lmh/l;)V

    invoke-interface {v3, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_11
    move-object v2, v8

    check-cast v2, Lmh/l;

    invoke-interface {v3}, LT/l;->P()V

    shr-int/lit8 v6, v6, 0x3

    and-int/lit8 v6, v6, 0x70

    const/16 v8, 0x14

    const/4 v9, 0x0

    const/16 v16, 0x0

    move-object/from16 p2, v0

    move-object/from16 p3, v4

    move-object/from16 p4, v9

    move-object/from16 p5, v2

    move-object/from16 p6, v16

    move-object/from16 p7, v3

    move/from16 p8, v6

    move/from16 p9, v8

    invoke-static/range {p2 .. p9}, Landroidx/compose/ui/viewinterop/e;->b(Lmh/l;Landroidx/compose/ui/e;Lmh/l;Lmh/l;Lmh/l;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-static {}, LT/o;->P()V

    :cond_12
    invoke-interface {v3}, LT/l;->z()LT/X0;

    move-result-object v9

    if-eqz v9, :cond_13

    new-instance v8, LZ2/f$h;

    move-object v0, v8

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object v3, v4

    move v4, v5

    move-object v5, v7

    move-object v6, v11

    move-object v7, v13

    move-object v13, v8

    move-object v8, v14

    move-object v14, v9

    move-object v9, v10

    move-object v10, v15

    move/from16 v11, p11

    move/from16 v12, p12

    invoke-direct/range {v0 .. v12}, LZ2/f$h;-><init>(LZ2/h;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;II)V

    invoke-interface {v14, v13}, LT/X0;->a(Lmh/p;)V

    :cond_13
    return-void
.end method

.method public static final b(LZ2/h;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;LT/l;II)V
    .locals 19

    move-object/from16 v1, p0

    move/from16 v10, p10

    move/from16 v11, p11

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x57d06ac9

    move-object/from16 v2, p9

    invoke-interface {v2, v0}, LT/l;->r(I)LT/l;

    move-result-object v2

    and-int/lit8 v3, v11, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v3, v10, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v10, 0xe

    if-nez v3, :cond_2

    invoke-interface {v2, v1}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v10

    goto :goto_1

    :cond_2
    move v3, v10

    :goto_1
    and-int/lit8 v4, v11, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v10, 0x70

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v2, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, v11, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v10, 0x380

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-interface {v2, v7}, LT/l;->c(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v3, v8

    :goto_5
    and-int/lit16 v8, v10, 0x1c00

    if-nez v8, :cond_b

    and-int/lit8 v8, v11, 0x8

    if-nez v8, :cond_9

    move-object/from16 v8, p3

    invoke-interface {v2, v8}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x800

    goto :goto_6

    :cond_9
    move-object/from16 v8, p3

    :cond_a
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    goto :goto_7

    :cond_b
    move-object/from16 v8, p3

    :goto_7
    and-int/lit8 v9, v11, 0x10

    if-eqz v9, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move-object/from16 v12, p4

    goto :goto_9

    :cond_d
    const v12, 0xe000

    and-int/2addr v12, v10

    if-nez v12, :cond_c

    move-object/from16 v12, p4

    invoke-interface {v2, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    and-int/lit8 v13, v11, 0x20

    if-eqz v13, :cond_10

    const/high16 v14, 0x30000

    or-int/2addr v3, v14

    :cond_f
    move-object/from16 v14, p5

    goto :goto_b

    :cond_10
    const/high16 v14, 0x70000

    and-int/2addr v14, v10

    if-nez v14, :cond_f

    move-object/from16 v14, p5

    invoke-interface {v2, v14}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_11
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v3, v15

    :goto_b
    and-int/lit8 v15, v11, 0x40

    if-eqz v15, :cond_12

    const/high16 v16, 0x80000

    or-int v3, v3, v16

    :cond_12
    and-int/lit16 v0, v11, 0x80

    if-eqz v0, :cond_13

    const/high16 v17, 0x400000

    or-int v3, v3, v17

    :cond_13
    and-int/lit16 v1, v11, 0x100

    if-eqz v1, :cond_14

    const/high16 v17, 0x6000000

    or-int v3, v3, v17

    move-object/from16 v5, p8

    goto :goto_d

    :cond_14
    const/high16 v17, 0xe000000

    and-int v17, v10, v17

    move-object/from16 v5, p8

    if-nez v17, :cond_16

    invoke-interface {v2, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_15

    const/high16 v17, 0x4000000

    goto :goto_c

    :cond_15
    const/high16 v17, 0x2000000

    :goto_c
    or-int v3, v3, v17

    :cond_16
    :goto_d
    and-int/lit16 v5, v11, 0xc0

    const/16 v7, 0xc0

    if-ne v5, v7, :cond_18

    const v5, 0xb6db6db

    and-int/2addr v5, v3

    const v7, 0x2492492

    if-ne v5, v7, :cond_18

    invoke-interface {v2}, LT/l;->v()Z

    move-result v5

    if-nez v5, :cond_17

    goto :goto_e

    :cond_17
    invoke-interface {v2}, LT/l;->C()V

    move-object/from16 v4, p1

    move/from16 v3, p2

    move-object/from16 v7, p6

    move-object v6, v8

    move-object v5, v12

    move-object v9, v14

    move-object/from16 v8, p7

    move-object/from16 v12, p8

    goto/16 :goto_18

    :cond_18
    :goto_e
    invoke-interface {v2}, LT/l;->q()V

    and-int/lit8 v5, v10, 0x1

    const v17, -0x380001

    if-eqz v5, :cond_1d

    invoke-interface {v2}, LT/l;->H()Z

    move-result v5

    if-eqz v5, :cond_19

    goto :goto_f

    :cond_19
    invoke-interface {v2}, LT/l;->C()V

    and-int/lit8 v1, v11, 0x8

    if-eqz v1, :cond_1a

    and-int/lit16 v3, v3, -0x1c01

    :cond_1a
    if-eqz v15, :cond_1b

    and-int v3, v3, v17

    :cond_1b
    if-eqz v0, :cond_1c

    const v0, -0x1c00001

    and-int/2addr v3, v0

    :cond_1c
    move-object/from16 v4, p1

    move/from16 v5, p2

    move-object/from16 v0, p7

    move-object/from16 v7, p8

    move-object v6, v8

    move-object v8, v12

    move-object v9, v14

    move-object/from16 v12, p6

    goto/16 :goto_17

    :cond_1d
    :goto_f
    if-eqz v4, :cond_1e

    sget-object v4, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_10

    :cond_1e
    move-object/from16 v4, p1

    :goto_10
    if-eqz v6, :cond_1f

    const/4 v5, 0x1

    goto :goto_11

    :cond_1f
    move/from16 v5, p2

    :goto_11
    and-int/lit8 v6, v11, 0x8

    const/4 v7, 0x0

    if-eqz v6, :cond_20

    const/4 v6, 0x0

    const/4 v8, 0x1

    invoke-static {v7, v2, v6, v8}, LZ2/f;->c(LIi/N;LT/l;II)LZ2/g;

    move-result-object v6

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_12

    :cond_20
    move-object v6, v8

    :goto_12
    if-eqz v9, :cond_21

    sget-object v8, LZ2/f$i;->a:LZ2/f$i;

    goto :goto_13

    :cond_21
    move-object v8, v12

    :goto_13
    if-eqz v13, :cond_22

    sget-object v9, LZ2/f$j;->a:LZ2/f$j;

    goto :goto_14

    :cond_22
    move-object v9, v14

    :goto_14
    if-eqz v15, :cond_24

    const v12, 0x51b343d1

    invoke-interface {v2, v12}, LT/l;->e(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v12, v13, :cond_23

    new-instance v12, LZ2/b;

    invoke-direct {v12}, LZ2/b;-><init>()V

    invoke-interface {v2, v12}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    check-cast v12, LZ2/b;

    invoke-interface {v2}, LT/l;->P()V

    and-int v3, v3, v17

    goto :goto_15

    :cond_24
    move-object/from16 v12, p6

    :goto_15
    if-eqz v0, :cond_26

    const v0, 0x51b34429

    invoke-interface {v2, v0}, LT/l;->e(I)V

    invoke-interface {v2}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v13, LT/l;->a:LT/l$a;

    invoke-virtual {v13}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v13

    if-ne v0, v13, :cond_25

    new-instance v0, LZ2/a;

    invoke-direct {v0}, LZ2/a;-><init>()V

    invoke-interface {v2, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_25
    check-cast v0, LZ2/a;

    invoke-interface {v2}, LT/l;->P()V

    const v13, -0x1c00001

    and-int/2addr v3, v13

    goto :goto_16

    :cond_26
    move-object/from16 v0, p7

    :goto_16
    if-eqz v1, :cond_27

    goto :goto_17

    :cond_27
    move-object/from16 v7, p8

    :goto_17
    invoke-interface {v2}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_28

    const/4 v1, -0x1

    const-string v13, "com.google.accompanist.web.WebView (WebView.kt:100)"

    const v14, 0x57d06ac9

    invoke-static {v14, v3, v1, v13}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_28
    new-instance v1, LZ2/f$k;

    move-object/from16 p1, v1

    move-object/from16 p2, p0

    move/from16 p3, v5

    move-object/from16 p4, v6

    move-object/from16 p5, v8

    move-object/from16 p6, v9

    move-object/from16 p7, v12

    move-object/from16 p8, v0

    move-object/from16 p9, v7

    invoke-direct/range {p1 .. p9}, LZ2/f$k;-><init>(LZ2/h;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;)V

    const v13, -0x5fba294d

    const/4 v14, 0x1

    invoke-static {v2, v13, v14, v1}, Lb0/c;->b(LT/l;IZLjava/lang/Object;)Lb0/a;

    move-result-object v1

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int/lit16 v3, v3, 0xc00

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 p1, v4

    move-object/from16 p2, v14

    move/from16 p3, v15

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move/from16 p6, v3

    move/from16 p7, v13

    invoke-static/range {p1 .. p7}, Lz/e;->a(Landroidx/compose/ui/e;Lf0/c;ZLmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_29

    invoke-static {}, LT/o;->P()V

    :cond_29
    move v3, v5

    move-object v5, v8

    move-object v8, v0

    move-object/from16 v18, v12

    move-object v12, v7

    move-object/from16 v7, v18

    :goto_18
    invoke-interface {v2}, LT/l;->z()LT/X0;

    move-result-object v13

    if-eqz v13, :cond_2a

    new-instance v14, LZ2/f$l;

    move-object v0, v14

    move-object/from16 v1, p0

    move-object v2, v4

    move-object v4, v6

    move-object v6, v9

    move-object v9, v12

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LZ2/f$l;-><init>(LZ2/h;Landroidx/compose/ui/e;ZLZ2/g;Lmh/l;Lmh/l;LZ2/b;LZ2/a;Lmh/l;II)V

    invoke-interface {v13, v14}, LT/X0;->a(Lmh/p;)V

    :cond_2a
    return-void
.end method

.method public static final c(LIi/N;LT/l;II)LZ2/g;
    .locals 2

    const v0, 0x5f8182fe

    invoke-interface {p1, v0}, LT/l;->e(I)V

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_1

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p0

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p0, p3, :cond_0

    sget-object p0, Ldh/j;->a:Ldh/j;

    invoke-static {p0, p1}, LT/O;->i(Ldh/i;LT/l;)LIi/N;

    move-result-object p0

    new-instance p3, LT/A;

    invoke-direct {p3, p0}, LT/A;-><init>(LIi/N;)V

    invoke-interface {p1, p3}, LT/l;->K(Ljava/lang/Object;)V

    move-object p0, p3

    :cond_0
    check-cast p0, LT/A;

    invoke-virtual {p0}, LT/A;->a()LIi/N;

    move-result-object p0

    :cond_1
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, -0x1

    const-string v1, "com.google.accompanist.web.rememberWebViewNavigator (WebView.kt:691)"

    invoke-static {v0, p2, p3, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_2
    const p2, 0x3886ae9b

    invoke-interface {p1, p2}, LT/l;->e(I)V

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p2

    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_3

    sget-object p2, LT/l;->a:LT/l$a;

    invoke-virtual {p2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p2

    if-ne p3, p2, :cond_4

    :cond_3
    new-instance p3, LZ2/g;

    invoke-direct {p3, p0}, LZ2/g;-><init>(LIi/N;)V

    invoke-interface {p1, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_4
    check-cast p3, LZ2/g;

    invoke-interface {p1}, LT/l;->P()V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-static {}, LT/o;->P()V

    :cond_5
    invoke-interface {p1}, LT/l;->P()V

    return-object p3
.end method

.method public static final d(Ljava/lang/String;Ljava/util/Map;LT/l;II)LZ2/h;
    .locals 2

    const-string v0, "url"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x49ca974f

    invoke-interface {p2, v0}, LT/l;->e(I)V

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    invoke-static {}, LZg/U;->h()Ljava/util/Map;

    move-result-object p1

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p4

    if-eqz p4, :cond_1

    const/4 p4, -0x1

    const-string v1, "com.google.accompanist.web.rememberWebViewState (WebView.kt:736)"

    invoke-static {v0, p3, p4, v1}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    const p3, 0x17d7d559

    invoke-interface {p2, p3}, LT/l;->e(I)V

    invoke-interface {p2}, LT/l;->f()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, LT/l;->a:LT/l$a;

    invoke-virtual {p4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p4

    if-ne p3, p4, :cond_2

    new-instance p3, LZ2/h;

    new-instance p4, LZ2/d$b;

    invoke-direct {p4, p0, p1}, LZ2/d$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-direct {p3, p4}, LZ2/h;-><init>(LZ2/d;)V

    invoke-interface {p2, p3}, LT/l;->K(Ljava/lang/Object;)V

    :cond_2
    check-cast p3, LZ2/h;

    invoke-interface {p2}, LT/l;->P()V

    new-instance p4, LZ2/d$b;

    invoke-direct {p4, p0, p1}, LZ2/d$b;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    invoke-virtual {p3, p4}, LZ2/h;->h(LZ2/d;)V

    invoke-static {}, LT/o;->H()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, LT/o;->P()V

    :cond_3
    invoke-interface {p2}, LT/l;->P()V

    return-object p3
.end method
