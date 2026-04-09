.class final LN/L0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LC0/C;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/L0;->b(Lmh/p;Lmh/p;LT/l;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LN/L0$b;->a:Ljava/lang/String;

    iput-object p2, p0, LN/L0$b;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, LN/L0$b;->a:Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    const-string v7, "Collection contains no element matching the predicate."

    if-ge v6, v4, :cond_8

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LC0/B;

    invoke-static {v8}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move-wide/from16 v14, p3

    invoke-interface {v8, v14, v15}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v3

    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v6

    sub-int/2addr v4, v6

    invoke-static {}, LN/L0;->l()F

    move-result v6

    invoke-interface {v1, v6}, LY0/d;->x1(F)I

    move-result v6

    sub-int/2addr v4, v6

    invoke-static/range {p3 .. p4}, LY0/b;->n(J)I

    move-result v6

    invoke-static {v4, v6}, Lsh/m;->d(II)I

    move-result v13

    iget-object v4, v0, LN/L0$b;->b:Ljava/lang/String;

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v6

    move v8, v5

    :goto_1
    if-ge v8, v6, :cond_6

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LC0/B;

    invoke-static {v9}, Landroidx/compose/ui/layout/f;->a(LC0/B;)Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v16, 0x9

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-wide/from16 v10, p3

    move v14, v2

    move v15, v4

    invoke-static/range {v10 .. v17}, LY0/b;->d(JIIIIILjava/lang/Object;)J

    move-result-wide v6

    invoke-interface {v9, v6, v7}, LC0/B;->T(J)Landroidx/compose/ui/layout/t;

    move-result-object v10

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v2

    invoke-interface {v10, v2}, LC0/E;->X(LC0/a;)I

    move-result v2

    invoke-static {}, LC0/b;->b()LC0/m;

    move-result-object v4

    invoke-interface {v10, v4}, LC0/E;->X(LC0/a;)I

    move-result v4

    const/high16 v6, -0x80000000

    const/4 v7, 0x1

    if-eq v2, v6, :cond_0

    if-eq v4, v6, :cond_0

    move v8, v7

    goto :goto_2

    :cond_0
    move v8, v5

    :goto_2
    if-eq v2, v4, :cond_2

    if-nez v8, :cond_1

    goto :goto_3

    :cond_1
    move v7, v5

    :cond_2
    :goto_3
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v8

    sub-int v13, v4, v8

    if-eqz v7, :cond_4

    invoke-static {}, LN/L0;->j()F

    move-result v4

    invoke-interface {v1, v4}, LY0/d;->x1(F)I

    move-result v4

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-virtual {v10}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v7

    sub-int v7, v4, v7

    div-int/lit8 v7, v7, 0x2

    invoke-static {}, LC0/b;->a()LC0/m;

    move-result-object v8

    invoke-interface {v3, v8}, LC0/E;->X(LC0/a;)I

    move-result v8

    if-eq v8, v6, :cond_3

    add-int/2addr v2, v7

    sub-int v5, v2, v8

    :cond_3
    move v14, v5

    move v11, v7

    goto :goto_4

    :cond_4
    invoke-static {}, LN/L0;->i()F

    move-result v4

    invoke-interface {v1, v4}, LY0/d;->x1(F)I

    move-result v4

    sub-int/2addr v4, v2

    invoke-static {}, LN/L0;->k()F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v2

    invoke-virtual {v10}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v5

    add-int/2addr v5, v4

    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v5

    sub-int v5, v2, v5

    div-int/lit8 v5, v5, 0x2

    move v11, v4

    move v14, v5

    move v4, v2

    :goto_4
    invoke-static/range {p3 .. p4}, LY0/b;->l(J)I

    move-result v2

    new-instance v5, LN/L0$b$a;

    move-object v9, v5

    move-object v12, v3

    invoke-direct/range {v9 .. v14}, LN/L0$b$a;-><init>(Landroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/t;II)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v1, p1

    move v3, v4

    move-object v4, v8

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/m;->x0(Landroidx/compose/ui/layout/m;IILjava/util/Map;Lmh/l;ILjava/lang/Object;)LC0/D;

    move-result-object v1

    return-object v1

    :cond_5
    add-int/lit8 v8, v8, 0x1

    move-wide/from16 v14, p3

    goto/16 :goto_1

    :cond_6
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v7}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_7
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_8
    new-instance v1, Ljava/util/NoSuchElementException;

    invoke-direct {v1, v7}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
