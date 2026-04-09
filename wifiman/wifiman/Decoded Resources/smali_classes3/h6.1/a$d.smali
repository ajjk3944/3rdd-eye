.class final Lh6/a$d;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh6/a;->n(Le6/a;Lx6/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lh6/a;

.field final synthetic b:Lh6/a$a;

.field final synthetic c:Lkotlin/jvm/internal/K;

.field final synthetic d:Lkotlin/jvm/internal/K;

.field final synthetic e:Le6/a;


# direct methods
.method constructor <init>(Lh6/a;Lh6/a$a;Lkotlin/jvm/internal/K;Lkotlin/jvm/internal/K;Le6/a;)V
    .locals 0

    iput-object p1, p0, Lh6/a$d;->a:Lh6/a;

    iput-object p2, p0, Lh6/a$d;->b:Lh6/a$a;

    iput-object p3, p0, Lh6/a$d;->c:Lkotlin/jvm/internal/K;

    iput-object p4, p0, Lh6/a$d;->d:Lkotlin/jvm/internal/K;

    iput-object p5, p0, Lh6/a$d;->e:Le6/a;

    const/4 p1, 0x4

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILx6/a;FF)V
    .locals 8

    const-string/jumbo p1, "entry"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->H()Landroid/graphics/Path;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Path;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->H()Landroid/graphics/Path;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p1, p0, Lh6/a$d;->b:Lh6/a$a;

    invoke-virtual {p1}, Lh6/a$a;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->G()Landroid/graphics/Path;

    move-result-object p1

    iget-object v0, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {v0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    invoke-virtual {p1, p3, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->G()Landroid/graphics/Path;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lh6/a$d;->b:Lh6/a$a;

    invoke-virtual {p1}, Lh6/a$a;->l()Lh6/a$a$a;

    move-result-object v0

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->H()Landroid/graphics/Path;

    move-result-object v1

    iget-object p1, p0, Lh6/a$d;->c:Lkotlin/jvm/internal/K;

    iget v2, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->d:Lkotlin/jvm/internal/K;

    iget v3, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->e:Le6/a;

    invoke-interface {p1}, Le6/a;->i()Lj6/b;

    move-result-object v6

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v7

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v7}, Lh6/a$a$a;->a(Landroid/graphics/Path;FFFFLj6/b;Landroid/graphics/RectF;)V

    iget-object p1, p0, Lh6/a$d;->b:Lh6/a$a;

    invoke-virtual {p1}, Lh6/a$a;->h()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lh6/a$d;->b:Lh6/a$a;

    invoke-virtual {p1}, Lh6/a$a;->l()Lh6/a$a$a;

    move-result-object v0

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->G()Landroid/graphics/Path;

    move-result-object v1

    iget-object p1, p0, Lh6/a$d;->c:Lkotlin/jvm/internal/K;

    iget v2, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->d:Lkotlin/jvm/internal/K;

    iget v3, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->e:Le6/a;

    invoke-interface {p1}, Le6/a;->i()Lj6/b;

    move-result-object v6

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v7

    move v4, p3

    move v5, p4

    invoke-interface/range {v0 .. v7}, Lh6/a$a$a;->a(Landroid/graphics/Path;FFFFLj6/b;Landroid/graphics/RectF;)V

    :cond_1
    :goto_0
    iget-object p1, p0, Lh6/a$d;->c:Lkotlin/jvm/internal/K;

    iput p3, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->d:Lkotlin/jvm/internal/K;

    iput p4, p1, Lkotlin/jvm/internal/K;->a:F

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object p1

    iget p1, p1, Landroid/graphics/RectF;->left:F

    iget-object v0, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {v0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->right:F

    cmpg-float v0, p3, v0

    if-gtz v0, :cond_2

    cmpg-float p1, p1, p3

    if-gtz p1, :cond_2

    iget-object p1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {p1}, Lh6/a;->F()Ljava/util/HashMap;

    move-result-object p1

    iget-object v0, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {v0}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v0

    iget v0, v0, Landroid/graphics/RectF;->top:F

    iget-object v1, p0, Lh6/a$d;->a:Lh6/a;

    invoke-virtual {v1}, Lb6/a;->getBounds()Landroid/graphics/RectF;

    move-result-object v1

    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    invoke-static {p4, v0, v1}, Lsh/m;->j(FFF)F

    move-result p4

    iget-object v0, p0, Lh6/a$d;->b:Lh6/a$a;

    invoke-virtual {v0}, Lh6/a$a;->i()I

    move-result v0

    invoke-static {p1, p3, p4, p2, v0}, Lb6/c;->a(Ljava/util/HashMap;FFLx6/a;I)V

    :cond_2
    return-void
.end method

.method public bridge synthetic y(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    check-cast p2, Lx6/a;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    check-cast p4, Ljava/lang/Number;

    invoke-virtual {p4}, Ljava/lang/Number;->floatValue()F

    move-result p4

    invoke-virtual {p0, p1, p2, p3, p4}, Lh6/a$d;->a(ILx6/a;FF)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
