.class final LI/c1$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/c1;->U2(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LI/c1;

.field final synthetic b:Landroidx/compose/ui/layout/m;

.field final synthetic c:I

.field final synthetic d:Landroidx/compose/ui/layout/t;


# direct methods
.method constructor <init>(LI/c1;Landroidx/compose/ui/layout/m;ILandroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, LI/c1$a;->a:LI/c1;

    iput-object p2, p0, LI/c1$a;->b:Landroidx/compose/ui/layout/m;

    iput p3, p0, LI/c1$a;->c:I

    iput-object p4, p0, LI/c1$a;->d:Landroidx/compose/ui/layout/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget-object v0, p0, LI/c1$a;->a:LI/c1;

    iget-object v1, p0, LI/c1$a;->b:Landroidx/compose/ui/layout/m;

    iget v2, p0, LI/c1$a;->c:I

    iget-object v3, p0, LI/c1$a;->d:Landroidx/compose/ui/layout/t;

    invoke-virtual {v3}, Landroidx/compose/ui/layout/t;->I0()I

    move-result v3

    iget-object v4, p0, LI/c1$a;->a:LI/c1;

    invoke-static {v4}, LI/c1;->L2(LI/c1;)LI/o1;

    move-result-object v4

    invoke-virtual {v4}, LI/o1;->l()LH/h;

    move-result-object v4

    invoke-virtual {v4}, LH/h;->f()J

    move-result-wide v4

    iget-object v6, p0, LI/c1$a;->b:Landroidx/compose/ui/layout/m;

    invoke-interface {v6}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v6

    invoke-static/range {v0 .. v6}, LI/c1;->N2(LI/c1;LY0/d;IIJLY0/t;)V

    iget-object v8, p0, LI/c1$a;->d:Landroidx/compose/ui/layout/t;

    iget-object v0, p0, LI/c1$a;->a:LI/c1;

    invoke-static {v0}, LI/c1;->K2(LI/c1;)Landroidx/compose/foundation/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->m()I

    move-result v0

    neg-int v9, v0

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v7, p1

    invoke-static/range {v7 .. v13}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LI/c1$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
