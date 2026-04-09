.class public abstract Landroidx/compose/ui/platform/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ll0/i;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ll0/i;

    const/4 v1, 0x0

    const/high16 v2, 0x41200000    # 10.0f

    invoke-direct {v0, v1, v1, v2, v2}, Ll0/i;-><init>(FFFF)V

    sput-object v0, Landroidx/compose/ui/platform/l1;->a:Ll0/i;

    return-void
.end method

.method public static final a(Ljava/util/List;I)Landroidx/compose/ui/platform/i1;
    .locals 3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/compose/ui/platform/i1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/i1;->d()I

    move-result v2

    if-ne v2, p1, :cond_0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/compose/ui/platform/i1;

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final b(LJ0/p;)Lo/m;
    .locals 6

    invoke-virtual {p0}, LJ0/p;->a()LJ0/n;

    move-result-object p0

    invoke-static {}, Lo/n;->b()Lo/z;

    move-result-object v0

    invoke-virtual {p0}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->q()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, LJ0/n;->q()LE0/G;

    move-result-object v1

    invoke-virtual {v1}, LE0/G;->K0()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LJ0/n;->i()Ll0/i;

    move-result-object v1

    new-instance v2, Landroid/graphics/Region;

    invoke-virtual {v1}, Ll0/i;->k()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {v1}, Ll0/i;->n()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v1}, Ll0/i;->l()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v1}, Ll0/i;->e()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-direct {v2, v3, v4, v5, v1}, Landroid/graphics/Region;-><init>(IIII)V

    new-instance v1, Landroid/graphics/Region;

    invoke-direct {v1}, Landroid/graphics/Region;-><init>()V

    invoke-static {v2, p0, v0, p0, v1}, Landroidx/compose/ui/platform/l1;->c(Landroid/graphics/Region;LJ0/n;Lo/z;LJ0/n;Landroid/graphics/Region;)V

    :cond_1
    :goto_0
    return-object v0
.end method

