.class public final Lp0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/f$a;
    }
.end annotation


# static fields
.field public static final F:Lp0/f$a;

.field private static G:Z

.field private static final H:Ljava/util/concurrent/atomic/AtomicBoolean;


# instance fields
.field private A:F

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private final b:J

.field private final c:Lm0/o0;

.field private final d:Lo0/a;

.field private final e:Landroid/view/RenderNode;

.field private f:J

.field private g:Landroid/graphics/Paint;

.field private h:Landroid/graphics/Matrix;

.field private i:Z

.field private j:J

.field private k:I

.field private l:I

.field private m:Lm0/w0;

.field private n:F

.field private o:Z

.field private p:J

.field private q:F

.field private r:F

.field private s:F

.field private t:F

.field private u:F

.field private v:J

.field private w:J

.field private x:F

.field private y:F

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp0/f;->F:Lp0/f$a;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lp0/f;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;JLm0/o0;Lo0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p2, p0, Lp0/f;->b:J

    .line 3
    iput-object p4, p0, Lp0/f;->c:Lm0/o0;

    .line 4
    iput-object p5, p0, Lp0/f;->d:Lo0/a;

    .line 5
    const-string p2, "Compose"

    invoke-static {p2, p1}, Landroid/view/RenderNode;->create(Ljava/lang/String;Landroid/view/View;)Landroid/view/RenderNode;

    move-result-object p1

    iput-object p1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    .line 6
    sget-object p2, LY0/r;->b:LY0/r$a;

    invoke-virtual {p2}, LY0/r$a;->a()J

    move-result-wide p3

    iput-wide p3, p0, Lp0/f;->f:J

    .line 7
    invoke-virtual {p2}, LY0/r$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/f;->j:J

    .line 8
    sget-object p2, Lp0/f;->H:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 9
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleX(F)Z

    .line 10
    invoke-virtual {p1}, Landroid/view/RenderNode;->getScaleY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setScaleY(F)Z

    .line 11
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationX(F)Z

    .line 12
    invoke-virtual {p1}, Landroid/view/RenderNode;->getTranslationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setTranslationY(F)Z

    .line 13
    invoke-virtual {p1}, Landroid/view/RenderNode;->getElevation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setElevation(F)Z

    .line 14
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotation()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotation(F)Z

    .line 15
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationX(F)Z

    .line 16
    invoke-virtual {p1}, Landroid/view/RenderNode;->getRotationY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setRotationY(F)Z

    .line 17
    invoke-virtual {p1}, Landroid/view/RenderNode;->getCameraDistance()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    .line 18
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotX()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    .line 19
    invoke-virtual {p1}, Landroid/view/RenderNode;->getPivotY()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    .line 20
    invoke-virtual {p1}, Landroid/view/RenderNode;->getClipToOutline()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    .line 21
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 22
    invoke-virtual {p1}, Landroid/view/RenderNode;->getAlpha()F

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setAlpha(F)Z

    .line 23
    invoke-virtual {p1}, Landroid/view/RenderNode;->isValid()Z

    .line 24
    invoke-virtual {p1, p3, p3, p3, p3}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    .line 25
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetLeftAndRight(I)Z

    .line 26
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->offsetTopAndBottom(I)Z

    .line 27
    invoke-direct {p0, p1}, Lp0/f;->U(Landroid/view/RenderNode;)V

    .line 28
    invoke-virtual {p0}, Lp0/f;->Q()V

    .line 29
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setLayerType(I)Z

    .line 30
    invoke-virtual {p1}, Landroid/view/RenderNode;->hasOverlappingRendering()Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    .line 31
    :cond_0
    sget-boolean p2, Lp0/f;->G:Z

    if-nez p2, :cond_1

    .line 32
    invoke-virtual {p1, p3}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    .line 33
    sget-object p1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {p1}, Lp0/b$a;->a()I

    move-result p2

    invoke-direct {p0, p2}, Lp0/f;->P(I)V

    .line 34
    invoke-virtual {p1}, Lp0/b$a;->a()I

    move-result p1

    iput p1, p0, Lp0/f;->k:I

    .line 35
    sget-object p1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {p1}, Lm0/d0$a;->B()I

    move-result p1

    iput p1, p0, Lp0/f;->l:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 36
    iput p1, p0, Lp0/f;->n:F

    .line 37
    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->b()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/f;->p:J

    .line 38
    iput p1, p0, Lp0/f;->q:F

    .line 39
    iput p1, p0, Lp0/f;->r:F

    .line 40
    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/f;->v:J

    .line 41
    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/f;->w:J

    const/high16 p1, 0x41000000    # 8.0f

    .line 42
    iput p1, p0, Lp0/f;->A:F

    const/4 p1, 0x1

    .line 43
    iput-boolean p1, p0, Lp0/f;->E:Z

    return-void

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/NoClassDefFoundError;

    invoke-direct {p1}, Ljava/lang/NoClassDefFoundError;-><init>()V

    throw p1
