.class final LF/s$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/s;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/m;

.field final synthetic b:LF/s;

.field final synthetic c:Landroidx/compose/ui/layout/t;

.field final synthetic d:I


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/m;LF/s;Landroidx/compose/ui/layout/t;I)V
    .locals 0

    iput-object p1, p0, LF/s$a;->a:Landroidx/compose/ui/layout/m;

    iput-object p2, p0, LF/s$a;->b:LF/s;

    iput-object p3, p0, LF/s$a;->c:Landroidx/compose/ui/layout/t;

    iput p4, p0, LF/s$a;->d:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 8

    iget-object v0, p0, LF/s$a;->a:Landroidx/compose/ui/layout/m;

    iget-object v1, p0, LF/s$a;->b:LF/s;

    invoke-virtual {v1}, LF/s;->a()I

    move-result v1

    iget-object v2, p0, LF/s$a;->b:LF/s;

    invoke-virtual {v2}, LF/s;->e()LR0/a0;

    move-result-object v2

    iget-object v3, p0, LF/s$a;->b:LF/s;

    invoke-virtual {v3}, LF/s;->d()Lmh/a;

    move-result-object v3

    invoke-interface {v3}, Lmh/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LF/j0;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, LF/j0;->f()LL0/M;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    iget-object v4, p0, LF/s$a;->a:Landroidx/compose/ui/layout/m;

    invoke-interface {v4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v4

    sget-object v5, LY0/t;->Rtl:LY0/t;

    if-ne v4, v5, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    iget-object v5, p0, LF/s$a;->c:Landroidx/compose/ui/layout/t;

    invoke-virtual {v5}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v5

    invoke-static/range {v0 .. v5}, LF/e0;->a(LY0/d;ILR0/a0;LL0/M;ZI)Ll0/i;

    move-result-object v0

    iget-object v1, p0, LF/s$a;->b:LF/s;

    invoke-virtual {v1}, LF/s;->c()LF/f0;

    move-result-object v1

    sget-object v2, Lw/q;->Horizontal:Lw/q;

    iget v3, p0, LF/s$a;->d:I

    iget-object v4, p0, LF/s$a;->c:Landroidx/compose/ui/layout/t;

    invoke-virtual {v4}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v4

    invoke-virtual {v1, v2, v0, v3, v4}, LF/f0;->j(Lw/q;Ll0/i;II)V

    iget-object v0, p0, LF/s$a;->b:LF/s;

    invoke-virtual {v0}, LF/s;->c()LF/f0;

    move-result-object v0

    invoke-virtual {v0}, LF/f0;->d()F

    move-result v0

    neg-float v0, v0

    iget-object v2, p0, LF/s$a;->c:Landroidx/compose/ui/layout/t;

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LF/s$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
