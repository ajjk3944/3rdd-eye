.class public final Landroidx/compose/ui/platform/K0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private final b:Landroid/graphics/Outline;

.field private c:Lm0/Q0;

.field private d:Lm0/U0;

.field private e:Lm0/U0;

.field private f:Z

.field private g:Z

.field private h:Lm0/U0;

.field private i:Ll0/k;

.field private j:F

.field private k:J

.field private l:J

.field private m:Z

.field private n:Lm0/U0;

.field private o:Lm0/U0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->a:Z

    new-instance v0, Landroid/graphics/Outline;

    invoke-direct {v0}, Landroid/graphics/Outline;-><init>()V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/graphics/Outline;->setAlpha(F)V

    iput-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/K0;->k:J

    sget-object v0, Ll0/m;->b:Ll0/m$a;

    invoke-virtual {v0}, Ll0/m$a;->b()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/K0;->l:J

    return-void
.end method

.method private final g(Ll0/k;JJF)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-static {p1}, Ll0/l;->f(Ll0/k;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ll0/k;->e()F

    move-result v1

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll0/k;->g()F

    move-result v1

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result v2

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll0/k;->f()F

    move-result v1

    invoke-static {p2, p3}, Ll0/g;->m(J)F

    move-result v2

    invoke-static {p4, p5}, Ll0/m;->i(J)F

    move-result v3

    add-float/2addr v2, v3

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    invoke-virtual {p1}, Ll0/k;->a()F

    move-result v1

    invoke-static {p2, p3}, Ll0/g;->n(J)F

    move-result p2

    invoke-static {p4, p5}, Ll0/m;->g(J)F

    move-result p3

    add-float/2addr p2, p3

    cmpg-float p2, v1, p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ll0/k;->h()J

    move-result-wide p1

    invoke-static {p1, p2}, Ll0/a;->d(J)F

    move-result p1

    cmpg-float p1, p1, p6

    if-nez p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method private final i()V
    .locals 4

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->f:Z

    if-eqz v0, :cond_3

    sget-object v0, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {v0}, Ll0/g$a;->c()J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/K0;->k:J

    const/4 v0, 0x0

    iput v0, p0, Landroidx/compose/ui/platform/K0;->j:F

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/compose/ui/platform/K0;->e:Lm0/U0;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    iput-boolean v1, p0, Landroidx/compose/ui/platform/K0;->g:Z

    iget-object v1, p0, Landroidx/compose/ui/platform/K0;->c:Lm0/Q0;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Landroidx/compose/ui/platform/K0;->m:Z

    if-eqz v2, :cond_2

    iget-wide v2, p0, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v2, v3}, Ll0/m;->i(J)F

    move-result v2

    cmpl-float v2, v2, v0

    if-lez v2, :cond_2

    iget-wide v2, p0, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v2, v3}, Ll0/m;->g(J)F

    move-result v2

    cmpl-float v0, v2, v0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->a:Z

    instance-of v0, v1, Lm0/Q0$b;

    if-eqz v0, :cond_0

    check-cast v1, Lm0/Q0$b;

    invoke-virtual {v1}, Lm0/Q0$b;->b()Ll0/i;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/K0;->k(Ll0/i;)V

    goto :goto_0

    :cond_0
    instance-of v0, v1, Lm0/Q0$c;

    if-eqz v0, :cond_1

    check-cast v1, Lm0/Q0$c;

    invoke-virtual {v1}, Lm0/Q0$c;->b()Ll0/k;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/K0;->l(Ll0/k;)V

    goto :goto_0

    :cond_1
    instance-of v0, v1, Lm0/Q0$a;

    if-eqz v0, :cond_3

    check-cast v1, Lm0/Q0$a;

    invoke-virtual {v1}, Lm0/Q0$a;->b()Lm0/U0;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/K0;->j(Lm0/U0;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {v0}, Landroid/graphics/Outline;->setEmpty()V

    :cond_3
    :goto_0
    return-void
.end method

.method private final j(Lm0/U0;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x1

    if-gt v0, v1, :cond_1

    invoke-interface {p1}, Lm0/U0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->a:Z

    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {v0}, Landroid/graphics/Outline;->setEmpty()V

    iput-boolean v2, p0, Landroidx/compose/ui/platform/K0;->g:Z

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    instance-of v1, p1, Lm0/T;

    if-eqz v1, :cond_2

    move-object v1, p1

    check-cast v1, Lm0/T;

    invoke-virtual {v1}, Lm0/T;->v()Landroid/graphics/Path;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V

    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {v0}, Landroid/graphics/Outline;->canClip()Z

    move-result v0

    xor-int/2addr v0, v2

    iput-boolean v0, p0, Landroidx/compose/ui/platform/K0;->g:Z

    :goto_1
    iput-object p1, p0, Landroidx/compose/ui/platform/K0;->e:Lm0/U0;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Unable to obtain android.graphics.Path"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final k(Ll0/i;)V
    .locals 4

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v1

    invoke-static {v0, v1}, Ll0/h;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/K0;->k:J

    invoke-virtual {p1}, Ll0/i;->r()F

    move-result v0

    invoke-virtual {p1}, Ll0/i;->j()F

    move-result v1

    invoke-static {v0, v1}, Ll0/n;->a(FF)J

    move-result-wide v0

    iput-wide v0, p0, Landroidx/compose/ui/platform/K0;->l:J

    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {p1}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {p1}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p1}, Ll0/i;->l()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {p1}, Ll0/i;->e()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-virtual {v0, v1, v2, v3, p1}, Landroid/graphics/Outline;->setRect(IIII)V

    return-void
.end method

.method private final l(Ll0/k;)V
    .locals 8

    invoke-virtual {p1}, Ll0/k;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/a;->d(J)F

    move-result v0

    invoke-virtual {p1}, Ll0/k;->e()F

    move-result v1

    invoke-virtual {p1}, Ll0/k;->g()F

    move-result v2

    invoke-static {v1, v2}, Ll0/h;->a(FF)J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/K0;->k:J

    invoke-virtual {p1}, Ll0/k;->j()F

    move-result v1

    invoke-virtual {p1}, Ll0/k;->d()F

    move-result v2

    invoke-static {v1, v2}, Ll0/n;->a(FF)J

    move-result-wide v1

    iput-wide v1, p0, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {p1}, Ll0/l;->f(Ll0/k;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {p1}, Ll0/k;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {p1}, Ll0/k;->g()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {p1}, Ll0/k;->f()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {p1}, Ll0/k;->a()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result v6

    move v7, v0

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Outline;->setRoundRect(IIIIF)V

    iput v0, p0, Landroidx/compose/ui/platform/K0;->j:F

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->d:Lm0/U0;

    if-nez v0, :cond_1

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v0

    iput-object v0, p0, Landroidx/compose/ui/platform/K0;->d:Lm0/U0;

    :cond_1
    invoke-interface {v0}, Lm0/U0;->a()V

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/K0;->j(Lm0/U0;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lm0/n0;)V
    .locals 20

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    invoke-virtual/range {p0 .. p0}, Landroidx/compose/ui/platform/K0;->d()Lm0/U0;

    move-result-object v0

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-eqz v0, :cond_0

    invoke-static {v8, v0, v9, v10, v11}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    iget v6, v7, Landroidx/compose/ui/platform/K0;->j:F

    const/4 v12, 0x0

    cmpl-float v0, v6, v12

    if-lez v0, :cond_4

    iget-object v13, v7, Landroidx/compose/ui/platform/K0;->h:Lm0/U0;

    iget-object v1, v7, Landroidx/compose/ui/platform/K0;->i:Ll0/k;

    if-eqz v13, :cond_1

    iget-wide v2, v7, Landroidx/compose/ui/platform/K0;->k:J

    iget-wide v4, v7, Landroidx/compose/ui/platform/K0;->l:J

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v6}, Landroidx/compose/ui/platform/K0;->g(Ll0/k;JJF)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v14

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v15

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    iget-wide v1, v7, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    add-float v16, v0, v1

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    iget-wide v1, v7, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    add-float v17, v0, v1

    iget v0, v7, Landroidx/compose/ui/platform/K0;->j:F

    invoke-static {v0, v12, v10, v11}, Ll0/b;->b(FFILjava/lang/Object;)J

    move-result-wide v18

    invoke-static/range {v14 .. v19}, Ll0/l;->d(FFFFJ)Ll0/k;

    move-result-object v0

    if-nez v13, :cond_2

    invoke-static {}, Lm0/Y;->a()Lm0/U0;

    move-result-object v13

    goto :goto_0

    :cond_2
    invoke-interface {v13}, Lm0/U0;->a()V

    :goto_0
    invoke-static {v13, v0, v11, v10, v11}, Lm0/U0;->t(Lm0/U0;Ll0/k;Lm0/U0$b;ILjava/lang/Object;)V

    iput-object v0, v7, Landroidx/compose/ui/platform/K0;->i:Ll0/k;

    iput-object v13, v7, Landroidx/compose/ui/platform/K0;->h:Lm0/U0;

    :cond_3
    invoke-static {v8, v13, v9, v10, v11}, Lm0/n0;->t(Lm0/n0;Lm0/U0;IILjava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v9

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v10

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->m(J)F

    move-result v0

    iget-wide v1, v7, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v1, v2}, Ll0/m;->i(J)F

    move-result v1

    add-float v11, v0, v1

    iget-wide v0, v7, Landroidx/compose/ui/platform/K0;->k:J

    invoke-static {v0, v1}, Ll0/g;->n(J)F

    move-result v0

    iget-wide v1, v7, Landroidx/compose/ui/platform/K0;->l:J

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    add-float v12, v0, v1

    const/16 v14, 0x10

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v15}, Lm0/n0;->p(Lm0/n0;FFFFIILjava/lang/Object;)V

    :goto_1
    return-void
