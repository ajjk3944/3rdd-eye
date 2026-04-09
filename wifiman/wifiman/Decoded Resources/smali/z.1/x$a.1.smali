.class final Lz/x$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz/x;->d([Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/m;I[III[IIII)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:[I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:[Landroidx/compose/ui/layout/t;

.field final synthetic f:Lz/x;

.field final synthetic g:I

.field final synthetic h:Landroidx/compose/ui/layout/m;

.field final synthetic i:I

.field final synthetic j:[I


# direct methods
.method constructor <init>([IIII[Landroidx/compose/ui/layout/t;Lz/x;ILandroidx/compose/ui/layout/m;I[I)V
    .locals 0

    iput-object p1, p0, Lz/x$a;->a:[I

    iput p2, p0, Lz/x$a;->b:I

    iput p3, p0, Lz/x$a;->c:I

    iput p4, p0, Lz/x$a;->d:I

    iput-object p5, p0, Lz/x$a;->e:[Landroidx/compose/ui/layout/t;

    iput-object p6, p0, Lz/x$a;->f:Lz/x;

    iput p7, p0, Lz/x$a;->g:I

    iput-object p8, p0, Lz/x$a;->h:Landroidx/compose/ui/layout/m;

    iput p9, p0, Lz/x$a;->i:I

    iput-object p10, p0, Lz/x$a;->j:[I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 11

    iget-object v0, p0, Lz/x$a;->a:[I

    if-eqz v0, :cond_0

    iget v1, p0, Lz/x$a;->b:I

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lz/x$a;->c:I

    :goto_1
    iget v2, p0, Lz/x$a;->d:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lz/x$a;->e:[Landroidx/compose/ui/layout/t;

    aget-object v2, v2, v1

    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    iget-object v3, p0, Lz/x$a;->f:Lz/x;

    invoke-static {v2}, Lz/S;->d(Landroidx/compose/ui/layout/t;)Lz/V;

    move-result-object v5

    iget v6, p0, Lz/x$a;->g:I

    iget-object v4, p0, Lz/x$a;->h:Landroidx/compose/ui/layout/m;

    invoke-interface {v4}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v7

    iget v8, p0, Lz/x$a;->i:I

    move-object v4, v2

    invoke-interface/range {v3 .. v8}, Lz/x;->m(Landroidx/compose/ui/layout/t;Lz/V;ILY0/t;I)I

    move-result v3

    add-int v6, v3, v0

    iget-object v3, p0, Lz/x$a;->f:Lz/x;

    invoke-interface {v3}, Lz/x;->j()Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lz/x$a;->j:[I

    iget v4, p0, Lz/x$a;->c:I

    sub-int v4, v1, v4

    aget v5, v3, v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    move-object v4, v2

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object v3, p0, Lz/x$a;->j:[I

    iget v4, p0, Lz/x$a;->c:I

    sub-int v4, v1, v4

    aget v7, v3, v4

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, p1

    move-object v4, v2

    move v5, v6

    move v6, v7

    move v7, v10

    invoke-static/range {v3 .. v9}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, Lz/x$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
