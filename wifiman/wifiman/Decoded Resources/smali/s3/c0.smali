.class public final Ls3/c0;
.super Ls3/M;
.source "SourceFile"


# instance fields
.field final synthetic g:Ls3/c;


# direct methods
.method public constructor <init>(Ls3/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Ls3/c0;->g:Ls3/c;

    invoke-direct {p0, p1, p2, p3}, Ls3/M;-><init>(Ls3/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(Lr3/b;)V
    .locals 1

    iget-object v0, p0, Ls3/c0;->g:Ls3/c;

    invoke-virtual {v0}, Ls3/c;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls3/c0;->g:Ls3/c;

    invoke-static {v0}, Ls3/c;->f0(Ls3/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Ls3/c0;->g:Ls3/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Ls3/c;->b0(Ls3/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, Ls3/c0;->g:Ls3/c;

    iget-object v0, v0, Ls3/c;->p:Ls3/c$c;

    invoke-interface {v0, p1}, Ls3/c$c;->c(Lr3/b;)V

    iget-object v0, p0, Ls3/c0;->g:Ls3/c;

    invoke-virtual {v0, p1}, Ls3/c;->J(Lr3/b;)V

    return-void
.end method

.method protected final g()Z
    .locals 2

    iget-object v0, p0, Ls3/c0;->g:Ls3/c;

    iget-object v0, v0, Ls3/c;->p:Ls3/c$c;

    sget-object v1, Lr3/b;->e:Lr3/b;

    invoke-interface {v0, v1}, Ls3/c$c;->c(Lr3/b;)V

    const/4 v0, 0x1

    return v0
.end method
