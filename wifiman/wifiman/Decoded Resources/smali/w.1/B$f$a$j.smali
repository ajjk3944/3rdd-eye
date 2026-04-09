.class final Lw/B$f$a$j;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/B$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LIi/N;

.field final synthetic e:Lmh/l;

.field final synthetic f:Lmh/l;

.field final synthetic g:Lkotlin/jvm/internal/N;

.field final synthetic h:Lw/s;


# direct methods
.method constructor <init>(LIi/N;Lmh/l;Lmh/l;Lkotlin/jvm/internal/N;Lw/s;Ldh/e;)V
    .locals 0

    iput-object p1, p0, Lw/B$f$a$j;->d:LIi/N;

    iput-object p2, p0, Lw/B$f$a$j;->e:Lmh/l;

    iput-object p3, p0, Lw/B$f$a$j;->f:Lmh/l;

    iput-object p4, p0, Lw/B$f$a$j;->g:Lkotlin/jvm/internal/N;

    iput-object p5, p0, Lw/B$f$a$j;->h:Lw/s;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 8

    new-instance v7, Lw/B$f$a$j;

    iget-object v1, p0, Lw/B$f$a$j;->d:LIi/N;

    iget-object v2, p0, Lw/B$f$a$j;->e:Lmh/l;

    iget-object v3, p0, Lw/B$f$a$j;->f:Lmh/l;

    iget-object v4, p0, Lw/B$f$a$j;->g:Lkotlin/jvm/internal/N;

    iget-object v5, p0, Lw/B$f$a$j;->h:Lw/s;

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lw/B$f$a$j;-><init>(LIi/N;Lmh/l;Lmh/l;Lkotlin/jvm/internal/N;Lw/s;Ldh/e;)V

    iput-object p1, v7, Lw/B$f$a$j;->c:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, Lw/B$f$a$j;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lw/B$f$a$j;->b:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lw/B$f$a$j;->c:Ljava/lang/Object;

    check-cast p1, Ly0/b;

    iput v2, p0, Lw/B$f$a$j;->b:I

    invoke-static {p1, v3, p0, v2, v3}, Lw/B;->m(Ly0/b;Ly0/p;Ldh/e;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ly0/y;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ly0/y;->a()V

    iget-object v4, p0, Lw/B$f$a$j;->d:LIi/N;

    new-instance v7, Lw/B$f$a$j$a;

    iget-object v0, p0, Lw/B$f$a$j;->h:Lw/s;

    invoke-direct {v7, v0, v3}, Lw/B$f$a$j$a;-><init>(Lw/s;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object v0, p0, Lw/B$f$a$j;->e:Lmh/l;

    invoke-virtual {p1}, Ly0/y;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ll0/g;->d(J)Ll0/g;

    move-result-object p1

    invoke-interface {v0, p1}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, LYg/J;->a:LYg/J;

    goto :goto_1

    :cond_3
    iget-object v4, p0, Lw/B$f$a$j;->d:LIi/N;

    new-instance v7, Lw/B$f$a$j$b;

    iget-object p1, p0, Lw/B$f$a$j;->h:Lw/s;

    invoke-direct {v7, p1, v3}, Lw/B$f$a$j$b;-><init>(Lw/s;Ldh/e;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    iget-object p1, p0, Lw/B$f$a$j;->f:Lmh/l;

    if-eqz p1, :cond_4

    iget-object v0, p0, Lw/B$f$a$j;->g:Lkotlin/jvm/internal/N;

    iget-object v0, v0, Lkotlin/jvm/internal/N;->a:Ljava/lang/Object;

    check-cast v0, Ly0/y;

    invoke-virtual {v0}, Ly0/y;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ll0/g;->d(J)Ll0/g;

    move-result-object v0

    invoke-interface {p1, v0}, Lmh/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, LYg/J;->a:LYg/J;

    :cond_4
    :goto_1
    return-object v3
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lw/B$f$a$j;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, Lw/B$f$a$j;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, Lw/B$f$a$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