.method private static final c(Landroid/graphics/Region;LJ0/n;Lo/z;LJ0/n;Landroid/graphics/Region;)V
    .locals 9

    invoke-virtual {p3}, LJ0/n;->q()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->q()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p3}, LJ0/n;->q()LE0/G;

    move-result-object v0

    invoke-virtual {v0}, LE0/G;->K0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    invoke-virtual {p0}, Landroid/graphics/Region;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p3}, LJ0/n;->o()I

    move-result v2

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v3

    if-ne v2, v3, :cond_3

    :cond_2
    if-eqz v0, :cond_4

    invoke-virtual {p3}, LJ0/n;->x()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    return-void

    :cond_4
    invoke-virtual {p3}, LJ0/n;->v()Ll0/i;

    move-result-object v0

    invoke-virtual {v0}, Ll0/i;->k()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v4

    invoke-virtual {v0}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v5

    invoke-virtual {v0}, Ll0/i;->l()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {v0}, Ll0/i;->e()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-virtual {p4, v4, v5, v6, v7}, Landroid/graphics/Region;->set(IIII)Z

    invoke-virtual {p3}, LJ0/n;->o()I

    move-result v0

    invoke-virtual {p1}, LJ0/n;->o()I

    move-result v2

    const/4 v3, -0x1

    if-ne v0, v2, :cond_5

    move v0, v3

    goto :goto_2

    :cond_5
    invoke-virtual {p3}, LJ0/n;->o()I

    move-result v0

    :goto_2
    sget-object v2, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    invoke-virtual {p4, p0, v2}, Landroid/graphics/Region;->op(Landroid/graphics/Region;Landroid/graphics/Region$Op;)Z

    move-result v2

    if-eqz v2, :cond_7

    new-instance v2, Landroidx/compose/ui/platform/k1;

    invoke-virtual {p4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object v8

    invoke-direct {v2, p3, v8}, Landroidx/compose/ui/platform/k1;-><init>(LJ0/n;Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0, v2}, Lo/z;->t(ILjava/lang/Object;)V

    invoke-virtual {p3}, LJ0/n;->t()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    :goto_3
    if-ge v3, v2, :cond_6

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LJ0/n;

    invoke-static {p0, p1, p2, v1, p4}, Landroidx/compose/ui/platform/l1;->c(Landroid/graphics/Region;LJ0/n;Lo/z;LJ0/n;Landroid/graphics/Region;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_3

    :cond_6
    invoke-static {p3}, Landroidx/compose/ui/platform/l1;->f(LJ0/n;)Z

    move-result p1

    if-eqz p1, :cond_a

    sget-object v8, Landroid/graphics/Region$Op;->DIFFERENCE:Landroid/graphics/Region$Op;

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Region;->op(IIIILandroid/graphics/Region$Op;)Z

    goto :goto_5

    :cond_7
    invoke-virtual {p3}, LJ0/n;->x()Z

    move-result p0

    if-eqz p0, :cond_9

    invoke-virtual {p3}, LJ0/n;->r()LJ0/n;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, LJ0/n;->p()LC0/v;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-interface {p1}, LC0/v;->q()Z

    move-result p1

    if-ne p1, v1, :cond_8

    invoke-virtual {p0}, LJ0/n;->i()Ll0/i;

    move-result-object p0

    goto :goto_4

    :cond_8
    sget-object p0, Landroidx/compose/ui/platform/l1;->a:Ll0/i;

    :goto_4
    new-instance p1, Landroidx/compose/ui/platform/k1;

    new-instance p4, Landroid/graphics/Rect;

    invoke-virtual {p0}, Ll0/i;->k()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-virtual {p0}, Ll0/i;->n()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {p0}, Ll0/i;->l()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-virtual {p0}, Ll0/i;->e()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-direct {p4, v1, v2, v3, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-direct {p1, p3, p4}, Landroidx/compose/ui/platform/k1;-><init>(LJ0/n;Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0, p1}, Lo/z;->t(ILjava/lang/Object;)V

    goto :goto_5

    :cond_9
    if-ne v0, v3, :cond_a

    new-instance p0, Landroidx/compose/ui/platform/k1;

    invoke-virtual {p4}, Landroid/graphics/Region;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-direct {p0, p3, p1}, Landroidx/compose/ui/platform/k1;-><init>(LJ0/n;Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0, p0}, Lo/z;->t(ILjava/lang/Object;)V

    :cond_a
    :goto_5
    return-void
.end method

.method public static final d(LJ0/j;)Ljava/lang/Float;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->h()LJ0/v;

    move-result-object v1

    invoke-static {p0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ0/a;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LJ0/a;->a()LYg/i;

    move-result-object p0

    check-cast p0, Lmh/l;

    if-eqz p0, :cond_0

    invoke-interface {p0, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/lang/Float;

    :cond_0
    return-object v1
.end method

.method public static final e(LJ0/j;)LL0/M;
    .locals 2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, LJ0/i;->a:LJ0/i;

    invoke-virtual {v1}, LJ0/i;->i()LJ0/v;

    move-result-object v1

    invoke-static {p0, v1}, LJ0/k;->a(LJ0/j;LJ0/v;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LJ0/a;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, LJ0/a;->a()LYg/i;

    move-result-object p0

    check-cast p0, Lmh/l;

    if-eqz p0, :cond_0

    invoke-interface {p0, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, LL0/M;

    :cond_0
    return-object v1
.end method

.method public static final f(LJ0/n;)Z
    .locals 1

    invoke-static {p0}, Landroidx/compose/ui/platform/l1;->g(LJ0/n;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object v0

    invoke-virtual {v0}, LJ0/j;->u()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object p0

    invoke-virtual {p0}, LJ0/j;->g()Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final g(LJ0/n;)Z
    .locals 1

    invoke-virtual {p0}, LJ0/n;->z()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LJ0/n;->w()LJ0/j;

    move-result-object p0

    sget-object v0, LJ0/q;->a:LJ0/q;

    invoke-virtual {v0}, LJ0/q;->n()LJ0/v;

    move-result-object v0

    invoke-virtual {p0, v0}, LJ0/j;->f(LJ0/v;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final h(Landroidx/compose/ui/platform/Z;I)Landroid/view/View;
    .locals 3

    invoke-virtual {p0}, Landroidx/compose/ui/platform/Z;->getLayoutNodeToHolder()Ljava/util/HashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LE0/G;

    invoke-virtual {v2}, LE0/G;->q0()I

    move-result v2

    if-ne v2, p1, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Landroidx/compose/ui/viewinterop/c;

    :cond_2
    return-object v1
.end method

.method public static final i(I)Ljava/lang/String;
    .locals 2

    sget-object v0, LJ0/g;->b:LJ0/g$a;

    invoke-virtual {v0}, LJ0/g$a;->a()I

    move-result v1

    invoke-static {p0, v1}, LJ0/g;->k(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string p0, "android.widget.Button"

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, LJ0/g$a;->b()I

    move-result v1

    invoke-static {p0, v1}, LJ0/g;->k(II)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string p0, "android.widget.CheckBox"

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, LJ0/g$a;->e()I

    move-result v1

    invoke-static {p0, v1}, LJ0/g;->k(II)Z

    move-result v1

    if-eqz v1, :cond_2

    const-string p0, "android.widget.RadioButton"

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, LJ0/g$a;->d()I

    move-result v1

    invoke-static {p0, v1}, LJ0/g;->k(II)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p0, "android.widget.ImageView"

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, LJ0/g$a;->c()I

    move-result v0

    invoke-static {p0, v0}, LJ0/g;->k(II)Z

    move-result p0

    if-eqz p0, :cond_4

    const-string p0, "android.widget.Spinner"

    goto :goto_0

    :cond_4
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method
