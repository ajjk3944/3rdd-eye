.class final Landroidx/compose/animation/e$g;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/e;->g(ILr/H;Lmh/l;)Landroidx/compose/animation/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/e;

.field final synthetic b:Lmh/l;


# direct methods
.method constructor <init>(Landroidx/compose/animation/e;Lmh/l;)V
    .locals 0

    iput-object p1, p0, Landroidx/compose/animation/e$g;->a:Landroidx/compose/animation/e;

    iput-object p2, p0, Landroidx/compose/animation/e$g;->b:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Integer;
    .locals 6

    iget-object v0, p0, Landroidx/compose/animation/e$g;->a:Landroidx/compose/animation/e;

    invoke-virtual {v0}, Landroidx/compose/animation/e;->q()Lo/H;

    move-result-object v0

    iget-object v1, p0, Landroidx/compose/animation/e$g;->a:Landroidx/compose/animation/e;

    invoke-virtual {v1}, Landroidx/compose/animation/e;->r()Lr/o0;

    move-result-object v1

    invoke-virtual {v1}, Lr/o0;->p()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/Q;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LT/z1;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LT/z1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LY0/r;

    invoke-virtual {v0}, LY0/r;->j()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    sget-object v0, LY0/r;->b:LY0/r$a;

    invoke-virtual {v0}, LY0/r$a;->a()J

    move-result-wide v0

    :goto_0
    iget-object v2, p0, Landroidx/compose/animation/e$g;->b:Lmh/l;

    iget-object v3, p0, Landroidx/compose/animation/e$g;->a:Landroidx/compose/animation/e;

    invoke-static {p1, p1}, LY0/s;->a(II)J

    move-result-wide v4

    invoke-static {v3, v4, v5, v0, v1}, Landroidx/compose/animation/e;->h(Landroidx/compose/animation/e;JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, LY0/n;->h(J)I

    move-result v0

    neg-int v0, v0

    sub-int/2addr v0, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/compose/animation/e$g;->a(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
