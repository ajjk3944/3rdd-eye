.class public final Lp0/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/E$b;
    }
.end annotation


# static fields
.field public static final J:Lp0/E$b;

.field private static final K:Z

.field private static final L:Landroid/graphics/Canvas;


# instance fields
.field private A:F

.field private B:F

.field private C:F

.field private D:F

.field private E:J

.field private F:J

.field private G:F

.field private H:F

.field private I:F

.field private final b:Lq0/a;

.field private final c:J

.field private final d:Lm0/o0;

.field private final e:Lp0/T;

.field private final f:Landroid/content/res/Resources;

.field private final g:Landroid/graphics/Rect;

.field private h:Landroid/graphics/Paint;

.field private final i:Landroid/graphics/Picture;

.field private final j:Lo0/a;

.field private final k:Lm0/o0;

.field private l:I

.field private m:I

.field private n:J

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private final s:J

.field private t:I

.field private u:Lm0/w0;

.field private v:I

.field private w:F

.field private x:Z

.field private y:J

.field private z:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/E$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/E$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp0/E;->J:Lp0/E$b;

    sget-object v0, Lp0/S;->a:Lp0/S;

    invoke-virtual {v0}, Lp0/S;->a()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lp0/E;->K:Z

    new-instance v0, Lp0/E$a;

    invoke-direct {v0}, Lp0/E$a;-><init>()V

    sput-object v0, Lp0/E;->L:Landroid/graphics/Canvas;

    return-void
.end method

