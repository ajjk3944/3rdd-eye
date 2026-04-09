.class final Landroidx/compose/ui/platform/x$n;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/platform/x;->D0(Landroidx/compose/ui/platform/i1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/platform/i1;

.field final synthetic b:Landroidx/compose/ui/platform/x;


# direct methods
.method constructor <init>(Landroidx/compose/ui/platform/i1;Landroidx/compose/ui/platform/x;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    iput-object p2, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    iget-object v0, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v0}, Landroidx/compose/ui/platform/i1;->a()LJ0/h;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v1}, Landroidx/compose/ui/platform/i1;->e()LJ0/h;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v2}, Landroidx/compose/ui/platform/i1;->b()Ljava/lang/Float;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/i1;->c()Ljava/lang/Float;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v0, :cond_0

    if-eqz v2, :cond_0

    invoke-virtual {v0}, LJ0/h;->c()Lmh/a;

    move-result-object v5

    invoke-interface {v5}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    sub-float/2addr v5, v2

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v3, :cond_1

    invoke-virtual {v1}, LJ0/h;->c()Lmh/a;

    move-result-object v2

    invoke-interface {v2}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    cmpg-float v3, v5, v4

    if-nez v3, :cond_2

    cmpg-float v2, v2, v4

    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/i1;->d()I

    move-result v3

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/x;->I(Landroidx/compose/ui/platform/x;I)I

    move-result v2

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v3}, Landroidx/compose/ui/platform/x;->v(Landroidx/compose/ui/platform/x;)Lo/m;

    move-result-object v3

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->y(Landroidx/compose/ui/platform/x;)I

    move-result v4

    invoke-virtual {v3, v4}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/k1;

    if-eqz v3, :cond_3

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    :try_start_0
    invoke-static {v4}, Landroidx/compose/ui/platform/x;->w(Landroidx/compose/ui/platform/x;)LG1/t;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v4, v3}, Landroidx/compose/ui/platform/x;->s(Landroidx/compose/ui/platform/x;Landroidx/compose/ui/platform/k1;)Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {v5, v3}, LG1/t;->d0(Landroid/graphics/Rect;)V

    sget-object v3, LYg/J;->a:LYg/J;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    sget-object v3, LYg/J;->a:LYg/J;

    :cond_3
    :goto_2
    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    invoke-virtual {v3}, Landroidx/compose/ui/platform/x;->l0()Landroidx/compose/ui/platform/r;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    iget-object v3, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    invoke-static {v3}, Landroidx/compose/ui/platform/x;->v(Landroidx/compose/ui/platform/x;)Lo/m;

    move-result-object v3

    invoke-virtual {v3, v2}, Lo/m;->c(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/compose/ui/platform/k1;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Landroidx/compose/ui/platform/k1;->b()LJ0/n;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, LJ0/n;->q()LE0/G;

    move-result-object v3

    if-eqz v3, :cond_6

    iget-object v4, p0, Landroidx/compose/ui/platform/x$n;->b:Landroidx/compose/ui/platform/x;

    if-eqz v0, :cond_4

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->A(Landroidx/compose/ui/platform/x;)Lo/z;

    move-result-object v5

    invoke-virtual {v5, v2, v0}, Lo/z;->t(ILjava/lang/Object;)V

    :cond_4
    if-eqz v1, :cond_5

    invoke-static {v4}, Landroidx/compose/ui/platform/x;->B(Landroidx/compose/ui/platform/x;)Lo/z;

    move-result-object v5

    invoke-virtual {v5, v2, v1}, Lo/z;->t(ILjava/lang/Object;)V

    :cond_5
    invoke-static {v4, v3}, Landroidx/compose/ui/platform/x;->F(Landroidx/compose/ui/platform/x;LE0/G;)V

    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    iget-object v2, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v0}, LJ0/h;->c()Lmh/a;

    move-result-object v0

    invoke-interface {v0}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v2, v0}, Landroidx/compose/ui/platform/i1;->g(Ljava/lang/Float;)V

    :cond_7
    if-eqz v1, :cond_8

    iget-object v0, p0, Landroidx/compose/ui/platform/x$n;->a:Landroidx/compose/ui/platform/i1;

    invoke-virtual {v1}, LJ0/h;->c()Lmh/a;

    move-result-object v1

    invoke-interface {v1}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v0, v1}, Landroidx/compose/ui/platform/i1;->h(Ljava/lang/Float;)V

    :cond_8
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Landroidx/compose/ui/platform/x$n;->a()V

    sget-object v0, LYg/J;->a:LYg/J;

    return-object v0
.end method
