.class final LF/m$j;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF/m;->a(LR0/Q;Lmh/l;Landroidx/compose/ui/e;LL0/U;LR0/c0;Lmh/l;Ly/m;Lm0/l0;ZIILR0/s;LF/C;ZZLmh/q;LT/l;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LF/E;

.field final synthetic b:Z

.field final synthetic c:Landroidx/compose/ui/platform/E1;

.field final synthetic d:LM/G;

.field final synthetic e:LR0/Q;

.field final synthetic f:LR0/H;


# direct methods
.method constructor <init>(LF/E;ZLandroidx/compose/ui/platform/E1;LM/G;LR0/Q;LR0/H;)V
    .locals 0

    iput-object p1, p0, LF/m$j;->a:LF/E;

    iput-boolean p2, p0, LF/m$j;->b:Z

    iput-object p3, p0, LF/m$j;->c:Landroidx/compose/ui/platform/E1;

    iput-object p4, p0, LF/m$j;->d:LM/G;

    iput-object p5, p0, LF/m$j;->e:LR0/Q;

    iput-object p6, p0, LF/m$j;->f:LR0/H;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LC0/r;)V
    .locals 4

    iget-object v0, p0, LF/m$j;->a:LF/E;

    invoke-virtual {v0, p1}, LF/E;->F(LC0/r;)V

    iget-object v0, p0, LF/m$j;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, LF/j0;->i(LC0/r;)V

    :goto_0
    iget-boolean p1, p0, LF/m$j;->b:Z

    if-eqz p1, :cond_4

    iget-object p1, p0, LF/m$j;->a:LF/E;

    invoke-virtual {p1}, LF/E;->d()LF/q;

    move-result-object p1

    sget-object v0, LF/q;->Selection:LF/q;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_2

    iget-object p1, p0, LF/m$j;->a:LF/E;

    invoke-virtual {p1}, LF/E;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LF/m$j;->c:Landroidx/compose/ui/platform/E1;

    invoke-interface {p1}, Landroidx/compose/ui/platform/E1;->a()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, LF/m$j;->d:LM/G;

    invoke-virtual {p1}, LM/G;->l0()V

    goto :goto_1

    :cond_1
    iget-object p1, p0, LF/m$j;->d:LM/G;

    invoke-virtual {p1}, LM/G;->R()V

    :goto_1
    iget-object p1, p0, LF/m$j;->a:LF/E;

    iget-object v0, p0, LF/m$j;->d:LM/G;

    invoke-static {v0, v1}, LM/H;->c(LM/G;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, LF/E;->M(Z)V

    iget-object p1, p0, LF/m$j;->a:LF/E;

    iget-object v0, p0, LF/m$j;->d:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/H;->c(LM/G;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, LF/E;->L(Z)V

    iget-object p1, p0, LF/m$j;->a:LF/E;

    iget-object v0, p0, LF/m$j;->e:LR0/Q;

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    invoke-virtual {p1, v0}, LF/E;->J(Z)V

    goto :goto_2

    :cond_2
    iget-object p1, p0, LF/m$j;->a:LF/E;

    invoke-virtual {p1}, LF/E;->d()LF/q;

    move-result-object p1

    sget-object v0, LF/q;->Cursor:LF/q;

    if-ne p1, v0, :cond_3

    iget-object p1, p0, LF/m$j;->a:LF/E;

    iget-object v0, p0, LF/m$j;->d:LM/G;

    invoke-static {v0, v1}, LM/H;->c(LM/G;Z)Z

    move-result v0

    invoke-virtual {p1, v0}, LF/E;->J(Z)V

    :cond_3
    :goto_2
    iget-object p1, p0, LF/m$j;->a:LF/E;

    iget-object v0, p0, LF/m$j;->e:LR0/Q;

    iget-object v1, p0, LF/m$j;->f:LR0/H;

    invoke-static {p1, v0, v1}, LF/m;->j(LF/E;LR0/Q;LR0/H;)V

    iget-object p1, p0, LF/m$j;->a:LF/E;

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, LF/m$j;->a:LF/E;

    iget-object v1, p0, LF/m$j;->e:LR0/Q;

    iget-object v2, p0, LF/m$j;->f:LR0/H;

    invoke-virtual {v0}, LF/E;->g()LR0/Z;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, LF/W;->a:LF/W$a;

    invoke-virtual {v0, v3, v1, v2, p1}, LF/W$a;->k(LR0/Z;LR0/Q;LR0/H;LF/j0;)V

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LC0/r;

    invoke-virtual {p0, p1}, LF/m$j;->a(LC0/r;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
