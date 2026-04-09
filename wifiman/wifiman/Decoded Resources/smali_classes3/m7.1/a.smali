.class public abstract Lm7/a;
.super Lm7/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm7/a$a;,
        Lm7/a$b;
    }
.end annotation


# static fields
.field public static final u:Lm7/a$a;


# instance fields
.field private final b:[F

.field private final c:[F

.field private final d:[F

.field private final e:[F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:I

.field private k:I

.field private final l:I

.field private m:F

.field private n:F

.field private o:F

.field private p:J

.field private q:J

.field private r:J

.field private s:F

.field private t:Lm7/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lm7/a;->u:Lm7/a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lm7/e;-><init>()V

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lm7/a;->b:[F

    new-array v1, v0, [F

    iput-object v1, p0, Lm7/a;->c:[F

    new-array v1, v0, [F

    iput-object v1, p0, Lm7/a;->d:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lm7/a;->e:[F

    const/high16 v0, 0x41a00000    # 20.0f

    iput v0, p0, Lm7/a;->f:F

    const/4 v0, -0x1

    iput v0, p0, Lm7/a;->j:I

    iput v0, p0, Lm7/a;->k:I

    const/16 v0, 0x1e

    iput v0, p0, Lm7/a;->l:I

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lm7/a;->p:J

    const-wide/16 v0, 0x1f4

    iput-wide v0, p0, Lm7/a;->q:J

    return-void
.end method

.method private final G()V
    .locals 11

    invoke-virtual {p0}, Lm7/a;->e()[F

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x40b00000    # 5.5f

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/high16 v7, 0x40a00000    # 5.0f

    const/4 v8, 0x0

    const/high16 v9, -0x40800000    # -1.0f

    const/4 v10, 0x0

    invoke-static/range {v0 .. v10}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    return-void
.end method

.method private final H()V
    .locals 12

    invoke-virtual {p0}, Lm7/a;->c()[F

    move-result-object v0

    invoke-virtual {p0}, Lm7/a;->e()[F

    move-result-object v2

    invoke-virtual {p0}, Lm7/a;->q()[F

    move-result-object v4

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    invoke-virtual {p0}, Lm7/a;->c()[F

    move-result-object v6

    invoke-virtual {p0}, Lm7/a;->d()[F

    move-result-object v8

    invoke-virtual {p0}, Lm7/a;->c()[F

    move-result-object v10

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method private final I()V
    .locals 8

    invoke-virtual {p0}, Lm7/a;->q()[F

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    invoke-virtual {p0}, Lm7/a;->q()[F

    move-result-object v2

    invoke-virtual {p0}, Lm7/a;->h()F

    move-result v0

    neg-float v4, v0

    const/4 v6, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    invoke-virtual {p0}, Lm7/a;->q()[F

    move-result-object v0

    invoke-virtual {p0}, Lm7/a;->f()F

    move-result v2

    neg-float v2, v2

    invoke-virtual {p0}, Lm7/a;->g()F

    move-result v3

    neg-float v3, v3

    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    return-void
.end method

.method private final J()V
    .locals 13

    iget v0, p0, Lm7/a;->k:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lm7/a;->r()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    iget v1, p0, Lm7/a;->j:I

    int-to-float v1, v1

    iget v2, p0, Lm7/a;->k:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    neg-float v2, v1

    mul-float/2addr v2, v0

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v4

    mul-float v7, v2, v4

    mul-float/2addr v1, v0

    div-float/2addr v1, v3

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v2

    mul-float v8, v1, v2

    neg-float v1, v0

    div-float/2addr v1, v3

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v2

    mul-float v9, v1, v2

    div-float/2addr v0, v3

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v1

    mul-float v10, v0, v1

    invoke-virtual {p0}, Lm7/a;->d()[F

    move-result-object v5

    const/4 v6, 0x0

    const/high16 v11, 0x40a00000    # 5.0f

    const/high16 v12, 0x41200000    # 10.0f

    invoke-static/range {v5 .. v12}, Landroid/opengl/Matrix;->frustumM([FIFFFFFF)V

    return-void
.end method

.method public static synthetic j(Lm7/a;FFFJILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    iget-wide p4, p0, Lm7/a;->q:J

    :cond_0
    move-wide v4, p4

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Lm7/a;->i(FFFJ)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string/jumbo p1, "Super calls with default arguments not supported in this target, function: animatedViewportChange"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final k()V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v0, v0, v1}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    return-void
.end method

.method private final m(Landroid/graphics/Rect;)I
    .locals 2

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int p1, v0, p1

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private final n(Landroid/graphics/Rect;)I
    .locals 2

    iget v0, p1, Landroid/graphics/Rect;->top:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int p1, v0, p1

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr p1, v1

    invoke-static {p1}, Loh/b;->e(F)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private final o(Landroid/graphics/Rect;)I
    .locals 1

    iget v0, p1, Landroid/graphics/Rect;->top:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v0, p1

    return v0
.end method

.method private final p(Landroid/graphics/Rect;)I
    .locals 1

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, p1

    return v0
.end method

.method private final s()Z
    .locals 4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lm7/a;->p:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final u(Lm7/a$b;)V
    .locals 4

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {p0, v0}, Lm7/a;->m(Landroid/graphics/Rect;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lm7/a;->C(F)V

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {p0, v0}, Lm7/a;->n(Landroid/graphics/Rect;)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lm7/a;->D(F)V

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {p0, v0}, Lm7/a;->p(Landroid/graphics/Rect;)I

    move-result v0

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {p0, v1}, Lm7/a;->o(Landroid/graphics/Rect;)I

    move-result v1

    invoke-virtual {p1}, Lm7/a$b;->b()I

    move-result v2

    invoke-virtual {p1}, Lm7/a$b;->c()I

    move-result v3

    if-le v2, v3, :cond_0

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v2

    invoke-direct {p0, v2}, Lm7/a;->o(Landroid/graphics/Rect;)I

    move-result v2

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v3

    invoke-direct {p0, v3}, Lm7/a;->p(Landroid/graphics/Rect;)I

    move-result v3

    if-lt v2, v3, :cond_1

    :cond_0
    invoke-virtual {p1}, Lm7/a$b;->b()I

    move-result v2

    invoke-virtual {p1}, Lm7/a$b;->c()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v2

    invoke-direct {p0, v2}, Lm7/a;->o(Landroid/graphics/Rect;)I

    move-result v2

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v3

    invoke-direct {p0, v3}, Lm7/a;->p(Landroid/graphics/Rect;)I

    move-result v3

    if-le v2, v3, :cond_2

    :cond_1
    const/high16 v0, 0x42b40000    # 90.0f

    invoke-virtual {p0, v0}, Lm7/a;->E(F)V

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-direct {p0, v0}, Lm7/a;->o(Landroid/graphics/Rect;)I

    move-result v0

    invoke-virtual {p1}, Lm7/a$b;->a()Landroid/graphics/Rect;

    move-result-object v1

    invoke-direct {p0, v1}, Lm7/a;->p(Landroid/graphics/Rect;)I

    move-result v1

    :cond_2
    invoke-virtual {p1}, Lm7/a$b;->c()I

    move-result v2

    invoke-virtual {p1}, Lm7/a$b;->b()I

    move-result p1

    if-ge v2, p1, :cond_3

    int-to-float p1, v0

    iget v0, p0, Lm7/a;->j:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lm7/a;->r()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lm7/a;->F(F)V

    goto :goto_0

    :cond_3
    int-to-float p1, v1

    iget v0, p0, Lm7/a;->k:I

    int-to-float v0, v0

    invoke-virtual {p0}, Lm7/a;->r()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v0, v1

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lm7/a;->F(F)V

    :goto_0
    const/high16 p1, 0x41f00000    # 30.0f

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lm7/a;->F(F)V

    invoke-direct {p0}, Lm7/a;->G()V

    invoke-direct {p0}, Lm7/a;->J()V

    invoke-direct {p0}, Lm7/a;->I()V

    invoke-direct {p0}, Lm7/a;->H()V

    invoke-virtual {p0}, Lm7/a;->v()V

    return-void
.end method

.method private final y()V
    .locals 5

    invoke-direct {p0}, Lm7/a;->s()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lm7/a;->r:J

    iget-wide v2, p0, Lm7/a;->p:J

    sub-long/2addr v2, v0

    long-to-float v0, v2

    iget-wide v1, p0, Lm7/a;->q:J

    long-to-float v1, v1

    div-float/2addr v0, v1

    iput v0, p0, Lm7/a;->s:F

    invoke-virtual {p0}, Lm7/a;->f()F

    move-result v0

    iget v1, p0, Lm7/a;->m:F

    invoke-virtual {p0}, Lm7/a;->f()F

    move-result v2

    sub-float/2addr v1, v2

    const v2, 0x3e99999a    # 0.3f

    mul-float/2addr v1, v2

    iget v3, p0, Lm7/a;->s:F

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lm7/a;->C(F)V

    invoke-virtual {p0}, Lm7/a;->g()F

    move-result v0

    iget v1, p0, Lm7/a;->n:F

    invoke-virtual {p0}, Lm7/a;->g()F

    move-result v3

    sub-float/2addr v1, v3

    mul-float/2addr v1, v2

    iget v3, p0, Lm7/a;->s:F

    mul-float/2addr v1, v3

    add-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lm7/a;->D(F)V

    invoke-virtual {p0}, Lm7/a;->h()F

    move-result v0

    iget v1, p0, Lm7/a;->o:F

    invoke-virtual {p0}, Lm7/a;->h()F

    move-result v3

    sub-float/2addr v1, v3

    const/high16 v3, 0x43340000    # 180.0f

    cmpl-float v4, v1, v3

    if-lez v4, :cond_0

    const/16 v3, -0x168

    int-to-float v3, v3

    add-float/2addr v1, v3

    goto :goto_0

    :cond_0
    const/high16 v4, -0x3ccc0000    # -180.0f

    cmpg-float v4, v1, v4

    if-gez v4, :cond_1

    add-float/2addr v1, v3

    neg-float v1, v1

    :cond_1
    :goto_0
    mul-float/2addr v1, v2

    iget v2, p0, Lm7/a;->s:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    invoke-virtual {p0, v0}, Lm7/a;->E(F)V

    :cond_2
    return-void
.end method


# virtual methods
.method public A(F)V
    .locals 1

    invoke-direct {p0}, Lm7/a;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lm7/a;->o:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lm7/a;->E(F)V

    :goto_0
    return-void
.end method

.method public B(F)V
    .locals 1

    const/high16 v0, 0x40a00000    # 5.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    move-result p1

    const/high16 v0, 0x42c80000    # 100.0f

    invoke-static {v0, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    invoke-virtual {p0, p1}, Lm7/a;->F(F)V

    return-void
.end method

.method public C(F)V
    .locals 0

    iput p1, p0, Lm7/a;->g:F

    return-void
.end method

.method public D(F)V
    .locals 0

    iput p1, p0, Lm7/a;->h:F

    return-void
.end method

.method public E(F)V
    .locals 0

    iput p1, p0, Lm7/a;->i:F

    return-void
.end method

.method protected F(F)V
    .locals 0

    iput p1, p0, Lm7/a;->f:F

    invoke-virtual {p0}, Lm7/a;->x()V

    return-void
.end method

.method public a(F)F
    .locals 1

    invoke-virtual {p0}, Lm7/a;->r()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr p1, v0

    invoke-virtual {p0}, Lm7/a;->t()F

    move-result v0

    mul-float/2addr p1, v0

    return p1
.end method

.method public b(Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 9

    const-string/jumbo v0, "displayVectorPx"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/graphics/PointF;

    iget v1, p1, Landroid/graphics/PointF;->x:F

    invoke-virtual {p0, v1}, Lm7/a;->a(F)F

    move-result v1

    iget p1, p1, Landroid/graphics/PointF;->y:F

    invoke-virtual {p0, p1}, Lm7/a;->a(F)F

    move-result p1

    invoke-direct {v0, v1, p1}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {p0}, Lm7/a;->h()F

    move-result p1

    float-to-double v1, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    iget p1, v0, Landroid/graphics/PointF;->x:F

    float-to-double v3, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    iget p1, v0, Landroid/graphics/PointF;->y:F

    float-to-double v5, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    mul-double/2addr v5, v7

    sub-double/2addr v3, v5

    double-to-float p1, v3

    iget v3, v0, Landroid/graphics/PointF;->x:F

    float-to-double v3, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    mul-double/2addr v3, v5

    iget v0, v0, Landroid/graphics/PointF;->y:F

    float-to-double v5, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v0

    mul-double/2addr v5, v0

    add-double/2addr v3, v5

    double-to-float v0, v3

    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, p1, v0}, Landroid/graphics/PointF;-><init>(FF)V

    return-object v1
.end method

.method public c()[F
    .locals 1

    iget-object v0, p0, Lm7/a;->e:[F

    return-object v0
.end method

.method public d()[F
    .locals 1

    iget-object v0, p0, Lm7/a;->d:[F

    return-object v0
.end method

.method public e()[F
    .locals 1

    iget-object v0, p0, Lm7/a;->c:[F

    return-object v0
.end method

.method public f()F
    .locals 1

    iget v0, p0, Lm7/a;->g:F

    return v0
.end method

.method public g()F
    .locals 1

    iget v0, p0, Lm7/a;->h:F

    return v0
.end method

.method public h()F
    .locals 1

    iget v0, p0, Lm7/a;->i:F

    return v0
.end method

.method public final i(FFFJ)V
    .locals 0

    iput p1, p0, Lm7/a;->m:F

    iput p2, p0, Lm7/a;->n:F

    iput p3, p0, Lm7/a;->o:F

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    add-long/2addr p1, p4

    iput-wide p1, p0, Lm7/a;->p:J

    return-void
.end method

.method public l(IILandroid/graphics/Rect;)Landroid/graphics/Bitmap;
    .locals 2

    const-string/jumbo v0, "contentRect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXg/a;

    invoke-direct {v0, p1, p2}, LXg/a;-><init>(II)V

    new-instance v1, Lm7/a$b;

    invoke-direct {v1, p1, p2, p3}, Lm7/a$b;-><init>(IILandroid/graphics/Rect;)V

    iput-object v1, p0, Lm7/a;->t:Lm7/a$b;

    invoke-virtual {v0, p0}, LXg/a;->d(Landroid/opengl/GLSurfaceView$Renderer;)V

    invoke-virtual {v0}, LXg/a;->c()Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 p2, 0x0

    iput-object p2, p0, Lm7/a;->t:Lm7/a$b;

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    return-object p1
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 0

    iget-object p1, p0, Lm7/a;->t:Lm7/a$b;

    if-eqz p1, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lm7/a;->u(Lm7/a$b;)V

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lm7/a;->y()V

    invoke-direct {p0}, Lm7/a;->G()V

    invoke-direct {p0}, Lm7/a;->J()V

    invoke-direct {p0}, Lm7/a;->I()V

    invoke-direct {p0}, Lm7/a;->H()V

    invoke-virtual {p0}, Lm7/a;->w()V

    :goto_0
    return-void
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 0

    iput p2, p0, Lm7/a;->j:I

    iput p3, p0, Lm7/a;->k:I

    invoke-direct {p0}, Lm7/a;->J()V

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    invoke-direct {p0}, Lm7/a;->k()V

    invoke-direct {p0}, Lm7/a;->G()V

    return-void
.end method

.method public q()[F
    .locals 1

    iget-object v0, p0, Lm7/a;->b:[F

    return-object v0
.end method

.method public abstract r()I
.end method

.method public t()F
    .locals 1

    iget v0, p0, Lm7/a;->f:F

    return v0
.end method

.method protected abstract v()V
.end method

.method protected w()V
    .locals 0

    return-void
.end method

.method protected x()V
    .locals 0

    return-void
.end method

.method public z(FF)V
    .locals 1

    invoke-direct {p0}, Lm7/a;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iput p1, p0, Lm7/a;->m:F

    iput p2, p0, Lm7/a;->n:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lm7/a;->C(F)V

    invoke-virtual {p0, p2}, Lm7/a;->D(F)V

    :goto_0
    return-void
.end method
