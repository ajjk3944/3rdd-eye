.class final Landroidx/compose/foundation/layout/n$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/n;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/foundation/layout/n;

.field final synthetic b:Landroidx/compose/ui/layout/m;

.field final synthetic c:Landroidx/compose/ui/layout/t;


# direct methods
.method constructor <init>(Landroidx/compose/foundation/layout/n;Landroidx/compose/ui/layout/m;Landroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/foundation/layout/n$a;->a:Landroidx/compose/foundation/layout/n;

    iput-object p2, p0, Landroidx/compose/foundation/layout/n$a;->b:Landroidx/compose/ui/layout/m;

    iput-object p3, p0, Landroidx/compose/foundation/layout/n$a;->c:Landroidx/compose/ui/layout/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 20

    move-object/from16 v0, p0

    iget-object v1, v0, Landroidx/compose/foundation/layout/n$a;->a:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v1}, Landroidx/compose/foundation/layout/n;->D2()Lmh/l;

    move-result-object v1

    iget-object v2, v0, Landroidx/compose/foundation/layout/n$a;->b:Landroidx/compose/ui/layout/m;

    invoke-interface {v1, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LY0/n;

    invoke-virtual {v1}, LY0/n;->n()J

    move-result-wide v1

    iget-object v3, v0, Landroidx/compose/foundation/layout/n$a;->a:Landroidx/compose/foundation/layout/n;

    invoke-virtual {v3}, Landroidx/compose/foundation/layout/n;->E2()Z

    move-result v3

    if-eqz v3, :cond_0

    iget-object v5, v0, Landroidx/compose/foundation/layout/n$a;->c:Landroidx/compose/ui/layout/t;

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v6

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v7

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v4, p1

    invoke-static/range {v4 .. v11}, Landroidx/compose/ui/layout/t$a;->p(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFLmh/l;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v13, v0, Landroidx/compose/foundation/layout/n$a;->c:Landroidx/compose/ui/layout/t;

    invoke-static {v1, v2}, LY0/n;->h(J)I

    move-result v14

    invoke-static {v1, v2}, LY0/n;->i(J)I

    move-result v15

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v19}, Landroidx/compose/ui/layout/t$a;->v(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFLmh/l;ILjava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/n$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
