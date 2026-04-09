.class final LN/X0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# instance fields
.field private final a:Z

.field private final b:F

.field private final c:Lz/N;


# direct methods
.method public constructor <init>(ZFLz/N;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, LN/X0;->a:Z

    iput p2, p0, LN/X0;->b:F

    iput-object p3, p0, LN/X0;->c:Lz/N;

    return-void
.end method

.method public static final synthetic a(LN/X0;)F
    .locals 0

    iget p0, p0, LN/X0;->b:F

    return p0
.end method

.method public static final synthetic d(LN/X0;)Lz/N;
    .locals 0

    iget-object p0, p0, LN/X0;->c:Lz/N;

    return-object p0
.end method

.method public static final synthetic g(LN/X0;)Z
    .locals 0

    iget-boolean p0, p0, LN/X0;->a:Z

    return p0
.end method

.method private final h(LC0/o;Ljava/util/List;ILmh/p;)I
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x0

    if-ge v4, v2, :cond_1

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LC0/n;

    invoke-static {v7}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Leading"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v6, v5

    :goto_1
    check-cast v6, LC0/n;

    const v2, 0x7fffffff

    if-eqz v6, :cond_2

    invoke-interface {v6, v2}, LC0/n;->S(I)I

    move-result v4

    move/from16 v7, p3

    invoke-static {v7, v4}, LN/W0;->f(II)I

    move-result v4

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v1, v6, v8}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    move v9, v6

    goto :goto_2

    :cond_2
    move/from16 v7, p3

    move v9, v3

    move v4, v7

    :goto_2
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    move v8, v3

    :goto_3
    if-ge v8, v6, :cond_4

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, LC0/n;

    invoke-static {v11}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "Trailing"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_4
    move-object v10, v5

    :goto_4
    check-cast v10, LC0/n;

    if-eqz v10, :cond_5

    invoke-interface {v10, v2}, LC0/n;->S(I)I

    move-result v2

    invoke-static {v4, v2}, LN/W0;->f(II)I

    move-result v4

    invoke-static/range {p3 .. p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v10, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move v10, v2

    goto :goto_5

    :cond_5
    move v10, v3

    :goto_5
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v6, v3

    :goto_6
    if-ge v6, v2, :cond_7

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LC0/n;

    invoke-static {v8}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v8

    const-string v11, "Label"

    invoke-static {v8, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_7
    move-object v7, v5

    :goto_7
    check-cast v7, LC0/n;

    if-eqz v7, :cond_8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    move v8, v2

    goto :goto_8

    :cond_8
    move v8, v3

    :goto_8
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v6, v3

    :goto_9
    if-ge v6, v2, :cond_e

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, LC0/n;

    invoke-static {v11}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v11

    const-string v12, "TextField"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v7, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v2

    move v7, v3

    :goto_a
    if-ge v7, v2, :cond_a

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, LC0/n;

    invoke-static {v12}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v12

    const-string v13, "Hint"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_9

    move-object v5, v11

    goto :goto_b

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_a
    :goto_b
    check-cast v5, LC0/n;

    if-eqz v5, :cond_b

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v5, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v11, v0

    goto :goto_c

    :cond_b
    move v11, v3

    :goto_c
    if-lez v8, :cond_c

    const/4 v3, 0x1

    :cond_c
    move v7, v3

    invoke-static {}, LN/V0;->h()J

    move-result-wide v12

    invoke-interface/range {p1 .. p1}, LY0/d;->getDensity()F

    move-result v14

    move-object/from16 v0, p0

    iget-object v15, v0, LN/X0;->c:Lz/N;

    invoke-static/range {v6 .. v15}, LN/W0;->b(IZIIIIJFLz/N;)I

    move-result v1

    return v1

    :cond_d
    add-int/lit8 v6, v6, 0x1

    goto :goto_9

    :cond_e
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final j(Ljava/util/List;ILmh/p;)I
    .locals 11

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_d

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, LC0/n;

    invoke-static {v4}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "TextField"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v3, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_1
    const/4 v3, 0x0

    if-ge v2, v0, :cond_1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LC0/n;

    invoke-static {v6}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "Label"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_2
    check-cast v5, LC0/n;

    if-eqz v5, :cond_2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v5, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    move v5, v0

    goto :goto_3

    :cond_2
    move v5, v1

    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    move v2, v1

    :goto_4
    if-ge v2, v0, :cond_4

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, LC0/n;

    invoke-static {v7}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v7

    const-string v8, "Trailing"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_5

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_4
    move-object v6, v3

    :goto_5
    check-cast v6, LC0/n;

    if-eqz v6, :cond_5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p3, v6, v0}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_6

    :cond_5
    move v0, v1

    :goto_6
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    move v6, v1

    :goto_7
    if-ge v6, v2, :cond_7

    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, LC0/n;

    invoke-static {v8}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "Leading"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_8

    :cond_6
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_7
    move-object v7, v3

    :goto_8
    check-cast v7, LC0/n;

    if-eqz v7, :cond_8

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v7, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    goto :goto_9

    :cond_8
    move v2, v1

    :goto_9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    move v7, v1

    :goto_a
    if-ge v7, v6, :cond_a

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, LC0/n;

    invoke-static {v9}, LN/V0;->f(LC0/n;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "Hint"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    move-object v3, v8

    goto :goto_b

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_a
    :goto_b
    check-cast v3, LC0/n;

    if-eqz v3, :cond_b

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p3, v3, p1}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result v1

    :cond_b
    move v6, v1

    invoke-static {}, LN/V0;->h()J

    move-result-wide v7

    move v3, v0

    invoke-static/range {v2 .. v8}, LN/W0;->c(IIIIIJ)I

    move-result p1

    return p1

    :cond_c
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_d
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string p2, "Collection contains no element matching the predicate."

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 32

    move-object/from16 v14, p0

    move-object/from16 v15, p1

    move-object/from16 v0, p2

    iget-object v1, v14, LN/X0;->c:Lz/N;

    invoke-interface {v1}, Lz/N;->d()F

    move-result v1

    invoke-interface {v15, v1}, LY0/d;->x1(F)I

    move-result v2

    iget-object v1, v14, LN/X0;->c:Lz/N;

    invoke-interface {v1}, Lz/N;->c()F

    move-result v1

    invoke-interface {v15, v1}, LY0/d;->x1(F)I

    move-result v1

    invoke-static {}, LN/W0;->i()F

    move-result v3

    invoke-interface {v15, v3}, LY0/d;->x1(F)I

    move-result v12

    const/16 v9, 0xa

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-wide/from16 v3, p3

    invoke-static/range {v3 .. v10}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v5, :cond_1

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, LC0/B;

    invoke-static {v10}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "Leading"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v9, 0x0

    :goto_1
    check-cast v9, LC0/B;

    if-eqz v9, :cond_2

    invoke-interface {v9, v3, v4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v5

    move-object v9, v5

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-static {v9}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v7, :cond_4

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, LC0/B;

    invoke-static {v13}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v13

    const-string v6, "Trailing"

    invoke-static {v13, v6}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_4
    const/4 v11, 0x0

    :goto_4
    check-cast v11, LC0/B;

    if-eqz v11, :cond_5

    neg-int v6, v5

    const/16 v20, 0x2

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-wide/from16 v16, v3

    move/from16 v18, v6

    invoke-static/range {v16 .. v21}, LY0/c;->o(JIIILjava/lang/Object;)J

    move-result-wide v6

    invoke-interface {v11, v6, v7}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v6

    move-object v10, v6

    goto :goto_5

    :cond_5
    const/4 v10, 0x0

    :goto_5
    invoke-static {v10}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v6

    add-int/2addr v5, v6

    neg-int v6, v1

    neg-int v5, v5

    invoke-static {v3, v4, v5, v6}, LY0/c;->n(JII)J

    move-result-wide v3

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v7

    const/4 v11, 0x0

    :goto_6
    if-ge v11, v7, :cond_7

    invoke-interface {v0, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v16, v13

    check-cast v16, LC0/B;

    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v8

    move/from16 v16, v7

    const-string v7, "Label"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v11, v11, 0x1

    move/from16 v7, v16

    goto :goto_6

    :cond_7
    const/4 v13, 0x0

    :goto_7
    check-cast v13, LC0/B;

    if-eqz v13, :cond_8

    invoke-interface {v13, v3, v4}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    goto :goto_8

    :cond_8
    const/4 v3, 0x0

    :goto_8
    if-eqz v3, :cond_a

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v4

    invoke-interface {v3, v4}, LC0/E;->X(LC0/a;)I

    move-result v4

    const/high16 v7, -0x80000000

    if-eq v4, v7, :cond_9

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v4

    goto :goto_9

    :cond_a
    const/4 v4, 0x0

    :goto_9
    invoke-static {v4, v2}, Ljava/lang/Math;->max(II)I

    move-result v11

    if-eqz v3, :cond_b

    sub-int/2addr v6, v12

    sub-int/2addr v6, v11

    goto :goto_a

    :cond_b
    neg-int v6, v2

    sub-int/2addr v6, v1

    :goto_a
    const/16 v28, 0xb

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-wide/from16 v22, p3

    invoke-static/range {v22 .. v29}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v7

    invoke-static {v7, v8, v5, v6}, LY0/c;->n(JII)J

    move-result-wide v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v7, 0x0

    :goto_b
    if-ge v7, v1, :cond_11

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/B;

    invoke-static {v8}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v13

    move/from16 v16, v1

    const-string v1, "TextField"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    invoke-interface {v8, v5, v6}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v7

    const/16 v28, 0xe

    const/16 v29, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-wide/from16 v22, v5

    invoke-static/range {v22 .. v29}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v5

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v8, 0x0

    :goto_c
    if-ge v8, v1, :cond_d

    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object/from16 v16, v13

    check-cast v16, LC0/B;

    invoke-static/range {v16 .. v16}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v0

    move/from16 v16, v1

    const-string v1, "Hint"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_d

    :cond_c
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v0, p2

    move/from16 v1, v16

    goto :goto_c

    :cond_d
    const/4 v13, 0x0

    :goto_d
    check-cast v13, LC0/B;

    if-eqz v13, :cond_e

    invoke-interface {v13, v5, v6}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v0

    move-object/from16 v17, v0

    goto :goto_e

    :cond_e
    const/16 v17, 0x0

    :goto_e
    invoke-static {v9}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v22

    invoke-static {v10}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v23

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v24

    invoke-static {v3}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v25

    invoke-static/range {v17 .. v17}, LN/V0;->j(Landroidx/compose/ui/layout/t;)I

    move-result v26

    move-wide/from16 v27, p3

    invoke-static/range {v22 .. v28}, LN/W0;->c(IIIIIJ)I

    move-result v16

    invoke-virtual {v7}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v22

    if-eqz v3, :cond_f

    const/4 v6, 0x1

    move/from16 v23, v6

    goto :goto_f

    :cond_f
    const/16 v23, 0x0

    :goto_f
    invoke-static {v9}, LN/V0;->i(Landroidx/compose/ui/layout/t;)I

    move-result v25

    invoke-static {v10}, LN/V0;->i(Landroidx/compose/ui/layout/t;)I

    move-result v26

    invoke-static/range {v17 .. v17}, LN/V0;->i(Landroidx/compose/ui/layout/t;)I

    move-result v27

    invoke-interface/range {p1 .. p1}, LY0/d;->getDensity()F

    move-result v30

    iget-object v0, v14, LN/X0;->c:Lz/N;

    move/from16 v24, v11

    move-wide/from16 v28, p3

    move-object/from16 v31, v0

    invoke-static/range {v22 .. v31}, LN/W0;->b(IZIIIIJFLz/N;)I

    move-result v18

    new-instance v19, LN/X0$c;

    move-object/from16 v0, v19

    move-object v1, v3

    move v3, v4

    move/from16 v4, v16

    move/from16 v5, v18

    move-object v6, v7

    move-object/from16 v7, v17

    move-object v8, v9

    move-object v9, v10

    move-object/from16 v10, p0

    move-object/from16 v13, p1

    invoke-direct/range {v0 .. v13}, LN/X0$c;-><init>(Landroidx/compose/ui/layout/t;IIIILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;LN/X0;IILandroidx/compose/ui/layout/m;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move/from16 v1, v16

    move/from16 v2, v18

    move-object/from16 v4, v19

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v0

    return-object v0

    :cond_10
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v0, p2

    move/from16 v1, v16

    goto/16 :goto_b

    :cond_11
    new-instance v0, Ljava/util/NoSuchElementException;

    const-string v1, "Collection contains no element matching the predicate."

    invoke-direct {v0, v1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public c(LC0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LN/X0$a;->a:LN/X0$a;

    invoke-direct {p0, p1, p2, p3, v0}, LN/X0;->h(LC0/o;Ljava/util/List;ILmh/p;)I

    move-result p1

    return p1
.end method

.method public e(LC0/o;Ljava/util/List;I)I
    .locals 0

    sget-object p1, LN/X0$b;->a:LN/X0$b;

    invoke-direct {p0, p2, p3, p1}, LN/X0;->j(Ljava/util/List;ILmh/p;)I

    move-result p1

    return p1
.end method

.method public f(LC0/o;Ljava/util/List;I)I
    .locals 0

    sget-object p1, LN/X0$e;->a:LN/X0$e;

    invoke-direct {p0, p2, p3, p1}, LN/X0;->j(Ljava/util/List;ILmh/p;)I

    move-result p1

    return p1
.end method

.method public i(LC0/o;Ljava/util/List;I)I
    .locals 1

    sget-object v0, LN/X0$d;->a:LN/X0$d;

    invoke-direct {p0, p1, p2, p3, v0}, LN/X0;->h(LC0/o;Ljava/util/List;ILmh/p;)I

    move-result p1

    return p1
.end method
