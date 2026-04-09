.class final LN/X0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/X0;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/layout/t;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:I

.field final synthetic f:Landroidx/compose/ui/layout/t;

.field final synthetic g:Landroidx/compose/ui/layout/t;

.field final synthetic h:Landroidx/compose/ui/layout/t;

.field final synthetic i:Landroidx/compose/ui/layout/t;

.field final synthetic j:LN/X0;

.field final synthetic k:I

.field final synthetic l:I

.field final synthetic m:Landroidx/compose/ui/layout/m;


# direct methods
.method constructor <init>(Landroidx/compose/ui/layout/t;IIIILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;LN/X0;IILandroidx/compose/ui/layout/m;)V
    .locals 0

    iput-object p1, p0, LN/X0$c;->a:Landroidx/compose/ui/layout/t;

    iput p2, p0, LN/X0$c;->b:I

    iput p3, p0, LN/X0$c;->c:I

    iput p4, p0, LN/X0$c;->d:I

    iput p5, p0, LN/X0$c;->e:I

    iput-object p6, p0, LN/X0$c;->f:Landroidx/compose/ui/layout/t;

    iput-object p7, p0, LN/X0$c;->g:Landroidx/compose/ui/layout/t;

    iput-object p8, p0, LN/X0$c;->h:Landroidx/compose/ui/layout/t;

    iput-object p9, p0, LN/X0$c;->i:Landroidx/compose/ui/layout/t;

    iput-object p10, p0, LN/X0$c;->j:LN/X0;

    iput p11, p0, LN/X0$c;->k:I

    iput p12, p0, LN/X0$c;->l:I

    iput-object p13, p0, LN/X0$c;->m:Landroidx/compose/ui/layout/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 26

    move-object/from16 v0, p0

    iget-object v1, v0, LN/X0$c;->a:Landroidx/compose/ui/layout/t;

    if-eqz v1, :cond_0

    iget v1, v0, LN/X0$c;->b:I

    iget v2, v0, LN/X0$c;->c:I

    sub-int/2addr v1, v2

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lsh/m;->d(II)I

    move-result v12

    iget v4, v0, LN/X0$c;->d:I

    iget v5, v0, LN/X0$c;->e:I

    iget-object v6, v0, LN/X0$c;->f:Landroidx/compose/ui/layout/t;

    iget-object v7, v0, LN/X0$c;->a:Landroidx/compose/ui/layout/t;

    iget-object v8, v0, LN/X0$c;->g:Landroidx/compose/ui/layout/t;

    iget-object v9, v0, LN/X0$c;->h:Landroidx/compose/ui/layout/t;

    iget-object v10, v0, LN/X0$c;->i:Landroidx/compose/ui/layout/t;

    iget-object v1, v0, LN/X0$c;->j:LN/X0;

    invoke-static {v1}, LN/X0;->g(LN/X0;)Z

    move-result v11

    iget v1, v0, LN/X0$c;->k:I

    iget v2, v0, LN/X0$c;->l:I

    add-int v13, v1, v2

    iget-object v1, v0, LN/X0$c;->j:LN/X0;

    invoke-static {v1}, LN/X0;->a(LN/X0;)F

    move-result v14

    iget-object v1, v0, LN/X0$c;->m:Landroidx/compose/ui/layout/m;

    invoke-interface {v1}, LY0/d;->getDensity()F

    move-result v15

    move-object/from16 v3, p1

    invoke-static/range {v3 .. v15}, LN/W0;->d(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;ZIIFF)V

    goto :goto_0

    :cond_0
    iget v1, v0, LN/X0$c;->d:I

    iget v2, v0, LN/X0$c;->e:I

    iget-object v3, v0, LN/X0$c;->f:Landroidx/compose/ui/layout/t;

    iget-object v4, v0, LN/X0$c;->g:Landroidx/compose/ui/layout/t;

    iget-object v5, v0, LN/X0$c;->h:Landroidx/compose/ui/layout/t;

    iget-object v6, v0, LN/X0$c;->i:Landroidx/compose/ui/layout/t;

    iget-object v7, v0, LN/X0$c;->j:LN/X0;

    invoke-static {v7}, LN/X0;->g(LN/X0;)Z

    move-result v23

    iget-object v7, v0, LN/X0$c;->m:Landroidx/compose/ui/layout/m;

    invoke-interface {v7}, LY0/d;->getDensity()F

    move-result v24

    iget-object v7, v0, LN/X0$c;->j:LN/X0;

    invoke-static {v7}, LN/X0;->d(LN/X0;)Lz/N;

    move-result-object v25

    move-object/from16 v16, p1

    move/from16 v17, v1

    move/from16 v18, v2

    move-object/from16 v19, v3

    move-object/from16 v20, v4

    move-object/from16 v21, v5

    move-object/from16 v22, v6

    invoke-static/range {v16 .. v25}, LN/W0;->e(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;ZFLz/N;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LN/X0$c;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
