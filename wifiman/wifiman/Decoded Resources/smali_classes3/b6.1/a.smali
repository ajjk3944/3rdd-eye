.class public abstract Lb6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/b;
.implements Lw6/a;


# instance fields
.field private final a:Ljava/util/ArrayList;

.field private final b:Lg6/c;

.field private final c:Ljava/util/HashMap;

.field private final d:Landroid/graphics/RectF;

.field private final e:Ljava/util/Collection;

.field private f:Lk6/a;

.field private g:Ljava/lang/Float;

.field private h:Ljava/lang/Float;

.field private i:Ljava/lang/Float;

.field private j:Ljava/lang/Float;


# direct methods
.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb6/a;->a:Ljava/util/ArrayList;

    new-instance v0, Lg6/c;

    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lg6/c;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lb6/a;->b:Lg6/c;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lb6/a;->c:Ljava/util/HashMap;

    new-instance v1, Landroid/graphics/RectF;

    invoke-direct {v1}, Landroid/graphics/RectF;-><init>()V

    iput-object v1, p0, Lb6/a;->d:Landroid/graphics/RectF;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string/jumbo v1, "persistentMarkers.values"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lb6/a;->e:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public A(Ljava/util/Map;)V
    .locals 1

    const-string/jumbo v0, "markers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb6/a;->c:Ljava/util/HashMap;

    invoke-static {v0, p1}, Ly6/a;->c(Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic a(Le6/a;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx6/b;

    invoke-virtual {p0, p1, p2}, Lb6/a;->s(Le6/a;Lx6/b;)V

    return-void
.end method

.method public bridge synthetic d(Le6/a;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lx6/b;

    invoke-virtual {p0, p1, p2}, Lb6/a;->r(Le6/a;Lx6/b;)V

    return-void
.end method

.method public g(Lu6/e;FLg6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb6/b$a;->a(Lb6/b;Lu6/e;FLg6/b;)V

    return-void
.end method

.method public getBounds()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, Lb6/a;->d:Landroid/graphics/RectF;

    return-object v0
.end method

.method public abstract i(Lu6/e;Lg6/c;Lj6/b;)V
.end method

.method public j()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lb6/a;->e:Ljava/util/Collection;

    return-object v0
.end method

.method public l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb6/b$a;->b(Lb6/b;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method protected abstract n(Le6/a;Lx6/b;)V
.end method

.method protected o(Le6/a;Lx6/b;)V
    .locals 6

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object v0

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->left:F

    iget-object v2, p0, Lb6/a;->b:Lg6/c;

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v3

    invoke-virtual {v2, v3}, Lg6/c;->e(Z)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    iget-object v3, p0, Lb6/a;->b:Lg6/c;

    invoke-virtual {v3}, Lg6/c;->h()F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v3

    iget v3, v3, Landroid/graphics/RectF;->right:F

    iget-object v4, p0, Lb6/a;->b:Lg6/c;

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v5

    invoke-virtual {v4, v5}, Lg6/c;->f(Z)F

    move-result v4

    add-float/2addr v3, v4

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v4

    iget v4, v4, Landroid/graphics/RectF;->bottom:F

    iget-object v5, p0, Lb6/a;->b:Lg6/c;

    invoke-virtual {v5}, Lg6/c;->c()F

    move-result v5

    add-float/2addr v4, v5

    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    move-result v5

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-virtual {p0, p1}, Lb6/a;->q(Le6/a;)V

    invoke-interface {p2}, Lx6/b;->f()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1, p2}, Lb6/a;->n(Le6/a;Lx6/b;)V

    :cond_0
    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    return-void
.end method

.method protected final p(Le6/a;)V
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb6/a;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld6/a;

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ld6/a;->b(Le6/a;Landroid/graphics/RectF;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected final q(Le6/a;)V
    .locals 3

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb6/a;->a:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld6/a;

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ld6/a;->a(Le6/a;Landroid/graphics/RectF;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r(Le6/a;Lx6/b;)V
    .locals 5

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object p2

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->left:F

    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->right:F

    invoke-interface {p1}, Lu6/b;->d()Landroid/graphics/Canvas;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Canvas;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {p2, v0, v4, v1, v2}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    invoke-virtual {p0, p1}, Lb6/a;->p(Le6/a;)V

    invoke-virtual {p2, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    iget-object p1, p0, Lb6/a;->c:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lf/d;->a(Ljava/lang/Object;)V

    invoke-interface {p0}, Lb6/b;->m()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2, v0}, Ly6/f;->a(Ljava/util/Map;F)Ljava/util/List;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    const/4 p1, 0x0

    throw p1

    :cond_1
    return-void
.end method

.method public s(Le6/a;Lx6/b;)V
    .locals 2

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "model"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb6/a;->b:Lg6/c;

    invoke-virtual {v0}, Lg6/c;->b()V

    iget-object v0, p0, Lb6/a;->b:Lg6/c;

    invoke-interface {p1}, Le6/a;->i()Lj6/b;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Lb6/a;->i(Lu6/e;Lg6/c;Lj6/b;)V

    invoke-virtual {p0, p1, p2}, Lb6/a;->o(Le6/a;Lx6/b;)V

    return-void
.end method

.method public t()Lk6/a;
    .locals 1

    iget-object v0, p0, Lb6/a;->f:Lk6/a;

    return-object v0
.end method

.method public u()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lb6/a;->j:Ljava/lang/Float;

    return-object v0
.end method

.method public v()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lb6/a;->h:Ljava/lang/Float;

    return-object v0
.end method

.method public w()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lb6/a;->i:Ljava/lang/Float;

    return-object v0
.end method

.method public x()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lb6/a;->g:Ljava/lang/Float;

    return-object v0
.end method

.method public y(Lk6/a;)V
    .locals 0

    iput-object p1, p0, Lb6/a;->f:Lk6/a;

    return-void
.end method

.method public z(Ljava/util/List;)V
    .locals 1

    const-string/jumbo v0, "decorations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb6/a;->a:Ljava/util/ArrayList;

    check-cast p1, Ljava/util/Collection;

    invoke-static {v0, p1}, Ly6/a;->b(Ljava/util/List;Ljava/util/Collection;)V

    return-void
.end method
