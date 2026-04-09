.class public abstract LC/s;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic a(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;
    .locals 0

    invoke-static/range {p0 .. p12}, LC/s;->g(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;

    move-result-object p0

    return-object p0
.end method

.method private static final b(ILjava/util/List;IIILx/j;I)LC/e;
    .locals 15

    move-object/from16 v0, p1

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, LC/e;

    invoke-virtual {v2}, LC/e;->b()I

    move-result v7

    invoke-virtual {v2}, LC/e;->getIndex()I

    move-result v8

    move v3, p0

    move/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    invoke-static/range {v3 .. v10}, Lx/k;->a(IIIIIILx/j;I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    neg-float v2, v2

    invoke-static/range {p1 .. p1}, LZg/v;->n(Ljava/util/List;)I

    move-result v3

    const/4 v4, 0x1

    if-gt v4, v3, :cond_2

    :goto_0
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LC/e;

    invoke-virtual {v6}, LC/e;->b()I

    move-result v11

    invoke-virtual {v6}, LC/e;->getIndex()I

    move-result v12

    move v7, p0

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move-object/from16 v13, p5

    move/from16 v14, p6

    invoke-static/range {v7 .. v14}, Lx/k;->a(IIIIIILx/j;I)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    neg-float v6, v6

    invoke-static {v2, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v7

    if-gez v7, :cond_1

    move-object v1, v5

    move v2, v6

    :cond_1
    if-eq v4, v3, :cond_2

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, LC/e;

    return-object v0
.end method

.method private static final c(LB/x;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILw/q;ZLY0/d;II)Ljava/util/List;
    .locals 16

    move-object/from16 v0, p1

    move/from16 v1, p4

    move/from16 v2, p5

    move/from16 v3, p8

    move-object/from16 v4, p9

    move/from16 v5, p10

    move/from16 v6, p12

    add-int v7, p13, v6

    sget-object v8, Lw/q;->Vertical:Lw/q;

    if-ne v4, v8, :cond_0

    move/from16 v8, p7

    move v14, v2

    goto :goto_0

    :cond_0
    move/from16 v8, p7

    move v14, v1

    :goto_0
    invoke-static {v14, v8}, Ljava/lang/Math;->min(II)I

    move-result v8

    const/4 v9, 0x0

    move/from16 v10, p6

    if-ge v10, v8, :cond_1

    const/4 v8, 0x1

    goto :goto_1

    :cond_1
    move v8, v9

    :goto_1
    if-eqz v8, :cond_3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "non-zero pagesScrollOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_2
    new-instance v15, Ljava/util/ArrayList;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v10

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v11

    add-int/2addr v10, v11

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v11

    add-int/2addr v10, v11

    invoke-direct {v15, v10}, Ljava/util/ArrayList;-><init>(I)V

    if-eqz v8, :cond_c

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface/range {p3 .. p3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v3

    new-array v11, v3, [I

    move v7, v9

    :goto_3
    if-ge v7, v3, :cond_4

    aput p13, v11, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_4
    new-array v7, v3, [I

    move v8, v9

    :goto_4
    if-ge v8, v3, :cond_5

    aput v9, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_5
    sget-object v8, Lz/c$a;->a:Lz/c$a;

    move-object/from16 v9, p0

    invoke-interface {v9, v6}, LB/x;->x(I)F

    move-result v6

    invoke-virtual {v8, v6}, Lz/c$a;->c(F)Lz/c$f;

    move-result-object v8

    sget-object v6, Lw/q;->Vertical:Lw/q;

    if-ne v4, v6, :cond_6

    move-object/from16 v4, p11

    invoke-interface {v8, v4, v14, v11, v7}, Lz/c$m;->b(LY0/d;I[I[I)V

    goto :goto_5

    :cond_6
    move-object/from16 v4, p11

    sget-object v12, LY0/t;->Ltr:LY0/t;

    move-object/from16 v9, p11

    move v10, v14

    move-object v13, v7

    invoke-interface/range {v8 .. v13}, Lz/c$e;->c(LY0/d;I[ILY0/t;[I)V

    :goto_5
    invoke-static {v7}, LZg/n;->b0([I)Lsh/i;

    move-result-object v4

    if-nez v5, :cond_7

    goto :goto_6

    :cond_7
    invoke-static {v4}, Lsh/m;->q(Lsh/g;)Lsh/g;

    move-result-object v4

    :goto_6
    invoke-virtual {v4}, Lsh/g;->i()I

    move-result v6

    invoke-virtual {v4}, Lsh/g;->j()I

    move-result v8

    invoke-virtual {v4}, Lsh/g;->k()I

    move-result v4

    if-lez v4, :cond_8

    if-le v6, v8, :cond_9

    :cond_8
    if-gez v4, :cond_f

    if-gt v8, v6, :cond_f

    :cond_9
    :goto_7
    aget v9, v7, v6

    invoke-static {v6, v5, v3}, LC/s;->d(IZI)I

    move-result v10

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LC/e;

    if-eqz v5, :cond_a

    sub-int v9, v14, v9

    invoke-virtual {v10}, LC/e;->g()I

    move-result v11

    sub-int/2addr v9, v11

    :cond_a
    invoke-virtual {v10, v9, v1, v2}, LC/e;->i(III)V

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eq v6, v8, :cond_f

    add-int/2addr v6, v4

    goto :goto_7

    :cond_b
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No extra pages"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    move v6, v3

    move v5, v9

    :goto_8
    if-ge v5, v4, :cond_d

    move-object/from16 v8, p2

    invoke-interface {v8, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, LC/e;

    sub-int/2addr v6, v7

    invoke-virtual {v10, v6, v1, v2}, LC/e;->i(III)V

    invoke-virtual {v15, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_8

    :cond_d
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    move-result v4

    move v5, v9

    :goto_9
    if-ge v5, v4, :cond_e

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LC/e;

    invoke-virtual {v6, v3, v1, v2}, LC/e;->i(III)V

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v7

    add-int/lit8 v5, v5, 0x1

    goto :goto_9

    :cond_e
    invoke-interface/range {p3 .. p3}, Ljava/util/List;->size()I

    move-result v0

    :goto_a
    if-ge v9, v0, :cond_f

    move-object/from16 v4, p3

    invoke-interface {v4, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LC/e;

    invoke-virtual {v5, v3, v1, v2}, LC/e;->i(III)V

    invoke-virtual {v15, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v3, v7

    add-int/lit8 v9, v9, 0x1

    goto :goto_a

    :cond_f
    return-object v15
.end method

.method private static final d(IZI)I
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p2, p0

    add-int/lit8 p0, p2, -0x1

    :goto_0
    return p0
.end method

.method private static final e(IIILjava/util/List;Lmh/l;)Ljava/util/List;
    .locals 4

    add-int/2addr p2, p0

    add-int/lit8 v0, p1, -0x1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/lit8 p0, p0, 0x1

    const/4 v0, 0x0

    if-gt p0, p2, :cond_1

    :goto_0
    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p4, v1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq p0, p2, :cond_1

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, p0, :cond_4

    invoke-interface {p3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    add-int/lit8 v3, p2, 0x1

    if-gt v3, v2, :cond_3

    if-ge v2, p1, :cond_3

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p4, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    if-nez v0, :cond_5

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_5
    return-object v0
.end method

.method private static final f(IILjava/util/List;Lmh/l;)Ljava/util/List;
    .locals 3

    sub-int p1, p0, p1

    const/4 v0, 0x0

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    add-int/lit8 p0, p0, -0x1

    const/4 v1, 0x0

    if-gt p1, p0, :cond_1

    :goto_0
    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eq p0, p1, :cond_1

    add-int/lit8 p0, p0, -0x1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p0

    :goto_1
    if-ge v0, p0, :cond_4

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    if-ge v2, p1, :cond_3

    if-nez v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_2
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_4
    if-nez v1, :cond_5

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v1

    :cond_5
    return-object v1
.end method

.method private static final g(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;
    .locals 14

    move v1, p1

    move-object/from16 v0, p4

    invoke-virtual {v0, p1}, LC/r;->b(I)Ljava/lang/Object;

    move-result-object v6

    invoke-interface/range {p0 .. p3}, LB/x;->M0(IJ)Ljava/util/List;

    move-result-object v3

    new-instance v13, LC/e;

    const/4 v12, 0x0

    move-object v0, v13

    move/from16 v2, p12

    move-wide/from16 v4, p5

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v12}, LC/e;-><init>(IILjava/util/List;JLjava/lang/Object;Lw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13
.end method

.method public static final h(LB/x;ILC/r;IIIIIIJLw/q;Lf0/c$c;Lf0/c$b;ZJIILjava/util/List;Lx/j;LT/q0;LIi/N;Lmh/q;)LC/u;
    .locals 32

    move/from16 v7, p1

    move/from16 v6, p3

    move/from16 v5, p4

    move-wide/from16 v0, p9

    move-object/from16 v4, p11

    move/from16 v3, p18

    move-object/from16 v2, p19

    move-object/from16 v15, p23

    if-ltz v5, :cond_2a

    if-ltz p5, :cond_29

    add-int v8, p17, p6

    const/4 v13, 0x0

    invoke-static {v8, v13}, Lsh/m;->d(II)I

    move-result v14

    if-gtz v7, :cond_0

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v8

    neg-int v13, v5

    add-int v14, v6, p5

    invoke-static/range {p9 .. p10}, LY0/b;->n(J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static/range {p9 .. p10}, LY0/b;->m(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, LC/s$b;->a:LC/s$b;

    invoke-interface {v15, v2, v0, v1}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, LC0/D;

    new-instance v0, LC/u;

    move-object v7, v0

    const/high16 v28, 0x60000

    const/16 v29, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v9, p17

    move/from16 v10, p6

    move/from16 v11, p5

    move-object/from16 v12, p11

    move/from16 v16, p18

    move-object/from16 v22, p20

    move-object/from16 v27, p22

    invoke-direct/range {v7 .. v29}, LC/u;-><init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_0
    sget-object v8, Lw/q;->Vertical:Lw/q;

    if-ne v4, v8, :cond_1

    invoke-static/range {p9 .. p10}, LY0/b;->l(J)I

    move-result v9

    move/from16 v17, v9

    goto :goto_0

    :cond_1
    move/from16 v17, p17

    :goto_0
    if-eq v4, v8, :cond_2

    invoke-static/range {p9 .. p10}, LY0/b;->k(J)I

    move-result v8

    move/from16 v19, v8

    goto :goto_1

    :cond_2
    move/from16 v19, p17

    :goto_1
    const/16 v20, 0x5

    const/16 v21, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, LY0/c;->b(IIIIILjava/lang/Object;)J

    move-result-wide v21

    move/from16 v8, p7

    move/from16 v9, p8

    :goto_2
    if-lez v8, :cond_3

    if-lez v9, :cond_3

    add-int/lit8 v8, v8, -0x1

    sub-int/2addr v9, v14

    goto :goto_2

    :cond_3
    mul-int/lit8 v9, v9, -0x1

    if-lt v8, v7, :cond_4

    add-int/lit8 v8, v7, -0x1

    move v9, v13

    :cond_4
    new-instance v12, LZg/m;

    invoke-direct {v12}, LZg/m;-><init>()V

    neg-int v10, v5

    if-gez p6, :cond_5

    move/from16 v11, p6

    goto :goto_3

    :cond_5
    move v11, v13

    :goto_3
    add-int/2addr v11, v10

    add-int/2addr v9, v11

    move v0, v13

    :goto_4
    if-gez v9, :cond_6

    if-lez v8, :cond_6

    add-int/lit8 v1, v8, -0x1

    invoke-interface/range {p0 .. p0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v18

    move-object/from16 v8, p0

    move v4, v9

    move v9, v1

    move/from16 p7, v1

    move/from16 v23, v10

    move v1, v11

    move-wide/from16 v10, v21

    move-object v2, v12

    move-object/from16 v12, p2

    move v3, v13

    move/from16 v30, v14

    move-wide/from16 v13, p15

    move-object/from16 v15, p11

    move-object/from16 v16, p13

    move-object/from16 v17, p12

    move/from16 v19, p14

    move/from16 v20, p17

    invoke-static/range {v8 .. v20}, LC/s;->g(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;

    move-result-object v8

    invoke-virtual {v2, v3, v8}, LZg/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v8}, LC/e;->c()I

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    move/from16 v15, v30

    add-int v9, v4, v15

    move/from16 v8, p7

    move-object/from16 v4, p11

    move v11, v1

    move-object v12, v2

    move v13, v3

    move v14, v15

    move/from16 v10, v23

    move/from16 v3, p18

    move-object/from16 v2, p19

    move-object/from16 v15, p23

    goto :goto_4

    :cond_6
    move v4, v9

    move/from16 v23, v10

    move v1, v11

    move-object v2, v12

    move v3, v13

    move v15, v14

    if-ge v4, v1, :cond_7

    move v11, v1

    goto :goto_5

    :cond_7
    move v11, v4

    :goto_5
    sub-int/2addr v11, v1

    add-int v4, v6, p5

    invoke-static {v4, v3}, Lsh/m;->d(II)I

    move-result v13

    neg-int v9, v11

    move v10, v3

    move v12, v10

    move v14, v8

    :goto_6
    invoke-virtual {v2}, LZg/h;->size()I

    move-result v3

    const/16 v25, 0x1

    if-ge v10, v3, :cond_9

    if-lt v9, v13, :cond_8

    invoke-virtual {v2, v10}, LZg/h;->remove(I)Ljava/lang/Object;

    move/from16 v12, v25

    goto :goto_6

    :cond_8
    add-int/lit8 v14, v14, 0x1

    add-int/2addr v9, v15

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_9
    move v3, v8

    move/from16 v26, v11

    move/from16 v27, v12

    move v12, v14

    move v14, v9

    :goto_7
    if-ge v12, v7, :cond_a

    if-lt v14, v13, :cond_b

    if-lez v14, :cond_b

    invoke-virtual {v2}, LZg/m;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_8

    :cond_a
    move/from16 p8, v3

    move/from16 p7, v4

    move v4, v12

    move v3, v14

    move v5, v15

    goto :goto_b

    :cond_b
    :goto_8
    invoke-interface/range {p0 .. p0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v18

    move-object/from16 v8, p0

    move v9, v12

    move-wide/from16 v10, v21

    move/from16 p7, v4

    move v4, v12

    move-object/from16 v12, p2

    move/from16 p8, v3

    move/from16 v28, v13

    move v3, v14

    move-wide/from16 v13, p15

    move v5, v15

    move-object/from16 v15, p11

    move-object/from16 v16, p13

    move-object/from16 v17, p12

    move/from16 v19, p14

    move/from16 v20, p17

    invoke-static/range {v8 .. v20}, LC/s;->g(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;

    move-result-object v8

    add-int/lit8 v9, v7, -0x1

    if-ne v4, v9, :cond_c

    move/from16 v14, p17

    goto :goto_9

    :cond_c
    move v14, v5

    :goto_9
    add-int/2addr v14, v3

    if-gt v14, v1, :cond_d

    if-eq v4, v9, :cond_d

    add-int/lit8 v12, v4, 0x1

    sub-int v26, v26, v5

    move v3, v12

    move/from16 v27, v25

    goto :goto_a

    :cond_d
    invoke-virtual {v8}, LC/e;->c()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {v2, v8}, LZg/m;->add(Ljava/lang/Object;)Z

    move/from16 v3, p8

    :goto_a
    add-int/lit8 v12, v4, 0x1

    move/from16 v4, p7

    move v15, v5

    move/from16 v13, v28

    move/from16 v5, p4

    goto :goto_7

    :goto_b
    if-ge v3, v6, :cond_10

    sub-int v1, v6, v3

    sub-int v26, v26, v1

    add-int/2addr v1, v3

    move/from16 v15, p4

    move/from16 v3, p8

    move v13, v5

    move/from16 v5, v26

    :goto_c
    if-ge v5, v15, :cond_e

    if-lez v3, :cond_e

    add-int/lit8 v3, v3, -0x1

    invoke-interface/range {p0 .. p0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v18

    move-object/from16 v8, p0

    move v9, v3

    move-wide/from16 v10, v21

    move-object/from16 v12, p2

    move v6, v13

    move-wide/from16 v13, p15

    move-object/from16 v15, p11

    move-object/from16 v16, p13

    move-object/from16 v17, p12

    move/from16 v19, p14

    move/from16 v20, p17

    invoke-static/range {v8 .. v20}, LC/s;->g(LB/x;IJLC/r;JLw/q;Lf0/c$b;Lf0/c$c;LY0/t;ZI)LC/e;

    move-result-object v8

    const/4 v15, 0x0

    invoke-virtual {v2, v15, v8}, LZg/m;->add(ILjava/lang/Object;)V

    invoke-virtual {v8}, LC/e;->c()I

    move-result v8

    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v5, v6

    move/from16 v15, p4

    move v13, v6

    move/from16 v6, p3

    goto :goto_c

    :cond_e
    move v6, v13

    const/4 v15, 0x0

    if-gez v5, :cond_f

    add-int v14, v1, v5

    move v5, v14

    move v13, v15

    goto :goto_d

    :cond_f
    move v13, v5

    move v5, v1

    goto :goto_d

    :cond_10
    move v6, v5

    const/4 v15, 0x0

    move v5, v3

    move/from16 v13, v26

    move/from16 v3, p8

    :goto_d
    if-ltz v13, :cond_28

    neg-int v1, v13

    invoke-virtual {v2}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC/e;

    if-gtz p4, :cond_12

    if-gez p6, :cond_11

    goto :goto_e

    :cond_11
    move/from16 v24, v13

    move-object v13, v8

    goto :goto_10

    :cond_12
    :goto_e
    invoke-virtual {v2}, LZg/h;->size()I

    move-result v9

    move v10, v13

    move v13, v15

    :goto_f
    if-ge v13, v9, :cond_13

    if-eqz v10, :cond_13

    if-gt v6, v10, :cond_13

    invoke-static {v2}, LZg/v;->n(Ljava/util/List;)I

    move-result v11

    if-eq v13, v11, :cond_13

    sub-int/2addr v10, v6

    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v2, v13}, LZg/m;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC/e;

    goto :goto_f

    :cond_13
    move-object v13, v8

    move/from16 v24, v10

    :goto_10
    new-instance v14, LC/s$d;

    move-object v8, v14

    move-object/from16 v9, p0

    move-wide/from16 v10, v21

    move-object/from16 v12, p2

    move/from16 p8, v0

    move/from16 v26, v4

    move-object v4, v13

    move-object v0, v14

    move-wide/from16 v13, p15

    move/from16 v20, v15

    move-object/from16 v15, p11

    move-object/from16 v16, p13

    move-object/from16 v17, p12

    move/from16 v18, p14

    move/from16 v19, p17

    invoke-direct/range {v8 .. v19}, LC/s$d;-><init>(LB/x;JLC/r;JLw/q;Lf0/c$b;Lf0/c$c;ZI)V

    move-object/from16 v15, p19

    move-object/from16 v29, v2

    move/from16 v28, v20

    move/from16 v2, p18

    invoke-static {v3, v2, v15, v0}, LC/s;->f(IILjava/util/List;Lmh/l;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v13, p8

    move/from16 v8, v28

    :goto_11
    if-ge v8, v3, :cond_14

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LC/e;

    invoke-virtual {v9}, LC/e;->c()I

    move-result v9

    invoke-static {v13, v9}, Ljava/lang/Math;->max(II)I

    move-result v13

    add-int/lit8 v8, v8, 0x1

    goto :goto_11

    :cond_14
    invoke-virtual/range {v29 .. v29}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LC/e;

    invoke-virtual {v3}, LC/e;->getIndex()I

    move-result v3

    new-instance v14, LC/s$c;

    move-object v8, v14

    move-object/from16 v9, p0

    move-wide/from16 v10, v21

    move-object/from16 v12, p2

    move/from16 v30, v6

    move/from16 v20, v13

    move-object v6, v14

    move-wide/from16 v13, p15

    move/from16 v21, v1

    move-object v1, v15

    move-object/from16 v15, p11

    move-object/from16 v16, p13

    move-object/from16 v17, p12

    move/from16 v18, p14

    move/from16 v19, p17

    invoke-direct/range {v8 .. v19}, LC/s$c;-><init>(LB/x;JLC/r;JLw/q;Lf0/c$b;Lf0/c$c;ZI)V

    invoke-static {v3, v7, v2, v1, v6}, LC/s;->e(IIILjava/util/List;Lmh/l;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v6, v20

    move/from16 v13, v28

    :goto_12
    if-ge v13, v3, :cond_15

    invoke-interface {v1, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC/e;

    invoke-virtual {v8}, LC/e;->c()I

    move-result v8

    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    add-int/lit8 v13, v13, 0x1

    goto :goto_12

    :cond_15
    invoke-virtual/range {v29 .. v29}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_16

    move/from16 v3, v25

    goto :goto_13

    :cond_16
    move/from16 v3, v28

    :goto_13
    sget-object v8, Lw/q;->Vertical:Lw/q;

    move-object/from16 v15, p11

    if-ne v15, v8, :cond_17

    move-wide/from16 v9, p9

    move v11, v6

    goto :goto_14

    :cond_17
    move-wide/from16 v9, p9

    move v11, v5

    :goto_14
    invoke-static {v9, v10, v11}, LY0/c;->i(JI)I

    move-result v22

    if-ne v15, v8, :cond_18

    move v6, v5

    :cond_18
    invoke-static {v9, v10, v6}, LY0/c;->h(JI)I

    move-result v31

    move-object/from16 v8, p0

    move-object/from16 v9, v29

    move-object v10, v0

    move-object v11, v1

    move/from16 v12, v22

    move/from16 v13, v31

    move v14, v5

    move-object v6, v15

    move/from16 v15, p3

    move/from16 v16, v21

    move-object/from16 v17, p11

    move/from16 v18, p14

    move-object/from16 v19, p0

    move/from16 v20, p6

    move/from16 v21, p17

    invoke-static/range {v8 .. v21}, LC/s;->c(LB/x;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILw/q;ZLY0/d;II)Ljava/util/List;

    move-result-object v8

    if-eqz v3, :cond_19

    move-object v9, v8

    goto :goto_16

    :cond_19
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    invoke-direct {v3, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v9

    move/from16 v13, v28

    :goto_15
    if-ge v13, v9, :cond_1b

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, LC/e;

    invoke-virtual {v11}, LC/e;->getIndex()I

    move-result v12

    invoke-virtual/range {v29 .. v29}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, LC/e;

    invoke-virtual {v14}, LC/e;->getIndex()I

    move-result v14

    if-lt v12, v14, :cond_1a

    invoke-virtual {v11}, LC/e;->getIndex()I

    move-result v11

    invoke-virtual/range {v29 .. v29}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LC/e;

    invoke-virtual {v12}, LC/e;->getIndex()I

    move-result v12

    if-gt v11, v12, :cond_1a

    invoke-interface {v3, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1a
    add-int/lit8 v13, v13, 0x1

    goto :goto_15

    :cond_1b
    move-object v9, v3

    :goto_16
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1d

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_1c
    move-object/from16 v18, v0

    goto :goto_18

    :cond_1d
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v3

    move/from16 v13, v28

    :goto_17
    if-ge v13, v3, :cond_1c

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, LC/e;

    invoke-virtual {v11}, LC/e;->getIndex()I

    move-result v11

    invoke-virtual/range {v29 .. v29}, LZg/m;->first()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, LC/e;

    invoke-virtual {v12}, LC/e;->getIndex()I

    move-result v12

    if-ge v11, v12, :cond_1e

    invoke-interface {v0, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1e
    add-int/lit8 v13, v13, 0x1

    goto :goto_17

    :goto_18
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-static {}, LZg/v;->l()Ljava/util/List;

    move-result-object v0

    :cond_1f
    move-object/from16 v19, v0

    goto :goto_1a

    :cond_20
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v1

    move/from16 v13, v28

    :goto_19
    if-ge v13, v1, :cond_1f

    invoke-interface {v8, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, LC/e;

    invoke-virtual {v10}, LC/e;->getIndex()I

    move-result v10

    invoke-virtual/range {v29 .. v29}, LZg/m;->last()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, LC/e;

    invoke-virtual {v11}, LC/e;->getIndex()I

    move-result v11

    if-le v10, v11, :cond_21

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_21
    add-int/lit8 v13, v13, 0x1

    goto :goto_19

    :goto_1a
    sget-object v0, Lw/q;->Vertical:Lw/q;

    if-ne v6, v0, :cond_22

    move/from16 v0, v31

    goto :goto_1b

    :cond_22
    move/from16 v0, v22

    :goto_1b
    move-object v1, v9

    move/from16 v2, p4

    move/from16 v3, p5

    move/from16 v10, p7

    move-object v11, v4

    move/from16 v12, v26

    move/from16 v4, v30

    move v14, v5

    move-object/from16 v5, p20

    move/from16 v13, p3

    move/from16 v15, v30

    move/from16 v6, p1

    invoke-static/range {v0 .. v6}, LC/s;->b(ILjava/util/List;IIILx/j;I)LC/e;

    move-result-object v16

    if-eqz v16, :cond_23

    invoke-virtual/range {v16 .. v16}, LC/e;->getIndex()I

    move-result v0

    move v5, v0

    goto :goto_1c

    :cond_23
    move/from16 v5, v28

    :goto_1c
    move-object/from16 v0, p20

    move/from16 v1, p3

    move/from16 v2, p17

    move/from16 v3, p4

    move/from16 v4, p5

    move/from16 v6, p1

    invoke-interface/range {v0 .. v6}, Lx/j;->a(IIIIII)I

    move-result v0

    if-eqz v16, :cond_24

    invoke-virtual/range {v16 .. v16}, LC/e;->b()I

    move-result v1

    goto :goto_1d

    :cond_24
    move/from16 v1, v28

    :goto_1d
    if-nez v15, :cond_25

    const/4 v0, 0x0

    :goto_1e
    move v15, v0

    goto :goto_1f

    :cond_25
    sub-int/2addr v0, v1

    int-to-float v0, v0

    int-to-float v1, v15

    div-float/2addr v0, v1

    const/high16 v1, -0x41000000    # -0.5f

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v1, v2}, Lsh/m;->j(FFF)F

    move-result v0

    goto :goto_1e

    :goto_1f
    invoke-static/range {v22 .. v22}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static/range {v31 .. v31}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    new-instance v2, LC/s$a;

    move-object/from16 v3, p21

    invoke-direct {v2, v8, v3}, LC/s$a;-><init>(Ljava/util/List;LT/q0;)V

    move-object/from16 v3, p23

    invoke-interface {v3, v0, v1, v2}, Lmh/q;->s(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, LC0/D;

    if-lt v12, v7, :cond_27

    if-le v14, v13, :cond_26

    goto :goto_20

    :cond_26
    move/from16 v14, v28

    goto :goto_21

    :cond_27
    :goto_20
    move/from16 v14, v25

    :goto_21
    new-instance v21, LC/u;

    move-object/from16 v0, v21

    move-object v1, v9

    move/from16 v2, p17

    move/from16 v3, p6

    move/from16 v4, p5

    move-object/from16 v5, p11

    move/from16 v6, v23

    move v7, v10

    move/from16 v8, p14

    move/from16 v9, p18

    move-object v10, v11

    move-object/from16 v11, v16

    move v12, v15

    move/from16 v13, v24

    move-object/from16 v15, p20

    move-object/from16 v16, v17

    move/from16 v17, v27

    move-object/from16 v20, p22

    invoke-direct/range {v0 .. v20}, LC/u;-><init>(Ljava/util/List;IIILw/q;IIZILC/e;LC/e;FIZLx/j;LC0/D;ZLjava/util/List;Ljava/util/List;LIi/N;)V

    return-object v21

    :cond_28
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid currentFirstPageScrollOffset"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_29
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative afterContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "negative beforeContentPadding"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
