.class public final LIe/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY5/d;


# instance fields
.field private final a:LY5/c$b;

.field private final b:Ljava/util/List;

.field private final c:Lz6/c;

.field private final d:Lt6/b;

.field private final e:Lo6/b;

.field private final f:Lo6/b;

.field private final g:LY5/a$a;

.field private final h:Ljava/util/List;

.field private final i:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LY5/c$b;Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;LY5/a$a;)V
    .locals 1

    const-string v0, "position"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labels"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelFormatter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "widthConstraint"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LIe/d;->a:LY5/c$b;

    .line 3
    iput-object p2, p0, LIe/d;->b:Ljava/util/List;

    .line 4
    iput-object p3, p0, LIe/d;->c:Lz6/c;

    .line 5
    iput-object p4, p0, LIe/d;->d:Lt6/b;

    .line 6
    iput-object p5, p0, LIe/d;->e:Lo6/b;

    .line 7
    iput-object p6, p0, LIe/d;->f:Lo6/b;

    .line 8
    iput-object p7, p0, LIe/d;->g:LY5/a$a;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LIe/d;->h:Ljava/util/List;

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LIe/d;->i:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(LY5/c$b;Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;LY5/a$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x4

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Lz6/b;

    invoke-direct {v0}, Lz6/b;-><init>()V

    move-object v4, v0

    goto :goto_0

    :cond_0
    move-object v4, p3

    :goto_0
    and-int/lit8 v0, p8, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p4

    :goto_1
    and-int/lit8 v0, p8, 0x10

    if-eqz v0, :cond_2

    move-object v6, v1

    goto :goto_2

    :cond_2
    move-object v6, p5

    :goto_2
    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_3

    move-object v7, v1

    goto :goto_3

    :cond_3
    move-object v7, p6

    :goto_3
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_4

    .line 12
    new-instance v0, LY5/a$a;

    const-string v1, "-00"

    invoke-direct {v0, v1}, LY5/a$a;-><init>(Ljava/lang/String;)V

    move-object v8, v0

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 13
    invoke-direct/range {v1 .. v8}, LIe/d;-><init>(LY5/c$b;Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;LY5/a$a;)V

    return-void
.end method

.method private final n(Le6/a;Lt6/b;Ljava/lang/CharSequence;FF)V
    .locals 12

    sget-object v5, Lt6/a;->Start:Lt6/a;

    sget-object v6, Lt6/c;->Center:Lt6/c;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const v7, 0x7fffffff

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p2

    move-object v1, p1

    move-object v2, p3

    move/from16 v3, p4

    move/from16 v4, p5

    invoke-static/range {v0 .. v11}, Lt6/b;->d(Lt6/b;Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIFILjava/lang/Object;)V

    return-void
.end method

.method private final o(Lu6/e;)F
    .locals 8

    iget-object v0, p0, LIe/d;->d:Lt6/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, LIe/d;->g:LY5/a$a;

    invoke-virtual {v1}, LY5/a$a;->a()Ljava/lang/String;

    move-result-object v2

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lt6/b;->t(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IIFILjava/lang/Object;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method private final p(Lu6/e;)F
    .locals 1

    iget-object v0, p0, LIe/d;->f:Lo6/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo6/b;->n()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    return p1
.end method

.method private final q(Lu6/e;)F
    .locals 1

    iget-object v0, p0, LIe/d;->e:Lo6/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lo6/b;->n()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1, v0}, Lu6/e;->g(F)F

    move-result p1

    return p1
.end method

.method private final r(Lu6/e;)F
    .locals 1

    invoke-virtual {p0}, LIe/d;->t()LY5/c$b;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result p1

    invoke-virtual {v0, p1}, LY5/c;->c(Z)Z

    move-result p1

    invoke-virtual {p0}, LIe/d;->t()LY5/c$b;

    move-result-object v0

    instance-of v0, v0, LY5/c$b$b;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->right:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->left:F

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->left:F

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->right:F

    :goto_0
    return p1
.end method

.method private final s(FLk6/b;)F
    .locals 3

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/RectF;->height()F

    move-result v1

    invoke-interface {p2}, Lk6/b;->c()F

    move-result v2

    sub-float/2addr p1, v2

    invoke-interface {p2}, Lk6/b;->a()F

    move-result v2

    invoke-interface {p2}, Lk6/b;->c()F

    move-result p2

    sub-float/2addr v2, p2

    div-float/2addr p1, v2

    mul-float/2addr v1, p1

    sub-float/2addr v0, v1

    return v0
.end method

.method private final u(FFFF)Z
    .locals 4

    iget-object v0, p0, LIe/d;->h:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/RectF;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/RectF;->contains(FFFF)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/RectF;->intersects(FFFF)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_2
    const/4 v2, 0x0

    :cond_3
    :goto_0
    return v2
.end method


# virtual methods
.method public c(Le6/a;)V
    .locals 11

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lu6/e;->c()Lk6/c;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v9, v1, v9}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v0

    iget-object v1, p0, LIe/d;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-direct {p0, v1, v0}, LIe/d;->s(FLk6/b;)F

    move-result v5

    iget-object v1, p0, LIe/d;->e:Lo6/b;

    if-eqz v1, :cond_0

    invoke-interface {p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->left:F

    invoke-direct {p0, p1}, LIe/d;->q(Lu6/e;)F

    move-result v3

    const/4 v4, 0x2

    int-to-float v4, v4

    div-float/2addr v3, v4

    sub-float v3, v5, v3

    invoke-interface {p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v6

    iget v6, v6, Landroid/graphics/RectF;->right:F

    invoke-direct {p0, p1}, LIe/d;->q(Lu6/e;)F

    move-result v7

    div-float/2addr v7, v4

    sub-float v4, v5, v7

    invoke-direct {p0, v2, v3, v6, v4}, LIe/d;->u(FFFF)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v1, v9

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v3, v2, Landroid/graphics/RectF;->left:F

    invoke-interface {p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v4, v2, Landroid/graphics/RectF;->right:F

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lo6/b;->j(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, LIe/d;->f:Lo6/b;

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v3, v0, Landroid/graphics/RectF;->top:F

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-direct {p0, p1}, LIe/d;->p(Lu6/e;)F

    move-result v2

    add-float v4, v0, v2

    invoke-virtual {p0}, LIe/d;->t()LY5/c$b;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v2

    invoke-virtual {v0, v2}, LY5/c;->c(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->right:F

    :goto_2
    move v5, v0

    goto :goto_3

    :cond_3
    invoke-virtual {p0}, LIe/d;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->left:F

    goto :goto_2

    :goto_3
    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lo6/b;->l(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public varargs e([Landroid/graphics/RectF;)V
    .locals 1

    const-string v0, "bounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIe/d;->h:Ljava/util/List;

    invoke-static {p1}, LZg/n;->X([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {v0, p1}, Ly6/a;->b(Ljava/util/List;Ljava/util/Collection;)V

    return-void
.end method

.method public g(Lu6/e;FLg6/b;)V
    .locals 2

    const-string p2, "context"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "outInsets"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LIe/d;->o(Lu6/e;)F

    move-result p1

    invoke-virtual {p0}, LIe/d;->t()LY5/c$b;

    move-result-object p2

    invoke-virtual {p2}, LY5/c;->d()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    move p2, p1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-virtual {p0}, LIe/d;->t()LY5/c$b;

    move-result-object v1

    invoke-virtual {v1}, LY5/c;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    invoke-interface {p3, p2, p1}, Lg6/b;->a(FF)V

    return-void
.end method

.method public getBounds()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, LIe/d;->i:Landroid/graphics/RectF;

    return-object v0
.end method

.method public h(Le6/a;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIe/d;->d:Lt6/b;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, LIe/d;->r(Lu6/e;)F

    move-result v0

    invoke-interface {p1}, Lu6/e;->c()Lk6/c;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v7

    iget-object v1, p0, LIe/d;->b:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-direct {p0, v1, v7}, LIe/d;->s(FLk6/b;)F

    move-result v6

    iget-object v3, p0, LIe/d;->d:Lt6/b;

    iget-object v2, p0, LIe/d;->c:Lz6/c;

    invoke-interface {v2, v1, v7}, Lz6/c;->a(FLk6/b;)Ljava/lang/CharSequence;

    move-result-object v4

    move-object v1, p0

    move-object v2, p1

    move v5, v0

    invoke-direct/range {v1 .. v6}, LIe/d;->n(Le6/a;Lt6/b;Ljava/lang/CharSequence;FF)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public i(Lu6/e;Lg6/c;Lj6/b;)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "outInsets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentProperties"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, LIe/d;->d:Lt6/b;

    if-eqz v1, :cond_0

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lt6/b;->g(Lt6/b;Lu6/e;Ljava/lang/CharSequence;IIFILjava/lang/Object;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    const/4 p3, 0x2

    int-to-float p3, p3

    div-float v4, p1, p3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v0, p2

    move v2, v4

    invoke-static/range {v0 .. v6}, Lg6/c;->l(Lg6/c;FFFFILjava/lang/Object;)Lg6/c;

    return-void
.end method

.method public l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LY5/d$a;->b(LY5/d;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method public t()LY5/c$b;
    .locals 1

    iget-object v0, p0, LIe/d;->a:LY5/c$b;

    return-object v0
.end method
