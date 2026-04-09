.class final Landroidx/compose/foundation/layout/m$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/m;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/layout/m;

.field final synthetic b:Landroidx/compose/ui/layout/t;

.field final synthetic c:Landroidx/compose/ui/layout/m;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/m;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    iput-object p2, p0, Landroidx/compose/foundation/layout/m$a;->b:Landroidx/compose/ui/layout/t;

    iput-object p3, p0, Landroidx/compose/foundation/layout/m$a;->c:Landroidx/compose/ui/layout/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/m;->D2()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v3, v0, Landroidx/compose/foundation/layout/m$a;->b:Landroidx/compose/ui/layout/t;

    iget-object v1, v0, Landroidx/compose/foundation/layout/m$a;->c:Landroidx/compose/ui/layout/m;

    iget-object v2, v0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/m;->E2()F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v4

    iget-object v1, v0, Landroidx/compose/foundation/layout/m$a;->c:Landroidx/compose/ui/layout/m;

    iget-object v2, v0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/m;->F2()F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v8}, Landroidx/compose/ui/layout/t$a;->l(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v10, v0, Landroidx/compose/foundation/layout/m$a;->b:Landroidx/compose/ui/layout/t;

    iget-object v1, v0, Landroidx/compose/foundation/layout/m$a;->c:Landroidx/compose/ui/layout/m;

    iget-object v2, v0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/m;->E2()F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v11

    iget-object v1, v0, Landroidx/compose/foundation/layout/m$a;->c:Landroidx/compose/ui/layout/m;

    iget-object v2, v0, Landroidx/compose/foundation/layout/m$a;->a:Landroidx/compose/foundation/layout/m;

    invoke-virtual {v2}, Landroidx/compose/foundation/layout/m;->F2()F

    move-result v2

    invoke-interface {v1, v2}, LY0/d;->x1(F)I

    move-result v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v9 .. v15}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/m$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
