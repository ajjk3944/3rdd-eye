.class public Lh6/a;
.super Lb6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/a$a;,
        Lh6/a$b;,
        Lh6/a$c;
    }
.end annotation


# instance fields
.field private k:Ljava/util/List;

.field private l:F

.field private m:LY5/c$b;

.field private n:Lh6/a$b;

.field private final o:Landroid/graphics/Path;

.field private final p:Landroid/graphics/Path;

.field private final q:Lj6/a;

.field private final r:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ljava/util/List;FLY5/c$b;Lh6/a$b;)V
    .locals 6

    const-string/jumbo v0, "lines"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "pointPosition"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lb6/a;-><init>()V

    .line 5
    iput-object p1, p0, Lh6/a;->k:Ljava/util/List;

    .line 6
    iput p2, p0, Lh6/a;->l:F

    .line 7
    iput-object p3, p0, Lh6/a;->m:LY5/c$b;

    .line 8
    iput-object p4, p0, Lh6/a;->n:Lh6/a$b;

    .line 9
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lh6/a;->o:Landroid/graphics/Path;

    .line 10
    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lh6/a;->p:Landroid/graphics/Path;

    .line 11
    new-instance p1, Lj6/a;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lj6/a;-><init>(FFLa6/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lh6/a;->q:Lj6/a;

    .line 12
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lh6/a;->r:Ljava/util/HashMap;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;FLY5/c$b;Lh6/a$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 15

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    .line 1
    new-instance v0, Lh6/a$a;

    const/16 v13, 0x7ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v14}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, LZg/v;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_1

    const/high16 v1, 0x41800000    # 16.0f

    goto :goto_1

    :cond_1
    move/from16 v1, p2

    :goto_1
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    move-object/from16 v2, p3

    :goto_2
    and-int/lit8 v3, p5, 0x8

    if-eqz v3, :cond_3

    .line 2
    sget-object v3, Lh6/a$b;->Center:Lh6/a$b;

    move-object v4, p0

    goto :goto_3

    :cond_3
    move-object v4, p0

    move-object/from16 v3, p4

    .line 3
    :goto_3
    invoke-direct {p0, v0, v1, v2, v3}, Lh6/a;-><init>(Ljava/util/List;FLY5/c$b;Lh6/a$b;)V

    return-void
.end method

.method private static final D(FLu6/b;Lj6/b;FFLx6/a;)F
    .locals 1

    invoke-interface {p1}, Lu6/e;->j()F

    move-result p1

    invoke-interface {p2}, Lj6/b;->g()F

    move-result v0

    invoke-interface {p2}, Lj6/b;->e()F

    move-result p2

    add-float/2addr v0, p2

    mul-float/2addr p1, v0

    invoke-interface {p5}, Lx6/a;->a()F

    move-result p2

    sub-float/2addr p2, p3

    mul-float/2addr p1, p2

    div-float/2addr p1, p4

    add-float/2addr p0, p1

    return p0
.end method

.method private static final E(Lh6/a;FFLx6/a;)F
    .locals 0

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object p0

    iget p0, p0, Landroid/graphics/RectF;->bottom:F

    invoke-interface {p3}, Lx6/a;->b()F

    move-result p3

    sub-float/2addr p3, p1

    mul-float/2addr p3, p2

    sub-float/2addr p0, p3

    return p0
.end method


# virtual methods
.method protected B(Le6/a;Lh6/a$a;Ljava/util/List;F)V
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "lineSpec"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "entries"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lh6/a$a;->k()Lm6/a;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lh6/a$a;->d()Lt6/b;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p1}, Le6/a;->i()Lj6/b;

    move-result-object v4

    new-instance v6, Lh6/a$e;

    invoke-direct {v6, p2, p1, p0}, Lh6/a$e;-><init>(Lh6/a$a;Le6/a;Lh6/a;)V

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lh6/a;->C(Lu6/b;Ljava/util/List;Lj6/b;FLmh/r;)V

    return-void
.end method

