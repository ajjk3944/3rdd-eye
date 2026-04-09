.class final LJ/j$y;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->n0(Ldh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:LJ/j;


# direct methods
.method constructor <init>(LJ/j;)V
    .locals 0

    iput-object p1, p0, LJ/j$y;->a:LJ/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Ll0/i;
    .locals 6

    iget-object v0, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object v0

    invoke-virtual {v0}, LI/o1;->l()LH/h;

    move-result-object v0

    invoke-virtual {v0}, LH/h;->f()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v1, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v1}, LJ/j;->n(LJ/j;)LJ/n;

    move-result-object v1

    sget-object v2, LJ/n;->Cursor:LJ/n;

    if-eq v1, v2, :cond_1

    :cond_0
    if-nez v0, :cond_7

    iget-object v0, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v0}, LJ/j;->n(LJ/j;)LJ/n;

    move-result-object v0

    sget-object v1, LJ/n;->Selection:LJ/n;

    if-ne v0, v1, :cond_7

    :cond_1
    iget-object v0, p0, LJ/j$y;->a:LJ/j;

    invoke-virtual {v0}, LJ/j;->V()LF/p;

    move-result-object v0

    if-nez v0, :cond_7

    iget-object v0, p0, LJ/j$y;->a:LJ/j;

    invoke-virtual {v0}, LJ/j;->j0()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v0}, LJ/j;->l(LJ/j;)LC0/r;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {v0}, LM/A;->b(LC0/r;)Ll0/i;

    move-result-object v0

    goto :goto_0

    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_6

    iget-object v2, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v2}, LJ/j;->l(LJ/j;)LC0/r;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ll0/i;->p()J

    move-result-wide v3

    invoke-interface {v2, v3, v4}, LC0/r;->o0(J)J

    move-result-wide v2

    invoke-static {v2, v3}, Ll0/g;->d(J)Ll0/g;

    move-result-object v2

    goto :goto_1

    :cond_3
    move-object v2, v1

    :goto_1
    invoke-static {v2}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll0/g;->v()J

    move-result-wide v2

    invoke-virtual {v0}, Ll0/i;->m()J

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Ll0/j;->b(JJ)Ll0/i;

    move-result-object v0

    iget-object v2, p0, LJ/j$y;->a:LJ/j;

    invoke-static {v2}, LJ/j;->e(LJ/j;)Ll0/i;

    move-result-object v2

    invoke-virtual {v0, v2}, Ll0/i;->v(Ll0/i;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v1, v2

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {v1, v0}, Ll0/i;->t(Ll0/i;)Ll0/i;

    move-result-object v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    goto :goto_2

    :cond_6
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    goto :goto_2

    :cond_7
    sget-object v0, Ll0/i;->e:Ll0/i$a;

    invoke-virtual {v0}, Ll0/i$a;->a()Ll0/i;

    move-result-object v0

    :goto_2
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LJ/j$y;->a()Ll0/i;

    move-result-object v0

    return-object v0
.end method
