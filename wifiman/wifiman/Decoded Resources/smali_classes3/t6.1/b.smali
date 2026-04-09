.class public Lt6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt6/b$a;,
        Lt6/b$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/text/TextPaint;

.field private final b:Landroid/graphics/RectF;

.field private c:F

.field private d:Landroid/text/TextUtils$TruncateAt;

.field private e:I

.field private f:Lm6/a;

.field private final g:Lth/i;

.field private h:Lw6/c;

.field private i:Lw6/c;

.field private j:Landroid/text/Layout;


# direct methods
.method protected constructor <init>()V
    .locals 14

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Landroid/text/TextPaint;

    const/4 v0, 0x1

    invoke-direct {v1, v0}, Landroid/text/TextPaint;-><init>(I)V

    iput-object v1, p0, Lt6/b;->a:Landroid/text/TextPaint;

    new-instance v2, Landroid/graphics/RectF;

    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    iput-object v2, p0, Lt6/b;->b:Landroid/graphics/RectF;

    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    iput-object v2, p0, Lt6/b;->d:Landroid/text/TextUtils$TruncateAt;

    iput v0, p0, Lt6/b;->e:I

    new-instance v0, Lt6/b$d;

    invoke-direct {v0, v1}, Lt6/b$d;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lt6/b;->g:Lth/i;

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v0

    iput-object v0, p0, Lt6/b;->h:Lw6/c;

    invoke-static {}, Lw6/d;->a()Lw6/c;

    move-result-object v0

    iput-object v0, p0, Lt6/b;->i:Lw6/c;

    const/16 v12, 0xff8

    const/4 v13, 0x0

    const-string v0, ""

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

    invoke-static/range {v0 .. v13}, LF6/a;->d(Ljava/lang/CharSequence;Landroid/text/TextPaint;IIIIFFZLandroid/text/TextUtils$TruncateAt;ILandroid/text/Layout$Alignment;ILjava/lang/Object;)Landroid/text/StaticLayout;

    move-result-object v0

    iput-object v0, p0, Lt6/b;->j:Landroid/text/Layout;

    return-void
.end method

.method public static final synthetic b(Lt6/b;)Landroid/text/TextPaint;
    .locals 0

    iget-object p0, p0, Lt6/b;->a:Landroid/text/TextPaint;

    return-object p0
.end method