.end method

.method public synthetic constructor <init>(Landroid/view/View;JLm0/o0;Lo0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 45
    new-instance p4, Lm0/o0;

    invoke-direct {p4}, Lm0/o0;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    .line 46
    new-instance p5, Lo0/a;

    invoke-direct {p5}, Lo0/a;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    .line 47
    invoke-direct/range {v0 .. v5}, Lp0/f;-><init>(Landroid/view/View;JLm0/o0;Lo0/a;)V

    return-void
.end method

.method private final O()V
    .locals 4

    invoke-virtual {p0}, Lp0/f;->R()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lp0/f;->i:Z

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lp0/f;->R()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-boolean v3, p0, Lp0/f;->i:Z

    if-eqz v3, :cond_1

    move v1, v2

    :cond_1
    iget-boolean v2, p0, Lp0/f;->C:Z

    if-eq v0, v2, :cond_2

    iput-boolean v0, p0, Lp0/f;->C:Z

    iget-object v2, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v2, v0}, Landroid/view/RenderNode;->setClipToBounds(Z)Z

    :cond_2
    iget-boolean v0, p0, Lp0/f;->D:Z

    if-eq v1, v0, :cond_3

    iput-boolean v1, p0, Lp0/f;->D:Z

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setClipToOutline(Z)Z

    :cond_3
    return-void
.end method

.method private final P(I)V
    .locals 4

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v2

    invoke-static {p1, v2}, Lp0/b;->e(II)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    const/4 p1, 0x2

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Lp0/f;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp0/b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lp0/b;->e(II)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Lp0/f;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setLayerType(I)Z

    iget-object p1, p0, Lp0/f;->g:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setLayerPaint(Landroid/graphics/Paint;)Z

    invoke-virtual {v0, v3}, Landroid/view/RenderNode;->setHasOverlappingRendering(Z)Z

    :goto_0
    return-void
.end method

