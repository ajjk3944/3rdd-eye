.class final Landroidx/compose/material/b$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/material/b;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/m;

.field final synthetic b:Landroidx/compose/material/b;

.field final synthetic c:Landroidx/compose/ui/layout/t;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/m;Landroidx/compose/material/b;Landroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/material/b$a;->a:Landroidx/compose/ui/layout/m;

    iput-object p2, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    iput-object p3, p0, Landroidx/compose/material/b$a;->c:Landroidx/compose/ui/layout/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 9

    iget-object v0, p0, Landroidx/compose/material/b$a;->a:Landroidx/compose/ui/layout/m;

    invoke-interface {v0}, LC0/o;->a1()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    invoke-virtual {v0}, Landroidx/compose/material/b;->E2()LN/b;

    move-result-object v0

    invoke-virtual {v0}, LN/b;->o()LN/D;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    invoke-virtual {v1}, Landroidx/compose/material/b;->E2()LN/b;

    move-result-object v1

    invoke-virtual {v1}, LN/b;->x()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LN/D;->e(Ljava/lang/Object;)F

    move-result v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    invoke-virtual {v0}, Landroidx/compose/material/b;->E2()LN/b;

    move-result-object v0

    invoke-virtual {v0}, LN/b;->A()F

    move-result v0

    :goto_0
    iget-object v1, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    invoke-virtual {v1}, Landroidx/compose/material/b;->D2()Lw/q;

    move-result-object v1

    sget-object v2, Lw/q;->Horizontal:Lw/q;

    const/4 v3, 0x0

    if-ne v1, v2, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    iget-object v2, p0, Landroidx/compose/material/b$a;->b:Landroidx/compose/material/b;

    invoke-virtual {v2}, Landroidx/compose/material/b;->D2()Lw/q;

    move-result-object v2

    sget-object v4, Lw/q;->Vertical:Lw/q;

    if-ne v2, v4, :cond_2

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    iget-object v3, p0, Landroidx/compose/material/b$a;->c:Landroidx/compose/ui/layout/t;

    invoke-static {v1}, Loh/b;->e(F)I

    move-result v4

    invoke-static {v0}, Loh/b;->e(F)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/material/b$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
