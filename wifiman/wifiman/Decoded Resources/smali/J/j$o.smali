.class final LJ/j$o;
.super Lkotlin/jvm/internal/u;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->L(Ly0/G;ZLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/M;

.field final synthetic b:LJ/j;

.field final synthetic c:LF/p;

.field final synthetic d:Lkotlin/jvm/internal/M;

.field final synthetic e:Z


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/M;LJ/j;LF/p;Lkotlin/jvm/internal/M;Z)V
    .locals 0

    iput-object p1, p0, LJ/j$o;->a:Lkotlin/jvm/internal/M;

    iput-object p2, p0, LJ/j$o;->b:LJ/j;

    iput-object p3, p0, LJ/j$o;->c:LF/p;

    iput-object p4, p0, LJ/j$o;->d:Lkotlin/jvm/internal/M;

    iput-boolean p5, p0, LJ/j$o;->e:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ly0/y;J)V
    .locals 10

    iget-object p1, p0, LJ/j$o;->a:Lkotlin/jvm/internal/M;

    iget-wide v0, p1, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v0, v1, p2, p3}, Ll0/g;->r(JJ)J

    move-result-wide p2

    iput-wide p2, p1, Lkotlin/jvm/internal/M;->a:J

    iget-object p1, p0, LJ/j$o;->b:LJ/j;

    invoke-static {p1}, LJ/j;->m(LJ/j;)LI/l1;

    move-result-object p1

    invoke-virtual {p1}, LI/l1;->f()LL0/M;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p2, p0, LJ/j$o;->b:LJ/j;

    iget-object p3, p0, LJ/j$o;->c:LF/p;

    iget-object v0, p0, LJ/j$o;->d:Lkotlin/jvm/internal/M;

    iget-wide v0, v0, Lkotlin/jvm/internal/M;->a:J

    iget-object v2, p0, LJ/j$o;->a:Lkotlin/jvm/internal/M;

    iget-wide v2, v2, Lkotlin/jvm/internal/M;->a:J

    invoke-static {v0, v1, v2, v3}, Ll0/g;->r(JJ)J

    move-result-wide v0

    invoke-virtual {p2, p3, v0, v1}, LJ/j;->F0(LF/p;J)V

    iget-boolean p2, p0, LJ/j$o;->e:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, LJ/j$o;->b:LJ/j;

    invoke-virtual {p2}, LJ/j;->X()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, LL0/M;->x(J)I

    move-result p2

    :goto_0
    move v2, p2

    goto :goto_1

    :cond_1
    iget-object p2, p0, LJ/j$o;->b:LJ/j;

    invoke-static {p2}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p2

    invoke-virtual {p2}, LI/o1;->l()LH/h;

    move-result-object p2

    invoke-virtual {p2}, LH/h;->f()J

    move-result-wide p2

    invoke-static {p2, p3}, LL0/S;->n(J)I

    move-result p2

    goto :goto_0

    :goto_1
    iget-boolean p2, p0, LJ/j$o;->e:Z

    if-eqz p2, :cond_2

    iget-object p1, p0, LJ/j$o;->b:LJ/j;

    invoke-static {p1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p1

    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object p1

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p1

    invoke-static {p1, p2}, LL0/S;->i(J)I

    move-result p1

    :goto_2
    move v3, p1

    goto :goto_3

    :cond_2
    iget-object p2, p0, LJ/j$o;->b:LJ/j;

    invoke-virtual {p2}, LJ/j;->X()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, LL0/M;->x(J)I

    move-result p1

    goto :goto_2

    :goto_3
    iget-object p1, p0, LJ/j$o;->b:LJ/j;

    invoke-static {p1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p1

    invoke-virtual {p1}, LI/o1;->l()LH/h;

    move-result-object p1

    invoke-virtual {p1}, LH/h;->f()J

    move-result-wide p1

    iget-object v0, p0, LJ/j$o;->b:LJ/j;

    invoke-static {v0}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p3

    invoke-virtual {p3}, LI/o1;->l()LH/h;

    move-result-object v1

    iget-boolean v4, p0, LJ/j$o;->e:Z

    sget-object p3, LM/r;->a:LM/r$a;

    invoke-virtual {p3}, LM/r$a;->l()LM/r;

    move-result-object v5

    const/16 v8, 0x60

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, LJ/j;->H0(LJ/j;LH/h;IIZLM/r;ZZILjava/lang/Object;)J

    move-result-wide v0

    invoke-static {p1, p2}, LL0/S;->h(J)Z

    move-result p1

    if-nez p1, :cond_3

    invoke-static {v0, v1}, LL0/S;->h(J)Z

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    iget-object p1, p0, LJ/j$o;->b:LJ/j;

    invoke-static {p1}, LJ/j;->k(LJ/j;)LI/o1;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, LI/o1;->y(J)V

    :cond_4
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ly0/y;

    check-cast p2, Ll0/g;

    invoke-virtual {p2}, Ll0/g;->v()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1}, LJ/j$o;->a(Ly0/y;J)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
