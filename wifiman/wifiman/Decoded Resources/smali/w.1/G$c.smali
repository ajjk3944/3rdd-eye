.class final Lw/G$c;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/G;->h(Lmh/l;Lmh/a;Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw/G;

.field final synthetic b:F

.field final synthetic c:Lmh/l;


# direct methods
.method constructor <init>(Lw/G;FLmh/l;)V
    .locals 0

    iput-object p1, p0, Lw/G$c;->a:Lw/G;

    iput p2, p0, Lw/G$c;->b:F

    iput-object p3, p0, Lw/G$c;->c:Lmh/l;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 11

    iget-object v0, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v0}, Lw/G;->b(Lw/G;)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v0, p1, p2}, Lw/G;->f(Lw/G;J)V

    :cond_0
    new-instance v0, Lr/m;

    iget-object v1, p0, Lw/G$c;->a:Lw/G;

    invoke-virtual {v1}, Lw/G;->i()F

    move-result v1

    invoke-direct {v0, v1}, Lr/m;-><init>(F)V

    iget v1, p0, Lw/G$c;->b:F

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-nez v1, :cond_1

    iget-object v1, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v1}, Lw/G;->d(Lw/G;)Lr/v0;

    move-result-object v1

    new-instance v2, Lr/m;

    iget-object v3, p0, Lw/G$c;->a:Lw/G;

    invoke-virtual {v3}, Lw/G;->i()F

    move-result v3

    invoke-direct {v2, v3}, Lr/m;-><init>(F)V

    invoke-static {}, Lw/G;->a()Lw/G$a;

    move-result-object v3

    invoke-virtual {v3}, Lw/G$a;->a()Lr/m;

    move-result-object v3

    iget-object v4, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v4}, Lw/G;->c(Lw/G;)Lr/m;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4}, Lr/v0;->b(Lr/q;Lr/q;Lr/q;)J

    move-result-wide v1

    :goto_0
    move-wide v7, v1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v1}, Lw/G;->b(Lw/G;)J

    move-result-wide v1

    sub-long v1, p1, v1

    long-to-float v1, v1

    iget v2, p0, Lw/G$c;->b:F

    div-float/2addr v1, v2

    invoke-static {v1}, Loh/b;->g(F)J

    move-result-wide v1

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v1}, Lw/G;->d(Lw/G;)Lr/v0;

    move-result-object v1

    invoke-static {}, Lw/G;->a()Lw/G$a;

    move-result-object v2

    invoke-virtual {v2}, Lw/G$a;->a()Lr/m;

    move-result-object v5

    iget-object v2, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v2}, Lw/G;->c(Lw/G;)Lr/m;

    move-result-object v6

    move-wide v2, v7

    move-object v4, v0

    invoke-interface/range {v1 .. v6}, Lr/v0;->c(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object v1

    check-cast v1, Lr/m;

    invoke-virtual {v1}, Lr/m;->f()F

    move-result v9

    iget-object v10, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v10}, Lw/G;->d(Lw/G;)Lr/v0;

    move-result-object v1

    invoke-static {}, Lw/G;->a()Lw/G$a;

    move-result-object v2

    invoke-virtual {v2}, Lw/G$a;->a()Lr/m;

    move-result-object v5

    iget-object v2, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v2}, Lw/G;->c(Lw/G;)Lr/m;

    move-result-object v6

    move-wide v2, v7

    invoke-interface/range {v1 .. v6}, Lr/v0;->f(JLr/q;Lr/q;Lr/q;)Lr/q;

    move-result-object v0

    check-cast v0, Lr/m;

    invoke-static {v10, v0}, Lw/G;->g(Lw/G;Lr/m;)V

    iget-object v0, p0, Lw/G$c;->a:Lw/G;

    invoke-static {v0, p1, p2}, Lw/G;->f(Lw/G;J)V

    iget-object p1, p0, Lw/G$c;->a:Lw/G;

    invoke-virtual {p1}, Lw/G;->i()F

    move-result p1

    sub-float/2addr p1, v9

    iget-object p2, p0, Lw/G$c;->a:Lw/G;

    invoke-virtual {p2, v9}, Lw/G;->j(F)V

    iget-object p2, p0, Lw/G$c;->c:Lmh/l;

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lw/G$c;->a(J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
