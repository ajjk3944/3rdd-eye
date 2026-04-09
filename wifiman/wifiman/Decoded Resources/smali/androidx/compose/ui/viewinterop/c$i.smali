.class final Landroidx/compose/ui/viewinterop/c$i;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/c;-><init>(Landroid/content/Context;LT/q;ILx0/b;Landroid/view/View;LE0/m0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/c;

.field final synthetic b:LE0/G;

.field final synthetic c:Landroidx/compose/ui/viewinterop/c;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/c;LE0/G;Landroidx/compose/ui/viewinterop/c;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/ui/viewinterop/c$i;->a:Landroidx/compose/ui/viewinterop/c;

    iput-object p2, p0, Landroidx/compose/ui/viewinterop/c$i;->b:LE0/G;

    iput-object p3, p0, Landroidx/compose/ui/viewinterop/c$i;->c:Landroidx/compose/ui/viewinterop/c;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lo0/f;)V
    .locals 5

    iget-object v0, p0, Landroidx/compose/ui/viewinterop/c$i;->a:Landroidx/compose/ui/viewinterop/c;

    iget-object v1, p0, Landroidx/compose/ui/viewinterop/c$i;->b:LE0/G;

    iget-object v2, p0, Landroidx/compose/ui/viewinterop/c$i;->c:Landroidx/compose/ui/viewinterop/c;

    invoke-interface {p1}, Lo0/f;->k1()Lo0/d;

    move-result-object p1

    invoke-interface {p1}, Lo0/d;->d()Lm0/n0;

    move-result-object p1

    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/c;->getView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_2

    const/4 v3, 0x1

    invoke-static {v0, v3}, Landroidx/compose/ui/viewinterop/c;->r(Landroidx/compose/ui/viewinterop/c;Z)V

    invoke-virtual {v1}, LE0/G;->n0()LE0/m0;

    move-result-object v1

    instance-of v3, v1, Landroidx/compose/ui/platform/r;

    if-eqz v3, :cond_0

    check-cast v1, Landroidx/compose/ui/platform/r;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    invoke-static {p1}, Lm0/H;->d(Lm0/n0;)Landroid/graphics/Canvas;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroidx/compose/ui/platform/r;->k0(Landroidx/compose/ui/viewinterop/c;Landroid/graphics/Canvas;)V

    :cond_1
    const/4 p1, 0x0

    invoke-static {v0, p1}, Landroidx/compose/ui/viewinterop/c;->r(Landroidx/compose/ui/viewinterop/c;Z)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lo0/f;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/c$i;->a(Lo0/f;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
