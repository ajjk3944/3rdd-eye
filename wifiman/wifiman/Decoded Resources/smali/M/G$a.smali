.class public final LM/G$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/U;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/G;->r()LF/U;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LM/G;


# direct methods
.method constructor <init>(LM/G;)V
    .locals 0

    iput-object p1, p0, LM/G$a;->a:LM/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, LM/G$a;->a:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->e(LM/G;Ll0/g;)V

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 2

    iget-object p1, p0, LM/G$a;->a:LM/G;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, LM/G;->G(Z)J

    move-result-wide p1

    invoke-static {p1, p2}, LM/w;->a(J)J

    move-result-wide p1

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1, p2}, LF/j0;->k(J)J

    move-result-wide p1

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-static {v0, p1, p2}, LM/G;->g(LM/G;J)V

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-static {p1, p2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-static {v0, p1}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object p1, p0, LM/G$a;->a:LM/G;

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LM/G;->h(LM/G;J)V

    iget-object p1, p0, LM/G$a;->a:LM/G;

    sget-object p2, LF/p;->Cursor:LF/p;

    invoke-static {p1, p2}, LM/G;->i(LM/G;LF/p;)V

    iget-object p1, p0, LM/G$a;->a:LM/G;

    const/4 p2, 0x0

    invoke-static {p1, p2}, LM/G;->l(LM/G;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, LM/G$a;->a:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->e(LM/G;Ll0/g;)V

    return-void
.end method

.method public e(J)V
    .locals 6

    iget-object v0, p0, LM/G$a;->a:LM/G;

    invoke-static {v0}, LM/G;->d(LM/G;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LM/G;->h(LM/G;J)V

    iget-object p1, p0, LM/G$a;->a:LM/G;

    invoke-virtual {p1}, LM/G;->L()LF/E;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object p1, p0, LM/G$a;->a:LM/G;

    invoke-static {p1}, LM/G;->c(LM/G;)J

    move-result-wide v1

    invoke-static {p1}, LM/G;->d(LM/G;)J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ll0/g;->r(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p2

    invoke-static {p1, p2}, LM/G;->e(LM/G;Ll0/g;)V

    invoke-virtual {p1}, LM/G;->J()LR0/H;

    move-result-object p2

    invoke-virtual {p1}, LM/G;->A()Ll0/g;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll0/g;->v()J

    move-result-wide v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result v0

    invoke-interface {p2, v0}, LR0/H;->a(I)I

    move-result p2

    invoke-static {p2, p2}, LL0/T;->b(II)J

    move-result-wide v0

    invoke-virtual {p1}, LM/G;->O()LR0/Q;

    move-result-object p2

    invoke-virtual {p2}, LR0/Q;->h()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, LL0/S;->g(JJ)Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, LM/G;->L()LF/E;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, LF/E;->y()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LM/G;->H()Lu0/a;

    move-result-object p2

    if-eqz p2, :cond_2

    sget-object v2, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {v2}, Lu0/b$a;->b()I

    move-result v2

    invoke-interface {p2, v2}, Lu0/a;->a(I)V

    :cond_2
    :goto_0
    invoke-virtual {p1}, LM/G;->K()Lmh/l;

    move-result-object p2

    invoke-virtual {p1}, LM/G;->O()LR0/Q;

    move-result-object v2

    invoke-virtual {v2}, LR0/Q;->f()LL0/d;

    move-result-object v2

    invoke-static {p1, v2, v0, v1}, LM/G;->a(LM/G;LL0/d;J)LR0/Q;

    move-result-object p1

    invoke-interface {p2, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public onCancel()V
    .locals 0

    return-void
.end method
