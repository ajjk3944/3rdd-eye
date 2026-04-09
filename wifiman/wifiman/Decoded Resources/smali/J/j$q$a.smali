.class final LJ/j$q$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:Lw/r;

.field final synthetic d:LJ/j;

.field final synthetic e:J

.field final synthetic f:Ly/m;


# direct methods
.method constructor <init>(Lw/r;LJ/j;JLy/m;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$q$a;->c:Lw/r;

    iput-object p2, p0, LJ/j$q$a;->d:LJ/j;

    iput-wide p3, p0, LJ/j$q$a;->e:J

    iput-object p5, p0, LJ/j$q$a;->f:Ly/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, LJ/j$q$a;

    iget-object v1, p0, LJ/j$q$a;->c:Lw/r;

    iget-object v2, p0, LJ/j$q$a;->d:LJ/j;

    iget-wide v3, p0, LJ/j$q$a;->e:J

    iget-object v5, p0, LJ/j$q$a;->f:Ly/m;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LJ/j$q$a;-><init>(Lw/r;LJ/j;JLy/m;Ldh/e;)V

    iput-object p1, v7, LJ/j$q$a;->b:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/j$q$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/j$q$a;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ/j$q$a;->b:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, LIi/N;

    new-instance p1, LJ/j$q$a$a;

    iget-object v6, p0, LJ/j$q$a;->d:LJ/j;

    iget-wide v7, p0, LJ/j$q$a;->e:J

    iget-object v9, p0, LJ/j$q$a;->f:Ly/m;

    const/4 v10, 0x0

    move-object v5, p1

    invoke-direct/range {v5 .. v10}, LJ/j$q$a$a;-><init>(LJ/j;JLy/m;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object p1, p0, LJ/j$q$a;->c:Lw/r;

    iput v3, p0, LJ/j$q$a;->a:I

    invoke-interface {p1, p0}, Lw/r;->q0(Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, LJ/j$q$a;->d:LJ/j;

    invoke-static {v1}, LJ/j;->i(LJ/j;)Ly/o$b;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v3, p0, LJ/j$q$a;->f:Ly/m;

    if-eqz p1, :cond_4

    new-instance p1, Ly/o$c;

    invoke-direct {p1, v1}, Ly/o$c;-><init>(Ly/o$b;)V

    goto :goto_1

    :cond_4
    new-instance p1, Ly/o$a;

    invoke-direct {p1, v1}, Ly/o$a;-><init>(Ly/o$b;)V

    :goto_1
    iput v2, p0, LJ/j$q$a;->a:I

    invoke-interface {v3, p1, p0}, Ly/m;->a(Ly/j;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, LJ/j$q$a;->d:LJ/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LJ/j;->t(LJ/j;Ly/o$b;)V

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/j$q$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/j$q$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/j$q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
