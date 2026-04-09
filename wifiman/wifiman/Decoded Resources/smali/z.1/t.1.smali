.class public abstract Lz/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lz/m;

.field private static final b:Lz/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lz/m;->a:Lz/m$b;

    sget-object v1, Lf0/c;->a:Lf0/c$a;

    invoke-virtual {v1}, Lf0/c$a;->l()Lf0/c$c;

    move-result-object v2

    invoke-virtual {v0, v2}, Lz/m$b;->b(Lf0/c$c;)Lz/m;

    move-result-object v2

    sput-object v2, Lz/t;->a:Lz/m;

    invoke-virtual {v1}, Lf0/c$a;->k()Lf0/c$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz/m$b;->a(Lf0/c$b;)Lz/m;

    move-result-object v0

    sput-object v0, Lz/t;->b:Lz/m;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;LT/l;II)V
    .locals 18

    move-object/from16 v7, p6

    move/from16 v8, p8

    const v0, 0x1a191c2e

    move-object/from16 v1, p7

    invoke-interface {v1, v0}, LT/l;->r(I)LT/l;

    move-result-object v1

    and-int/lit8 v2, p9, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-interface {v1, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, p9, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-interface {v1, v6}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    :goto_3
    and-int/lit8 v9, p9, 0x4

    if-eqz v9, :cond_7

    or-int/lit16 v4, v4, 0x180

    :cond_6
    move-object/from16 v10, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_6

    move-object/from16 v10, p2

    invoke-interface {v1, v10}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x100

    goto :goto_4

    :cond_8
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v4, v11

    :goto_5
    and-int/lit8 v11, p9, 0x8

    if-eqz v11, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v12, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v12, v8, 0xc00

    if-nez v12, :cond_9

    move/from16 v12, p3

    invoke-interface {v1, v12}, LT/l;->i(I)Z

    move-result v13

    if-eqz v13, :cond_b

    const/16 v13, 0x800

    goto :goto_6

    :cond_b
    const/16 v13, 0x400

    :goto_6
    or-int/2addr v4, v13

    :goto_7
    and-int/lit8 v13, p9, 0x10

    if-eqz v13, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v14, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v14, v8, 0x6000

    if-nez v14, :cond_c

    move/from16 v14, p4

    invoke-interface {v1, v14}, LT/l;->i(I)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_8

    :cond_e
    const/16 v15, 0x2000

    :goto_8
    or-int/2addr v4, v15

    :goto_9
    and-int/lit8 v15, p9, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_f

    or-int v4, v4, v16

    move-object/from16 v0, p5

    goto :goto_b

    :cond_f
    and-int v16, v8, v16

    move-object/from16 v0, p5

    if-nez v16, :cond_11

    invoke-interface {v1, v0}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v4, v4, v16

    :cond_11
    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v4, v4, v17

    goto :goto_d

    :cond_12
    and-int v16, v8, v17

    if-nez v16, :cond_14

    invoke-interface {v1, v7}, LT/l;->l(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_13

    const/high16 v16, 0x100000

    goto :goto_c

    :cond_13
    const/high16 v16, 0x80000

    :goto_c
    or-int v4, v4, v16

    :cond_14
    :goto_d
    const v16, 0x92493

    and-int v0, v4, v16

    const v3, 0x92492

    if-ne v0, v3, :cond_16

    invoke-interface {v1}, LT/l;->v()Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_e

    :cond_15
    invoke-interface {v1}, LT/l;->C()V

    move-object/from16 v2, p0

    move-object/from16 v9, p5

    move-object v3, v10

    move v4, v12

    move v5, v14

    goto/16 :goto_18

    :cond_16
    :goto_e
    if-eqz v2, :cond_17

    sget-object v0, Landroidx/compose/ui/e;->b0:Landroidx/compose/ui/e$a;

    goto :goto_f

    :cond_17
    move-object/from16 v0, p0

    :goto_f
    if-eqz v5, :cond_18

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->f()Lz/c$e;

    move-result-object v2

    move-object v6, v2

    :cond_18
    if-eqz v9, :cond_19

    sget-object v2, Lz/c;->a:Lz/c;

    invoke-virtual {v2}, Lz/c;->g()Lz/c$m;

    move-result-object v2

    goto :goto_10

    :cond_19
    move-object v2, v10

    :goto_10
    const v3, 0x7fffffff

    if-eqz v11, :cond_1a

    move v5, v3

    goto :goto_11

    :cond_1a
    move v5, v12

    :goto_11
    if-eqz v13, :cond_1b

    goto :goto_12

    :cond_1b
    move v3, v14

    :goto_12
    if-eqz v15, :cond_1c

    sget-object v9, Lz/z;->f:Lz/z$a;

    invoke-virtual {v9}, Lz/z$a;->a()Lz/z;

    move-result-object v9

    move-object v15, v9

    goto :goto_13

    :cond_1c
    move-object/from16 v15, p5

    :goto_13
    invoke-static {}, LT/o;->H()Z

    move-result v9

    if-eqz v9, :cond_1d

    const/4 v9, -0x1

    const-string v10, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:92)"

    const v11, 0x1a191c2e

    invoke-static {v11, v4, v9, v10}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_1d
    const/high16 v9, 0x70000

    and-int v14, v4, v9

    const/4 v13, 0x0

    const/4 v12, 0x1

    const/high16 v9, 0x20000

    if-ne v14, v9, :cond_1e

    move v9, v12

    goto :goto_14

    :cond_1e
    move v9, v13

    :goto_14
    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1f

    sget-object v9, LT/l;->a:LT/l$a;

    invoke-virtual {v9}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v9

    if-ne v10, v9, :cond_20

    :cond_1f
    invoke-virtual {v15}, Lz/u;->b()Lz/v;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_20
    move-object v11, v10

    check-cast v11, Lz/v;

    shr-int/lit8 v9, v4, 0x3

    and-int/lit16 v10, v9, 0x1ffe

    move-object v9, v6

    move/from16 v16, v10

    move-object v10, v2

    move-object/from16 p0, v11

    move v11, v5

    move-object/from16 p1, v2

    move v2, v12

    move v12, v3

    move-object/from16 v13, p0

    move v2, v14

    move-object v14, v1

    move/from16 p2, v3

    move-object v3, v15

    move/from16 v15, v16

    invoke-static/range {v9 .. v15}, Lz/t;->n(Lz/c$e;Lz/c$m;IILz/v;LT/l;I)LC0/G;

    move-result-object v9

    const/high16 v10, 0x20000

    if-ne v2, v10, :cond_21

    const/4 v13, 0x1

    goto :goto_15

    :cond_21
    const/4 v13, 0x0

    :goto_15
    const/high16 v2, 0x380000

    and-int/2addr v2, v4

    const/high16 v4, 0x100000

    if-ne v2, v4, :cond_22

    const/4 v2, 0x1

    goto :goto_16

    :cond_22
    const/4 v2, 0x0

    :goto_16
    or-int/2addr v2, v13

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_23

    sget-object v2, LT/l;->a:LT/l$a;

    invoke-virtual {v2}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v4, v2, :cond_24

    :cond_23
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lz/t$b;

    invoke-direct {v2, v7}, Lz/t$b;-><init>(Lmh/q;)V

    const v10, -0x8511341

    const/4 v11, 0x1

    invoke-static {v10, v11, v2}, Lb0/c;->c(IZLjava/lang/Object;)Lb0/a;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object/from16 v10, p0

    invoke-virtual {v3, v10, v4}, Lz/u;->a(Lz/v;Ljava/util/List;)V

    invoke-interface {v1, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_24
    check-cast v4, Ljava/util/List;

    invoke-static {v4}, LC0/w;->b(Ljava/util/List;)Lmh/p;

    move-result-object v2

    invoke-interface {v1, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {v1}, LT/l;->f()Ljava/lang/Object;

    move-result-object v10

    if-nez v4, :cond_25

    sget-object v4, LT/l;->a:LT/l$a;

    invoke-virtual {v4}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v10, v4, :cond_26

    :cond_25
    invoke-static {v9}, LC0/I;->a(LC0/G;)LC0/C;

    move-result-object v10

    invoke-interface {v1, v10}, LT/l;->K(Ljava/lang/Object;)V

    :cond_26
    check-cast v10, LC0/C;

    const/4 v4, 0x0

    invoke-static {v1, v4}, LT/j;->a(LT/l;I)I

    move-result v9

    invoke-interface {v1}, LT/l;->G()LT/x;

    move-result-object v11

    invoke-static {v1, v0}, Landroidx/compose/ui/c;->e(LT/l;Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    move-result-object v12

    sget-object v13, LE0/g;->K:LE0/g$a;

    invoke-virtual {v13}, LE0/g$a;->a()Lmh/a;

    move-result-object v14

    invoke-interface {v1}, LT/l;->x()LT/f;

    move-result-object v15

    if-nez v15, :cond_27

    invoke-static {}, LT/j;->c()V

    :cond_27
    invoke-interface {v1}, LT/l;->u()V

    invoke-interface {v1}, LT/l;->o()Z

    move-result v15

    if-eqz v15, :cond_28

    invoke-interface {v1, v14}, LT/l;->D(Lmh/a;)V

    goto :goto_17

    :cond_28
    invoke-interface {v1}, LT/l;->I()V

    :goto_17
    invoke-static {v1}, LT/E1;->a(LT/l;)LT/l;

    move-result-object v14

    invoke-virtual {v13}, LE0/g$a;->e()Lmh/p;

    move-result-object v15

    invoke-static {v14, v10, v15}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->g()Lmh/p;

    move-result-object v10

    invoke-static {v14, v11, v10}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-virtual {v13}, LE0/g$a;->b()Lmh/p;

    move-result-object v10

    invoke-interface {v14}, LT/l;->o()Z

    move-result v11

    if-nez v11, :cond_29

    invoke-interface {v14}, LT/l;->f()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2a

    :cond_29
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v14, v11}, LT/l;->K(Ljava/lang/Object;)V

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v14, v9, v10}, LT/l;->Q(Ljava/lang/Object;Lmh/p;)V

    :cond_2a
    invoke-virtual {v13}, LE0/g$a;->f()Lmh/p;

    move-result-object v9

    invoke-static {v14, v12, v9}, LT/E1;->c(LT/l;Ljava/lang/Object;Lmh/p;)V

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v2, v1, v4}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, LT/l;->R()V

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_2b

    invoke-static {}, LT/o;->P()V

    :cond_2b
    move-object v2, v0

    move-object v9, v3

    move v4, v5

    move-object/from16 v3, p1

    move/from16 v5, p2

    :goto_18
    invoke-interface {v1}, LT/l;->z()LT/X0;

    move-result-object v10

    if-eqz v10, :cond_2c

    new-instance v11, Lz/t$a;

    move-object v0, v11

    move-object v1, v2

    move-object v2, v6

    move-object v6, v9

    move-object/from16 v7, p6

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lz/t$a;-><init>(Landroidx/compose/ui/e;Lz/c$e;Lz/c$m;IILz/z;Lmh/q;II)V

    invoke-interface {v10, v11}, LT/X0;->a(Lmh/p;)V

    :cond_2c
    return-void
.end method

.method public static final synthetic b(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)J
    .locals 0

    invoke-static/range {p0 .. p8}, Lz/t;->g(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final synthetic c(Ljava/util/List;Lmh/q;III)I
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz/t;->j(Ljava/util/List;Lmh/q;III)I

    move-result p0

    return p0
.end method

.method public static final synthetic d(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)I
    .locals 0

    invoke-static/range {p0 .. p8}, Lz/t;->l(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)I

    move-result p0

    return p0
.end method

.method public static final e(Landroidx/compose/ui/layout/m;Lz/x;Ljava/util/Iterator;FFJIILz/v;)LC0/D;
    .locals 49

    move-object/from16 v13, p0

    move-object/from16 v14, p1

    move-object/from16 v0, p2

    new-instance v15, LV/b;

    const/16 v1, 0x10

    new-array v1, v1, [LC0/D;

    const/4 v12, 0x0

    invoke-direct {v15, v1, v12}, LV/b;-><init>([Ljava/lang/Object;I)V

    invoke-static/range {p5 .. p6}, LY0/b;->l(J)I

    move-result v1

    invoke-static/range {p5 .. p6}, LY0/b;->n(J)I

    move-result v9

    invoke-static/range {p5 .. p6}, LY0/b;->k(J)I

    move-result v10

    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object v11

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    move/from16 v2, p3

    invoke-interface {v13, v2}, LY0/d;->d1(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v7, v2

    move/from16 v2, p4

    invoke-interface {v13, v2}, LY0/d;->d1(F)F

    move-result v2

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v2, v2

    float-to-int v6, v2

    invoke-static {v12, v1, v12, v10}, Lz/M;->a(IIII)J

    move-result-wide v25

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-wide/from16 v16, v25

    invoke-static/range {v16 .. v23}, Lz/M;->e(JIIIIILjava/lang/Object;)J

    move-result-wide v2

    invoke-interface/range {p1 .. p1}, Lz/x;->j()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lz/K;->Horizontal:Lz/K;

    goto :goto_0

    :cond_0
    sget-object v4, Lz/K;->Vertical:Lz/K;

    :goto_0
    invoke-static {v2, v3, v4}, Lz/M;->f(JLz/K;)J

    move-result-wide v4

    new-instance v3, Lkotlin/jvm/internal/N;

    invoke-direct {v3}, Lkotlin/jvm/internal/N;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    move-object/from16 v27, v8

    const/4 v8, 0x0

    if-nez v2, :cond_1

    move-object v2, v8

    goto :goto_1

    :cond_1
    invoke-static {v0, v8}, Lz/t;->o(Ljava/util/Iterator;Lz/w;)LC0/B;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_2

    new-instance v8, Lz/t$d;

    invoke-direct {v8, v3}, Lz/t$d;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v2, v14, v4, v5, v8}, Lz/t;->k(LC0/B;Lz/x;JLmh/l;)J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lo/j;->a(J)Lo/j;

    move-result-object v8

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lo/j;->i()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lo/j;->e(J)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v39, v16

    goto :goto_3

    :cond_3
    const/16 v39, 0x0

    :goto_3
    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lo/j;->i()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Lo/j;->f(J)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-wide/from16 v41, v4

    move-object/from16 v40, v16

    goto :goto_4

    :cond_4
    move-wide/from16 v41, v4

    const/16 v40, 0x0

    :goto_4
    new-instance v5, Lo/y;

    const/4 v4, 0x1

    move/from16 v43, v9

    const/4 v9, 0x0

    invoke-direct {v5, v12, v4, v9}, Lo/y;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p3, v5

    new-instance v5, Lo/y;

    invoke-direct {v5, v12, v4, v9}, Lo/y;-><init>(IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v44, Lz/r;

    const/16 v24, 0x0

    move-object/from16 v16, v44

    move/from16 v17, p7

    move-object/from16 v18, p9

    move-wide/from16 v19, p5

    move/from16 v21, p8

    move/from16 v22, v7

    move/from16 v23, v6

    invoke-direct/range {v16 .. v24}, Lz/r;-><init>(ILz/v;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    invoke-static {v1, v10}, Lo/j;->b(II)J

    move-result-wide v31

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v30, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v28, v44

    move-object/from16 v33, v8

    invoke-virtual/range {v28 .. v38}, Lz/r;->b(ZIJLo/j;IIIZZ)Lz/r$b;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lz/r$b;->a()Z

    move-result v17

    if-eqz v17, :cond_6

    if-eqz v8, :cond_5

    move v8, v4

    goto :goto_5

    :cond_5
    move v8, v12

    :goto_5
    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, -0x1

    move-object/from16 v20, v2

    move-object/from16 v2, v44

    move-object v9, v3

    move-object/from16 v3, v16

    move/from16 v23, v4

    move-wide/from16 v12, v41

    move v4, v8

    move-object/from16 v8, p3

    move-object/from16 v45, v5

    move/from16 v5, v19

    move/from16 v41, v6

    move/from16 v6, v17

    move/from16 v42, v7

    move v7, v1

    move-object/from16 v47, v8

    move-object/from16 v46, v15

    move-object/from16 v15, v27

    move/from16 v8, v18

    invoke-virtual/range {v2 .. v8}, Lz/r;->a(Lz/r$b;ZIIII)Lz/r$a;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object/from16 v47, p3

    move-object/from16 v20, v2

    move-object v9, v3

    move/from16 v23, v4

    move-object/from16 v45, v5

    move-object/from16 v46, v15

    move-object/from16 v15, v27

    move-wide/from16 v12, v41

    move/from16 v41, v6

    move/from16 v42, v7

    const/4 v8, 0x0

    :goto_6
    move v6, v1

    move-object/from16 p4, v8

    move v8, v10

    move-object/from16 v2, v20

    move/from16 v3, v43

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v27, 0x0

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lz/r$b;->a()Z

    move-result v16

    if-nez v16, :cond_f

    if-eqz v2, :cond_f

    invoke-static/range {v39 .. v39}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {v39 .. v39}, Ljava/lang/Integer;->intValue()I

    move-result v16

    invoke-static/range {v40 .. v40}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    move/from16 v39, v10

    invoke-virtual/range {v40 .. v40}, Ljava/lang/Integer;->intValue()I

    move-result v10

    add-int v4, v4, v16

    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    move-result v5

    sub-int v6, v6, v16

    add-int/lit8 v10, v7, 0x1

    move/from16 v40, v1

    move-object/from16 v1, p9

    invoke-virtual {v1, v10}, Lz/v;->k(I)V

    invoke-interface {v15, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    invoke-virtual {v11, v7, v2}, Lo/z;->t(ILjava/lang/Object;)V

    sub-int v22, v10, v17

    invoke-interface/range {p2 .. p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_7

    const/4 v2, 0x0

    const/4 v7, 0x0

    goto :goto_8

    :cond_7
    const/4 v2, 0x0

    invoke-static {v0, v2}, Lz/t;->o(Ljava/util/Iterator;Lz/w;)LC0/B;

    move-result-object v7

    :goto_8
    iput-object v2, v9, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    if-eqz v7, :cond_8

    new-instance v2, Lz/t$c;

    invoke-direct {v2, v9}, Lz/t$c;-><init>(Lkotlin/jvm/internal/N;)V

    invoke-static {v7, v14, v12, v13, v2}, Lz/t;->k(LC0/B;Lz/x;JLmh/l;)J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Lo/j;->a(J)Lo/j;

    move-result-object v2

    goto :goto_9

    :cond_8
    const/4 v2, 0x0

    :goto_9
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lo/j;->i()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Lo/j;->e(J)I

    move-result v16

    add-int v16, v16, v42

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v43, v16

    goto :goto_a

    :cond_9
    const/16 v43, 0x0

    :goto_a
    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lo/j;->i()J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Lo/j;->f(J)I

    move-result v16

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    move-object/from16 v48, v16

    goto :goto_b

    :cond_a
    const/16 v48, 0x0

    :goto_b
    invoke-interface/range {p2 .. p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v29

    invoke-static {v6, v8}, Lo/j;->b(II)J

    move-result-wide v31

    if-nez v2, :cond_b

    const/16 v33, 0x0

    goto :goto_c

    :cond_b
    invoke-static/range {v43 .. v43}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {v43 .. v43}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static/range {v48 .. v48}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual/range {v48 .. v48}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lo/j;->b(II)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/j;->a(J)Lo/j;

    move-result-object v0

    move-object/from16 v33, v0

    :goto_c
    const/16 v37, 0x0

    const/16 v38, 0x0

    move-object/from16 v28, v44

    move/from16 v30, v22

    move/from16 v34, v27

    move/from16 v35, v18

    move/from16 v36, v5

    invoke-virtual/range {v28 .. v38}, Lz/r;->b(ZIJLo/j;IIIZZ)Lz/r$b;

    move-result-object v0

    invoke-virtual {v0}, Lz/r$b;->b()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    move/from16 v3, v40

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int v4, v18, v5

    if-eqz v2, :cond_c

    move/from16 v18, v23

    goto :goto_d

    :cond_c
    const/16 v18, 0x0

    :goto_d
    move-object/from16 v16, v44

    move-object/from16 v17, v0

    move/from16 v19, v27

    move/from16 v20, v4

    move/from16 v21, v6

    invoke-virtual/range {v16 .. v22}, Lz/r;->a(Lz/r$b;ZIIII)Lz/r$a;

    move-result-object v2

    move-object/from16 v6, v45

    invoke-virtual {v6, v5}, Lo/y;->h(I)Z

    sub-int v5, v39, v4

    sub-int v8, v5, v41

    move-object/from16 v5, v47

    invoke-virtual {v5, v10}, Lo/y;->h(I)Z

    if-eqz v43, :cond_d

    invoke-virtual/range {v43 .. v43}, Ljava/lang/Integer;->intValue()I

    move-result v16

    sub-int v16, v16, v42

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    goto :goto_e

    :cond_d
    const/16 v16, 0x0

    :goto_e
    add-int/lit8 v27, v27, 0x1

    add-int v18, v4, v41

    move v4, v1

    move v1, v3

    move/from16 v17, v10

    move-wide/from16 v19, v12

    move-object/from16 v43, v16

    move-object v13, v6

    move v12, v8

    const/4 v6, 0x0

    move-object v3, v2

    move v8, v1

    move-object v2, v5

    const/4 v5, 0x0

    goto :goto_f

    :cond_e
    move-wide/from16 v19, v12

    move/from16 v1, v40

    move-object/from16 v13, v45

    move-object/from16 v2, v47

    move v12, v8

    move v8, v6

    move v6, v5

    move v5, v4

    move v4, v3

    move-object/from16 v3, p4

    :goto_f
    move-object/from16 v16, v0

    move-object/from16 v47, v2

    move-object/from16 p4, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move-object v2, v7

    move v6, v8

    move v7, v10

    move v8, v12

    move-object/from16 v45, v13

    move-wide/from16 v12, v19

    move/from16 v10, v39

    move-object/from16 v39, v43

    move-object/from16 v40, v48

    move-object/from16 v0, p2

    goto/16 :goto_7

    :cond_f
    move-object/from16 v13, v45

    move-object/from16 v2, v47

    if-eqz p4, :cond_11

    invoke-virtual/range {p4 .. p4}, Lz/r$a;->a()LC0/B;

    move-result-object v0

    invoke-interface {v15, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual/range {p4 .. p4}, Lz/r$a;->d()Landroidx/compose/ui/layout/t;

    move-result-object v1

    invoke-virtual {v11, v0, v1}, Lo/z;->t(ILjava/lang/Object;)V

    iget v0, v2, Lo/k;->b:I

    add-int/lit8 v0, v0, -0x1

    invoke-virtual/range {p4 .. p4}, Lz/r$a;->c()Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-virtual {v2}, Lo/k;->b()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v13, v0}, Lo/k;->a(I)I

    move-result v4

    invoke-virtual/range {p4 .. p4}, Lz/r$a;->b()J

    move-result-wide v5

    invoke-static {v5, v6}, Lo/j;->f(J)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v13, v0, v4}, Lo/y;->m(II)I

    invoke-virtual {v2}, Lo/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v1, v0}, Lo/y;->m(II)I

    goto :goto_10

    :cond_10
    invoke-virtual/range {p4 .. p4}, Lz/r$a;->b()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/j;->f(J)I

    move-result v0

    invoke-virtual {v13, v0}, Lo/y;->h(I)Z

    invoke-virtual {v2}, Lo/k;->f()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Lo/y;->h(I)Z

    :cond_11
    :goto_10
    invoke-interface {v15}, Ljava/util/List;->size()I

    move-result v0

    new-array v12, v0, [Landroidx/compose/ui/layout/t;

    const/4 v1, 0x0

    :goto_11
    if-ge v1, v0, :cond_12

    invoke-virtual {v11, v1}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v12, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_11

    :cond_12
    invoke-virtual {v2}, Lo/k;->b()I

    move-result v0

    new-array v11, v0, [I

    const/4 v1, 0x0

    :goto_12
    if-ge v1, v0, :cond_13

    const/16 v16, 0x0

    aput v16, v11, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_13
    const/16 v16, 0x0

    invoke-virtual {v2}, Lo/k;->b()I

    move-result v0

    new-array v10, v0, [I

    move/from16 v1, v16

    :goto_13
    if-ge v1, v0, :cond_14

    aput v16, v10, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_13

    :cond_14
    iget-object v9, v2, Lo/k;->a:[I

    iget v8, v2, Lo/k;->b:I

    move v7, v3

    move/from16 v6, v16

    move/from16 v17, v6

    move/from16 v18, v17

    :goto_14
    if-ge v6, v8, :cond_16

    aget v19, v9, v6

    invoke-virtual {v13, v6}, Lo/k;->a(I)I

    move-result v4

    invoke-static/range {v25 .. v26}, LY0/b;->m(J)I

    move-result v2

    invoke-static/range {v25 .. v26}, LY0/b;->l(J)I

    move-result v3

    move-object/from16 v0, p1

    move v1, v7

    move/from16 v5, v42

    move/from16 v20, v6

    move-object/from16 v6, p0

    move-object/from16 v45, v13

    move v13, v7

    move-object v7, v15

    move/from16 v21, v8

    move-object v8, v12

    move-object/from16 v22, v9

    move/from16 v9, v17

    move-object/from16 v17, v10

    move/from16 v10, v19

    move-object/from16 v23, v11

    move-object/from16 v24, v12

    move/from16 v12, v20

    invoke-static/range {v0 .. v12}, Lz/U;->a(Lz/T;IIIIILandroidx/compose/ui/layout/m;Ljava/util/List;[Landroidx/compose/ui/layout/t;II[II)LC0/D;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, Lz/x;->j()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v1

    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v2

    goto :goto_15

    :cond_15
    invoke-interface {v0}, LC0/D;->getHeight()I

    move-result v1

    invoke-interface {v0}, LC0/D;->getWidth()I

    move-result v2

    :goto_15
    aput v2, v17, v20

    add-int v18, v18, v2

    invoke-static {v13, v1}, Ljava/lang/Math;->max(II)I

    move-result v7

    move-object/from16 v6, v46

    invoke-virtual {v6, v0}, LV/b;->b(Ljava/lang/Object;)Z

    add-int/lit8 v0, v20, 0x1

    move-object/from16 v10, v17

    move/from16 v17, v19

    move/from16 v8, v21

    move-object/from16 v9, v22

    move-object/from16 v11, v23

    move-object/from16 v12, v24

    move-object/from16 v13, v45

    move v6, v0

    goto :goto_14

    :cond_16
    move v13, v7

    move-object/from16 v17, v10

    move-object/from16 v23, v11

    move-object/from16 v6, v46

    invoke-virtual {v6}, LV/b;->s()Z

    move-result v0

    if-eqz v0, :cond_17

    move/from16 v3, v16

    move v4, v3

    goto :goto_16

    :cond_17
    move v3, v13

    move/from16 v4, v18

    :goto_16
    move-object/from16 v0, p0

    move-wide/from16 v1, p5

    move-object/from16 v5, v17

    move-object/from16 v7, p1

    move-object/from16 v8, v23

    invoke-static/range {v0 .. v8}, Lz/t;->m(Landroidx/compose/ui/layout/m;JII[ILV/b;Lz/x;[I)LC0/D;

    move-result-object v0

    return-object v0
.end method

.method public static final f(LC0/n;ZI)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p0, p2}, LC0/n;->s0(I)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p2}, LC0/n;->R(I)I

    move-result p0

    :goto_0
    return p0
.end method

.method private static final g(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)J
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    if-eqz v4, :cond_0

    invoke-static {v13, v13}, Lo/j;->b(II)J

    move-result-wide v0

    return-wide v0

    :cond_0
    const v15, 0x7fffffff

    invoke-static {v13, v3, v13, v15}, Lz/M;->a(IIII)J

    move-result-wide v7

    new-instance v27, Lz/r;

    const/4 v12, 0x0

    move-object/from16 v4, v27

    move/from16 v5, p6

    move-object/from16 v6, p8

    move/from16 v9, p7

    move/from16 v10, p4

    move/from16 v11, p5

    invoke-direct/range {v4 .. v12}, Lz/r;-><init>(ILz/v;JIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v13}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, LC0/n;

    if-eqz v4, :cond_1

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v2, v4, v14, v5}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    goto :goto_0

    :cond_1
    move v5, v13

    :goto_0
    if-eqz v4, :cond_2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v1, v4, v14, v6}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    goto :goto_1

    :cond_2
    move v6, v13

    :goto_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v7

    const/4 v8, 0x1

    if-le v7, v8, :cond_3

    move/from16 v17, v8

    goto :goto_2

    :cond_3
    move/from16 v17, v13

    :goto_2
    invoke-static {v3, v15}, Lo/j;->b(II)J

    move-result-wide v19

    if-nez v4, :cond_4

    const/16 v21, 0x0

    goto :goto_3

    :cond_4
    invoke-static {v6, v5}, Lo/j;->b(II)J

    move-result-wide v9

    invoke-static {v9, v10}, Lo/j;->a(J)Lo/j;

    move-result-object v9

    move-object/from16 v21, v9

    :goto_3
    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v18, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v16, v27

    move/from16 v22, v9

    move/from16 v23, v10

    move/from16 v24, v11

    invoke-virtual/range {v16 .. v26}, Lz/r;->b(ZIJLo/j;IIIZZ)Lz/r$b;

    move-result-object v12

    invoke-virtual {v12}, Lz/r$b;->a()Z

    move-result v12

    if-eqz v12, :cond_7

    move-object/from16 v0, p8

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    move v8, v13

    :goto_4
    invoke-virtual {v0, v8, v13, v13}, Lz/v;->f(ZII)Lo/j;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lo/j;->i()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/j;->f(J)I

    move-result v0

    goto :goto_5

    :cond_6
    move v0, v13

    :goto_5
    invoke-static {v0, v13}, Lo/j;->b(II)J

    move-result-wide v0

    return-wide v0

    :cond_7
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v4

    move v14, v3

    move v12, v13

    move/from16 v16, v12

    move/from16 v28, v16

    :goto_6
    if-ge v12, v4, :cond_f

    sub-int v6, v14, v6

    add-int/lit8 v14, v12, 0x1

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v0, v14}, LZg/v;->t0(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LC0/n;

    if-eqz v11, :cond_8

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v2, v11, v7, v8}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    goto :goto_7

    :cond_8
    move v7, v13

    :goto_7
    if-eqz v11, :cond_9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-interface {v1, v11, v8, v13}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    add-int v8, v8, p4

    goto :goto_8

    :cond_9
    const/4 v8, 0x0

    :goto_8
    add-int/lit8 v12, v12, 0x2

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_a

    const/16 v17, 0x1

    goto :goto_9

    :cond_a
    const/16 v17, 0x0

    :goto_9
    sub-int v12, v14, v28

    invoke-static {v6, v15}, Lo/j;->b(II)J

    move-result-wide v19

    if-nez v11, :cond_b

    const/16 v21, 0x0

    goto :goto_a

    :cond_b
    invoke-static {v8, v7}, Lo/j;->b(II)J

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Lo/j;->a(J)Lo/j;

    move-result-object v13

    move-object/from16 v21, v13

    :goto_a
    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v16, v27

    move/from16 v18, v12

    move/from16 v22, v9

    move/from16 v23, v10

    move/from16 v24, v5

    invoke-virtual/range {v16 .. v26}, Lz/r;->b(ZIJLo/j;IIIZZ)Lz/r$b;

    move-result-object v13

    invoke-virtual {v13}, Lz/r$b;->b()Z

    move-result v16

    if-eqz v16, :cond_e

    add-int v5, v5, p5

    add-int/2addr v10, v5

    if-eqz v11, :cond_c

    const/16 v18, 0x1

    goto :goto_b

    :cond_c
    const/16 v18, 0x0

    :goto_b
    move-object/from16 v16, v27

    move-object/from16 v17, v13

    move/from16 v19, v9

    move/from16 v20, v10

    move/from16 v21, v6

    move/from16 v22, v12

    invoke-virtual/range {v16 .. v22}, Lz/r;->a(Lz/r$b;ZIIII)Lz/r$a;

    move-result-object v5

    sub-int v8, v8, p4

    add-int/lit8 v9, v9, 0x1

    invoke-virtual {v13}, Lz/r$b;->a()Z

    move-result v6

    if-eqz v6, :cond_d

    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lz/r$a;->b()J

    move-result-wide v0

    invoke-virtual {v5}, Lz/r$a;->c()Z

    move-result v2

    if-nez v2, :cond_10

    invoke-static {v0, v1}, Lo/j;->f(J)I

    move-result v0

    add-int v0, v0, p5

    add-int/2addr v10, v0

    goto :goto_d

    :cond_d
    move v5, v3

    move v6, v8

    move/from16 v28, v14

    const/4 v11, 0x0

    goto :goto_c

    :cond_e
    move v11, v5

    move v5, v6

    move v6, v8

    :goto_c
    move v12, v14

    move/from16 v16, v12

    const/4 v8, 0x1

    const/4 v13, 0x0

    move v14, v5

    move v5, v7

    goto/16 :goto_6

    :cond_f
    move/from16 v14, v16

    :cond_10
    :goto_d
    sub-int v10, v10, p5

    invoke-static {v10, v14}, Lo/j;->b(II)J

    move-result-wide v0

    return-wide v0
.end method

.method private static final h(Ljava/util/List;[I[IIIIIILz/v;)J
    .locals 9

    new-instance v1, Lz/t$e;

    move-object v0, p1

    invoke-direct {v1, p1}, Lz/t$e;-><init>([I)V

    new-instance v2, Lz/t$f;

    move-object v0, p2

    invoke-direct {v2, p2}, Lz/t$f;-><init>([I)V

    move-object v0, p0

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    invoke-static/range {v0 .. v8}, Lz/t;->g(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final i(LC0/n;ZI)I
    .locals 0

    if-eqz p1, :cond_0

    invoke-interface {p0, p2}, LC0/n;->R(I)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, p2}, LC0/n;->s0(I)I

    move-result p0

    :goto_0
    return p0
.end method

.method private static final j(Ljava/util/List;Lmh/q;III)I
    .locals 9

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v2, v0, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/n;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {p1, v6, v7, v8}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    add-int/2addr v6, p3

    add-int/lit8 v7, v2, 0x1

    sub-int v8, v7, v4

    if-eq v8, p4, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v8

    if-ne v7, v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/2addr v5, v6

    goto :goto_2

    :cond_1
    :goto_1
    add-int/2addr v5, v6

    sub-int/2addr v5, p3

    invoke-static {v3, v5}, Ljava/lang/Math;->max(II)I

    move-result v3

    move v5, v1

    move v4, v2

    :goto_2
    move v2, v7

    goto :goto_0

    :cond_2
    return v3
.end method

.method public static final k(LC0/B;Lz/x;JLmh/l;)J
    .locals 2

    invoke-static {p0}, Lz/S;->c(LC0/n;)Lz/V;

    move-result-object v0

    invoke-static {v0}, Lz/S;->e(Lz/V;)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    invoke-static {p0}, Lz/S;->c(LC0/n;)Lz/V;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lz/V;->c()Lz/s;

    :cond_0
    invoke-interface {p0, p2, p3}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object p0

    invoke-interface {p4, p0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1, p0}, Lz/x;->h(Landroidx/compose/ui/layout/t;)I

    move-result p2

    invoke-interface {p1, p0}, Lz/x;->k(Landroidx/compose/ui/layout/t;)I

    move-result p0

    invoke-static {p2, p0}, Lo/j;->b(II)J

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lz/x;->j()Z

    move-result p2

    const p3, 0x7fffffff

    invoke-static {p0, p2, p3}, Lz/t;->i(LC0/n;ZI)I

    move-result p2

    invoke-interface {p1}, Lz/x;->j()Z

    move-result p1

    invoke-static {p0, p1, p2}, Lz/t;->f(LC0/n;ZI)I

    move-result p0

    invoke-static {p2, p0}, Lo/j;->b(II)J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method private static final l(Ljava/util/List;Lmh/q;Lmh/q;IIIIILz/v;)I
    .locals 18

    move/from16 v0, p3

    move/from16 v10, p6

    move/from16 v11, p7

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v1

    new-array v12, v1, [I

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aput v2, v12, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v3

    new-array v13, v3, [I

    move v4, v2

    :goto_1
    if-ge v4, v3, :cond_2

    aput v2, v13, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v4

    move v5, v2

    :goto_2
    if-ge v5, v4, :cond_3

    move-object/from16 v14, p0

    invoke-interface {v14, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC0/n;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    move-object/from16 v9, p1

    invoke-interface {v9, v6, v7, v8}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    aput v7, v12, v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move-object/from16 v15, p2

    invoke-interface {v15, v6, v8, v7}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    aput v6, v13, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    move-object/from16 v14, p0

    const v4, 0x7fffffff

    if-eq v11, v4, :cond_4

    if-eq v10, v4, :cond_4

    mul-int v4, v10, v11

    :cond_4
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v5

    const/4 v6, 0x1

    if-ge v4, v5, :cond_6

    invoke-virtual/range {p8 .. p8}, Lz/v;->i()Lz/u$a;

    move-result-object v5

    sget-object v7, Lz/u$a;->ExpandIndicator:Lz/u$a;

    if-eq v5, v7, :cond_5

    invoke-virtual/range {p8 .. p8}, Lz/v;->i()Lz/u$a;

    move-result-object v5

    sget-object v7, Lz/u$a;->ExpandOrCollapseIndicator:Lz/u$a;

    if-ne v5, v7, :cond_6

    :cond_5
    :goto_3
    move v5, v6

    goto :goto_4

    :cond_6
    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v5

    if-lt v4, v5, :cond_7

    invoke-virtual/range {p8 .. p8}, Lz/v;->g()I

    move-result v5

    if-lt v11, v5, :cond_7

    invoke-virtual/range {p8 .. p8}, Lz/v;->i()Lz/u$a;

    move-result-object v5

    sget-object v7, Lz/u$a;->ExpandOrCollapseIndicator:Lz/u$a;

    if-ne v5, v7, :cond_7

    goto :goto_3

    :cond_7
    move v5, v2

    :goto_4
    sub-int/2addr v4, v5

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v15

    invoke-static {v12}, LZg/n;->U0([I)I

    move-result v4

    invoke-interface/range {p0 .. p0}, Ljava/util/List;->size()I

    move-result v5

    sub-int/2addr v5, v6

    mul-int v5, v5, p4

    add-int/2addr v4, v5

    if-eqz v3, :cond_13

    aget v3, v13, v2

    new-instance v5, Lsh/i;

    invoke-static {v13}, LZg/n;->e0([I)I

    move-result v7

    invoke-direct {v5, v6, v7}, Lsh/i;-><init>(II)V

    invoke-virtual {v5}, Lsh/g;->q()LZg/Q;

    move-result-object v5

    :cond_8
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v5}, LZg/Q;->d()I

    move-result v7

    aget v7, v13, v7

    if-ge v3, v7, :cond_8

    move v3, v7

    goto :goto_5

    :cond_9
    if-eqz v1, :cond_12

    aget v1, v12, v2

    new-instance v2, Lsh/i;

    invoke-static {v12}, LZg/n;->e0([I)I

    move-result v5

    invoke-direct {v2, v6, v5}, Lsh/i;-><init>(II)V

    invoke-virtual {v2}, Lsh/g;->q()LZg/Q;

    move-result-object v2

    :cond_a
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v2}, LZg/Q;->d()I

    move-result v5

    aget v5, v12, v5

    if-ge v1, v5, :cond_a

    move v1, v5

    goto :goto_6

    :cond_b
    move v9, v1

    move v8, v4

    :goto_7
    if-gt v9, v8, :cond_11

    if-ne v3, v0, :cond_c

    return v4

    :cond_c
    add-int v1, v9, v8

    div-int/lit8 v16, v1, 0x2

    move-object/from16 v1, p0

    move-object v2, v12

    move-object v3, v13

    move/from16 v4, v16

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move v10, v8

    move/from16 v8, p7

    move/from16 v17, v9

    move-object/from16 v9, p8

    invoke-static/range {v1 .. v9}, Lz/t;->h(Ljava/util/List;[I[IIIIIILz/v;)J

    move-result-wide v1

    invoke-static {v1, v2}, Lo/j;->e(J)I

    move-result v3

    invoke-static {v1, v2}, Lo/j;->f(J)I

    move-result v1

    if-gt v3, v0, :cond_f

    if-ge v1, v15, :cond_d

    goto :goto_8

    :cond_d
    if-ge v3, v0, :cond_e

    add-int/lit8 v8, v16, -0x1

    move/from16 v10, p6

    move/from16 v4, v16

    move/from16 v9, v17

    goto :goto_7

    :cond_e
    return v16

    :cond_f
    :goto_8
    add-int/lit8 v9, v16, 0x1

    if-le v9, v10, :cond_10

    return v9

    :cond_10
    move v8, v10

    move/from16 v4, v16

    move/from16 v10, p6

    goto :goto_7

    :cond_11
    return v4

    :cond_12
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_13
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public static final m(Landroidx/compose/ui/layout/m;JII[ILV/b;Lz/x;[I)LC0/D;
    .locals 10

    move-object v6, p0

    invoke-interface/range {p7 .. p7}, Lz/x;->j()Z

    move-result v7

    invoke-interface/range {p7 .. p7}, Lz/x;->p()Lz/c$m;

    move-result-object v0

    invoke-interface/range {p7 .. p7}, Lz/x;->o()Lz/c$e;

    move-result-object v1

    if-eqz v7, :cond_1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lz/c$m;->a()F

    move-result v1

    invoke-interface {p0, v1}, LY0/d;->x1(F)I

    move-result v1

    invoke-virtual/range {p6 .. p6}, LV/b;->o()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    mul-int/2addr v1, v2

    add-int/2addr v1, p4

    invoke-static {p1, p2}, LY0/b;->m(J)I

    move-result v2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v3

    invoke-static {v1, v2, v3}, Lsh/m;->k(III)I

    move-result v1

    move-object v3, p5

    move-object/from16 v5, p8

    invoke-interface {v0, p0, v1, p5, v5}, Lz/c$m;->b(LY0/d;I[I[I)V

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null verticalArrangement"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-object v3, p5

    move-object/from16 v5, p8

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lz/c$e;->a()F

    move-result v0

    invoke-interface {p0, v0}, LY0/d;->x1(F)I

    move-result v0

    invoke-virtual/range {p6 .. p6}, LV/b;->o()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    mul-int/2addr v0, v2

    add-int/2addr v0, p4

    invoke-static {p1, p2}, LY0/b;->m(J)I

    move-result v2

    invoke-static {p1, p2}, LY0/b;->k(J)I

    move-result v4

    invoke-static {v0, v2, v4}, Lsh/m;->k(III)I

    move-result v8

    invoke-interface {p0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    move-object v0, v1

    move-object v1, p0

    move v2, v8

    move-object v3, p5

    move-object/from16 v5, p8

    invoke-interface/range {v0 .. v5}, Lz/c$e;->c(LY0/d;I[ILY0/t;[I)V

    move v1, v8

    :goto_0
    invoke-static {p1, p2}, LY0/b;->n(J)I

    move-result v0

    invoke-static {p1, p2}, LY0/b;->l(J)I

    move-result v2

    move v3, p3

    invoke-static {p3, v0, v2}, Lsh/m;->k(III)I

    move-result v0

    if-eqz v7, :cond_2

    goto :goto_1

    :cond_2
    move v9, v1

    move v1, v0

    move v0, v9

    :goto_1
    new-instance v2, Lz/t$g;

    move-object/from16 v3, p6

    invoke-direct {v2, v3}, Lz/t$g;-><init>(LV/b;)V

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move p1, v0

    move p2, v1

    move-object p3, v5

    move-object p4, v2

    move p5, v3

    move-object/from16 p6, v4

    invoke-static/range {p0 .. p6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "null horizontalArrangement"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final n(Lz/c$e;Lz/c$m;IILz/v;LT/l;I)LC0/G;
    .locals 17

    move-object/from16 v0, p5

    move/from16 v1, p6

    invoke-static {}, LT/o;->H()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, -0x1

    const-string v3, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:413)"

    const v4, -0x7f39ec4b

    invoke-static {v4, v1, v2, v3}, LT/o;->Q(IIILjava/lang/String;)V

    :cond_0
    and-int/lit8 v2, v1, 0xe

    xor-int/lit8 v2, v2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-le v2, v3, :cond_1

    move-object/from16 v2, p0

    invoke-interface {v0, v2}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    goto :goto_0

    :cond_1
    move-object/from16 v2, p0

    :goto_0
    and-int/lit8 v6, v1, 0x6

    if-ne v6, v3, :cond_3

    :cond_2
    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v4

    :goto_1
    and-int/lit8 v6, v1, 0x70

    xor-int/lit8 v6, v6, 0x30

    const/16 v7, 0x20

    move-object/from16 v9, p1

    if-le v6, v7, :cond_4

    invoke-interface {v0, v9}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-ne v6, v7, :cond_6

    :cond_5
    move v6, v5

    goto :goto_2

    :cond_6
    move v6, v4

    :goto_2
    or-int/2addr v3, v6

    and-int/lit16 v6, v1, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v7, 0x100

    move/from16 v13, p2

    if-le v6, v7, :cond_7

    invoke-interface {v0, v13}, LT/l;->i(I)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    and-int/lit16 v6, v1, 0x180

    if-ne v6, v7, :cond_9

    :cond_8
    move v6, v5

    goto :goto_3

    :cond_9
    move v6, v4

    :goto_3
    or-int/2addr v3, v6

    and-int/lit16 v6, v1, 0x1c00

    xor-int/lit16 v6, v6, 0xc00

    const/16 v7, 0x800

    move/from16 v14, p3

    if-le v6, v7, :cond_a

    invoke-interface {v0, v14}, LT/l;->i(I)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    and-int/lit16 v1, v1, 0xc00

    if-ne v1, v7, :cond_c

    :cond_b
    move v4, v5

    :cond_c
    or-int v1, v3, v4

    move-object/from16 v3, p4

    invoke-interface {v0, v3}, LT/l;->T(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-interface/range {p5 .. p5}, LT/l;->f()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_d

    sget-object v1, LT/l;->a:LT/l$a;

    invoke-virtual {v1}, LT/l$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v4, v1, :cond_e

    :cond_d
    invoke-interface/range {p0 .. p0}, Lz/c$e;->a()F

    move-result v10

    sget-object v11, Lz/t;->a:Lz/m;

    invoke-interface/range {p1 .. p1}, Lz/c$m;->a()F

    move-result v12

    new-instance v4, Lz/y;

    const/4 v7, 0x1

    const/16 v16, 0x0

    move-object v6, v4

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    move/from16 v13, p2

    move/from16 v14, p3

    move-object/from16 v15, p4

    invoke-direct/range {v6 .. v16}, Lz/y;-><init>(ZLz/c$e;Lz/c$m;FLz/m;FIILz/v;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v4}, LT/l;->K(Ljava/lang/Object;)V

    :cond_e
    check-cast v4, Lz/y;

    invoke-static {}, LT/o;->H()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LT/o;->P()V

    :cond_f
    return-object v4
.end method

.method private static final o(Ljava/util/Iterator;Lz/w;)LC0/B;
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LC0/B;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
