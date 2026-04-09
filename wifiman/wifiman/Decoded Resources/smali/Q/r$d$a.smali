.class final LQ/r$d$a;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQ/r$d;->a(LC0/U;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Ljava/util/List;

.field final synthetic d:Ljava/util/List;

.field final synthetic e:LQ/j;

.field final synthetic f:I

.field final synthetic g:I

.field final synthetic h:Lz/f0;

.field final synthetic i:LC0/U;

.field final synthetic j:I

.field final synthetic k:I

.field final synthetic l:Ljava/lang/Integer;

.field final synthetic m:Ljava/util/List;

.field final synthetic n:Ljava/lang/Integer;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;LQ/j;IILz/f0;LC0/U;IILjava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, LQ/r$d$a;->a:Ljava/util/List;

    iput-object p2, p0, LQ/r$d$a;->b:Ljava/util/List;

    iput-object p3, p0, LQ/r$d$a;->c:Ljava/util/List;

    iput-object p4, p0, LQ/r$d$a;->d:Ljava/util/List;

    iput-object p5, p0, LQ/r$d$a;->e:LQ/j;

    iput p6, p0, LQ/r$d$a;->f:I

    iput p7, p0, LQ/r$d$a;->g:I

    iput-object p8, p0, LQ/r$d$a;->h:Lz/f0;

    iput-object p9, p0, LQ/r$d$a;->i:LC0/U;

    iput p10, p0, LQ/r$d$a;->j:I

    iput p11, p0, LQ/r$d$a;->k:I

    iput-object p12, p0, LQ/r$d$a;->l:Ljava/lang/Integer;

    iput-object p13, p0, LQ/r$d$a;->m:Ljava/util/List;

    iput-object p14, p0, LQ/r$d$a;->n:Ljava/lang/Integer;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, LQ/r$d$a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_0

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/layout/t;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, v0, LQ/r$d$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    move v4, v3

    :goto_1
    if-ge v4, v2, :cond_1

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Landroidx/compose/ui/layout/t;

    const/4 v11, 0x4

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v6, p1

    invoke-static/range {v6 .. v12}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    iget-object v1, v0, LQ/r$d$a;->c:Ljava/util/List;

    iget v2, v0, LQ/r$d$a;->f:I

    iget v4, v0, LQ/r$d$a;->g:I

    iget-object v5, v0, LQ/r$d$a;->h:Lz/f0;

    iget-object v6, v0, LQ/r$d$a;->i:LC0/U;

    iget v7, v0, LQ/r$d$a;->j:I

    iget v8, v0, LQ/r$d$a;->k:I

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v9

    move v10, v3

    :goto_2
    if-ge v10, v9, :cond_2

    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    move-object v13, v11

    check-cast v13, Landroidx/compose/ui/layout/t;

    sub-int v11, v2, v4

    div-int/lit8 v11, v11, 0x2

    invoke-interface {v6}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v12

    invoke-interface {v5, v6, v12}, Lz/f0;->d(LY0/d;LY0/t;)I

    move-result v12

    add-int v14, v11, v12

    sub-int v15, v7, v8

    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p1

    invoke-static/range {v12 .. v18}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_2
    iget-object v1, v0, LQ/r$d$a;->d:Ljava/util/List;

    iget v2, v0, LQ/r$d$a;->j:I

    iget-object v4, v0, LQ/r$d$a;->l:Ljava/lang/Integer;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    move v6, v3

    :goto_3
    if-ge v6, v5, :cond_4

    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Landroidx/compose/ui/layout/t;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_4

    :cond_3
    move v7, v3

    :goto_4
    sub-int v11, v2, v7

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    iget-object v1, v0, LQ/r$d$a;->e:LQ/j;

    if-eqz v1, :cond_5

    iget-object v2, v0, LQ/r$d$a;->m:Ljava/util/List;

    iget v4, v0, LQ/r$d$a;->j:I

    iget-object v5, v0, LQ/r$d$a;->n:Ljava/lang/Integer;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    :goto_5
    if-ge v3, v6, :cond_5

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Landroidx/compose/ui/layout/t;

    invoke-virtual {v1}, LQ/j;->b()I

    move-result v10

    invoke-static {v5}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v7

    sub-int v11, v4, v7

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/layout/t$a;->h(Landroidx/compose/ui/layout/t$a;Landroidx/compose/ui/layout/t;IIFILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LQ/r$d$a;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
