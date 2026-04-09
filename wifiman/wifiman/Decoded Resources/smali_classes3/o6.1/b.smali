.class public Lo6/b;
.super Lo6/d;
.source "SourceFile"


# instance fields
.field private l:F


# direct methods
.method public constructor <init>(IFLo6/c;Lr6/b;Lw6/b;FI)V
    .locals 7

    const-string/jumbo v0, "shape"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "margins"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    move-object v1, p3

    move v2, p1

    move-object v3, p4

    move-object v4, p5

    move v5, p6

    move v6, p7

    .line 4
    invoke-direct/range {v0 .. v6}, Lo6/d;-><init>(Lo6/c;ILr6/b;Lw6/b;FI)V

    .line 5
    iput p2, p0, Lo6/b;->l:F

    return-void
.end method

.method public synthetic constructor <init>(IFLo6/c;Lr6/b;Lw6/b;FIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_1

    .line 1
    sget-object v1, Lo6/e;->a:Lo6/e;

    invoke-virtual {v1}, Lo6/e;->b()Lo6/c;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, p3

    :goto_1
    and-int/lit8 v2, p8, 0x8

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    move-object v2, p4

    :goto_2
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_3

    .line 2
    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v3

    goto :goto_3

    :cond_3
    move-object v3, p5

    :goto_3
    and-int/lit8 v4, p8, 0x20

    if-eqz v4, :cond_4

    const/4 v4, 0x0

    goto :goto_4

    :cond_4
    move v4, p6

    :goto_4
    and-int/lit8 v5, p8, 0x40

    if-eqz v5, :cond_5

    const/4 v5, 0x0

    goto :goto_5

    :cond_5
    move v5, p7

    :goto_5
    move-object p2, p0

    move p3, p1

    move p4, v0

    move-object p5, v1

    move-object p6, v2

    move-object p7, v3

    move p8, v4

    move p9, v5

    .line 3
    invoke-direct/range {p2 .. p9}, Lo6/b;-><init>(IFLo6/c;Lr6/b;Lw6/b;FI)V

    return-void
.end method

.method public static synthetic j(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lo6/b;->i(Lu6/b;FFFF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: drawHorizontal"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic l(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/high16 p5, 0x3f800000    # 1.0f

    :cond_0
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lo6/b;->k(Lu6/b;FFFF)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: drawVertical"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final m(Lu6/e;)F
    .locals 1

    iget v0, p0, Lo6/b;->l:F

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    return p1
.end method


# virtual methods
.method public i(Lu6/b;FFFF)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo6/b;->m(Lu6/e;)F

    move-result v0

    mul-float/2addr v0, p5

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    sub-float v5, p4, v0

    invoke-direct {p0, p1}, Lo6/b;->m(Lu6/e;)F

    move-result v0

    mul-float/2addr v0, p5

    div-float/2addr v0, v1

    add-float v7, p4, v0

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move v6, p3

    invoke-virtual/range {v2 .. v7}, Lo6/d;->b(Lu6/b;FFFF)V

    return-void
.end method

.method public k(Lu6/b;FFFF)V
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lo6/b;->m(Lu6/e;)F

    move-result v0

    mul-float/2addr v0, p5

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    sub-float v4, p4, v0

    invoke-direct {p0, p1}, Lo6/b;->m(Lu6/e;)F

    move-result v0

    mul-float/2addr v0, p5

    div-float/2addr v0, v1

    add-float v6, p4, v0

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    move v7, p3

    invoke-virtual/range {v2 .. v7}, Lo6/d;->b(Lu6/b;FFFF)V

    return-void
.end method

.method public final n()F
    .locals 1

    iget v0, p0, Lo6/b;->l:F

    return v0
.end method