.method protected C(Lu6/b;Ljava/util/List;Lj6/b;FLmh/r;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-string v2, "<this>"

    move-object/from16 v9, p1

    invoke-static {v9, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "entries"

    move-object/from16 v3, p2

    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "segment"

    move-object/from16 v10, p3

    invoke-static {v10, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v2, "action"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {p1 .. p1}, Lu6/e;->c()Lk6/c;

    move-result-object v2

    iget-object v4, v0, Lh6/a;->m:LY5/c$b;

    invoke-virtual {v2, v4}, Lk6/c;->a(LY5/c$b;)Lk6/d;

    move-result-object v2

    invoke-virtual {v2}, Lk6/d;->e()F

    move-result v11

    invoke-virtual {v2}, Lk6/d;->b()F

    move-result v4

    invoke-virtual {v2}, Lk6/d;->c()F

    move-result v12

    invoke-virtual {v2}, Lk6/d;->a()F

    move-result v5

    invoke-virtual {v2}, Lk6/d;->d()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v6

    sub-float/2addr v5, v12

    div-float v13, v6, v5

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v5

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v6

    invoke-static {v5, v6}, Ly6/i;->c(Landroid/graphics/RectF;Z)F

    move-result v14

    invoke-interface/range {p1 .. p1}, Lu6/e;->j()F

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v6

    mul-float/2addr v5, v6

    add-float v15, v14, v5

    sub-float v5, v11, v2

    add-float/2addr v4, v2

    invoke-static {v5, v4}, Lsh/m;->b(FF)Lsh/e;

    move-result-object v8

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/16 v17, 0x0

    const/4 v3, 0x0

    move/from16 v18, v3

    move-object/from16 v7, v17

    move-object/from16 v19, v7

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lx6/a;

    invoke-interface {v6}, Lx6/a;->a()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {v8, v3}, Lsh/e;->f(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_8

    move/from16 v3, p4

    move-object/from16 v4, p1

    move-object/from16 v5, p3

    move-object/from16 p2, v6

    move v6, v11

    move-object v9, v7

    move v7, v2

    move-object/from16 v20, v8

    move-object/from16 v8, p2

    invoke-static/range {v3 .. v8}, Lh6/a;->D(FLu6/b;Lj6/b;FFLx6/a;)F

    move-result v21

    invoke-static {v0, v12, v13, v8}, Lh6/a;->E(Lh6/a;FFLx6/a;)F

    move-result v22

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    cmpg-float v3, v21, v14

    if-ltz v3, :cond_1

    :cond_0
    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v3

    if-nez v3, :cond_2

    cmpl-float v3, v21, v14

    if-lez v3, :cond_2

    :cond_1
    move/from16 v23, v2

    move-object v7, v8

    goto/16 :goto_2

    :cond_2
    invoke-static {v14, v15}, Ly6/g;->a(FF)Lsh/e;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v3, v4}, Lsh/e;->f(Ljava/lang/Comparable;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v9, :cond_3

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    move/from16 v3, p4

    move-object/from16 v4, p1

    move-object/from16 v5, p3

    move v6, v11

    move-object v10, v7

    move v7, v2

    move/from16 v23, v2

    move-object v2, v8

    move-object v8, v9

    invoke-static/range {v3 .. v8}, Lh6/a;->D(FLu6/b;Lj6/b;FFLx6/a;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v0, v12, v13, v9}, Lh6/a;->E(Lh6/a;FFLx6/a;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-interface {v1, v10, v9, v3, v4}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v7, v17

    goto :goto_1

    :cond_3
    move/from16 v23, v2

    move-object v2, v8

    move-object v7, v9

    :goto_1
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v1, v3, v2, v4, v5}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    move/from16 v23, v2

    move-object v2, v8

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v3

    if-eqz v3, :cond_5

    cmpl-float v3, v21, v15

    if-gtz v3, :cond_6

    :cond_5
    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v3

    if-nez v3, :cond_7

    cmpg-float v3, v21, v15

    if-gez v3, :cond_7

    :cond_6
    if-nez v19, :cond_7

    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-interface {v1, v3, v2, v4, v5}, Lmh/r;->y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v19, v2

    :cond_7
    move-object v7, v9

    :goto_2
    add-int/lit8 v18, v18, 0x1

    move-object/from16 v9, p1

    move-object/from16 v10, p3

    move-object/from16 v8, v20

    move/from16 v2, v23

    goto/16 :goto_0

    :cond_8
    move-object v9, v7

    move-object/from16 v10, p3

    move-object/from16 v9, p1

    goto/16 :goto_0

    :cond_9
    return-void
.end method

.method public F()Ljava/util/HashMap;
    .locals 1

    iget-object v0, p0, Lh6/a;->r:Ljava/util/HashMap;

    return-object v0
.end method

.method protected final G()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lh6/a;->p:Landroid/graphics/Path;

    return-object v0
.end method

.method protected final H()Landroid/graphics/Path;
    .locals 1

    iget-object v0, p0, Lh6/a;->o:Landroid/graphics/Path;

    return-object v0
.end method

.method public final I()Lh6/a$b;
    .locals 1

    iget-object v0, p0, Lh6/a;->n:Lh6/a$b;

    return-object v0
.end method

.method public J(Lu6/e;Lx6/b;)Lj6/b;
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lh6/a;->q:Lj6/a;

    iget-object v0, p0, Lh6/a;->k:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh6/a$a;

    invoke-virtual {v1}, Lh6/a$a;->m()F

    move-result v1

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lh6/a$a;

    invoke-virtual {v2}, Lh6/a$a;->m()F

    move-result v2

    invoke-interface {p1, v2}, Lu6/e;->g(F)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_0

    :cond_0
    iget v0, p0, Lh6/a;->l:F

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    iget-object v0, p0, Lh6/a;->n:Lh6/a$b;

    invoke-virtual {v0}, Lh6/a$b;->getLabelPosition$core_release()La6/a;

    move-result-object v0

    invoke-virtual {p2, v1, p1, v0}, Lj6/a;->h(FFLa6/a;)Lj6/a;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public final K()LY5/c$b;
    .locals 1

    iget-object v0, p0, Lh6/a;->m:LY5/c$b;

    return-object v0
.end method

.method protected final L()V
    .locals 1

    invoke-virtual {p0}, Lh6/a;->F()Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lh6/a;->o:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    iget-object v0, p0, Lh6/a;->p:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    return-void
.end method

.method public final M(Ljava/util/List;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh6/a;->k:Ljava/util/List;

    return-void
.end method

.method public final N(Lh6/a$b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lh6/a;->n:Lh6/a$b;

    return-void
.end method

.method public final O(F)V
    .locals 0

    iput p1, p0, Lh6/a;->l:F

    return-void
.end method

.method public final P(LY5/c$b;)V
    .locals 0

    iput-object p1, p0, Lh6/a;->m:LY5/c$b;

    return-void
.end method

.method public Q(Lk6/c;Lx6/b;)V
    .locals 8

    const-string/jumbo v0, "chartValuesManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lb6/a;->t()Lk6/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p2}, Lk6/a;->c(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_1
    move v2, v0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lb6/a;->w()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {p2}, Lx6/b;->e()F

    move-result v0

    goto :goto_1

    :goto_2
    invoke-virtual {p0}, Lb6/a;->t()Lk6/a;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0, p2}, Lk6/a;->a(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_2

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_4
    move v3, v0

    goto :goto_5

    :cond_2
    invoke-virtual {p0}, Lb6/a;->u()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p2}, Lx6/b;->b()F

    move-result v0

    goto :goto_4

    :goto_5
    invoke-virtual {p0}, Lb6/a;->t()Lk6/a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0, p2}, Lk6/a;->d(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_4

    :goto_6
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_7
    move v4, v0

    goto :goto_8

    :cond_4
    invoke-virtual {p0}, Lb6/a;->x()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_6

    :cond_5
    invoke-interface {p2}, Lx6/b;->c()F

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_7

    :goto_8
    invoke-virtual {p0}, Lb6/a;->t()Lk6/a;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-interface {v0, p2}, Lk6/a;->b(Ljava/lang/Object;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_6

    :goto_9
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :goto_a
    move v5, v0

    goto :goto_b

    :cond_6
    invoke-virtual {p0}, Lb6/a;->v()Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_7

    goto :goto_9

    :cond_7
    invoke-interface {p2}, Lx6/b;->a()F

    move-result v0

    goto :goto_a

    :goto_b
    iget-object v7, p0, Lh6/a;->m:LY5/c$b;

    move-object v1, p1

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Lk6/c;->d(FFFFLx6/b;LY5/c$b;)V

    return-void
.end method

.method public bridge synthetic f(Lu6/e;Ljava/lang/Object;)Lj6/b;
    .locals 0

    check-cast p2, Lx6/b;

    invoke-virtual {p0, p1, p2}, Lh6/a;->J(Lu6/e;Lx6/b;)Lj6/b;

    move-result-object p1

    return-object p1
.end method

.method public i(Lu6/e;Lg6/c;Lj6/b;)V
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "outInsets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "segmentProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p3, p0, Lh6/a;->k:Ljava/util/List;

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh6/a$a;

    invoke-virtual {v0}, Lh6/a$a;->k()Lm6/a;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lh6/a$a;->j()F

    move-result v1

    invoke-virtual {v0}, Lh6/a$a;->m()F

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lh6/a$a;->j()F

    move-result v0

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh6/a$a;

    invoke-virtual {v1}, Lh6/a$a;->k()Lm6/a;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lh6/a$a;->j()F

    move-result v2

    invoke-virtual {v1}, Lh6/a$a;->m()F

    move-result v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lh6/a$a;->j()F

    move-result v1

    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    goto :goto_0

    :cond_2
    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    invoke-virtual {p2, p1}, Lg6/c;->q(F)Lg6/c;

    return-void

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public bridge synthetic k(Lk6/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx6/b;

    invoke-virtual {p0, p1, p2}, Lh6/a;->Q(Lk6/c;Lx6/b;)V

    return-void
.end method

.method public bridge synthetic m()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lh6/a;->F()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method protected n(Le6/a;Lx6/b;)V
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    const-string/jumbo v0, "context"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lh6/a;->L()V

    invoke-interface/range {p1 .. p1}, Le6/a;->i()Lj6/b;

    move-result-object v0

    invoke-interface {v0}, Lj6/b;->f()F

    move-result v8

    invoke-interface {v0}, Lj6/b;->b()F

    move-result v9

    invoke-interface/range {p2 .. p2}, Lx6/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    const/4 v0, 0x0

    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v11, v0, 0x1

    if-gez v0, :cond_0

    invoke-static {}, LZg/v;->v()V

    :cond_0
    move-object v12, v1

    check-cast v12, Ljava/util/List;

    iget-object v1, v6, Lh6/a;->o:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    iget-object v1, v6, Lh6/a;->p:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->rewind()V

    iget-object v1, v6, Lh6/a;->k:Ljava/util/List;

    invoke-static {v1, v0}, Ly6/a;->a(Ljava/util/List;I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lh6/a$a;

    new-instance v14, Lkotlin/jvm/internal/K;

    invoke-direct {v14}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v1

    invoke-static {v0, v1}, Ly6/i;->c(Landroid/graphics/RectF;Z)F

    move-result v0

    iput v0, v14, Lkotlin/jvm/internal/K;->a:F

    new-instance v4, Lkotlin/jvm/internal/K;

    invoke-direct {v4}, Lkotlin/jvm/internal/K;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iput v0, v4, Lkotlin/jvm/internal/K;->a:F

    invoke-interface/range {p1 .. p1}, Lu6/e;->j()F

    move-result v0

    iget-object v1, v6, Lh6/a;->n:Lh6/a$b;

    sget-object v2, Lh6/a$c;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    add-float v1, v9, v8

    int-to-float v2, v2

    div-float/2addr v1, v2

    goto :goto_1

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    const/4 v1, 0x0

    :goto_1
    mul-float/2addr v0, v1

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v2

    invoke-static {v1, v2}, Ly6/i;->c(Landroid/graphics/RectF;Z)F

    move-result v1

    add-float/2addr v1, v0

    invoke-interface/range {p1 .. p1}, Le6/a;->n()F

    move-result v0

    sub-float v15, v1, v0

    invoke-interface/range {p1 .. p1}, Le6/a;->i()Lj6/b;

    move-result-object v16

    new-instance v17, Lh6/a$d;

    move-object/from16 v0, v17

    move-object/from16 v1, p0

    move-object v2, v13

    move-object v3, v14

    move-object/from16 v5, p1

    invoke-direct/range {v0 .. v5}, Lh6/a$d;-><init>(Lh6/a;Lh6/a$a;Lkotlin/jvm/internal/K;Lkotlin/jvm/internal/K;Le6/a;)V

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v12

    move-object/from16 v3, v16

    move v4, v15

    move-object/from16 v5, v17

    invoke-virtual/range {v0 .. v5}, Lh6/a;->C(Lu6/b;Ljava/util/List;Lj6/b;FLmh/r;)V

    invoke-virtual {v13}, Lh6/a$a;->h()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, v6, Lh6/a;->p:Landroid/graphics/Path;

    iget v1, v14, Lkotlin/jvm/internal/K;->a:F

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0, v1, v2}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, v6, Lh6/a;->p:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->close()V

    invoke-virtual/range {p0 .. p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, v6, Lh6/a;->p:Landroid/graphics/Path;

    invoke-virtual {v13, v7, v0, v1}, Lh6/a$a;->a(Lu6/b;Landroid/graphics/RectF;Landroid/graphics/Path;)V

    :cond_3
    iget-object v0, v6, Lh6/a;->o:Landroid/graphics/Path;

    invoke-virtual {v13, v7, v0}, Lh6/a$a;->b(Lu6/b;Landroid/graphics/Path;)V

    invoke-virtual {v6, v7, v13, v12, v15}, Lh6/a;->B(Le6/a;Lh6/a$a;Ljava/util/List;F)V

    move v0, v11

    goto/16 :goto_0

    :cond_4
    return-void
.end method