.method public static synthetic d(Lt6/b;Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIFILjava/lang/Object;)V
    .locals 12

    move/from16 v0, p10

    if-nez p11, :cond_5

    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_0

    sget-object v1, Lt6/a;->Center:Lt6/a;

    move-object v7, v1

    goto :goto_0

    :cond_0
    move-object/from16 v7, p5

    :goto_0
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_1

    sget-object v1, Lt6/c;->Center:Lt6/c;

    move-object v8, v1

    goto :goto_1

    :cond_1
    move-object/from16 v8, p6

    :goto_1
    and-int/lit8 v1, v0, 0x40

    const v2, 0x7fffffff

    if-eqz v1, :cond_2

    move v9, v2

    goto :goto_2

    :cond_2
    move/from16 v9, p7

    :goto_2
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_3

    move v10, v2

    goto :goto_3

    :cond_3
    move/from16 v10, p8

    :goto_3
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_4

    const/4 v0, 0x0

    move v11, v0

    goto :goto_4

    :cond_4
    move/from16 v11, p9

    :goto_4
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move/from16 v6, p4

    invoke-virtual/range {v2 .. v11}, Lt6/b;->c(Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIF)V

    return-void

    :cond_5
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v1, "Super calls with default arguments not supported in this target, function: drawText"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic g(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IIFILjava/lang/Object;)F
    .locals 6

    if-nez p7, :cond_4

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const p7, 0x7fffffff

    if-eqz p2, :cond_1

    move v3, p7

    goto :goto_0

    :cond_1
    move v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move v4, p7

    goto :goto_1

    :cond_2
    move v4, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    const/4 p5, 0x0

    :cond_3
    move v5, p5

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Lt6/b;->f(Lu6/e;Ljava/lang/CharSequence;IIF)F

    move-result p0

    return p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: getHeight"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final h(Lu6/e;Ljava/lang/CharSequence;FIIF)Landroid/text/StaticLayout;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p6

    invoke-virtual/range {p0 .. p0}, Lt6/b;->a()Lw6/c;

    move-result-object v4

    invoke-virtual {v4}, Lw6/c;->e()F

    move-result v4

    invoke-interface {v1, v4}, Lu6/e;->o(F)I

    move-result v4

    sub-int v4, p4, v4

    invoke-virtual/range {p0 .. p0}, Lt6/b;->a()Lw6/c;

    move-result-object v5

    invoke-virtual {v5}, Lw6/c;->h()F

    move-result v5

    invoke-interface {v1, v5}, Lu6/e;->o(F)I

    move-result v5

    sub-int v5, p5, v5

    const/high16 v6, 0x43340000    # 180.0f

    rem-float v6, v3, v6

    const/4 v7, 0x0

    cmpg-float v6, v6, v7

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v6, 0x42b40000    # 90.0f

    rem-float v6, v3, v6

    cmpg-float v6, v6, v7

    if-nez v6, :cond_1

    move v4, v5

    goto :goto_0

    :cond_1
    iget v6, v0, Lt6/b;->e:I

    int-to-float v6, v6

    iget-object v7, v0, Lt6/b;->a:Landroid/text/TextPaint;

    invoke-static {v7}, Ly6/h;->a(Landroid/graphics/Paint;)F

    move-result v7

    mul-float/2addr v6, v7

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v7

    invoke-virtual {v7}, Lw6/c;->h()F

    move-result v7

    invoke-interface {v1, v7}, Lu6/e;->o(F)I

    move-result v7

    int-to-float v7, v7

    add-float/2addr v6, v7

    float-to-double v7, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Math;->abs(D)D

    move-result-wide v9

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Math;->abs(D)D

    move-result-wide v7

    int-to-double v11, v4

    float-to-double v13, v6

    mul-double v15, v13, v9

    sub-double/2addr v11, v15

    div-double/2addr v11, v7

    int-to-double v4, v5

    mul-double/2addr v13, v7

    sub-double/2addr v4, v13

    div-double/2addr v4, v9

    invoke-static {v11, v12, v4, v5}, Ljava/lang/Math;->min(DD)D

    move-result-wide v4

    double-to-int v4, v4

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v5

    invoke-virtual {v5}, Lw6/c;->e()F

    move-result v5

    invoke-interface {v1, v5}, Lu6/e;->o(F)I

    move-result v5

    sub-int/2addr v4, v5

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lsh/m;->d(II)I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v6, "layout_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    iget-object v3, v0, Lt6/b;->a:Landroid/text/TextPaint;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lt6/b$c;

    move/from16 v6, p3

    invoke-direct {v5, v0, v6, v2, v4}, Lt6/b$c;-><init>(Lt6/b;FLjava/lang/CharSequence;I)V

    invoke-static {v1, v3, v5}, Lu6/d;->b(Lu6/c;Ljava/lang/Object;Lmh/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/text/StaticLayout;

    return-object v1
.end method

.method public static synthetic m(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZFILjava/lang/Object;)Landroid/graphics/RectF;
    .locals 7

    if-nez p9, :cond_6

    and-int/lit8 v0, p8, 0x2

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    and-int/lit8 v1, p8, 0x4

    const v2, 0x7fffffff

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v2, p4

    :goto_2
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_3

    move-object v3, p0

    iget-object v4, v3, Lt6/b;->b:Landroid/graphics/RectF;

    goto :goto_3

    :cond_3
    move-object v3, p0

    move-object v4, p5

    :goto_3
    and-int/lit8 v5, p8, 0x20

    if-eqz v5, :cond_4

    const/4 v5, 0x1

    goto :goto_4

    :cond_4
    move v5, p6

    :goto_4
    and-int/lit8 v6, p8, 0x40

    if-eqz v6, :cond_5

    const/4 v6, 0x0

    goto :goto_5

    :cond_5
    move v6, p7

    :goto_5
    move-object p2, p0

    move-object p3, p1

    move-object p4, v0

    move p5, v1

    move p6, v2

    move-object p7, v4

    move p8, v5

    move/from16 p9, v6

    invoke-virtual/range {p2 .. p9}, Lt6/b;->l(Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZF)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0

    :cond_6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo v1, "Super calls with default arguments not supported in this target, function: getTextBounds"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final n(Lu6/e;F)F
    .locals 2

    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Lw6/c;->f(Z)F

    move-result v0

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result v0

    add-float/2addr p2, v0

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Lw6/c;->f(Z)F

    move-result v0

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    add-float/2addr p2, p1

    return p2
.end method

.method private final o(Lu6/e;FF)F
    .locals 2

    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Lw6/c;->g(Z)F

    move-result v0

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result v0

    sub-float/2addr p2, v0

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v1

    invoke-virtual {v0, v1}, Lw6/c;->g(Z)F

    move-result v0

    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    sub-float/2addr p2, p1

    sub-float/2addr p2, p3

    return p2
.end method

.method private final q(Lt6/a;Lu6/e;FF)F
    .locals 1

    sget-object v0, Lt6/b$b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    int-to-float p1, v0

    div-float/2addr p4, p1

    sub-float/2addr p3, p4

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0, p2, p3}, Lt6/b;->n(Lu6/e;F)F

    move-result p3

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2, p3, p4}, Lt6/b;->o(Lu6/e;FF)F

    move-result p3

    goto :goto_0

    :cond_3
    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0, p2, p3, p4}, Lt6/b;->o(Lu6/e;FF)F

    move-result p3

    goto :goto_0

    :cond_4
    invoke-direct {p0, p2, p3}, Lt6/b;->n(Lu6/e;F)F

    move-result p3

    :goto_0
    return p3