.method public constructor <init>(Lq0/a;JLm0/o0;Lo0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lp0/E;->b:Lq0/a;

    .line 3
    iput-wide p2, p0, Lp0/E;->c:J

    .line 4
    iput-object p4, p0, Lp0/E;->d:Lm0/o0;

    .line 5
    new-instance p2, Lp0/T;

    invoke-direct {p2, p1, p4, p5}, Lp0/T;-><init>(Landroid/view/View;Lm0/o0;Lo0/a;)V

    iput-object p2, p0, Lp0/E;->e:Lp0/T;

    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    iput-object p3, p0, Lp0/E;->f:Landroid/content/res/Resources;

    .line 7
    new-instance p3, Landroid/graphics/Rect;

    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    iput-object p3, p0, Lp0/E;->g:Landroid/graphics/Rect;

    .line 8
    sget-boolean p3, Lp0/E;->K:Z

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    .line 9
    new-instance p5, Landroid/graphics/Picture;

    invoke-direct {p5}, Landroid/graphics/Picture;-><init>()V

    goto :goto_0

    :cond_0
    move-object p5, p4

    .line 10
    :goto_0
    iput-object p5, p0, Lp0/E;->i:Landroid/graphics/Picture;

    if-eqz p3, :cond_1

    .line 11
    new-instance p5, Lo0/a;

    invoke-direct {p5}, Lo0/a;-><init>()V

    goto :goto_1

    :cond_1
    move-object p5, p4

    .line 12
    :goto_1
    iput-object p5, p0, Lp0/E;->j:Lo0/a;

    if-eqz p3, :cond_2

    .line 13
    new-instance p3, Lm0/o0;

    invoke-direct {p3}, Lm0/o0;-><init>()V

    goto :goto_2

    :cond_2
    move-object p3, p4

    .line 14
    :goto_2
    iput-object p3, p0, Lp0/E;->k:Lm0/o0;

    .line 15
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 16
    invoke-virtual {p2, p4}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    .line 17
    sget-object p1, LY0/r;->b:LY0/r$a;

    invoke-virtual {p1}, LY0/r$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/E;->n:J

    const/4 p1, 0x1

    .line 18
    iput-boolean p1, p0, Lp0/E;->p:Z

    .line 19
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result p1

    int-to-long p1, p1

    iput-wide p1, p0, Lp0/E;->s:J

    .line 20
    sget-object p1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {p1}, Lm0/d0$a;->B()I

    move-result p1

    iput p1, p0, Lp0/E;->t:I

    .line 21
    sget-object p1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {p1}, Lp0/b$a;->a()I

    move-result p1

    iput p1, p0, Lp0/E;->v:I

    const/high16 p1, 0x3f800000    # 1.0f

    .line 22
    iput p1, p0, Lp0/E;->w:F

    .line 23
    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/E;->y:J

    .line 24
    iput p1, p0, Lp0/E;->z:F

    .line 25
    iput p1, p0, Lp0/E;->A:F

    .line 26
    sget-object p1, Lm0/v0;->b:Lm0/v0$a;

    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p2

    iput-wide p2, p0, Lp0/E;->E:J

    .line 27
    invoke-virtual {p1}, Lm0/v0$a;->a()J

    move-result-wide p1

    iput-wide p1, p0, Lp0/E;->F:J

    return-void
.end method

.method public synthetic constructor <init>(Lq0/a;JLm0/o0;Lo0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 28
    new-instance p4, Lm0/o0;

    invoke-direct {p4}, Lm0/o0;-><init>()V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x8

    if-eqz p4, :cond_1

    .line 29
    new-instance p5, Lo0/a;

    invoke-direct {p5}, Lo0/a;-><init>()V

    :cond_1
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    .line 30
    invoke-direct/range {v0 .. v5}, Lp0/E;-><init>(Lq0/a;JLm0/o0;Lo0/a;)V

    return-void
.end method

.method private final O(I)V
    .locals 4

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v2

    invoke-static {p1, v2}, Lp0/b;->e(II)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    const/4 v1, 0x2

    iget-object v2, p0, Lp0/E;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp0/b$a;->b()I

    move-result v1

    invoke-static {p1, v1}, Lp0/b;->e(II)Z

    move-result p1

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    iget-object v2, p0, Lp0/E;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    move v3, v1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    iget-object v2, p0, Lp0/E;->h:Landroid/graphics/Paint;

    invoke-virtual {p1, v1, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :goto_0
    invoke-virtual {v0, v3}, Lp0/T;->setCanUseCompositingLayer$ui_graphics_release(Z)V

    return-void
.end method

.method private final Q()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lp0/E;->d:Lm0/o0;

    sget-object v1, Lp0/E;->L:Landroid/graphics/Canvas;

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v2

    invoke-virtual {v2}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    invoke-virtual {v3, v1}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v1

    iget-object v3, p0, Lp0/E;->b:Lq0/a;

    iget-object v4, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v4}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v5

    invoke-virtual {v3, v1, v4, v5, v6}, Lq0/a;->a(Lm0/n0;Landroid/view/View;J)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v0

    invoke-virtual {v0, v2}, Lm0/G;->z(Landroid/graphics/Canvas;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private final R()Z
    .locals 2

    invoke-virtual {p0}, Lp0/E;->x()I

    move-result v0

    sget-object v1, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v1}, Lp0/b$a;->c()I

    move-result v1

    invoke-static {v0, v1}, Lp0/b;->e(II)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lp0/E;->S()Z

    move-result v0

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

.method private final S()Z
    .locals 2

    invoke-virtual {p0}, Lp0/E;->r()I

    move-result v0

    sget-object v1, Lm0/d0;->a:Lm0/d0$a;

    invoke-virtual {v1}, Lm0/d0$a;->B()I

    move-result v1

    invoke-static {v0, v1}, Lm0/d0;->E(II)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lp0/E;->p()Lm0/w0;

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
    .locals 3

    iget-boolean v0, p0, Lp0/E;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {p0}, Lp0/E;->P()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lp0/E;->q:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lp0/E;->g:Landroid/graphics/Rect;

    const/4 v2, 0x0

    iput v2, v1, Landroid/graphics/Rect;->left:I

    iput v2, v1, Landroid/graphics/Rect;->top:I

    iget-object v2, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    move-result v2

    iput v2, v1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    :cond_1
    return-void
.end method

.method private final U()V
    .locals 1

    invoke-direct {p0}, Lp0/E;->R()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lp0/b;->a:Lp0/b$a;

    invoke-virtual {v0}, Lp0/b$a;->c()I

    move-result v0

    invoke-direct {p0, v0}, Lp0/E;->O(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp0/E;->x()I

    move-result v0

    invoke-direct {p0, v0}, Lp0/E;->O(I)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A()J
    .locals 2

    iget-wide v0, p0, Lp0/E;->E:J

    return-wide v0
.end method

.method public B()J
    .locals 2

    iget-wide v0, p0, Lp0/E;->F:J

    return-wide v0
.end method

.method public C()F
    .locals 1

    iget v0, p0, Lp0/E;->C:F

    return v0
.end method

.method public D(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lp0/E;->E:J

    sget-object v0, Lp0/X;->a:Lp0/X;

    iget-object v1, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lp0/X;->b(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public E()F
    .locals 2

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0}, Landroid/view/View;->getCameraDistance()F

    move-result v0

    iget-object v1, p0, Lp0/E;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public F()F
    .locals 1

    iget v0, p0, Lp0/E;->B:F

    return v0
.end method

.method public G(Z)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    iget-boolean v2, p0, Lp0/E;->q:Z

    if-nez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    iput-boolean v2, p0, Lp0/E;->r:Z

    iput-boolean v1, p0, Lp0/E;->o:Z

    iget-object v2, p0, Lp0/E;->e:Lp0/T;

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lp0/E;->q:Z

    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {v2, v0}, Landroid/view/View;->setClipToOutline(Z)V

    return-void
.end method

.method public H()F
    .locals 1

    iget v0, p0, Lp0/E;->G:F

    return v0
.end method

.method public I(J)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    iput-wide p1, p0, Lp0/E;->F:J

    sget-object v0, Lp0/X;->a:Lp0/X;

    iget-object v1, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p1, p2}, Lm0/x0;->j(J)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lp0/X;->c(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public J(LY0/d;LY0/t;Lp0/c;Lmh/l;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    iget-object v4, v1, Lp0/E;->e:Lp0/T;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_0

    iget-object v4, v1, Lp0/E;->b:Lq0/a;

    iget-object v5, v1, Lp0/E;->e:Lp0/T;

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    :cond_0
    iget-object v4, v1, Lp0/E;->e:Lp0/T;

    move-object/from16 v5, p3

    invoke-virtual {v4, v0, v2, v5, v3}, Lp0/T;->b(LY0/d;LY0/t;Lp0/c;Lmh/l;)V

    iget-object v4, v1, Lp0/E;->e:Lp0/T;

    invoke-virtual {v4}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v1, Lp0/E;->e:Lp0/T;

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    iget-object v4, v1, Lp0/E;->e:Lp0/T;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-direct/range {p0 .. p0}, Lp0/E;->Q()V

    iget-object v4, v1, Lp0/E;->i:Landroid/graphics/Picture;

    if-eqz v4, :cond_3

    iget-wide v5, v1, Lp0/E;->n:J

    invoke-static {v5, v6}, LY0/r;->g(J)I

    move-result v5

    iget-wide v6, v1, Lp0/E;->n:J

    invoke-static {v6, v7}, LY0/r;->f(J)I

    move-result v6

    invoke-virtual {v4, v5, v6}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v5

    :try_start_0
    iget-object v6, v1, Lp0/E;->k:Lm0/o0;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lm0/o0;->a()Lm0/G;

    move-result-object v7

    invoke-virtual {v7}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v7

    invoke-virtual {v6}, Lm0/o0;->a()Lm0/G;

    move-result-object v8

    invoke-virtual {v8, v5}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v6}, Lm0/o0;->a()Lm0/G;

    move-result-object v5

    iget-object v8, v1, Lp0/E;->j:Lo0/a;

    if-eqz v8, :cond_1

    iget-wide v9, v1, Lp0/E;->n:J

    invoke-static {v9, v10}, LY0/s;->d(J)J

    move-result-wide v9

    invoke-virtual {v8}, Lo0/a;->B()Lo0/a$a;

    move-result-object v11

    invoke-virtual {v11}, Lo0/a$a;->a()LY0/d;

    move-result-object v12

    invoke-virtual {v11}, Lo0/a$a;->b()LY0/t;

    move-result-object v13

    invoke-virtual {v11}, Lo0/a$a;->c()Lm0/n0;

    move-result-object v14

    move-object/from16 p3, v6

    move-object v15, v7

    invoke-virtual {v11}, Lo0/a$a;->d()J

    move-result-wide v6

    invoke-virtual {v8}, Lo0/a;->B()Lo0/a$a;

    move-result-object v11

    invoke-virtual {v11, v0}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v11, v2}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v11, v5}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v11, v9, v10}, Lo0/a$a;->l(J)V

    invoke-interface {v5}, Lm0/n0;->j()V

    invoke-interface {v3, v8}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5}, Lm0/n0;->r()V

    invoke-virtual {v8}, Lo0/a;->B()Lo0/a$a;

    move-result-object v0

    invoke-virtual {v0, v12}, Lo0/a$a;->j(LY0/d;)V

    invoke-virtual {v0, v13}, Lo0/a$a;->k(LY0/t;)V

    invoke-virtual {v0, v14}, Lo0/a$a;->i(Lm0/n0;)V

    invoke-virtual {v0, v6, v7}, Lo0/a$a;->l(J)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    move-object/from16 p3, v6

    move-object v15, v7

    :goto_0
    invoke-virtual/range {p3 .. p3}, Lm0/o0;->a()Lm0/G;

    move-result-object v0

    move-object v2, v15

    invoke-virtual {v0, v2}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    sget-object v0, LYg/J;->a:LYg/J;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    invoke-virtual {v4}, Landroid/graphics/Picture;->endRecording()V

    goto :goto_2

    :goto_1
    invoke-virtual {v4}, Landroid/graphics/Picture;->endRecording()V

    throw v0

    :cond_3
    :goto_2
    return-void
