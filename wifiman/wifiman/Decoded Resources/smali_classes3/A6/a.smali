.class public LA6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LA6/a$a;
    }
.end annotation


# static fields
.field private static final e:LA6/a$a;


# instance fields
.field private final a:LY5/b;

.field private final b:Ljava/util/ArrayList;

.field private final c:Lg6/c;

.field private final d:Lg6/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LA6/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LA6/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LA6/a;->e:LA6/a$a;

    return-void
.end method

.method public constructor <init>(LY5/b;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string/jumbo v2, "axisManager"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v1, v0, LA6/a;->a:LY5/b;

    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, v0, LA6/a;->b:Ljava/util/ArrayList;

    new-instance v1, Lg6/c;

    const/16 v8, 0xf

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, v1

    invoke-direct/range {v3 .. v9}, Lg6/c;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, LA6/a;->c:Lg6/c;

    new-instance v1, Lg6/c;

    const/16 v15, 0xf

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v10, v1

    invoke-direct/range {v10 .. v16}, Lg6/c;-><init>(FFFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, LA6/a;->d:Lg6/c;

    return-void
.end method


# virtual methods
.method public varargs a(Lu6/e;Landroid/graphics/RectF;Lb6/b;LB6/a;Lj6/b;[Lg6/a;)Landroid/graphics/RectF;
    .locals 4

    const-string/jumbo v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "contentBounds"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chart"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "segmentProperties"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "chartInsetter"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {v0}, Lg6/c;->b()V

    iget-object v0, p0, LA6/a;->d:Lg6/c;

    invoke-virtual {v0}, Lg6/c;->b()V

    if-eqz p4, :cond_0

    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v0

    invoke-interface {p4, p1, v0}, LB6/a;->b(Lu6/e;F)F

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
    iget-object v1, p0, LA6/a;->a:LY5/b;

    iget-object v2, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, LY5/b;->a(Ljava/util/List;)V

    invoke-static {p6}, LZg/n;->X([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p6

    check-cast p6, Ljava/lang/Iterable;

    iget-object v1, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p6

    :goto_2
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg6/a;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object p6, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-interface {p3}, Lb6/b;->j()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p6, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object p6, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-virtual {p6, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p6, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p6

    :goto_3
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/a;

    iget-object v2, p0, LA6/a;->d:Lg6/c;

    invoke-interface {v1, p1, v2, p5}, Lg6/a;->i(Lu6/e;Lg6/c;Lj6/b;)V

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    iget-object v2, p0, LA6/a;->d:Lg6/c;

    invoke-virtual {v1, v2}, Lg6/c;->p(Lg6/c;)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result p5

    iget-object p6, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {p6}, Lg6/c;->i()F

    move-result p6

    sub-float/2addr p5, p6

    sub-float/2addr p5, v0

    iget-object p6, p0, LA6/a;->b:Ljava/util/ArrayList;

    invoke-interface {p6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p6

    :goto_4
    invoke-interface {p6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg6/a;

    iget-object v2, p0, LA6/a;->d:Lg6/c;

    invoke-interface {v1, p1, p5, v2}, Lg6/a;->g(Lu6/e;FLg6/b;)V

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    iget-object v2, p0, LA6/a;->d:Lg6/c;

    invoke-virtual {v1, v2}, Lg6/c;->p(Lg6/c;)V

    goto :goto_4

    :cond_4
    new-instance p5, Landroid/graphics/RectF;

    invoke-direct {p5}, Landroid/graphics/RectF;-><init>()V

    iget p6, p2, Landroid/graphics/RectF;->left:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v2

    invoke-virtual {v1, v2}, Lg6/c;->e(Z)F

    move-result v1

    add-float/2addr p6, v1

    iput p6, p5, Landroid/graphics/RectF;->left:F

    iget p6, p2, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {v1}, Lg6/c;->h()F

    move-result v1

    add-float/2addr p6, v1

    iput p6, p5, Landroid/graphics/RectF;->top:F

    iget p6, p2, Landroid/graphics/RectF;->right:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-interface {p1}, Lu6/e;->h()Z

    move-result v2

    invoke-virtual {v1, v2}, Lg6/c;->f(Z)F

    move-result v1

    sub-float/2addr p6, v1

    iput p6, p5, Landroid/graphics/RectF;->right:F

    iget p6, p2, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {v1}, Lg6/c;->c()F

    move-result v1

    sub-float/2addr p6, v1

    sub-float/2addr p6, v0

    iput p6, p5, Landroid/graphics/RectF;->bottom:F

    iget p6, p5, Landroid/graphics/RectF;->left:F

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p6

    iget v1, p5, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget v2, p5, Landroid/graphics/RectF;->right:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget v3, p5, Landroid/graphics/RectF;->bottom:F

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-interface {p3, p6, v1, v2, v3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    iget-object p6, p0, LA6/a;->a:LY5/b;

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {p6, p1, p2, p5, v1}, LY5/b;->j(Lu6/e;Landroid/graphics/RectF;Landroid/graphics/RectF;Lg6/c;)V

    if-eqz p4, :cond_5

    iget p1, p2, Landroid/graphics/RectF;->left:F

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object p6

    iget p6, p6, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {v1}, Lg6/c;->c()F

    move-result v1

    add-float/2addr p6, v1

    invoke-static {p6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p6

    iget p2, p2, Landroid/graphics/RectF;->right:F

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p3}, Lw6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object p3

    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    iget-object v1, p0, LA6/a;->c:Lg6/c;

    invoke-virtual {v1}, Lg6/c;->c()F

    move-result v1

    add-float/2addr p3, v1

    add-float/2addr p3, v0

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p4, p1, p6, p2, p3}, Lw6/a;->l(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V

    :cond_5
    return-object p5
.end method
