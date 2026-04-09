.class final LJ/j$A$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ/j$A;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ly0/G;

.field final synthetic c:LJ/j;

.field final synthetic d:Z


# direct methods
.method constructor <init>(Ly0/G;LJ/j;ZLdh/e;)V
    .locals 0

    iput-object p1, p0, LJ/j$A$b;->b:Ly0/G;

    iput-object p2, p0, LJ/j$A$b;->c:LJ/j;

    iput-boolean p3, p0, LJ/j$A$b;->d:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 3

    new-instance p1, LJ/j$A$b;

    iget-object v0, p0, LJ/j$A$b;->b:Ly0/G;

    iget-object v1, p0, LJ/j$A$b;->c:LJ/j;

    iget-boolean v2, p0, LJ/j$A$b;->d:Z

    invoke-direct {p1, v0, v1, v2, p2}, LJ/j$A$b;-><init>(Ly0/G;LJ/j;ZLdh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LJ/j$A$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LJ/j$A$b;->a:I

    const/4 v2, 0x1

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

    iget-object p1, p0, LJ/j$A$b;->b:Ly0/G;

    new-instance v1, LJ/j$A$b$a;

    iget-object v3, p0, LJ/j$A$b;->c:LJ/j;

    iget-boolean v4, p0, LJ/j$A$b;->d:Z

    invoke-direct {v1, v3, v4}, LJ/j$A$b$a;-><init>(LJ/j;Z)V

    new-instance v3, LJ/j$A$b$b;

    iget-object v4, p0, LJ/j$A$b;->c:LJ/j;

    invoke-direct {v3, v4}, LJ/j$A$b$b;-><init>(LJ/j;)V

    iput v2, p0, LJ/j$A$b;->a:I

    invoke-static {p1, v1, v3, p0}, LJ/b;->a(Ly0/G;LJ/c;Lmh/a;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(LIi/N;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LJ/j$A$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LJ/j$A$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LJ/j$A$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
