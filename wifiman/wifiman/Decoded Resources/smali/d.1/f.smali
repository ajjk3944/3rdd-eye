.class final Ld/f;
.super Lc/F;
.source "SourceFile"


# instance fields
.field private d:LIi/N;

.field private e:Lmh/p;

.field private f:Ld/e;

.field private g:Z


# direct methods
.method public constructor <init>(ZLIi/N;Lmh/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lc/F;-><init>(Z)V

    iput-object p2, p0, Ld/f;->d:LIi/N;

    iput-object p3, p0, Ld/f;->e:Lmh/p;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    invoke-super {p0}, Lc/F;->c()V

    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld/e;->a()V

    :cond_0
    iget-object v0, p0, Ld/f;->f:Ld/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ld/e;->f(Z)V

    :goto_0
    iput-boolean v1, p0, Ld/f;->g:Z

    return-void
.end method

.method public d()V
    .locals 4

    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld/e;->d()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ld/e;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Ld/f;->f:Ld/e;

    :cond_0
    iget-object v0, p0, Ld/f;->f:Ld/e;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    new-instance v0, Ld/e;

    iget-object v2, p0, Ld/f;->d:LIi/N;

    iget-object v3, p0, Ld/f;->e:Lmh/p;

    invoke-direct {v0, v2, v1, v3, p0}, Ld/e;-><init>(LIi/N;ZLmh/p;Lc/F;)V

    iput-object v0, p0, Ld/f;->f:Ld/e;

    :cond_1
    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ld/e;->b()Z

    :cond_2
    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0, v1}, Ld/e;->f(Z)V

    :goto_0
    iput-boolean v1, p0, Ld/f;->g:Z

    return-void
.end method

.method public e(Lc/b;)V
    .locals 1

    invoke-super {p0, p1}, Lc/F;->e(Lc/b;)V

    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ld/e;->e(Lc/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, LKi/k;->b(Ljava/lang/Object;)LKi/k;

    :cond_0
    return-void
.end method

.method public f(Lc/b;)V
    .locals 3

    invoke-super {p0, p1}, Lc/F;->f(Lc/b;)V

    iget-object p1, p0, Ld/f;->f:Ld/e;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ld/e;->a()V

    :cond_0
    invoke-virtual {p0}, Lc/F;->g()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    new-instance p1, Ld/e;

    iget-object v1, p0, Ld/f;->d:LIi/N;

    iget-object v2, p0, Ld/f;->e:Lmh/p;

    invoke-direct {p1, v1, v0, v2, p0}, Ld/e;-><init>(LIi/N;ZLmh/p;Lc/F;)V

    iput-object p1, p0, Ld/f;->f:Ld/e;

    :cond_1
    iput-boolean v0, p0, Ld/f;->g:Z

    return-void
.end method

.method public final l(Lmh/p;)V
    .locals 0

    iput-object p1, p0, Ld/f;->e:Lmh/p;

    return-void
.end method

.method public final m(Z)V
    .locals 1

    if-nez p1, :cond_0

    iget-boolean v0, p0, Ld/f;->g:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc/F;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld/f;->f:Ld/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ld/e;->a()V

    :cond_0
    invoke-virtual {p0, p1}, Lc/F;->j(Z)V

    return-void
.end method

.method public final n(LIi/N;)V
    .locals 0

    iput-object p1, p0, Ld/f;->d:LIi/N;

    return-void
.end method
