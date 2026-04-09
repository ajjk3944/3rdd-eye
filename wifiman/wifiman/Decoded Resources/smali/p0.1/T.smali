.class public final Lp0/T;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp0/T$b;
    }
.end annotation


# static fields
.field public static final k:Lp0/T$b;

.field private static final l:Landroid/view/ViewOutlineProvider;


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lm0/o0;

.field private final c:Lo0/a;

.field private d:Z

.field private e:Landroid/graphics/Outline;

.field private f:Z

.field private g:LY0/d;

.field private h:LY0/t;

.field private i:Lmh/l;

.field private j:Lp0/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lp0/T$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp0/T$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lp0/T;->k:Lp0/T$b;

    new-instance v0, Lp0/T$a;

    invoke-direct {v0}, Lp0/T$a;-><init>()V

    sput-object v0, Lp0/T;->l:Landroid/view/ViewOutlineProvider;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Lm0/o0;Lo0/a;)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lp0/T;->a:Landroid/view/View;

    iput-object p2, p0, Lp0/T;->b:Lm0/o0;

    iput-object p3, p0, Lp0/T;->c:Lo0/a;

    sget-object p1, Lp0/T;->l:Landroid/view/ViewOutlineProvider;

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/T;->f:Z

    invoke-static {}, Lo0/e;->a()LY0/d;

    move-result-object p1

    iput-object p1, p0, Lp0/T;->g:LY0/d;

    sget-object p1, LY0/t;->Ltr:LY0/t;

    iput-object p1, p0, Lp0/T;->h:LY0/t;

    sget-object p1, Lp0/d;->a:Lp0/d$a;

    invoke-virtual {p1}, Lp0/d$a;->a()Lmh/l;

    move-result-object p1

    iput-object p1, p0, Lp0/T;->i:Lmh/l;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setWillNotDraw(Z)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public static final synthetic a(Lp0/T;)Landroid/graphics/Outline;
    .locals 0

    iget-object p0, p0, Lp0/T;->e:Landroid/graphics/Outline;

    return-object p0
.end method


# virtual methods
.method public final b(LY0/d;LY0/t;Lp0/c;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Lp0/T;->g:LY0/d;

    iput-object p2, p0, Lp0/T;->h:LY0/t;

    iput-object p4, p0, Lp0/T;->i:Lmh/l;

    iput-object p3, p0, Lp0/T;->j:Lp0/c;

    return-void
.end method

.method public final c(Landroid/graphics/Outline;)Z
    .locals 0

    iput-object p1, p0, Lp0/T;->e:Landroid/graphics/Outline;

    sget-object p1, Lp0/K;->a:Lp0/K;

    invoke-virtual {p1, p0}, Lp0/K;->a(Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Lp0/T;->b:Lm0/o0;

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v2

    invoke-virtual {v2}, Lm0/G;->a()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    move-object/from16 v4, p1

    invoke-virtual {v3, v4}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v3

    iget-object v4, v1, Lp0/T;->c:Lo0/a;

    iget-object v5, v1, Lp0/T;->g:LY0/d;

    iget-object v6, v1, Lp0/T;->h:LY0/t;

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getHeight()I

    move-result v8

    int-to-float v8, v8

    invoke-static {v7, v8}, Ll0/n;->a(FF)J

    move-result-wide v7

    iget-object v9, v1, Lp0/T;->j:Lp0/c;

    iget-object v10, v1, Lp0/T;->i:Lmh/l;

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v11

    invoke-interface {v11}, Lo0/d;->getDensity()LY0/d;

    move-result-object v11

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v12

    invoke-interface {v12}, Lo0/d;->getLayoutDirection()LY0/t;

    move-result-object v12

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v13

    invoke-interface {v13}, Lo0/d;->d()Lm0/n0;

    move-result-object v13

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v14

    invoke-interface {v14}, Lo0/d;->c()J

    move-result-wide v14

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Lo0/d;->g()Lp0/c;

    move-result-object v1

    move-object/from16 v16, v2

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2, v5}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v2, v6}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v2, v3}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v2, v7, v8}, Lo0/d;->f(J)V

    invoke-interface {v2, v9}, Lo0/d;->h(Lp0/c;)V

    invoke-interface {v3}, Lm0/n0;->j()V

    :try_start_0
    invoke-interface {v10, v4}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v2

    invoke-interface {v2, v11}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v2, v12}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v2, v13}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v2, v14, v15}, Lo0/d;->f(J)V

    invoke-interface {v2, v1}, Lo0/d;->h(Lp0/c;)V

    invoke-virtual {v0}, Lm0/o0;->a()Lm0/G;

    move-result-object v0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Lm0/G;->z(Landroid/graphics/Canvas;)V

    const/4 v0, 0x0

    move-object/from16 v1, p0

    iput-boolean v0, v1, Lp0/T;->d:Z

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v1

    move-object/from16 v1, p0

    move-object v5, v0

    invoke-interface {v3}, Lm0/n0;->r()V

    invoke-interface {v4}, Lo0/f;->k1()Lo0/d;

    move-result-object v0

    invoke-interface {v0, v11}, Lo0/d;->a(LY0/d;)V

    invoke-interface {v0, v12}, Lo0/d;->b(LY0/t;)V

    invoke-interface {v0, v13}, Lo0/d;->i(Lm0/n0;)V

    invoke-interface {v0, v14, v15}, Lo0/d;->f(J)V

    invoke-interface {v0, v2}, Lo0/d;->h(Lp0/c;)V

    throw v5
.end method

.method public forceLayout()V
    .locals 0

    return-void
.end method

.method public final getCanUseCompositingLayer$ui_graphics_release()Z
    .locals 1

    iget-boolean v0, p0, Lp0/T;->f:Z

    return v0
.end method

.method public final getCanvasHolder()Lm0/o0;
    .locals 1

    iget-object v0, p0, Lp0/T;->b:Lm0/o0;

    return-object v0
.end method

.method public final getOwnerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lp0/T;->a:Landroid/view/View;

    return-object v0
.end method

.method public hasOverlappingRendering()Z
    .locals 1

    iget-boolean v0, p0, Lp0/T;->f:Z

    return v0
.end method

.method public invalidate()V
    .locals 1

    iget-boolean v0, p0, Lp0/T;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lp0/T;->d:Z

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final setCanUseCompositingLayer$ui_graphics_release(Z)V
    .locals 1

    iget-boolean v0, p0, Lp0/T;->f:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Lp0/T;->f:Z

    invoke-virtual {p0}, Lp0/T;->invalidate()V

    :cond_0
    return-void
.end method

.method public final setInvalidated(Z)V
    .locals 0

    iput-boolean p1, p0, Lp0/T;->d:Z

    return-void
.end method
