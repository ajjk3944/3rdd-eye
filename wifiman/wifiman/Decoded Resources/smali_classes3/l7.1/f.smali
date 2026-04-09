.class public final Ll7/f;
.super Lg7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/f$a;,
        Ll7/f$b;
    }
.end annotation


# static fields
.field public static final t:Ll7/f$a;


# instance fields
.field private final b:Lm7/e;

.field private final c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:F

.field private i:F

.field private j:F

.field private final k:I

.field private final l:I

.field private final m:F

.field private final n:Ljava/util/HashMap;

.field private final o:Ljava/util/HashMap;

.field private p:Ljava/nio/FloatBuffer;

.field private final q:Landroid/graphics/Rect;

.field private final r:Landroid/graphics/RectF;

.field private final s:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll7/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll7/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll7/f;->t:Ll7/f$a;

    return-void
.end method

.method public constructor <init>(Lm7/e;Landroid/content/Context;)V
    .locals 1

    const-string/jumbo v0, "mainRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg7/a;-><init>()V

    iput-object p1, p0, Ll7/f;->b:Lm7/e;

    iput-object p2, p0, Ll7/f;->c:Landroid/content/Context;

    const p1, 0x3f733333    # 0.95f

    iput p1, p0, Ll7/f;->h:F

    const/high16 p2, 0x40000000    # 2.0f

    div-float p2, p1, p2

    iput p2, p0, Ll7/f;->i:F

    iput p1, p0, Ll7/f;->j:F

    const/4 p1, 0x0

    const/16 p2, 0xff

    invoke-static {p1, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Ll7/f;->k:I

    invoke-static {p2, p2, p2, p2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Ll7/f;->l:I

    const p1, -0x42333333    # -0.1f

    iput p1, p0, Ll7/f;->m:F

    new-instance p1, Ljava/util/HashMap;

    const/16 p2, 0x3e8

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll7/f;->n:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1, p2}, Ljava/util/HashMap;-><init>(I)V

    iput-object p1, p0, Ll7/f;->o:Ljava/util/HashMap;

    const/16 p1, 0x64

    invoke-direct {p0, p1}, Ll7/f;->o(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lg7/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Ll7/f;->q:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Ll7/f;->r:Landroid/graphics/RectF;

    const/4 p1, 0x4

    new-array p1, p1, [F

    iput-object p1, p0, Ll7/f;->s:[F

    return-void
.end method

.method public static synthetic c(JLkotlin/jvm/internal/K;Ll7/f;IIJLl7/f$b;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p8}, Ll7/f;->w(JLkotlin/jvm/internal/K;Ll7/f;IIJLl7/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(JLkotlin/jvm/internal/K;Ll7/f;IJLl7/f$b;)LYg/J;
    .locals 0

    invoke-static/range {p0 .. p7}, Ll7/f;->f(JLkotlin/jvm/internal/K;Ll7/f;IJLl7/f$b;)LYg/J;

    move-result-object p0

    return-object p0
.end method

.method private final e(Ll7/c;IJZ)Ll7/f$b;
    .locals 16

    move-object/from16 v6, p0

    invoke-direct/range {p0 .. p1}, Ll7/f;->n(Ll7/c;)I

    move-result v5

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    const-wide/16 v0, 0x384

    add-long v1, p3, v0

    new-instance v15, Ll7/f$b;

    if-eqz p5, :cond_0

    iget v0, v6, Ll7/f;->k:I

    :goto_0
    move v9, v0

    goto :goto_1

    :cond_0
    iget v0, v6, Ll7/f;->l:I

    goto :goto_0

    :goto_1
    if-eqz p5, :cond_1

    iget v0, v6, Ll7/f;->m:F

    :goto_2
    move v10, v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    :goto_3
    new-instance v13, Ll7/e;

    move-object v0, v13

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v5}, Ll7/e;-><init>(JLkotlin/jvm/internal/K;Ll7/f;I)V

    move-object v7, v15

    move/from16 v8, p2

    move-wide/from16 v11, p3

    move/from16 v14, p5

    invoke-direct/range {v7 .. v14}, Ll7/f$b;-><init>(IIFJLmh/p;Z)V

    return-object v15
.end method

.method private static final f(JLkotlin/jvm/internal/K;Ll7/f;IJLl7/f$b;)LYg/J;
    .locals 1

    const-string/jumbo v0, "renderState"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    cmp-long v0, p5, p0

    if-gez v0, :cond_1

    invoke-direct {p3, p5, p6, p0, p1}, Ll7/f;->g(JJ)F

    move-result p0

    iput p0, p2, Lkotlin/jvm/internal/K;->a:F

    iget p1, p3, Ll7/f;->m:F

    const/4 p5, 0x1

    int-to-float p5, p5

    sub-float/2addr p5, p0

    mul-float/2addr p1, p5

    invoke-virtual {p7, p1}, Ll7/f$b;->j(F)V

    iget p0, p2, Lkotlin/jvm/internal/K;->a:F

    const/high16 p1, 0x3f000000    # 0.5f

    cmpg-float p2, p0, p1

    if-gtz p2, :cond_0

    iget p1, p3, Ll7/f;->k:I

    iget p2, p3, Ll7/f;->l:I

    const/high16 p4, 0x40000000    # 2.0f

    mul-float/2addr p0, p4

    invoke-direct {p3, p1, p2, p0}, Ll7/f;->i(IIF)I

    move-result p0

    invoke-virtual {p7, p0}, Ll7/f$b;->h(I)V

    goto :goto_0

    :cond_0
    iget p2, p3, Ll7/f;->l:I

    sub-float/2addr p0, p1

    const/4 p1, 0x2

    int-to-float p1, p1

    mul-float/2addr p0, p1

    invoke-direct {p3, p2, p4, p0}, Ll7/f;->i(IIF)I

    move-result p0

    invoke-virtual {p7, p0}, Ll7/f$b;->h(I)V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    invoke-virtual {p7, p0}, Ll7/f$b;->j(F)V

    invoke-virtual {p7, p4}, Ll7/f$b;->h(I)V

    const/4 p0, 0x0

    invoke-virtual {p7, p0}, Ll7/f$b;->f(Z)V

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final g(JJ)F
    .locals 0

    sub-long/2addr p3, p1

    long-to-float p1, p3

    const/high16 p2, 0x44610000    # 900.0f

    div-float/2addr p1, p2

    const/high16 p2, 0x3f800000    # 1.0f

    sub-float p1, p2, p1

    invoke-static {p2, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    return p1
.end method

.method private final h(I)V
    .locals 7

    iget-object v0, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    :goto_0
    if-ge v0, p1, :cond_0

    mul-int/lit8 v0, v0, 0x2

    goto :goto_0

    :cond_0
    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    if-eq v0, p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "Extending floorplan matrix buffer capacity to "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p0, p1, v0}, Lg7/a;->b(Ljava/nio/FloatBuffer;I)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    sub-long/2addr v5, v3

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->capacity()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v3, "Extended floorplan matrix buffer to "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " capacity - took "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1, v2, v1}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_1
    return-void
.end method

.method private final i(IIF)I
    .locals 5

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    sub-int/2addr v1, v2

    int-to-float v1, v1

    mul-float/2addr v1, p3

    add-float/2addr v0, v1

    float-to-int v0, v0

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v1

    int-to-float v1, v1

    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v2

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    mul-float/2addr v2, p3

    add-float/2addr v1, v2

    float-to-int v1, v1

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v2

    int-to-float v2, v2

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v3

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v4

    sub-int/2addr v3, v4

    int-to-float v3, v3

    mul-float/2addr v3, p3

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v3

    int-to-float v3, v3

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result p2

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result p1

    sub-int/2addr p2, p1

    int-to-float p1, p2

    mul-float/2addr p1, p3

    add-float/2addr v3, p1

    float-to-int p1, v3

    invoke-static {v0, v1, v2, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private final k()V
    .locals 12

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/16 v1, 0x302

    const/16 v2, 0x303

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3}, Landroid/opengl/GLES20;->glBlendFuncSeparate(IIII)V

    iget v1, p0, Ll7/f;->g:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget-object v1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    div-int/lit8 v1, v1, 0x7

    iget-object v4, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v5, p0, Ll7/f;->e:I

    const/16 v9, 0x1c

    iget-object v10, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    const/4 v6, 0x3

    const/16 v7, 0x1406

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Ll7/f;->e:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget-object v4, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v6, p0, Ll7/f;->f:I

    const/16 v10, 0x1c

    iget-object v11, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    const/4 v7, 0x4

    const/16 v8, 0x1406

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Ll7/f;->f:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Ll7/f;->d:I

    iget-object v5, p0, Ll7/f;->b:Lm7/e;

    invoke-virtual {v5}, Lm7/e;->c()[F

    move-result-object v5

    invoke-static {v4, v3, v2, v5, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 v3, 0x4

    invoke-static {v3, v2, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v1, p0, Ll7/f;->e:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v1, p0, Ll7/f;->f:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    return-void
.end method

.method private final l(Ll7/f$b;)I
    .locals 0

    invoke-virtual {p1}, Ll7/f$b;->c()I

    move-result p1

    invoke-direct {p0, p1}, Ll7/f;->o(I)I

    move-result p1

    return p1
.end method

.method private final n(Ll7/c;)I
    .locals 1

    invoke-interface {p1}, Ll7/c;->a()Ll7/c$b;

    move-result-object v0

    invoke-interface {v0}, Ll7/c$b;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ll7/c;->b()I

    move-result p1

    goto :goto_0

    :cond_0
    iget p1, p0, Ll7/f;->k:I

    :goto_0
    return p1
.end method

.method private final o(I)I
    .locals 0

    mul-int/lit8 p1, p1, 0x2a

    return p1
.end method

.method private final p(I[F)V
    .locals 1

    sget-object v0, Lg7/b;->a:Lg7/b;

    invoke-virtual {v0, p1, p2}, Lg7/b;->a(I[F)V

    return-void
.end method

.method private final q(LW7/d;Landroid/graphics/RectF;)V
    .locals 2

    invoke-virtual {p1}, LW7/d;->a()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll7/f;->i:F

    sub-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1}, LW7/d;->b()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll7/f;->i:F

    sub-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1}, LW7/d;->a()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Ll7/f;->i:F

    add-float/2addr v0, v1

    iput v0, p2, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1}, LW7/d;->b()I

    move-result p1

    int-to-float p1, p1

    iget v0, p0, Ll7/f;->i:F

    add-float/2addr p1, v0

    iput p1, p2, Landroid/graphics/RectF;->bottom:F

    return-void
.end method

.method private final s(Z)V
    .locals 11

    iget-object v0, p0, Ll7/f;->n:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->size()I

    move-result v1

    iget-object v2, p0, Ll7/f;->n:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {p0, v1}, Ll7/f;->o(I)I

    move-result v1

    invoke-direct {p0, v1}, Ll7/f;->h(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    iget-object v1, p0, Ll7/f;->n:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, LW7/d;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ll7/c;

    iget-object v2, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-virtual {v2, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    iget-object v2, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->size()I

    move-result v4

    move-object v2, p0

    move-wide v5, v8

    move v7, p1

    invoke-direct/range {v2 .. v7}, Ll7/f;->e(Ll7/c;IJZ)Ll7/f$b;

    move-result-object v2

    iget-object v3, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v3, v10, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-object v4, v2

    check-cast v4, Ll7/f$b;

    invoke-direct {p0, v4, v3, v8, v9}, Ll7/f;->v(Ll7/f$b;Ll7/c;J)V

    :goto_1
    check-cast v2, Ll7/f$b;

    invoke-direct {p0, v10, v2}, Ll7/f;->x(LW7/d;Ll7/f$b;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll7/f;->n:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method private final v(Ll7/f$b;Ll7/c;J)V
    .locals 7

    invoke-virtual {p1}, Ll7/f$b;->d()I

    move-result v5

    invoke-direct {p0, p2}, Ll7/f;->n(Ll7/c;)I

    move-result v6

    new-instance v3, Lkotlin/jvm/internal/K;

    invoke-direct {v3}, Lkotlin/jvm/internal/K;-><init>()V

    const-wide/16 v0, 0x384

    add-long v1, p3, v0

    invoke-interface {p2}, Ll7/c;->a()Ll7/c$b;

    move-result-object p2

    invoke-interface {p2}, Ll7/c$b;->c()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll7/f$b;->i(J)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ll7/f$b;->j(F)V

    new-instance p2, Ll7/d;

    move-object v0, p2

    move-object v4, p0

    invoke-direct/range {v0 .. v6}, Ll7/d;-><init>(JLkotlin/jvm/internal/K;Ll7/f;II)V

    invoke-virtual {p1, p2}, Ll7/f$b;->g(Lmh/p;)V

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll7/f$b;->f(Z)V

    return-void
.end method

.method private static final w(JLkotlin/jvm/internal/K;Ll7/f;IIJLl7/f$b;)LYg/J;
    .locals 1

    const-string/jumbo v0, "renderState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    cmp-long v0, p6, p0

    if-gez v0, :cond_0

    invoke-direct {p3, p6, p7, p0, p1}, Ll7/f;->g(JJ)F

    move-result p0

    iput p0, p2, Lkotlin/jvm/internal/K;->a:F

    invoke-direct {p3, p4, p5, p0}, Ll7/f;->i(IIF)I

    move-result p0

    invoke-virtual {p8, p0}, Ll7/f$b;->h(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p8, p5}, Ll7/f$b;->h(I)V

    const/4 p0, 0x0

    invoke-virtual {p8, p0}, Ll7/f$b;->f(Z)V

    :goto_0
    sget-object p0, LYg/J;->a:LYg/J;

    return-object p0
.end method

.method private final x(LW7/d;Ll7/f$b;)V
    .locals 2

    iget-object v0, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-direct {p0, p2}, Ll7/f;->l(Ll7/f$b;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    invoke-direct {p0, p1, v0}, Ll7/f;->q(LW7/d;Landroid/graphics/RectF;)V

    invoke-virtual {p2}, Ll7/f$b;->d()I

    move-result p1

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-direct {p0, p1, v0}, Ll7/f;->p(I[F)V

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result v0

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->s:[F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object v0, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {p2}, Ll7/f$b;->e()F

    move-result p2

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->p:Ljava/nio/FloatBuffer;

    iget-object p2, p0, Ll7/f;->s:[F

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/f;->q:Landroid/graphics/Rect;

    iget-object p2, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->left:F

    iget v0, p1, Landroid/graphics/Rect;->left:I

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->left:I

    :cond_0
    iget-object p2, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->right:F

    iget v0, p1, Landroid/graphics/Rect;->right:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_1

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->right:I

    :cond_1
    iget-object p2, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->top:F

    iget v0, p1, Landroid/graphics/Rect;->top:I

    int-to-float v0, v0

    cmpl-float v0, p2, v0

    if-lez v0, :cond_2

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->top:I

    :cond_2
    iget-object p2, p0, Ll7/f;->r:Landroid/graphics/RectF;

    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    iget v0, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v0, v0

    cmpg-float v0, p2, v0

    if-gez v0, :cond_3

    invoke-static {p2}, Loh/b;->e(F)I

    move-result p2

    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    :cond_3
    return-void
.end method


# virtual methods
.method public j()V
    .locals 0

    invoke-direct {p0}, Ll7/f;->k()V

    return-void
.end method

.method public m()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Ll7/f;->q:Landroid/graphics/Rect;

    return-object v0
.end method

.method public r()V
    .locals 6

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Ll7/f;->g:I

    const-string/jumbo v1, "a_Color"

    const-string/jumbo v2, "a_Position"

    if-eqz v0, :cond_0

    sget-object v3, Lg7/d;->a:Lg7/d;

    iget-object v4, p0, Ll7/f;->c:Landroid/content/Context;

    sget v5, Lh7/k;->d:I

    invoke-virtual {v3, v4, v5}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x8b31

    invoke-virtual {v3, v5, v4}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v4

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Ll7/f;->g:I

    iget-object v4, p0, Ll7/f;->c:Landroid/content/Context;

    sget v5, Lh7/k;->c:I

    invoke-virtual {v3, v4, v5}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x8b30

    invoke-virtual {v3, v5, v4}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Ll7/f;->g:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Ll7/f;->g:I

    const/4 v4, 0x1

    invoke-static {v0, v4, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Ll7/f;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    new-array v0, v4, [I

    iget v4, p0, Ll7/f;->g:I

    const v5, 0x8b82

    invoke-static {v4, v5, v0, v3}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, v0, v3

    if-nez v0, :cond_0

    iget v0, p0, Ll7/f;->g:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v3, p0, Ll7/f;->g:I

    :cond_0
    iget v0, p0, Ll7/f;->g:I

    if-eqz v0, :cond_1

    const-string/jumbo v3, "u_MVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/f;->d:I

    iget v0, p0, Ll7/f;->g:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/f;->e:I

    iget v0, p0, Ll7/f;->g:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/f;->f:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Error creating program."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final t(Z)V
    .locals 6

    iget v0, p0, Ll7/f;->j:F

    iget v1, p0, Ll7/f;->h:F

    cmpg-float v0, v0, v1

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LW7/d;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/f$b;

    invoke-direct {p0, v2, v1}, Ll7/f;->x(LW7/d;Ll7/f$b;)V

    goto :goto_0

    :cond_1
    iget v0, p0, Ll7/f;->h:F

    iput v0, p0, Ll7/f;->j:F

    :goto_1
    invoke-direct {p0, p1}, Ll7/f;->s(Z)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p1, p0, Ll7/f;->o:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LW7/d;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll7/f$b;

    invoke-virtual {v2}, Ll7/f$b;->a()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v2}, Ll7/f$b;->b()Lmh/p;

    move-result-object v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, v3, v2}, Ll7/f;->x(LW7/d;Ll7/f$b;)V

    goto :goto_2

    :cond_3
    return-void
.end method

.method public final u(F)V
    .locals 1

    iput p1, p0, Ll7/f;->h:F

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p1, v0

    iput p1, p0, Ll7/f;->i:F

    return-void
.end method

.method public final y(Ljava/util/List;)V
    .locals 4

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ll7/f;->n:Ljava/util/HashMap;

    monitor-enter v0

    :try_start_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/c;

    iget-object v2, p0, Ll7/f;->n:Ljava/util/HashMap;

    invoke-interface {v1}, Ll7/i;->c()LW7/d;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    sget-object p1, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw p1
.end method
