.class public abstract LD9/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LE/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xc

    int-to-float v0, v0

    invoke-static {v0}, LY0/h;->j(F)F

    move-result v0

    invoke-static {v0}, LE/h;->d(F)LE/g;

    move-result-object v0

    sput-object v0, LD9/k;->a:LE/g;

    return-void
.end method

.method public static synthetic a(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, LD9/k;->l(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(LY0/n;LY0/r;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LD9/k;->q(LY0/n;LY0/r;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()LYg/J;
    .locals 1

    invoke-static {}, LD9/k;->p()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(LY0/n;LY0/r;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LD9/k;->n(LY0/n;LY0/r;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(LD9/p;)LD9/o;
    .locals 0

    invoke-static {p0}, LD9/k;->w(LD9/p;)LD9/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(LT/q0;)LYg/J;
    .locals 0

    invoke-static {p0}, LD9/k;->o(LT/q0;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;IILT/l;I)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p12}, LD9/k;->r(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;IILT/l;I)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()LYg/J;
    .locals 1

    invoke-static {}, LD9/k;->m()LYg/J;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(LD9/o;LC0/r;)LYg/J;
    .locals 0

    invoke-static {p0, p1}, LD9/k;->t(LD9/o;LC0/r;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static final j(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;LT/l;II)V
    .locals 19

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    const-string/jumbo v0, "content"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x22f7f95e

    move-object/from16 v1, p9

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v10, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v11, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v10

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v10

    :goto_1
    and-int/lit8 v5, v10, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v11, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-interface {v1, v5}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit8 v6, v11, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v10, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_4

    :cond_8
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    :goto_5
    and-int/lit8 v8, v11, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v12, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v12, v10, 0xc00

    if-nez v12, :cond_9

    move-object/from16 v12, p3

    invoke-interface {v1, v12}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v4, v13

    :goto_7
    and-int/lit16 v13, v10, 0x6000

    if-nez v13, :cond_e

    and-int/lit8 v13, v11, 0x10

    if-nez v13, :cond_c

    move-wide/from16 v13, p4

    invoke-interface {v1, v13, v14}, LT/l;->j(J)Z

    move-result v15

    if-eqz v15, :cond_d

    const/16 v15, 0x4000

    goto :goto_8

    :cond_c
    move-wide/from16 v13, p4

    :cond_d
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v4, v15

    goto :goto_9

    :cond_e
    move-wide/from16 v13, p4

    :goto_9
    and-int/lit8 v15, v11, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_f

    or-int v4, v4, v16

    move-object/from16 v0, p6

    goto :goto_b

    :cond_f
    and-int v16, v10, v16

    move-object/from16 v0, p6

    if-nez v16, :cond_11

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v17, 0x10000

    :goto_a
    or-int v4, v4, v17

    :cond_11
    :goto_b
    and-int/lit8 v17, v11, 0x40

    const/high16 v18, 0x180000

    if-eqz v17, :cond_12

    or-int v4, v4, v18

    move/from16 v3, p7

    goto :goto_d

    :cond_12
    and-int v18, v10, v18

    move/from16 v3, p7

    if-nez v18, :cond_14

    invoke-interface {v1, v3}, LT/l;->g(F)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v18, 0x80000

    :goto_c
    or-int v4, v4, v18

    :cond_14
    :goto_d
    and-int/lit16 v0, v11, 0x80

    const/high16 v18, 0xc00000

    if-eqz v0, :cond_15

    or-int v4, v4, v18

    goto :goto_f

    :cond_15
    and-int v0, v10, v18

    if-nez v0, :cond_17

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    const/high16 v0, 0x800000

    goto :goto_e

    :cond_16
    const/high16 v0, 0x400000

    :goto_e
    or-int/2addr v4, v0

    :cond_17
    :goto_f
    const v0, 0x492493

    and-int/2addr v0, v4

    const v2, 0x492492

    if-ne v0, v2, :cond_19

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_18

    goto :goto_10

    :cond_18
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move v8, v3

    move-object v3, v7

    move-object v4, v12

    move-object/from16 v7, p6

    goto/16 :goto_15

    :cond_19
    :goto_10
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v0, v10, 0x1

    if-eqz v0, :cond_1e

    invoke-interface {v1}, LT/l;->H()Z

    move-result v0

    if-eqz v0, :cond_1a

    goto :goto_11

    :cond_1a
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v0, v11, 0x1

    if-eqz v0, :cond_1b

    and-int/lit8 v4, v4, -0xf

    :cond_1b
    and-int/lit8 v0, v11, 0x2

    if-eqz v0, :cond_1c

    and-int/lit8 v4, v4, -0x71

    :cond_1c
    and-int/lit8 v0, v11, 0x10

    if-eqz v0, :cond_1d

    const v0, -0xe001

    and-int/2addr v4, v0

    :cond_1d
    move-object/from16 v0, p0

    move-object/from16 v2, p6

    goto/16 :goto_14

    :cond_1e
    :goto_11
    and-int/lit8 v0, v11, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1f

    const/4 v0, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v1, v2, v3}, LD9/k;->v(LD9/p;LT/l;II)LD9/o;

    move-result-object v0

    and-int/lit8 v4, v4, -0xf

    goto :goto_12

    :cond_1f
    move-object/from16 v0, p0

    :goto_12
    and-int/lit8 v3, v11, 0x2

    if-eqz v3, :cond_20

    invoke-static {v1, v2}, LD9/k;->u(LT/l;I)Landroidx/compose/ui/window/r;

    move-result-object v2

    and-int/lit8 v4, v4, -0x71

    move-object v5, v2

    :cond_20
    if-eqz v6, :cond_22

    const v2, -0x20cefe9

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_21

    new-instance v2, LD9/c;

    invoke-direct {v2}, LD9/c;-><init>()V

    invoke-interface {v1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_21
    check-cast v2, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    move-object v7, v2

    :cond_22
    if-eqz v8, :cond_24

    const v2, -0x20ce7c0

    invoke-interface {v1, v2}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, LT/l;->a:LT/l$a;

    invoke-virtual {v3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v2, v3, :cond_23

    new-instance v2, LD9/d;

    invoke-direct {v2}, LD9/d;-><init>()V

    invoke-interface {v1, v2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_23
    check-cast v2, Lmh/p;

    invoke-interface {v1}, LT/l;->J()V

    move-object v12, v2

    :cond_24
    and-int/lit8 v2, v11, 0x10

    if-eqz v2, :cond_25

    sget-object v2, Lla/a;->a:Lla/a;

    sget v3, Lla/a;->b:I

    invoke-virtual {v2, v1, v3}, Lla/a;->a(LT/l;I)Lma/a;

    move-result-object v2

    invoke-virtual {v2}, Lma/a;->e()Lma/a$e;

    move-result-object v2

    invoke-virtual {v2}, Lma/a$e;->c()Lr9/a$c;

    move-result-object v2

    invoke-virtual {v2}, Lr9/a$c;->c()J

    move-result-wide v2

    const v6, -0xe001

    and-int/2addr v4, v6

    move-wide v13, v2

    :cond_25
    if-eqz v15, :cond_26

    sget-object v2, LD9/k;->a:LE/g;

    goto :goto_13

    :cond_26
    move-object/from16 v2, p6

    :goto_13
    if-eqz v17, :cond_27

    const/4 v3, 0x2

    int-to-float v3, v3

    invoke-static {v3}, LY0/h;->j(F)F

    move-result v3

    goto :goto_14

    :cond_27
    move/from16 v3, p7

    :goto_14
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v6

    if-eqz v6, :cond_28

    const/4 v6, -0x1

    const-string/jumbo v8, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopup (AnchoredPopup.kt:137)"

    const v15, 0x22f7f95e

    invoke-static {v15, v4, v6, v8}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_28
    new-instance v6, LD9/k$a;

    move-object/from16 p0, v6

    move-object/from16 p1, v2

    move-wide/from16 p2, v13

    move/from16 p4, v3

    move-object/from16 p5, p8

    invoke-direct/range {p0 .. p5}, LD9/k$a;-><init>(Lm0/i1;JFLmh/p;)V

    const/16 v8, 0x36

    const v15, 0x64f6314a

    move-object/from16 p9, v2

    const/4 v2, 0x1

    invoke-static {v15, v2, v6, v1, v8}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v2

    and-int/lit8 v6, v4, 0xe

    or-int/lit16 v6, v6, 0x6000

    and-int/lit8 v8, v4, 0x70

    or-int/2addr v6, v8

    and-int/lit16 v8, v4, 0x380

    or-int/2addr v6, v8

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v4, v6

    const/4 v6, 0x0

    move-object/from16 p0, v0

    move-object/from16 p1, v5

    move-object/from16 p2, v7

    move-object/from16 p3, v12

    move-object/from16 p4, v2

    move-object/from16 p5, v1

    move/from16 p6, v4

    move/from16 p7, v6

    invoke-static/range {p0 .. p7}, LD9/k;->k(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;LT/l;II)V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_29

    invoke-static {}, LT/o;->P()V

    :cond_29
    move-object v2, v0

    move v8, v3

    move-object v3, v7

    move-object v4, v12

    move-object/from16 v7, p9

    :goto_15
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v12

    if-eqz v12, :cond_2a

    new-instance v15, LD9/e;

    move-object v0, v15

    move-object v1, v2

    move-object v2, v5

    move-wide v5, v13

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, LD9/e;-><init>(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;II)V

    invoke-interface {v12, v15}, LT/X0;->a(Lmh/p;)V

    :cond_2a
    return-void
.end method

.method public static final k(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;LT/l;II)V
    .locals 17

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string/jumbo v0, "content"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x301020c0

    move-object/from16 v1, p5

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, v6, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p7, 0x1

    if-nez v2, :cond_0

    move-object/from16 v2, p0

    invoke-interface {v1, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v2, p0

    :cond_1
    move v4, v3

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v4, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, p7, 0x2

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-interface {v1, v7}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v7, p1

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v4, v8

    goto :goto_3

    :cond_5
    move-object/from16 v7, p1

    :goto_3
    and-int/lit8 v8, p7, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-interface {v1, v9}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v4, v10

    :goto_5
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v11, v6, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-interface {v1, v11}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x800

    goto :goto_6

    :cond_b
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v4, v12

    :goto_7
    and-int/lit8 v12, p7, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v4, v4, 0x6000

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_e

    invoke-interface {v1, v5}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_d

    const/16 v12, 0x4000

    goto :goto_8

    :cond_d
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v4, v12

    :cond_e
    :goto_9
    and-int/lit16 v12, v4, 0x2493

    const/16 v13, 0x2492

    if-ne v12, v13, :cond_10

    invoke-interface {v1}, LT/l;->v()Z

    move-result v12

    if-nez v12, :cond_f

    goto :goto_a

    :cond_f
    invoke-interface {v1}, LT/l;->C()V

    move-object v4, v7

    move-object v3, v9

    goto/16 :goto_11

    :cond_10
    :goto_a
    invoke-interface {v1}, LT/l;->q()V

    and-int/lit8 v12, v6, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eqz v12, :cond_14

    invoke-interface {v1}, LT/l;->H()Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_d

    :cond_11
    invoke-interface {v1}, LT/l;->C()V

    and-int/lit8 v8, p7, 0x1

    if-eqz v8, :cond_12

    and-int/lit8 v4, v4, -0xf

    :cond_12
    and-int/lit8 v8, p7, 0x2

    if-eqz v8, :cond_13

    and-int/lit8 v4, v4, -0x71

    :cond_13
    move-object v15, v9

    :goto_b
    move-object v12, v11

    :goto_c
    move-object/from16 v16, v7

    move v7, v4

    move-object/from16 v4, v16

    goto :goto_f

    :cond_14
    :goto_d
    and-int/lit8 v12, p7, 0x1

    const/4 v15, 0x0

    if-eqz v12, :cond_15

    invoke-static {v13, v1, v15, v14}, LD9/k;->v(LD9/p;LT/l;II)LD9/o;

    move-result-object v2

    and-int/lit8 v4, v4, -0xf

    :cond_15
    and-int/lit8 v12, p7, 0x2

    if-eqz v12, :cond_16

    invoke-static {v1, v15}, LD9/k;->u(LT/l;I)Landroidx/compose/ui/window/r;

    move-result-object v7

    and-int/lit8 v4, v4, -0x71

    :cond_16
    if-eqz v8, :cond_18

    const v8, 0x334ed3a8

    invoke-interface {v1, v8}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v8, v9, :cond_17

    new-instance v8, LD9/f;

    invoke-direct {v8}, LD9/f;-><init>()V

    invoke-interface {v1, v8}, LT/l;->K(Ljava/lang/Object;)V

    :cond_17
    check-cast v8, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    goto :goto_e

    :cond_18
    move-object v8, v9

    :goto_e
    if-eqz v10, :cond_1a

    const v9, 0x334edbd1

    invoke-interface {v1, v9}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, LT/l;->a:LT/l$a;

    invoke-virtual {v10}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v10

    if-ne v9, v10, :cond_19

    new-instance v9, LD9/g;

    invoke-direct {v9}, LD9/g;-><init>()V

    invoke-interface {v1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_19
    check-cast v9, Lmh/p;

    invoke-interface {v1}, LT/l;->J()V

    move-object v15, v8

    move-object v12, v9

    goto :goto_c

    :cond_1a
    move-object v15, v8

    goto :goto_b

    :goto_f
    invoke-interface {v1}, LT/l;->S()V

    invoke-static {}, LT/o;->H()Z

    move-result v8

    if-eqz v8, :cond_1b

    const/4 v8, -0x1

    const-string/jumbo v9, "com.ui.core.ui.component.popup.anchored.UiAnchoredPopupBase (AnchoredPopup.kt:95)"

    invoke-static {v0, v7, v8, v9}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1b
    invoke-virtual {v2}, LD9/o;->d()Z

    move-result v0

    if-eqz v0, :cond_1e

    const v0, 0x334ef348

    invoke-interface {v1, v0}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v0

    sget-object v8, LT/l;->a:LT/l$a;

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v0, v9, :cond_1c

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v13, v3, v13}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object v0

    invoke-interface {v1, v0}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1c
    check-cast v0, LT/q0;

    invoke-interface {v1}, LT/l;->J()V

    new-instance v3, LD9/q;

    invoke-virtual {v2}, LD9/o;->b()Ll0/i;

    move-result-object v9

    invoke-static {}, Landroidx/compose/ui/platform/k0;->g()LT/H0;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->t(LT/u;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LY0/d;

    invoke-direct {v3, v9, v10, v12}, LD9/q;-><init>(Ll0/i;LY0/d;Lmh/p;)V

    const v9, 0x334f1bf1

    invoke-interface {v1, v9}, LT/l;->U(I)V

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v8}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_1d

    new-instance v9, LD9/h;

    invoke-direct {v9, v0}, LD9/h;-><init>(LT/q0;)V

    invoke-interface {v1, v9}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1d
    move-object v8, v9

    check-cast v8, Lmh/a;

    invoke-interface {v1}, LT/l;->J()V

    new-instance v9, LD9/k$b;

    invoke-direct {v9, v0, v2, v15, v5}, LD9/k$b;-><init>(LT/q0;LD9/o;Lmh/a;Lmh/q;)V

    const/16 v0, 0x36

    const v10, -0x57937dd9

    invoke-static {v10, v14, v9, v1, v0}, Lb0/c;->e(IZLjava/lang/Object;LT/l;I)Lb0/a;

    move-result-object v10

    shl-int/lit8 v0, v7, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/lit16 v0, v0, 0xc30

    const/4 v13, 0x0

    move-object v7, v3

    move-object v9, v4

    move-object v11, v1

    move-object v3, v12

    move v12, v0

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/window/b;->a(Landroidx/compose/ui/window/q;Lmh/a;Landroidx/compose/ui/window/r;Lmh/p;LT/l;II)V

    goto :goto_10

    :cond_1e
    move-object v3, v12

    :goto_10
    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_1f

    invoke-static {}, LT/o;->P()V

    :cond_1f
    move-object v11, v3

    move-object v3, v15

    :goto_11
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v9, LD9/i;

    move-object v0, v9

    move-object v1, v2

    move-object v2, v4

    move-object v4, v11

    move-object/from16 v5, p4

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, LD9/i;-><init>(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;II)V

    invoke-interface {v8, v9}, LT/X0;->a(Lmh/p;)V

    :cond_20
    return-void
.end method

.method private static final l(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;IILT/l;I)LYg/J;
    .locals 9

    or-int/lit8 v0, p5, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p7

    move v8, p6

    invoke-static/range {v1 .. v8}, LD9/k;->k(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;Lmh/q;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final m()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final n(LY0/n;LY0/r;)LYg/J;
    .locals 0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final o(LT/q0;)LYg/J;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, LT/q0;->setValue(Ljava/lang/Object;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final p()LYg/J;
    .locals 1

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method private static final q(LY0/n;LY0/r;)LYg/J;
    .locals 0

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final r(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;IILT/l;I)LYg/J;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, LT/L0;->a(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-wide/from16 v5, p4

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p11

    move/from16 v12, p10

    invoke-static/range {v1 .. v12}, LD9/k;->j(LD9/o;Landroidx/compose/ui/window/r;Lmh/a;Lmh/p;JLm0/i1;FLmh/p;LT/l;II)V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method

.method public static final s(Landroidx/compose/ui/e;LD9/o;)Landroidx/compose/ui/e;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "popupState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LD9/a;

    invoke-direct {v0, p1}, LD9/a;-><init>(LD9/o;)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/o;->a(Landroidx/compose/ui/e;Lmh/l;)Landroidx/compose/ui/e;

    move-result-object p0

    return-object p0
.end method

.method private static final t(LD9/o;LC0/r;)LYg/J;
    .locals 1

    const-string/jumbo v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LC0/s;->c(LC0/r;)Ll0/i;

    move-result-object p1

    invoke-virtual {p0, p1}, LD9/o;->e(Ll0/i;)V

    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private static final u(LT/l;I)Landroidx/compose/ui/window/r;
    .locals 8

    const v0, -0x5a59b36b

    invoke-interface {p0, v0}, LT/l;->U(I)V

    invoke-static {}, LT/o;->H()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.popup.anchored.rememberDefaultPopupProperties (AnchoredPopup.kt:80)"

    invoke-static {v0, p1, v1, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    const p1, 0x2d824763

    invoke-interface {p0, p1}, LT/l;->U(I)V

    invoke-interface {p0}, LT/l;->f()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LT/l;->a:LT/l$a;

    invoke-virtual {v0}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_1

    new-instance p1, Landroidx/compose/ui/window/r;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v7}, Landroidx/compose/ui/window/r;-><init>(ZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, LT/l;->K(Ljava/lang/Object;)V

    :cond_1
    check-cast p1, Landroidx/compose/ui/window/r;

    invoke-interface {p0}, LT/l;->J()V

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LT/o;->P()V

    :cond_2
    invoke-interface {p0}, LT/l;->J()V

    return-object p1
.end method

.method public static final v(LD9/p;LT/l;II)LD9/o;
    .locals 10

    const v0, 0x3b64acca

    invoke-interface {p1, v0}, LT/l;->U(I)V

    const/4 v1, 0x1

    and-int/2addr p3, v1

    if-eqz p3, :cond_0

    sget-object p0, LD9/p;->HIDDEN:LD9/p;

    :cond_0
    invoke-static {}, LT/o;->H()Z

    move-result p3

    if-eqz p3, :cond_1

    const/4 p3, -0x1

    const-string/jumbo v2, "com.ui.core.ui.component.popup.anchored.rememberUiAnchoredPopupState (AnchoredPopup.kt:70)"

    invoke-static {v0, p2, p3, v2}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1
    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object v3

    sget-object p3, LD9/o;->c:LD9/o$a;

    invoke-virtual {p3}, LD9/o$a;->c()Lc0/k;

    move-result-object v4

    const p3, 0x56f9b711

    invoke-interface {p1, p3}, LT/l;->U(I)V

    and-int/lit8 p3, p2, 0xe

    xor-int/lit8 p3, p3, 0x6

    const/4 v0, 0x4

    if-le p3, v0, :cond_2

    invoke-interface {p1, p0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    :cond_2
    and-int/lit8 p2, p2, 0x6

    if-ne p2, v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :cond_4
    :goto_0
    invoke-interface {p1}, LT/l;->f()Ljava/lang/Object;

    move-result-object p2

    if-nez v1, :cond_5

    sget-object p3, LT/l;->a:LT/l$a;

    invoke-virtual {p3}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne p2, p3, :cond_6

    :cond_5
    new-instance p2, LD9/b;

    invoke-direct {p2, p0}, LD9/b;-><init>(LD9/p;)V

    invoke-interface {p1, p2}, LT/l;->K(Ljava/lang/Object;)V

    :cond_6
    move-object v6, p2

    check-cast v6, Lmh/a;

    invoke-interface {p1}, LT/l;->J()V

    const/4 v8, 0x0

    const/4 v9, 0x4

    const/4 v5, 0x0

    move-object v7, p1

    invoke-static/range {v3 .. v9}, Lc0/c;->e([Ljava/lang/Object;Lc0/k;Ljava/lang/String;Lmh/a;LT/l;II)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LD9/o;

    invoke-static {}, LT/o;->H()Z

    move-result p2

    if-eqz p2, :cond_7

    invoke-static {}, LT/o;->P()V

    :cond_7
    invoke-interface {p1}, LT/l;->J()V

    return-object p0
.end method

.method private static final w(LD9/p;)LD9/o;
    .locals 3

    new-instance v0, LD9/o;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v1, v2, v1}, LT/o1;->i(Ljava/lang/Object;LT/n1;ILjava/lang/Object;)LT/q0;

    move-result-object p0

    invoke-direct {v0, p0}, LD9/o;-><init>(LT/q0;)V

    return-object v0
.end method
