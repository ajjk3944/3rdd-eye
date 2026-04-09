.class public final Lo6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo6/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo6/a$a;,
        Lo6/a$b;
    }
.end annotation


# instance fields
.field private final a:Lo6/c;

.field private final b:F

.field private final c:F

.field private final d:Lo6/a$a;

.field private e:F

.field private f:F


# direct methods
.method public constructor <init>(Lo6/c;FFLo6/a$a;)V
    .locals 1

    const-string/jumbo v0, "shape"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "fitStrategy"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lo6/a;->a:Lo6/c;

    .line 3
    iput p2, p0, Lo6/a;->b:F

    .line 4
    iput p3, p0, Lo6/a;->c:F

    .line 5
    iput-object p4, p0, Lo6/a;->d:Lo6/a$a;

    .line 6
    iput p2, p0, Lo6/a;->e:F

    .line 7
    iput p3, p0, Lo6/a;->f:F

    return-void
.end method

.method public synthetic constructor <init>(Lo6/c;FFLo6/a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    .line 8
    sget-object p1, Lo6/e;->a:Lo6/e;

    invoke-virtual {p1}, Lo6/e;->b()Lo6/c;

    move-result-object p1

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    const/high16 p2, 0x40800000    # 4.0f

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    const/high16 p3, 0x40000000    # 2.0f

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    .line 9
    sget-object p4, Lo6/a$a;->Resize:Lo6/a$a;

    .line 10
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lo6/a;-><init>(Lo6/c;FFLo6/a$a;)V

    return-void
.end method

.method private final b(FFF)V
    .locals 4

    const/4 v0, 0x0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    cmpg-float v1, p2, v0

    if-nez v1, :cond_0

    iput p3, p0, Lo6/a;->e:F

    return-void

    :cond_0
    iget-object v1, p0, Lo6/a;->d:Lo6/a$a;

    sget-object v2, Lo6/a$b;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 p3, 0x2

    if-eq v1, p3, :cond_1

    goto :goto_0

    :cond_1
    iput p1, p0, Lo6/a;->e:F

    iput p2, p0, Lo6/a;->f:F

    goto :goto_0

    :cond_2
    add-float v1, p1, p2

    cmpg-float v2, p3, v1

    if-gez v2, :cond_3

    iput p3, p0, Lo6/a;->e:F

    iput v0, p0, Lo6/a;->f:F

    goto :goto_0

    :cond_3
    div-float v0, p3, v1

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-float v0, v2

    mul-float/2addr v0, v1

    add-float/2addr v0, p1

    div-float/2addr p3, v0

    mul-float/2addr p1, p3

    iput p1, p0, Lo6/a;->e:F

    mul-float/2addr p2, p3

    iput p2, p0, Lo6/a;->f:F

    :goto_0
    return-void
.end method

.method private final c(Lu6/b;F)V
    .locals 2

    iget v0, p0, Lo6/a;->b:F

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result v0

    iget v1, p0, Lo6/a;->c:F

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result p1

    invoke-direct {p0, v0, p1, p2}, Lo6/a;->b(FFF)V

    return-void
.end method

.method private final d(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 14

    move-object v0, p0

    sub-float v1, p6, p4

    move-object v10, p1

    invoke-direct {p0, p1, v1}, Lo6/a;->c(Lu6/b;F)V

    const/4 v2, 0x0

    const/4 v11, 0x0

    move v12, v2

    move v13, v11

    :goto_0
    sub-float v2, v1, v13

    cmpl-float v2, v2, v11

    if-lez v2, :cond_1

    rem-int/lit8 v2, v12, 0x2

    if-nez v2, :cond_0

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Path;->reset()V

    iget-object v2, v0, Lo6/a;->a:Lo6/c;

    add-float v6, p4, v13

    iget v3, v0, Lo6/a;->e:F

    add-float v8, v6, v3

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v7, p5

    move/from16 v9, p7

    invoke-interface/range {v2 .. v9}, Lo6/c;->a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V

    iget v2, v0, Lo6/a;->e:F

    goto :goto_1

    :cond_0
    iget v2, v0, Lo6/a;->f:F

    :goto_1
    add-float/2addr v13, v2

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private final e(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 14

    move-object v0, p0

    sub-float v1, p7, p5

    move-object v10, p1

    invoke-direct {p0, p1, v1}, Lo6/a;->c(Lu6/b;F)V

    const/4 v2, 0x0

    const/4 v11, 0x0

    move v12, v2

    move v13, v11

    :goto_0
    sub-float v2, v1, v13

    cmpl-float v2, v2, v11

    if-lez v2, :cond_1

    rem-int/lit8 v2, v12, 0x2

    if-nez v2, :cond_0

    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Path;->reset()V

    iget-object v2, v0, Lo6/a;->a:Lo6/c;

    add-float v7, p5, v13

    iget v3, v0, Lo6/a;->e:F

    add-float v9, v7, v3

    move-object v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move/from16 v6, p4

    move/from16 v8, p6

    invoke-interface/range {v2 .. v9}, Lo6/c;->a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V

    iget v2, v0, Lo6/a;->e:F

    goto :goto_1

    :cond_0
    iget v2, v0, Lo6/a;->f:F

    :goto_1
    add-float/2addr v13, v2

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sub-float v0, p6, p4

    sub-float v1, p7, p5

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-direct/range {p0 .. p7}, Lo6/a;->d(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V

    goto :goto_0

    :cond_0
    invoke-direct/range {p0 .. p7}, Lo6/a;->e(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V

    :goto_0
    return-void
.end method
