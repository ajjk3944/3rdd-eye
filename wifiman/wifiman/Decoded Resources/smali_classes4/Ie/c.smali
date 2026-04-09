.class public final LIe/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY5/d;


# instance fields
.field private final a:Ljava/util/List;

.field private final b:Lz6/c;

.field private final c:Lt6/b;

.field private final d:Lo6/b;

.field private final e:Lo6/b;

.field private final f:LY5/c$a$a;

.field private final g:La6/b$a;

.field private final h:Ljava/util/List;

.field private final i:Landroid/graphics/RectF;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;)V
    .locals 1

    const-string v0, "labels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LIe/c;->a:Ljava/util/List;

    .line 3
    iput-object p2, p0, LIe/c;->b:Lz6/c;

    .line 4
    iput-object p3, p0, LIe/c;->c:Lt6/b;

    .line 5
    iput-object p4, p0, LIe/c;->d:Lo6/b;

    .line 6
    iput-object p5, p0, LIe/c;->e:Lo6/b;

    .line 7
    sget-object p1, LY5/c$a$a;->a:LY5/c$a$a;

    iput-object p1, p0, LIe/c;->f:LY5/c$a$a;

    .line 8
    new-instance p1, La6/b$a;

    const/4 p2, 0x3

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct {p1, p4, p4, p2, p3}, La6/b$a;-><init>(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, LIe/c;->g:La6/b$a;

    .line 9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LIe/c;->h:Ljava/util/List;

    .line 10
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, LIe/c;->i:Landroid/graphics/RectF;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 11
    new-instance p2, Lz6/b;

    invoke-direct {p2}, Lz6/b;-><init>()V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p7, 0x0

    if-eqz p2, :cond_1

    move-object v3, p7

    goto :goto_0

    :cond_1
    move-object v3, p3

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move-object v4, p7

    goto :goto_1

    :cond_2
    move-object v4, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v5, p7

    goto :goto_2

    :cond_3
    move-object v5, p5

    :goto_2
    move-object v0, p0

    move-object v1, p1

    .line 12
    invoke-direct/range {v0 .. v5}, LIe/c;-><init>(Ljava/util/List;Lz6/c;Lt6/b;Lo6/b;Lo6/b;)V

    return-void
.end method

.method private final n(Lu6/e;)F
    .locals 1

    iget-object v0, p0, LIe/c;->e:Lo6/b;

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

.method private final o(Le6/a;FLk6/b;)F
    .locals 3

    invoke-virtual {p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v1

    invoke-static {v0, v1}, Ly6/i;->c(Landroid/graphics/RectF;Z)F

    move-result v0

    invoke-virtual {p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v2

    invoke-static {v1, v2}, Ly6/i;->b(Landroid/graphics/RectF;Z)F

    move-result v1

    invoke-virtual {p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result p1

    invoke-static {v2, p1}, Ly6/i;->c(Landroid/graphics/RectF;Z)F

    move-result p1

    sub-float/2addr v1, p1

    invoke-interface {p3}, Lk6/b;->e()F

    move-result p1

    sub-float/2addr p2, p1

    invoke-interface {p3}, Lk6/b;->b()F

    move-result p1

    invoke-interface {p3}, Lk6/b;->e()F

    move-result p3

    sub-float/2addr p1, p3

    div-float/2addr p2, p1

    mul-float/2addr v1, p2

    add-float/2addr v0, v1

    return v0
.end method

.method private final q(LY5/c$a;)Lt6/c;
    .locals 0

    invoke-virtual {p1}, LY5/c;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lt6/c;->Bottom:Lt6/c;

    goto :goto_0

    :cond_0
    sget-object p1, Lt6/c;->Top:Lt6/c;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public c(Le6/a;)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v13, p1

    const-string v1, "context"

    invoke-static {v13, v1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v1

    invoke-virtual {v1}, LY5/c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->top:F

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    :goto_0
    invoke-direct/range {p0 .. p1}, LIe/c;->n(Lu6/e;)F

    move-result v2

    add-float/2addr v2, v1

    invoke-virtual/range {p0 .. p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v3

    invoke-virtual {v3}, LY5/c;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    move v14, v2

    goto :goto_1

    :cond_1
    move v14, v1

    :goto_1
    invoke-interface/range {p1 .. p1}, Lu6/e;->c()Lk6/c;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, v3, v2, v3}, Lk6/c;->b(Lk6/c;LY5/c$b;ILjava/lang/Object;)Lk6/d;

    move-result-object v15

    iget-object v1, v0, LIe/c;->a:Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :cond_2
    :goto_2
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v9

    invoke-direct {v0, v13, v9, v15}, LIe/c;->o(Le6/a;FLk6/b;)F

    move-result v10

    iget-object v1, v0, LIe/c;->d:Lo6/b;

    if-eqz v1, :cond_3

    invoke-interface/range {p1 .. p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v3, v2, Landroid/graphics/RectF;->top:F

    invoke-interface/range {p1 .. p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move v5, v10

    invoke-static/range {v1 .. v8}, Lo6/b;->l(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V

    :cond_3
    iget-object v1, v0, LIe/c;->c:Lt6/b;

    if-eqz v1, :cond_2

    iget-object v2, v0, LIe/c;->b:Lz6/c;

    invoke-interface {v2, v9, v15}, Lz6/c;->a(FLk6/b;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v2

    invoke-direct {v0, v2}, LIe/c;->q(LY5/c$a;)Lt6/c;

    move-result-object v7

    const/16 v11, 0xd0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move v4, v10

    move v5, v14

    move/from16 v10, v17

    invoke-static/range {v1 .. v12}, Lt6/b;->d(Lt6/b;Lu6/b;Ljava/lang/CharSequence;FFLt6/a;Lt6/c;IIFILjava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object v1, v0, LIe/c;->e:Lo6/b;

    if-eqz v1, :cond_6

    invoke-interface/range {p1 .. p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v3, v2, Landroid/graphics/RectF;->left:F

    invoke-interface/range {p1 .. p1}, Le6/a;->k()Landroid/graphics/RectF;

    move-result-object v2

    iget v4, v2, Landroid/graphics/RectF;->right:F

    invoke-virtual/range {p0 .. p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v2

    invoke-virtual {v2}, LY5/c;->a()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual/range {p0 .. p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->top:F

    goto :goto_3

    :cond_5
    invoke-virtual/range {p0 .. p0}, LIe/c;->getBounds()Landroid/graphics/RectF;

    move-result-object v2

    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    :goto_3
    invoke-direct/range {p0 .. p1}, LIe/c;->n(Lu6/e;)F

    move-result v5

    const/4 v6, 0x2

    int-to-float v6, v6

    div-float/2addr v5, v6

    add-float/2addr v5, v2

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v1 .. v8}, Lo6/b;->j(Lo6/b;Lu6/b;FFFFILjava/lang/Object;)V

    :cond_6
    return-void
.end method

.method public varargs e([Landroid/graphics/RectF;)V
    .locals 1

    const-string v0, "bounds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LIe/c;->h:Ljava/util/List;

    invoke-static {p1}, LZg/n;->X([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-static {v0, p1}, Ly6/a;->b(Ljava/util/List;Ljava/util/Collection;)V

    return-void
.end method

.method public g(Lu6/e;FLg6/b;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LY5/d$a;->a(LY5/d;Lu6/e;FLg6/b;)V

    return-void
.end method

.method public getBounds()Landroid/graphics/RectF;
    .locals 1

    iget-object v0, p0, LIe/c;->i:Landroid/graphics/RectF;

    return-object v0
.end method

.method public h(Le6/a;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

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

    iget-object v1, p0, LIe/c;->c:Lt6/b;

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
    const/4 p3, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    goto :goto_1

    :cond_1
    move p1, p3

    :goto_1
    iget-object v0, p0, LIe/c;->g:La6/b$a;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, La6/b$a;->a(F)F

    move-result v0

    invoke-virtual {p2, v0}, Lg6/c;->n(F)Lg6/c;

    invoke-virtual {p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v0

    invoke-virtual {v0}, LY5/c;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    invoke-virtual {p2, v0}, Lg6/c;->o(F)V

    invoke-virtual {p0}, LIe/c;->p()LY5/c$a$a;

    move-result-object v0

    invoke-virtual {v0}, LY5/c;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    move p3, p1

    :cond_3
    invoke-virtual {p2, p3}, Lg6/c;->m(F)V

    return-void
.end method

.method public l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, LY5/d$a;->b(LY5/d;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    return-void
.end method

.method public p()LY5/c$a$a;
    .locals 1

    iget-object v0, p0, LIe/c;->f:LY5/c$a$a;

    return-object v0
.end method