.end method

.method public final b()Landroid/graphics/Outline;
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/K0;->i()V

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->m:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->f:Z

    return v0
.end method

.method public final d()Lm0/U0;
    .locals 1

    invoke-direct {p0}, Landroidx/compose/ui/platform/K0;->i()V

    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->e:Lm0/U0;

    return-object v0
.end method

.method public final e()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->g:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final f(J)Z
    .locals 3

    iget-boolean v0, p0, Landroidx/compose/ui/platform/K0;->m:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->c:Lm0/Q0;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, p2}, Ll0/g;->m(J)F

    move-result v1

    invoke-static {p1, p2}, Ll0/g;->n(J)F

    move-result p1

    iget-object p2, p0, Landroidx/compose/ui/platform/K0;->n:Lm0/U0;

    iget-object v2, p0, Landroidx/compose/ui/platform/K0;->o:Lm0/U0;

    invoke-static {v0, v1, p1, p2, v2}, Landroidx/compose/ui/platform/m1;->b(Lm0/Q0;FFLm0/U0;Lm0/U0;)Z

    move-result p1

    return p1
.end method

.method public final h(Lm0/Q0;FZFJ)Z
    .locals 2

    iget-object v0, p0, Landroidx/compose/ui/platform/K0;->b:Landroid/graphics/Outline;

    invoke-virtual {v0, p2}, Landroid/graphics/Outline;->setAlpha(F)V

    iget-object p2, p0, Landroidx/compose/ui/platform/K0;->c:Lm0/Q0;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    xor-int/lit8 v0, p2, 0x1

    const/4 v1, 0x1

    if-nez p2, :cond_0

    iput-object p1, p0, Landroidx/compose/ui/platform/K0;->c:Lm0/Q0;

    iput-boolean v1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    :cond_0
    iput-wide p5, p0, Landroidx/compose/ui/platform/K0;->l:J

    if-eqz p1, :cond_2

    if-nez p3, :cond_1

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-lez p1, :cond_2

    :cond_1
    move p1, v1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    iget-boolean p2, p0, Landroidx/compose/ui/platform/K0;->m:Z

    if-eq p2, p1, :cond_3

    iput-boolean p1, p0, Landroidx/compose/ui/platform/K0;->m:Z

    iput-boolean v1, p0, Landroidx/compose/ui/platform/K0;->f:Z

    :cond_3
    return v0
.end method
