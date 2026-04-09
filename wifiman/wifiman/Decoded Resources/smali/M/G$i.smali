.class public final LM/G$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LF/U;


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

    iput-object p1, p0, LM/G$i;->a:LM/G;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final f()V
    .locals 5

    iget-object v0, p0, LM/G$i;->a:LM/G;

    const/4 v1, 0x0

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    const/4 v2, 0x1

    invoke-static {v0, v2}, LM/G;->l(LM/G;Z)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-static {v0, v1}, LM/G;->f(LM/G;Ljava/lang/Integer;)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result v0

    iget-object v1, p0, LM/G$i;->a:LM/G;

    if-eqz v0, :cond_0

    sget-object v3, LF/q;->Cursor:LF/q;

    goto :goto_0

    :cond_0
    sget-object v3, LF/q;->Selection:LF/q;

    :goto_0
    invoke-static {v1, v3}, LM/G;->j(LM/G;LF/q;)V

    iget-object v1, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v1}, LM/G;->L()LF/E;

    move-result-object v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    if-nez v0, :cond_2

    iget-object v4, p0, LM/G$i;->a:LM/G;

    invoke-static {v4, v2}, LM/H;->c(LM/G;Z)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v2

    goto :goto_1

    :cond_2
    move v4, v3

    :goto_1
    invoke-virtual {v1, v4}, LF/E;->M(Z)V

    :goto_2
    iget-object v1, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v1}, LM/G;->L()LF/E;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_4

    :cond_3
    if-nez v0, :cond_4

    iget-object v4, p0, LM/G$i;->a:LM/G;

    invoke-static {v4, v3}, LM/H;->c(LM/G;Z)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v2

    goto :goto_3

    :cond_4
    move v4, v3

    :goto_3
    invoke-virtual {v1, v4}, LF/E;->L(Z)V

    :goto_4
    iget-object v1, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v1}, LM/G;->L()LF/E;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_6

    :cond_5
    if-eqz v0, :cond_6

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-static {v0, v2}, LM/H;->c(LM/G;Z)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    move v2, v3

    :goto_5
    invoke-virtual {v1, v2}, LF/E;->J(Z)V

    :goto_6
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, LM/G$i;->f()V

    return-void
.end method

.method public b(J)V
    .locals 0

    return-void
.end method

