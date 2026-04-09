.class final LJ/j$A;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j;->s0(Ly0/G;ZLdh/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field final synthetic c:LJ/j;

.field final synthetic d:Ly0/G;

.field final synthetic e:Z


# direct methods
.method constructor <init>(LJ/j;Ly0/G;ZLdh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$A;->c:LJ/j;

    iput-object p2, p0, LJ/j$A;->d:Ly0/G;

    iput-boolean p3, p0, LJ/j$A;->e:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LJ/j$A;

    iget-object v1, p0, LJ/j$A;->c:LJ/j;

    iget-object v2, p0, LJ/j$A;->d:Ly0/G;

    iget-boolean v3, p0, LJ/j$A;->e:Z

    invoke-direct {v0, v1, v2, v3, p2}, LJ/j$A;-><init>(LJ/j;Ly0/G;ZLdh/e;)V

    iput-object p1, v0, LJ/j$A;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/j$A;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    iget v0, p0, LJ/j$A;->a:I

    if-nez v0, :cond_0

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LJ/j$A;->b:Ljava/lang/Object;

    check-cast p1, LIi/N;

    sget-object v6, LIi/P;->UNDISPATCHED:LIi/P;

    new-instance v3, LJ/j$A$a;

    iget-object v0, p0, LJ/j$A;->c:LJ/j;

    iget-object v1, p0, LJ/j$A;->d:Ly0/G;

    const/4 v7, 0x0

    invoke-direct {v3, v0, v1, v7}, LJ/j$A$a;-><init>(LJ/j;Ly0/G;Ldh/e;)V

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v3, LJ/j$A$b;

    iget-object v0, p0, LJ/j$A;->d:Ly0/G;

    iget-object v1, p0, LJ/j$A;->c:LJ/j;

    iget-boolean v2, p0, LJ/j$A;->e:Z

    invoke-direct {v3, v0, v1, v2, v7}, LJ/j$A$b;-><init>(Ly0/G;LJ/j;ZLdh/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    new-instance v3, LJ/j$A$c;

    iget-object v0, p0, LJ/j$A;->c:LJ/j;

    iget-object v1, p0, LJ/j$A;->d:Ly0/G;

    iget-boolean v2, p0, LJ/j$A;->e:Z

    invoke-direct {v3, v0, v1, v2, v7}, LJ/j$A$c;-><init>(LJ/j;Ly0/G;ZLdh/e;)V

    const/4 v1, 0x0

    move-object v0, p1

    move-object v2, v6

    invoke-static/range {v0 .. v5}, LIi/i;->d(LIi/N;Ldh/i;LIi/P;Lmh/p;ILjava/lang/Object;)LIi/y0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/j$A;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/j$A;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/j$A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
