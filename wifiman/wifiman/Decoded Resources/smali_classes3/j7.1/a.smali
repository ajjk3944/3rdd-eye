.class public final Lj7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj7/a$a;,
        Lj7/a$b;
    }
.end annotation


# static fields
.field public static final r:Lj7/a$a;


# instance fields
.field private final a:Lm7/e;

.field private final b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private final i:Landroid/graphics/RectF;

.field private j:F

.field private final k:I

.field private final l:I

.field private m:Ljava/nio/FloatBuffer;

.field private n:Ljava/nio/ByteBuffer;

.field private final o:Landroid/graphics/Rect;

.field private final p:Ljava/nio/FloatBuffer;

.field private q:Ljava/util/concurrent/ConcurrentLinkedQueue;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lj7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lj7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lj7/a;->r:Lj7/a$a;

    return-void
.end method

.method public constructor <init>(Lm7/e;Landroid/content/Context;II)V
    .locals 1

    const-string/jumbo v0, "mainRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/a;->a:Lm7/e;

    iput-object p2, p0, Lj7/a;->b:Landroid/content/Context;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    neg-int p2, p3

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    iput p2, p1, Landroid/graphics/RectF;->left:F

    iput p2, p1, Landroid/graphics/RectF;->top:F

    int-to-float p2, p3

    div-float/2addr p2, v0

    iput p2, p1, Landroid/graphics/RectF;->right:F

    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    iput-object p1, p0, Lj7/a;->i:Landroid/graphics/RectF;

    int-to-double p1, p3

    int-to-double p3, p4

    div-double/2addr p1, p3

    invoke-static {p1, p2}, Loh/b;->d(D)I

    move-result p1

    iput p1, p0, Lj7/a;->k:I

    mul-int/2addr p1, p1

    mul-int/lit8 p1, p1, 0x4

    iput p1, p0, Lj7/a;->l:I

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lj7/a;->o:Landroid/graphics/Rect;

    const/16 p1, 0xc

    new-array p2, p1, [F

    fill-array-data p2, :array_0

    invoke-direct {p0, p1}, Lj7/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    iput-object p1, p0, Lj7/a;->p:Ljava/nio/FloatBuffer;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lj7/a;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
        0x0
        0x0
        0x0
        0x3f800000    # 1.0f
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method private final a(I)Ljava/nio/FloatBuffer;
    .locals 1

    mul-int/lit8 p1, p1, 0x4

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-static {}, Ljava/nio/ByteOrder;->nativeOrder()Ljava/nio/ByteOrder;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;

    move-result-object p1

    const-string/jumbo v0, "asFloatBuffer(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final b()V
    .locals 12

    iget v0, p0, Lj7/a;->f:I

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v0, 0x2801

    const/16 v2, 0x2601

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    const/16 v0, 0x2800

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glTexParameteri(III)V

    iget v7, p0, Lj7/a;->k:I

    iget-object v0, p0, Lj7/a;->n:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    const-string/jumbo v0, "textureBuffer"

    invoke-static {v0}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    move-object v11, v0

    const/16 v3, 0xde1

    const/4 v4, 0x0

    const/16 v5, 0x1908

    const/4 v8, 0x0

    const/16 v9, 0x1908

    const/16 v10, 0x1401

    move v6, v7

    invoke-static/range {v3 .. v11}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    const/4 v0, 0x0

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    return-void
.end method

.method private final d(I)I
    .locals 3

    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    return p1
.end method

.method private final f()V
    .locals 13

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/16 v1, 0x302

    const/16 v2, 0x303

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3}, Landroid/opengl/GLES20;->glBlendFuncSeparate(IIII)V

    iget v1, p0, Lj7/a;->h:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    const v1, 0x84c0

    invoke-static {v1}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    const/16 v1, 0xde1

    iget v2, p0, Lj7/a;->f:I

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v1, p0, Lj7/a;->e:I

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glUniform1i(II)V

    iget-object v1, p0, Lj7/a;->p:Ljava/nio/FloatBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v4, p0, Lj7/a;->g:I

    const/4 v8, 0x0

    iget-object v9, p0, Lj7/a;->p:Ljava/nio/FloatBuffer;

    const/4 v5, 0x2

    const/16 v6, 0x1406

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v1, p0, Lj7/a;->g:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget-object v1, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    const/4 v4, 0x0

    const-string/jumbo v5, "vertexBuffer"

    if-nez v1, :cond_0

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v4

    :cond_0
    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v1, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v4

    :cond_1
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v1, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v1, v4

    :cond_3
    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    div-int/lit8 v1, v1, 0x3

    iget-object v6, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v6, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v6, v4

    :cond_4
    invoke-virtual {v6, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v7, p0, Lj7/a;->d:I

    iget-object v6, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v6, :cond_5

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v12, v4

    goto :goto_0

    :cond_5
    move-object v12, v6

    :goto_0
    const/4 v8, 0x3

    const/16 v9, 0x1406

    const/4 v10, 0x0

    const/16 v11, 0xc

    invoke-static/range {v7 .. v12}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Lj7/a;->d:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Lj7/a;->c:I

    iget-object v5, p0, Lj7/a;->a:Lm7/e;

    invoke-virtual {v5}, Lm7/e;->c()[F

    move-result-object v5

    invoke-static {v4, v3, v2, v5, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 v3, 0x4

    invoke-static {v3, v2, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v1, p0, Lj7/a;->d:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    return-void
.end method

.method private final h(Ll7/a;)I
    .locals 3

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object v0

    invoke-virtual {v0}, LW7/d;->b()I

    move-result v0

    iget v1, p0, Lj7/a;->k:I

    div-int/lit8 v2, v1, 0x2

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object p1

    invoke-virtual {p1}, LW7/d;->a()I

    move-result p1

    iget v1, p0, Lj7/a;->k:I

    div-int/lit8 v1, v1, 0x2

    add-int/2addr p1, v1

    add-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x4

    if-ltz v0, :cond_0

    iget p1, p0, Lj7/a;->l:I

    add-int/lit8 p1, p1, -0x4

    if-ge v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method private final j()V
    .locals 4

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lj7/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object v0

    iput-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    const/4 v1, 0x0

    const-string/jumbo v2, "vertexBuffer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_2
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_3

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_3
    iget v3, p0, Lj7/a;->j:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_4
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_5

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_5
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_6

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_6
    iget v3, p0, Lj7/a;->j:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_7

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_7
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_8
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_9
    iget v3, p0, Lj7/a;->j:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_a
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_b

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_b
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_c

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_c
    iget v3, p0, Lj7/a;->j:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_d

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_d
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_e

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_e
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_f

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_f
    iget v3, p0, Lj7/a;->j:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_10

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_10
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->right:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_11

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v0, v1

    :cond_11
    iget-object v3, p0, Lj7/a;->i:Landroid/graphics/RectF;

    iget v3, v3, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v0, v3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lj7/a;->m:Ljava/nio/FloatBuffer;

    if-nez v0, :cond_12

    invoke-static {v2}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_0

    :cond_12
    move-object v1, v0

    :goto_0
    iget v0, p0, Lj7/a;->j:F

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget v0, p0, Lj7/a;->l:I

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lj7/a;->n:Ljava/nio/ByteBuffer;

    return-void
.end method

.method private final k()V
    .locals 9

    iget-object v0, p0, Lj7/a;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string/jumbo v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj7/a$b;

    instance-of v2, v1, Lj7/a$b$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-direct {p0}, Lj7/a;->j()V

    iget-object v1, p0, Lj7/a;->o:Landroid/graphics/Rect;

    iput v3, v1, Landroid/graphics/Rect;->left:I

    iput v3, v1, Landroid/graphics/Rect;->right:I

    iput v3, v1, Landroid/graphics/Rect;->top:I

    iput v3, v1, Landroid/graphics/Rect;->bottom:I

    goto/16 :goto_4

    :cond_0
    instance-of v2, v1, Lj7/a$b$b;

    if-eqz v2, :cond_a

    check-cast v1, Lj7/a$b$b;

    invoke-virtual {v1}, Lj7/a$b$b;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    const-string/jumbo v5, "textureBuffer"

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll7/a;

    invoke-interface {v2}, Ll7/a;->b()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-direct {p0, v2}, Lj7/a;->h(Ll7/a;)I

    move-result v7

    const/4 v8, -0x1

    if-eq v7, v8, :cond_4

    iget-object v8, p0, Lj7/a;->n:Ljava/nio/ByteBuffer;

    if-nez v8, :cond_2

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    move-object v8, v4

    :cond_2
    invoke-virtual {v8, v7}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v7, p0, Lj7/a;->n:Ljava/nio/ByteBuffer;

    if-nez v7, :cond_3

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    move-object v4, v7

    :goto_2
    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-direct {p0, v5}, Lj7/a;->d(I)I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    :cond_4
    iget-object v4, p0, Lj7/a;->o:Landroid/graphics/Rect;

    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->a()I

    move-result v5

    iget v6, v4, Landroid/graphics/Rect;->left:I

    if-ge v5, v6, :cond_5

    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->a()I

    move-result v5

    iput v5, v4, Landroid/graphics/Rect;->left:I

    :cond_5
    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->a()I

    move-result v5

    iget v6, v4, Landroid/graphics/Rect;->right:I

    if-le v5, v6, :cond_6

    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->a()I

    move-result v5

    iput v5, v4, Landroid/graphics/Rect;->right:I

    :cond_6
    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->b()I

    move-result v5

    iget v6, v4, Landroid/graphics/Rect;->top:I

    if-le v5, v6, :cond_7

    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->b()I

    move-result v5

    iput v5, v4, Landroid/graphics/Rect;->top:I

    :cond_7
    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v5

    invoke-virtual {v5}, LW7/d;->b()I

    move-result v5

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    if-ge v5, v6, :cond_1

    invoke-interface {v2}, Ll7/i;->c()LW7/d;

    move-result-object v2

    invoke-virtual {v2}, LW7/d;->b()I

    move-result v2

    iput v2, v4, Landroid/graphics/Rect;->bottom:I

    goto/16 :goto_1

    :cond_8
    iget-object v1, p0, Lj7/a;->n:Ljava/nio/ByteBuffer;

    if-nez v1, :cond_9

    invoke-static {v5}, Lkotlin/jvm/internal/s;->v(Ljava/lang/String;)V

    goto :goto_3

    :cond_9
    move-object v4, v1

    :goto_3
    invoke-virtual {v4, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto/16 :goto_0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    invoke-direct {p0}, Lj7/a;->b()V

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    iget-object v0, p0, Lj7/a;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->clear()V

    iget-object v0, p0, Lj7/a;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    sget-object v1, Lj7/a$b$a;->a:Lj7/a$b$a;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public e()V
    .locals 0

    invoke-direct {p0}, Lj7/a;->k()V

    invoke-direct {p0}, Lj7/a;->f()V

    return-void
.end method

.method public g()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lj7/a;->o:Landroid/graphics/Rect;

    return-object v0
.end method

.method public i()V
    .locals 7

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Lj7/a;->h:I

    const-string/jumbo v1, "a_Position"

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    sget-object v4, Lg7/d;->a:Lg7/d;

    iget-object v5, p0, Lj7/a;->b:Landroid/content/Context;

    sget v6, Lh7/k;->f:I

    invoke-virtual {v4, v5, v6}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x8b31

    invoke-virtual {v4, v6, v5}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v5

    invoke-static {v0, v5}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lj7/a;->h:I

    iget-object v5, p0, Lj7/a;->b:Landroid/content/Context;

    sget v6, Lh7/k;->e:I

    invoke-virtual {v4, v5, v6}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x8b30

    invoke-virtual {v4, v6, v5}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v4

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lj7/a;->h:I

    invoke-static {v0, v3, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Lj7/a;->h:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    new-array v0, v2, [I

    iget v4, p0, Lj7/a;->h:I

    const v5, 0x8b82

    invoke-static {v4, v5, v0, v3}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, v0, v3

    if-nez v0, :cond_0

    iget v0, p0, Lj7/a;->h:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v3, p0, Lj7/a;->h:I

    :cond_0
    iget v0, p0, Lj7/a;->h:I

    if-eqz v0, :cond_1

    const-string/jumbo v4, "u_MVPMatrix"

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lj7/a;->c:I

    iget v0, p0, Lj7/a;->h:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lj7/a;->d:I

    iget v0, p0, Lj7/a;->h:I

    const-string/jumbo v1, "u_Texture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lj7/a;->e:I

    iget v0, p0, Lj7/a;->h:I

    const-string/jumbo v1, "a_TexCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lj7/a;->g:I

    new-array v0, v2, [I

    invoke-static {v2, v0, v3}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    aget v0, v0, v3

    iput v0, p0, Lj7/a;->f:I

    invoke-direct {p0}, Lj7/a;->j()V

    invoke-direct {p0}, Lj7/a;->b()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Error creating program."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final l(Ljava/util/List;)V
    .locals 2

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj7/a;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lj7/a$b$b;

    invoke-direct {v1, p1}, Lj7/a$b$b;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
