.class public LY5/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY5/b$a;
    }
.end annotation


# static fields
.field public static final f:LY5/b$a;

.field static final synthetic g:[Lth/l;


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:Lph/d;

.field private final c:Lph/d;

.field private final d:Lph/d;

.field private final e:Lph/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lkotlin/jvm/internal/z;

    const-class v1, LY5/b;

    const-string/jumbo v2, "startAxis"

    const-string/jumbo v3, "getStartAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v0}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v0

    new-instance v2, Lkotlin/jvm/internal/z;

    const-string/jumbo v3, "topAxis"

    const-string/jumbo v5, "getTopAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;"

    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v2}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v2

    new-instance v3, Lkotlin/jvm/internal/z;

    const-string/jumbo v5, "endAxis"

    const-string/jumbo v6, "getEndAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;"

    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v3}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v3

    new-instance v5, Lkotlin/jvm/internal/z;

    const-string/jumbo v6, "bottomAxis"

    const-string/jumbo v7, "getBottomAxis()Lcom/patrykandpatrick/vico/core/axis/AxisRenderer;"

    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {v5}, Lkotlin/jvm/internal/O;->f(Lkotlin/jvm/internal/y;)Lth/j;

    move-result-object v1

    const/4 v5, 0x4

    new-array v5, v5, [Lth/l;

    aput-object v0, v5, v4

    const/4 v0, 0x1

    aput-object v2, v5, v0

    const/4 v0, 0x2

    aput-object v3, v5, v0

    const/4 v0, 0x3

    aput-object v1, v5, v0

    sput-object v5, LY5/b;->g:[Lth/l;

    new-instance v0, LY5/b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LY5/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LY5/b;->f:LY5/b$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, LY5/b;->a:Ljava/util/ArrayList;

    invoke-static {}, Ll6/a;->a()Lph/d;

    move-result-object v0

    iput-object v0, p0, LY5/b;->b:Lph/d;

    invoke-static {}, Ll6/a;->a()Lph/d;

    move-result-object v0

    iput-object v0, p0, LY5/b;->c:Lph/d;

    invoke-static {}, Ll6/a;->a()Lph/d;

    move-result-object v0

    iput-object v0, p0, LY5/b;->d:Lph/d;

    invoke-static {}, Ll6/a;->a()Lph/d;

    move-result-object v0

    iput-object v0, p0, LY5/b;->e:Lph/d;

    return-void
.end method

.method private final l(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V
    .locals 2

    iget v0, p3, Landroid/graphics/RectF;->left:F

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p5}, Lg6/c;->g()F

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lg6/c;->d()F

    move-result v1

    :goto_0
    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p4, Landroid/graphics/RectF;->bottom:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget p3, p3, Landroid/graphics/RectF;->right:F

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p5}, Lg6/c;->d()F

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p5}, Lg6/c;->g()F

    move-result p2

    :goto_1
    sub-float/2addr p3, p2

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget p3, p4, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p5}, Lg6/c;->c()F

    move-result p4

    add-float/2addr p3, p4

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, v0, v1, p2, p3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method private final n(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V
    .locals 2

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->right:F

    invoke-virtual {p5}, Lg6/c;->d()F

    move-result v1

    sub-float/2addr v0, v1

    goto :goto_0

    :cond_0
    iget v0, p3, Landroid/graphics/RectF;->left:F

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p4, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p3, Landroid/graphics/RectF;->right:F

    goto :goto_1

    :cond_1
    iget p2, p3, Landroid/graphics/RectF;->left:F

    invoke-virtual {p5}, Lg6/c;->d()F

    move-result p3

    add-float/2addr p2, p3

    :goto_1
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget p3, p4, Landroid/graphics/RectF;->bottom:F

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, v0, v1, p2, p3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method private final o()V
    .locals 5

    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v2}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v1

    :goto_1
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v1

    :goto_2
    filled-new-array {v2, v3, v4}, [Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v0, v2}, LY5/d;->e([Landroid/graphics/RectF;)V

    :cond_3
    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-interface {v2}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-interface {v3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    goto :goto_4

    :cond_5
    move-object v3, v1

    :goto_4
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v4

    goto :goto_5

    :cond_6
    move-object v4, v1

    :goto_5
    filled-new-array {v2, v3, v4}, [Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v0, v2}, LY5/d;->e([Landroid/graphics/RectF;)V

    :cond_7
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_b

    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-interface {v2}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    goto :goto_6

    :cond_8
    move-object v2, v1

    :goto_6
    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-interface {v3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    goto :goto_7

    :cond_9
    move-object v3, v1

    :goto_7
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-interface {v4}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v4

    goto :goto_8

    :cond_a
    move-object v4, v1

    :goto_8
    filled-new-array {v2, v3, v4}, [Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v0, v2}, LY5/d;->e([Landroid/graphics/RectF;)V

    :cond_b
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-interface {v2}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    goto :goto_9

    :cond_c
    move-object v2, v1

    :goto_9
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-interface {v3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    goto :goto_a

    :cond_d
    move-object v3, v1

    :goto_a
    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v4

    if-eqz v4, :cond_e

    invoke-interface {v4}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    :cond_e
    filled-new-array {v2, v3, v1}, [Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {v0, v1}, LY5/d;->e([Landroid/graphics/RectF;)V

    :cond_f
    return-void
.end method

.method private final q(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V
    .locals 2

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p3, Landroid/graphics/RectF;->left:F

    goto :goto_0

    :cond_0
    iget v0, p3, Landroid/graphics/RectF;->right:F

    invoke-virtual {p5}, Lg6/c;->g()F

    move-result v1

    sub-float/2addr v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p4, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p2

    if-eqz p2, :cond_1

    iget p2, p3, Landroid/graphics/RectF;->left:F

    invoke-virtual {p5}, Lg6/c;->g()F

    move-result p3

    add-float/2addr p2, p3

    goto :goto_1

    :cond_1
    iget p2, p3, Landroid/graphics/RectF;->right:F

    :goto_1
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget p3, p4, Landroid/graphics/RectF;->bottom:F

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, v0, v1, p2, p3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method private final s(LY5/d;Lu6/e;Landroid/graphics/RectF;Lg6/c;)V
    .locals 3

    iget v0, p3, Landroid/graphics/RectF;->left:F

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p4}, Lg6/c;->g()F

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {p4}, Lg6/c;->d()F

    move-result v1

    :goto_0
    add-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    iget v1, p3, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, p3, Landroid/graphics/RectF;->right:F

    invoke-interface {p2}, Lu6/e;->h()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p4}, Lg6/c;->d()F

    move-result p2

    goto :goto_1

    :cond_1
    invoke-virtual {p4}, Lg6/c;->g()F

    move-result p2

    :goto_1
    sub-float/2addr v2, p2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    iget p3, p3, Landroid/graphics/RectF;->top:F

    invoke-virtual {p4}, Lg6/c;->h()F

    move-result p4

    add-float/2addr p3, p4

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, v0, v1, p2, p3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "destination"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    return-void
.end method

.method public final b(Le6/a;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LY5/b;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY5/d;

    invoke-interface {v1, p1}, LY5/d;->h(Le6/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Le6/a;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LY5/b;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY5/d;

    invoke-interface {v1, p1}, LY5/d;->c(Le6/a;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, LY5/b;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final e()LY5/d;
    .locals 3

    iget-object v0, p0, LY5/b;->e:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY5/d;

    return-object v0
.end method

.method public final f()LY5/d;
    .locals 3

    iget-object v0, p0, LY5/b;->d:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY5/d;

    return-object v0
.end method

.method public final g()LY5/d;
    .locals 3

    iget-object v0, p0, LY5/b;->b:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY5/d;

    return-object v0
.end method

.method public final h()LY5/d;
    .locals 3

    iget-object v0, p0, LY5/b;->c:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lph/d;->a(Ljava/lang/Object;Lth/l;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY5/d;

    return-object v0
.end method

.method public final i(LY5/d;LY5/d;LY5/d;LY5/d;)V
    .locals 0

    invoke-virtual {p0, p1}, LY5/b;->p(LY5/d;)V

    invoke-virtual {p0, p2}, LY5/b;->r(LY5/d;)V

    invoke-virtual {p0, p3}, LY5/b;->m(LY5/d;)V

    invoke-virtual {p0, p4}, LY5/b;->k(LY5/d;)V

    return-void
.end method

.method public final j(Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V
    .locals 9

    const-string/jumbo v0, "measureContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartBounds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "insets"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LY5/b;->g()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_0

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LY5/b;->q(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V

    :cond_0
    invoke-virtual {p0}, LY5/b;->h()LY5/d;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0, p1, p2, p4}, LY5/b;->s(LY5/d;Lu6/e;Landroid/graphics/RectF;Lg6/c;)V

    :cond_1
    invoke-virtual {p0}, LY5/b;->f()LY5/d;

    move-result-object v2

    if-eqz v2, :cond_2

    move-object v1, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, LY5/b;->n(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V

    :cond_2
    invoke-virtual {p0}, LY5/b;->e()LY5/d;

    move-result-object v4

    if-eqz v4, :cond_3

    move-object v3, p0

    move-object v5, p1

    move-object v6, p2

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v3 .. v8}, LY5/b;->l(LY5/d;Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V

    :cond_3
    invoke-direct {p0}, LY5/b;->o()V

    return-void
.end method

.method public final k(LY5/d;)V
    .locals 3

    iget-object v0, p0, LY5/b;->e:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lph/d;->b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V

    return-void
.end method

.method public final m(LY5/d;)V
    .locals 3

    iget-object v0, p0, LY5/b;->d:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lph/d;->b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V

    return-void
.end method

.method public final p(LY5/d;)V
    .locals 3

    iget-object v0, p0, LY5/b;->b:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lph/d;->b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V

    return-void
.end method

.method public final r(LY5/d;)V
    .locals 3

    iget-object v0, p0, LY5/b;->c:Lph/d;

    sget-object v1, LY5/b;->g:[Lth/l;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1, p1}, Lph/d;->b(Ljava/lang/Object;Lth/l;Ljava/lang/Object;)V

    return-void
.end method
