.class final Landroidx/compose/foundation/layout/u$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/u;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/layout/u;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/t;

.field final synthetic d:I

.field final synthetic e:Landroidx/compose/ui/layout/m;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/u;ILandroidx/compose/ui/layout/t;ILandroidx/compose/ui/layout/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/u$a;->a:Landroidx/compose/foundation/layout/u;

    iput p2, p0, Landroidx/compose/foundation/layout/u$a;->b:I

    iput-object p3, p0, Landroidx/compose/foundation/layout/u$a;->c:Landroidx/compose/ui/layout/t;

    iput p4, p0, Landroidx/compose/foundation/layout/u$a;->d:I

    iput-object p5, p0, Landroidx/compose/foundation/layout/u$a;->e:Landroidx/compose/ui/layout/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 8

    iget-object v0, p0, Landroidx/compose/foundation/layout/u$a;->a:Landroidx/compose/foundation/layout/u;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/u;->D2()Lmh/p;

    move-result-object v0

    iget v1, p0, Landroidx/compose/foundation/layout/u$a;->b:I

    iget-object v2, p0, Landroidx/compose/foundation/layout/u$a;->c:Landroidx/compose/ui/layout/t;

    invoke-virtual {v2}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v2

    sub-int/2addr v1, v2

    iget v2, p0, Landroidx/compose/foundation/layout/u$a;->d:I

    iget-object v3, p0, Landroidx/compose/foundation/layout/u$a;->c:Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->C0()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, LY0/s;->a(II)J

    move-result-wide v1

    invoke-static {v1, v2}, LY0/r;->b(J)LY0/r;

    move-result-object v1

    iget-object v2, p0, Landroidx/compose/foundation/layout/u$a;->e:Landroidx/compose/ui/layout/m;

    invoke-interface {v2}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lmh/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/n;

    invoke-virtual {v0}, LY0/n;->n()J

    move-result-wide v3

    iget-object v2, p0, Landroidx/compose/foundation/layout/u$a;->c:Landroidx/compose/ui/layout/t;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroidx/compose/ui/layout/t$a;->j(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;JFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/u$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
