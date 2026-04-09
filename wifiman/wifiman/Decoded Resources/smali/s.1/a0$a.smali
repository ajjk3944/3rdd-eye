.class final Ls/a0$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls/a0;->b(Landroidx/compose/ui/layout/m;LC0/B;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ls/a0;

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/t;


# direct methods
.method constructor <init>(Ls/a0;ILandroidx/compose/ui/layout/t;)V
    .locals 0

    iput-object p1, p0, Ls/a0$a;->a:Ls/a0;

    iput p2, p0, Ls/a0$a;->b:I

    iput-object p3, p0, Ls/a0$a;->c:Landroidx/compose/ui/layout/t;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 4

    iget-object v0, p0, Ls/a0$a;->a:Ls/a0;

    invoke-virtual {v0}, Ls/a0;->D2()Landroidx/compose/foundation/o;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/compose/foundation/o;->m()I

    move-result v0

    iget v1, p0, Ls/a0$a;->b:I

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lsh/m;->k(III)I

    move-result v0

    iget-object v1, p0, Ls/a0$a;->a:Ls/a0;

    invoke-virtual {v1}, Ls/a0;->E2()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, Ls/a0$a;->b:I

    sub-int/2addr v0, v1

    goto :goto_0

    :cond_0
    neg-int v0, v0

    :goto_0
    iget-object v1, p0, Ls/a0$a;->a:Ls/a0;

    invoke-virtual {v1}, Ls/a0;->F2()Z

    move-result v1

    if-eqz v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    iget-object v3, p0, Ls/a0$a;->a:Ls/a0;

    invoke-virtual {v3}, Ls/a0;->F2()Z

    move-result v3

    if-eqz v3, :cond_2

    move v2, v0

    :cond_2
    new-instance v0, Ls/a0$a$a;

    iget-object v3, p0, Ls/a0$a;->c:Landroidx/compose/ui/layout/t;

    invoke-direct {v0, v3, v1, v2}, Ls/a0$a$a;-><init>(Landroidx/compose/ui/layout/t;II)V

    invoke-virtual {p1, v0}, Landroidx/compose/ui/layout/t$a;->A(Lmh/l;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Ls/a0$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