.method public c(J)V
    .locals 10

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->C()LF/p;

    move-result-object v0

    if-eqz v0, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v0, p0, LM/G$i;->a:LM/G;

    sget-object v1, LF/p;->SelectionEnd:LF/p;

    invoke-static {v0, v1}, LM/G;->i(LM/G;LF/p;)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    const/4 v1, -0x1

    invoke-static {v0, v1}, LM/G;->k(LM/G;I)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->R()V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1, p2}, LF/j0;->g(J)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0, v1}, LM/G;->v(Z)V

    iget-object v2, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v2}, LM/G;->O()LR0/Q;

    move-result-object v3

    sget-object v0, LL0/S;->b:LL0/S$a;

    invoke-virtual {v0}, LL0/S$a;->a()J

    move-result-wide v5

    const/4 v8, 0x5

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, LR0/Q;->d(LR0/Q;LL0/d;JLL0/S;ILjava/lang/Object;)LR0/Q;

    move-result-object v3

    sget-object v0, LM/r;->a:LM/r$a;

    invoke-virtual {v0}, LM/r$a;->o()LM/r;

    move-result-object v8

    const/4 v9, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-wide v4, p1

    invoke-static/range {v2 .. v9}, LM/G;->m(LM/G;LR0/Q;JZZLM/r;Z)J

    move-result-wide v0

    iget-object v2, p0, LM/G$i;->a:LM/G;

    invoke-static {v0, v1}, LL0/S;->n(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, LM/G;->f(LM/G;Ljava/lang/Integer;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->L()LF/E;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v0, p0, LM/G$i;->a:LM/G;

    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-wide v3, p1

    invoke-static/range {v2 .. v7}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result v2

    invoke-virtual {v0}, LM/G;->J()LR0/H;

    move-result-object v3

    invoke-interface {v3, v2}, LR0/H;->a(I)I

    move-result v2

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v3

    invoke-virtual {v3}, LR0/Q;->f()LL0/d;

    move-result-object v3

    invoke-static {v2, v2}, LL0/T;->b(II)J

    move-result-wide v4

    invoke-static {v0, v3, v4, v5}, LM/G;->a(LM/G;LL0/d;J)LR0/Q;

    move-result-object v2

    invoke-virtual {v0, v1}, LM/G;->v(Z)V

    invoke-virtual {v0}, LM/G;->H()Lu0/a;

    move-result-object v1

    if-eqz v1, :cond_3

    sget-object v3, Lu0/b;->a:Lu0/b$a;

    invoke-virtual {v3}, Lu0/b$a;->b()I

    move-result v3

    invoke-interface {v1, v3}, Lu0/a;->a(I)V

    :cond_3
    invoke-virtual {v0}, LM/G;->K()Lmh/l;

    move-result-object v0

    invoke-interface {v0, v2}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_0
    iget-object v0, p0, LM/G$i;->a:LM/G;

    sget-object v1, LF/q;->None:LF/q;

    invoke-static {v0, v1}, LM/G;->j(LM/G;LF/q;)V

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-static {v0, p1, p2}, LM/G;->g(LM/G;J)V

    iget-object p1, p0, LM/G$i;->a:LM/G;

    invoke-static {p1}, LM/G;->c(LM/G;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object p2

    invoke-static {p1, p2}, LM/G;->e(LM/G;Ll0/g;)V

    iget-object p1, p0, LM/G$i;->a:LM/G;

    sget-object p2, Ll0/g;->b:Ll0/g$a;

    invoke-virtual {p2}, Ll0/g$a;->c()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, LM/G;->h(LM/G;J)V

    :cond_5
    :goto_1
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e(J)V
    .locals 9

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->E()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-virtual {v0}, LM/G;->O()LR0/Q;

    move-result-object v0

    invoke-virtual {v0}, LR0/Q;->i()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, LM/G$i;->a:LM/G;

    invoke-static {v0}, LM/G;->d(LM/G;)J

    move-result-wide v1

    invoke-static {v1, v2, p1, p2}, Ll0/g;->r(JJ)J

    move-result-wide p1

    invoke-static {v0, p1, p2}, LM/G;->h(LM/G;J)V

    iget-object p1, p0, LM/G$i;->a:LM/G;

    invoke-virtual {p1}, LM/G;->L()LF/E;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p1}, LF/E;->j()LF/j0;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v6, p0, LM/G$i;->a:LM/G;

    invoke-static {v6}, LM/G;->c(LM/G;)J

    move-result-wide v0

    invoke-static {v6}, LM/G;->d(LM/G;)J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-static {v6, v0}, LM/G;->e(LM/G;Ll0/g;)V

    invoke-static {v6}, LM/G;->b(LM/G;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {v6}, LM/G;->A()Ll0/g;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, LF/j0;->g(J)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {v6}, LM/G;->J()LR0/H;

    move-result-object v7

    invoke-static {v6}, LM/G;->c(LM/G;)J

    move-result-wide v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result v0

    invoke-interface {v7, v0}, LR0/H;->a(I)I

    move-result v7

    invoke-virtual {v6}, LM/G;->J()LR0/H;

    move-result-object v8

    invoke-virtual {v6}, LM/G;->A()Ll0/g;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v1

    move-object v0, p1

    invoke-static/range {v0 .. v5}, LF/j0;->e(LF/j0;JZILjava/lang/Object;)I

    move-result p1

    invoke-interface {v8, p1}, LR0/H;->a(I)I

    move-result p1

    if-ne v7, p1, :cond_1

    sget-object p1, LM/r;->a:LM/r$a;

    invoke-virtual {p1}, LM/r$a;->m()LM/r;

    move-result-object p1

    goto :goto_0

    :cond_1
    sget-object p1, LM/r;->a:LM/r$a;

    invoke-virtual {p1}, LM/r$a;->o()LM/r;

    move-result-object p1

    :goto_0
    invoke-virtual {v6}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v6}, LM/G;->A()Ll0/g;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v0}, Ll0/g;->v()J

    move-result-wide v2

    const/4 v5, 0x0

    const/4 v7, 0x1

    const/4 v4, 0x0

    move-object v0, v6

    move-object v6, p1

    invoke-static/range {v0 .. v7}, LM/G;->m(LM/G;LR0/Q;JZZLM/r;Z)J

    move-result-wide v0

    goto :goto_2

    :cond_2
    invoke-static {v6}, LM/G;->b(LM/G;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_1

    :cond_3
    invoke-static {v6}, LM/G;->c(LM/G;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1, p2}, LF/j0;->d(JZ)I

    move-result v0

    :goto_1
    invoke-virtual {v6}, LM/G;->A()Ll0/g;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ll0/g;->v()J

    move-result-wide v1

    invoke-virtual {p1, v1, v2, p2}, LF/j0;->d(JZ)I

    move-result p1

    invoke-static {v6}, LM/G;->b(LM/G;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_4

    if-ne v0, p1, :cond_4

    return-void

    :cond_4
    invoke-virtual {v6}, LM/G;->O()LR0/Q;

    move-result-object v1

    invoke-virtual {v6}, LM/G;->A()Ll0/g;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll0/g;->v()J

    move-result-wide v2

    sget-object p1, LM/r;->a:LM/r$a;

    invoke-virtual {p1}, LM/r$a;->o()LM/r;

    move-result-object p1

    const/4 v7, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v6, p1

    invoke-static/range {v0 .. v7}, LM/G;->m(LM/G;LR0/Q;JZZLM/r;Z)J

    move-result-wide v0

    :goto_2
    invoke-static {v0, v1}, LL0/S;->b(J)LL0/S;

    :cond_5
    iget-object p1, p0, LM/G$i;->a:LM/G;

    invoke-static {p1, p2}, LM/G;->l(LM/G;Z)V

    :cond_6
    :goto_3
    return-void
.end method

.method public onCancel()V
    .locals 0

    invoke-direct {p0}, LM/G$i;->f()V

    return-void
.end method
