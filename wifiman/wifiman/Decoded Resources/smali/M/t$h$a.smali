.class final LM/t$h$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lmh/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM/t$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field b:I

.field private synthetic c:Ljava/lang/Object;

.field final synthetic d:LM/i;

.field final synthetic e:LM/d;

.field final synthetic f:LF/U;


# direct methods
.method constructor <init>(LM/i;LM/d;LF/U;Ldh/e;)V
    .locals 0

    iput-object p1, p0, LM/t$h$a;->d:LM/i;

    iput-object p2, p0, LM/t$h$a;->e:LM/d;

    iput-object p3, p0, LM/t$h$a;->f:LF/U;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILdh/e;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ldh/e;)Ldh/e;
    .locals 4

    new-instance v0, LM/t$h$a;

    iget-object v1, p0, LM/t$h$a;->d:LM/i;

    iget-object v2, p0, LM/t$h$a;->e:LM/d;

    iget-object v3, p0, LM/t$h$a;->f:LF/U;

    invoke-direct {v0, v1, v2, v3, p2}, LM/t$h$a;-><init>(LM/i;LM/d;LF/U;Ldh/e;)V

    iput-object p1, v0, LM/t$h$a;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ly0/b;

    check-cast p2, Ldh/e;

    invoke-virtual {p0, p1, p2}, LM/t$h$a;->n(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Leh/b;->g()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LM/t$h$a;->b:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_4

    :cond_2
    iget-object v1, p0, LM/t$h$a;->c:Ljava/lang/Object;

    check-cast v1, Ly0/b;

    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, LYg/v;->b(Ljava/lang/Object;)V

    iget-object p1, p0, LM/t$h$a;->c:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Ly0/b;

    iput-object v1, p0, LM/t$h$a;->c:Ljava/lang/Object;

    iput v4, p0, LM/t$h$a;->b:I

    invoke-static {v1, p0}, LM/t;->a(Ly0/b;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    check-cast p1, Ly0/n;

    invoke-static {p1}, LM/t;->j(Ly0/n;)Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Ly0/n;->b()I

    move-result v4

    invoke-static {v4}, Ly0/r;->b(I)Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-virtual {p1}, Ly0/n;->c()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v6, :cond_6

    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly0/y;

    invoke-virtual {v8}, Ly0/y;->p()Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_3

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_6
    iget-object v2, p0, LM/t$h$a;->d:LM/i;

    iget-object v4, p0, LM/t$h$a;->e:LM/d;

    iput-object v5, p0, LM/t$h$a;->c:Ljava/lang/Object;

    iput v3, p0, LM/t$h$a;->b:I

    invoke-static {v1, v2, v4, p1, p0}, LM/t;->c(Ly0/b;LM/i;LM/d;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_7
    :goto_3
    invoke-static {p1}, LM/t;->j(Ly0/n;)Z

    move-result v3

    if-nez v3, :cond_8

    iget-object v3, p0, LM/t$h$a;->f:LF/U;

    iput-object v5, p0, LM/t$h$a;->c:Ljava/lang/Object;

    iput v2, p0, LM/t$h$a;->b:I

    invoke-static {v1, v3, p1, p0}, LM/t;->e(Ly0/b;LF/U;Ly0/n;Ldh/e;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_4
    sget-object p1, LYg/J;->a:LYg/J;

    return-object p1
.end method

.method public final n(Ly0/b;Ldh/e;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LM/t$h$a;->create(Ljava/lang/Object;Ldh/e;)Ldh/e;

    move-result-object p1

    check-cast p1, LM/t$h$a;

    sget-object p2, LYg/J;->a:LYg/J;

    invoke-virtual {p1, p2}, LM/t$h$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
