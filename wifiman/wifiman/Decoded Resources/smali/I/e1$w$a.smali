.class final LI/e1$w$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LI/e1;

.field final synthetic d:Ly0/G;


# direct methods
.method constructor <init>(LI/e1;Ly0/G;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/e1$w$a;->c:LI/e1;

    iput-object p2, p0, LI/e1$w$a;->d:Ly0/G;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance v0, LI/e1$w$a;

    iget-object v1, p0, LI/e1$w$a;->c:LI/e1;

    iget-object v2, p0, LI/e1$w$a;->d:Ly0/G;

    invoke-direct {v0, v1, v2, p2}, LI/e1$w$a;-><init>(LI/e1;Ly0/G;Ldh/e;)V

    iput-object p1, v0, LI/e1$w$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/e1$w$a;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LI/e1$w$a;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LI/e1$w$a;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    iget-object v0, p0, LI/e1$w$a;->c:LI/e1;

    invoke-virtual {v0}, LI/e1;->e3()LJ/j;

    move-result-object v7

    iget-object v6, p0, LI/e1$w$a;->c:LI/e1;

    iget-object v8, p0, LI/e1$w$a;->d:Ly0/G;

    new-instance v9, LI/e1$w$a$d;

    invoke-direct {v9, v7, v6}, LI/e1$w$a$d;-><init>(LJ/j;LI/e1;)V

    sget-object v10, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v3, LI/e1$w$a$a;

    const/4 v11, 0x0

    invoke-direct {v3, v7, v8, v11}, LI/e1$w$a$a;-><init>(LJ/j;Ly0/G;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v10

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v12, LI/e1$w$a$b;

    const/4 v0, 0x0

    move-object v1, v12

    move-object v2, v6

    move-object v3, v7

    move-object v4, v8

    move-object v5, v9

    move-object v6, v0

    invoke-direct/range {v1 .. v6}, LI/e1$w$a$b;-><init>(LI/e1;LJ/j;Ly0/G;Lmh/a;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v10

    move-object v3, v12

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v3, LI/e1$w$a$c;

    invoke-direct {v3, v7, v8, v9, v11}, LI/e1$w$a$c;-><init>(LJ/j;Ly0/G;Lmh/a;Ldh/e;)V

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LI/e1$w$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/e1$w$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/e1$w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
