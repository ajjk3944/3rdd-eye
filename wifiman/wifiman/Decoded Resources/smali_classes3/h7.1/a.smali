.class public final Lh7/a;
.super Lm7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/a$a;,
        Lh7/a$b;
    }
.end annotation


# static fields
.field public static final E:Lh7/a$a;


# instance fields
.field private final A:Ll7/b;

.field private final B:I

.field private final C:Lj7/a;

.field private final D:Lk7/f;

.field private final v:Landroid/content/Context;

.field private final w:Lh7/a$b;

.field private final x:I

.field private final y:I

.field private final z:Ll7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lh7/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lh7/a;->E:Lh7/a$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lh7/a$b;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm7/a;-><init>()V

    iput-object p1, p0, Lh7/a;->v:Landroid/content/Context;

    iput-object p2, p0, Lh7/a;->w:Lh7/a$b;

    invoke-virtual {p2}, Lh7/a$b;->a()I

    move-result v0

    invoke-virtual {p0, v0}, Lh7/a;->L(I)I

    move-result v0

    iput v0, p0, Lh7/a;->x:I

    invoke-virtual {p2}, Lh7/a$b;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lh7/a;->L(I)I

    move-result v0

    iput v0, p0, Lh7/a;->y:I

    new-instance v0, Ll7/f;

    invoke-direct {v0, p0, p1}, Ll7/f;-><init>(Lm7/e;Landroid/content/Context;)V

    iput-object v0, p0, Lh7/a;->z:Ll7/f;

    new-instance v0, Ll7/b;

    invoke-direct {v0, p0, p1}, Ll7/b;-><init>(Lm7/e;Landroid/content/Context;)V

    iput-object v0, p0, Lh7/a;->A:Ll7/b;

    invoke-virtual {p2}, Lh7/a$b;->b()I

    move-result v0

    invoke-virtual {p2}, Lh7/a$b;->a()I

    move-result v1

    div-int/2addr v0, v1

    iput v0, p0, Lh7/a;->B:I

    new-instance v1, Lj7/a;

    invoke-virtual {p2}, Lh7/a$b;->d()I

    move-result p2

    invoke-direct {v1, p0, p1, p2, v0}, Lj7/a;-><init>(Lm7/e;Landroid/content/Context;II)V

    iput-object v1, p0, Lh7/a;->C:Lj7/a;

    new-instance p2, Lk7/f;

    invoke-direct {p2, p0, p1}, Lk7/f;-><init>(Lm7/e;Landroid/content/Context;)V

    iput-object p2, p0, Lh7/a;->D:Lk7/f;

    return-void
.end method

.method private final P()V
    .locals 2

    invoke-virtual {p0}, Lh7/a;->t()F

    move-result v0

    const/high16 v1, 0x41200000    # 10.0f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Ll7/f;->u(F)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    const v1, 0x3f733333    # 0.95f

    invoke-virtual {v0, v1}, Ll7/f;->u(F)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected F(F)V
    .locals 0

    invoke-super {p0, p1}, Lm7/a;->F(F)V

    invoke-direct {p0}, Lh7/a;->P()V

    iget-object p1, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {p1}, Lk7/f;->k()V

    return-void
.end method

.method public K()V
    .locals 1

    iget-object v0, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {v0}, Lj7/a;->c()V

    return-void
.end method