.method private final S()Z
    .locals 2

    invoke-virtual {p0}, Lp0/f;->x()I

    move-result v0

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lp0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp0/f;->r()I

    move-result v0

    sget-object v1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v1}, Lm0/d0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lm0/d0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lp0/f;->p()Lm0/w0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private final T()V
    .locals 1

    invoke-direct {p0}, Lp0/f;->S()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v0}, Lp0/b$a;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lp0/f;->P(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp0/f;->x()I

    move-result v0

    invoke-direct {p0, v0}, Lp0/f;->P(I)V

    :goto_0
    return-void
.end method

.method private final U(Landroid/view/RenderNode;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    sget-object v0, Lp0/P;->a:Lp0/P;

    invoke-virtual {v0, p1}, Lp0/P;->a(Landroid/view/RenderNode;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lp0/P;->c(Landroid/view/RenderNode;I)V

    invoke-virtual {v0, p1}, Lp0/P;->b(Landroid/view/RenderNode;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lp0/P;->d(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public A()J
    .locals 2

    iget-wide v0, p0, Lp0/f;->v:J

    return-wide v0
.end method

.method public B()J
    .locals 2

    iget-wide v0, p0, Lp0/f;->w:J

    return-wide v0
.end method

.method public C()F
    .locals 1

    iget v0, p0, Lp0/f;->t:F

    return v0
.end method

.method public D(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lp0/f;->v:J

    sget-object v0, Lp0/P;->a:Lp0/P;

    iget-object v1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lp0/P;->c(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public E()F
    .locals 1

    iget v0, p0, Lp0/f;->A:F

    return v0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Lp0/f;->s:F

    return v0
.end method

.method public G(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/f;->B:Z

    invoke-direct {p0}, Lp0/f;->O()V

    return-void
.end method

.method public H()F
    .locals 1

    iget v0, p0, Lp0/f;->x:F

    return v0
.end method

.method public I(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lp0/f;->w:J

    sget-object v0, Lp0/P;->a:Lp0/P;

    iget-object v1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lp0/P;->d(Landroid/view/RenderNode;I)V

    :cond_0
    return-void
.end method

.method public J(LY0/d;LY0/t;Lp0/c;Lmh/l;)V
    .locals 16

    move-object/from16 v1, p0

    iget-object v0, v1, Lp0/f;->e:Landroid/view/RenderNode;

    iget-wide v2, v1, Lp0/f;->f:J

    invoke-static {v2, v3}, LY0/r;->g(J)I

    move-result v2

    iget-wide v3, v1, Lp0/f;->j:J

    invoke-static {v3, v4}, LY0/r;->g(J)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget-wide v3, v1, Lp0/f;->f:J

    invoke-static {v3, v4}, LY0/r;->f(J)I

    move-result v3

    iget-wide v4, v1, Lp0/f;->j:J

    invoke-static {v4, v5}, LY0/r;->f(J)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Landroid/view/RenderNode;->start(II)Landroid/view/DisplayListCanvas;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, Lp0/f;->c:Lm0/o0;

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    invoke-virtual {v3}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v3

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v4

    move-object v5, v2

    check-cast v5, Landroid/graphics/Canvas;

    invoke-virtual {v4, v5}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v4

    iget-object v5, v1, Lp0/f;->d:Lo0/a;

    iget-wide v6, v1, Lp0/f;->f:J

    invoke-static {v6, v7}, LY0/s;->d(J)J

    move-result-wide v6

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v8

    invoke-interface {v8}, Lo0/d;->getDensity()LY0/d;

    move-result-object v8

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v9

    invoke-interface {v9}, Lo0/d;->getLayoutDirection()LY0/t;

    move-result-object v9

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v10

    invoke-interface {v10}, Lo0/d;->d()Lm0/n0;

    move-result-object v10

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v11

    invoke-interface {v11}, Lo0/d;->c()J

    move-result-wide v11

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v13

    invoke-interface {v13}, Lo0/d;->g()Lp0/c;

    move-result-object v13

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v14

    move-object/from16 v15, p1

    invoke-interface {v14, v15}, Lo0/d;->a(LY0/d;)V

    move-object/from16 v15, p2

    invoke-interface {v14, v15}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v14, v4}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v14, v6, v7}, Lo0/d;->f(J)V

    move-object/from16 v6, p3

    invoke-interface {v14, v6}, Lo0/d;->h(Lp0/c;)V

    invoke-interface {v4}, Lm0/n0;->j()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v6, p4

    :try_start_1
    invoke-interface {v6, v5}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {v4}, Lm0/n0;->r()V

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v4

    invoke-interface {v4, v8}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v4, v9}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v4, v10}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v4, v11, v12}, Lo0/d;->f(J)V

    invoke-interface {v4, v13}, Lo0/d;->h(Lp0/c;)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v0

    invoke-virtual {v0, v3}, Lm0/G;->z(Landroid/graphics/Canvas;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, v1, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lp0/f;->s(Z)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_3
    invoke-interface {v4}, Lm0/n0;->r()V

    invoke-interface {v5}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0, v8}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v0, v9}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v0, v10}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v0, v11, v12}, Lo0/d;->f(J)V

    invoke-interface {v0, v13}, Lo0/d;->h(Lp0/c;)V

    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    iget-object v3, v1, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v3, v2}, Landroid/view/RenderNode;->end(Landroid/view/DisplayListCanvas;)V

    throw v0
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lp0/f;->r:F

    return v0
.end method

.method public L(I)V
    .locals 0

    iput p1, p0, Lp0/f;->k:I

    invoke-direct {p0}, Lp0/f;->T()V

    return-void
.end method

.method public M()Landroid/graphics/Matrix;
    .locals 2

    iget-object v0, p0, Lp0/f;->h:Landroid/graphics/Matrix;

    if-nez v0, :cond_0

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lp0/f;->h:Landroid/graphics/Matrix;

    :cond_0
    iget-object v1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v1, v0}, Landroid/view/RenderNode;->getMatrix(Landroid/graphics/Matrix;)V

    return-object v0