.end method

.method private final r(Lt6/c;Lu6/e;FF)F
    .locals 1

    sget-object v0, Lt6/b$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    int-to-float p1, v0

    div-float/2addr p4, p1

    neg-float p1, p4

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object p1

    invoke-virtual {p1}, Lw6/c;->c()F

    move-result p1

    invoke-interface {p2, p1}, Lu6/e;->g(F)F

    move-result p1

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->c()F

    move-result p4

    invoke-interface {p2, p4}, Lu6/e;->g(F)F

    move-result p2

    add-float/2addr p1, p2

    goto :goto_0

    :cond_2
    neg-float p1, p4

    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->a()F

    move-result p4

    invoke-interface {p2, p4}, Lu6/e;->g(F)F

    move-result p4

    sub-float/2addr p1, p4

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->a()F

    move-result p4

    invoke-interface {p2, p4}, Lu6/e;->g(F)F

    move-result p2

    sub-float/2addr p1, p2

    :goto_0
    add-float/2addr p3, p1

    return p3
.end method

.method public static synthetic t(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IIFILjava/lang/Object;)F
    .locals 7

    if-nez p7, :cond_3

    and-int/lit8 p7, p6, 0x4

    const v0, 0x7fffffff

    if-eqz p7, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p3

    :goto_0
    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    move v5, v0

    goto :goto_1

    :cond_1
    move v5, p4

    :goto_1
    and-int/lit8 p3, p6, 0x10

    if-eqz p3, :cond_2

    const/4 p5, 0x0

    :cond_2
    move v6, p5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v6}, Lt6/b;->s(Lu6/e;Ljava/lang/CharSequence;IIF)F

    move-result p0

    return p0

    :cond_3
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: getWidth"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final u(Landroid/graphics/Paint$Align;F)F
    .locals 1

    sget-object v0, Lt6/b$b;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    int-to-float p1, v0

    div-float/2addr p2, p1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    return p2
.end method


# virtual methods
.method public final A(F)V
    .locals 0

    iput p1, p0, Lt6/b;->c:F

    return-void
.end method

.method public final B(Landroid/graphics/Typeface;)V
    .locals 1

    iget-object v0, p0, Lt6/b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public a()Lw6/c;
    .locals 1

    iget-object v0, p0, Lt6/b;->i:Lw6/c;

    return-object v0