.method public final L(I)I
    .locals 1

    int-to-float p1, p1

    iget-object v0, p0, Lh7/a;->v:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final M(II)Landroid/graphics/Bitmap;
    .locals 7

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    invoke-virtual {v0}, Ll7/f;->m()Landroid/graphics/Rect;

    move-result-object v0

    iget-object v1, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {v1}, Lj7/a;->g()Landroid/graphics/Rect;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, p0, Lh7/a;->B:I

    mul-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iget v2, v1, Landroid/graphics/Rect;->right:I

    mul-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->right:I

    iget v2, v1, Landroid/graphics/Rect;->top:I

    mul-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    mul-int/2addr v2, v3

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    iget-object v2, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {v2}, Lk7/f;->i()Landroid/graphics/Rect;

    move-result-object v2

    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    iget v4, v0, Landroid/graphics/Rect;->left:I

    iget v5, v1, Landroid/graphics/Rect;->left:I

    iget v6, v2, Landroid/graphics/Rect;->left:I

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    iput v4, v3, Landroid/graphics/Rect;->left:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v5, v1, Landroid/graphics/Rect;->right:I

    iget v6, v2, Landroid/graphics/Rect;->right:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v3, Landroid/graphics/Rect;->right:I

    iget v4, v0, Landroid/graphics/Rect;->top:I

    iget v5, v1, Landroid/graphics/Rect;->top:I

    iget v6, v2, Landroid/graphics/Rect;->top:I

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    iput v4, v3, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    invoke-super {p0, p1, p2, v3}, Lm7/a;->l(IILandroid/graphics/Rect;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public final N()I
    .locals 1

    iget v0, p0, Lh7/a;->y:I

    return v0
.end method

.method public final O()Ll7/b;
    .locals 1

    iget-object v0, p0, Lh7/a;->A:Ll7/b;

    return-object v0
.end method

.method public Q(Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {v0, p1}, Lj7/a;->l(Ljava/util/List;)V

    return-void
.end method

.method public R(Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {v0, p1}, Lk7/f;->p(Ljava/util/List;)V

    return-void
.end method

.method public S(Ljava/util/List;)V
    .locals 4

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lh7/a;->z:Ll7/f;

    invoke-virtual {v2, p1}, Ll7/f;->y(Ljava/util/List;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v0, "Update tiles took "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p1, v0, v1, v0}, LZ7/b;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lm7/a;->onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V

    iget-object p1, p0, Lh7/a;->z:Ll7/f;

    invoke-virtual {p1}, Ll7/f;->r()V

    iget-object p1, p0, Lh7/a;->A:Ll7/b;

    invoke-virtual {p1}, Ll7/b;->g()V

    iget-object p1, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {p1}, Lj7/a;->i()V

    iget-object p1, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {p1}, Lk7/f;->j()V

    return-void
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lh7/a;->x:I

    return v0
.end method

.method public t()F
    .locals 1

    invoke-super {p0}, Lm7/a;->t()F

    move-result v0

    return v0
.end method

.method protected v()V
    .locals 3

    const/4 v0, 0x0

    invoke-static {v0, v0, v0, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    const/16 v0, 0x4000

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll7/f;->t(Z)V

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    invoke-virtual {v0}, Ll7/f;->j()V

    const-string v0, "Draw tiles"

    const-string/jumbo v1, "Floorplan"

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {v0}, Lj7/a;->e()V

    const-string v0, "Draw heatmap"

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {v2}, Lk7/f;->g()V

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method protected w()V
    .locals 3

    invoke-super {p0}, Lm7/a;->w()V

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll7/f;->t(Z)V

    iget-object v0, p0, Lh7/a;->z:Ll7/f;

    invoke-virtual {v0}, Ll7/f;->j()V

    const-string v0, "Draw tiles"

    const-string/jumbo v1, "Floorplan"

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/a;->C:Lj7/a;

    invoke-virtual {v0}, Lj7/a;->e()V

    const-string v0, "Draw heatmap"

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lh7/a;->D:Lk7/f;

    invoke-virtual {v2}, Lk7/f;->g()V

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lh7/a;->w:Lh7/a$b;

    invoke-virtual {v0}, Lh7/a$b;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lh7/a;->A:Ll7/b;

    invoke-virtual {p0}, Lh7/a;->t()F

    move-result v2

    invoke-virtual {v0, v2}, Ll7/b;->i(F)V

    iget-object v0, p0, Lh7/a;->A:Ll7/b;

    invoke-virtual {v0}, Ll7/b;->c()V

    :cond_0
    const-string v0, "Draw pointer"

    invoke-static {v1, v0}, Lg7/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