.end method

.method public N()F
    .locals 1

    iget v0, p0, Lp0/f;->u:F

    return v0
.end method

.method public final Q()V
    .locals 2

    sget-object v0, Lp0/O;->a:Lp0/O;

    iget-object v1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, v1}, Lp0/O;->a(Landroid/view/RenderNode;)V

    return-void
.end method

.method public R()Z
    .locals 1

    iget-boolean v0, p0, Lp0/f;->B:Z

    return v0
.end method

.method public a(F)V
    .locals 1

    iput p1, p0, Lp0/f;->n:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setAlpha(F)Z

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lp0/f;->n:F

    return v0
.end method

.method public c(Lm0/n0;)V
    .locals 1

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.view.DisplayListCanvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/DisplayListCanvas;

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {p1, v0}, Landroid/view/DisplayListCanvas;->drawRenderNode(Landroid/view/RenderNode;)V

    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lp0/f;->y:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationY(F)Z

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lp0/f;->z:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotation(F)Z

    return-void
.end method

.method public f(F)V
    .locals 1

    iput p1, p0, Lp0/f;->t:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationY(F)Z

    return-void
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lp0/f;->r:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleY(F)Z

    return-void
.end method

.method public h()V
    .locals 0

    invoke-virtual {p0}, Lp0/f;->Q()V

    return-void
.end method

.method public i(F)V
    .locals 1

    iput p1, p0, Lp0/f;->q:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setScaleX(F)Z

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lp0/f;->s:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setTranslationX(F)Z

    return-void
.end method

.method public k(Lm0/d1;)V
    .locals 0

    return-void
.end method

.method public l(F)V
    .locals 1

    iput p1, p0, Lp0/f;->A:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    neg-float p1, p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setCameraDistance(F)Z

    return-void
.end method

.method public m(F)V
    .locals 1

    iput p1, p0, Lp0/f;->x:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setRotationX(F)Z

    return-void
.end method

.method public n()F
    .locals 1

    iget v0, p0, Lp0/f;->q:F

    return v0
.end method

.method public o(F)V
    .locals 1

    iput p1, p0, Lp0/f;->u:F

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setElevation(F)Z

    return-void
.end method

.method public p()Lm0/w0;
    .locals 1

    iget-object v0, p0, Lp0/f;->m:Lm0/w0;

    return-object v0
.end method

.method public q()Z
    .locals 1

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {v0}, Landroid/view/RenderNode;->isValid()Z

    move-result v0

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lp0/f;->l:I

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/f;->E:Z

    return-void
.end method

.method public t()Lm0/d1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lp0/f;->y:F

    return v0
.end method

.method public v(Landroid/graphics/Outline;J)V
    .locals 0

    iput-wide p2, p0, Lp0/f;->j:J

    iget-object p2, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-virtual {p2, p1}, Landroid/view/RenderNode;->setOutline(Landroid/graphics/Outline;)Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lp0/f;->i:Z

    invoke-direct {p0}, Lp0/f;->O()V

    return-void
.end method

.method public w()F
    .locals 1

    iget v0, p0, Lp0/f;->z:F

    return v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lp0/f;->k:I

    return v0
.end method

.method public y(IIJ)V
    .locals 3

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/view/RenderNode;->setLeftTopRightBottom(IIII)Z

    iget-wide p1, p0, Lp0/f;->f:J

    invoke-static {p1, p2, p3, p4}, LY0/r;->e(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lp0/f;->o:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    :cond_0
    iput-wide p3, p0, Lp0/f;->f:J

    :cond_1
    return-void
.end method

.method public z(J)V
    .locals 3

    iput-wide p1, p0, Lp0/f;->p:J

    invoke-static {p1, p2}, Ll0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/f;->o:Z

    iget-object p1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    iget-wide v0, p0, Lp0/f;->f:J

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object p1, p0, Lp0/f;->e:Landroid/view/RenderNode;

    iget-wide v1, p0, Lp0/f;->f:J

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/RenderNode;->setPivotY(F)Z

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lp0/f;->o:Z

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/RenderNode;->setPivotX(F)Z

    iget-object v0, p0, Lp0/f;->e:Landroid/view/RenderNode;

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/RenderNode;->setPivotY(F)Z

    :goto_0
    return-void
.end method
