.class public Lp6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/c;


# instance fields
.field private final a:Lp6/a;

.field private final b:Lp6/a;

.field private final c:Lp6/a;

.field private final d:Lp6/a;


# direct methods
.method public constructor <init>(Lp6/a;Lp6/a;Lp6/a;Lp6/a;)V
    .locals 1

    const-string/jumbo v0, "topLeft"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "topRight"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bottomRight"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bottomLeft"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp6/d;->a:Lp6/a;

    iput-object p2, p0, Lp6/d;->b:Lp6/a;

    iput-object p3, p0, Lp6/d;->c:Lp6/a;

    iput-object p4, p0, Lp6/d;->d:Lp6/a;

    return-void
.end method

.method private final e(F)F
    .locals 1

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-nez v0, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    return p1
.end method


# virtual methods
.method public a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 7

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    move v6, p7

    invoke-virtual/range {v0 .. v6}, Lp6/d;->c(Lu6/b;Landroid/graphics/Path;FFFF)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public b(FLandroid/graphics/Path;FFFF)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    move/from16 v12, p6

    const-string/jumbo v2, "path"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float v2, v11, v9

    sub-float v3, v12, v10

    const/4 v4, 0x0

    cmpg-float v5, v2, v4

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v4, v3, v4

    if-nez v4, :cond_1

    :goto_0
    return-void

    :cond_1
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-virtual {v0, v2, v3, v1}, Lp6/d;->d(FFF)F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v2, v3}, Lsh/m;->f(FF)F

    move-result v2

    iget-object v3, v0, Lp6/d;->a:Lp6/a;

    invoke-virtual {v3, v4, v1}, Lp6/a;->a(FF)F

    move-result v3

    mul-float/2addr v3, v2

    iget-object v5, v0, Lp6/d;->b:Lp6/a;

    invoke-virtual {v5, v4, v1}, Lp6/a;->a(FF)F

    move-result v5

    mul-float v13, v5, v2

    iget-object v5, v0, Lp6/d;->c:Lp6/a;

    invoke-virtual {v5, v4, v1}, Lp6/a;->a(FF)F

    move-result v5

    mul-float v14, v5, v2

    iget-object v5, v0, Lp6/d;->d:Lp6/a;

    invoke-virtual {v5, v4, v1}, Lp6/a;->a(FF)F

    move-result v1

    mul-float v15, v1, v2

    add-float v4, v10, v3

    invoke-virtual {v8, v9, v4}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v1, v0, Lp6/d;->a:Lp6/a;

    invoke-virtual {v1}, Lp6/a;->b()Lp6/c;

    move-result-object v1

    add-float v5, v9, v3

    sget-object v6, Lp6/b;->TopLeft:Lp6/b;

    move/from16 v2, p3

    move v3, v4

    move v4, v5

    move/from16 v5, p4

    move-object/from16 v7, p2

    invoke-interface/range {v1 .. v7}, Lp6/c;->a(FFFFLp6/b;Landroid/graphics/Path;)V

    sub-float v2, v11, v13

    invoke-virtual {v8, v2, v10}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v0, Lp6/d;->b:Lp6/a;

    invoke-virtual {v1}, Lp6/a;->b()Lp6/c;

    move-result-object v1

    add-float v5, v10, v13

    sget-object v6, Lp6/b;->TopRight:Lp6/b;

    move/from16 v3, p4

    move/from16 v4, p5

    invoke-interface/range {v1 .. v7}, Lp6/c;->a(FFFFLp6/b;Landroid/graphics/Path;)V

    sub-float v3, v12, v14

    invoke-virtual {v8, v11, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v0, Lp6/d;->c:Lp6/a;

    invoke-virtual {v1}, Lp6/a;->b()Lp6/c;

    move-result-object v1

    sub-float v4, v11, v14

    sget-object v6, Lp6/b;->BottomRight:Lp6/b;

    move/from16 v2, p5

    move/from16 v5, p6

    invoke-interface/range {v1 .. v7}, Lp6/c;->a(FFFFLp6/b;Landroid/graphics/Path;)V

    add-float v2, v9, v15

    invoke-virtual {v8, v2, v12}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v1, v0, Lp6/d;->d:Lp6/a;

    invoke-virtual {v1}, Lp6/a;->b()Lp6/c;

    move-result-object v1

    sub-float v5, v12, v15

    sget-object v6, Lp6/b;->BottomLeft:Lp6/b;

    move/from16 v3, p6

    move/from16 v4, p3

    invoke-interface/range {v1 .. v7}, Lp6/c;->a(FFFFLp6/b;Landroid/graphics/Path;)V

    invoke-virtual/range {p2 .. p2}, Landroid/graphics/Path;->close()V

    return-void
.end method

.method protected c(Lu6/b;Landroid/graphics/Path;FFFF)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/e;->getDensity()F

    move-result v2

    move-object v1, p0

    move-object v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    invoke-virtual/range {v1 .. v7}, Lp6/d;->b(FLandroid/graphics/Path;FFFF)V

    return-void
.end method

.method public final d(FFF)F
    .locals 5

    invoke-static {p1, p2}, Ljava/lang/Math;->min(FF)F

    move-result v0

    iget-object v1, p0, Lp6/d;->a:Lp6/a;

    invoke-virtual {v1, v0, p3}, Lp6/a;->a(FF)F

    move-result v1

    iget-object v2, p0, Lp6/d;->b:Lp6/a;

    invoke-virtual {v2, v0, p3}, Lp6/a;->a(FF)F

    move-result v2

    iget-object v3, p0, Lp6/d;->c:Lp6/a;

    invoke-virtual {v3, v0, p3}, Lp6/a;->a(FF)F

    move-result v3

    iget-object v4, p0, Lp6/d;->d:Lp6/a;

    invoke-virtual {v4, v0, p3}, Lp6/a;->a(FF)F

    move-result p3

    add-float v0, v1, v2

    invoke-direct {p0, v0}, Lp6/d;->e(F)F

    move-result v0

    div-float v0, p1, v0

    add-float v4, p3, v3

    invoke-direct {p0, v4}, Lp6/d;->e(F)F

    move-result v4

    div-float/2addr p1, v4

    add-float/2addr v1, p3

    invoke-direct {p0, v1}, Lp6/d;->e(F)F

    move-result p3

    div-float p3, p2, p3

    add-float/2addr v2, v3

    invoke-direct {p0, v2}, Lp6/d;->e(F)F

    move-result v1

    div-float/2addr p2, v1

    const/4 v1, 0x3

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    const/4 p1, 0x1

    aput p3, v1, p1

    const/4 p1, 0x2

    aput p2, v1, p1

    invoke-static {v0, v1}, Lch/a;->l(F[F)F

    move-result p1

    return p1
.end method
