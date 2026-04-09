.class final LF/m$i;
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

.field final synthetic c:Z

.field final synthetic d:LR0/T;

.field final synthetic e:LR0/Q;

.field final synthetic f:LR0/s;

.field final synthetic g:LR0/H;

.field final synthetic h:LM/G;

.field final synthetic i:LIi/N;

.field final synthetic j:LD/b;


# direct methods
.method constructor <init>(LF/E;ZZLR0/T;LR0/Q;LR0/s;LR0/H;LM/G;LIi/N;LD/b;)V
    .locals 0

    iput-object p1, p0, LF/m$i;->a:LF/E;

    iput-boolean p2, p0, LF/m$i;->b:Z

    iput-boolean p3, p0, LF/m$i;->c:Z

    iput-object p4, p0, LF/m$i;->d:LR0/T;

    iput-object p5, p0, LF/m$i;->e:LR0/Q;

    iput-object p6, p0, LF/m$i;->f:LR0/s;

    iput-object p7, p0, LF/m$i;->g:LR0/H;

    iput-object p8, p0, LF/m$i;->h:LM/G;

    iput-object p9, p0, LF/m$i;->i:LIi/N;

    iput-object p10, p0, LF/m$i;->j:LD/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lk0/l;)V
    .locals 12

    iget-object v0, p0, LF/m$i;->a:LF/E;

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, LF/m$i;->a:LF/E;

    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v1

    invoke-virtual {v0, v1}, LF/E;->C(Z)V

    iget-object v0, p0, LF/m$i;->a:LF/E;

    invoke-virtual {v0}, LF/E;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LF/m$i;->b:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, LF/m$i;->c:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LF/m$i;->d:LR0/T;

    iget-object v1, p0, LF/m$i;->a:LF/E;

    iget-object v2, p0, LF/m$i;->e:LR0/Q;

    iget-object v3, p0, LF/m$i;->f:LR0/s;

    iget-object v4, p0, LF/m$i;->g:LR0/H;

    invoke-static {v0, v1, v2, v3, v4}, LF/m;->k(LR0/T;LF/E;LR0/Q;LR0/s;LR0/H;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, LF/m$i;->a:LF/E;

    invoke-static {v0}, LF/m;->i(LF/E;)V

    :goto_0
    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LF/m$i;->a:LF/E;

    invoke-virtual {v0}, LF/E;->j()LF/j0;

    move-result-object v5

    if-eqz v5, :cond_2

    iget-object v0, p0, LF/m$i;->i:LIi/N;

    iget-object v2, p0, LF/m$i;->j:LD/b;

    iget-object v3, p0, LF/m$i;->e:LR0/Q;

    iget-object v4, p0, LF/m$i;->a:LF/E;

    iget-object v6, p0, LF/m$i;->g:LR0/H;

    new-instance v9, LF/m$i$a;

    const/4 v7, 0x0

    move-object v1, v9

    invoke-direct/range {v1 .. v7}, LF/m$i$a;-><init>(LD/b;LR0/Q;LF/E;LF/j0;LR0/H;Ldh/e;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v11}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    :cond_2
    invoke-interface {p1}, Lk0/l;->isFocused()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, LF/m$i;->h:LM/G;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, v0, v1}, LM/G;->u(LM/G;Ll0/g;ILjava/lang/Object;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lk0/l;

    invoke-virtual {p0, p1}, LF/m$i;->a(Lk0/l;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method
