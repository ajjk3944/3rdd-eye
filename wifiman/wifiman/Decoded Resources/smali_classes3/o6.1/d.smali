.class public Lo6/d;
.super Lm6/a;
.source "SourceFile"


# static fields
.field static final synthetic k:[Lth/l;


# instance fields
.field private final b:Lo6/c;

.field private final c:Lr6/b;

.field private final d:F

.field private final e:Landroid/graphics/Paint;

.field private final f:Landroid/graphics/Paint;

.field private final g:Ls6/a;

.field private final h:Landroid/graphics/Path;

.field private final i:Lph/d;

.field private final j:Lph/d;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/z;

    const-class v1, Lo6/d;

    const-string/jumbo v2, "color"

    const-string/jumbo v3, "getColor()I"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/z;

    const-string/jumbo v3, "strokeColor"

    const-string/jumbo v5, "getStrokeColor()I"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lth/l;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lo6/d;->k:[Lth/l;

    return-void
.end method

.method public constructor <init>(Lo6/c;ILr6/b;Lw6/b;FI)V
    .locals 8

    const-string/jumbo v0, "shape"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "margins"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lm6/a;-><init>()V

    .line 5
    iput-object p1, p0, Lo6/d;->b:Lo6/c;

    .line 6
    iput-object p3, p0, Lo6/d;->c:Lr6/b;

    .line 7
    iput p5, p0, Lo6/d;->d:F

    .line 8
    new-instance p1, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p1, p0, Lo6/d;->e:Landroid/graphics/Paint;

    .line 9
    new-instance p5, Landroid/graphics/Paint;

    invoke-direct {p5, p3}, Landroid/graphics/Paint;-><init>(I)V

    iput-object p5, p0, Lo6/d;->f:Landroid/graphics/Paint;

    .line 10
    new-instance p3, Ls6/a;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v7}, Ls6/a;-><init>(FFFIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p3, p0, Lo6/d;->g:Ls6/a;

    .line 11
    new-instance p3, Landroid/graphics/Path;

    invoke-direct {p3}, Landroid/graphics/Path;-><init>()V

    iput-object p3, p0, Lo6/d;->h:Landroid/graphics/Path;

    .line 12
    sget-object p3, Lph/a;->a:Lph/a;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 13
    new-instance v0, Lo6/d$a;

    invoke-direct {v0, p3, p0}, Lo6/d$a;-><init>(Ljava/lang/Object;Lo6/d;)V

    .line 14
    iput-object v0, p0, Lo6/d;->i:Lph/d;

    .line 15
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 16
    new-instance v0, Lo6/d$b;

    invoke-direct {v0, p3, p0}, Lo6/d$b;-><init>(Ljava/lang/Object;Lo6/d;)V

    .line 17
    iput-object v0, p0, Lo6/d;->j:Lph/d;

    .line 18
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 19
    invoke-virtual {p5, p6}, Landroid/graphics/Paint;->setColor(I)V

    .line 20
    sget-object p1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p5, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 21
    invoke-static {p0, p4}, Ln6/c;->a(Ln6/b;Lw6/b;)V

    return-void
.end method

.method public synthetic constructor <init>(Lo6/c;ILr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    .line 1
    sget-object p1, Lo6/e;->a:Lo6/e;

    invoke-virtual {p1}, Lo6/e;->b()Lo6/c;

    move-result-object p1

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    const/high16 p2, -0x1000000

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    const/4 p3, 0x0

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    .line 2
    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object p4

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    const/4 p5, 0x0

    :cond_4
    move v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    const/4 p6, 0x0

    :cond_5
    move v3, p6

    move-object p2, p0

    move-object p3, p1

    move p4, p8

    move-object p5, v0

    move-object p6, v1

    move p7, v2

    move p8, v3

    .line 3
    invoke-direct/range {p2 .. p8}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FI)V

    return-void
.end method

.method public static final synthetic c(Lo6/d;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lo6/d;->e:Landroid/graphics/Paint;

    return-object p0
.end method

.method public static final synthetic d(Lo6/d;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lo6/d;->f:Landroid/graphics/Paint;

    return-object p0
.end method

.method private static final f(Lo6/d;Lu6/b;FLu6/b;FFFFFFLandroid/graphics/Paint;)V
    .locals 4

    iget-object v0, p0, Lo6/d;->b:Lo6/c;

    iget-object v1, p0, Lo6/d;->h:Landroid/graphics/Path;

    invoke-virtual {p0}, Lm6/a;->a()Lw6/c;

    move-result-object v2

    invoke-virtual {v2}, Lw6/c;->d()F

    move-result v2

    invoke-interface {p3, v2}, Lu6/e;->g(F)F

    move-result v2

    add-float/2addr p2, v2

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr p4, v2

    add-float/2addr p2, p4

    invoke-static {p2, p5}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-virtual {p0}, Lm6/a;->a()Lw6/c;

    move-result-object p2

    invoke-virtual {p2}, Lw6/c;->c()F

    move-result p2

    invoke-interface {p3, p2}, Lu6/e;->g(F)F

    move-result p2

    add-float/2addr p6, p2

    add-float/2addr p6, p4

    invoke-static {p6, p7}, Ljava/lang/Math;->min(FF)F

    move-result v3

    invoke-virtual {p0}, Lm6/a;->a()Lw6/c;

    move-result-object p2

    invoke-virtual {p2}, Lw6/c;->b()F

    move-result p2

    invoke-interface {p3, p2}, Lu6/e;->g(F)F

    move-result p2

    sub-float/2addr p8, p2

    sub-float/2addr p8, p4

    invoke-static {p8, p5}, Ljava/lang/Math;->max(FF)F

    move-result p8

    invoke-virtual {p0}, Lm6/a;->a()Lw6/c;

    move-result-object p0

    invoke-virtual {p0}, Lw6/c;->a()F

    move-result p0

    invoke-interface {p3, p0}, Lu6/e;->g(F)F

    move-result p0

    sub-float/2addr p9, p0

    sub-float/2addr p9, p4

    invoke-static {p9, p7}, Ljava/lang/Math;->max(FF)F

    move-result p9

    move-object p2, v0

    move-object p3, p1

    move-object p4, p10

    move-object p5, v1

    move p6, v2

    move p7, v3

    invoke-interface/range {p2 .. p9}, Lo6/c;->a(Lu6/b;Landroid/graphics/Paint;Landroid/graphics/Path;FFFF)V

    return-void
.end method


# virtual methods
.method public b(Lu6/b;FFFF)V
    .locals 16

    move-object/from16 v11, p0

    move-object/from16 v12, p1

    const-string/jumbo v0, "context"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    cmpg-float v0, p2, p4

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    cmpg-float v0, p3, p5

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v0, v11, Lo6/d;->h:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->rewind()V

    invoke-virtual/range {p0 .. p5}, Lo6/d;->e(Lu6/b;FFFF)V

    add-float v0, p2, p4

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float v13, v0, v1

    add-float v0, p3, p5

    div-float v14, v0, v1

    iget-object v0, v11, Lo6/d;->g:Ls6/a;

    iget-object v1, v11, Lo6/d;->e:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lo6/d;->g()I

    move-result v2

    invoke-virtual {v0, v12, v1, v2}, Ls6/a;->a(Lu6/b;Landroid/graphics/Paint;I)V

    iget v0, v11, Lo6/d;->d:F

    invoke-interface {v12, v0}, Lu6/e;->g(F)F

    move-result v15

    iget-object v0, v11, Lo6/d;->f:Landroid/graphics/Paint;

    invoke-virtual {v0, v15}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v10, v11, Lo6/d;->e:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p1

    move v4, v15

    move v5, v13

    move/from16 v6, p3

    move v7, v14

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-static/range {v0 .. v10}, Lo6/d;->f(Lo6/d;Lu6/b;FLu6/b;FFFFFFLandroid/graphics/Paint;)V

    const/4 v0, 0x0

    cmpl-float v0, v15, v0

    if-lez v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Lo6/d;->h()I

    move-result v0

    invoke-static {v0}, Ly6/b;->e(I)I

    move-result v0

    if-lez v0, :cond_2

    iget-object v10, v11, Lo6/d;->f:Landroid/graphics/Paint;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v3, p1

    move v4, v15

    move v5, v13

    move/from16 v6, p3

    move v7, v14

    move/from16 v8, p4

    move/from16 v9, p5

    invoke-static/range {v0 .. v10}, Lo6/d;->f(Lo6/d;Lu6/b;FLu6/b;FFFFFFLandroid/graphics/Paint;)V

    :cond_2
    sget-object v0, Lv6/a;->a:Lv6/a;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-virtual/range {v0 .. v5}, Lv6/a;->a(Lu6/b;FFFF)V

    return-void
.end method

.method protected final e(Lu6/b;FFFF)V
    .locals 7

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lo6/d;->c:Lr6/b;

    if-eqz v1, :cond_0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Lr6/b;->a(Lu6/b;FFFF)Landroid/graphics/Shader;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p2, p0, Lo6/d;->e:Landroid/graphics/Paint;

    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    :cond_0
    return-void
.end method

.method public final g()I
    .locals 3

    iget-object v0, p0, Lo6/d;->i:Lph/d;

    sget-object v1, Lo6/d;->k:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final h()I
    .locals 3

    iget-object v0, p0, Lo6/d;->j:Lph/d;

    sget-object v1, Lo6/d;->k:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method
