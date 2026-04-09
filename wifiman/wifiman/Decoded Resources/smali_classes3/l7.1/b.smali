.class public final Ll7/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll7/b$a;
    }
.end annotation


# static fields
.field public static final w:Ll7/b$a;


# instance fields
.field private final a:Lm7/e;

.field private final b:Landroid/content/Context;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:F

.field private j:F

.field private k:F

.field private l:F

.field private m:J

.field private n:F

.field private o:F

.field private p:F

.field private q:F

.field private r:F

.field private s:Ljava/nio/FloatBuffer;

.field private final t:[F

.field private final u:[F

.field private final v:[F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll7/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Ll7/b;->w:Ll7/b$a;

    return-void
.end method

.method public constructor <init>(Lm7/e;Landroid/content/Context;)V
    .locals 2

    const-string/jumbo v0, "mainRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll7/b;->a:Lm7/e;

    iput-object p2, p0, Ll7/b;->b:Landroid/content/Context;

    const/4 p1, -0x1

    iput p1, p0, Ll7/b;->g:I

    const/16 p1, 0x4d

    const/16 p2, 0x98

    const/16 v0, 0xff

    invoke-static {v0, p1, p2, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p1

    iput p1, p0, Ll7/b;->h:I

    const p1, 0x3e99999a    # 0.3f

    iput p1, p0, Ll7/b;->o:F

    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, Ll7/b;->p:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Ll7/b;->q:F

    const/16 p1, 0x501

    invoke-direct {p0, p1}, Ll7/b;->b(I)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 p1, 0x4

    new-array p2, p1, [F

    sget-object v0, Lg7/b;->a:Lg7/b;

    iget v1, p0, Ll7/b;->h:I

    invoke-virtual {v0, v1, p2}, Lg7/b;->a(I[F)V

    iput-object p2, p0, Ll7/b;->t:[F

    new-array p2, p1, [F

    iget v1, p0, Ll7/b;->g:I

    invoke-virtual {v0, v1, p2}, Lg7/b;->a(I[F)V

    iput-object p2, p0, Ll7/b;->u:[F

    new-array p1, p1, [F

    const/4 p2, 0x0

    const/16 v1, 0xcc

    invoke-static {p2, v1, v1, v1}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    invoke-virtual {v0, p2, p1}, Lg7/b;->a(I[F)V

    iput-object p1, p0, Ll7/b;->v:[F

    return-void
.end method

.method private final a(FFF[F)V
    .locals 2

    iget-object v0, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    iget v1, p0, Ll7/b;->i:F

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    iget v0, p0, Ll7/b;->j:F

    add-float/2addr v0, p2

    invoke-virtual {p1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, p3}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object p1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {p1, p4}, Ljava/nio/FloatBuffer;->put([F)Ljava/nio/FloatBuffer;

    return-void
.end method

.method private final b(I)Ljava/nio/FloatBuffer;
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

.method private final l()V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ll7/b;->m:J

    sub-long/2addr v0, v2

    long-to-float v0, v0

    const/high16 v1, 0x43fa0000    # 500.0f

    div-float/2addr v0, v1

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-eqz v1, :cond_0

    iget v1, p0, Ll7/b;->i:F

    iget v2, p0, Ll7/b;->k:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Ll7/b;->i:F

    iget v1, p0, Ll7/b;->j:F

    iget v2, p0, Ll7/b;->l:F

    sub-float/2addr v2, v1

    mul-float/2addr v2, v0

    add-float/2addr v1, v2

    iput v1, p0, Ll7/b;->j:F

    goto :goto_0

    :cond_0
    iget v0, p0, Ll7/b;->k:F

    iput v0, p0, Ll7/b;->i:F

    iget v0, p0, Ll7/b;->l:F

    iput v0, p0, Ll7/b;->j:F

    :goto_0
    return-void
.end method

.method private final m()V
    .locals 19

    move-object/from16 v0, p0

    invoke-direct/range {p0 .. p0}, Ll7/b;->l()V

    iget-object v1, v0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v1, v0, Ll7/b;->r:F

    float-to-double v3, v1

    const/16 v1, 0x5a

    int-to-double v5, v1

    sub-double/2addr v3, v5

    const/16 v1, 0x26

    int-to-double v7, v1

    sub-double/2addr v3, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    iget v1, v0, Ll7/b;->r:F

    float-to-double v9, v1

    sub-double/2addr v9, v5

    add-double/2addr v9, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v7

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    iget v1, v0, Ll7/b;->p:F

    float-to-double v11, v1

    mul-double/2addr v9, v11

    iget v1, v0, Ll7/b;->q:F

    float-to-double v11, v1

    mul-double/2addr v9, v11

    double-to-float v1, v9

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    iget v9, v0, Ll7/b;->p:F

    float-to-double v9, v9

    mul-double/2addr v3, v9

    iget v9, v0, Ll7/b;->q:F

    float-to-double v9, v9

    mul-double/2addr v3, v9

    double-to-float v3, v3

    iget v4, v0, Ll7/b;->n:F

    iget-object v9, v0, Ll7/b;->v:[F

    invoke-direct {v0, v1, v3, v4, v9}, Ll7/b;->a(FFF[F)V

    invoke-static {v7, v8}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    iget v1, v0, Ll7/b;->p:F

    float-to-double v9, v1

    mul-double/2addr v3, v9

    iget v1, v0, Ll7/b;->q:F

    float-to-double v9, v1

    mul-double/2addr v3, v9

    double-to-float v1, v3

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    iget v7, v0, Ll7/b;->p:F

    float-to-double v7, v7

    mul-double/2addr v3, v7

    iget v7, v0, Ll7/b;->q:F

    float-to-double v7, v7

    mul-double/2addr v3, v7

    double-to-float v3, v3

    iget v4, v0, Ll7/b;->n:F

    iget-object v7, v0, Ll7/b;->v:[F

    invoke-direct {v0, v1, v3, v4, v7}, Ll7/b;->a(FFF[F)V

    iget v1, v0, Ll7/b;->n:F

    iget-object v3, v0, Ll7/b;->u:[F

    const/4 v4, 0x0

    invoke-direct {v0, v4, v4, v1, v3}, Ll7/b;->a(FFF[F)V

    move v1, v2

    :goto_0
    const/high16 v3, 0x43700000    # 240.0f

    const/high16 v4, 0x42f00000    # 120.0f

    const/16 v7, 0x168

    const/16 v8, 0x1e

    if-ge v1, v8, :cond_0

    int-to-double v8, v1

    div-double/2addr v8, v5

    int-to-double v10, v7

    mul-double/2addr v8, v10

    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    float-to-double v12, v4

    add-double/2addr v12, v8

    invoke-static {v12, v13}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v12

    float-to-double v3, v3

    add-double/2addr v8, v3

    invoke-static {v8, v9}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v3

    invoke-static {v10, v11}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    iget v9, v0, Ll7/b;->o:F

    float-to-double v14, v9

    mul-double/2addr v7, v14

    iget v9, v0, Ll7/b;->q:F

    float-to-double v14, v9

    mul-double/2addr v7, v14

    double-to-float v7, v7

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    iget v10, v0, Ll7/b;->o:F

    float-to-double v10, v10

    mul-double/2addr v8, v10

    iget v10, v0, Ll7/b;->q:F

    float-to-double v10, v10

    mul-double/2addr v8, v10

    double-to-float v8, v8

    iget v9, v0, Ll7/b;->n:F

    iget-object v10, v0, Ll7/b;->u:[F

    invoke-direct {v0, v7, v8, v9, v10}, Ll7/b;->a(FFF[F)V

    invoke-static {v12, v13}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    iget v9, v0, Ll7/b;->o:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    iget v9, v0, Ll7/b;->q:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    double-to-float v7, v7

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v8

    iget v10, v0, Ll7/b;->o:F

    float-to-double v10, v10

    mul-double/2addr v8, v10

    iget v10, v0, Ll7/b;->q:F

    float-to-double v10, v10

    mul-double/2addr v8, v10

    double-to-float v8, v8

    iget v9, v0, Ll7/b;->n:F

    iget-object v10, v0, Ll7/b;->u:[F

    invoke-direct {v0, v7, v8, v9, v10}, Ll7/b;->a(FFF[F)V

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v7

    iget v9, v0, Ll7/b;->o:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    iget v9, v0, Ll7/b;->q:F

    float-to-double v9, v9

    mul-double/2addr v7, v9

    double-to-float v7, v7

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    iget v8, v0, Ll7/b;->o:F

    float-to-double v8, v8

    mul-double/2addr v3, v8

    iget v8, v0, Ll7/b;->q:F

    float-to-double v8, v8

    mul-double/2addr v3, v8

    double-to-float v3, v3

    iget v4, v0, Ll7/b;->n:F

    iget-object v8, v0, Ll7/b;->u:[F

    invoke-direct {v0, v7, v3, v4, v8}, Ll7/b;->a(FFF[F)V

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_0
    iget v1, v0, Ll7/b;->o:F

    const v9, 0x3f59999a    # 0.85f

    mul-float/2addr v1, v9

    :goto_1
    if-ge v2, v8, :cond_1

    int-to-double v9, v2

    div-double/2addr v9, v5

    int-to-double v11, v7

    mul-double/2addr v9, v11

    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v11

    float-to-double v13, v4

    add-double/2addr v13, v9

    invoke-static {v13, v14}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v13

    move-wide v15, v5

    float-to-double v4, v3

    add-double/2addr v9, v4

    invoke-static {v9, v10}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v4

    invoke-static {v11, v12}, Ljava/lang/Math;->cos(D)D

    move-result-wide v9

    float-to-double v6, v1

    mul-double/2addr v9, v6

    iget v3, v0, Ll7/b;->q:F

    move/from16 v17, v1

    move/from16 v18, v2

    float-to-double v1, v3

    mul-double/2addr v9, v1

    double-to-float v1, v9

    invoke-static {v11, v12}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v6

    iget v9, v0, Ll7/b;->q:F

    float-to-double v9, v9

    mul-double/2addr v2, v9

    double-to-float v2, v2

    iget v3, v0, Ll7/b;->n:F

    iget-object v9, v0, Ll7/b;->t:[F

    invoke-direct {v0, v1, v2, v3, v9}, Ll7/b;->a(FFF[F)V

    invoke-static {v13, v14}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    mul-double/2addr v1, v6

    iget v3, v0, Ll7/b;->q:F

    float-to-double v9, v3

    mul-double/2addr v1, v9

    double-to-float v1, v1

    invoke-static {v13, v14}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v6

    iget v9, v0, Ll7/b;->q:F

    float-to-double v9, v9

    mul-double/2addr v2, v9

    double-to-float v2, v2

    iget v3, v0, Ll7/b;->n:F

    iget-object v9, v0, Ll7/b;->t:[F

    invoke-direct {v0, v1, v2, v3, v9}, Ll7/b;->a(FFF[F)V

    invoke-static {v4, v5}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    mul-double/2addr v1, v6

    iget v3, v0, Ll7/b;->q:F

    float-to-double v9, v3

    mul-double/2addr v1, v9

    double-to-float v1, v1

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v2

    mul-double/2addr v2, v6

    iget v4, v0, Ll7/b;->q:F

    float-to-double v4, v4

    mul-double/2addr v2, v4

    double-to-float v2, v2

    iget v3, v0, Ll7/b;->n:F

    iget-object v4, v0, Ll7/b;->t:[F

    invoke-direct {v0, v1, v2, v3, v4}, Ll7/b;->a(FFF[F)V

    add-int/lit8 v2, v18, 0x1

    move-wide v5, v15

    move/from16 v1, v17

    const/high16 v3, 0x43700000    # 240.0f

    const/high16 v4, 0x42f00000    # 120.0f

    const/16 v7, 0x168

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public c()V
    .locals 12

    invoke-direct {p0}, Ll7/b;->m()V

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/16 v1, 0x302

    const/16 v2, 0x303

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3}, Landroid/opengl/GLES20;->glBlendFuncSeparate(IIII)V

    iget v1, p0, Ll7/b;->f:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget-object v1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    div-int/lit8 v1, v1, 0x7

    iget-object v4, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    invoke-virtual {v4, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v5, p0, Ll7/b;->d:I

    const/16 v9, 0x1c

    iget-object v10, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 v6, 0x3

    const/16 v7, 0x1406

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Ll7/b;->d:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget-object v4, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 v5, 0x3

    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v6, p0, Ll7/b;->e:I

    const/16 v10, 0x1c

    iget-object v11, p0, Ll7/b;->s:Ljava/nio/FloatBuffer;

    const/4 v7, 0x4

    const/16 v8, 0x1406

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Ll7/b;->e:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v4, p0, Ll7/b;->c:I

    iget-object v5, p0, Ll7/b;->a:Lm7/e;

    invoke-virtual {v5}, Lm7/e;->c()[F

    move-result-object v5

    invoke-static {v4, v3, v2, v5, v2}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 v3, 0x4

    invoke-static {v3, v2, v1}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v1, p0, Ll7/b;->d:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    iget v1, p0, Ll7/b;->e:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    return-void
.end method

.method public final d()F
    .locals 1

    iget v0, p0, Ll7/b;->k:F

    return v0
.end method

.method public final e()F
    .locals 1

    iget v0, p0, Ll7/b;->l:F

    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Ll7/b;->r:F

    return v0
.end method

.method public g()V
    .locals 6

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Ll7/b;->f:I

    const-string/jumbo v1, "a_Color"

    const-string/jumbo v2, "a_Position"

    if-eqz v0, :cond_0

    sget-object v3, Lg7/d;->a:Lg7/d;

    iget-object v4, p0, Ll7/b;->b:Landroid/content/Context;

    sget v5, Lh7/k;->d:I

    invoke-virtual {v3, v4, v5}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x8b31

    invoke-virtual {v3, v5, v4}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v4

    invoke-static {v0, v4}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Ll7/b;->f:I

    iget-object v4, p0, Ll7/b;->b:Landroid/content/Context;

    sget v5, Lh7/k;->c:I

    invoke-virtual {v3, v4, v5}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x8b30

    invoke-virtual {v3, v5, v4}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Ll7/b;->f:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v2}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Ll7/b;->f:I

    const/4 v4, 0x1

    invoke-static {v0, v4, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Ll7/b;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    new-array v0, v4, [I

    iget v4, p0, Ll7/b;->f:I

    const v5, 0x8b82

    invoke-static {v4, v5, v0, v3}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, v0, v3

    if-nez v0, :cond_0

    iget v0, p0, Ll7/b;->f:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v3, p0, Ll7/b;->f:I

    :cond_0
    iget v0, p0, Ll7/b;->f:I

    if-eqz v0, :cond_1

    const-string/jumbo v3, "u_MVPMatrix"

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/b;->c:I

    iget v0, p0, Ll7/b;->f:I

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/b;->d:I

    iget v0, p0, Ll7/b;->f:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Ll7/b;->e:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Error creating program."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final h(FFZ)V
    .locals 0

    iput p1, p0, Ll7/b;->k:F

    iput p2, p0, Ll7/b;->l:F

    if-eqz p3, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Ll7/b;->m:J

    :cond_0
    return-void
.end method

.method public final i(F)V
    .locals 0

    iput p1, p0, Ll7/b;->q:F

    return-void
.end method

.method public final j(F)V
    .locals 0

    iput p1, p0, Ll7/b;->r:F

    return-void
.end method

.method public final k(F)V
    .locals 0

    iput p1, p0, Ll7/b;->p:F

    return-void
.end method