.end method

.method public K()F
    .locals 1

    iget v0, p0, Lp0/E;->A:F

    return v0
.end method

.method public L(I)V
    .locals 0

    iput p1, p0, Lp0/E;->v:I

    invoke-direct {p0}, Lp0/E;->U()V

    return-void
.end method

.method public M()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    return-object v0
.end method

.method public N()F
    .locals 1

    iget v0, p0, Lp0/E;->D:F

    return v0
.end method

.method public P()Z
    .locals 1

    iget-boolean v0, p0, Lp0/E;->r:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0}, Landroid/view/View;->getClipToOutline()Z

    move-result v0

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

.method public a(F)V
    .locals 1

    iput p1, p0, Lp0/E;->w:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lp0/E;->w:F

    return v0
.end method

.method public c(Lm0/n0;)V
    .locals 4

    invoke-direct {p0}, Lp0/E;->T()V

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lp0/E;->b:Lq0/a;

    iget-object v1, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1, v2, v3}, Lq0/a;->a(Lm0/n0;Landroid/view/View;J)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lp0/E;->i:Landroid/graphics/Picture;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Landroid/graphics/Canvas;->drawPicture(Landroid/graphics/Picture;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public d(F)V
    .locals 1

    iput p1, p0, Lp0/E;->H:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationY(F)V

    return-void
.end method

.method public e(F)V
    .locals 1

    iput p1, p0, Lp0/E;->I:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotation(F)V

    return-void
.end method

.method public f(F)V
    .locals 1

    iput p1, p0, Lp0/E;->C:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public g(F)V
    .locals 1

    iput p1, p0, Lp0/E;->A:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleY(F)V

    return-void
.end method

.method public h()V
    .locals 2

    iget-object v0, p0, Lp0/E;->b:Lq0/a;

    iget-object v1, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeViewInLayout(Landroid/view/View;)V

    return-void
.end method

.method public i(F)V
    .locals 1

    iput p1, p0, Lp0/E;->z:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setScaleX(F)V

    return-void
.end method

.method public j(F)V
    .locals 1

    iput p1, p0, Lp0/E;->B:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    return-void
.end method

.method public k(Lm0/d1;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    sget-object v0, Lp0/Z;->a:Lp0/Z;

    iget-object v1, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, v1, p1}, Lp0/Z;->a(Landroid/view/View;Lm0/d1;)V

    :cond_0
    return-void
.end method

.method public l(F)V
    .locals 2

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    iget-object v1, p0, Lp0/E;->f:Landroid/content/res/Resources;

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    int-to-float v1, v1

    mul-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setCameraDistance(F)V

    return-void
.end method

.method public m(F)V
    .locals 1

    iput p1, p0, Lp0/E;->G:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setRotationX(F)V

    return-void
.end method

.method public n()F
    .locals 1

    iget v0, p0, Lp0/E;->z:F

    return v0
.end method

.method public o(F)V
    .locals 1

    iput p1, p0, Lp0/E;->D:F

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    return-void
.end method

.method public p()Lm0/w0;
    .locals 1

    iget-object v0, p0, Lp0/E;->u:Lm0/w0;

    return-object v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lp0/E;->t:I

    return v0
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/E;->p:Z

    return-void
.end method

.method public t()Lm0/d1;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public u()F
    .locals 1

    iget v0, p0, Lp0/E;->H:F

    return v0
.end method

.method public v(Landroid/graphics/Outline;J)V
    .locals 2

    iget-object p2, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {p2, p1}, Lp0/T;->c(Landroid/graphics/Outline;)Z

    move-result p2

    invoke-virtual {p0}, Lp0/E;->P()Z

    move-result p3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p3, :cond_0

    if-eqz p1, :cond_0

    iget-object p3, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {p3, v1}, Landroid/view/View;->setClipToOutline(Z)V

    iget-boolean p3, p0, Lp0/E;->r:Z

    if-eqz p3, :cond_0

    iput-boolean v0, p0, Lp0/E;->r:Z

    iput-boolean v1, p0, Lp0/E;->o:Z

    :cond_0
    if-eqz p1, :cond_1

    move v0, v1

    :cond_1
    iput-boolean v0, p0, Lp0/E;->q:Z

    if-nez p2, :cond_2

    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {p1}, Lp0/T;->invalidate()V

    invoke-direct {p0}, Lp0/E;->Q()V

    :cond_2
    return-void
.end method

.method public w()F
    .locals 1

    iget v0, p0, Lp0/E;->I:F

    return v0
.end method

.method public x()I
    .locals 1

    iget v0, p0, Lp0/E;->v:I

    return v0
.end method

.method public y(IIJ)V
    .locals 3

    iget-wide v0, p0, Lp0/E;->n:J

    invoke-static {v0, v1, p3, p4}, LY0/r;->e(JJ)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lp0/E;->P()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/E;->o:Z

    :cond_0
    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    add-int/2addr v1, p1

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result v2

    add-int/2addr v2, p2

    invoke-virtual {v0, p1, p2, v1, v2}, Landroid/view/View;->layout(IIII)V

    iput-wide p3, p0, Lp0/E;->n:J

    iget-boolean v0, p0, Lp0/E;->x:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p3, p4}, LY0/r;->g(J)I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p3, p4}, LY0/r;->f(J)I

    move-result p3

    int-to-float p3, p3

    div-float/2addr p3, v2

    invoke-virtual {v0, p3}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    iget p3, p0, Lp0/E;->l:I

    if-eq p3, p1, :cond_2

    iget-object p4, p0, Lp0/E;->e:Lp0/T;

    sub-int p3, p1, p3

    invoke-virtual {p4, p3}, Landroid/view/View;->offsetLeftAndRight(I)V

    :cond_2
    iget p3, p0, Lp0/E;->m:I

    if-eq p3, p2, :cond_3

    iget-object p4, p0, Lp0/E;->e:Lp0/T;

    sub-int p3, p2, p3

    invoke-virtual {p4, p3}, Landroid/view/View;->offsetTopAndBottom(I)V

    :cond_3
    :goto_0
    iput p1, p0, Lp0/E;->l:I

    iput p2, p0, Lp0/E;->m:I

    return-void
.end method

.method public z(J)V
    .locals 3

    iput-wide p1, p0, Lp0/E;->y:J

    invoke-static {p1, p2}, Ll0/h;->d(J)Z

    move-result v0

    if-eqz v0, :cond_1

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1c

    if-lt p1, p2, :cond_0

    sget-object p1, Lp0/X;->a:Lp0/X;

    iget-object p2, p0, Lp0/E;->e:Lp0/T;

    invoke-virtual {p1, p2}, Lp0/X;->a(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/E;->x:Z

    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    iget-wide v0, p0, Lp0/E;->n:J

    invoke-static {v0, v1}, LY0/r;->g(J)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotX(F)V

    iget-object p1, p0, Lp0/E;->e:Lp0/T;

    iget-wide v1, p0, Lp0/E;->n:J

    invoke-static {v1, v2}, LY0/r;->f(J)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Landroid/view/View;->setPivotY(F)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lp0/E;->x:Z

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setPivotX(F)V

    iget-object v0, p0, Lp0/E;->e:Lp0/T;

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setPivotY(F)V

    :goto_0
    return-void
.end method