.end method

.method public final c(Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIF)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move/from16 v11, p9

    const-string/jumbo v0, "context"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "horizontalPosition"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "verticalPosition"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, Lkotlin/text/t;->m0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface/range {p1 .. p1}, Lu6/e;->y()F

    move-result v3

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v4, p7

    move/from16 v5, p8

    move/from16 v6, p9

    invoke-direct/range {v0 .. v6}, Lt6/b;->h(Lu6/e;Ljava/lang/CharSequence;FIIF)Landroid/text/StaticLayout;

    move-result-object v0

    iput-object v0, v7, Lt6/b;->j:Landroid/text/Layout;

    const/high16 v1, 0x43b40000    # 360.0f

    rem-float v1, v11, v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    const/4 v3, 0x1

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v0}, LF6/a;->b(Landroid/text/Layout;)F

    move-result v0

    move/from16 v4, p3

    invoke-direct {v7, v9, v8, v4, v0}, Lt6/b;->q(Lt6/a;Lu6/e;FF)F

    move-result v0

    iget-object v4, v7, Lt6/b;->j:Landroid/text/Layout;

    invoke-virtual {v4}, Landroid/text/Layout;->getHeight()I

    move-result v4

    int-to-float v4, v4

    move/from16 v5, p4

    invoke-direct {v7, v10, v8, v5, v4}, Lt6/b;->r(Lt6/c;Lu6/e;FF)F

    move-result v4

    invoke-interface/range {p1 .. p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Canvas;->save()I

    iget-object v6, v7, Lt6/b;->j:Landroid/text/Layout;

    iget-object v12, v7, Lt6/b;->b:Landroid/graphics/RectF;

    invoke-static {v6, v12}, LF6/a;->a(Landroid/text/Layout;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lt6/b;->k()Landroid/graphics/Paint$Align;

    move-result-object v12

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v13

    invoke-direct {v7, v12, v13}, Lt6/b;->u(Landroid/graphics/Paint$Align;F)F

    move-result v12

    iget v13, v6, Landroid/graphics/RectF;->left:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v14

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v15

    invoke-virtual {v14, v15}, Lw6/c;->f(Z)F

    move-result v14

    invoke-interface {v8, v14}, Lu6/e;->g(F)F

    move-result v14

    sub-float/2addr v13, v14

    iput v13, v6, Landroid/graphics/RectF;->left:F

    iget v13, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v14

    invoke-virtual {v14}, Lw6/c;->c()F

    move-result v14

    invoke-interface {v8, v14}, Lu6/e;->g(F)F

    move-result v14

    sub-float/2addr v13, v14

    iput v13, v6, Landroid/graphics/RectF;->top:F

    iget v13, v6, Landroid/graphics/RectF;->right:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v14

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v15

    invoke-virtual {v14, v15}, Lw6/c;->g(Z)F

    move-result v14

    invoke-interface {v8, v14}, Lu6/e;->g(F)F

    move-result v14

    add-float/2addr v13, v14

    iput v13, v6, Landroid/graphics/RectF;->right:F

    iget v13, v6, Landroid/graphics/RectF;->bottom:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v14

    invoke-virtual {v14}, Lw6/c;->a()F

    move-result v14

    invoke-interface {v8, v14}, Lu6/e;->g(F)F

    move-result v14

    add-float/2addr v13, v14

    iput v13, v6, Landroid/graphics/RectF;->bottom:F

    if-nez v1, :cond_6

    invoke-static {v6}, Ly6/i;->a(Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object v13

    invoke-static {v13, v11}, Ly6/i;->d(Landroid/graphics/RectF;F)Landroid/graphics/RectF;

    move-result-object v13

    invoke-virtual {v6}, Landroid/graphics/RectF;->height()F

    move-result v14

    invoke-virtual {v13}, Landroid/graphics/RectF;->height()F

    move-result v15

    sub-float/2addr v14, v15

    invoke-virtual {v6}, Landroid/graphics/RectF;->width()F

    move-result v15

    invoke-virtual {v13}, Landroid/graphics/RectF;->width()F

    move-result v13

    sub-float/2addr v15, v13

    sget-object v13, Lt6/b$b;->a:[I

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v13, v9

    const/4 v13, 0x2

    if-eq v9, v3, :cond_3

    if-eq v9, v13, :cond_2

    move v9, v2

    goto :goto_1

    :cond_2
    int-to-float v9, v13

    div-float/2addr v15, v9

    neg-float v9, v15

    goto :goto_1

    :cond_3
    int-to-float v9, v13

    div-float v9, v15, v9

    :goto_1
    invoke-interface/range {p1 .. p1}, Lu6/e;->j()F

    move-result v15

    mul-float/2addr v9, v15

    sget-object v15, Lt6/b$b;->b:[I

    invoke-virtual/range {p6 .. p6}, Ljava/lang/Enum;->ordinal()I

    move-result v10

    aget v10, v15, v10

    if-eq v10, v3, :cond_5

    if-eq v10, v13, :cond_4

    goto :goto_2

    :cond_4
    int-to-float v2, v13

    div-float/2addr v14, v2

    neg-float v2, v14

    goto :goto_2

    :cond_5
    int-to-float v2, v13

    div-float v2, v14, v2

    :goto_2
    move v3, v2

    move v2, v9

    goto :goto_3

    :cond_6
    move v3, v2

    :goto_3
    add-float/2addr v0, v2

    add-float/2addr v4, v3

    invoke-static {v6, v0, v4}, Ly6/i;->f(Landroid/graphics/RectF;FF)Landroid/graphics/RectF;

    if-nez v1, :cond_7

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerX()F

    move-result v0

    invoke-virtual {v6}, Landroid/graphics/RectF;->centerY()F

    move-result v1

    invoke-virtual {v5, v11, v0, v1}, Landroid/graphics/Canvas;->rotate(FFF)V

    :cond_7
    iget-object v0, v7, Lt6/b;->f:Lm6/a;

    if-eqz v0, :cond_8

    iget v1, v6, Landroid/graphics/RectF;->left:F

    iget v2, v6, Landroid/graphics/RectF;->top:F

    iget v3, v6, Landroid/graphics/RectF;->right:F

    iget v4, v6, Landroid/graphics/RectF;->bottom:F

    move-object/from16 p2, v0

    move-object/from16 p3, p1

    move/from16 p4, v1

    move/from16 p5, v2

    move/from16 p6, v3

    move/from16 p7, v4

    invoke-virtual/range {p2 .. p7}, Lm6/a;->b(Lu6/b;FFFF)V

    :cond_8
    iget v0, v6, Landroid/graphics/RectF;->left:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v1

    invoke-interface/range {p1 .. p1}, Lu6/e;->h()Z

    move-result v2

    invoke-virtual {v1, v2}, Lw6/c;->f(Z)F

    move-result v1

    invoke-interface {v8, v1}, Lu6/e;->g(F)F

    move-result v1

    add-float/2addr v0, v1

    add-float/2addr v0, v12

    iget v1, v6, Landroid/graphics/RectF;->top:F

    invoke-virtual/range {p0 .. p0}, Lt6/b;->j()Lw6/c;

    move-result-object v2

    invoke-virtual {v2}, Lw6/c;->c()F

    move-result v2

    invoke-interface {v8, v2}, Lu6/e;->g(F)F

    move-result v2

    add-float/2addr v1, v2

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v0, v7, Lt6/b;->j:Landroid/text/Layout;

    invoke-virtual {v0, v5}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {v5}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final e()Landroid/text/TextUtils$TruncateAt;
    .locals 1

    iget-object v0, p0, Lt6/b;->d:Landroid/text/TextUtils$TruncateAt;

    return-object v0
.end method

.method public final f(Lu6/e;Ljava/lang/CharSequence;IIF)F
    .locals 11

    const-string/jumbo v0, "context"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move v4, p3

    move v5, p4

    move/from16 v8, p5

    invoke-static/range {v1 .. v10}, Lt6/b;->m(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZFILjava/lang/Object;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    move-result v0

    return v0
.end method

.method public final i()I
    .locals 1

    iget v0, p0, Lt6/b;->e:I

    return v0
.end method

.method public j()Lw6/c;
    .locals 1

    iget-object v0, p0, Lt6/b;->h:Lw6/c;

    return-object v0
.end method

.method public final k()Landroid/graphics/Paint$Align;
    .locals 2

    iget-object v0, p0, Lt6/b;->g:Lth/i;

    invoke-interface {v0}, Lth/m;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "<get-textAlign>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/graphics/Paint$Align;

    return-object v0
.end method

.method public final l(Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZF)Landroid/graphics/RectF;
    .locals 8

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "outRect"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/e;->y()F

    move-result v4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    move v6, p4

    move v7, p7

    invoke-direct/range {v1 .. v7}, Lt6/b;->h(Lu6/e;Ljava/lang/CharSequence;FIIF)Landroid/text/StaticLayout;

    move-result-object p2

    invoke-static {p2, p5}, LF6/a;->a(Landroid/text/Layout;Landroid/graphics/RectF;)Landroid/graphics/RectF;

    move-result-object p2

    if-eqz p6, :cond_0

    iget p3, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->e()F

    move-result p4

    invoke-interface {p1, p4}, Lu6/e;->g(F)F

    move-result p4

    add-float/2addr p3, p4

    iput p3, p2, Landroid/graphics/RectF;->right:F

    iget p3, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Lt6/b;->j()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->h()F

    move-result p4

    invoke-interface {p1, p4}, Lu6/e;->g(F)F

    move-result p4

    add-float/2addr p3, p4

    iput p3, p2, Landroid/graphics/RectF;->bottom:F

    :cond_0
    invoke-static {p2, p7}, Ly6/i;->d(Landroid/graphics/RectF;F)Landroid/graphics/RectF;

    move-result-object p2

    if-eqz p6, :cond_1

    iget p3, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->e()F

    move-result p4

    invoke-interface {p1, p4}, Lu6/e;->g(F)F

    move-result p4

    add-float/2addr p3, p4

    iput p3, p2, Landroid/graphics/RectF;->right:F

    iget p3, p2, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, Lt6/b;->a()Lw6/c;

    move-result-object p4

    invoke-virtual {p4}, Lw6/c;->h()F

    move-result p4

    invoke-interface {p1, p4}, Lu6/e;->g(F)F

    move-result p1

    add-float/2addr p3, p1

    iput p3, p2, Landroid/graphics/RectF;->bottom:F

    :cond_1
    return-object p2
.end method

.method public final p()F
    .locals 1

    iget v0, p0, Lt6/b;->c:F

    return v0
.end method

.method public final s(Lu6/e;Ljava/lang/CharSequence;IIF)F
    .locals 11

    const-string/jumbo v0, "context"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "text"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x30

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move v4, p3

    move v5, p4

    move/from16 v8, p5

    invoke-static/range {v1 .. v10}, Lt6/b;->m(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IILandroid/graphics/RectF;ZFILjava/lang/Object;)Landroid/graphics/RectF;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    move-result v0

    return v0
.end method

.method public final v(Lm6/a;)V
    .locals 0

    iput-object p1, p0, Lt6/b;->f:Lm6/a;

    return-void
.end method

.method public final w(I)V
    .locals 1

    iget-object v0, p0, Lt6/b;->a:Landroid/text/TextPaint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method

.method public final x(Landroid/text/TextUtils$TruncateAt;)V
    .locals 0

    iput-object p1, p0, Lt6/b;->d:Landroid/text/TextUtils$TruncateAt;

    return-void
.end method

.method public final y(I)V
    .locals 0

    iput p1, p0, Lt6/b;->e:I

    return-void
.end method

.method public final z(Landroid/graphics/Paint$Align;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lt6/b;->g:Lth/i;

    invoke-interface {v0, p1}, Lth/i;->set(Ljava/lang/Object;)V

    return-void
.end method
