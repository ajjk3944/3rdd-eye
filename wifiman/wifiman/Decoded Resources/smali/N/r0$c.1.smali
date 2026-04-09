.class final LN/r0$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN/r0;->b(Landroidx/compose/ui/layout/m;Ljava/util/List;J)LC0/D;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:Landroidx/compose/ui/layout/t;

.field final synthetic d:Landroidx/compose/ui/layout/t;

.field final synthetic e:Landroidx/compose/ui/layout/t;

.field final synthetic f:Landroidx/compose/ui/layout/t;

.field final synthetic g:Landroidx/compose/ui/layout/t;

.field final synthetic h:Landroidx/compose/ui/layout/t;

.field final synthetic i:LN/r0;

.field final synthetic j:Landroidx/compose/ui/layout/m;


# direct methods
.method constructor <init>(IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;LN/r0;Landroidx/compose/ui/layout/m;)V
    .locals 0

    iput p1, p0, LN/r0$c;->a:I

    iput p2, p0, LN/r0$c;->b:I

    iput-object p3, p0, LN/r0$c;->c:Landroidx/compose/ui/layout/t;

    iput-object p4, p0, LN/r0$c;->d:Landroidx/compose/ui/layout/t;

    iput-object p5, p0, LN/r0$c;->e:Landroidx/compose/ui/layout/t;

    iput-object p6, p0, LN/r0$c;->f:Landroidx/compose/ui/layout/t;

    iput-object p7, p0, LN/r0$c;->g:Landroidx/compose/ui/layout/t;

    iput-object p8, p0, LN/r0$c;->h:Landroidx/compose/ui/layout/t;

    iput-object p9, p0, LN/r0$c;->i:LN/r0;

    iput-object p10, p0, LN/r0$c;->j:Landroidx/compose/ui/layout/m;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/layout/t$a;)V
    .locals 14

    iget v1, p0, LN/r0$c;->a:I

    iget v2, p0, LN/r0$c;->b:I

    iget-object v3, p0, LN/r0$c;->c:Landroidx/compose/ui/layout/t;

    iget-object v4, p0, LN/r0$c;->d:Landroidx/compose/ui/layout/t;

    iget-object v5, p0, LN/r0$c;->e:Landroidx/compose/ui/layout/t;

    iget-object v6, p0, LN/r0$c;->f:Landroidx/compose/ui/layout/t;

    iget-object v7, p0, LN/r0$c;->g:Landroidx/compose/ui/layout/t;

    iget-object v8, p0, LN/r0$c;->h:Landroidx/compose/ui/layout/t;

    iget-object v0, p0, LN/r0$c;->i:LN/r0;

    invoke-static {v0}, LN/r0;->a(LN/r0;)F

    move-result v9

    iget-object v0, p0, LN/r0$c;->i:LN/r0;

    invoke-static {v0}, LN/r0;->g(LN/r0;)Z

    move-result v10

    iget-object v0, p0, LN/r0$c;->j:Landroidx/compose/ui/layout/m;

    invoke-interface {v0}, LY0/d;->getDensity()F

    move-result v11

    iget-object v0, p0, LN/r0$c;->j:Landroidx/compose/ui/layout/m;

    invoke-interface {v0}, LC0/o;->getLayoutDirection()LY0/t;

    move-result-object v12

    iget-object v0, p0, LN/r0$c;->i:LN/r0;

    invoke-static {v0}, LN/r0;->d(LN/r0;)Lz/N;

    move-result-object v13

    move-object v0, p1

    invoke-static/range {v0 .. v13}, LN/q0;->f(Landroidx/compose/ui/layout/t$a;IILandroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;Landroidx/compose/ui/layout/t;FZFLY0/t;Lz/N;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/layout/t$a;

    invoke-virtual {p0, p1}, LN/r0$c;->a(Landroidx/compose/ui/layout/t$a;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
