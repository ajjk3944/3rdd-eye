.class final Lk7/f$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private a:Lk7/a;

.field private final b:Lk7/f$c;

.field private final c:Ljava/nio/FloatBuffer;

.field final synthetic d:Lk7/f;


# direct methods
.method public constructor <init>(Lk7/f;Lk7/a;Lk7/f$c;)V
    .locals 1

    const-string/jumbo v0, "obj"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "texture"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lk7/f$b;->d:Lk7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lk7/f$b;->a:Lk7/a;

    iput-object p3, p0, Lk7/f$b;->b:Lk7/f$c;

    const/16 p2, 0x12

    invoke-static {p1, p2}, Lk7/f;->c(Lk7/f;I)Ljava/nio/FloatBuffer;

    move-result-object p1

    iput-object p1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    return-void
.end method

.method private final f(Lk7/a;Lg7/e$a;)Landroid/graphics/RectF;
    .locals 6

    invoke-virtual {p2}, Lg7/e$a;->b()I

    move-result v0

    invoke-virtual {p2}, Lg7/e$a;->c()I

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    if-le v0, v1, :cond_0

    invoke-virtual {p2}, Lg7/e$a;->c()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Lg7/e$a;->b()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr v0, p2

    sub-float p2, v2, v0

    sub-float p2, v2, p2

    move v5, v2

    move v2, p2

    move p2, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lg7/e$a;->b()I

    move-result v0

    invoke-virtual {p2}, Lg7/e$a;->c()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p2}, Lg7/e$a;->b()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p2}, Lg7/e$a;->c()I

    move-result p2

    int-to-float p2, p2

    div-float/2addr v0, p2

    sub-float p2, v2, v0

    sub-float p2, v2, p2

    goto :goto_0

    :cond_1
    move p2, v2

    :goto_0
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iget-object v1, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v1}, Lk7/f;->e(Lk7/f;)Lm7/e;

    move-result-object v1

    invoke-interface {p1}, Lk7/a;->e()Lk7/a$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v3}, Lk7/a$a;->a()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v1, v3}, Lm7/e;->a(F)F

    move-result v1

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object v3

    invoke-virtual {v3}, LW7/d;->a()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v2, v1

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    sub-float/2addr v3, v2

    iput v3, v0, Landroid/graphics/RectF;->left:F

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object v3

    invoke-virtual {v3}, LW7/d;->b()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v1, p2

    div-float/2addr v1, v4

    sub-float/2addr v3, v1

    iput v3, v0, Landroid/graphics/RectF;->top:F

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object p2

    invoke-virtual {p2}, LW7/d;->a()I

    move-result p2

    int-to-float p2, p2

    add-float/2addr p2, v2

    iput p2, v0, Landroid/graphics/RectF;->right:F

    invoke-interface {p1}, Ll7/i;->c()LW7/d;

    move-result-object p1

    invoke-virtual {p1}, LW7/d;->b()I

    move-result p1

    int-to-float p1, p1

    add-float/2addr p1, v1

    iput p1, v0, Landroid/graphics/RectF;->bottom:F

    return-object v0
.end method


# virtual methods
.method public final a()Lk7/a;
    .locals 1

    iget-object v0, p0, Lk7/f$b;->a:Lk7/a;

    return-object v0
.end method

.method public final b()Landroid/graphics/RectF;
    .locals 2

    iget-object v0, p0, Lk7/f$b;->a:Lk7/a;

    iget-object v1, p0, Lk7/f$b;->b:Lk7/f$c;

    invoke-virtual {v1}, Lk7/f$c;->c()Lg7/e$a;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lk7/f$b;->f(Lk7/a;Lg7/e$a;)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public final c()Lk7/f$c;
    .locals 1

    iget-object v0, p0, Lk7/f$b;->b:Lk7/f$c;

    return-object v0
.end method

.method public final d()Ljava/nio/FloatBuffer;
    .locals 1

    iget-object v0, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    return-object v0
.end method

.method public final e()V
    .locals 3

    invoke-virtual {p0}, Lk7/f$b;->b()Landroid/graphics/RectF;

    move-result-object v0

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v2}, Lk7/f;->f(Lk7/f;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v2}, Lk7/f;->f(Lk7/f;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v2}, Lk7/f;->f(Lk7/f;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v2}, Lk7/f;->f(Lk7/f;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v2, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v2}, Lk7/f;->f(Lk7/f;)F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v2, v0, Landroid/graphics/RectF;->right:F

    invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {v1, v0}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    iget-object v0, p0, Lk7/f$b;->c:Ljava/nio/FloatBuffer;

    iget-object v1, p0, Lk7/f$b;->d:Lk7/f;

    invoke-static {v1}, Lk7/f;->f(Lk7/f;)F

    move-result v1

    invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;

    return-void
.end method
