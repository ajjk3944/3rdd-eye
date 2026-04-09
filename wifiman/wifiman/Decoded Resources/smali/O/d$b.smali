.class final LO/d$b;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO/d;->a(Landroidx/compose/ui/e;LO/g;Z)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LO/g;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LO/g;Z)V
    .locals 0

    iput-object p1, p0, LO/d$b;->a:LO/g;

    iput-boolean p2, p0, LO/d$b;->b:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/graphics/c;)V
    .locals 3

    iget-object v0, p0, LO/d$b;->a:LO/g;

    invoke-virtual {v0}, LO/g;->i()F

    move-result v0

    invoke-interface {p1}, Landroidx/compose/ui/graphics/c;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/m;->g(J)F

    move-result v1

    sub-float/2addr v0, v1

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->f(F)V

    iget-boolean v0, p0, LO/d$b;->b:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, LO/d$b;->a:LO/g;

    invoke-virtual {v0}, LO/g;->k()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lr/G;->e()Lr/E;

    move-result-object v0

    iget-object v1, p0, LO/d$b;->a:LO/g;

    invoke-virtual {v1}, LO/g;->i()F

    move-result v1

    iget-object v2, p0, LO/d$b;->a:LO/g;

    invoke-virtual {v2}, LO/g;->l()F

    move-result v2

    div-float/2addr v1, v2

    invoke-interface {v0, v1}, Lr/E;->a(F)F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v2, v0, v1

    if-gez v2, :cond_0

    move v0, v1

    :cond_0
    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v2, v0, v1

    if-lez v2, :cond_1

    move v0, v1

    :cond_1
    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->i(F)V

    invoke-interface {p1, v0}, Landroidx/compose/ui/graphics/c;->g(F)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroidx/compose/ui/graphics/c;

    invoke-virtual {p0, p1}, LO/d$b;->a(Landroidx/compose/ui/graphics/c;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
