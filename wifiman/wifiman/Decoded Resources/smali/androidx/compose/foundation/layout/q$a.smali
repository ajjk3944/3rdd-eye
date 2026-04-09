.class final Landroidx/compose/foundation/layout/q$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/q;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:Landroidx/compose/ui/layout/m;

.field final synthetic c:Landroidx/compose/foundation/layout/q;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;Landroidx/compose/foundation/layout/q;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/q$a;->a:Landroidx/compose/ui/layout/t;

    iput-object p2, p0, Landroidx/compose/foundation/layout/q$a;->b:Landroidx/compose/ui/layout/m;

    iput-object p3, p0, Landroidx/compose/foundation/layout/q$a;->c:Landroidx/compose/foundation/layout/q;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 7

    iget-object v1, p0, Landroidx/compose/foundation/layout/q$a;->a:Landroidx/compose/ui/layout/t;

    iget-object v0, p0, Landroidx/compose/foundation/layout/q$a;->b:Landroidx/compose/ui/layout/m;

    iget-object v2, p0, Landroidx/compose/foundation/layout/q$a;->c:Landroidx/compose/foundation/layout/q;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/q;->D2()Lz/N;

    move-result-object v2

    iget-object v3, p0, Landroidx/compose/foundation/layout/q$a;->b:Landroidx/compose/ui/layout/m;

    invoke-interface {v3}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v3

    invoke-interface {v2, v3}, Lz/N;->a(LY0/t;)F

    move-result v2

    invoke-interface {v0, v2}, LY0/d;->x1(F)I

    move-result v2

    iget-object v0, p0, Landroidx/compose/foundation/layout/q$a;->b:Landroidx/compose/ui/layout/m;

    iget-object v3, p0, Landroidx/compose/foundation/layout/q$a;->c:Landroidx/compose/foundation/layout/q;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/q;->D2()Lz/N;

    move-result-object v3

    invoke-interface {v3}, Lz/N;->d()F

    move-result v3

    invoke-interface {v0, v3}, LY0/d;->x1(F)I

    move-result v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/q$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
