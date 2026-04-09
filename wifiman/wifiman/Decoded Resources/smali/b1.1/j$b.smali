.class final Lb1/j$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb1/j;->e(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;Lg1/h;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg1/h;


# direct methods
.method constructor <init>(Lg1/h;)V
    .locals 0

    iput-object p1, p0, Lb1/j$b;->a:Lg1/h;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 3

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->f:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->g:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->f:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->f:F

    :goto_0
    iget-object v2, p0, Lb1/j$b;->a:Lg1/h;

    iget v2, v2, Lg1/h;->g:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lb1/j$b;->a:Lg1/h;

    iget v1, v1, Lg1/h;->g:F

    :goto_1
    invoke-static {v0, v1}, Lm0/p1;->a(FF)J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Landroidx/compose/ui/graphics/c;->y1(J)V

    :cond_3
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->h:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->h:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->m(F)V

    :cond_4
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->i:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->i:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->d(F)V

    :cond_5
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->j:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->j:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->e(F)V

    :cond_6
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->k:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_7

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->k:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->j(F)V

    :cond_7
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->l:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_8

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->l:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->f(F)V

    :cond_8
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->m:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_9

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->m:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->o(F)V

    :cond_9
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->n:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->o:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_a
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->n:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz v0, :cond_b

    move v0, v1

    goto :goto_2

    :cond_b
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->n:F

    :goto_2
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->i(F)V

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->o:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v1, v0, Lg1/h;->o:F

    :goto_3
    invoke-interface {p1, v1}, Landroidx/compose/ui/graphics/c;->g(F)V

    :cond_d
    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->p:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lb1/j$b;->a:Lg1/h;

    iget v0, v0, Lg1/h;->p:F

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->a(F)V

    :cond_e
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, Lb1/j$b;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
