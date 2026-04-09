.class public Lh6/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/a$a$a;
    }
.end annotation


# instance fields
.field private a:F

.field private b:Lr6/b;

.field private c:Landroid/graphics/Paint$Cap;

.field private d:Lm6/a;

.field private e:F

.field private f:Lt6/b;

.field private g:Lt6/c;

.field private h:Lz6/c;

.field private i:F

.field private j:Lh6/a$a$a;

.field private final k:Landroid/graphics/Paint;

.field private final l:Landroid/graphics/Paint;

.field private final m:Lth/i;


# direct methods
.method public constructor <init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;)V
    .locals 1

    const-string/jumbo v0, "lineCap"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dataLabelVerticalPosition"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "dataLabelValueFormatter"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "pointConnector"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lh6/a$a;->a:F

    .line 3
    iput-object p3, p0, Lh6/a$a;->b:Lr6/b;

    .line 4
    iput-object p4, p0, Lh6/a$a;->c:Landroid/graphics/Paint$Cap;

    .line 5
    iput-object p5, p0, Lh6/a$a;->d:Lm6/a;

    .line 6
    iput p6, p0, Lh6/a$a;->e:F

    .line 7
    iput-object p7, p0, Lh6/a$a;->f:Lt6/b;

    .line 8
    iput-object p8, p0, Lh6/a$a;->g:Lt6/c;

    .line 9
    iput-object p9, p0, Lh6/a$a;->h:Lz6/c;

    .line 10
    iput p10, p0, Lh6/a$a;->i:F

    .line 11
    iput-object p11, p0, Lh6/a$a;->j:Lh6/a$a$a;

    .line 12
    new-instance p2, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Landroid/graphics/Paint;-><init>(I)V

    .line 13
    sget-object p4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 14
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 15
    iget-object p1, p0, Lh6/a$a;->c:Landroid/graphics/Paint$Cap;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 16
    iput-object p2, p0, Lh6/a$a;->k:Landroid/graphics/Paint;

    .line 17
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lh6/a$a;->l:Landroid/graphics/Paint;

    .line 18
    new-instance p1, Lh6/a$a$b;

    invoke-direct {p1, p2}, Lh6/a$a$b;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lh6/a$a;->m:Lth/i;

    return-void
.end method

.method public synthetic constructor <init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const v1, -0x333334

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    const/high16 v2, 0x40000000    # 2.0f

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    move-object v3, v4

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v5, v0, 0x8

    if-eqz v5, :cond_3

    .line 19
    sget-object v5, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_4

    move-object v6, v4

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_5

    const/high16 v7, 0x41800000    # 16.0f

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    move-object v8, v4

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    .line 20
    sget-object v9, Lt6/c;->Top:Lt6/c;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    .line 21
    new-instance v10, Lz6/a;

    invoke-direct {v10}, Lz6/a;-><init>()V

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    const/4 v12, 0x0

    if-eqz v11, :cond_9

    move v11, v12

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_a

    .line 22
    new-instance v0, Lb6/d;

    const/4 v13, 0x1

    invoke-direct {v0, v12, v13, v4}, Lb6/d;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_a
    move-object/from16 v0, p11

    :goto_a
    move-object p1, p0

    move/from16 p2, v1

    move/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v0

    .line 23
    invoke-direct/range {p1 .. p12}, Lh6/a$a;-><init>(IFLr6/b;Landroid/graphics/Paint$Cap;Lm6/a;FLt6/b;Lt6/c;Lz6/c;FLh6/a$a$a;)V

    return-void
.end method


# virtual methods
.method public final a(Lu6/b;Landroid/graphics/RectF;Landroid/graphics/Path;)V
    .locals 7

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "bounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh6/a$a;->l:Landroid/graphics/Paint;

    iget-object v1, p0, Lh6/a$a;->b:Lr6/b;

    if-eqz v1, :cond_0

    iget v3, p2, Landroid/graphics/RectF;->left:F

    iget v4, p2, Landroid/graphics/RectF;->top:F

    iget v5, p2, Landroid/graphics/RectF;->right:F

    iget v6, p2, Landroid/graphics/RectF;->bottom:F

    move-object v2, p1

    invoke-interface/range {v1 .. v6}, Lr6/b;->a(Lu6/b;FFFF)Landroid/graphics/Shader;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p1

    iget-object p2, p0, Lh6/a$a;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, p3, p2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final b(Lu6/b;Landroid/graphics/Path;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "path"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh6/a$a;->k:Landroid/graphics/Paint;

    iget v1, p0, Lh6/a$a;->a:F

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p1

    iget-object v0, p0, Lh6/a$a;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Lu6/b;FF)V
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh6/a$a;->d:Lm6/a;

    if-eqz v0, :cond_0

    iget v1, p0, Lh6/a$a;->e:F

    invoke-interface {p1, v1}, Lu6/e;->g(F)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-static {v0, p1, p2, p3, v1}, Lh6/b;->a(Lm6/a;Lu6/b;FFF)V

    :cond_0
    return-void
.end method

.method public final d()Lt6/b;
    .locals 1

    iget-object v0, p0, Lh6/a$a;->f:Lt6/b;

    return-object v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Lh6/a$a;->i:F

    return v0
.end method

.method public final f()Lz6/c;
    .locals 1

    iget-object v0, p0, Lh6/a$a;->h:Lz6/c;

    return-object v0
.end method

.method public final g()Lt6/c;
    .locals 1

    iget-object v0, p0, Lh6/a$a;->g:Lt6/c;

    return-object v0
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Lh6/a$a;->b:Lr6/b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final i()I
    .locals 1

    iget-object v0, p0, Lh6/a$a;->k:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public final j()F
    .locals 1

    iget v0, p0, Lh6/a$a;->a:F

    return v0
.end method

.method public final k()Lm6/a;
    .locals 1

    iget-object v0, p0, Lh6/a$a;->d:Lm6/a;

    return-object v0
.end method

.method public final l()Lh6/a$a$a;
    .locals 1

    iget-object v0, p0, Lh6/a$a;->j:Lh6/a$a$a;

    return-object v0
.end method

.method public final m()F
    .locals 1

    iget v0, p0, Lh6/a$a;->e:F

    return v0
.end method
