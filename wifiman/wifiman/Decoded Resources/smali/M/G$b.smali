.class public final LM/G$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/G;->Q(Z)LF/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;

.field final synthetic b:Z


# direct methods
.method constructor <init>(LM/G;Z)V
    .locals 0

    iput-object p1, p0, LM/G$b;->a:LM/G;

    iput-boolean p2, p0, LM/G$b;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LM/G$b;->a:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LM/G;->l(LM/G;Z)V

    return-void
.end method

.method public b(J)V
    .locals 2

    iget-object p1, p0, LM/G$b;->a:LM/G;

    iget-boolean p2, p0, LM/G$b;->b:Z

    if-eqz p2, :cond_0

    sget-object p2, LF/p;->SelectionStart:LF/p;

    goto :goto_0

    :cond_0
    sget-object p2, LF/p;->SelectionEnd:LF/p;

    :goto_0
    invoke-static {p1, p2}, LM/G;->i(LM/G;LF/p;)V

    iget-object p1, p0, LM/G$b;->a:LM/G;

    iget-boolean p2, p0, LM/G$b;->b:Z

    invoke-virtual {p1, p2}, LM/G;->G(Z)J

    move-result-wide p1

    invoke-static {p1, p2}, LM/w;->a(J)J

    move-result-wide p1

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual {v0, p1, p2}, LF/j0;->k(J)J

    move-result-wide p1

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-static {v0, p1, p2}, LM/G;->g(LM/G;J)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-static {v0, p1}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object p1, p0, LM/G$b;->a:LM/G;

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LM/G;->h(LM/G;J)V

    iget-object p1, p0, LM/G$b;->a:LM/G;

    const/4 p2, -0x1

    invoke-static {p1, p2}, LM/G;->k(LM/G;I)V

    iget-object p1, p0, LM/G$b;->a:LM/G;

    invoke-virtual {p1}, LM/G;->L()LF/E;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LF/E;->D(Z)V

    :goto_1
    iget-object p1, p0, LM/G$b;->a:LM/G;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LM/G;->l(LM/G;Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public c(J)V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LM/G$b;->a:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    const/4 v1, 0x1

    invoke-static {v0, v1}, LM/G;->l(LM/G;Z)V

    return-void
.end method

.method public e(J)V
    .locals 8

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-static {v0}, LM/G;->d(LM/G;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LM/G;->h(LM/G;J)V

    iget-object p1, p0, LM/G$b;->a:LM/G;

    invoke-static {p1}, LM/G;->c(LM/G;)J

    move-result-wide v0

    iget-object p2, p0, LM/G$b;->a:LM/G;

    invoke-static {p2}, LM/G;->d(LM/G;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object p2

    invoke-static {p1, p2}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object v0, p0, LM/G$b;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v1

    iget-object p1, p0, LM/G$b;->a:LM/G;

    invoke-virtual {p1}, LM/G;->A()Ll0/g;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v2

    iget-boolean v5, p0, LM/G$b;->b:Z

    sget-object p1, LM/r;->a:LM/r$a;

    invoke-virtual {p1}, LM/r$a;->l()LM/r;

    move-result-object v6

    const/4 v7, 0x1

    const/4 v4, 0x0

    invoke-static/range {v0 .. v7}, LM/G;->m(LM/G;LR0/Q;JZZLM/r;Z)J

    iget-object p1, p0, LM/G$b;->a:LM/G;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LM/G;->l(LM/G;Z)V

    return-void
.end method

.method public onCancel()V
    .locals 0

    return-void
.end method
