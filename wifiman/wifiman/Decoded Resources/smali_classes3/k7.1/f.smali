.class public final Lk7/f;
.super Lg7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/f$a;,
        Lk7/f$b;,
        Lk7/f$c;,
        Lk7/f$d;
    }
.end annotation


# static fields
.field public static final s:Lk7/f$a;


# instance fields
.field private final b:Lm7/e;

.field private final c:Landroid/content/Context;

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private final i:[F

.field private final j:[F

.field private final k:[F

.field private final l:[F

.field private m:F

.field private n:Z

.field private o:Ljava/util/HashMap;

.field private p:Ljava/util/HashMap;

.field private q:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field private final r:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk7/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk7/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lk7/f;->s:Lk7/f$a;

    return-void
.end method

.method public constructor <init>(Lm7/e;Landroid/content/Context;)V
    .locals 1

    const-string/jumbo v0, "mainRenderer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lg7/a;-><init>()V

    iput-object p1, p0, Lk7/f;->b:Lm7/e;

    iput-object p2, p0, Lk7/f;->c:Landroid/content/Context;

    const/16 p1, 0x10

    new-array p2, p1, [F

    iput-object p2, p0, Lk7/f;->i:[F

    new-array p2, p1, [F

    iput-object p2, p0, Lk7/f;->j:[F

    new-array p2, p1, [F

    iput-object p2, p0, Lk7/f;->k:[F

    new-array p1, p1, [F

    iput-object p1, p0, Lk7/f;->l:[F

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk7/f;->o:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lk7/f;->p:Ljava/util/HashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lk7/f;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lk7/f;->r:Landroid/graphics/Rect;

    return-void
.end method

.method public static final synthetic c(Lk7/f;I)Ljava/nio/FloatBuffer;
    .locals 0

    invoke-virtual {p0, p1}, Lg7/a;->a(I)Ljava/nio/FloatBuffer;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lk7/f;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lk7/f;->c:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lk7/f;)Lm7/e;
    .locals 0

    iget-object p0, p0, Lk7/f;->b:Lm7/e;

    return-object p0
.end method

.method public static final synthetic f(Lk7/f;)F
    .locals 0

    iget p0, p0, Lk7/f;->m:F

    return p0
.end method

.method private final h()V
    .locals 13

    const/16 v0, 0xbe2

    invoke-static {v0}, Landroid/opengl/GLES20;->glEnable(I)V

    const/16 v1, 0x302

    const/16 v2, 0x303

    const/4 v3, 0x1

    invoke-static {v1, v2, v3, v3}, Landroid/opengl/GLES20;->glBlendFuncSeparate(IIII)V

    iget v1, p0, Lk7/f;->h:I

    invoke-static {v1}, Landroid/opengl/GLES20;->glUseProgram(I)V

    iget-object v1, p0, Lk7/f;->p:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk7/f$b;

    invoke-direct {p0, v2}, Lk7/f;->n(Lk7/f$b;)V

    const v4, 0x84c0

    invoke-static {v4}, Landroid/opengl/GLES20;->glActiveTexture(I)V

    invoke-virtual {v2}, Lk7/f$b;->c()Lk7/f$c;

    move-result-object v4

    invoke-virtual {v4}, Lk7/f$c;->c()Lg7/e$a;

    move-result-object v4

    invoke-virtual {v4}, Lg7/e$a;->a()I

    move-result v4

    const/16 v5, 0xde1

    invoke-static {v5, v4}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget v4, p0, Lk7/f;->f:I

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroid/opengl/GLES20;->glUniform1i(II)V

    invoke-virtual {v2}, Lk7/f$b;->c()Lk7/f$c;

    move-result-object v4

    invoke-virtual {v4}, Lk7/f$c;->a()Ljava/nio/FloatBuffer;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v6, p0, Lk7/f;->g:I

    invoke-virtual {v2}, Lk7/f$b;->c()Lk7/f$c;

    move-result-object v4

    invoke-virtual {v4}, Lk7/f$c;->a()Ljava/nio/FloatBuffer;

    move-result-object v11

    const/4 v7, 0x2

    const/16 v8, 0x1406

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v4, p0, Lk7/f;->g:I

    invoke-static {v4}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    invoke-virtual {v2}, Lk7/f$b;->d()Ljava/nio/FloatBuffer;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {v2}, Lk7/f$b;->d()Ljava/nio/FloatBuffer;

    move-result-object v4

    invoke-virtual {v4}, Ljava/nio/Buffer;->remaining()I

    move-result v4

    div-int/lit8 v4, v4, 0x3

    invoke-virtual {v2}, Lk7/f$b;->d()Ljava/nio/FloatBuffer;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;

    iget v7, p0, Lk7/f;->e:I

    const/16 v11, 0xc

    invoke-virtual {v2}, Lk7/f$b;->d()Ljava/nio/FloatBuffer;

    move-result-object v12

    const/4 v8, 0x3

    const/16 v9, 0x1406

    invoke-static/range {v7 .. v12}, Landroid/opengl/GLES20;->glVertexAttribPointer(IIIZILjava/nio/Buffer;)V

    iget v2, p0, Lk7/f;->e:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    iget v2, p0, Lk7/f;->d:I

    iget-object v6, p0, Lk7/f;->j:[F

    invoke-static {v2, v3, v5, v6, v5}, Landroid/opengl/GLES20;->glUniformMatrix4fv(IIZ[FI)V

    const/4 v2, 0x4

    invoke-static {v2, v5, v4}, Landroid/opengl/GLES20;->glDrawArrays(III)V

    iget v2, p0, Lk7/f;->e:I

    invoke-static {v2}, Landroid/opengl/GLES20;->glDisableVertexAttribArray(I)V

    goto/16 :goto_0

    :cond_0
    invoke-static {v0}, Landroid/opengl/GLES20;->glDisable(I)V

    return-void
.end method

.method private final l()V
    .locals 3

    iget-object v0, p0, Lk7/f;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-string/jumbo v1, "iterator(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk7/f$d;

    instance-of v2, v1, Lk7/f$d$a;

    if-eqz v2, :cond_1

    check-cast v1, Lk7/f$d$a;

    invoke-virtual {v1}, Lk7/f$d$a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk7/a;

    invoke-direct {p0, v2}, Lk7/f;->o(Lk7/a;)V

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2
    return-void
.end method

.method private final m()V
    .locals 2

    iget-boolean v0, p0, Lk7/f;->n:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lk7/f;->p:Ljava/util/HashMap;

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

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk7/f$b;

    invoke-virtual {v1}, Lk7/f$b;->a()Lk7/a;

    move-result-object v1

    invoke-direct {p0, v1}, Lk7/f;->o(Lk7/a;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lk7/f;->n:Z

    return-void
.end method

.method private final n(Lk7/f$b;)V
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lk7/f;->i:[F

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    invoke-virtual/range {p1 .. p1}, Lk7/f$b;->a()Lk7/a;

    move-result-object v1

    invoke-interface {v1}, Ll7/i;->c()LW7/d;

    move-result-object v1

    invoke-virtual {v1}, LW7/d;->a()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p1 .. p1}, Lk7/f$b;->a()Lk7/a;

    move-result-object v3

    invoke-interface {v3}, Ll7/i;->c()LW7/d;

    move-result-object v3

    invoke-virtual {v3}, LW7/d;->b()I

    move-result v3

    int-to-float v3, v3

    iget-object v4, v0, Lk7/f;->k:[F

    invoke-static {v4, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v4, v0, Lk7/f;->k:[F

    const/4 v5, 0x0

    invoke-static {v4, v2, v1, v3, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v6, v0, Lk7/f;->k:[F

    iget-object v4, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v4}, Lm7/e;->h()F

    move-result v8

    const/4 v10, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    iget-object v4, v0, Lk7/f;->k:[F

    neg-float v1, v1

    neg-float v3, v3

    invoke-static {v4, v2, v1, v3, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v1, v0, Lk7/f;->l:[F

    invoke-static {v1, v2}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v6, v0, Lk7/f;->l:[F

    iget-object v1, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v1}, Lm7/e;->h()F

    move-result v1

    neg-float v8, v1

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    iget-object v1, v0, Lk7/f;->l:[F

    iget-object v3, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v3}, Lm7/e;->f()F

    move-result v3

    neg-float v3, v3

    iget-object v4, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v4}, Lm7/e;->g()F

    move-result v4

    neg-float v4, v4

    invoke-static {v1, v2, v3, v4, v5}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v6, v0, Lk7/f;->i:[F

    iget-object v8, v0, Lk7/f;->l:[F

    iget-object v10, v0, Lk7/f;->k:[F

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v12, v0, Lk7/f;->j:[F

    iget-object v1, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v1}, Lm7/e;->e()[F

    move-result-object v14

    iget-object v1, v0, Lk7/f;->i:[F

    const/16 v17, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v12 .. v17}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v2, v0, Lk7/f;->j:[F

    iget-object v1, v0, Lk7/f;->b:Lm7/e;

    invoke-virtual {v1}, Lm7/e;->d()[F

    move-result-object v4

    iget-object v6, v0, Lk7/f;->j:[F

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method private final o(Lk7/a;)V
    .locals 5

    invoke-interface {p1}, Lk7/a;->e()Lk7/a$a;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {p1}, Lk7/a;->e()Lk7/a$a;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v0}, Lk7/a$a;->b()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "txt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lk7/f;->o:Ljava/util/HashMap;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Lk7/f$c;

    invoke-interface {p1}, Lk7/a;->e()Lk7/a$a;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v3}, Lk7/a$a;->b()I

    move-result v3

    invoke-interface {p1}, Lk7/a;->e()Lk7/a$a;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-interface {v4}, Lk7/a$a;->a()I

    move-result v4

    invoke-direct {v2, p0, v0, v3, v4}, Lk7/f$c;-><init>(Lk7/f;Ljava/lang/String;II)V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, Lk7/f$c;

    iget-object v0, p0, Lk7/f;->p:Ljava/util/HashMap;

    invoke-interface {p1}, Lk7/a;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    new-instance v3, Lk7/f$b;

    invoke-direct {v3, p0, p1, v2}, Lk7/f$b;-><init>(Lk7/f;Lk7/a;Lk7/f$c;)V

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v3, Lk7/f$b;

    invoke-virtual {v3}, Lk7/f$b;->e()V

    iget-object p1, p0, Lk7/f;->r:Landroid/graphics/Rect;

    invoke-virtual {v3}, Lk7/f$b;->b()Landroid/graphics/RectF;

    move-result-object v0

    iget v1, v0, Landroid/graphics/RectF;->left:F

    iget v2, p1, Landroid/graphics/Rect;->left:I

    int-to-float v2, v2

    cmpg-float v2, v1, v2

    if-gez v2, :cond_2

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    :cond_2
    iget v1, v0, Landroid/graphics/RectF;->right:F

    iget v2, p1, Landroid/graphics/Rect;->right:I

    int-to-float v2, v2

    cmpl-float v2, v1, v2

    if-lez v2, :cond_3

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->right:I

    :cond_3
    iget v1, v0, Landroid/graphics/RectF;->top:F

    iget v2, p1, Landroid/graphics/Rect;->top:I

    int-to-float v2, v2

    cmpl-float v2, v1, v2

    if-lez v2, :cond_4

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v1

    iput v1, p1, Landroid/graphics/Rect;->top:I

    :cond_4
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    int-to-float v1, v1

    cmpg-float v1, v0, v1

    if-gez v1, :cond_6

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lk7/f;->p:Ljava/util/HashMap;

    invoke-interface {p1}, Lk7/a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_0
    return-void
.end method


# virtual methods
.method public g()V
    .locals 0

    invoke-direct {p0}, Lk7/f;->l()V

    invoke-direct {p0}, Lk7/f;->m()V

    invoke-direct {p0}, Lk7/f;->h()V

    return-void
.end method

.method public i()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lk7/f;->r:Landroid/graphics/Rect;

    return-object v0
.end method

.method public j()V
    .locals 5

    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, Lk7/f;->h:I

    const-string/jumbo v1, "a_Position"

    if-eqz v0, :cond_0

    sget-object v2, Lg7/d;->a:Lg7/d;

    iget-object v3, p0, Lk7/f;->c:Landroid/content/Context;

    sget v4, Lh7/k;->f:I

    invoke-virtual {v2, v3, v4}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x8b31

    invoke-virtual {v2, v4, v3}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v3

    invoke-static {v0, v3}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lk7/f;->h:I

    iget-object v3, p0, Lk7/f;->c:Landroid/content/Context;

    sget v4, Lh7/k;->e:I

    invoke-virtual {v2, v3, v4}, Lg7/d;->b(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x8b30

    invoke-virtual {v2, v4, v3}, Lg7/d;->a(ILjava/lang/String;)I

    move-result v2

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    iget v0, p0, Lk7/f;->h:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Landroid/opengl/GLES20;->glBindAttribLocation(IILjava/lang/String;)V

    iget v0, p0, Lk7/f;->h:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 v0, 0x1

    new-array v0, v0, [I

    iget v3, p0, Lk7/f;->h:I

    const v4, 0x8b82

    invoke-static {v3, v4, v0, v2}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    aget v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lk7/f;->h:I

    invoke-static {v0}, Landroid/opengl/GLES20;->glDeleteProgram(I)V

    iput v2, p0, Lk7/f;->h:I

    :cond_0
    iget v0, p0, Lk7/f;->h:I

    if-eqz v0, :cond_1

    const-string/jumbo v2, "u_MVPMatrix"

    invoke-static {v0, v2}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lk7/f;->d:I

    iget v0, p0, Lk7/f;->h:I

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lk7/f;->e:I

    iget v0, p0, Lk7/f;->h:I

    const-string/jumbo v1, "u_Texture"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lk7/f;->f:I

    iget v0, p0, Lk7/f;->h:I

    const-string/jumbo v1, "a_TexCoordinate"

    invoke-static {v0, v1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    move-result v0

    iput v0, p0, Lk7/f;->g:I

    return-void

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    const-string/jumbo v1, "Error creating program."

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk7/f;->n:Z

    return-void
.end method

.method public final p(Ljava/util/List;)V
    .locals 2

    const-string/jumbo v0, "tiles"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lk7/f;->q:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lk7/f$d$a;

    invoke-direct {v1, p1}, Lk7/f$d$a;-><init>(Ljava/util/List;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method
