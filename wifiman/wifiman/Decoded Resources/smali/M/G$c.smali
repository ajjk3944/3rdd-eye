.class public final LM/G$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/G;-><init>(LF/u0;)V
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

    iput-object p1, p0, LM/G$c;->a:LM/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 7

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v2

    sget-object v0, LM/r;->a:LM/r$a;

    invoke-virtual {v0}, LM/r$a;->m()LM/r;

    move-result-object v6

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, LM/G$c;->f(LR0/Q;JZLM/r;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public b(JLM/r;)Z
    .locals 7

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v2

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, LM/G$c;->f(LR0/Q;JZLM/r;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public c(JLM/r;)Z
    .locals 7

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->F()Landroidx/compose/ui/focus/o;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/compose/ui/focus/o;->f()V

    :cond_2
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-static {v0, p1, p2}, LM/G;->g(LM/G;J)V

    iget-object p1, p0, LM/G$c;->a:LM/G;

    const/4 p2, -0x1

    invoke-static {p1, p2}, LM/G;->k(LM/G;I)V

    iget-object p1, p0, LM/G$c;->a:LM/G;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-static {p1, v1, v0, p2}, LM/G;->w(LM/G;ZILjava/lang/Object;)V

    iget-object p1, p0, LM/G$c;->a:LM/G;

    invoke-virtual {p1}, LM/G;->O()LR0/Q;

    move-result-object v2

    iget-object p1, p0, LM/G$c;->a:LM/G;

    invoke-static {p1}, LM/G;->c(LM/G;)J

    move-result-wide v3

    const/4 v5, 0x1

    move-object v1, p0

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, LM/G$c;->f(LR0/Q;JZLM/r;)V

    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(J)Z
    .locals 7

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, LM/G$c;->a:LM/G;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LM/G;->k(LM/G;I)V

    iget-object v0, p0, LM/G$c;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v2

    sget-object v0, LM/r;->a:LM/r$a;

    invoke-virtual {v0}, LM/r$a;->m()LM/r;

    move-result-object v6

    const/4 v5, 0x0

    move-object v1, p0

    move-wide v3, p1

    invoke-virtual/range {v1 .. v6}, LM/G$c;->f(LR0/Q;JZLM/r;)V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final f(LR0/Q;JZLM/r;)V
    .locals 8

    iget-object v0, p0, LM/G$c;->a:LM/G;

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    move-object v6, p5

    invoke-static/range {v0 .. v7}, LM/G;->m(LM/G;LR0/Q;JZZLM/r;Z)J

    move-result-wide p1

    iget-object p3, p0, LM/G$c;->a:LM/G;

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, LF/q;->Cursor:LF/q;

    goto :goto_0

    :cond_0
    sget-object p1, LF/q;->Selection:LF/q;

    :goto_0
    invoke-static {p3, p1}, LM/G;->j(LM/G;LF/q;)V

    return-void
.end method
