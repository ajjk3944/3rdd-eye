.class final LI/e1$w$a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI/e1$w$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field a:I

.field final synthetic b:LI/e1;

.field final synthetic c:LJ/j;

.field final synthetic d:Ly0/G;

.field final synthetic e:Lmh/a;


# direct methods
.method constructor <init>(LI/e1;LJ/j;Ly0/G;Lmh/a;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LI/e1$w$a$b;->b:LI/e1;

    iput-object p2, p0, LI/e1$w$a$b;->c:LJ/j;

    iput-object p3, p0, LI/e1$w$a$b;->d:Ly0/G;

    iput-object p4, p0, LI/e1$w$a$b;->e:Lmh/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 6

    new-instance p1, LI/e1$w$a$b;

    iget-object v1, p0, LI/e1$w$a$b;->b:LI/e1;

    iget-object v2, p0, LI/e1$w$a$b;->c:LJ/j;

    iget-object v3, p0, LI/e1$w$a$b;->d:Ly0/G;

    iget-object v4, p0, LI/e1$w$a$b;->e:Lmh/a;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, LI/e1$w$a$b;-><init>(LI/e1;LJ/j;Ly0/G;Lmh/a;Ldh/e;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LIi/N;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LI/e1$w$a$b;->n(LIi/N;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LI/e1$w$a$b;->a:I

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

    iget-object p1, p0, LI/e1$w$a$b;->b:LI/e1;

    invoke-virtual {p1}, LI/e1;->Z2()Ly/m;

    move-result-object v5

    iget-object v3, p0, LI/e1$w$a$b;->c:LJ/j;

    iget-object v4, p0, LI/e1$w$a$b;->d:Ly0/G;

    iget-object v6, p0, LI/e1$w$a$b;->e:Lmh/a;

    new-instance v7, LI/e1$w$a$b$a;

    iget-object p1, p0, LI/e1$w$a$b;->b:LI/e1;

    invoke-direct {v7, p1}, LI/e1$w$a$b$a;-><init>(LI/e1;)V

    iput v2, p0, LI/e1$w$a$b;->a:I

    move-object v8, p0

    invoke-virtual/range {v3 .. v8}, LJ/j;->N(Ly0/G;Ly/m;Lmh/a;Lmh/a;Ldh/e;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, LI/e1$w$a$b;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LI/e1$w$a$b;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LI/e1$w$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
